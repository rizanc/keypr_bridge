package com.cloudkey.commons;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class stores the information of the order placed by the guest in the hotel.
 * @author vinayk2
 *
 */

public class ReservationOrder {

	private BigDecimal totalAmount;
	private List<OrderDetails> orderDetailList;

	public ReservationOrder(BigDecimal totalAmount, List<OrderDetails> orderDetailList) {
		this.totalAmount = totalAmount;
		this.orderDetailList = ImmutableList.copyOf(orderDetailList);
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public List<OrderDetails> getOrderDetailList() {
		return orderDetailList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("totalAmount", totalAmount)
			.add("orderDetailList", orderDetailList)
			.toString();
	}
}