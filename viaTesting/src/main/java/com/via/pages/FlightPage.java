package com.via.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.ViaBase;

public class FlightPage extends ViaBase {
	Actions act;
	WebDriverWait wait;
	By oneWayTab=By.xpath("//html/body/div[4]/div[3]/div/form/div[3]/div/div[1]");
	By roundTripTab=By.xpath("//html/body/div[4]/div[3]/div/form/div[3]/div/div[2]/label");
	By multiCityTab=By.xpath("//html/body/div[4]/div[3]/div/form/div[3]/div/div[3]/label");
	By fromInput=By.xpath("//input[@id='source']");
	By toInput=By.xpath("//input[@id='destination']");
	By departureDatepicker=By.xpath("//input[@id='departure']");
	By returnDatepicker=By.xpath("//input[@id='return']");
	By adultsMinusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[1]/div/div[1]");
	By adultsPlusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[1]/div/div[3]");
	By childrenMinusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[2]/div/div[1]");
	By childrenPlusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[2]/div/div[3]");
	By infantMinusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[3]/div/div[1]");
	By infantPlusBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[3]/div/div[3]");
	By showMoreOptionsBtn=By.xpath("//html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[4]/a");
	By prefAirline=By.xpath("//input[@id='prefCarrier']");
	By prefClass=By.xpath("//select[@id='preferredClass']");
	By prefRouting=By.xpath("//select[@id='routingType']");
	By yourRecentSearches=By.xpath("/html/body/div[4]/div[3]/div/form/div[4]/div[3]/div[5]/div/a");
	By searchBtn=By.xpath("//div[@id='search-flight-btn']");
	By fromList=By.xpath("//ul[@id=\"ui-id-1\"]");
	By toList=By.xpath("//ul[@id='ui-id-2']");
	
	
	public FlightPage() {
	
	}
	public WebElement getOneWayTab() {
		return driver.findElement(oneWayTab);
	}
	public WebElement getRoundTripTab() {
		return driver.findElement(roundTripTab);
	}
	public WebElement getMultiCityTab() {
		return driver.findElement(multiCityTab);
	}
	public WebElement getFromInput() {
		return driver.findElement(fromInput);
	}
	public WebElement getToInput() {
		return driver.findElement(toInput);
	}
	public WebElement getDepartureDatepicker() {
		return driver.findElement(departureDatepicker);
	}
	public WebElement getReturnDatepicker() {
		return driver.findElement(returnDatepicker);
	}
	public WebElement getAdultsMinusBtn() {
		return driver.findElement(adultsMinusBtn);
	}
	public WebElement getAdultsPlusBtn() {
		return driver.findElement(adultsPlusBtn);
	}
	public WebElement getChildrenMinusBtn() {
		return driver.findElement(childrenMinusBtn);
	}
	public WebElement getChildrenPlusBtn() {
		return driver.findElement(childrenPlusBtn);
	}
	public WebElement getInfantMinusBtn() {
		return driver.findElement(infantMinusBtn);
	}
	public WebElement getInfantPlusBtn() {
		return driver.findElement(infantPlusBtn);
	}
	public WebElement getShowMoreOptionsBtn() {
		return driver.findElement(showMoreOptionsBtn);
	}
	public WebElement getPrefAirline() {
		getShowMoreOptionsBtn().click();
		return driver.findElement(prefAirline);
	}
	public WebElement getPrefClass() {
		getShowMoreOptionsBtn().click();
		return driver.findElement(prefClass);
	}
	public WebElement getPrefRouting() {
		getShowMoreOptionsBtn().click();
		return driver.findElement(prefRouting);
	}
	public WebElement getYourRecentSearches() {
		return driver.findElement(yourRecentSearches);
	}
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}
	public void dropAndEnter() {
		act=new Actions(driver);
		act.build();
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}
	public WebElement getFromList() {
		return driver.findElement(fromList);
	}
	public WebElement getToList() {
		return driver.findElement(toList);
	}
	public WebElement getAnEl(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public void getAnElAndClick(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void getAnElAndClick(WebElement el) {
		el.click();
	}
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	public void waitForElToClick(WebElement el) {

		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}
	public boolean isElDisplayed(String path) {
		waitForEl(driver.findElement(By.xpath(path)));
		return driver.findElement(By.xpath(path)).isDisplayed();
	}
	public void searchOneWayFlight() {
		getFromInput().sendKeys("mumbai");
		waitForEl(getFromList());
		dropAndEnter();
		getToInput().sendKeys("delh");
		waitForEl(getToList());
		dropAndEnter();
		waitForEl(getAnEl("//div[@id=\"depart-cal\"]/div[3]/div[2]/div[6]/div[1]"));
		getAnElAndClick("//div[@id=\"depart-cal\"]/div[3]/div[2]/div[6]/div[1]");
		getAnElAndClick(getSearchBtn());
		waitForEl(getAnEl("//div[@id=\"flightSearchResults\"]"));
	}
	public void searchRoundTripFlight() {
		getRoundTripTab().click();
		getFromInput().sendKeys("mumbai");
		waitForEl(getFromList());
		dropAndEnter();
		getToInput().sendKeys("delh");
		waitForEl(getToList());
		dropAndEnter();
		waitForEl(getAnEl("//div[@id=\"depart-cal\"]/div[3]/div[2]/div[6]/div[1]"));
		getAnElAndClick("//div[@id=\"depart-cal\"]/div[3]/div[2]/div[6]/div[1]");
		waitForEl(getAnEl("//input[@id=\"return\"]"));
		getAnElAndClick("//input[@id=\"return\"]");
		waitForEl(getAnEl("//div[@id=\"return-cal\"]/div[4]/div[2]/div[2]/div[3]"));
		getAnElAndClick("//div[@id=\"return-cal\"]/div[4]/div[2]/div[2]/div[3]");
		getAnElAndClick(getSearchBtn());
		waitForEl(getAnEl("//div[@id=\"flightSearchResults\"]"));
	}
	public void searchMultiCityFlight() {
		getMultiCityTab().click();
		getAnElAndClick("//label[@id=\"multi-city-label-0\"]");
		getAnEl("//input[@id=\"source-0\"]").sendKeys("mumbai");
		waitForEl(getAnEl("//ul[@id=\"ui-id-3\"]"));
		dropAndEnter();
		getAnEl("//input[@id=\"destination-0\"]").sendKeys("delh");
		waitForEl(getAnEl("//ul[@id=\"ui-id-4\"]"));
		dropAndEnter();
		waitForElToClick(getAnEl("//div[@id=\"multi-city-panel\"]/div[2]/div[3]/div/div"));
		getAnElAndClick("//div[@id=\"multi-city-panel\"]/div[2]/div[3]/div/div");
		waitForEl(getAnEl("//div[@id=\"depart-cal-0\"]/div[3]/div[2]/div[6]/div[7]"));
		getAnElAndClick("//div[@id=\"depart-cal-0\"]/div[3]/div[2]/div[6]/div[7]");
		waitForEl(getAnEl("//div[@id=\"search-flight-btn\"]"));
		getAnElAndClick("//div[@id=\"search-flight-btn\"]");
		waitForEl(getAnEl("//input[@id=\"destination-1\"]"));
		getAnEl("//input[@id=\"destination-1\"]").sendKeys("mumba");
		waitForEl(getAnEl("//ul[@id=\"ui-id-6\"]"));
		dropAndEnter();
		waitForEl(getAnEl("//*[@id=\"multi-city-panel\"]/div[3]/div[3]/div/div"));
		getAnElAndClick("//*[@id=\"multi-city-panel\"]/div[3]/div[3]/div/div");
		waitForEl(getAnEl("//*[@id=\"depart-cal-1\"]/div[4]/div[2]/div[6]/div[1]"));
		getAnElAndClick("//*[@id=\"depart-cal-1\"]/div[4]/div[2]/div[6]/div[1]");
		getAnElAndClick("//div[@id=\"search-flight-btn\"]");
		
	}
	public void bookFlight() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		waitForElToClick(driver.findElement(By.xpath("//div[@id=\"searchResultContainer\"]/div[7]/div/div[5]/div[1]/div[3]/div[2]/button")));
		getAnElAndClick("//div[@id=\"searchResultContainer\"]/div[7]/div/div[5]/div[1]/div[3]/div[2]/button");
		waitForElToClick(driver.findElement(By.xpath("//select[@id=\"adult1Title\"]")));
		getAnElAndClick("//*[@id=\"adult1Title\"]");
		dropAndEnter();
		waitForElToClick(driver.findElement(By.xpath("//input[@id=\"adult1FirstName\"]")));
		getAnEl("//input[@id=\"adult1FirstName\"]").sendKeys("Sakhiseni");
		getAnEl("//input[@id=\"adult1Surname\"]").sendKeys("Ntanzi");
		getAnEl("//input[@id=\"contactMobile\"]").sendKeys("9088887272");
		getAnEl("//input[@id=\"contactEmail\"]").sendKeys("sakhiseni.ntanzi@ltimindtree.com");
		waitForElToClick(getAnEl("//button[@id=\"makePayCTA\"]"));
		getAnElAndClick("//button[@id=\"makePayCTA\"]");
		getAnElAndClick("//div[@id=\"refundProtectDiv\"]/div[3]/div/div[1]/div/div[1]/div/label");
		getAnElAndClick("//button[@id=\"confirmProceedPayBtn\"]");
	}
}
