package com.via.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.via.base.ViaBase;

public class LoginPage extends ViaBase {
	
	public WebElement getSigninBtn() {
		driver.findElement(By.xpath("//div[@id=\"SignIn\"]/div")).click();
		
		return driver.findElement(By.id("loginValidate"));
	}
	
//	public boolean validateSinginBtn() {
//		return driver.findElement(By.xpath("//input[@id='loginValidate']")).isDisplayed();
//
//	}
	
	
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
}
