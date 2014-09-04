package com.cloudkey.pms.response.hotels;

import com.cloudkey.pms.response.PMSResponse;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class HotelItemCodesResponse extends PMSResponse {
	private Map<String, String> itemsByCode;

	private Map<String, String> accountsByCode;

	public HotelItemCodesResponse(Map<String, String> itemsByCode, Map<String, String> accountsByCode) {
		this.itemsByCode = ImmutableMap.copyOf(itemsByCode);
		this.accountsByCode = ImmutableMap.copyOf(accountsByCode);
	}

	public Map<String, String> getItemsByCode() {
		return itemsByCode;
	}

	public Map<String, String> getAccountsByCode() {
		return accountsByCode;
	}

	@Override
	public String toString() {
		return "HotelItemCodesResponse{" +
			"itemsByCode=" + itemsByCode +
			", accountsByCode=" + accountsByCode +
			'}';
	}
}
