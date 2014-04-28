package com.micros.harvester.communicator;


import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.micros.availability.AvailabilityServiceStub;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.TimeSpan;
import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.DataUtility;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.micros.pms.bean.FetchRoomStatusRequest;
import com.micros.pms.bean.FetchRoomStatusResponse;
import com.micros.pms.bean.HotelReference;
import com.micros.pms.bean.RoomFeature;
import com.micros.pms.bean.RoomFeatureList;
import com.micros.pms.transport.MicrosMessageTransport;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

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
				DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " FetchRoomStatus Made to the OWS " );

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
		final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate( dataCollerctor, delayTime, intervalPeriod , TimeUnit.SECONDS );

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

			objFetchRoomStatusRequest.setStartDate( DataUtility.getGregorianDate() );
			objFetchRoomStatusRequest.setEndDate( DataUtility.getGregorianDate() );

			RoomFeatureList objRoomFeatureList = objFactory.createRoomFeatureList();
			List<RoomFeature> objFeatures =	objRoomFeatureList.getFeatures();

			RoomFeature objRoomFeature = objFactory.createRoomFeature();
			objRoomFeature.setFeature("LAN");
			objRoomFeature.setDescription("With Pool facility");
			objFeatures.add(objRoomFeature);

			objFetchRoomStatusRequest.setFeatures(objRoomFeatureList);
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusRequest Instace created " );

			String xmlRepresentation = DataUtility.convertToXML( objFetchRoomStatusRequest );
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Request Created " + xmlRepresentation );

			String pmsResponse = objMicrosMessageTransport.handlePMSRequest( xmlRepresentation );
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Response Received " + pmsResponse );

			if( pmsResponse.length() != 0 ) {

				isProcced = true;

				FetchRoomStatusResponse objFetchRoomStatusRespnse = objFactory.createFetchRoomStatusResponse();
				objFetchRoomStatusRespnse = (FetchRoomStatusResponse) DataUtility.covertToObject(objFetchRoomStatusRespnse, pmsResponse);

				objMicrosDAOImpl = new MicrosDAOImpl();

				objMicrosDAOImpl.persistRoomStatusDataInBridgeDB( objFetchRoomStatusRespnse );

				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusResponse Instance Sent to persist " );

			}
		}
		catch( Exception exc) {

			DataHarvesterLogger.logError( OWSDataCollector.class, " makeFetchRoomStatusRequest ", exc);
		}

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Exit makeFetchRoomStatusRequest method " ); 

		return isProcced;

	}

	private final ScheduledExecutorService schedulerInventory = Executors.newScheduledThreadPool(1);

	/**
	 * This method will runs at fixed interval to collect room inventory data 
	 * from the property management system.
	 */
	public void harvestRoomInventoryData() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Enter harvestRoomInventoryData method " );

		int delayTime ;
		int intervalPeriod ;

		final Runnable dataCollerctor = new Runnable() {

			public void run() { 

				boolean success = makeFetcCalendarRequest();
				DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " FetchCalendar Request Made to the OWS " );

				if(success) {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Request Processed Successfully " );
				}
				else {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Sorry Request cannot be processed " );
				}
			}
		};

		delayTime = Integer.parseInt( HarvesterConfigurationReader.getProperty( IMicrosHarvester.ROOM_INVENTORY_THREAD_DELAY) );
		intervalPeriod  = Integer.parseInt( HarvesterConfigurationReader.getProperty(IMicrosHarvester.ROOM_INVENTORY_THREAD_INTERVAL) );

		@SuppressWarnings("unused")
		final ScheduledFuture<?> beeperHandle = schedulerInventory.scheduleAtFixedRate( dataCollerctor, delayTime, intervalPeriod , TimeUnit.SECONDS );

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Exit harvestRoomInventoryData method " );

	} // ends harvestRoomInventoryData

	/**
	 * This method creates instance of FetchCalendar request and make call to the
	 * property management service for details. It collect the response , populate
	 * an instance of FetchCalendar response and pass it to database handler class
	 * to persist the information upload database. 
	 * 
	 * @return
	 */
	private static boolean makeFetcCalendarRequest() {
		
		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetcCalendarRequest ", " Enter makeFetcCalendarRequest method " );

		boolean isProcced = false;

		MicrosMessageTransport objMicrosMessageTransport = null;
		FetchCalendarRequest  objFetchCalendarRequest = null;
		MicrosDAOImpl objMicrosDAOImpl = null;
		AvailabilityServiceStub objAvailabilityServiceStub = null;
		com.micros.availability.AvailabilityServiceStub.OGHeader objOGHeader = null;

		try {

			objAvailabilityServiceStub = new AvailabilityServiceStub();
			objMicrosMessageTransport = new MicrosMessageTransport();

			objFetchCalendarRequest = new FetchCalendarRequest();

			// sets the required attribute values to be true 
			objFetchCalendarRequest.setInventoryMode(true);
			objFetchCalendarRequest.setRoomTypeCode("ALL");
			objFetchCalendarRequest.setRestrictedMode(false);

			// prepares the header of soap message.
			objOGHeader = new com.micros.availability.AvailabilityServiceStub.OGHeader();
			objOGHeader.setTransactionID( "123456" );
			objOGHeader.setTimeStamp( DataUtility.getCalender());

			//prepares origin and destination of the message
			com.micros.availability.AvailabilityServiceStub.EndPoint originEndPoint = new com.micros.availability.AvailabilityServiceStub.EndPoint();
			originEndPoint.setEntityID( "WEBHOTEL" );
			originEndPoint.setSystemType( "WEB" );
			com.micros.availability.AvailabilityServiceStub.EndPoint destEndPoint = new com.micros.availability.AvailabilityServiceStub.EndPoint();
			destEndPoint.setEntityID( "WEBHOTEL" );
			destEndPoint.setSystemType(  "ORS" );

			//add end points to the header.
			objOGHeader.setOrigin(originEndPoint);
			objOGHeader.setDestination(destEndPoint);

			// prepares FetchCalendar request
			com.micros.availability.AvailabilityServiceStub.HotelReference objHotelReference = null;
			objHotelReference = new com.micros.availability.AvailabilityServiceStub.HotelReference();
			objHotelReference.setHotelCode( "WC" );
			objHotelReference.setChainCode( "SEFIVE" );

			//Creates date range.
			TimeSpan objTimeSpan = new TimeSpan();
			objTimeSpan.setStartDate( DataUtility.getCalender() );
			com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0  objTimeSpanAvail = new com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0();
			objTimeSpanAvail.setEndDate( DataUtility.getCalender() );
			objTimeSpan.setTimeSpanChoice_type0(objTimeSpanAvail);
			objFetchCalendarRequest.setStayDateRange(objTimeSpan);
			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusRequest Instace created " );

			XStream objStream = new XStream();

			String xmlRequest = objStream.toXML(objFetchCalendarRequest); 

			objMicrosMessageTransport = new MicrosMessageTransport();
			String pmsResponse = objMicrosMessageTransport.handlePMSRequest(xmlRequest);

			XStream xstream = null;
			xstream = new XStream( new DomDriver());

			FetchCalendarResponse objFuture = new FetchCalendarResponse();
			objFuture =(FetchCalendarResponse)xstream.fromXML( pmsResponse );

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Response Received " + pmsResponse );

			if( pmsResponse.length() != 0 ) {

				isProcced = true;

				objMicrosDAOImpl = new MicrosDAOImpl();

				objMicrosDAOImpl.persistRoomInventoryData( objFuture );

				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetcCalendarRequest ", " makeFetcCalendarRequest Instance Sent to persist " );

			}
		}
		catch( Exception exc) {

			DataHarvesterLogger.logError( OWSDataCollector.class, " makeFetcCalendarRequest ", exc);
		}

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetcCalendarRequest ", " Exit makeFetcCalendarRequest method " ); 

		return isProcced;

	}

}

