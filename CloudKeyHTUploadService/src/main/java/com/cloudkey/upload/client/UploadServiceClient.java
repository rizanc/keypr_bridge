package com.cloudkey.upload.client;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;
import com.cloudkey.upload.constant.IUploadConstants;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.sun.jersey.api.client.Client;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * this class acts as a web service client to invoke the service of Keypr for posting the updated data from UploadQueue
 * and expecting response from Keypr service as Success and Failure.
 *
 * @author ektas
 */
@Singleton
public class UploadServiceClient {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	private static String result = IUploadConstants.WEB_SERVICE_RESULT_FAILURE;

	@Inject
	@Named("keypr.bridge.upload.reservation.url")
	private String reservationUploadUrl;

	@Inject
	@Named("keypr.bridge.upload.reservation.key")
	private String reservationKey;

	@Inject
	@Named("keypr.bridge.upload.roomstatus.url")
	private String roomstatusUploadUrl;

	@Inject
	@Named("keypr.bridge.upload.roomstatus.key")
	private String roomstatusKey;

	@Inject
	@Named("keypr.bridge.upload.inventory.url")
	private String inventoryUploadUrl;

	@Inject
	@Named("keypr.bridge.upload.inventory.key")
	private String inventoryKey;

	@Inject
	@Named("keypr.bridge.upload.size.key")
	private String sizeKey;

	// UploadServiceClient method to invoke the keypr web service for RoomDetails
	public String invokeRoomdetails(List<RoomDetails> roomdetailsList, int size) {

		log.info(" invokeRoomdetails ", " enter method invokeRoomdetails ");
		log.info(" invokeRoomdetails ", " Room Details List Size " + size);

		try {
			int statusCode = makeJSONRequest(roomstatusUploadUrl, roomstatusKey, roomdetailsList, size);

			log.info("invokeRoomdetails", " Status Code " + statusCode);

			result = getStatus(statusCode);

			log.info("invokeRoomdetails ", " keypr web service returns " + result);
		} catch (Exception exc) {
			log.error(" invokeRoomdetails ", exc);
		}

		log.info(" invokeRoomdetails ", " exit method invokeRoomdetails ");

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for invokeRoomInventory .
	public String invokeRoomInventory(List<RoomTypeInventory> roominventorydetailsList, int size) {

		log.info("invokeRoomInventory", " enter method invokeRoomInventory ");
		log.info("invokeRoomInventory", " Room Inventory List Size " + size);

		try {

			int statusCode = makeJSONRequest(inventoryUploadUrl, inventoryKey, roominventorydetailsList, size);

			log.info("invokeRoomInventory", " Status Code " + statusCode);

			result = getStatus(statusCode);

			log.info("invokeRoomInventory", " keypr web service returns " + result);
		} catch (Exception exc) {

			log.error(" invokeRoomInventory ", exc);
		}

		log.info("invokeRoomInventory", " exit method invokeRoomInventory ");

		return result;
	}

	// UploadServiceClient method to invoke the keypr web services for reservation .
	public String invokeReservation(List<Reservation> reservationList, int size) {

		log.info("invokeReservation", " enter method invokeReservation ");
		log.info("invokeReservation", " Reservation List Size " + size);

		try {

			// To make call the keypr service with the reservation data list and list size.
			int statusCode = makeJSONRequest(reservationUploadUrl, reservationKey, reservationList, size);

			log.info("invokeReservation", " Status Code " + statusCode);

			result = getStatus(statusCode);

			log.info("invokeReservation", " keypr web service returns " + result);
		} catch (Exception exc) {

			log.error(" invokeReservation ", exc);
		}

		log.info("invokeReservation", " exit method invokeReservation ");

		return result;
	}

	//static	int count= 0;

	/**
	 * This method will return the status received from the keypr service
	 * on the basis of status code.
	 *
	 * @param statusCode
	 * @return String
	 */
	private String getStatus(int statusCode) {
		log.info("getStatus", " enter method getStatus ");

		String status;

		/*// For testing.	
		if(count < 4) {		
			status = "failure";
			count++;
		}
		else{			
			status = "success";	
		}*/

		if (statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS_CODE) {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_SUCCESS;
		} else if (statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE_CODE_1 || statusCode == IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE_CODE_2) {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE;
		} else {

			status = IUploadConstants.KEYPR_SERVICE_STATUS_FAILURE;
		}

		log.info("getStatus", " Status " + status);
		log.info("getStatus", " exit method getStatus ");

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
	@SuppressWarnings({"unchecked", "rawtypes"})
	private int makeJSONRequest(String url, String listKey, List list, int size) {
		log.info("makeJSONRequest", " enter method makeJSONRequest ");
		log.info("makeJSONRequest", " URL  " + url);

		// create an instance of Web Service Client.
		Client webClient = Client.create();

		JSONObject jsonObject = new JSONObject();
		jsonObject.put(listKey, list);
		jsonObject.put(sizeKey, size);

		log.info("makeJSONRequest", " json object created ");

		Response response = webClient.resource(url)
			.accept(MediaType.APPLICATION_JSON_TYPE)
			.type(MediaType.APPLICATION_JSON_TYPE)
			.post(Response.class, jsonObject.toJSONString());

		log.info("makeJSONRequest", "Status Code" + response.getStatus());

		return response.getStatus();
	}
}
