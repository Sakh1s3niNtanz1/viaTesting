package com.via.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.via.pages.LoginPage;

public class LoginPageTest {
	
	LoginPage lp = new LoginPage();
	@BeforeMethod
	public void setUpLogin() {
		lp.setUp();
	}
	@Test
	public void validateSigninBtn() {
		Assert.assertTrue(lp.getSigninBtn().isDisplayed());
	
	}
	
	@Test 
	public void validateUsernameField() {
		Assert.assertTrue(lp.getUsernameField().isDisplayed());
	}
	
	@Test
	public void validatePasswordField() {
		Assert.assertTrue(lp.getPasswordField().isDisplayed());
	}
	
	@Test
	public void validateRegistrationTest() {
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");
		lp.getPasswordField().sendKeys("Philani@123");
	}
	
	@Test
	public void validateForgetPasswordTest() {
		Assert.assertTrue(lp.getForgotPassword().isDisplayed());
	
	}
	
	@AfterMethod
	public void closeSetUpLogin() {
		lp.closeSetUp();
	}
	
	

}
