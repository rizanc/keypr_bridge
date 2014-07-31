package com.micros.pms.processor;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.request.AssignRoomRequest;
import com.cloudkey.pms.request.ReleaseRoomRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.response.AssignRoomResponse;
import com.cloudkey.pms.response.ReleaseRoomResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosPMSMessageParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import com.micros.ows.reservation.ReservationServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.NormalizedString;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSReservationProcessor {

    final static String URL_RESERVATION = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Reservation.asmx";


    public ReservationServiceStub.FetchBookingResponse fetchBooking(String confirmation) {
        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " fetchBooking ", " Enter in fetchBooking method ");

        ReservationServiceStub.FetchBookingRequest request = new ReservationServiceStub.FetchBookingRequest();

        ReservationServiceStub.UniqueID uid = new ReservationServiceStub.UniqueID();
        uid.setType(ReservationServiceStub.UniqueIDType.INTERNAL);
        uid.setString(confirmation);

        request.setConfirmationNumber(uid);
        request.setHotelReference(getDefaultHotelReference());

        ReservationServiceStub.OGHeaderE ogh = getHeaderE();

        ReservationServiceStub rstub = getReservationServiceStub();

        ReservationServiceStub.FetchBookingRequestE reqE = new
                ReservationServiceStub.FetchBookingRequestE();
        reqE.setFetchBookingRequest(request);


        ReservationServiceStub.FetchBookingResponse response = null;

        try {
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "fetchBooking ",
                    AdapterUtility.convertToStreamXML(reqE));
            ReservationServiceStub.FetchBookingResponseE respE = rstub.fetchBooking(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "fetchBooking ",
                    AdapterUtility.convertToStreamXML(respE));

            response = respE.getFetchBookingResponse();

        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "fetchBooking ",
                    e.getMessage());
        }

        return response;
    }

    public AssignRoomResponse processAssignRoom(AssignRoomRequest request) {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ", " Enter in processSearchReservationData method. ");

        ReservationServiceStub.AssignRoomResponse objResponse = null;

        ReservationServiceStub.OGHeaderE ogh = getHeaderE();

        ReservationServiceStub.AssignRoomRequest req =
                getAssignRoomRequestObject(request);

        ReservationServiceStub rstub = getReservationServiceStub();

        ReservationServiceStub.AssignRoomRequestE reqE = new
                ReservationServiceStub.AssignRoomRequestE();
        reqE.setAssignRoomRequest(req);

        AssignRoomResponse response = null;

        try {
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                    AdapterUtility.convertToStreamXML(reqE));
            ReservationServiceStub.AssignRoomResponseE respE = rstub.assignRoom(reqE, ogh);

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                    AdapterUtility.convertToStreamXML(respE));

            response = getAssignRoomResponseObject(respE.getAssignRoomResponse());
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAssignRoom ",
                    AdapterUtility.convertToStreamXML(response));


        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "processAssignRoom ",
                    e.getMessage());
        }

        return response;

    }

    public ReleaseRoomResponse processReleaseRoom(ReleaseRoomRequest request) {
        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ", " Enter in processReleaseRoom method. ");

        ReservationServiceStub.ReleaseRoomResponse objResponse = null;

        ReservationServiceStub.OGHeaderE ogh = getHeaderE();

        ReservationServiceStub.ReleaseRoomRequest req =
                getReleaseRoomRequestObject(request);

        ReservationServiceStub rstub = getReservationServiceStub();

        ReservationServiceStub.ReleaseRoomRequestE reqE = new
                ReservationServiceStub.ReleaseRoomRequestE();
        reqE.setReleaseRoomRequest(req);

        ReleaseRoomResponse response = null;

        try {
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                    AdapterUtility.convertToStreamXML(reqE));
            ReservationServiceStub.ReleaseRoomResponseE respE = rstub.releaseRoom(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                    AdapterUtility.convertToStreamXML(respE));

            response = getReleaseRoomResponseObject(respE.getReleaseRoomResponse());
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processReleaseRoom ",
                    AdapterUtility.convertToStreamXML(response));

        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "processReleaseRoom ",
                    e.getMessage());
        }

        return response;

    }

    public UpdateBookingResponse processUpdateBooking(UpdateBookingRequest updateBookingRequest) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processUpdateBooking ", " Enter in processUpdateBooking method ");

        ReservationServiceStub.ModifyBookingRequest objResponse = null;

        ReservationServiceStub.OGHeaderE ogh = getHeaderE();

        ReservationServiceStub.ModifyBookingRequest req =
                getUpdateBookingRequestObject(updateBookingRequest);

        ReservationServiceStub rstub = getReservationServiceStub();

        ReservationServiceStub.ModifyBookingRequestE reqE = new
                ReservationServiceStub.ModifyBookingRequestE();
        reqE.setModifyBookingRequest(req);

        UpdateBookingResponse response = null;

        try {
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                    AdapterUtility.convertToStreamXML(reqE));
            ReservationServiceStub.ModifyBookingResponseE respE = rstub.modifyBooking(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                    AdapterUtility.convertToStreamXML(respE));

            response = getUpdateBookingResponseObject(respE.getModifyBookingResponse());
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processUpdateBooking ",
                    AdapterUtility.convertToStreamXML(response));

        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "processUpdateBooking ",
                    e.getMessage());
        }

        return response;

    }

    /**
     * @param objResponse
     * @return UpdateBookingResponse
     */
    private UpdateBookingResponse getUpdateBookingResponseObject(ReservationServiceStub.ModifyBookingResponse objResponse) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getUpdateBookingResponseObject ", " Enter getUpdateBookingResponseObject method ");

        UpdateBookingResponse objUpdateBookingResponse = new UpdateBookingResponse();
        objUpdateBookingResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == ReservationServiceStub.ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
            objUpdateBookingResponse.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getUpdateBookingResponseObject ", " Update Failed:" + errorMessage);
            return objUpdateBookingResponse;
        }

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getUpdateBookingResponseObject ", " Exit  getUpdateBookingResponseObject method ");

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
    private ReservationServiceStub.ModifyBookingRequest getUpdateBookingRequestObject(UpdateBookingRequest updateBookingRequest) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getUpdateBookingRequestObject ", " Enter getUpdateBookingRequestObject method ");

		/* To set the request parameters. */
        ReservationServiceStub.OGHeaderE objHeaderE = getHeaderE();
        ReservationServiceStub.ModifyBookingRequest objModifyBookingRequest = new ReservationServiceStub.ModifyBookingRequest();

        ReservationServiceStub.HotelReference objHotelReference = getDefaultHotelReference();

        ReservationServiceStub.HotelReservation hotelReservation = new ReservationServiceStub.HotelReservation();
        objModifyBookingRequest.setHotelReservation(hotelReservation);

        ReservationServiceStub.ArrayOfUniqueID uidList = new ReservationServiceStub.ArrayOfUniqueID();
        hotelReservation.setUniqueIDList(uidList);

        ReservationServiceStub.UniqueID uid = new ReservationServiceStub.UniqueID();
        uidList.addUniqueID(uid);

        uid.setString(updateBookingRequest.getConfirmationNumber());
        uid.setType(ReservationServiceStub.UniqueIDType.INTERNAL);

        ReservationServiceStub.ArrayOfRoomStay roomStays = new ReservationServiceStub.ArrayOfRoomStay();
        hotelReservation.setRoomStays(roomStays);

        ReservationServiceStub.RoomStay roomStay = new ReservationServiceStub.RoomStay();
        roomStays.addRoomStay(roomStay);

        roomStay.setHotelReference(objHotelReference);

        if (updateBookingRequest != null &&
                updateBookingRequest.getNotes() != null &&
                updateBookingRequest.getNotes().length > 0) {
            // Update Comments
            ReservationServiceStub.ArrayOfReservationComment comments = new ReservationServiceStub.ArrayOfReservationComment();
            roomStay.setComments(comments);

            for (String commentValue : updateBookingRequest.getNotes()) {
                ReservationServiceStub.ReservationComment comment = new ReservationServiceStub.ReservationComment();
                comments.addComment(comment);
                comment.setCommentType("RESERVATION");
                comment.setGuestViewable(false);

                String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
                if (entityId != null && !entityId.isEmpty()) {
                    comment.setCommentOriginatorCode(entityId);
                }

                ReservationServiceStub.ParagraphChoice_type0 paragraphChoice_type0 = new ReservationServiceStub.ParagraphChoice_type0();
                comment.addParagraphChoice_type0(paragraphChoice_type0);

                ReservationServiceStub.Text text = new ReservationServiceStub.Text();
                paragraphChoice_type0.setText(text);

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

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getUpdateBookingRequestObject ", " Exit getUpdateBookingRequestObject method " + objModifyBookingRequest);
        return objModifyBookingRequest;
    }

    private ReleaseRoomResponse getReleaseRoomResponseObject(ReservationServiceStub.ReleaseRoomResponse objReleaseRoomResponse) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomResponseObject ", " Enter getReleaseRoomResponseObject method ");

        ReleaseRoomResponse objReleaseRoomRespons = null;
        String status = null;

        objReleaseRoomRespons = new ReleaseRoomResponse();

        status = objReleaseRoomResponse.getResult().getResultStatusFlag().toString();
        objReleaseRoomRespons.setStatus(status);

        if (objReleaseRoomResponse.getResult().getResultStatusFlag() == ReservationServiceStub.ResultStatusFlag.FAIL) {
            objReleaseRoomRespons.setErrorMessage(getErrorMessage(objReleaseRoomResponse.getResult()));
        }

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomResponseObject ", " Exit getReleaseRoomResponseObject method ");

        return objReleaseRoomRespons;
    }

    private ReservationServiceStub.ReleaseRoomRequest getReleaseRoomRequestObject(ReleaseRoomRequest releaseRoomRequest) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomRequestObject ", " Enter getReleaseRoomRequestObject method ");

        String reservationId = releaseRoomRequest.getReservationId();

        ReservationServiceStub.ReleaseRoomRequest objReleaseRoomRequest = new ReservationServiceStub.ReleaseRoomRequest();

		/*To set the reservation name  number.*/
        ReservationServiceStub.UniqueID objUniqueID = new ReservationServiceStub.UniqueID();
        objUniqueID.setSource(IMicrosConstants.VALUE_SOURCE);
        objUniqueID.setString(reservationId);
        objUniqueID.setType(ReservationServiceStub.UniqueIDType.INTERNAL);
        objReleaseRoomRequest.setResvNameId(objUniqueID);

        objReleaseRoomRequest.setHotelReference(getDefaultHotelReference());

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getReleaseRoomRequestObject ", " Exit getReleaseRoomRequestObject method ");

        return objReleaseRoomRequest;

    }


    private AssignRoomResponse getAssignRoomResponseObject(ReservationServiceStub.AssignRoomResponse objResponse) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomResponseObject ", " Enter getAssignRoomResponseObject method ");

        AssignRoomResponse objAssignRoomResponse = new AssignRoomResponse();

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


    private ReservationServiceStub.AssignRoomRequest getAssignRoomRequestObject(com.cloudkey.pms.request.AssignRoomRequest assignRoomRequest) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomRequestObject ", " Enter getAssignRoomRequestObject method ");

        String roomTypeCode = assignRoomRequest.getRoomTypeCode();
        String confirmationNumber = assignRoomRequest.getReservation().getConfirmationNumber();

        ReservationServiceStub.AssignRoomRequest objAssignRoomRequest = null;

        String nextAvailableRoom = new OWSResvAdvancedProcessor().getNextAvailableRoom(roomTypeCode);
        if (nextAvailableRoom != null) {
            objAssignRoomRequest = new ReservationServiceStub.AssignRoomRequest();
            objAssignRoomRequest.setRoomNoRequested(nextAvailableRoom);

            ReservationServiceStub.UniqueID objUniqueID = new ReservationServiceStub.UniqueID();
            objUniqueID.setSource(IMicrosConstants.VALUE_SOURCE);
            objUniqueID.setString(confirmationNumber);
            objUniqueID.setType(ReservationServiceStub.UniqueIDType.INTERNAL);
            objAssignRoomRequest.setResvNameId(objUniqueID);

            ReservationServiceStub.HotelReference objHotelReference = getDefaultHotelReference();
            objAssignRoomRequest.setHotelReference(objHotelReference);

            String stationID = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_STATION_ID);
            objAssignRoomRequest.setStationID(stationID);

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getAssignRoomRequestObject ", " Exit getAssignRoomRequestObject method ");

        }

        return objAssignRoomRequest;
    }

    private ReservationServiceStub.HotelReference getDefaultHotelReference() {
        ReservationServiceStub.HotelReference objHotelReference = new ReservationServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    public SearchReservationResponse processSearchReservationData(SearchReservationRequest searchReservationRequest) {

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ", " Enter in processSearchReservationData method. ");

        ReservationServiceStub.FutureBookingSummaryResponse objResponse = null;

        ReservationServiceStub.OGHeaderE ogh = getHeaderE();

        ReservationServiceStub.FutureBookingSummaryRequest req =
                getFutureBookingRequestObject(searchReservationRequest);

        ReservationServiceStub rstub = getReservationServiceStub();

        ReservationServiceStub.FutureBookingSummaryRequestE reqE = new
                ReservationServiceStub.FutureBookingSummaryRequestE();
        reqE.setFutureBookingSummaryRequest(req);

        SearchReservationResponse response = null;

        try {
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                    AdapterUtility.convertToStreamXML(reqE));
            ReservationServiceStub.FutureBookingSummaryResponseE respE = rstub.futureBookingSummary(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                    AdapterUtility.convertToStreamXML(respE));

            response = getFutureBookingResponseObject(respE.getFutureBookingSummaryResponse());
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processSearchReservationData ",
                    AdapterUtility.convertToStreamXML(response));


        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "processSearchReservationData ",
                    e.getMessage());
        }

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

    private ReservationServiceStub.FutureBookingSummaryRequest getFutureBookingRequestObject(SearchReservationRequest searchReservationRequest) {

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
        ReservationServiceStub.FutureBookingSummaryRequest objFutureBookingSummaryRequest = new ReservationServiceStub.FutureBookingSummaryRequest();
        ReservationServiceStub.FetchBookingFilters objBookingFilters = new ReservationServiceStub.FetchBookingFilters();
        objFutureBookingSummaryRequest.setAdditionalFilters(objBookingFilters);

        if (hotelCode != null) {
            objBookingFilters.setHotelReference(getDefaultHotelReference());
            objBookingFilters.getHotelReference().setHotelCode(hotelCode);
        }

        if (extReferenceNumber != null && extReferenceType != null) {
            if (extRefLegNumber == null) {
                extRefLegNumber = "1";
            }
            ReservationServiceStub.ExternalReference ext = new ReservationServiceStub.ExternalReference();
            ext.setLegNumber(Integer.parseInt(extReferenceNumber));
            ext.setReferenceNumber(extReferenceNumber);
            ext.setReferenceType(extReferenceType);
            objBookingFilters.setExternalSystemNumber(ext);
        }

		/* Sets confirmation number to the request */
        if (confirmationNumber != null) {
            com.micros.ows.reservation.ReservationServiceStub.UniqueID objUniqueID = new com.micros.ows.reservation.ReservationServiceStub.UniqueID();
            objUniqueID.setType(ReservationServiceStub.UniqueIDType.INTERNAL);
            objUniqueID.setString(confirmationNumber);
            objUniqueID.setSource("CONFIRMATION_NO");
            objBookingFilters.setConfirmationNumber(objUniqueID);
        }

        if (membershipType != null && memebershipNumber != null) {
            ReservationServiceStub.Membership membership = new ReservationServiceStub.Membership();
            membership.setMembershipNumber(memebershipNumber);
            membership.setMembershipType(membershipType);
            objBookingFilters.setMembership(membership);
        }
        /* Set the credit card number . */
        if (creditCardNumber != null) {

            final ReservationServiceStub.FutureBookingSummaryRequestChoice_type1 objFuChoice_type01 = new ReservationServiceStub.FutureBookingSummaryRequestChoice_type1();
            objFuChoice_type01.setCreditCardNumber(creditCardNumber);

            objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(objFuChoice_type01);

        }

        if (firstName != null) {

            objFutureBookingSummaryRequest.setFirstName(firstName);
        }

        if (lastName != null) {

            objFutureBookingSummaryRequest.setLastName(lastName);
        }

        ReservationServiceStub.FutureBookingSummaryRequestChoice_type0 type0 = new ReservationServiceStub.FutureBookingSummaryRequestChoice_type0();

        objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type0(type0);

        if (objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1() == null) {
            objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(new ReservationServiceStub.FutureBookingSummaryRequestChoice_type1());
        }

/*
        ReservationServiceStub.FetchBookingFilters filters = new ReservationServiceStub.FetchBookingFilters();
        objFutureBookingSummaryRequest.setAdditionalFilters(filters);

        filters.setHotelReference(getDefaultHotelReference());
*/

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "getFutureBookingRequestObject", " Exit getFutureBookingRequestObject method ");

        return objFutureBookingSummaryRequest;

    }

    private SearchReservationResponse getFutureBookingResponseObject(ReservationServiceStub.FutureBookingSummaryResponse objResponse) {

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
        if (objResponse.getResult().getResultStatusFlag() == ReservationServiceStub.ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
            objSearchReservationResponse.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getUpdateBookingResponseObject ", " Update Failed:" + errorMessage);
            return objSearchReservationResponse;
        }


        List<Reservation> objLReservations = objSearchReservationResponse.getReservationList();

        if (objLReservations == null) {

            objLReservations = new ArrayList<Reservation>();
        }

        ReservationServiceStub.HotelReservation[] arrHotelReservation = objResponse.getHotelReservations().getHotelReservation();

        objLReservations = parseHotelReservation(arrHotelReservation);

        /**
         * To set the reservation list and status on the response.
         */
        objSearchReservationResponse.setReservationList(objLReservations);

        MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject ", " Exit getFutureBookingResponseObject method.");

        return objSearchReservationResponse;

    }

    private List<Reservation> parseHotelReservation(ReservationServiceStub.HotelReservation[] arrHotelReservation) {

        List<Reservation> objLReservations = new ArrayList<Reservation>();
        Reservation objReservation;
        String firstName;
        String lastName;

        for (ReservationServiceStub.HotelReservation objHotelReservation : arrHotelReservation) { // To traverse the hotel reservation.

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Enter in Hotel Reservation Loop.");

            objReservation = new Reservation();
            objLReservations.add(objReservation);

            StringBuilder objBuilder = new StringBuilder();


            ReservationServiceStub.UniqueID[] arrUniqueID = objHotelReservation.getUniqueIDList().getUniqueID();

            for (ReservationServiceStub.UniqueID objUniqueID : arrUniqueID) { // To traverse Unique Id list.


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
            ReservationServiceStub.ResGuest[] arrGuest = objHotelReservation.getResGuests().getResGuest();

            for (ReservationServiceStub.ResGuest objResGuest : arrGuest) { // To traverse ResGuest.

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating ResGuest Array.");

                ReservationServiceStub.Profile[] arrProfiles = objResGuest.getProfiles().getProfile();

                for (ReservationServiceStub.Profile objProfile : arrProfiles) { // To traverse profile .

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating Profile Array.");

                    ReservationServiceStub.PersonName objPersonName = objProfile.getProfileChoice_type0().getCustomer().getPersonName();

                    ReservationServiceStub.NameCreditCard[] arrNameCreditCard = null;
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
                        for (ReservationServiceStub.NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Iterating NameCreditCard  Array.");

                            objReservation.setCreditCardNumber(objNameCreditCard.getCreditCardChoice_type0().getCardNumber());

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, " getFutureBookingResponseObject  ", " Credit Card Number is set.");
                        } // End loop for name credit card.
                    }

                    ReservationServiceStub.ArrayOfNameAddress arrNameAddresses = objProfile.getAddresses();
                    if (arrNameAddresses != null) {
                        for (ReservationServiceStub.NameAddress objAddress : arrNameAddresses.getNameAddress()) {// To traverse Name Address.

                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                    " getFutureBookingResponseObject ",
                                    " Iterating NameAddress Array.");
                            objReservation.setAddress(objAddress.getCountryCode());
                            MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                    " getFutureBookingResponseObject ",
                                    " Address is Set in response.");

                        } // end loop for Name Address.
                    }

                    ReservationServiceStub.ArrayOfNamePhone arrNamePhones = objProfile.getPhones();
                    if (arrNamePhones != null) {
                        for (ReservationServiceStub.NamePhone objNamePhone : arrNamePhones.getNamePhone()) { // To traverse Name Phone.
                            if (objNamePhone.getPhoneRole().equalsIgnoreCase("PHONE")) {
                                objReservation.setPhoneNumber(objNamePhone.getPhoneChoice_type0().getPhoneNumber());

                                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                                        " getFutureBookingResponseObject ",
                                        " Phone Number  is Set in response.");

                            }
                        } // End loop for Phone.
                    }

                    ReservationServiceStub.ArrayOfNameEmail arrNameEmails = objProfile.getEMails();
                    if (arrNameEmails != null) {
                        for (ReservationServiceStub.NameEmail objNameEmail : arrNameEmails.getNameEmail()) {// To traverse Name Email.
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

            ReservationServiceStub.ArrayOfRoomStay arrRoomStay = objHotelReservation.getRoomStays();

            for (ReservationServiceStub.RoomStay objRoomStay : arrRoomStay.getRoomStay()) { // To traverse room stay array.

                MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                        " getFutureBookingResponseObject ", " Enter Room Stay Array.");

                ReservationServiceStub.ArrayOfRoomType arrRoomType = objRoomStay.getRoomTypes();

                for (ReservationServiceStub.RoomType objRType : arrRoomType.getRoomType()) {  // To traverse room type

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Iterating Room Type Array.");

                    obRoomDetails = new RoomDetails();

                    com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
                    objRoomType.setCode(objRType.getRoomTypeCode());

                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Room Type Code is Set in response.");

                    ReservationServiceStub.ArrayOfRoomFeature arrRoomFeature =
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
                        ReservationServiceStub.RoomFeature[] features = arrRoomFeature.getFeatures();
                        if (features != null) {
                            for (int i = 0, featuresLength = features.length; i < featuresLength; i++) {
                                ReservationServiceStub.RoomFeature objRFeature = features[i]; // To traverse room features.
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


                ReservationServiceStub.GuestCount[] arrGuestCount = objRoomStay.getGuestCounts()
                        .getGuestCount();
                int guestCount = 0;
                for (ReservationServiceStub.GuestCount objGuestCount : arrGuestCount) { // To traverse Guest Count.
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Iterating Guest Count Array.");
                    guestCount = guestCount + objGuestCount.getCount();

                    objReservation.setNumberOfGuests(guestCount);
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " Guest Count is Set in response.");
                } // End loop for Guest Count.


                ReservationServiceStub.TimeSpan objTimeSpan = objRoomStay.getTimeSpan();
                if (objTimeSpan != null) {

                    objReservation.setCheckinDate(AdapterUtility
                            .getDate(objTimeSpan.getStartDate()));
                    MicrosPMSLogger.logInfo(OWSReservationProcessor.class,
                            " getFutureBookingResponseObject ",
                            " CheckIn Date is Set in response.");

                    ReservationServiceStub.TimeSpanChoice_type0 objTimeSpanChoice_type0 = objTimeSpan
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

    private ReservationServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        ReservationServiceStub.OGHeader ogHeader = new ReservationServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        ReservationServiceStub.EndPoint origin = new ReservationServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        ReservationServiceStub.EndPoint destination = new ReservationServiceStub.EndPoint();
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

            ReservationServiceStub.OGHeaderAuthentication auth = new ReservationServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            ReservationServiceStub.OGHeaderAuthenticationUserCredentials cred = new ReservationServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        ReservationServiceStub.OGHeaderE ogHeaderE = new ReservationServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(ReservationServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus instanceof ReservationServiceStub.GDSResultStatus) {
            ReservationServiceStub.GDSResultStatus gdsResultStatus = (ReservationServiceStub.GDSResultStatus) resultStatus;
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
