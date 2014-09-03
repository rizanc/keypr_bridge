package com.micros.harvester.util;

import com.cloudkey.commons.*;
import com.keypr.pms.micros.oxi.jaxb.profile.*;
import com.keypr.pms.micros.oxi.jaxb.profile.Membership;
import com.keypr.pms.micros.oxi.jaxb.reservation.*;
import com.keypr.pms.micros.oxi.jaxb.reservation.SpecialRequest;
import com.keypr.pms.micros.oxi.jaxb.rtav.RoomTypeInventory;
import com.keypr.pms.micros.oxi.jaxb.rtav.RtavMessage;
import com.micros.harvester.constant.IMicrosHarvester;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class contains the parser logic for reservation using xpath.
 *
 * @author niveditat
 */
public class OXIParser {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * The parsed document
     */
    private Document document;

    public OXIParser(String oxiRequest) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        document = docBuilder.parse(IOUtils.toInputStream(oxiRequest));
    }

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
        return (NodeList) xPath.compile(expression).evaluate(document, XPathConstants.NODESET);
    }

    public com.cloudkey.commons.Reservation populateReservation(com.keypr.pms.micros.oxi.jaxb.reservation.Reservation oxiReservation) {

        log.debug("populateReservation: Enter populateReservation method. ");

        ReservationRoomAllocation objRoomAllocation = null;
        com.cloudkey.commons.Reservation objReservation = null;
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

        LocalDate checkInDate;
        Integer stayLength;
        String firstName = "";
        String lastName = "";

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
            objReservation = new com.cloudkey.commons.Reservation();
            objRoomAllocation = new ReservationRoomAllocation();
            obRoomRatesList = new ArrayList<>();
            obRoomAllocationsList = new ArrayList<ReservationRoomAllocation>();
            objRoomType = new RoomType();
            objStringBuffer = new StringBuffer();

            reservationAction = oxiReservation.getMfReservationAction().value();

            if (reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_NEW)) {
                confirmationNumber = oxiReservation.getReservationID();
            } else if (reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_CHECK_IN) || reservationAction.equalsIgnoreCase(IMicrosHarvester.RESERVATION_TYPE_CHECK_OUT)) {
                confirmationNumber = oxiReservation.getConfirmationID();
            }

            if (!oxiReservation.getRoomStays().isEmpty()) {
                RoomStay roomStay = oxiReservation.getRoomStays().get(0);
                if (roomStay.getInventoryBlockCode() != null) {
                    groupCode = roomStay.getInventoryBlockCode();
                }
                if (roomStay.getRatePlans() != null) {
                    List<RatePlan> ratePlan = roomStay.getRatePlans();
                    if (!ratePlan.isEmpty()) {
                        objRoomRate = new RoomRate();
                        obRoomRatesList.add(objRoomRate);

                        planCode = ratePlan.get(0).getRatePlanCode();
                        objRoomRate.setPlanCode(planCode);

                        for (Rate rate : ratePlan.get(0).getRates()) {
                            objRoomRate.setBaseAmount(rate.getAmount().getValueNum());

                            Date effectiveDate = rate.getTimeSpan().getStartTime().toGregorianCalendar().getTime();
                            Date endDate = null;

                            int duration = rate.getTimeSpan().getNumberOfTimeUnits();
                            if (rate.getTimeSpan().getTimeUnitType() == TimeUnitType.DAY) {
                                endDate = DateUtils.addDays(effectiveDate, duration);

                            } else {
                                log.debug("populateReservation: Unknown time unit::: {}", rate.getTimeSpan().getTimeUnitType().toString());
                            }

                            objRoomRate.setEffectiveDate(new DateTime(effectiveDate));
                            objRoomRate.setExpirationDate(new DateTime(endDate));
                        }
                    }
                }
            }

            // Retrieving reservationStatusType whether it is reserved, check in or canceled...
            if (!oxiReservation.getRoomStays().isEmpty()) {
                RoomStay roomStay = oxiReservation.getRoomStays().get(0);
                reservationStatusType = roomStay.getReservationStatusType().value();
                reservationSource = roomStay.getMfsourceCode();

                if (roomStay.getRoomID() != null) {
                    objRoomAllocation.setRoomNo(roomStay.getRoomID());
                }
            }

            // Retrieving Comments of the Reservation. (Note, this does not retrieve the profile comments.
            // Only reservation comments. Or comments that have been automatically copied from the profile to
            // the reservation by OPERA during the reservation creation.
            if (!oxiReservation.getResComments().isEmpty()) {
                for (ResComment comment : oxiReservation.getResComments()) {
                    objStringBuffer.append(comment.getComment()).append(" ; ");
                }
                objReservation.setNotes(objStringBuffer.toString());
                objStringBuffer.delete(0, objStringBuffer.length());
            }

            checkInDate = new LocalDate(oxiReservation.getStayDateRange().getStartTime().toGregorianCalendar().getTimeInMillis());
            stayLength = oxiReservation.getStayDateRange().getNumberOfTimeUnits();

            // Processes the 'Reservation' special requests. Only reservation special requests are processed
            // not any requests that are on the Profile and OPERA has not bought over to the reservation.
            String specialRequests = "";
            if (!oxiReservation.getSpecialRequests().isEmpty()) {
                for (SpecialRequest reservationSpecialRequest : oxiReservation.getSpecialRequests()) {
                    if (specialRequests.equals("")) {
                        specialRequests = reservationSpecialRequest.getRequestCode() + "-" + reservationSpecialRequest.getRequestComments();
                    } else {
                        specialRequests += ";" + reservationSpecialRequest.getRequestCode() + "-" + reservationSpecialRequest.getRequestComments();
                    }
                }
            }
            // Retrieve room code
            String roomCode = oxiReservation.getRoomStays().get(0).getRoomInventoryCode();
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
            if (!oxiReservation.getGuestCounts().isEmpty()) {
                for (GuestCount guestCount : oxiReservation.getGuestCounts()) {
                    if (guestCount.getAgeQualifyingCode().equals("ADULT")) {
                        totalAdults += guestCount.getMfCount();
                    } else if (guestCount.getAgeQualifyingCode().equals("CHILD")) {
                        totalChildren += guestCount.getMfCount();
                    }
                }
            }

            totalGuest = totalAdults + totalChildren;
            boolean guestProfileFound = false;

            for (ResProfile mainProfile : oxiReservation.getResProfiles()) {

                Profile profile = mainProfile.getProfile();
                if (profile == null)
                    continue;

                if (profile.getProfileType() == ProfileType.GUEST &&
                        !guestProfileFound) {

                    guestProfileFound = true;

                    GuestProfileParser guestProfileParser = new GuestProfileParser(loyaltyNumber, firstName, lastName, address, phoneNumber, loyaltyProgram, email, profile).invoke();
                    loyaltyNumber = guestProfileParser.getLoyaltyNumber();
                    loyaltyProgram = guestProfileParser.getLoyaltyProgram();
                    address = guestProfileParser.getAddress();
                    phoneNumber = guestProfileParser.getPhoneNumber();
                    email = guestProfileParser.getEmail();
                    firstName = guestProfileParser.getFirstName();
                    lastName = guestProfileParser.getLastName();
                } else if (profile.getProfileType() == ProfileType.CORPORATE) {
                    if (profile.getIndividualName() != null) {
                        if (profile.getIndividualName().getNameSur() != null) {
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
            objReservation.setCheckoutDate(checkInDate.plusDays(stayLength));
            objReservation.setStayLength(stayLength);
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
        } catch (Exception exc) {
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
    public Rtav populateRtav(RtavMessage oxiRtavMessage) {

        log.debug("populateRtav: Enter populateRtav method. ");

        Rtav objRtav = new Rtav();
        try {

            objRtav.setHotelCode(oxiRtavMessage.getHotelReference().getHotelCode());
            if (!oxiRtavMessage.getDailyInventories().isEmpty()) {

                ArrayList<DailyInventory> dailyInventories = new ArrayList<>();
                objRtav.setDailyInventories(dailyInventories);

                for (com.keypr.pms.micros.oxi.jaxb.rtav.DailyInventory dailyInventory : oxiRtavMessage.getDailyInventories()) {
                    DailyInventory objDailyInventory = new DailyInventory();
                    objRtav.getDailyInventories().add(objDailyInventory);

                    objDailyInventory.setInventoryDate(dailyInventory.getDatum());
                    objDailyInventory.setHouseOverbook(dailyInventory.getHouseOverbook());
                    objDailyInventory.setOutOfOrder(dailyInventory.getOutOfOrder());
                    objDailyInventory.setPhysicalRooms(dailyInventory.getPhysicalRooms());

                    if (!dailyInventory.getRoomTypeInventories().isEmpty()) {
                        objDailyInventory.setRoomTypeInventories(new ArrayList<com.cloudkey.commons.RoomTypeInventory>());
                        for (RoomTypeInventory roomTypeInventory : dailyInventory.getRoomTypeInventories()) {
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
                List<PostalAddress> postalAddresses = profile.getPostalAddresses();
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

            //TODO: Perhaps need to allow for more than one membership here.
            for (Membership membership : profile.getMemberships()) {
                if (membership.getDisplaySequence() == 1) {
                    loyaltyProgram = membership.getProgramCode();
                    loyaltyNumber = membership.getAccountID();
                    break;
                }
            }

            for (PhoneNumber oxiPhone : profile.getPhoneNumbers()) {
                if (phoneNumber.equals("")) {
                    phoneNumber += oxiPhone.getPhoneNumber();
                } else {
                    phoneNumber += ";" + oxiPhone.getPhoneNumber();
                }
            }

            for (ElectronicAddress electronicAddress : profile.getElectronicAddresses()) {
                if (email.equals("")) {
                    email = electronicAddress.getEAddress();
                } else {
                    email += ";" + electronicAddress.getEAddress();
                }
            }
            return this;
        }
    }
}
