package com.cloudkey.upload.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.xml.DOMConfigurator;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.logger.MessageLogger;

/**this class acts as a web service client to invoke the service of Keypr for posting the updated data from UploadQueue 
 * and expecting response from Keypr service as Success and Failure.
 * 
 * @author ektas 
 *
 */

public class UploadServiceClient {

	private static String result = "failure";

	static {

		DOMConfigurator.configure("res/log4j.xml");
	}

	// UploadServiceClient method to invoke the keypr web service for RoomDetails
	public static String invokeRoomdetails( List<RoomDetails> roomdetailsList, int size ) {

		MessageLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " enter method invokeRoomdetails " );

		// create an instance of Keypr Web Service Client.
		Client webClient = ClientBuilder.newClient();

		try {

			WebTarget target = webClient.target( "http://localhost:8080/UploadServiceRest/keyservice/Service/uploadRoomInfoList/" + size );

			Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );
			result = invocationBuilder.post( Entity.entity( roomdetailsList, MediaType.APPLICATION_JSON_TYPE ), String.class );

		}
		catch( Exception ex ) {

			MessageLogger.logError( UploadServiceClient.class, " invokeRoomdetails ", ex );
		}

		MessageLogger.logInfo(UploadServiceClient.class,  "invokeRoomdetails ", " keypr web service returns " + result );
		MessageLogger.logInfo( UploadServiceClient.class, " invokeRoomdetails ", " exit method invokeRoomdetails " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr webservices for invokeRoomInventory .
	public static String invokeRoomInventory( List<RoomTypeInventory> roominventorydetailsList, int size ) {

		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " enter method invokeRoomInventory " );

		// create an instance of Web Service Client.
		Client	webClient = ClientBuilder.newClient();

		try {

			WebTarget target = webClient.target( "http://localhost:8080/UploadServiceRest/keyservice/Service/uploadRoomInventoryDetailsList/" + size);

			Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );
			result = invocationBuilder.post( Entity.entity( roominventorydetailsList, MediaType.APPLICATION_JSON_TYPE ), String.class );
		}
		catch( Exception ex ) {

			MessageLogger.logError( UploadServiceClient.class, " invokeRoomInventory ", ex );
		}

		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " keypr web service returns " + result );
		MessageLogger.logInfo( UploadServiceClient.class, "invokeRoomInventory", " exit method invokeRoomInventory " );

		return result;
	}

	// UploadServiceClient method to invoke the keypr webservices for reservation .
		public static String invokeReservation( List<Reservation> reservationList, int size ) {

			MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " enter method invokeReservation " );

			// create an instance of Web Service Client.
			Client	webClient = ClientBuilder.newClient();

			try {

				WebTarget target = webClient.target( "http://localhost:8080/UploadServiceRest/keyservice/Service/uploadReservationyList/" + size);

				Builder	invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );
				result = invocationBuilder.post( Entity.entity( reservationList, MediaType.APPLICATION_JSON_TYPE ), String.class );
			}
			catch( Exception ex ) {

				MessageLogger.logError( UploadServiceClient.class, " invokeReservation ", ex );
			}

			MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " keypr web service returns " + result );
			MessageLogger.logInfo( UploadServiceClient.class, "invokeReservation", " exit method invokeReservation " );

			return result;
		}
	
	
	
}
