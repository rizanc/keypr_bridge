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
        DIRTY,
        INSPECTED,
        PICKUP,
        OUT_OF_ORDER,
        OUT_OF_SERVICE;
    }

    public enum SuiteType {
        STANDARD,
        PSUEDO,
        SUITE;
    }

    public enum TurnDownStatus {
        COMPLETED,
        REQUIRED,
        NOT_REQUIRED;
    }

    public enum GuestServiceStatus {
        DO_NOT_DISTURB,
        MAKE_UP_ROOM,
        NONE;
    }

    public enum RepairStatus {
        OUT_OF_ORDER,
        OUT_OF_SERVICE;
    }

	public enum RateOccurrence {
		DAILY,
		WEEKLY,
		OTHER;
	}

	public enum PMSErrorMessage {
		// Room assignment
		NO_ROOM_AVAILABLE("Room not ready for assignment");

		private String message;

		PMSErrorMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
	}
}
