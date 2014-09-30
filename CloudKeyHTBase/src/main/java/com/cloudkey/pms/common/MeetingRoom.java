package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class represents the information of specific meeting room. The details
 * include name,capacity,code and charge of the meeting room.
 * 
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class MeetingRoom {
	String name;
	String capacity;
	String code;
	String charge;
}