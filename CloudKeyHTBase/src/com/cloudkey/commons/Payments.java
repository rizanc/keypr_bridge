package com.cloudkey.commons;

/**
 * Class stores the information of payments made by the client.
 * Details include the credit card number and amount to be charged.
 * 
 * @author vinayk2
 *
 */
public class Payments {

	/* Reference variable to store the credit card information. */
	private String creditCard ;
	/* Reference variable to store the chargeable amount. */
	private double amount ;

	/*
	 * Getter and Setter for each data member.
	 */

	public String getCreditCard() {

		return creditCard;
	}

	public void setCreditCard( String creditCard ) {

		this.creditCard = creditCard;
	}

	public double getAmount() {

		return amount;
	}

	public void setAmount( double amount ) {

		this.amount = amount;
	}

	public String toString() {
		
		return "Payments [creditCard=" + creditCard + ", amount=" + amount + "]";
	}

}
