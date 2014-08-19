package com.micros.pms.processor;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.Membership;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.RequestActionType;
import com.cloudkey.pms.micros.og.common.Text;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.reservation.*;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.AddReservationNotesRequest;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
import com.cloudkey.pms.response.reservations.AddReservationNotesResponse;
import com.cloudkey.pms.response.reservations.SearchReservationResponse;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.HotelInformationConverter;
import com.micros.pms.util.IdUtils;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.DateTime;
import org.joda.time.Days;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSReservationProcessor extends OWSBase {
	@Inject
	protected OWSResvAdvancedProcessor resvAdvancedProcessor;

	@Inject
	protected ReservationServiceSoap service;

	public FetchBookingResponse fetchBooking(String pmsReservationId) {
		log.debug("fetchBooking: Enter method");

		FetchBookingRequest request = new FetchBookingRequest();

		request.setResvNameId(internalReservationId(pmsReservationId));
		request.setHotelReference(getDefaultHotelReference());

		FetchBookingResponse response = service.fetchBooking(request, createOGHeaderE());

		errorIfFailure(response.getResult());

		return response;
	}

	public com.cloudkey.pms.response.roomassignments.AssignRoomResponse processAssignRoom(com.cloudkey.pms.request.roomassignments.AssignRoomRequest request) {
		log.debug("processAssignRoom: Enter in processSearchReservationData method.");

		AssignRoomRequest req = getAssignRoomRequestObject(request);

		AssignRoomResponse response = service.assignRoom(req, createOGHeaderE());

		errorIfFailure(response.getResult());

		return getAssignRoomResponseObject(response);
	}

	public com.cloudkey.pms.response.roomassignments.ReleaseRoomResponse processReleaseRoom(com.cloudkey.pms.request.roomassignments.ReleaseRoomRequest request) {
		log.debug("processReleaseRoom: Enter in processReleaseRoom method. ");

		ReleaseRoomRequest req = getReleaseRoomRequestObject(request);
		ReleaseRoomResponse response = service.releaseRoom(req, createOGHeaderE());

		errorIfFailure(response.getResult());

		return getReleaseRoomResponseObject(response);
	}

	public AddReservationNotesResponse processAddNotes(AddReservationNotesRequest addReservationNotesRequest) {

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

		GuestRequestsResponse response = service.guestRequests(microsReq, createOGHeaderE());

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

	private AssignRoomRequest getAssignRoomRequestObject(com.cloudkey.pms.request.roomassignments.AssignRoomRequest assignRoomRequest) {

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

	public SearchReservationResponse processSearchReservationData(SearchReservationRequest request) {

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

		if (request.getPmsReservationId() != null) {
			microsRequest.getAdditionalFilters().setResvNameId(internalReservationId(request.getPmsReservationId()));
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

		List<Reservation> objLReservations = parseHotelReservation(objResponse.getHotelReservations());

		/**
		 * To set the reservation list and status on the response.
		 */
		objSearchReservationResponse.setReservationList(objLReservations);

		log.debug("getFutureBookingResponseObject: Exit getFutureBookingResponseObject method.");

		return objSearchReservationResponse;

	}

	/**
	 * Converts OWS {@link com.cloudkey.pms.micros.og.reservation.HotelReservation} objects into
	 * PMS-agnostic {@link com.cloudkey.commons.Reservation}s.
	 *
	 * @param microsReservations
	 * @return
	 */
	private List<Reservation> parseHotelReservation(List<HotelReservation> microsReservations) {
		List<Reservation> reservations = new ArrayList<>();

		for (HotelReservation microsReservation : microsReservations) { // To traverse the hotel reservation.
			log.debug("getFutureBookingResponseObject: Enter in Hotel Reservation Loop.");

			Reservation reservation = new Reservation();

			reservation.setNumberOfGuests(microsReservation.getResGuests().size());

			Integer numberOfAdults = 0;
			Integer numberOfChildren = 0;

			Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(microsReservation.getUniqueIDList());
			if (pmsReservationIdOpt.isPresent()) {
				reservation.setPmsReservationId(pmsReservationIdOpt.get());
			}

			reservation.setReservationStatus(microsReservation.getReservationStatus().value());
			reservation.setGroup(microsReservation.getGroup());

			for (ResGuest resGuest : microsReservation.getResGuests()) { // To traverse ResGuest.
				log.debug("getFutureBookingResponseObject: Iterating ResGuest Array.");

				if (resGuest.getGuestCounts() != null) {
					for (GuestCount guestCount : resGuest.getGuestCounts().getGuestCounts()) {
						switch (guestCount.getAgeQualifyingCode()) {

							case ADULT:
								numberOfAdults += guestCount.getCount();
								break;
							case CHILD:
								numberOfChildren += guestCount.getCount();
								break;
							case OTHER:
								break;
							case CHILDBUCKET_1:
								break;
							case CHILDBUCKET_2:
								break;
							case CHILDBUCKET_3:
								break;
						}
					}
				}

				List<Profile> arrProfiles = resGuest.getProfiles();

				for (Profile profile : arrProfiles) { // To traverse profile .
					log.debug("getFutureBookingResponseObject: Iterating Profile Array.");

					if (profile.getCustomer() != null) {
						// Customer profile
						// Set the first name and last name
						if (profile.getCustomer().getPersonName() != null) {
							PersonName personName = profile.getCustomer().getPersonName();

							reservation.setFirstName(personName.getFirstName());
							reservation.setLastName(personName.getLastName());

							log.debug("getFutureBookingResponseObject: Full Name is set.");
						}

						Optional<NameCreditCard> firstCreditCardOpt = FluentIterable.from(profile.getCreditCards()).first();
						if (firstCreditCardOpt.isPresent()) {
							reservation.setCreditCardNumber(firstCreditCardOpt.get().getCardNumber());
						}

						Optional<NameAddress> firstAddressOpt = FluentIterable.from(profile.getAddresses()).first();

						if (firstAddressOpt.isPresent()) {
							reservation.setAddress(HotelInformationConverter.convertAddress(firstAddressOpt.get()));
						}

						Optional<NamePhone> phoneOpt = Iterables.tryFind(profile.getPhones(), new Predicate<NamePhone>() {
							@Override
							public boolean apply(@Nullable NamePhone namePhone) {
								return Objects.equal(namePhone.getPhoneRole(), MicrosIds.OWS.PhoneNumberRole.PHONE.toString());
							}
						});
						if (phoneOpt.isPresent()) {
							reservation.setPhoneNumber(phoneOpt.get().getPhoneNumber());
						}

						Optional<NameEmail> emailOpt = Iterables.tryFind(profile.getEMails(), new Predicate<NameEmail>() {
							@Override
							public boolean apply(@Nullable NameEmail nameEmail) {
								return nameEmail.isPrimary() != null && nameEmail.isPrimary();
							}
						}).or(FluentIterable.from(profile.getEMails()).first());

						if (emailOpt.isPresent()) {
							reservation.setEmail(emailOpt.get().getValue());
						}
					}

					if (profile.getCompany() != null) {
						Company company = profile.getCompany();

						switch (company.getCompanyType()) {

							case TRAVEL_AGENT:
								break;
							case COMPANY:
								reservation.setCompany(company.getCompanyName());
								break;
							case SOURCE:
								break;
							case GROUP:
								break;
							case CONTACT:
								break;
						}
					}

					log.debug("getFutureBookingResponseObject: Exit Profile .");
				} // End loop for Profile.
			} // End loop for Res Guest.

			List<RoomDetails> roomDetailsList = new ArrayList<>();

			reservation.setRoomDetailList(roomDetailsList);

			for (RoomStay roomStay : microsReservation.getRoomStays()) { // To traverse room stay array.

				log.debug(
					" getFutureBookingResponseObject ", "Enter Room Stay Array.");

				if (roomStay.getHotelReference() != null) {
					reservation.setHotelCode(roomStay.getHotelReference().getHotelCode());
					reservation.setChainCode(roomStay.getHotelReference().getChainCode());
				}

				for (RoomType roomType : roomStay.getRoomTypes()) {  // To traverse room type

					log.debug(
						" getFutureBookingResponseObject ",
						" Iterating Room Type Array.");

					RoomDetails obRoomDetails = new RoomDetails();

					log.debug(
						" getFutureBookingResponseObject ",
						" Room Type Code is Set in response.");

					for (String roomNumber : roomType.getRoomNumbers()) {
						obRoomDetails.setRoomNumber(roomNumber);
					}

					log.debug(
						" getFutureBookingResponseObject ",
						" Features and Description are Set in response.");

					obRoomDetails.setRoomType(new com.cloudkey.commons.RoomType(
						roomType.getRoomTypeCode(),
						roomType.getRoomTypeDescription() == null ? null : ParagraphHelper.getFirstString(ParagraphHelper.getTextList(roomType.getRoomTypeDescription())).orNull(),
						roomType.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(roomType.getAmenityInfo().getAmenities()),
						null
					));

					roomDetailsList.add(obRoomDetails);

					if (roomStay.getMemberAwardInfo() != null) {
						reservation.setLoyaltyNumber(String.valueOf(roomStay.getMemberAwardInfo().getMembershipID()));
					}

					log.debug(
						" getFutureBookingResponseObject ", "Exit Room Type .");

				} // End loop for room Type.

				TimeSpan timeSpan = roomStay.getTimeSpan();
				if (timeSpan != null) {
					reservation.setCheckinDate(AdapterUtility.getDate(timeSpan.getStartDate()));
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckIn Date is Set in response.");

					reservation.setCheckoutDate(AdapterUtility
						.getDate(timeSpan.getEndDate()));
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckOut Date is Set in response.");

					reservation.setStayLength(
						Days.daysBetween(new DateTime(timeSpan.getStartDate()), new DateTime(timeSpan.getEndDate()))
							.getDays()
					);
				}

				log.debug(
					" getFutureBookingResponseObject ", "Notes are Set in response.");

				log.debug(
					" getFutureBookingResponseObject ", "Exit Room Stay .");

			} // End loop for room Stay.

			reservation.setNumberOfAdults(numberOfAdults);
			reservation.setNumberOfChildren(numberOfChildren);

			// Set the reservation into response.
			reservations.add(reservation);

			log.debug("getFutureBookingResponseObject: Exit from Hotel Reservation loop.");

		} // End loop for Hotel Reservation.

		return reservations;
	}

}
