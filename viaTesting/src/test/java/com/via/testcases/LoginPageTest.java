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
	public void validateClickSigninBtn() {
		lp.clickSigninBtn().click();
	
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
		lp.getPasswordField().sendKeys("Philani@124");
		lp.clickSigninBtn().click();

	}
	
	@Test
	public void validateForgetPasswordTest() {
		Assert.assertTrue(lp.getForgotPassword().isDisplayed());
		
	
	}
	
	
	
	@Test
	public void validateUsernameErrorMsgTest() throws InterruptedException {
		lp.clickSigninBtn().click();
//		Thread.sleep(3000);
		lp.waitForEl(lp.getUsernameErrorMsg());
		
		

		Assert.assertTrue(lp.getUsernameErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validatePasswordErrorMsgTest() {
		lp.clickSigninBtn().click();

		Assert.assertTrue(lp.getPasswordErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validateWrongCredentialsErrorMsgTest() {
		lp.clickSigninBtn().click();

		Assert.assertTrue(lp.getUsernameErrorMsg().isDisplayed());
	
	}
	
	
	
	@AfterMethod
	public void closeSetUpLogin() {
		lp.closeSetUp();
	}
	
	

}
