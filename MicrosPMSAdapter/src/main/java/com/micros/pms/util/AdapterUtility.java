package com.micros.pms.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		log.debug("getCreditCardNumber: Enter method");

		StringBuilder strBuilder = new StringBuilder();

		if (creditCardNumber != null) {
			int length = creditCardNumber.length();

			if (length > 4) {
				creditCardNumber = creditCardNumber.substring(length - 4);
				strBuilder.append("XXXX-XXXX-XXXX-").append(creditCardNumber);
			} else {
				strBuilder.append("XXXX-XXXX-XXXX-").append(creditCardNumber);
			}
		}

		String result = strBuilder.toString();
		log.debug("getCreditCardNumber: Return value", result);

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
		log.debug("getStringFromResponse: Enter method");

		String response = null;

		StringBuilder strBuilder = new StringBuilder();
		InputStreamReader inStreamReader = new InputStreamReader(objInputStream);

		BufferedReader br = new BufferedReader(inStreamReader);

		while ((response = br.readLine()) != null) {

			strBuilder.append(response);
		}

		String result = strBuilder.toString();
		log.debug("getStringFromResponse: Return value", result);

		return result;
	}


	/**
	 * This method returns date in XMLGregorianCalendar format.
	 *
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate() {

		log.debug("getGregorianDate: Enter method");

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

		log.debug("getGregorianDate: Current date: {}", now);

		log.debug("getGregorianDate: Exit getGregorianDate method");

		return now.normalize();
	}


	/**
	 * @param objCalendar
	 * @return String
	 */

	public static String getDate(Calendar objCalendar) {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");

		return df.format(objCalendar.getTime());
	}

	/**
	 *
	 * @param date
	 * @return
	 */
	public static String getDate(Date date) {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");

		return df.format(date);
	}

}
