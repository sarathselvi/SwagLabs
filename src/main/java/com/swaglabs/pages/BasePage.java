package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.swaglabs.driver.DriverManager;
import com.swaglabs.enums.WaitStrategy;
import com.swaglabs.factories.ExplicitWaitFactory;
import com.swaglabs.reports.ExtentReport;
import com.swaglabs.utils.ScreenShotUtil;

public class BasePage {

	protected void buttonClick(By by, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		ExtentReport.test.pass(elementname + " is Clicked",
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);

		element.sendKeys(value);
		ExtentReport.test.pass(value + " is entered successfully in " + elementname,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

}
