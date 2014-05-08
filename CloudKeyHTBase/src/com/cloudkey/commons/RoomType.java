package com.cloudkey.commons;

import java.util.Date;
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
