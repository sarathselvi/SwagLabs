package com.swaglabs.tests;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swaglabs.utils.ExcelReadProperty;

public class SauceLabCartPageTests {

	private SauceLabCartPageTests() {

	}


	@Test(dataProvider = "customerData")
	public void validateOrderSuccessMessage(Map<String, String> dataMap) throws Exception {

		System.out.println(dataMap.get("firstname"));}
	

}
