package com.cloudkey.upload.constant;

import java.sql.Timestamp;

public interface IUploadConstants {

	String ROOM_STATUS_THREAD_DELAY = "room.status.upload.timer.delay";
	String ROOM_STATUS_THREAD_INTERVAL = "room.status.upload.timer.interval";

	String ROOM_STATUS_TIMER_INTERVAL = "room.status.upload.timer.interval";

	String ROOM_INVENTORY_THREAD_DELAY = "room.inventory.upload.timer.delay";
	String ROOM_INVENTORY_THREAD_INTERVAL = "room.inventory.upload.timer.interval";

	String RESERVATION_THREAD_DELAY	 = "reservation.upload.timer.delay";
	String RESERVATION_THREAD_INTERVAL = "reservation.upload.timer.interval";

	String KEYPR_RESERVATION_URL = "keypr.reservation.service.url";
	String KEYPR_ROOM_INVENTORY_URL = "keypr.room.inventory.service.url";
	String KEYPR_ROOM_STATUS_URL = "keypr.room.status.service.url";

	String KEYPR_ROOM_LIST_KEY = "keypr.room.list.key";
	String KEYPR_ROOMIN_LIST_KEY = "keypr.roomin.list.key";
	String KEYPR_RESV_LIST_KEY = "keypr.resv.list.key";

	String KEYPR_SIZE_KEY = "keyypr.size.key";

	String RESERVATON_STATUS_COMPL = "COMPLETED";
	String RESERVATION_STATUS = "IN-PROCESS";

	String WEB_SERVICE_RESULT_FAILURE = "failure"; 

	String KEYPR_SERVICE_STATUS_FAILURE = "failure";
	String KEYPR_SERVICE_STATUS_SUCCESS = "success";
	
	String ROOM_INVENTORY_ROOM_TYPE = "rinventory.room_type";
	String ROOM_INVENTORY_TOTAL_ROOMS_AVAILABLE =  "rinventory.total_rooms_available";
	String ROOM_INVENTORY_TOTAL_ROOMS = "rinventory.total_rooms";
	String ROOM_INVENTORY_ID = "rinventory.id";
	String ROOM_INVENTORY_TYPE_CODE = "rinventory.type_code";
	
	String ROOM_DETAILS_ID = "rdetails.id" ;
	String ROOM_DETAILS_ROOM_NUMBER = "rdetails.room_number";
	String ROOM_DETAILS_FRONT_OFFICE_STATUS =  "rdetails.front_office_status";
	String ROOM_DETAILS_ROOM_STATUS = "rdetails.room_status";
	String  ROOM_DETAILS_HOUSE_KEEPING_STATUS = "rdetails.house_keeping_status";

	Integer KEYPR_SERVICE_STATUS_SUCCESS_CODE = 204;
	Integer KEYPR_SERVICE_STATUS_FAILURE_CODE_1 = 400;
	Integer KEYPR_SERVICE_STATUS_FAILURE_CODE_2 = 409;

	Integer COUNT_ZERO = 0;
	Integer COUNT_ONE = 1;
	Integer COUNT_TWO = 2;
	Integer COUNT_THREE = 3;
	Integer COUNT_FOUR = 4;
	Integer COUNT_THOUSAND = 1000;
	
	String QUERY_RESERVATION_UPLOAD_DELETE_BY_ID = "DELETE  FROM keypr_bridge_db.reservation_upload  WHERE id = ";
	
	String QUERY_ROOM_INVENTORY_UPLOAD_DELETE_BY_ID = "DELETE FROM keypr_bridge_db.room_inventory_upload where id= ";
	
	String QUERY_ROOM_DETAILS_UPLOAD_DELETE_BY_ID =  "DELETE FROM keypr_bridge_db.room_details_upload where id= " ;

	String QUERY_ROOM_INVENTORY_UPLOAD_SELECT = " select rinventory.* from keypr_bridge_db.room_inventory_upload rinventory " ;
	
	String QUERY_RESERVATION_UPLOAD_SELECT_BY_RESERVATION_STATUS = "SELECT reservation.* FROM keypr_bridge_db.reservation_upload  AS reservation WHERE reservation.status = '"+RESERVATON_STATUS_COMPL+"' ";
	
	String QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_BY_RESERVATION_UPLOAD_ID = " SELECT resvalloc.* FROM keypr_bridge_db.reservation_room_allocation_upload AS resvalloc WHERE resvalloc.reservation_upload_id = ? ";
	
	String QUERY_RESERVATION_ROOM_RATES_UPLOAD_BY_RESERVATION_ROOM_ALLOCATION_ID = " SELECT resvrate.* FROM keypr_bridge_db.reservation_room_rates_upload AS resvrate WHERE resvrate.room_allocation_id = ? ";
	
	String QUERY_ROOM_DETAILS_UPLOAD = "select rdetails.* from  keypr_bridge_db.room_details_upload rdetails";
}
