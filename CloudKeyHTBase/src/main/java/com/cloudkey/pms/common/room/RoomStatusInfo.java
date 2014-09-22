package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds;
import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class RoomStatusInfo {
	@NotNull
	private String roomNumber;

	@NotNull
	private BridgeIds.RoomStatus roomStatus;

	private Boolean isOccupied;

	private BridgeIds.GuestServiceStatus guestServiceStatus;

	// TODO: The value returned for this from Micros is not affected when we change turn down status.
	// 		 Don't include this field until we know what it means.
//	private Boolean isTurnDownSomething;

	private String roomTypeCode;

	private LocalDate nextReservationDate;

	// TODO: Asked Costin about this flag. What does true / false mean?
	private Boolean houseKeepingInspectionFlag;

	public RoomStatusInfo(String roomNumber, BridgeIds.RoomStatus roomStatus, Boolean isOccupied, BridgeIds.GuestServiceStatus guestServiceStatus, String roomTypeCode, LocalDate nextReservationDate, Boolean houseKeepingInspectionFlag) {
		this.roomNumber = roomNumber;
		this.roomStatus = roomStatus;
		this.isOccupied = isOccupied;
		this.guestServiceStatus = guestServiceStatus;
		this.roomTypeCode = roomTypeCode;
		this.nextReservationDate = nextReservationDate;
		this.houseKeepingInspectionFlag = houseKeepingInspectionFlag;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public BridgeIds.RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public Boolean getIsOccupied() {
		return isOccupied;
	}

	public BridgeIds.GuestServiceStatus getGuestServiceStatus() {
		return guestServiceStatus;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public LocalDate getNextReservationDate() {
		return nextReservationDate;
	}

	public Boolean getHouseKeepingInspectionFlag() {
		return houseKeepingInspectionFlag;
	}

	@Override
	public String toString() {
		return "RoomStatusInfo{" +
			"roomNumber='" + roomNumber + '\'' +
			", roomStatus=" + roomStatus +
			", isOccupied=" + isOccupied +
			", guestServiceStatus=" + guestServiceStatus +
			", roomTypeCode='" + roomTypeCode + '\'' +
			", nextReservationDate=" + nextReservationDate +
			", houseKeepingInspectionFlag=" + houseKeepingInspectionFlag +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomStatusInfo that = (RoomStatusInfo) o;

		if (guestServiceStatus != that.guestServiceStatus) return false;
		if (houseKeepingInspectionFlag != null ? !houseKeepingInspectionFlag.equals(that.houseKeepingInspectionFlag) : that.houseKeepingInspectionFlag != null)
			return false;
		if (isOccupied != null ? !isOccupied.equals(that.isOccupied) : that.isOccupied != null) return false;
		if (nextReservationDate != null ? !nextReservationDate.equals(that.nextReservationDate) : that.nextReservationDate != null)
			return false;
		if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
		if (roomStatus != that.roomStatus) return false;
		if (roomTypeCode != null ? !roomTypeCode.equals(that.roomTypeCode) : that.roomTypeCode != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = roomNumber != null ? roomNumber.hashCode() : 0;
		result = 31 * result + (roomStatus != null ? roomStatus.hashCode() : 0);
		result = 31 * result + (isOccupied != null ? isOccupied.hashCode() : 0);
		result = 31 * result + (guestServiceStatus != null ? guestServiceStatus.hashCode() : 0);
		result = 31 * result + (roomTypeCode != null ? roomTypeCode.hashCode() : 0);
		result = 31 * result + (nextReservationDate != null ? nextReservationDate.hashCode() : 0);
		result = 31 * result + (houseKeepingInspectionFlag != null ? houseKeepingInspectionFlag.hashCode() : 0);
		return result;
	}
}
