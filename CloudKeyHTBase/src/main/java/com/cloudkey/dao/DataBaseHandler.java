package com.cloudkey.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.util.BaseConfigurationReader;

/**
 * This class return the connection object.
 * 
 * @author niveditat
 *
 */
public class DataBaseHandler {

	private final static Logger LOGGER = Logger.getLogger(DataBaseHandler.class); 

	static {

		DOMConfigurator.configure("res/log4j.xml");
	}


	/**
	 * This method reads the database configurations from properties file.
	 * It connects with database and returns connection .
	 * 
	 * @return  connection
	 */
	public static Connection getConnection() {

		LOGGER.info(DataBaseHandler.class + " :: " +"getConnection" + " :: " +
				"Enter getConnection method");



		/* Reference variables to store connection related operation data. */
		Connection conn = null;
		String userName = null;
		String passWord = null;
		String dbUrl = null;
		String dbName = null;
		String dbDriverName = null;

		try {

			userName = BaseConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_USERNAME );
			passWord = BaseConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_PASSWORD );
			dbUrl = BaseConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_URL  );		
			dbName = BaseConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_SCHEMA  );
			dbDriverName = BaseConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_DRIVER_NAME );

			Class.forName(dbDriverName).newInstance();

			conn = DriverManager.getConnection( dbUrl + dbName, userName, passWord );


			LOGGER.info(DataBaseHandler.class + " :: " +"getConnection" + " :: " + "DataBase connection created");


		}
		catch( Exception exc ) {

			LOGGER.error(DataBaseHandler.class + " :: " +"getConnection" + " :: " +exc);	

		}

		LOGGER.info(DataBaseHandler.class + " :: " +"getConnection" + " :: " + "Exit  getConnection method");

		return  conn;

	}

}
