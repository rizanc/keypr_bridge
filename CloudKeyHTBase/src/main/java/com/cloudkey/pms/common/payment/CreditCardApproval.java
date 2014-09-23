package com.cloudkey.pms.common.payment;

import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.Value;

/**
 * Information related to the credit card approval process
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class CreditCardApproval {
	String cidNumber;

    StreetAddress address;

    String issueNumber;

    String approvalCode;

    MonetaryAmount depositAmount;
}
