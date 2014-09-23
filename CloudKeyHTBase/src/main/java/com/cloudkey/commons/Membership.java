package com.cloudkey.commons;

import lombok.Value;
import org.joda.time.LocalDate;

/**
 * Class stores the information of membership.
 * 
 * @author 
 *
 */
@Value
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
