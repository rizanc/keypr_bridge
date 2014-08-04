package com.micros.pms.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 *
 * @author vinayk2
 */
public class ParserConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop = null;

	private final static Logger log = LoggerFactory.getLogger(ParserConfigurationReader.class);

	static {
		prop = new Properties();
		ClassLoader loader = ParserConfigurationReader.class.getClassLoader();
		String popfileName = "com/micros/pms/util/pms-adapter-configuration.properties";
		InputStream propFile = loader.getResourceAsStream(popfileName);

		try {
			prop.load(propFile);
		} catch (IOException e) {
			log.error("Could not load property file", propFile, e);
		}
	}

	/**
	 * This method will return the value of key from properties file.
	 *
	 * @param propertyKey
	 * @return String
	 */
	public static String getProperty(String propertyKey) {
		return prop.getProperty(propertyKey);
	}

}
