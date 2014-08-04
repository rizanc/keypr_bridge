
/**
 * ResvAdvancedServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /**
     *  ResvAdvancedServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ResvAdvancedServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ResvAdvancedServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ResvAdvancedServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for fetchRoomSetup method
            * override this method for handling normal response from fetchRoomSetup operation
            */
           public void receiveResultfetchRoomSetup(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchRoomSetup operation
           */
            public void receiveErrorfetchRoomSetup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkOut method
            * override this method for handling normal response from checkOut operation
            */
           public void receiveResultcheckOut(
                    com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkOut operation
           */
            public void receiveErrorcheckOut(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateMethodOfPayment method
            * override this method for handling normal response from updateMethodOfPayment operation
            */
           public void receiveResultupdateMethodOfPayment(
                    com.cloudkey.pms.micros.og.reservation.advanced.UpdateMethodOfPaymentResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateMethodOfPayment operation
           */
            public void receiveErrorupdateMethodOfPayment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPromotionCode method
            * override this method for handling normal response from fetchPromotionCode operation
            */
           public void receiveResultfetchPromotionCode(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPromotionCode operation
           */
            public void receiveErrorfetchPromotionCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePayRouting method
            * override this method for handling normal response from updatePayRouting operation
            */
           public void receiveResultupdatePayRouting(
                    com.cloudkey.pms.micros.og.reservation.advanced.UpdatePayRoutingResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updatePayRouting operation
           */
            public void receiveErrorupdatePayRouting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for dCCCheck method
            * override this method for handling normal response from dCCCheck operation
            */
           public void receiveResultdCCCheck(
                    com.cloudkey.pms.micros.og.reservation.advanced.DCCCheckResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from dCCCheck operation
           */
            public void receiveErrordCCCheck(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reservationRequestCode method
            * override this method for handling normal response from reservationRequestCode operation
            */
           public void receiveResultreservationRequestCode(
                    com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reservationRequestCode operation
           */
            public void receiveErrorreservationRequestCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for releaseRoom method
            * override this method for handling normal response from releaseRoom operation
            */
           public void receiveResultreleaseRoom(
                    com.cloudkey.pms.micros.og.reservation.advanced.ReleaseRoomAdvResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from releaseRoom operation
           */
            public void receiveErrorreleaseRoom(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for folioTransactionTransfer method
            * override this method for handling normal response from folioTransactionTransfer operation
            */
           public void receiveResultfolioTransactionTransfer(
                    com.cloudkey.pms.micros.og.reservation.advanced.FolioTransactionTransferResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from folioTransactionTransfer operation
           */
            public void receiveErrorfolioTransactionTransfer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for externalPayment method
            * override this method for handling normal response from externalPayment operation
            */
           public void receiveResultexternalPayment(
                    com.cloudkey.pms.micros.og.reservation.advanced.ExternalPaymentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from externalPayment operation
           */
            public void receiveErrorexternalPayment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for instantPaymentNotification method
            * override this method for handling normal response from instantPaymentNotification operation
            */
           public void receiveResultinstantPaymentNotification(
                    com.cloudkey.pms.micros.og.reservation.advanced.InstantPaymentNotificationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from instantPaymentNotification operation
           */
            public void receiveErrorinstantPaymentNotification(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchResPromotionCode method
            * override this method for handling normal response from fetchResPromotionCode operation
            */
           public void receiveResultfetchResPromotionCode(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchResPromotionCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchResPromotionCode operation
           */
            public void receiveErrorfetchResPromotionCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAuthorizationsHistory method
            * override this method for handling normal response from fetchAuthorizationsHistory operation
            */
           public void receiveResultfetchAuthorizationsHistory(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchAuthorizationsHistoryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAuthorizationsHistory operation
           */
            public void receiveErrorfetchAuthorizationsHistory(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setResPromotionCode method
            * override this method for handling normal response from setResPromotionCode operation
            */
           public void receiveResultsetResPromotionCode(
                    com.cloudkey.pms.micros.og.reservation.advanced.SetResPromotionCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setResPromotionCode operation
           */
            public void receiveErrorsetResPromotionCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelCheckIn method
            * override this method for handling normal response from cancelCheckIn operation
            */
           public void receiveResultcancelCheckIn(
                    com.cloudkey.pms.micros.og.reservation.advanced.CancelCheckInResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelCheckIn operation
           */
            public void receiveErrorcancelCheckIn(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchKeyData method
            * override this method for handling normal response from fetchKeyData operation
            */
           public void receiveResultfetchKeyData(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchKeyDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchKeyData operation
           */
            public void receiveErrorfetchKeyData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for postCharge method
            * override this method for handling normal response from postCharge operation
            */
           public void receiveResultpostCharge(
                    com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from postCharge operation
           */
            public void receiveErrorpostCharge(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queueReservation method
            * override this method for handling normal response from queueReservation operation
            */
           public void receiveResultqueueReservation(
                    com.cloudkey.pms.micros.og.reservation.advanced.QueueReservationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queueReservation operation
           */
            public void receiveErrorqueueReservation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for assignRoom method
            * override this method for handling normal response from assignRoom operation
            */
           public void receiveResultassignRoom(
                    com.cloudkey.pms.micros.og.reservation.advanced.AssignRoomAdvResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from assignRoom operation
           */
            public void receiveErrorassignRoom(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchQueueReservations method
            * override this method for handling normal response from fetchQueueReservations operation
            */
           public void receiveResultfetchQueueReservations(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchQueueReservationsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchQueueReservations operation
           */
            public void receiveErrorfetchQueueReservations(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for invoice method
            * override this method for handling normal response from invoice operation
            */
           public void receiveResultinvoice(
                    com.cloudkey.pms.micros.og.reservation.advanced.InvoiceResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from invoice operation
           */
            public void receiveErrorinvoice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for guestMessages method
            * override this method for handling normal response from guestMessages operation
            */
           public void receiveResultguestMessages(
                    com.cloudkey.pms.micros.og.reservation.advanced.GuestMessagesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from guestMessages operation
           */
            public void receiveErrorguestMessages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for alternateRooms method
            * override this method for handling normal response from alternateRooms operation
            */
           public void receiveResultalternateRooms(
                    com.cloudkey.pms.micros.og.reservation.advanced.AlternateRoomsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from alternateRooms operation
           */
            public void receiveErroralternateRooms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertPayRouting method
            * override this method for handling normal response from insertPayRouting operation
            */
           public void receiveResultinsertPayRouting(
                    com.cloudkey.pms.micros.og.reservation.advanced.InsertPayRoutingResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertPayRouting operation
           */
            public void receiveErrorinsertPayRouting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for makePayment method
            * override this method for handling normal response from makePayment operation
            */
           public void receiveResultmakePayment(
                    com.cloudkey.pms.micros.og.reservation.advanced.MakePaymentResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from makePayment operation
           */
            public void receiveErrormakePayment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for generateRegistrationCard method
            * override this method for handling normal response from generateRegistrationCard operation
            */
           public void receiveResultgenerateRegistrationCard(
                    com.cloudkey.pms.micros.og.reservation.advanced.GenerateRegistrationCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from generateRegistrationCard operation
           */
            public void receiveErrorgenerateRegistrationCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for payRouting method
            * override this method for handling normal response from payRouting operation
            */
           public void receiveResultpayRouting(
                    com.cloudkey.pms.micros.og.reservation.advanced.PayRoutingResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from payRouting operation
           */
            public void receiveErrorpayRouting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for kioskAvaliablity method
            * override this method for handling normal response from kioskAvaliablity operation
            */
           public void receiveResultkioskAvaliablity(
                    com.cloudkey.pms.micros.og.reservation.advanced.KioskAvaliablityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from kioskAvaliablity operation
           */
            public void receiveErrorkioskAvaliablity(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for printPreCheckOutBill method
            * override this method for handling normal response from printPreCheckOutBill operation
            */
           public void receiveResultprintPreCheckOutBill(
                    com.cloudkey.pms.micros.og.reservation.advanced.PrintPreCheckOutBillResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from printPreCheckOutBill operation
           */
            public void receiveErrorprintPreCheckOutBill(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for setKeyData method
            * override this method for handling normal response from setKeyData operation
            */
           public void receiveResultsetKeyData(
                    com.cloudkey.pms.micros.og.reservation.advanced.SetKeyDataResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from setKeyData operation
           */
            public void receiveErrorsetKeyData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for additionalKeys method
            * override this method for handling normal response from additionalKeys operation
            */
           public void receiveResultadditionalKeys(
                    com.cloudkey.pms.micros.og.reservation.advanced.AdditionalKeysResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from additionalKeys operation
           */
            public void receiveErroradditionalKeys(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkIn method
            * override this method for handling normal response from checkIn operation
            */
           public void receiveResultcheckIn(
                    com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkIn operation
           */
            public void receiveErrorcheckIn(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchRoomStatus method
            * override this method for handling normal response from fetchRoomStatus operation
            */
           public void receiveResultfetchRoomStatus(
                    com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchRoomStatus operation
           */
            public void receiveErrorfetchRoomStatus(java.lang.Exception e) {
            }
                


    }
    