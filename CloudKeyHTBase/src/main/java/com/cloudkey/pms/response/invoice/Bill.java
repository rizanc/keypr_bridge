package com.cloudkey.pms.response.invoice;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.profile.NativeName;
import com.cloudkey.pms.common.profile.StreetAddress;
import lombok.*;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;

import java.util.List;

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
public class Bill {
	StreetAddress address;

	NativeName name;

	String nameId;

	String billNumber;

	List<BillItem> billItems;

	List<BillTax> billTaxes;

	List<CreditCardSurcharge> creditCardSurcharges;

	MonetaryAmount currentBalance;

	Integer folioViewNo;
}
