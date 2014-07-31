package com.micros.pms.processor;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.CheckOutResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.micros.ows.reservation.ReservationServiceStub;
import com.micros.ows.resvadvanced.ResvAdvancedServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosPMSMessageParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by crizan2 on 17/07/2014.
 */
public class OWSResvAdvancedProcessor {

    final static String URL_RESV_ADVANCED = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/ResvAdvanced.asmx";

    public GetFolioResponse processRetrieveFolioInfo(GetFolioRequest folioRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processRetrieveFolioInfo ", " Enter in processRetrieveFolioInfo method.");

        ResvAdvancedServiceStub.InvoiceResponse objResponse = null;

        ResvAdvancedServiceStub.OGHeaderE ogh = getHeaderE();

        ResvAdvancedServiceStub.InvoiceRequest req = getFolioRequestObject(folioRequest);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        ResvAdvancedServiceStub.InvoiceRequestE reqE = new
                ResvAdvancedServiceStub.InvoiceRequestE();
        reqE.setInvoiceRequest(req);

        GetFolioResponse response = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processRetrieveFolioInfo ",
                AdapterUtility.convertToStreamXML(reqE));
        ResvAdvancedServiceStub.InvoiceResponseE respE = rstub.invoice(reqE, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processRetrieveFolioInfo ",
                AdapterUtility.convertToStreamXML(respE));

