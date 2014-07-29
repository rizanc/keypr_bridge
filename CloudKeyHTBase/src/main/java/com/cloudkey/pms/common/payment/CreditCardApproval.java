package com.cloudkey.pms.common.payment;

import com.cloudkey.pms.common.StreetAddress;

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
}
