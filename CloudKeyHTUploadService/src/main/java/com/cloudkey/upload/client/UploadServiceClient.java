package com.cloudkey.upload.client;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.logger.UploadServiceLogger;
import com.cloudkey.upload.utility.UploadConfigurationReader;
import com.sun.jersey.api.client.Client;
import org.json.simple.JSONObject;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * this class acts as a web service client to invoke the service of Keypr for posting the updated data from UploadQueue 
 * and expecting response from Keypr service as Success and Failure.
 * 
 * @author ektas
 */
public class UploadServiceClient {

	private static String result = IUploadConstants.WEB_SERVICE_RESULT_FAILURE;

	// UploadServiceClient method to invoke the keypr web service for RoomDetails
	public static String invokeRoomdetails( List<RoomDetails> roomdetailsList, int size ) {

		UploadServiceLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " enter method invokeRoomdetails " );
		UploadServiceLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " Room Details List Size " + size );

		try {

			int statusCode = makeJSONRequest( UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_ROOM_STATUS_URL ), UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_ROOM_LIST_KEY ) , roomdetailsList, size );

			UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomdetails", " Status Code " + statusCode );

			result  = getStatus( statusCode );

			UploadServiceLogger.logInfo( UploadServiceClient.class,  "invokeRoomdetails ", " keypr web service returns " + result );

		}
		catch( Exception exc ) {

			UploadServiceLogger.logError( UploadServiceClient.class, " invokeRoomdetails ", exc );
		}

		UploadServiceLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " exit method invokeRoomdetails " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for invokeRoomInventory .
	public static String invokeRoomInventory( List<RoomTypeInventory> roominventorydetailsList, int size ) {

		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " enter method invokeRoomInventory " );
		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " Room Inventory List Size " + size );

		try {

			int statusCode = makeJSONRequest( UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_ROOM_INVENTORY_URL ), UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_ROOMIN_LIST_KEY ) , roominventorydetailsList , size );

			UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " Status Code " + statusCode );

			result  = getStatus( statusCode );

			UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " keypr web service returns " + result );
		}
		catch( Exception exc ) {

			UploadServiceLogger.logError( UploadServiceClient.class, " invokeRoomInventory ", exc );
		}	

		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " exit method invokeRoomInventory " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for reservation .
	public static String invokeReservation( List<Reservation> reservationList, int size ) {

		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeReservation", " enter method invokeReservation " );
		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeReservation", " Reservation List Size " + size ) ;

		try {

			// To make call the keypr service with the reservation data list and list size.
			int statusCode = makeJSONRequest( UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_RESERVATION_URL ), UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_RESV_LIST_KEY ) , reservationList , size );

			UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeReservation", " Status Code " + statusCode ) ;

			result  = getStatus( statusCode );

			UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeReservation", " keypr web service returns " + result ) ;
		}
		catch( Exception exc ) {

			UploadServiceLogger.logError( UploadServiceClient.class, " invokeReservation ", exc ) ;
		}

		UploadServiceLogger.logInfo( UploadServiceClient.class, "invokeReservation", " exit method invokeReservation " ) ;

		return result ;
	}

	//static	int count= 0;
	/**
	 * This method will return the status received from the keypr service
	 *  on the basis of status code.
	 * 
	 * @param statusCode
	 * @return String
	 */
	private static String getStatus( int statusCode ) {

		UploadServiceLogger.logInfo( UploadServiceClient.class, "getStatus", " enter method getStatus " ) ;

		String status = null ;

		/*// For testing.	
		if(count < 4) {		
			status = "failure";
			count++;
		}
		else{			
			status = "success";	
		}*/

		if( statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS_CODE ) {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS ;
		}
		else if( statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE_CODE_1 || statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE_CODE_2 ) {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE ;
		}
		else {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE ;
		}

		UploadServiceLogger.logInfo( UploadServiceClient.class, "getStatus", " Status " + status ) ;
		UploadServiceLogger.logInfo( UploadServiceClient.class, "getStatus", " exit method getStatus " ) ;

		return status ;
	}

	/**
	 * This method will return the status code by making the request on the url ,
	 * list and the size of list.
	 * 
	 * @param url
	 * @param list
	 * @param size
	 * @return int
	 */
	@SuppressWarnings( { "unchecked", "rawtypes" } )
	private static int makeJSONRequest( String url , String listKey , List list , int size ) {

		UploadServiceLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " enter method makeJSONRequest " ) ;

		int statusCode = IUploadConstants.COUNT_ZERO ;

		// create an instance of Web Service Client.
		Client webClient = Client.create();

		UploadServiceLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " URL  " + url ) ;

        JSONObject jsonObject = new JSONObject() ;

		jsonObject.put( listKey, list ) ;
		jsonObject.put( UploadConfigurationReader.getProperty( IUploadConstants.KEYPR_SIZE_KEY )  , size ) ;

		UploadServiceLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " json object created " ) ;

        Response response = webClient.resource(url)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .post(Response.class, jsonObject.toJSONString());

        statusCode = response.getStatus();

		UploadServiceLogger.logInfo( UploadServiceClient.class, "makeJSONRequest" , " Status Code  " + statusCode ) ;

		return statusCode ;

	}

}
