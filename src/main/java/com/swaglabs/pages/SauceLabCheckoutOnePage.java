package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;

public class SauceLabCheckoutOnePage extends BasePage {

	private final By firstName = By.id("first-name");
	private final By lastName = By.id("last-name");
	private final By postalCode = By.id("postal-code");
	private final By checkoutContinue = By.id("continue");

	public SauceLabCheckoutOnePage enterFirstName(String firstNameValue) {
		sendKeys(firstName, firstNameValue, WaitStrategy.PRESENCE, "First Name");
		return this;

	}

	public SauceLabCheckoutOnePage enterLastName(String lastNameValue) {
		sendKeys(lastName, lastNameValue, WaitStrategy.PRESENCE, "Last Name");
		return this;

	}

	public SauceLabCheckoutOnePage enterPostalCode(String postalCodeValue) {
		sendKeys(postalCode, postalCodeValue, WaitStrategy.PRESENCE, "Postal Code");
		return this;

	}

	public SauceLabCheckoutTwoPage clickCheckoutContinue() {
		buttonClick(checkoutContinue, WaitStrategy.CLICKABLE, "Checkout Continue");
		return new SauceLabCheckoutTwoPage();

	}

}
