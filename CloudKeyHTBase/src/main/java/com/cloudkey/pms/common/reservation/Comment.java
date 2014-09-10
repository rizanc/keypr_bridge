package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * Reservation comment
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class Comment {
	private String value;

	@Nullable
	private Boolean isGuestViewable;

	public Comment(String value, @Nullable Boolean isGuestViewable) {
		this.value = value;
		this.isGuestViewable = isGuestViewable;
	}

	public String getValue() {
		return value;
	}

	@Nullable
	public Boolean getIsGuestViewable() {
		return isGuestViewable;
	}

	@Override
	public String toString() {
		return "Comment{" +
			"value='" + value + '\'' +
			", isGuestViewable=" + isGuestViewable +
			'}';
	}
}
