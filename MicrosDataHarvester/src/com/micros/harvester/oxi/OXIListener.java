package com.micros.harvester.oxi;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * This class acts as a http listener class. It keeps running in a listening 
 * mode to collect reservation data posted by the property management system. It forwards
 * the received reservation data to the data harvesting service for processing. It returns
 * Acknowledgment to the sender. 
 * 
 * @author vinayk2
 *
 */
public class OXIListener implements HttpHandler {

	/**
	 * This method connects with the specified address and with specific port. It keeps listening
	 * to every request arriving to the url.
	 */
	public void connectWithOXI() {

		DataHarvesterLogger.logInfo( OXIListener.class, " connectWithOXI ", " enter connectWithServer method " );

		HttpServer oxiListener = null;
		String listeningPort = null;
		String listeningURL = null;

		try {

			listeningPort = HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_LISTENING_PORT );
			listeningURL = HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_LISTENING_URL );

			int portNum = Integer.parseInt( listeningPort );

			oxiListener =  HttpServer.create( new InetSocketAddress( portNum ), 0);
			oxiListener.createContext( listeningURL , this);
			oxiListener.setExecutor( null);
			oxiListener.start();
		}
		catch(Exception exc) {

			DataHarvesterLogger.logError( OXIListener.class, " connectWithOXI ", exc );
		}

		DataHarvesterLogger.logInfo( OXIListener.class, " connectWithOXI ", " exit connectWithOXI method " );
	}

	/**
	 * This method is called to collect reservation data from the property management system.
	 */
	@Override
	public void handle( HttpExchange exchange ) {

		DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " enter handle method " );

		try {

			String oxiRequest = null;

			Headers reqHeaders = exchange.getRequestHeaders();
			String contentType = reqHeaders.getFirst("Content-Type");

			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " content type " + contentType );

			InputStream objInputStream = exchange.getRequestBody();

			ByteArrayOutputStream objByteArray = new ByteArrayOutputStream();

			byte objInputArray[] = new byte[4096];

			for (int n = objInputStream.read(objInputArray); n > 0; n = objInputStream.read(objInputArray)) {

				objByteArray.write(objInputArray, 0, n);
			}

			//oxiRequest = new String(objByteArray.toByteArray(),"UTF-8");
			oxiRequest = new String(objByteArray.toByteArray());
			
			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " Reservation Received " + oxiRequest );
			
			File xmlFile = persistToFile(oxiRequest);
			
			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " File Created " + xmlFile.getName() );

			String response = "This is the response value from micros data harvesting service  " + oxiRequest;

			exchange.sendResponseHeaders(200, response.length());

			OutputStream os = exchange.getResponseBody();
			os.write(response.getBytes());
			os.close();

		}
		catch( Exception exc ) {

			DataHarvesterLogger.logError( OXIListener.class, " handle ", exc );
		}

		DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " exit handle method " );

	}

	/**
	 * This method accepts the oxi reservation data from the property management system as string.
	 * It creates file and returns it for further processing.
	 * 
	 * @param oxiRequest
	 * @return
	 */
	private File persistToFile( String oxiRequest){
		
		DataHarvesterLogger.logInfo( OXIListener.class, " persistToFile ", " enter persistToFile method " );
		
		File oxiRev = null;
		FileOutputStream fout = null;
		
		try {
			
			oxiRev = new File( "OxiReservation.xml" );
			fout = new FileOutputStream(oxiRev);
			
			fout.write(oxiRequest.getBytes());
			DataHarvesterLogger.logInfo( OXIListener.class, " persistToFile ", " content written to the file " );
			fout.close();
			
		}
		catch ( Exception exc ) {
			
			DataHarvesterLogger.logError( OXIListener.class, " persistToFile ", exc );
		}
		
		DataHarvesterLogger.logInfo( OXIListener.class, " persistToFile ", " exit persistToFile method " );
		
		return oxiRev;
	}
	
}
