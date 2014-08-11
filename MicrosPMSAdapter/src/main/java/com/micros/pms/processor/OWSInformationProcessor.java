package com.micros.pms.processor;

import com.cloudkey.commons.Restaurants;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.micros.og.common.Address;
import com.cloudkey.pms.micros.og.common.DescriptiveText;
import com.cloudkey.pms.micros.og.common.DescriptiveTextChoice_type0;
import com.cloudkey.pms.micros.og.common.Phone;
import com.cloudkey.pms.micros.og.core.OGHeaderE;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.information.*;
import com.cloudkey.pms.micros.services.Information;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSInformationProcessor extends OWSBase {

	@Inject
	protected Information service;

	public com.cloudkey.pms.response.hotels.HotelInformationResponse processHotelInformation(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) throws RemoteException {
        log.debug("processHotelInformation: Enter processHotelInformation method. ");

	    HotelInformationRequest req = getHotelInformationRequestObject(hotelInformationRequest);
	    HotelInformationRequestE requestE = new HotelInformationRequestE();
	    requestE.setHotelInformationRequest(req);

        OGHeaderE ogh = createOGHeaderE();

        log.debug("processHotelInformation",
	        AdapterUtility.convertToStreamXML(req));
        HotelInformationResponseE responseE = service.queryHotelInformation(requestE, ogh);
        log.debug("processHotelInformation",
	        AdapterUtility.convertToStreamXML(responseE));

	    errorIfFailure(responseE.getHotelInformationResponse().getResult());

	    return getHotelInformationResponseObject(responseE.getHotelInformationResponse());
    }

    //TODO: Chain required.
    private HotelInformationRequest getHotelInformationRequestObject(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) {
	    HotelInformationRequest request = new HotelInformationRequest();

	    request.setHotelInformationQuery(getDefaultHotelReference());

        return request;
    }

    private com.cloudkey.pms.response.hotels.HotelInformationResponse _getHotelInformationResponseObject(HotelInformationResponse objHotelInformationResponse) {

        log.debug("getHotelInformationResponseObject: Enter getHotelInformationResponseObject method ");

	    com.cloudkey.pms.response.hotels.HotelInformationResponse objHotelInformationResponse2 = null;

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

        hotelName = objHotelInformationResponse.getHotelInformation().getHotelInformation().getString();

        //objHotelInformationResponse2.setResult(result);
        objHotelInformationResponse2.setHotelName(hotelName);

	    HotelInformationResponseHotelInformation hotelInformation = objHotelInformationResponse.getHotelInformation();
	    HotelContact objContact = hotelInformation.getHotelContactInformation();

        //populate  contactEmail details
        ArrayOfEmail objEmailList = objContact.getContactEmails();
        Email[] emailObj = objEmailList.getContactEmail();

        int emailLength = emailObj.length;
        String emails = "";

	    for (Email mail : emailObj) {

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

	    for (Address objAdd : objAddress) {

		    cityName = objAdd.getCityName();
		    addressLine = objAdd.getAddressLine()[0];
		    countryCode = objAdd.getCountryCode();
		    postalCode = objAdd.getPostalCode();
	    }
        objHotelInformationResponse2.setCity(cityName);
        objHotelInformationResponse2.setAddress(addressLine);
        objHotelInformationResponse2.setCountry(countryCode);
        objHotelInformationResponse2.setPostalCode(postalCode);

        log.debug("getHotelInformationResponseObject: Hotel Contact added to the Hotel Information property ");

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

        log.debug("getHotelInformationResponseObject: NOTES added to the sucessfully " );*/

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

        log.debug("getHotelInformationResponseObject: CHECKININFO AND CHECKOUTINFO added to the sucessfully ");

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

        log.debug("getHotelInformationResponseObject: RESTAURANTLIST added to the sucessfully " );
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

        log.debug("getHotelInformationResponseObject: ROOMLIST added to the sucessfully ");
        log.debug("getHotelInformationResponseObject: Exit getHotelInformationResponseObject method ");

        return objHotelInformationResponse2;
    }

    private com.cloudkey.pms.response.hotels.HotelInformationResponse getHotelInformationResponseObject(HotelInformationResponse hotelInformationResponse) {

        com.cloudkey.pms.response.hotels.HotelInformationResponse response = new com.cloudkey.pms.response.hotels.HotelInformationResponse();

	    HotelInformationResponseHotelInformation hotelInformation = hotelInformationResponse.getHotelInformation();
	    HotelReference hotelInformation1 = hotelInformation.getHotelInformation();
        HotelContact hotelContactInformation = hotelInformation.getHotelContactInformation();
        ExtendedHotelInfo hotelExtendedInformation = hotelInformation.getHotelExtendedInformation();

        if (hotelExtendedInformation != null &&
                hotelExtendedInformation.getFacilityInfo() != null &&
                hotelExtendedInformation.getFacilityInfo().getGuestRooms() != null) {
	        FacilityInfoTypeGuestRooms guestRooms = hotelExtendedInformation.getFacilityInfo().getGuestRooms();

	        ArrayList<RoomType> rooms = new ArrayList<>();
            response.setRoomTypeList(rooms);

	        FacilityInfoTypeGuestRoomsGuestRoom[] roomList = guestRooms.getGuestRoom();
	        if (roomList != null && roomList.length > 0) {

                for (FacilityInfoTypeGuestRoomsGuestRoom room_item : roomList) {
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
                            descriptiveText.getDescriptiveTextChoice_type0() != null) {

	                    DescriptiveTextChoice_type0 text = descriptiveText.getDescriptiveTextChoice_type0();
	                    if (text.getText() != null && text.getText().getTextElement() != null && text.getText().getTextElement().length > 0) {
                            roomType.setDescription(text.getText().getTextElement()[0].toString());
                        }
                    }
                }
            }
        }
	    
        if (hotelExtendedInformation != null &&
                hotelExtendedInformation.getFacilityInfo() != null &&
                hotelExtendedInformation.getFacilityInfo().getRestaurants() != null) {

            ArrayOfRestaurantsTypeRestaurant restaurants = hotelExtendedInformation.getFacilityInfo().getRestaurants();

            List<Restaurants> restaurant_list = new ArrayList<Restaurants>();
            response.setRestaurantsList(restaurant_list);

            for (RestaurantsTypeRestaurant restaurant : restaurants.getRestaurant()) {

                Restaurants restaurant_item = new Restaurants();
                restaurant_list.add(restaurant_item);
                restaurant_item.setName(restaurant.getRestaurantName());

	            ArrayOfRestaurantsTypeRestaurantCuisine cuisines = restaurant.getCuisines();
	            if (cuisines != null) {
                    String cuisine_all = "";
                    for (RestaurantsTypeRestaurantCuisine cuisine : cuisines.getCuisine()) {
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
	                    ParagraphChoice_type0[] pchoice = paragraph.getParagraphChoice_type0();
	                    if (pchoice != null && pchoice.length > 0) {
		                    ParagraphChoice_type0 p1 = pchoice[0];
		                    restaurant_item.setDescription(p1.getText().toString());
                        }
                    }
                }
            }
        }

        response.setHotelName(hotelInformation1.getString());
        ArrayOfPhone phones = hotelContactInformation.getContactPhones();
        if (phones != null && phones.getPhone() != null) {
            for (Phone phone : phones.getPhone()) {
                if (phone.getPhoneChoice_type0() != null &&
                        phone.getPhoneChoice_type0().getPhoneNumber() != null) {
                    response.setContactPhones(phone.getPhoneChoice_type0().getPhoneNumber());
                    break;
                }
            }
        }

	    ArrayOfEmail emails = hotelContactInformation.getContactEmails();
	    if (emails != null && emails.getContactEmail() != null) {
		    // TODO: This surely doesn't do what we want
            for (Email email : emails.getContactEmail()) {
                response.setContactEmails(email.getString());
                break;
            }
        }

        ArrayOfAddress addresses = hotelContactInformation.getAddresses();
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
                    response.setState(address.getStateProv());
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
}
