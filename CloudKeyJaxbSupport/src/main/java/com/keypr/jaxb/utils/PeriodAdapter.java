package com.keypr.jaxb.utils;

import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PeriodAdapter extends XmlAdapter<String, Period> {

	@Override
	public String marshal(Period value) {
		return value == null ? null : value.toString();
	}

	@Override
	public Period unmarshal(String value) {
		return ISOPeriodFormat.standard().parsePeriod(value);
	}

}
