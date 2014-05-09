package com.cloudkey.upload.service;

/**
 * This class acts as a initializer class to start the upload service it starts three threads one for RoomDetails , other two for RoomInventory and
 * Reservation
 */
import org.apache.log4j.xml.DOMConfigurator;

import com.cloudkey.upload.collector.UploadInventoryDataRetriver;
import com.cloudkey.upload.collector.UploadReservationDataRetriever;
import com.cloudkey.upload.collector.UploadRoomDataRetriever;
import com.cloudkey.upload.logger.UploadServiceLogger;

public class UploadServiceInitiater  {

	static {

		DOMConfigurator.configure("res/log4j.xml");
	}

	public static void main( String[] args ) {

		UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter main method " );

	  /*  This thread collects data from room_details_upload table of keypr_bridge_db . 
		It pass the collected rows to the keypr by calling web service.*/
	Thread roomdetails = 	new Thread( new Runnable() {

			public void run() {

				UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter room details thread " );
				int onstartup = 0; 
				boolean isCallFetchRoomStatus = false ;

				UploadRoomDataRetriever roomdetailsUpload = new UploadRoomDataRetriever();

				if( onstartup==0 ) {
					
					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter to call fetchRoomDetailsOnStartup" );
					isCallFetchRoomStatus = roomdetailsUpload.fetchRoomDetailsOnStartup();
					
					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " fetchRoomDetailsOnStartup status is " + isCallFetchRoomStatus );
					onstartup++;
				}


				if( isCallFetchRoomStatus ) {

					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter to call fetchRoomDetails" );
					roomdetailsUpload.fetchRoomDetails();
				}

			}

		});roomdetails.start();


		/* This thread collects data from room_inventory_upload table of keypr_bridge_db . 
		 It pass the collected rows to the keypr by calling web service.*/	
		
		Thread roominventory = 	new Thread( new Runnable() {
			public void run(){
				
				UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter room inventory thread " );
				int onstartup = 0; 
				boolean isCallFetchRoomInventory = false ;

				UploadInventoryDataRetriver roominventoryUpload = new UploadInventoryDataRetriver(); 

				if( onstartup==0 ) { 
					
					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " enter to call fetchRoomInventoryDetailsOnStartup " );
					isCallFetchRoomInventory = roominventoryUpload.fetchRoomInventoryDetailsOnStartup();
					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " fetchRoomInventoryDetails status is " + isCallFetchRoomInventory );
					onstartup++;
				}

				if(isCallFetchRoomInventory){

					UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", "enter to call fetchRoomInventoryDetails" );		
					roominventoryUpload.fetchRoomInventoryDetails();
				}
			}
		});roominventory.start(); 


			
        /* This thread collects data from reservation_upload ,reservation_room_rates_upload and 
	     reservation_room_allocation_upload table of keypr_bridge_db .
	     It pass the collected rows to the keypr by calling web service.	
	    */
		Thread reservatioThread = 	new Thread( new Runnable() {
			
			public void run(){
				
				UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " enter in reservation thread " );	

				UploadReservationDataRetriever reservationDataUpload = new UploadReservationDataRetriever(); 
				
				UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " enter to call fetchReservationDetails " );
				
				reservationDataUpload.fetchReservationDetails();

			}
		});reservatioThread.start();

		UploadServiceLogger.logInfo( UploadServiceInitiater.class, " main ", " exit main method " );
		

	}
}

