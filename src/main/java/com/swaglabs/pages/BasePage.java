package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.swaglabs.driver.DriverManager;
import com.swaglabs.enums.WaitStrategy;
import com.swaglabs.factories.ExplicitWaitFactory;

public class BasePage {

	protected void buttonClick(By by, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();

	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);

		element.sendKeys(value);
	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

}
