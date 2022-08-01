package com.swaglabs.constants;

public class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/Executables/chromedriver.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH + "/Configuration/config.properties";
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

}
