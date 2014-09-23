package com.cloudkey.pms.common.room;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Builder;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC) // Builder makes the constructor private by default
@Value
public class RoomSetupInfo {
	@NotNull
	String roomNumber;

	// From FetchRoomStatus
	List<RoomFeature> roomFeatures;

	String roomClassCode;

	String floor;

	@NotNull
	String roomTypeCode;

	// From FetchRoomSetup
	String description;

	String shortDescription;

	String phoneNumber;

	BridgeIds.SuiteType suiteType;

	Long maxOccupancy;

	/**
	 * The full price rate for the room.
	 */
	MonetaryAmount rackRate;

	Boolean isSmokingAllowed;

	String houseKeepingSectionCode;

	String rateCode;
}
