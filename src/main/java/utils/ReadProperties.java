package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.tools.ant.property.GetProperty;

public class ReadProperties {

	public String getProperty(String key) {
		String value = null;

		Properties prop = loadProperties("testRun.properties");
		value = prop.getProperty(key);

		if (value == null) {
			String testEnv = prop.getProperty("testEnv");
			prop = loadProperties(testEnv + ".properties");

			if (prop == null) {
				prop = loadProperties("qa.properties");

			}

			if (prop != null) {
				value = prop.getProperty(key);
			}
		}

		return value;

	}

	// load content of properties file

	private Properties loadProperties(String propertyFileName) {
		Properties property = null;

		try {

			File file = new File("./src/main/resources/properties/" + propertyFileName);
			FileInputStream fileStrem = new FileInputStream(file);

			Properties prop = new Properties();

			prop.load(fileStrem);
			property = prop;

		} catch (Exception e) {
			e.printStackTrace();

		}

		return property;
	}

}
