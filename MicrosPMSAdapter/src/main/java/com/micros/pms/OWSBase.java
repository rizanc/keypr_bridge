package com.micros.pms;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.ows.OWSTools;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class OWSBase extends OWSTools {

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
}
