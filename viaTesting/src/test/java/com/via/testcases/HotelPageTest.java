package com.via.testcases;

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
		hp.setDestination("New York");
		hp.setSearchScrollBar();
		WebElement destinationInput = hp.getDestinationInput();
		Assert.assertEquals(destinationInput.getAttribute("value"), "New York", "Destination input is not set correct");
		
	}
	@Test
	public void searchSrollBarTest()
	{
		hp.setDestination("a");
		hp.setSearchScrollBar();
		WebElement scrollBarTest = hp.getDestinationInput();
		Assert.assertEquals(scrollBarTest.getAttribute("value"), "a", "search scroll bar is not present or visible");
	}
	
	//@Test
	public void clickCalendarTest()
	{
		
		hp.setCheckInDate();
		WebElement checkInDateInput = hp.getCheckInDate();
		Assert.assertEquals(checkInDateInput.getAttribute("value"), "Wed, Dec 20 2023", "Check-in date input is not set correct");
		
	}
	
	//@Test
	public void setCheckOutDateTest()
	{
		hp.setCheckOutDate();
		WebElement checkOutDateInput = hp.getCheckOutDate();
		Assert.assertEquals(checkOutDateInput.getAttribute("value"), "Sat, Dec 23 2023", "Check-in date input is not set correc");
	}
	
	//@Test
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
		hp.setRoomsMenu();
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
		hp.setRoomsMenu();
		hp.setChildrensPlusInput();
		hp.setChildrensAgeInput();
		hp.dropAndEnter();
	}
	@Test
	public void getAdditionalRoomsTest()
	{
		hp.setRoomsMenu();
		hp.setAdditionalRooms();
	}
	
	@Test 
	public void RemoveAdditionalRoomButtonTest()
	{
		hp.setRoomsMenu();
		hp.setAdditionalRooms();
		hp.setRemoveAdditionalRoomButton();
	}
	@Test
	public void getNationaltyInputTest()
	{
		hp.setNationalityInput();
		hp.dropAndEnter();
	}
	
	@Test 
	public void getResidencyInputTest()
	{
		hp.setResidencyInput();
		hp.dropAndEnter();

	}
	@Test
	public void getIsolationCheckBoxInput()
	{
		hp.setIsolationCheckBox();
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
