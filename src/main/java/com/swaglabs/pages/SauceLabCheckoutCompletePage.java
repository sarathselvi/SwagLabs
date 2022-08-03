package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;

public class SauceLabCheckoutCompletePage extends BasePage {

	private static By thankyouMessage = By.xpath("//div[@id='checkout_complete_container']//h2");

	public String getThankYouMessage() {
		scrollUp();

		return getElementText(thankyouMessage, WaitStrategy.PRESENCE, "Thank You Message");

	}

	public boolean thankYouMessageIsDisplayed() {
		scrollUp();

		return elementIsDisplayed(thankyouMessage, WaitStrategy.PRESENCE, "Thank You Message");
	}

}
