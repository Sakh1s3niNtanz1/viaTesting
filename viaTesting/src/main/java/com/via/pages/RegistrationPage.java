package com.via.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.ViaBase;

public class RegistrationPage extends ViaBase {
	
	WebDriverWait wait;
	
	
	public void signUpSetUp() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
	}
	
	public WebElement getSignUp() {
		
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span"));
	}
	
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public WebElement getCreatAccountBtn() {
		
		return driver.findElement(By.id("signUpValidate"));
		}
	
	public WebElement getEmailField() {
		
		
		return driver.findElement(By.id("emailIdSignUp"));
	}
	
	public WebElement getPasswordField() {
		
		
		return driver.findElement(By.id("passwordSignUp"));
	}
	
	public WebElement getNameField() {
		
		
		return driver.findElement(By.id("nameSignUp"));
	}
	
	public WebElement getNumberField() {
	
		
		return driver.findElement(By.id("mobileNoSignUp"));
	}
	
	public WebElement getCountryCode() {
		
		return driver.findElement(By.id("mobileIsdSignUp"));
		}
	
	public WebElement getEmailErrorMsg() {

		
		return driver.findElement(By.xpath("//*[@class=\"qtip-content\"]"));
	}
	
	
	public WebElement getPasswordErrorMsg() {
		
		
		return driver.findElement(By.xpath("//div[@class='qtip-content']"));
	}
	
	public WebElement getNumberErrorMsg() {
		
		
		return driver.findElement(By.xpath("//div[@class='qtip-content']"));
	}
	
	public WebElement getNameErrorMsg() {
		
		
		return driver.findElement(By.xpath("//div[@class='qtip-content']"));
	}
	
	public WebElement clickCreatAccBtn() {
		
		
		return driver.findElement(By.id("signUpValidate"));
	}
	
	
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	
	public void dropDownSelect() {
		Select countryCodeDropDown = new Select(driver.findElement(By.xpath("//select[@id='mobileIsdSignUp']")));
		List<WebElement> countryCodes = driver.findElements(By.xpath("//select[@id='mobileIsdSignUp']/option"));
		for (WebElement op : countryCodes) {
			System.out.println(op.getText());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		countryCodeDropDown.selectByVisibleText("27");

	}
	
	public boolean checkDisplayEl(WebElement el) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return el.isDisplayed();
	}
	public WebElement getEl(String a) {
		return driver.findElement(By.xpath(a));
	}
	
	public void sendKeysToEl(WebElement el, String keys) {
		el.sendKeys(keys);
		
	}
	
	public void clickEl(WebElement el) {
		el.click();
		
	}

}
