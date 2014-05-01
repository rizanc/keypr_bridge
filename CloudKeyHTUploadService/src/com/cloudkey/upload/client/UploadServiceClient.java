package com.cloudkey.upload.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.logger.MessageLogger;
import com.cloudkey.upload.constant.IUploadConstants;
import com.cloudkey.upload.utility.UploadConfigurationReader;

/**this class acts as a web service client to invoke the service of Keypr for posting the updated data from UploadQueue 
 * and expecting response from Keypr service as Success and Failure.
 * 
 * @author ektas 
 *
 */

public class UploadServiceClient {

	private static String result = "failure";



	// UploadServiceClient method to invoke the keypr web service for RoomDetails
	public static String invokeRoomdetails( List<RoomDetails> roomdetailsList, int size ) {

		MessageLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails !!", " enter method invokeRoomdetails " +size);
		
		try{
			
			int statusCode = makeJSONRequest(UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_ROOM_STATUS_URL), roomdetailsList, size);
			
			Client	webClient = ClientBuilder.newClient();
			WebTarget target = webClient.target( UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_ROOM_STATUS_URL) );
			
			Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

			JSONObject jsonObject = new JSONObject();
			
			jsonObject.put("rooms" , roomdetailsList );
			jsonObject.put("size"  , size );
			
			MessageLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " json object created " );
			
			Response response = invocationBuilder.post( Entity.entity( jsonObject , MediaType.APPLICATION_JSON_TYPE ), Response.class );
			statusCode = response.getStatus();
			      
			
			MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomdetails", " Status Code " + statusCode );
			
			 result  = getStatus( statusCode );
			
			}
		catch(Exception exc){
			
			MessageLogger.logError( UploadServiceClient.class, " invokeRoomdetails ", exc );
		}

		MessageLogger.logInfo( UploadServiceClient.class,  "invokeRoomdetails ", " keypr web service returns " + result );
		MessageLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " exit method invokeRoomdetails " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for invokeRoomInventory .
	public static String invokeRoomInventory( List<RoomTypeInventory> roominventorydetailsList, int size ) {

		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " enter method invokeRoomInventory " );
		
		try{
			
			int statusCode = makeJSONRequest(UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_ROOM_INVENTORY_URL), roominventorydetailsList , size);
			/*=====================================================================================================*/
			Client	webClient = ClientBuilder.newClient();
			WebTarget target = webClient.target( UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_ROOM_INVENTORY_URL) );
			
			Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

			JSONObject jsonObject = new JSONObject();
			
			jsonObject.put("rooms" , roominventorydetailsList );
			jsonObject.put("size"  , size );
			
			MessageLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " json object created " );
			
			Response response = invocationBuilder.post( Entity.entity( jsonObject , MediaType.APPLICATION_JSON_TYPE ), Response.class );
			statusCode = response.getStatus();
			      
			/*=====================================================================================================*/
			MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " Status Code " + statusCode );
			
			 result  = getStatus( statusCode );
			
		}
		catch(Exception exc){
		
			MessageLogger.logError( UploadServiceClient.class, " invokeRoomInventory ", exc);
		}	
		
		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " keypr web service returns " + result );
		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " exit method invokeRoomInventory " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for reservation .
	public static String invokeReservation( List<Reservation> reservationList, int size ) {

		MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " enter method invokeReservation " +size);
		try {

			// To make call the keypr service with the reservation data list and list size.
			int statusCode = makeJSONRequest(UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_RESERVATION_URL) , reservationList , size);			
			MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " Status Code " + statusCode );
			
			 result  = getStatus( statusCode );
			
		}
		catch( Exception exc ) {

			MessageLogger.logError( UploadServiceClient.class, " invokeReservation ", exc );
		}

		MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " keypr web service returns " + result );
		MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " exit method invokeReservation " );

		return result;
	}


	/**
	 * This method will return the status received from the keypr service
	 *  on the basis of status code.
	 * 
	 * @param statusCode
	 * @return String
	 */
	private static String getStatus(int statusCode) {
		
		MessageLogger.logInfo( UploadServiceClient.class, "getStatus", " enter method getStatus " );
		String status = null ;
	
		if(statusCode == 204){ // It will be 204.
			
			status = "success";
		}
		else if(statusCode == 400 || statusCode == 409) {
		
			status = "failure";
		}
		else{
			
			status = "failure";	
		}
		
		MessageLogger.logInfo( UploadServiceClient.class, "getStatus", " Status " + status);
		MessageLogger.logInfo( UploadServiceClient.class, "getStatus", " exit method getStatus ");
		return status;
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
	@SuppressWarnings("unchecked")
	private static int makeJSONRequest(String url , List list , int size){

		MessageLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " enter method makeJSONRequest " );

		Response response = null;
		int statusCode = 0;

		// create an instance of Web Service Client.
		Client	webClient = ClientBuilder.newClient();
		WebTarget target = webClient.target( url );
		
		MessageLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " URL  " + url);
		
		Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put(UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_LIST_KEY) , list );
		jsonObject.put(UploadConfigurationReader.getProperty(IUploadConstants.KEYPR_SIZE_KEY)  , size );
		
		MessageLogger.logInfo( UploadServiceClient.class,  "makeJSONRequest" , " json object created " );
		
		response = invocationBuilder.post( Entity.entity( jsonObject , MediaType.APPLICATION_JSON_TYPE ), Response.class );
		statusCode = response.getStatus();
		
		MessageLogger.logInfo( UploadServiceClient.class, "makeJSONRequest" , " Status Code for reservation data " + statusCode );
		
		return statusCode;

	}


}
