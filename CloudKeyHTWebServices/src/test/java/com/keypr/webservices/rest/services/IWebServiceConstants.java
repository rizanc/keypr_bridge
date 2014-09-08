package com.keypr.webservices.rest.services;

/**
 * This interface stores constants to be used by the web service.
 * 
 * @author vinayk2
 *
 */
public interface IWebServiceConstants {
	
	String SEARCH_RESERVATION_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/searchReservation";
	String CHECK_IN_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkIn";
	
	String CHECK_OUT_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkOut";
	String GET_FOLIO_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getFolio";
	
	String GET_AVAILABILITY_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/availability";
	String RELESE_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/releaseRoom";
	
	String UPDATE_BOOKING_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/addReservationNotes" ;
	String UPDATE_PAYMENT_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updatePayment";
	
	String ASSIGN_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/assignRoom";
	
	String DEFAULT_CREDITCARD_NUMBER = "0000";
	
	Integer RESPONSE_STATUS = 200;
	Integer RESPONSE_STATUS_TIMEOUT = 504;
}
