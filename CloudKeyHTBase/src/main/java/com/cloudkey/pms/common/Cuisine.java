package com.cloudkey.pms.common;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class Cuisine {
	protected String code;
	protected String description;

	protected Cuisine() { /* For serialization */ }

	public Cuisine(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
