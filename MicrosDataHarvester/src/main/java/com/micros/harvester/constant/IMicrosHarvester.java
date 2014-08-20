package com.micros.harvester.constant;

/**
 * This interface contains constants for data harvester service.
 * @author vinayk2
 *
 */
public interface IMicrosHarvester {

	String RESERVATION_TYPE_CHECK_IN = "CHECKIN";
	String RESERVATION_TYPE_CHECK_OUT = "CHECKOUT";
	String RESERVATION_TYPE_NEW = "ADD";
	String RESERVATION_TYPE_NA = "NA";
	String RESERVATION_TYPE_SPLIT = "SPLIT";
	String RESERVATION_TYPE_CANCEL = "CANCEL";
	String RESERVATION_TYPE_REINSTATE = "REINSTATE";
	String RESERVATION_TYPE_CHECKIN = "CHECKIN";
	String RESERVATION_TYPE_SHARE = "SHARE";
	String RESERVATION_TYPE_NEWADDRESS = "NEWADDRESS";
	String RESERVATION_TYPE_ROOMASSIGN = "ROOMASSIGN";
	String RESERVATION_TYPE_TYPEASSIGN = "TYPEASSIGN";
	String RESERVATION_TYPE_WAITLIST = "WAITLIST";
	String RESERVATION_TYPE_WAITLISTTOACTIVE = "WAITLISTTOACTIVE";
	String RESERVATION_TYPE_EDIT = "EDIT";
	String RESERVATION_TYPE_ADD = "ADD";
	String RESERVATION_TYPE_DELETE = "DELETE";
	String RESERVATION_TYPE_NOSHOW = "NOSHOW";
	String RESERVATION_TYPE_GROUPCHANGE = "GROUPCHANGE";
	String RESERVATION_TYPE_ROOMMOVE = "ROOMMOVE";
	String RESERVATION_TYPE_PACKAGE = "PACKAGE";
	String RESERVATION_TYPE_CNXCHECKIN = "CNXCHECKIN";
	String RESERVATION_TYPE_SYNCH = "SYNCH";
	String RESERVATION_TYPE_CHANGESHARENUM = "CHANGESHARENUM";
	String RESERVATION_TYPE_CHECKOUT = "CHECKOUT";
	String RESERVATION_TYPE_OTHER = "OTHER";
	String RESERVATION_TYPE_ENROLLMENTRQ = "ENROLLMENTRQ";
	String RESERVATION_TYPE_ENROLLMENT = "ENROLLMENT";

	String RESERVATON_STATUS_COMPL = "COMPLETED";
	String RESERVATION_STATUS = "IN-PROCESS";

	String OXI_AFFILATE_ID  = "9175e540-b992-447a-846b-e9e5dea82a80";

	String STRING_COUNT = "cont" ;

	Integer ROWS_UPDATED = 0;

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
			+ "reservation_source, affiliate_id, date_created, messages, email_id, status ) values "
			+ "( ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,now(),?, ?,?) ";

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
