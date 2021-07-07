package com.keeggo.core;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

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
		if (evidences == null) {
			evidences = new ArrayList<byte[]>();
		}
		byte[] scrFile = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
		evidences.add(scrFile);
	}

	public static ArrayList<byte[]> getEvidences() {
		return evidences;
	}

	@SuppressWarnings("rawtypes")
	public void swipeDown() {
		int x = getWebDriver().manage().window().getSize().width / 2;
		int y = getWebDriver().manage().window().getSize().height * 4 / 5;
		int moveY = getWebDriver().manage().window().getSize().height / 8;
		new TouchAction((AndroidDriver) getWebDriver()).longPress(PointOption.point(x, y))
				.moveTo(PointOption.point(x, moveY)).release().perform();
	}
}
