package com.micros.harvester.oxi;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Rtav;
import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.harvester.util.HarvesterConfigurationReader;
import com.micros.harvester.util.OXIParserUtility;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;

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

		try {

			int listeningPortNum = Integer.parseInt(HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_LISTENING_PORT ));
			String listeningURL = HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_LISTENING_URL );

            HttpServer oxiListener =  HttpServer.create( new InetSocketAddress( listeningPortNum ), IMicrosHarvester.COUNT_ZERO );
			oxiListener.createContext(listeningURL , this);
			oxiListener.setExecutor(null);
			oxiListener.start();
		}
		catch( Exception exc ) {

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
			IMicrosDAO objMicrosDAO = null;
			int BufferSize = 0;

			Headers reqHeaders = exchange.getRequestHeaders();
			String contentType = reqHeaders.getFirst( "Content-Type" );
			BufferSize = Integer.parseInt( HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_LISTENER_BUFFER_SIZE ) );

			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " content type " + contentType );

			InputStream objInputStream = exchange.getRequestBody();

			ByteArrayOutputStream objByteArray = new ByteArrayOutputStream();

			byte objInputArray[] = new byte[BufferSize];

			for (int n = objInputStream.read(objInputArray); n > IMicrosHarvester.COUNT_ZERO; n = objInputStream.read(objInputArray) ) {

				objByteArray.write(objInputArray, IMicrosHarvester.COUNT_ZERO, n);
			}

			//oxiRequest = new String(objByteArray.toByteArray(),"UTF-8");
			oxiRequest = new String(objByteArray.toByteArray());

			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " Reservation Received " + oxiRequest );

			File xmlFile = persistToFile( oxiRequest );

			DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " File Created " + xmlFile.getName() );

			OXIParserUtility objDataUtility = new OXIParserUtility();

			objDataUtility.loadDoc( xmlFile );

			objMicrosDAO = new MicrosDAOImpl();
			boolean isPersisted = false ;

			if (objDataUtility.isReservation()){
				Reservation  objReservation = objDataUtility.populateReservation( xmlFile );
				isPersisted = objMicrosDAO.persistReservationData( objReservation );
				DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " Reservation Stored in DataBase  " + isPersisted );
			} else if (objDataUtility.isRtav() ) {
				Rtav objRtav = objDataUtility.populateRtav( );
				isPersisted = objMicrosDAO.persistRtavData ( objRtav );
				DataHarvesterLogger.logInfo( OXIListener.class, " handle ", " Rtav Stored in DataBase  " + isPersisted );
			}

			String response = " Status: SUCCESS code= 200 ok ";

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
		String filePath = null;

		try {

			filePath = HarvesterConfigurationReader.getProperty( IMicrosHarvester.OXI_XML_PATH_LOCATION );
			oxiRev = new File( filePath );
			fout = new FileOutputStream( oxiRev );

			fout.write( oxiRequest.getBytes() );

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
