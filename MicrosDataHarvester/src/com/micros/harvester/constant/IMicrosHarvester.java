package com.micros.harvester.constant;

/**
 * This interface contains constants for data harvester service.
 * @author vinayk2
 *
 */
public interface IMicrosHarvester {

	String HOTEL_CODE = "oxi.hotel.code";
	String CHAIN_CODE = "oxi.chain.code";

	String RESERVATION_TYPE_CHECK_IN = "CHEKCIN";
	String RESERVATION_TYPE_CHECK_OUT = "CHECKOUT";
	String RESERVATION_TYPE_NEW = "ADD";

	String RESERVATON_STATUS_COMPL = "COMPLETED";
	String RESERVATION_STATUS = "IN-PROCESS";

	String ROOM_STATUS_THREAD_DELAY = "room.status.harvester.timer.delay";
	String ROOM_STATUS_THREAD_INTERVAL = "room.status.harvester.timer.interval";
	String ROOM_TYPE_CODE = "oxi.room.type.code";

	String ROOM_INVENTORY_THREAD_DELAY = "room.inventory.harvester.timer.delay";
	String ROOM_INVENTORY_THREAD_INTERVAL = "room.inventory.harvester.timer.interval";

	String RESERVATION_THREAD_DELAY	 = "reservation.harvester.timer.delay";
	String RESERVATION_THREAD_INTERVAL = "reservation.harvester.timer.interval";

	String OXI_LISTENING_URL = "micros.pms.oxi.listener.url";
	String OXI_LISTENING_PORT = "micros.pms.oxi.listener.port";
	String OXI_LISTENER_BUFFER_SIZE = "micros.pms.oxi.listener.buffer.size";

	String OXI_XML_PATH_LOCATION = "micros.pms.oxi.xml.file.location";
	String OXI_AFFILATE_ID  = "9175e540-b992-447a-846b-e9e5dea82a80";

	String OWS_ORIGIN_ID = "origin.entity.id";
	String OWS_ORI_SYSTEM_TYPE = "origin.system.type";

	String OWS_DESTINATION_ID = "destination.entity.id";
	String OWS_ORI_DEST_TYPE = "destination.system.type";

	String OWS_USER_NAME = "auth.user.name";
	String OWS_USER_PASS = "auth.user.pass";

	String STRING_COUNT = "cont" ;

	Integer ROWS_UPDATED = 0;

	Integer COUNT_ZERO = 0;
	Integer COUNT_ONE = 1;
	Integer COUNT_TWO = 2;
	Integer COUNT_THREE = 3;
	Integer COUNT_FOUR = 4;
	Integer COUNT_FIVE = 5;

	Long SIXTY_UNITS = 60L;
	Long THOUSAND_UNITS = 1000L;
	Long TWENTY_FOUR_UNITS = 24L;

	String QUERY_ROOM_DETAILS_UPDATE_BY_ROOM_NUMBER =  "update keypr_bridge_db.room_details set room_type = ? , front_office_status = ? , house_keeping_status = ?"
			+ " where room_number = ? ";

	String QUERY_ROOM_DETAILS_SELECT_BY_ROOM_NUMBER = "select room_type, front_office_status ,house_keeping_status from keypr_bridge_db.room_details where room_number = ? ";

	String QUERY_ROOM_DETAILS_INSERT = " insert into keypr_bridge_db.room_details ( room_number, room_type, front_office_status, house_keeping_status, date_created ) values ( ?, ?, ?, ?, now() )";

	String QUERY_ROOM_DETAILS_UPLOAD_INSERT = " insert into keypr_bridge_db.room_details_upload ( room_number, room_type, front_office_status, "
			+ " house_keeping_status, date_created ) values ( ?, ?, ?, ?, now() )";

	String QUERY_ROOM_DETAILS_COUNT_RECORD_BY_ROOM_NUMBER = " select count(*) as cont from keypr_bridge_db.room_details where room_number = ? ";

	String QUERY_ROOM_INVENTORY_UPDATE_BY_TYPE_CODE = " update keypr_bridge_db.room_inventory set total_rooms = ? , total_rooms_available = ? where type_code = ?";

	String QUERY_ROOM_INVENTORY_INSERT = " insert into keypr_bridge_db.room_inventory ( type_code, total_rooms, total_rooms_available, date_created ) values ( ?, ?, ?, now() )";

	String QUERY_ROOM_INVENTORY_SELECT_BY_TYPE_CODE = " select total_rooms, total_rooms_available from keypr_bridge_db.room_inventory where type_code = ? ";

	String QUERY_ROOM_INVENTORY_UPLOAD_INSERT = " insert into keypr_bridge_db.room_inventory_upload ( type_code, total_rooms, total_rooms_available, date_created ) values ( ?, ?, ?, now() )";

	String QUERY_ROOM_INVENTORY_COUNT_RECORD_BY_TYPE_CODE = " select count(*) as cont from keypr_bridge_db.room_inventory where type_code = ? ";

	String QUERY_RESERVATION_UPLOAD_INSERT =  "insert into keypr_bridge_db.reservation_upload ( pms_id, stay_length, first_name, last_name, company_name, address, loyalty_number, "
			+ "phone, number_of_guest, confirmation_number, check_in_date, check_out_date, notes, loyalty_program, property_id, credit_card_no, "
			+ "reservation_source, affiliate_id, date_created, messages, email_id, status , reservation_action ) values "
			+ "( ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,now(),?, ?,?,?) ";

	String QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_INSERT = " insert into keypr_bridge_db.reservation_room_allocation_upload ( reservation_upload_id, room_number, room_type_code,  reservation_status_type ,date_created) values"
			+ "( ?, ?, ?, ? ,now())";

	String QUERY_RESERVATION_ROOM_RATES_UPLOAD_INSERT  = "insert into keypr_bridge_db.reservation_room_rates_upload (room_allocation_id, base_rate, rate_plan_code,"
			+ "effective_date, expiration_date,date_created ) values ( ?,?,?,?,?,now())";

	String QUERY_RESERVATION_ROOM_ALLOCATION_UPLOAD_SELECT_BY_ID = " SELECT alloc_upload.reservation_upload_id  FROM keypr_bridge_db.reservation_room_allocation_upload alloc_upload WHERE id = ? ";

	String QUERY_RESERVATION_UPLOAD_UPDATE_BY_ID = " update keypr_bridge_db.reservation_upload set status = ? where id = ? ";

	String QUERY_TRANSACTION_SELECT_BY_ID = " Select transId from IdGenerator ";
	String QUERY_TRANSACTION_UPDATE_BY_ID =  " update IdGenerator set transId = ? ";

	String TRANSACTION_ID = "transId";

	String ROOM_DETAILS_FRONT_OFFICE_STATUS = "front_office_status";
	String ROOM_DETAILS_HOUSE_KEEPING_STATUS = "house_keeping_status";
	String ROOM_DETAILS_ROOM_TYPE = "room_type";

	String ROOM_INVENTORY_TOTAL_ROOMS_AVAILABLE = "total_rooms_available";
	String ROOM_INVENTORY_TOTAL_ROOMS = "total_rooms";
}
