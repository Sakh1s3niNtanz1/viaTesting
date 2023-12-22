package com.via.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.via.pages.RegistrationPage;

public class RegistrationPageTest {
	
	RegistrationPage rp = new RegistrationPage();
	
	@BeforeMethod
	public void setUpLoginTest() {
		try {
			rp.setUp("");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test
	public void clickSigninTest() {
		rp.clickEl(rp.getSignUp());
		Assert.assertTrue(rp.checkDisplayEl(rp.getEl("//input[@id='signUpValidate']")));
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
		Assert.assertTrue(rp.checkDisplayEl(rp.getCreatAccountBtn()));
	}

	
	@Test
	public void validateEmailFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.checkDisplayEl(rp.getEmailField()));
	}

	
	@Test
	public void validatePasswordFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.checkDisplayEl(rp.getPasswordField()));
	}

	
	@Test
	public void validateNameFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.checkDisplayEl(rp.getNameField()));
	}

	
	@Test
	public void validateNumberFieldTest() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.checkDisplayEl(rp.getNumberField()));
	}

	
	@Test
	public void validateRegistrationTest() {
		rp.signUpSetUp();
		rp.sendKeysToEl(rp.getEmailField(), rp.getPropertyValue("email"));
		rp.sendKeysToEl(rp.getPasswordField(), rp.getPropertyValue("password"));
		rp.sendKeysToEl(rp.getNameField(), rp.getPropertyValue("name"));
		rp.dropDownSelect();
		rp.sendKeysToEl(rp.getNumberField(), rp.getPropertyValue("number"));
		rp.clickEl(rp.clickCreatAccBtn());
		rp.waitForEl(rp.getEl("//div[@id='viaAlert']/div/div"));
		Assert.assertTrue(rp.checkDisplayEl(rp.getEl("//div[@id='viaAlert']/div/div")));
	}
	
	
	@Test
	public void validateCountryCodeDropDownd() {
		rp.signUpSetUp();
		rp.dropDownSelect();
		Assert.assertTrue(rp.checkDisplayEl(rp.getEl("//select[@id='mobileIsdSignUp']/option[201]")));
	}
	
	
	@Test
	public void validateEmailErrorMsgTest() {
		rp.signUpSetUp();
		rp.clickCreatAccBtn().click();
		rp.waitForEl(rp.getEmailErrorMsg());
		Assert.assertTrue(rp.checkDisplayEl(rp.getEmailErrorMsg()));
	}

	
	@Test
	public void validatePasswordErrorMsgTest() {
		rp.signUpSetUp();
		rp.sendKeysToEl(rp.getEmailField(), rp.getPropertyValue("email"));
		rp.clickEl(rp.clickCreatAccBtn());;
		rp.waitForEl(rp.getPasswordErrorMsg());
		Assert.assertTrue(rp.checkDisplayEl(rp.getPasswordErrorMsg()));
	}

	
	@Test
	public void validateNameErrorMsgTest() {
		rp.signUpSetUp();
		rp.sendKeysToEl(rp.getEmailField(), rp.getPropertyValue("email"));
		rp.sendKeysToEl(rp.getPasswordField(), rp.getPropertyValue("password"));
		rp.clickEl(rp.clickCreatAccBtn());;
		rp.waitForEl(rp.getNameErrorMsg());
		Assert.assertTrue(rp.checkDisplayEl(rp.getNameErrorMsg()));
	}

	
	@Test
	public void validateNumberErrorMsgTest() {
		rp.signUpSetUp();
		rp.sendKeysToEl(rp.getEmailField(), rp.getPropertyValue("email"));
		rp.sendKeysToEl(rp.getPasswordField(), rp.getPropertyValue("password"));
		rp.sendKeysToEl(rp.getNameField(), rp.getPropertyValue("name"));
		rp.clickEl(rp.clickCreatAccBtn());;
		rp.waitForEl(rp.getNumberErrorMsg());
		Assert.assertTrue(rp.checkDisplayEl(rp.getNumberErrorMsg()));
	}

	
	@Test
	public void validateCountryCode() {
		rp.signUpSetUp();
		Assert.assertTrue(rp.getCountryCode().isDisplayed());
	}

	
	@AfterMethod
	public void closeSetUpLogin() {
		rp.cleanAndClose();
	}
}