package com.keypr.jsonschema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonSchema.factories.SchemaFactoryWrapper;
import com.fasterxml.jackson.databind.jsonSchema.types.JsonSchema;
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
//		objectMapper.acceptJsonFormatVisitor(
//			objectMapper.constructType(clazz),
//			visitor
//		);
//
//		return visitor.finalSchema();
	}

	public <T> String serializeSchema(com.fasterxml.jackson.module.jsonSchema.JsonSchema schema) throws JsonProcessingException {
		return objectMapper.writeValueAsString(schema);
	}


	public String serializeSchema(com.fasterxml.jackson.databind.jsonschema.JsonSchema jsonSchema) throws JsonProcessingException {
		return objectMapper.writeValueAsString(jsonSchema);
	}
}
