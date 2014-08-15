package com.cloudkey.commons;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import org.joda.time.LocalDate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * Class stores the information about the room availability. It stores the room
 * type and the its availability status.
 *
 * @author vinayk2
 *
 */
public class DayRoomAvailability {

    /**
     * Date for which availability is checked
     */
	protected LocalDate date;

    /**
     * List of Room Types that are available
     */
	protected List<RoomTypeAvailability> roomTypeAvailabilities;

	public DayRoomAvailability(LocalDate date, List<RoomTypeAvailability> roomTypeAvailabilities) {
		this.date = date;
		this.roomTypeAvailabilities = roomTypeAvailabilities;
	}

	public LocalDate getDate() {
		return date;
	}

	public List<RoomTypeAvailability> getRoomTypeAvailabilities() {
		return roomTypeAvailabilities;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("date", date)
			.add("roomTypeAvailabilities", roomTypeAvailabilities)
			.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DayRoomAvailability that = (DayRoomAvailability) o;

		if (date != null ? !date.equals(that.date) : that.date != null) return false;
		if (roomTypeAvailabilities != null ? !roomTypeAvailabilities.equals(that.roomTypeAvailabilities) : that.roomTypeAvailabilities != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = date != null ? date.hashCode() : 0;
		result = 31 * result + (roomTypeAvailabilities != null ? roomTypeAvailabilities.hashCode() : 0);
		return result;
	}
}