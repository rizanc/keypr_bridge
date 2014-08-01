package com.micros.pms.processor;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.reservation.*;
import com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse;
import com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse;
import com.cloudkey.pms.micros.services.ReservationServiceStub;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
import com.cloudkey.pms.request.reservations.UpdateBookingRequest;
import com.cloudkey.pms.response.reservations.SearchReservationResponse;
import com.cloudkey.pms.response.reservations.UpdateBookingResponse;
import com.cloudkey.pms.response.roomassignments.*;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosOWSParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.NormalizedString;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSReservationProcessor {

    final static String URL_RESERVATION = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Reservation.asmx";

    public FetchBookingResponse fetchBooking(String confirmation) throws RemoteException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " fetchBooking ", " Enter in fetchBooking method ");

        FetchBookingRequest request = new FetchBookingRequest();

        UniqueID uid = new UniqueID();
        uid.setType(UniqueIDType.INTERNAL);
        uid.setString(confirmation);

        request.setConfirmationNumber(uid);
        request.setHotelReference(getDefaultHotelReference());

        OGHeaderE ogh = getHeaderE();

        ReservationServiceStub rstub = getReservationServiceStub();

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "fetchBooking ",
                AdapterUtility.convertToStreamXML(request));
        FetchBookingResponse response = rstub.fetchBooking(request, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "fetchBooking ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    public com.cloudkey.pms.response.roomassignments.AssignRoomResponse processAssignRoom(com.cloudkey.pms.request.roomassignments.AssignRoomRequest request) throws RemoteException {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ", " Enter in processSearchReservationData method. ");

        OGHeaderE ogh = getHeaderE();

        AssignRoomRequest req = getAssignRoomRequestObject(request);

        ReservationServiceStub rstub = getReservationServiceStub();

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                AdapterUtility.convertToStreamXML(req));
        AssignRoomResponse resp = rstub.assignRoom(req, ogh);

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                AdapterUtility.convertToStreamXML(resp));

	    com.cloudkey.pms.response.roomassignments.AssignRoomResponse response = getAssignRoomResponseObject(resp);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    public com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse processReleaseRoom(com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest request) throws RemoteException {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ", " Enter in processReleaseRoom method. ");

        OGHeaderE ogh = getHeaderE();

        ReleaseRoomRequest req =
                getReleaseRoomRequestObject(request);

        ReservationServiceStub rstub = getReservationServiceStub();

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                AdapterUtility.convertToStreamXML(req));
        ReleaseRoomResponse resp = rstub.releaseRoom(req, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                AdapterUtility.convertToStreamXML(resp));

	    com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse response = getReleaseRoomResponseObject(resp);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    public com.cloudkey.pms.response.reservations.UpdateBookingResponse processUpdateBooking(com.cloudkey.pms.request.reservations.UpdateBookingRequest updateBookingRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processUpdateBooking ", " Enter in processUpdateBooking method ");

        ModifyBookingRequest objResponse = null;

        OGHeaderE ogh = getHeaderE();

        ModifyBookingRequest req =
                getUpdateBookingRequestObject(updateBookingRequest);

        ReservationServiceStub rstub = getReservationServiceStub();

        UpdateBookingResponse response = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                AdapterUtility.convertToStreamXML(req));
        ModifyBookingResponse resp = rstub.modifyBooking(req, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                AdapterUtility.convertToStreamXML(resp));

        response = getUpdateBookingResponseObject(resp);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                AdapterUtility.convertToStreamXML(response));

        return response;

    }

    /**
     * @param objResponse
     * @return UpdateBookingResponse
     */
    private UpdateBookingResponse getUpdateBookingResponseObject(ModifyBookingResponse objResponse) {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getUpdateBookingResponseObject ", " Enter getUpdateBookingResponseObject method ");

        UpdateBookingResponse objUpdateBookingResponse = new UpdateBookingResponse();
        objUpdateBookingResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
            objUpdateBookingResponse.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getUpdateBookingResponseObject ", " Update Failed:" + errorMessage);
            return objUpdateBookingResponse;
        }

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getUpdateBookingResponseObject ", " Exit  getUpdateBookingResponseObject method ");

        return objUpdateBookingResponse;
    }

    /**
     * This method is used to make the request for update the booking (pre -
     * checkin.
     *
     * @param updateBookingRequest
     * @return
     * @throws AxisFault
     */
    private ModifyBookingRequest getUpdateBookingRequestObject(UpdateBookingRequest updateBookingRequest) {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getUpdateBookingRequestObject ", " Enter getUpdateBookingRequestObject method ");

		/* To set the request parameters. */
        OGHeaderE objHeaderE = getHeaderE();
        ModifyBookingRequest objModifyBookingRequest = new ModifyBookingRequest();

        HotelReference objHotelReference = getDefaultHotelReference();

        HotelReservation hotelReservation = new HotelReservation();
        objModifyBookingRequest.setHotelReservation(hotelReservation);

        UniqueIDList uidList = new UniqueIDList();
        hotelReservation.setUniqueIDList(uidList);

        UniqueID uid = new UniqueID();
        uidList.addUniqueID(uid);

        uid.setString(updateBookingRequest.getConfirmationNumber());
        uid.setType(UniqueIDType.INTERNAL);

        RoomStayList roomStays = new RoomStayList();
        hotelReservation.setRoomStays(roomStays);

        RoomStay roomStay = new RoomStay();
        roomStays.addRoomStay(roomStay);

        roomStay.setHotelReference(objHotelReference);

        if (updateBookingRequest.getNotes() != null && !updateBookingRequest.getNotes().isEmpty()) {
            // Update Comments
            ReservationCommentList comments = new ReservationCommentList();
            roomStay.setComments(comments);

            for (String commentValue : updateBookingRequest.getNotes()) {
                ReservationComment comment = new ReservationComment();
                comments.addComment(comment);
                comment.setCommentType("RESERVATION");
                comment.setGuestViewable(false);

                String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
                if (entityId != null && !entityId.isEmpty()) {
                    comment.setCommentOriginatorCode(entityId);
                }

	            ParagraphChoice paragraphChoice = new ParagraphChoice();
	            comment.addParagraphChoice(paragraphChoice);

                Text text = new Text();
	            paragraphChoice.setText(text);

                NormalizedString normalizedString = new NormalizedString();
                normalizedString.setValue(commentValue);

                text.setNormalizedString(normalizedString);
                text.setFormatted(false);
            }
        }
       /* <localComment>
        <com.micros.ows.reservation.ReservationServiceStub_-ReservationComment>
        <localParagraphChoice__type0>
        <com.micros.ows.reservation.ReservationServiceStub_-ParagraphChoice__type0>
        <localImageTracker>false</localImageTracker>
        <localText>
        <localNormalizedString>
        <m__value>Big room, away from elevator.</m__value>
        </localNormalizedString>
        <localFormatted>false</localFormatted>
        </localText>
        <localTextTracker>true</localTextTracker>
        <localURLTracker>false</localURLTracker>
        </com.micros.ows.reservation.ReservationServiceStub_-ParagraphChoice__type0>
        </localParagraphChoice__type0>
        <localParagraphChoice__type0Tracker>true</localParagraphChoice__type0Tracker>
        <localCommentId>NaN</localCommentId>
        <localCommentIdTracker>false</localCommentIdTracker>
        <localInternalYn>false</localInternalYn>
        <localInternalYnTracker>false</localInternalYnTracker>
        <localCommentTypeTracker>false</localCommentTypeTracker>
        <localGuestViewable>true</localGuestViewable>
        </com.micros.ows.reservation.ReservationServiceStub_-ReservationComment>
        </localComment>*/

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getUpdateBookingRequestObject ", " Exit getUpdateBookingRequestObject method " + objModifyBookingRequest);
        return objModifyBookingRequest;
    }

    private com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse getReleaseRoomResponseObject(ReleaseRoomResponse objReleaseRoomResponse) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomResponseObject ", " Enter getReleaseRoomResponseObject method ");

        com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse objReleaseRoomRespons = new com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse();
        String status = null;

        status = objReleaseRoomResponse.getResult().getResultStatusFlag().toString();
        objReleaseRoomRespons.setStatus(status);

        if (objReleaseRoomResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            objReleaseRoomRespons.setErrorMessage(getErrorMessage(objReleaseRoomResponse.getResult()));
        }

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomResponseObject ", " Exit getReleaseRoomResponseObject method ");

        return objReleaseRoomRespons;
    }

    private ReleaseRoomRequest getReleaseRoomRequestObject(com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest releaseRoomRequest) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomRequestObject ", " Enter getReleaseRoomRequestObject method ");

        String reservationId = releaseRoomRequest.getReservationId();

        ReleaseRoomRequest objReleaseRoomRequest = new ReleaseRoomRequest();

		/*To set the reservation name  number.*/
        UniqueID objUniqueID = new UniqueID();
        objUniqueID.setSource(IMicrosConstants.VALUE_SOURCE);
        objUniqueID.setString(reservationId);
        objUniqueID.setType(UniqueIDType.INTERNAL);
        objReleaseRoomRequest.setResvNameId(objUniqueID);

        objReleaseRoomRequest.setHotelReference(getDefaultHotelReference());

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomRequestObject ", " Exit getReleaseRoomRequestObject method ");

        return objReleaseRoomRequest;

    }

    private com.cloudkey.pms.response.roomassignments.AssignRoomResponse getAssignRoomResponseObject(AssignRoomResponse objResponse) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomResponseObject ", " Enter getAssignRoomResponseObject method ");

	    com.cloudkey.pms.response.roomassignments.AssignRoomResponse objAssignRoomResponse = new com.cloudkey.pms.response.roomassignments.AssignRoomResponse();

        objAssignRoomResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objAssignRoomResponse.getStatus().equalsIgnoreCase("FAIL")) {
            String message = getErrorMessage(objResponse.getResult());
            objAssignRoomResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getCheckInResponseObject ", " CheckIn Failed:" + message);
            return objAssignRoomResponse;
        }

        objAssignRoomResponse.setAssignRoomNumber(objResponse.getRoomNoAssigned());
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomResponseObject ", " Exit getAssignRoomResponseObject method ");

        return objAssignRoomResponse;
    }

    private AssignRoomRequest getAssignRoomRequestObject(com.cloudkey.pms.request.roomassignments.AssignRoomRequest assignRoomRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomRequestObject ", " Enter getAssignRoomRequestObject method ");

        String roomTypeCode = assignRoomRequest.getRoomTypeCode();
        String confirmationNumber = assignRoomRequest.getConfirmationNumber();

        AssignRoomRequest objAssignRoomRequest = null;

        String nextAvailableRoom = new OWSResvAdvancedProcessor().getNextAvailableRoom(roomTypeCode);
        if (nextAvailableRoom != null) {
            objAssignRoomRequest = new AssignRoomRequest();
            objAssignRoomRequest.setRoomNoRequested(nextAvailableRoom);

            UniqueID objUniqueID = new UniqueID();
            objUniqueID.setSource(IMicrosConstants.VALUE_SOURCE);
            objUniqueID.setString(confirmationNumber);
            objUniqueID.setType(UniqueIDType.INTERNAL);
            objAssignRoomRequest.setResvNameId(objUniqueID);

            HotelReference objHotelReference = getDefaultHotelReference();
            objAssignRoomRequest.setHotelReference(objHotelReference);

            String stationID = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_STATION_ID);
            objAssignRoomRequest.setStationID(stationID);

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomRequestObject ", " Exit getAssignRoomRequestObject method ");
        }

        return objAssignRoomRequest;
    }

    private HotelReference getDefaultHotelReference() {
        HotelReference objHotelReference = new HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    public SearchReservationResponse processSearchReservationData(SearchReservationRequest searchReservationRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ", " Enter in processSearchReservationData method. ");

        FutureBookingSummaryResponse objResponse = null;

        OGHeaderE ogh = getHeaderE();

        FutureBookingSummaryRequest req =
                getFutureBookingRequestObject(searchReservationRequest);

        ReservationServiceStub rstub = getReservationServiceStub();

        SearchReservationResponse response = null;

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                AdapterUtility.convertToStreamXML(req));
        FutureBookingSummaryResponse resp = rstub.futureBookingSummary(req, ogh);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                AdapterUtility.convertToStreamXML(resp));

        response = getFutureBookingResponseObject(resp);
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    private ReservationServiceStub getReservationServiceStub() {

        if (URL_RESERVATION == null) throw new NullPointerException("Reservation URL is null");

        ReservationServiceStub rstub = null;
        try {
            rstub = new ReservationServiceStub(URL_RESERVATION);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "getReservationServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

    private FutureBookingSummaryRequest getFutureBookingRequestObject(SearchReservationRequest searchReservationRequest) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "getFutureBookingRequestObject", " Enter getFutureBookingRequestObject method ");

        String confirmationNumber = searchReservationRequest.getConfirmationNumber();
        String creditCardNumber = searchReservationRequest.getCreditCardNumber();
        String firstName = searchReservationRequest.getFirstName();
        String lastName = searchReservationRequest.getLastName();

        String memebershipNumber = searchReservationRequest.getMembershipNumber();
        String membershipType = searchReservationRequest.getMembershipType();
        String hotelCode = searchReservationRequest.getHotelCode();

        String extRefLegNumber = searchReservationRequest.getExtRefLegNumber();
        String extReferenceNumber = searchReservationRequest.getExtReferenceNumber();
        String extReferenceType = searchReservationRequest.getExtReferenceType();

        /**
         * Creates an instance of FutureBookingSummaryRequest and populates the
         * data members.
         */
        FutureBookingSummaryRequest objFutureBookingSummaryRequest = new FutureBookingSummaryRequest();
        FetchBookingFilters objBookingFilters = new FetchBookingFilters();
        objFutureBookingSummaryRequest.setAdditionalFilters(objBookingFilters);

        if (hotelCode != null) {
            objBookingFilters.setHotelReference(getDefaultHotelReference());
            objBookingFilters.getHotelReference().setHotelCode(hotelCode);
        }

        if (extReferenceNumber != null && extReferenceType != null) {
            if (extRefLegNumber == null) {
                extRefLegNumber = "1";
            }
            ExternalReference ext = new ExternalReference();
            ext.setLegNumber(Integer.parseInt(extReferenceNumber));
            ext.setReferenceNumber(extReferenceNumber);
            ext.setReferenceType(extReferenceType);
            objBookingFilters.setExternalSystemNumber(ext);
        }

		/* Sets confirmation number to the request */
        if (confirmationNumber != null) {
            UniqueID objUniqueID = new UniqueID();
            objUniqueID.setType(UniqueIDType.INTERNAL);
            objUniqueID.setString(confirmationNumber);
            objUniqueID.setSource("CONFIRMATION_NO");
            objBookingFilters.setConfirmationNumber(objUniqueID);
        }

        if (membershipType != null && memebershipNumber != null) {
            Membership membership = new Membership();
            membership.setMembershipNumber(memebershipNumber);
            membership.setMembershipType(membershipType);
            objBookingFilters.setMembership(membership);
        }
        /* Set the credit card number . */
        if (creditCardNumber != null) {

            final FutureBookingSummaryRequestChoice_type1 objFuChoice_type01 = new FutureBookingSummaryRequestChoice_type1();
            objFuChoice_type01.setCreditCardNumber(creditCardNumber);

            objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(objFuChoice_type01);

        }

        if (firstName != null) {

            objFutureBookingSummaryRequest.setFirstName(firstName);
        }

        if (lastName != null) {

            objFutureBookingSummaryRequest.setLastName(lastName);
        }

        FutureBookingSummaryRequestChoice_type0 type0 = new FutureBookingSummaryRequestChoice_type0();

        objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type0(type0);

        if (objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1() == null) {
            objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(new FutureBookingSummaryRequestChoice_type1());
        }

/*
        FetchBookingFilters filters = new FetchBookingFilters();
        objFutureBookingSummaryRequest.setAdditionalFilters(filters);

        filters.setHotelReference(getDefaultHotelReference());
*/

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "getFutureBookingRequestObject", " Exit getFutureBookingRequestObject method ");

        return objFutureBookingSummaryRequest;

    }

    private SearchReservationResponse getFutureBookingResponseObject(FutureBookingSummaryResponse objResponse) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Enter getFutureBookingResponseObject method.");

        String firstName = null;
        String lastName = null;
        Reservation objReservation = null;

        if (objResponse == null) {
            return null;
        }

		/* Populate response into Reservation instance */
        SearchReservationResponse objSearchReservationResponse = new SearchReservationResponse();
        objSearchReservationResponse.setStatus(objResponse.getResult().getResultStatusFlag().getValue());
        if (objResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
            objSearchReservationResponse.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getUpdateBookingResponseObject ", " Update Failed:" + errorMessage);
            return objSearchReservationResponse;
        }

        List<Reservation> objLReservations = objSearchReservationResponse.getReservationList();

        if (objLReservations == null) {

            objLReservations = new ArrayList<Reservation>();
        }

        HotelReservation[] arrHotelReservation = objResponse.getHotelReservations().getHotelReservation();

        objLReservations = parseHotelReservation(arrHotelReservation);

        /**
         * To set the reservation list and status on the response.
         */
        objSearchReservationResponse.setReservationList(objLReservations);

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Exit getFutureBookingResponseObject method.");

        return objSearchReservationResponse;

    }

    private List<Reservation> parseHotelReservation(HotelReservation[] arrHotelReservation) {

        List<Reservation> objLReservations = new ArrayList<Reservation>();
        Reservation objReservation;
        String firstName;
        String lastName;

        for (HotelReservation objHotelReservation : arrHotelReservation) { // To traverse the hotel reservation.

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Enter in Hotel Reservation Loop.");

            objReservation = new Reservation();
            objLReservations.add(objReservation);

            StringBuilder objBuilder = new StringBuilder();

            UniqueID[] arrUniqueID = objHotelReservation.getUniqueIDList().getUniqueID();

            for (UniqueID objUniqueID : arrUniqueID) { // To traverse Unique Id list.

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating UniqueID list .");

                if (objUniqueID.getType().toString().equalsIgnoreCase("INTERNAL") &&
                        objUniqueID.getSource() != null &&
                        objUniqueID.getSource().equalsIgnoreCase("RESVID")) {

                    objReservation.setPmsId(objUniqueID.getString());

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Confirmation Number is set.");
                } else if (objUniqueID.getType().toString().equalsIgnoreCase("INTERNAL") &&
                        objUniqueID.getSource() == null ) {
                    objReservation.setConfirmationNumber(objUniqueID.getString());
                } else {

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Confirmation Number is not set.");
                }
            } // End loop for Unique ID .
            String status = objHotelReservation.getReservationStatus().getValue();
            objReservation.setReservationStatus(status);

            String group = objHotelReservation.getGroup();
            objReservation.setGroup(group);
            ResGuest[] arrGuest = objHotelReservation.getResGuests().getResGuest();

            for (ResGuest objResGuest : arrGuest) { // To traverse ResGuest.

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating ResGuest Array.");

                Profile[] arrProfiles = objResGuest.getProfiles().getProfile();

                for (Profile objProfile : arrProfiles) { // To traverse profile .

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating Profile Array.");

                    PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

                    NameCreditCard[] arrNameCreditCard = null;
                    if (objProfile.getCreditCards() != null) {
                        arrNameCreditCard = objProfile.getCreditCards().getNameCreditCard();
                    }

					/* To set the first name and last name . */
                    firstName = objPersonName.getFirstName();
                    lastName = objPersonName.getLastName();

                    if (firstName != null || lastName != null) {

                        if (firstName != null) {

                            objBuilder.append(firstName);
                            objReservation.setFirstName(firstName);
                        }
                        if (lastName != null) {

                            objBuilder.append(" " + lastName);
                            objReservation.setLastName(lastName);
                        }
                        objReservation.setFullName(objBuilder.toString());

                        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Full Name is set.");
                    }

                    if (arrNameCreditCard != null) {
                        for (NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating NameCreditCard  Array.");

                            objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Credit Card Number is set.");
                        } // End loop for name credit card.
                    }

                    NameAddressList arrNameAddresses = objProfile.getAddresses();
                    if (arrNameAddresses != null) {
                        for (NameAddress objAddress : arrNameAddresses.getNameAddress()) {// To traverse Name Address.

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                    " getFutureBookingResponseObject ",
                                    " Iterating NameAddress Array.");
                            objReservation.setAddress(objAddress.getCountryCode());
                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                    " getFutureBookingResponseObject ",
                                    " Address is Set in response.");

                        } // end loop for Name Address.
                    }

                    NamePhoneList arrNamePhones = objProfile.getPhones();
                    if (arrNamePhones != null) {
                        for (NamePhone objNamePhone : arrNamePhones.getNamePhone()) { // To traverse Name Phone.
                            if (objNamePhone.getPhoneRole().equalsIgnoreCase("PHONE")) {
                                objReservation.setPhoneNumber(objNamePhone.getPhoneData().getPhoneNumber());

                                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                        " getFutureBookingResponseObject ",
                                        " Phone Number  is Set in response.");

                            }
                        } // End loop for Phone.
                    }

                    NameEmailList arrNameEmails = objProfile.getEMails();
                    if (arrNameEmails != null) {
                        for (NameEmail objNameEmail : arrNameEmails.getNameEmail()) {// To traverse Name Email.
                            objReservation.setEmail(objNameEmail.getString());
                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                    " getFutureBookingResponseObject ", " Email is Set in response.");
                        } // End loop for Email.
                    }

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Exit Profile .");

                } // End loop for Profile.
            } // End loop for Res Guest.

            RoomDetails obRoomDetails = null;
            List<RoomDetails> objRDetailList = objReservation.getRoomDetailList();
            if (objRDetailList == null) {
                objRDetailList = new ArrayList<>();
            }

            objReservation.setRoomDetailList(objRDetailList);

            RoomStayList arrRoomStay = objHotelReservation.getRoomStays();

            for (RoomStay objRoomStay : arrRoomStay.getRoomStay()) { // To traverse room stay array.

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                        " getFutureBookingResponseObject ", " Enter Room Stay Array.");

                RoomTypeList arrRoomType = objRoomStay.getRoomTypes();

                for (RoomType objRType : arrRoomType.getRoomType()) {  // To traverse room type

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Iterating Room Type Array.");

                    obRoomDetails = new RoomDetails();

                    com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
                    objRoomType.setCode(objRType.getRoomTypeCode());

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Room Type Code is Set in response.");

                    RoomFeatureList arrRoomFeature =
                            objRType.getRoomFeatures();

                    String[] arrRoomNumber = objRType.getRoomNumber();

                    if (arrRoomNumber != null) {
                        for (String roomNumber : arrRoomNumber) {
                            obRoomDetails.setRoomNumber(Integer.parseInt(roomNumber));
                        }
                    }

                    objBuilder = new StringBuilder();
                    StringBuilder objStringBuilder2 = new StringBuilder();

                    if (arrRoomFeature != null) {
                        RoomFeature[] features = arrRoomFeature.getFeatures();
                        if (features != null) {
                            for (int i = 0, featuresLength = features.length; i < featuresLength; i++) {
                                RoomFeature objRFeature = features[i]; // To traverse room features.
                                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                        " getFutureBookingResponseObject ",
                                        " Iterating Room Feature Array.");
                                objBuilder.append(objRFeature.getFeature() + ";");
                                objStringBuilder2
                                        .append(objRFeature.getDescription() + ";");

                            }
                        }
                    }
                    objRoomType.setFeatures(objBuilder.toString());

                    objRoomType.setDescription(objStringBuilder2.toString());
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Features and Description are Set in response.");
                    objStringBuilder2.setLength(0);
                    obRoomDetails.setRoomType(objRoomType);
                    objRDetailList.add(obRoomDetails);

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ", " Exit Room Type .");

                } // End loop for room Type.

                GuestCount[] arrGuestCount = objRoomStay.getGuestCounts()
                        .getGuestCount();
                int guestCount = 0;
                for (GuestCount objGuestCount : arrGuestCount) { // To traverse Guest Count.
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Iterating Guest Count Array.");
                    guestCount = guestCount + objGuestCount.getCount();

                    objReservation.setNumberOfGuests(guestCount);
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Guest Count is Set in response.");
                } // End loop for Guest Count.

                TimeSpan objTimeSpan = objRoomStay.getTimeSpan();
                if (objTimeSpan != null) {

                    objReservation.setCheckinDate(AdapterUtility
                            .getDate(objTimeSpan.getStartDate()));
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " CheckIn Date is Set in response.");

                    TimeSpanChoice_type0 objTimeSpanChoice_type0 = objTimeSpan
                            .getTimeSpanChoice_type0();

                    if (objTimeSpanChoice_type0 != null) {

                        objReservation.setCheckoutDate(AdapterUtility
                                .getDate(objTimeSpanChoice_type0.getEndDate()));
                        MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                " getFutureBookingResponseObject ",
                                " CheckOut Date is Set in response.");
                    }
                }

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                        " getFutureBookingResponseObject ", " Notes are Set in response.");
                objBuilder.setLength(0);

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                        " getFutureBookingResponseObject ", " Exit Room Stay .");

            } // End loop for room Stay.

            // Set the reservation into response.
            objLReservations.add(objReservation);

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Exit from Hotel Reservation loop.");

        } // End loop for Hotel Reservation.

        return objLReservations;
    }

    private OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        OGHeader ogHeader = new OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        EndPoint origin = new EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        EndPoint destination = new EndPoint();
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

            Authentication_type0 auth = new Authentication_type0();
            ogHeader.setAuthentication(auth);

            UserCredentials_type0 cred = new UserCredentials_type0();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        OGHeaderE ogHeaderE = new OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(ResultStatus resultStatus) {

        String message = "";
        if (resultStatus instanceof GDSResultStatus) {
            GDSResultStatus gdsResultStatus = (GDSResultStatus) resultStatus;
            if (gdsResultStatus.isGDSErrorSpecified()) {
                message = gdsResultStatus.getGDSError().toString();
            } else if (gdsResultStatus.isTextSpecified()) {
                if (gdsResultStatus.getText() != null &&
                        gdsResultStatus.getText().getTextElement() != null &&
                        gdsResultStatus.getText().getTextElement().length > 0
                        )
                    message = gdsResultStatus.getText().getTextElement()[0].toString();
            }
        } else if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }
}
