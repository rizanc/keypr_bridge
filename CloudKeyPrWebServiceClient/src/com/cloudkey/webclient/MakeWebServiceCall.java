package com.cloudkey.webclient;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

import com.cloudkey.commons.Payments;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.TimeOutError;
import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.pms.request.AssignRoomRequest;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.GuestMembershipsRequest;
import com.cloudkey.pms.request.HotelInformationRequest;
import com.cloudkey.pms.request.MemberPointsRequest;
import com.cloudkey.pms.request.MeetingRoomInformationRequest;
import com.cloudkey.pms.request.NameIdByMembershipRequest;
import com.cloudkey.pms.request.ReleaseRoomRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.web.logger.MessageLogger;
import com.cloudkey.webclient.constant.IWebClient;


/**
 * This class call the web services methods and display the response . 
 * It has all required web services methods.
 * 
 * @author vinayk2
 *
 */

public class MakeWebServiceCall extends HttpServlet {

	private static final long serialVersionUID = IWebClient.COUNT_ONE;

	public void init() {

		MessageLogger.logInfo( MakeWebServiceCall.class,  " Initialized Method " , " MakeWebServiceCall Service is Up and Running");
	}
	/**
	 * This method handles all request made by guest for operations like check in, check out, retrieve bill information, search reservation
	 * and check room availability.
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) {

		MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Enter method doPost " );

		response.setContentType( " text/html " );

		PrintWriter out = null;
		WebTarget target = null;
		Builder invocationBuilder = null;

		String firstName = request.getParameter( "first_name" );
		String lastName =  request.getParameter( "last_name" );
		String 	confirmationNumber = request.getParameter( "confirmation_number" );
		String command = request.getParameter( "command" );

		Client client = ClientBuilder.newClient();

		MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " WebService Client Created " );

		try {

			out = response.getWriter();

			if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_ONE ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter SearchReservation Block " );

				SearchReservationRequest objSearchReservationRequest = new  SearchReservationRequest();

				objSearchReservationRequest.setFirstName( firstName );
				objSearchReservationRequest.setLastName( lastName );
				objSearchReservationRequest.setConfirmationNumber( confirmationNumber );
				objSearchReservationRequest.setCreditCardNumber( request.getParameter( "credit_card" ) );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Request Object created " );

				try {

					target = client.target( IWebClient.SEARCH_RESERVATION_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " SearchReservation URL " + IWebClient.SEARCH_RESERVATION_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objSearchReservationRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " SearchReservation Response at Client  " + postResponse );

					out.println( " Response Of Search Reservation: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " SearchReservation Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " SearchReservation Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit SearchReservation Block " );

			}

			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_TWO ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter GuestCheckIn Block " );

				Reservation objReservation = new Reservation(); 

				confirmationNumber = request.getParameter( "confirmation_number" );

				String credit = request.getParameter( "credit_card" );

				objReservation.setCreditCardNumber( ( credit ) );

				RoomDetails objRoomDetails = new RoomDetails();

				objReservation.setCreditCardNumber( credit );
				objReservation.setConfirmationNumber( confirmationNumber );

				if( objReservation.getRoomDetailList() == null ) {

					objReservation.setRoomDetailList( new ArrayList<RoomDetails>() );
				}
				objReservation.getRoomDetailList().add( objRoomDetails );


				CheckInRequest objCheckInReq = new CheckInRequest();
				objCheckInReq.setReservation( objReservation );

				try {

					target = client.target( IWebClient.CHECK_IN_URL ); 

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckIn URL " + IWebClient.CHECK_IN_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objCheckInReq, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckIn Response at Client  " + postResponse );

					out.println( " Response of CheckIn : " + postResponse );
					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}

				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " GuestCheckIn Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckIn Time Out Response at Client " );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Exit GuestCheckIn Block " );

			}

			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_THREE ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Enter GetFolio Block " );

				GetFolioRequest objGetFolioRequest = new GetFolioRequest();
				objGetFolioRequest.setConfirmationNumber( confirmationNumber );

				try {

					target = client.target( IWebClient.GET_FOLIO_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetFolioRequest URL " + IWebClient.GET_FOLIO_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objGetFolioRequest, MediaType.APPLICATION_JSON_TYPE ), String.class);

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetFolioRequest Response at Client  " + postResponse );

					out.println( "Response Of RetrieveFolio: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " GetFolio Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetFolio Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  "  Exit GetFolio Block  " );

			}

			else  if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_FOUR ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class,  "doPost",  " Enter updateBooking Block " );

				UpdateBookingRequest objBookingRequest = new UpdateBookingRequest();
				objBookingRequest.setConfirmationNumber( confirmationNumber );
				objBookingRequest.setNotes( new String[]{ request.getParameter( "firstNote" ) , request.getParameter( "secondNote" ) } );

				try {

					target = client.target( IWebClient.UPDATE_BOOKING_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " UpdateBooking URL " + IWebClient.UPDATE_BOOKING_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objBookingRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " UpdateBooking Response at Client  " + postResponse );

					out.println( " Response Of UpdateBooking: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " updateBooking Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " UpdateBooking Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Exit updateBooking Block " );

			}

			else if(  command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_FIVE ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, "doPost", " Enter updatePayment Block " );

				UpdatePaymentRequest objUpdatePaymentRequest = new UpdatePaymentRequest();
				objUpdatePaymentRequest.setConfirmationNumber( confirmationNumber );

				Payments objPayments = new Payments();
				String amt = request.getParameter( "amount" );

				if( amt.equalsIgnoreCase( "" ) ) {

					amt = "0";	
				}

				objPayments.setAmount( Double.parseDouble(amt) );

				objPayments.setCreditCard( request.getParameter( "credit_card_no" ) );

				List<Payments> paymentsList = new ArrayList<Payments>();
				paymentsList.add( objPayments );

				objUpdatePaymentRequest.setPayments( paymentsList );

				try {

					target = client.target( IWebClient.UPDATE_PAYMENT_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", "UpdatePayment URL " + IWebClient.UPDATE_PAYMENT_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objUpdatePaymentRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " UpdatePayment Response at Client  " + postResponse );

					out.println( "Response Of UpdatePayments: " + postResponse ) ;
					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " UpdatePayment Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " UpdatePayment Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Exit updatePayment Block " );

			}
			else if ( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_SIX ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class,  "doPost",  " Enter getAvailability Block " );

				String startDate = request.getParameter( "start_date" );
				String endDate = request.getParameter( "end_date" );

				DateFormat df = new SimpleDateFormat( "dd-MMM-yyyy" );

				GetAvailabilityRequest objAvailabilityRequest = new GetAvailabilityRequest();

				try {

					objAvailabilityRequest.setStartDate( df.parse( startDate ) );
					objAvailabilityRequest.setEndDate( df.parse( endDate ) );

					MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " getAvailability Availability Object Added " );

					try {

						target = client.target( IWebClient.GET_AVAILABILITY_URL );

						MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetAvailability URL " + IWebClient.GET_AVAILABILITY_URL );

						invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

						String postResponse = invocationBuilder.post( Entity.entity( objAvailabilityRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

						MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetAvailability Response at Client  " + postResponse );

						out.println( " Response Of GetAvailability: " + postResponse );

						out.println( " <br><br><br> " );
						out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

					}
					catch( ServerErrorException sec) {

						MessageLogger.logError(MakeWebServiceCall.class,  " getAvailability Block", sec);

						TimeOutError objTError = new TimeOutError();
						objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
						objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

						Map<String,String> myMap= new HashMap<String,String>();
						myMap.put( "Code", objTError.getCode()) ;
						myMap.put( "Message", objTError.getMessage() );

						JSONObject objTimeOut = new JSONObject(myMap);

						MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetAvailability Time Out Response at Client " );

						out.println(objTimeOut);

						out.println( " <br><br><br> " );
						out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

					}
				}
				catch( Exception exc ) {

					MessageLogger.logInfo( MakeWebServiceCall.class,  " getAvailability ",  " Required Fields are missing " );

					GetAvailabilityResponse objGResponse = new GetAvailabilityResponse();
					objGResponse.setStatus( ICloudKeyConstants.RES_FAILURE);
					objGResponse.setAvailList(null);

					Map<String,Object> myMap= new HashMap<String,Object>();
					myMap.put( "status", objGResponse.getStatus()) ;
					myMap.put( "availabilityList", objGResponse.getAvailList() );

					JSONObject objError = new JSONObject(myMap);

					out.print( "Response Of GetAvailability " + objError );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}
				MessageLogger.logInfo( MakeWebServiceCall.class,  "  doPost  ",  "  Exit getAvailability Block " );

			}

			else if ( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_SEVEN ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter Assign Room Block " );

				/*To set the confirmation number.*/
				confirmationNumber = request.getParameter( "confirmation_number" );

