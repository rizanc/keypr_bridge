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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Comment comment = (Comment) o;

		if (isGuestViewable != null ? !isGuestViewable.equals(comment.isGuestViewable) : comment.isGuestViewable != null)
			return false;
		if (value != null ? !value.equals(comment.value) : comment.value != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = value != null ? value.hashCode() : 0;
		result = 31 * result + (isGuestViewable != null ? isGuestViewable.hashCode() : 0);
		return result;
	}
}
