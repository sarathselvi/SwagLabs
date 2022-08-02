package com.swaglabs.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.swaglabs.driver.DriverManager;

public class ScreenShotUtil {

	private ScreenShotUtil() {
	}

	public static String getBase64Image() {

		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);

	}
}