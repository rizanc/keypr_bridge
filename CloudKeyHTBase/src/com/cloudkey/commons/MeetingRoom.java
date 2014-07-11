package com.cloudkey.commons;

/**
 * This class represents the information of specific meeting room. The details
 * include name,capacity,code and charge of the meeting room.
 * 
 * @author vinayk2
 *
 */
public class MeetingRoom {
	
	private String name = null;
	private String capacity = null;
	private String code = null;
	private String charge = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	@Override
	public String toString() {
		return "MeetingRoom [name=" + name + ", capacity=" + capacity
				+ ", code=" + code + ", charge=" + charge + "]";
	}
}