package com.swaglabs.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.swaglabs.driver.DriverManager;
import com.swaglabs.exceptions.FrameworkException;

public class ScreenShotUtil {

	private ScreenShotUtil() {
	}

	public static String getBase64Image() {

		try {
			Thread.sleep(2000);

			return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
		} catch (InterruptedException e) {
			//Thread.currentThread().interrupt();
			throw new FrameworkException("Exception in  ScreenshotUtil Class");

		}
	}
}