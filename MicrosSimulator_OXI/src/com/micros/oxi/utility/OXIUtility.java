package com.micros.oxi.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.micros.http.connection.HttpClientRequest;
import com.micros.oxi.logger.MicrosOXILogger;

/**
 * This class has the utility method which will used in the application .
 * 
 * @author niveditat
 *
 */
public class OXIUtility {

	
	/**
	 * This method is used to extract response
	 * from inputStream into String format.
	 * 
	 * @param inputStream
	 * @return
	 * @throws IOException 
	 */
	public static String getStringFromResponse(InputStream inputStream) throws IOException {
	
		MicrosOXILogger.logInfo( HttpClientRequest.class, " getStringFromResponse " , " Enter getStringFromResponse method ");
		String htpresponse=null;

		if(inputStream != null){
			
			BufferedReader buffRd = new BufferedReader(new InputStreamReader(inputStream));
			String line;
           // Traversing buffer.
			StringBuffer response = new StringBuffer();
			while ((line = buffRd.readLine()) != null)
			{
				response.append(line);
				response.append('\r');
			}
			
			htpresponse=response.toString();
			
			// close the buffer and stream. 
			buffRd.close();
			inputStream.close();
		}
		
		MicrosOXILogger.logInfo( HttpClientRequest.class, " getStringFromResponse " , " Exit getStringFromResponse method " + htpresponse);
		return htpresponse;	
		
	}	
}
