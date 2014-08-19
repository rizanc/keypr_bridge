package com.micros.harvester;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.micros.harvester.oxi.OXIListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class acts as a service to collect data from the micros property management system.
 * It start the data harvesting scheduler to gather operation's data from property management system and
 * make it available to the keypr, thereby synchronizing the keypr database with the database of
 * the property management system.
 * 
 * @author vinayk2
 */
public class DataHarvesterApplication {
	protected static final Logger log = LoggerFactory.getLogger(DataHarvesterApplication.class);

	public static void main( String[] args ) {
		log.debug("main: Enter main method " );

		Injector injector = Guice.createInjector(new DataHarvesterModule());

        OXIListener objOxiListener = injector.getInstance(OXIListener.class);
		objOxiListener.connectWithOXI();

		log.debug("main: Exit main method " );
	}

}
