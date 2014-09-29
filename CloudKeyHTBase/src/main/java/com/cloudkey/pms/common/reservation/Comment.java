package com.cloudkey.pms.common.reservation;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.annotation.Nullable;

/**
 * Reservation comment
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Comment {
	String value;

	@Nullable
	Boolean isGuestViewable;
}
