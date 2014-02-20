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
	private int id ;
	private String code;
	private String description;
	private String features;
	private Date dateModified;
	private Date dateCreated;
	
	// Getter and Setter.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "RoomType [code=" + code + ", description=" + description
				+ ", features=" + features + ", dateModified=" + dateModified
				+ ", dateCreated=" + dateCreated + "]";
	}
	
}
