package com.micros.pms.processor;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;

import java.util.UUID;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class AbstractOWSProcessor {

	protected HotelReference getDefaultHotelReference() {
		HotelReference objHotelReference = new HotelReference();

		objHotelReference.setHotelCode(ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE));
		objHotelReference.setString("");
		objHotelReference.setChainCode(ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE));
		return objHotelReference;
	}

	protected OGHeaderE getHeaderE() {
		String transactionId = UUID.randomUUID().toString();

		// Sets Transaction Identifier
		OGHeader ogHeader = new OGHeader();

		ogHeader.setTransactionID(transactionId);

		// creates origin end point of header.
		EndPoint origin = new EndPoint();

		String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
		origin.setEntityID(entityId);

		String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
		origin.setSystemType(systemType);

		// creates destination end point of header.
		EndPoint destination = new EndPoint();
		String destEntityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_DESTINATION_ID);

		destination.setEntityID(destEntityId);
		String destSystemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_DEST_TYPE);
		destination.setSystemType(destSystemType);

		// sets time stamp
		ogHeader.setTimeStamp(AdapterUtility.getCalender());

		// prepares OGHeader
		ogHeader.setOrigin(origin);
		ogHeader.setDestination(destination);

		String username = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_NAME);
		String password = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_PASS);

		if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

			OGHeaderAuthentication auth = new OGHeaderAuthentication();
			ogHeader.setAuthentication(auth);

			OGHeaderAuthenticationUserCredentials cred = new OGHeaderAuthenticationUserCredentials();
			auth.setUserCredentials(cred);

			cred.setUserName(username);
			cred.setUserPassword(password);
		}

		OGHeaderE ogHeaderE = new OGHeaderE();
		ogHeaderE.setOGHeader(ogHeader);
		return ogHeaderE;
	}

	protected String getErrorMessage(ResultStatus resultStatus) {
		String message = "";
		if (resultStatus instanceof GDSResultStatus) {
			GDSResultStatus gdsResultStatus = (GDSResultStatus) resultStatus;
			if (gdsResultStatus.isGDSErrorSpecified()) {
				message = gdsResultStatus.getGDSError().toString();
			} else if (gdsResultStatus.isTextSpecified()) {
				if (gdsResultStatus.getText() != null &&
					gdsResultStatus.getText().getTextElement() != null &&
					gdsResultStatus.getText().getTextElement().length > 0
					) {
					message = gdsResultStatus.getText().getTextElement()[0].toString();
				}
			}
		} else if (resultStatus.getText() != null &&
			resultStatus.getText().getTextElement() != null &&
			resultStatus.getText().getTextElement().length > 0
			) {
			message = resultStatus.getText().getTextElement()[0].toString();
		}

		return message;
	}
}
