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
	WebDriverWait wait;
	
	
//########################  GETTERS BEGIN HERE ############################################

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
	
	//######################## SELECT HOTEL DETAILS GETTERS BEGIN HERE ############################################

	public WebElement getSelectHotel()
	{
		return driver.findElement(By.xpath("//div[@id='0']/div[2]/p[1]"));	
	}
	public WebElement getHotelSelectHotelDetails()
	{
		return driver.findElement(By.xpath("//div[9]/div[6]/div[1]/div[2]"));
	}
	public WebElement getHotelSelectHotelPhotos()
	{
		return driver.findElement(By.xpath("//div[9]/div[6]/div[1]/div[3]"));
	}
	public WebElement getHotelSelectHotelLocation()
	{
		return driver.findElement(By.xpath("//div[9]/div[6]/div[1]/div[4]"));
	}
	public WebElement getHotelSelectHotelReviews()
	{
		return driver.findElement(By.xpath("//div[9]/div[6]/div[1]/div[5]"));
	}
	public WebElement getHotelSelectHotelRoomsRating()
	{
		return driver.findElement(By.xpath("//div[9]/div[6]/div[1]/div[6]"));
	}
//######################## SELECT HOTEL DETAILS GETTERS END HERE ############################################

	public WebElement getCheckInDate()
	{
		return driver.findElement(By.id("checkIn"));
	}
	public WebElement getCheckOutDate()
	{
		return driver.findElement(By.id("checkOut"));
	}

	//################# DATE START ##########################

	public WebElement getCheckInDateButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[3]/div/div"));
	} 
	
	
	public WebElement getCheckOutDateButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[3]/div/div"));
	}
	public WebElement closeCalenderButton()
	{
		return driver.findElement(By.id("vc-close"));
	}
	
	public WebElement getCalenderDateCheckIn()
	{
		return driver.findElement(By.xpath("//div[@id='depart-cal']/div[3]/div[2]/div[6]/div[2]"));
		
	}
	public WebElement getCalenderDateCheckOut()
	{
		return driver.findElement(By.xpath("//div[@id='return-cal']/div[3]/div[2]/div[6]/div[6]"));
	}

	//################## DATE END  #########################
	
	
