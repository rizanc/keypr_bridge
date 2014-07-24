package com.micros.harvester.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.micros.harvester.logger.DataHarvesterLogger;

/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author vinayk2
 *
 */
public class HarvesterConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;

	static {

		try {

			prop = new Properties();
            InputStream propFile = HarvesterConfigurationReader.class.getClassLoader().getResourceAsStream("dataharvester-configuration.properties");

            try {
				prop.load(propFile);
			}
			catch( IOException exc ){

				DataHarvesterLogger.logError( HarvesterConfigurationReader.class, "static block", exc );
			}
			catch( Exception exc ){

				DataHarvesterLogger.logError( HarvesterConfigurationReader.class, "static block", exc);
			}

		}
		catch( Exception exc ){

			DataHarvesterLogger.logError( HarvesterConfigurationReader.class, "static block", exc);
		}
	}// end static block


	/**
	 * This method will return the value of key from properties file. 
	 * 
	 * @param propertyKey
	 * @return String
	 */
	public static String getProperty( String propertyKey) {

		return prop.getProperty( propertyKey );
	}

}
