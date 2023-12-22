package com.via.testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.via.pages.HotelPage;

public class HotelPageTest {
	
	
	HotelPage hp = new HotelPage();
	
	@BeforeMethod
	public void setUpHotelTest() throws IOException
	{
		hp.setUp("Hotel");
	}
	@AfterMethod
	public void tearDown ()
	{
		hp.cleanAndClose();
	}
	@Test
	public void navigateToHotelsTest()
	{
		hp.setNavigateToHotels();
		boolean hotelpagepresent = hp.getHotelPagePresent();
		Assert.assertTrue(hotelpagepresent);
	}
	@Test
	public void searchScrollBarTest()
	{
		hp.setSearchScrollBar();
		Assert.assertTrue(hp.checkDisplayEl(hp.getSearchScrollBar()));
	}
	
	@Test
	public void setDestinationTest ()
	{
		hp.setDestination();
		hp.waitForSomeSeconds(7);
		Assert.assertTrue(hp.checkDisplayEl(hp.getSearchScrollBar()));
	}
	@Test
	public void searchSrollBarTest()
	{
		hp.setDestination();
		hp.waitForEl(hp.getSearchScrollBar());		
		hp.dropAndEnter();	
		hp.setSearchScrollBar();
		WebElement scrollBarTest = hp.getDestinationInput();
		Assert.assertEquals(scrollBarTest.getAttribute("value"), "Mumbai,Maharashtra,IndiaMumbai", "search scroll bar is not present or visible");
	}
	@Test
	public void setSelectHotelTest()
	{
		hp.setSelectHotel();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//html/body/div[9]/div[6]/div[1]")));
	}
//	@Test
//	public void setSelectHotelDetailsTest()
//	{
//		hp.setSelectHotelDetails();
//		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//h4[text()='Description']")));
//	}
	@Test
	public void setSelectHotelPhotosTest()
	{
		hp.setSelectHotelPhotos();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[@class='photoSection']")));
	}
	@Test
	public void setSelectHotelLocationTest()
	{
		hp.setSelectHotelLocation();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[@id='bigMap']")));
	}

	@Test
	public void setSelectHotelReviewsTest()
	{
		hp.setSelectHotelReviews();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//p[text()='What People are saying']")));
	}
	@Test
	public void setSelectRoomsRating()
	{
		hp.setSelectHotelRoomsRating();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[@class='allRoomSection js-allRoom']")));
	}
	
	//################### DATE ######################################
	
	@Test
	public void setCheckInDateButtonTest()
	{
		
		hp.setCheckInDateButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//span[text()='Select Check Out Date']")));
	}
	
	@Test
	public void setCheckOutDateButtonTest()
	{
		hp.setCheckOutDateButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//span[text()='Select Check Out Date']")));

	}
	
	@Test
	public void setCloseCalenderButtonCheckInTest()
	{
		hp.setCheckInDateButton();
		hp.setcloseCalenderButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));
	}
	
	@Test
	public void setCloseCalenderButtonCheckOutTest()
	{
		hp.setCheckOutDateButton();
		hp.setcloseCalenderButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		
	}
	
	////////#################### DATE  END ############################//////////////////////////////////
	
	@Test
	public void setSearchButtonTest()
	{
		hp.setSearchHotels();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Select Destination']")));

	}
	
	@Test
	public void setRoomsMenu()
	{
		hp.setRoomsMenu();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Enter guest details per room']")));
	}
	
	@Test 
	public void getDoneButtonMenu()
	{
		hp.setRoomsMenu();
		hp.setDoneButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		
	}
	
	@Test
	public void getCancelButtonTest()
	{
		hp.setCancelButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		
	}
	
	@Test 
	public void getAdultsMinusInputTest()
	{
		hp.setRoomsMenu();
		hp.setAdultsMinusInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Enter guest details per room']")));
	}
	@Test 
	public void getAdultsPlusInputTest()
	{
		hp.setRoomsMenu();
		hp.setAdultsPlusInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Enter guest details per room']")));
	}
	
	@Test 
	public void getChildrensMinusInputTest()
	{
		hp.setRoomsMenu();
		hp.setChildrensMinusInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Enter guest details per room']")));
	}
	@Test 
	public void getChildrensPlusInputTest()
	{
		hp.setRoomsMenu();
		hp.setChildrensPlusInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[text()='Enter guest details per room']")));
	}

	@Test
	public void getChildrensAgeInputTest()
	{
		hp.setChildrensAgeInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		

	}
	@Test
	public void getAdditionalRoomsTest()
	{
		hp.setAdditionalRooms();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		
	}
	
	@Test 
	public void RemoveAdditionalRoomButtonTest()
	{
		hp.setRemoveAdditionalRoomButton();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		
	}
	@Test
	public void getNationaltyInputTest()
	{
		hp.setNationalityInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));			
	}
	
	@Test 
	public void getResidencyInputTest()
	{
		hp.setResidencyInput();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		

	}
	@Test
	public void getIsolationCheckBoxInput()
	{
		hp.setIsolationCheckBox();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//label[text()='DESTINATION']")));		

	}
	@Test
	public void searchHotelTest() {
		
		hp.searchHotel();
		hp.waitForSomeSeconds(8);
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("/html/body/div[9]/div[3]")));
		
	}
	@Test
	public void fullSearchTest()
	{
		hp.fullSearch();
		hp.getSelectHotel().click();
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("//div[@class='hotelResContainer']")));
	}
	
	
}	