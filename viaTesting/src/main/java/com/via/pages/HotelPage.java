package com.via.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.ViaBase;

public class HotelPage extends ViaBase{

	Actions act;
	
	private WebElement findElement(By locator)
	{
		return driver.findElement(locator);
	}
	public boolean getHotelPagePresent()
	{
		return true;
	}
	
	
	public WebElement getDestinationInput()
	{
		return driver.findElement(By.id("destination"));
	}
	public WebElement getSearchScrollBar()
	{
		return driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]"));
		
	}
	public WebElement getCheckInDate()
	{
		return driver.findElement(By.id("checkIn"));
	}
	public WebElement getCheckOutDate()
	{
		return driver.findElement(By.id("checkOut"));
	}

	public WebElement getCheckInDateButton()
	{
		return driver.findElement(By.xpath("//div[@id='depart-cal']/div[3]/div[2]/div[5]/div[4]"));
		
	}
	
	public WebElement getCheckOutDateButton()
	{
		return driver.findElement(By.xpath("//*[@id=\"return-cal\"]/div[4]/div[2]/div[4]/div[5]"));
	}
	
	public WebElement getRoomsMenu()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[4]/div"));
	}
	
	public WebElement getCancelButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[5]/div[3]/div[3]"));
	}
	
	public WebElement getDoneButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[5]/div[3]/div[2]"));
	}
	
	
	public WebElement getAdultsMinusInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1']/div[2]/div/div[1]"));
		 
	}
	public WebElement getAdultsPlusInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1']/div[2]/div/div[3]"));
		 
	}
	
	public WebElement getChildrensMinusInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1']/div[3]/div/div[1]"));
	}
	
	public WebElement getChildrensPlusInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1']/div[3]/div/div[3]"));
	}
	
	public WebElement getChildAgeInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1childAge1']/label[2]/select"));
	}
	
	public WebElement getRemoveAdditionalRoomButton()
	{
		return driver.findElement(By.xpath("//div[@id='room2']/div[1]/span[2]"));
	}
	
	
	public WebElement getAdditionalRooms()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[5]/div[3]/div[1]"));
	}
	
	public WebElement getNationalityInput()
	{
		return driver.findElement(By.xpath("//select[@id='nationalityCountry']"));
	}
	public WebElement getResidencyInput()
	{
		return driver.findElement(By.xpath("//select[@id='residenceCountry']"));
	}
	public WebElement getIsolationCheckBox()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[10]/div[1]/div/label"));
	}
	

	
	
	
	
	
	
	public WebElement getSpecialRequestInput()
	{
		return driver.findElement(By.id(""));
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[10]/div[3]"));
	}
	
	public void setNavigateToHotels()
	{
		driver.findElement(By.xpath("//div[@id='Hotels']")).click();
	}
	public void setDestination (String destination)
	{
		getDestinationInput().sendKeys(destination);
	}
	
	public void setSearchScrollBar()
	{
		getSearchScrollBar().isDisplayed();
	}
	
	public void setCheckInDate()
	{
		getCheckInDate().click();
		driver.findElement(By.xpath("//div[@id='depart-cal']/div[3]/div[2]/div[5]/div[4]")).click();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	public void setCheckOutDate()
	{
		getCheckOutDate().click();
		driver.findElement(By.xpath("//div[@id='return-cal']/div[3]/div[2]/div[5]/div[7]")).click();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	public void setRoomsMenu()
	{
		getRoomsMenu().click();
		
	}
	public void setDoneButton()
	{
		getDoneButton().click();
	}
	
	public void setCancelButton ()
	{
		getCancelButton().click();
	}
	
	public void selectCheckInDate(String date)
	{
		getCheckInDateButton().click();
	}
	public void selectCheckOutDate(String date)
	{
		getCheckOutDateButton().click();
	}
	
	public void setAdultsMinusInput()
	{
		getAdultsMinusInput().click();
		
	}
	public void setAdultsPlusInput()
	{
		getAdultsPlusInput().click();
		
	}
	public void setChildrensMinusInput()
	{
		getChildrensMinusInput().click();
	}
	public void setChildrensPlusInput()
	{
		getChildrensPlusInput().click();
	}
	
	public void setChildrensAgeInput()
	{
		getChildAgeInput().click();
	}
	
	public void setAdditionalRooms()
	{
		getAdditionalRooms().click();
	}
	public void setRemoveAdditionalRoomButton()
	{
		getRemoveAdditionalRoomButton().click();
	}
	
	public void setNationalityInput()
	{
		getNationalityInput().click();
	}
	
	public void setResidencyInput()
	{
		getResidencyInput().click();
	}
	public void setIsolationCheckBox()
	{
		getIsolationCheckBox().click();
	}
	

	
	public void addSpecialRequests(String specialRequest)
	{
		getSpecialRequestInput().sendKeys(specialRequest);
	}
	
	public void dropAndEnter() {

			act=new Actions(driver);

			act.build();

			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		}
	
	public void setSearchHotels()
	{
		getSearchButton().click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchResult")));
	}
	
}