//######################## CALENDAR DATE SETTERS BEGIN HERE ############################################

	public void setCheckInDateButton()
	{
		getCheckInDateButton().click();
	}
	public void setCheckOutDateButton()
	{
		getCheckOutDateButton().click();
	}
	public void setcloseCalenderButton()
	{
		closeCalenderButton().click();
	}
	
	public void setCalenderDateCheckIn()
	{
		getCalenderDateCheckIn().click();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	public void setCalenderDateCheckOut()
	{
		getCalenderDateCheckOut();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	public void setCalenderDateCheckingIn()
	{
		waitFor(driver.findElement(By.xpath("//div[@id='depart-cal']/div[4]/div[2]/div[4]/div[4]")));
		driver.findElement(By.xpath("//div[@id='depart-cal']/div[4]/div[2]/div[4]/div[4]")).click();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	public void setCalenderDateCheckingOut()
	{
		getCheckOutDate().click();
		driver.findElement(By.xpath("//div[@id='return-cal']/div[3]/div[2]/div[5]/div[7]")).click();
		driver.findElement(By.xpath("//span[@id='vc-close']")).click();
	}
	
	//////////////////////////////////////////////////////////
	
	//######################## SEARCH HOTEL BY USING DEFAULT VALUES BEGIN HERE ############################################
	public void searchHotel() {
		driver.findElement(By.xpath("//input[@id=\"destination\"]")).sendKeys("mumb");
        waitFor(driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]")));
        Actions act=new Actions(driver);
        act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[2]/div/div")).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//div[@id=\"depart-cal\"]/div[4]/div[2]/div[4]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[3]/div/div")).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//div[@id=\"return-cal\"]/div[4]/div[2]/div[4]/div[5]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[10]/div[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
	}
	

	
	public boolean checkDisplayEl(WebElement el) {
		return el.isDisplayed();
	}
	public WebElement getEl(String path) {
		return driver.findElement(By.xpath(path));
	}
	
//######################## SEARCH HOTEL BY USING CUSTOMIZED VALUES BEGIN HERE ############################################

		public void fullSearch()
		{
			setDestination();
	        waitFor(driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]")));
	        Actions act=new Actions(driver);
	        act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[2]/div/div")).click();
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//div[@id=\"depart-cal\"]/div[4]/div[2]/div[4]/div[2]")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[3]/div/div")).click();
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//div[@id=\"return-cal\"]/div[4]/div[2]/div[4]/div[5]")).click();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        setRoomsMenu();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        setAdultsPlusInput();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        setChildrensPlusInput();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        setChildrensAgeInput();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        setDoneButton();
	        setNationalityInput();
	        setResidencyInput();
	        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/div/div[10]/div[3]")).click();

		}
	
		//######################## SEARCH HOTEL BY USING CUSTOMIZED VALUES END HERE ############################################
	

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
	
	public WebElement getTwoChildrenInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1childAge2']/label[2]/select"));
	}
	public WebElement getThreeChildrenInput()
	{
		return driver.findElement(By.xpath("//div[@id='room1childAge3']/label[2]/select"));
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
	//########################  GETTERS END HERE ############################################


	
	//########################  SETTERS BEGIN HERE ############################################
	
	public WebElement getSearchButton()
	{
		return driver.findElement(By.xpath("//div[3]/div[3]/div/form/div[3]/div/div[10]/div[3]"));
	}
	
	public void setNavigateToHotels()
	{
		driver.findElement(By.xpath("//div[@id='Hotels']")).click();
	}
	public void setDestination ()
	{
		getDestinationInput().sendKeys("Mumbai");
	}
	
	public void setSearchScrollBar()
	{
		getSearchScrollBar().isDisplayed();
	}
	
	//############################## SELECT HOTELS AFTER CLICKING SEARCH  (start) #########################################
	
	public void setSelectHotel()
	{
		
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
	}
	public void setSelectHotelDetails()
	{
		
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getHotelSelectHotelDetails().click();
	}
	
	public void setSelectHotelPhotos()
	{
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getHotelSelectHotelPhotos().click();
	}
	public void setSelectHotelLocation()
	{	
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getHotelSelectHotelLocation().click();
	}
	public void setSelectHotelReviews()
	{
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getHotelSelectHotelReviews().click();
	}
	public void setSelectHotelRoomsRating()
	{
		setDestination();
		waitFor(getSearchScrollBar());		
		dropAndEnter();
		setSearchHotels();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getSelectHotel().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		getHotelSelectHotelRoomsRating().click();
	}
	
//############################## SELECT HOTELS AFTER CLICKING SEARCH  (END) #########################################

	
//############################## ROOMS MENU (start) #########################################
	
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
		setRoomsMenu();
		getCancelButton().click();
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
		setRoomsMenu();
		setChildrensPlusInput();
		getChildAgeInput().click();
		dropAndEnter();
		setDoneButton();
	}
	
	public void setTwoChildreInput()
	{
		setRoomsMenu();
		setChildrensPlusInput();
		setChildrensPlusInput();
		getTwoChildrenInput().click();
		dropAndEnter();
		setDoneButton();
	}
	
	public void setThreeChildreInput()
	{
		setRoomsMenu();
		setChildrensPlusInput();
		setChildrensPlusInput();
		setChildrensPlusInput();
		getThreeChildrenInput().click();
		dropAndEnter();
		setDoneButton();
	}
	
	public void setAdditionalRooms()
	{
		setRoomsMenu();
		getAdditionalRooms().click();
		setDoneButton();
	}
	public void setRemoveAdditionalRoomButton()
	{
		setRoomsMenu();
		getAdditionalRooms().click();
		getRemoveAdditionalRoomButton().click();
		setDoneButton();
	}
	
//############################## ROOMS MENU (start) #########################################

	public void setNationalityInput()
	{
		getNationalityInput().click();
		dropAndEnter();

	}
	
	public void setResidencyInput()
	{
		getResidencyInput().click();
		dropAndEnter();
	}
	public void setIsolationCheckBox()
	{
		getIsolationCheckBox().click();
	}
	
	
	public void dropAndEnter() {

			act=new Actions(driver);

			act.build();

			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		}
	
	public void waitFor(WebElement el)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until((ExpectedConditions.visibilityOf((el))));
	}
	
	public void setSearchHotels()
	{
		getSearchButton().click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchResult")));
	}
	
}
