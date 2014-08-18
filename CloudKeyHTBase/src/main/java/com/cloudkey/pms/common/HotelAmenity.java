package com.cloudkey.pms.common;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class HotelAmenity {
	private String code;
	private String type;
	private String description;

	protected HotelAmenity() { /* For serialization */ }

	public HotelAmenity(String code, String type, String description) {
		this.code = code;
		this.type = type;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}
}
