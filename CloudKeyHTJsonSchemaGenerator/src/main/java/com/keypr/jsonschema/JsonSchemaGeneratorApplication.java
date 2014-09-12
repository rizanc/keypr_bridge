package com.keypr.jsonschema;

import com.cloudkey.pms.common.reservation.Reservation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class JsonSchemaGeneratorApplication {

	public static void main(String[] args) throws JsonProcessingException {
		Injector injector = Guice.createInjector(new JsonSchemaGeneratorModule());

		JsonSchemaGenerator generator = injector.getInstance(JsonSchemaGenerator.class);

		System.out.println(generator.serializeSchema(generator.generateFor(Reservation.class)));
	}
}

