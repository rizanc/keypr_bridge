package com.cloudkey.pms.response.hotels;

import com.cloudkey.commons.Restaurant;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.common.GeoCode;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.common.profile.StreetAddress;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Optional;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.joda.time.LocalTime;

import java.util.List;
import java.util.TimeZone;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class HotelInformationResponse extends PMSResponse {
    String hotelName;
    List<StreetAddress> addresses;
	Optional<GeoCode> hotelPosition;
	Optional<String> directions;
    List<String> contactEmails;
    List<String> phoneNumbers;
    List<String> faxNumbers;
    Optional<LocalTime> checkInTime;
    Optional<LocalTime> checkOutTime;
	List<HotelAmenity> amenities;
	Integer totalRooms;
    List<RoomType> roomTypeList;
    List<Restaurant> restaurantList;
	Optional<String> website;
	Optional<String> grade;
	Optional<String> hotelDescription;
	Optional<String> passportRules;
	Optional<TimeZone> timeZone;
	List<String> acceptedCreditCards;
}
