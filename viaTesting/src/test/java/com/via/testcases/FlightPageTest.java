package com.via.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.via.pages.FlightPage;

public class FlightPageTest{
	
	FlightPage fp;
	@BeforeMethod
	public void FlightTestsSetUp() throws IOException {
		fp=new FlightPage();
		fp.setUp("");
	}
	@AfterMethod
	public void FlightTestsCloser() {
		fp.cleanAndClose();
	}
	@Test
	public void validateOneWayTabTest() {
		Assert.assertTrue(fp.getOneWayTab().isDisplayed());
	}
	
	@Test
	public void validateRoundTripTabTest() {
		Assert.assertTrue(fp.getRoundTripTab().isDisplayed());
	}
	
	@Test
	public void validateMultiCityTest() {
		Assert.assertTrue(fp.getMultiCityTab().isDisplayed());
	}
	
	@Test
	public void validateFromInputTest() {
		Assert.assertTrue(fp.getFromInput().isDisplayed());
	}
	@Test
	public void validateToInputTest() {
		Assert.assertTrue(fp.getToInput().isDisplayed());
	}
	@Test
	public void validateDepartureTest() {
		Assert.assertTrue(fp.getDepartureDatepicker().isDisplayed());
	}
	@Test
	public void validateReturnTest() {
		Assert.assertTrue(fp.getReturnDatepicker().isDisplayed());
	}
	@Test
	public void validateAdultsMinusTest() {
		Assert.assertTrue(fp.getAdultsMinusBtn().isDisplayed());
	}
	@Test
	public void validateAdultsPlusTest() {
		Assert.assertTrue(fp.getAdultsPlusBtn().isDisplayed());
	}
	@Test
	public void validateChildrenMinusTest() {
		Assert.assertTrue(fp.getChildrenMinusBtn().isDisplayed());
	}
	@Test
	public void validateChildrenPlusTest() {
		Assert.assertTrue(fp.getChildrenPlusBtn().isDisplayed());
	}
	@Test
	public void validateInfantMinusTest() {
		Assert.assertTrue(fp.getInfantMinusBtn().isDisplayed());
	}
	@Test
	public void validateInfantPlusTest() {
		Assert.assertTrue(fp.getInfantPlusBtn().isDisplayed());
	}
	@Test
	public void validateShowMoreOptionsTest() {
		Assert.assertTrue(fp.getShowMoreOptionsBtn().isDisplayed());
	}
	@Test
	public void validatePrefAirlineTest() {
		Assert.assertTrue(fp.getPrefAirline().isDisplayed());
	}
	@Test
	public void validatePrefClassTest() {
		Assert.assertTrue(fp.getPrefClass().isDisplayed());
	}
	@Test
	public void validatePrefRoutingTest() {
		Assert.assertTrue(fp.getPrefRouting().isDisplayed());
	}
	@Test
	public void validateYourRecentSearchesTest() {
		Assert.assertTrue(fp.getYourRecentSearches().isDisplayed());
	}
	@Test
	public void validateSearchBtnTest() {
		Assert.assertTrue(fp.getSearchBtn().isDisplayed());
	}
	@Test
	public void searchOneWayFlightTest() {
		fp.searchOneWayFlight();
		Assert.assertTrue(fp.getAnEl("//div[@id=\"flightSearchResults\"]").isDisplayed());
	}
	@Test
	public void searchRoundTripFlightTest() {
		fp.searchRoundTripFlight();
		Assert.assertTrue(fp.getAnEl("//div[@id=\"flightSearchResults\"]").isDisplayed());
	}
	@Test
	public void searchMultiCityFlightTest() {
		fp.searchMultiCityFlight();
		Assert.assertTrue(fp.getAnEl("//div[@id=\"flightSearchResults\"]").isDisplayed());
	}
	@Test
	public void bookFlightTest() {
		fp.searchOneWayFlight();
		fp.bookFlight();
		Assert.assertTrue(fp.isElDisplayed("//button[@id=\"paymentCTA\"]"));
	}
	
}
