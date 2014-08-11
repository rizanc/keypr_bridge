//package com.keypr.webservices.rest.services;
//
//import com.cloudkey.commons.Reservation;
//import com.cloudkey.commons.TimeOutError;
//import com.cloudkey.pms.request.reservations.GetFolioRequest;
//import com.cloudkey.pms.request.reservations.SearchReservationRequest;
//import com.cloudkey.pms.request.reservations.UpdateBookingRequest;
//import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
//import com.cloudkey.pms.response.reservations.GetFolioResponse;
//import com.cloudkey.pms.response.reservations.SearchReservationResponse;
//import com.cloudkey.pms.response.reservations.UpdateBookingResponse;
//import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//
///**
//* This class contains junit test cases to test the web service calls.
//*
//* @author vinayk2
//*
//*/
//
//public class KeyprWebServicesTest {
//
//	protected final Logger log = LoggerFactory.getLogger(getClass());
//
//	/**
//	 * This method test search reservation request to the web service. It has confirmation number for
//	 * making search reservation request. The test case expects only one reservation detail in the response.
//	 */
//	//@Ignore
//	//@Test
//	public void testSearchReservationForConfirmation(){
//
//		log.debug("testSearchReservationForConfirmation: Enter method testSearchReservationForConfirmation ");
//
//		SearchReservationRequest objSearchReservationRequest = null;
//		SearchReservationResponse objSearchReservationResponse = null;
//
//		// For a given confirmation number, we will have only one reservation response
//		objSearchReservationRequest = new SearchReservationRequest("2", null, null, null);
//
//		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);
//
//		if( objSearchReservationResponse.getStatus().equalsIgnoreCase("SUCCESS") ) {
//
//			assertTrue( "Number of reservation",  1 == objSearchReservationResponse.getReservationList().size() );
//
//			assertEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );
//			assertEquals( "2", (objSearchReservationResponse.getReservationList().get(0).getPmsReservationId()));
//
//		}
//		else {
//
//			log.debug("testSearchReservationForConfirmation: Failure From Server ");
//
//			assertTrue( "Number of reservation",  0 == objSearchReservationResponse.getReservationList().size() );
//			assertEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );
//
//		}
//
//		assertNotNull("SearchReservationResponse Instance must not be null " , objSearchReservationResponse );
//		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);
//
//		log.debug("testSearchReservationForConfirmation: Exit method testSearchReservationForConfirmation ");
//	}
//
//	/**
//	 * This method test search reservation request to the web service. It uses combination of first name and
//	 * last name to search reservation. This test case compare the first and last name in each of the reservation
//	 * object received as response.
//	 *
//	 */
//	//@Ignore
//	@Test
//	public void testSearchReservationForWithoutConfirmation() {
//
//		log.debug("testSearchReservationForWithoutConfirmation: Enter method testSearchReservationForWithoutConfirmation ");
//
//		SearchReservationRequest objSearchReservationRequest = null;
//		SearchReservationResponse objSearchReservationResponse = null;
//
//		objSearchReservationRequest = new SearchReservationRequest(null, "robin", "Smith", "1234-1234-1234-1234");
//
//		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);
//
//		assertNotNull("SearchReservationResponse Instance must not be null ", objSearchReservationResponse );
//		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);
//
//		assertEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );
//
//		if ( objSearchReservationResponse.getStatus().equals( "SUCCESS" )) {
//
//			int numbeOfReservations = objSearchReservationResponse.getReservationList().size();
//
//			assertTrue( "Number of reservation", 1 <= numbeOfReservations );
//
//			for( int index = 0; index < numbeOfReservations; index++) {
//
//				assertEquals( "robin", objSearchReservationResponse.getReservationList().get(index).getFirstName());
//				assertEquals( "Smith", objSearchReservationResponse.getReservationList().get(index).getLastName());
//			}
//
//			assertEquals( "XXXX-XXXX-XXXX-1234", objSearchReservationResponse.getReservationList().get(0).getCreditCardNumber());
//		}
//
//		log.debug("testSearchReservationForWithoutConfirmation: Exit method testSearchReservationForWithoutConfirmation ");
//	}
//
//	/**
//	 * This method test search reservation web service method for failure result. This test case
//	 * expects FAILURE from web service end when no parameter is provided by user for search reservation.
//	 */
//	//@Ignore
//	//@Test
//	public void testSearchReservationForFailure() {
//
//		log.debug("testSearchReservationForFailure: Enter method testSearchReservationForFailure ");
//
//		SearchReservationRequest objSearchReservationRequest = null;
//		SearchReservationResponse objSearchReservationResponse = null;
//
//		objSearchReservationRequest = new SearchReservationRequest(null, null, null, null);
//
//		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);
//
//		assertNotNull("SearchReservationResponse Instance must not be null " , objSearchReservationResponse );
//		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);
//
//		assertThat( "SUCCESS" , not(objSearchReservationResponse.getStatus() ));
//		assertEquals( "FAILURE", objSearchReservationResponse.getStatus());
//
//		int numbeOfReservations = objSearchReservationResponse.getReservationList().size();
//
//		assertTrue("Number of reservation", 0 == numbeOfReservations );
//
//		log.debug("testSearchReservationForFailure: Enter method testSearchReservationForFailure ");
//
//	}
//
//	/**
//	 * This test case works to see if the property management system server is shutdown or not. If the server
//	 * is down , then this test case gives positive result otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testSearchReservationForServerShutdown() {
//
//		log.debug("testSearchReservationForServerShutdown: Enter method testSearchReservationForServerShutdown ");
//
//		SearchReservationRequest objSearchReservationRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objSearchReservationRequest = new SearchReservationRequest("200", null, null, null);
//
//		Entity<SearchReservationRequest> entity = Entity.json(objSearchReservationRequest);
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.SEARCH_RESERVATION_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals( "Server Respone Code is 504", "504", objTimeOutError.getCode());
//		assertEquals( " Time Out Error From Server ", objTimeOutError.getMessage());
//
//
//		log.debug("testSearchReservationForServerShutdown: Exit method testSearchReservationForServerShutdown ");
//
//	}
//
//	/**
//	 * This method makes search reservation request to the web service.
//	 *
//	 * @param objSearchReservationRequest
//	 * @return
//	 */
//	private SearchReservationResponse makeSearchReservationRequest( SearchReservationRequest objSearchReservationRequest) {
//
//		log.debug("makeSearchReservationRequest: Enter method makeSearchReservationRequest ");
//
//		Entity<SearchReservationRequest> entity = Entity.json(objSearchReservationRequest);
//
//		Client client = ClientBuilder.newClient();
//
//		WebTarget target = client.target( IWebServiceConstants.SEARCH_RESERVATION_URL );
//
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		SearchReservationResponse objSearchReservationResponse = response.readEntity(SearchReservationResponse.class);
//
//		log.debug("makeSearchReservationRequest: Exit method makeSearchReservationRequest ");
//
//		return objSearchReservationResponse;
//
//	}
//
//	/**
//	 * This test case works to see if the property management system is shutdown or not.
//	 * if server is down then this test case gives positive result otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testGetFolioRequestServerShutdown()
//	{
//		log.debug("testGetFolioRequestServerShutdown: Enter method testGetFolioRequestServerShutdown ");
//
//		GetFolioRequest objGetFolioRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objGetFolioRequest = new GetFolioRequest();
//		objGetFolioRequest.setConfirmationNumber("100");
//
//		Entity<GetFolioRequest> entity = Entity.json(objGetFolioRequest);
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.GET_FOLIO_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals( "Server Respone Code is 504", "504", objTimeOutError.getCode());
//		assertEquals( " Time Out Error From Server ", objTimeOutError.getMessage());
//
//
//		log.debug("testGetFolioRequestServerShutdown: Exit method testGetFolioRequestServerShutdown ");
//
//	}
//
//	/**
//	 * This method test get folio request to the web service. It uses confirmation number to get the details of bill
//	 * against the request confirmation number.
//	 */
//	//@Ignore
//	//@Test
//	public void testGetFolioRequest() {
//
//		log.debug("testGetFolioRequest: Enter method testGetFolioRequest ");
//
//		GetFolioRequest objGetFolioRequest = null;
//		GetFolioResponse objGetFolioResponse = null;
//
//		objGetFolioRequest = new GetFolioRequest();
//		objGetFolioRequest.setConfirmationNumber( "100");
//
//		objGetFolioResponse = makeGetFolioRequest(objGetFolioRequest);
//
//		assertNotNull("GetFolioRequest Instance must not be null " , objGetFolioRequest );
//		assertNotNull( "GetFolioResponse Instance must not be null ",  objGetFolioResponse);
//
//		assertTrue( "Reservation Instance cannot be null " , objGetFolioResponse.getReservation() != null);
//		assertTrue( "First Name cannot be null" , objGetFolioResponse.getReservation().getFirstName() != null);
//		assertTrue ( "LastName cannot be null" , objGetFolioResponse.getReservation().getLastName() != null);
//
//		int numberOfOrder = objGetFolioResponse.getReservationOrderList().size();
//
//		if( numberOfOrder != 0 ){
//
//			for( int index = 0 ; index < numberOfOrder; index++ ){
//
//				assertNotNull( "Total Amount Cannot be Null ", objGetFolioResponse.getReservationOrderList().get(index).getTotalAmount());
//				//assertNotNull( "Order Date Cannot be Null", objGetFolioResponse.getReservationOrderList().get(index).getOrderDate());
//				assertNotNull( "Order List Cannot be Null ", objGetFolioResponse.getReservationOrderList().get(index).getOrderDetailList() );
//				assertThat( "OrderList Cannot be of Size Zero ", 0, not(objGetFolioResponse.getReservationOrderList().get(index).getOrderDetailList().size()));
//
//			}
//		}
//		log.debug("testGetFolioRequest: Exit method testGetFolioRequest ");
//	}
//
//	/**
//	 * This method test get folio request to the web service. This test case checks the failure
//	 * response from the web service. It does not pass any information to the web service while
//	 * making request for get folio.
//	 */
//	//@Ignore
//	//@Test
//	public void testGetFolioRequestForFailure() {
//
//		log.debug("testGetFolioRequestForFailure: Enter method testGetFolioRequestForFailure ");
//
//		GetFolioRequest objGetFolioRequest = null;
//		GetFolioResponse objGetFolioResponse = null;
//
//		objGetFolioRequest = new GetFolioRequest();
//
//		objGetFolioResponse = makeGetFolioRequest(objGetFolioRequest);
//
//		assertNotNull("GetFolioRequest Instance must not be null " , objGetFolioRequest );
//		assertNotNull( "GetFolioResponse Instance must not be null ",  objGetFolioResponse);
//
//		assertTrue( "Reservation Instance should null " , objGetFolioResponse.getReservation() == null);
//		assertEquals( "OrderList Size Zero ", 0, objGetFolioResponse.getReservationOrderList().size());
//
//		log.debug("testGetFolioRequestForFailure: Exit method testGetFolioRequestForFailure ");
//	}
//	/**
//	 * This method makes get folio request to the web service.
//	 *
//	 * @param objGetFolioRequest
//	 * @return
//	 */
//	private GetFolioResponse makeGetFolioRequest( GetFolioRequest objGetFolioRequest) {
//
//		log.debug("makeGetFolioRequest: Enter method makeGetFolioRequest ");
//
//		Entity<GetFolioRequest> entity = Entity.json(objGetFolioRequest);
//
//		Client client = ClientBuilder.newClient();
//
//		WebTarget target = client.target( IWebServiceConstants.GET_FOLIO_URL );
//
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		GetFolioResponse objGetFolioResponse = response.readEntity(GetFolioResponse.class);
//
//		log.debug("makeGetFolioRequest: Exit method makeGetFolioRequest ");
//
//		return objGetFolioResponse;
//	}
//
//	/**
//	 * This test case works to see if the property management system is shutdown or not.
//	 * if the server is down then this test case gives positive response otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testUpdateBookingRequestServerShutdown()
//	{
//		log.debug("testUpdateBookingRequestServerShutdown: Enter method testUpdateBookingRequestServerShutdown ");
//
//		UpdateBookingRequest objUpdateBookingRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objUpdateBookingRequest = new UpdateBookingRequest();
//		objUpdateBookingRequest.setConfirmationNumber("100");
//		objUpdateBookingRequest.setNotes(new String[]{"King","Near Pool"});
//
//		Entity<UpdateBookingRequest> entity = Entity.json(objUpdateBookingRequest);
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.UPDATE_BOOKING_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals( "Server Respone Code is 504", "504", objTimeOutError.getCode());
//		assertEquals( " Time Out Error From Server ", objTimeOutError.getMessage());
//
//
//		log.debug("testUpdateBookingRequestServerShutdown: Exit method testUpdateBookingRequestServerShutdown ");
//
//	}
//
//
//	/**
//	 * This method test update booking request made to the web service.
//	 */
//	//@Test
//	//@Ignore
//	public void testUpdateBookingRequest() {
//
//		log.debug("testUpdateBookingRequest: Enter method testUpdateBookingRequest ");
//
//		UpdateBookingRequest objUpdateBookingRequest = null;
//		UpdateBookingResponse objUpdateBookingResponse = null;
//
//		objUpdateBookingRequest =  new UpdateBookingRequest();
//
//		objUpdateBookingRequest.setConfirmationNumber( "100" );
//
//		String notes[] = new String[]{"KING SIZE", "NEAR POOL"};
//		objUpdateBookingRequest.setNotes(notes);
//
//		objUpdateBookingResponse = makeUpdateBookingRequest(objUpdateBookingRequest);
//
//		assertNotNull( " UpdateBookingRequest Instance must not be null " , objUpdateBookingRequest );
//		assertNotNull( " UpdateBookingResponse Instance must not be null ",  objUpdateBookingResponse);
//
//		assertNotNull( "Reservation Instance in response cannot be null ", objUpdateBookingResponse.getReservation() );
//		assertEquals( "Confirmation must be Same " , "100" , objUpdateBookingResponse.getReservation().getPmsReservationId() );
//
//		String resNotes = objUpdateBookingResponse.getReservation().getNotes();
//
//		assertNotNull( " Notes must not be null " , resNotes );
//
//		String[] messages = resNotes.split(";");
//
//		assertEquals( "First Notes " , "KING SIZE" , messages[0] );
//		assertEquals( "Second Notes " , "NEAR POOL" , messages[1] );
//
//		log.debug("testUpdateBookingRequest: Exit method testUpdateBookingRequest ");
//	}
//	/**
//	 * This method makes update booking request to the web service.
//	 *
//	 * @param objUpdateBookingRequest
//	 * @return
//	 */
//	private UpdateBookingResponse makeUpdateBookingRequest( UpdateBookingRequest objUpdateBookingRequest) {
//
//		log.debug("makeUpdateBookingRequest: Enter method makeUpdateBookingRequest ");
//
//		Entity<UpdateBookingRequest> entity = Entity.json( objUpdateBookingRequest );
//
//		Client client = ClientBuilder.newClient();
//
//		WebTarget target = client.target( IWebServiceConstants.UPDATE_BOOKING_URL );
//
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		UpdateBookingResponse objUpdateBookingResponse = response.readEntity(UpdateBookingResponse.class);
//
//		log.debug("makeUpdateBookingRequest: Exit method makeUpdateBookingRequest ");
//
//		return objUpdateBookingResponse;
//
//	}
//
//	/**
//	 * This Test case works to see if the property management system is shutdown or not.
//	 * if server is down then this test case gives positive result otherwise it fails against junit test case.
//	 */
//
//	//@Test
//	public void testCheckInRequestServerShutdown()
//	{
//		log.debug("testCheckInRequestServerShutdown: Enter method testCheckInRequestServerShutdown");
//
//		CheckInRequest objCheckInRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objCheckInRequest = new CheckInRequest();
//		Reservation objReservation = new Reservation();
//		objReservation.setConfirmationNumber("100");
//		objReservation.setCreditCardNumber("12345");
//		objCheckInRequest.setReservation(objReservation);
//
//		Entity<CheckInRequest> entity = Entity.json(objCheckInRequest);
//
//		Client client=ClientBuilder.newClient();
//		WebTarget target=client.target(IWebServiceConstants.CHECK_IN_URL);
//		Response response =target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals("ServerResponseCode is 504", "504" ,objTimeOutError.getCode());
//		assertEquals(" Time Out Error From Server ", objTimeOutError.getMessage());
//
//		log.debug("testCheckInRequestServerShutdown: Exit method for testCheckInRequestServerShutdown");
//
//	}
//	/**
//	 * This method defines the junit test case for the chekin request call made to the
//	 * web service method.
//	 *
//	 */
//	//@Test
//	@Ignore
//	public void testCheckInRequest() {
//
//		log.debug("testCheckInRequest: Enter method testCheckInRequest ");
//
//		CheckInRequest objCheckInRequest = null;
//		CheckInResponse objCheckInResponse = null;
//
//		objCheckInRequest = new CheckInRequest();
//
//		Reservation objReservation = new Reservation();
//		objReservation.setConfirmationNumber( "100");
//		objReservation.setCreditCardNumber("1234123412341234");
//		objCheckInRequest.setReservation(objReservation);
//
//		objCheckInResponse = makeCheckInRequest(objCheckInRequest);
//
//		assertNotNull( " CheckInRequest Instance must not be null " , objCheckInRequest );
//		assertNotNull( " CheckInResponse Instance must not be null ",  objCheckInResponse);
//
//		assertNotNull( "Reservation Instance in response cannot be null ", objCheckInResponse.getReservation() );
//		assertEquals( "Status Must be Success", "SUCCESS" , objCheckInResponse.getStatus() );
//		assertEquals( "Confirmation must be Same " , "100" , objCheckInResponse.getReservation().getPmsReservationId() );
//		assertEquals( "CreditCardNumebr must be Same " , "1234123412341234" , objCheckInResponse.getReservation().getCreditCardNumber() );
//
//		assertTrue ( "CheckIn Date should not be null ", objCheckInResponse.getReservation().getCheckinDate() != null );
//		assertTrue ( "CheckOut Date should not be null ", objCheckInResponse.getReservation().getCheckoutDate() != null );
//
//		log.debug("testCheckInRequest: Exit method testCheckInRequest ");
//	}
//
//	/**
//	 * This method defines the junit test case for check in request made to the web service
//	 * call, when the user makes request without providing confirmation number.
//	 */
//	//@Test
//	public void testCheckInRequestForFailure() {
//
//		log.debug("testCheckInRequestForFailure: Enter method testCheckInRequestForFailure ");
//
//		CheckInRequest objCheckInRequest = null;
//		CheckInResponse objCheckInResponse = null;
//
//		objCheckInRequest = new CheckInRequest();
//		objCheckInRequest.setReservation( null );
//
//		objCheckInResponse = makeCheckInRequest(objCheckInRequest);
//
//		assertNotNull( " CheckInRequest Instance must not be null ",  objCheckInRequest);
//		assertNotNull( " CheckInResponse Instance must not be null ",  objCheckInResponse);
//
//		assertTrue( "Reservation Instance in response cannot be null ", objCheckInResponse.getReservation() == null );
//		assertEquals( "Status Must be Success", "FAILURE" , objCheckInResponse.getStatus() );
//
//		log.debug("testCheckInRequestForFailure: Exit method testCheckInRequestForFailure ");
//	}
//
//	/**
//	 * This method makes get availability  request to the web service.
//	 *
//	 * @param objCheckInRequest
//	 * @return
//	 */
//	private CheckInResponse makeCheckInRequest( CheckInRequest objCheckInRequest) {
//
//		log.debug("makeCheckInRequest: Enter method makeCheckInRequest ");
//
//		Entity<CheckInRequest> entity = Entity.json( objCheckInRequest );
//
//		Client client = ClientBuilder.newClient();
//
//		WebTarget target = client.target( IWebServiceConstants.CHECK_IN_URL );
//
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		CheckInResponse objCheckInResponse = response.readEntity(CheckInResponse.class);
//
//		log.debug("makeCheckInRequest: Exit method makeCheckInRequest ");
//
//		return objCheckInResponse;
//
//	}
//
//	/**
//	 * This method defines the test case for get availability request for the web service.
//	 *
//	 */
//	//@Test
//	public void testGetAvailabilityRequest() {
//
//		log.debug("testGetAvailabilityRequest: Enter method testGetAvailabilityRequest ");
//
//		GetAvailabilityRequest objGetAvailabilityRequest = null;
//		GetAvailabilityResponse objGetAvailabilityResponse = null;
//
//		objGetAvailabilityRequest = new GetAvailabilityRequest();
//
//		String startDate = ("15-may-2015");
//		String endDate = ("15-jun-2016");
//		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
//
//		GetAvailabilityRequest objAvailabilityRequest = new GetAvailabilityRequest();
//
//		try{
//
//			objGetAvailabilityRequest.setStartDate(df.parse(startDate));
//			objGetAvailabilityRequest.setEndDate(df.parse(endDate));
//
//			objGetAvailabilityResponse = makeGetAvailabilityRequest(objGetAvailabilityRequest);
//
//			assertNotNull( "GetAvailability request instance must not be null ",  objGetAvailabilityRequest );
//			assertNotNull( "GetAvailability response instance must not be null ",  objGetAvailabilityResponse );
//
//			assertEquals( "Response status must be success" , "SUCCESS", objGetAvailabilityResponse.getStatus() );
//		}
//		catch (Exception exc){
//
//			log.error("testGetAvailabilityRequest", exc);
//		}
//
//		log.debug("testGetAvailabilityRequest: Exit method testGetAvailabilityRequest ");
//
//	}
//	/**
//	 * This test case works to see if the property management system server is shutdown or not. If the server
//	 * is down , then this test case gives positive result otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testGetAvailabilityRequestServerShutdown() {
//
//		log.debug("testGetAvailabilityRequestServerShutdown: Enter method testGetAvailabilityRequestServerShutdown ");
//
//		GetAvailabilityRequest objGetAvailabilityRequest=null;
//		TimeOutError objTimeOutError=null;
//
//		String startDate = ("26-may-2015");
//		String endDate = ("28-jun-2016");
//		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
//
//		objGetAvailabilityRequest = new GetAvailabilityRequest();
//
//		try{
//
//			objGetAvailabilityRequest.setStartDate(df.parse(startDate));
//			objGetAvailabilityRequest.setEndDate(df.parse(endDate));
//
//		}
//		catch (Exception exc){
//
//			log.error("testGetAvailabilityRequestServerShutdown", exc);
//		}
//
//		Entity<GetAvailabilityRequest> entity = Entity.json(objGetAvailabilityRequest);
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.GET_AVAILABILITY_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals( "Server Respone Code is 504", "504", objTimeOutError.getCode());
//		assertEquals( " Time Out Error From Server ", objTimeOutError.getMessage());
//
//		log.debug("testGetAvailabilityRequestServerShutdown: Exit method testGetAvailabilityRequestServerShutdown ");
//
//	}
//
//	/**
//	 * This method makes guest check availability request to the web service.
//	 *
//	 * @param objGetAvailabilityRequest
//	 * @return
//	 */
//	private GetAvailabilityResponse makeGetAvailabilityRequest( GetAvailabilityRequest objGetAvailabilityRequest) {
//
//		log.debug("makeGetAvailabilityRequest: Enter method makeGetAvailabilityRequest ");
//
//		Entity<GetAvailabilityRequest> entity = Entity.json( objGetAvailabilityRequest );
//
//		Client client = ClientBuilder.newClient();
//
//		WebTarget target = client.target( IWebServiceConstants.GET_AVAILABILITY_URL );
//
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		GetAvailabilityResponse objGetAvailabilityResponse = response.readEntity(GetAvailabilityResponse.class);
//
//		log.debug("makeGetAvailabilityRequest: Exit method makeGetAvailabilityRequest ");
//
//		return objGetAvailabilityResponse;
//
//	}
//
//
//	/**
//	 * This method makes guest checkout request to the web service.
//	 *
//	 * @param objCheckOutRequest
//	 * @return
//	 */
//	private CheckOutResponse makeCheckOutRequest( CheckOutRequest objCheckOutRequest) {
//
//		log.debug("makeCheckInRequest: Enter method makeCheckInRequest ");
//
//		Entity<CheckOutRequest> entity = Entity.json( objCheckOutRequest );
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.CHECK_OUT_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		CheckOutResponse objCheckOutResponse = response.readEntity(CheckOutResponse.class);
//
//		log.debug("makeCheckInRequest: Enter method makeCheckInRequest ");
//
//		return objCheckOutResponse;
//	}
//
//	/**
//	 * This test case work to see if the property management system is shutdown or not.
//	 * if server is down this testcase positive result otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testCheckOutRequestServerShutdown()
//	{
//		log.debug("testCheckOutRequestServerShutdown: Enter method testCheckOutRequestServerShutdown ");
//
//		CheckOutRequest objCheckOutRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objCheckOutRequest = new CheckOutRequest();
//		objCheckOutRequest.setConfirmationNumber("100");
//
//		Entity<CheckOutRequest> entity = Entity.json(objCheckOutRequest);
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.CHECK_OUT_URL);
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError = response.readEntity(TimeOutError.class);
//
//		assertEquals( "Server Respone Code is 504", "504", objTimeOutError.getCode());
//		assertEquals( " Time Out Error From Server ", objTimeOutError.getMessage());
//
//
//		log.debug("testCheckOutRequestServerShutdown: Exit method testCheckOutRequestServerShutdown ");
//
//	}
//
//	/**
//	 * This method test checkout process on the basis of confirmation number .
//	 * If the user checkout successfully then the result must be success with
//	 * the reservation details.
//	 *
//	 */
//	//@Test
//	//@Ignore
//	public void testCheckOutRequest(){
//
//		log.debug("testCheckOutRequest: Enter method testCheckOutRequest ");
//
//		CheckOutRequest objCheckOutRequest = null;
//		CheckOutResponse objCheckOutResponse = null;
//
//		objCheckOutRequest = new CheckOutRequest();
//		objCheckOutRequest.setConfirmationNumber("100");
//
//		objCheckOutResponse = makeCheckOutRequest(objCheckOutRequest);
//
//		assertNotNull( " CheckOutRequest Instance must not be null " , objCheckOutRequest );
//		assertNotNull( " CheckOutRequest Instance must have confirmation number " , objCheckOutRequest.getPmsReservationId() );
//		assertNotNull( " CheckOutResponse Instance must not be null ",  objCheckOutResponse);
//
//		assertNotNull( "Reservation Instance in response cannot be null ", objCheckOutResponse.getReservation() );
//		assertEquals( "Status Must be Success", "SUCCESS" , objCheckOutResponse.getStatus() );
//		assertEquals( "Confirmation must be Same " , "100" , objCheckOutResponse.getReservation().getPmsReservationId() );
//
//
//		//			assertTrue ( "CheckIn Date should not be null ", objCheckOutResponse.getReservation().getCheckinDate() != null );
//		//			assertTrue ( "CheckOut Date should not be null ", objCheckOutResponse.getReservation().getCheckoutDate() != null );
//
//		log.debug("testCheckOutRequest: Exit method testCheckOutRequest ");
//
//	}
//
//
//	/**
//	 * This method makes request to call the webservice for assign the room .
//	 *
//	 * @param assignRoomRequest
//	 * @return AssignRoomResponse
//	 */
//	private AssignRoomResponse makeAssignRoomRequest( AssignRoomRequest assignRoomRequest) {
//
//		log.debug("makeAssignRoomRequest: Enter method makeAssignRoomRequest ");
//
//		Entity<AssignRoomRequest> entity = Entity.json( assignRoomRequest );
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.ASSIGN_ROOM_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		AssignRoomResponse objAssignRoomResponse = response.readEntity(AssignRoomResponse.class);
//
//		log.debug("makeAssignRoomRequest: Exit method makeAssignRoomRequest ");
//
//		return objAssignRoomResponse;
//	}
//
//	/**
//	 * This test case work to see if the property management system is shut down or not. if server is down then the test case gives positive response
//	 * otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testAssignRoomRequestServerShutdown()
//	{
//		log.debug("testAssignRoomRequestServerShutdown: Enter methodtestAssignRoomRequestServerShutdown ");
//
//		AssignRoomRequest objAssignRoomRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objAssignRoomRequest = new AssignRoomRequest();
//		objAssignRoomRequest.setRoomTypeCode( "KING");
//		Reservation onjReservation = new Reservation();
//		onjReservation.setConfirmationNumber( "100");
//		objAssignRoomRequest.setReservation(onjReservation);
//
//		Entity<AssignRoomRequest>entity = Entity.json(objAssignRoomRequest);
//
//		Client client=ClientBuilder.newClient();
//		WebTarget target=client.target( IWebServiceConstants.ASSIGN_ROOM_URL );
//		Response response=target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError=response.readEntity(TimeOutError.class);
//
//		assertEquals("ServerResponseCode is 504", "504" ,objTimeOutError.getCode());
//		assertEquals(" Time Out Error From Server ", objTimeOutError.getMessage());
//
//		log.debug("testAssignRoomRequestServerShutdown: Exit method for testAssignRoomRequestServerShutdown");
//
//	}
//
//	/**
//	 * This method assign the room
//	 */
//	//@Test
//	public void testAssignRoomRequest(){
//
//		log.debug("testAssignRoomRequest: Enter method testAssignRoomRequest ");
//
//		AssignRoomRequest objAssignRoomRequest = null;
//		AssignRoomResponse objAssignRoomResponse = null;
//
//		objAssignRoomRequest = new AssignRoomRequest();
//		objAssignRoomRequest.setRoomTypeCode("XY");
//
//		Reservation objReservation = new Reservation();
//		objReservation.setConfirmationNumber("100");
//
//		objAssignRoomRequest.setReservation(objReservation);
//
//		objAssignRoomResponse = makeAssignRoomRequest(objAssignRoomRequest);
//
//		assertNotNull( " AssignRoomRequest Instance must not be null " , objAssignRoomRequest );
//		assertNotNull( " AssignRoomRequest Instance must have confirmation number " , objAssignRoomRequest.getReservation().getPmsReservationId() );
//		assertNotNull( " AssignRoomRequest Instance must have room type code " , objAssignRoomRequest.getRoomTypeCode() );
//		assertNotNull( " AssignRoomResponse Instance must not be null ",  objAssignRoomResponse);
//
//		assertNotNull( "Assigned Room Number in  in response cannot be null ", objAssignRoomResponse.getAssignRoomNumber());
//		assertEquals( "Status Must be Success", "SUCCESS" , objAssignRoomResponse.getStatus() );
//
//		log.debug("testAssignRoomRequest: Exit method testAssignRoomRequest ");
//
//	}
//	/**
//	 * This method makes request to call the webservice for Release the room.
//	 * @param releaseRoomRequest
//	 * @return ReleaseRoomResponse
//	 */
//	private ReleaseRoomResponse makeReleaseRoomRequest( ReleaseRoomRequest releaseRoomRequest) {
//
//		log.debug("makeReleaseRoomRequest: Enter method makeReleaseRoomRequest ");
//
//		Entity<ReleaseRoomRequest> entity = Entity.json( releaseRoomRequest );
//
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target( IWebServiceConstants.RELESE_ROOM_URL );
//		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		ReleaseRoomResponse objReleaseRoomResponse = response.readEntity(ReleaseRoomResponse.class);
//
//		log.debug("makeAssignRoomRequest: Exit method makeAssignRoomRequest ");
//
//		return objReleaseRoomResponse;
//	}
//	/**
//	 * This test case work for release a room.
//	 */
//	//@Test
//	public void testReleaseRoomRequest()
//	{
//		log.debug("testReleaseRoomRequest: Enter method testReleaseRoomRequest ");
//
//		ReleaseRoomRequest  objReleaseRoomRequest = null;
//		ReleaseRoomResponse objReleaseRoomResponse = null;
//
//		objReleaseRoomRequest = new ReleaseRoomRequest();
//		objReleaseRoomRequest.setPmsReservationId("111");
//
//		objReleaseRoomResponse = makeReleaseRoomRequest(objReleaseRoomRequest);
//
//		assertNotNull( " ReleaseRoomRequest Instance must not be null " , objReleaseRoomRequest );
//		assertNotNull( " ReleaseRoomResponse Instance must not be null " , objReleaseRoomResponse );
//		assertEquals("SUCCESS", objReleaseRoomResponse.getStatus());
//
//		log.debug("testReleaseRoomRequest: Exit method testReleaseRoomRequest ");
//
//	}
//	/**
//	 * This test case works to see if the property management system is shutdown or not.
//	 * if server is down then this test case give positive result otherwise it fails against junit test case.
//	 */
//	//@Test
//	public void testReleseRoomRequestServerShutdown()
//	{
//		log.debug("testReleseRoomRequestServerShutdown: Enter testReleseRoomRequestServerShutdown ");
//
//		ReleaseRoomRequest objReleaseRoomRequest = null;
//		TimeOutError objTimeOutError = null;
//
//		objReleaseRoomRequest = new ReleaseRoomRequest();
//		objReleaseRoomRequest.setPmsReservationId("111");
//
//		Entity<ReleaseRoomRequest>entity = Entity.json(objReleaseRoomRequest);
//
//		Client client=ClientBuilder.newClient();
//		WebTarget target=client.target( IWebServiceConstants.RELESE_ROOM_URL );
//		Response response=target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);
//
//		objTimeOutError=response.readEntity(TimeOutError.class);
//
//		assertEquals("ServerResponseCode is 504", "504" ,objTimeOutError.getCode());
//		assertEquals(" Time Out Error From Server ", objTimeOutError.getMessage());
//
//
//		log.debug("testReleseRoomRequestServerShutdown: Exit method for testReleseRoomRequestServerShutdown");
//
//
//	}
//
//}
