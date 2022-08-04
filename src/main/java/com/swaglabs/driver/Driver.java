package com.swaglabs.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.utils.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {

	}

	public static void initDriver(String browser) {

		if (Objects.isNull(DriverManager.getDriver())) {

			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();

				DriverManager.setDriver(new ChromeDriver());

			} else if (browser.equalsIgnoreCase("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				DriverManager.setDriver(new FirefoxDriver());

			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver();
				DriverManager.setDriver(new EdgeDriver());

			} else if (browser.equalsIgnoreCase("internetexplorer")) {
				WebDriverManager.iedriver().setup();
				DriverManager.setDriver(new InternetExplorerDriver());

			} else if (browser.equalsIgnoreCase("safari")) {
				WebDriverManager.safaridriver().setup();

				DriverManager.setDriver(new SafariDriver());

			}
		}
		DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
