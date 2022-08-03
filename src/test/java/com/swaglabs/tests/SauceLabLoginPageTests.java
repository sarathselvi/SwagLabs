package com.swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.pages.SauceLabInventoryPage;
import com.swaglabs.pages.SauceLabLoginPage;
import com.swaglabs.utils.PropertyUtils;

public final class SauceLabLoginPageTests extends BaseTest {

	private SauceLabLoginPageTests() {

	}

	@Test
	public void loginTest() throws Exception {

		// Login Test
		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();

		SauceLabInventoryPage inventoryPageObject = loginPageObject
				.enterUserName(PropertyUtils.getValue(ConfigProperties.USERNAME))
				.enterPassword(PropertyUtils.getValue(ConfigProperties.PASSWORD)).clickLoginButton();

//		Assertions.assertThat(inventoryPageObject.getInventoryPageTitle()).isEqualTo("Swag Labs");
		Assert.assertEquals(inventoryPageObject.getInventoryPageTitle(), "Swag Las");

	}

}
