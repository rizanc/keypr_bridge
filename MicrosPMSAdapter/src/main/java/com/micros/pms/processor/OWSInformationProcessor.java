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
		HotelInformationResponse response = service.queryHotelInformation(req, createOGHeaderE());

	    errorIfFailure(response.getResult());
	    return getHotelInformationResponseObject(response);
    }

    //TODO: Chain required.
    private HotelInformationRequest getHotelInformationRequestObject(com.cloudkey.pms.request.hotels.HotelInformationRequest hotelInformationRequest) {
	    HotelInformationRequest request = new HotelInformationRequest();

	    request.setHotelInformationQuery(getDefaultHotelReference());

        return request;
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
