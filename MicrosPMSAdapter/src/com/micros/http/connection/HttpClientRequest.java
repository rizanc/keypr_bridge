package com.micros.http.connection;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.util.AdapterUtility;

/**
 * This class is used to establish http connection between adapter and micros simulator.
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
	 * @description : Method to obtain response using HttpGet request.
	 * @param url
	 * @return
	 * @return : InputStream Type
	 */
	public String getHttpPostResponse( String url, String xmlString ) throws Exception{

		MicrosPMSLogger.logInfo( HttpClientRequest.class, " getHttpPostResponse " , " Enter getHttpPostResponse method ");
	
		try {

			/* Set up HTTP post. */
			HttpParams httpParams = new BasicHttpParams();			
			HttpClient httpClient = new DefaultHttpClient(httpParams);
			HttpPost httpPost = new HttpPost(url);

			/*set xml as request.*/
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("xml", xmlString));

			/*Set parameters.*/
			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();

			/* Read content & Log. */
			inputStream = httpEntity.getContent();
				
			/* get response from inputStream. */
			response = AdapterUtility.getStringFromResponse( inputStream );

			
		}  catch (IOException ioe) {
			
			MicrosPMSLogger.logError(HttpClientRequest.class, " getHttpPostResponse " , ioe );
			
		}
		catch (Exception exc) {
			
			MicrosPMSLogger.logError(HttpClientRequest.class, " getHttpPostResponse " , exc );	
		}

		MicrosPMSLogger.logInfo(HttpClientRequest.class, "getHttpPostResponse " , " Exit getHttpPostResponse method. " + response );	
		
		return response;
	}

}
