package com.keypr.pms.micros.oxi.ids;

import com.keypr.bridge.ids.BridgeIds;

/**
 * Ids and constants used in Micros
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MicrosIds {

    public static class OXI {
        /**
         * Refers to //xs:simpleType [@name='phoneNumberType'] of profile.fidelio.3.0.xsd and profile.fidelio.4.0.xsd
         *
         * Although the XSDs specify that it's value is restricted to the following enum values,
         * OXI sometimes returns other values.

         * To handle this case, this type is deserialized to a String rather than an enum.
         */
        public enum PhoneNumberType {
            OTHER,
            HOME,
            BUSINESS,
            MOBILE,
            HOMEFAX,
            BUSINESSFAX,
            PAGER,
            TELEX,
            TTY
        }

        /**
         * Refers to //xs:simpleType [@name='addressType'] of profile.fidelio.3.0.xsd and profile.fidelio.4.0.xsd
         *
         * Although the XSDs specify that it's value is restricted to the following enum values,
         * OXI sometimes returns other values.
         *
         * To handle this case, this type is deserialized to a String rather than an enum.
         */
        public enum AddressType {
            HOME,
            BUSINESS,
            MAILING,
            SHIPPING,
            BILLING
        }

		public static final String RESERVATION_REFERENCE_ID_TYPE = "PMSID";
    }

	public static class OWS {
		public static final String PROFILE_NAME_ID = "OPERA_NAME_ID";

		public static final String RESERVATION_ID_SOURCE = "RESVID";

		public static final String LEG_NUM_SOURCE = "LEGNUMBER";

		public static final String CANCEL_REASON_CODE = "WEB";

		public enum FrontOfficeStatus {
			VAC(false),
			OCC(true);

			private boolean occupied;

			FrontOfficeStatus(boolean occupied) {
				this.occupied = occupied;
			}

			public boolean isOccupied() {
				return occupied;
			}

			/**
			 * Returns true if the given string indicates room occupation,
			 * false if room vacancy, or null if neither.
			 *
			 * @param frontOfficeStatus
			 * @return
			 */
			public static Boolean parseString(String frontOfficeStatus) {
				if (frontOfficeStatus == null) return null;

				try {
					return valueOf(frontOfficeStatus).isOccupied();
				} catch (IllegalArgumentException e) {
					return null;
				}
			}
		}

		public enum SmokingPreference {
			NS(false),
			S(true);

			private boolean allowed;

			SmokingPreference(boolean allowed) {
				this.allowed = allowed;
			}

			public boolean isAllowed() {
				return allowed;
			}

			public static Boolean parseString(String smokingPreference) {
				if (smokingPreference == null) return null;

				try {
					return valueOf(smokingPreference).isAllowed();
				} catch (IllegalArgumentException e) {
					return null;
				}
			}
		}

		/**
		 * Enum of the possible values of the
		 * {@link com.cloudkey.pms.micros.og.hotelcommon.RoomStatus#roomStatus} string,
		 * along with the corresponding BridgeIds.RoomStatus value of each.
		 */
		public enum RoomStatus {
			CL(BridgeIds.RoomStatus.CLEAN),
			DI(BridgeIds.RoomStatus.DIRTY),
			IP(BridgeIds.RoomStatus.INSPECTED),
			PU(BridgeIds.RoomStatus.PICKUP),
			OO(BridgeIds.RoomStatus.OUT_OF_ORDER),
			OS(BridgeIds.RoomStatus.OUT_OF_SERVICE);

			private BridgeIds.RoomStatus bridgeValue;

			RoomStatus(BridgeIds.RoomStatus bridgeValue) {
				this.bridgeValue = bridgeValue;
			}

			public BridgeIds.RoomStatus getBridgeValue() {
				return bridgeValue;
			}

			public static BridgeIds.RoomStatus parseString(String roomStatus) {
				if (roomStatus == null) return null;

				try {
					return valueOf(roomStatus).getBridgeValue();
				} catch (IllegalArgumentException e) {
					return null;
				}
			}
		}

		/**
		 * Enum for the possible values of the
		 * {@link com.cloudkey.pms.micros.og.hotelcommon.RoomSetup#suiteType} string.
		 */
		public enum SuiteType {
			STANDARD(BridgeIds.SuiteType.STANDARD),
			PSUEDO(BridgeIds.SuiteType.PSUEDO),
			SUITE(BridgeIds.SuiteType.SUITE);

			private BridgeIds.SuiteType bridgeValue;

			SuiteType(BridgeIds.SuiteType bridgeValue) {
				this.bridgeValue = bridgeValue;
			}

			public BridgeIds.SuiteType getBridgeValue() {
				return bridgeValue;
			}

			public static BridgeIds.SuiteType parseString(String suiteType) {
				if (suiteType == null) return null;

				try {
					return valueOf(suiteType).getBridgeValue();
				} catch (IllegalArgumentException e) {
					return null;
				}
			}
		}

		/**
		 * Enum for the possible values of the
		 * {@link com.cloudkey.pms.micros.og.hotelcommon.RoomStatus#serviceStatus} string.
		 */
		public enum ServiceStatus {
			DND(BridgeIds.GuestServiceStatus.DO_NOT_DISTURB),
			MUP(BridgeIds.GuestServiceStatus.MAKE_UP_ROOM);
			// Not present / empty value = NONE

			private BridgeIds.GuestServiceStatus bridgeValue;

			ServiceStatus(BridgeIds.GuestServiceStatus bridgeValue) {
				this.bridgeValue = bridgeValue;
			}

			public BridgeIds.GuestServiceStatus getBridgeValue() {
				return bridgeValue;
			}

			public static BridgeIds.GuestServiceStatus parseString(String serviceStatus) {
				if (serviceStatus == null) return BridgeIds.GuestServiceStatus.NONE;

				try {
					return valueOf(serviceStatus).getBridgeValue();
				} catch (IllegalArgumentException e) {
					return BridgeIds.GuestServiceStatus.NONE;
				}
			}
		}

		public enum PhoneNumberRole {
			PHONE,
			FAX
		}

		public enum OtherHotelInfoType {
			WEBADDRESS("PROPERTY_WEBADDRESS"),
			TIMEZONE("PROPERTY_TIMEZONE"),
			GRADE("GRADE"),
			HOTEL_DESCRIPTION("Property Description"),
			PASSPORT_RULES("Passport Rules");

			private String typeValue;

			public String getTypeValue() {
				return typeValue;
			}

			OtherHotelInfoType(String typeValue) {
				this.typeValue = typeValue;
			}
		}

	}
}
