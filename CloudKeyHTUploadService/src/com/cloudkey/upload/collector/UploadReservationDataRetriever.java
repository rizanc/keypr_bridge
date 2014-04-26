package com.cloudkey.upload.collector;

import java.sql.Connection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.utility.UploadConfigurationReader;


/**
 * This class is used to collect reservation data from database , call the keypr web service and
 * delete the data from the reservation table in keypr_bridge_upload database on SUCCESS.
 * 
 * @author niveditat
 *
 */
public class UploadReservationDataRetriever {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	int period = Integer.parseInt(UploadConfigurationReader.getProperty(IUploadConstants. RESERVATION_THREAD_INTERVAL)) ;

	String webResult = null;
	// create reference variable to store the database connection object. 
	private static Connection connection = null;

	//method to listen the upload queue as scheduler after every fixed time period and fetch the updated RoomInventory data from upload queue.
	public void fetchReservationDetails() {

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchReservationDetails ", " enter method fetchReservationDetails " );

		final Runnable schedulerTask = new Runnable() {

			public void run() {
				
				// Implementation to fetch data.
			}

		};	


		//scheduler method to listen the upload queue at every given time period 
		@SuppressWarnings("unused")
		final ScheduledFuture<?> schedulerHandle = scheduler.scheduleAtFixedRate(schedulerTask, 10, period, TimeUnit.SECONDS);

		MessageLogger.logInfo( UploadInventoryDataRetriver.class, " fetchReservationDetails ", " exit method fetchReservationDetails " );
	}

}
