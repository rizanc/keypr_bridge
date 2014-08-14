package com.micros.pms.processor;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.micros.og.common.Membership;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.reservation.*;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
import com.cloudkey.pms.request.reservations.UpdateBookingRequest;
import com.cloudkey.pms.response.reservations.SearchReservationResponse;
import com.cloudkey.pms.response.reservations.UpdateBookingResponse;
import com.google.common.base.Joiner;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParagraphHelper;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSReservationProcessor extends OWSBase {
	@Inject
	protected OWSResvAdvancedProcessor resvAdvancedProcessor;

	@Inject
	protected ReservationServiceSoap service;

	public FetchBookingResponse fetchBooking(String pmsReservationId) throws RemoteException {
		log.debug("fetchBooking: Enter method");

		FetchBookingRequest request = new FetchBookingRequest();

		request.setResvNameId(internalReservationId(pmsReservationId));
		request.setHotelReference(getDefaultHotelReference());

		log.debug("fetchBooking",
			AdapterUtility.convertToStreamXML(request));

		FetchBookingResponse response = service.fetchBooking(request, createOGHeaderE());
		log.debug("fetchBooking",
			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return response;
	}

	public com.cloudkey.pms.response.roomassignments.AssignRoomResponse processAssignRoom(com.cloudkey.pms.request.roomassignments.AssignRoomRequest request) throws RemoteException {
		log.debug("processAssignRoom: Enter in processSearchReservationData method.");

		AssignRoomRequest req = getAssignRoomRequestObject(request);

		log.debug("processAssignRoom",
			AdapterUtility.convertToStreamXML(req));
		AssignRoomResponse response = service.assignRoom(req, createOGHeaderE());

		log.debug("processAssignRoom",
			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return getAssignRoomResponseObject(response);
	}

	public com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse processReleaseRoom(com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest request) throws RemoteException {
		log.debug("processReleaseRoom: Enter in processReleaseRoom method. ");

		ReleaseRoomRequest req = getReleaseRoomRequestObject(request);

		log.debug("processReleaseRoom",
			AdapterUtility.convertToStreamXML(req));
		ReleaseRoomResponse response = service.releaseRoom(req, createOGHeaderE());
		log.debug("processReleaseRoom",
			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return getReleaseRoomResponseObject(response);
	}

	public com.cloudkey.pms.response.reservations.UpdateBookingResponse processUpdateBooking(com.cloudkey.pms.request.reservations.UpdateBookingRequest updateBookingRequest) throws RemoteException {

		log.debug("processUpdateBooking: Enter method");

		ModifyBookingRequest req =
			getUpdateBookingRequestObject(updateBookingRequest);

		log.debug("processUpdateBooking",
			AdapterUtility.convertToStreamXML(req));
		ModifyBookingResponse response = service.modifyBooking(req, createOGHeaderE());
		log.debug("processUpdateBooking",
			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return getUpdateBookingResponseObject(response);

	}

	/**
	 * @param objResponse
	 * @return UpdateBookingResponse
	 */
	private UpdateBookingResponse getUpdateBookingResponseObject(ModifyBookingResponse objResponse) {
		log.debug("getUpdateBookingResponseObject: Enter getUpdateBookingResponseObject method ");

		UpdateBookingResponse objUpdateBookingResponse = new UpdateBookingResponse();

		log.debug("getUpdateBookingResponseObject: Exit  getUpdateBookingResponseObject method ");

		return objUpdateBookingResponse;
	}

	/**
	 * This method is used to make the request for update the booking (pre -
	 * checkin.
	 *
	 * @param updateBookingRequest
	 * @return
	 */
	private ModifyBookingRequest getUpdateBookingRequestObject(UpdateBookingRequest updateBookingRequest) {

		log.debug("getUpdateBookingRequestObject: Enter getUpdateBookingRequestObject method ");

		/* To set the request parameters. */
		ModifyBookingRequest objModifyBookingRequest = new ModifyBookingRequest();

		HotelReference objHotelReference = getDefaultHotelReference();

		HotelReservation hotelReservation = new HotelReservation();
		objModifyBookingRequest.setHotelReservation(hotelReservation);

		hotelReservation.setUniqueIDList(Arrays.asList(internalReservationId(updateBookingRequest.getPmsReservationId())));

		RoomStay roomStay = new RoomStay();
		hotelReservation.getRoomStays().add(roomStay);

		roomStay.setHotelReference(objHotelReference);

		if (updateBookingRequest.getNotes() != null && !updateBookingRequest.getNotes().isEmpty()) {
			// Update Comments
			List<ReservationComment> comments = roomStay.getComments();

			for (String commentValue : updateBookingRequest.getNotes()) {
				ReservationComment comment = new ReservationComment();
				comments.add(comment);
				comment.setCommentType("RESERVATION");
				comment.setGuestViewable(false);

				if (entityId != null && !entityId.isEmpty()) {
					comment.setCommentOriginatorCode(entityId);
				}

				comment.getImagesAndURLSAndTexts().add(
					ParagraphHelper.createParagraph(commentValue)
				);
			}
		}

		log.debug("getUpdateBookingRequestObject: Exit getUpdateBookingRequestObject method: {}", objModifyBookingRequest);
		return objModifyBookingRequest;
	}

	private com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse getReleaseRoomResponseObject(ReleaseRoomResponse objReleaseRoomResponse) {

		log.debug("getReleaseRoomResponseObject: Enter getReleaseRoomResponseObject method ");

		com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse objReleaseRoomRespons = new com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse();

		log.debug("getReleaseRoomResponseObject: Exit getReleaseRoomResponseObject method ");

		return objReleaseRoomRespons;
	}

	private ReleaseRoomRequest getReleaseRoomRequestObject(com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest releaseRoomRequest) {

		log.debug("getReleaseRoomRequestObject: Enter getReleaseRoomRequestObject method ");

		ReleaseRoomRequest objReleaseRoomRequest = new ReleaseRoomRequest();

		/*To set the reservation number.*/
		objReleaseRoomRequest.setResvNameId(internalReservationId(releaseRoomRequest.getPmsReservationId()));

		objReleaseRoomRequest.setHotelReference(getDefaultHotelReference());

		log.debug("getReleaseRoomRequestObject: Exit getReleaseRoomRequestObject method ");

		return objReleaseRoomRequest;

	}

	private com.cloudkey.pms.response.roomassignments.AssignRoomResponse getAssignRoomResponseObject(AssignRoomResponse objResponse) {

		log.debug("getAssignRoomResponseObject: Enter getAssignRoomResponseObject method ");

		com.cloudkey.pms.response.roomassignments.AssignRoomResponse objAssignRoomResponse = new com.cloudkey.pms.response.roomassignments.AssignRoomResponse();

		objAssignRoomResponse.setAssignRoomNumber(objResponse.getRoomNoAssigned());
		log.debug("getAssignRoomResponseObject: Exit getAssignRoomResponseObject method ");

		return objAssignRoomResponse;
	}

	private AssignRoomRequest getAssignRoomRequestObject(com.cloudkey.pms.request.roomassignments.AssignRoomRequest assignRoomRequest) throws RemoteException {

		log.debug("getAssignRoomRequestObject: Enter getAssignRoomRequestObject method ");

		String roomTypeCode = assignRoomRequest.getRoomTypeCode();

		AssignRoomRequest objAssignRoomRequest = null;

		String nextAvailableRoom = resvAdvancedProcessor.getNextAvailableRoom(roomTypeCode);
		if (nextAvailableRoom != null) {
			objAssignRoomRequest = new AssignRoomRequest();
			objAssignRoomRequest.setRoomNoRequested(nextAvailableRoom);

			objAssignRoomRequest.setResvNameId(internalReservationId(assignRoomRequest.getPmsReservationId()));

			HotelReference objHotelReference = getDefaultHotelReference();
			objAssignRoomRequest.setHotelReference(objHotelReference);

			objAssignRoomRequest.setStationID(stationId);

			log.debug("getAssignRoomRequestObject: Exit getAssignRoomRequestObject method ");
		}

		return objAssignRoomRequest;
	}

	public SearchReservationResponse processSearchReservationData(SearchReservationRequest searchReservationRequest) throws RemoteException {

		log.debug("processSearchReservationData: Enter in processSearchReservationData method. ");

		FutureBookingSummaryRequest req =
			getFutureBookingRequestObject(searchReservationRequest);

		log.debug("processSearchReservationData",
			AdapterUtility.convertToStreamXML(req));
		FutureBookingSummaryResponse response = service.futureBookingSummary(req, createOGHeaderE());
		log.debug("processSearchReservationData",
			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return getFutureBookingResponseObject(response);
	}

	private FutureBookingSummaryRequest getFutureBookingRequestObject(SearchReservationRequest searchReservationRequest) {

		log.debug("getFutureBookingRequestObject: Enter getFutureBookingRequestObject method ");

		String pmsReservationId = searchReservationRequest.getPmsReservationId();
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

		/* Sets pmsReservationId to the request */
		if (pmsReservationId != null) {
			objBookingFilters.setResvNameId(internalReservationId(pmsReservationId));
		}

		if (membershipType != null && memebershipNumber != null) {
			Membership membership = new Membership();
			membership.setMembershipNumber(memebershipNumber);
			membership.setMembershipType(membershipType);
			objBookingFilters.setMembership(membership);
		}
	    /* Set the credit card number . */
		if (creditCardNumber != null) {
			objFutureBookingSummaryRequest.setCreditCardNumber(creditCardNumber);
		}

		if (firstName != null) {
			objFutureBookingSummaryRequest.setFirstName(firstName);
		}

		if (lastName != null) {

			objFutureBookingSummaryRequest.setLastName(lastName);
		}

//		FutureBookingSummaryRequestChoice_type0 type0 = new FutureBookingSummaryRequestChoice_type0();
//
//		objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type0(type0);
//
//		if (objFutureBookingSummaryRequest.getFutureBookingSummaryRequestChoice_type1() == null) {
//			objFutureBookingSummaryRequest.setFutureBookingSummaryRequestChoice_type1(new FutureBookingSummaryRequestChoice_type1());
//		}

/*
        FetchBookingFilters filters = new FetchBookingFilters();
        objFutureBookingSummaryRequest.setAdditionalFilters(filters);

        filters.setHotelReference(getDefaultHotelReference());
*/

		log.debug("getFutureBookingRequestObject: Exit getFutureBookingRequestObject method ");

		return objFutureBookingSummaryRequest;

	}

	private SearchReservationResponse getFutureBookingResponseObject(FutureBookingSummaryResponse objResponse) {

		log.debug("getFutureBookingResponseObject: Enter getFutureBookingResponseObject method.");

		if (objResponse == null) {
			return null;
		}

		/* Populate response into Reservation instance */
		SearchReservationResponse objSearchReservationResponse = new SearchReservationResponse();

		List<HotelReservation> arrHotelReservation = objResponse.getHotelReservations();

		List<Reservation> objLReservations = parseHotelReservation(arrHotelReservation);

		/**
		 * To set the reservation list and status on the response.
		 */
		objSearchReservationResponse.setReservationList(objLReservations);

		log.debug("getFutureBookingResponseObject: Exit getFutureBookingResponseObject method.");

		return objSearchReservationResponse;

	}

	private List<Reservation> parseHotelReservation(List<HotelReservation> arrHotelReservation) {

		List<Reservation> objLReservations = new ArrayList<>();
		Reservation objReservation;
		String firstName;
		String lastName;

		for (HotelReservation objHotelReservation : arrHotelReservation) { // To traverse the hotel reservation.

			log.debug("getFutureBookingResponseObject: Enter in Hotel Reservation Loop.");

			objReservation = new Reservation();
			objLReservations.add(objReservation);

			List<UniqueID> arrUniqueID = objHotelReservation.getUniqueIDList();

			for (UniqueID objUniqueID : arrUniqueID) { // To traverse Unique Id list.

				log.debug("getFutureBookingResponseObject: Iterating UniqueID list .");

				if (objUniqueID.getType().equals(UniqueIDType.INTERNAL)) {
					if (objUniqueID.getSource() != null) {
						if (objUniqueID.getSource().equalsIgnoreCase(MicrosIds.OWS.RESERVATION_ID_SOURCE)) {

							objReservation.setPmsReservationId(objUniqueID.getValue());

							log.debug("getFutureBookingResponseObject: PmsReservationId is set.");
						}
					} else {
						objReservation.setConfirmationNumber(objUniqueID.getValue());
					}
				}
			} // End loop for Unique ID .
			String status = objHotelReservation.getReservationStatus().value();
			objReservation.setReservationStatus(status);

			String group = objHotelReservation.getGroup();
			objReservation.setGroup(group);
			List<ResGuest> arrGuest = objHotelReservation.getResGuests();

			for (ResGuest objResGuest : arrGuest) { // To traverse ResGuest.

				log.debug("getFutureBookingResponseObject: Iterating ResGuest Array.");

				List<Profile> arrProfiles = objResGuest.getProfiles();

				for (Profile objProfile : arrProfiles) { // To traverse profile .

					log.debug("getFutureBookingResponseObject: Iterating Profile Array.");

					PersonName objPersonName = objProfile.getCustomer().getPersonName();

					List<NameCreditCard> arrNameCreditCard = null;
					if (objProfile.getCreditCards() != null) {
						arrNameCreditCard = objProfile.getCreditCards();
					}

					/* To set the first name and last name . */
					firstName = objPersonName.getFirstName();
					lastName = objPersonName.getLastName();

					if (firstName != null || lastName != null) {
						objReservation.setFullName(Joiner.on(" ").skipNulls().join(firstName, lastName));

						log.debug("getFutureBookingResponseObject: Full Name is set.");
					}

					if (arrNameCreditCard != null) {
						for (NameCreditCard objNameCreditCard : arrNameCreditCard) { // To traverse name credit card.

							log.debug("getFutureBookingResponseObject: Iterating NameCreditCard  Array.");

							objReservation.setCreditCardNumber(objNameCreditCard.getCardNumber());

							log.debug("getFutureBookingResponseObject: Credit Card Number is set.");
						} // End loop for name credit card.
					}

					for (NameAddress objAddress : objProfile.getAddresses()) {// To traverse Name Address.
						log.debug(
							" getFutureBookingResponseObject ",
							" Iterating NameAddress Array.");
						objReservation.setAddress(objAddress.getCountryCode());
						log.debug(
							" getFutureBookingResponseObject ",
							" Address is Set in response.");

					} // end loop for Name Address.

					for (NamePhone objNamePhone : objProfile.getPhones()) { // To traverse Name Phone.
						if (objNamePhone.getPhoneRole().equalsIgnoreCase("PHONE")) {
							objReservation.setPhoneNumber(objNamePhone.getPhoneNumber());

							log.debug(
								" getFutureBookingResponseObject ",
								" Phone Number  is Set in response.");

						}
					} // End loop for Phone.

					for (NameEmail objNameEmail : objProfile.getEMails()) {// To traverse Name Email.
						objReservation.setEmail(objNameEmail.getValue());
						log.debug(
							" getFutureBookingResponseObject ", "Email is Set in response.");
					} // End loop for Email.

					log.debug("getFutureBookingResponseObject: Exit Profile .");

				} // End loop for Profile.
			} // End loop for Res Guest.

			List<RoomDetails> objRDetailList = objReservation.getRoomDetailList();
			if (objRDetailList == null) {
				objRDetailList = new ArrayList<>();
			}

			objReservation.setRoomDetailList(objRDetailList);

			for (RoomStay objRoomStay : objHotelReservation.getRoomStays()) { // To traverse room stay array.

				log.debug(
					" getFutureBookingResponseObject ", "Enter Room Stay Array.");

				for (RoomType objRType : objRoomStay.getRoomTypes()) {  // To traverse room type

					log.debug(
						" getFutureBookingResponseObject ",
						" Iterating Room Type Array.");

					RoomDetails obRoomDetails = new RoomDetails();

					com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();
					objRoomType.setCode(objRType.getRoomTypeCode());

					log.debug(
						" getFutureBookingResponseObject ",
						" Room Type Code is Set in response.");

					List<String> arrRoomNumber = objRType.getRoomNumbers();

					if (arrRoomNumber != null) {
						for (String roomNumber : arrRoomNumber) {
							obRoomDetails.setRoomNumber(Integer.parseInt(roomNumber));
						}
					}

					StringBuilder objBuilder = new StringBuilder();
					StringBuilder objStringBuilder2 = new StringBuilder();

					for (RoomFeature objRFeature : objRType.getRoomFeatures()) {
						log.debug(
							" getFutureBookingResponseObject ",
							" Iterating Room Feature Array.");
						objBuilder.append(objRFeature.getFeature()).append(";");
						objStringBuilder2.append(objRFeature.getDescription()).append(";");

					}
					objRoomType.setFeatures(objBuilder.toString());

					objRoomType.setDescription(objStringBuilder2.toString());
					log.debug(
						" getFutureBookingResponseObject ",
						" Features and Description are Set in response.");
					objStringBuilder2.setLength(0);
					obRoomDetails.setRoomType(objRoomType);
					objRDetailList.add(obRoomDetails);

					log.debug(
						" getFutureBookingResponseObject ", "Exit Room Type .");

				} // End loop for room Type.

				objReservation.setNumberOfGuests(arrGuest.size());

				TimeSpan objTimeSpan = objRoomStay.getTimeSpan();
				if (objTimeSpan != null) {

					objReservation.setCheckinDate(AdapterUtility.getDate(objTimeSpan.getStartDate()));
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckIn Date is Set in response.");

					objReservation.setCheckoutDate(AdapterUtility
						.getDate(objTimeSpan.getEndDate()));
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckOut Date is Set in response.");
				}

				log.debug(
					" getFutureBookingResponseObject ", "Notes are Set in response.");

				log.debug(
					" getFutureBookingResponseObject ", "Exit Room Stay .");

			} // End loop for room Stay.

			// Set the reservation into response.
			objLReservations.add(objReservation);

			log.debug("getFutureBookingResponseObject: Exit from Hotel Reservation loop.");

		} // End loop for Hotel Reservation.

		return objLReservations;
	}

}
