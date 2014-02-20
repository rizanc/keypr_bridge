package com.cloudkey.commons;

/**
 * This class stores the day and rate information of per stay.
 * 
 * @author vinayk2
 * 
 */
public class StayRate {

	/* variable to store name of the day. */
	private String day ;
	/* variable to store the chargeable amount for the stay. */
	private double rate ;

	/*
	 * Getter and Setter for each data member.
	 */

	public String getDay() {

		return day;
	}

	public void setDay( String day ) {

		this.day = day;
	}

	public double getRate() {

		return rate;
	}

	public void setRate( double rate ) {

		this.rate = rate;
	}
	
	public String toString() {
		
		return "StayRate [day=" + day + ", rate=" + rate + "]";
	}
	
}
