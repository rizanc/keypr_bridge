package com.micros.harvester.util;


import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.micros.harvester.logger.DataHarvesterLogger;




/**
 * This class stores the methods used in whole applications.
 * 
 * @author vinayk2
 *
 */
public class OWSUtility {

	/**
	 * This method returns xml representation of request object.
	 * 
	 * @param object
	 * @return 
	 */

	public static String convertToXML(Object object){

		DataHarvesterLogger.logInfo( OWSUtility.class," convertToXML ", " Enter in convertToXML method. ");

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

			DataHarvesterLogger.logError( OWSUtility.class , "convertToXML", exc);
		}

		xmlStr = new String(requestArray);

		DataHarvesterLogger.logInfo( OWSUtility.class," convertToXML ", " xml format of object. " + xmlStr );
		DataHarvesterLogger.logInfo( OWSUtility.class," convertToXML ", " Exit convertToXML method. ");

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

		DataHarvesterLogger.logInfo( OWSUtility.class," covertToObject ", " Enter in covertToObject method. ");
		Object	objResponse = null ;

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);

			objResponse = jaxbUnmarshaller.unmarshal(reader);

		} catch (JAXBException exc) {

			DataHarvesterLogger.logError( OWSUtility.class , " covertToObject ", exc);
		}

		DataHarvesterLogger.logInfo( OWSUtility.class , " covertToObject ", " Xml Coverted object. " + objResponse );
		DataHarvesterLogger.logInfo( OWSUtility.class , " covertToObject ", " Exit covertToObject method. ");

		return objResponse;
	}


	/**
	 * This method is used to get the date in XMLGregorianCalendar format.
	 * 
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate(){

		DataHarvesterLogger.logInfo( OWSUtility.class," getGregorianDate ", " Enter in getGregorianDate method. ");

		GregorianCalendar gregorianCalendar = null ;
		DatatypeFactory datatypeFactory = null;
		XMLGregorianCalendar now = null;
		try {

			gregorianCalendar= new GregorianCalendar();
			datatypeFactory = DatatypeFactory.newInstance();

		} catch (DatatypeConfigurationException exc) {

			DataHarvesterLogger.logError( OWSUtility.class , " getGregorianDate ", exc);
		}

		now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

		DataHarvesterLogger.logInfo( OWSUtility.class," getGregorianDate ", " Current date . " + now);
		DataHarvesterLogger.logInfo( OWSUtility.class," getGregorianDate ", " Exit getGregorianDate method. ");

		return now;
	}

}
