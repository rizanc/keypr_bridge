package com.cloudkey.commons;

/**
 * Class stores room type information.It has information of room code,
 * with all the features and descriptions.
 * 
 * @author niveditat
 *
 */
public class RoomType {

	//Reference Variables.
	private String code;
	private String description;
	private String features;

	public RoomType() {
	}

	public RoomType(String code, String description, String features) {
		this.code = code;
		this.description = description;
		this.features = features;
	}

	// Getter and Setter.
	public String getCode() {
		
		return code;
	}
	
	public void setCode(String code) {
		
		this.code = code;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	public String getFeatures() {
		
		return features;
	}
	
	public void setFeatures(String features) {
		
		this.features = features;
	}
	
	@Override
	public String toString() {
		return "RoomType [code=" + code + ", description=" + description
				+ ", features=" + features + "]";
	}
}
