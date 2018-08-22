package com.selenium.test.selenuim_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BasicCommandsForBrowsers {

WebDriverConfig driver = new WebDriverConfig();
WebDriver chrome = driver.getChrome();

@Test

//Implicit wait
public void basicCommandTest() {
	chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	chrome.get("https://google.com");
	chrome.findElement(By.name("q")).sendKeys("QA Automation Class");
//Explicit wait
WebDriverWait wait = new WebDriverWait(chrome,15);
wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
}
@AfterTest
public void closeTest() {
	chrome.quit();
}
	}
