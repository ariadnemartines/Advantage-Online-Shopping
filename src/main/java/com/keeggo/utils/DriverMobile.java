package com.keeggo.utils; 

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DriverMobile {

	private static WebDriver driver;
	
	@SuppressWarnings("rawtypes")
	public static void configAndroidDriverObject() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String server = "127.0.0.1";
		String port = "4723";

		try {
			capabilities.setCapability("ignoreHiddenApiPolicyError", true);
			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("android:exported", true);
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("fullReset", false);
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

			String url = String.format("http://%s:%s/wd/hub", server, port);

			driver = new AndroidDriver(new URL(url), capabilities);

		} catch (Exception e) {
			throw new Exception("Falha ao iniciar o Driver");
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void close() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}