package com.micros.harvester.constant;

/**
 * This interface contains constants for data harvester service.
 * @author vinayk2
 *
 */
public interface IMicrosHarvester {

	String EMPTY_STRING = "";
	String HOTEL_CODE = "DQB";

	String ROOM_STATUS_THREAD_DELAY = "room.status.harvester.timer.delay";
	String ROOM_STATUS_THREAD_INTERVAL = "room.status.harvester.timer.interval";
	
	String ROOM_INVENTORY_THREAD_DELAY = "room.inventory.harvester.timer.delay";
	String ROOM_INVENTORY_THREAD_INTERVAL = "room.inventory.harvester.timer.interval";
	
	String RESERVATION_THREAD_DELAY	 = "reservation.harvester.timer.delay";
	String RESERVATION_THREAD_INTERVAL = "reservation.harvester.timer.interval";


}
