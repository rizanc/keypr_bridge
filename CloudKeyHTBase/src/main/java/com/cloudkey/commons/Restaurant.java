package com.cloudkey.commons;

import com.cloudkey.pms.common.Cuisine;
import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.Value;

import java.util.List;

/**
 * Class stores Restaurants information.It has information of restaurant name,
 * with cuisine  and descriptions.
 * 
 * @author 
 *
 */
@Value
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
