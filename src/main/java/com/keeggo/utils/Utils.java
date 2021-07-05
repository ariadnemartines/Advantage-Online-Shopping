package com.keeggo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public WebDriver webDriver;

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

	public WebElement findElement( By element )	{
		return getWebDriver().findElement(element);
	}


}
