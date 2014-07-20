package com.cloudkey.commons;

/**
 * This class encapsulates the information of the order placed by the guest.
 * the detail include item code, item description, unit price, quantity and total
 * charge amount.
 * 
 * @author vinayk2
 *
 */
public class OrderDetails {
	
	//reference variables.
	private String itemCode;
	private String itemDescription ;
	private double unitPrice;
	private int quantity;
	private double chargeAmount;
	
	//setter and getters.

	public String getItemCode() {
		
		return itemCode;
	}
	
	public void setItemCode(String itemCode) {
		
		this.itemCode = itemCode;
	}
	
	public String getItemDescription() {
		
		return itemDescription;
	}
	
	public void setItemDescription(String itemDescription) {
		
		this.itemDescription = itemDescription;
	}
	
	public double getUnitPrice() {
		
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		
		this.unitPrice = unitPrice;
	}
	
	public int getQuantity() {
		
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}
	
	public double getChargeAmount() {
		
		return chargeAmount;
	}
	
	public void setChargeAmount(double chargeAmount) {
		this.chargeAmount = chargeAmount;
	}
	
	@Override
	public String toString() {
		
		return "OrderDetails [itemCode=" + itemCode + ", itemDescription="
				+ itemDescription + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + ", chargeAmount=" + chargeAmount + "]";
	}

}
