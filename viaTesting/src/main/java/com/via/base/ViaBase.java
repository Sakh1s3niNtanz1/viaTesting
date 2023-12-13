package com.via.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViaBase {
	public static WebDriver driver;
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://in.via.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='wzrk-cancel']")))).click();
	}
	
	public void cleanAndClose() {
		driver.close();
	}
	
}
