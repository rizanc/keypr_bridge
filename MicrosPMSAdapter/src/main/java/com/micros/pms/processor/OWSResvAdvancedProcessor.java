package com.micros.pms.processor;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.og.hotelcommon.Room;
import com.cloudkey.pms.micros.og.hotelcommon.RoomFeature;
import com.cloudkey.pms.micros.og.hotelcommon.RoomType;
import com.cloudkey.pms.micros.og.name.NameCreditCard;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.BillHeader;
import com.cloudkey.pms.micros.og.reservation.BillItem;
import com.cloudkey.pms.micros.og.reservation.advanced.*;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.HotelInformationConverter;
import com.micros.pms.util.IdUtils;
import com.micros.pms.util.ParagraphHelper;
import com.sun.tools.corba.se.idl.toJavaPortable.Helper;
import com.sun.tools.javac.util.Convert;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by crizan2 on 17/07/2014.
 */
public class OWSResvAdvancedProcessor extends OWSBase {

	@Inject
	protected ResvAdvancedServiceSoap service;

	public com.cloudkey.pms.response.reservations.PostChargeResponse postCharge(com.cloudkey.pms.request.reservations.PostChargeRequest request) {
        log.debug("postCharge: Enter in postCharge method.");

	    PostChargeRequest microsRequest = getPostChargeRequestObject(request);
        PostChargeResponse microsResponse = service.postCharge(microsRequest, createOGHeaderE());
	    errorIfFailure(microsResponse.getResult());

	    com.cloudkey.pms.response.reservations.PostChargeResponse response = getPostChargeResponseObject(microsResponse);
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

	    reservationRequestBase.setReservationID(Arrays.asList(internalReservationId(postChargeRequest.getPmsReservationId())));

	    objPostChargeRequest.setPosting(posting);
	    objPostChargeRequest.setAccount(postChargeRequest.getAccount());
	    objPostChargeRequest.setArticle(postChargeRequest.getArticle());
        return objPostChargeRequest;
    }

    private com.cloudkey.pms.response.reservations.PostChargeResponse getPostChargeResponseObject(PostChargeResponse microsResponse) {
        log.debug("getPostChargeResponseObject: Enter method");
	    return new com.cloudkey.pms.response.reservations.PostChargeResponse();
    }

    public GetFolioResponse processRetrieveFolioInfo(com.cloudkey.pms.request.reservations.GetFolioRequest request) {
        log.debug("processRetrieveFolioInfo: Enter in processRetrieveFolioInfo method.");

	    InvoiceRequest microsRequest = getFolioRequestObject(request);
        InvoiceResponse microsResponse = service.invoice(microsRequest, createOGHeaderE());
	    errorIfFailure(microsResponse.getResult());

        log.debug("processRetrieveFolioInfo: Exit processRetrieveFolioInfo method ");

        return getFolioResponseObject(microsResponse);
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
	    for (BillHeader objBillHeader : objResponse.getInvoices()) { // Traversing Bill Header

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
                objReservationOrders = new ArrayList<>();
            }

            ReservationOrders objOrders = new ReservationOrders();

            List<OrderDetails> objDetails = objOrders.getOrderDetailList();

            if (objDetails == null) {
                objDetails = new ArrayList<>();
            }

            List<BillItem> arrBillItem = objBillHeader.getBillItems();

		    for (BillItem billItem : arrBillItem) {
                log.debug("getFolioResponseObject: Enter to traverse Bill Items ");
                OrderDetails objOrderDetails = new OrderDetails();

                unitPrice = billItem.getAmount().getValue();
                description = billItem.getDescription();

                objOrderDetails.setUnitPrice(unitPrice);
                objOrderDetails.setItemDescription(description);
                objDetails.add(objOrderDetails);

                log.debug("getFolioResponseObject: Exit to traverse Bill Items ");

            } // End bill items traversing loop.

            // add order details.
            objOrders.setOrderDetailList(objDetails);
            if (!objBillHeader.getCreditCardSurcharges().isEmpty()) {
                totalBillAmount = objBillHeader.getCreditCardSurcharges().get(0).getTotalBillAmount().getValue();
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

	        ReservationRequestBase objRequestBase = new ReservationRequestBase();

            objRequestBase.setReservationID(Arrays.asList(
	            new UniqueID(folioRequest.getPmsReservationId(), UniqueIDType.INTERNAL, null)
            ));
            objRequestBase.setHotelReference(getDefaultHotelReference());

			/*To set the reservation base into invoice request.*/
            objInvoiceRequest.setReservationRequest(objRequestBase);

        }

        log.debug("getFolioRequestObject: Exit getFolioRequestObject method ");

        return objInvoiceRequest;
    }

    public com.cloudkey.pms.response.reservations.CheckOutResponse processCheckOut(com.cloudkey.pms.request.reservations.CheckOutRequest request) {
        log.debug("processCheckOut: Enter in processCheckOut method. ");

	    CheckOutRequest req = getCheckOutRequestObject(request);
        CheckOutResponse resp = service.checkOut(req, createOGHeaderE());
	    errorIfFailure(resp.getResult());

	    com.cloudkey.pms.response.reservations.CheckOutResponse response = getCheckOutResponseObject(resp);

        return response;

    }

