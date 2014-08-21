package com.cloudkey.commons;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * This class encapsulates the information of the order placed by the guest.
 * the detail include item code, item description, unit price, quantity and total
 * charge amount.
 *
 * @author vinayk2
 */
public class OrderDetails {

	// reference variables.
	private String itemCode;
	private String itemDescription;
	private BigDecimal unitPrice;
	private Integer quantity;
	private BigDecimal chargeAmount;
	private DateTime dateTime;

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

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public DateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("itemCode", itemCode)
			.add("itemDescription", itemDescription)
			.add("unitPrice", unitPrice)
			.add("quantity", quantity)
			.add("chargeAmount", chargeAmount)
			.add("dateTime", dateTime)
			.toString();
	}
}
