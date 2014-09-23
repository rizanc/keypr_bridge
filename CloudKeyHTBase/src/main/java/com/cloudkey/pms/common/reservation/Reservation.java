package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.profile.CustomerProfile;
import com.keypr.bridge.ids.BridgeIds.ReservationStatus;
import lombok.Value;
import lombok.experimental.Builder;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
@Builder
public class Reservation {
    /**
     * The identifier of the reservation, local to the hotel
     */
    String pmsReservationId;

	/**
	 * The confirmation of the reservation
	 */
	String confirmationNo;

	/**
     * The leg number of the reservation in the guests' itinerary
     */
    Integer legNumber;

    /**
     * The status of the reservation – reserved, checked in, no show, etc
     */
    ReservationStatus reservationStatus;

	/**
	 * The customer's profile
	 */
	CustomerProfile customerProfile;

	/**
	 * The company the guest works for
	 */
	@Nullable
	ProfileReference companyProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	ProfileReference travelAgentProfile;

	/**
	 * The source of the reservation, often not specified.
	 *
	 * This could represent a third party which handled the booking, such as a tour operator,
	 * a government agency, an airline, etc.
	 */
	@Nullable
	ProfileReference sourceProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	ProfileReference groupProfile;

	/**
	 * The travel agent or agency who the reservation was booked through
	 */
	@Nullable
	List<ProfileReference> contactProfiles;

	/**
	 * The day of the first night of the stay
	 */
	LocalDate startDate;

	/**
	 * The day of the last morning of the stay
	 */
	LocalDate endDate;

	/**
	 * The room rate plan
	 */
	@Nullable
	RatePlan roomRatePlan;

	/**
	 * The room rates
	 */
	List<RoomRate> roomRates;

	/**
	 * The room details
	 */
	Room room;

	/**
	 * MICROS:
	 * Prior to check-in, it is possible for a reservation to have multiple rooms reserved if they are
	 * all of the same room type.
	 *
	 * Upon check-in, additional reservations are created for each additional room requested.
	 */
	Integer additionalReservedRoomCount;

	/**
	 * The total number of adults with the reservation
	 */
	Integer adultCount;

	/**
	 * The total number of children with the reservation
	 */
	Integer childrenCount;

	// NOTE: Credit card information is not provided in the summarized hotel reservations
	// returned in OWS's FutureBookingSummaryResponse.
	// Thus if credit card information is ever enabled here, reservations converted from these messages
	// will differ from those converted from FetchBookingResponse.
//	@Nullable
//	String creditCardNumber;
//
//	@Nullable
//	String creditCardType;
//
//	@Nullable
//	String creditCardHolderName;
//
//	@Nullable
//	LocalDate creditCardExpirationDate;

	@Nullable
	MonetaryAmount totalCost;

	@Nullable
	MonetaryAmount currentBalance;

	@Nullable
	String membershipId;

	List<Comment> comments;

    /**
     * Whether the reservation has any room preferences
     */
    Boolean hasRoomPreferences;

	/**
     * Whether the reservation has any comments
     */
    Boolean hasSpecialRequests;

	@Nullable
	LocalTime expectedArrivalTime;

	@Nullable
	LocalTime expectedDepartureTime;
}

