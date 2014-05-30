package com.micros.pms.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author vinayk2
 *
 */
public class ParserConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;
	
	private final static Logger LOGGER = Logger.getLogger(ParserConfigurationReader.class); 
	static {

		try {

			prop = new Properties();
			ClassLoader loader = null;
			loader = ParserConfigurationReader.class.getClassLoader();

			if( loader== null ){

				loader = ClassLoader.getSystemClassLoader();
			}

			String popfileName = "res/configuration.properties";
			java.net.URL url = loader.getResource(popfileName);

			try {

				prop.load(url.openStream());
			}
			catch( IOException exc ) {

				LOGGER.error(ParserConfigurationReader.class + " :: " +"static block" + " :: " + exc);

			}
			catch( Exception exc ) {

				LOGGER.error(ParserConfigurationReader.class + " :: " +"static block" + " :: " + exc);
			}

		}
		catch( Exception exc ) {

			LOGGER.error(ParserConfigurationReader.class + " :: " +"static block" + " :: " +
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
