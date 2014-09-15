package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.EndPoint;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.core.OGHeaderAuthentication;
import com.cloudkey.pms.micros.og.core.OGHeaderAuthenticationUserCredentials;
import com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.Holder;
import java.util.Date;
import java.util.UUID;

import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class OWSTools {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	@Named("keypr.bridge.micros.hotel.chainCode")
	protected String chainCode;

	@Inject
	@Named("keypr.bridge.micros.hotel.hotelCode")
	protected String hotelCode;

	@Inject
	@Named("keypr.bridge.micros.hotel.roomTypeCode")
	protected String roomTypeCode;

	@Inject
	@Named("keypr.bridge.micros.ows.origin.entityId")
	protected String entityId;

	@Inject
	@Named("keypr.bridge.micros.ows.origin.systemType")
	protected String systemType;

	@Inject
	@Named("keypr.bridge.micros.ows.destination.entityId")
	protected String destEntityId;

	@Inject
	@Named("keypr.bridge.micros.ows.destination.systemType")
	protected String destSystemType;
//
//	@Inject
//	@Named("keypr.bridge.micros.stationId")
//	protected String stationId;

	@Inject(optional = true)
	@Named("keypr.bridge.micros.ows.auth.username")
	protected String authUsername;

	@Inject(optional = true)
	@Named("keypr.bridge.micros.ows.auth.password")
	protected String authPassword;

	/**
	 * Creates a {@link HotelReference} for the hotel specified in configuration.
	 *
	 * @return
	 */
	protected HotelReference getDefaultHotelReference() {
		HotelReference hotelReference = new HotelReference();
		hotelReference.setHotelCode(hotelCode);
		hotelReference.setChainCode(chainCode);
		hotelReference.setValue("");

		return hotelReference;
	}

	protected Holder<OGHeader> createOGHeaderE() {
		OGHeader ogHeader = new OGHeader();

		// Sets Transaction Identifier
		ogHeader.setTransactionID(UUID.randomUUID().toString());

		// creates origin end point of header.
		EndPoint origin = new EndPoint();
		origin.setEntityID(entityId);
		origin.setSystemType(systemType);

		// creates destination end point of header.
		EndPoint destination = new EndPoint();
		destination.setEntityID(destEntityId);
		destination.setSystemType(destSystemType);

		// prepares OGHeader
		ogHeader.setOrigin(origin);
		ogHeader.setDestination(destination);

		// sets time stamp
		ogHeader.setTimeStamp(new DateTime());

		if (authUsername != null && authPassword != null && !authUsername.isEmpty() && !authPassword.isEmpty()) {

			OGHeaderAuthentication auth = new OGHeaderAuthentication();
			ogHeader.setAuthentication(auth);

			OGHeaderAuthenticationUserCredentials cred = new OGHeaderAuthenticationUserCredentials();
			auth.setUserCredentials(cred);

			cred.setUserName(authUsername);
			cred.setUserPassword(authPassword);
		}

		return new Holder<>(ogHeader);
	}

	protected String getErrorMessage(ResultStatus resultStatus) {
		String message = "";

		if (resultStatus instanceof GDSResultStatus && ((GDSResultStatus) resultStatus).getGDSError() != null) {
			message = ((GDSResultStatus) resultStatus).getGDSError().getValue();
		} else if (resultStatus.getText() != null && !resultStatus.getText().isEmpty()) {
			message = resultStatus.getText().iterator().next().getValue();
		}

		return message;
	}

	/**
	 * Creates a {@link ReservationRequestBase} with the given pmsReservationId and the default hotel reference.
	 *
	 * @param pmsReservationId
	 * @return
	 */
	protected ReservationRequestBase createReservationRequest(String pmsReservationId) {
		return new ReservationRequestBase()
			.withHotelReference(getDefaultHotelReference())
			.withReservationID(internalReservationId(pmsReservationId));
	}
}
