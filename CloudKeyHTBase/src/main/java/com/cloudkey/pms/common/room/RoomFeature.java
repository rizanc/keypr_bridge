package com.cloudkey.pms.common.room;

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
public class RoomFeature {
	String featureCode;

	String description;
}
