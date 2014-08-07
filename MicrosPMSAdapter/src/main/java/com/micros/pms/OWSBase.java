package com.micros.pms;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.google.inject.Inject;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.util.UUID;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class OWSBase {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	@Named("ows.hotel.code")
	protected String hotelCode;

	@Inject
	@Named("ows.chain.code")
	protected String chainCode;

	@Inject
	@Named("origin.entity.id")
	protected String entityId;

	@Inject
	@Named("origin.system.type")
	protected String systemType;

	@Inject
	@Named("destination.entity.id")
	protected String destEntityId;

	@Inject
	@Named("destination.system.type")
	protected String destSystemType;

	@Inject
	@Named("auth.user.name")
	protected String authUsername;

	@Inject
	@Named("auth.user.pass")
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

		return hotelReference;
	}

	protected OGHeaderE getHeaderE() {
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
		ogHeader.setTimeStamp(AdapterUtility.getCalender());

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

	/**
	 * Throws a {@link com.cloudkey.exceptions.PMSError} with the contained error message and code
	 * if the result status is not successful.
	 *
	 * @param result
	 */
	protected void errorIfFailure(ResultStatus result) {
		if (result.getResultStatusFlag() == ResultStatusFlag.FAIL) {
			PMSError pmsError = new PMSError(getErrorMessage(result), result.getOperaErrorCode());
			log.debug("OWS Response ResultStatus was FAIL. Throwing exception", pmsError);
			throw pmsError;
		}
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
		return uniqueID(pmsReservationId, UniqueIDType.INTERNAL, IMicrosConstants.RESERVATION_ID_SOURCE);
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
