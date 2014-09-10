package com.micros.pms.processors.hotels;

import com.cloudkey.commons.Restaurant;
import com.cloudkey.pms.common.Cuisine;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.common.profile.StreetAddress;
import com.cloudkey.pms.micros.og.common.Phone;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponseHotelInformation;
import com.cloudkey.pms.micros.services.InformationSoap;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

import static com.micros.pms.util.HotelInformationConverter.*;
import static com.micros.pms.util.ParagraphHelper.getFirstString;
import static com.micros.pms.util.ParagraphHelper.getFirstStringOfParagraphs;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class HotelInformationProcessor extends OWSProcessor<
	HotelInformationRequest,
	HotelInformationResponse,
	com.cloudkey.pms.micros.ows.information.HotelInformationRequest,
	com.cloudkey.pms.micros.ows.information.HotelInformationResponse> {

	@Inject
	protected InformationSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.information.HotelInformationResponse hotelInformationResponse) {
		return hotelInformationResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.information.HotelInformationResponse callService(com.cloudkey.pms.micros.ows.information.HotelInformationRequest hotelInformationRequest, Holder<OGHeader> header) {
		return service.queryHotelInformation(hotelInformationRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.information.HotelInformationRequest toMicrosRequest(HotelInformationRequest request) {
		return new com.cloudkey.pms.micros.ows.information.HotelInformationRequest(getDefaultHotelReference());
	}

	@Override
	protected HotelInformationResponse toPmsResponse(com.cloudkey.pms.micros.ows.information.HotelInformationResponse microsResponse) {
		HotelInformationResponseHotelInformation info = microsResponse.getHotelInformation();

		List<String> contactEmails = new ArrayList<>();
		List<String> phoneNumbers = new ArrayList<>();
		List<String> faxNumbers = new ArrayList<>();
		List<StreetAddress> addresses = Collections.emptyList();

		HotelContact contactInfo = info.getHotelContactInformation();

		if (contactInfo != null) {
			// Emails
			for (Email email : contactInfo.getContactEmails()) {
				contactEmails.add(email.getValue());
			}

			// Phone and fax numbers
			for (Phone phone : contactInfo.getContactPhones()) {
				if (phone.getPhoneRole().equals(MicrosIds.OWS.PhoneNumberRole.PHONE.name())) {
					phoneNumbers.add(phone.getPhoneNumber());
				} else if (phone.getPhoneRole().equals(MicrosIds.OWS.PhoneNumberRole.FAX.name())) {
					faxNumbers.add(phone.getPhoneNumber());
				}
			}

			// Addresses
			addresses = Lists.transform(contactInfo.getAddresses(), convertAddress);
		}

		ExtendedHotelInfo extended = info.getHotelExtendedInformation();

		// Various details that may be found in the hotel info element
		List<HotelInfo> hotelInfos = extended == null ? Collections.<HotelInfo>emptyList() : extended.getHotelInformation();

		Optional<String> checkInInfo = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByType(HotelInfoType.CHECKININFO));
		Optional<String> checkOutInfo = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByType(HotelInfoType.CHECKOUTINFO));
		Optional<String> directions = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByType(HotelInfoType.DIRECTIONS));
		Optional<String> website = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.WEBADDRESS));
		Optional<String> grade = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.GRADE));
		Optional<String> hotelDescription = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.HOTEL_DESCRIPTION));
		Optional<String> passportRules = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.PASSPORT_RULES));
		final Optional<String> timeZone = getInfoTextIfPresent(hotelInfos, new HotelInformationConverter.HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.TIMEZONE));

		List<String> acceptedCreditCards = new ArrayList<>();
		Integer totalRooms = null;
		List<com.cloudkey.commons.RoomType> roomTypes = new ArrayList<>();
		List<Restaurant> restaurants = new ArrayList<>();
		Optional<com.cloudkey.pms.common.GeoCode> hotelPosition = Optional.absent();
		List<HotelAmenity> amenities = Collections.emptyList();

		if (extended != null) {
			// Accepted payment methods
			for (PaymentType paymentType : extended.getPaymentMethods()) {
				String value = paymentType.getOtherPayment() == null ? null : paymentType.getOtherPayment().getValue();

				if (value != null) {
					acceptedCreditCards.add(value);
				}
			}

			hotelPosition = Optional.fromNullable(extended.getPosition())
				.transform(new Function<GeoCode, com.cloudkey.pms.common.GeoCode>() {
					@Override
					public com.cloudkey.pms.common.GeoCode apply(GeoCode geoCode) {
						return new com.cloudkey.pms.common.GeoCode(geoCode.getLongitude(), geoCode.getLatitude(), geoCode.getAltitude());
					}
				});

			// Guest rooms
			if (extended.getFacilityInfo() != null) {
				FacilityInfoType facilityInfo = extended.getFacilityInfo();
				if (facilityInfo.getGuestRooms() != null) {
					if (facilityInfo.getGuestRooms().getTotalRooms() != null) {
						totalRooms = Integer.parseInt(facilityInfo.getGuestRooms().getTotalRooms());
					}

					for (FacilityInfoTypeGuestRoomsGuestRoom guestRoom : facilityInfo.getGuestRooms().getGuestRooms()) {
						roomTypes.add(new com.cloudkey.commons.RoomType(
							guestRoom.getCode(),
							guestRoom.getRoomDescription() == null ? null : getFirstString(guestRoom.getRoomDescription().getText()).orNull(),
							guestRoom.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(guestRoom.getAmenityInfo().getAmenities()),
							guestRoom.getMaxOccupancy() == null ? null : guestRoom.getMaxOccupancy().intValue()
						));
					}
				}

				// Restaurants
				for (RestaurantsTypeRestaurant restaurant : facilityInfo.getRestaurants()) {
					Optional<String> description = getFirstStringOfParagraphs(restaurant.getRestaurantDescriptions());

					List<Cuisine> cuisines = new ArrayList<>();
					for (RestaurantsTypeRestaurantCuisine cuisine : restaurant.getCuisines()) {
						cuisines.add(new Cuisine(
							cuisine.getCode(),
							cuisine.getDescription()
						));
					}

					restaurants.add(new Restaurant(
						restaurant.getRestaurantName(),
						description.orNull(),
						cuisines,
						Lists.transform(restaurant.getRestaurantContacts(), convertAddress),
						restaurant.isOfferBreakfast(),
						restaurant.isOfferBrunch(),
						restaurant.isOfferLunch(),
						restaurant.isOfferDinner(),
						restaurant.getMaxSeatingCapacity() == null ? null : restaurant.getMaxSeatingCapacity().intValue(),
						restaurant.getMaxSingleParty() == null ? null : restaurant.getMaxSingleParty().intValue()
					));
				}
			}

			if (extended.getAmenityInfo() != null) {
				amenities = convertAmenities(extended.getAmenityInfo().getAmenities());
			}
		}

		return new com.cloudkey.pms.response.hotels.HotelInformationResponse(
			info.getHotelInformation().getValue(),
			addresses,
			hotelPosition,
			directions,
			contactEmails,
			phoneNumbers,
			faxNumbers,
			checkInInfo.transform(toLocalTime),
			checkOutInfo.transform(toLocalTime),
			amenities,
			totalRooms,
			roomTypes,
			restaurants,
			website,
			grade,
			hotelDescription,
			passportRules,
			timeZone.transform(new Function<String, TimeZone>() {
				@Nullable
				@Override
				public TimeZone apply(@Nullable String s) {
					return TimeZone.getTimeZone(s);
				}
			}),
			acceptedCreditCards
		);
	}
}
