package com.micros.pms.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.xml.DOMConfigurator;

import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


/**
 * This class contains all the utility methods used for creating the request for the PMS Simulator.
 * 
 * @author niveditat
 *
 */
public class AdapterUtility {
	
	 static {
		
		DOMConfigurator.configure(System.getProperty("user.dir") + "\\res\\log4j.xml" );
		
		}
	/**
	 * This method return the credit card number after masking the first 12 digits.
	 * 
	 * @param creditCardNumber
	 * @return
	 */
	public static String  getCreditCardNumber( String creditCardNumber ) {
		
		MicrosPMSLogger.logInfo( AdapterUtility.class, " getStrngFromResponse ", " Enter in getCreditCardNumber method " );
		
		StringBuilder strBuilder = new StringBuilder();
		
		if( creditCardNumber != null ) {
			
			int length = creditCardNumber.length();	
			
			if( length > IMicrosConstants.COUNT_FOUR ) {
			
			creditCardNumber =	creditCardNumber.substring( length - IMicrosConstants.COUNT_FOUR );
			strBuilder.append( "XXXX-XXXX-XXXX-" ).append( creditCardNumber );
			
			}
			else {
				
				strBuilder.append( "XXXX-XXXX-XXXX-" ).append( creditCardNumber );	
				
			}
		}
		
		MicrosPMSLogger.logInfo( AdapterUtility.class, " getStrngFromResponse ", " Exit getCreditCardNumber method " );
		
		  return strBuilder.toString();
	  }
	
	/**
	 * This method returns the http response in String format.
	 * 
	 * @param objInputStream
	 * @return String
	 * @throws IOException
	 */
	public static String getStringFromResponse( InputStream objInputStream ) throws IOException {
		
		MicrosPMSLogger.logInfo( AdapterUtility.class," getStrngFromResponse ", " Enter in getStrngFromResponse method ");
		
		String response = null;
		
		StringBuilder strBuilder = new StringBuilder();
		InputStreamReader inStreamReader = new InputStreamReader(objInputStream);

		BufferedReader br = new BufferedReader( inStreamReader );
		
		while ( (response = br.readLine()) != null ) {

			strBuilder.append( response );
		}
	
		MicrosPMSLogger.logInfo( AdapterUtility.class, " getStrngFromResponse ", " Exit getStrngFromResponse method ");
		
		return strBuilder.toString();
	}

	/**
	 * This method returns the xml representation of the accepted object.
	 * 
	 * @param object
	 * @return 
	 */

	public static String convertToXML( Object object ){

		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToXML ", " Enter in convertToXML method " );

		byte requestArray[] = null;
		String xmlString = null;
		
		try {

			ByteArrayOutputStream bOutput = new ByteArrayOutputStream();	  

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

			jaxbMarshaller.marshal( object, bOutput );
			requestArray = bOutput.toByteArray();

		} catch ( JAXBException exc ) {

			MicrosPMSLogger.logError( AdapterUtility.class, " convertToXML ", exc );
		}

		xmlString = new String( requestArray );

		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToXML ", " xml format of object. " + xmlString );
		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToXML ", " Exit convertToXML method " );

		return xmlString;

	}

	/**
	 * This method accept object reference and data in xml format.
	 * It returns object representation of the input data.
	 *  
	 * @param object
	 * @param rawXML
	 * @return Object
	 */
	public static Object covertToObject( Object object, String rawXML ) {

		MicrosPMSLogger.logInfo( AdapterUtility.class," covertToObject ", " Enter in covertToObject method " );
		
		Object	objResponse = null ;

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance( object.getClass() );
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader( rawXML );

			objResponse = jaxbUnmarshaller.unmarshal( reader );

		} catch (JAXBException exc) {
		
			MicrosPMSLogger.logError( AdapterUtility.class , " covertToObject ", exc );
		}

		MicrosPMSLogger.logInfo( AdapterUtility.class , " covertToObject ", " Xml Coverted object " + objResponse );
		MicrosPMSLogger.logInfo( AdapterUtility.class , " covertToObject ", " Exit covertToObject method " );

		return objResponse;
	}


	/**
	 * This method returns date in XMLGregorianCalendar format.
	 * 
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate() {

		MicrosPMSLogger.logInfo( AdapterUtility.class, " getGregorianDate ", " Enter in getGregorianDate method " );
		
		GregorianCalendar gregorianCalendar = null ;
		DatatypeFactory datatypeFactory = null;
		XMLGregorianCalendar now = null;
		
		try {
			
			gregorianCalendar= new GregorianCalendar();
			
			datatypeFactory = DatatypeFactory.newInstance();
			
		} catch ( DatatypeConfigurationException exc ) {
			
			MicrosPMSLogger.logError( AdapterUtility.class , " getGregorianDate ", exc );
		}
		
        now = datatypeFactory.newXMLGregorianCalendar( gregorianCalendar );
        
        MicrosPMSLogger.logInfo( AdapterUtility.class," getGregorianDate ", " Current date " + now );
        
        MicrosPMSLogger.logInfo( AdapterUtility.class," getGregorianDate ", " Exit getGregorianDate method " );
        
		return now.normalize();
	}
	
	/**
	 * This method return the date as Calendar.
	 * 
	 * @return Calendar
	 */
	public static Calendar getCalender() {
		
	/*	Calendar objCalendar = Calendar.getInstance();
		objCalendar.setFirstDayOfWeek(5);
		return objCalendar;*/
		
		Calendar objCalendar = Calendar.getInstance();
		objCalendar.setTime( new Date() );
		
		return objCalendar;
	}


	/**
	 * This method is used to convert the object into xml using xstram . 
	 * 
	 * @param object
	 * @return
	 */
	public static String convertToStreamXML( Object object ) {

		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToStreamXML ", " Enter convertToStreamXML method " );
		
		String xmlString = null;
		
		XStream objStream = new XStream( new DomDriver());
		xmlString = objStream.toXML( object );

		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToStreamXML ", " xml format of object. " + xmlString );
		MicrosPMSLogger.logInfo( AdapterUtility.class, " convertToStreamXML ", " Exit convertToStreamXML method " );

		return xmlString;

	}
	
	
	/**
	 * This method is used to convert the string xml to object using xstream .
	 * 
	 * @param xmlRequestValue
	 * 
	 * @return Object
	 */
	public static Object covertToStramObject( String xmlRequestValue ) {
	
		MicrosPMSLogger.logInfo(AdapterUtility.class, " covertToStramObject ", " Enter covertToStramObject method " );
		
		XStream objStream = new XStream(new DomDriver());	
		
		MicrosPMSLogger.logInfo( AdapterUtility.class, " covertToStramObject ", " Exit covertToStramObject method " );
		
		return objStream.fromXML( xmlRequestValue );
	}
	
	
	/**
	 * 
	 * @param objCalendar
	 * @return String
	 */

	public static String getDate( Calendar objCalendar ) {
		
		DateFormat df = new SimpleDateFormat( IMicrosConstants.DATE_FORMAT );
	
		 return  df.format( objCalendar.getTime() );
	}
	
}
