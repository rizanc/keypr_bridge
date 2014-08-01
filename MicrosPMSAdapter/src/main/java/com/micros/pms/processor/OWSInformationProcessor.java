package com.micros.pms.processor;

import com.cloudkey.commons.Restaurants;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.information.HotelInformationRequest;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponse;
import com.cloudkey.pms.micros.ows.information.HotelInformation_type0;
import com.cloudkey.pms.micros.services.InformationServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosOWSParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSInformationProcessor {

    final static String URL_INFORMATION = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Information.asmx";

    public com.cloudkey.pms.response.hotels.HotelInformationResponse processHotelInformation(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) throws RemoteException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processHotelInformation ", " Enter processHotelInformation method. ");

        InformationServiceStub informationStub = getInformationServiceStub();

	    HotelInformationRequest req = getHotelInformationRequestObject(hotelInformationRequest);

        OGHeaderE ogh = getHeaderE();

        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                AdapterUtility.convertToStreamXML(req));
        HotelInformationResponse resp = informationStub.queryHotelInformation(req, ogh);
        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                AdapterUtility.convertToStreamXML(resp));

	    com.cloudkey.pms.response.hotels.HotelInformationResponse response = getHotelInformationResponseObject(resp);
	    MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    //TODO: Chain required.
    private HotelInformationRequest getHotelInformationRequestObject(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) {
	    HotelInformationRequest request = new HotelInformationRequest();

        HotelReference defaultHotelReference = getDefaultHotelReference();
        defaultHotelReference.setHotelCode(hotelInformationRequest.getHotelCode());

        request.setHotelInformationQuery(defaultHotelReference);

        return request;
    }

    private com.cloudkey.pms.response.hotels.HotelInformationResponse _getHotelInformationResponseObject(HotelInformationResponse objHotelInformationResponse) {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " Enter getHotelInformationResponseObject method ");

	    com.cloudkey.pms.response.hotels.HotelInformationResponse objHotelInformationResponse2 = null;

        String result = null;
        String contactEmail = " ";
        String phoneNo = " ";
        String addressLine = " ";
        String cityName = " ";
        String countryCode = " ";
        String postalCode = " ";
        String fax = " ";
        String hotelName = " ";
        String notes = " ";
        String checkinTime = "";
        String checkoutTime = "";
        String roomDesc = "";

        objHotelInformationResponse2 = new com.cloudkey.pms.response.hotels.HotelInformationResponse();

        result = objHotelInformationResponse.getResult().getResultStatusFlag().toString();
        hotelName = objHotelInformationResponse.getHotelInformation().getHotelInformation().getString();

        objHotelInformationResponse2.setStatus(result);
        //objHotelInformationResponse2.setResult(result);
        objHotelInformationResponse2.setHotelName(hotelName);

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " ResultStatus Set to the response ");

	    HotelInformation_type0 hotelInformation = objHotelInformationResponse.getHotelInformation();
	    HotelContact objContact = hotelInformation.getHotelContactInformation();

        //populate  contactEmail details
        ContactEmailList objEmailList = objContact.getContactEmails();
        Email[] emailObj = objEmailList.getContactEmail();

        int emailLength = emailObj.length;
        String emails = "";

        for (int emailIndex = 0; emailIndex < emailLength; emailIndex++) {

            Email mail = emailObj[emailIndex];
            contactEmail = mail.toString();
            emails.concat(" ").concat(contactEmail);
        }
        objHotelInformationResponse2.setContactEmails(emails);

		/* populate  contact phone list */
        Phone[] phoneObj = objContact.getContactPhones().getPhone();

        int phoneLength = phoneObj.length;
        String phoneNumbers = " ";
        String faxs = " ";

        //TODO: Fix
       /* for( int phoneIndex = 0; phoneIndex < phoneLength; phoneIndex ++ ) {

            String textValue =  phoneObj[phoneIndex].getPhoneRole();

            if(textValue.equalsIgnoreCase("PHONE")) {

                String AreaCode = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getAreaCode();
                String phoneNumber = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getPhoneNumber();
                String extension = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneData().getExtension();

                phoneNo = "AreaCode : ".concat(AreaCode).concat(" Number : ").concat(phoneNumber).concat(" Ext : ").concat(extension);
                phoneNumbers.concat(phoneNo).concat("   ");
            }

            if(textValue.equalsIgnoreCase("FAX")) {

                fax = phoneObj[phoneIndex].getPhoneChoice_type0().getPhoneNumber();
                faxs.concat(fax).concat(" ");
            }

        }*/
        objHotelInformationResponse2.setFax(faxs);
        objHotelInformationResponse2.setContactPhones(phoneNumbers);

		/* populate addresslist  */
        Address[] objAddress = objContact.getAddresses().getAddress();

        int addressLength = objAddress.length;

        for (int addressIndex = 0; addressIndex < addressLength; addressIndex++) {

            Address objAdd = objAddress[addressIndex];

            cityName = objAdd.getCityName();
            addressLine = objAdd.getAddressLine()[0];
            countryCode = objAdd.getCountryCode();
            postalCode = objAdd.getPostalCode();
        }
        objHotelInformationResponse2.setCity(cityName);
        objHotelInformationResponse2.setAddress(addressLine);
        objHotelInformationResponse2.setCountry(countryCode);
        objHotelInformationResponse2.setPostalCode(postalCode);

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " Hotel Contact added to the Hotel Information property ");

        //TODO: Fix
        /*populate attraction details for note */
