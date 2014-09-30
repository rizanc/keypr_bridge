package com.cloudkey.upload;

import com.cloudkey.upload.collector.UploadInventoryDataRetriver;
import com.cloudkey.upload.collector.UploadReservationDataRetriever;
import com.cloudkey.upload.collector.UploadRoomDataRetriever;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class acts as a initializer class to start the upload service it starts three threads one for RoomDetails , other two for RoomInventory and
 * Reservation
 */
public class UploadServiceApplication {

	protected final static Logger log = LoggerFactory.getLogger(UploadServiceApplication.class);

	public static void main(String[] args) {
		log.debug("main: enter main method ");

		final Injector injector = Guice.createInjector(new UploadServiceModule());

		/*  This thread collects data from room_details_upload table of keypr_bridge_db .
		It pass the collected rows to the keypr by calling web service.*/
		// TODO Charlie: This may be replaced with OXI
		Thread roomdetails = new Thread(new Runnable() {

			public void run() {

				log.debug("main: enter room details thread ");

				int onstartup = 0;
				boolean isCallFetchRoomStatus = false;

				UploadRoomDataRetriever retriever = injector.getInstance(UploadRoomDataRetriever.class);

				// TODO: This clearly does not accomplish what they intended.
				if (onstartup == 0) {

					log.debug("main: enter to call fetchRoomDetailsOnStartup");

					isCallFetchRoomStatus = retriever.fetchRoomDetailsOnStartup();

					log.debug("main: fetchRoomDetailsOnStartup status is: {}", isCallFetchRoomStatus);

					onstartup++;
				}

				if (isCallFetchRoomStatus) {

					log.debug("main: enter to call fetchRoomDetails");

					retriever.fetchRoomDetails();
				}

			}

		});
		roomdetails.start();

		/* This thread collects data from room_inventory_upload table of keypr_bridge_db . 
		 It pass the collected rows to the keypr by calling web service.*/

		Thread roominventory = new Thread(new Runnable() {

			public void run() {

				log.debug("main: enter room inventory thread ");

				int onstartup = 0;
				boolean isCallFetchRoomInventory = false;

				UploadInventoryDataRetriver retriever = injector.getInstance(UploadInventoryDataRetriver.class);

				if (onstartup == 0) {

					log.debug("main: enter to call fetchRoomInventoryDetailsOnStartup ");

					isCallFetchRoomInventory = retriever.fetchRoomInventoryDetailsOnStartup();

					log.debug("main: fetchRoomInventoryDetails status is: {}", isCallFetchRoomInventory);

					onstartup++;
				}

				if (isCallFetchRoomInventory) {

					log.debug("main: enter to call fetchRoomInventoryDetails");

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

				log.debug("main: enter in reservation thread ");

				UploadReservationDataRetriever retriever = injector.getInstance(UploadReservationDataRetriever.class);

				log.debug("main: enter to call fetchReservationDetails ");

				retriever.fetchReservationDetails();

			}
		});
		reservatioThread.start();

		log.debug("main: exit main method ");

	}
}

