package com.micros.pms.processor;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.OGHeaderE;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard;
import com.cloudkey.pms.micros.og.name.NameCreditCard;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.BillHeader;
import com.cloudkey.pms.micros.og.reservation.BillItem;
import com.cloudkey.pms.micros.og.reservation.advanced.*;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceStub;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.micros.pms.OWSBase;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by crizan2 on 17/07/2014.
 */
public class OWSResvAdvancedProcessor extends OWSBase {
	final static String URL_RESV_ADVANCED = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/ResvAdvanced.asmx";

    public com.cloudkey.pms.response.reservations.PostChargeResponse postCharge(com.cloudkey.pms.request.reservations.PostChargeRequest postChargeRequest) throws RemoteException {
        log.debug("postCharge", "Enter in postCharge method.");

        OGHeaderE ogh = getHeaderE();

        PostChargeRequest req = getPostChargeRequestObject(postChargeRequest);
	    PostChargeRequestE requestE = new PostChargeRequestE();
	    requestE.setPostChargeRequest(req);

	    ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

	    com.cloudkey.pms.response.reservations.PostChargeResponse response = null;

        log.debug("postCharge",
                AdapterUtility.convertToStreamXML(requestE));
        PostChargeResponseE responseE = rstub.postCharge(requestE, ogh);

        log.debug("postCharge",
                AdapterUtility.convertToStreamXML(responseE));

	    errorIfFailure(responseE.getPostChargeResponse().getResult());

	    response = getPostChargeResponseObject(responseE.getPostChargeResponse());
	    log.debug("postCharge",
                AdapterUtility.convertToStreamXML(response));

        log.debug("postCharge", "Exit postCharge method ");

        return response;
    }

    private PostChargeRequest getPostChargeRequestObject(com.cloudkey.pms.request.reservations.PostChargeRequest postChargeRequest) {
        PostChargeRequest objPostChargeRequest = new PostChargeRequest();

        Posting posting = new Posting();
        objPostChargeRequest.setPosting(posting);

        posting.setCharge(postChargeRequest.getChargeAmount());
        posting.setFolioViewNo(postChargeRequest.getFolioViewNo());
        posting.setLongInfo(postChargeRequest.getLongInfo());
        posting.setShortInfo(postChargeRequest.getShortInfo());
        posting.setPostDate(postChargeRequest.getPostDate());
        posting.setStationID(postChargeRequest.getStationId());
        posting.setUserID(postChargeRequest.getUserId());

        ReservationRequestBase reservationRequestBase = new ReservationRequestBase();
        reservationRequestBase.setHotelReference(getDefaultHotelReference());
        posting.setReservationRequestBase(reservationRequestBase);

        ArrayOfUniqueID reservationIDs = new ArrayOfUniqueID();
        UniqueID uid = new UniqueID();
        reservationIDs.addUniqueID(uid);

        // TODO: Clarify INTERNAL/EXTERNAL
        uid.setType(UniqueIDType.INTERNAL);
        uid.setString(postChargeRequest.getReservationId());
        reservationRequestBase.setReservationID(reservationIDs);

        objPostChargeRequest.setAccount(postChargeRequest.getAccount());
        objPostChargeRequest.setAccount(postChargeRequest.getArticle());
        return objPostChargeRequest;
    }

    private com.cloudkey.pms.response.reservations.PostChargeResponse getPostChargeResponseObject(PostChargeResponse postChargeResponse) {
        log.debug("getPostChargeResponseObject", "Enter method");

	    com.cloudkey.pms.response.reservations.PostChargeResponse objFolioResponse = new com.cloudkey.pms.response.reservations.PostChargeResponse();

        return objFolioResponse;
    }

