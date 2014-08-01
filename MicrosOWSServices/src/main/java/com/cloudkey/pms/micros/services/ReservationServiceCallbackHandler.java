
/**
 * ReservationServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /**
     *  ReservationServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ReservationServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ReservationServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ReservationServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for fetchBookedPackages method
            * override this method for handling normal response from fetchBookedPackages operation
            */
           public void receiveResultfetchBookedPackages(
                    com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBookedPackages operation
           */
            public void receiveErrorfetchBookedPackages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchRoomUpgrades method
            * override this method for handling normal response from fetchRoomUpgrades operation
            */
           public void receiveResultfetchRoomUpgrades(
                    com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchRoomUpgrades operation
           */
            public void receiveErrorfetchRoomUpgrades(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePackages method
            * override this method for handling normal response from updatePackages operation
            */
           public void receiveResultupdatePackages(
                    com.cloudkey.pms.micros.ows.reservation.UpdatePackagesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updatePackages operation
           */
            public void receiveErrorupdatePackages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for confirmBooking method
            * override this method for handling normal response from confirmBooking operation
            */
           public void receiveResultconfirmBooking(
                    com.cloudkey.pms.micros.ows.reservation.ConfirmBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from confirmBooking operation
           */
            public void receiveErrorconfirmBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for releaseRoom method
            * override this method for handling normal response from releaseRoom operation
            */
           public void receiveResultreleaseRoom(
                    com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from releaseRoom operation
           */
            public void receiveErrorreleaseRoom(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for breakShare method
            * override this method for handling normal response from breakShare operation
            */
           public void receiveResultbreakShare(
                    com.cloudkey.pms.micros.ows.reservation.BreakShareResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from breakShare operation
           */
            public void receiveErrorbreakShare(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelBooking method
            * override this method for handling normal response from cancelBooking operation
            */
           public void receiveResultcancelBooking(
                    com.cloudkey.pms.micros.ows.reservation.CancelBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelBooking operation
           */
            public void receiveErrorcancelBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addAccompanyGuest method
            * override this method for handling normal response from addAccompanyGuest operation
            */
           public void receiveResultaddAccompanyGuest(
                    com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addAccompanyGuest operation
           */
            public void receiveErroraddAccompanyGuest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modifyItemHold method
            * override this method for handling normal response from modifyItemHold operation
            */
           public void receiveResultmodifyItemHold(
                    com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modifyItemHold operation
           */
            public void receiveErrormodifyItemHold(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateInventoryItem method
            * override this method for handling normal response from updateInventoryItem operation
            */
           public void receiveResultupdateInventoryItem(
                    com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateInventoryItem operation
           */
            public void receiveErrorupdateInventoryItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for emailConfirmation method
            * override this method for handling normal response from emailConfirmation operation
            */
           public void receiveResultemailConfirmation(
                    com.cloudkey.pms.micros.ows.reservation.EmailConfirmationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from emailConfirmation operation
           */
            public void receiveErroremailConfirmation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modifyBooking method
            * override this method for handling normal response from modifyBooking operation
            */
           public void receiveResultmodifyBooking(
                    com.cloudkey.pms.micros.ows.reservation.ModifyBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modifyBooking operation
           */
            public void receiveErrormodifyBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAvailableOffers method
            * override this method for handling normal response from fetchAvailableOffers operation
            */
           public void receiveResultfetchAvailableOffers(
                    com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAvailableOffers operation
           */
            public void receiveErrorfetchAvailableOffers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchBookedInventoryItems method
            * override this method for handling normal response from fetchBookedInventoryItems operation
            */
           public void receiveResultfetchBookedInventoryItems(
                    com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBookedInventoryItems operation
           */
            public void receiveErrorfetchBookedInventoryItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createMultipleBookings method
            * override this method for handling normal response from createMultipleBookings operation
            */
           public void receiveResultcreateMultipleBookings(
                    com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createMultipleBookings operation
           */
            public void receiveErrorcreateMultipleBookings(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for upgradeReservation method
            * override this method for handling normal response from upgradeReservation operation
            */
           public void receiveResultupgradeReservation(
                    com.cloudkey.pms.micros.ows.reservation.UpgradeReservationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from upgradeReservation operation
           */
            public void receiveErrorupgradeReservation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for combineShare method
            * override this method for handling normal response from combineShare operation
            */
           public void receiveResultcombineShare(
                    com.cloudkey.pms.micros.ows.reservation.CombineShareResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from combineShare operation
           */
            public void receiveErrorcombineShare(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bookHoldItems method
            * override this method for handling normal response from bookHoldItems operation
            */
           public void receiveResultbookHoldItems(
                    com.cloudkey.pms.micros.ows.reservation.BookHoldItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookHoldItems operation
           */
            public void receiveErrorbookHoldItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for clearItemHold method
            * override this method for handling normal response from clearItemHold operation
            */
           public void receiveResultclearItemHold(
                    com.cloudkey.pms.micros.ows.reservation.ClearItemHoldResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from clearItemHold operation
           */
            public void receiveErrorclearItemHold(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchBooking method
            * override this method for handling normal response from fetchBooking operation
            */
           public void receiveResultfetchBooking(
                    com.cloudkey.pms.micros.ows.reservation.FetchBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBooking operation
           */
            public void receiveErrorfetchBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ignoreBooking method
            * override this method for handling normal response from ignoreBooking operation
            */
           public void receiveResultignoreBooking(
                    com.cloudkey.pms.micros.ows.reservation.IgnoreBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ignoreBooking operation
           */
            public void receiveErrorignoreBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteInventoryItem method
            * override this method for handling normal response from deleteInventoryItem operation
            */
           public void receiveResultdeleteInventoryItem(
                    com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteInventoryItem operation
           */
            public void receiveErrordeleteInventoryItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for guestRequests method
            * override this method for handling normal response from guestRequests operation
            */
           public void receiveResultguestRequests(
                    com.cloudkey.pms.micros.ows.reservation.GuestRequestsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from guestRequests operation
           */
            public void receiveErrorguestRequests(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createBooking method
            * override this method for handling normal response from createBooking operation
            */
           public void receiveResultcreateBooking(
                    com.cloudkey.pms.micros.ows.reservation.CreateBookingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createBooking operation
           */
            public void receiveErrorcreateBooking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reInstateReservation method
            * override this method for handling normal response from reInstateReservation operation
            */
           public void receiveResultreInstateReservation(
                    com.cloudkey.pms.micros.ows.reservation.ReInstateReservationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reInstateReservation operation
           */
            public void receiveErrorreInstateReservation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchHoldItems method
            * override this method for handling normal response from fetchHoldItems operation
            */
           public void receiveResultfetchHoldItems(
                    com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchHoldItems operation
           */
            public void receiveErrorfetchHoldItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePackages method
            * override this method for handling normal response from deletePackages operation
            */
           public void receiveResultdeletePackages(
                    com.cloudkey.pms.micros.ows.reservation.DeletePackagesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePackages operation
           */
            public void receiveErrordeletePackages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for assignRoom method
            * override this method for handling normal response from assignRoom operation
            */
           public void receiveResultassignRoom(
                    com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from assignRoom operation
           */
            public void receiveErrorassignRoom(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setDailyPoints method
            * override this method for handling normal response from setDailyPoints operation
            */
           public void receiveResultsetDailyPoints(
                    com.cloudkey.pms.micros.ows.reservation.SetDailyPointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setDailyPoints operation
           */
            public void receiveErrorsetDailyPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchSummary method
            * override this method for handling normal response from fetchSummary operation
            */
           public void receiveResultfetchSummary(
                    com.cloudkey.pms.micros.ows.reservation.FetchSummaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchSummary operation
           */
            public void receiveErrorfetchSummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for upsellReservation method
            * override this method for handling normal response from upsellReservation operation
            */
           public void receiveResultupsellReservation(
                    com.cloudkey.pms.micros.ows.reservation.UpsellReservationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from upsellReservation operation
           */
            public void receiveErrorupsellReservation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteAccompanyGuest method
            * override this method for handling normal response from deleteAccompanyGuest operation
            */
           public void receiveResultdeleteAccompanyGuest(
                    com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAccompanyGuest operation
           */
            public void receiveErrordeleteAccompanyGuest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchBookingForPointUpdate method
            * override this method for handling normal response from fetchBookingForPointUpdate operation
            */
           public void receiveResultfetchBookingForPointUpdate(
                    com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBookingForPointUpdate operation
           */
            public void receiveErrorfetchBookingForPointUpdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for futureBookingSummary method
            * override this method for handling normal response from futureBookingSummary operation
            */
           public void receiveResultfutureBookingSummary(
                    com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from futureBookingSummary operation
           */
            public void receiveErrorfutureBookingSummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createItemHold method
            * override this method for handling normal response from createItemHold operation
            */
           public void receiveResultcreateItemHold(
                    com.cloudkey.pms.micros.ows.reservation.CreateItemHoldResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createItemHold operation
           */
            public void receiveErrorcreateItemHold(java.lang.Exception e) {
            }
                


    }
    