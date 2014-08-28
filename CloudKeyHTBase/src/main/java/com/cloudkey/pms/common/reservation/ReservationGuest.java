package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.profile.GuestProfile;
import com.keypr.bridge.ids.ReservationGuestId;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ReservationGuest {
    /**
     * The reservation-local identifier with which this guest is referenced
     * elsewhere in the reservation.
     */
    private ReservationGuestId id;

    private GuestProfile guestProfile;

    /**
     * The company the guest works for
     */
    @Nullable
    private Company company;

    /**
     * The travel agent or agency who the reservation was booked through
     */
    @Nullable
    private TravelAgent travelAgent;
}
