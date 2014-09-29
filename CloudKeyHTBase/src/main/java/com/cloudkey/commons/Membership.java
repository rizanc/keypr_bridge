package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

/**
 * Class stores the information of membership.
 * 
 * @author 
 *
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class Membership {
	String membershipType;
	String membershipNumber;
	String membershipLevel;
	String operaId;
	String externalId;
	String pointsLabel;
	String membershipId;
	String memberName;
    Double currentPoints;
    LocalDate effectiveDate;
    LocalDate expirationDate;
}
