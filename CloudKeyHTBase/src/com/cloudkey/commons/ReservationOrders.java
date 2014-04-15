package com.cloudkey.commons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class stores the information of the order placed by the guest in the hotel.
 * @author vinayk2
 *
 */

public class ReservationOrders {

	// reference variables.
	private double totalAmount;
	private Date orderDate;
	private List <OrderDetails> orderDetailList;

	//setter getters.
	public Date getOrderDate() {

		return orderDate;
	}

	public double getTotalAmount() {

		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {

		this.totalAmount = totalAmount;
	}

	public void setOrderDate(Date orderDate) {

		this.orderDate = orderDate;
	}

	public List<OrderDetails> getOrderDetailList() {

		if(orderDetailList == null){

			orderDetailList = new ArrayList<OrderDetails>();
		}
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetails> orderDetailList) {

		this.orderDetailList = orderDetailList;
	}

	@Override
	public String toString() {
		return "ReservationOrders [totalAmount=" + totalAmount + ", orderDate="
				+ orderDate + ", orderDetailList=" + orderDetailList + "]";
	}

}