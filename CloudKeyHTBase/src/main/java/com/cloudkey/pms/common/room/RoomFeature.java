package com.cloudkey.pms.common.room;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class RoomFeature {
	private String featureCode;

	private String description;

	public RoomFeature(String featureCode, String description) {
		this.featureCode = featureCode;
		this.description = description;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "RoomFeature{" +
			"featureCode='" + featureCode + '\'' +
			", description='" + description + '\'' +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomFeature that = (RoomFeature) o;

		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (featureCode != null ? !featureCode.equals(that.featureCode) : that.featureCode != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = featureCode != null ? featureCode.hashCode() : 0;
		result = 31 * result + (description != null ? description.hashCode() : 0);
		return result;
	}
}
