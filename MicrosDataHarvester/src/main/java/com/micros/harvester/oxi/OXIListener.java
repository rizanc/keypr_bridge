package com.micros.harvester.oxi;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.keypr.pms.micros.oxi.jaxb.inventory.InventoryMessage;
import com.keypr.pms.micros.oxi.jaxb.ravl.Ravl;
import com.keypr.pms.micros.oxi.jaxb.ravr.Ravr;
import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
import com.keypr.pms.micros.oxi.jaxb.rtav.RtavMessage;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.util.OXIParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.cxf.helpers.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
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

        String response = " Status: SUCCESS code= 200 ok ";
        int response_code = 200;

        try {
            InputStream inputStream = exchange.getRequestBody();
            String oxiRequest = IOUtils.toString(inputStream);
            inputStream.close();

            log.info("Received OXI message: {}", oxiRequest);

            OXIParser objDataUtility = new OXIParser(oxiRequest);
            boolean isPersisted;

            StreamSource xmlContentBytes = new StreamSource(new StringReader(oxiRequest));
            JAXBContext context = JAXBContext.newInstance(
                    InventoryMessage.class,
                    Reservation.class,
                    RtavMessage.class,
                    Ravl.class,
                    Ravr.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            unmarshaller.setSchema(null);

            Object oxiMessage = unmarshaller.unmarshal(xmlContentBytes);
            if (oxiMessage instanceof Reservation) {
                log.info("Got a Reservation");
                com.cloudkey.commons.Reservation objReservation = objDataUtility.populateReservation((Reservation) oxiMessage);
                isPersisted = microsDAO.persistReservationData(objReservation);
                log.debug("handle: Reservation Stored in DataBase: {}", isPersisted);
            } else if (oxiMessage instanceof RtavMessage) {
                log.info("Got a RTAV");
                com.cloudkey.commons.Rtav objRtav = objDataUtility.populateRtav((RtavMessage)oxiMessage);
                isPersisted = microsDAO.persistRtavData(objRtav);
                log.debug("handle: Rtav Stored in DataBase: {}", isPersisted);
            } else if (oxiMessage instanceof Ravr) {
                log.info("Got a RAVR");
                //TODO: Parse & store
            } else if (oxiMessage instanceof Ravl) {
                log.info("Got a RAVL");
                //TODO: Parse & store
            } else if (oxiMessage instanceof InventoryMessage) {
                log.info("Got an Inventory");
                //TODO: Parse & store
            } else
            {
                log.error("Got an unsupported message {}",oxiRequest);
            }

            exchange.sendResponseHeaders(response_code, response.length());

        } catch (Exception exc) {
            log.error(" handle ", exc);
            response = " Status: ERROR code= 500 Internal Server Error ";
            exchange.sendResponseHeaders(500, response.length());
        } finally {
            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(response.getBytes());
            responseBody.close();
        }

        log.debug("handle: exit handle method ");
    }

}
