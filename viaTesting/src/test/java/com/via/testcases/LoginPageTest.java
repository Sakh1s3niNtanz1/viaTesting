package com.via.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.via.pages.RegistrationPage;

public class RegistrationPageTest {
	
	
	RegistrationPage rp = new RegistrationPage();
	
	@BeforeMethod
	public void setUpLoginTest() {
		rp.setUp();
	}
	
	@Test
	public void clickSigninTest() {
		rp.getSignUp().click();
	
	}
	
	@Test
	public void validateTitleFieldTest()
	{
		String expTitle = "Book Flights, Hotels, Bus and Holiday Packages Online - Via.com";
		String actTitle = rp.getTitle();
		Assert.assertEquals(actTitle,expTitle);
	}
	
	@Test
	public void validateCreatAccountBtnTest() {
		Assert.assertTrue(rp.getCreatAccountBtn().isDisplayed());
	
	}
	
	@Test
	public void validateEmailFieldTest() {
		Assert.assertTrue(rp.getEmailField().isDisplayed());
	
	}
	
	@Test
	public void validatePasswordFieldTest() {
		Assert.assertTrue(rp.getPasswordField().isDisplayed());
	
	}
	
	@Test
	public void validateNameFieldTest() {
		Assert.assertTrue(rp.getNameField().isDisplayed());
	
	}
	
	@Test
	public void validateNumberFieldTest() {
		Assert.assertTrue(rp.getNumberField().isDisplayed());
	
	}
	
	@Test
	public void validateRegistrationTest() {
		rp.getEmailField().sendKeys("magwaza749@gmail.com");
		rp.getPasswordField().sendKeys("Philani@123");
		rp.getNameField().sendKeys("Philani Magwaza");
		rp.getNumberField().sendKeys("0719270404");
		rp.getCreatAccountBtn().click();
		
	}
	
	@AfterMethod
	public void closeSetUpLogin() {
		rp.closeSetUp();
	}

}
