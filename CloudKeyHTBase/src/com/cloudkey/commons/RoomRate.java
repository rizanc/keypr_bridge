package com.cloudkey.commons;

/**
 * Class stores details of room rate.It has information of base Amount,
 * efeectiveDate, expiration Date , occurrence Type , roomTypeID with  dateModified and dateCredted.
 * 
 * @author niveditat
 *
 */
public class RoomRate {

	// Reference Variables.
	private double baseAmount;
	private String effectiveDate;
    private String expirationDate;
	private String occurrenceType;
	private int roomTypeId;

	
	// Getter and Setter.
	public double getBaseAmount() {
		
		return baseAmount;
	}
	
	public void setBaseAmount(double baseAmount) {
		
		this.baseAmount = baseAmount;
	}
	
	public String getEffectiveDate() {
		
		return effectiveDate;
	}
	
	public void setEffectiveDate(String effectiveDate) {
		
		this.effectiveDate = effectiveDate;
	}
	
	public String getExpirationDate() {
		
		return expirationDate;
	}
	
	public void setExpirationDate(String expirationDate) {
		
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
	
	@Override
	public String toString() {
		return "RoomRate [baseAmount=" + baseAmount + ", effectiveDate="
				+ effectiveDate + ", expirationDate=" + expirationDate
				+ ", occurrenceType=" + occurrenceType + ", roomTypeId="
				+ roomTypeId + "]";
	}
	
}	
