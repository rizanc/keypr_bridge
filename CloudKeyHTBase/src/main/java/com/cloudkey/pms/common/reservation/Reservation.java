package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.profile.CustomerProfile;
import com.google.common.collect.ImmutableList;
import com.keypr.bridge.ids.BridgeIds.ReservationStatus;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Reservation {
    /**
     * The identifier of the reservation, local to the hotel
     */
    private String pmsReservationId;

	/**
	 * The confirmation of the reservation
	 */
	private String confirmationNo;

	/**
     * The leg number of the reservation in the guests' itinerary
     */
    private String legNumber;

    /**
     * The status of the reservation – reserved, checked in, no show, etc
     */
    private ReservationStatus reservationStatus;

	/**
	 * The customer's profile
	 */
	private CustomerProfile customerProfile;

	/**
	 * The company the guest works for
	 */
	@Nullable
	private ProfileReference companyProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	private ProfileReference travelAgentProfile;

	/**
	 * The source of the reservation, often not specified.
	 *
	 * This could represent a third party which handled the booking, such as a tour operator,
	 * a government agency, an airline, etc.
	 */
	@Nullable
	private ProfileReference sourceProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	private ProfileReference groupProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	private List<ProfileReference> contactProfiles;

	/**
	 * The day of the first night of the stay
	 */
	private LocalDate startDate;

	/**
	 * The day of the last morning of the stay
	 */
	private LocalDate endDate;

	/**
	 * The room rate plan
	 */
	@Nullable
	private RatePlan roomRatePlan;

	/**
	 * The room rates
	 */
	private List<RoomRate> roomRates;

	/**
	 * The room details
	 */
	private Room room;

	/**
	 * MICROS:
	 * Prior to check-in, it is possible for a reservation to have multiple rooms reserved if they are
	 * all of the same room type.
	 *
	 * Upon check-in, additional reservations are created for each additional room requested.
	 */
	private Integer additionalReservedRoomCount;

	/**
	 * The total number of adults with the reservation
	 */
	private Integer adultCount;

	/**
	 * The total number of children with the reservation
	 */
	private Integer childrenCount;

//	@Nullable
//	private String creditCardNumber;
//
//	@Nullable
//	private String creditCardType;
//
//	@Nullable
//	private String creditCardHolderName;
//
//	@Nullable
//	private LocalDate creditCardExpirationDate;

	@Nullable
	private MonetaryAmount totalCost;

	@Nullable
	private MonetaryAmount currentBalance;

	@Nullable
	private String membershipId;

	private List<Comment> comments;

    /**
     * Whether the reservation has any room preferences
     */
    private Boolean hasRoomPreferences;

	/**
     * Whether the reservation has any comments
     */
    private Boolean hasSpecialRequests;

	@Nullable
	private LocalTime expectedArrivalTime;

	@Nullable
	private LocalTime expectedDepartureTime;

	public Reservation(String pmsReservationId, String confirmationNo, String legNumber, ReservationStatus reservationStatus, CustomerProfile customerProfile, ProfileReference companyProfile, ProfileReference travelAgentProfile, ProfileReference sourceProfile, ProfileReference groupProfile, List<ProfileReference> contactProfiles, LocalDate startDate, LocalDate endDate, RatePlan roomRatePlan, List<RoomRate> roomRates, Room room, Integer additionalReservedRoomCount, Integer adultCount, Integer childrenCount, String creditCardNumber, String creditCardType, String creditCardHolderName, LocalDate creditCardExpirationDate, MonetaryAmount totalCost, MonetaryAmount currentBalance, String membershipId, List<Comment> comments, Boolean hasRoomPreferences, Boolean hasSpecialRequests, LocalTime expectedArrivalTime, LocalTime expectedDepartureTime) {
		this.pmsReservationId = pmsReservationId;
		this.confirmationNo = confirmationNo;
		this.legNumber = legNumber;
		this.reservationStatus = reservationStatus;
		this.customerProfile = customerProfile;
		this.companyProfile = companyProfile;
		this.travelAgentProfile = travelAgentProfile;
		this.sourceProfile = sourceProfile;
		this.groupProfile = groupProfile;
		this.contactProfiles = ImmutableList.copyOf(contactProfiles);
		this.startDate = startDate;
		this.endDate = endDate;
		this.roomRatePlan = roomRatePlan;
		this.roomRates = ImmutableList.copyOf(roomRates);
		this.room = room;
		this.additionalReservedRoomCount = additionalReservedRoomCount;
		this.adultCount = adultCount;
		this.childrenCount = childrenCount;
//		this.creditCardNumber = creditCardNumber;
//		this.creditCardType = creditCardType;
//		this.creditCardHolderName = creditCardHolderName;
//		this.creditCardExpirationDate = creditCardExpirationDate;
		this.totalCost = totalCost;
		this.currentBalance = currentBalance;
		this.membershipId = membershipId;
		this.comments = ImmutableList.copyOf(comments);
		this.hasRoomPreferences = hasRoomPreferences;
		this.hasSpecialRequests = hasSpecialRequests;
		this.expectedArrivalTime = expectedArrivalTime;
		this.expectedDepartureTime = expectedDepartureTime;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getConfirmationNo() {
		return confirmationNo;
	}

	public String getLegNumber() {
		return legNumber;
	}

	public ReservationStatus getReservationStatus() {
		return reservationStatus;
	}

	public CustomerProfile getCustomerProfile() {
		return customerProfile;
	}

	@Nullable
	public ProfileReference getCompanyProfile() {
		return companyProfile;
	}

	@Nullable
	public ProfileReference getTravelAgentProfile() {
		return travelAgentProfile;
	}

	@Nullable
	public ProfileReference getSourceProfile() {
		return sourceProfile;
	}

	@Nullable
	public ProfileReference getGroupProfile() {
		return groupProfile;
	}

	@Nullable
	public List<ProfileReference> getContactProfiles() {
		return contactProfiles;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	@Nullable
	public RatePlan getRoomRatePlan() {
		return roomRatePlan;
	}

	public List<RoomRate> getRoomRates() {
		return roomRates;
	}

	public Room getRoom() {
		return room;
	}

	public Integer getAdditionalReservedRoomCount() {
		return additionalReservedRoomCount;
	}

	public Integer getAdultCount() {
		return adultCount;
	}

	public Integer getChildrenCount() {
		return childrenCount;
	}

//	@Nullable
//	public String getCreditCardNumber() {
//		return creditCardNumber;
//	}
//
//	@Nullable
//	public String getCreditCardType() {
//		return creditCardType;
//	}
//
//	@Nullable
//	public String getCreditCardHolderName() {
//		return creditCardHolderName;
//	}
//
//	@Nullable
//	public LocalDate getCreditCardExpirationDate() {
//		return creditCardExpirationDate;
//	}

	@Nullable
	public MonetaryAmount getTotalCost() {
		return totalCost;
	}

	@Nullable
	public MonetaryAmount getCurrentBalance() {
		return currentBalance;
	}

	@Nullable
	public String getMembershipId() {
		return membershipId;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public Boolean getHasRoomPreferences() {
		return hasRoomPreferences;
	}

	public Boolean getHasSpecialRequests() {
		return hasSpecialRequests;
	}

	@Nullable
	public LocalTime getExpectedArrivalTime() {
		return expectedArrivalTime;
	}

	@Nullable
	public LocalTime getExpectedDepartureTime() {
		return expectedDepartureTime;
	}

	@Override
	public String toString() {
		return "Reservation{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			", confirmationNo='" + confirmationNo + '\'' +
			", legNumber='" + legNumber + '\'' +
			", reservationStatus=" + reservationStatus +
			", customerProfile=" + customerProfile +
			", companyProfile=" + companyProfile +
			", travelAgentProfile=" + travelAgentProfile +
			", sourceProfile=" + sourceProfile +
			", groupProfile=" + groupProfile +
			", contactProfiles=" + contactProfiles +
			", startDate=" + startDate +
			", endDate=" + endDate +
			", roomRatePlan=" + roomRatePlan +
			", roomRates=" + roomRates +
			", room=" + room +
			", additionalReservedRoomCount=" + additionalReservedRoomCount +
			", adultCount=" + adultCount +
			", childrenCount=" + childrenCount +
//			", creditCardNumber='" + creditCardNumber + '\'' +
//			", creditCardType='" + creditCardType + '\'' +
//			", creditCardHolderName='" + creditCardHolderName + '\'' +
//			", creditCardExpirationDate=" + creditCardExpirationDate +
			", totalCost=" + totalCost +
			", currentBalance=" + currentBalance +
			", membershipId='" + membershipId + '\'' +
			", comments=" + comments +
			", hasRoomPreferences=" + hasRoomPreferences +
			", hasSpecialRequests=" + hasSpecialRequests +
			", expectedArrivalTime=" + expectedArrivalTime +
			", expectedDepartureTime=" + expectedDepartureTime +
			'}';
	}
}

