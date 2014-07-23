package com.micros.http.connection;


import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import com.micros.oxi.logger.MicrosOXILogger;
import com.micros.oxi.utility.OXIUtility;


/**
 * This class is used to establish http connection between oxi listener
 * and oxi simulator.It receives response(acknowledgment) from the listener.
 * 
 * @author niveditat
 *
 */

public class HttpClientRequest {

	private InputStream inputStream = null;
	private String response = null;

	/**
	 * 
	 * @author niveditat
	 * @method name : getHttpGetResponse
	 * @description : Method to obtain response using HttpPost request.
	 * @param url
	 * @return
	 * @return : InputStream Type
	 */
	public  String getHttpPostResponse( String url , String xmlData ) throws Exception{

		MicrosOXILogger.logInfo( HttpClientRequest.class, " getHttpPostResponse " , " Enter getHttpPostResponse method ");

		try {
			
			// Set up HTTP post. 
			HttpParams httpParams = new BasicHttpParams();			
			HttpClient httpClient = new DefaultHttpClient(httpParams);
			HttpPost httpPost = new HttpPost(url);
			httpPost.setHeader("Content-Type", "text/xml");
			
			// Set parameters.
			httpPost.setEntity(new StringEntity(xmlData, "UTF-8"));
			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();

			//Get input stream from http entity.
			inputStream = httpEntity.getContent();

			// Get response from inputStream. 
			response = OXIUtility.getStringFromResponse( inputStream );


		}  catch (IOException ioe) {

			MicrosOXILogger.logError(HttpClientRequest.class, " getHttpPostResponse " , ioe );

		}
		catch (Exception exc) {

			MicrosOXILogger.logError(HttpClientRequest.class, " getHttpPostResponse " , exc );	
		}

		MicrosOXILogger.logInfo(HttpClientRequest.class, "getHttpPostResponse " , " Exit getHttpPostResponse method. " + response );	

		return response;
	}

}
