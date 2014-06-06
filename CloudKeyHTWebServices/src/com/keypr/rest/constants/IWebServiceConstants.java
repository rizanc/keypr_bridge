package com.keypr.rest.constants;

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
	
	String GET_AVAILABILITY_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getAvailability";
	String RELESE_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/releaseRoom";
	
	String UPDATE_BOOKING_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updateBooking" ;
	String UPDATE_PAYMENT_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updatePayment";
	
	String ASSIGN_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/assignRoom";
	
	Integer RESPONSE_STATUS = 200;
	Integer RESPONSE_STATUS_TIMER = 504;
}
