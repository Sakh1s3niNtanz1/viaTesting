package com.via.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.via.base.ViaBase;

public class RegistrationPage extends ViaBase {
	
	public WebElement getSignUp() {
		
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		
		return driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span"));
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public WebElement getCreatAccountBtn() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
		return driver.findElement(By.id("signUpValidate"));
		}
	
	public WebElement getEmailField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
		
		return driver.findElement(By.id("emailIdSignUp"));
	}
	
	public WebElement getPasswordField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
		
		return driver.findElement(By.id("passwordSignUp"));
	}
	
	public WebElement getNameField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
		
		return driver.findElement(By.id("nameSignUp"));
	}
	
	public WebElement getNumberField() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();
		driver.findElement(By.xpath("//div[@id='SignInContent']/div[1]/div[1]/div[2]/span/label/span")).click();
		
		return driver.findElement(By.id("mobileNoSignUp"));
	}
	

}
