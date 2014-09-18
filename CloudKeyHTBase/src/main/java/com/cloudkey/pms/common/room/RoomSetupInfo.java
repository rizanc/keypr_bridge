package com.cloudkey.pms.common.room;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class RoomSetupInfo {
	@NotNull
	private String roomNumber;

	@NotNull
	private String roomTypeCode;

	// From FetchRoomStatus
	private List<RoomFeature> roomFeatures;

	private String roomClassCode;

	private String floor;

	// From FetchRoomSetup
	private String description;

	private String shortDescription;

	private String phoneNumber;

	private BridgeIds.SuiteType suiteType;

	private Long maxOccupancy;

	/**
	 * The full price rate for the room.
	 */
	private MonetaryAmount rackRate;

	private Boolean isSmokingAllowed;

	public RoomSetupInfo(String roomNumber, List<RoomFeature> roomFeatures, String roomClassCode, String floor, String roomTypeCode, String description, String shortDescription, String phoneNumber, BridgeIds.SuiteType suiteType, Long maxOccupancy, MonetaryAmount rackRate, Boolean isSmokingAllowed) {
		this.roomNumber = roomNumber;
		this.roomFeatures = roomFeatures;
		this.roomClassCode = roomClassCode;
		this.floor = floor;
		this.roomTypeCode = roomTypeCode;
		this.description = description;
		this.shortDescription = shortDescription;
		this.phoneNumber = phoneNumber;
		this.suiteType = suiteType;
		this.maxOccupancy = maxOccupancy;
		this.rackRate = rackRate;
		this.isSmokingAllowed = isSmokingAllowed;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public List<RoomFeature> getRoomFeatures() {
		return roomFeatures;
	}

	public String getRoomClassCode() {
		return roomClassCode;
	}

	public String getFloor() {
		return floor;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public String getDescription() {
		return description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public BridgeIds.SuiteType getSuiteType() {
		return suiteType;
	}

	public Long getMaxOccupancy() {
		return maxOccupancy;
	}

	public MonetaryAmount getRackRate() {
		return rackRate;
	}

	public Boolean getIsSmokingAllowed() {
		return isSmokingAllowed;
	}

	@Override
	public String toString() {
		return "RoomSetupInfo{" +
			"roomNumber='" + roomNumber + '\'' +
			", roomTypeCode='" + roomTypeCode + '\'' +
			", roomFeatures=" + roomFeatures +
			", roomClassCode='" + roomClassCode + '\'' +
			", floor='" + floor + '\'' +
			", description='" + description + '\'' +
			", shortDescription='" + shortDescription + '\'' +
			", phoneNumber='" + phoneNumber + '\'' +
			", suiteType=" + suiteType +
			", maxOccupancy=" + maxOccupancy +
			", rackRate=" + rackRate +
			", isSmokingAllowed=" + isSmokingAllowed +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomSetupInfo that = (RoomSetupInfo) o;

		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (floor != null ? !floor.equals(that.floor) : that.floor != null) return false;
		if (isSmokingAllowed != null ? !isSmokingAllowed.equals(that.isSmokingAllowed) : that.isSmokingAllowed != null)
			return false;
		if (maxOccupancy != null ? !maxOccupancy.equals(that.maxOccupancy) : that.maxOccupancy != null) return false;
		if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
		if (rackRate != null ? !rackRate.equals(that.rackRate) : that.rackRate != null) return false;
		if (roomClassCode != null ? !roomClassCode.equals(that.roomClassCode) : that.roomClassCode != null)
			return false;
		if (roomFeatures != null ? !roomFeatures.equals(that.roomFeatures) : that.roomFeatures != null) return false;
		if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
		if (roomTypeCode != null ? !roomTypeCode.equals(that.roomTypeCode) : that.roomTypeCode != null) return false;
		if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
			return false;
		if (suiteType != that.suiteType) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = roomNumber != null ? roomNumber.hashCode() : 0;
		result = 31 * result + (roomTypeCode != null ? roomTypeCode.hashCode() : 0);
		result = 31 * result + (roomFeatures != null ? roomFeatures.hashCode() : 0);
		result = 31 * result + (roomClassCode != null ? roomClassCode.hashCode() : 0);
		result = 31 * result + (floor != null ? floor.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
		result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
		result = 31 * result + (suiteType != null ? suiteType.hashCode() : 0);
		result = 31 * result + (maxOccupancy != null ? maxOccupancy.hashCode() : 0);
		result = 31 * result + (rackRate != null ? rackRate.hashCode() : 0);
		result = 31 * result + (isSmokingAllowed != null ? isSmokingAllowed.hashCode() : 0);
		return result;
	}
}
