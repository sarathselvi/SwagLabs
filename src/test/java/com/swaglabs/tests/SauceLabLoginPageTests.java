package com.swaglabs.tests;

import org.testng.annotations.Test;

import com.swaglabs.pages.SauceLabLoginPage;

public final class SauceLabLoginPageTests extends BaseTest {

	private SauceLabLoginPageTests() {

	}

	@Test
	public void loginTest() {
		
		//Login Test
		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();
		loginPageObject.enterUserName("standard_user");
		loginPageObject.enterPassword("secret_sauce");
		loginPageObject.clickLoginButton();

	}

}
