package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by crizan2 on 12/08/2014.
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class DailyInventory {
    LocalDate inventoryDate;
    Integer physicalRooms;
    Integer houseOverbook;
    Integer outOfOrder;

    List<RoomTypeInventory> roomTypeInventories;
}
