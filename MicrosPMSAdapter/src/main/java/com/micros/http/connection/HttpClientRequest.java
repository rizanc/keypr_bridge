package com.micros.http.connection;

import com.micros.pms.util.AdapterUtility;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to establish http connection between adapter and micros simulator.
 * 
 * @author niveditat
 *
 */

public class HttpClientRequest {

	final static Logger log = LoggerFactory.getLogger(HttpClientRequest.class);

	/**
	 *
	 * @param url
	 * @param xmlString
	 * @return
	 */
	public String getHttpPostResponse( String url, String xmlString ) {
		log.debug("getHttpPostResponse: Enter getHttpPostResponse method");

		String response = null;

		try {

			/* Set up HTTP post. */
			HttpParams httpParams = new BasicHttpParams();			
			HttpClient httpClient = new DefaultHttpClient( httpParams );
			HttpPost httpPost = new HttpPost(url);

			/*set xml as request.*/
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("xml", xmlString));

			/*Set parameters.*/
			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			long requestTime = System.currentTimeMillis();
			HttpResponse httpResponse = httpClient.execute(httpPost);
			long latency = System.currentTimeMillis()- requestTime;
			
			log.debug("getHttpPostResponse: PMS Latency at MessageReceiver End in milliseconds: {}", latency);
			
			HttpEntity httpEntity = httpResponse.getEntity();

			/* Read content & Log. */
			InputStream inputStream = httpEntity.getContent();
				
			/* get response from inputStream. */
			response = AdapterUtility.getStringFromResponse(inputStream);
		} catch (Exception exc) {
			// TODO: We shouldn't be catching all exceptions here.
			log.error("getHttpPostResponse", exc);
		}

		log.debug("getHttpPostResponse: Exit getHttpPostResponse method ", response);
		
		return response;
	}

}
