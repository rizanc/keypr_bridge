package com.micros.pms.util;

import com.cloudkey.pms.micros.og.reservation.ReservationStatusType;
import com.keypr.bridge.ids.BridgeIds.ReservationStatus;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class ReservationConverter {
//    public Reservation convert(HotelReservation from) {
//        new Reservation(
//            IdUtils.findPmsReservationId(from.getUniqueIDList()).orNull(),
//            convertReservationStatus(from.getReservationStatus())
//        )
//    }

    private ReservationStatus convertReservationStatus(ReservationStatusType reservationStatus) {
        if (reservationStatus == null)
            return null;

        switch (reservationStatus) {

            case RESERVED:
                return ReservationStatus.RESERVED;
            case PROSPECT:
                return ReservationStatus.PROSPECT;
            case NOSHOW:
                return ReservationStatus.NOSHOW;
            case CANCELED:
                return ReservationStatus.CANCELED;
            case INHOUSE:
                return ReservationStatus.INHOUSE;
            case CHECKEDOUT:
                return ReservationStatus.CHECKEDOUT;
            case CHANGED:
                return ReservationStatus.CHANGED;
            case WAITLISTED:
                return ReservationStatus.WAITLISTED;
            case PRECHECKEDIN:
                return ReservationStatus.PRECHECKEDIN;
            case DUEOUT:
                return ReservationStatus.DUEOUT;
        }

        return null;
    }
}
