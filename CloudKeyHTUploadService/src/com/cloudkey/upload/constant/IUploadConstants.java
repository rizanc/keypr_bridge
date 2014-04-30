package com.cloudkey.upload.constant;

public interface IUploadConstants {

	String ROOM_STATUS_THREAD_DELAY = "room.status.upload.timer.delay";
	String ROOM_STATUS_THREAD_INTERVAL = "room.status.upload.timer.interval";

	String ROOM_INVENTORY_THREAD_DELAY = "room.inventory.upload.timer.delay";
	String ROOM_INVENTORY_THREAD_INTERVAL = "room.inventory.upload.timer.interval";

	String RESERVATION_THREAD_DELAY	 = "reservation.upload.timer.delay";
	String RESERVATION_THREAD_INTERVAL = "reservation.upload.timer.interval";
	
	String KEYPR_RESERVATION_URL = "keypr.reservation.service.url";
	String KEYPR_ROOM_INVENTORY_URL = "keypr.room.inventory.service.url";
	String KEYPR_ROOM_STATUS_URL = "keypr.room.status.service.url";
	
	String KEYPR_LIST_KEY = "keypr.list.key";
	String KEYPR_SIZE_KEY = "keyypr.size.key";
	
	String RESERVATON_STATUS_COMPL = "COMPLETED";
	String RESERVATION_STATUS = "IN-PROCESS";
}
