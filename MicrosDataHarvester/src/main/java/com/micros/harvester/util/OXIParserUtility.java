package com.micros.harvester.util;

import com.cloudkey.commons.*;
import com.cloudkey.commons.Reservation;
import com.keypr.pms.micros.ows.jaxb.profile_5_0.*;
import com.keypr.pms.micros.ows.jaxb.profile_5_0.Membership;
import com.keypr.pms.micros.ows.jaxb.reservation.*;
import com.keypr.pms.micros.ows.jaxb.reservation.SpecialRequest;
import com.cloudkey.pms.common.contact.StreetAddress;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keypr.pms.micros.ows.jaxb.rtav.ObjectFactory;
import com.keypr.pms.micros.ows.jaxb.rtav.RoomTypeInventory;
import com.keypr.pms.micros.ows.jaxb.rtav.RtavMessage;
import com.micros.harvester.constant.IMicrosHarvester;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class contains the parser logic for reservation using xpath.
 *
 * @author niveditat
 */
public class OXIParserUtility {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * The parsed document
     */
    private Document document;

    /**
     * The parsed document
     */
    private Boolean docLoaded = false;

    /**
     * * This method accept xpath expression and reference of xml document. It returns the list
     * of nodes satisfying the criteria of xpath expression.
     *
     * @param expression
     * @param document
     * @return
     * @throws XPathExpressionException
     */
    private NodeList retrieveNodeList(String expression, Document document) throws XPathExpressionException {

        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
        return nodeList;
    }


