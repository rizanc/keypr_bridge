package com.micros.pms.parser;

import java.util.List;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.CheckOutResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;
import com.micros.pms.bean.AssignRoomAdvRequest;
import com.micros.pms.bean.AssignRoomAdvResponse;
import com.micros.pms.bean.CreditCard;
import com.micros.pms.bean.CreditCardInfo;
import com.micros.pms.bean.HotelReference;
import com.micros.pms.bean.InvoiceRequest;
import com.micros.pms.bean.InvoiceResponse;
import com.micros.pms.bean.ReservationRequestBase;
import com.micros.pms.bean.UniqueID;
import com.micros.pms.bean.UniqueIDList;
import com.micros.pms.bean.UniqueIDType;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.transport.MicrosMessageTransport;
import com.micros.pms.util.AdapterUtility;


/**
 * This class is used to process the web service request and return the response
 * to the calling application. This class is used to receive the request and
 * convert request into micros specific format. It will receive the response
 * from the MICROS and will convert the response into keypr specific format .
 * 
 * @author niveditat
 * 
 */
public class MicrosPMSMessageParser implements IParserInterface {

	@Override
	public CheckInResponse guestCheckIn( CheckInRequest checkInRequest ) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, "guestCheckIn " , " Enter in checkin method. ");	

		com.micros.pms.bean.CheckInRequest objCheckInRequest = null;
		com.micros.pms.bean.CheckInResponse objResponse = null;
		CheckInResponse objCheckInResponse = null;
		String xmlRequest = null;
		String xmlResponse = null;

		objCheckInRequest =  getCheckInRequestObject( checkInRequest );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn " , " Convert request into xml form ");

		xmlRequest = AdapterUtility.convertToXML(objCheckInRequest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn " , " Get Request in xml format :: "+xmlRequest);	

		/*To send the xml request to the OXI Simulator via Message Transport*/
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn " , " Get Response from OXI Simulator in xml format :: "+xmlResponse);

		objResponse = new com.micros.pms.bean.CheckInResponse() ;

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn " , " Convert xml response into object ");

		objResponse = (com.micros.pms.bean.CheckInResponse) AdapterUtility.covertToObject( objResponse , xmlResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn " , " Get Response object from response xml ::: "+objResponse);

		objCheckInResponse = getCheckInResponseObject( objResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ",	 " Response received in message Parser : "+objCheckInResponse);
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckIn ",	 " Exit guestCheckIn method. ");

		return objCheckInResponse;
	}

	@Override
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Enter in guestCheckOut method. ");	

		com.micros.pms.bean.CheckOutRequest objCheckOutRequest = null;
		com.micros.pms.bean.CheckOutResponse objResponse = null;
		CheckOutResponse objCheckOutResponse = null;

		objCheckOutRequest =  getCheckOutRequestObject(checkOutRequest );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToXML(objCheckOutRequest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Get Request in xml format :: "+xmlRequest);	

		/*To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest(xmlRequest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Get Response from OXI Simulator in xml format :: "+xmlResponse);

		objResponse = new com.micros.pms.bean.CheckOutResponse() ;

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Convert xml response into object ");

		objResponse = (com.micros.pms.bean.CheckOutResponse) AdapterUtility.covertToObject( objResponse , xmlResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut " , " Get Response object from response xml ::: "+objResponse);

		objCheckOutResponse =  getCheckOutResponseObject( objResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut ",	 " Response received in message Parser : " + objCheckOutResponse );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " guestCheckOut ",	 " Exit guestCheckIn method. ");

		return objCheckOutResponse;
	}


	@Override
	public SearchReservationResponse searchReservationData(
			SearchReservationRequest arg0) {
	
		return null;
	}


	/**
	 * This method is used to generate the checkin response
	 * by populating the response object with simulator response.
	 * 
	 * @param objResponse
	 * @return CheckInResponse
	 */
	private CheckInResponse getCheckInResponseObject(
			com.micros.pms.bean.CheckInResponse objResponse) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getCheckInResponseObject " , " Enter in getCheckInResponseObject method. ");		

		/*Populate response into Reservation instance */
		CheckInResponse objCheckInResponse = new CheckInResponse();
		Reservation objReservation = new Reservation();	

		List<RoomDetails> objDetails =objReservation.getRoomDetailList();

		RoomDetails objRoomDetails = new RoomDetails();
		objRoomDetails.setRoomNumber(Integer.parseInt(objResponse.getCheckInComplete().getRoom().getRoomNumber()));
		objDetails.add(objRoomDetails);

		objReservation.setRoomDetailList(objDetails);
		objReservation.setConfirmationNumber(objResponse.getCheckInComplete().getReservationID().getUniqueID().get(0).getValue());
		objReservation.setCreditCardNumber(objResponse.getProfile().getCreditCards().getNameCreditCard().get(0).getCardNumber());
		objCheckInResponse.setReservation(objReservation);
		objCheckInResponse.setStatus(objResponse.getResult().getResultStatusFlag().value());

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getCheckInResponseObject " , " Enter in getCheckInResponseObject method. ");			
		return objCheckInResponse;

	}

	/**
	 * This method accepts the client request for checkin method
	 *  and generate the checkin request object to get checkout details.
	 * 
	 * @param checkInRequest
	 * @return CheckInRequest
	 */
	private com.micros.pms.bean.CheckInRequest getCheckInRequestObject(
			CheckInRequest checkInRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getCheckInRequestObject " , " Enter in getCheckInRequestObject method. ");		
		String confirmationNumber = null;
		String creditCardNumber = null;

		/*To get the request parameters from the keypr client*/
		confirmationNumber = checkInRequest.getReservation().getConfirmationNumber();
		creditCardNumber = checkInRequest.getReservation().getCreditCardNumber();

		/* To set request into the xsd classes.*/
		com.micros.pms.fatory.ObjectFactory objectFactory = new com.micros.pms.fatory.ObjectFactory();
		com.micros.pms.bean.CheckInRequest objCheckInRequest = objectFactory.createCheckInRequest();

		HotelReference objHotelReference =	objectFactory.createHotelReference();
		objHotelReference.setHotelCode("CASINO");

		/* To set the card number into checkinRequest.*/
		CreditCard objCard = objectFactory.createCreditCard();

		objCard.setCardNumber( AdapterUtility.getCreditCardNumber( creditCardNumber ));
		objCard.setExpirationDate(AdapterUtility.getGregorianDate());

		CreditCardInfo objCardInfo = objectFactory.createCreditCardInfo();
		objCardInfo.setCreditCard(objCard);

		ReservationRequestBase objRequestBase = objectFactory.createReservationRequestBase();

		UniqueIDList objUniqueIDList =objectFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();
		UniqueID u = objectFactory.createUniqueID();
		u.setValue(confirmationNumber);
		u.setType(UniqueIDType.EXTERNAL);
		objUniqueIDs.add(u);

		objRequestBase.setReservationID(objUniqueIDList); 
		objRequestBase.setHotelReference(objHotelReference);

		/*Set the confirmation and credit card info into check in request.*/

		objCheckInRequest.setReservationRequest(objRequestBase);
		objCheckInRequest.setCreditCardInfo(objCardInfo);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getCheckInRequestObject " , " Exit getCheckInRequestObject method. ");

		return objCheckInRequest;	 

	}


	/**
	  * This method is used to generate the checkout response
	 * by populating the response object with simulator response.
	 * 
	 * @param objResponse
	 * @return
	 */
	private CheckOutResponse getCheckOutResponseObject(
			com.micros.pms.bean.CheckOutResponse objResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ",	 "  Enter getCheckOutResponseObject method " );

		/*Populate response into Reservation instance */
		CheckOutResponse	objCheckOutResponse = new CheckOutResponse();
		Reservation objReservation = new Reservation();	
		objReservation.setConfirmationNumber(objResponse.getCheckOutComplete().getReservationID().getUniqueID().get(0).getValue());

		objCheckOutResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
		objCheckOutResponse.setReservation(objReservation);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutResponseObject ",	 " Exit getCheckOutResponseObject method " );
		
		return objCheckOutResponse;
	}


	/**
	 * This method accepts the client request for checkout method
	 *  and generate the checkout request object to get checkout details.
	 * 
	 * @param checkOutRequest
	 * @return
	 */
	private com.micros.pms.bean.CheckOutRequest getCheckOutRequestObject(
			CheckOutRequest checkOutRequest) {

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getCheckOutRequestObject ",	 " Enter getCheckOutRequestObject method. ");

		/*To get the request parameters.*/
		String confirmationNumber = checkOutRequest.getConfirmationNumber();

		/* To set request into the xsd classes.*/
		com.micros.pms.fatory.ObjectFactory objectFactory = new com.micros.pms.fatory.ObjectFactory();
		com.micros.pms.bean.CheckOutRequest objCheckOutRequest = objectFactory.createCheckOutRequest();

		HotelReference objHotelReference = objectFactory.createHotelReference();
		objHotelReference.setHotelCode("CASINO");

		CreditCardInfo objCardInfo = objectFactory.createCreditCardInfo();
		CreditCard objCreditCard = objectFactory.createCreditCard();

		objCreditCard.setCardNumber( "XXXX-XXXX-XXXX-7543" );
		objCreditCard.setCardType( "VISA" );
		objCreditCard.setExpirationDate(AdapterUtility.getGregorianDate());

		objCardInfo.setCreditCard(objCreditCard);

		UniqueIDList objUniqueIDList =objectFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();
		
		UniqueID uID = objectFactory.createUniqueID();
		uID.setValue(confirmationNumber);
		uID.setSource( "RESV_NAME_ID" );
		uID.setType( UniqueIDType.EXTERNAL );
		objUniqueIDs.add(uID);
		
		ReservationRequestBase objRequestBase = objectFactory.createReservationRequestBase();
		objRequestBase.setReservationID(objUniqueIDList);
		objRequestBase.setHotelReference(objHotelReference);

		objCheckOutRequest.setCreditCardInfo(objCardInfo);
		objCheckOutRequest.setReservationRequest(objRequestBase);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getCheckOutRequestObject ", " Exit getCheckOutRequestObject method " );

		return objCheckOutRequest;
	}


	@Override
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Enter in retrieveFolioInfo method. ");	

		com.micros.pms.bean.InvoiceRequest objfolioRequest = null;
		com.micros.pms.bean.InvoiceResponse objResponse = null;
		GetFolioResponse objGetFolioResponse = null;

		objfolioRequest =  getFolioRequestObject( folioRequest );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToXML( objfolioRequest);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Get Request in xml format :: "+xmlRequest);	

		/*To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest( xmlRequest );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Get Response from OXI Simulator in xml format :: " + xmlResponse );

		objResponse = new com.micros.pms.bean.InvoiceResponse() ;

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Convert xml response into object " );

		objResponse = (com.micros.pms.bean.InvoiceResponse) AdapterUtility.covertToObject( objResponse , xmlResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo " , " Get Response object from response xml ::: " + objResponse) ;

		objGetFolioResponse =  getFolioResponseObject( objResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ",	 " Response received in message Parser : " + objGetFolioResponse );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " retrieveFolioInfo ",	 " Exit retrieveFolioInfo method " );

		return objGetFolioResponse;
	}

	/**
	 * This method is used to generate the folio response
	 * by populating the response object with simulator response.
	 * 
	 * @param objResponse
	 * @return
	 */
	private GetFolioResponse getFolioResponseObject(InvoiceResponse objResponse) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject " , " Enter in getFolioResponseObject method " );		

		/*Populate response into Reservation instance */
		GetFolioResponse objFolioResponse = new GetFolioResponse();
		Reservation objReservation = new Reservation();

		objReservation.setAddress( objResponse.getInvoice().get(0).getAddress().toString() );
		objReservation.setFullName( objResponse.getInvoice().get(0).getName().getFirstName());
		List<ReservationOrders> objReservationOrders = objFolioResponse.getReservationOrderList();
		ReservationOrders objOrders = new ReservationOrders();

		List<OrderDetails> objDetails = objOrders.getOrderDetailList();
		
		
		for(int i = 0 ; i < objResponse.getInvoice().get(0).getBillItems().size(); i++) {
			OrderDetails objOrderDetails = new OrderDetails();
		objOrderDetails.setUnitPrice( objResponse.getInvoice().get(0).getBillItems().get(i).getAmount().getValue());
		objOrderDetails.setItemDescription( objResponse.getInvoice().get(0).getBillItems().get(i).getDescription());
		objDetails.add(objOrderDetails);
		
		}
		objOrders.setTotalAmount(objResponse.getInvoice().get(0).getCreditCardSurcharges().get(0).getTotalBillAmount().getValue());
		objReservationOrders.add( objOrders );
		objFolioResponse.setReservationOrderList( objReservationOrders );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioResponseObject " , " Exit  getFolioResponseObject method " );			
		return objFolioResponse;

	}

	/**
	 * This method accepts the client request for getFolio method
	 *  and generate the invoice request object to get the bill items details.
	 * 
	 * @param folioRequest
	 * @return
	 */
	private InvoiceRequest getFolioRequestObject(GetFolioRequest folioRequest) {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioRequestObject ",	 " Enter getFolioRequestObject method " );

		/*To get the request parameters.*/
		String confirmationNumber = folioRequest.getConfirmationNumber();

		/* To set request into the xsd classes.*/

		com.micros.pms.fatory.ObjectFactory objFactory = new com.micros.pms.fatory.ObjectFactory();
		InvoiceRequest objInvoiceRequest = objFactory.createInvoiceRequest();

		HotelReference objHotelReference = objFactory.createHotelReference();
		objHotelReference.setHotelCode("CASINO");

		UniqueIDList objUniqueIDList =objFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();
		UniqueID uId = objFactory.createUniqueID();
		uId.setValue(confirmationNumber);
		uId.setSource("PMS_ID");
		uId.setType(UniqueIDType.EXTERNAL);
		objUniqueIDs.add(uId);

		ReservationRequestBase objRequestBase = objFactory.createReservationRequestBase();
		objRequestBase.setReservationID( objUniqueIDList );
		objRequestBase.setHotelReference( objHotelReference );

		objInvoiceRequest.setReservationRequest(objRequestBase);

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFolioRequestObject ",	 "  Exit getFolioRequestObject method " );

		return objInvoiceRequest;

	}

	@Override
	public UpdateBookingResponse updateBooking(UpdateBookingRequest arg0) {

		return null;
	}

	@Override
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest arg0) {

		return null;
	}


	@Override
	public GetAvailabilityResponse checkAvailability(
			GetAvailabilityRequest arg0) {

		return null;
	}


	/**
	 * This method is used to call the assign room request for the available room  .
	 */
	@SuppressWarnings("unused")
	private AssignRoomAdvResponse assignRoomRequest(){

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " assignRoomRequest " , " Enter in assignRoomRequest method. ");	

		AssignRoomAdvRequest objARoomAdvRequest = null;
		AssignRoomAdvResponse objResponse = null;
		GetFolioResponse objGetFolioResponse = null;

		objARoomAdvRequest =  getAssignRoomRequestObject(  );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " assignRoomRequest " , " Convert request into xml form ");

		String xmlRequest = AdapterUtility.convertToXML( objARoomAdvRequest);

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " assignRoomRequest " , " Get Request in xml format :: "+xmlRequest);	

		/*To send the xml request to the OXI Simulator via Message Transport. */
		MicrosMessageTransport objMessageTransport = new MicrosMessageTransport();
		String xmlResponse = objMessageTransport.handlePMSRequest( xmlRequest );

		MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " assignRoomRequest " , " Get Response from OXI Simulator in xml format :: " + xmlResponse );

		objResponse = new AssignRoomAdvResponse() ;

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoomRequest " , " Convert xml response into object " );

		objResponse = (AssignRoomAdvResponse) AdapterUtility.covertToObject( objResponse , xmlResponse );

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoomRequest " , " Get Response object from response xml  " + objResponse) ;

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoomRequest ", " Response received in message Parser  " + objGetFolioResponse );
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " assignRoomRequest ",  " Exit guestCheckIn method " );

		return objResponse;

	}

	/**
	 * This method is used to make the request for the assignment of requested room.
	 * 
	 * @return AssignRoomAdvRequest
	 */
	private AssignRoomAdvRequest getAssignRoomRequestObject() {

		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomRequestObject ",	 " Enter getAssignRoomRequestObject method " );
		
		com.micros.pms.fatory.ObjectFactory objFactory =new com.micros.pms.fatory.ObjectFactory();
		AssignRoomAdvRequest objARoomAdvRequest =  objFactory.createAssignRoomAdvRequest();

		com.micros.pms.bean.HotelReference objHotelReference = objFactory.createHotelReference();
		objHotelReference.setHotelCode( "CASINO" );
		objARoomAdvRequest.setHotelReference( objHotelReference );

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( "1002" );
		uID.setSource( "OPERA_RESV_ID" );
		objARoomAdvRequest.setResvNameId( uID );
		objARoomAdvRequest.setRoomNoRequested( "3032" );
		objARoomAdvRequest.setStationID( "KIOSK1" );
		
		MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getAssignRoomRequestObject ",	 " Exit getAssignRoomRequestObject method " );
		return objARoomAdvRequest;
	}

}