    public GetFolioResponse processRetrieveFolioInfo(com.cloudkey.pms.request.reservations.GetFolioRequest folioRequest) throws RemoteException {

        log.debug("processRetrieveFolioInfo", "Enter in processRetrieveFolioInfo method.");

        OGHeaderE ogh = getHeaderE();

        InvoiceRequest req = getFolioRequestObject(folioRequest);
        InvoiceRequestE requestE = new InvoiceRequestE();
	    requestE.setInvoiceRequest(req);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        GetFolioResponse response = null;

        log.debug("processRetrieveFolioInfo",
                AdapterUtility.convertToStreamXML(requestE));
        InvoiceResponseE responseE = rstub.invoice(requestE, ogh);
        log.debug("processRetrieveFolioInfo",
                AdapterUtility.convertToStreamXML(responseE));
	    errorIfFailure(responseE.getInvoiceResponse().getResult());

        response = getFolioResponseObject(responseE.getInvoiceResponse());
        log.debug("processRetrieveFolioInfo",
                AdapterUtility.convertToStreamXML(response));

        log.debug("processRetrieveFolioInfo", "Exit processRetrieveFolioInfo method ");

        return response;
    }

    private GetFolioResponse getFolioResponseObject(InvoiceResponse objResponse) {

        log.debug("getFolioResponseObject", "Enter method");

        GetFolioResponse objFolioResponse = new GetFolioResponse();

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

        BillHeader[] arrBillHeader = objResponse.getInvoice();

        if (arrBillHeader != null) {
            for (BillHeader objBillHeader : arrBillHeader) { // Traversing Bill Header

                log.debug("getFolioResponseObject", "Enter to traverse Bill Header ");

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

                BillItem[] arrBillItem = objBillHeader.getBillItems();

                if (arrBillItem != null) {
                    for (int i = IMicrosConstants.COUNT_ZERO; i < arrBillItem.length; i++) { // Traversing bill Items.

                        log.debug("getFolioResponseObject", "Enter to traverse Bill Items ");
                        OrderDetails objOrderDetails = new OrderDetails();

                        unitPrice = arrBillItem[i].getAmount().get_double();
                        description = arrBillItem[i].getDescription();

                        objOrderDetails.setUnitPrice(unitPrice);
                        objOrderDetails.setItemDescription(description);
                        objDetails.add(objOrderDetails);

                        log.debug("getFolioResponseObject", "Exit to traverse Bill Items ");

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
                ArrayOfUniqueID objArrayOfUniqueID = objBillHeader.getProfileIDs();
                UniqueID arrUniqueID[] = objArrayOfUniqueID.getUniqueID();
                for (UniqueID uniqueID : arrUniqueID) {

                    String confirmationNumber = uniqueID.getString();
                    objReservation.setConfirmationNumber(confirmationNumber);
                    objReservation.setPmsId(confirmationNumber);
                }
*/
                log.debug("getFolioResponseObject", "Exit to traverse Bill Header ");

            } // End Bill Header loop.
        }

        objFolioResponse.setReservation(objReservation);

        log.debug("getFolioResponseObject", "Exit  getFolioResponseObject method ");

        return objFolioResponse;
    }

    private InvoiceRequest getFolioRequestObject(GetFolioRequest folioRequest) {

        log.debug("getFolioRequestObject", "Enter getFolioRequestObject method ");

		/* To get the request parameters. */
        InvoiceRequest objInvoiceRequest = null;

        if (folioRequest.getConfirmationNumber() != null) {

            objInvoiceRequest = new InvoiceRequest();

            ArrayOfUniqueID objArrayOfUniqueID = new ArrayOfUniqueID();
            UniqueID objUId = new UniqueID();

            objUId.setString(folioRequest.getConfirmationNumber());
            //objUId.setSource(IMicrosConstants.CoN);
            objUId.setType(UniqueIDType.INTERNAL);
            objArrayOfUniqueID.addUniqueID(objUId);

            ReservationRequestBase objRequestBase = new ReservationRequestBase();

            objRequestBase.setReservationID(objArrayOfUniqueID);
            objRequestBase.setHotelReference(getDefaultHotelReference());

			/*To set the reservation base into invoice request.*/
            objInvoiceRequest.setReservationRequest(objRequestBase);

        }

        log.debug("getFolioRequestObject", "Exit getFolioRequestObject method ");

        return objInvoiceRequest;

    }

    public com.cloudkey.pms.response.reservations.CheckOutResponse processCheckOut(com.cloudkey.pms.request.reservations.CheckOutRequest request) throws RemoteException {
        log.debug("processCheckOut", "Enter in processCheckOut method. ");

        OGHeaderE ogh = getHeaderE();

        CheckOutRequest req = getCheckOutRequestObject(request);
        CheckOutRequestE requestE = new CheckOutRequestE();
	    requestE.setCheckOutRequest(req);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

	    com.cloudkey.pms.response.reservations.CheckOutResponse response;

        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(requestE));
        CheckOutResponseE resp = rstub.checkOut(requestE, ogh);
        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(resp));
	    errorIfFailure(resp.getCheckOutResponse().getResult());

	    response = getCheckOutResponseObject(resp.getCheckOutResponse());
        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    private CheckOutRequest getCheckOutRequestObject(com.cloudkey.pms.request.reservations.CheckOutRequest checkOutRequest) {
        log.debug("getCheckOutRequestObject", "Enter getCheckOutRequestObject method.");

        String confirmationNumber = checkOutRequest.getConfirmationNumber();

        OGHeaderE ogh = getHeaderE();
        CheckOutRequest objCheckOutRequest = new CheckOutRequest();

		/*To set the confirmation number and hotel code into reservation request base*/

        ReservationRequestBase objReservationRequestBase = new ReservationRequestBase();
        objCheckOutRequest.setReservationRequest(objReservationRequestBase);

        ArrayOfUniqueID objArrayOfUniqueID = new ArrayOfUniqueID();
        UniqueID objUniqueID = new UniqueID();
        objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
        objUniqueID.setString(confirmationNumber);
        objUniqueID.setType(UniqueIDType.EXTERNAL);
        objArrayOfUniqueID.addUniqueID(objUniqueID);

        objReservationRequestBase.setReservationID(objArrayOfUniqueID);
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

        log.debug("getCheckOutRequestObject", "Exit getCheckOutRequestObject method ");

        return objCheckOutRequest;
    }

    private com.cloudkey.pms.response.reservations.CheckOutResponse getCheckOutResponseObject(CheckOutResponse checkOutResponse) {

        log.debug("getCheckOutResponseObject", "Enter getCheckOutResponseObject method ");

	    com.cloudkey.pms.response.reservations.CheckOutResponse objCheckOutResponse = new com.cloudkey.pms.response.reservations.CheckOutResponse();
        Reservation objReservation = new Reservation();

        String confirmationNumber = null;
        String status = null;
        String firstName = null;
        String lastName = null;
        StringBuffer objStringBuffer = null;

        log.debug("getCheckOutResponseObject", "Status Set ");

        CheckOutComplete objCheckOutComplete = checkOutResponse.getCheckOutComplete();
        ArrayOfUniqueID objArrayOfUniqueID = objCheckOutComplete.getReservationID();
        UniqueID[] arrUniqueIDs = objArrayOfUniqueID.getUniqueID();

		/*To set the confirmation number.*/
        for (UniqueID objUniqueID : arrUniqueIDs) {

            confirmationNumber = objUniqueID.getString();
            objReservation.setConfirmationNumber(confirmationNumber);
            objReservation.setPmsId(confirmationNumber);

            log.debug("getCheckOutResponseObject", "confirmation Number is  Set ");
        }

        Profile objProfile = checkOutResponse.getProfile();

        PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

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

            log.debug("getCheckOutResponseObject", "Full Name is set.");

            objStringBuffer.setLength(IMicrosConstants.COUNT_ZERO);
        }

        log.debug("getCheckOutResponseObject", "Exit Profile.");
        objCheckOutResponse.setReservation(objReservation);
        log.debug("getCheckOutResponseObject", "Exit getCheckOutResponseObject method");

        return objCheckOutResponse;
    }

