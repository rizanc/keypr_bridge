package com.micros.pms.processors.reservations;

import ch.epfl.lamp.fjbg.JOpcode;
import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrder;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.BillHeader;
import com.cloudkey.pms.micros.og.reservation.BillItem;
import com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponse;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import org.joda.time.DateTime;

import javax.xml.ws.Holder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GetFolioProcessor extends OWSProcessor<
	GetFolioRequest,
	GetFolioResponse,
	InvoiceRequest,
	InvoiceResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

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
	protected GetFolioResponse toPmsResponse(InvoiceResponse microsResponse) {

		/* Populate response into Reservation instance */
		BigDecimal totalBillAmount = new BigDecimal("0.00");

		/* Populate response into Reservation instance */
		Reservation reservation = new Reservation();

		List<ReservationOrder> reservationOrderList = new ArrayList<>();

		// set confirmation number.
		for (BillHeader billHeader : microsResponse.getInvoices()) { // Traversing Bill Header

			log.debug("getFolioResponseObject: Enter to traverse Bill Header ");

			reservation.setAddress(HotelInformationConverter.convertAddress(billHeader.getAddress()));

			if (billHeader.getName() != null) {
				reservation.setFirstName(billHeader.getName().getFirstName());
				reservation.setLastName(billHeader.getName().getLastName());
			}

			List<OrderDetails> orderDetailsList = new ArrayList<>();

			for (BillItem billItem : billHeader.getBillItems()) {
				log.debug("getFolioResponseObject: Enter to traverse Bill Items ");
				OrderDetails objOrderDetails = new OrderDetails();

				objOrderDetails.setUnitPrice(billItem.getAmount().getValue());
				objOrderDetails.setItemDescription(billItem.getDescription());
				objOrderDetails.setDateTime(billItem.getDate().toDateTime(billItem.getTime()));
				totalBillAmount = totalBillAmount.add(new BigDecimal(billItem.getAmount().getValue()));

				orderDetailsList.add(objOrderDetails);

				log.debug("getFolioResponseObject: Exit to traverse Bill Items ");

			} // End bill items traversing loop.

			reservationOrderList.add(new ReservationOrder(totalBillAmount, orderDetailsList));

			log.debug("getFolioResponseObject: Exit to traverse Bill Header ");

		} // End Bill Header loop.

		log.debug("getFolioResponseObject: Exit  getFolioResponseObject method ");

		return new GetFolioResponse(reservation, reservationOrderList);
	}
}
