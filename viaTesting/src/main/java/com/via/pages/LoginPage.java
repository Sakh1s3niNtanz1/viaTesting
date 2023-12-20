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
		
		return driver.findElement(By.id("loginValidate"));
	}
	
//	public boolean validateSinginBtn() {
//		return driver.findElement(By.xpath("//input[@id='loginValidate']")).isDisplayed();
//
//	}
	
	public WebElement clickSigninBtn() {
		
		return driver.findElement(By.id("loginValidate"));
		

	}
	
	public void clickSignin() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();

	}
	
	
	
//	public void waitForSomeTime() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public WebElement getUsernameField() {
		return driver.findElement(By.id("loginIdText"));
		}
	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwordText"));
	}
	public WebElement getForgotPassword() {
		
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
	
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	
	public WebElement getGreetingMsg() {
		
		return driver.findElement(By.xpath("//div[@id='userNameSecondaryNav']/div"));
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
		
		return driver.findElement(By.id("loginValidate"));
	}
	
//	public boolean validateSinginBtn() {
//		return driver.findElement(By.xpath("//input[@id='loginValidate']")).isDisplayed();
//
//	}
	
	public WebElement clickSigninBtn() {
		
		return driver.findElement(By.id("loginValidate"));
		

	}
	
	public void clickSignin() {
		driver.findElement(By.xpath("//div[@id='SignIn']/div")).click();

	}
	
	
	
	public void waitForSomeTime() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public WebElement getUsernameErrorMsg() {
		
		return driver.findElement(By.xpath("//div[@class=\"qtip-content\"]"));
	}
	
	public WebElement getPasswordErrorMsg() {
		
		return driver.findElement(By.xpath("//div[@class='qtip-content']"));
	}
	
	public WebElement getWrongCredentialsErrorMsg() {
		return driver.findElement(By.xpath("//div[@id='viaAlert']/div/div"));
	}
	
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	
	public WebElement getGreetingMsg() {
		
		return driver.findElement(By.xpath("//div[@id='userNameSecondaryNav']/div"));
		}
}