/*        Attraction_type0[] objAttraction_type0 = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getAttractions().getAttraction();
        int attractionTypeLength = objAttraction_type0.length;

        for( int attractionTypeIndex = 0; attractionTypeIndex < attractionTypeLength; attractionTypeIndex++ ) {

            String attractionName = objAttraction_type0[attractionTypeIndex].getAttractionName();
            AttractionInfo[] objAttractionInfo = objAttraction_type0[attractionTypeIndex].getAttractionInformation().getAttractionInfo();

            int attractionInfoLength = objAttractionInfo.length;
            String info= " ";
            String attractionInformation =" ";
            for(int attractionInfoIndex = 0 ; attractionInfoIndex < attractionInfoLength; attractionInfoIndex++ ) {

                info = objAttractionInfo[attractionInfoIndex].getAttractionInfoType().getValue();
                attractionInformation.concat(info).concat(" ");
            }

            notes = attractionName.concat("  ").concat(attractionInformation);
        }

        objHotelInformationResponse2.setNotes(notes);

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getHotelInformationResponseObject ", " NOTES added to the sucessfully " );*/

		/* populate check in and checkout info details.*/
        //TODO: Fix
/*        HotelInfo[] objHotelInfo1 = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getHotelInformation().getHotelInfo();

        int hotelInfoLength = objHotelInfo1.length;

        for( int hotelInfoIndex = 0; hotelInfoIndex < hotelInfoLength; hotelInfoIndex++ ) {

            String textValue =  objHotelInfo1[hotelInfoIndex].getHotelInfoType().getValue();

            if(textValue.equalsIgnoreCase(objHotelInfo1[hotelInfoIndex].getHotelInfoType()._CHECKININFO)) {

               TextElementList objText = objHotelInfo1[hotelInfoIndex].getDescriptiveTextChoice_type0().getText();
                TextElement[] objTextElement = objText.getTextElement();

                int textElementLength = objTextElement.length;

                for( int textIndex = 0; textIndex<textElementLength; textIndex++ ) {

                    String textElementValue = objTextElement[textIndex].toString();
                    checkinTime.concat( textElementValue ).concat( " ");
                }
            }

            if(textValue.equalsIgnoreCase(objHotelInfo1[hotelInfoIndex].getHotelInfoType()._CHECKOUTINFO)) {

                TextElementList objText = objHotelInfo1[hotelInfoIndex].getDescriptiveTextChoice_type0().getText();
                TextElement[] objTextElement = objText.getTextElement();

                int textElementLength = objTextElement.length;

                for(int textIndex = 0; textIndex<textElementLength; textIndex++) {

                    String textElementValue = objTextElement[textIndex].toString();
                    checkoutTime.concat(textElementValue).concat(" ");
                }
            }
        }*/

        objHotelInformationResponse2.setCheckInTime(checkinTime);
        objHotelInformationResponse2.setCheckOutTime(checkoutTime);

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " CHECKININFO AND CHECKOUTINFO added to the sucessfully ");

        //TODO: FIx
        /*  populate details information of restaurants type */
