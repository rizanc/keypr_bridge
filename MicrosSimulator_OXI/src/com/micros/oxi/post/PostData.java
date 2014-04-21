package com.micros.oxi.post;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.micros.http.connection.HttpClientRequest;
import com.micros.oxi.constant.OXIConstants;
import com.micros.oxi.logger.MicrosOXILogger;
import com.micros.oxi.utility.OXIConfigurationReader;

/**
 * This class makes call for http post connection with data and
 *  receives the response from the listener.
 * 
 * @author niveditat
 *
 */

public class PostData extends HttpServlet{

	/**
	 * add the default serial version id.
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MicrosOXILogger.logInfo( PostData.class, " doPost ", " Enter method doGet" );
		PrintWriter out = null;
		response.setContentType("text/html");
		
		out = response.getWriter();		
		try {
			
            // To make http request.
			HttpClientRequest objClientRequest = new HttpClientRequest();
			String httpResponse =	objClientRequest.getHttpPostResponse( OXIConfigurationReader.getProperty(OXIConstants.OXI_LISTENER_URL) , "Reservation Data.");
			
			out.println("Response :" + httpResponse);

		} catch (Exception exc) {

			MicrosOXILogger.logError( HttpClientRequest.class, " getHttpPostResponse " , exc);
		}

		MicrosOXILogger.logInfo( PostData.class, " doPost ", " Exit method doGet" );	

	}

}
