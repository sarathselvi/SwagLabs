package com.swaglabs.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.swaglabs.constants.FrameworkConstants;
import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.utils.PropertyUtils;

public final class Driver {
	private Driver() {

	}

	public static void initDriver(String browser) throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
				DriverManager.setDriver(new ChromeDriver());
				DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", FrameworkConstants.getFirefoxdriverpath());
				DriverManager.setDriver(new FirefoxDriver());
				DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));

			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", FrameworkConstants.getMsedgedriverpath());
				DriverManager.setDriver(new EdgeDriver());
				DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));

			} else if (browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", FrameworkConstants.getIedriverpath());
				DriverManager.setDriver(new InternetExplorerDriver());
				DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));

			} else if (browser.equalsIgnoreCase("safari")) {

				DriverManager.setDriver(new SafariDriver());
				DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
			}
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
