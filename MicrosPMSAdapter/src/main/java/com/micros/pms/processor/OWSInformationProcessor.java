package com.micros.pms.processor;

import com.cloudkey.commons.Restaurants;
import com.cloudkey.commons.RoomType;
import com.cloudkey.pms.micros.og.common.Address;
import com.cloudkey.pms.micros.og.common.DescriptiveText;
import com.cloudkey.pms.micros.og.common.Phone;
import com.cloudkey.pms.micros.og.common.Text;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.information.HotelInformationRequest;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponse;
import com.cloudkey.pms.micros.ows.information.HotelInformationResponseHotelInformation;
import com.cloudkey.pms.micros.services.InformationSoap;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParagraphHelper;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSInformationProcessor extends OWSBase {

	@Inject
	protected InformationSoap service;

	public com.cloudkey.pms.response.hotels.HotelInformationResponse processHotelInformation(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) throws RemoteException {
        log.debug("processHotelInformation: Enter processHotelInformation method. ");

	    HotelInformationRequest req = getHotelInformationRequestObject(hotelInformationRequest);

        log.debug("processHotelInformation",
	        AdapterUtility.convertToStreamXML(req));

		HotelInformationResponse response = service.queryHotelInformation(req, createOGHeaderE());
        log.debug("processHotelInformation",
	        AdapterUtility.convertToStreamXML(response));

	    errorIfFailure(response.getResult());
	    return getHotelInformationResponseObject(response);
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

        hotelName = objHotelInformationResponse.getHotelInformation().getHotelInformation().getValue();

        //objHotelInformationResponse2.setResult(result);
        objHotelInformationResponse2.setHotelName(hotelName);

	    HotelInformationResponseHotelInformation hotelInformation = objHotelInformationResponse.getHotelInformation();
	    HotelContact objContact = hotelInformation.getHotelContactInformation();

        //populate  contactEmail details
	    List<Email> emailList = objContact.getContactEmails();

        String emails = "";

	    for (Email mail : emailList) {

		    contactEmail = mail.toString();
		    emails.concat(" ").concat(contactEmail);
	    }
        objHotelInformationResponse2.setContactEmails(emails);

		/* populate  contact phone list */
        List<Phone> phoneObj = objContact.getContactPhones();

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
        List<Address> objAddress = objContact.getAddresses();

	    for (Address objAdd : objAddress) {
		    cityName = objAdd.getCityName();
		    addressLine = objAdd.getAddressLines().get(0);
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

	        for (FacilityInfoTypeGuestRoomsGuestRoom room_item : guestRooms.getGuestRooms()) {
                RoomType roomType = new RoomType();
                rooms.add(roomType);

                roomType.setCode(room_item.getCode());

                //TODO: Test with real data
                if (room_item.getAmenityInfo() != null) {
                    AmenityInfo amenities = room_item.getAmenityInfo();
                    String features = "";
                    for (Amenity amenity : amenities.getAmenities()) {
                        if (!features.equals(""))
                            features += " '";

                        features += amenity.getAmenityCode();
                    }

	                if (!features.isEmpty()) {
		                roomType.setFeatures(features);
	                }
                }

                DescriptiveText descriptiveText = room_item.getRoomDescription();
                if (descriptiveText != null &&
                        descriptiveText.getText() != null) {

	                if (!descriptiveText.getText().isEmpty()) {
                        roomType.setDescription(descriptiveText.getText().get(0).getValue());
                    }
                }
            }
        }
	    
        if (hotelExtendedInformation != null &&
                hotelExtendedInformation.getFacilityInfo() != null) {

	        List<RestaurantsTypeRestaurant> restaurants = hotelExtendedInformation.getFacilityInfo().getRestaurants();

	        for (RestaurantsTypeRestaurant restaurant : restaurants) {

                Restaurants restaurant_item = new Restaurants();
                response.getRestaurantsList().add(restaurant_item);
                restaurant_item.setName(restaurant.getRestaurantName());

		        List<RestaurantsTypeRestaurantCuisine> cuisines = restaurant.getCuisines();
                String cuisine_all = "";
                for (RestaurantsTypeRestaurantCuisine cuisine : cuisines) {
                    if (!cuisine_all.equals("")) {
                        cuisine_all += "|";
                    }
                    cuisine_all += cuisine.getDescription();
                }
                restaurant_item.setCuisine(cuisine_all);

                List<Paragraph> description = restaurant.getRestaurantDescriptions();
                if (!description.isEmpty()) {
                    Paragraph paragraph = description.get(0);
	                List<Text> textList = ParagraphHelper.getTextList(paragraph);

	                if (!textList.isEmpty()) {
	                    paragraph.getImagesAndURLSAndTexts().get(0);
	                    restaurant_item.setDescription(textList.get(0).getValue());
                    }
                }
            }
        }

        response.setHotelName(hotelInformation1.getValue());
	    for (Phone phone : hotelContactInformation.getContactPhones()) {
            if (phone.getPhoneNumber() != null) {
                response.setContactPhones(phone.getPhoneNumber());
            }
        }

        for (Email email : hotelContactInformation.getContactEmails()) {
            response.setContactEmails(email.getValue());
            break;
        }

        if (!hotelContactInformation.getAddresses().isEmpty()) {
            String addressLine = "";
            Address address = hotelContactInformation.getAddresses().get(0);
            if (address != null) {

                for (String line : address.getAddressLines()) {
                    if (!addressLine.isEmpty()) {
                        addressLine += "</br>";
                    }
                    addressLine += line;
                }

	            response.setAddress(addressLine);

                if (address.getCityName() != null) {
                    response.setCity(address.getCityName());
                }

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
