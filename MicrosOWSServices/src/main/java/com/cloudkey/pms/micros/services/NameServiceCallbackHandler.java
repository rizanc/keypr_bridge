
/**
 * NameServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

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
            * auto generated Axis2 call back method for deleteDocument method
            * override this method for handling normal response from deleteDocument operation
            */
           public void receiveResultdeleteDocument(
                    com.cloudkey.pms.micros.ows.name.DeleteDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteDocument operation
           */
            public void receiveErrordeleteDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteGuestCard method
            * override this method for handling normal response from deleteGuestCard operation
            */
           public void receiveResultdeleteGuestCard(
                    com.cloudkey.pms.micros.ows.name.DeleteGuestCardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteGuestCard operation
           */
            public void receiveErrordeleteGuestCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchProfile method
            * override this method for handling normal response from fetchProfile operation
            */
           public void receiveResultfetchProfile(
                    com.cloudkey.pms.micros.ows.name.FetchProfileResponseE result
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
                    com.cloudkey.pms.micros.ows.name.GetPassportResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPassport operation
           */
            public void receiveErrorgetPassport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchDocumentList method
            * override this method for handling normal response from fetchDocumentList operation
            */
           public void receiveResultfetchDocumentList(
                    com.cloudkey.pms.micros.ows.name.FetchDocumentListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchDocumentList operation
           */
            public void receiveErrorfetchDocumentList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchClaimsStatus method
            * override this method for handling normal response from fetchClaimsStatus operation
            */
           public void receiveResultfetchClaimsStatus(
                    com.cloudkey.pms.micros.ows.name.FetchClaimsStatusResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertPhoneResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateAddressResponseE result
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
                    com.cloudkey.pms.micros.ows.name.TravelAgentLookupResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertUpdatePrivacyOptionResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchCreditCardListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertCreditCardResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertClaimResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchCommentListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchNameResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeletePhoneResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateEmailResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeleteCreditCardResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchSubscriptionResponse result
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
                    com.cloudkey.pms.micros.ows.name.InsertEmailResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeleteCommentResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeletePrivacyOptionResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateCreditCardResponseE result
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
                    com.cloudkey.pms.micros.ows.name.NameLookupResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeletePreferenceResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchAddressListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertGuestCardResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertPreferenceResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertCommentResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchPhoneListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchGuestCardListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateClaimResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeletePassportResponseE result
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
                    com.cloudkey.pms.micros.ows.name.AssociateBookerResponse result
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
                    com.cloudkey.pms.micros.ows.name.UpdateGuestCardResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateCommentResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertAddressResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertAddress operation
           */
            public void receiveErrorinsertAddress(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertUpdateDocument method
            * override this method for handling normal response from insertUpdateDocument operation
            */
           public void receiveResultinsertUpdateDocument(
                    com.cloudkey.pms.micros.ows.name.InsertUpdateDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertUpdateDocument operation
           */
            public void receiveErrorinsertUpdateDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updatePhone method
            * override this method for handling normal response from updatePhone operation
            */
           public void receiveResultupdatePhone(
                    com.cloudkey.pms.micros.ows.name.UpdatePhoneResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchProfileBenefitsResponse result
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
                    com.cloudkey.pms.micros.ows.name.DeleteEmailResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdateNameResponseE result
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
                    com.cloudkey.pms.micros.ows.name.UpdatePassportResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchPreferenceListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.InsertUpdateNameUDFsResponseE result
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
                    com.cloudkey.pms.micros.ows.name.DeleteAddressResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchEmailListResponseE result
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
                    com.cloudkey.pms.micros.ows.name.RegisterNameResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchNameUDFsResponseE result
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
                    com.cloudkey.pms.micros.ows.name.FetchPrivacyOptionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPrivacyOption operation
           */
            public void receiveErrorfetchPrivacyOption(java.lang.Exception e) {
            }
                


    }
    