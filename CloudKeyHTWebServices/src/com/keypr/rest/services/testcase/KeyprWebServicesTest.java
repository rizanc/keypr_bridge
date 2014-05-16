package com.keypr.rest.services.testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Ignore;
import org.junit.Test;

import com.cloudkey.commons.Reservation;
import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.keypr.web.logger.WebAppLogger;

/**
 * This class contains junit test cases to test the web service calls.
 * 
 * @author vinayk2
 *
 */

public class KeyprWebServicesTest {

	/**
	 * This method test search reservation request to the web service. It has confirmation number for
	 * making search reservation request. The test case expects only one reservation detail in the response.
	 */
	//@Ignore
	//@Test
	public void testSearchReservationForConfirmation(){

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForConfirmation ", " Enter method testSearchReservationForConfirmation " );

		SearchReservationRequest objSearchReservationRequest = null;
		SearchReservationResponse objSearchReservationResponse = null;

		objSearchReservationRequest = new SearchReservationRequest();
		// For a given confirmation number, we will have only one reservation response
		objSearchReservationRequest.setConfirmationNumber("100");

		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);

		if( objSearchReservationResponse.getStatus().equalsIgnoreCase("SUCCESS") ) {

			assertTrue( "Number of reservation",  1 == objSearchReservationResponse.getReservationList().size() );

			assertEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );
			assertEquals( 100, Integer.parseInt(objSearchReservationResponse.getReservationList().get(0).getConfirmationNumber()) );

		}

		assertNotNull("SearchReservationResponse Instance must not be null " , objSearchReservationResponse );
		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForConfirmation ", " Exit method testSearchReservationForConfirmation " );
	}

	/**
	 * This method test search reservation request to the web service. It uses combination of first name and
	 * last name to search reservation. This test case compare the first and last name in each of the reservation
	 * object received as response. 
	 * 
	 */
	//@Ignore
	//@Test
	public void testSearchReservationForWithoutConfirmation() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForWithoutConfirmation ", " Enter method testSearchReservationForWithoutConfirmation " );

		SearchReservationRequest objSearchReservationRequest = null;
		SearchReservationResponse objSearchReservationResponse = null;

		objSearchReservationRequest = new SearchReservationRequest();
		objSearchReservationRequest.setFirstName( "robin" );
		objSearchReservationRequest.setLastName( "Smith" );
		objSearchReservationRequest.setCreditCardNumber( "1234123412341234");

		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);

		assertNotNull("SearchReservationResponse Instance must not be null " , objSearchReservationResponse );
		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);

		assertEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );

		if ( objSearchReservationResponse.getStatus().equals( "SUCCESS" )) {

			int numbeOfReservations = objSearchReservationResponse.getReservationList().size();

			assertTrue("Number of reservation", 1 <= numbeOfReservations );

			for( int index = 0; index < numbeOfReservations; index++) {

				assertEquals( "robin", objSearchReservationResponse.getReservationList().get(index).getFirstName());
				assertEquals( "smith", objSearchReservationResponse.getReservationList().get(index).getLastName());
			}

		}
		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForWithoutConfirmation ", " Exit method testSearchReservationForWithoutConfirmation " );
	}

	/**
	 * This method test search reservation web service method for failure result. This test case
	 * expects FAILURE from web service end when no parameter is provided by user for search reservation.
	 */
	//@Ignore
	//@Test
	public void testSearchReservationForFailure() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForFailure ", " Enter method testSearchReservationForFailure " );


		SearchReservationRequest objSearchReservationRequest = null;
		SearchReservationResponse objSearchReservationResponse = null;

		objSearchReservationRequest = new SearchReservationRequest();

		objSearchReservationResponse = makeSearchReservationRequest(objSearchReservationRequest);

		assertNotNull("SearchReservationResponse Instance must not be null " , objSearchReservationResponse );
		assertNotNull( "SearchReservationRequest Instance must not be null ",  objSearchReservationRequest);

		assertNotEquals( "SUCCESS" , objSearchReservationResponse.getStatus() );
		assertEquals( "FAILURE", objSearchReservationResponse.getStatus());

		int numbeOfReservations = objSearchReservationResponse.getReservationList().size();

		assertTrue("Number of reservation", 0 == numbeOfReservations );

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testSearchReservationForFailure ", " Enter method testSearchReservationForFailure " );

	}

	/**
	 * This method makes search reservation request to the web service.
	 * 
	 * @param objSearchReservationRequest
	 * @return
	 */
	private static SearchReservationResponse makeSearchReservationRequest( SearchReservationRequest objSearchReservationRequest) {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeSearchReservationRequest ", " Enter method makeSearchReservationRequest " );

		Entity<SearchReservationRequest> entity = Entity.json(objSearchReservationRequest);

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/searchReservation" );

		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);

		SearchReservationResponse objSearchReservationResponse = response.readEntity(SearchReservationResponse.class);

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeSearchReservationRequest ", " Exit method makeSearchReservationRequest " );

		return objSearchReservationResponse;

	}

	/**
	 * This method test get folio request to the web service. It uses confirmation number to get the details of bill
	 * against the request confirmation number.
	 */
	//@Ignore
	//@Test
	public void testGetFolioRequest() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetFolioRequest ", " Enter method testGetFolioRequest " );

		GetFolioRequest objGetFolioRequest = null;
		GetFolioResponse objGetFolioResponse = null;

		objGetFolioRequest = new GetFolioRequest();
		objGetFolioRequest.setConfirmationNumber( "100");

		objGetFolioResponse = makeGetFolioRequest(objGetFolioRequest);

		assertNotNull("GetFolioRequest Instance must not be null " , objGetFolioRequest );
		assertNotNull( "GetFolioResponse Instance must not be null ",  objGetFolioResponse);

		assertTrue( "Reservation Instance cannot be null " , objGetFolioResponse.getReservation() != null);
		assertTrue( "First Name cannot be null" , objGetFolioResponse.getReservation().getFirstName() != null);
		assertTrue ( "LastName cannot be null" , objGetFolioResponse.getReservation().getLastName() != null);

		int numberOfOrder = objGetFolioResponse.getReservationOrderList().size();

		if( numberOfOrder != 0 ){

			for( int index = 0 ; index < numberOfOrder; index++ ){

				assertNotNull( "Total Amount Cannot be Null ", objGetFolioResponse.getReservationOrderList().get(index).getTotalAmount());
				//assertNotNull( "Order Date Cannot be Null", objGetFolioResponse.getReservationOrderList().get(index).getOrderDate());
				assertNotNull( "Order List Cannot be Null ", objGetFolioResponse.getReservationOrderList().get(index).getOrderDetailList() );
				assertNotEquals( "OrderList Cannot be of Size Zero ", 0, objGetFolioResponse.getReservationOrderList().get(index).getOrderDetailList().size());

			}
		}
		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetFolioRequest ", " Exit method testGetFolioRequest " );
	}

	/**
	 * This method test get folio request to the web service. This test case checks the failure
	 * response from the web service. It does not pass any information to the web service while
	 * making request for get folio.
	 */
	//@Ignore
	//@Test
	public void testGetFolioRequestForFailure() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetFolioRequestForFailure ", " Enter method testGetFolioRequestForFailure " );

		GetFolioRequest objGetFolioRequest = null;
		GetFolioResponse objGetFolioResponse = null;

		objGetFolioRequest = new GetFolioRequest();

		objGetFolioResponse = makeGetFolioRequest(objGetFolioRequest);

		assertNotNull("GetFolioRequest Instance must not be null " , objGetFolioRequest );
		assertNotNull( "GetFolioResponse Instance must not be null ",  objGetFolioResponse);

		assertTrue( "Reservation Instance should null " , objGetFolioResponse.getReservation() == null);
		assertEquals( "OrderList Size Zero ", 0, objGetFolioResponse.getReservationOrderList().size());

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetFolioRequestForFailure ", " Exit method testGetFolioRequestForFailure " );
	}
	/**
	 * This method makes get folio request to the web service.
	 * 
	 * @param objGetFolioRequest
	 * @return
	 */
	private static GetFolioResponse makeGetFolioRequest( GetFolioRequest objGetFolioRequest) {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeGetFolioRequest ", " Enter method makeGetFolioRequest " );

		Entity<GetFolioRequest> entity = Entity.json(objGetFolioRequest);

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getFolio" );

		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);

		GetFolioResponse objGetFolioResponse = response.readEntity(GetFolioResponse.class);

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeGetFolioRequest ", " Exit method makeGetFolioRequest " );

		return objGetFolioResponse;
	}

	/**
	 * This method test update booking request made to the web service.
	 */
	//@Test
	//@Ignore
	public void testUpdateBookingRequest() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testUpdateBookingRequest ", " Enter method testUpdateBookingRequest " );

		UpdateBookingRequest objUpdateBookingRequest = null;
		UpdateBookingResponse objUpdateBookingResponse = null;

		objUpdateBookingRequest =  new UpdateBookingRequest();

		objUpdateBookingRequest.setConfirmationNumber( "100" );

		String notes[] = new String[]{"KING SIZE", "NEAR POOL"};
		objUpdateBookingRequest.setNotes(notes);

		objUpdateBookingResponse = makeUpdateBookingRequest(objUpdateBookingRequest);

		assertNotNull( " UpdateBookingRequest Instance must not be null " , objUpdateBookingRequest );
		assertNotNull( " UpdateBookingResponse Instance must not be null ",  objUpdateBookingResponse);

		assertNotNull( "Reservation Instance in response cannot be null ", objUpdateBookingResponse.getReservation() );
		assertEquals( "Confirmation must be Same " , "100" , objUpdateBookingResponse.getReservation().getConfirmationNumber() );

		String resNotes = objUpdateBookingResponse.getReservation().getNotes();

		assertNotNull( " Notes must not be null " , resNotes );

		String[] messages = resNotes.split(";");

		assertEquals( "First Notes " , "KING SIZE" , messages[0] );
		assertEquals( "Second Notes " , "NEAR POOL" , messages[1] );

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testUpdateBookingRequest ", " Exit method testUpdateBookingRequest " );
	}
	/**
	 * This method makes update booking request to the web service.
	 * 
	 * @param objUpdateBookingRequest
	 * @return
	 */
	private static UpdateBookingResponse makeUpdateBookingRequest( UpdateBookingRequest objUpdateBookingRequest) {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeUpdateBookingRequest ", " Enter method makeUpdateBookingRequest " );

		Entity<UpdateBookingRequest> entity = Entity.json( objUpdateBookingRequest );

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updateBooking" );

		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);

		UpdateBookingResponse objUpdateBookingResponse = response.readEntity(UpdateBookingResponse.class);

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeUpdateBookingRequest ", " Exit method makeUpdateBookingRequest " );

		return objUpdateBookingResponse;

	}

	/**
	 * This method defines the junit test case for the chekin request call made to the
	 * web service method.
	 * 
	 */
	//@Test
	@Ignore
	public void testCheckInRequest() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testCheckInRequest ", " Enter method testCheckInRequest " );

		CheckInRequest objCheckInRequest = null;
		CheckInResponse objCheckInResponse = null;

		objCheckInRequest = new CheckInRequest();

		Reservation objReservation = new Reservation();
		objReservation.setConfirmationNumber( "100");
		objReservation.setCreditCardNumber("1234123412341234");
		objCheckInRequest.setReservation(objReservation);

		objCheckInResponse = makeCheckInRequest(objCheckInRequest);

		assertNotNull( " CheckInRequest Instance must not be null " , objCheckInRequest );
		assertNotNull( " CheckInResponse Instance must not be null ",  objCheckInResponse);

		assertNotNull( "Reservation Instance in response cannot be null ", objCheckInResponse.getReservation() );
		assertEquals( "Status Must be Success", "SUCCESS" , objCheckInResponse.getStatus() );
		assertEquals( "Confirmation must be Same " , "100" , objCheckInResponse.getReservation().getConfirmationNumber() );
		assertEquals( "CreditCardNumebr must be Same " , "1234123412341234" , objCheckInResponse.getReservation().getCreditCardNumber() );

		assertTrue ( "CheckIn Date should not be null ", objCheckInResponse.getReservation().getCheckinDate() != null );
		assertTrue ( "CheckOut Date should not be null ", objCheckInResponse.getReservation().getCheckoutDate() != null );

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testCheckInRequest ", " Exit method testCheckInRequest " );
	}

	/**
	 * This method defines the junit test case for check in request made to the web service
	 * call, when the user makes request without providing confirmation number.
	 */
	//@Test
	public void testCheckInRequestForFailure() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testCheckInRequestForFailure ", " Enter method testCheckInRequestForFailure " );

		CheckInRequest objCheckInRequest = null;
		CheckInResponse objCheckInResponse = null;

		objCheckInRequest = new CheckInRequest();
		objCheckInRequest.setReservation( null );

		objCheckInResponse = makeCheckInRequest(objCheckInRequest);

		assertNotNull( " CheckInRequest Instance must not be null ",  objCheckInRequest);
		assertNotNull( " CheckInResponse Instance must not be null ",  objCheckInResponse);

		assertTrue( "Reservation Instance in response cannot be null ", objCheckInResponse.getReservation() == null );
		assertEquals( "Status Must be Success", "FAILURE" , objCheckInResponse.getStatus() );

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testCheckInRequestForFailure ", " Exit method testCheckInRequestForFailure " );
	}

	/**
	 * This method makes get availability  request to the web service.
	 * 
	 * @param objCheckInRequest
	 * @return
	 */
	private static CheckInResponse makeCheckInRequest( CheckInRequest objCheckInRequest) {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeCheckInRequest ", " Enter method makeCheckInRequest " );

		Entity<CheckInRequest> entity = Entity.json( objCheckInRequest );

		Client client = ClientBuilder.newClient();

		WebTarget target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkIn" ); 

		Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);

		CheckInResponse objCheckInResponse = response.readEntity(CheckInResponse.class);

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeCheckInRequest ", " Exit method makeCheckInRequest " );

		return objCheckInResponse;

	}

	/**
	 * This method defines the test case for get availability request for the web service.
	 * 
	 */
	//@Test
	public void testGetAvailabilityRequest() {

		WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetAvailabilityRequest ", " Enter method testGetAvailabilityRequest " );

		GetAvailabilityRequest objGetAvailabilityRequest = null;
		GetAvailabilityResponse objGetAvailabilityResponse = null;

		objGetAvailabilityRequest = new GetAvailabilityRequest();

		String startDate = ("15-may-2015");
		String endDate = ("15-jun-2016");
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");

		GetAvailabilityRequest objAvailabilityRequest = new GetAvailabilityRequest();

		try{

			objGetAvailabilityRequest.setStartDate(df.parse(startDate));
			objGetAvailabilityRequest.setEndDate(df.parse(endDate));

			objGetAvailabilityResponse = makeGetAvailabilityRequest(objGetAvailabilityRequest);

			assertNotNull( "GetAvailability request instance must not be null ",  objGetAvailabilityRequest );
			assertNotNull( "GetAvailability response instance must not be null ",  objGetAvailabilityResponse );

			assertEquals( "Response status must be success" , "SUCCESS", objGetAvailabilityResponse.getStatus() );
		}
		catch (Exception exc){
			
			WebAppLogger.logError( KeyprWebServicesTest.class, "testGetAvailabilityRequest", exc );
		}

			WebAppLogger.logInfo( KeyprWebServicesTest.class, " testGetAvailabilityRequest ", " Exit method testGetAvailabilityRequest " );

		}
	
	
		/**
		 * This method makes guest check availability request to the web service.
		 * 
		 * @param objGetAvailabilityRequest
		 * @return
		 */
		private static GetAvailabilityResponse makeGetAvailabilityRequest( GetAvailabilityRequest objGetAvailabilityRequest) {

			WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeGetAvailabilityRequest ", " Enter method makeGetAvailabilityRequest " );

			Entity<GetAvailabilityRequest> entity = Entity.json( objGetAvailabilityRequest );

			Client client = ClientBuilder.newClient();

			WebTarget target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getAvailability" );

			Response response = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(entity);

			GetAvailabilityResponse objGetAvailabilityResponse = response.readEntity(GetAvailabilityResponse.class);

			WebAppLogger.logInfo( KeyprWebServicesTest.class, " makeGetAvailabilityRequest ", " Exit method makeGetAvailabilityRequest " );

			return objGetAvailabilityResponse;

		}

	}