    public String getNextAvailableRoom(String roomType) throws RemoteException {
        log.debug("processFetchRoomStatus", "Enter in processSearchReservationData method.");

        OGHeaderE ogh = getHeaderE();

        FetchRoomStatusRequest req = getRoomStatusRequest(roomType);
        FetchRoomStatusRequestE requestE = new FetchRoomStatusRequestE();
	    requestE.setFetchRoomStatusRequest(req);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        String nextAvailableRoom = null;

        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(requestE));
        FetchRoomStatusResponseE responseE = rstub.fetchRoomStatus(requestE, ogh);

        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(responseE));

	    FetchRoomStatusResponse response = responseE.getFetchRoomStatusResponse();
	    errorIfFailure(response.getResult());

	    nextAvailableRoom = response.getRoomStatus()[IMicrosConstants.COUNT_ZERO].getRoomNumber();

	    log.debug("processFetchRoomStatus", nextAvailableRoom);

        return nextAvailableRoom;
    }

    public com.cloudkey.pms.response.reservations.CheckInResponse processCheckIn(com.cloudkey.pms.request.reservations.CheckInRequest request) throws RemoteException {
        log.debug("processCheckIn", "Enter in processSearchReservationData method. ");

        OGHeaderE ogh = getHeaderE();

        CheckInRequest req = getCheckInRequestObject(request);

        CheckInRequestE requestE = new CheckInRequestE();
	    requestE.setCheckInRequest(req);

        ResvAdvancedServiceStub rstub = getResvAdvancedServiceStub();

        log.debug("processCheckIn",
                AdapterUtility.convertToStreamXML(requestE));
        CheckInResponseE responseE = rstub.checkIn(requestE, ogh);
        log.debug("processCheckIn",
                AdapterUtility.convertToStreamXML(responseE));
	    errorIfFailure(responseE.getCheckInResponse().getResult());

	    com.cloudkey.pms.response.reservations.CheckInResponse response = getCheckInResponseObject(responseE.getCheckInResponse());
        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    private CheckInRequest getCheckInRequestObject(com.cloudkey.pms.request.reservations.CheckInRequest checkInRequest) {
        log.debug("getCheckInRequestObject", "Enter in getCheckInRequestObject method");

        /* To get the request parameters from the keypr client */

		/* To set request into the xsd classes. */
        CheckInRequest objCheckInRequest = new CheckInRequest();

		/* To set the card number into checkinRequest. */
        CreditCard objCreditCard = new CreditCard();

        if (checkInRequest.getCreditCardNumber() != null) {

            final CreditCardChoice_type0 objCardChoice_type0 = new CreditCardChoice_type0();

            objCardChoice_type0.setCardNumber(checkInRequest.getCreditCardNumber());
            objCreditCard.setCreditCardChoice_type0(objCardChoice_type0);

            objCreditCard.setExpirationDate(new Date(1, 1, 2015));

        }

		/*To set credit card into credit card info.*/
        //CreditCardInfo objCreditCardInfo = new CreditCardInfo();

        //CreditCardInfoChoice_type0 type0 = new CreditCardInfoChoice_type0();
        //objCreditCardInfo.setCreditCardInfoChoice_type0(type0);

        //type0.setCreditCard(objCreditCard);

		/*To set the confirmation number and hotel code into reservation request base*/
        ReservationRequestBase objReservationRequestBase = new ReservationRequestBase();

        ArrayOfUniqueID objArrayOfUniqueID = new ArrayOfUniqueID();

        UniqueID objUniqueID = new UniqueID();
        objUniqueID.setSource(IMicrosConstants.OWS_RESV_NAMEID);
        objUniqueID.setString(checkInRequest.getConfirmationNumber());
        objUniqueID.setType(UniqueIDType.EXTERNAL);

        objArrayOfUniqueID.addUniqueID(objUniqueID);

        // set the confirmation number.
        objReservationRequestBase.setReservationID(objArrayOfUniqueID);

        // set the hotel code.
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

		/* Set the confirmation . hotel code and credit card info into check in request. */

        objCheckInRequest.setReservationRequest(objReservationRequestBase);
        //objCheckInRequest.setCreditCardInfo( objCreditCardInfo );

        log.debug("getCheckInRequestObject", "Exit getCheckInRequestObject method.");

        return objCheckInRequest;

    }

    private com.cloudkey.pms.response.reservations.CheckInResponse getCheckInResponseObject(CheckInResponse objResponse) {

        log.debug("getCheckInResponseObject", "Enter in getCheckInResponseObject method.");

		/* Populate response into Reservation instance */
	    com.cloudkey.pms.response.reservations.CheckInResponse objCheckInResponse = new com.cloudkey.pms.response.reservations.CheckInResponse();

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

        CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();

        ArrayOfUniqueID objArrayOfUniqueID = objCheckInComplete.getReservationID();
        UniqueID[] arrUniqueIDs = objArrayOfUniqueID.getUniqueID();

        for (UniqueID objUniqueID : arrUniqueIDs) {
            if (objUniqueID.getType() == UniqueIDType.EXTERNAL) {
                confirmationNumber = objUniqueID.getString();
                objReservation.setConfirmationNumber(confirmationNumber);
                objReservation.setPmsId(confirmationNumber);
            }
        }

        ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation();

        objReservation.setReservationRoomAllocationList((new ArrayList<ReservationRoomAllocation>()));
        objReservation.getReservationRoomAllocationList().add(objReservationRoomAllocation);

        com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();

        Room objRoom = objCheckInComplete.getRoom();

        roomNumber = objRoom.getRoomNumber();
        RoomType obRoomType = objRoom.getRoomType();

        roomTypeCode = obRoomType.getRoomTypeCode();
        feature = obRoomType.getFeature();

        String roomDescription = "";
        if (objRoom.getRoomDescription() != null &&
                objRoom.getRoomDescription().getParagraphChoice_type0() != null) {
	        ParagraphChoice_type0[] paragraphs = objRoom.getRoomDescription().getParagraphChoice_type0();

	        for (ParagraphChoice_type0 paragraph : paragraphs) {

                if (paragraph.isTextSpecified()) {
                    Text text = paragraph.getText();
                    roomDescription += text.toString();
                }
            }
        }

        // To set the more than 1 feature.
        ArrayOfRoomFeature objFeatureList = obRoomType.getRoomFeatures();

        if (objFeatureList != null) {
            RoomFeature[] arrRoomFeatures = objFeatureList.getFeatures();
            objStringBuffer = new StringBuffer();

            if (arrRoomFeatures != null) {
                for (RoomFeature objRoomFeature : arrRoomFeatures) {
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

        Profile objProfile = objResponse.getProfile();
        ArrayOfNameCreditCard objCardList = objProfile.getCreditCards();

        if (objCardList != null) {
            NameCreditCard[] arrNameCreditCard = objCardList.getNameCreditCard();
            //TODO: Check if credit cards are wanted.
            if (arrNameCreditCard != null) {
                for (NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

                    log.debug("getCheckInResponseObject", "Iterating NameCreditCard  Array.");

                    objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

                    log.debug("getCheckInResponseObject", "Credit Card Number is set.");
                } // End loop for name credit card.
            }
        }

        PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

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

            log.debug("getCheckInResponseObject", "Full Name is set.");

            objStringBuffer.setLength(IMicrosConstants.COUNT_ZERO);
        }

        log.debug("getCheckInResponseObject", "Exit Profile.");
        objCheckInResponse.setReservation(objReservation);

        log.debug("getCheckInResponseObject", "Enter in getCheckInResponseObject method.");

        return objCheckInResponse;
    }

    private FetchRoomStatusRequest getRoomStatusRequest(String roomType) {

        FetchRoomStatusRequest request = new FetchRoomStatusRequest();
        request.setRoomType(roomType);

        HotelReference objHotelReference = getDefaultHotelReference();
        request.setHotelReference(objHotelReference);

        return request;
    }

    private ResvAdvancedServiceStub getResvAdvancedServiceStub() {

        if (URL_RESV_ADVANCED == null) throw new NullPointerException("ResvAdvanced URL is null");

        ResvAdvancedServiceStub rstub = null;
        try {
            rstub = new ResvAdvancedServiceStub(URL_RESV_ADVANCED);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            log.error("getReservationServiceStub ", axisFault);
        }
        return rstub;
    }
}