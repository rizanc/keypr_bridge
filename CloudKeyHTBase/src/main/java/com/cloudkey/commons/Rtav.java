package com.cloudkey.commons;

import java.util.List;

/**
 * Class stores details of reservation update snapshot.
 */
public class Rtav {

	/* TBD */
	private int id ;// Everything needs an id
    private String hotelCode;
    private List<DailyInventory> dailyInventories;


	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}


    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public List<DailyInventory> getDailyInventories() {
        return dailyInventories;
    }

    public void setDailyInventories(List<DailyInventory> dailyInventories) {
        this.dailyInventories = dailyInventories;
    }
}