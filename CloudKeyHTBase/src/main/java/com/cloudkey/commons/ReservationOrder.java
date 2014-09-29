package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.math.BigDecimal;
import java.util.List;

/**
 * This class stores the information of the order placed by the guest in the hotel.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class ReservationOrder {

	BigDecimal totalAmount;
	List<OrderDetails> orderDetailList;

}