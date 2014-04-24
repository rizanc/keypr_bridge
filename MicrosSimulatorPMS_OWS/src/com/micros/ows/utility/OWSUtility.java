package com.micros.ows.utility;


import java.io.ByteArrayOutputStream;
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

import com.micros.ows.logger.OWSMessageLogger;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;




/**
 * This class stores the methods used in whole applications.
 * 
 * @author niveditat
 *
 */
public class OWSUtility {

	@SuppressWarnings({ "rawtypes" })
	private static Class tag = "Utility".getClass();

	

	/**
	 * To get the credit card number .
	 * 
	 * @param creditCardNumber
	 * @return
	 */
	public static String  getCreditCardNumber( String creditCardNumber ){
		
		OWSMessageLogger.logInfo(OWSUtility.class," getStrngFromResponse ", " Enter in getCreditCardNumber method. ");
		
		StringBuilder sb = new StringBuilder();
		
		if( creditCardNumber != null && creditCardNumber.length() >= 1){
			
			int length = creditCardNumber.length();	
			
			if(length > 4) {
			
			creditCardNumber =	creditCardNumber.substring( length - 4  );
			sb.append( "XXXX-XXXX-XXXX-" ).append( creditCardNumber );
			
			}
			else {
				
				sb.append( "XXXX-XXXX-XXXX-" ).append( creditCardNumber );	
				
			}
		}
		
		OWSMessageLogger.logInfo(OWSUtility.class," getStrngFromResponse ", " Enter in getCreditCardNumber method. ");
		  return sb.toString();
	  }
	
	
	
	
	/**
	 * This method returns xml representation of request object.
	 * 
	 * @param object
	 * @return 
	 */

	public static String convertToXML(Object object){

		OWSMessageLogger.logInfo(tag," convertToXML ", " Enter in convertToXML method. ");

		byte requestArray[] = null;
		String xmlStr = null;
		try {

			ByteArrayOutputStream bOutput = new ByteArrayOutputStream();	  

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(object, bOutput);
			requestArray = bOutput.toByteArray();

		} catch ( JAXBException exc ) {

			OWSMessageLogger.logError(tag , "convertToXML", exc);
		}

		xmlStr = new String(requestArray);

		OWSMessageLogger.logInfo(tag," convertToXML ", " xml format of object. " + xmlStr );
		OWSMessageLogger.logInfo(tag," convertToXML ", " Exit convertToXML method. ");

		return xmlStr;

	}


	/**
	 * This method returns object representation of request object.
	 *  
	 * @param object
	 * @param xml
	 * @return Object
	 */
	public static Object covertToObject(Object object , String xml){

		OWSMessageLogger.logInfo(tag," covertToObject ", " Enter in covertToObject method. ");
		Object	objResponse = null ;

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);

			objResponse = jaxbUnmarshaller.unmarshal(reader);

		} catch (JAXBException exc) {

			OWSMessageLogger.logError(tag , " covertToObject ", exc);
		}

		OWSMessageLogger.logInfo(tag , " covertToObject ", " Xml Coverted object. " + objResponse );
		OWSMessageLogger.logInfo(tag , " covertToObject ", " Exit covertToObject method. ");

		return objResponse;
	}


	/**
	 * This method is used to get the date in XMLGregorianCalendar format.
	 * 
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate(){

		OWSMessageLogger.logInfo(tag," getGregorianDate ", " Enter in getGregorianDate method. ");
		
		GregorianCalendar gregorianCalendar = null ;
		DatatypeFactory datatypeFactory = null;
		XMLGregorianCalendar now = null;
		try {
			
			gregorianCalendar= new GregorianCalendar();
			datatypeFactory = DatatypeFactory.newInstance();
			
		} catch (DatatypeConfigurationException exc) {
			
			OWSMessageLogger.logError(tag , " getGregorianDate ", exc);
		}
		
        now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

        OWSMessageLogger.logInfo(tag," getGregorianDate ", " Current date . " + now);
        OWSMessageLogger.logInfo(tag," getGregorianDate ", " Exit getGregorianDate method. ");
        
		return now.normalize();
	}
	
	
	/**
	 * This method is used to convert the string xml to object using xstream .
	 * 
	 * @param xmlRequestValue
	 * 
	 * @return Object
	 */
	public static Object covertToStramObject( String xmlRequestValue ){
	
		OWSMessageLogger.logInfo(OWSUtility.class, " covertToStramObject ", " Enter covertToStramObject method " );
		
		XStream objStream = new XStream(new DomDriver());
		
		OWSMessageLogger.logInfo( OWSUtility.class, " covertToStramObject ", " Exit covertToStramObject method " );
		
		return objStream.fromXML( xmlRequestValue );
	}

	/**
	 * This method return the date as Calendar.
	 * 
	 * @return Calendar
	 */
	public static Calendar getCalender(){
		
		Calendar objCalendar = Calendar.getInstance();
		objCalendar.setTime(new Date());
		
		return objCalendar;
	}


	/**
	 * This method is used to convert the object into xml using xstram . 
	 * 
	 * @param object
	 * @return
	 */
	public static String convertToStreamXML(Object object){

		OWSMessageLogger.logInfo(OWSUtility.class, " convertToStreamXML ", " Enter convertToStreamXML method " );
		
		String xmlString = null;
		XStream objStream = new XStream( new DomDriver());
		xmlString = objStream.toXML(object);

		OWSMessageLogger.logInfo( OWSUtility.class, " convertToStreamXML ", " xml format of object. " + xmlString );
		OWSMessageLogger.logInfo( OWSUtility.class, " convertToStreamXML ", " Exit convertToStreamXML method " );

		return xmlString;

	}
	
	
	/**
	 * 
	 * @param objCalendar
	 * @return String
	 */

	public static String getDate( Calendar objCalendar) {
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy ");
	
		 return  df.format(objCalendar.getTime());
	}

	
}