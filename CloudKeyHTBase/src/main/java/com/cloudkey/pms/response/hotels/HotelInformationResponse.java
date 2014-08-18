package com.cloudkey.pms.response.hotels;

import java.util.List;
import java.util.TimeZone;

import com.cloudkey.commons.Response;
import com.cloudkey.commons.Restaurant;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.common.GeoCode;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.common.contact.StreetAddress;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.joda.time.LocalTime;

/**
 * @author
 */
public class HotelInformationResponse extends Response {
    private String hotelName;
    private List<StreetAddress> addresses;
	private Optional<GeoCode> hotelPosition;
	private Optional<String> directions;
    private List<String> contactEmails;
    private List<String> phoneNumbers;
    private List<String> faxNumbers;
    private Optional<LocalTime> checkInTime;
    private Optional<LocalTime> checkOutTime;
	private List<HotelAmenity> amenities;
	private Integer totalRooms;
    private List<RoomType> roomTypeList;
    private List<Restaurant> restaurantList;
	private Optional<String> website;
	private Optional<String> grade;
	private Optional<String> hotelDescription;
	private Optional<String> passportRules;
	private Optional<TimeZone> timeZone;
	private List<String> acceptedCreditCards;

	public HotelInformationResponse(String hotelName, List<StreetAddress> addresses, Optional<GeoCode> hotelPosition, Optional<String> directions, List<String> contactEmails, List<String> phoneNumbers, List<String> faxNumbers, Optional<LocalTime> checkInTime, Optional<LocalTime> checkOutTime, List<HotelAmenity> amenities, Integer totalRooms, List<RoomType> roomTypeList, List<Restaurant> restaurantList, Optional<String> website, Optional<String> grade, Optional<String> hotelDescription, Optional<String> passportRules, Optional<TimeZone> timeZone, List<String> acceptedCreditCards) {
		this.hotelName = hotelName;
		this.addresses = ImmutableList.copyOf(addresses);
		this.hotelPosition = hotelPosition;
		this.directions = directions;
		this.contactEmails = ImmutableList.copyOf(contactEmails);
		this.phoneNumbers = ImmutableList.copyOf(phoneNumbers);
		this.faxNumbers = ImmutableList.copyOf(faxNumbers);
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.amenities = ImmutableList.copyOf(amenities);
		this.totalRooms = totalRooms;
		this.roomTypeList = roomTypeList;
		this.restaurantList = restaurantList;
		this.website = website;
		this.grade = grade;
		this.hotelDescription = hotelDescription;
		this.passportRules = passportRules;
		this.timeZone = timeZone;
		this.acceptedCreditCards = ImmutableList.copyOf(acceptedCreditCards);
	}

	public String getHotelName() {
		return hotelName;
	}

	public List<StreetAddress> getAddresses() {
		return addresses;
	}

	public Optional<GeoCode> getHotelPosition() {
		return hotelPosition;
	}

	public Optional<String> getDirections() {
		return directions;
	}

	public List<String> getContactEmails() {
		return contactEmails;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public List<String> getFaxNumbers() {
		return faxNumbers;
	}

	public Optional<LocalTime> getCheckInTime() {
		return checkInTime;
	}

	public Optional<LocalTime> getCheckOutTime() {
		return checkOutTime;
	}

	public List<HotelAmenity> getAmenities() {
		return amenities;
	}

	public Integer getTotalRooms() {
		return totalRooms;
	}

	public List<RoomType> getRoomTypeList() {
		return roomTypeList;
	}

	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}

	public Optional<String> getWebsite() {
		return website;
	}

	public Optional<String> getGrade() {
		return grade;
	}

	public Optional<String> getHotelDescription() {
		return hotelDescription;
	}

	public Optional<String> getPassportRules() {
		return passportRules;
	}

	public Optional<TimeZone> getTimeZone() {
		return timeZone;
	}

	public List<String> getAcceptedCreditCards() {
		return acceptedCreditCards;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("hotelName", hotelName)
			.add("addresses", addresses)
			.add("hotelPosition", hotelPosition)
			.add("directions", directions)
			.add("contactEmails", contactEmails)
			.add("phoneNumbers", phoneNumbers)
			.add("faxNumbers", faxNumbers)
			.add("checkInTime", checkInTime)
			.add("checkOutTime", checkOutTime)
			.add("amenities", amenities)
			.add("totalRooms", totalRooms)
			.add("roomTypeList", roomTypeList)
			.add("restaurantList", restaurantList)
			.add("website", website)
			.add("grade", grade)
			.add("hotelDescription", hotelDescription)
			.add("passportRules", passportRules)
			.add("timeZone", timeZone)
			.add("acceptedCreditCards", acceptedCreditCards)
			.toString();
	}
}
