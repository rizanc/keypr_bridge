package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.UUID;

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

	@Inject
	@Named("keypr.bridge.micros.stationId")
	protected String stationId;

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

		// If not set, exception raised: org.apache.axis2.databinding.ADBException: string cannot be null!!
		hotelReference.setString("");

		return hotelReference;
	}

	protected OGHeaderE createOGHeaderE() {
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
		ogHeader.setTimeStamp(Calendar.getInstance());

		if (authUsername != null && authPassword != null && !authUsername.isEmpty() && !authPassword.isEmpty()) {

			OGHeaderAuthentication auth = new OGHeaderAuthentication();
			ogHeader.setAuthentication(auth);

			OGHeaderAuthenticationUserCredentials cred = new OGHeaderAuthenticationUserCredentials();
			auth.setUserCredentials(cred);

			cred.setUserName(authUsername);
			cred.setUserPassword(authPassword);
		}

		OGHeaderE ogHeaderE = new OGHeaderE();
		ogHeaderE.setOGHeader(ogHeader);
		return ogHeaderE;
	}

	protected String getErrorMessage(ResultStatus resultStatus) {
		String message = "";

		if (resultStatus instanceof GDSResultStatus && ((GDSResultStatus) resultStatus).isGDSErrorSpecified()) {
			message = ((GDSResultStatus) resultStatus).getGDSError().toString();
		} else if (resultStatus.getText() != null &&
			resultStatus.getText().getTextElement() != null &&
			resultStatus.getText().getTextElement().length > 0
			) {
			message = resultStatus.getText().getTextElement()[0].toString();
		}

		return message;
	}

	protected UniqueID uniqueID(String value, UniqueIDType type, String source) {
		UniqueID uniqueID = new UniqueID();
		if (value != null) {
			uniqueID.setString(value);
		}

		if (type != null) {
			uniqueID.setType(type);
		}

		if (source != null) {
			uniqueID.setSource(source);
		}

		return uniqueID;
	}

	/**
	 * Creates a {@link UniqueID} representing the provided internal reservation id.
	 *
	 * @param pmsReservationId
	 * @return
	 */
	protected UniqueID internalReservationId(String pmsReservationId) {
		return uniqueID(pmsReservationId, UniqueIDType.INTERNAL, MicrosIds.OWS.RESERVATION_ID_SOURCE);
	}

	/**
	 * Helper for creating an {@link ArrayOfUniqueID}.
	 *
	 * @param uniqueIDs
	 * @return
	 */
	protected ArrayOfUniqueID arrayOf(UniqueID... uniqueIDs) {
		ArrayOfUniqueID list = new ArrayOfUniqueID();
		for (UniqueID uniqueID : uniqueIDs) {
			list.addUniqueID(uniqueID);
		}
		return list;
	}

}
