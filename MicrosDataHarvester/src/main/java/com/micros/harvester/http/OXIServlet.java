package com.micros.harvester.http;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.keypr.pms.micros.oxi.jaxb.inventory.InventoryMessage;
import com.keypr.pms.micros.oxi.jaxb.ravl.Ravl;
import com.keypr.pms.micros.oxi.jaxb.ravr.Ravr;
import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
import com.keypr.pms.micros.oxi.jaxb.rtav.RtavMessage;
import com.micros.harvester.handlers.ReservationHandler;
import org.apache.cxf.helpers.IOUtils;
import org.eclipse.jetty.server.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class OXIServlet extends HttpServlet {
	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	ReservationHandler reservationHandler;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestBody = readRequestBodyAsString(req);
		log.info("Received: {}", requestBody);

		Object oxiObj;
		try {
			oxiObj = unmarshall(requestBody);
		} catch (JAXBException e) {
			log.error("Exception raised while unmarshalling request body", e);
			resp.sendError(Response.SC_BAD_REQUEST);
			return;
		}

		log.info("Unmarshalled as {}", oxiObj.getClass());

		try {
			if (oxiObj instanceof Reservation) {
				reservationHandler.handle((Reservation) oxiObj);
			}
		} catch (PMSInterfaceException e) {
			resp.sendError(502);
//		} catch (SocketException e) {
//			resp.sendError(504);
		}

		resp.setStatus(Response.SC_OK);
		resp.setContentLength(0);
	}

	/**
	 * Attempt to unmarshall the given XML as one of the expected OXI messages.
	 *
	 * @param requestBody
	 * @return
	 * @throws JAXBException
	 */
	private static Object unmarshall(String requestBody) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(
			InventoryMessage.class,
			Reservation.class,
			RtavMessage.class,
			Ravl.class,
			Ravr.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setSchema(null);

		return unmarshaller.unmarshal(new StringReader(requestBody));
	}

	private static String readRequestBodyAsString(HttpServletRequest req) throws IOException {
		try (Reader reader = req.getReader()) {
			return IOUtils.toString(reader);
		}
	}
}
