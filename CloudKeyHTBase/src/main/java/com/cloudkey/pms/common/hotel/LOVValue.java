package com.cloudkey.pms.common.hotel;

/**
 * Created by crizan2 on 04/09/2014.
 */
public class LOVValue {
    private String description;

    private String value;

	public LOVValue(String description, String value) {
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
        return description;
    }

    public String getValue() {
        return value;
    }

	@Override
	public String toString() {
		return "LOVValue{" +
			"description='" + description + '\'' +
			", value='" + value + '\'' +
			'}';
	}
}
