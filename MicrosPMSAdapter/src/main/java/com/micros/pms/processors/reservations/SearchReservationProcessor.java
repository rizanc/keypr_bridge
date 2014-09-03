package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.GuestCount;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStay;
import com.cloudkey.pms.micros.og.hotelcommon.RoomType;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequest;
import com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
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
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import com.micros.pms.util.IdUtils;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.*;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class SearchReservationProcessor extends OWSProcessor<
	SearchReservationRequest,
	SearchReservationResponse,
	FutureBookingSummaryRequest,
	FutureBookingSummaryResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FutureBookingSummaryResponse response) {
		return response.getResult();
	}

	@Override
	protected FutureBookingSummaryResponse callService(FutureBookingSummaryRequest request, Holder<OGHeader> header) {
		return service.futureBookingSummary(request, header);
	}

	@Override
	protected FutureBookingSummaryRequest toMicrosRequest(SearchReservationRequest request) {
		FutureBookingSummaryRequest microsRequest = new FutureBookingSummaryRequest()
			.withAdditionalFilters(new FetchBookingFilters()
				.withHotelReference(getDefaultHotelReference())
			);

		if (request.getConfirmationNumber() != null) {
			microsRequest.getAdditionalFilters().setConfirmationNumber(
				new UniqueID(request.getConfirmationNumber(), UniqueIDType.INTERNAL, null)
			);
		}

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

		return microsRequest;
	}

	@Override
	protected SearchReservationResponse toPmsResponse(FutureBookingSummaryResponse microsResponse) {
		/* Populate response into Reservation instance */
		return new SearchReservationResponse(Lists.transform(microsResponse.getHotelReservations(), convertHotelReservation));
	}

	protected final Function<HotelReservation, Reservation> convertHotelReservation = new Function<HotelReservation, Reservation>() {
		@Nullable
		@Override
		public Reservation apply(@Nullable HotelReservation microsReservation) {
			Reservation reservation = new Reservation();

			reservation.setNumberOfGuests(microsReservation.getResGuests().size());

			Integer numberOfAdults = 0;
			Integer numberOfChildren = 0;

			Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(microsReservation.getUniqueIDList());
			if (pmsReservationIdOpt.isPresent()) {
				reservation.setPmsReservationId(pmsReservationIdOpt.get());
			}

			if (microsReservation.getReservationStatus() != null) {
				reservation.setReservationStatus(microsReservation.getReservationStatus().value());
			}

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

				for (Profile profile : resGuest.getProfiles()) { // To traverse profile .
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

					RoomDetails roomDetails = new RoomDetails();

					log.debug(
						" getFutureBookingResponseObject ",
						" Room Type Code is Set in response.");

					for (String roomNumber : roomType.getRoomNumbers()) {
						roomDetails.setRoomNumber(roomNumber);
					}

					log.debug(
						" getFutureBookingResponseObject ",
						" Features and Description are Set in response.");

					roomDetails.setRoomType(new com.cloudkey.commons.RoomType(
						roomType.getRoomTypeCode(),
						roomType.getRoomTypeDescription() == null ? null : ParagraphHelper.getFirstString(ParagraphHelper.getTextList(roomType.getRoomTypeDescription())).orNull(),
						roomType.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(roomType.getAmenityInfo().getAmenities()),
						null
					));

					roomDetailsList.add(roomDetails);

					if (roomStay.getMemberAwardInfo() != null) {
						reservation.setLoyaltyNumber(String.valueOf(roomStay.getMemberAwardInfo().getMembershipID()));
					}

					log.debug(
						" getFutureBookingResponseObject ", "Exit Room Type .");

				} // End loop for room Type.

				TimeSpan timeSpan = roomStay.getTimeSpan();
				if (timeSpan != null) {
					reservation.setCheckinDate(new LocalDate(timeSpan.getStartDate()));
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckIn Date is Set in response.");

					if (timeSpan.getEndDate() != null) {
						reservation.setCheckoutDate(new LocalDate(timeSpan.getEndDate()));
					} else if (timeSpan.getDuration() != null) {
						LocalDate endDate = timeSpan.getStartDate().plus(timeSpan.getDuration()).toLocalDate();

						reservation.setCheckoutDate(endDate);
					}
					log.debug(
						" getFutureBookingResponseObject ",
						" CheckOut Date is Set in response.");

					reservation.setStayLength(
						Days.daysBetween(reservation.getCheckinDate(), reservation.getCheckoutDate())
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

			return reservation;
		}
	};
}

