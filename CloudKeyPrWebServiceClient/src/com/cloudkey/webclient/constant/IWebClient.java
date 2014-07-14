package com.cloudkey.webclient.constant;

/**
 * This interface stores constants to be used by the web client.
 * 
 * @author vinayk2
 *
 */
public interface IWebClient {
	
	String SEARCH_RESERVATION_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/searchReservation";
	String CHECK_IN_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkIn";
	
	String CHECK_OUT_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkOut";
	String GET_FOLIO_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getFolio";
	
	String GET_AVAILABILITY_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getAvailability";
	String RELESE_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/releaseRoom";
	
	String UPDATE_BOOKING_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updateBooking" ;
	String UPDATE_PAYMENT_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updatePayment";
	
	String ASSIGN_ROOM_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/assignRoom";
	String HOTEL_INFORMATION_URL ="http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/hotelInformation";
	String MEMBER_POINT_URL ="http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/memberPoints";
	
	String MEETING_INFORMATION_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/meetingRoom";
	String GUEST_MEMBERSHIP_URL = "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/guestMembership";
	
	Long COUNT_ONE = 1L;
	
	String COMMAND_COUNT_ONE = "1";
	String COMMAND_COUNT_TWO = "2";
	String COMMAND_COUNT_THREE = "3";
	String COMMAND_COUNT_FOUR = "4";
	String COMMAND_COUNT_FIVE = "5";
	String COMMAND_COUNT_SIX = "6";
	String COMMAND_COUNT_SEVEN = "7";
	String COMMAND_COUNT_EIGHT = "8";
	String COMMAND_COUNT_NINE = "9";
	String COMMAND_COUNT_TEN = "10";
	String COMMAND_COUNT_ELEVEN =  "11";
	String COMMAND_COUNT_TWELVE = "12";

}
