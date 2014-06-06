package com.keypr.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.TimeOutError;
import com.cloudkey.constant.ICloudKeyConstants;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.AssignRoomRequest;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.AssignRoomResponse;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.CheckOutResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.ReleaseRoomResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;
import com.cloudkey.util.BaseConfigurationReader;
import com.keypr.rest.constants.IWebServiceConstants;
import com.keypr.web.logger.WebAppLogger;


/**
 * The class acts as a container for restful web services. It has all web services required by the client to communicate
 * with the property management parser. This class loads the specific parser by reading spring configuration file.
 * It receives the parser response and send the response back to its caller in json form.
 * 
 * @author vinayk2
 *
 */

@Path("/Service")
public class KeyprWebServices {
	 
	/**
	 * This method searches for reservation detail on the basis of provided input.
	 * It returns all reservation details in json format to its caller.
	 * 
	 * @param objSearchReservationRequest
	 * @return Response
	 */
	@SuppressWarnings( {"resource" } )
	@Path("/searchReservation" )
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response searchReservation( SearchReservationRequest objSearchReservationRequest ) {
  
		WebAppLogger.logInfo( KeyprWebServices.class,  " searchReservation ",  " Enter method searchReservation " );

		/* variable to store SearchReservationRespone instance.*/
		SearchReservationResponse objSearchReservationResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			if( objSearchReservationRequest.getCreditCardNumber() == null ) {

				objSearchReservationRequest.setCreditCardNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objSearchReservationRequest.getConfirmationNumber() == null ) {

				objSearchReservationRequest.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objSearchReservationRequest.getFirstName() == null ) {

				objSearchReservationRequest.setFirstName( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objSearchReservationRequest.getLastName() == null ) {

				objSearchReservationRequest.setLastName( ICloudKeyConstants.EMPTY_STRING );
			}

			if( ( objSearchReservationRequest.getFirstName().equals( ICloudKeyConstants.EMPTY_STRING ) ) 
					&& ( objSearchReservationRequest.getLastName().equals( ICloudKeyConstants.EMPTY_STRING ) )
					&& ( objSearchReservationRequest.getConfirmationNumber().equals( ICloudKeyConstants.EMPTY_STRING ) ) 
					&& ( objSearchReservationRequest.getCreditCardNumber().equals( ICloudKeyConstants.EMPTY_STRING ) ) ) {

				List<Reservation> resList = new ArrayList<Reservation>();
				
				objSearchReservationResponse = new SearchReservationResponse();
				objSearchReservationResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				objSearchReservationResponse.setReservationList( resList );

				WebAppLogger.logInfo( KeyprWebServices.class, " searchReservation ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objSearchReservationResponse ).build();

			}
			else {

				objSearchReservationResponse = messageParser.searchReservationData( objSearchReservationRequest );

				if( objSearchReservationResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objSearchReservationResponse ).build();
				}
			}

		}
		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " searchReservation ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " searchReservation ", " Exit  method searchReservation " );

		return res;
	}


	/**
	 * This method makes check in request on the basis of provided input.
	 * It returns the status and reservation details to its caller.
	 * 
	 * @param objCheckInRequest
	 * @return Response
	 */
	@SuppressWarnings("resource")
	@Path("/checkIn")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response checkIn( CheckInRequest objCheckInRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, " checkIn ", " Enter method checkIn " );

		/* variable to store CheckInResponse instance.*/
		CheckInResponse objCheckInResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" ); 

			// retrieve the current bean and store its reference.
			messageParser = (IParserInterface) appContext.getBean( parserName );

			Reservation objReservation = objCheckInRequest.getReservation();

