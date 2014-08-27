package com.cloudkey.pms.common.payment;

import com.cloudkey.pms.common.profile.StreetAddress;
import com.google.common.base.Objects;

/**
 * Information related to the credit card approval process
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CreditCardApproval {
	protected String cidNumber;

    protected StreetAddress address;

    protected String issueNumber;

    protected String approvalCode;

    protected MonetaryAmount depositAmount;

	protected CreditCardApproval() { /* For serialization */ }

	public CreditCardApproval(String cidNumber, StreetAddress address, String issueNumber, String approvalCode, MonetaryAmount depositAmount) {
		this.cidNumber = cidNumber;
		this.address = address;
		this.issueNumber = issueNumber;
		this.approvalCode = approvalCode;
		this.depositAmount = depositAmount;
	}

	public String getCidNumber() {
		return cidNumber;
	}

	public StreetAddress getAddress() {
		return address;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public MonetaryAmount getDepositAmount() {
		return depositAmount;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("depositAmount", depositAmount)
			.add("approvalCode", approvalCode)
			.add("cidNumber", cidNumber)
			.add("address", address)
			.add("issueNumber", issueNumber)
			.toString();
	}
}
