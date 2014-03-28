package com.micros.ows.processor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.micros.ows.bean.Amount;
import com.micros.ows.bean.AssignRoomAdvRequest;
import com.micros.ows.bean.AssignRoomAdvResponse;
import com.micros.ows.bean.BillHeader;
import com.micros.ows.bean.BillItem;
import com.micros.ows.bean.CheckInComplete;
import com.micros.ows.bean.CheckOutComplete;
import com.micros.ows.bean.CheckOutResponse;
import com.micros.ows.bean.CreditCardSurcharge;
import com.micros.ows.bean.Customer;
import com.micros.ows.bean.FetchRoomStatusRequest;
import com.micros.ows.bean.FetchRoomStatusResponse;
import com.micros.ows.bean.InvoiceRequest;
import com.micros.ows.bean.InvoiceResponse;
import com.micros.ows.bean.NameAddress;
import com.micros.ows.bean.NameCreditCard;
import com.micros.ows.bean.NameCreditCardList;
import com.micros.ows.bean.NativeName;
import com.micros.ows.bean.ObjectFactory;
import com.micros.ows.bean.PersonName;
import com.micros.ows.bean.Profile;
import com.micros.ows.bean.ReservationRequestBase;
import com.micros.ows.bean.ResultStatus;
import com.micros.ows.bean.ResultStatusFlag;
import com.micros.ows.bean.Room;
import com.micros.ows.bean.RoomStatus;
import com.micros.ows.bean.RoomType;
import com.micros.ows.bean.UniqueID;
import com.micros.ows.bean.UniqueIDList;
import com.micros.ows.bean.UniqueIDType;
import com.micros.ows.bean.CheckOutComplete.InvoiceNumber;
import com.micros.ows.constants.IMicrosOWSConstants;
import com.micros.ows.logger.OWSMessageLogger;
import com.micros.ows.utility.OWSUtility;

/**
 * This class handles the xml request from adapter and data harvester service . 
 * It generate the dummy response for the requested method.The response is converted in to xml
 * and it is return to its caller.
 * 
 * @author niveditat
 * 
 */

