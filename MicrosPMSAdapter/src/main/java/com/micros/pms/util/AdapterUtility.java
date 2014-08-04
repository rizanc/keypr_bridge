package com.micros.pms.util;

import com.micros.http.connection.HttpClientRequest;
import com.micros.pms.constant.IMicrosConstants;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * This class contains all the utility methods used for creating the request for the PMS Simulator.
 *
 * @author niveditat
 */
public class AdapterUtility {
	private final static Logger log = LoggerFactory.getLogger(AdapterUtility.class);

	/**
	 * This method return the credit card number after masking the first 12 digits.
	 *
	 * @param creditCardNumber
	 * @return
	 */
	public static String getCreditCardNumber(String creditCardNumber) {
		log.debug("getCreditCardNumber", "Enter method");

		StringBuilder strBuilder = new StringBuilder();

		if (creditCardNumber != null) {
			int length = creditCardNumber.length();

			if (length > IMicrosConstants.COUNT_FOUR) {
				creditCardNumber = creditCardNumber.substring(length - IMicrosConstants.COUNT_FOUR);
				strBuilder.append("XXXX-XXXX-XXXX-").append(creditCardNumber);
			} else {
				strBuilder.append("XXXX-XXXX-XXXX-").append(creditCardNumber);
			}
		}

		String result = strBuilder.toString();
		log.debug("getCreditCardNumber", "Return value", result);

		return result;
	}

	/**
	 * This method returns the http response in String format.
	 *
	 * @param objInputStream
	 * @return String
	 * @throws IOException
	 */
	public static String getStringFromResponse(InputStream objInputStream) throws IOException {
		log.debug("getStringFromResponse", "Enter method");

		String response = null;

		StringBuilder strBuilder = new StringBuilder();
		InputStreamReader inStreamReader = new InputStreamReader(objInputStream);

		BufferedReader br = new BufferedReader(inStreamReader);

		while ((response = br.readLine()) != null) {

			strBuilder.append(response);
		}

		String result = strBuilder.toString();
		log.debug("getStringFromResponse", "Return value", result);

		return result;
	}

	/**
	 * This method returns the xml representation of the accepted object.
	 *
	 * @param object
	 * @return
	 */

	public static String convertToXML(Object object) {
		log.debug("convertToXML", "Enter method");

		byte requestArray[] = null;
		String xmlString = null;

		try {

			ByteArrayOutputStream bOutput = new ByteArrayOutputStream();

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(object, bOutput);
			requestArray = bOutput.toByteArray();

		} catch (JAXBException exc) {

			log.error("convertToXML", exc);
		}

		xmlString = new String(requestArray);

		log.debug("convertToXML", "Exit method");

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
	public static Object convertToObject(Object object, String rawXML) {
		log.debug("convertToObject", "Enter method");

		Object objResponse = null;

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(rawXML);

			objResponse = jaxbUnmarshaller.unmarshal(reader);

		} catch (JAXBException exc) {
			log.error("convertToObject", exc);
		}

		log.debug("convertToObject", "Exit convertToObject method");

		return objResponse;
	}


	/**
	 * This method returns date in XMLGregorianCalendar format.
	 *
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate() {

		log.debug("getGregorianDate", "Enter method");

		GregorianCalendar gregorianCalendar = null;
		DatatypeFactory datatypeFactory = null;
		XMLGregorianCalendar now = null;

		try {

			gregorianCalendar = new GregorianCalendar();

			datatypeFactory = DatatypeFactory.newInstance();

		} catch (DatatypeConfigurationException exc) {

			log.error("getGregorianDate", exc);
		}

		now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

		log.debug("getGregorianDate", "Current date" + now);

		log.debug("getGregorianDate", "Exit getGregorianDate method");

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
		objCalendar.setTime(new Date());

		return objCalendar;
	}


	/**
	 * This method is used to convert the object into xml using xstram .
	 *
	 * @param object
	 * @return
	 */
	public static String convertToStreamXML(Object object) {

		log.debug("convertToStreamXML", "Enter convertToStreamXML method");

		String xmlString = null;

		XStream objStream = new XStream(new DomDriver());
		xmlString = objStream.toXML(object);

		log.debug("convertToStreamXML", "Exit convertToStreamXML method");

		return xmlString;

	}


	/**
	 * This method is used to convert the string xml to object using xstream .
	 *
	 * @param xmlRequestValue
	 * @return Object
	 */
	public static Object covertToStreamObject(String xmlRequestValue) {
		log.debug("covertToStreamObject", "Enter covertToStreamObject method");

		XStream objStream = new XStream(new DomDriver());

		log.debug("covertToStreamObject", "Exit covertToStreamObject method");

		return objStream.fromXML(xmlRequestValue);
	}


	/**
	 * @param objCalendar
	 * @return String
	 */

	public static String getDate(Calendar objCalendar) {
		DateFormat df = new SimpleDateFormat(IMicrosConstants.DATE_FORMAT);

		return df.format(objCalendar.getTime());
	}

}
