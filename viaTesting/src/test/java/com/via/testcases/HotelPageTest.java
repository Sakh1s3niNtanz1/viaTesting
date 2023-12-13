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

public class HotelPageTest extends ViaBase{

	private HotelPage hotelBooking;

	
	public void searchHotel() 
	{
		
		WebElement destinationInput = driver.findElement(By.id("destination"));
		WebElement checkInDateInput = driver.findElement(By.id("checkIn"));
		WebElement checkOutDateInput = driver.findElement(By.id("checkOut"));
		//WebElement searchButton = driver.findElement(By.id("searchBtn"));
		
		destinationInput.sendKeys("New York");
		checkInDateInput.click();
		driver.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]/div[4]/div[6]")).click();
		
		
		checkOutDateInput.click();
		driver.findElement(By.xpath("//*[@id=\"return-cal\"]/div[4]/div[2]/div[4]/div[5]")).click();
		//searchButton.click();
	}
	
	@Test
	public void testSetDestination ()
	{
		hotelBooking = new HotelPage();
		hotelBooking.setDestination("New York");
		WebElement destinationInput = hotelBooking.getDestinationInput();
		Assert.assertEquals(destinationInput.getAttribute("value"), "New York", "Destination input is not set correct");
		
	}
	
	
	
	@Test
	public void testSetCheckInDate()
	{
		hotelBooking = new HotelPage();
		hotelBooking.setCheckInDate("2023-12-25");
		WebElement checkInDateInput = hotelBooking.getCheckInDate();
		Assert.assertEquals(checkInDateInput.getAttribute("value"), "2023-12-25", "Check-in date input is not set correc");
	}
	
	public void testSelectCheckInDate()
	{
		hotelBooking = new HotelPage();
		hotelBooking.setCheckInDate("2023-12-25");
		WebElement checkInDateInput = hotelBooking.getCheckInDate();
		Assert.assertEquals(checkInDateInput.getAttribute("value"), "2023-12-25", "Check-in date input is not set correc");
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
	
	
	
	
}
