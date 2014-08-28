package com.cloudkey.pms.common.reservation;

import com.keypr.bridge.ids.BridgeIds.ReservationStatus;
import com.keypr.bridge.ids.PmsReservationId;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Reservation {
    /**
     * The identifier of the reservation, local to the hotel
     */
    private PmsReservationId pmsReservationId;

    /**
     * The leg number of the reservation in the guests' itinerary
     */
    @Nullable
    private Integer legNumber;

    /**
     * The status of the reservation – reserved, checked in, no show, etc
     */
    private ReservationStatus reservationStatus;

    /**
     * The reservation's guests
     */
    private List<ReservationGuest> guests;

    /**
     * The reservation's room stays
     */
    private List<RoomStay> roomStays;

    /**
     * Whether the reservation has any room preferences
     */
    private Boolean hasRoomPreferences;

    /**
     * Whether the reservation has any comments
     */
    private Boolean hasComments;

    /**
     * Whether the reservation has any comments
     */
    private Boolean hasSpecialRequests;

}

