package com.via.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.ViaBase;

public class HotelPage extends ViaBase{

/*
 * 	WebDriver driver = new ChromeDriver();
	
	public void setUp()
	{
		driver.get("https://in.via.com/hotels");
		
	}
 */
	
	private WebElement findElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public WebElement getDestinationInput()
	{
		return driver.findElement(By.id("destination"));
	}
	
	public WebElement getCheckInDate()
	{
		return driver.findElement(By.id("checkIn"));
	}
	public WebElement getCheckOutDate()
	{
		return driver.findElement(By.id("csheckOut"));
	}
	public WebElement getCheckInDateButton()
	{
		return driver.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[2]/div[4]/div[6]"));
	}
	
	public WebElement getCheckOutDateButton()
	{
		return driver.findElement(By.xpath("//*[@id=\"return-cal\"]/div[4]/div[2]/div[4]/div[5]"));
	}
	
	public WebElement getAdultsInput()
	{
		return driver.findElement(By.id(""));
	}
	
	public WebElement getChildrenInput()
	{
		return driver.findElement(By.id(""));
	}
	
	public WebElement getChildAgeInput(int index)
	{
		return driver.findElement(By.id("" +index));
	}
	
	
	
	public WebElement getSpecialRequestInput()
	{
		return driver.findElement(By.id(""));
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(By.id(""));
	}
	
	
	public void setDestination (String destination)
	{
		getDestinationInput().sendKeys(destination);
	}
	
	public void setCheckInDate(String date)
	{
		getCheckInDate().sendKeys(date);
	}
	
	public void setCheckOutDate(String date)
	{
		getCheckInDate().sendKeys(date);
	}
	public void selectCheckInDate(String date)
	{
		getCheckInDateButton().click();
	}
	public void selectCheckOutDate(String date)
	{
		getCheckOutDateButton().click();
	}
	
	public void enterRoomDetails (int adults, int children, int [] childAges)
	{
		getAdultsInput().clear();
		
		getAdultsInput().sendKeys(String.valueOf(adults));
		
		getChildrenInput().clear();
		
		getChildrenInput().sendKeys(String.valueOf(children));
		
		for (int i =0; i<children; i++) 
		{
			getChildAgeInput(i + 1).clear();
			getChildAgeInput(i + 1).sendKeys(String.valueOf(childAges[i]));
		}
		
	}
	
	public void addSpecialRequests(String specialRequest)
	{
		getSpecialRequestInput().sendKeys(specialRequest);
	}
	
	public void searchHotels()
	{
		getSearchButton().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchResult")));
	}
	
}
