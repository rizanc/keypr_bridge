package com.cloudkey.constant;

/**
 * This interface declares all the constants to be used in the application.
 * @author niveditat
 *
 */
public interface ICloudKeyConstants {

	String DATABASE_URL= "cloud.dbase.url";
	String DATABASE_USERNAME = "cloud.dbase.username";
	String DATABASE_PASSWORD = "cloud.dbase.password";
	String DATABASE_DRIVER_NAME = "cloud.dbase.driverName";
	String DATABASE_SCHEMA = "cloud.dbase.schema";	
	String PARSER_BEAN = "cloud.parser.bean";	
	
	String EMPTY_STRING = "";
	String RES_SUCCESS = "SUCCESS";
	String RES_FAILURE = "FAILURE";
	
	String RES_STATUS_CODE = "504";
	String RES_MESSAGE = " Time Out Error From Server ";
	
	String SERVER_TIME_OUT = "cloud.server.time.out.counter";
    String SERVER_THREAD_TIME =	"cloud.server.thread.time";
	String SERVER_TIME_OUT_CRITERIA = "The requested resource is not available";
	


}
