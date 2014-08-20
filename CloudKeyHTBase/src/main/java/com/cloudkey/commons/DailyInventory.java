package com.cloudkey.commons;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by crizan2 on 12/08/2014.
 */
public class DailyInventory {
    private LocalDate inventoryDate;
    private int physicalRooms;
    private int houseOverbook;
    private int outOfOrder;

    private List<RoomTypeInventory> roomTypeInventories;

	public LocalDate getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(LocalDate inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public int getPhysicalRooms() {
        return physicalRooms;
    }

    public void setPhysicalRooms(int physicalRooms) {
        this.physicalRooms = physicalRooms;
    }

    public int getHouseOverbook() {
        return houseOverbook;
    }

    public void setHouseOverbook(int houseOverbook) {
        this.houseOverbook = houseOverbook;
    }

    public int getOutOfOrder() {
        return outOfOrder;
    }

    public void setOutOfOrder(int outOfOrder) {
        this.outOfOrder = outOfOrder;
    }

    public List<RoomTypeInventory> getRoomTypeInventories() {
        return roomTypeInventories;
    }

    public void setRoomTypeInventories(List<RoomTypeInventory> roomTypeInventories) {
        this.roomTypeInventories = roomTypeInventories;
    }
}