				/*if(confirmationNumber.equals("")){

					confirmationNumber = "0";
				}*/

				/*To set the roomTypeCode.*/
				String roomTypeCode = request.getParameter( "room_code" );

				/*if(roomTypeCode.equals("")){
					roomTypeCode = "0";
				}*/

				AssignRoomRequest objAssignRoomRequest = new AssignRoomRequest();

				/*To set the request parameters.*/
				objAssignRoomRequest.setRoomTypeCode( roomTypeCode );
				Reservation objReservation = new Reservation();
				objReservation.setConfirmationNumber( confirmationNumber );
				objAssignRoomRequest.setReservation( objReservation );

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ", " Assign Room Object Added " );

				try {

					target = client.target( IWebClient.ASSIGN_ROOM_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " AssingRoom URL " + IWebClient.ASSIGN_ROOM_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse = invocationBuilder.post( Entity.entity( objAssignRoomRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " AssignRoom Response at Client  " + postResponse );

					out.println( " Response Of  Assign Room: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " Assign Room Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " AssignRoom Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Exit  Assign Room Block " );

			}
			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_EIGHT  ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter Release Room Block " );	

				ReleaseRoomRequest objReleaseRoomRequest = new ReleaseRoomRequest();
				String reservationId = request.getParameter( "reservation_id" );

				// set the reservation id in the request parameters.
				objReleaseRoomRequest.setReservationId( reservationId );

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Reservation Id is set on the relese room object" );

				try {

					MessageLogger.logInfo(MakeWebServiceCall.class, "release room", "Server url is "+ IWebClient.RELESE_ROOM_URL);
					target = client.target( IWebClient.RELESE_ROOM_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " RealeaseRoom URL " + IWebClient.RELESE_ROOM_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse =  invocationBuilder.post( Entity.entity( objReleaseRoomRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " ReleaseRoom Response at Client  " + postResponse );

					out.println( "Response of Release Room: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " Release Room Bloc ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Releaseroom Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit Release Room Block " );
			}

			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_ELEVEN  ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter Hotel Information Request Block " );	

				HotelInformationRequest objHotelInformationRequest = new HotelInformationRequest();

				String hotelCode = request.getParameter("hotel_code");

				// set hotel code in the request parameters.
				objHotelInformationRequest.setHotelCode(hotelCode);

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  "hotelCode is set on the HotelInformationRequest object" );

				try {

					MessageLogger.logInfo(MakeWebServiceCall.class, "Hotel Information", "Server url is "+ IWebClient.HOTEL_INFORMATION_URL);

					target = client.target( IWebClient.HOTEL_INFORMATION_URL );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " HotelInformation URL " + IWebClient.HOTEL_INFORMATION_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse =  invocationBuilder.post( Entity.entity( objHotelInformationRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " HotelInformation Response at Client  " + postResponse );

					out.println( "Response of Hotel Information: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " Hotel information request block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " HotelIfrmation Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit Hotel Information Request Block " );
			}

			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_TEN  ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter Member Points Block " );	

				MemberPointsRequest objMemberPointsRequest= new MemberPointsRequest();
				String membershipId = request.getParameter("membership_id");

				// set the membership id in the request parameters.
				objMemberPointsRequest.setMembershipNumber(membershipId);

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Membership Id is set on the Member Points object" );

				try {

					MessageLogger.logInfo(MakeWebServiceCall.class, " Member Point ", "Server url is "+ IWebClient.MEMBER_POINT_URL);

					target = client.target( IWebClient.MEMBER_POINT_URL);

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " MemberPoints URL " + IWebClient.MEMBER_POINT_URL);

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse =  invocationBuilder.post( Entity.entity( objMemberPointsRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " MemberPoints Response at Client  " + postResponse );

					out.println( "Response of Member Points : " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " Member Points Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " MemberPoints  Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit Member Points  Block " );
			}

			
			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_NINE  ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter MeetingInformation Block " );	

				MeetingRoomInformationRequest objInformationRequest = new MeetingRoomInformationRequest();
				
				objInformationRequest.setNumberOfAttendees( request.getParameter("number_of_attendees"));

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Number of attendees is set on the relese room object" );

				try {
					
					MessageLogger.logInfo(MakeWebServiceCall.class, " MeetingInformation", "Server url is "+ IWebClient.MEETING_INFORMATION_URL);
					target = client.target( IWebClient.MEETING_INFORMATION_URL );
					
					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " MeetingInformation URL " + IWebClient.MEETING_INFORMATION_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse =  invocationBuilder.post( Entity.entity( objInformationRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

					out.println( "Response of MeetingInformation: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
					
				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " MeetingInformation Bloc ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);
					
					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit MeetingInformation Block " );
			}

			else if( command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_TWELVE ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter GuestMembership Block " );	

				GuestMembershipsRequest objGuestMembershipsRequest = new GuestMembershipsRequest();
				
				objGuestMembershipsRequest.setNameId(request.getParameter("name_id"));

				MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Name Id is set on the GuestMembership object" );

				try {
					
					MessageLogger.logInfo(MakeWebServiceCall.class, " GuestMembership", "Server url is "+ IWebClient.GUEST_MEMBERSHIP_URL);
					
					target = client.target( IWebClient.GUEST_MEMBERSHIP_URL );
					
					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestMembership URL " + IWebClient.GUEST_MEMBERSHIP_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					String postResponse =  invocationBuilder.post( Entity.entity( objGuestMembershipsRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

					out.println( "Response of GuestMembership: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
					
				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " GuestMembership Bloc ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);
					
					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit GuestMembership Block " );
			}
			
			else if(command.equalsIgnoreCase( IWebClient.COMMAND_COUNT_THIRTEEN )) {

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter GetNameId Block " );	

					NameIdByMembershipRequest objNameIdByMembershipRequest = new NameIdByMembershipRequest();
					
					objNameIdByMembershipRequest.setMembershipType(request.getParameter("membership_type"));
					objNameIdByMembershipRequest.setMembershipNumber(request.getParameter("membership_number"));
					objNameIdByMembershipRequest.setLastname(request.getParameter("last_name"));

					MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ",  " Membership type,membership number and last name are set on the Name id  object" );

					try {
						
						MessageLogger.logInfo(MakeWebServiceCall.class, " GetNameId", "Server url is "+ IWebClient.GET_NAME_ID);
						target = client.target( IWebClient.GET_NAME_ID );
						
						MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GetNameId URL " + IWebClient.GET_NAME_ID );

						invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

						String postResponse =  invocationBuilder.post( Entity.entity( objNameIdByMembershipRequest , MediaType.APPLICATION_JSON_TYPE ), String.class );

						out.println( "Response of GetNameId: " + postResponse );

						out.println( " <br><br><br> " );
						out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
						
					}
					catch( ServerErrorException sec) {

						MessageLogger.logError(MakeWebServiceCall.class,  " GetNameId Bloc ", sec);

						TimeOutError objTError = new TimeOutError();
						objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
						objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

						Map<String,String> myMap= new HashMap<String,String>();
						myMap.put( "Code", objTError.getCode()) ;
						myMap.put( "Message", objTError.getMessage() );

						JSONObject objTimeOut = new JSONObject(myMap);

						out.println(objTimeOut);
						
						out.println( " <br><br><br> " );
						out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
					}

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit GetNameId Block " );

			}
			
			else {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter GuestCheckOut Block " );

				CheckOutRequest objCheckOutRequest = new CheckOutRequest();
				objCheckOutRequest.setConfirmationNumber( confirmationNumber );

				try {

					target = client.target( IWebClient.CHECK_OUT_URL );

					invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckOut URL " + IWebClient.CHECK_OUT_URL );

					String postResponse = invocationBuilder.post( Entity.entity( objCheckOutRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckOut Response at Client  " + postResponse );

					out.println( " Response Of Check Out: " + postResponse );

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				}
				catch( ServerErrorException sec) {

					MessageLogger.logError(MakeWebServiceCall.class,  " checkOut Block ", sec);

					TimeOutError objTError = new TimeOutError();
					objTError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					Map<String,String> myMap= new HashMap<String,String>();
					myMap.put( "Code", objTError.getCode()) ;
					myMap.put( "Message", objTError.getMessage() );

					MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " GuestCheckOut Time Out Response at Client " );

					JSONObject objTimeOut = new JSONObject(myMap);

					out.println(objTimeOut);

					out.println( " <br><br><br> " );
					out.println( " <a href=\"/CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );
				}

				MessageLogger.logInfo( MakeWebServiceCall.class, "doPost", " Exit checkOut Block " );

			}

		}

		catch ( Exception exc ) {

			MessageLogger.logError( MakeWebServiceCall.class,  " doPost ", exc );
		}

		MessageLogger.logInfo( MakeWebServiceCall.class,  " doPost ", " Exit method doPost " ) ;

	}

}
