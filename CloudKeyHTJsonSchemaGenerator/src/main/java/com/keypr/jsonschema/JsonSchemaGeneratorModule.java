package com.keypr.jsonschema;

import com.google.inject.AbstractModule;
import com.keypr.jackson.KeyprJacksonModule;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class JsonSchemaGeneratorModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new KeyprJacksonModule());
	}
}
