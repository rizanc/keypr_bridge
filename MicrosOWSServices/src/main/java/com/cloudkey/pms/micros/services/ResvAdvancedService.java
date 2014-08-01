

/**
 * ResvAdvancedService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  ResvAdvancedService java interface
     */

    public interface ResvAdvancedService {
          

        /**
          * Auto generated method signature
          * 
                    * @param externalPaymentRequest34
                
                    * @param oGHeader35
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentResponse externalPayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentRequest externalPaymentRequest34,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader35)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param externalPaymentRequest34
            
                * @param oGHeader35
            
          */
        public void startexternalPayment(

            com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentRequest externalPaymentRequest34,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader35,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param releaseRoomAdvRequest37
                
                    * @param oGHeader38
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvResponse releaseRoom(

                        com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvRequest releaseRoomAdvRequest37,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param releaseRoomAdvRequest37
            
                * @param oGHeader38
            
          */
        public void startreleaseRoom(

            com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvRequest releaseRoomAdvRequest37,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader38,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param printPreCheckOutBillRequest40
                
                    * @param oGHeader41
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillResponse printPreCheckOutBill(

                        com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillRequest printPreCheckOutBillRequest40,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader41)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param printPreCheckOutBillRequest40
            
                * @param oGHeader41
            
          */
        public void startprintPreCheckOutBill(

            com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillRequest printPreCheckOutBillRequest40,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader41,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param alternateRoomsRequest43
                
                    * @param oGHeader44
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsResponse alternateRooms(

                        com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsRequest alternateRoomsRequest43,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader44)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param alternateRoomsRequest43
            
                * @param oGHeader44
            
          */
        public void startalternateRooms(

            com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsRequest alternateRoomsRequest43,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader44,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queueReservationRequest46
                
                    * @param oGHeader47
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationResponse queueReservation(

                        com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationRequest queueReservationRequest46,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader47)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queueReservationRequest46
            
                * @param oGHeader47
            
          */
        public void startqueueReservation(

            com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationRequest queueReservationRequest46,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader47,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param invoiceRequest49
                
                    * @param oGHeader50
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponse invoice(

                        com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequest invoiceRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param invoiceRequest49
            
                * @param oGHeader50
            
          */
        public void startinvoice(

            com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequest invoiceRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param postChargeRequest52
                
                    * @param oGHeader53
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponse postCharge(

                        com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest postChargeRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param postChargeRequest52
            
                * @param oGHeader53
            
          */
        public void startpostCharge(

            com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest postChargeRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setKeyDataRequest55
                
                    * @param oGHeader56
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataResponse setKeyData(

                        com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataRequest setKeyDataRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setKeyDataRequest55
            
                * @param oGHeader56
            
          */
        public void startsetKeyData(

            com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataRequest setKeyDataRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updatePayRoutingRequest58
                
                    * @param oGHeader59
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingResponse updatePayRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingRequest updatePayRoutingRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updatePayRoutingRequest58
            
                * @param oGHeader59
            
          */
        public void startupdatePayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingRequest updatePayRoutingRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param instantPaymentNotificationRequest61
                
                    * @param oGHeader62
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationResponse instantPaymentNotification(

                        com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationRequest instantPaymentNotificationRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param instantPaymentNotificationRequest61
            
                * @param oGHeader62
            
          */
        public void startinstantPaymentNotification(

            com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationRequest instantPaymentNotificationRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAuthorizationsHistoryRequest64
                
                    * @param oGHeader65
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryResponse fetchAuthorizationsHistory(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryRequest fetchAuthorizationsHistoryRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAuthorizationsHistoryRequest64
            
                * @param oGHeader65
            
          */
        public void startfetchAuthorizationsHistory(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryRequest fetchAuthorizationsHistoryRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param dCCCheckRequest67
                
                    * @param oGHeader68
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckResponse dCCCheck(

                        com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckRequest dCCCheckRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param dCCCheckRequest67
            
                * @param oGHeader68
            
          */
        public void startdCCCheck(

            com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckRequest dCCCheckRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param checkInRequest70
                
                    * @param oGHeader71
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse checkIn(

                        com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest checkInRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param checkInRequest70
            
                * @param oGHeader71
            
          */
        public void startcheckIn(

            com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest checkInRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchRoomStatusRequest73
                
                    * @param oGHeader74
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse fetchRoomStatus(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest fetchRoomStatusRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRoomStatusRequest73
            
                * @param oGHeader74
            
          */
        public void startfetchRoomStatus(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest fetchRoomStatusRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param reservationRequestCodeRequest76
                
                    * @param oGHeader77
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeResponse reservationRequestCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeRequest reservationRequestCodeRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param reservationRequestCodeRequest76
            
                * @param oGHeader77
            
          */
        public void startreservationRequestCode(

            com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeRequest reservationRequestCodeRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param generateRegistrationCardRequest79
                
                    * @param oGHeader80
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardResponse generateRegistrationCard(

                        com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardRequest generateRegistrationCardRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param generateRegistrationCardRequest79
            
                * @param oGHeader80
            
          */
        public void startgenerateRegistrationCard(

            com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardRequest generateRegistrationCardRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param guestMessagesRequest82
                
                    * @param oGHeader83
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesResponse guestMessages(

                        com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesRequest guestMessagesRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param guestMessagesRequest82
            
                * @param oGHeader83
            
          */
        public void startguestMessages(

            com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesRequest guestMessagesRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param additionalKeysRequest85
                
                    * @param oGHeader86
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysResponse additionalKeys(

                        com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysRequest additionalKeysRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param additionalKeysRequest85
            
                * @param oGHeader86
            
          */
        public void startadditionalKeys(

            com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysRequest additionalKeysRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchRoomSetupRequest88
                
                    * @param oGHeader89
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupResponse fetchRoomSetup(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequest fetchRoomSetupRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRoomSetupRequest88
            
                * @param oGHeader89
            
          */
        public void startfetchRoomSetup(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequest fetchRoomSetupRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param folioTransactionTransferRequest91
                
                    * @param oGHeader92
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferResponse folioTransactionTransfer(

                        com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferRequest folioTransactionTransferRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param folioTransactionTransferRequest91
            
                * @param oGHeader92
            
          */
        public void startfolioTransactionTransfer(

            com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferRequest folioTransactionTransferRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param checkOutRequest94
                
                    * @param oGHeader95
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponse checkOut(

                        com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest checkOutRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param checkOutRequest94
            
                * @param oGHeader95
            
          */
        public void startcheckOut(

            com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest checkOutRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchResPromotionCodeRequest97
                
                    * @param oGHeader98
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponse fetchResPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeRequest fetchResPromotionCodeRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchResPromotionCodeRequest97
            
                * @param oGHeader98
            
          */
        public void startfetchResPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeRequest fetchResPromotionCodeRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param payRoutingRequest100
                
                    * @param oGHeader101
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingResponse payRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingRequest payRoutingRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param payRoutingRequest100
            
                * @param oGHeader101
            
          */
        public void startpayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingRequest payRoutingRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param assignRoomAdvRequest103
                
                    * @param oGHeader104
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvResponse assignRoom(

                        com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvRequest assignRoomAdvRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param assignRoomAdvRequest103
            
                * @param oGHeader104
            
          */
        public void startassignRoom(

            com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvRequest assignRoomAdvRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchKeyDataRequest106
                
                    * @param oGHeader107
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataResponse fetchKeyData(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataRequest fetchKeyDataRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchKeyDataRequest106
            
                * @param oGHeader107
            
          */
        public void startfetchKeyData(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataRequest fetchKeyDataRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param cancelCheckInRequest109
                
                    * @param oGHeader110
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInResponse cancelCheckIn(

                        com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInRequest cancelCheckInRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelCheckInRequest109
            
                * @param oGHeader110
            
          */
        public void startcancelCheckIn(

            com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInRequest cancelCheckInRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param kioskAvaliablityRequest112
                
                    * @param oGHeader113
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityResponse kioskAvaliablity(

                        com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityRequest kioskAvaliablityRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param kioskAvaliablityRequest112
            
                * @param oGHeader113
            
          */
        public void startkioskAvaliablity(

            com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityRequest kioskAvaliablityRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setResPromotionCodeRequest115
                
                    * @param oGHeader116
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeResponse setResPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeRequest setResPromotionCodeRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setResPromotionCodeRequest115
            
                * @param oGHeader116
            
          */
        public void startsetResPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeRequest setResPromotionCodeRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param makePaymentRequest118
                
                    * @param oGHeader119
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentResponse makePayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentRequest makePaymentRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param makePaymentRequest118
            
                * @param oGHeader119
            
          */
        public void startmakePayment(

            com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentRequest makePaymentRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateMethodOfPaymentRequest121
                
                    * @param oGHeader122
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentResponse updateMethodOfPayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentRequest updateMethodOfPaymentRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateMethodOfPaymentRequest121
            
                * @param oGHeader122
            
          */
        public void startupdateMethodOfPayment(

            com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentRequest updateMethodOfPaymentRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchPromotionCodeRequest124
                
                    * @param oGHeader125
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponse fetchPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchPromotionCodeRequest fetchPromotionCodeRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchPromotionCodeRequest124
            
                * @param oGHeader125
            
          */
        public void startfetchPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchPromotionCodeRequest fetchPromotionCodeRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertPayRoutingRequest127
                
                    * @param oGHeader128
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingResponse insertPayRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingRequest insertPayRoutingRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertPayRoutingRequest127
            
                * @param oGHeader128
            
          */
        public void startinsertPayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingRequest insertPayRoutingRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param monitorQueueReservationsRequest130
                
                    * @param oGHeader131
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.MonitorQueueReservationsResponse monitorQueueReservations(

                        com.cloudkey.pms.micros.og.reservation.advanced.MonitorQueueReservationsRequest monitorQueueReservationsRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param monitorQueueReservationsRequest130
            
                * @param oGHeader131
            
          */
        public void startmonitorQueueReservations(

            com.cloudkey.pms.micros.og.reservation.advanced.MonitorQueueReservationsRequest monitorQueueReservationsRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchQueueReservationsRequest133
                
                    * @param oGHeader134
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsResponse fetchQueueReservations(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsRequest fetchQueueReservationsRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchQueueReservationsRequest133
            
                * @param oGHeader134
            
          */
        public void startfetchQueueReservations(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsRequest fetchQueueReservationsRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    