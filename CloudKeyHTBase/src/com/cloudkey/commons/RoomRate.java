package com.cloudkey.commons;

import java.util.Date;
/**
 * Class stores details of room rate.It has information of base Amount,
 * efeectiveDate, expiration Date , occurrence Type , roomTypeID with  dateModified and dateCredted.
 * 
 * @author niveditat
 *
 */
public class RoomRate {

	// Reference Variables.
	private int id ;
	private double baseAmount;
	private Date effectiveDate;
    private Date expirationDate;
	private String occurrenceType;
	private int roomTypeId;
	private Date dateModified;
	private Date dateCreated;
	
	// Getter and Setter.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getOccurrenceType() {
		return occurrenceType;
	}
	public void setOccurrenceType(String occurrenceType) {
		this.occurrenceType = occurrenceType;
	}
	public int getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
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
		return "RoomRate [baseAmount=" + baseAmount + ", effectiveDate="
				+ effectiveDate + ", expirationDate=" + expirationDate
				+ ", occurrenceType=" + occurrenceType + ", roomTypeId="
				+ roomTypeId + ", dateModified=" + dateModified
				+ ", dateCreated=" + dateCreated + "]";
	}
	
}	
