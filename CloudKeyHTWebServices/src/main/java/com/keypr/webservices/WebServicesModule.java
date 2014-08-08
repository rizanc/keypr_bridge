package com.keypr.webservices;

import com.google.inject.AbstractModule;
import com.micros.pms.MicrosPMSModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module which configures Guava DI
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class WebServicesModule extends AbstractModule {
	protected final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected void configure() {
	    install(new MicrosPMSModule());
    }
}
