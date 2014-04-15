package com.micros.harvester.service;

import com.micros.harvester.communicator.OWSDataCollector;
import com.micros.harvester.logger.DataHarvesterLogger;

/**
 * This class acts as a service to collect data from the micros property management system.
 * It start the upload scheduler to gather operation's data from property management system and
 * make it available to the keypr, thereby synchronizing the keypr database with the database of
 * the property management system.
 * 
 * @author vinayk2
 */

public class DataHarvesterService {

	public static void main( String[] args ) {
	
		DataHarvesterLogger.logInfo( DataHarvesterService.class, " main ", " Enter main method " );
		
		OWSDataCollector objOwsDataCollector = null;
		objOwsDataCollector = new OWSDataCollector();
		
		objOwsDataCollector.harvestRoomStatusData();
		objOwsDataCollector.harvestRoomInventoryData();
		//objOwsDataCollector.harvestReservationData();
		
		DataHarvesterLogger.logInfo( DataHarvesterService.class, " main ", " Exit main method " );
	}

}
