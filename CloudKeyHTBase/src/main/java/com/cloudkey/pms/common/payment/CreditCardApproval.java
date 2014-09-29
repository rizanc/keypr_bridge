package com.cloudkey.pms.common.payment;

import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Information related to the credit card approval process
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class CreditCardApproval {
	String cidNumber;

    StreetAddress address;

    String issueNumber;

    String approvalCode;

    MonetaryAmount depositAmount;
}
