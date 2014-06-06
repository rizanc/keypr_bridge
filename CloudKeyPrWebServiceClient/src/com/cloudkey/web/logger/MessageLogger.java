package com.cloudkey.web.logger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/**
 * This class acts as an application logger. It contains methods for logging information and
 * exception messages on the console.
 * 
 * @author vinayk2
 *
 */
public class MessageLogger extends Logger {

	protected MessageLogger( String name ) {
		 super(name);
	//	 DOMConfigurator.configure("log4j.xml");
	}
	
		
	/**
	 * This method log error message of the application.
	 * 
	 * @param className - Name of the class where logger is used.
	 * @param methodName - Name of the method in which logger is placed.
	 * @param objObject - reference of object having exception details.
	 */
	public static void logError ( @SuppressWarnings("rawtypes") Class className, String methodName, Object objObject ) {
		
		/* Creates an Instance of Logger */
		Logger objLogger = Logger.getLogger( className.getName() );

		/* Checks whether Error logger is enabled or not */
		if ( objLogger.isEnabledFor( Level.ERROR ) ) {
			
			objLogger.error( " :: " + methodName + " :: ", (Throwable) objObject );
		}
		
	}
	
	/**
	 * This method log information of the application.
	 * 
	 * @param className - Name of the class where logger is used.
	 * @param methodName - Name of the method in which logger is placed.
	 * @param message - message to be logged.
	 */
	public static void logInfo( @SuppressWarnings("rawtypes") Class className, String methodName, String message ) {
		
		/* Creates an Instance of Logger */
		Logger objLogger = Logger.getLogger( className.getName() );

		/* Checks whether Info logger is enabled or not */
		if ( objLogger.isInfoEnabled() ) {
			
			objLogger.info( className.getName() + " :: " + methodName + " :: " + message );
		}
		
	}
	
	/**
	 * This method logs debugging information.
	 * 
	 * @param className - Name of the class where logger is used.
	 * @param methodName - Name of the method in which logger is placed.
	 * @param message - message to be logged.
	 */
	public static void logDebug( @SuppressWarnings( "rawtypes" ) Class className, String methodName, String message ) {
		
		/* Creates an Instance of Logger */
		Logger objLogger = Logger.getLogger( className.getName() );

		/* Checks whether Info logger is enabled or not */
		if ( objLogger.isDebugEnabled() ) {
			
			objLogger.debug( className.getName() + " :: " + methodName + " :: " + message );
		}
	}
	
}
