package com.cloudkey.pms.common;

import lombok.Value;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class GeoCode {
	String longitude;
	String latitude;
	String altitude;
}
