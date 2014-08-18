package com.micros.pms.processor;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.reservation.*;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
import com.cloudkey.pms.request.reservations.AddReservationNotesRequest;
import com.cloudkey.pms.response.reservations.AddReservationNotesResponse;
import com.cloudkey.pms.response.reservations.SearchReservationResponse;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParagraphHelper;

import javax.annotation.Nullable;
import java.rmi.RemoteException;
import java.util.ArrayList;
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

	public AddReservationNotesResponse processAddNotes(AddReservationNotesRequest addReservationNotesRequest) throws RemoteException {

//		log.debug("processAddNotes: Enter method");

		GuestRequestsRequest microsReq = new GuestRequestsRequest()
			.withHotelReference(getDefaultHotelReference())
			.withActionType(RequestActionType.ADD)
			.withResvNameId(internalReservationId(addReservationNotesRequest.getPmsReservationId()))
			.withRequestType("COMMENTS")
			.withGuestRequests(new GuestRequests().withComments(
				Lists.transform(addReservationNotesRequest.getNotes(), new Function<String, ReservationComment>() {
					@Nullable
					@Override
					public ReservationComment apply(@Nullable String s) {
						return new ReservationComment()
							.withImagesAndURLSAndTexts(ParagraphHelper.createParagraph(s))
							.withGuestViewable(false);
					}
				})));

//				log.debug("processAddNotes",
//					AdapterUtility.convertToStreamXML(microsReq));
		GuestRequestsResponse response = service.guestRequests(microsReq, createOGHeaderE());
//		log.debug("processAddNotes",
//			AdapterUtility.convertToStreamXML(response));

		errorIfFailure(response.getResult());

		return new AddReservationNotesResponse(
			FluentIterable.from(response.getGuestRequests().getComments())
				.transformAndConcat(new Function<ReservationComment, List<Text>>() {
					@Nullable
					@Override
					public List<Text> apply(@Nullable ReservationComment reservationComment) {
						return ParagraphHelper.getTextList(reservationComment);
					}
				})
				.transform(new Function<Text, String>() {
					@Nullable
					@Override
					public String apply(@Nullable Text text) {
						return text.getValue();
					}
				})
				.toList()
		);
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

		String nextAvailableRoom = resvAdvancedProcessor.getNextAvailableRoomNumber(roomTypeCode);
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

	public SearchReservationResponse processSearchReservationData(SearchReservationRequest request) throws RemoteException {

		log.debug("processSearchReservationData: Enter in processSearchReservationData method. ");

		FutureBookingSummaryRequest microsRequest = new FutureBookingSummaryRequest()
			.withAdditionalFilters(new FetchBookingFilters()
				.withHotelReference(getDefaultHotelReference()));

		if (request.getCreditCardNumber() != null) {
			microsRequest.setCreditCardNumber(request.getCreditCardNumber());
		}

		if (request.getExtReferenceNumber() != null || request.getExtReferenceType() != null || request.getExtRefLegNumber() != null) {
			microsRequest.getAdditionalFilters().setExternalSystemNumber(new ExternalReference(
				request.getExtReferenceNumber(),
				request.getExtRefLegNumber(),
				request.getExtReferenceType()
			));
		}

		if (request.getFirstName() != null) {
			microsRequest.setFirstName(request.getFirstName());
		}

		if (request.getLastName() != null) {
			microsRequest.setLastName(request.getLastName());
		}

		if (request.getMembershipType() != null || request.getMembershipNumber() != null) {
			microsRequest.getAdditionalFilters().setMembership(
				new Membership()
					.withMembershipNumber(request.getMembershipNumber())
					.withMembershipType(request.getMembershipType())
			);
		}

		FutureBookingSummaryResponse response = service.futureBookingSummary(microsRequest, createOGHeaderE());

		errorIfFailure(response.getResult());

		return getFutureBookingResponseObject(response);
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
