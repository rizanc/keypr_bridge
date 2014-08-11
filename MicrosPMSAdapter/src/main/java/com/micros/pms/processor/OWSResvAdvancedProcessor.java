package com.micros.pms.processor;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard;
import com.cloudkey.pms.micros.og.name.NameCreditCard;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.BillHeader;
import com.cloudkey.pms.micros.og.reservation.BillItem;
import com.cloudkey.pms.micros.og.reservation.advanced.*;
import com.cloudkey.pms.micros.services.ResvAdvancedService;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by crizan2 on 17/07/2014.
 */
public class OWSResvAdvancedProcessor extends OWSBase {

	@Inject
	protected ResvAdvancedService service;

	public com.cloudkey.pms.response.reservations.PostChargeResponse postCharge(com.cloudkey.pms.request.reservations.PostChargeRequest request) throws RemoteException {
        log.debug("postCharge: Enter in postCharge method.");

	    PostChargeRequest microsRequest = getPostChargeRequestObject(request);
	    PostChargeRequestE microsRequestE = new PostChargeRequestE();

	    microsRequestE.setPostChargeRequest(microsRequest);
	    log.debug("postCharge", AdapterUtility.convertToStreamXML(microsRequestE));

	            PostChargeResponseE responseE = service.postCharge(microsRequestE, createOGHeaderE());
        log.debug("postCharge", AdapterUtility.convertToStreamXML(responseE));

	    errorIfFailure(responseE.getPostChargeResponse().getResult());

	    com.cloudkey.pms.response.reservations.PostChargeResponse response = getPostChargeResponseObject(responseE.getPostChargeResponse());
	    log.debug("postCharge", AdapterUtility.convertToStreamXML(response));

        log.debug("postCharge: Exit postCharge method ");

        return response;
    }

    private PostChargeRequest getPostChargeRequestObject(com.cloudkey.pms.request.reservations.PostChargeRequest postChargeRequest) {
        PostChargeRequest objPostChargeRequest = new PostChargeRequest();

        Posting posting = new Posting();

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

        reservationRequestBase.setReservationID(arrayOf(internalReservationId(postChargeRequest.getPmsReservationId())));

	    objPostChargeRequest.setPosting(posting);
	    objPostChargeRequest.setAccount(postChargeRequest.getAccount());
	    objPostChargeRequest.setArticle(postChargeRequest.getArticle());
        return objPostChargeRequest;
    }

    private com.cloudkey.pms.response.reservations.PostChargeResponse getPostChargeResponseObject(PostChargeResponse microsResponse) {
        log.debug("getPostChargeResponseObject: Enter method");
	    return new com.cloudkey.pms.response.reservations.PostChargeResponse();
    }

    public GetFolioResponse processRetrieveFolioInfo(com.cloudkey.pms.request.reservations.GetFolioRequest request) throws RemoteException {
        log.debug("processRetrieveFolioInfo: Enter in processRetrieveFolioInfo method.");

	    InvoiceRequest microsRequest = getFolioRequestObject(request);
        InvoiceRequestE microsRequestE = new InvoiceRequestE();
	    microsRequestE.setInvoiceRequest(microsRequest);

        log.debug("processRetrieveFolioInfo", AdapterUtility.convertToStreamXML(microsRequestE));

        InvoiceResponseE responseE = service.invoice(microsRequestE, createOGHeaderE());
        log.debug("processRetrieveFolioInfo", AdapterUtility.convertToStreamXML(responseE));

	    errorIfFailure(responseE.getInvoiceResponse().getResult());

        log.debug("processRetrieveFolioInfo: Exit processRetrieveFolioInfo method ");

        return getFolioResponseObject(responseE.getInvoiceResponse());
    }

    private GetFolioResponse getFolioResponseObject(InvoiceResponse objResponse) {
        log.debug("getFolioResponseObject: Enter method");

        GetFolioResponse objFolioResponse = new GetFolioResponse();

		/* Populate response into Reservation instance */
        String addressType;
        String countryCode;
        String firstName;
        String lastName;
        String description;

        double unitPrice;
        double totalBillAmount;

		/* Populate response into Reservation instance */
        Reservation objReservation = new Reservation();

        // set confirmation number.

        BillHeader[] arrBillHeader = objResponse.getInvoice();

        if (arrBillHeader != null) {
            for (BillHeader objBillHeader : arrBillHeader) { // Traversing Bill Header

                log.debug("getFolioResponseObject: Enter to traverse Bill Header ");

                addressType = objBillHeader.getAddress().getAddressType();
                countryCode = objBillHeader.getAddress().getCountryCode();

                objReservation.setAddress(addressType + ":" + countryCode);

                firstName = objBillHeader.getName().getFirstName();
                lastName = objBillHeader.getName().getLastName();

                objReservation.setFirstName(firstName);
                objReservation.setLastName(lastName);

                objReservation.setFullName(firstName + " " + lastName);

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
                    for (int i = 0; i < arrBillItem.length; i++) { // Traversing bill Items.

                        log.debug("getFolioResponseObject: Enter to traverse Bill Items ");
                        OrderDetails objOrderDetails = new OrderDetails();

                        unitPrice = arrBillItem[i].getAmount().get_double();
                        description = arrBillItem[i].getDescription();

                        objOrderDetails.setUnitPrice(unitPrice);
                        objOrderDetails.setItemDescription(description);
                        objDetails.add(objOrderDetails);

                        log.debug("getFolioResponseObject: Exit to traverse Bill Items ");

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
                    objReservation.setPmsReservationId(confirmationNumber);
                }
*/
                log.debug("getFolioResponseObject: Exit to traverse Bill Header ");

            } // End Bill Header loop.
        }

        objFolioResponse.setReservation(objReservation);

        log.debug("getFolioResponseObject: Exit  getFolioResponseObject method ");

        return objFolioResponse;
    }

