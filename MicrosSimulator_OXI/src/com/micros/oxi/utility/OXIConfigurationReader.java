package com.micros.oxi.utility;

import java.io.IOException;
import java.util.Properties;

import com.micros.oxi.logger.MicrosOXILogger;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author niveditat
 *
 */
public class OXIConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;

	static {

		try {

			prop = new Properties();
			ClassLoader loader = null;
			loader = OXIConfigurationReader.class.getClassLoader();

			if( loader== null ){

				loader = ClassLoader.getSystemClassLoader();
			}

			String popfileName = "oxiconfiguration.properties";
			java.net.URL url = loader.getResource(popfileName);

			try {

				prop.load(url.openStream());
			}
			catch( IOException exc ){

				MicrosOXILogger.logError( OXIConfigurationReader.class, "static block", exc);
			}
			catch( Exception exc ){

				MicrosOXILogger.logError( OXIConfigurationReader.class, "static block", exc);
			}

		}
		catch( Exception exc ){

			MicrosOXILogger.logError( OXIConfigurationReader.class, "static block", exc);
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
