package com.cloudkey.commons;

import lombok.Value;

/**
 * This class represents the information of specific meeting room. The details
 * include name,capacity,code and charge of the meeting room.
 * 
 * @author vinayk2
 */
@Value
public class MeetingRoom {
	String name;
	String capacity;
	String code;
	String charge;
}