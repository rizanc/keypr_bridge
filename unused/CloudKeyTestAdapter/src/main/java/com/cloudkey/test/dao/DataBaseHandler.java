package com.cloudkey.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.test.util.AdapterConfigurationReader;

/**
 * This class has methods for performing generic database related operations.
 * @author vinayk2
 *
 */
public class DataBaseHandler {

	@SuppressWarnings("rawtypes")
	private static Class tag = "DataBaseHandler".getClass();

	/**
	 * This method reads the database configurations from properties file.
	 * It connects with database and returns connection .
	 * 
	 * @return  connection
	 */
	public static Connection getConnection() {

		MessageLogger.logInfo( tag, "getConnection", "Enter getConnection method" );

		/* Reference variables to store connection related operation data. */
		Connection conn = null;
		String userName = null;
		String passWord = null;
		String dbUrl = null;
		String dbName = null;
		String dbDriverName = null;

		try {

			userName = AdapterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_USERNAME );
			passWord = AdapterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_PASSWORD );
			dbUrl = AdapterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_URL  );

			dbName = AdapterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_SCHEMA  );
			dbDriverName = AdapterConfigurationReader.getProperty( ICloudKeyConstants.DATABASE_DRIVER_NAME );

			Class.forName(dbDriverName).newInstance();

			conn = DriverManager.getConnection( dbUrl + dbName, userName, passWord );

			MessageLogger.logInfo( tag, "getConnection", "DataBase connection created" );

		}
		catch( Exception exc ) {

			MessageLogger.logError(tag, "getConnection", exc);
		}

		MessageLogger.logInfo( tag, "getConnection", "Exit  getConnection method" );

		return  conn;

	}
}
