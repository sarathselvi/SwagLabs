package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;

public class SauceLabCartPage extends BasePage {

	private final By checkoutButton = By.id("checkout");

	public SauceLabCheckoutOnePage navigateToCheckoutPage() {
		buttonClick(checkoutButton, WaitStrategy.PRESENCE, "Checkout Page");

		return new SauceLabCheckoutOnePage();

	}

}
