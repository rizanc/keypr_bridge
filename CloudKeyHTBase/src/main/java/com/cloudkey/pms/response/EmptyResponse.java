package com.cloudkey.pms.response;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * A successful response which has no body
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@ToString
@EqualsAndHashCode(callSuper = false)
public class EmptyResponse extends PMSResponse {
}
