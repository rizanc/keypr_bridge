package com.micros.pms.processor;

import com.cloudkey.commons.Restaurant;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.common.Cuisine;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.Phone;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.information.HotelInformationRequest;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponse;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponseHotelInformation;
import com.cloudkey.pms.micros.services.InformationSoap;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.OWSBase;
import com.micros.pms.util.HotelInformationConverter;

import javax.annotation.Nullable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

import static com.micros.pms.util.HotelInformationConverter.*;
import static com.micros.pms.util.ParagraphHelper.getFirstString;
import static com.micros.pms.util.ParagraphHelper.getFirstStringOfParagraphs;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSInformationProcessor extends OWSBase {

	@Inject
	protected InformationSoap service;

	public com.cloudkey.pms.response.hotels.HotelInformationResponse processHotelInformation(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) throws RemoteException {
        log.debug("processHotelInformation: Enter processHotelInformation method. ");

		HotelInformationRequest req = new HotelInformationRequest(getDefaultHotelReference());
		HotelInformationResponse response = service.queryHotelInformation(req, createOGHeaderE());

	    errorIfFailure(response.getResult());
	    return createHotelInformationResponse(response.getHotelInformation());
    }

	private com.cloudkey.pms.response.hotels.HotelInformationResponse createHotelInformationResponse(HotelInformationResponseHotelInformation info) {
		// Emails
		List<String> contactEmails = new ArrayList<>();
		for (Email email : info.getHotelContactInformation().getContactEmails()) {
			contactEmails.add(email.getValue());
		}

		// Phone numbers
		List<String> phoneNumbers = new ArrayList<>();
		List<String> faxNumbers = new ArrayList<>();

		for (Phone phone : info.getHotelContactInformation().getContactPhones()) {
			if (phone.getPhoneRole().equals(MicrosIds.OWS.PhoneNumberRole.PHONE.toString())) {
				phoneNumbers.add(phone.getPhoneNumber());
			} else if (phone.getPhoneRole().equals(MicrosIds.OWS.PhoneNumberRole.FAX.toString())) {
				faxNumbers.add(phone.getPhoneNumber());
			}
		}

		ExtendedHotelInfo extended = info.getHotelExtendedInformation();

		// Various details that may be found in the hotel info element
		List<HotelInfo> hotelInfos = extended.getHotelInformation();

		Optional<String> checkInInfo = getInfoTextIfPresent(hotelInfos, new HotelInfoByType(HotelInfoType.CHECKININFO));
		Optional<String> checkOutInfo = getInfoTextIfPresent(hotelInfos, new HotelInfoByType(HotelInfoType.CHECKOUTINFO));
		Optional<String> directions = getInfoTextIfPresent(hotelInfos, new HotelInfoByType(HotelInfoType.DIRECTIONS));
		Optional<String> website = getInfoTextIfPresent(hotelInfos, new HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.WEBADDRESS));
		Optional<String> grade = getInfoTextIfPresent(hotelInfos, new HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.GRADE));
		Optional<String> hotelDescription = getInfoTextIfPresent(hotelInfos, new HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.HOTEL_DESCRIPTION));
		Optional<String> passportRules = getInfoTextIfPresent(hotelInfos, new HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.PASSPORT_RULES));
		final Optional<String> timeZone = getInfoTextIfPresent(hotelInfos, new HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType.TIMEZONE));

		// Accepted payment methods
		List<String> acceptedCreditCards = new ArrayList<>();
		for (PaymentType paymentType : extended.getPaymentMethods()) {
			String value = paymentType.getOtherPayment().getValue();

			if (value != null) {
				acceptedCreditCards.add(value);
			}
		}

		Optional<com.cloudkey.pms.common.GeoCode> hotelPosition = Optional.fromNullable(extended.getPosition())
			.transform(new Function<GeoCode, com.cloudkey.pms.common.GeoCode>() {
				@Nullable
				@Override
				public com.cloudkey.pms.common.GeoCode apply(@Nullable GeoCode geoCode) {
					return new com.cloudkey.pms.common.GeoCode(geoCode.getLongitude(), geoCode.getLatitude(), geoCode.getAltitude());
				}
			});

		// Guest rooms
		Integer totalRooms = null;
		List<RoomType> roomTypes = new ArrayList<>();

		if (extended.getFacilityInfo() != null) {
			FacilityInfoType facilityInfo = extended.getFacilityInfo();
			if (facilityInfo.getGuestRooms() != null) {
				if (facilityInfo.getGuestRooms().getTotalRooms() != null) {
					totalRooms = Integer.parseInt(facilityInfo.getGuestRooms().getTotalRooms());
				}

				for (FacilityInfoTypeGuestRoomsGuestRoom guestRoom : facilityInfo.getGuestRooms().getGuestRooms()) {
					roomTypes.add(new RoomType(
						guestRoom.getCode(),
						guestRoom.getRoomDescription() == null ? null : getFirstString(guestRoom.getRoomDescription().getText()).orNull(),
						guestRoom.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(guestRoom.getAmenityInfo().getAmenities()),
						guestRoom.getMaxOccupancy() == null ? null : guestRoom.getMaxOccupancy().intValue()
					));
				}
			}
		}

		// Restaurants
		List<Restaurant> restaurants = new ArrayList<>();
		for (RestaurantsTypeRestaurant restaurant : extended.getFacilityInfo().getRestaurants()) {
			Optional<String> description = getFirstStringOfParagraphs(restaurant.getRestaurantDescriptions());

			List<Cuisine> cuisines = new ArrayList<>();
			for (RestaurantsTypeRestaurantCuisine cuisine : restaurant.getCuisines()){
				cuisines.add(new Cuisine(
					cuisine.getCode(),
					cuisine.getDescription()
				));
			}

			restaurants.add(new Restaurant(
				restaurant.getRestaurantName(),
				description.orNull(),
				cuisines,
				convertAddresses(restaurant.getRestaurantContacts()),
				restaurant.isOfferBreakfast(),
				restaurant.isOfferBrunch(),
				restaurant.isOfferLunch(),
				restaurant.isOfferDinner(),
				restaurant.getMaxSeatingCapacity() == null ? null : restaurant.getMaxSeatingCapacity().intValue(),
				restaurant.getMaxSingleParty() == null ? null : restaurant.getMaxSingleParty().intValue()
			));
		}

		return new com.cloudkey.pms.response.hotels.HotelInformationResponse(
			info.getHotelInformation().getValue(),
			convertAddresses(info.getHotelContactInformation().getAddresses()),
			hotelPosition,
			directions,
			contactEmails,
			phoneNumbers,
			faxNumbers,
			checkInInfo.transform(toLocalTime),
			checkOutInfo.transform(toLocalTime),
			convertAmenities(extended.getAmenityInfo().getAmenities()),
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
