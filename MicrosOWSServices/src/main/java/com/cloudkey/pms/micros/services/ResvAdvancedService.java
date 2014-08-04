

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
                    * @param fetchRoomSetupRequest33
                
                    * @param oGHeader34
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupResponseE fetchRoomSetup(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequestE fetchRoomSetupRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRoomSetupRequest33
            
                * @param oGHeader34
            
          */
        public void startfetchRoomSetup(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequestE fetchRoomSetupRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param checkOutRequest36
                
                    * @param oGHeader37
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponseE checkOut(

                        com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequestE checkOutRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param checkOutRequest36
            
                * @param oGHeader37
            
          */
        public void startcheckOut(

            com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequestE checkOutRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateMethodOfPaymentRequest39
                
                    * @param oGHeader40
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentResponseE updateMethodOfPayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentRequestE updateMethodOfPaymentRequest39,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateMethodOfPaymentRequest39
            
                * @param oGHeader40
            
          */
        public void startupdateMethodOfPayment(

            com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentRequestE updateMethodOfPaymentRequest39,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader40,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchPromotionCodeRequest42
                
                    * @param oGHeader43
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponseE fetchPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchPromotionCodeRequestE fetchPromotionCodeRequest42,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader43)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchPromotionCodeRequest42
            
                * @param oGHeader43
            
          */
        public void startfetchPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchPromotionCodeRequestE fetchPromotionCodeRequest42,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader43,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updatePayRoutingRequest45
                
                    * @param oGHeader46
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingResponseE updatePayRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingRequestE updatePayRoutingRequest45,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader46)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updatePayRoutingRequest45
            
                * @param oGHeader46
            
          */
        public void startupdatePayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingRequestE updatePayRoutingRequest45,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader46,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Check Dynamic Currency Conversion.
                    * @param dCCCheckRequest48
                
                    * @param oGHeader49
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckResponse dCCCheck(

                        com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckRequest dCCCheckRequest48,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader49)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Check Dynamic Currency Conversion.
                * @param dCCCheckRequest48
            
                * @param oGHeader49
            
          */
        public void startdCCCheck(

            com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckRequest dCCCheckRequest48,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader49,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param reservationRequestCodeRequest51
                
                    * @param oGHeader52
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeResponseE reservationRequestCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeRequestE reservationRequestCodeRequest51,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader52)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param reservationRequestCodeRequest51
            
                * @param oGHeader52
            
          */
        public void startreservationRequestCode(

            com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeRequestE reservationRequestCodeRequest51,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader52,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param releaseRoomAdvRequest54
                
                    * @param oGHeader55
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvResponseE releaseRoom(

                        com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvRequestE releaseRoomAdvRequest54,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader55)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param releaseRoomAdvRequest54
            
                * @param oGHeader55
            
          */
        public void startreleaseRoom(

            com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvRequestE releaseRoomAdvRequest54,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader55,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param folioTransactionTransferRequest57
                
                    * @param oGHeader58
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferResponseE folioTransactionTransfer(

                        com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferRequestE folioTransactionTransferRequest57,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader58)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param folioTransactionTransferRequest57
            
                * @param oGHeader58
            
          */
        public void startfolioTransactionTransfer(

            com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferRequestE folioTransactionTransferRequest57,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader58,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param externalPaymentRequest60
                
                    * @param oGHeader61
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentResponse externalPayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentRequest externalPaymentRequest60,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader61)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param externalPaymentRequest60
            
                * @param oGHeader61
            
          */
        public void startexternalPayment(

            com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentRequest externalPaymentRequest60,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader61,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param instantPaymentNotificationRequest63
                
                    * @param oGHeader64
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationResponse instantPaymentNotification(

                        com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationRequest instantPaymentNotificationRequest63,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader64)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param instantPaymentNotificationRequest63
            
                * @param oGHeader64
            
          */
        public void startinstantPaymentNotification(

            com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationRequest instantPaymentNotificationRequest63,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader64,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchResPromotionCodeRequest66
                
                    * @param oGHeader67
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponseE fetchResPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeRequestE fetchResPromotionCodeRequest66,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader67)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchResPromotionCodeRequest66
            
                * @param oGHeader67
            
          */
        public void startfetchResPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeRequestE fetchResPromotionCodeRequest66,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader67,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAuthorizationsHistoryRequest69
                
                    * @param oGHeader70
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryResponse fetchAuthorizationsHistory(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryRequest fetchAuthorizationsHistoryRequest69,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader70)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAuthorizationsHistoryRequest69
            
                * @param oGHeader70
            
          */
        public void startfetchAuthorizationsHistory(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryRequest fetchAuthorizationsHistoryRequest69,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader70,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setResPromotionCodeRequest72
                
                    * @param oGHeader73
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeResponseE setResPromotionCode(

                        com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeRequestE setResPromotionCodeRequest72,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader73)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setResPromotionCodeRequest72
            
                * @param oGHeader73
            
          */
        public void startsetResPromotionCode(

            com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeRequestE setResPromotionCodeRequest72,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader73,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param cancelCheckInRequest75
                
                    * @param oGHeader76
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInResponseE cancelCheckIn(

                        com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInRequestE cancelCheckInRequest75,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader76)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelCheckInRequest75
            
                * @param oGHeader76
            
          */
        public void startcancelCheckIn(

            com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInRequestE cancelCheckInRequest75,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader76,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchKeyDataRequest78
                
                    * @param oGHeader79
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataResponseE fetchKeyData(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataRequestE fetchKeyDataRequest78,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader79)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchKeyDataRequest78
            
                * @param oGHeader79
            
          */
        public void startfetchKeyData(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataRequestE fetchKeyDataRequest78,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader79,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param postChargeRequest81
                
                    * @param oGHeader82
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponseE postCharge(

                        com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequestE postChargeRequest81,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader82)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param postChargeRequest81
            
                * @param oGHeader82
            
          */
        public void startpostCharge(

            com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequestE postChargeRequest81,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader82,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Assign or remove existing reservation from queue.
                    * @param queueReservationRequest84
                
                    * @param oGHeader85
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationResponse queueReservation(

                        com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationRequest queueReservationRequest84,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader85)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Assign or remove existing reservation from queue.
                * @param queueReservationRequest84
            
                * @param oGHeader85
            
          */
        public void startqueueReservation(

            com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationRequest queueReservationRequest84,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader85,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param assignRoomAdvRequest87
                
                    * @param oGHeader88
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvResponseE assignRoom(

                        com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvRequestE assignRoomAdvRequest87,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader88)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param assignRoomAdvRequest87
            
                * @param oGHeader88
            
          */
        public void startassignRoom(

            com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvRequestE assignRoomAdvRequest87,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader88,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch existing queue reservations.
                    * @param fetchQueueReservationsRequest90
                
                    * @param oGHeader91
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsResponse fetchQueueReservations(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsRequest fetchQueueReservationsRequest90,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader91)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch existing queue reservations.
                * @param fetchQueueReservationsRequest90
            
                * @param oGHeader91
            
          */
        public void startfetchQueueReservations(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsRequest fetchQueueReservationsRequest90,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader91,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param invoiceRequest93
                
                    * @param oGHeader94
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponseE invoice(

                        com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequestE invoiceRequest93,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader94)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param invoiceRequest93
            
                * @param oGHeader94
            
          */
        public void startinvoice(

            com.cloudkey.pms.micros.og.reservation.advanced.InvoiceRequestE invoiceRequest93,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader94,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param guestMessagesRequest96
                
                    * @param oGHeader97
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesResponseE guestMessages(

                        com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesRequestE guestMessagesRequest96,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader97)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param guestMessagesRequest96
            
                * @param oGHeader97
            
          */
        public void startguestMessages(

            com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesRequestE guestMessagesRequest96,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader97,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param alternateRoomsRequest99
                
                    * @param oGHeader100
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsResponseE alternateRooms(

                        com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsRequestE alternateRoomsRequest99,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader100)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param alternateRoomsRequest99
            
                * @param oGHeader100
            
          */
        public void startalternateRooms(

            com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsRequestE alternateRoomsRequest99,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader100,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertPayRoutingRequest102
                
                    * @param oGHeader103
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingResponseE insertPayRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingRequestE insertPayRoutingRequest102,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader103)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertPayRoutingRequest102
            
                * @param oGHeader103
            
          */
        public void startinsertPayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingRequestE insertPayRoutingRequest102,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader103,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param makePaymentRequest105
                
                    * @param oGHeader106
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentResponseE makePayment(

                        com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentRequestE makePaymentRequest105,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader106)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param makePaymentRequest105
            
                * @param oGHeader106
            
          */
        public void startmakePayment(

            com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentRequestE makePaymentRequest105,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader106,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param generateRegistrationCardRequest108
                
                    * @param oGHeader109
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardResponseE generateRegistrationCard(

                        com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardRequestE generateRegistrationCardRequest108,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader109)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param generateRegistrationCardRequest108
            
                * @param oGHeader109
            
          */
        public void startgenerateRegistrationCard(

            com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardRequestE generateRegistrationCardRequest108,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader109,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param payRoutingRequest111
                
                    * @param oGHeader112
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingResponseE payRouting(

                        com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingRequestE payRoutingRequest111,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader112)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param payRoutingRequest111
            
                * @param oGHeader112
            
          */
        public void startpayRouting(

            com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingRequestE payRoutingRequest111,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader112,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param kioskAvaliablityRequest114
                
                    * @param oGHeader115
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityResponseE kioskAvaliablity(

                        com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityRequestE kioskAvaliablityRequest114,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader115)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param kioskAvaliablityRequest114
            
                * @param oGHeader115
            
          */
        public void startkioskAvaliablity(

            com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityRequestE kioskAvaliablityRequest114,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader115,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param printPreCheckOutBillRequest117
                
                    * @param oGHeader118
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillResponseE printPreCheckOutBill(

                        com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillRequestE printPreCheckOutBillRequest117,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader118)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param printPreCheckOutBillRequest117
            
                * @param oGHeader118
            
          */
        public void startprintPreCheckOutBill(

            com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillRequestE printPreCheckOutBillRequest117,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader118,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param setKeyDataRequest120
                
                    * @param oGHeader121
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataResponseE setKeyData(

                        com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataRequestE setKeyDataRequest120,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader121)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param setKeyDataRequest120
            
                * @param oGHeader121
            
          */
        public void startsetKeyData(

            com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataRequestE setKeyDataRequest120,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader121,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param additionalKeysRequest123
                
                    * @param oGHeader124
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysResponseE additionalKeys(

                        com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysRequestE additionalKeysRequest123,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader124)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param additionalKeysRequest123
            
                * @param oGHeader124
            
          */
        public void startadditionalKeys(

            com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysRequestE additionalKeysRequest123,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader124,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param checkInRequest126
                
                    * @param oGHeader127
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponseE checkIn(

                        com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequestE checkInRequest126,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader127)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param checkInRequest126
            
                * @param oGHeader127
            
          */
        public void startcheckIn(

            com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequestE checkInRequest126,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader127,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchRoomStatusRequest129
                
                    * @param oGHeader130
                
         */

         
                     public com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponseE fetchRoomStatus(

                        com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequestE fetchRoomStatusRequest129,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader130)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRoomStatusRequest129
            
                * @param oGHeader130
            
          */
        public void startfetchRoomStatus(

            com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequestE fetchRoomStatusRequest129,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader130,
                

            final com.cloudkey.pms.micros.services.ResvAdvancedServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    