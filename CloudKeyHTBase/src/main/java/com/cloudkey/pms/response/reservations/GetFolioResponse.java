package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.response.PMSResponse;
import com.cloudkey.pms.response.invoice.Bill;
import com.cloudkey.pms.response.rooms.RoomStayCharges;
import lombok.*;
import lombok.experimental.Builder;
import lombok.experimental.FieldDefaults;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * This Class has information of bill requested by the guest. It has details of reservations 
 * as well as charges for the facility, avail by the guest.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@Builder
public class GetFolioResponse extends PMSResponse {
	List<Bill> bills;

	MonetaryAmount totalCharges;
	MonetaryAmount currentBalance;
	RoomStayCharges expectedCharges;
}
