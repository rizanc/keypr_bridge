package com.cloudkey.commons;

import com.google.common.collect.ImmutableList;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;

/**
 * This class stores the information of the order placed by the guest in the hotel.
 *
 * @author vinayk2
 */
@Value
public class ReservationOrder {

	BigDecimal totalAmount;
	List<OrderDetails> orderDetailList;

	public ReservationOrder(BigDecimal totalAmount, List<OrderDetails> orderDetailList) {
		this.totalAmount = totalAmount;
		this.orderDetailList = ImmutableList.copyOf(orderDetailList);
	}

}