package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	protected void sendKeys(By textboxUsername, String value, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, textboxUsername);

		element.sendKeys(value);
		ExtentReport.test.pass(value + " is entered successfully in " + elementname,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

	protected void maximizeWindow() {

		DriverManager.getDriver().manage().window().maximize();

	}

	protected String getPageURL() {
		return DriverManager.getDriver().getCurrentUrl();
	}

	protected String getElementText(By by, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		String elementText = element.getText();
		ExtentReport.test.pass(elementText + " is found in " + elementname,
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());
		return elementText;

	}

	protected boolean elementIsDisplayed(By by, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		boolean elementStatus = element.isDisplayed();
		if (elementStatus) {
			ExtentReport.test.pass(elementname + " is Displayed",
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());
		} else {
			ExtentReport.test.pass(elementname + " is NOT Displayed",
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

		}

		return elementStatus;

	}

	protected void scrollUp() {
		Actions action = new Actions(DriverManager.getDriver());
		action.sendKeys(Keys.PAGE_UP).build().perform();

	}

}
