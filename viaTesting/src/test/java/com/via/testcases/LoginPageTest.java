package com.via.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.via.pages.LoginPage;

public class LoginPageTest {
	
	LoginPage lp = new LoginPage();
	
	@BeforeMethod
	public void setUpLogin() {
		try {
			lp.setUp("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void validateSigninBtn() {
		lp.clickSignin();
		Assert.assertTrue(lp.checkDisplayEl(lp.getSigninBtn()));
	}
	
	
	@Test
	public void validateClickSigninBtn() {
		lp.clickSignin();
		lp.clickEl(lp.clickSigninBtn());
		Assert.assertTrue(lp.checkDisplayEl(lp.getEl("//input[@id='loginValidate']")));
	}
	
	
	@Test 
	public void validateUsernameField() {
		lp.clickSignin();
		Assert.assertTrue(lp.checkDisplayEl(lp.getUsernameField()));
	}
	
	
	@Test
	public void validatePasswordField() {
		lp.clickSignin();
		Assert.assertTrue(lp.checkDisplayEl(lp.getPasswordField()));
	}
	
	
	@Test
	public void loginValidattionTest() {
		lp.clickSignin();
		lp.sendKeysToEl(lp.getUsernameField(), lp.getPropertyValue("email"));
		lp.sendKeysToEl(lp.getPasswordField(), lp.getPropertyValue("password"));		
		lp.clickEl(lp.clickSigninBtn());
		Assert.assertTrue(lp.checkDisplayEl(lp.getGreetingMsg()));
	}

	
	@Test
	public void validateForgetPasswordTest() {
		lp.clickSignin();
		Assert.assertTrue(lp.checkDisplayEl(lp.getForgotPassword()));
	}
	
	@Test
	public void validateClickForgetPasswordTest() {
		lp.clickSignin();
		lp.clickEl(lp.getForgotenPassBTN());
		Assert.assertTrue(lp.checkDisplayEl(lp.getOTPField()));
	}
	
	@Test
	public void validateUsernameErrorMsgTest() throws InterruptedException {
		lp.clickSignin();
		lp.clickEl(lp.clickSigninBtn());
		lp.waitForEl(lp.getUsernameErrorMsg());
		Assert.assertTrue(lp.checkDisplayEl(lp.getUsernameErrorMsg()));
	}
	
	
	@Test
	public void validatePasswordErrorMsgTest() {
		lp.clickSignin();
		lp.sendKeysToEl(lp.getUsernameField(), lp.getPropertyValue("email"));
		lp.clickEl(lp.clickSigninBtn());
		lp.waitForEl(lp.getPasswordErrorMsg());
		Assert.assertTrue(lp.checkDisplayEl(lp.getPasswordErrorMsg()));
	}
	
	
	@Test
	public void validateWrongCredentialsErrorMsgTest() {
		lp.clickSignin();
		lp.sendKeysToEl(lp.getUsernameField(), lp.getPropertyValue("email"));
		lp.sendKeysToEl(lp.getPasswordField(), lp.getPropertyValue("wrongpassword"));		
		lp.clickEl(lp.clickSigninBtn());
		lp.waitForEl(lp.getWrongCredentialsErrorMsg());
		Assert.assertTrue(lp.checkDisplayEl(lp.getWrongCredentialsErrorMsg()));
	}
	
	
	@AfterMethod
	public void closeSetUpLogin() {
		lp.cleanAndClose();
	}
}