package com.keypr.jsonschema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.google.inject.Inject;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class JsonSchemaGenerator {

	@Inject
	protected ObjectMapper objectMapper;

	public <T> com.fasterxml.jackson.databind.jsonschema.JsonSchema generateFor(Class<T> clazz) throws JsonMappingException {
		SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();

		return objectMapper.generateJsonSchema(clazz);
	}

	public <T> String serializeSchema(com.fasterxml.jackson.module.jsonSchema.JsonSchema schema) throws JsonProcessingException {
		return objectMapper.writeValueAsString(schema);
	}


	public String serializeSchema(com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonSchema);
	}
}
