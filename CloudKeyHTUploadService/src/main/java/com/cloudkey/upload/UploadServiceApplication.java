package com.cloudkey.upload;

import com.cloudkey.db.DatabaseModule;
import com.cloudkey.upload.collector.UploadInventoryDataRetriver;
import com.cloudkey.upload.collector.UploadReservationDataRetriever;
import com.cloudkey.upload.collector.UploadRoomDataRetriever;
import com.cloudkey.upload.logger.UploadServiceLogger;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.log4j.xml.DOMConfigurator;


/**
 * This class acts as a initializer class to start the upload service it starts three threads one for RoomDetails , other two for RoomInventory and
 * Reservation
 */
public class UploadServiceApplication {

	static {
		DOMConfigurator.configure(UploadServiceApplication.class.getClassLoader().getResource("log4j.xml"));
	}

	public static void main(String[] args) {
		UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter main method ");

		final Injector injector = Guice.createInjector(new UploadServiceModule());

		/*  This thread collects data from room_details_upload table of keypr_bridge_db .
		It pass the collected rows to the keypr by calling web service.*/
		// TODO Charlie: This may be replaced with OXI
		Thread roomdetails = new Thread(new Runnable() {

			public void run() {

				UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter room details thread ");

				int onstartup = 0;
				boolean isCallFetchRoomStatus = false;

				UploadRoomDataRetriever retriever = injector.getInstance(UploadRoomDataRetriever.class);

				// TODO: This clearly does not accomplish what they intended.
				if (onstartup == 0) {

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter to call fetchRoomDetailsOnStartup");

					isCallFetchRoomStatus = retriever.fetchRoomDetailsOnStartup();

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " fetchRoomDetailsOnStartup status is " + isCallFetchRoomStatus);

					onstartup++;
				}

				if (isCallFetchRoomStatus) {

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter to call fetchRoomDetails");

					retriever.fetchRoomDetails();
				}

			}

		});
		roomdetails.start();

		/* This thread collects data from room_inventory_upload table of keypr_bridge_db . 
		 It pass the collected rows to the keypr by calling web service.*/

		Thread roominventory = new Thread(new Runnable() {

			public void run() {

				UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter room inventory thread ");

				int onstartup = 0;
				boolean isCallFetchRoomInventory = false;

				UploadInventoryDataRetriver retriever = injector.getInstance(UploadInventoryDataRetriver.class);

				if (onstartup == 0) {

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " enter to call fetchRoomInventoryDetailsOnStartup ");

					isCallFetchRoomInventory = retriever.fetchRoomInventoryDetailsOnStartup();

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " fetchRoomInventoryDetails status is " + isCallFetchRoomInventory);

					onstartup++;
				}

				if (isCallFetchRoomInventory) {

					UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", "enter to call fetchRoomInventoryDetails");

					retriever.fetchRoomInventoryDetails();
				}
			}
		});

		roominventory.start();

		/* This thread collects data from reservation_upload ,reservation_room_rates_upload and 
		 reservation_room_allocation_upload table of keypr_bridge_db .
	     It pass the collected rows to the keypr by calling web service.	
		 */
		Thread reservatioThread = new Thread(new Runnable() {

			public void run() {

				UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " enter in reservation thread ");

				UploadReservationDataRetriever retriever = injector.getInstance(UploadReservationDataRetriever.class);

				UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " enter to call fetchReservationDetails ");

				retriever.fetchReservationDetails();

			}
		});
		reservatioThread.start();

		UploadServiceLogger.logInfo(UploadServiceApplication.class, " main ", " exit main method ");

	}
}

