package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.profile.CustomerProfile;
import com.keypr.bridge.ids.BridgeIds;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import java.util.List;

public class ReservationBuilder {
	private String pmsReservationId;
	private String confirmationNo;
	private Integer legNumber;
	private BridgeIds.ReservationStatus reservationStatus;
	private CustomerProfile customerProfile;
	private ProfileReference companyProfile;
	private ProfileReference travelAgentProfile;
	private ProfileReference sourceProfile;
	private ProfileReference groupProfile;
	private List<ProfileReference> contactProfiles;
	private LocalDate startDate;
	private LocalDate endDate;
	private RatePlan roomRatePlan;
	private List<RoomRate> roomRates;
	private Room room;
	private Integer additionalReservedRoomCount;
	private Integer adultCount;
	private Integer childrenCount;
	private String creditCardNumber;
	private String creditCardType;
	private String creditCardHolderName;
	private LocalDate creditCardExpirationDate;
	private MonetaryAmount totalCost;
	private MonetaryAmount currentBalance;
	private String membershipId;
	private List<Comment> comments;
	private Boolean hasRoomPreferences;
	private Boolean hasSpecialRequests;
	private LocalTime expectedArrivalTime;
	private LocalTime expectedDepartureTime;

	public ReservationBuilder setPmsReservationId(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
		return this;
	}

	public ReservationBuilder setConfirmationNo(String confirmationNo) {
		this.confirmationNo = confirmationNo;
		return this;
	}

	public ReservationBuilder setLegNumber(Integer legNumber) {
		this.legNumber = legNumber;
		return this;
	}

	public ReservationBuilder setReservationStatus(BridgeIds.ReservationStatus reservationStatus) {
		this.reservationStatus = reservationStatus;
		return this;
	}

	public ReservationBuilder setCustomerProfile(CustomerProfile customerProfile) {
		this.customerProfile = customerProfile;
		return this;
	}

	public ReservationBuilder setCompanyProfile(ProfileReference companyProfile) {
		this.companyProfile = companyProfile;
		return this;
	}

	public ReservationBuilder setTravelAgentProfile(ProfileReference travelAgentProfile) {
		this.travelAgentProfile = travelAgentProfile;
		return this;
	}

	public ReservationBuilder setSourceProfile(ProfileReference sourceProfile) {
		this.sourceProfile = sourceProfile;
		return this;
	}

	public ReservationBuilder setGroupProfile(ProfileReference groupProfile) {
		this.groupProfile = groupProfile;
		return this;
	}

	public ReservationBuilder setContactProfiles(List<ProfileReference> contactProfiles) {
		this.contactProfiles = contactProfiles;
		return this;
	}

	public ReservationBuilder setStartDate(LocalDate startDate) {
		this.startDate = startDate;
		return this;
	}

	public ReservationBuilder setEndDate(LocalDate endDate) {
		this.endDate = endDate;
		return this;
	}

	public ReservationBuilder setRoomRatePlan(RatePlan roomRatePlan) {
		this.roomRatePlan = roomRatePlan;
		return this;
	}

	public ReservationBuilder setRoomRates(List<RoomRate> roomRates) {
		this.roomRates = roomRates;
		return this;
	}

	public ReservationBuilder setRoom(Room room) {
		this.room = room;
		return this;
	}

	public ReservationBuilder setAdditionalReservedRoomCount(Integer additionalReservedRoomCount) {
		this.additionalReservedRoomCount = additionalReservedRoomCount;
		return this;
	}

	public ReservationBuilder setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
		return this;
	}

	public ReservationBuilder setChildrenCount(Integer childrenCount) {
		this.childrenCount = childrenCount;
		return this;
	}

	public ReservationBuilder setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
		return this;
	}

	public ReservationBuilder setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
		return this;
	}

	public ReservationBuilder setCreditCardHolderName(String creditCardHolderName) {
		this.creditCardHolderName = creditCardHolderName;
		return this;
	}

	public ReservationBuilder setCreditCardExpirationDate(LocalDate creditCardExpirationDate) {
		this.creditCardExpirationDate = creditCardExpirationDate;
		return this;
	}

	public ReservationBuilder setTotalCost(MonetaryAmount totalCost) {
		this.totalCost = totalCost;
		return this;
	}

	public ReservationBuilder setCurrentBalance(MonetaryAmount currentBalance) {
		this.currentBalance = currentBalance;
		return this;
	}

	public ReservationBuilder setMembershipId(String membershipId) {
		this.membershipId = membershipId;
		return this;
	}

	public ReservationBuilder setComments(List<Comment> comments) {
		this.comments = comments;
		return this;
	}

	public ReservationBuilder setHasRoomPreferences(Boolean hasRoomPreferences) {
		this.hasRoomPreferences = hasRoomPreferences;
		return this;
	}

	public ReservationBuilder setHasSpecialRequests(Boolean hasSpecialRequests) {
		this.hasSpecialRequests = hasSpecialRequests;
		return this;
	}

	public ReservationBuilder setExpectedArrivalTime(LocalTime expectedArrivalTime) {
		this.expectedArrivalTime = expectedArrivalTime;
		return this;
	}

	public ReservationBuilder setExpectedDepartureTime(LocalTime expectedDepartureTime) {
		this.expectedDepartureTime = expectedDepartureTime;
		return this;
	}

	public Reservation createReservation() {
		return new Reservation(pmsReservationId, confirmationNo, legNumber, reservationStatus, customerProfile, companyProfile, travelAgentProfile, sourceProfile, groupProfile, contactProfiles, startDate, endDate, roomRatePlan, roomRates, room, additionalReservedRoomCount, adultCount, childrenCount, creditCardNumber, creditCardType, creditCardHolderName, creditCardExpirationDate, totalCost, currentBalance, membershipId, comments, hasRoomPreferences, hasSpecialRequests, expectedArrivalTime, expectedDepartureTime);
	}
}