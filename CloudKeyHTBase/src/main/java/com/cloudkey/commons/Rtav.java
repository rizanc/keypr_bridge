package com.cloudkey.commons;

import lombok.Value;

import java.util.List;

/**
 * Class stores details of reservation update snapshot.
 */
@Value
public class Rtav {

	/* TBD */
	Integer id ;// Everything needs an id
    String hotelCode;
    List<DailyInventory> dailyInventories;

}