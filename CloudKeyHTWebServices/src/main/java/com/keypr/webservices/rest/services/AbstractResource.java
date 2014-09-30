package com.keypr.webservices.rest.services;

import com.cloudkey.PMSInterface;
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
 * Base class for Jersey REST resource classes.
 *
 * Provides defaults and helper methods.
 *
 * Subclasses of this should be injected via Guice.
 *
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
     * Validates an object using JSR-303 bean validation annotations.
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

	/**
	 * Syntaxtual-sugar: validates the object using {@link #validate(Object)} then returns it.
	 *
	 * If the object is not valid, validate will throw an exception and the return statement of this method
	 * will not be reached.
	 *
	 * @param obj
	 * @param <T>
	 * @return
	 */
	protected <T> T valid(T obj) {
		validate(obj);

		return obj;
	}

	/**
	 * Null-safe {@link io.dropwizard.jersey.params.AbstractParam#get()}.
	 *
	 * @param param
	 * @param <T>
	 * @return
	 */
	protected <T> T unwrap(AbstractParam<T> param) {
		return param == null ? null : param.get();
	}

	/**
	 * Helper to unwrap a list of params.
	 *
	 * @param params
	 * @param <T>
	 * @return
	 */
	protected <T> List<T> unwrap(List<? extends AbstractParam<T>> params) {
		return Lists.transform(params, new Function<AbstractParam<T>, T>() {
			@Nullable
			@Override
			public T apply(AbstractParam<T> param) {
				return unwrap(param);
			}
		});
	}
}
