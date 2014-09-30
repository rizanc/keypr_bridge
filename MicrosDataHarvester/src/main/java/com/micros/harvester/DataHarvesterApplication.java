package com.micros.harvester;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The main entry point for the DataHarvester application.
 *
 * @author clamothe
 */
public class DataHarvesterApplication {
	protected static final Logger log = LoggerFactory.getLogger(DataHarvesterApplication.class);

	public static void main( String[] args ) {
		log.debug("Starting up");

		Injector injector = Guice.createInjector(new DataHarvesterModule(), new DataHarvesterServletModule());

		// Initialize the server
		DataHarvesterEntryPoint server = injector.getInstance(DataHarvesterEntryPoint.class);

		log.debug("Shutting down");
	}

}
