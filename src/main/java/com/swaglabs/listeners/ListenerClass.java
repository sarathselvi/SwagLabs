package com.swaglabs.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.swaglabs.driver.DriverManager;
import com.swaglabs.reports.ExtentReport;
import com.swaglabs.utils.ScreenShotUtil;

public class ListenerClass implements ITestListener {



	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		
		ExtentReport.test.pass(result.getMethod().getMethodName() + " is passed",
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

	}

	public void onTestFailure(ITestResult result) {
		
		ExtentReport.test.fail(result.getMethod().getMethodName() + " is failed",
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());
	}

	public void onTestSkipped(ITestResult result) {


		ExtentReport.test.skip(result.getMethod().getMethodName() + " is skipped",
				MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenShotUtil.getBase64Image()).build());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
