package com.swaglabs.pages;

import org.openqa.selenium.By;

import com.swaglabs.enums.WaitStrategy;

public class SauceLabInventoryPage extends BasePage {

	private final By productAddToCart = By
			.xpath("//*[contains(text(),'Sauce Labs Backpack')]//parent::a//parent::div//parent::div//div[2]//button");

	private final By cartValue = By.xpath("//div[@id='shopping_cart_container']//a//span");
	private final By cartButton = By.xpath("//div[@id='shopping_cart_container']//a");
	

	public String getInventoryPageTitle() {

		return getPageTitle();

	}

	public String getInventoryPageURL() {
		return getPageURL();
	}

	public SauceLabInventoryPage addProductToCart() {

		buttonClick(productAddToCart, WaitStrategy.PRESENCE, "Add to Cart");
		return this;

	}

	public String getCartValue() {
		return getElementText(cartValue, WaitStrategy.PRESENCE, "Cart Value");

	}
	
	public SauceLabCartPage clickCartButton() {
		buttonClick(cartButton, WaitStrategy.CLICKABLE, "Cart Button");
		return new SauceLabCartPage(); }



}
