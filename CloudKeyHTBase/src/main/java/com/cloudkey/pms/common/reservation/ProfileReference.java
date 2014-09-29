package com.cloudkey.pms.common.reservation;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.annotation.Nullable;

/**
 * A reference to a company, contact person, reservation group, etc.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class ProfileReference {
	/**
	 * The identifier of the profile in the PMS system
	 */
    String profileId;

	/**
	 * An additional identifier that is sometimes used in conjunction with the profile id.
	 *
	 * For examples, companies have an identifier which references their company profile (profileId,
	 * but they may also have another ID which somehow identifies the company.
	 */
	@Nullable
	String otherId;

	@Nullable
    String name;
}
