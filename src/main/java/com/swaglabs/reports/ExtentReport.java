package com.swaglabs.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.swaglabs.constants.FrameworkConstants;

public final class ExtentReport {

	private ExtentReport() {

	}

	private static ExtentReports extent;
	public static ExtentTest test;

	public static void initReports() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportpath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Swag Labs");
			spark.config().setReportName("Saucedemo Website");
		}
	}

	public static void flushReports() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());

	}

	public static void createTest(String testcasename) {

		test = extent.createTest(testcasename);
	}
}
