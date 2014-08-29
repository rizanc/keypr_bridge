package com.micros.pms.util;

import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.guestservices.GuestServiceStatusType;
import com.cloudkey.pms.micros.og.guestservices.RepairStatusType;
import com.cloudkey.pms.micros.og.guestservices.RoomStatusType;
import com.cloudkey.pms.micros.og.guestservices.TurnDownStatusType;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
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

	public BridgeIds.GuestServiceStatus fromMicrosEnum(GuestServiceStatusType from) {
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

	public BridgeIds.RoomStatus fromMicrosEnum(RoomStatusType from) {
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

	public BridgeIds.TurnDownStatus fromMicrosEnum(TurnDownStatusType from) {
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

	public BridgeIds.RepairStatus fromMicrosEnum(RepairStatusType from) {
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
}
