package com.keypr.jsonschema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class JsonSchemaGeneratorApplication {

	public static void main(String[] args) throws JsonProcessingException, ClassNotFoundException {
		Class<?> aClass = Class.forName(args[0]);

		Injector injector = Guice.createInjector(new JsonSchemaGeneratorModule());

		JsonSchemaGenerator generator = injector.getInstance(JsonSchemaGenerator.class);

		// Prints an auto-generated json schema for the given class
		System.out.println(generator.serializeSchema(generator.generateFor(aClass)));
	}
}

