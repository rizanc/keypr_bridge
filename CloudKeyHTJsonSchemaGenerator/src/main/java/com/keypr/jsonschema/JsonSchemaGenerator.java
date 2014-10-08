package com.keypr.jsonschema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class JsonSchemaGenerator {

	@Inject
	protected ObjectMapper objectMapper;

	public <T> com.fasterxml.jackson.databind.jsonschema.JsonSchema generateFor(Class<T> clazz) throws JsonMappingException {
		return objectMapper.generateJsonSchema(clazz);
	}

	public String serializeSchema(com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema) throws JsonProcessingException {
		return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
	}
}
