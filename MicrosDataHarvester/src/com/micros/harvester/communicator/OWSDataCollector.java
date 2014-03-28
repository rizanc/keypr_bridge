package com.micros.harvester.communicator;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.micros.harvester.util.OWSUtility;
import com.micros.pms.bean.FetchRoomStatusRequest;
import com.micros.pms.bean.FetchRoomStatusResponse;
import com.micros.pms.bean.HotelReference;
import com.micros.pms.bean.RoomFeature;
import com.micros.pms.bean.RoomFeatureList;
import com.micros.pms.transport.MicrosMessageTransport;

/**
 * This class will make request to the property management system to
 * gather information related to reservation , room status and room inventory.
 * It will collect the detail and upload the data in the corresponding upload
 * queue , from where in data will be send to the keypr.
 * 
 * @author vinayk2
 *
 */
public class OWSDataCollector {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	/**
	 * This method will runs at fixed interval to collect room status data 
	 * from the property management system.
	 */
	public void harvestRoomStatusData() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " Enter harvestRoomStatusData method " );

		int delayTime ;
		int intervalPeriod ;

		final Runnable dataCollerctor = new Runnable() {

			public void run() { 

				boolean success = makeFetchRoomStatusRequest();

				if(success) {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " Request Processed Successfully " );
				}
				else {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " Sorry Request cannot be processed " );
				}
			}
		};

		delayTime = Integer.parseInt( HarvesterConfigurationReader.getProperty( IMicrosHarvester.ROOM_STATUS_THREAD_DELAY) );
		intervalPeriod  = Integer.parseInt( HarvesterConfigurationReader.getProperty(IMicrosHarvester.ROOM_STATUS_THREAD_INTERVAL) );

		@SuppressWarnings("unused")
		final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate( dataCollerctor, delayTime, intervalPeriod , TimeUnit.MINUTES );

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " Exit harvestRoomStatusData method " );

	} // ends collectReservationData

	/**
	 * This method creates instance of FetchRoomStatus request and make call to the
	 * property management service for details. It collect the response , populate
	 * an instance of FetchRoomStatus response and pass it to database handler class
	 * to persist the information in room status upload database. 
	 * 
	 * @return
	 */
	private static boolean makeFetchRoomStatusRequest() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Enter makeFetchRoomStatusRequest method " );

		boolean isProcced = false;

		MicrosMessageTransport objMicrosMessageTransport = null;
		FetchRoomStatusRequest  objFetchRoomStatusRequest = null;
		MicrosDAOImpl objMicrosDAOImpl = null;

		objMicrosMessageTransport = new MicrosMessageTransport();
		ObjectFactory objFactory = new ObjectFactory();

		try {

			objFetchRoomStatusRequest = objFactory.createFetchRoomStatusRequest();

			objFetchRoomStatusRequest.setIncludeOccupied(true);

			HotelReference objHotelReference = objFactory.createHotelReference();
			objHotelReference.setHotelCode(IMicrosHarvester.HOTEL_CODE);
			objFetchRoomStatusRequest.setHotelReference(objHotelReference);

			objFetchRoomStatusRequest.setStartDate( OWSUtility.getGregorianDate() );
			objFetchRoomStatusRequest.setEndDate( OWSUtility.getGregorianDate() );

			RoomFeatureList objRoomFeatureList = objFactory.createRoomFeatureList();
			List<RoomFeature> objFeatures =	objRoomFeatureList.getFeatures();

			RoomFeature objRoomFeature = objFactory.createRoomFeature();
			objRoomFeature.setFeature("LAN");
			objRoomFeature.setDescription("With Pool facility");
			objFeatures.add(objRoomFeature);

			objFetchRoomStatusRequest.setFeatures(objRoomFeatureList);
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusRequest Instace created " );

			String xmlRepresentation = OWSUtility.convertToXML( objFetchRoomStatusRequest );
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Request Created " + xmlRepresentation );

			String pmsResponse = objMicrosMessageTransport.handlePMSRequest( xmlRepresentation );
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Response Received " + pmsResponse );

			if( pmsResponse.length() != 0 ) {

				isProcced = true;

				FetchRoomStatusResponse objFetchRoomStatusRespnse = objFactory.createFetchRoomStatusResponse();
				objFetchRoomStatusRespnse = (FetchRoomStatusResponse) OWSUtility.covertToObject(objFetchRoomStatusRespnse, pmsResponse);

				objMicrosDAOImpl = new MicrosDAOImpl();
				objMicrosDAOImpl.persistRoomStatusData(objFetchRoomStatusRespnse);

				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusResponse Instance Sent to persist " );

			}
			else {
				
				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusResponse is not available " );	
			}
		}
		catch( Exception exc) {

			DataHarvesterLogger.logError( OWSDataCollector.class, " makeFetchRoomStatusRequest ", exc);
		}

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Exit makeFetchRoomStatusRequest method " ); 

		return isProcced;

	}

	/**
	 * This method will runs at fixed interval to collect room availability data 
	 * from the property management system.
	 */
	public void harvestAvailabilityData() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestAvailabilityData ", " Enter harvestAvailabilityData method " );

		int delayTime ;
		int intervalPeriod ;

		final Runnable dataCollerctor = new Runnable() {

			public void run() { 

				boolean success = makeAvailabilityRequest();

				if(success) {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestAvailabilityData ", " Request Processed Successfully " );
				}
				else {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestAvailabilityData ", " Sorry Request cannot be processed " );
				}
			}
		};

		delayTime = Integer.parseInt( HarvesterConfigurationReader.getProperty( IMicrosHarvester.ROOM_AVAILABILITY_THREAD_DELAY) );
		intervalPeriod  = Integer.parseInt( HarvesterConfigurationReader.getProperty(IMicrosHarvester.ROOM_AVAILABILITY_THREAD_INTERVAL) );

		@SuppressWarnings("unused")
		final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate( dataCollerctor, delayTime, intervalPeriod , TimeUnit.MINUTES );

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestAvailabilityData ", " Exit harvestAvailabilityData method " );

	} // ends collectReservationData

	private static boolean makeAvailabilityRequest() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeAvailabilityRequest ", " Enter makeAvailabilityRequest method " );

		boolean isSuccess = false;

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeAvailabilityRequest ", " Exit makeAvailabilityRequest method " );
		return isSuccess;

	}

}
