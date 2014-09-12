package com.keypr.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

/**
 * Guice module which provides a configured {@link com.fasterxml.jackson.databind.ObjectMapper}
 * with a JODA time module.
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

	public void configureObjectMapper(ObjectMapper objectMapper) {
		objectMapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.registerModule(new JodaModule());
	}
}
