package com.micros.harvester.communicator;

import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpanChoice_type0;
import com.cloudkey.pms.micros.ows.OWSTools;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE;
import com.cloudkey.pms.micros.services.AvailabilityService;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.logger.DataHarvesterLogger;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * This class will make request to the property management system to
 * gather information related to reservation , room status and room inventory.
 * It will collect the detail and upload the data in the corresponding upload
 * queue , from where in data will be send to the keypr.
 * 
 * @author vinayk2
 *
 */
public class OWSDataCollector extends OWSTools {

	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	@Inject
	protected IMicrosDAO microsDAO;

	@Inject
	@Named("keypr.bridge.micros.harvester.inventory.timer.delay")
	protected long timerDelay;

	@Inject
	@Named("keypr.bridge.micros.harvester.inventory.timer.interval")
	protected long timerInterval;

	@Inject
	protected AvailabilityService availabilityService;

	/**
	 * This method will runs at fixed interval to collect room status data 
	 * from the property management system.
	 */
	/*
	public void harvestRoomStatusData() {

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomStatusData ", " Enter harvestRoomStatusData method " );

		int delayTime;
		int intervalPeriod;

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
		FetchRoomStatusRequest objFetchRoomStatusRequest = null;
		ResvAdvancedServiceStub objResvAdvancedServiceStub = null;

		final long hoursInMillis = IMicrosHarvester.SIXTY_UNITS * IMicrosHarvester.SIXTY_UNITS * IMicrosHarvester.THOUSAND_UNITS;


		try {

			objResvAdvancedServiceStub = new ResvAdvancedServiceStub();
			objMicrosMessageTransport = new MicrosMessageTransport();

			objFetchRoomStatusRequest = new FetchRoomStatusRequest();

			// Create a OGHeader 
			OGHeader objOGHeader = new OGHeader();
			objOGHeader.setTransactionID(UUID.randomUUID().toString());
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
			OGHeaderAuthentication objAType0 = new OGHeaderAuthentication();
			OGHeaderAuthenticationUserCredentials objUCredentials_type0 = new OGHeaderAuthenticationUserCredentials();
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

			if( pmsResponse.length() != 0 ) {

				isProcced = true;

				microsDAO.persistRoomStatusDataInBridgeDB( objFuture );

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

		final Runnable dataCollector = new Runnable() {

			public void run() {

				boolean success = makeFetchCalendarRequest();
				DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " FetchCalendar Request Made to the OWS " );

				if(success) {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Request Processed Successfully " );
				}
				else {

					DataHarvesterLogger.logInfo( OWSDataCollector.class, " harvestRoomInventoryData ", " Sorry Request cannot be processed " );
				}
			}
		};

		@SuppressWarnings("unused")
		final ScheduledFuture<?> beeperHandle = schedulerInventory.scheduleAtFixedRate( dataCollector, timerDelay, timerInterval , TimeUnit.SECONDS );

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
	private boolean makeFetchCalendarRequest() {
		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchCalendarRequest ", " Enter makeFetchCalendarRequest method " );

		boolean isProceed = false;

		FetchCalendarRequest objFetchCalendarRequest;

		try {
			objFetchCalendarRequest = new FetchCalendarRequest();

			// sets the required attribute values to be true 
			objFetchCalendarRequest.setInventoryMode(true);
			objFetchCalendarRequest.setRoomTypeCode(roomTypeCode);
			objFetchCalendarRequest.setRestrictedMode(false);
			objFetchCalendarRequest.setHotelReference(getDefaultHotelReference());

			//Creates date range.
			TimeSpan objTimeSpan = new TimeSpan();

			Calendar currentCalendar = Calendar.getInstance();
			currentCalendar.setTime(new Date()); 
			currentCalendar.add(Calendar.HOUR_OF_DAY, 24); 
			Date updatedDate = currentCalendar.getTime();
			Calendar updatedCal = Calendar.getInstance();
			updatedCal.setTime(updatedDate);

			objTimeSpan.setStartDate( currentCalendar );
			TimeSpanChoice_type0 objTimeSpanAvail = new TimeSpanChoice_type0();
			objTimeSpanAvail.setEndDate( updatedCal );
			objTimeSpan.setTimeSpanChoice_type0(objTimeSpanAvail);
			objFetchCalendarRequest.setStayDateRange(objTimeSpan);

			FetchCalendarRequestE requestE = new FetchCalendarRequestE();
			requestE.setFetchCalendarRequest(objFetchCalendarRequest);
			FetchCalendarResponseE fetchCalendarResponseE = availabilityService.fetchCalendar(requestE, createOGHeaderE());

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchCalendarRequest ", " makeFetchCalendarRequest Instace created " );

			FetchCalendarResponse response = fetchCalendarResponseE.getFetchCalendarResponse();

			DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchCalendarRequest ", " Xml Response Received " + response );

			if (response.getResult().getResultStatusFlag() == ResultStatusFlag.SUCCESS) {
				isProceed = true;

				microsDAO.persistRoomInventoryData(response);

				DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchCalendarRequest ", " makeFetchCalendarRequest Instance Sent to persist " );
			}
		} catch (Exception exc) {
			DataHarvesterLogger.logError( OWSDataCollector.class, " makeFetchCalendarRequest ", exc);
		}

		DataHarvesterLogger.logInfo( OWSDataCollector.class, " makeFetchCalendarRequest ", " Exit makeFetchCalendarRequest method " );

		return isProceed;
	}

}