    /**
     * Parse the OXI xml into a document for further processing.
     */
    public void loadDoc(File xmlfile) {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            if (xmlfile.exists()) {

                document = docBuilder.parse(xmlfile);
                docLoaded = true;
            }

        } catch (Exception exc) {

            log.error(" loadDoc ", exc);
        }


    }


    /**
     * Return true if document is a Reservation
     */
    public Boolean isReservation() {
        boolean returnVal = false;
        try {
            if (docLoaded) {
                // Try to retrive reservation type
                String expression = "/Reservation[@mfReservationAction]";
                NodeList nodeList = retrieveNodeList(expression, document);
                returnVal = (nodeList.getLength() > 0);
            }

        } catch (Exception exc) {

            log.error(" isReaservation ", exc);
        }

        return returnVal;
    }


    /**
     * Return true if document is a Rtav
     */
    public Boolean isRtav() {
        Boolean returnVal = false;
        try {
            // Try to retrive reservation type
            if (docLoaded) {
                String expression = "/RtavMessage/DailyInventories/DailyInventory[@datum]";
                NodeList nodeList = retrieveNodeList(expression, document);
                returnVal = (nodeList.getLength() > 0);
            }

        } catch (Exception exc) {

            log.error(" isRtav ", exc);
        }

        return returnVal;
    }


    public Reservation populateReservation(String oxiRequest) {

        log.debug("populateReservation: Enter populateReservation method. ");

        ReservationRoomAllocation objRoomAllocation = null;
        Reservation objReservation = null;
        List<ReservationRoomAllocation> obRoomAllocationsList = null;
        ArrayList<RoomRate> obRoomRatesList = null;
        RoomRate objRoomRate = null;
        RoomType objRoomType = null;

        StringBuffer objStringBuffer = null;

        String reservationAction = "";
        String confirmationNumber = "";
        String roomNumber = "";
        String creditCardNumber = "";

        String reservationSource = "";
        String loyaltyNumber = "";

        String checkInDate = "";
        String stayLength = "";
        String firstName = "";
        String lastName = "";
        String fullName = "";

        String chainCode = "";
        String hotelCode = "";
        String companyName = "";
        String address = "";
        String phoneNumber = "";
        String loyaltyProgram = "";
        String pmsId = "";
        String email = "";
        String groupCode = "";
        int totalGuest = 0;
        int totalAdults = 0;
        int totalChildren = 0;

        String planCode = "";
        String reservationStatusType = "";

        try {
            objReservation = new Reservation();
            objRoomAllocation = new ReservationRoomAllocation();
            obRoomRatesList = new ArrayList<>();
            obRoomAllocationsList = new ArrayList<ReservationRoomAllocation>();
            objRoomType = new RoomType();
            objStringBuffer = new StringBuffer();

            if (isReservation()) {

                StreamSource xmlContentBytes = new StreamSource(new StringReader(oxiRequest));
                JAXBContext context = JAXBContext.newInstance(com.keypr.pms.micros.ows.jaxb.reservation.Reservation.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                unmarshaller.setSchema(null);

                JAXBElement<com.keypr.pms.micros.ows.jaxb.reservation.Reservation> root = unmarshaller.unmarshal(xmlContentBytes, com.keypr.pms.micros.ows.jaxb.reservation.Reservation.class);
                com.keypr.pms.micros.ows.jaxb.reservation.Reservation oxiReservation = root.getValue();

                reservationAction = oxiReservation.getMfReservationAction().value();

                if (reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_NEW)) {
                    confirmationNumber = oxiReservation.getReservationID();
                } else if (reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_CHECK_IN) || reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_CHECK_OUT)) {
                    confirmationNumber = oxiReservation.getConfirmationID();
                }

                if (oxiReservation.getRoomStays() != null &&
                        oxiReservation.getRoomStays().getRoomStay() != null) {
                    RoomStay roomStay = oxiReservation.getRoomStays().getRoomStay().get(0);
                    if (roomStay.getInventoryBlockCode() != null){
                        groupCode = roomStay.getInventoryBlockCode();
                    }
                    if (roomStay.getRatePlans() != null) {
                        List<RatePlan> ratePlan = roomStay.getRatePlans().getRatePlan();
                        if (ratePlan != null) {
                            objRoomRate = new RoomRate();
                            obRoomRatesList.add(objRoomRate);

                            planCode = ratePlan.get(0).getRatePlanCode();
                            objRoomRate.setPlanCode(planCode);

                            ratePlan.get(0).getRates().getRate().get(0).getAmount();
                            for (Rate rate : ratePlan.get(0).getRates().getRate()) {
                                objRoomRate.setBaseAmount(new Double(rate.getAmount().getValueNum().toString()));

                                Date effectiveDate = rate.getTimeSpan().getStartTime().toGregorianCalendar().getTime();
                                Date endDate = null;

                                int duration = rate.getTimeSpan().getNumberOfTimeUnits();
                                if (rate.getTimeSpan().getTimeUnitType() == TimeUnitType.DAY) {
                                    endDate = DateUtils.addDays(effectiveDate, duration);

                                } else {
                                    log.debug("populateReservation: Unknown time unit::: {}", rate.getTimeSpan().getTimeUnitType().toString());
                                }

                                objRoomRate.setEffectiveDate(effectiveDate.toString());
                                objRoomRate.setExpirationDate(endDate.toString());
                            }
                        }
                    }
                }

                // Retrieving reservationStatusType whether it is reserved, check in or canceled...
                if (oxiReservation.getRoomStays() != null &&
                        oxiReservation.getRoomStays().getRoomStay() != null) {
                    RoomStay roomStay = oxiReservation.getRoomStays().getRoomStay().get(0);
                    reservationStatusType = roomStay.getReservationStatusType().value();
                    reservationSource = roomStay.getMfsourceCode();

                    if (roomStay.getRoomID() != null) {
                        objRoomAllocation.setRoomNo(roomStay.getRoomID());
                    }
                }

                // Retrieving Comments of the Reservation. (Note, this does not retrieve the profile comments.
                // Only reservation comments. Or comments that have been automatically copied from the profile to
                // the reservation by OPERA during the reservation creation.
                if (oxiReservation.getResComments() != null &&
                        oxiReservation.getResComments().getResComment() != null) {

                    for (ResComment comment : oxiReservation.getResComments().getResComment()) {
                        objStringBuffer.append(comment.getComment()).append(" ; ");
                    }
                    objReservation.setNotes(objStringBuffer.toString());
                    objStringBuffer.delete(0, objStringBuffer.length());
                }

                checkInDate = DataUtility.parseDate(oxiReservation.getStayDateRange().getStartTime().toGregorianCalendar().getTime());
                stayLength = oxiReservation.getStayDateRange().getNumberOfTimeUnits().toString();

                // Processes the 'Reservation' special requests. Only reservation special requests are processed
                // not any requests that are on the Profile and OPERA has not bought over to the reservation.
                String specialRequests = "";
                if (oxiReservation.getSpecialRequests() != null &&
                        oxiReservation.getSpecialRequests().getSpecialRequest() != null) {
                    for (SpecialRequest reservationSpecialRequest : oxiReservation.getSpecialRequests().getSpecialRequest()) {
                        if (specialRequests.equals("")) {
                            specialRequests = reservationSpecialRequest.getRequestCode() + "-" + reservationSpecialRequest.getRequestComments();
                        } else {
                            specialRequests += ";" + reservationSpecialRequest.getRequestCode() + "-" + reservationSpecialRequest.getRequestComments();
                        }
                    }
                }
                // Retrieve room code
                String roomCode = oxiReservation.getRoomStays().getRoomStay().get(0).getRoomInventoryCode();
                objRoomType.setCode(roomCode);
                objRoomAllocation.setRoomType(objRoomType);

                log.debug("populateReservation: Room code ::: {}", roomCode);

                if (oxiReservation.getHotelReference() != null) {
                    hotelCode = oxiReservation.getHotelReference().getHotelCode();
                    chainCode = oxiReservation.getHotelReference().getChainCode();
                }

                //For  Reservation ID.
                pmsId = oxiReservation.getReservationID();

                // For Guest Count .
                if (oxiReservation.getGuestCounts() != null &&
                        oxiReservation.getGuestCounts().getGuestCount() != null) {
                    for (GuestCount guestCount : oxiReservation.getGuestCounts().getGuestCount()) {
                        if (guestCount.getAgeQualifyingCode().equals("ADULT")) {
                            totalAdults += guestCount.getMfCount();
                        } else if (guestCount.getAgeQualifyingCode().equals("CHILD")) {
                            totalChildren += guestCount.getMfCount();
                        }
                    }
                }

                totalGuest = totalAdults + totalChildren;
                boolean guestProfileFound = false;

                for (ResProfile mainProfile : oxiReservation.getResProfiles().getResProfile()) {

                    Profile profile = mainProfile.getProfile();
                    if (profile == null)
                        continue;

                    if (profile.getProfileType() == ProfileType.GUEST &&
                            !guestProfileFound) {

                        guestProfileFound = true;

                        GuestProfileParser guestProfileParser = new GuestProfileParser(loyaltyNumber, firstName, lastName, address, phoneNumber, loyaltyProgram, email, profile).invoke();
                        loyaltyNumber = guestProfileParser.getLoyaltyNumber();
                        loyaltyProgram = guestProfileParser.getLoyaltyProgram();
                        fullName = guestProfileParser.getFullName();
                        address = guestProfileParser.getAddress();
                        phoneNumber = guestProfileParser.getPhoneNumber();
                        email = guestProfileParser.getEmail();
                        firstName = guestProfileParser.getFirstName();
                        lastName = guestProfileParser.getLastName();
                    } else if (profile.getProfileType() == ProfileType.CORPORATE){
                        if (profile.getIndividualName() != null )
                        {
                            if (profile.getIndividualName().getNameSur() != null)
                            {
                                companyName = profile.getIndividualName().getNameSur();
                            }
                        }
                    }
                }

                // Populate reservation instance with oxi reservation data.
                objReservation.setAffilateId(IMicrosHarvester.OXI_AFFILATE_ID);
                objReservation.setHotelCode(hotelCode);
                objReservation.setChainCode(chainCode);
                objReservation.setConfirmationNumber(confirmationNumber);
                objReservation.setCreditCardNumber(creditCardNumber);
                objReservation.setReservationSource(reservationSource);
                objReservation.setLoyaltyNumber(loyaltyNumber);
                objReservation.setLoyaltyProgram(loyaltyProgram);
                objReservation.setCheckinDate(checkInDate);
                objReservation.setCheckoutDate(DataUtility.getEndDate(checkInDate, Integer.parseInt(stayLength), "DAY"));
                objReservation.setStayLength(Integer.parseInt(stayLength));
                objReservation.setPmsReservationId(pmsId);
                objReservation.setNumberOfGuests(totalGuest);
                objReservation.setNumberOfAdults(totalAdults);
                objReservation.setNumberOfChildren(totalChildren);
	            // TODO: Re-enable address parsing once reservation model is re-done
//                objReservation.setAddress(objectMapper.readValue(address, StreetAddress.class));
                objReservation.setPhoneNumber(phoneNumber);
                objReservation.setCompany(companyName);
                objRoomAllocation.setRoomRateList(obRoomRatesList);
                obRoomAllocationsList.add(objRoomAllocation);
                objReservation.setReservationRoomAllocationList(obRoomAllocationsList);
                objReservation.setEmail(email);
                objReservation.setMessage(specialRequests);
                objReservation.setFirstName(firstName);
                objReservation.setLastName(lastName);
                objReservation.setReservationStatus(reservationStatusType);
                objReservation.setGroup(groupCode);
            } else {
                log.debug("populateReservation: Not Reservation ");
            }

        } catch (
                Exception exc
                )

        {

            log.error(" populateReservation ", exc);
        }

        log.debug("populateReservation: Exit populateReservation method. ");

        return objReservation;

    }

    /**
     * Parses the document if it is Rtav
     *
     * @return
     */
    public Rtav populateRtav(String oxiRequest) {

        log.debug("populateRtav: Enter populateRtav method. ");

        Rtav objRtav = new Rtav();
        try {
            if (isRtav()) {
                StreamSource xmlContentBytes = new StreamSource(new StringReader(oxiRequest));
                JAXBContext context = JAXBContext.newInstance(RtavMessage.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                unmarshaller.setSchema(null);

                JAXBElement<RtavMessage> root = unmarshaller.unmarshal(xmlContentBytes, RtavMessage.class);
                RtavMessage oxiRtavMessage = root.getValue();

                objRtav.setHotelCode(oxiRtavMessage.getHotelReference().getHotelCode());
                if (oxiRtavMessage.getDailyInventories() != null &&
                        oxiRtavMessage.getDailyInventories().getDailyInventory() != null) {

                    ArrayList<DailyInventory> dailyInventories = new ArrayList<>();
                    objRtav.setDailyInventories(dailyInventories);

                    for (com.keypr.pms.micros.ows.jaxb.rtav.DailyInventory dailyInventory : oxiRtavMessage.getDailyInventories().getDailyInventory()) {
                        DailyInventory objDailyInventory = new DailyInventory();
                        objRtav.getDailyInventories().add(objDailyInventory);

                        objDailyInventory.setInventoryDate(dailyInventory.getDatum().toGregorianCalendar().getTime());
                        objDailyInventory.setHouseOverbook(dailyInventory.getHouseOverbook());
                        objDailyInventory.setOutOfOrder(dailyInventory.getOutOfOrder());
                        objDailyInventory.setPhysicalRooms(dailyInventory.getPhysicalRooms());

                        if (dailyInventory.getRoomTypeInventories() != null &&
                                dailyInventory.getRoomTypeInventories().getRoomTypeInventory() != null) {
                            objDailyInventory.setRoomTypeInventories(new ArrayList<com.cloudkey.commons.RoomTypeInventory>());
                            for (RoomTypeInventory roomTypeInventory : dailyInventory.getRoomTypeInventories().getRoomTypeInventory()) {
                                com.cloudkey.commons.RoomTypeInventory objRoomTypeInventory = new com.cloudkey.commons.RoomTypeInventory();
                                objDailyInventory.getRoomTypeInventories().add(objRoomTypeInventory);

                                objRoomTypeInventory.setTotalRooms(roomTypeInventory.getPhysicalRooms());

                                RoomType roomType = new RoomType();
                                roomType.setCode(roomTypeInventory.getRoomType());
                                objRoomTypeInventory.setRoomType(roomType);

                                objRoomTypeInventory.setTotalRoomsAvailable(roomTypeInventory.getAvailable());
                            }
                        }
                    }
                }


            } else {
                log.debug("populateRtav: Not Rtav ");
            }
        } catch (Exception exc) {
            log.error(" populateRtav ", exc);
        }

        log.debug("populateRtav: Exit populateRtav method. ");

        return objRtav;

    }


    private class GuestProfileParser {
        private String loyaltyNumber;
        private String firstName;
        private String lastName;
        private String address;
        private String phoneNumber;
        private String loyaltyProgram;
        private String email;
        private Profile profile;
        private String fullName;

        public GuestProfileParser(String loyaltyNumber, String firstName, String lastName, String address, String phoneNumber, String loyaltyProgram, String email, Profile profile) {
            this.loyaltyNumber = loyaltyNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.loyaltyProgram = loyaltyProgram;
            this.email = email;
            this.profile = profile;
        }

        public String getLoyaltyNumber() {
            return loyaltyNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFullName() {
            return fullName;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getLoyaltyProgram() {
            return loyaltyProgram;
        }

        public String getEmail() {
            return email;
        }

        public GuestProfileParser invoke() {
            if (profile.getIndividualName() != null) {
                lastName = profile.getIndividualName().getNameSur();
                firstName = profile.getIndividualName().getNameFirst();
            }

            if (profile.getPostalAddresses() != null) {
                List<PostalAddress> postalAddresses = profile.getPostalAddresses().getPostalAddress();
                if (postalAddresses.size() > 0) {
                    for (PostalAddress postalAddress : postalAddresses) {
                        if (postalAddress.getMfPrimaryYN().equals("Y")) {

                            String address_lines = postalAddress.getAddress1();
                            if (postalAddress.getAddress2() != null) {
                                address_lines += ',' + postalAddress.getAddress2();
                            }

                            if (postalAddress.getAddress3() != null) {
                                address_lines += ',' + postalAddress.getAddress3();
                            }

                            address = postalAddress.getAddressType()
                                    + ";" + address_lines
                                    + ";" + postalAddress.getCity()
                                    + ";" + postalAddress.getStateCode()
                                    + ";" + postalAddress.getPostalCode()
                                    + ";" + postalAddress.getPostalCodeExt()
                                    + ";" + postalAddress.getCountryCode();
                        }
                        break;
                    }
                }
            }


            // To set full name.
            if (firstName != null && lastName != null) {
                fullName = firstName.concat("," + lastName);
            } else if (firstName != null) {
                fullName = firstName;
            } else if (lastName != null) {
                fullName = lastName;
            } else {
                fullName = "";
            }

            if (profile.getMemberships() != null &&
                    profile.getMemberships().getMembership() != null) {

                //TODO: Perhaps need to allow for more than one membership here.
                for (Membership membership : profile.getMemberships().getMembership()) {
                    if (membership.getDisplaySequence() == 1) {
                        loyaltyProgram = membership.getProgramCode();
                        loyaltyNumber = membership.getAccountID();
                        break;
                    }
                }
            }

            if (profile.getPhoneNumbers() != null &&
                    profile.getPhoneNumbers().getPhoneNumber() != null) {
                for (PhoneNumber oxiPhone : profile.getPhoneNumbers().getPhoneNumber()) {
                    if (phoneNumber.equals("")) {
                        phoneNumber += oxiPhone.getPhoneNumber();
                    } else {
                        phoneNumber += ";" + oxiPhone.getPhoneNumber();
                    }
                }
            }

            if (profile.getElectronicAddresses() != null &&
                    profile.getElectronicAddresses().getElectronicAddress() != null) {
                for (ElectronicAddress electronicAddress : profile.getElectronicAddresses().getElectronicAddress()) {
                    if (email.equals("")) {
                        email = electronicAddress.getEAddress();
                    } else {
                        email += ";" + electronicAddress.getEAddress();
                    }
                }
            }
            return this;
        }
    }
}
