package com.cloudkey.util;

import java.io.IOException;
import java.util.Properties;

import com.cloudkey.logger.MessageLogger;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author niveditat
 *
 */
public class BaseConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;

	static {

		try {

			prop = new Properties();
			ClassLoader loader = null;
			loader = BaseConfigurationReader.class.getClassLoader();

			if( loader== null ){

				loader = ClassLoader.getSystemClassLoader();
			}

			String popfileName = "res/baseconfiguration.properties";
			java.net.URL url = loader.getResource(popfileName);

			try {

				prop.load(url.openStream());
			}
			catch( IOException exc ){

				MessageLogger.logError( BaseConfigurationReader.class, "static block", exc);
			}
			catch( Exception exc ){

				MessageLogger.logError( BaseConfigurationReader.class, "static block", exc);
			}

		}
		catch( Exception exc ){

			MessageLogger.logError( BaseConfigurationReader.class, "static block", exc);
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