        response = getFolioResponseObject(respE.getInvoiceResponse());
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processRetrieveFolioInfo ",
                AdapterUtility.convertToStreamXML(response));

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processRetrieveFolioInfo ", " Exit processRetrieveFolioInfo method ");

        return response;
    }

    private GetFolioResponse getFolioResponseObject(ResvAdvancedServiceStub.InvoiceResponse objResponse) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter in getFolioResponseObject method ");

        GetFolioResponse objFolioResponse = new GetFolioResponse();
        objFolioResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objFolioResponse.getStatus().equalsIgnoreCase("FAIL")) {
            String message = getErrorMessage(objResponse.getResult());
            objFolioResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getFolioResponseObject ", " Get Folio Failed:" + message);
            return objFolioResponse;
        }

		/* Populate response into Reservation instance */
        String addressType = null;
        String countryCode = null;
        String firstName = null;
        String lastName = null;
        String description = null;

        double unitPrice;
        double totalBillAmount;

		/* Populate response into Reservation instance */
        Reservation objReservation = new Reservation();

        // set confirmation number.

        ResvAdvancedServiceStub.BillHeader[] arrBillHeader = objResponse.getInvoice();

        if (arrBillHeader != null) {
            for (ResvAdvancedServiceStub.BillHeader objBillHeader : arrBillHeader) { // Traversing Bill Header

                MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter to traverse Bill Header ");

                addressType = objBillHeader.getAddress().getAddressType();
                countryCode = objBillHeader.getAddress().getCountryCode();

                objReservation.setAddress(addressType + ":" + countryCode);

                firstName = objBillHeader.getName().getFirstName();
                lastName = objBillHeader.getName().getLastName();

                objReservation.setFirstName(firstName);
                objReservation.setLastName(lastName);

                objReservation.setFullName(firstName.concat(" " + lastName));

                List<ReservationOrders> objReservationOrders = objFolioResponse.getReservationOrderList();

                if (objReservationOrders == null) {

                    objReservationOrders = new ArrayList<ReservationOrders>();
                }

                ReservationOrders objOrders = new ReservationOrders();

                List<OrderDetails> objDetails = objOrders.getOrderDetailList();

                if (objDetails == null) {

                    objDetails = new ArrayList<OrderDetails>();
                }

                ResvAdvancedServiceStub.BillItem[] arrBillItem = objBillHeader.getBillItems();

                if (arrBillItem != null) {
                    for (int i = IMicrosConstants.COUNT_ZERO; i < arrBillItem.length; i++) { // Traversing bill Items.

                        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Enter to traverse Bill Items ");
                        OrderDetails objOrderDetails = new OrderDetails();

                        unitPrice = arrBillItem[i].getAmount().get_double();
                        description = arrBillItem[i].getDescription();

                        objOrderDetails.setUnitPrice(unitPrice);
                        objOrderDetails.setItemDescription(description);
                        objDetails.add(objOrderDetails);

                        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Exit to traverse Bill Items ");

                    } // End bill items traversing loop.
                }

                // add order details.
                objOrders.setOrderDetailList(objDetails);
                //		surchargeAmount = objBillHeader.getCreditCardSurcharges()[0].getSurchargeAmount().get_double();
                if (objBillHeader.getCreditCardSurcharges() != null) {
                    totalBillAmount = objBillHeader.getCreditCardSurcharges()[0].getTotalBillAmount().get_double();
                    objOrders.setTotalAmount(totalBillAmount);
                    objReservationOrders.add(objOrders);
                    objFolioResponse.setReservationOrderList(objReservationOrders);
                }

                //TODO: OPERA Does not send the confirmation number in the response.
                //************************************
                // set confirmation number.
/*
                ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = objBillHeader.getProfileIDs();
                ResvAdvancedServiceStub.UniqueID arrUniqueID[] = objUniqueIDList.getUniqueID();
                for (ResvAdvancedServiceStub.UniqueID uniqueID : arrUniqueID) {

                    String confirmationNumber = uniqueID.getString();
                    objReservation.setConfirmationNumber(confirmationNumber);
                    objReservation.setPmsId(confirmationNumber);
                }
*/
                MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Exit to traverse Bill Header ");

            } // End Bill Header loop.
        }

        objFolioResponse.setReservation(objReservation);

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioResponseObject ", " Exit  getFolioResponseObject method ");

        return objFolioResponse;
    }

    private ResvAdvancedServiceStub.InvoiceRequest getFolioRequestObject(GetFolioRequest folioRequest) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioRequestObject ", " Enter getFolioRequestObject method ");

		/* To get the request parameters. */
        String confirmationNumber = folioRequest.getConfirmationNumber();
        ResvAdvancedServiceStub.InvoiceRequest objInvoiceRequest = null;

        if ((folioRequest != null) && (folioRequest.getConfirmationNumber().length() > 0)) {

            objInvoiceRequest = new ResvAdvancedServiceStub.InvoiceRequest();

            ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = new ResvAdvancedServiceStub.ArrayOfUniqueID();
            ResvAdvancedServiceStub.UniqueID objUId = new ResvAdvancedServiceStub.UniqueID();

            objUId.setString(confirmationNumber);
            //objUId.setSource(IMicrosConstants.CoN);
            objUId.setType(ResvAdvancedServiceStub.UniqueIDType.INTERNAL);
            objUniqueIDList.addUniqueID(objUId);

            ResvAdvancedServiceStub.ReservationRequestBase objRequestBase = new ResvAdvancedServiceStub.ReservationRequestBase();

            objRequestBase.setReservationID(objUniqueIDList);
            objRequestBase.setHotelReference(getDefaultHotelReference());

			/*To set the reservation base into invoice request.*/
            objInvoiceRequest.setReservationRequest(objRequestBase);

        }

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getFolioRequestObject ", "  Exit getFolioRequestObject method ");

        return objInvoiceRequest;

    }


    public CheckOutResponse processCheckOut(CheckOutRequest request) throws RemoteException {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckOut ", " Enter in processCheckOut method. ");

        ResvAdvancedServiceStub.CheckOutResponse objResponse = null;

        ResvAdvancedServiceStub.OGHeaderE ogh = getHeaderE();

        ResvAdvancedServiceStub.CheckOutRequest req = getCheckOutRequestObject(request);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        ResvAdvancedServiceStub.CheckOutRequestE reqE = new
                ResvAdvancedServiceStub.CheckOutRequestE();
        reqE.setCheckOutRequest(req);

        CheckOutResponse response = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckOut ",
                AdapterUtility.convertToStreamXML(reqE));
        ResvAdvancedServiceStub.CheckOutResponseE respE = rstub.checkOut(reqE, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckOut ",
                AdapterUtility.convertToStreamXML(respE));

        response = getCheckOutResponseObject(respE.getCheckOutResponse());
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckOut ",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    private ResvAdvancedServiceStub.CheckOutRequest getCheckOutRequestObject(CheckOutRequest checkOutRequest) {
        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutRequestObject ", " Enter getCheckOutRequestObject method.");

        String confirmationNumber = checkOutRequest.getConfirmationNumber();

        ResvAdvancedServiceStub.OGHeaderE ogh = getHeaderE();
        ResvAdvancedServiceStub.CheckOutRequest objCheckOutRequest = new ResvAdvancedServiceStub.CheckOutRequest();

		/*To set the confirmation number and hotel code into reservation request base*/

        ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new ResvAdvancedServiceStub.ReservationRequestBase();
        objCheckOutRequest.setReservationRequest(objReservationRequestBase);

        ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = new ResvAdvancedServiceStub.ArrayOfUniqueID();
        ResvAdvancedServiceStub.UniqueID objUniqueID = new ResvAdvancedServiceStub.UniqueID();
        objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
        objUniqueID.setString(confirmationNumber);
        objUniqueID.setType(ResvAdvancedServiceStub.UniqueIDType.EXTERNAL);
        objUniqueIDList.addUniqueID(objUniqueID);


        objReservationRequestBase.setReservationID(objUniqueIDList);
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutRequestObject ", " Exit getCheckOutRequestObject method ");

        return objCheckOutRequest;
    }

    private CheckOutResponse getCheckOutResponseObject(ResvAdvancedServiceStub.CheckOutResponse checkOutResponse) {

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", " Enter getCheckOutResponseObject method ");

        CheckOutResponse objCheckOutResponse = new CheckOutResponse();
        Reservation objReservation = new Reservation();

        String confirmationNumber = null;
        String status = null;
        String firstName = null;
        String lastName = null;
        StringBuffer objStringBuffer = null;

        // set status in the response.
        status = checkOutResponse.getResult().getResultStatusFlag().toString();
        objCheckOutResponse.setStatus(status);

        if (checkOutResponse.getResult().getResultStatusFlag() != ResvAdvancedServiceStub.ResultStatusFlag.SUCCESS) {
            String message = getErrorMessage(checkOutResponse.getResult());
            objCheckOutResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", "Could not check out:" + message);
            return objCheckOutResponse;
        }

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", "  Status Set ");

        ResvAdvancedServiceStub.CheckOutComplete objCheckOutComplete = checkOutResponse.getCheckOutComplete();
        ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = objCheckOutComplete.getReservationID();
        ResvAdvancedServiceStub.UniqueID[] arrUniqueIDs = objUniqueIDList.getUniqueID();

		/*To set the confirmation number.*/
        for (ResvAdvancedServiceStub.UniqueID objUniqueID : arrUniqueIDs) {

            confirmationNumber = objUniqueID.getString();
            objReservation.setConfirmationNumber(confirmationNumber);
            objReservation.setPmsId(confirmationNumber);

            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", "  confirmation Number is  Set ");
        }

        ResvAdvancedServiceStub.Profile objProfile = checkOutResponse.getProfile();

        ResvAdvancedServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

        objStringBuffer = new StringBuffer();

		/* To set the first name and last name . */
        firstName = objPersonName.getFirstName();
        lastName = objPersonName.getLastName();

        if (firstName != null || lastName != null) {

            if (firstName != null) {

                objStringBuffer.append(firstName);
                objReservation.setFirstName(firstName);
            }
            if (lastName != null) {

                objStringBuffer.append(" " + lastName);
                objReservation.setLastName(lastName);
            }
            objReservation.setFullName(objStringBuffer.toString());

            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject  ", " Full Name is set.");

            objStringBuffer.setLength(IMicrosConstants.COUNT_ZERO);
        }

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", " Exit Profile.");
        objCheckOutResponse.setReservation(objReservation);
        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckOutResponseObject ", " Exit getCheckOutResponseObject method");

        return objCheckOutResponse;
    }

    public String getNextAvailableRoom(String roomType) throws RemoteException {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processFetchRoomStatus ", " Enter in processSearchReservationData method. ");

        ResvAdvancedServiceStub.FetchRoomStatusRequest objResponse = null;

        ResvAdvancedServiceStub.OGHeaderE ogh = getHeaderE();

        ResvAdvancedServiceStub.FetchRoomStatusRequest req = getRoomStatusRequest(roomType);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        ResvAdvancedServiceStub.FetchRoomStatusRequestE reqE = new
                ResvAdvancedServiceStub.FetchRoomStatusRequestE();
        reqE.setFetchRoomStatusRequest(req);

        String nextAvailableRoom = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processFetchRoomStatus ",
                AdapterUtility.convertToStreamXML(reqE));
        ResvAdvancedServiceStub.FetchRoomStatusResponseE respE = rstub.fetchRoomStatus(reqE, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processFetchRoomStatus ",
                AdapterUtility.convertToStreamXML(respE));

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processFetchRoomStatus ",
                AdapterUtility.convertToStreamXML(respE.getFetchRoomStatusResponse()));

        if (respE.getFetchRoomStatusResponse().getResult().getResultStatusFlag() == ResvAdvancedServiceStub.ResultStatusFlag.SUCCESS) {

            nextAvailableRoom = respE.getFetchRoomStatusResponse().
                    getRoomStatus()[IMicrosConstants.COUNT_ZERO].getRoomNumber();
        }

        return nextAvailableRoom;

    }

    public CheckInResponse processCheckIn(CheckInRequest request) throws RemoteException {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckIn ", " Enter in processSearchReservationData method. ");

        ResvAdvancedServiceStub.CheckInResponse objResponse = null;

        ResvAdvancedServiceStub.OGHeaderE ogh = getHeaderE();

        ResvAdvancedServiceStub.CheckInRequest req = getCheckInRequestObject(request);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        ResvAdvancedServiceStub.CheckInRequestE reqE = new
                ResvAdvancedServiceStub.CheckInRequestE();
        reqE.setCheckInRequest(req);

        CheckInResponse response = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckIn ",
                AdapterUtility.convertToStreamXML(reqE));
        ResvAdvancedServiceStub.CheckInResponseE respE = rstub.checkIn(reqE, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processCheckIn ",
                AdapterUtility.convertToStreamXML(respE));

        response = getCheckInResponseObject(respE.getCheckInResponse());
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processFetchRoomStatus ",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    private ResvAdvancedServiceStub.CheckInRequest getCheckInRequestObject(CheckInRequest checkInRequest) {
        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInRequestObject ", " Enter in getCheckInRequestObject method");

        String confirmationNumber = null;
        String creditCardNumber = null;

		/* To get the request parameters from the keypr client */
        confirmationNumber = checkInRequest.getReservation().getConfirmationNumber();
        creditCardNumber = checkInRequest.getReservation().getCreditCardNumber();

		/* To set request into the xsd classes. */
        ResvAdvancedServiceStub.CheckInRequest objCheckInRequest = new ResvAdvancedServiceStub.CheckInRequest();

		/* To set the card number into checkinRequest. */
        ResvAdvancedServiceStub.CreditCard objCreditCard = new ResvAdvancedServiceStub.CreditCard();

        if (creditCardNumber.length() > IMicrosConstants.COUNT_ZERO) {

            final ResvAdvancedServiceStub.CreditCardChoice_type0 objCardChoice_type0 = new ResvAdvancedServiceStub.CreditCardChoice_type0();

            objCardChoice_type0.setCardNumber(creditCardNumber);
            objCreditCard.setCreditCardChoice_type0(objCardChoice_type0);

            objCreditCard.setExpirationDate(new Date(1, 1, 2015));

        }



		/*To set credit card into credit card info.*/
        //ResvAdvancedServiceStub.CreditCardInfo objCreditCardInfo = new ResvAdvancedServiceStub.CreditCardInfo();

        //ResvAdvancedServiceStub.CreditCardInfoChoice_type0 type0 = new ResvAdvancedServiceStub.CreditCardInfoChoice_type0();
        //objCreditCardInfo.setCreditCardInfoChoice_type0(type0);

        //type0.setCreditCard(objCreditCard);

		/*To set the confirmation number and hotel code into reservation request base*/
        ResvAdvancedServiceStub.ReservationRequestBase objReservationRequestBase = new ResvAdvancedServiceStub.ReservationRequestBase();

        ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = new ResvAdvancedServiceStub.ArrayOfUniqueID();

        ResvAdvancedServiceStub.UniqueID objUniqueID = new ResvAdvancedServiceStub.UniqueID();
        objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
        objUniqueID.setString(confirmationNumber);
        objUniqueID.setType(ResvAdvancedServiceStub.UniqueIDType.EXTERNAL);

        objUniqueIDList.addUniqueID(objUniqueID);

        // set the confirmation number.
        objReservationRequestBase.setReservationID(objUniqueIDList);

        // set the hotel code.
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

		/* Set the confirmation . hotel code and credit card info into check in request. */

        objCheckInRequest.setReservationRequest(objReservationRequestBase);
        //objCheckInRequest.setCreditCardInfo( objCreditCardInfo );

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInRequestObject ", " Exit getCheckInRequestObject method.");

        return objCheckInRequest;

    }

    private CheckInResponse getCheckInResponseObject(ResvAdvancedServiceStub.CheckInResponse objResponse) {

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject ", " Enter in getCheckInResponseObject method.");

		/* Populate response into Reservation instance */
        CheckInResponse objCheckInResponse = new CheckInResponse();

        Reservation objReservation = new Reservation();
        objCheckInResponse.setReservation(objReservation);

        String confirmationNumber = null;
        String status = null;
        String roomTypeCode = null;
        String feature = null;
        String roomNumber = null;
        String firstName = null;
        String lastName = null;
        StringBuffer objStringBuffer = null;

        // set status in the response.
        status = objResponse.getResult().getResultStatusFlag().getValue();
        objCheckInResponse.setStatus(status);

        // If this has failed, we return and do not do any more processing.
        if (status.equalsIgnoreCase("FAIL")) {
            String message = getErrorMessage(objResponse.getResult());
            objCheckInResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject ", " CheckIn Failed:" + message);
            return objCheckInResponse;
        }

        ResvAdvancedServiceStub.CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();

        ResvAdvancedServiceStub.ArrayOfUniqueID objUniqueIDList = objCheckInComplete.getReservationID();
        ResvAdvancedServiceStub.UniqueID[] arrUniqueIDs = objUniqueIDList.getUniqueID();

        for (ResvAdvancedServiceStub.UniqueID objUniqueID : arrUniqueIDs) {
            if (objUniqueID.getType() == ResvAdvancedServiceStub.UniqueIDType.EXTERNAL) {
                confirmationNumber = objUniqueID.getString();
                objReservation.setConfirmationNumber(confirmationNumber);
                objReservation.setPmsId(confirmationNumber);
            }
        }

        ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation();

        objReservation.setReservationRoomAllocationList((new ArrayList<ReservationRoomAllocation>()));
        objReservation.getReservationRoomAllocationList().add(objReservationRoomAllocation);

        com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();

        ResvAdvancedServiceStub.Room objRoom = objCheckInComplete.getRoom();

        roomNumber = objRoom.getRoomNumber();
        ResvAdvancedServiceStub.RoomType obRoomType = objRoom.getRoomType();

        roomTypeCode = obRoomType.getRoomTypeCode();
        feature = obRoomType.getFeature();

        String roomDescription = "";
        if (objRoom.getRoomDescription() != null &&
                objRoom.getRoomDescription().getParagraphChoice_type0() != null) {
            ResvAdvancedServiceStub.ParagraphChoice_type0[] paragraphs = objRoom.getRoomDescription().getParagraphChoice_type0();


            for (ResvAdvancedServiceStub.ParagraphChoice_type0 paragraph : paragraphs) {

                if (paragraph.isTextSpecified()) {
                    ResvAdvancedServiceStub.Text text = paragraph.getText();
                    roomDescription += text.toString();
                    ;
                }
            }
        }

        // To set the more than 1 feature.
        ResvAdvancedServiceStub.ArrayOfRoomFeature objFeatureList = obRoomType.getRoomFeatures();

        if (objFeatureList != null) {
            ResvAdvancedServiceStub.RoomFeature[] arrRoomFeatures = objFeatureList.getFeatures();
            objStringBuffer = new StringBuffer();

            if (arrRoomFeatures != null) {
                for (ResvAdvancedServiceStub.RoomFeature objRoomFeature : arrRoomFeatures) {
                    feature = objRoomFeature.getFeature();
                    objStringBuffer.append(feature + ";");
                }

                objRoomType.setFeatures(objStringBuffer.toString());
            }
        }

        // set value in room type object.
        objRoomType.setCode(roomTypeCode);
        objRoomType.setDescription(roomDescription);
        objRoomType.setFeatures(feature);


        //TODO: Room number shouldn't be int. Should be string to accomodated hotels
        // with room numbers that contain dashes/characters etc...
        objReservationRoomAllocation.setRoomNo(Integer.parseInt(roomNumber));
        objReservationRoomAllocation.setRoomType(objRoomType);
        //		objReservationRoomAllocation.setRoomRateList( objRoomRateList );


        // Note :  checkin response has only 1 profile information.

        ResvAdvancedServiceStub.Profile objProfile = objResponse.getProfile();
        ResvAdvancedServiceStub.ArrayOfNameCreditCard objCardList = objProfile.getCreditCards();

        if (objCardList != null) {
            ResvAdvancedServiceStub.NameCreditCard[] arrNameCreditCard = objCardList.getNameCreditCard();
            //TODO: Check if credit cards are wanted.
            if (arrNameCreditCard != null) {
                for (ResvAdvancedServiceStub.NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

                    MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject  ", " Iterating NameCreditCard  Array.");

                    objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

                    MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject  ", " Credit Card Number is set.");
                } // End loop for name credit card.
            }
        }

        ResvAdvancedServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

        objStringBuffer = new StringBuffer();

		/* To set the first name and last name . */
        firstName = objPersonName.getFirstName();
        lastName = objPersonName.getLastName();

        if (firstName != null || lastName != null) {

            if (firstName != null) {

                objStringBuffer.append(firstName);
                objReservation.setFirstName(firstName);
            }
            if (lastName != null) {

                objStringBuffer.append(" " + lastName);
                objReservation.setLastName(lastName);
            }

            objReservation.setFullName(objStringBuffer.toString());

            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject  ", " Full Name is set.");

            objStringBuffer.setLength(IMicrosConstants.COUNT_ZERO);
        }

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject ", " Exit Profile.");
        objCheckInResponse.setReservation(objReservation);

        MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject ", " Enter in getCheckInResponseObject method.");

        return objCheckInResponse;
    }

    private String getErrorMessage(ResvAdvancedServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

    private ResvAdvancedServiceStub.FetchRoomStatusRequest getRoomStatusRequest(String roomType) {

        ResvAdvancedServiceStub.FetchRoomStatusRequest request = new ResvAdvancedServiceStub.FetchRoomStatusRequest();
        request.setRoomType(roomType);

        ResvAdvancedServiceStub.HotelReference objHotelReference = getDefaultHotelReference();
        request.setHotelReference(objHotelReference);

        return request;
    }

    private ResvAdvancedServiceStub.HotelReference getDefaultHotelReference() {
        ResvAdvancedServiceStub.HotelReference objHotelReference = new ResvAdvancedServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private ResvAdvancedServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        ResvAdvancedServiceStub.OGHeader ogHeader = new ResvAdvancedServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        ResvAdvancedServiceStub.EndPoint origin = new ResvAdvancedServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        ResvAdvancedServiceStub.EndPoint destination = new ResvAdvancedServiceStub.EndPoint();
        String destEntityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_DESTINATION_ID);

        destination.setEntityID(destEntityId);
        String destSystemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_DEST_TYPE);
        destination.setSystemType(destSystemType);

        // sets time stamp
        ogHeader.setTimeStamp(AdapterUtility.getCalender());

        // prepares OGHeader
        ogHeader.setOrigin(origin);
        ogHeader.setDestination(destination);

        String username = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_NAME);
        String password = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_PASS);

        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

            ResvAdvancedServiceStub.OGHeaderAuthentication auth = new ResvAdvancedServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            ResvAdvancedServiceStub.OGHeaderAuthenticationUserCredentials cred = new ResvAdvancedServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        ResvAdvancedServiceStub.OGHeaderE ogHeaderE = new ResvAdvancedServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private ResvAdvancedServiceStub getResvAdvancedServiceStub() {

        if (URL_RESV_ADVANCED == null) throw new NullPointerException("ResvAdvanced URL is null");

        ResvAdvancedServiceStub rstub = null;
        try {
            rstub = new ResvAdvancedServiceStub(URL_RESV_ADVANCED);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "getReservationServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }
}