/*
        RestaurantsTypeRestaurant[] objRestaurantsTypeRestaurant = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getRestaurants().getRestaurant();
        List<com.cloudkey.commons.Restaurants> restaurantList = objHotelInformationResponse2.getRestaurantsList();

        if(restaurantList == null ) {

            restaurantList = new ArrayList<com.cloudkey.commons.Restaurants>();
        }

        int resturantTypeLength =objRestaurantsTypeRestaurant.length;
        com.cloudkey.commons.Restaurants obRestaurants = null;

        for(int resturantTypeIndex=0; resturantTypeIndex < resturantTypeLength; resturantTypeIndex++) {

            obRestaurants = new com.cloudkey.commons.Restaurants() ;
            obRestaurants.setName(objRestaurantsTypeRestaurant[resturantTypeIndex].getRestaurantName());

            Paragraph[] objParagraph = objRestaurantsTypeRestaurant[resturantTypeIndex].getRestaurantDescription();

            int paragraphlength = objParagraph.length;

            for(int paragraphIndex = 0;paragraphIndex<paragraphlength;paragraphIndex++ ) {

                ParagraphChoice_type0[] objParagraphChoice_type0 = objParagraph[paragraphIndex].getParagraphChoice_type0();

                int paragraphChoiceLength = objParagraphChoice_type0.length;
                String restaruantDesc = " ";
                String desc = " ";

                for(int paragraphChoiceIndex = 0 ;paragraphChoiceIndex <paragraphChoiceLength; paragraphChoiceIndex ++) {

                    Text objType0 = objParagraphChoice_type0[paragraphChoiceIndex].getText();
                    NormalizedString objNormalizedString = objType0.getNormalizedString();

                    desc = objNormalizedString.toString();
                    restaruantDesc.concat(desc).concat(" ");

                    obRestaurants.setDescription(restaruantDesc);
                }
            }

            RestaurantsTypeRestaurantCuisine[] objTypeRestaurantCuisine = objRestaurantsTypeRestaurant[resturantTypeIndex].getCuisines().getCuisine();

            int restaurantCuisinelength = objTypeRestaurantCuisine.length;
            String cusisine = " ";
            String cuisines = " ";

            for( int restaurantCuisineIndex = 0; restaurantCuisineIndex < restaurantCuisinelength; restaurantCuisineIndex++ ) {

                cusisine = objTypeRestaurantCuisine[restaurantCuisineIndex].getDescription();
                cuisines.concat(cusisine).concat(" ");

                obRestaurants.setCuisine(cuisines);
                restaurantList.add(obRestaurants);
            }

        }

        objHotelInformationResponse2.setRestaurantsList(restaurantList);

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getHotelInformationResponseObject ", " RESTAURANTLIST added to the sucessfully " );
*/

		/* populate guestRoom information */

        //TODO: Fix