			if( objReservation.getAddress() == null ) {

				objReservation.setAddress( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getCheckinDate() == null ) {

				objReservation.setCheckinDate( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getCheckoutDate() == null ) {

				objReservation.setCheckoutDate( ICloudKeyConstants.EMPTY_STRING );
			}

			if(objReservation.getCompany() == null ) {

				objReservation.setCompany( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getEmail() == null ) {

				objReservation.setEmail( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getConfirmationNumber() == null ) {

				objReservation.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getFullName() == null ) {

				objReservation.setFullName( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getLoyaltyNumber() == null ) {

				objReservation.setLoyaltyNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getNotes() == null ) {

				objReservation.setNotes( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getPhoneNumber() == null ) {

				objReservation.setPhoneNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( ( objReservation.getConfirmationNumber().equalsIgnoreCase( ICloudKeyConstants.EMPTY_STRING ) )
					|| ( objReservation.getCreditCardNumber().equalsIgnoreCase( ICloudKeyConstants.EMPTY_STRING ) ) ) {

				objCheckInResponse = new CheckInResponse();
				objCheckInResponse.setStatus( ICloudKeyConstants.RES_FAILURE );

				objCheckInResponse.setReservation( null );

				WebAppLogger.logInfo( KeyprWebServices.class, " checkIn ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objCheckInResponse ).build();

			} else  {

				objCheckInResponse = messageParser.guestCheckIn( objCheckInRequest );

				if( objCheckInResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objCheckInResponse ).build();
				}
			}
		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " checkIn ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " checkIn ", " Exit method checkIn " );

		return res;
	}

	/**
	 * This method makes assign Room request on the basis of provided input.
	 * It returns the status and reservation details to its caller.
	 * 
	 * @param objAssignRoomRequest
	 * @return Response
	 */
	@SuppressWarnings("resource")
	@Path("/assignRoom")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response assignRoom( AssignRoomRequest objAssignRoomRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class,  " assignRoom ", " Enter method assignRoom " );

		/* variable to store AssignRoomResponse instance.*/
		AssignRoomResponse objAssignRoomResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" ); 

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			Reservation objReservation = objAssignRoomRequest.getReservation();

			if( objReservation.getAddress() == null ) {

				objReservation.setAddress( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getCheckinDate() == null ) {

				objReservation.setCheckinDate( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getCheckoutDate() == null ) {

				objReservation.setCheckoutDate( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getCompany() == null ) {

				objReservation.setCompany( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getEmail() == null ) {

				objReservation.setEmail( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getConfirmationNumber() == null ) {

				objReservation.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getFullName() == null ) {

				objReservation.setFullName( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getLoyaltyNumber() == null ) {

				objReservation.setLoyaltyNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getNotes() == null ) {

				objReservation.setNotes( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objReservation.getPhoneNumber() == null ) {

				objReservation.setPhoneNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			if( objAssignRoomRequest.getRoomTypeCode() == null ) {

				objAssignRoomRequest.setRoomTypeCode( ICloudKeyConstants.EMPTY_STRING );
			}

			/**
			 * To check room type code and confirmation number is not blank.
			 */
			if( ( objAssignRoomRequest.getRoomTypeCode().equals(ICloudKeyConstants.EMPTY_STRING ) ) 
					|| objAssignRoomRequest.getReservation().getConfirmationNumber().equals( ICloudKeyConstants.EMPTY_STRING ) ) {

				objAssignRoomResponse = new AssignRoomResponse();
				objAssignRoomResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " assignRoom ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objAssignRoomResponse).build();

			}
			else {

				objAssignRoomResponse = messageParser.assignRoom( objAssignRoomRequest );

				if( objAssignRoomResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity(objTimeOutError).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objAssignRoomResponse ).build();
				}
			}

		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " assignRoom ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " assignRoom ", " Exit method assignRoom " );

		return res;
	}


	/**
	 * This method makes check out request on the basis of confirmation number.
	 * It returns the status and reservation details in json format to its caller.
	 * 
	 * @param objCheckOutRequest
	 * @return Response
	 */
	@SuppressWarnings( "resource" )
	@Path( "/checkOut" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )

	public Response checkOut( CheckOutRequest objCheckOutRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, " checkOut ", " Enter method checkOut " );

		/* variable to store CheckOutResponse instance.*/
		CheckOutResponse objCheckOutResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			if( objCheckOutRequest.getConfirmationNumber() == null ) {

				objCheckOutRequest.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			objCheckOutResponse = new CheckOutResponse();

			/**
			 * To check the request contains the confirmation number.
			 * 
			 */		

			if( objCheckOutRequest.getConfirmationNumber().equals( ICloudKeyConstants.EMPTY_STRING ) ) {

				objCheckOutResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " checkOut ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objCheckOutResponse ).build();
			} 
			else {

				objCheckOutResponse = messageParser.guestCheckOut( objCheckOutRequest );

				if( objCheckOutResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objCheckOutResponse ).build();
				}
			}

		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, "checkOut", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, "checkOut", "Exit method checkOut" );

		return res;

	}

	@SuppressWarnings("resource")
	@Path("/getAvailability")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response getAvailability( GetAvailabilityRequest objAvailabilityRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, "getAvailability", "Enter method getAvailability" );

		/* variable to store GetAvailabilityResponse instance.*/
		GetAvailabilityResponse objAvailabilityResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			Date startDate = objAvailabilityRequest.getStartDate();
			Date endDate = objAvailabilityRequest.getEndDate();

			if( ( startDate == null ) || ( endDate == null ) ) {

				objAvailabilityResponse = new GetAvailabilityResponse();
				objAvailabilityResponse.setStatus( ICloudKeyConstants.RES_FAILURE );

				WebAppLogger.logInfo( KeyprWebServices.class, " getAvailability ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objAvailabilityResponse ).build();
			}
			else {

				objAvailabilityResponse = messageParser.checkAvailability( objAvailabilityRequest );

				if( objAvailabilityResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objAvailabilityResponse ).build();

				}

			}

		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " getAvailability ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " getAvailability ", " Exit method getAvailability " );

		return res;

	}

	/**
	 * This method makes guest bill request on the basis of confirmation number.
	 * It returns the status and details of charges.
	 * 
	 * @param objFolioRequest
	 * @return Response
	 */
	@SuppressWarnings( "resource" )
	@Path( "/getFolio" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )

	public Response getFolio( GetFolioRequest objFolioRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, " getFolio ", " Enter method getFolio " );

		/* variable to store GetFolioResponse instance.*/
		GetFolioResponse objGetFolioResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			if( objFolioRequest.getConfirmationNumber() == null ) {

				objFolioRequest.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			objGetFolioResponse = new GetFolioResponse();

			/**
			 *  To check the confirmation number is not blank.
			 */
			if( objFolioRequest.getConfirmationNumber().equals( ICloudKeyConstants.EMPTY_STRING ) ) {

				List<ReservationOrders> resList = new ArrayList<ReservationOrders>();

				objGetFolioResponse.setReservation( null );
				objGetFolioResponse.setReservationOrderList( resList);
                objGetFolioResponse.setStatus( ICloudKeyConstants.RES_FAILURE );

                WebAppLogger.logInfo( KeyprWebServices.class, " getFolio ", " Required Fields are missing " );
               
                res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objGetFolioResponse ).build();
			} 
			else {

				objGetFolioResponse = messageParser.retrieveFolioInfo( objFolioRequest );

				if ( objGetFolioResponse == null) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objGetFolioResponse ).build();
				}

			}
		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class,  " getFolio ",  exc );

		}

		WebAppLogger.logInfo( KeyprWebServices.class,  " getFolio ",  " Exit method getFolio " );

		return res;

	}

	/**
	 * This method makes guest update payment request on the basis of confirmation number.
	 * It returns the status of payment update operation result.
	 * 
	 * @param objUpPaymentRequest
	 * @return Response
	 */
	@SuppressWarnings( "resource" )
	@Path( "/updatePayment" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )

	public Response updatePayment( UpdatePaymentRequest objUpPaymentRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, " updatePayment ", " Enter method updatePayment " );

		/* variable to store UpdatePaymentResponse instance.*/
		UpdatePaymentResponse objUpPaymentResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		/*Variable to hold confirmation number. */
		String confirmationNumber = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			if( objUpPaymentRequest.getConfirmationNumber() == null ) {

				objUpPaymentRequest.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );
			}

			confirmationNumber = objUpPaymentRequest.getConfirmationNumber();

			if( confirmationNumber.equalsIgnoreCase( ICloudKeyConstants.EMPTY_STRING ) ) {

				objUpPaymentResponse = new UpdatePaymentResponse();
				objUpPaymentResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " updatePayment ", " Required Fields are missing " );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS).entity( objUpPaymentResponse ).build();

			}
			else {

				objUpPaymentResponse = messageParser.updatePayment( objUpPaymentRequest );

				if( objUpPaymentResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE);
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				} 
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objUpPaymentResponse ).build();
				}

			}

		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " updatePayment ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " updatePayment ", " Exit method updatePayment " );

		return res;

	}

	/**
	 * This method makes guest update booking request on the basis of confirmation number.
	 * It returns the detail of reservations.
	 * 
	 * @param objUpBookingRequest
	 * @return Response
	 */
	@SuppressWarnings( "resource" )
	@Path( "/updateBooking" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )

	public Response updateBooking( UpdateBookingRequest objUpBookingRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class, " updateBooking ", " Enter method updateBooking " );

		/* variable to store UpdateBookingResponse instance.*/
		UpdateBookingResponse objUpBookingResponse = null;

		/* variable to store application context. */
		ApplicationContext appContext = null;   

		/* variable to store response. */
		Response res = null;

		/* variable to store message parser name. */
		String parserName = null;

		/* variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// reads the name of message parser bean from configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// creates an instance of application context using  information from beans configuration file.
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			// retrieve the current bean and store its reference.
			messageParser = ( IParserInterface ) appContext.getBean( parserName );

			if( objUpBookingRequest.getConfirmationNumber() == null ) {

				objUpBookingRequest.setConfirmationNumber( ICloudKeyConstants.EMPTY_STRING );

			}

			objUpBookingResponse = new UpdateBookingResponse();

			/**
			 * To check the request at least contains confirmation number with notes.
			 */
			String[] notes = objUpBookingRequest.getNotes();

			if( (notes[0].length() < 2) && (notes[1].length() <2 ) ) {

				objUpBookingResponse.setReservation( null );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " updateBooking ", " Required Fields are missing " );
				
				objUpBookingResponse.setStatus( ICloudKeyConstants.RES_FAILURE );

				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objUpBookingResponse ).build();

			}
			else if( ( objUpBookingRequest.getConfirmationNumber().equalsIgnoreCase( ICloudKeyConstants.EMPTY_STRING ) ) )  {

				objUpBookingResponse.setReservation( null );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " updateBooking ", " Required Fields are missing " );
				
				objUpBookingResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				
				res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objUpBookingResponse ).build();
			}
			else {

				objUpBookingResponse = messageParser.updateBooking( objUpBookingRequest );

				if( objUpBookingResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					res = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objUpBookingResponse ).build();
				}
			}

		}

		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " updateBooking ", exc ) ;
		}

		WebAppLogger.logInfo( KeyprWebServices.class, " updateBooking ", " Exit method updateBooking " );

		return res;
	}

	/**
	 * This method make release room request on the basis of reservation Id.
	 * It returns the status of released rooms.
	 * 
	 * @param objReleaseRoomRequest
	 * @return
	 */
	@SuppressWarnings("resource")
	@Path( "/releaseRoom" )
	@POST
	@Produces( MediaType.APPLICATION_JSON )
	@Consumes( MediaType.APPLICATION_JSON )
	public Response releaseRoom( com.cloudkey.pms.request.ReleaseRoomRequest objReleaseRoomRequest ) {

		WebAppLogger.logInfo( KeyprWebServices.class,  "  releaseRoom  ", "  Enter method releaseRoom  " );

		/* Variable to store release Room Response instance. */
		com.cloudkey.pms.response.ReleaseRoomResponse objReleaseRoomResponse = null;		

		/* Variable to store application context. */
		ApplicationContext appContext = null;	

		/* Variable to store response. */
		Response response = null;		

		/* variable to store message parser name. */
		String parserName = null;

		/* Variable to store message parser. */
		IParserInterface messageParser = null;

		try {

			// read the name of message parser bean from the bean configuration file.
			parserName = BaseConfigurationReader.getProperty( ICloudKeyConstants.PARSER_BEAN );

			// create an instance of application context using information from bean configuration file.		
			appContext = new ClassPathXmlApplicationContext( "META-INF/parser-beans.xml" );

			messageParser = ( IParserInterface )appContext.getBean( parserName );

			if( objReleaseRoomRequest.getReservationId() == null ) {

				objReleaseRoomRequest.setReservationId( ICloudKeyConstants.EMPTY_STRING );
			}


			objReleaseRoomResponse = new ReleaseRoomResponse();

			/**
			 * To check the request at least contains confirmation number with notes.
			 */

			if( objReleaseRoomRequest.getReservationId().equalsIgnoreCase( ICloudKeyConstants.EMPTY_STRING ) ) {

				objReleaseRoomResponse.setStatus( ICloudKeyConstants.RES_FAILURE );
				
				WebAppLogger.logInfo( KeyprWebServices.class, " releaseRoom ", " Required Fields are missing " );
				
				response = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objReleaseRoomResponse ).build();
				
			}
			else {

				objReleaseRoomResponse = messageParser.releaseRoom( objReleaseRoomRequest );

				if( objReleaseRoomResponse == null ) {

					TimeOutError objTimeOutError = new TimeOutError();
					objTimeOutError.setCode( ICloudKeyConstants.RES_STATUS_CODE );
					objTimeOutError.setMessage( ICloudKeyConstants.RES_MESSAGE );

					response = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objTimeOutError ).build();
				}
				else {

					response = Response.status( IWebServiceConstants.RESPONSE_STATUS ).entity( objReleaseRoomResponse ).build();
				}

			}

		}
		catch( Exception exc ) {

			WebAppLogger.logError( KeyprWebServices.class, " releaseRoom ", exc );
		}

		WebAppLogger.logInfo( KeyprWebServices.class,  " releaseRoom ", " Exit method releaseRoom " );

		return response;
	}

}
