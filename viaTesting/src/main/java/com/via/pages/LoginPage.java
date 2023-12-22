package com.via.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.via.base.ViaBase;

public class LoginPage extends ViaBase {
	
	public WebElement getSigninBtn() {
		return driver.findElement(By.id("loginValidate"));
	}
	
	public WebElement clickSigninBtn() {
		return driver.findElement(By.id("loginValidate"));
	}
	
	public void clickSignin() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
	}
	
	public WebElement getUsernameField() {
		return driver.findElement(By.id("loginIdText"));
	}
	
	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwordText"));
	}
	
	public WebElement getForgotPassword() {
		return driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[2]/div[1]/div/div[2]/label"));
	}
	
	public WebElement getOTPField() {
		return driver.findElement(By.id("forgotEmail"));
	}
	
	public WebElement getForgotenPassBTN() {
		return driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[2]/div[1]/div/div[2]/label"));
	}
	
	public WebElement getUsernameErrorMsg() {
		return driver.findElement(By.xpath("//div[@class=\"qtip-content\"]"));
	}
	
	public WebElement getPasswordErrorMsg() {	
		return driver.findElement(By.xpath("//div[@class='qtip-content']"));
	}
	
	public WebElement getWrongCredentialsErrorMsg() {
		return driver.findElement(By.xpath("//div[@id='viaAlert']/div/div"));
	}
	
	public WebElement getGreetingMsg() {
		return driver.findElement(By.xpath("//div[@id='userNameSecondaryNav']/div"));
	}
	
	
}