/*
        FacilityInfoTypeGuestRoomsGuestRoom[] objFacilityInfoTypeGuestRoomsGuestRoom = objHotelInformationResponseHotelInformation.getHotelExtendedInformation().getFacilityInfo().getGuestRooms().getGuestRoom();

        List<com.cloudkey.commons.RoomType> roomList = objHotelInformationResponse2.getRoomTypeList();

        if(roomList == null ){

            roomList = new ArrayList<com.cloudkey.commons.RoomType>();
        }

        int FacilityinfoTypeGuestRoomLength = objFacilityInfoTypeGuestRoomsGuestRoom.length;
        com.cloudkey.commons.RoomType roomType =  null;

        for( int facilityInfoTypeGuestRoomindex = 0 ; facilityInfoTypeGuestRoomindex < FacilityinfoTypeGuestRoomLength; facilityInfoTypeGuestRoomindex ++) {

            roomType = new com.cloudkey.commons.RoomType();
            roomType.setCode( objFacilityInfoTypeGuestRoomsGuestRoom[facilityInfoTypeGuestRoomindex].getCode() );

            TextElement[] objTextElement = objFacilityInfoTypeGuestRoomsGuestRoom[facilityInfoTypeGuestRoomindex].getRoomDescription().getDescriptiveTextChoice_type0().getText().getTextElement();
            int textElementLength = objTextElement.length;

            for( int textElementIndex = 0; textElementIndex < textElementLength ; textElementIndex ++ ) {

                String textElementValue = objTextElement[textElementIndex].toString();
                roomDesc = roomDesc.concat(textElementValue);
                roomType.setDescription(roomDesc);
                roomList.add(roomType);

            }
        }

        objHotelInformationResponse2.setRoomTypeList(roomList);
*/

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " ROOMLIST added to the sucessfully ");
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getHotelInformationResponseObject ", " Exit getHotelInformationResponseObject method ");

        return objHotelInformationResponse2;
    }

    private com.cloudkey.pms.response.hotels.HotelInformationResponse getHotelInformationResponseObject(HotelInformationResponse hotelInformationResponse) {

        com.cloudkey.pms.response.hotels.HotelInformationResponse response = new com.cloudkey.pms.response.hotels.HotelInformationResponse();

        response.setStatus(hotelInformationResponse.getResult().getResultStatusFlag().toString());
        if (hotelInformationResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(hotelInformationResponse.getResult());
            response.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "getHotelInformationResponseObject ", errorMessage);
            return response;
        }

	    HotelInformation_type0 hotelInformation = hotelInformationResponse.getHotelInformation();
	    HotelReference hotelInformation1 = hotelInformation.getHotelInformation();
        HotelContact hotelContactInformation = hotelInformation.getHotelContactInformation();
        ExtendedHotelInfo hotelExtendedInformation = hotelInformation.getHotelExtendedInformation();

        if (hotelExtendedInformation != null &&
                hotelExtendedInformation.getFacilityInfo() != null &&
                hotelExtendedInformation.getFacilityInfo().getGuestRooms() != null) {
	        GuestRooms_type0 guestRooms = hotelExtendedInformation.getFacilityInfo().getGuestRooms();

	        ArrayList<RoomType> rooms = new ArrayList<>();
            response.setRoomTypeList(rooms);

	        GuestRoom_type0[] roomList = guestRooms.getGuestRoom();
	        if (roomList != null && roomList.length > 0) {

                for (GuestRoom_type0 room_item : roomList) {
                    RoomType roomType = new RoomType();
                    rooms.add(roomType);

                    roomType.setCode(room_item.getCode());

                    //TODO: Test with real data
                    if (room_item.getAmenityInfo() != null &&
                            room_item.getAmenityInfo().getAmenities() != null &&
                            room_item.getAmenityInfo().getAmenities().getAmenity() != null &&
                            room_item.getAmenityInfo().getAmenities().getAmenity().length > 0){
	                    AmenityInfo amenities = room_item.getAmenityInfo();
	                    amenities.getAmenities();
                        String features = "";
                        for (Amenity amenity : amenities.getAmenities().getAmenity())
                        {
                            if (!features.equals(""))
                            {
                                features += " '";
                            }

                            features += amenity.getAmenityCode();
                        }
                        roomType.setFeatures(features);
                    }

                    DescriptiveText descriptiveText = room_item.getRoomDescription();
                    if (descriptiveText != null &&
                            descriptiveText.getText() != null) {

	                    TextList text = descriptiveText.getText();
	                    if (text.getTextElement() != null && text.getTextElement().length > 0) {
                            roomType.setDescription(text.getTextElement()[0].toString());
                        }
                    }
                }
            }
        }
	    
        if (hotelExtendedInformation != null &&
                hotelExtendedInformation.getFacilityInfo() != null &&
                hotelExtendedInformation.getFacilityInfo().getRestaurants() != null) {

            RestaurantsType restaurants = hotelExtendedInformation.getFacilityInfo().getRestaurants();

            List<Restaurants> restaurant_list = new ArrayList<Restaurants>();
            response.setRestaurantsList(restaurant_list);

            for (Restaurant_type0 restaurant : restaurants.getRestaurant()) {

                Restaurants restaurant_item = new Restaurants();
                restaurant_list.add(restaurant_item);
                restaurant_item.setName(restaurant.getRestaurantName());

	            Cuisines_type0 cuisines = restaurant.getCuisines();
	            if (cuisines != null) {
                    String cuisine_all = "";
                    for (Cuisine_type0 cuisine : cuisines.getCuisine()) {
                        if (!cuisine_all.equals("")) {
                            cuisine_all += "|";
                        }
                        cuisine_all += cuisine.getDescription();
                    }
                    restaurant_item.setCuisine(cuisine_all);
                }

                Paragraph[] description = restaurant.getRestaurantDescription();
                if (description != null && description.length > 0) {
                    Paragraph paragraph = description[0];
                    if (paragraph != null) {
	                    ParagraphChoice[] pchoice = paragraph.getParagraphChoice();
	                    if (pchoice != null && pchoice.length > 0) {
		                    ParagraphChoice p1 = pchoice[0];
		                    restaurant_item.setDescription(p1.getText().toString());
                        }
                    }
                }
            }
        }

        response.setHotelName(hotelInformation1.getString());
        PhoneList phones = hotelContactInformation.getContactPhones();
        if (phones != null && phones.getPhone() != null) {
            for (Phone phone : phones.getPhone()) {
                if (phone.getPhoneData() != null &&
                        phone.getPhoneData().getPhoneNumber() != null) {
                    response.setContactPhones(phone.getPhoneData().getPhoneNumber());
                    break;
                }
            }
        }

	    ContactEmailList emails = hotelContactInformation.getContactEmails();
	    if (emails != null && emails.getContactEmail() != null) {
            for (Email email : emails.getContactEmail()) {
                response.setContactEmails(email.getString());
                break;
            }
        }

        AddressList addresses = hotelContactInformation.getAddresses();
        if (addresses != null && addresses.getAddress() != null && addresses.getAddress().length > 0) {
            String addressLine = "";
            Address address = addresses.getAddress()[0];
            if (address != null) {

                if (address.getAddressLine() != null) {
                    for (String line : address.getAddressLine()) {
                        if (!addressLine.isEmpty()) {
                            addressLine += "</br>";
                        }
                        addressLine += line;
                    }
                }
            response.setAddress(addressLine);

                if (address.getCityName() != null) {
                    response.setCity(address.getCityName());
                }

                //TODO: Add State/Prov
                if (address.getStateProv() != null) {
                    //response.setState
                }

                if (address.getPostalCode() != null) {
                    response.setPostalCode(address.getPostalCode());
                }

                if (address.getCountryCode() != null) {
                    response.setCountry(address.getCountryCode());
                }
            }
        }

        return response;
    }

    private InformationServiceStub getInformationServiceStub() {

        if (URL_INFORMATION == null) throw new NullPointerException("Information URL is null");

        InformationServiceStub rstub = null;
        try {
            rstub = new InformationServiceStub(URL_INFORMATION);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "getInformationServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

    private HotelReference getDefaultHotelReference() {
        HotelReference objHotelReference = new HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        OGHeader ogHeader = new OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        EndPoint origin = new EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        EndPoint destination = new EndPoint();
        String destEntityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_DESTINATION_ID);

        destination.setEntityID(destEntityId);
        String destSystemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_DEST_TYPE);
        destination.setSystemType(destSystemType);

        // sets time stamp
        ogHeader.setTimeStamp(AdapterUtility.getCalender());

        // prepares OGHeader
        ogHeader.setOrigin(origin);
        ogHeader.setDestination(destination);

        String username = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_NAME);
        String password = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_PASS);

        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

            Authentication_type0 auth = new Authentication_type0();
            ogHeader.setAuthentication(auth);

            UserCredentials_type0 cred = new UserCredentials_type0();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        OGHeaderE ogHeaderE = new OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(ResultStatus resultStatus) {

        String message = "";
        if (resultStatus instanceof GDSResultStatus) {
            GDSResultStatus gdsResultStatus = (GDSResultStatus) resultStatus;
            if (gdsResultStatus.isGDSErrorSpecified()) {
                message = gdsResultStatus.getGDSError().toString();
            } else if (gdsResultStatus.isTextSpecified()) {
                if (gdsResultStatus.getText() != null &&
                        gdsResultStatus.getText().getTextElement() != null &&
                        gdsResultStatus.getText().getTextElement().length > 0
                        )
                    message = gdsResultStatus.getText().getTextElement()[0].toString();
            }
        } else if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
