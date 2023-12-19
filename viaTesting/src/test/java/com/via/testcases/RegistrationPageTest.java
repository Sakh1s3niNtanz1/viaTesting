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
	public void validateTitleFieldTest(){
		rp.signUpSetUp();
		String expTitle = "Book Flights, Hotels, Bus and Holiday Packages Online - Via.com";
		String actTitle = rp.getTitle();
		Assert.assertEquals(actTitle,expTitle);
	}
	
	@Test
	public void validateCreatAccountBtnTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getCreatAccountBtn().isDisplayed());
	
	}
	
	@Test
	public void validateEmailFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getEmailField().isDisplayed());
	
	}
	
	@Test
	public void validatePasswordFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getPasswordField().isDisplayed());
	
	}
	
	@Test
	public void validateNameFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getNameField().isDisplayed());
	
	}
	
	@Test
	public void validateNumberFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getNumberField().isDisplayed());
	
	}
	
	@Test
	public void validateRegistrationTest() {
		rp.signUpSetUp();
		rp.getEmailField().sendKeys("magwaza749@gmail.com");
		rp.getPasswordField().sendKeys("Philani@123");
		rp.getNameField().sendKeys("Philani Magwaza");
		rp.getNumberField().sendKeys("0719270404");
		rp.getCreatAccountBtn().click();
		
	}
	
	@Test
	public void validateEmailErrorMsgTest() {
		rp.signUpSetUp();
		rp.clickCreatAccBtn().click();
		rp.waitForEl(rp.getEmailErrorMsg());

		Assert.assertTrue(rp.getEmailErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validatePasswordErrorMsgTest() {
		rp.signUpSetUp();
		rp.getEmailField().sendKeys("magwaza749@gmail.com");
		rp.clickCreatAccBtn().click();
		rp.waitForEl(rp.getPasswordErrorMsg());

		Assert.assertTrue(rp.getPasswordErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validateNameErrorMsgTest() {
		rp.signUpSetUp();
		rp.getEmailField().sendKeys("magwaza749@gmail.com");
		rp.getPasswordField().sendKeys("Philani@123");
		rp.clickCreatAccBtn().click();
		rp.waitForEl(rp.getNameErrorMsg());

		Assert.assertTrue(rp.getNameErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validateNunberErrorMsgTest() {
		rp.signUpSetUp();
		rp.getEmailField().sendKeys("magwaza749@gmail.com");
		rp.getPasswordField().sendKeys("Philani@123");
		rp.getNameField().sendKeys("Philani Magwaza");
		rp.clickCreatAccBtn().click();
		rp.waitForEl(rp.getNumberErrorMsg());

		Assert.assertTrue(rp.getNumberErrorMsg().isDisplayed());
	
	}
	
//	@Test
//	public void validatePasswodErrorMsgTest() {
//		rp.signUpSetUp();
//		rp.clickCreatAccBtn().click();
//
//		Assert.assertTrue(rp.getPasswordErrorMsg().isDisplayed());
//	
//	}
	
	
	@AfterMethod
	public void closeSetUpLogin() {
		rp.closeSetUp();
	}

}
