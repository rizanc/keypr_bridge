package com.keypr.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.joda.ser.JacksonJodaFormat;
import com.fasterxml.jackson.datatype.joda.ser.LocalTimeSerializer;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.joda.time.LocalTime;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Guice module which provides a {@link com.fasterxml.jackson.databind.ObjectMapper}
 * configured with project-wide preferences, including a Joda-Time serialization module.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class KeyprJacksonModule extends AbstractModule {

	@Override
	protected void configure() {}

	@Provides
	@Singleton
	public ObjectMapper provideObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();

		configureObjectMapper(objectMapper);

		return objectMapper;
	}

	public static void configureObjectMapper(ObjectMapper objectMapper) {
		objectMapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		objectMapper.registerModule(new JodaModule());
		objectMapper.registerModule(new SimpleModule() {
			{
				// Serialize LocalTime in ISO format, but without millis.
				// We removed millis data since python's jsonschema validator does not expect it.
				addSerializer(LocalTime.class, new LocalTimeSerializer(new JacksonJodaFormat(ISODateTimeFormat.timeNoMillis().withZoneUTC())));
			}
		});
	}
}