    private InvoiceRequest getFolioRequestObject(GetFolioRequest folioRequest) {

        log.debug("getFolioRequestObject: Enter getFolioRequestObject method ");

		/* To get the request parameters. */
        InvoiceRequest objInvoiceRequest = null;

        if (folioRequest.getPmsReservationId() != null) {

            objInvoiceRequest = new InvoiceRequest();

            ArrayOfUniqueID objArrayOfUniqueID = new ArrayOfUniqueID();
            UniqueID objUId = new UniqueID();

            objUId.setString(folioRequest.getPmsReservationId());
            //objUId.setSource(IMicrosConstants.CoN);
            objUId.setType(UniqueIDType.INTERNAL);
            objArrayOfUniqueID.addUniqueID(objUId);

            ReservationRequestBase objRequestBase = new ReservationRequestBase();

            objRequestBase.setReservationID(objArrayOfUniqueID);
            objRequestBase.setHotelReference(getDefaultHotelReference());

			/*To set the reservation base into invoice request.*/
            objInvoiceRequest.setReservationRequest(objRequestBase);

        }

        log.debug("getFolioRequestObject: Exit getFolioRequestObject method ");

        return objInvoiceRequest;

    }

    public com.cloudkey.pms.response.reservations.CheckOutResponse processCheckOut(com.cloudkey.pms.request.reservations.CheckOutRequest request) throws RemoteException {
        log.debug("processCheckOut: Enter in processCheckOut method. ");

	    CheckOutRequest req = getCheckOutRequestObject(request);
        CheckOutRequestE requestE = new CheckOutRequestE();
	    requestE.setCheckOutRequest(req);

        	    com.cloudkey.pms.response.reservations.CheckOutResponse response;

        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(requestE));
        CheckOutResponseE resp = service.checkOut(requestE, createOGHeaderE());
        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(resp));
	    errorIfFailure(resp.getCheckOutResponse().getResult());

	    response = getCheckOutResponseObject(resp.getCheckOutResponse());
        log.debug("processCheckOut",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    private CheckOutRequest getCheckOutRequestObject(com.cloudkey.pms.request.reservations.CheckOutRequest checkOutRequest) {
        log.debug("getCheckOutRequestObject: Enter getCheckOutRequestObject method.");

        CheckOutRequest objCheckOutRequest = new CheckOutRequest();

		/*To set the confirmation number and hotel code into reservation request base*/
        ReservationRequestBase objReservationRequestBase = new ReservationRequestBase();
        objCheckOutRequest.setReservationRequest(objReservationRequestBase);

        objReservationRequestBase.setReservationID(arrayOf(internalReservationId(checkOutRequest.getPmsReservationId())));
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

        log.debug("getCheckOutRequestObject: Exit getCheckOutRequestObject method ");

        return objCheckOutRequest;
    }

    private com.cloudkey.pms.response.reservations.CheckOutResponse getCheckOutResponseObject(CheckOutResponse checkOutResponse) {

        log.debug("getCheckOutResponseObject: Enter getCheckOutResponseObject method ");

	    com.cloudkey.pms.response.reservations.CheckOutResponse objCheckOutResponse = new com.cloudkey.pms.response.reservations.CheckOutResponse();
        Reservation objReservation = new Reservation();

        String confirmationNumber;
	    String firstName;
        String lastName;
        StringBuffer objStringBuffer;

        log.debug("getCheckOutResponseObject: Status Set ");

        CheckOutComplete objCheckOutComplete = checkOutResponse.getCheckOutComplete();
        ArrayOfUniqueID objArrayOfUniqueID = objCheckOutComplete.getReservationID();
        UniqueID[] arrUniqueIDs = objArrayOfUniqueID.getUniqueID();

		/*To set the confirmation number.*/
        for (UniqueID objUniqueID : arrUniqueIDs) {

	        // TODO: Parse these correctly
            confirmationNumber = objUniqueID.getString();
            objReservation.setConfirmationNumber(confirmationNumber);
            objReservation.setPmsReservationId(confirmationNumber);

            log.debug("getCheckOutResponseObject: confirmation Number is  Set ");
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

            log.debug("getCheckOutResponseObject: Full Name is set.");

            objStringBuffer.setLength(0);
        }

        log.debug("getCheckOutResponseObject: Exit Profile.");
        objCheckOutResponse.setReservation(objReservation);
        log.debug("getCheckOutResponseObject: Exit getCheckOutResponseObject method");

        return objCheckOutResponse;
    }

    public String getNextAvailableRoom(String roomType) throws RemoteException {
        log.debug("processFetchRoomStatus: Enter in processSearchReservationData method.");

	    FetchRoomStatusRequest req = getRoomStatusRequest(roomType);
        FetchRoomStatusRequestE requestE = new FetchRoomStatusRequestE();
	    requestE.setFetchRoomStatusRequest(req);

                String nextAvailableRoom = null;

        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(requestE));
        FetchRoomStatusResponseE responseE = service.fetchRoomStatus(requestE, createOGHeaderE());

        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(responseE));

	    FetchRoomStatusResponse response = responseE.getFetchRoomStatusResponse();
	    errorIfFailure(response.getResult());

	    nextAvailableRoom = response.getRoomStatus()[((Integer) 0)].getRoomNumber();

	    log.debug("processFetchRoomStatus", nextAvailableRoom);

        return nextAvailableRoom;
    }

    public com.cloudkey.pms.response.reservations.CheckInResponse processCheckIn(com.cloudkey.pms.request.reservations.CheckInRequest request) throws RemoteException {
        log.debug("processCheckIn: Enter in processSearchReservationData method. ");

	    CheckInRequest req = getCheckInRequestObject(request);

        CheckInRequestE requestE = new CheckInRequestE();
	    requestE.setCheckInRequest(req);

                log.debug("processCheckIn",
                AdapterUtility.convertToStreamXML(requestE));
        CheckInResponseE responseE = service.checkIn(requestE, createOGHeaderE());
        log.debug("processCheckIn",
                AdapterUtility.convertToStreamXML(responseE));
	    errorIfFailure(responseE.getCheckInResponse().getResult());

	    com.cloudkey.pms.response.reservations.CheckInResponse response = getCheckInResponseObject(responseE.getCheckInResponse());
        log.debug("processFetchRoomStatus",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    private CheckInRequest getCheckInRequestObject(com.cloudkey.pms.request.reservations.CheckInRequest checkInRequest) {
        log.debug("getCheckInRequestObject: Enter in getCheckInRequestObject method");

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

        // set the confirmation number.
        objReservationRequestBase.setReservationID(arrayOf(internalReservationId(checkInRequest.getPmsReservationId())));

        // set the hotel code.
        objReservationRequestBase.setHotelReference(getDefaultHotelReference());

		/* Set the confirmation . hotel code and credit card info into check in request. */
        objCheckInRequest.setReservationRequest(objReservationRequestBase);
        //objCheckInRequest.setCreditCardInfo( objCreditCardInfo );

        log.debug("getCheckInRequestObject: Exit getCheckInRequestObject method.");

        return objCheckInRequest;

    }

    private com.cloudkey.pms.response.reservations.CheckInResponse getCheckInResponseObject(CheckInResponse objResponse) {

        log.debug("getCheckInResponseObject: Enter in getCheckInResponseObject method.");

		/* Populate response into Reservation instance */
	    com.cloudkey.pms.response.reservations.CheckInResponse objCheckInResponse = new com.cloudkey.pms.response.reservations.CheckInResponse();

        Reservation objReservation = new Reservation();
        objCheckInResponse.setReservation(objReservation);

        String confirmationNumber;
        String roomTypeCode;
        String feature;
        String roomNumber;
        String firstName;
        String lastName;
        StringBuffer objStringBuffer;

        CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();

        ArrayOfUniqueID objArrayOfUniqueID = objCheckInComplete.getReservationID();
        UniqueID[] arrUniqueIDs = objArrayOfUniqueID.getUniqueID();

        for (UniqueID objUniqueID : arrUniqueIDs) {
	        // TODO: parse these correctly
            if (objUniqueID.getType() == UniqueIDType.EXTERNAL) {
                confirmationNumber = objUniqueID.getString();
                objReservation.setConfirmationNumber(confirmationNumber);
                objReservation.setPmsReservationId(confirmationNumber);
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

                    log.debug("getCheckInResponseObject: Iterating NameCreditCard  Array.");

                    objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

                    log.debug("getCheckInResponseObject: Credit Card Number is set.");
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

            log.debug("getCheckInResponseObject: Full Name is set.");

            objStringBuffer.setLength(0);
        }

        log.debug("getCheckInResponseObject: Exit Profile.");
        objCheckInResponse.setReservation(objReservation);

        log.debug("getCheckInResponseObject: Enter in getCheckInResponseObject method.");

        return objCheckInResponse;
    }

    private FetchRoomStatusRequest getRoomStatusRequest(String roomType) {

        FetchRoomStatusRequest request = new FetchRoomStatusRequest();
        request.setRoomType(roomType);

        HotelReference objHotelReference = getDefaultHotelReference();
        request.setHotelReference(objHotelReference);

        return request;
    }
}