package com.micros.harvester.oxi;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Rtav;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.dao.MicrosDAOImpl;
import com.micros.harvester.util.OXIParserUtility;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.InetSocketAddress;

/**
 * This class acts as a http listener class. It keeps running in a listening
 * mode to collect reservation data posted by the property management system. It forwards
 * the received reservation data to the data harvesting service for processing. It returns
 * Acknowledgment to the sender.
 *
 * @author vinayk2
 */
public class OXIListener implements HttpHandler {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    protected IMicrosDAO microsDAO;

    @Inject
    @Named("keypr.bridge.micros.harvester.oxi.listener.port")
    protected int listeningPortNum;

    @Inject
    @Named("keypr.bridge.micros.harvester.oxi.listener.url")
    protected String listeningURL;

    @Inject
    @Named("keypr.bridge.micros.harvester.oxi.listener.size")
    protected int bufferSize;

    @Inject
    @Named("keypr.bridge.micros.harvester.oxi.file.location")
    protected String filePath;

    /**
     * This method connects with the specified address and with specific port. It keeps listening
     * to every request arriving to the url.
     */
    public void connectWithOXI() {
        log.debug("connectWithOXI: enter connectWithServer method ");

        try {
            HttpServer oxiListener = HttpServer.create(new InetSocketAddress(listeningPortNum), 0);
            oxiListener.createContext(listeningURL, this);
            oxiListener.setExecutor(null);
            oxiListener.start();
        } catch (Exception exc) {

            log.error(" connectWithOXI ", exc);
        }

        log.debug("connectWithOXI: exit connectWithOXI method ");
    }

    /**
     * This method is called to collect reservation data from the property management system.
     */
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        log.debug("handle: enter handle method ");
        String response = "";
        OutputStream os;

        try {
            InputStream objInputStream = exchange.getRequestBody();

            ByteArrayOutputStream objByteArray = new ByteArrayOutputStream();

            byte objInputArray[] = new byte[bufferSize];

            for (int n = objInputStream.read(objInputArray); n > 0; n = objInputStream.read(objInputArray)) {
                objByteArray.write(objInputArray, 0, n);
            }

            //oxiRequest = new String(objByteArray.toByteArray(),"UTF-8");
	        String oxiRequest = new String(objByteArray.toByteArray());
	        log.info("Received OXI message: {}", oxiRequest);

            File xmlFile = persistToFile(oxiRequest);

            log.debug("handle: File Created: {}", xmlFile.getName());

            OXIParserUtility objDataUtility = new OXIParserUtility();

            objDataUtility.loadDoc(xmlFile);

            microsDAO = new MicrosDAOImpl();

	        boolean isPersisted;

            if (objDataUtility.isReservation()) {
                Reservation objReservation = objDataUtility.populateReservation(oxiRequest);

                isPersisted = microsDAO.persistReservationData(objReservation);
                log.debug("handle: Reservation Stored in DataBase: {}", isPersisted);
            } else if (objDataUtility.isRtav()) {
                Rtav objRtav = objDataUtility.populateRtav(oxiRequest);

                isPersisted = microsDAO.persistRtavData(objRtav);
                log.debug("handle: Rtav Stored in DataBase: {}", isPersisted);
            }

            response = " Status: SUCCESS code= 200 ok ";

            exchange.sendResponseHeaders(200, response.length());

            os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        } catch (Exception exc) {
            log.error(" handle ", exc);
            response = " Status: ERROR code= 500 Internal Server Error ";
            exchange.sendResponseHeaders(500, response.length());
        } finally {
            os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        log.debug("handle: exit handle method ");
    }

    /**
     * This method accepts the oxi reservation data from the property management system as string.
     * It creates file and returns it for further processing.
     *
     * @param oxiRequest
     * @return
     */
    private File persistToFile(String oxiRequest) {
        log.debug("persistToFile: enter persistToFile method ");

        File oxiRev = null;
        FileOutputStream fout;
        try {

            oxiRev = new File(filePath);
            fout = new FileOutputStream(oxiRev);

            fout.write(oxiRequest.getBytes());

            log.debug("persistToFile: content written to the file ");
            fout.close();

        } catch (Exception exc) {
            log.error(" persistToFile ", exc);
        }

        log.debug("persistToFile: exit persistToFile method ");

        return oxiRev;
    }

}
