package com.cloudkey.commons;

/**
 * Class stores all chargeable information for the guest. It has details of
 * item, order date and the amount to be charged from the guest.
 * 
 * @author vinayk2
 * 
 */
public class Charges {

	/* Variable to store date of order placed by guest. */
	private String orderDate ;
	/* Variable to store the description of item. */
	private String itemDescription ;
	/* Variable to store the chargeable amount for each item. */
	private double chargeAmount ;

	/*
	 * Getter and Setter for each data member.
	 */

	public String getOrderDate() {

		return orderDate;
	}

	public double getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount( double chargeAmount ) {
		this.chargeAmount = chargeAmount;
	}

	public void setOrderDate( String orderDate ) {

		this.orderDate = orderDate;
	}

	public String getItemDescription() {

		return itemDescription;
	}

	public void setItemDescription( String itemDescription ) {

		this.itemDescription = itemDescription;
	}


	public String toString() {
		
		return "Charges [orderDate=" + orderDate + ", itemDescription=" + itemDescription + ", chargeAmount=" + chargeAmount + "]";
	}

}
