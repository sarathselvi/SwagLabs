package com.swaglabs.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.pages.SauceLabCheckoutCompletePage;
import com.swaglabs.pages.SauceLabInventoryPage;
import com.swaglabs.pages.SauceLabLoginPage;
import com.swaglabs.utils.PropertyUtils;

public class SauceLabCheckoutCompletePageTests extends BaseTest {

	private SauceLabCheckoutCompletePageTests() {

	}

	@Test
	public void validateOrderSuccessMessage() throws Exception {

		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();

		SauceLabCheckoutCompletePage checkoutComplete = loginPageObject
				.enterUserName(PropertyUtils.getValue(ConfigProperties.USERNAME))
				.enterPassword(PropertyUtils.getValue(ConfigProperties.PASSWORD)).clickLoginButton().addProductToCart()
				.clickCartButton().navigateToCheckoutPage().enterFirstName("Sarath").enterLastName("Kumar")
				.enterPostalCode("12345").clickCheckoutContinue().clickCheckoutFinishButton();

		boolean thankyouMessageisDiplayed = checkoutComplete.thankYouMessageIsDisplayed();
		Assertions.assertThat(thankyouMessageisDiplayed).isTrue();

		String thankyouMessage = checkoutComplete.getThankYouMessage();
		Assertions.assertThat(thankyouMessage).isEqualTo("THANK YOU FOR YOUR ORDER");

	}

}
