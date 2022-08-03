package com.swaglabs.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swaglabs.enums.ConfigProperties;
import com.swaglabs.pages.SauceLabCheckoutCompletePage;
import com.swaglabs.pages.SauceLabLoginPage;
import com.swaglabs.utils.ExcelReadProperty;
import com.swaglabs.utils.PropertyUtils;

public class SauceLabCheckoutCompletePageTests extends BaseTest {

	private SauceLabCheckoutCompletePageTests() {

	}

	@DataProvider
	public Object[] customerData() {
		return ExcelReadProperty.getTestData("customerdata");

	}

	@Test(dataProvider = "customerData")
	public void validateOrderSuccessMessage(Map<String, String> dataMap) throws Exception {


		SauceLabLoginPage loginPageObject = new SauceLabLoginPage();

		SauceLabCheckoutCompletePage checkoutComplete = loginPageObject
				.enterUserName(PropertyUtils.getValue(ConfigProperties.USERNAME))
				.enterPassword(PropertyUtils.getValue(ConfigProperties.PASSWORD)).clickLoginButton().addProductToCart()
				.clickCartButton().navigateToCheckoutPage().enterFirstName(dataMap.get("firstname"))
				.enterLastName(dataMap.get("lastname")).enterPostalCode(dataMap.get("postalcode"))
				.clickCheckoutContinue().clickCheckoutFinishButton();

		boolean thankyouMessageisDiplayed = checkoutComplete.thankYouMessageIsDisplayed();
		Assertions.assertThat(thankyouMessageisDiplayed).isTrue();

		String thankyouMessage = checkoutComplete.getThankYouMessage();
		Assertions.assertThat(thankyouMessage).isEqualTo("THANK YOU FOR YOUR ORDER");

	}

}
