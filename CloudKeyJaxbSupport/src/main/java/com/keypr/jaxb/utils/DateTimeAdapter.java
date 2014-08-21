package com.keypr.jaxb.utils;

import org.joda.time.DateTime;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

	@Override
	public String marshal(DateTime value) {
		return value != null ? DatatypeConverter.printDateTime(value.toGregorianCalendar()) : null;
	}

	@Override
	public DateTime unmarshal(String value) {
		return value != null ? new DateTime(DatatypeConverter.parseDateTime(value)) : null;
	}

}