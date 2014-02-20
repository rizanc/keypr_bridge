package com.cloudkey.webclient;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.cloudkey.commons.Payments;
import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.web.logger.MessageLogger;



/**
 * This class call the web services methods and display the response . 
 * It has all required web services methods.
 * 
 * @author vinayk2
 *
 */

public class MakeWebServiceCall extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * This method handles all request made by guest for operations like check in, check out, retrieve bill information, search reservation
	 * and check room availability.
	 */
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) {

		MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter method doPost " );

		response.setContentType( " text/html " );

		PrintWriter out = null;
		WebTarget target = null;
		Builder invocationBuilder = null;

		String firstName = request.getParameter( "first_name" );
		String lastName =  request.getParameter( "last_name" );
		String 	email = request.getParameter( "email" );
		String 	confirmationNumber = request.getParameter( "confirmation_number" );
		String command = request.getParameter( "command" );

		Client client = ClientBuilder.newClient();

		MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " WebService Client Created " );

		try {

			out = response.getWriter();

			if( command.equalsIgnoreCase( "1" ) ) {

				MessageLogger.logInfo(MakeWebServiceCall.class, " doPost ", " Enter SearchReservation Block ");

				SearchReservationRequest objSearchReservationRequest = new  SearchReservationRequest();
				objSearchReservationRequest.setEmailId( email );
				objSearchReservationRequest.setFirstName( firstName );
				objSearchReservationRequest.setLastName( lastName );
				objSearchReservationRequest.setConfirmationNumber( confirmationNumber );

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/searchReservation" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objSearchReservationRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println(" Response Of Search Reservation: " + postResponse);

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit SearchReservation Block ");

			}

			else if( command.equalsIgnoreCase( "2" ) ) {

				MessageLogger.logInfo(MakeWebServiceCall.class, " doPost ", " Enter CheckIn Block ");

				Reservation objReservation = new Reservation(); 

				objReservation.setConfirmationNumber( confirmationNumber );
				objReservation.setRoomNumber( request.getParameter(" room_number ") );

				CheckInRequest objCheckInReq = new CheckInRequest();
				objCheckInReq.setReservation( objReservation );

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkIn" ); 

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objCheckInReq, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println( " Response of CheckIn : " + postResponse );

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\">" + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit CheckIn Block ");

			}

			else if( command.equalsIgnoreCase( "3" ) ) {

				MessageLogger.logInfo(MakeWebServiceCall.class, " doPost ", " Enter GetFolio Block ");

				GetFolioRequest objGetFolioRequest = new GetFolioRequest();
				objGetFolioRequest.setConfirmationNumber(confirmationNumber);

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getFolio" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objGetFolioRequest, MediaType.APPLICATION_JSON_TYPE ), String.class);

				out.println( "Response Of RetrieveFolio: " + postResponse );

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\">" + " KeyPrClient Home Page" + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit GetFolio Block " );

			}

			else  if( command.equalsIgnoreCase( "4" ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, "doPost", " Enter updateBooking Block " );

				UpdateBookingRequest objBookingRequest = new UpdateBookingRequest();
				objBookingRequest.setConfirmationNumber( confirmationNumber );
				objBookingRequest.setNotes( new String[]{ request.getParameter("firstNote") , request.getParameter("secondNote") } );

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updateBooking" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objBookingRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println( " Response Of UpdateBooking: " + postResponse);

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\">" + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit updateBooking Block ");

			}

			else if( command.equalsIgnoreCase( "5" ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, "doPost", " Enter updatePayment Block ");

				UpdatePaymentRequest objUpdatePaymentRequest = new UpdatePaymentRequest();
				objUpdatePaymentRequest.setConfirmationNumber( confirmationNumber );

				Payments objPayments = new Payments();
				String amt = request.getParameter( "amount" );

				if( amt.equalsIgnoreCase( "" ) ) {

					amt = "0";	
				}

				objPayments.setAmount( Double.parseDouble(amt) );

				objPayments.setCreditCard(request.getParameter("credit_card_no"));

				List<Payments> paymentsList = new ArrayList<Payments>();
				paymentsList.add(objPayments);

				objUpdatePaymentRequest.setPayments(paymentsList);

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/updatePayment" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objUpdatePaymentRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println( "Response Of MakePayment: " + postResponse) ;

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit updatePayment Block " );

			}
			else if (command.equalsIgnoreCase( "6" ) ) {

				MessageLogger.logInfo( MakeWebServiceCall.class, "doPost", " Enter getAvailability Block " );

				GetAvailabilityRequest objAvailabilityRequest = new GetAvailabilityRequest();

				SimpleDateFormat formatter  = new SimpleDateFormat("dd-MMM-yyyy");
				Date startDate = request.getParameter("start_date").equals("")?null:formatter.parse(request.getParameter("start_date"));
				Date endDate =  request.getParameter("end_date").equals("")?null:formatter.parse(request.getParameter("end_date"));;

				objAvailabilityRequest.setStartDate(startDate);
				objAvailabilityRequest.setEndDate(endDate);


				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/getAvailability" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objAvailabilityRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println( " Response Of GetAvailability: " + postResponse );

				out.println( " <br><br><br >" );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit getAvailability Block ");

			}
			else {

				MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Enter checkOut Block " );

				CheckOutRequest objCheckOutRequest = new CheckOutRequest();
				objCheckOutRequest.setConfirmationNumber(confirmationNumber);

				target = client.target( "http://localhost:8080/CloudKeyHTWebServices/keyservice/Service/checkOut" );

				invocationBuilder = target.request( MediaType.APPLICATION_JSON_TYPE );

				//SearchReservationResponse postResponse = invocationBuilder.post(Entity.entity(objSearchReservationRequest,MediaType.APPLICATION_JSON_TYPE),SearchReservationResponse.class);
				String postResponse = invocationBuilder.post( Entity.entity( objCheckOutRequest, MediaType.APPLICATION_JSON_TYPE ), String.class );

				out.println( " Response Of Check Out: " + postResponse );

				out.println( " <br><br><br> " );
				out.println( " <a href=\"\\CloudKeyPrWebServiceClient\"> " + " KeyPrClient Home Page " + " </a> " );

				MessageLogger.logInfo(MakeWebServiceCall.class, "doPost", " Exit checkOut Block ");

			}

		}

		catch ( Exception exc ) {

			MessageLogger.logError( MakeWebServiceCall.class, " doPost ", exc );
		}

		MessageLogger.logInfo( MakeWebServiceCall.class, " doPost ", " Exit method doPost ") ;

	}

}
