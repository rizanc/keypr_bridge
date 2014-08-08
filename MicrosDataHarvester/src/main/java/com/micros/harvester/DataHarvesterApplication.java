package com.micros.harvester;

import com.cloudkey.db.DatabaseModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.micros.harvester.communicator.OWSDataCollector;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.oxi.OXIListener;

/**
 * This class acts as a service to collect data from the micros property management system.
 * It start the data harvesting scheduler to gather operation's data from property management system and
 * make it available to the keypr, thereby synchronizing the keypr database with the database of
 * the property management system.
 * 
 * @author vinayk2
 */

public class DataHarvesterApplication {

	public static void main( String[] args ) {

		DataHarvesterLogger.logInfo( DataHarvesterApplication.class, " main ", " Enter main method " );

		Injector injector = Guice.createInjector(new DataHarvesterModule());

		OWSDataCollector owsDataCollector = injector.getInstance(OWSDataCollector.class);
		//owsDataCollector.harvestRoomStatusData();
		owsDataCollector.harvestRoomInventoryData();

        OXIListener objOxiListener = injector.getInstance(OXIListener.class);
		objOxiListener.connectWithOXI();

		DataHarvesterLogger.logInfo( DataHarvesterApplication.class, " main ", " Exit main method " );
	}

}
