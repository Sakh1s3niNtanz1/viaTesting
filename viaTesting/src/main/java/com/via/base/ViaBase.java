package com.via.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViaBase {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop; 
	public static Actions act;
	public void setUp(String urlType) throws IOException {
		readProperties();
		if(prop.getProperty("browser")=="firefox")
			driver=new FirefoxDriver();
		else if(prop.getProperty("browser")=="ie")
			driver=new InternetExplorerDriver();
		else
			driver=new ChromeDriver();
		
		if(urlType.equalsIgnoreCase("Hotel")) {
			driver.get(prop.getProperty("baseUrl2"));
		}else {
			driver.get(prop.getProperty("baseUrl"));
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='wzrk-cancel']")))).click();
		}catch(Exception e) {
			System.out.println("No pop-up");
		}
	}
	public void readProperties() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("./src/main/java/com/via/config/config.properties");
		prop.load(fis);
	}
	public String getPropertyValue(String key) {
		return prop.getProperty(key);
	}
	public void cleanAndClose() {
		driver.close();
	}
	public boolean checkDisplayEl(WebElement el) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return el.isDisplayed();
	}
	
	public WebElement getEl(String a) {
		return driver.findElement(By.xpath(a));
	}
	
	public void waitForEl(WebElement el) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(el));
	}
	
	public void sendKeysToEl(WebElement el, String keys) {
		el.sendKeys(keys);
	}
	
	public void clickEl(WebElement el) {
		el.click();
	}
	public void waitForSomeSeconds(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void dropAndEnter() {

		act=new Actions(driver);

		act.build();

		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

	}
	public void waitToClickEl(WebElement el) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(el));
	}
	
}
