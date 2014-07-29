package com.cloudkey.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author niveditat
 */
public class BaseConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;
	private final static Logger LOGGER = LoggerFactory.getLogger(BaseConfigurationReader.class);

	static {
		try {
			prop = new Properties();

            String popfileName = "base-configuration.properties";
			InputStream propStream = BaseConfigurationReader.class.getClassLoader().getResourceAsStream(popfileName);

			try {
				prop.load(propStream);
			} catch (IOException exc){

				LOGGER.error(BaseConfigurationReader.class + " :: " +"static block" + " :: " +
						exc);

			} catch (Exception exc){
				LOGGER.error(BaseConfigurationReader.class + " :: " +"static block" + " :: " +
						exc);
			}

		} catch (Exception exc){
			LOGGER.error(BaseConfigurationReader.class + " :: " +"static block" + " :: " +
					exc);
		}
	}// end static block

	/**
	 * This method will return the value of key from properties file. 
	 * 
	 * @param propertyKey
	 * @return String
	 */
	public static String getProperty( String propertyKey) {

		return prop.getProperty(propertyKey);

	}

}
