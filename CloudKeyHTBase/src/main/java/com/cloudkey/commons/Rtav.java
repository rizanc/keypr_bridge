package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * Class stores details of reservation update snapshot.
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Rtav {

	/* TBD */
	Integer id ;// Everything needs an id
    String hotelCode;
    List<DailyInventory> dailyInventories;

}