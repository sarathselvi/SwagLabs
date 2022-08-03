package com.swaglabs.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.pages.SauceLabInventoryPage;
import com.swaglabs.pages.SauceLabLoginPage;
import com.swaglabs.utils.PropertyUtils;

public class SauceLabInventoryPageTests extends BaseTest {

	private SauceLabInventoryPageTests() {

	}

	@Test
	public void addItemToCartTest() throws Exception {
		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();

		SauceLabInventoryPage inventoryPageObject = loginPageObject
				.enterUserName(PropertyUtils.getValue(ConfigProperties.USERNAME))
				.enterPassword(PropertyUtils.getValue(ConfigProperties.PASSWORD)).clickLoginButton().addProductToCart();
		Assertions.assertThat(inventoryPageObject.getCartValue()).isEqualTo("1");

	}

}
