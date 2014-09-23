package com.cloudkey.commons;

import lombok.Value;

/**
 * This class represents the time out error sent by the keypr bridge 
 * when property management system is down.
 * 
 * @author vinayk2
 *
 */
@Value
public class TimeOutError {
	
	String code = "";
	String message = "";
	
}
