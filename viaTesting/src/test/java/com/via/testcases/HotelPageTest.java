package com.via.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.via.base.ViaBase;
import com.via.pages.HotelPage;

public class HotelPageTest {
	
	
	HotelPage hp = new HotelPage();
	
	@BeforeMethod
	public void setUpHotelTest()
	{
		hp.setUp();
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
	}
	
	@Test
	public void setDestinationTest ()
	{
		//initialized using a setter
		hp.setDestination();
		hp.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//hp.setSearchScrollBar();
		//WebElement destinationInput = hp.getDestinationInput();
		//Assert.assertEquals(destinationInput.getAttribute("value"), "New York", "Destination input is not set correct");
	}
	@Test
	public void searchSrollBarTest()
	{
		hp.setDestination();
		hp.waitFor(hp.getSearchScrollBar());		
		hp.dropAndEnter();
		hp.setSearchHotels();
		hp.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		hp.setSelectHotel();
		//hp.setSearchScrollBar();
		//WebElement scrollBarTest = hp.getDestinationInput();
		//Assert.assertEquals(scrollBarTest.getAttribute("value"), "a", "search scroll bar is not present or visible");
	}
	@Test
	public void setSelectHotelTest()
	{
		hp.setSelectHotel();
	}
	@Test
	public void setSelectHotelDetailsTest()
	{
		hp.setSelectHotelDetails();
	}
	@Test
	public void setSelectHotelPhotosTest()
	{
		hp.setSelectHotelPhotos();
	}
	@Test
	public void setSelectHotelLocationTest()
	{
		hp.setSelectHotelLocation();
	}

	@Test
	public void setSelectHotelReviewsTest()
	{
		hp.setSelectHotelReviews();
	}
	@Test
	public void setSelectRoomsRating()
	{
		hp.setSelectHotelRoomsRating();
	}
	
	//################### DATE ######################################
	
	@Test
	public void setCheckInDateButtonTest()
	{
		
		hp.setCheckInDateButton();
	}
	
	@Test
	public void setCheckOutDateButtonTest()
	{
		hp.setCheckOutDateButton();

	}
	
	@Test
	public void setCloseCalenderButtonCheckInTest()
	{
		hp.setCheckInDateButton();
		hp.setcloseCalenderButton();
	}
	
	@Test
	public void setCloseCalenderButtonCheckOutTest()
	{
		hp.setCheckOutDateButton();
		hp.setcloseCalenderButton();
	}
	
	//@Test
	public void setCalenderDateCheckIn() throws InterruptedException
	{
		hp.setCheckInDateButton();
		Thread.sleep(3000);
		hp.setCalenderDateCheckingIn();
		hp.setcloseCalenderButton();
		//WebElement checkInDateInput = hp.getCheckInDate();
		//Assert.assertEquals(checkInDateInput.getAttribute("value"), "Wed, Dec 20 2023", "Check-in date input is not set correct");
	}
	//@Test
	public void setCalenderDateCheckOut()
	{
		hp.setCheckOutDateButton();
		hp.setCalenderDateCheckingOut();
		hp.setcloseCalenderButton();
		//WebElement checkOutDateInput = hp.getCheckOutDate();
		//Assert.assertEquals(checkOutDateInput.getAttribute("value"), "Sat, Dec 23 2023", "Check-in date input is not set correc");
	}
	
	////////#################### DATE  END ############################//////////////////////////////////
	
	@Test
	public void setSearchButtonTest()
	{
		hp.setSearchHotels();
	}
	
	@Test
	public void setRoomsMenu()
	{
		hp.setRoomsMenu();
	}
	
	@Test 
	public void getDoneButtonMenu()
	{
		hp.setRoomsMenu();
		hp.setDoneButton();
	}
	
	@Test
	public void getCancelButtonTest()
	{
		hp.setCancelButton();
	}
	
	@Test 
	public void getAdultsMinusInputTest()
	{
		hp.setRoomsMenu();
		hp.setAdultsMinusInput();
	}
	@Test 
	public void getAdultsPlusInputTest()
	{
		hp.setRoomsMenu();
		hp.setAdultsPlusInput();
	}
	
	@Test 
	public void getChildrensMinusInputTest()
	{
		hp.setRoomsMenu();
		hp.setChildrensMinusInput();
	}
	@Test 
	public void getChildrensPlusInputTest()
	{
		hp.setRoomsMenu();
		hp.setChildrensPlusInput();
	}

	@Test
	public void getChildrensAgeInputTest()
	{
		hp.setChildrensAgeInput();

	}
	@Test
	public void getTwoChildrenInput()
	{
		hp.setTwoChildreInput();
	}
	
	@Test
	public void getThreeChildrenInput()
	{
		hp.setThreeChildreInput();
	}
	
	@Test
	public void getAdditionalRoomsTest()
	{
		hp.setAdditionalRooms();
	}
	
	@Test 
	public void RemoveAdditionalRoomButtonTest()
	{
		hp.setRemoveAdditionalRoomButton();
	}
	@Test
	public void getNationaltyInputTest()
	{
		hp.setNationalityInput();
	
	}
	
	@Test 
	public void getResidencyInputTest()
	{
		hp.setResidencyInput();
	}
	@Test
	public void getIsolationCheckBoxInput()
	{
		hp.setIsolationCheckBox();
	}
	@Test
	public void searchHotelTest() {
		
		hp.searchHotel();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(hp.checkDisplayEl(hp.getEl("/html/body/div[9]/div[3]")));
		
	}
	@Test
	public void fullSearchTest()
	{
		hp.fullSearch();
		hp.getSelectHotel().click();
	}
	
	
}
	
	
	
/*
 * 	@Test
	public void selectHotel() 
	{
		WebElement selectButton = driver.findElement(By.xpath("//button[contains(text(),'Select')]"));
		selectButton.click();
	}
	@Test
	public void completeBooking() 
	{
		WebElement numberofRoomsInput = driver.findElement(By.id("numberOfRooms"));
		WebElement RoomTypeInput = driver.findElement(By.id("roomType"));
		WebElement SpecialRequestInput = driver.findElement(By.id("specialRequests"));
		WebElement bookNowInput = driver.findElement(By.id("bookNowtn"));
		
		numberofRoomsInput.sendKeys("2");
		RoomTypeInput.sendKeys("Deluxe");
		SpecialRequestInput.sendKeys("High floor, king bed");
		bookNowInput

	}
 * 
 */
	
	
	//@AfterMethod
	//public void tearDown ()
	//{
		//driver.quit();
	//}
	
	
	
	
//}
