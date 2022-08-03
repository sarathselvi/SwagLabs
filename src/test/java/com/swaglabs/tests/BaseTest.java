package com.swaglabs.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.swaglabs.driver.Driver;
import com.swaglabs.driver.DriverManager;
import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.pages.BasePage;
import com.swaglabs.reports.ExtentReport;
import com.swaglabs.utils.PropertyUtils;

public class BaseTest extends BasePage {

	protected BaseTest() {

	}

	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReports();
	}

	@AfterSuite
	public void afterSuite() throws IOException {

		ExtentReport.flushReports();

	}

	@BeforeMethod
	protected void setUp() throws Exception {
		Driver.initDriver(PropertyUtils.getValue(ConfigProperties.BROWSER));
		maximizeWindow();

	}

	@AfterMethod
	protected void tearDown() {
		// Driver.quitDriver();
	}

}
