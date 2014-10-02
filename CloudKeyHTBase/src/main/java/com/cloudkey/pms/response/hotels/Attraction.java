package com.cloudkey.pms.response.hotels;

import com.cloudkey.pms.common.GeoCode;
import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class Attraction { 
	String attractionCode;

	String attractionType;

	String name;

	String directions;

	Double distance;

	String distanceType;

	String drivingTime;

	StreetAddress streetAddress;

	String hoursOfOperation;

	GeoCode position;

	String priceRange;

	List<String> otherInfo;
}
