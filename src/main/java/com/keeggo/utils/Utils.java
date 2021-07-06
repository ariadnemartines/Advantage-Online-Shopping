package com.keeggo.utils;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public WebDriver webDriver;

	public static ArrayList<byte[]> evidences;
	
	public Utils(WebDriver driver) {
		webDriver = driver;
		
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void click(By element) {
		getWebDriver().findElement(element).click();
	}

	public void insertText(By element, String text) {
		getWebDriver().findElement(element).sendKeys(text);
	}

	public void waitElement(By element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public String getText(By element) {
		return getWebDriver().findElement(element).getText();
	}

	public WebElement findElement(By element) {
		return getWebDriver().findElement(element);
	}
	
	public void takeScreenShot() {
		if(evidences == null) {
			evidences = new ArrayList<byte[]>();
		}
		byte[] scrFile = ((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.BYTES);
		evidences.add(scrFile);
	}
	
	public static ArrayList<byte[]> getEvidences(){
		return evidences;
	}
	
}
