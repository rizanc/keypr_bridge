package com.cloudkey.commons;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by crizan2 on 12/08/2014.
 */
public class DailyInventory {
    private LocalDate inventoryDate;
    private Integer physicalRooms;
    private Integer houseOverbook;
    private Integer outOfOrder;

    private List<RoomTypeInventory> roomTypeInventories;

	public LocalDate getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(LocalDate inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public Integer getPhysicalRooms() {
		return physicalRooms;
	}

	public void setPhysicalRooms(Integer physicalRooms) {
		this.physicalRooms = physicalRooms;
	}

	public Integer getHouseOverbook() {
		return houseOverbook;
	}

	public void setHouseOverbook(Integer houseOverbook) {
		this.houseOverbook = houseOverbook;
	}

	public Integer getOutOfOrder() {
		return outOfOrder;
	}

	public void setOutOfOrder(Integer outOfOrder) {
		this.outOfOrder = outOfOrder;
	}

	public List<RoomTypeInventory> getRoomTypeInventories() {
		return roomTypeInventories;
	}

	public void setRoomTypeInventories(List<RoomTypeInventory> roomTypeInventories) {
		this.roomTypeInventories = roomTypeInventories;
	}
}
