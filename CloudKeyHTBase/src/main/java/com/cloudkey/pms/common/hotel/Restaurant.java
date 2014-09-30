package com.cloudkey.pms.common.hotel;

import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * Class stores Restaurants information.It has information of restaurant name,
 * with cuisine  and descriptions.
 * 
 * @author 
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Restaurant {
	/* reference variable to store restaurants details */
	String name;
	String description;
	List<Cuisine> cuisines;
	List<StreetAddress> contacts;
	Boolean offersBreakfast;
	Boolean offersBrunch;
	Boolean offersLunch;
	Boolean offersDinner;
	Integer maxSeatingCapacity;
	Integer maxSingleParty;
//	Vector relativePosition;

}
