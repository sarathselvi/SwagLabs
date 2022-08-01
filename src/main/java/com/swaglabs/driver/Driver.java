package com.swaglabs.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swaglabs.constants.FrameworkConstants;
import com.swaglabs.utils.ReadPropertyFile;

public final class Driver {
	private Driver() {

	}

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
