package com.micros.harvester.communicator;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*import com.micros.adv.reservation.ResvAdvancedServiceStub;
import com.micros.adv.reservation.ResvAdvancedServiceStub.Authentication_type0;
import com.micros.adv.reservation.ResvAdvancedServiceStub.EndPoint;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusRequest;
import com.micros.adv.reservation.ResvAdvancedServiceStub.FetchRoomStatusResponse;
import com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeader;
import com.micros.adv.reservation.ResvAdvancedServiceStub.OGHeaderE;
import com.micros.adv.reservation.ResvAdvancedServiceStub.UserCredentials_type0;*/
import com.micros.availability.AvailabilityServiceStub;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarRequest;
import com.micros.availability.AvailabilityServiceStub.FetchCalendarResponse;
import com.micros.availability.AvailabilityServiceStub.TimeSpan;
import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.DataUtility;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.micros.harvester.util.TransIdGenerator;
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

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool( IMicrosHarvester.COUNT_ONE);

	/**
	 * This method will runs at fixed interval to collect room status data 
	 * from the property management system.
	 */
/*
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
*/

	/**
	 * This method creates instance of FetchRoomStatus request and make call to the
	 * property management service for details. It collect the response , populate
	 * an instance of FetchRoomStatus response and pass it to database handler class
	 * to persist the information in room status upload database. 
	 * 
	 * @return
	 */
