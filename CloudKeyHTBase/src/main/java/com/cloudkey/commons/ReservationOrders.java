package com.cloudkey.commons;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

import java.util.List;

/**
 * This class stores the information of the order placed by the guest in the hotel.
 * @author vinayk2
 *
 */

public class ReservationOrders {

	// reference variables.
	private double totalAmount;
	private DateTime orderDateTime;
	private List <OrderDetails> orderDetailList;

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public DateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(DateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public List<OrderDetails> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetails> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("totalAmount", totalAmount)
			.add("orderDateTime", orderDateTime)
			.add("orderDetailList", orderDetailList)
			.toString();
	}
}