package com.swaglabs.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.swaglabs.reports.ExtentReport;

public class ListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		ExtentReport.test.pass(result.getMethod().getMethodName() + " is passed");

	}

	public void onTestFailure(ITestResult result) {
		ExtentReport.test.pass(result.getMethod().getMethodName() + " is failed");
	}

	public void onTestSkipped(ITestResult result) {

		ExtentReport.test.skip(result.getMethod().getMethodName() + " is skipped");

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
