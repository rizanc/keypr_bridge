package com.keypr.webservices.jodasupport;

import io.dropwizard.jersey.params.AbstractParam;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/**
 * A parameter encapsulating local date values. All non-parsable values will return a {@code 400 Bad
 * Request} response.
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
