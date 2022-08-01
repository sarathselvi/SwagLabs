package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.driver.DriverManager;

public final class SauceLabLoginPage {

	private final By textboxUsername = By.id("user-name");
	private final By textboxPassword = By.id("password");
	private final By buttonLogin = By.id("login-button");

	public void enterUserName(String username) {
		DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
	}

	public void enterPassword(String password) {
		DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
	}

	public void clickLoginButton() {
		DriverManager.getDriver().findElement(buttonLogin).click();
	}

}
