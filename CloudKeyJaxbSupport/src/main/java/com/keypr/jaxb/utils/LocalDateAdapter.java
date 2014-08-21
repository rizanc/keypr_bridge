package com.keypr.jaxb.utils;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public String marshal(LocalDate value) {
		return value == null ? null : ISODateTimeFormat.date().withOffsetParsed().print(value);
	}

	@Override
	public LocalDate unmarshal(String value) {
		return value == null ? null : new DateTimeFormatterBuilder().append(ISODateTimeFormat.dateParser()).appendOptional(new DateTimeFormatterBuilder()
			.appendTimeZoneOffset("Z", true, 2, 4)
			.toFormatter()
			.getParser()).toFormatter().parseLocalDate(value);
	}

}
