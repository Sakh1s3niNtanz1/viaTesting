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
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");
		lp.getPasswordField().sendKeys("Philani@123");
		lp.clickEl(lp.clickSigninBtn());
		Assert.assertTrue(lp.checkDisplayEl(lp.getGreetingMsg()));

	}

	
	@Test
	public void validateForgetPasswordTest() {
		lp.clickSignin();

		Assert.assertTrue(lp.checkDisplayEl(lp.getForgotPassword()));
		
	
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
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");

		lp.clickEl(lp.clickSigninBtn());
		lp.waitForEl(lp.getPasswordErrorMsg());
		Assert.assertTrue(lp.checkDisplayEl(lp.getPasswordErrorMsg()));
	
	}
	
	@Test
	public void validateWrongCredentialsErrorMsgTest() {
		lp.clickSignin();
		lp.sendKeysToEl(lp.getUsernameField(), "magwaza749@gmail.com");
		lp.sendKeysToEl(lp.getPasswordField(), "Philani@124");		
		lp.clickEl(lp.clickSigninBtn());
		lp.waitForEl(lp.getWrongCredentialsErrorMsg());
		Assert.assertTrue(lp.checkDisplayEl(lp.getWrongCredentialsErrorMsg()));
	
	}
	
	
	
	
	
	@AfterMethod
	public void closeSetUpLogin() {
		lp.closeSetUp();
	}
	
	

}
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
		lp.clickSignin();
		Assert.assertTrue(lp.getSigninBtn().isDisplayed());
	
	}
	
	@Test
	public void validateClickSigninBtn() {
		lp.clickSignin();

		lp.clickSigninBtn().click();
	
	}
	
	@Test 
	public void validateUsernameField() {
		lp.clickSignin();

		Assert.assertTrue(lp.getUsernameField().isDisplayed());
	}
	
	@Test
	public void validatePasswordField() {
		lp.clickSignin();

		Assert.assertTrue(lp.getPasswordField().isDisplayed());
	}
	
	@Test
	public void validateLoginTest() {
		lp.clickSignin();

		
		lp.clickSigninBtn().click();

	}
	
	@Test
	public void loginValidattionTest() {
		lp.clickSignin();
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");
		lp.getPasswordField().sendKeys("Philani@123");
		lp.clickSigninBtn().click();
		Assert.assertTrue(lp.getGreetingMsg().isDisplayed());

	}

	
	@Test
	public void validateForgetPasswordTest() {
		lp.clickSignin();

		Assert.assertTrue(lp.getForgotPassword().isDisplayed());
		
	
	}
	
	
	
	@Test
	public void validateUsernameErrorMsgTest() throws InterruptedException {
		lp.clickSignin();
		lp.clickSigninBtn().click();
//		Thread.sleep(3000);
		lp.waitForEl(lp.getUsernameErrorMsg());
		
		

		Assert.assertTrue(lp.getUsernameErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validatePasswordErrorMsgTest() {
		lp.clickSignin();
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");

		lp.clickSigninBtn().click();
		lp.waitForEl(lp.getPasswordErrorMsg());
		Assert.assertTrue(lp.getPasswordErrorMsg().isDisplayed());
	
	}
	
	@Test
	public void validateWrongCredentialsErrorMsgTest() {
		lp.clickSignin();
		lp.getUsernameField().sendKeys("magwaza749@gmail.com");
		lp.getPasswordField().sendKeys("Philani@124");
		
		lp.clickSigninBtn().click();
		lp.waitForEl(lp.getWrongCredentialsErrorMsg());

		Assert.assertTrue(lp.getWrongCredentialsErrorMsg().isDisplayed());
	
	}
	
	
	
	
	
	@AfterMethod
	public void closeSetUpLogin() {
		lp.closeSetUp();
	}
	
	

}
