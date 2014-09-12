//package com.micros.harvester.oxi;
//
//import com.google.inject.Inject;
//import com.google.inject.name.Named;
//import com.keypr.pms.micros.oxi.jaxb.inventory.InventoryMessage;
//import com.keypr.pms.micros.oxi.jaxb.ravl.Ravl;
//import com.keypr.pms.micros.oxi.jaxb.ravr.Ravr;
//import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
//import com.keypr.pms.micros.oxi.jaxb.rtav.RtavMessage;
//import com.micros.harvester.dao.IMicrosDAO;
//import com.micros.harvester.handlers.ReservationHandler;
//import com.micros.harvester.util.OXIParser;
//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpServer;
//import org.apache.cxf.helpers.IOUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.UnmarshalException;
//import javax.xml.bind.Unmarshaller;
//import javax.xml.transform.stream.StreamSource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.StringReader;
//import java.net.InetSocketAddress;
//
///**
// * This class acts as a http listener class. It keeps running in a listening
// * mode to collect reservation data posted by the property management system. It forwards
// * the received reservation data to the data harvesting service for processing. It returns
// * Acknowledgment to the sender.
// *
// * @author vinayk2
// */
//public class OXIListener implements HttpHandler {
//    protected final Logger log = LoggerFactory.getLogger(getClass());
//
//    @Inject
//    protected IMicrosDAO microsDAO;
//
//    @Inject
//    @Named("keypr.bridge.micros.harvester.oxi.listener.port")
//    protected int listeningPortNum;
//
//    @Inject
//    @Named("keypr.bridge.micros.harvester.oxi.listener.url")
//    protected String listeningURL;
//
//	@Inject
//	protected ReservationHandler reservationHandler;
//
//	/**
//     * This method connects with the specified address and with specific port. It keeps listening
//     * to every request arriving to the url.
//     */
//    public void connectWithOXI() throws IOException {
//        log.debug("connectWithOXI: enter connectWithServer method ");
//
//            HttpServer oxiListener = HttpServer.create(new InetSocketAddress(listeningPortNum), 0);
//            oxiListener.createContext(listeningURL, this);
//            oxiListener.setExecutor(null);
//            oxiListener.start();
//
//        log.debug("connectWithOXI: exit connectWithOXI method ");
//    }
//
//    /**
//     * This method is called to collect reservation data from the property management system.
//     */
//    @Override
//    public void handle(HttpExchange exchange) throws IOException {
//        log.debug("handle: enter handle method ");
//
//        String response = " Status: SUCCESS code= 200 ok ";
//        int response_code = 200;
//
//        try {
//            InputStream inputStream = exchange.getRequestBody();
//            String oxiRequest = IOUtils.toString(inputStream);
//            inputStream.close();
//
//            log.info("Received OXI message: {}", oxiRequest);
//
//            StreamSource xmlContentBytes = new StreamSource(new StringReader(oxiRequest));
//            JAXBContext context = JAXBContext.newInstance(
//                    InventoryMessage.class,
//                    Reservation.class,
//                    RtavMessage.class,
//                    Ravl.class,
//                    Ravr.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//            unmarshaller.setSchema(null);
//
//			Object oxiMessage = null;
//
//			try {
//				oxiMessage = unmarshaller.unmarshal(xmlContentBytes);
//			} catch (UnmarshalException e) {
//				log.error("Could not unmarshall message", e);
//			}
//
//            if (oxiMessage instanceof Reservation) {
//				reservationHandler.handle((Reservation) oxiMessage);
//            } else if (oxiMessage instanceof RtavMessage) {
//				//TODO: Parse & push
//            } else if (oxiMessage instanceof Ravr) {
//                //TODO: Parse & push
//            } else if (oxiMessage instanceof Ravl) {
//                //TODO: Parse & push
//            } else if (oxiMessage instanceof InventoryMessage) {
//                //TODO: Parse & push
//            } else {
//                log.error("Received an unsupported message type {}", oxiRequest.getClass().getName());
//            }
//
//            exchange.sendResponseHeaders(response_code, response.length());
//
//        } catch (Exception exc) {
//            log.error(" handle ", exc);
//            response = " Status: ERROR code= 500 Internal Server Error ";
//            exchange.sendResponseHeaders(500, response.length());
//        } finally {
//            OutputStream responseBody = exchange.getResponseBody();
//            responseBody.write(response.getBytes());
//            responseBody.close();
//        }
//
//        log.debug("handle: exit handle method ");
//    }
//
//
//}
