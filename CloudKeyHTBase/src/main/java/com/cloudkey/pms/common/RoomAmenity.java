package com.cloudkey.pms.common;

import com.keypr.bridge.ids.BridgeIds;
import lombok.Value;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class RoomAmenity {
	String code;

	String description;

	BridgeIds.AmenityAvailability availability;
}
