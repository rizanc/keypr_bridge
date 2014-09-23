package com.cloudkey.pms.response.hotels;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.Map;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class HotelItemCodesResponse extends PMSResponse {
	Map<String, String> itemsByCode;

	Map<String, String> accountsByCode;
}
