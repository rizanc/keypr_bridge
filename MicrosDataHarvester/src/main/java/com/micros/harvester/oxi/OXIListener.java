package com.micros.harvester.oxi;

import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.reservations.FindReservationRequest;
import com.cloudkey.pms.response.reservations.FindReservationResponse;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.keypr.pms.micros.oxi.jaxb.inventory.InventoryMessage;
import com.keypr.pms.micros.oxi.jaxb.ravl.Ravl;
import com.keypr.pms.micros.oxi.jaxb.ravr.Ravr;
import com.keypr.pms.micros.oxi.jaxb.reservation.ResGuest;
import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
import com.keypr.pms.micros.oxi.jaxb.reservation.ReservationReference;
import com.keypr.pms.micros.oxi.jaxb.rtav.RtavMessage;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.util.OXIParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.cxf.helpers.IOUtils;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	protected IParserInterface ows;

	@Inject
	protected ObjectMapper objectMapper;

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate.url")
	protected String affiliateServiceUrl;

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate")
	protected String affiliateId;

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

			Object oxiMessage = null;

			try {
				oxiMessage = unmarshaller.unmarshal(xmlContentBytes);
			} catch (UnmarshalException e) {
				log.error("Could not unmarshall message", e);
			}

            if (oxiMessage instanceof Reservation) {
                log.info("Got a Reservation");
				handleReservation((Reservation) oxiMessage);
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
            } else {
                log.error("Got an unsupported message {}", oxiRequest);
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

	/**
	 * Handle an incoming reservation update from OXI.
	 *
	 * 1. Fetches all referenced reservations from OWS (one confirmation number, one or many leg numbers)
	 * 2. Pushes them to the Keypr cloud pms_push endpoint
	 *
	 * @param reservation
	 */
	protected void handleReservation(Reservation reservation) throws IOException {
		List<FindReservationRequest> findReservationRequests = new ArrayList<>();

		// Create a list of FindReservationRequests, one for each referenced reservation.
		// This is expected to be either one reservation or the many legs of the same reservation series.
		for (ResGuest resGuest : reservation.getResGuests()) {
			for (ReservationReference reservationReference : resGuest.getReservationReferences()) {
				if (Objects.equals(reservationReference.getType(), MicrosIds.OXI.RESERVATION_REFERENCE_ID_TYPE)) {
					Integer legNo = null;
					try {
						 legNo = Integer.parseInt(reservationReference.getLegNumber());
					} catch (NumberFormatException e) {
						log.error("Could not parse leg no '{}' as an integer", reservationReference.getLegNumber());
					}

					if (legNo != null) {
						findReservationRequests.add(new FindReservationRequest(reservationReference.getReferenceNumber(), legNo));
					}
				}
			}
		}

		// Attempt to fetch each reservation from OWS.
		List<com.cloudkey.pms.common.reservation.Reservation> owsReservations = new ArrayList<>();

		for (FindReservationRequest findReservationRequest : findReservationRequests) {
			FindReservationResponse reservationResponse = ows.findReservation(findReservationRequest);

			if (reservationResponse.getReservation().isPresent()) {
				owsReservations.add(reservationResponse.getReservation().get());
			}
		}

		// Write the reservation list to json
		String jsonReservationsList = objectMapper.writeValueAsString(owsReservations);

		// Post the json to the keypr_affiliate reservation push endpoint
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
			HttpPost httpPost = new HttpPost(getReservationUploadEndpoint());
			httpPost.setEntity(new StringEntity(jsonReservationsList));

			httpClient.execute(httpPost);
		}
	}

	protected String getReservationUploadEndpoint() {
		return affiliateServiceUrl + affiliateId + "/reservation_data";
	}

}
