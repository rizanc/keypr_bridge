package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.og.common.Gender;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.guestservices.GuestServiceStatusType;
import com.cloudkey.pms.micros.og.guestservices.RepairStatusType;
import com.cloudkey.pms.micros.og.guestservices.RoomStatusType;
import com.cloudkey.pms.micros.og.guestservices.TurnDownStatusType;
import com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType;
import com.cloudkey.pms.micros.og.reservation.ReservationStatusType;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.ibm.wsdl.extensions.mime.MIMEConstants;
import com.keypr.bridge.ids.BridgeIds;
import com.keypr.pms.micros.oxi.ids.MicrosIds;

import javax.annotation.Nullable;
import java.util.Collection;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class IdUtils {
	public static com.google.common.base.Optional<String> findPmsReservationId(Collection<UniqueID> uniqueIDs) {
		return Iterables.tryFind(uniqueIDs, new Predicate<UniqueID>() {
			@Override
			public boolean apply(@Nullable UniqueID uniqueID) {
				return Objects.equal(uniqueID.getType(), UniqueIDType.INTERNAL)
					&& Objects.equal(uniqueID.getSource(), MicrosIds.OWS.RESERVATION_ID_SOURCE);
			}
		}).transform(new Function<UniqueID, String>() {
			@Nullable
			@Override
			public String apply(@Nullable UniqueID uniqueID) {
				return uniqueID.getValue();
			}
		});
	}

	public static com.google.common.base.Optional<String> findConfirmationNumId(Collection<UniqueID> uniqueIDs) {
		return Iterables.tryFind(uniqueIDs, new Predicate<UniqueID>() {
			@Override
			public boolean apply(UniqueID uniqueID) {
				return Objects.equal(uniqueID.getType(), UniqueIDType.INTERNAL)
					&& Objects.equal(uniqueID.getSource(), null);
			}
		}).transform(new Function<UniqueID, String>() {
			@Nullable
			@Override
			public String apply(UniqueID uniqueID) {
				return uniqueID.getValue();
			}
		});
	}

	public static com.google.common.base.Optional<String> findInternalProfileId(Collection<UniqueID> uniqueIDs) {
		return Iterables.tryFind(uniqueIDs, new Predicate<UniqueID>() {
			@Override
			public boolean apply(UniqueID uniqueID) {
				return Objects.equal(uniqueID.getType(), UniqueIDType.INTERNAL)
					&& Objects.equal(uniqueID.getSource(), null);
			}
		}).transform(new Function<UniqueID, String>() {
			@Nullable
			@Override
			public String apply(UniqueID uniqueID) {
				return uniqueID.getValue();
			}
		});
	}

	public static com.google.common.base.Optional<Integer> findlegNumber(Collection<UniqueID> uniqueIDs) {
		return Iterables.tryFind(uniqueIDs, new Predicate<UniqueID>() {
			@Override
			public boolean apply(UniqueID uniqueID) {
				return Objects.equal(uniqueID.getType(), UniqueIDType.INTERNAL)
					&& Objects.equal(uniqueID.getSource(), MicrosIds.OWS.LEG_NUM_SOURCE);
			}
		}).transform(new Function<UniqueID, Integer>() {
			@Nullable
			@Override
			public Integer apply(UniqueID uniqueID) {
				return Integer.parseInt(uniqueID.getValue());
			}
		});
	}

	/**
	 * Creates a {@link UniqueID} representing the provided internal reservation id.
	 *
	 * @param profileId
	 * @return
	 */
	public static UniqueID internalProfileId(String profileId) {
		return new UniqueID(profileId, UniqueIDType.INTERNAL, null);
	}

	public static UniqueID legNumberId(Integer legNumber) {
		return new UniqueID(legNumber.toString(), UniqueIDType.INTERNAL, MicrosIds.OWS.LEG_NUM_SOURCE);
	}

	/**
	 * Creates a {@link UniqueID} representing the provided internal reservation id.
	 *
	 * @param pmsReservationId
	 * @return
	 */
	public static UniqueID internalReservationId(String pmsReservationId) {
		return new UniqueID(pmsReservationId, UniqueIDType.INTERNAL, MicrosIds.OWS.RESERVATION_ID_SOURCE);
	}

	/**
	 * Creates a {@link UniqueID} representing the provided internal reservation id.
	 *
	 * @param confirmationNumber
	 * @return
	 */
	public static UniqueID confirmationNumId(String confirmationNumber) {
		return new UniqueID(confirmationNumber, UniqueIDType.INTERNAL, null);
	}

	public static GuestServiceStatusType toMicrosEnum(BridgeIds.GuestServiceStatus from) {
		if (from == null) {
			return null;
		}

		switch (from) {

			case DO_NOT_DISTURB:
				return GuestServiceStatusType.DO_NOT_DISTURB;
			case MAKE_UP_ROOM:
				return GuestServiceStatusType.MAKE_UP_ROOM;
			case NONE:
				return GuestServiceStatusType.NONE;
		}
		
		return null;
	}

	public static BridgeIds.GuestServiceStatus fromMicrosEnum(GuestServiceStatusType from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {

			case DO_NOT_DISTURB:
				return BridgeIds.GuestServiceStatus.DO_NOT_DISTURB;
			case MAKE_UP_ROOM:
				return BridgeIds.GuestServiceStatus.MAKE_UP_ROOM;
			case NONE:
				return BridgeIds.GuestServiceStatus.NONE;
		}

		return null;
	}

	public static RoomStatusType toMicrosEnum(BridgeIds.RoomStatus from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {

			case CLEAN:
				return RoomStatusType.CLEAN;
			case DIRTY:
				return RoomStatusType.DIRTY;
			case INSPECTED:
				return RoomStatusType.INSPECTED;
			case PICKUP:
				return RoomStatusType.PICKUP;
			case OUT_OF_ORDER:
				return RoomStatusType.OUT_OF_ORDER;
			case OUT_OF_SERVICE:
				return RoomStatusType.OUT_OF_SERVICE;
		}

		return null;
	}

	public static BridgeIds.RoomStatus fromMicrosEnum(RoomStatusType from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case CLEAN:
				return BridgeIds.RoomStatus.CLEAN;
			case DIRTY:
				return BridgeIds.RoomStatus.DIRTY;
			case INSPECTED:
				return BridgeIds.RoomStatus.INSPECTED;
			case PICKUP:
				return BridgeIds.RoomStatus.PICKUP;
			case OUT_OF_ORDER:
				return BridgeIds.RoomStatus.OUT_OF_ORDER;
			case OUT_OF_SERVICE:
				return BridgeIds.RoomStatus.OUT_OF_SERVICE;

		}

		return null;
	}
	
	public static TurnDownStatusType toMicrosEnum(BridgeIds.TurnDownStatus from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case COMPLETED:
				return TurnDownStatusType.COMPLETED;
			case REQUIRED:
				return TurnDownStatusType.REQUIRED;
			case NOT_REQUIRED:
				return TurnDownStatusType.NOT_REQUIRED;
		}

		return null;
	}

	public static BridgeIds.TurnDownStatus fromMicrosEnum(TurnDownStatusType from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case COMPLETED:
				return BridgeIds.TurnDownStatus.COMPLETED;
			case REQUIRED:
				return BridgeIds.TurnDownStatus.REQUIRED;
			case NOT_REQUIRED:
				return BridgeIds.TurnDownStatus.NOT_REQUIRED;
		}

		return null;
	}
	
	public static RepairStatusType toMicrosEnum(BridgeIds.RepairStatus from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case OUT_OF_ORDER:
				return RepairStatusType.OUT_OF_ORDER;
			case OUT_OF_SERVICE:
				return RepairStatusType.OUT_OF_SERVICE;
		}

		return null;
	}

	public static BridgeIds.RepairStatus fromMicrosEnum(RepairStatusType from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case OUT_OF_ORDER:
				return BridgeIds.RepairStatus.OUT_OF_ORDER;
			case OUT_OF_SERVICE:
				return BridgeIds.RepairStatus.OUT_OF_SERVICE;
		}

		return null;
	}
	
	public static Gender toMicrosEnum(BridgeIds.Gender from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {

			case UNKNOWN:
				return Gender.UNKNOWN;
			case FEMALE:
				return Gender.FEMALE;
			case MALE:
				return Gender.MALE;
		}

		return null;
	}

	public static BridgeIds.Gender fromMicrosEnum(Gender from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {

			case UNKNOWN:
				return BridgeIds.Gender.UNKNOWN;
			case FEMALE:
				return BridgeIds.Gender.FEMALE;
			case MALE:
				return BridgeIds.Gender.MALE;
		}

		return null;
	}
	
	public static ReservationStatusType toMicrosEnum(BridgeIds.ReservationStatus from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case RESERVED:
				return ReservationStatusType.RESERVED;
			case PROSPECT:
				return ReservationStatusType.PROSPECT;
			case NOSHOW:
				return ReservationStatusType.NOSHOW;
			case CANCELED:
				return ReservationStatusType.CANCELED;
			case INHOUSE:
				return ReservationStatusType.INHOUSE;
			case CHECKEDOUT:
				return ReservationStatusType.CHECKEDOUT;
			case CHANGED:
				return ReservationStatusType.CHANGED;
			case WAITLISTED:
				return ReservationStatusType.WAITLISTED;
			case PRECHECKEDIN:
				return ReservationStatusType.PRECHECKEDIN;
			case DUEOUT:
				return ReservationStatusType.DUEOUT;
		}

		return null;
	}

	public static BridgeIds.ReservationStatus fromMicrosEnum(ReservationStatusType from) {
		if (from == null) {
			return null;
		}
		
		switch (from) {
			case RESERVED:
				return BridgeIds.ReservationStatus.RESERVED;
			case PROSPECT:
				return BridgeIds.ReservationStatus.PROSPECT;
			case NOSHOW:
				return BridgeIds.ReservationStatus.NOSHOW;
			case CANCELED:
				return BridgeIds.ReservationStatus.CANCELED;
			case INHOUSE:
				return BridgeIds.ReservationStatus.INHOUSE;
			case CHECKEDOUT:
				return BridgeIds.ReservationStatus.CHECKEDOUT;
			case CHANGED:
				return BridgeIds.ReservationStatus.CHANGED;
			case WAITLISTED:
				return BridgeIds.ReservationStatus.WAITLISTED;
			case PRECHECKEDIN:
				return BridgeIds.ReservationStatus.PRECHECKEDIN;
			case DUEOUT:
				return BridgeIds.ReservationStatus.DUEOUT;
		}

		return null;
	}

	public static RateOccurrenceType toMicrosEnum(BridgeIds.RateOccurrence from) {
		if (from == null) {
			return null;
		}

		switch (from) {
			case DAILY:
				return RateOccurrenceType.DAILY;
			case WEEKLY:
				return RateOccurrenceType.WEEKLY;
			case OTHER:
				return RateOccurrenceType.OTHER;
		}

		return null;
	}

	public static BridgeIds.RateOccurrence fromMicrosEnum(RateOccurrenceType from) {
		if (from == null) {
			return null;
		}

		switch (from) {

			case DAILY:
				return BridgeIds.RateOccurrence.DAILY;
			case WEEKLY:
				return BridgeIds.RateOccurrence.WEEKLY;
			case OTHER:
				return BridgeIds.RateOccurrence.OTHER;
		}

		return null;
	}

	public static Boolean parseYNString(String yn) {
		if (Objects.equal(yn, "Y")) {
			return true;
		} else if (Objects.equal(yn, "N")) {
			return false;
		} else {
			return null;
		}
	}

}
