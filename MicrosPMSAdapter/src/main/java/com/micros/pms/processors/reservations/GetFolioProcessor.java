package com.micros.pms.processors.reservations;

import com.cloudkey.commons.OrderDetails;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.BillHeader;
import com.cloudkey.pms.micros.og.reservation.BillItem;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponse;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.GetFolioRequest;
import com.cloudkey.pms.response.reservations.GetFolioResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;

import javax.xml.ws.Holder;
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
		GetFolioResponse objFolioResponse = new GetFolioResponse();

		/* Populate response into Reservation instance */
		String firstName;
		String lastName;
		String description;

		double unitPrice;
		double totalBillAmount;

		/* Populate response into Reservation instance */
		Reservation objReservation = new Reservation();

		// set confirmation number.
		for (BillHeader objBillHeader : microsResponse.getInvoices()) { // Traversing Bill Header

			log.debug("getFolioResponseObject: Enter to traverse Bill Header ");

			objReservation.setAddress(HotelInformationConverter.convertAddress(objBillHeader.getAddress()));

			firstName = objBillHeader.getName().getFirstName();
			lastName = objBillHeader.getName().getLastName();

			objReservation.setFirstName(firstName);
			objReservation.setLastName(lastName);

			List<ReservationOrders> objReservationOrders = objFolioResponse.getReservationOrderList();

			if (objReservationOrders == null) {
				objReservationOrders = new ArrayList<>();
			}

			ReservationOrders objOrders = new ReservationOrders();

			List<OrderDetails> objDetails = objOrders.getOrderDetailList();

			if (objDetails == null) {
				objDetails = new ArrayList<>();
			}

			List<BillItem> arrBillItem = objBillHeader.getBillItems();

			for (BillItem billItem : arrBillItem) {
				log.debug("getFolioResponseObject: Enter to traverse Bill Items ");
				OrderDetails objOrderDetails = new OrderDetails();

				unitPrice = billItem.getAmount().getValue();
				description = billItem.getDescription();

				objOrderDetails.setUnitPrice(unitPrice);
				objOrderDetails.setItemDescription(description);
				objDetails.add(objOrderDetails);

				log.debug("getFolioResponseObject: Exit to traverse Bill Items ");

			} // End bill items traversing loop.

			// add order details.
			objOrders.setOrderDetailList(objDetails);
			if (!objBillHeader.getCreditCardSurcharges().isEmpty()) {
				totalBillAmount = objBillHeader.getCreditCardSurcharges().get(0).getTotalBillAmount().getValue();
				objOrders.setTotalAmount(totalBillAmount);
				objReservationOrders.add(objOrders);
				objFolioResponse.setReservationOrderList(objReservationOrders);
			}

			//TODO: OPERA Does not send the confirmation number in the response.
			//************************************
			// set confirmation number.
/*
            ArrayOfUniqueID objArrayOfUniqueID = objBillHeader.getProfileIDs();
            UniqueID arrUniqueID[] = objArrayOfUniqueID.getUniqueID();
            for (UniqueID uniqueID : arrUniqueID) {

                String confirmationNumber = uniqueID.getString();
                objReservation.setConfirmationNumber(confirmationNumber);
                objReservation.setPmsReservationId(confirmationNumber);
            }
*/
			log.debug("getFolioResponseObject: Exit to traverse Bill Header ");

		} // End Bill Header loop.

		objFolioResponse.setReservation(objReservation);

		log.debug("getFolioResponseObject: Exit  getFolioResponseObject method ");

		return objFolioResponse;
	}
}
