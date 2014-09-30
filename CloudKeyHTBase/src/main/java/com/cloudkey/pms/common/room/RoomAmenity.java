package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomAmenity {
	String code;

	String description;

	BridgeIds.AmenityAvailability availability;
}
