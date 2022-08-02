package com.swaglabs.constants;

public class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/Configuration/config.properties";
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir")
			+ "/extent-test-output/swagLabsExtentReport.html";

	private static final int EXPLICITWAIT = 10;
	private static final String TESTDATA_SHEET_PATH = RESOURCEPATH + "";

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getTestdataSheetPath() {
		return TESTDATA_SHEET_PATH;
	}

	public static String getExtentreportpath() {

		return EXTENTREPORTPATH;
	}

}
