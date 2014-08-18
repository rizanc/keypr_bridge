package com.keypr.pms.micros.oxi.ids;

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
    }

	public static class OWS {
		public static final String RESERVATION_ID_SOURCE = "RESVID";

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
