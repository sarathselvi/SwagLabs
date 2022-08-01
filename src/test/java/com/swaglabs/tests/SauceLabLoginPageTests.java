package com.swaglabs.tests;

import org.testng.annotations.Test;

import com.swaglabs.pages.SauceLabInventoryPage;
import com.swaglabs.pages.SauceLabLoginPage;

public final class SauceLabLoginPageTests extends BaseTest {

	private SauceLabLoginPageTests() {

	}

	@Test
	public void loginTest() {

		// Login Test
		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();
		SauceLabInventoryPage inventoryPageObject = loginPageObject.enterUserName("standard_user")
				.enterPassword("secret_sauce").clickLoginButton();

	}

}