    private CheckOutRequest getCheckOutRequestObject(com.cloudkey.pms.request.reservations.CheckOutRequest checkOutRequest) {
        log.debug("getCheckOutRequestObject: Enter getCheckOutRequestObject method.");

        CheckOutRequest objCheckOutRequest = new CheckOutRequest();

		/*To set the confirmation number and hotel code into reservation request base*/
        ReservationRequestBase objReservationRequestBase = new ReservationRequestBase();
        objCheckOutRequest.setReservationRequest(objReservationRequestBase);

	    objReservationRequestBase.setReservationID(Arrays.asList(internalReservationId(checkOutRequest.getPmsReservationId())));
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
	    List<UniqueID> arrUniqueIDs = objCheckOutComplete.getReservationID();

		/*To set the confirmation number.*/
        for (UniqueID objUniqueID : arrUniqueIDs) {

	        // TODO: Parse these correctly
            confirmationNumber = objUniqueID.getValue();
            objReservation.setConfirmationNumber(confirmationNumber);
            objReservation.setPmsReservationId(confirmationNumber);

            log.debug("getCheckOutResponseObject: confirmation Number is  Set ");
        }

        Profile objProfile = checkOutResponse.getProfile();

        PersonName objPersonName = objProfile.getCustomer().getPersonName();

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

                objStringBuffer.append(" ").append(lastName);
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

    public String getNextAvailableRoomNumber(String roomType) {
        log.debug("getNextAvailableRoomNumber: Enter.");

	    FetchRoomStatusRequest req = new FetchRoomStatusRequest()
	        .withHotelReference(getDefaultHotelReference())
	        .withRoomType(roomType);

        FetchRoomStatusResponse microsResponse = service.fetchRoomStatus(req, createOGHeaderE());

	    errorIfFailure(microsResponse.getResult());

	    String roomNumber = microsResponse.getRoomStatuses().get(0).getRoomNumber();

	    log.debug("getNextAvailableRoomNumber", roomNumber);

        return roomNumber;
    }

    public com.cloudkey.pms.response.reservations.CheckInResponse processCheckIn(com.cloudkey.pms.request.reservations.CheckInRequest request) {
        log.debug("processCheckIn: Enter in processSearchReservationData method. ");

	    CheckInRequest req = getCheckInRequestObject(request);
	    CheckInResponse microsResponse = service.checkIn(req, createOGHeaderE());
	    errorIfFailure(microsResponse.getResult());

	    com.cloudkey.pms.response.reservations.CheckInResponse response = getCheckInResponseObject(microsResponse);

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
	        objCreditCard.setCardNumber(checkInRequest.getCreditCardNumber());
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
	    objReservationRequestBase.setReservationID(Arrays.asList(internalReservationId(checkInRequest.getPmsReservationId())));

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

        String roomTypeCode;
        String feature;
        String roomNumber;
        String firstName;
        String lastName;
        StringBuffer objStringBuffer;

        CheckInComplete objCheckInComplete = objResponse.getCheckInComplete();

	    Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(objCheckInComplete.getReservationID());

	    if (pmsReservationIdOpt.isPresent()) {
		    objReservation.setPmsReservationId(pmsReservationIdOpt.get());
	    }

        ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation();

        objReservation.setReservationRoomAllocationList(new ArrayList<ReservationRoomAllocation>());
        objReservation.getReservationRoomAllocationList().add(objReservationRoomAllocation);

        Room objRoom = objCheckInComplete.getRoom();

        roomNumber = objRoom.getRoomNumber();
        RoomType obRoomType = objRoom.getRoomType();

        roomTypeCode = obRoomType.getRoomTypeCode();
        feature = obRoomType.getFeature();

        String roomDescription = "";
	    List<Text> paragraphs = ParagraphHelper.getTextList(objRoom.getRoomDescription());

	    for (Text paragraph : paragraphs) {
            roomDescription += paragraph.getValue();
        }

        // To set the more than 1 feature.
        List<RoomFeature> arrRoomFeatures = obRoomType.getRoomFeatures();
        objStringBuffer = new StringBuffer();

        for (RoomFeature objRoomFeature : arrRoomFeatures) {
            feature = objRoomFeature.getFeature();
            objStringBuffer.append(feature).append(";");
        }

	    com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType(
		    roomTypeCode,
		    ParagraphHelper.getFirstStringOfParagraphs(Arrays.asList(objRoom.getRoomDescription())).orNull(),
		    HotelInformationConverter.convertAmenities(obRoomType.getAmenityInfo().getAmenities()),
		    null
	    );

	    //TODO: Room number shouldn't be int. Should be string to accomodated hotels
        // with room numbers that contain dashes/characters etc...
        objReservationRoomAllocation.setRoomNo(roomNumber);
        objReservationRoomAllocation.setRoomType(objRoomType);
        //		objReservationRoomAllocation.setRoomRateList( objRoomRateList );

        // Note :  checkin response has only 1 profile information.

        Profile objProfile = objResponse.getProfile();

        List<NameCreditCard> arrNameCreditCard = objProfile.getCreditCards();
        //TODO: Check if credit cards are wanted.
        for (NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.
            log.debug("getCheckInResponseObject: Iterating NameCreditCard  Array.");

            objReservation.setCreditCardNumber(objNameCreditCard.getCardNumber());

            log.debug("getCheckInResponseObject: Credit Card Number is set.");
        } // End loop for name credit card.

        PersonName objPersonName = objProfile.getCustomer().getPersonName();

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

                objStringBuffer.append(" ").append(lastName);
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