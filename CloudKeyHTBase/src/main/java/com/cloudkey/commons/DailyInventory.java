package com.cloudkey.commons;

import lombok.Value;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by crizan2 on 12/08/2014.
 */
@Value
public class DailyInventory {
    LocalDate inventoryDate;
    Integer physicalRooms;
    Integer houseOverbook;
    Integer outOfOrder;

    List<RoomTypeInventory> roomTypeInventories;
}