public class RequestProcessor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String confirmationNumber = null;
	private String xmlRequestValue = null;
	private String xmlOWSResponse = null;

	private ObjectFactory objFactory = null;
	private Enumeration<String> parameterNames = null;

	@Override
	protected void doPost( HttpServletRequest request ,	HttpServletResponse response ) {

		OWSMessageLogger.logInfo(RequestProcessor.class, " doPost ", " Enter in doPost ");
		PrintWriter out = null;

		try {

			out = response.getWriter();

		} catch (IOException exc) {

			OWSMessageLogger.logError( RequestProcessor.class, " doPost ", exc );
		}

		response.setContentType("text/html");
		parameterNames = request.getParameterNames();

		/*
		 * It iterates through all elements of request parameters. 
		 */
		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			xmlRequestValue = request.getParameter(paramName);

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " xml request is " + xmlRequestValue );
		}

		xmlOWSResponse = getOWSResponse( xmlRequestValue );

		out.println( xmlOWSResponse );

	}


	/**
	 * To generate the OWS response for the requested service.
	 * 
	 * @param xmlRequest
	 * @return String
	 */
	private String getOWSResponse( String xmlRequest ) {

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Enter getOWSResponse " );

		if (xmlRequestValue.contains( IMicrosOWSConstants.CHECKIN_REQUEST )) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " enter check in block " );

			xmlOWSResponse = getXMLCheckInResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost check in block ", " response send " + xmlOWSResponse );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " exit check in block " );

		}

		else if ( xmlRequestValue.contains( IMicrosOWSConstants.CHECKOUT_REQUEST )) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " enter CheckOutRequest block " );

			xmlOWSResponse = getXMLCheckOutResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost CheckOutRequest block ", " exit CheckOutRequest block " );
		}

		else if  (xmlRequestValue.contains( IMicrosOWSConstants.SEARCH_RESERVATION_REQUEST ) ) {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost SearchReservationRequest block ", " enter SearchReservationRequest block " );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost SearchReservationRequest block ", " exit SearchReservationRequest block " );

		}
		else if(xmlRequestValue.contains( IMicrosOWSConstants.GETFOLIO_REQUEST )){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block ", " enter getFolio block " );

			xmlOWSResponse = getXMLFolioResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost getFolio block ", " exit getFolio block " );
		}
		else if(xmlRequestValue.contains( IMicrosOWSConstants.ASSIGN_ROOM_REQUEST )){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room block ", " enter assign Room  block " );

			xmlOWSResponse = getXMLAssignRoomResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost assign Room  block ", " exit assign Room  block " );
		}
		else if (xmlRequestValue.contains( IMicrosOWSConstants.FETCH_ROOM_STATUS_REQUEST ) ){

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " enter FetchRoomStatusRequest block " );

			xmlOWSResponse = getXMLFetchRoomStatusResponse();

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Xml Response "  );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " exit FetchRoomStatusRequest block " );

		}

		else {

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " enter invalid request block " );

			OWSMessageLogger.logInfo( RequestProcessor.class, " doPost invalid block ", " exit enter invalid request block " );
		}

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost ", " Exit getOWSResponse " );
		return xmlOWSResponse;
	}

	/**
	 * This method generates response for the fetch room status request . It accepts the request in xml format, convert it to 
	 * fetch room status request object. It populates the fetch room status response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLFetchRoomStatusResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFetchRoomResponse  ", " Enter getXMLFetchRoomResponse method" );		String fetchRoomStatusResponse = null;

		FetchRoomStatusRequest objFetchRoomStatusRequest = null;

		objFetchRoomStatusRequest = new FetchRoomStatusRequest();

		objFetchRoomStatusRequest = (FetchRoomStatusRequest)OWSUtility.covertToObject(objFetchRoomStatusRequest, xmlRequestValue);

		objFactory = new ObjectFactory();

		FetchRoomStatusResponse objFetchRoomStatusResponse = objFactory.createFetchRoomStatusResponse();

		OWSMessageLogger.logInfo( RequestProcessor.class, " doPost FetchRoomStatusRequest block ", " FetchRoomStatusResponse Object created " );

		RoomStatus objRoomStatus = objFactory.createRoomStatus();
		objRoomStatus.setRoomStatus( "IP" );
		objRoomStatus.setFrontOfficeStatus( "VAC" );
		objRoomStatus.setOccupancyCondition( "2");
		objRoomStatus.setHouseKeepingStatus( "Inspected");
		objRoomStatus.setRoomNumber( "0508" );
		objRoomStatus.setRoomType( "SUK" );

		List<RoomStatus> objRoomStatu = objFetchRoomStatusResponse.getRoomStatus();
		objRoomStatu.add(objRoomStatus);

		// adding second room status details
		objRoomStatus = objFactory.createRoomStatus();
		objRoomStatus.setRoomStatus( "IP" );
		objRoomStatus.setFrontOfficeStatus( "VAC" );
		objRoomStatus.setOccupancyCondition( "3");
		objRoomStatus.setHouseKeepingStatus( "Inspected");
		objRoomStatus.setRoomNumber( "0509" );
		objRoomStatus.setRoomType( "SUK" );

		objRoomStatu.add(objRoomStatus);

		fetchRoomStatusResponse = OWSUtility.convertToXML( objFetchRoomStatusResponse );
		
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFetchRoomResponse  ", " Exit getXMLFetchRoomResponse method" );
		return fetchRoomStatusResponse;
	}


	/**
	 * This method generates response for the assign room request . It accepts the request in xml format, convert it to 
	 * assign request object. It populates the assign response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLAssignRoomResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLAssignRoomResponse  ", " Enter getXMLAssignRoomResponse method" );
		AssignRoomAdvResponse objAdvResponse  = null;
		AssignRoomAdvRequest	objReuest = null;

		/* Covert xml into object.*/
		objReuest = new AssignRoomAdvRequest() ;	
		objReuest = (AssignRoomAdvRequest)OWSUtility.covertToObject( objReuest , xmlRequestValue );
		ObjectFactory objFactory = new ObjectFactory();

		objAdvResponse = objFactory.createAssignRoomAdvResponse();

		ResultStatus objResultStatus = objFactory.createResultStatus();
		objResultStatus.setResultStatusFlag(ResultStatusFlag.SUCCESS);
		objAdvResponse.setResult( objResultStatus );
		objAdvResponse.setRoomNoAssigned( objReuest.getRoomNoRequested() );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objAdvResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, "  getXMLAssignRoomResponse  ", " Exit getXMLAssignRoomResponse method " );

		return xmlOWSResponse;

	}


	/**
	 * This method generates response for the guest bill items request . It accepts the request in xml format, convert it to 
	 * invoice request object. It populates the invoice response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLFolioResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFolioResponse ", " Enter getXMLFolioResponse method " );

		InvoiceResponse objInvoiceResponse  = null;
		InvoiceRequest	objReuest = null;
		double subTotal = 0;
		
		/* Covert xml into object. */
		objReuest = new InvoiceRequest() ;	
		objReuest = (InvoiceRequest)OWSUtility.covertToObject( objReuest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objInvoiceResponse = objFactory.createInvoiceResponse();

		/*To set the result status.*/
		ResultStatus objResultStatus = objFactory.createResultStatus();
		objResultStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );

		/*To set the bill header with all values in bill header list.*/
		List<BillHeader> objBillHeaders = objInvoiceResponse.getInvoice();
		BillHeader objBillHeader = objFactory.createBillHeader();

		NameAddress objNameAddress = objFactory.createNameAddress();
		objNameAddress.setAddressType( "address change" );
		objNameAddress.setCountryCode( "IN" );
		objBillHeader.setAddress( objNameAddress );

		NativeName objNativeName = objFactory.createNativeName();
		objNativeName.setFirstName( "tammy" );
		objNativeName.setLastName( "konopik" );;
		objBillHeader.setName(objNativeName);

		/* Sets confirmation number and its type.*/
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
		
		ReservationRequestBase objBase = objReuest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();			
	
		objIds = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.EXTERNAL );
		uID.setSource( "PMS_ID" );
		objIds.add( uID );

		objBillHeader.setProfileIDs( objUniqueIDList );

		uID = objFactory.createUniqueID();
		uID.setValue( "2323" );
		uID.setSource( "OPERA" );
		uID.setType( UniqueIDType.INTERNAL );

		objBillHeader.setBillNumber( uID );

		/*set bill items into bill header.*/
		List<BillItem> objBillItems = objBillHeader.getBillItems();

		BillItem objBillItem = objFactory.createBillItem();
		Amount objAmount = objFactory.createAmount();
		objAmount.setValue( 110 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Transient Room Revenue" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;

		objBillItems = objBillHeader.getBillItems();

		objBillItem = objFactory.createBillItem();
		objAmount = objFactory.createAmount();
		objAmount.setValue( 120 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode(uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Lobby Bar Beverage" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;

		objBillItems = objBillHeader.getBillItems();

		objBillItem = objFactory.createBillItem();
		objAmount = objFactory.createAmount();
		objAmount.setValue( 130 );
		objBillItem.setAmount( objAmount );
		objBillItem.setVatCode( uID );
		objBillItem.setDate( OWSUtility.getGregorianDate() );
		objBillItem.setDescription( "Lobby Bar Food" );
		objBillItems.add( objBillItem );
		subTotal = objAmount.getValue() + subTotal;
		
		objBillHeaders.add( objBillHeader );

		/*set the surcharge and total amount in credit card surcharge list.*/
		List< CreditCardSurcharge > objCardSurcharges = objBillHeader.getCreditCardSurcharges();
		CreditCardSurcharge objCardSurcharge = objFactory.createCreditCardSurcharge();
		
	

		objAmount = objFactory.createAmount();
		objAmount.setValue( 10 );		
		objCardSurcharge.setSurchargeAmount( objAmount  );
		subTotal = objAmount.getValue() + subTotal;
		
		objAmount = objFactory.createAmount();
		objAmount.setValue( subTotal );
		objCardSurcharge.setTotalBillAmount( objAmount );
		
		objCardSurcharges.add( objCardSurcharge );

		objInvoiceResponse.setResult(objResultStatus);

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objInvoiceResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLFolioResponse ", " Exit getXMLFolioResponse method " );

		return xmlOWSResponse;
	}


	/**
	 * This method generates response for the check out request . It accepts the request in xml format, convert it to 
	 * check out request object. It populates the check out response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLCheckOutResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckOutResponse ", " Enter getXMLCheckOutResponse method" );

		CheckOutResponse objCheckOutResponse  = null;
		com.micros.ows.bean.CheckOutRequest	objReuest = null;

		/* Covert xml into object. */
		objReuest = new com.micros.ows.bean.CheckOutRequest() ;	
		objReuest = (com.micros.ows.bean.CheckOutRequest)OWSUtility.covertToObject( objReuest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objCheckOutResponse = objFactory.createCheckOutResponse();

		ResultStatus objResultStatus = objFactory.createResultStatus();
		objResultStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );

		/* Retrieve confirmation number from check in request instance. */
		ReservationRequestBase objBase = objReuest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();

		/* Sets confirmation number and its type.*/
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.INTERNAL );
		objUniqueIDs.add( uID );

		/* Sets the unique identifier list with the reservation identifier. */
		CheckOutComplete objCheckOutComplete = objFactory.createCheckOutComplete();
		objCheckOutComplete.setReservationID( objUniqueIDList );

		List<InvoiceNumber> objInvoiceNumbers = objCheckOutComplete.getInvoiceNumber();
		InvoiceNumber objInvoiceNumber = new InvoiceNumber();
		objInvoiceNumber.setValue( "647" );
		objInvoiceNumbers.add( objInvoiceNumber );

		objCheckOutResponse.setResult(objResultStatus);
		objCheckOutResponse.setCheckOutComplete(objCheckOutComplete);	

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objCheckOutResponse );
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckOutResponse ", " Exit getXMLCheckOutResponse method " );

		return xmlOWSResponse;
	}


	/**
	 * This method generates response for the check in request . It accepts the request in xml format, convert it to 
	 * check in request object. It populates the check in response object with the required details , convert it to
	 * xml and return it to its caller.
	 * 
	 * @return String
	 */
	private String getXMLCheckInResponse() {

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " Enter getXMLCheckInResponse method " );

		com.micros.ows.bean.CheckInResponse objCheckInResponse = null;

		/*Covert xml into object.*/
		com.micros.ows.bean.CheckInRequest	objCheckInRequest = new com.micros.ows.bean.CheckInRequest() ;	
		objCheckInRequest = (com.micros.ows.bean.CheckInRequest)OWSUtility.covertToObject( objCheckInRequest , xmlRequestValue );

		objFactory = new ObjectFactory();
		objCheckInResponse = objFactory.createCheckInResponse();
		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " check in response object created " );

		CheckInComplete objCheckInComplete = objFactory.createCheckInComplete();

		/* Retrieve confirmation number from check in request instance. */
		ReservationRequestBase objBase = objCheckInRequest.getReservationRequest();
		List<UniqueID> objIds = objBase.getReservationID().getUniqueID();
		confirmationNumber =  objIds.get(0).getValue();

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " confirmation number is " + confirmationNumber );

		/* Sets confirmation number and its type. */
		UniqueIDList objUniqueIDList = objFactory.createUniqueIDList();
		List<UniqueID> objUniqueIDs = objUniqueIDList.getUniqueID();

		UniqueID uID = objFactory.createUniqueID();
		uID.setValue( confirmationNumber );
		uID.setType( UniqueIDType.EXTERNAL );
		objUniqueIDs.add( uID );

		/* Sets the unique identifier list with the reservation identifier. */
		objCheckInComplete.setReservationID( objUniqueIDList );

		/* set credit card number. */
		Profile objProfile =objFactory.createProfile();

		NameCreditCardList objCardList =  objFactory.createNameCreditCardList();
		NameCreditCard objCard =  objFactory.createNameCreditCard();

		objCard.setCardNumber( OWSUtility.getCreditCardNumber( objCheckInRequest.getCreditCardInfo().getCreditCard().getCardNumber()) );
		objCard.setSeriesCode( "SSDDD5555DF" );
		objCard.setExpirationDate( OWSUtility.getGregorianDate() );

		objCardList.getNameCreditCard().add( objCard );
		objProfile.setCreditCards( objCardList );

		Customer objCustomer = objFactory.createCustomer();
		PersonName objPersonName = objFactory.createPersonName();
		objPersonName.setFirstName( "John" );
		objPersonName.setLastName( "Peter" );
		objCustomer.setPersonName(objPersonName);	

		objProfile.setCustomer( objCustomer );
		objCheckInResponse.setProfile( objProfile );

		Room objRoom = objFactory.createRoom();
		objRoom.setRoomNumber( "783" );
		RoomType objRoomType = objFactory.createRoomType();
		objRoomType.setRoomTypeCode( "POQB" );
		objRoom.setRoomType( objRoomType );
		objCheckInComplete.setRoom( objRoom );

		/* Sets the check in response with the instance of check in complete. */
		objCheckInResponse.setCheckInComplete( objCheckInComplete );

		ResultStatus objRStatus = objFactory.createResultStatus();

		/* Set the status to the check in response. */
		objRStatus.setResultStatusFlag( ResultStatusFlag.SUCCESS );
		objCheckInResponse.setResult( objRStatus );

		/* Covert response into xml format. */
		xmlOWSResponse = OWSUtility.convertToXML( objCheckInResponse );

		OWSMessageLogger.logInfo( RequestProcessor.class, " getXMLCheckInResponse ", " Exit getXMLCheckInResponse method " );	

		return xmlOWSResponse;
	}

}
