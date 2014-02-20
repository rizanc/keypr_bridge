package com.cloudkey.pms.request;

import java.util.ArrayList;
import java.util.List;

import com.cloudkey.commons.Payments;

/**
 * Class stores the information to make update payment request of the guest.
 * 
 * @author vinayk2
 * 
 */
public class UpdatePaymentRequest {

	/* variable to store  confirmation number of the reservation. */
	private String confirmationNumber ;
	/* variable to store details of the payments. */
	private List<Payments> payments = new ArrayList<Payments>();

	/*
	 *Getter and Setter for each data member. 
	 */
	public String getConfirmationNumber() {

		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {

		this.confirmationNumber = confirmationNumber;
	}

	public List<Payments> getPayments() {

		return payments;
	}

	public void setPayments(List<Payments> payments) {

		this.payments = payments;
	}

	@Override
	public String toString() {
		
		return "UpdatePaymentRequest [confirmationNumber=" + confirmationNumber
				+ ", payments=" + payments + "]";
	}

}