/*
	private static boolean makeFetchRoomStatusRequest() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Enter makeFetchRoomStatusRequest method " );

		boolean isProcced = false;

		MicrosMessageTransport objMicrosMessageTransport = null;
		FetchRoomStatusRequest  objFetchRoomStatusRequest = null;
		ResvAdvancedServiceStub objResvAdvancedServiceStub = null;
		MicrosDAOImpl objMicrosDAOImpl = null;

		final long hoursInMillis = IMicrosHarvester.SIXTY_UNITS * IMicrosHarvester.SIXTY_UNITS * IMicrosHarvester.THOUSAND_UNITS;


		try {

			objResvAdvancedServiceStub = new ResvAdvancedServiceStub();
			objMicrosMessageTransport = new MicrosMessageTransport();
			objMicrosDAOImpl = new MicrosDAOImpl();

			objFetchRoomStatusRequest = new FetchRoomStatusRequest();

			// Create a OGHeader 
			OGHeader objOGHeader = new OGHeader();
			int currentTransactionId  = TransIdGenerator.getTransactionId();
			objOGHeader.setTransactionID( String.valueOf(currentTransactionId) );
			objOGHeader.setTimeStamp( DataUtility.getCalender() );

			// Add origin and destination to the OGHeader
			EndPoint origin = new EndPoint();
			origin.setEntityID( HarvesterConfigurationReader.getProperty(IMicrosHarvester.OWS_ORIGIN_ID) );
			origin.setSystemType( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_ORI_SYSTEM_TYPE) );
			objOGHeader.setOrigin( origin);

			EndPoint destination = new EndPoint();
			destination.setEntityID( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_DESTINATION_ID));
			destination.setSystemType( HarvesterConfigurationReader.getProperty(IMicrosHarvester.OWS_ORI_SYSTEM_TYPE));
			objOGHeader.setDestination(destination);

			// Authentication Information
			Authentication_type0 objAType0 = new Authentication_type0();
			UserCredentials_type0 objUCredentials_type0 = new UserCredentials_type0();
			objUCredentials_type0.setUserName( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_USER_NAME));
			objUCredentials_type0.setUserPassword( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_USER_PASS));
			objAType0.setUserCredentials(objUCredentials_type0);

			// Add Authentication to header
			objOGHeader.setAuthentication(objAType0);

			// Set the date range 
			Date currentDate = new Date(); 
			Date updateDate = new Date(currentDate.getTime() +  (IMicrosHarvester.TWENTY_FOUR_UNITS * hoursInMillis)); 

			objFetchRoomStatusRequest.setStartDate(currentDate);
			objFetchRoomStatusRequest.setEndDate(updateDate);

			objFetchRoomStatusRequest.setRoomType("KING");

			OGHeaderE objHeaderE = new OGHeaderE();
			objHeaderE.setOGHeader( objOGHeader );

			//FetchRoomStatusResponse objFStatusResponse = objResvAdvancedServiceStub.fetchRoomStatus(objFetchRoomStatusRequest, objHeaderE);

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusRequest Instace created " );

			XStream objStream = new XStream();

			String xmlRequest = objStream.toXML( objFetchRoomStatusRequest); 

			objMicrosMessageTransport = new MicrosMessageTransport();
			String pmsResponse = objMicrosMessageTransport.handlePMSRequest(xmlRequest);

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Xml Request Created " + xmlRequest );

			XStream xstream = null;
			xstream = new XStream( new DomDriver());

			FetchRoomStatusResponse objFuture = new FetchRoomStatusResponse();
			objFuture =(FetchRoomStatusResponse)xstream.fromXML( pmsResponse );

			if( pmsResponse.length() != IMicrosHarvester.COUNT_ZERO ) {

				isProcced = true;

				objMicrosDAOImpl = new MicrosDAOImpl();

				objMicrosDAOImpl.persistRoomStatusDataInBridgeDB( objFuture );

				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " FetchRoomStatusResponse Instance Sent to persist " );

			}
		}
		catch( Exception exc) {

			DataHarvesterLogger.logError( OWSDataCollector.class, " makeFetchRoomStatusRequest ", exc);
		}

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchRoomStatusRequest ", " Exit makeFetchRoomStatusRequest method " ); 

		return isProcced;

	}
*/

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
			objFetchCalendarRequest.setInventoryMode( true );
			objFetchCalendarRequest.setRoomTypeCode( HarvesterConfigurationReader.getProperty(IMicrosHarvester.ROOM_TYPE_CODE ));
			objFetchCalendarRequest.setRestrictedMode( false );

			// prepares the header of soap message.
			objOGHeader = new com.micros.availability.AvailabilityServiceStub.OGHeader();
			int currentTransactionId  = TransIdGenerator.getTransactionId();
			objOGHeader.setTransactionID( String.valueOf(currentTransactionId) );
			objOGHeader.setTimeStamp( DataUtility.getCalender());

			//prepares origin and destination of the message
			com.micros.availability.AvailabilityServiceStub.EndPoint originEndPoint = new com.micros.availability.AvailabilityServiceStub.EndPoint();
			originEndPoint.setEntityID( HarvesterConfigurationReader.getProperty(IMicrosHarvester.OWS_ORIGIN_ID) );
			originEndPoint.setSystemType( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_ORI_SYSTEM_TYPE) );

			com.micros.availability.AvailabilityServiceStub.EndPoint destEndPoint = new com.micros.availability.AvailabilityServiceStub.EndPoint();
			destEndPoint.setEntityID( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OWS_DESTINATION_ID) );
			destEndPoint.setSystemType( HarvesterConfigurationReader.getProperty(IMicrosHarvester.OWS_ORI_SYSTEM_TYPE) );

			//add end points to the header.
			objOGHeader.setOrigin(originEndPoint);
			objOGHeader.setDestination(destEndPoint);

			// prepares FetchCalendar request
			com.micros.availability.AvailabilityServiceStub.HotelReference objHotelReference = null;

			objHotelReference = new com.micros.availability.AvailabilityServiceStub.HotelReference();
			objHotelReference.setHotelCode( HarvesterConfigurationReader.getProperty(IMicrosHarvester.HOTEL_CODE));
			objHotelReference.setChainCode( HarvesterConfigurationReader.getProperty( IMicrosHarvester.CHAIN_CODE) );

			//Creates date range.
			TimeSpan objTimeSpan = new TimeSpan();

			Calendar currentCalendar = Calendar.getInstance();
			currentCalendar.setTime(new Date()); 
			currentCalendar.add(Calendar.HOUR_OF_DAY, 24); 
			Date updatedDate = currentCalendar.getTime();
			Calendar updatedCal = Calendar.getInstance();
			updatedCal.setTime(updatedDate);

			objTimeSpan.setStartDate( currentCalendar );
			com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0  objTimeSpanAvail = new com.micros.availability.AvailabilityServiceStub.TimeSpanChoice_type0();
			objTimeSpanAvail.setEndDate( updatedCal );
			objTimeSpan.setTimeSpanChoice_type0(objTimeSpanAvail);
			objFetchCalendarRequest.setStayDateRange(objTimeSpan);

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetcCalendarRequest ", " makeFetcCalendarRequest Instace created " );

			XStream objStream = new XStream();

			String xmlRequest = objStream.toXML(objFetchCalendarRequest); 

			objMicrosMessageTransport = new MicrosMessageTransport();
			String pmsResponse = objMicrosMessageTransport.handlePMSRequest(xmlRequest);

			XStream xstream = null;
			xstream = new XStream( new DomDriver());

			FetchCalendarResponse objFuture = new FetchCalendarResponse();
			objFuture =(FetchCalendarResponse)xstream.fromXML( pmsResponse );

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetcCalendarRequest ", " Xml Response Received " + pmsResponse );

			if( pmsResponse.length() != IMicrosHarvester.COUNT_ZERO ) {

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

