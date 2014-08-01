

/**
 * ReservationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  ReservationService java interface
     */

    public interface ReservationService {
          

        /**
          * Auto generated method signature
          * 
                    * @param fetchBookedPackagesRequest34
                
                    * @param oGHeader35
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesResponse fetchBookedPackages(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesRequest fetchBookedPackagesRequest34,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader35)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchBookedPackagesRequest34
            
                * @param oGHeader35
            
          */
        public void startfetchBookedPackages(

            com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesRequest fetchBookedPackagesRequest34,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader35,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchRoomUpgradesRequest37
                
                    * @param oGHeader38
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesResponse fetchRoomUpgrades(

                        com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesRequest fetchRoomUpgradesRequest37,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRoomUpgradesRequest37
            
                * @param oGHeader38
            
          */
        public void startfetchRoomUpgrades(

            com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesRequest fetchRoomUpgradesRequest37,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader38,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updatePackagesRequest40
                
                    * @param oGHeader41
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpdatePackagesResponse updatePackages(

                        com.cloudkey.pms.micros.ows.reservation.UpdatePackagesRequest updatePackagesRequest40,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader41)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updatePackagesRequest40
            
                * @param oGHeader41
            
          */
        public void startupdatePackages(

            com.cloudkey.pms.micros.ows.reservation.UpdatePackagesRequest updatePackagesRequest40,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader41,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param confirmBookingRequest43
                
                    * @param oGHeader44
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ConfirmBookingResponse confirmBooking(

                        com.cloudkey.pms.micros.ows.reservation.ConfirmBookingRequest confirmBookingRequest43,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader44)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param confirmBookingRequest43
            
                * @param oGHeader44
            
          */
        public void startconfirmBooking(

            com.cloudkey.pms.micros.ows.reservation.ConfirmBookingRequest confirmBookingRequest43,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader44,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param releaseRoomRequest46
                
                    * @param oGHeader47
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse releaseRoom(

                        com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest releaseRoomRequest46,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader47)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param releaseRoomRequest46
            
                * @param oGHeader47
            
          */
        public void startreleaseRoom(

            com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest releaseRoomRequest46,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader47,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param breakShareRequest49
                
                    * @param oGHeader50
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.BreakShareResponse breakShare(

                        com.cloudkey.pms.micros.ows.reservation.BreakShareRequest breakShareRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param breakShareRequest49
            
                * @param oGHeader50
            
          */
        public void startbreakShare(

            com.cloudkey.pms.micros.ows.reservation.BreakShareRequest breakShareRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param cancelBookingRequest52
                
                    * @param oGHeader53
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CancelBookingResponse cancelBooking(

                        com.cloudkey.pms.micros.ows.reservation.CancelBookingRequest cancelBookingRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelBookingRequest52
            
                * @param oGHeader53
            
          */
        public void startcancelBooking(

            com.cloudkey.pms.micros.ows.reservation.CancelBookingRequest cancelBookingRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addAccompanyGuestRequest55
                
                    * @param oGHeader56
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestResponse addAccompanyGuest(

                        com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestRequest addAccompanyGuestRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addAccompanyGuestRequest55
            
                * @param oGHeader56
            
          */
        public void startaddAccompanyGuest(

            com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestRequest addAccompanyGuestRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param modifyItemHoldRequest58
                
                    * @param oGHeader59
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldResponse modifyItemHold(

                        com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldRequest modifyItemHoldRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param modifyItemHoldRequest58
            
                * @param oGHeader59
            
          */
        public void startmodifyItemHold(

            com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldRequest modifyItemHoldRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateInventoryItemRequest61
                
                    * @param oGHeader62
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemResponse updateInventoryItem(

                        com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemRequest updateInventoryItemRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateInventoryItemRequest61
            
                * @param oGHeader62
            
          */
        public void startupdateInventoryItem(

            com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemRequest updateInventoryItemRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Send the reservation confirmation via E-Mail.
                    * @param emailConfirmationRequest64
                
                    * @param oGHeader65
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.EmailConfirmationResponse emailConfirmation(

                        com.cloudkey.pms.micros.ows.reservation.EmailConfirmationRequest emailConfirmationRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Send the reservation confirmation via E-Mail.
                * @param emailConfirmationRequest64
            
                * @param oGHeader65
            
          */
        public void startemailConfirmation(

            com.cloudkey.pms.micros.ows.reservation.EmailConfirmationRequest emailConfirmationRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param modifyBookingRequest67
                
                    * @param oGHeader68
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ModifyBookingResponse modifyBooking(

                        com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequest modifyBookingRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param modifyBookingRequest67
            
                * @param oGHeader68
            
          */
        public void startmodifyBooking(

            com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequest modifyBookingRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAvailableOffersRequest70
                
                    * @param oGHeader71
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersResponse fetchAvailableOffers(

                        com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersRequest fetchAvailableOffersRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAvailableOffersRequest70
            
                * @param oGHeader71
            
          */
        public void startfetchAvailableOffers(

            com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersRequest fetchAvailableOffersRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchBookedInventoryItemsRequest73
                
                    * @param oGHeader74
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsResponse fetchBookedInventoryItems(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsRequest fetchBookedInventoryItemsRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchBookedInventoryItemsRequest73
            
                * @param oGHeader74
            
          */
        public void startfetchBookedInventoryItems(

            com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsRequest fetchBookedInventoryItemsRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createMultipleBookingsRequest76
                
                    * @param oGHeader77
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsResponse createMultipleBookings(

                        com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsRequest createMultipleBookingsRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createMultipleBookingsRequest76
            
                * @param oGHeader77
            
          */
        public void startcreateMultipleBookings(

            com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsRequest createMultipleBookingsRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param upgradeReservationRequest79
                
                    * @param oGHeader80
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpgradeReservationResponse upgradeReservation(

                        com.cloudkey.pms.micros.ows.reservation.UpgradeReservationRequest upgradeReservationRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param upgradeReservationRequest79
            
                * @param oGHeader80
            
          */
        public void startupgradeReservation(

            com.cloudkey.pms.micros.ows.reservation.UpgradeReservationRequest upgradeReservationRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param combineShareRequest82
                
                    * @param oGHeader83
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CombineShareResponse combineShare(

                        com.cloudkey.pms.micros.ows.reservation.CombineShareRequest combineShareRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param combineShareRequest82
            
                * @param oGHeader83
            
          */
        public void startcombineShare(

            com.cloudkey.pms.micros.ows.reservation.CombineShareRequest combineShareRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param bookHoldItemsRequest85
                
                    * @param oGHeader86
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.BookHoldItemsResponse bookHoldItems(

                        com.cloudkey.pms.micros.ows.reservation.BookHoldItemsRequest bookHoldItemsRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param bookHoldItemsRequest85
            
                * @param oGHeader86
            
          */
        public void startbookHoldItems(

            com.cloudkey.pms.micros.ows.reservation.BookHoldItemsRequest bookHoldItemsRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param clearItemHoldRequest88
                
                    * @param oGHeader89
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ClearItemHoldResponse clearItemHold(

                        com.cloudkey.pms.micros.ows.reservation.ClearItemHoldRequest clearItemHoldRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param clearItemHoldRequest88
            
                * @param oGHeader89
            
          */
        public void startclearItemHold(

            com.cloudkey.pms.micros.ows.reservation.ClearItemHoldRequest clearItemHoldRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchBookingRequest91
                
                    * @param oGHeader92
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookingResponse fetchBooking(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookingRequest fetchBookingRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchBookingRequest91
            
                * @param oGHeader92
            
          */
        public void startfetchBooking(

            com.cloudkey.pms.micros.ows.reservation.FetchBookingRequest fetchBookingRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param ignoreBookingRequest94
                
                    * @param oGHeader95
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.IgnoreBookingResponse ignoreBooking(

                        com.cloudkey.pms.micros.ows.reservation.IgnoreBookingRequest ignoreBookingRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param ignoreBookingRequest94
            
                * @param oGHeader95
            
          */
        public void startignoreBooking(

            com.cloudkey.pms.micros.ows.reservation.IgnoreBookingRequest ignoreBookingRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteInventoryItemRequest97
                
                    * @param oGHeader98
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemResponse deleteInventoryItem(

                        com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemRequest deleteInventoryItemRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteInventoryItemRequest97
            
                * @param oGHeader98
            
          */
        public void startdeleteInventoryItem(

            com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemRequest deleteInventoryItemRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param guestRequestsRequest100
                
                    * @param oGHeader101
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.GuestRequestsResponse guestRequests(

                        com.cloudkey.pms.micros.ows.reservation.GuestRequestsRequest guestRequestsRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param guestRequestsRequest100
            
                * @param oGHeader101
            
          */
        public void startguestRequests(

            com.cloudkey.pms.micros.ows.reservation.GuestRequestsRequest guestRequestsRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createBookingRequest103
                
                    * @param oGHeader104
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateBookingResponse createBooking(

                        com.cloudkey.pms.micros.ows.reservation.CreateBookingRequest createBookingRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createBookingRequest103
            
                * @param oGHeader104
            
          */
        public void startcreateBooking(

            com.cloudkey.pms.micros.ows.reservation.CreateBookingRequest createBookingRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param reInstateReservationRequest106
                
                    * @param oGHeader107
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ReInstateReservationResponse reInstateReservation(

                        com.cloudkey.pms.micros.ows.reservation.ReInstateReservationRequest reInstateReservationRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param reInstateReservationRequest106
            
                * @param oGHeader107
            
          */
        public void startreInstateReservation(

            com.cloudkey.pms.micros.ows.reservation.ReInstateReservationRequest reInstateReservationRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchHoldItemsRequest109
                
                    * @param oGHeader110
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsResponse fetchHoldItems(

                        com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsRequest fetchHoldItemsRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchHoldItemsRequest109
            
                * @param oGHeader110
            
          */
        public void startfetchHoldItems(

            com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsRequest fetchHoldItemsRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deletePackagesRequest112
                
                    * @param oGHeader113
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeletePackagesResponse deletePackages(

                        com.cloudkey.pms.micros.ows.reservation.DeletePackagesRequest deletePackagesRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deletePackagesRequest112
            
                * @param oGHeader113
            
          */
        public void startdeletePackages(

            com.cloudkey.pms.micros.ows.reservation.DeletePackagesRequest deletePackagesRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param assignRoomRequest115
                
                    * @param oGHeader116
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse assignRoom(

                        com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest assignRoomRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param assignRoomRequest115
            
                * @param oGHeader116
            
          */
        public void startassignRoom(

            com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest assignRoomRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setDailyPointsRequest118
                
                    * @param oGHeader119
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.SetDailyPointsResponse setDailyPoints(

                        com.cloudkey.pms.micros.ows.reservation.SetDailyPointsRequest setDailyPointsRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setDailyPointsRequest118
            
                * @param oGHeader119
            
          */
        public void startsetDailyPoints(

            com.cloudkey.pms.micros.ows.reservation.SetDailyPointsRequest setDailyPointsRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchSummaryRequest121
                
                    * @param oGHeader122
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchSummaryResponse fetchSummary(

                        com.cloudkey.pms.micros.ows.reservation.FetchSummaryRequest fetchSummaryRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchSummaryRequest121
            
                * @param oGHeader122
            
          */
        public void startfetchSummary(

            com.cloudkey.pms.micros.ows.reservation.FetchSummaryRequest fetchSummaryRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param upsellReservationRequest124
                
                    * @param oGHeader125
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpsellReservationResponse upsellReservation(

                        com.cloudkey.pms.micros.ows.reservation.UpsellReservationRequest upsellReservationRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param upsellReservationRequest124
            
                * @param oGHeader125
            
          */
        public void startupsellReservation(

            com.cloudkey.pms.micros.ows.reservation.UpsellReservationRequest upsellReservationRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deleteAccompanyGuestRequest127
                
                    * @param oGHeader128
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestResponse deleteAccompanyGuest(

                        com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestRequest deleteAccompanyGuestRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deleteAccompanyGuestRequest127
            
                * @param oGHeader128
            
          */
        public void startdeleteAccompanyGuest(

            com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestRequest deleteAccompanyGuestRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchBookingForPointUpdateRequest130
                
                    * @param oGHeader131
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateResponse fetchBookingForPointUpdate(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateRequest fetchBookingForPointUpdateRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchBookingForPointUpdateRequest130
            
                * @param oGHeader131
            
          */
        public void startfetchBookingForPointUpdate(

            com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateRequest fetchBookingForPointUpdateRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param futureBookingSummaryRequest133
                
                    * @param oGHeader134
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponse futureBookingSummary(

                        com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequest futureBookingSummaryRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param futureBookingSummaryRequest133
            
                * @param oGHeader134
            
          */
        public void startfutureBookingSummary(

            com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequest futureBookingSummaryRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param createItemHoldRequest136
                
                    * @param oGHeader137
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateItemHoldResponse createItemHold(

                        com.cloudkey.pms.micros.ows.reservation.CreateItemHoldRequest createItemHoldRequest136,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader137)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param createItemHoldRequest136
            
                * @param oGHeader137
            
          */
        public void startcreateItemHold(

            com.cloudkey.pms.micros.ows.reservation.CreateItemHoldRequest createItemHoldRequest136,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader137,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    