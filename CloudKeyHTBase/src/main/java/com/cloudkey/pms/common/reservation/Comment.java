package com.cloudkey.pms.common.reservation;

import lombok.Value;

import javax.annotation.Nullable;

/**
 * Reservation comment
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class Comment {
	String value;

	@Nullable
	Boolean isGuestViewable;
}
