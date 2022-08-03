package com.swaglabs.constants;

public class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String FIREFOXDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String MSEDGEDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String IEDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/Configuration/config.properties";
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")
			+ "/extent-test-output/swagLabsExtentReport.html";
	private static final String TESTDATASHEETPATH = RESOURCEPATH + "/TestData/SwagLabsTestDat.xlsx";

	private static final int EXPLICITWAIT = 10;

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getExtentreportpath() {

		return EXTENTREPORTPATH;
	}

	public static String getFirefoxdriverpath() {
		return FIREFOXDRIVERPATH;
	}

	public static String getMsedgedriverpath() {
		return MSEDGEDRIVERPATH;
	}

	public static String getIedriverpath() {
		return IEDRIVERPATH;
	}

	public static String getTestdatasheetpath() {
		return TESTDATASHEETPATH;
	}

}
