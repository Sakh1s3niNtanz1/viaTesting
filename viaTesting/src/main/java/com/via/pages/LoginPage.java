package com.via.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.via.base.ViaBase;

public class LoginPage extends ViaBase {
	
	WebDriverWait wait;
	
	public WebElement getSigninBtn() {
		driver.findElement(By.xpath("//div[@id=\"SignIn\"]/div")).click();
		
		return driver.findElement(By.id("loginValidate"));
	}
	
//	public boolean validateSinginBtn() {
//		return driver.findElement(By.xpath("//input[@id='loginValidate']")).isDisplayed();
//
//	}
	
	public WebElement clickSigninBtn() {
		driver.findElement(By.xpath("//div[@id=\"SignIn\"]/div")).click();
		
		return driver.findElement(By.id("loginValidate"));
		

	}
	
	
	
	public WebElement getUsernameField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
			
		return driver.findElement(By.id("loginIdText"));
		}
	public WebElement getPasswordField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.id("passwordText"));
	}
	public WebElement getForgotPassword() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[2]/div[1]/div/div[2]/label"));
	}
	
	public WebElement getUsernameErrorMsg() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.xpath("//div[@class=\"qtip-content\"]"));
	}
	
	public WebElement getPasswordErrorMsg() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.id("qtip-6-content"));
	}
	
	public WebElement getWrongCredentialsErrorMsg() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		return driver.findElement(By.xpath("//div[@id='viaAlert']/div/div"));
	}
	
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
}
