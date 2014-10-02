package com.cloudkey.pms.common;

import com.keypr.bridge.ids.BridgeIds;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Restriction {
	BridgeIds.RestrictionType restrictionType;

	Integer numberOfDays;

	String roomType;

	String rateCode;
}
