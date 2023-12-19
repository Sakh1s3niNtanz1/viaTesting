package com.via.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

}
