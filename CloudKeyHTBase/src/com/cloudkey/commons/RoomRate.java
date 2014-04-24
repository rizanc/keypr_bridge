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
	private String ratePlanCode;
	private double baseAmount;
	private String effectiveDate;
	private String expirationDate;

	// Getter and Setter
	public String getPlanCode() {
		return ratePlanCode;
	}

	public void setPlanCode(String planCode) {
		this.ratePlanCode = planCode;
	}

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
	@Override
	public String toString() {
		return "RoomRate [planCode=" + ratePlanCode + ", baseAmount=" + baseAmount
				+ ", effectiveDate=" + effectiveDate + ", expirationDate="
				+ expirationDate + "]";
	}

}	
