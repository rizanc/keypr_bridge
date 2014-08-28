package com.keypr.bridge.ids;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class BridgeIds {

    public enum ReservationStatus {
        RESERVED,
        PROSPECT,
        NOSHOW,
        CANCELED,
        INHOUSE,
        CHECKEDOUT,
        CHANGED,
        WAITLISTED,
        PRECHECKEDIN,
        DUEOUT;
    }

    public enum Gender {
        UNKNOWN,
        FEMALE,
        MALE;
    }

    public enum RoomStatus {
        CLEAN,
        DIRTY;
    }
}
