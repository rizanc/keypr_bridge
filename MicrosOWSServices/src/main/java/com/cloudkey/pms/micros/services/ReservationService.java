

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
          * Detach accompany guest from a reservation.
                    * @param deleteAccompanyGuestRequest35
                
                    * @param oGHeader36
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestResponseE deleteAccompanyGuest(

                        com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestRequestE deleteAccompanyGuestRequest35,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Detach accompany guest from a reservation.
                * @param deleteAccompanyGuestRequest35
            
                * @param oGHeader36
            
          */
        public void startdeleteAccompanyGuest(

            com.cloudkey.pms.micros.ows.reservation.DeleteAccompanyGuestRequestE deleteAccompanyGuestRequest35,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader36,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Share two reservations.
                    * @param combineShareRequest38
                
                    * @param oGHeader39
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CombineShareResponse combineShare(

                        com.cloudkey.pms.micros.ows.reservation.CombineShareRequest combineShareRequest38,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader39)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Share two reservations.
                * @param combineShareRequest38
            
                * @param oGHeader39
            
          */
        public void startcombineShare(

            com.cloudkey.pms.micros.ows.reservation.CombineShareRequest combineShareRequest38,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader39,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * ReInstate a cancel/noshow reservation to reserved.
                    * @param reInstateReservationRequest41
                
                    * @param oGHeader42
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ReInstateReservationResponse reInstateReservation(

                        com.cloudkey.pms.micros.ows.reservation.ReInstateReservationRequest reInstateReservationRequest41,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader42)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * ReInstate a cancel/noshow reservation to reserved.
                * @param reInstateReservationRequest41
            
                * @param oGHeader42
            
          */
        public void startreInstateReservation(

            com.cloudkey.pms.micros.ows.reservation.ReInstateReservationRequest reInstateReservationRequest41,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader42,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Upgrade Reservation from one room type to another room type.
                    * @param upgradeReservationRequest44
                
                    * @param oGHeader45
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpgradeReservationResponseE upgradeReservation(

                        com.cloudkey.pms.micros.ows.reservation.UpgradeReservationRequestE upgradeReservationRequest44,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader45)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Upgrade Reservation from one room type to another room type.
                * @param upgradeReservationRequest44
            
                * @param oGHeader45
            
          */
        public void startupgradeReservation(

            com.cloudkey.pms.micros.ows.reservation.UpgradeReservationRequestE upgradeReservationRequest44,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader45,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Amend an existing reservation based on confirmation number.
                    * @param modifyBookingRequest47
                
                    * @param oGHeader48
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ModifyBookingResponseE modifyBooking(

                        com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequestE modifyBookingRequest47,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader48)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Amend an existing reservation based on confirmation number.
                * @param modifyBookingRequest47
            
                * @param oGHeader48
            
          */
        public void startmodifyBooking(

            com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequestE modifyBookingRequest47,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader48,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Add or remove or update or fetch comments,traces,specials attached to a reservation.
                    * @param guestRequestsRequest50
                
                    * @param oGHeader51
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.GuestRequestsResponse guestRequests(

                        com.cloudkey.pms.micros.ows.reservation.GuestRequestsRequest guestRequestsRequest50,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader51)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Add or remove or update or fetch comments,traces,specials attached to a reservation.
                * @param guestRequestsRequest50
            
                * @param oGHeader51
            
          */
        public void startguestRequests(

            com.cloudkey.pms.micros.ows.reservation.GuestRequestsRequest guestRequestsRequest50,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader51,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Remove add-on packages from reservation
                    * @param deletePackagesRequest53
                
                    * @param oGHeader54
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeletePackagesResponseE deletePackages(

                        com.cloudkey.pms.micros.ows.reservation.DeletePackagesRequestE deletePackagesRequest53,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader54)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Remove add-on packages from reservation
                * @param deletePackagesRequest53
            
                * @param oGHeader54
            
          */
        public void startdeletePackages(

            com.cloudkey.pms.micros.ows.reservation.DeletePackagesRequestE deletePackagesRequest53,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader54,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve reservations for booker, travel agent or company for future dates.
                    * @param futureBookingSummaryRequest56
                
                    * @param oGHeader57
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponseE futureBookingSummary(

                        com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestE futureBookingSummaryRequest56,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader57)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve reservations for booker, travel agent or company for future dates.
                * @param futureBookingSummaryRequest56
            
                * @param oGHeader57
            
          */
        public void startfutureBookingSummary(

            com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestE futureBookingSummaryRequest56,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader57,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Create inventory items for hold.
                    * @param createItemHoldRequest59
                
                    * @param oGHeader60
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateItemHoldResponseE createItemHold(

                        com.cloudkey.pms.micros.ows.reservation.CreateItemHoldRequestE createItemHoldRequest59,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader60)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Create inventory items for hold.
                * @param createItemHoldRequest59
            
                * @param oGHeader60
            
          */
        public void startcreateItemHold(

            com.cloudkey.pms.micros.ows.reservation.CreateItemHoldRequestE createItemHoldRequest59,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader60,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve existing reservation details based on confirmation number.
                    * @param fetchBookingRequest62
                
                    * @param oGHeader63
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookingResponseE fetchBooking(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookingRequestE fetchBookingRequest62,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader63)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve existing reservation details based on confirmation number.
                * @param fetchBookingRequest62
            
                * @param oGHeader63
            
          */
        public void startfetchBooking(

            com.cloudkey.pms.micros.ows.reservation.FetchBookingRequestE fetchBookingRequest62,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader63,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch inventory items for reservation.
                    * @param fetchBookedInventoryItemsRequest65
                
                    * @param oGHeader66
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsResponseE fetchBookedInventoryItems(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsRequestE fetchBookedInventoryItemsRequest65,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader66)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch inventory items for reservation.
                * @param fetchBookedInventoryItemsRequest65
            
                * @param oGHeader66
            
          */
        public void startfetchBookedInventoryItems(

            com.cloudkey.pms.micros.ows.reservation.FetchBookedInventoryItemsRequestE fetchBookedInventoryItemsRequest65,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader66,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Upsell current reservation to selected offer by user.
                    * @param upsellReservationRequest68
                
                    * @param oGHeader69
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpsellReservationResponse upsellReservation(

                        com.cloudkey.pms.micros.ows.reservation.UpsellReservationRequest upsellReservationRequest68,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader69)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Upsell current reservation to selected offer by user.
                * @param upsellReservationRequest68
            
                * @param oGHeader69
            
          */
        public void startupsellReservation(

            com.cloudkey.pms.micros.ows.reservation.UpsellReservationRequest upsellReservationRequest68,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader69,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Confirm session booking.
                    * @param confirmBookingRequest71
                
                    * @param oGHeader72
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ConfirmBookingResponseE confirmBooking(

                        com.cloudkey.pms.micros.ows.reservation.ConfirmBookingRequestE confirmBookingRequest71,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader72)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Confirm session booking.
                * @param confirmBookingRequest71
            
                * @param oGHeader72
            
          */
        public void startconfirmBooking(

            com.cloudkey.pms.micros.ows.reservation.ConfirmBookingRequestE confirmBookingRequest71,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader72,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Create multiple bookings.
                    * @param createMultipleBookingsRequest74
                
                    * @param oGHeader75
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsResponse createMultipleBookings(

                        com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsRequest createMultipleBookingsRequest74,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader75)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Create multiple bookings.
                * @param createMultipleBookingsRequest74
            
                * @param oGHeader75
            
          */
        public void startcreateMultipleBookings(

            com.cloudkey.pms.micros.ows.reservation.CreateMultipleBookingsRequest createMultipleBookingsRequest74,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader75,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Remove Room Number From a Booking.
                    * @param releaseRoomRequest77
                
                    * @param oGHeader78
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponseE releaseRoom(

                        com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequestE releaseRoomRequest77,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader78)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Remove Room Number From a Booking.
                * @param releaseRoomRequest77
            
                * @param oGHeader78
            
          */
        public void startreleaseRoom(

            com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequestE releaseRoomRequest77,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader78,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Attach all hold items to reservation.
                    * @param bookHoldItemsRequest80
                
                    * @param oGHeader81
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.BookHoldItemsResponseE bookHoldItems(

                        com.cloudkey.pms.micros.ows.reservation.BookHoldItemsRequestE bookHoldItemsRequest80,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader81)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Attach all hold items to reservation.
                * @param bookHoldItemsRequest80
            
                * @param oGHeader81
            
          */
        public void startbookHoldItems(

            com.cloudkey.pms.micros.ows.reservation.BookHoldItemsRequestE bookHoldItemsRequest80,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader81,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch available Upsell offers for reservation.
                    * @param fetchAvailableOffersRequest83
                
                    * @param oGHeader84
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersResponse fetchAvailableOffers(

                        com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersRequest fetchAvailableOffersRequest83,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader84)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch available Upsell offers for reservation.
                * @param fetchAvailableOffersRequest83
            
                * @param oGHeader84
            
          */
        public void startfetchAvailableOffers(

            com.cloudkey.pms.micros.ows.reservation.FetchAvailableOffersRequest fetchAvailableOffersRequest83,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader84,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Insert or Update Inventory Items with reservation.
                    * @param updateInventoryItemRequest86
                
                    * @param oGHeader87
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemResponseE updateInventoryItem(

                        com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemRequestE updateInventoryItemRequest86,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader87)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Insert or Update Inventory Items with reservation.
                * @param updateInventoryItemRequest86
            
                * @param oGHeader87
            
          */
        public void startupdateInventoryItem(

            com.cloudkey.pms.micros.ows.reservation.UpdateInventoryItemRequestE updateInventoryItemRequest86,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader87,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Cancel an existing reservation based on confirmation number.
                    * @param cancelBookingRequest89
                
                    * @param oGHeader90
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CancelBookingResponseE cancelBooking(

                        com.cloudkey.pms.micros.ows.reservation.CancelBookingRequestE cancelBookingRequest89,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader90)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Cancel an existing reservation based on confirmation number.
                * @param cancelBookingRequest89
            
                * @param oGHeader90
            
          */
        public void startcancelBooking(

            com.cloudkey.pms.micros.ows.reservation.CancelBookingRequestE cancelBookingRequest89,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader90,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Delete Inventory Items from reservation.
                    * @param deleteInventoryItemRequest92
                
                    * @param oGHeader93
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemResponseE deleteInventoryItem(

                        com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemRequestE deleteInventoryItemRequest92,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader93)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Delete Inventory Items from reservation.
                * @param deleteInventoryItemRequest92
            
                * @param oGHeader93
            
          */
        public void startdeleteInventoryItem(

            com.cloudkey.pms.micros.ows.reservation.DeleteInventoryItemRequestE deleteInventoryItemRequest92,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader93,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch Reservation summary for internary reservation
                    * @param fetchSummaryRequest95
                
                    * @param oGHeader96
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchSummaryResponseE fetchSummary(

                        com.cloudkey.pms.micros.ows.reservation.FetchSummaryRequestE fetchSummaryRequest95,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader96)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch Reservation summary for internary reservation
                * @param fetchSummaryRequest95
            
                * @param oGHeader96
            
          */
        public void startfetchSummary(

            com.cloudkey.pms.micros.ows.reservation.FetchSummaryRequestE fetchSummaryRequest95,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader96,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Ignore session booking.
                    * @param ignoreBookingRequest98
                
                    * @param oGHeader99
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.IgnoreBookingResponseE ignoreBooking(

                        com.cloudkey.pms.micros.ows.reservation.IgnoreBookingRequestE ignoreBookingRequest98,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader99)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Ignore session booking.
                * @param ignoreBookingRequest98
            
                * @param oGHeader99
            
          */
        public void startignoreBooking(

            com.cloudkey.pms.micros.ows.reservation.IgnoreBookingRequestE ignoreBookingRequest98,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader99,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch Room Upgrade available for member reservation.
                    * @param fetchRoomUpgradesRequest101
                
                    * @param oGHeader102
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesResponseE fetchRoomUpgrades(

                        com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesRequestE fetchRoomUpgradesRequest101,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader102)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch Room Upgrade available for member reservation.
                * @param fetchRoomUpgradesRequest101
            
                * @param oGHeader102
            
          */
        public void startfetchRoomUpgrades(

            com.cloudkey.pms.micros.ows.reservation.FetchRoomUpgradesRequestE fetchRoomUpgradesRequest101,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader102,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch add-on packages that are already attached to the reservation.
                    * @param fetchBookedPackagesRequest104
                
                    * @param oGHeader105
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesResponseE fetchBookedPackages(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesRequestE fetchBookedPackagesRequest104,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader105)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch add-on packages that are already attached to the reservation.
                * @param fetchBookedPackagesRequest104
            
                * @param oGHeader105
            
          */
        public void startfetchBookedPackages(

            com.cloudkey.pms.micros.ows.reservation.FetchBookedPackagesRequestE fetchBookedPackagesRequest104,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader105,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modify inventory items for hold.
                    * @param modifyItemHoldRequest107
                
                    * @param oGHeader108
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldResponseE modifyItemHold(

                        com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldRequestE modifyItemHoldRequest107,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader108)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modify inventory items for hold.
                * @param modifyItemHoldRequest107
            
                * @param oGHeader108
            
          */
        public void startmodifyItemHold(

            com.cloudkey.pms.micros.ows.reservation.ModifyItemHoldRequestE modifyItemHoldRequest107,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader108,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch list of inventory items which are for hold.
                    * @param fetchHoldItemsRequest110
                
                    * @param oGHeader111
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsResponseE fetchHoldItems(

                        com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsRequestE fetchHoldItemsRequest110,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader111)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch list of inventory items which are for hold.
                * @param fetchHoldItemsRequest110
            
                * @param oGHeader111
            
          */
        public void startfetchHoldItems(

            com.cloudkey.pms.micros.ows.reservation.FetchHoldItemsRequestE fetchHoldItemsRequest110,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader111,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Send the reservation confirmation via E-Mail.
                    * @param emailConfirmationRequest113
                
                    * @param oGHeader114
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.EmailConfirmationResponseE emailConfirmation(

                        com.cloudkey.pms.micros.ows.reservation.EmailConfirmationRequestE emailConfirmationRequest113,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader114)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Send the reservation confirmation via E-Mail.
                * @param emailConfirmationRequest113
            
                * @param oGHeader114
            
          */
        public void startemailConfirmation(

            com.cloudkey.pms.micros.ows.reservation.EmailConfirmationRequestE emailConfirmationRequest113,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader114,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve reservations for which we need to assign daily membership points consumption.
                    * @param fetchBookingForPointUpdateRequest116
                
                    * @param oGHeader117
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateResponseE fetchBookingForPointUpdate(

                        com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateRequestE fetchBookingForPointUpdateRequest116,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader117)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve reservations for which we need to assign daily membership points consumption.
                * @param fetchBookingForPointUpdateRequest116
            
                * @param oGHeader117
            
          */
        public void startfetchBookingForPointUpdate(

            com.cloudkey.pms.micros.ows.reservation.FetchBookingForPointUpdateRequestE fetchBookingForPointUpdateRequest116,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader117,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Break a shared reservation.
                    * @param breakShareRequest119
                
                    * @param oGHeader120
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.BreakShareResponse breakShare(

                        com.cloudkey.pms.micros.ows.reservation.BreakShareRequest breakShareRequest119,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader120)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Break a shared reservation.
                * @param breakShareRequest119
            
                * @param oGHeader120
            
          */
        public void startbreakShare(

            com.cloudkey.pms.micros.ows.reservation.BreakShareRequest breakShareRequest119,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader120,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Set the no. of membership points to be consumed for each day in the stay.
                    * @param setDailyPointsRequest122
                
                    * @param oGHeader123
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.SetDailyPointsResponseE setDailyPoints(

                        com.cloudkey.pms.micros.ows.reservation.SetDailyPointsRequestE setDailyPointsRequest122,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader123)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Set the no. of membership points to be consumed for each day in the stay.
                * @param setDailyPointsRequest122
            
                * @param oGHeader123
            
          */
        public void startsetDailyPoints(

            com.cloudkey.pms.micros.ows.reservation.SetDailyPointsRequestE setDailyPointsRequest122,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader123,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Assign Room Number To a Booking.
                    * @param assignRoomRequest125
                
                    * @param oGHeader126
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.AssignRoomResponseE assignRoom(

                        com.cloudkey.pms.micros.ows.reservation.AssignRoomRequestE assignRoomRequest125,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader126)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Assign Room Number To a Booking.
                * @param assignRoomRequest125
            
                * @param oGHeader126
            
          */
        public void startassignRoom(

            com.cloudkey.pms.micros.ows.reservation.AssignRoomRequestE assignRoomRequest125,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader126,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Consume multiple e-certificates and/or vouchers for a booking
                    * @param consumeVouchersRequest128
                
                    * @param oGHeader129
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ConsumeVouchersResponse consumeVouchers(

                        com.cloudkey.pms.micros.ows.reservation.ConsumeVouchersRequest consumeVouchersRequest128,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader129)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Consume multiple e-certificates and/or vouchers for a booking
                * @param consumeVouchersRequest128
            
                * @param oGHeader129
            
          */
        public void startconsumeVouchers(

            com.cloudkey.pms.micros.ows.reservation.ConsumeVouchersRequest consumeVouchersRequest128,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader129,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Attach accompany guest to a reservation.
                    * @param addAccompanyGuestRequest131
                
                    * @param oGHeader132
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestResponseE addAccompanyGuest(

                        com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestRequestE addAccompanyGuestRequest131,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader132)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Attach accompany guest to a reservation.
                * @param addAccompanyGuestRequest131
            
                * @param oGHeader132
            
          */
        public void startaddAccompanyGuest(

            com.cloudkey.pms.micros.ows.reservation.AddAccompanyGuestRequestE addAccompanyGuestRequest131,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader132,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Insert or update add-on pakcages with reservation.
                    * @param updatePackagesRequest134
                
                    * @param oGHeader135
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.UpdatePackagesResponseE updatePackages(

                        com.cloudkey.pms.micros.ows.reservation.UpdatePackagesRequestE updatePackagesRequest134,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader135)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Insert or update add-on pakcages with reservation.
                * @param updatePackagesRequest134
            
                * @param oGHeader135
            
          */
        public void startupdatePackages(

            com.cloudkey.pms.micros.ows.reservation.UpdatePackagesRequestE updatePackagesRequest134,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader135,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Delete hold items.
                    * @param clearItemHoldRequest137
                
                    * @param oGHeader138
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.ClearItemHoldResponseE clearItemHold(

                        com.cloudkey.pms.micros.ows.reservation.ClearItemHoldRequestE clearItemHoldRequest137,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader138)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Delete hold items.
                * @param clearItemHoldRequest137
            
                * @param oGHeader138
            
          */
        public void startclearItemHold(

            com.cloudkey.pms.micros.ows.reservation.ClearItemHoldRequestE clearItemHoldRequest137,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader138,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Create a new reservation.
                    * @param createBookingRequest140
                
                    * @param oGHeader141
                
         */

         
                     public com.cloudkey.pms.micros.ows.reservation.CreateBookingResponseE createBooking(

                        com.cloudkey.pms.micros.ows.reservation.CreateBookingRequestE createBookingRequest140,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader141)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Create a new reservation.
                * @param createBookingRequest140
            
                * @param oGHeader141
            
          */
        public void startcreateBooking(

            com.cloudkey.pms.micros.ows.reservation.CreateBookingRequestE createBookingRequest140,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader141,
                

            final com.cloudkey.pms.micros.services.ReservationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    