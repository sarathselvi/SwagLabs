package com.swaglabs.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.swaglabs.constants.FrameworkConstants;

public class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<String, String>();

	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);

			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

	public static String getValue(String key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Property name " + key + " is not found. Please check config.properties");

		}

		return CONFIGMAP.get(key);
	}

}
