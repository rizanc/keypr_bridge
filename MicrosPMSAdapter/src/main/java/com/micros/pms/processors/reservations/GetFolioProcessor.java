package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponse;
import com.cloudkey.pms.micros.ows.BillConverter;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class GetFolioProcessor extends OWSProcessor<
	GetFolioRequest,
	GetFolioResponse,
	InvoiceRequest,
	InvoiceResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Inject
	protected BillConverter billConverter;

	@Override
	protected ResultStatus getResultStatus(InvoiceResponse invoiceResponse) {
		return invoiceResponse.getResult();
	}

	@Override
	protected InvoiceResponse callService(InvoiceRequest invoiceRequest, Holder<OGHeader> header) {
		return service.invoice(invoiceRequest, header);
	}

	@Override
	protected InvoiceRequest toMicrosRequest(GetFolioRequest request) {
		return new InvoiceRequest()
			.withReservationRequest(createReservationRequest(request.getPmsReservationId()));
	}

	@Override
	protected GetFolioResponse toPmsResponse(InvoiceResponse microsResponse, GetFolioRequest request) {
		return new GetFolioResponse(billConverter.convertBillHeaders(microsResponse.getInvoices()));
	}
}
