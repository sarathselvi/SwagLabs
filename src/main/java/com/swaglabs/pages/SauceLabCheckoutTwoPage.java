package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;

public class SauceLabCheckoutTwoPage extends BasePage {

	private final By checkoutFinishButton = By.id("finish");

	public SauceLabCheckoutCompletePage clickCheckoutFinishButton() {
		buttonClick(checkoutFinishButton, WaitStrategy.CLICKABLE, "Checkout Finish Button");
		return new SauceLabCheckoutCompletePage();

	}

}
