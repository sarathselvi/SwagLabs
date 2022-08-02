package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;
import com.swaglabs.reports.ExtentReport;

public final class SauceLabLoginPage extends BasePage {

	private final By textboxUsername = By.id("user-name");
	private final By textboxPassword = By.id("password");
	private final By buttonLogin = By.id("login-button");

	public SauceLabLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "UserName");

		return this;
	}

	public SauceLabLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE, "Password");

		return this;

	}

	public SauceLabInventoryPage clickLoginButton() {
		buttonClick(buttonLogin, WaitStrategy.CLICKABLE, "Login Button");

		return new SauceLabInventoryPage();
	}

}
