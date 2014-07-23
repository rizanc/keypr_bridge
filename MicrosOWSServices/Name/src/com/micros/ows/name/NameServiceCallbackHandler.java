
/**
 * NameServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.micros.ows.name;

    /**
     *  NameServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class NameServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public NameServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public NameServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for fetchProfile method
            * override this method for handling normal response from fetchProfile operation
            */
           public void receiveResultfetchProfile(
                    com.micros.ows.name.NameServiceStub.FetchProfileResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchProfile operation
           */
            public void receiveErrorfetchProfile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPassport method
            * override this method for handling normal response from getPassport operation
            */
           public void receiveResultgetPassport(
                    com.micros.ows.name.NameServiceStub.GetPassportResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPassport operation
           */
            public void receiveErrorgetPassport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteGuestCard method
            * override this method for handling normal response from deleteGuestCard operation
            */
           public void receiveResultdeleteGuestCard(
                    com.micros.ows.name.NameServiceStub.DeleteGuestCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteGuestCard operation
           */
            public void receiveErrordeleteGuestCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchClaimsStatus method
            * override this method for handling normal response from fetchClaimsStatus operation
            */
           public void receiveResultfetchClaimsStatus(
                    com.micros.ows.name.NameServiceStub.FetchClaimsStatusResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchClaimsStatus operation
           */
            public void receiveErrorfetchClaimsStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertPhone method
            * override this method for handling normal response from insertPhone operation
            */
           public void receiveResultinsertPhone(
                    com.micros.ows.name.NameServiceStub.InsertPhoneResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertPhone operation
           */
            public void receiveErrorinsertPhone(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateAddress method
            * override this method for handling normal response from updateAddress operation
            */
           public void receiveResultupdateAddress(
                    com.micros.ows.name.NameServiceStub.UpdateAddressResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateAddress operation
           */
            public void receiveErrorupdateAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for travelAgentLookup method
            * override this method for handling normal response from travelAgentLookup operation
            */
           public void receiveResulttravelAgentLookup(
                    com.micros.ows.name.NameServiceStub.TravelAgentLookupResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from travelAgentLookup operation
           */
            public void receiveErrortravelAgentLookup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertUpdatePrivacyOption method
            * override this method for handling normal response from insertUpdatePrivacyOption operation
            */
           public void receiveResultinsertUpdatePrivacyOption(
                    com.micros.ows.name.NameServiceStub.InsertUpdatePrivacyOptionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertUpdatePrivacyOption operation
           */
            public void receiveErrorinsertUpdatePrivacyOption(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchCreditCardList method
            * override this method for handling normal response from fetchCreditCardList operation
            */
           public void receiveResultfetchCreditCardList(
                    com.micros.ows.name.NameServiceStub.FetchCreditCardListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchCreditCardList operation
           */
            public void receiveErrorfetchCreditCardList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertCreditCard method
            * override this method for handling normal response from insertCreditCard operation
            */
           public void receiveResultinsertCreditCard(
                    com.micros.ows.name.NameServiceStub.InsertCreditCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertCreditCard operation
           */
            public void receiveErrorinsertCreditCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertClaim method
            * override this method for handling normal response from insertClaim operation
            */
           public void receiveResultinsertClaim(
                    com.micros.ows.name.NameServiceStub.InsertClaimResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertClaim operation
           */
            public void receiveErrorinsertClaim(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchCommentList method
            * override this method for handling normal response from fetchCommentList operation
            */
           public void receiveResultfetchCommentList(
                    com.micros.ows.name.NameServiceStub.FetchCommentListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchCommentList operation
           */
            public void receiveErrorfetchCommentList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchName method
            * override this method for handling normal response from fetchName operation
            */
           public void receiveResultfetchName(
                    com.micros.ows.name.NameServiceStub.FetchNameResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchName operation
           */
            public void receiveErrorfetchName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePhone method
            * override this method for handling normal response from deletePhone operation
            */
           public void receiveResultdeletePhone(
                    com.micros.ows.name.NameServiceStub.DeletePhoneResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePhone operation
           */
            public void receiveErrordeletePhone(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEmail method
            * override this method for handling normal response from updateEmail operation
            */
           public void receiveResultupdateEmail(
                    com.micros.ows.name.NameServiceStub.UpdateEmailResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEmail operation
           */
            public void receiveErrorupdateEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteCreditCard method
            * override this method for handling normal response from deleteCreditCard operation
            */
           public void receiveResultdeleteCreditCard(
                    com.micros.ows.name.NameServiceStub.DeleteCreditCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteCreditCard operation
           */
            public void receiveErrordeleteCreditCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchSubscription method
            * override this method for handling normal response from fetchSubscription operation
            */
           public void receiveResultfetchSubscription(
                    com.micros.ows.name.NameServiceStub.FetchSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchSubscription operation
           */
            public void receiveErrorfetchSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertEmail method
            * override this method for handling normal response from insertEmail operation
            */
           public void receiveResultinsertEmail(
                    com.micros.ows.name.NameServiceStub.InsertEmailResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertEmail operation
           */
            public void receiveErrorinsertEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteComment method
            * override this method for handling normal response from deleteComment operation
            */
           public void receiveResultdeleteComment(
                    com.micros.ows.name.NameServiceStub.DeleteCommentResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteComment operation
           */
            public void receiveErrordeleteComment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePrivacyOption method
            * override this method for handling normal response from deletePrivacyOption operation
            */
           public void receiveResultdeletePrivacyOption(
                    com.micros.ows.name.NameServiceStub.DeletePrivacyOptionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePrivacyOption operation
           */
            public void receiveErrordeletePrivacyOption(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateCreditCard method
            * override this method for handling normal response from updateCreditCard operation
            */
           public void receiveResultupdateCreditCard(
                    com.micros.ows.name.NameServiceStub.UpdateCreditCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateCreditCard operation
           */
            public void receiveErrorupdateCreditCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for nameLookup method
            * override this method for handling normal response from nameLookup operation
            */
           public void receiveResultnameLookup(
                    com.micros.ows.name.NameServiceStub.NameLookupResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from nameLookup operation
           */
            public void receiveErrornameLookup(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePreference method
            * override this method for handling normal response from deletePreference operation
            */
           public void receiveResultdeletePreference(
                    com.micros.ows.name.NameServiceStub.DeletePreferenceResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePreference operation
           */
            public void receiveErrordeletePreference(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAddressList method
            * override this method for handling normal response from fetchAddressList operation
            */
           public void receiveResultfetchAddressList(
                    com.micros.ows.name.NameServiceStub.FetchAddressListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAddressList operation
           */
            public void receiveErrorfetchAddressList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertGuestCard method
            * override this method for handling normal response from insertGuestCard operation
            */
           public void receiveResultinsertGuestCard(
                    com.micros.ows.name.NameServiceStub.InsertGuestCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertGuestCard operation
           */
            public void receiveErrorinsertGuestCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertPreference method
            * override this method for handling normal response from insertPreference operation
            */
           public void receiveResultinsertPreference(
                    com.micros.ows.name.NameServiceStub.InsertPreferenceResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertPreference operation
           */
            public void receiveErrorinsertPreference(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertComment method
            * override this method for handling normal response from insertComment operation
            */
           public void receiveResultinsertComment(
                    com.micros.ows.name.NameServiceStub.InsertCommentResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertComment operation
           */
            public void receiveErrorinsertComment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPhoneList method
            * override this method for handling normal response from fetchPhoneList operation
            */
           public void receiveResultfetchPhoneList(
                    com.micros.ows.name.NameServiceStub.FetchPhoneListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPhoneList operation
           */
            public void receiveErrorfetchPhoneList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchGuestCardList method
            * override this method for handling normal response from fetchGuestCardList operation
            */
           public void receiveResultfetchGuestCardList(
                    com.micros.ows.name.NameServiceStub.FetchGuestCardListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchGuestCardList operation
           */
            public void receiveErrorfetchGuestCardList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateClaim method
            * override this method for handling normal response from updateClaim operation
            */
           public void receiveResultupdateClaim(
                    com.micros.ows.name.NameServiceStub.UpdateClaimResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateClaim operation
           */
            public void receiveErrorupdateClaim(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePassport method
            * override this method for handling normal response from deletePassport operation
            */
           public void receiveResultdeletePassport(
                    com.micros.ows.name.NameServiceStub.DeletePassportResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePassport operation
           */
            public void receiveErrordeletePassport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for associateBooker method
            * override this method for handling normal response from associateBooker operation
            */
           public void receiveResultassociateBooker(
                    com.micros.ows.name.NameServiceStub.AssociateBookerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from associateBooker operation
           */
            public void receiveErrorassociateBooker(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateGuestCard method
            * override this method for handling normal response from updateGuestCard operation
            */
           public void receiveResultupdateGuestCard(
                    com.micros.ows.name.NameServiceStub.UpdateGuestCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateGuestCard operation
           */
            public void receiveErrorupdateGuestCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateComment method
            * override this method for handling normal response from updateComment operation
            */
           public void receiveResultupdateComment(
                    com.micros.ows.name.NameServiceStub.UpdateCommentResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateComment operation
           */
            public void receiveErrorupdateComment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertAddress method
            * override this method for handling normal response from insertAddress operation
            */
           public void receiveResultinsertAddress(
                    com.micros.ows.name.NameServiceStub.InsertAddressResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertAddress operation
           */
            public void receiveErrorinsertAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePhone method
            * override this method for handling normal response from updatePhone operation
            */
           public void receiveResultupdatePhone(
                    com.micros.ows.name.NameServiceStub.UpdatePhoneResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updatePhone operation
           */
            public void receiveErrorupdatePhone(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchProfileBenefits method
            * override this method for handling normal response from fetchProfileBenefits operation
            */
           public void receiveResultfetchProfileBenefits(
                    com.micros.ows.name.NameServiceStub.FetchProfileBenefitsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchProfileBenefits operation
           */
            public void receiveErrorfetchProfileBenefits(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteEmail method
            * override this method for handling normal response from deleteEmail operation
            */
           public void receiveResultdeleteEmail(
                    com.micros.ows.name.NameServiceStub.DeleteEmailResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteEmail operation
           */
            public void receiveErrordeleteEmail(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateName method
            * override this method for handling normal response from updateName operation
            */
           public void receiveResultupdateName(
                    com.micros.ows.name.NameServiceStub.UpdateNameResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateName operation
           */
            public void receiveErrorupdateName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePassport method
            * override this method for handling normal response from updatePassport operation
            */
           public void receiveResultupdatePassport(
                    com.micros.ows.name.NameServiceStub.UpdatePassportResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updatePassport operation
           */
            public void receiveErrorupdatePassport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPreferenceList method
            * override this method for handling normal response from fetchPreferenceList operation
            */
           public void receiveResultfetchPreferenceList(
                    com.micros.ows.name.NameServiceStub.FetchPreferenceListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPreferenceList operation
           */
            public void receiveErrorfetchPreferenceList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertUpdateNameUDFs method
            * override this method for handling normal response from insertUpdateNameUDFs operation
            */
           public void receiveResultinsertUpdateNameUDFs(
                    com.micros.ows.name.NameServiceStub.InsertUpdateNameUDFsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertUpdateNameUDFs operation
           */
            public void receiveErrorinsertUpdateNameUDFs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteAddress method
            * override this method for handling normal response from deleteAddress operation
            */
           public void receiveResultdeleteAddress(
                    com.micros.ows.name.NameServiceStub.DeleteAddressResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteAddress operation
           */
            public void receiveErrordeleteAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchEmailList method
            * override this method for handling normal response from fetchEmailList operation
            */
           public void receiveResultfetchEmailList(
                    com.micros.ows.name.NameServiceStub.FetchEmailListResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchEmailList operation
           */
            public void receiveErrorfetchEmailList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for registerName method
            * override this method for handling normal response from registerName operation
            */
           public void receiveResultregisterName(
                    com.micros.ows.name.NameServiceStub.RegisterNameResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from registerName operation
           */
            public void receiveErrorregisterName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchNameUDFs method
            * override this method for handling normal response from fetchNameUDFs operation
            */
           public void receiveResultfetchNameUDFs(
                    com.micros.ows.name.NameServiceStub.FetchNameUDFsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchNameUDFs operation
           */
            public void receiveErrorfetchNameUDFs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPrivacyOption method
            * override this method for handling normal response from fetchPrivacyOption operation
            */
           public void receiveResultfetchPrivacyOption(
                    com.micros.ows.name.NameServiceStub.FetchPrivacyOptionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPrivacyOption operation
           */
            public void receiveErrorfetchPrivacyOption(java.lang.Exception e) {
            }
                


    }
    