package com.keypr.bridge.ids;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
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
        OUT_OF_SERVICE
	}

    public enum SuiteType {
        STANDARD,
        PSUEDO,
        SUITE
	}

    public enum TurnDownStatus {
        COMPLETED,
        REQUIRED,
        NOT_REQUIRED
	}

    public enum GuestServiceStatus {
        DO_NOT_DISTURB,
        MAKE_UP_ROOM,
        NONE
	}

    public enum RepairStatus {
        OUT_OF_ORDER,
        OUT_OF_SERVICE
	}

	public enum RateOccurrence {
		DAILY,
		WEEKLY,
		OTHER
	}

	public enum AmenityAvailability {
		CONFIRMABLE_COMPLIMENTARY,
		CONFIRMABLE_COST,
		ON_REQUEST_COMPLIMENTARY,
		ON_REQUEST_COST,
		EXISTS,
		OTHER
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
