package com.cloudkey.upload.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.cloudkey.upload.logger.UploadServiceLogger;


/**
 * This class is used to read the value of key from the properties file.
 * It method accepts the key name returns the corresponding value from properties file.
 * 
 * @author vinayk2
 *
 */
public class UploadConfigurationReader {

	/* Reference variable to store properties. */
	private static Properties prop =  null;

	static {

		try {

			prop = new Properties();
			InputStream input = null;

			String popfileName = "res/uploadconfig.properties";

			try {

				input = new FileInputStream(popfileName);
				prop.load(input);

			}
			catch( IOException exc ){

				UploadServiceLogger.logError( UploadConfigurationReader.class, "static block", exc );
			}
			catch( Exception exc ){

				UploadServiceLogger.logError( UploadConfigurationReader.class, "static block", exc);
			}

		}
		catch( Exception exc ){

			UploadServiceLogger.logError( UploadConfigurationReader.class, "static block", exc);
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
