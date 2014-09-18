package com.micros.pms.rawprocessors;

import com.micros.pms.processors.BaseOWSProcessor;

/**
 * OWS Processor for calling OPERA services directly, without conversion to/from
 * non-Micros request/response types.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class RawOWSProcessor<MicrosRequest, MicrosResponse>
	extends BaseOWSProcessor<MicrosRequest, MicrosResponse, MicrosRequest, MicrosResponse> {

	@Override
	final protected MicrosRequest toMicrosRequest(MicrosRequest request) {
		return request;
	}

	@Override
	final protected MicrosResponse toPmsResponse(MicrosResponse microsResponse, MicrosRequest request) {
		return microsResponse;
	}
}
