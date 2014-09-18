package com.cloudkey.pms.common.room;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.keypr.bridge.ids.BridgeIds;

import java.util.List;

public class RoomSetupInfoBuilder {
	private String roomNumber;
	private List<RoomFeature> roomFeatures;
	private String roomClassCode;
	private String floor;
	private String roomTypeCode;
	private String description;
	private String shortDescription;
	private String phoneNumber;
	private BridgeIds.SuiteType suiteType;
	private Long maxOccupancy;
	private MonetaryAmount rackRate;
	private Boolean isSmokingAllowed;

	public RoomSetupInfoBuilder setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
		return this;
	}

	public RoomSetupInfoBuilder setRoomFeatures(List<RoomFeature> roomFeatures) {
		this.roomFeatures = roomFeatures;
		return this;
	}

	public RoomSetupInfoBuilder setRoomClassCode(String roomClassCode) {
		this.roomClassCode = roomClassCode;
		return this;
	}

	public RoomSetupInfoBuilder setFloor(String floor) {
		this.floor = floor;
		return this;
	}

	public RoomSetupInfoBuilder setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
		return this;
	}

	public RoomSetupInfoBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public RoomSetupInfoBuilder setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
		return this;
	}

	public RoomSetupInfoBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public RoomSetupInfoBuilder setSuiteType(BridgeIds.SuiteType suiteType) {
		this.suiteType = suiteType;
		return this;
	}

	public RoomSetupInfoBuilder setMaxOccupancy(Long maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
		return this;
	}

	public RoomSetupInfoBuilder setRackRate(MonetaryAmount rackRate) {
		this.rackRate = rackRate;
		return this;
	}

	public RoomSetupInfoBuilder setIsSmokingAllowed(Boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
		return this;
	}

	public RoomSetupInfo createRoomSetupInfo() {
		return new RoomSetupInfo(roomNumber, roomFeatures, roomClassCode, floor, roomTypeCode, description, shortDescription, phoneNumber, suiteType, maxOccupancy, rackRate, isSmokingAllowed);
	}
}