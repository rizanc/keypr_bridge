package com.keypr.webservices.rest.services;

import com.cloudkey.message.parser.PMSInterface;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import io.dropwizard.jersey.params.AbstractParam;

import javax.annotation.Nullable;
import javax.validation.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public abstract class AbstractResource {

    private Validator validator;

    @Inject
    protected PMSInterface messageParser;

    protected AbstractResource() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    /**
     * Validates an object with JSR-303 bean validation annotations.
     *
     * @throws javax.validation.ConstraintViolationException if the bean is invalid
     * @param obj
     * @param <T>
     */
    protected <T> void validate(T obj) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj);

        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }

	protected <T> T unwrap(AbstractParam<T> param) {
		return param == null ? null : param.get();
	}

	protected <T> List<T> unwrap(List<? extends AbstractParam<T>> childrenAges) {
		return Lists.transform(childrenAges, new Function<AbstractParam<T>, T>() {
			@Nullable
			@Override
			public T apply(AbstractParam<T> param) {
				return unwrap(param);
			}
		});
	}
}
