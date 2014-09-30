package com.keypr.jaxb.utils;

import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Joda-Time adaptors for JAXB
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class LocalTimeAdapter extends XmlAdapter<String, LocalTime> {

	@Override
	public String marshal(LocalTime value) {
		return value == null ? null : ISODateTimeFormat.time().withOffsetParsed().print(value);
	}

	@Override
	public LocalTime unmarshal(String value) {
		return value == null ? null : new DateTimeFormatterBuilder().append(ISODateTimeFormat.timeParser()).appendOptional(new DateTimeFormatterBuilder()
			.appendTimeZoneOffset("Z", true, 2, 4)
			.toFormatter()
			.getParser()).toFormatter().parseLocalTime(value);
	}

}
