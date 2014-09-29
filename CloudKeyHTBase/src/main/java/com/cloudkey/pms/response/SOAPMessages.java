package com.cloudkey.pms.response;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class SOAPMessages {
	String soapRequest;

	String soapResponse;
}