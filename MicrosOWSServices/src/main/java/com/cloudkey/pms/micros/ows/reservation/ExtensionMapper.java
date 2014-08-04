
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.cloudkey.pms.micros.ows.reservation;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "VoucherType_type1".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.VoucherType_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ReservationAlert".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ReservationAlert.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "EncryptedSwipe".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.EncryptedSwipe.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "BlackListFlag".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.BlackListFlag.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ClearItemHoldResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ClearItemHoldResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NegotiatedRate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NegotiatedRate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpdateInventoryItemRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AmenityAmenityType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AmenityAmenityType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAdditionalBedAmount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpdateInventoryItemResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GDSError".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GDSError.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GeoCode".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GeoCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CreateItemHoldRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CreateItemHoldRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ReservationComment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ReservationComment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ArrayOfBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ArrayOfBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RateOccurrenceType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ArrayOfBookingResult".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ArrayOfBookingResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ClearItemHoldRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ClearItemHoldRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfGuarantee".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGuarantee.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRestaurantsTypeRestaurant".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurant.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRatePlan".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "AwardPointsToExpire".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.AwardPointsToExpire.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RoomRate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RoomRate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookingForPointUpdateRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AccompanyGuest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AccompanyGuest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Commission".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Commission.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ProfileUserGroup".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ProfileUserGroup.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "TimeSpan".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfMeetingRoomsTypeMeetingRoomCode".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FutureBookingSummaryRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GdsTotalPricingTax".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricingTax.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Membership/".equals(namespaceURI) &&
                  "RuleSchedule".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.membership.RuleSchedule.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "ArrayOfEndPoint".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.ArrayOfEndPoint.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "BookHoldItemsRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.BookHoldItemsRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfResGuestRPH".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "MoreFields".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.MoreFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "FacilityInfoTypeGuestRoomsGuestRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoTypeGuestRoomsGuestRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeletePackagesResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeletePackagesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ReleaseRoomResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Guarantee".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Guarantee.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Frequency".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Frequency.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AdditionalBedType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AdditionalBedType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ResPayMethod".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.Customer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GuestCountList".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GuestCountList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "UserDefinedValue".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.UserDefinedValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Payment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Payment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPhone".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Amenity".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Amenity.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfUpgradeRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfUpgradeRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "PersonName".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.PersonName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAddress".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ConfirmBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ConfirmBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Email".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Email.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfAwardPointsToExpire".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "OGHeader".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.OGHeader.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ShareReservation".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ShareReservation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "UserGroupType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.UserGroupType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "GovernmentID".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.GovernmentID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "MeetingRoomsType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfUserDefinedValue".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "Company".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.Company.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRoomFeature".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfEmail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "VectorDistance".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.VectorDistance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfShareReservation".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookedPackagesRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfGovernmentID".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPackageElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNameEmail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNameEmail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfHoldInventoryItemElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHoldInventoryItemElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Rate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Rate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "Joiner".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.Joiner.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "Profile".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.Profile.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FutureBookingSummaryRequestQueryDateRangeDateType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRangeDateType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "SystemID".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.SystemID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PackageDetail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PackageDetail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "History".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.History.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "WrittenConfInst".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.WrittenConfInst.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CreateItemHoldResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CreateItemHoldResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfProfile".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfProfile.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AdditionalDetailType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "BookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.BookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchSummaryResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchSummaryResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfGuaranteeAccepted".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGuaranteeAccepted.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "TimeSpanPoints".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.TimeSpanPoints.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Phone".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Phone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ResultStatus".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ResultStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeleteInventoryItemResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Voucher".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Voucher.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfResGuest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "HotelContact".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.HotelContact.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "VectorDirectionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.VectorDirectionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ChargesForTheDay".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ChargesForTheDay.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ModifyBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ModifyBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "SetDailyPointsRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.SetDailyPointsRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookingForPointUpdateResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNameCreditCard".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRoomRate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookedPackagesResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ModifyItemHoldRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "TransportInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.TransportInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfText".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfText.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeleteAccompanyGuestResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "BookHoldItemsResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.BookHoldItemsResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GdsTotalPricing".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Discount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Discount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ExternalReference".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ExternalReference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfIDPair".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfIDPair.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NameEmail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NameEmail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRoomType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "HotelInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.HotelInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNegotiatedRate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "CreditCard".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.CreditCard.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAmenity".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAmenity.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "EmailConfirmationResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.EmailConfirmationResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Paragraph".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRestaurantsTypeRestaurantCuisine".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "EndPoint".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.EndPoint.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "BillItem".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.BillItem.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfHotelReference".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfGdsTotalPricingTax".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfInventoryItemElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfInventoryItemElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "BlackList".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.BlackList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfReservationAlert".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationAlert.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GuestCount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GuestCount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPaymentType1".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ResultStatusFlag".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ResultStatusFlag.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Gender".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Gender.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PaymentType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PaymentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNameAddress".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNameAddress.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NameMembership".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NameMembership.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "SetDailyPointsResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.SetDailyPointsResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookedInventoryItemsResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "OGHeaderAuthentication".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.OGHeaderAuthentication.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RoomFeature".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RoomFeature.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AgeQualifyingCode".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPackageCharge".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageCharge.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfCreditCardPayment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Amount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ReservationTrace".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ReservationTrace.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RoomType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RoomType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "CreditCardPayment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfSpecialRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ResGuestRPH".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ResGuestRPH.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchSummaryRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchSummaryRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfTimeSpanPoints".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfReservationComment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "AddAccompanyGuestRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CancelBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CancelBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "OtherPaymentType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.OtherPaymentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAttractionInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAttractionInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ChargeList".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ChargeList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AmenityInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAttractionsTypeAttraction".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAttractionsTypeAttraction.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "FixedCharge".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.FixedCharge.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "CancelDateTime".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GuestRequests".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GuestRequests.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNamePhone".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNamePhone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "DiscountType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.DiscountType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NamePhone".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NamePhone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "DepositRequirement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "EmailConfirmationRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.EmailConfirmationRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PackageCharge".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PackageCharge.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AttractionInfoType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AttractionInfoType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpdatePackagesRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpdatePackagesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "DailyChargeList".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Address".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRoomStay".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "BillTax".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.BillTax.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfHotelReservation".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfHotelReservation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AdditionalGuestAmount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AdditionalGuestAmount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GuaranteeAccepted".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GuaranteeAccepted.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ReservationActionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ReservationActionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "BookingResult".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.BookingResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "VoucherType_type1".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.VoucherType_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "MemberAwardInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfPrivacyOptionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "DistanceUnitType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.DistanceUnitType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Membership/".equals(namespaceURI) &&
                  "Award".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.membership.Award.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "CompanyCompanyType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.CompanyCompanyType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPaymentType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfHotelInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchHoldItemsResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfUniqueID".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfUniqueID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ReservationVoucher".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ReservationVoucher.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "Alert".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.Alert.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "MeetingRoomsTypeMeetingRoomCode".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoomCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "AssignRoomRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "ArrayOfTextElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.ArrayOfTextElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAdditionalDetail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalDetail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AdditionalBedAmount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AdditionalBedAmount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "StayHistoryData".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.StayHistoryData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RestaurantsTypeRestaurant".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RestaurantsTypeRestaurant.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "SharerType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.SharerType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FutureBookingSummaryResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RoomStay".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RoomStay.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "OGHeaderAuthenticationLicence".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.OGHeaderAuthenticationLicence.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfReservationVoucher".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "SpecialRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.SpecialRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "CreditCardSurcharge".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CreateBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CreateBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchHoldItemsRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeleteAccompanyGuestRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfPreference".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfPreference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "IDPair".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.IDPair.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "FetchBookingFilters".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.FetchBookingFilters.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAdditionalGuestAmount".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "HoldInventoryItemElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.HoldInventoryItemElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PackageMember".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PackageMember.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchRoomUpgradesResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NameAddress".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NameAddress.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CancelBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CancelBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookedInventoryItemsRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Charge".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Charge.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfKeyWord".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfKeyWord.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NativeName".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfReservationTrace".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FutureBookingSummaryRequestQueryDateRange".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "HotelReference".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "InventoryItemElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.InventoryItemElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "Comment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.Comment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RestaurantsTypeRestaurantCuisine".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RestaurantsTypeRestaurantCuisine.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ConfirmBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ConfirmBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "AddAccompanyGuestResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "VaultedCardType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.VaultedCardType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeleteInventoryItemRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "HotelInfoType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.HotelInfoType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "CancelTermType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.CancelTermType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "UniqueID".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "PrivacyOptionTypeOptionValue".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.PrivacyOptionTypeOptionValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfCancelPenalty".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpdatePackagesResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpdatePackagesResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Membership/".equals(namespaceURI) &&
                  "PointsSchedule".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.membership.PointsSchedule.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "RequestActionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.RequestActionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfNameMembership".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfNameMembership.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "KeyTrack".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.KeyTrack.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpgradeReservationResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpgradeReservationResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "KeyWord".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.KeyWord.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "FacilityInfoTypeGuestRooms".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoTypeGuestRooms.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Text".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Text.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "NameCreditCard".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.NameCreditCard.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ResGuest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ResGuest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "IgnoreBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.IgnoreBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "DescriptiveText".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "AssignRoomResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchRoomUpgradesRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "UpsellRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.UpsellRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GDSResultStatus".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "RatePlan".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.RatePlan.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ShareAction".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ShareAction.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "ArrayOfComment".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.ArrayOfComment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "CancelPenalty".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.CancelPenalty.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ReservationDispositionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ReservationDispositionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AttractionInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AttractionInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "PrivacyOptionTypeOptionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.PrivacyOptionTypeOptionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Membership/".equals(namespaceURI) &&
                  "PromotionDetails".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.membership.PromotionDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Attraction_type0".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Attraction_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Core/".equals(namespaceURI) &&
                  "OGHeaderAuthenticationUserCredentials".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.core.OGHeaderAuthenticationUserCredentials.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ModifyItemHoldResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "HotelReservation".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.HotelReservation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ModifyBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ArrayOfUpsellRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ArrayOfUpsellRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "MeetingRoomsTypeMeetingRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ShareActionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ShareActionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "PrivacyOptionType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.PrivacyOptionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "CancelTerm".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.CancelTerm.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ResPayRouting".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAnyURI".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "UpgradeReservationRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.UpgradeReservationRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "TextElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.TextElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "GdsFlags".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.GdsFlags.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Membership/".equals(namespaceURI) &&
                  "ECertificate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.membership.ECertificate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PackageDetailCharges".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PackageElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PackageElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Name/".equals(namespaceURI) &&
                  "Preference".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.name.Preference.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "BillHeader".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.BillHeader.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ItemGroupElement".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ExtendedHotelInfo".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "Membership".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.Membership.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "IgnoreBookingRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.IgnoreBookingRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "UpgradeRoom".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.UpgradeRoom.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "Vector".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.Vector.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfAccompanyGuest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "ReleaseRoomRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfRate".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRate.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AdditionalDetail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "VectorDirection".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.VectorDirection.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "FacilityInfoType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "FetchBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.FetchBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "CreateBookingResponse".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.CreateBookingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "PaymentUsed".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.PaymentUsed.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "FixedChargeList".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Reservation/".equals(namespaceURI) &&
                  "ReservationStatusType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "AmenityAvailabilityFlag".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.AmenityAvailabilityFlag.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "UniqueIDType".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.UniqueIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/ows/5.1/Reservation.wsdl".equals(namespaceURI) &&
                  "DeletePackagesRequest".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.ows.reservation.DeletePackagesRequest.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/Common/".equals(namespaceURI) &&
                  "PhonePhoneData".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.common.PhonePhoneData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://webservices.micros.com/og/4.3/HotelCommon/".equals(namespaceURI) &&
                  "ArrayOfPackageDetail".equals(typeName)){
                   
                            return  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageDetail.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    