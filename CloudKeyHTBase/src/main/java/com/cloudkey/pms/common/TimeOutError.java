package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class represents the time out error sent by the keypr bridge 
 * when property management system is down.
 * 
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class TimeOutError {
	
	String code = "";
	String message = "";
	
}
