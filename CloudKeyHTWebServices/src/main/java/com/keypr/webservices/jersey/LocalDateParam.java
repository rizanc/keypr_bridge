package com.keypr.webservices.jersey;

import io.dropwizard.jersey.params.AbstractParam;
import org.joda.time.LocalDate;

/**
 * A parameter encapsulating local date values. All non-parsable values will return a {@code 400 Bad
 * Request} response.
 *
 * This was contributed to DropWizard and may appear in the next version.
 *
 * @author clamothe
 */
public class LocalDateParam extends AbstractParam<LocalDate> {
    public LocalDateParam(String input) {
        super(input);
    }

    @Override
    protected LocalDate parse(String input) throws Exception {
        return new LocalDate(input);
    }
}
