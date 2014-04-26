package com.cloudkey.upload.service;

/**
 * This class acts as a initializer class to start the upload service it starts three threads one for RoomDetails , other two for RoomInventory and
 * Reservation
 */
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.collector.UploadQueueDataRetriever;
import com.cloudkey.upload.collector.UploadInventoryDataRetriver;
import com.cloudkey.upload.collector.UploadReservationDataRetriever;

public class UploadServiceInitiater  {


	public static void main( String[] args ) {

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " main ", "enter main method " );

		// This thread collects data from room_details_upload table of keypr_bridge_db . 
		// It pass the collected rows to the keypr by calling web service.
		Thread roomdetails = 	new Thread( new Runnable() {

			public void run() {
				int onstartup = 0; 
				UploadQueueDataRetriever roomdetailsUpload = new UploadQueueDataRetriever();

				if( onstartup==0 ) {  

					roomdetailsUpload.fetchRoomDetailsOnStartup();
					onstartup++;
				}

				roomdetailsUpload.fetchRoomDetails();}

		});roomdetails.start();


		// This thread collects data from room_inventory_upload table of keypr_bridge_db . 
		// It pass the collected rows to the keypr by calling web service.	
		Thread roominventory = 	new Thread( new Runnable() {
			public void run(){
				int onstartup = 0; 
				UploadInventoryDataRetriver roominventoryUpload = new UploadInventoryDataRetriver(); 

				if( onstartup==0 ) { 

					roominventoryUpload.fetchRoomInventoryDetailsOnStartup();
					onstartup++;
				}
				roominventoryUpload.fetchRoomInventoryDetails();
			}
		});roominventory.start();

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " main ", " exit main method " );
	
	
	/*This thread collects data from reservation_upload ,reservation_room_rates_upload and 
	     reservation_room_allocation_upload table of keypr_bridge_db . */
	
			// It pass the collected rows to the keypr by calling web service.	
			Thread reservatioThread = 	new Thread( new Runnable() {
				public void run(){
				
					UploadReservationDataRetriever reservationDataUpload = new UploadReservationDataRetriever(); 

						reservationDataUpload.fetchReservationDetails();
					
				}
			});reservatioThread.start();

			MessageLogger.logInfo( UploadInventoryDataRetriver.class, " main ", " exit main method " );
		}
	
	
}

