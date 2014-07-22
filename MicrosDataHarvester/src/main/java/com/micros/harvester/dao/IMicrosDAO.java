package com.micros.harvester.dao;

import java.sql.SQLException;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
//import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;


/**
 * This interface declares method to be implemented for performing data base
 * specific operations.
 * 
 * @author vinayk2
 *
 */
public interface IMicrosDAO {

	/**
	 * This method will persist the informations collected from property management system 
	 * for room status in the database. 
	 * 
	 * @param objFetchRoomStatusResponse - reference of FetchRoomStatusResponse
	 * @return
	 */
//	boolean persistRoomStatusDataInBridgeDB ( FetchRoomStatusResponse objFetchRoomStatusResponse ) ;

	/**
	 * This method will store the room status record received from the property management system
	 * to the room_details table of keypr_upload_db database.
	 * 
	 * @param objRoomDetails
	 * @return
	 */
	boolean persistRecordInBridgeRoomStatus(RoomDetails objRoomDetails);
	
	/**
	 * This method will store the response of fetch calendar request to the database.
	 * It response contains details about the room inventory for the particular day.
	 * 
	 * @param objFetchCalendarResponse
	 */
	void persistRoomInventoryData( FetchCalendarResponse objFetchCalendarResponse);
	
	/**
	 * This method will store the data of reservation received from oxi in the database.
	 * It response contains details about the status of database operation.
	 * 
	 * @param objReservation
	 * @return
	 * @throws SQLException 
	 */
	boolean persistReservationData( Reservation objReservation ) throws SQLException;

}
