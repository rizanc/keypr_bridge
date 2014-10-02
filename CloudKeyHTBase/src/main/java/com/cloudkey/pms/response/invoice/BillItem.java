package com.cloudkey.pms.response.invoice;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.*;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
@Builder
public class BillItem {
	String account;

	MonetaryAmount amount;

	String vatCode;

	String revenueGroup;

	LocalDate date;

	LocalTime time;

	String description;

	String transactionCode;

	String transactionNo;

	String supplement;

	String reference;

	String originalRoom;
}
