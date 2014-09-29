package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * Class stores details of room rate.It has information of base Amount,
 * efeectiveDate, expiration Date , occurrence Type , roomTypeID with  dateModified and dateCredted.
 *
 * @author niveditat
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomRate {

	// Reference Variables.
	String planCode;
	BigDecimal baseAmount;
	DateTime effectiveDate;
	DateTime expirationDate;

}
