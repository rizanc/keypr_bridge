package com.micros.harvester.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * This class stores the methods used in whole applications.
 *
 * @author vinayk2
 */
public class DataUtility {
	protected static final Logger log = LoggerFactory.getLogger(DataUtility.class);

	/**
	 * This method is used to get the date in XMLGregorianCalendar format.
	 *
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar getGregorianDate() {
		log.debug(" getGregorianDate ", " Enter in getGregorianDate method. ");

		GregorianCalendar gregorianCalendar = null;
		DatatypeFactory datatypeFactory = null;
		XMLGregorianCalendar now = null;

		try {
			gregorianCalendar = new GregorianCalendar();
			datatypeFactory = DatatypeFactory.newInstance();
			now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException exc) {
			log.error(" getGregorianDate ", exc);
		}

		log.debug(" getGregorianDate ", " Current date . " + now);
		log.debug(" getGregorianDate ", " Exit getGregorianDate method. ");

		return now;
	}

	public static Calendar getCalender() {

		Calendar objCalendar = Calendar.getInstance();
		objCalendar.setFirstDayOfWeek(5);
		return objCalendar;
	}


	/**
	 * This method is used to generate the date by adding  the year,
	 * week , month , day , hour , minute and seconds.
	 *
	 * @return
	 * @throws ParseException
	 */
	public static String getEndDate(String startDate, int noOfUnits, String type) throws ParseException {

		log.debug(" getEndDate ", " Enter in getEndDate method ");
		String endDate = "";

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		Date d = dateFormat.parse(startDate);
		Calendar objCalendar = dateFormat.getCalendar();

		switch (type) {

			case "MONTH":
				objCalendar.add(Calendar.MONTH, 3); // 0-23
				break;
			case "DAY":
				objCalendar.add(Calendar.DAY_OF_MONTH, 2); // For Date
				break;
			case "YEAR":
				objCalendar.add(Calendar.YEAR, 1);
				break;
			case "HOUR":
				objCalendar.add(Calendar.HOUR, 2);
				break;
			case "MINUTE":
				objCalendar.add(Calendar.MINUTE, 3);
				break;
			case "SECOND":
				objCalendar.add(Calendar.SECOND, 3);
				break;
			case "WEEK":
				objCalendar.add(Calendar.WEEK_OF_MONTH, 1);
				break;
			default:
				log.debug(" getEndDate ", " In Default.");

		}

		endDate = dateFormat.format(objCalendar.getTime());

		log.debug(" getEndDate ", " Exit getEndDate method " + endDate);

		return endDate;

	}


}
