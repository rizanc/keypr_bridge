package com.cloudkey.pms.common;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GeoCode {
	protected String longitude;
	protected String latitude;
	protected String altitude;

	protected GeoCode() { /* For serialization */ }

	public GeoCode(String longitude, String latitude, String altitude) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getAltitude() {
		return altitude;
	}
}
