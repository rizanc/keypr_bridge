

/**
 * NameService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  NameService java interface
     */

    public interface NameService {
          

        /**
          * Auto generated method signature
          * Deletes a specific document from a profile, given the name and document identifiers.
                    * @param deleteDocumentRequest49
                
                    * @param oGHeader50
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteDocumentResponse deleteDocument(

                        com.cloudkey.pms.micros.ows.name.DeleteDocumentRequest deleteDocumentRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific document from a profile, given the name and document identifiers.
                * @param deleteDocumentRequest49
            
                * @param oGHeader50
            
          */
        public void startdeleteDocument(

            com.cloudkey.pms.micros.ows.name.DeleteDocumentRequest deleteDocumentRequest49,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader50,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific membership number from a profile, given the guest card identifier.
                    * @param deleteGuestCardRequest52
                
                    * @param oGHeader53
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteGuestCardResponseE deleteGuestCard(

                        com.cloudkey.pms.micros.ows.name.DeleteGuestCardRequestE deleteGuestCardRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific membership number from a profile, given the guest card identifier.
                * @param deleteGuestCardRequest52
            
                * @param oGHeader53
            
          */
        public void startdeleteGuestCard(

            com.cloudkey.pms.micros.ows.name.DeleteGuestCardRequestE deleteGuestCardRequest52,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader53,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch complete profile details for guest,agent,company,group or source profile.
                    * @param fetchProfileRequest55
                
                    * @param oGHeader56
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchProfileResponseE fetchProfile(

                        com.cloudkey.pms.micros.ows.name.FetchProfileRequestE fetchProfileRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch complete profile details for guest,agent,company,group or source profile.
                * @param fetchProfileRequest55
            
                * @param oGHeader56
            
          */
        public void startfetchProfile(

            com.cloudkey.pms.micros.ows.name.FetchProfileRequestE fetchProfileRequest55,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader56,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the passport information from a profile, given the name identifier.
                    * @param getPassportRequest58
                
                    * @param oGHeader59
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.GetPassportResponseE getPassport(

                        com.cloudkey.pms.micros.ows.name.GetPassportRequestE getPassportRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the passport information from a profile, given the name identifier.
                * @param getPassportRequest58
            
                * @param oGHeader59
            
          */
        public void startgetPassport(

            com.cloudkey.pms.micros.ows.name.GetPassportRequestE getPassportRequest58,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader59,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of documents from a profile, given the name identifier.
                    * @param fetchDocumentListRequest61
                
                    * @param oGHeader62
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchDocumentListResponse fetchDocumentList(

                        com.cloudkey.pms.micros.ows.name.FetchDocumentListRequest fetchDocumentListRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of documents from a profile, given the name identifier.
                * @param fetchDocumentListRequest61
            
                * @param oGHeader62
            
          */
        public void startfetchDocumentList(

            com.cloudkey.pms.micros.ows.name.FetchDocumentListRequest fetchDocumentListRequest61,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader62,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch the status of the claims submitted by a profile.
                    * @param fetchClaimsStatusRequest64
                
                    * @param oGHeader65
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchClaimsStatusResponseE fetchClaimsStatus(

                        com.cloudkey.pms.micros.ows.name.FetchClaimsStatusRequestE fetchClaimsStatusRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch the status of the claims submitted by a profile.
                * @param fetchClaimsStatusRequest64
            
                * @param oGHeader65
            
          */
        public void startfetchClaimsStatus(

            com.cloudkey.pms.micros.ows.name.FetchClaimsStatusRequestE fetchClaimsStatusRequest64,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader65,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds a phone record to a profile, given the name identifier and phone information to insert.
                    * @param insertPhoneRequest67
                
                    * @param oGHeader68
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertPhoneResponseE insertPhone(

                        com.cloudkey.pms.micros.ows.name.InsertPhoneRequestE insertPhoneRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds a phone record to a profile, given the name identifier and phone information to insert.
                * @param insertPhoneRequest67
            
                * @param oGHeader68
            
          */
        public void startinsertPhone(

            com.cloudkey.pms.micros.ows.name.InsertPhoneRequestE insertPhoneRequest67,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader68,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies an address record in a profile, given the address information.
                    * @param updateAddressRequest70
                
                    * @param oGHeader71
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateAddressResponseE updateAddress(

                        com.cloudkey.pms.micros.ows.name.UpdateAddressRequestE updateAddressRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies an address record in a profile, given the address information.
                * @param updateAddressRequest70
            
                * @param oGHeader71
            
          */
        public void startupdateAddress(

            com.cloudkey.pms.micros.ows.name.UpdateAddressRequestE updateAddressRequest70,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader71,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch travel agent,company,group or source profile.
                    * @param travelAgentLookupRequest73
                
                    * @param oGHeader74
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.TravelAgentLookupResponseE travelAgentLookup(

                        com.cloudkey.pms.micros.ows.name.TravelAgentLookupRequestE travelAgentLookupRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch travel agent,company,group or source profile.
                * @param travelAgentLookupRequest73
            
                * @param oGHeader74
            
          */
        public void starttravelAgentLookup(

            com.cloudkey.pms.micros.ows.name.TravelAgentLookupRequestE travelAgentLookupRequest73,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader74,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds to or modifies the list of privacy option settings for a profile, given the name identifier and a list of privacy option setting records.
                    * @param insertUpdatePrivacyOptionRequest76
                
                    * @param oGHeader77
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertUpdatePrivacyOptionResponseE insertUpdatePrivacyOption(

                        com.cloudkey.pms.micros.ows.name.InsertUpdatePrivacyOptionRequestE insertUpdatePrivacyOptionRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds to or modifies the list of privacy option settings for a profile, given the name identifier and a list of privacy option setting records.
                * @param insertUpdatePrivacyOptionRequest76
            
                * @param oGHeader77
            
          */
        public void startinsertUpdatePrivacyOption(

            com.cloudkey.pms.micros.ows.name.InsertUpdatePrivacyOptionRequestE insertUpdatePrivacyOptionRequest76,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader77,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of credit card records from a profile, given the name identifier.
                    * @param fetchCreditCardListRequest79
                
                    * @param oGHeader80
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchCreditCardListResponseE fetchCreditCardList(

                        com.cloudkey.pms.micros.ows.name.FetchCreditCardListRequestE fetchCreditCardListRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of credit card records from a profile, given the name identifier.
                * @param fetchCreditCardListRequest79
            
                * @param oGHeader80
            
          */
        public void startfetchCreditCardList(

            com.cloudkey.pms.micros.ows.name.FetchCreditCardListRequestE fetchCreditCardListRequest79,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader80,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds a credit card record to a profile, given the name identifier and credit card information to insert.
                    * @param insertCreditCardRequest82
                
                    * @param oGHeader83
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertCreditCardResponseE insertCreditCard(

                        com.cloudkey.pms.micros.ows.name.InsertCreditCardRequestE insertCreditCardRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds a credit card record to a profile, given the name identifier and credit card information to insert.
                * @param insertCreditCardRequest82
            
                * @param oGHeader83
            
          */
        public void startinsertCreditCard(

            com.cloudkey.pms.micros.ows.name.InsertCreditCardRequestE insertCreditCardRequest82,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader83,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Submit claims for the profile.
                    * @param insertClaimRequest85
                
                    * @param oGHeader86
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertClaimResponseE insertClaim(

                        com.cloudkey.pms.micros.ows.name.InsertClaimRequestE insertClaimRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Submit claims for the profile.
                * @param insertClaimRequest85
            
                * @param oGHeader86
            
          */
        public void startinsertClaim(

            com.cloudkey.pms.micros.ows.name.InsertClaimRequestE insertClaimRequest85,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader86,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of comments from a profile, given the name identifier.
                    * @param fetchCommentListRequest88
                
                    * @param oGHeader89
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchCommentListResponseE fetchCommentList(

                        com.cloudkey.pms.micros.ows.name.FetchCommentListRequestE fetchCommentListRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of comments from a profile, given the name identifier.
                * @param fetchCommentListRequest88
            
                * @param oGHeader89
            
          */
        public void startfetchCommentList(

            com.cloudkey.pms.micros.ows.name.FetchCommentListRequestE fetchCommentListRequest88,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader89,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the name record from a profile, including any birthday and gender information, given the name identifier.
                    * @param fetchNameRequest91
                
                    * @param oGHeader92
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchNameResponseE fetchName(

                        com.cloudkey.pms.micros.ows.name.FetchNameRequestE fetchNameRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the name record from a profile, including any birthday and gender information, given the name identifier.
                * @param fetchNameRequest91
            
                * @param oGHeader92
            
          */
        public void startfetchName(

            com.cloudkey.pms.micros.ows.name.FetchNameRequestE fetchNameRequest91,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader92,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific phone record from a profile, given the phone record identifier.
                    * @param deletePhoneRequest94
                
                    * @param oGHeader95
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeletePhoneResponseE deletePhone(

                        com.cloudkey.pms.micros.ows.name.DeletePhoneRequestE deletePhoneRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific phone record from a profile, given the phone record identifier.
                * @param deletePhoneRequest94
            
                * @param oGHeader95
            
          */
        public void startdeletePhone(

            com.cloudkey.pms.micros.ows.name.DeletePhoneRequestE deletePhoneRequest94,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader95,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies an e-mail address record in a profile, given the-e-mail address information.
                    * @param updateEmailRequest97
                
                    * @param oGHeader98
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateEmailResponseE updateEmail(

                        com.cloudkey.pms.micros.ows.name.UpdateEmailRequestE updateEmailRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies an e-mail address record in a profile, given the-e-mail address information.
                * @param updateEmailRequest97
            
                * @param oGHeader98
            
          */
        public void startupdateEmail(

            com.cloudkey.pms.micros.ows.name.UpdateEmailRequestE updateEmailRequest97,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader98,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific credit card record from a profile, given the credit card identifier.
                    * @param deleteCreditCardRequest100
                
                    * @param oGHeader101
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteCreditCardResponseE deleteCreditCard(

                        com.cloudkey.pms.micros.ows.name.DeleteCreditCardRequestE deleteCreditCardRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific credit card record from a profile, given the credit card identifier.
                * @param deleteCreditCardRequest100
            
                * @param oGHeader101
            
          */
        public void startdeleteCreditCard(

            com.cloudkey.pms.micros.ows.name.DeleteCreditCardRequestE deleteCreditCardRequest100,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader101,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch the external system name ids of a profile.
                    * @param fetchSubscriptionRequest103
                
                    * @param oGHeader104
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchSubscriptionResponse fetchSubscription(

                        com.cloudkey.pms.micros.ows.name.FetchSubscriptionRequestE fetchSubscriptionRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch the external system name ids of a profile.
                * @param fetchSubscriptionRequest103
            
                * @param oGHeader104
            
          */
        public void startfetchSubscription(

            com.cloudkey.pms.micros.ows.name.FetchSubscriptionRequestE fetchSubscriptionRequest103,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader104,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds an e-mail address record to a profile, given the name identifier and e-mail address to insert.
                    * @param insertEmailRequest106
                
                    * @param oGHeader107
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertEmailResponseE insertEmail(

                        com.cloudkey.pms.micros.ows.name.InsertEmailRequestE insertEmailRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds an e-mail address record to a profile, given the name identifier and e-mail address to insert.
                * @param insertEmailRequest106
            
                * @param oGHeader107
            
          */
        public void startinsertEmail(

            com.cloudkey.pms.micros.ows.name.InsertEmailRequestE insertEmailRequest106,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader107,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific comment from a profile, given the name and comment identifiers.
                    * @param deleteCommentRequest109
                
                    * @param oGHeader110
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteCommentResponseE deleteComment(

                        com.cloudkey.pms.micros.ows.name.DeleteCommentRequestE deleteCommentRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific comment from a profile, given the name and comment identifiers.
                * @param deleteCommentRequest109
            
                * @param oGHeader110
            
          */
        public void startdeleteComment(

            com.cloudkey.pms.micros.ows.name.DeleteCommentRequestE deleteCommentRequest109,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader110,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes the privacy option settings for a profile, given the name identifier.
                    * @param deletePrivacyOptionRequest112
                
                    * @param oGHeader113
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeletePrivacyOptionResponseE deletePrivacyOption(

                        com.cloudkey.pms.micros.ows.name.DeletePrivacyOptionRequestE deletePrivacyOptionRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes the privacy option settings for a profile, given the name identifier.
                * @param deletePrivacyOptionRequest112
            
                * @param oGHeader113
            
          */
        public void startdeletePrivacyOption(

            com.cloudkey.pms.micros.ows.name.DeletePrivacyOptionRequestE deletePrivacyOptionRequest112,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader113,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies a credit card record in a profile, given the credit card information.
                    * @param updateCreditCardRequest115
                
                    * @param oGHeader116
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateCreditCardResponseE updateCreditCard(

                        com.cloudkey.pms.micros.ows.name.UpdateCreditCardRequestE updateCreditCardRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies a credit card record in a profile, given the credit card information.
                * @param updateCreditCardRequest115
            
                * @param oGHeader116
            
          */
        public void startupdateCreditCard(

            com.cloudkey.pms.micros.ows.name.UpdateCreditCardRequestE updateCreditCardRequest115,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader116,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves a list of profile records, given the name look-up credit card, membership, or e-mail address criteria.
                    * @param nameLookupRequest118
                
                    * @param oGHeader119
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.NameLookupResponseE nameLookup(

                        com.cloudkey.pms.micros.ows.name.NameLookupRequestE nameLookupRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves a list of profile records, given the name look-up credit card, membership, or e-mail address criteria.
                * @param nameLookupRequest118
            
                * @param oGHeader119
            
          */
        public void startnameLookup(

            com.cloudkey.pms.micros.ows.name.NameLookupRequestE nameLookupRequest118,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader119,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific preference from a profile, given the name identifier and the preference.
                    * @param deletePreferenceRequest121
                
                    * @param oGHeader122
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeletePreferenceResponseE deletePreference(

                        com.cloudkey.pms.micros.ows.name.DeletePreferenceRequestE deletePreferenceRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific preference from a profile, given the name identifier and the preference.
                * @param deletePreferenceRequest121
            
                * @param oGHeader122
            
          */
        public void startdeletePreference(

            com.cloudkey.pms.micros.ows.name.DeletePreferenceRequestE deletePreferenceRequest121,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader122,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves a list of address records from a profile, given the name identifier.
                    * @param fetchAddressListRequest124
                
                    * @param oGHeader125
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchAddressListResponseE fetchAddressList(

                        com.cloudkey.pms.micros.ows.name.FetchAddressListRequestE fetchAddressListRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves a list of address records from a profile, given the name identifier.
                * @param fetchAddressListRequest124
            
                * @param oGHeader125
            
          */
        public void startfetchAddressList(

            com.cloudkey.pms.micros.ows.name.FetchAddressListRequestE fetchAddressListRequest124,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader125,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds a membership record to a profile, given the name identifier and membership information to insert.
                    * @param insertGuestCardRequest127
                
                    * @param oGHeader128
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertGuestCardResponseE insertGuestCard(

                        com.cloudkey.pms.micros.ows.name.InsertGuestCardRequestE insertGuestCardRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds a membership record to a profile, given the name identifier and membership information to insert.
                * @param insertGuestCardRequest127
            
                * @param oGHeader128
            
          */
        public void startinsertGuestCard(

            com.cloudkey.pms.micros.ows.name.InsertGuestCardRequestE insertGuestCardRequest127,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader128,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds a preference to a profile, given the name identifier and preference description.
                    * @param insertPreferenceRequest130
                
                    * @param oGHeader131
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertPreferenceResponseE insertPreference(

                        com.cloudkey.pms.micros.ows.name.InsertPreferenceRequestE insertPreferenceRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds a preference to a profile, given the name identifier and preference description.
                * @param insertPreferenceRequest130
            
                * @param oGHeader131
            
          */
        public void startinsertPreference(

            com.cloudkey.pms.micros.ows.name.InsertPreferenceRequestE insertPreferenceRequest130,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader131,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds a comment to a profile, given the name identifier and comment information to insert.
                    * @param insertCommentRequest133
                
                    * @param oGHeader134
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertCommentResponseE insertComment(

                        com.cloudkey.pms.micros.ows.name.InsertCommentRequestE insertCommentRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds a comment to a profile, given the name identifier and comment information to insert.
                * @param insertCommentRequest133
            
                * @param oGHeader134
            
          */
        public void startinsertComment(

            com.cloudkey.pms.micros.ows.name.InsertCommentRequestE insertCommentRequest133,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader134,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of phone records from a profile, given the name identifier.
                    * @param fetchPhoneListRequest136
                
                    * @param oGHeader137
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchPhoneListResponseE fetchPhoneList(

                        com.cloudkey.pms.micros.ows.name.FetchPhoneListRequestE fetchPhoneListRequest136,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader137)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of phone records from a profile, given the name identifier.
                * @param fetchPhoneListRequest136
            
                * @param oGHeader137
            
          */
        public void startfetchPhoneList(

            com.cloudkey.pms.micros.ows.name.FetchPhoneListRequestE fetchPhoneListRequest136,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader137,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of membership records from a profile, given the name identifier.
                    * @param fetchGuestCardListRequest139
                
                    * @param oGHeader140
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchGuestCardListResponseE fetchGuestCardList(

                        com.cloudkey.pms.micros.ows.name.FetchGuestCardListRequestE fetchGuestCardListRequest139,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader140)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of membership records from a profile, given the name identifier.
                * @param fetchGuestCardListRequest139
            
                * @param oGHeader140
            
          */
        public void startfetchGuestCardList(

            com.cloudkey.pms.micros.ows.name.FetchGuestCardListRequestE fetchGuestCardListRequest139,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader140,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modify an existing claim.
                    * @param updateClaimRequest142
                
                    * @param oGHeader143
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateClaimResponseE updateClaim(

                        com.cloudkey.pms.micros.ows.name.UpdateClaimRequestE updateClaimRequest142,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader143)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modify an existing claim.
                * @param updateClaimRequest142
            
                * @param oGHeader143
            
          */
        public void startupdateClaim(

            com.cloudkey.pms.micros.ows.name.UpdateClaimRequestE updateClaimRequest142,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader143,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes the passport information from a profile, given the name identifier.
                    * @param deletePassportRequest145
                
                    * @param oGHeader146
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeletePassportResponseE deletePassport(

                        com.cloudkey.pms.micros.ows.name.DeletePassportRequestE deletePassportRequest145,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader146)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes the passport information from a profile, given the name identifier.
                * @param deletePassportRequest145
            
                * @param oGHeader146
            
          */
        public void startdeletePassport(

            com.cloudkey.pms.micros.ows.name.DeletePassportRequestE deletePassportRequest145,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader146,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Associate a booker to multiple properties or chains.This function is in progress and not implemented
                    * @param associateBookerRequest148
                
                    * @param oGHeader149
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.AssociateBookerResponse associateBooker(

                        com.cloudkey.pms.micros.ows.name.AssociateBookerRequest associateBookerRequest148,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader149)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Associate a booker to multiple properties or chains.This function is in progress and not implemented
                * @param associateBookerRequest148
            
                * @param oGHeader149
            
          */
        public void startassociateBooker(

            com.cloudkey.pms.micros.ows.name.AssociateBookerRequest associateBookerRequest148,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader149,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies a membership record in a profile, given the membership information.
                    * @param updateGuestCardRequest151
                
                    * @param oGHeader152
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateGuestCardResponseE updateGuestCard(

                        com.cloudkey.pms.micros.ows.name.UpdateGuestCardRequestE updateGuestCardRequest151,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader152)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies a membership record in a profile, given the membership information.
                * @param updateGuestCardRequest151
            
                * @param oGHeader152
            
          */
        public void startupdateGuestCard(

            com.cloudkey.pms.micros.ows.name.UpdateGuestCardRequestE updateGuestCardRequest151,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader152,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies a comment record in a profile, given the name identifier and comment information.
                    * @param updateCommentRequest154
                
                    * @param oGHeader155
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateCommentResponseE updateComment(

                        com.cloudkey.pms.micros.ows.name.UpdateCommentRequestE updateCommentRequest154,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader155)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies a comment record in a profile, given the name identifier and comment information.
                * @param updateCommentRequest154
            
                * @param oGHeader155
            
          */
        public void startupdateComment(

            com.cloudkey.pms.micros.ows.name.UpdateCommentRequestE updateCommentRequest154,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader155,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds an address record to a profile, given the name identifier and address information to insert.
                    * @param insertAddressRequest157
                
                    * @param oGHeader158
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertAddressResponseE insertAddress(

                        com.cloudkey.pms.micros.ows.name.InsertAddressRequestE insertAddressRequest157,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader158)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds an address record to a profile, given the name identifier and address information to insert.
                * @param insertAddressRequest157
            
                * @param oGHeader158
            
          */
        public void startinsertAddress(

            com.cloudkey.pms.micros.ows.name.InsertAddressRequestE insertAddressRequest157,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader158,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds or updates a document to a profile, given the name identifier and document information to insert or update.
                    * @param insertUpdateDocumentRequest160
                
                    * @param oGHeader161
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertUpdateDocumentResponse insertUpdateDocument(

                        com.cloudkey.pms.micros.ows.name.InsertUpdateDocumentRequest insertUpdateDocumentRequest160,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader161)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds or updates a document to a profile, given the name identifier and document information to insert or update.
                * @param insertUpdateDocumentRequest160
            
                * @param oGHeader161
            
          */
        public void startinsertUpdateDocument(

            com.cloudkey.pms.micros.ows.name.InsertUpdateDocumentRequest insertUpdateDocumentRequest160,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader161,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies a phone record in a profile, given the phone information.
                    * @param updatePhoneRequest163
                
                    * @param oGHeader164
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdatePhoneResponseE updatePhone(

                        com.cloudkey.pms.micros.ows.name.UpdatePhoneRequestE updatePhoneRequest163,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader164)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies a phone record in a profile, given the phone information.
                * @param updatePhoneRequest163
            
                * @param oGHeader164
            
          */
        public void startupdatePhone(

            com.cloudkey.pms.micros.ows.name.UpdatePhoneRequestE updatePhoneRequest163,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader164,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch all promotions and ecertificates associated with a profile.
                    * @param fetchProfileBenefitsRequest166
                
                    * @param oGHeader167
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchProfileBenefitsResponse fetchProfileBenefits(

                        com.cloudkey.pms.micros.ows.name.FetchProfileBenefitsRequestE fetchProfileBenefitsRequest166,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader167)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch all promotions and ecertificates associated with a profile.
                * @param fetchProfileBenefitsRequest166
            
                * @param oGHeader167
            
          */
        public void startfetchProfileBenefits(

            com.cloudkey.pms.micros.ows.name.FetchProfileBenefitsRequestE fetchProfileBenefitsRequest166,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader167,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific e-mail record from a profile, given the e-mail identifier.
                    * @param deleteEmailRequest169
                
                    * @param oGHeader170
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteEmailResponseE deleteEmail(

                        com.cloudkey.pms.micros.ows.name.DeleteEmailRequestE deleteEmailRequest169,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader170)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific e-mail record from a profile, given the e-mail identifier.
                * @param deleteEmailRequest169
            
                * @param oGHeader170
            
          */
        public void startdeleteEmail(

            com.cloudkey.pms.micros.ows.name.DeleteEmailRequestE deleteEmailRequest169,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader170,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Modifies the name information in a profile, given at least the name identifier and name record. Native name record, birth date, and gender are also allowed.
                    * @param updateNameRequest172
                
                    * @param oGHeader173
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdateNameResponseE updateName(

                        com.cloudkey.pms.micros.ows.name.UpdateNameRequestE updateNameRequest172,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader173)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Modifies the name information in a profile, given at least the name identifier and name record. Native name record, birth date, and gender are also allowed.
                * @param updateNameRequest172
            
                * @param oGHeader173
            
          */
        public void startupdateName(

            com.cloudkey.pms.micros.ows.name.UpdateNameRequestE updateNameRequest172,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader173,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds or modifies the passport record in a profile, given the name identifier and passport information.
                    * @param updatePassportRequest175
                
                    * @param oGHeader176
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.UpdatePassportResponseE updatePassport(

                        com.cloudkey.pms.micros.ows.name.UpdatePassportRequestE updatePassportRequest175,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader176)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds or modifies the passport record in a profile, given the name identifier and passport information.
                * @param updatePassportRequest175
            
                * @param oGHeader176
            
          */
        public void startupdatePassport(

            com.cloudkey.pms.micros.ows.name.UpdatePassportRequestE updatePassportRequest175,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader176,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of preferences from a profile, given the name identifier.
                    * @param fetchPreferenceListRequest178
                
                    * @param oGHeader179
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchPreferenceListResponseE fetchPreferenceList(

                        com.cloudkey.pms.micros.ows.name.FetchPreferenceListRequestE fetchPreferenceListRequest178,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader179)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of preferences from a profile, given the name identifier.
                * @param fetchPreferenceListRequest178
            
                * @param oGHeader179
            
          */
        public void startfetchPreferenceList(

            com.cloudkey.pms.micros.ows.name.FetchPreferenceListRequestE fetchPreferenceListRequest178,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader179,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Adds to or modifies the list of user-defined field values in a profile, given the name identifier and a list of UDF records.
                    * @param insertUpdateNameUDFsRequest181
                
                    * @param oGHeader182
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.InsertUpdateNameUDFsResponseE insertUpdateNameUDFs(

                        com.cloudkey.pms.micros.ows.name.InsertUpdateNameUDFsRequestE insertUpdateNameUDFsRequest181,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader182)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Adds to or modifies the list of user-defined field values in a profile, given the name identifier and a list of UDF records.
                * @param insertUpdateNameUDFsRequest181
            
                * @param oGHeader182
            
          */
        public void startinsertUpdateNameUDFs(

            com.cloudkey.pms.micros.ows.name.InsertUpdateNameUDFsRequestE insertUpdateNameUDFsRequest181,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader182,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Deletes a specific address from a profile, given the address identifier.
                    * @param deleteAddressRequest184
                
                    * @param oGHeader185
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.DeleteAddressResponseE deleteAddress(

                        com.cloudkey.pms.micros.ows.name.DeleteAddressRequestE deleteAddressRequest184,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader185)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Deletes a specific address from a profile, given the address identifier.
                * @param deleteAddressRequest184
            
                * @param oGHeader185
            
          */
        public void startdeleteAddress(

            com.cloudkey.pms.micros.ows.name.DeleteAddressRequestE deleteAddressRequest184,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader185,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of e-mail address records from a profile, given the name identifier.
                    * @param fetchEmailListRequest187
                
                    * @param oGHeader188
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchEmailListResponseE fetchEmailList(

                        com.cloudkey.pms.micros.ows.name.FetchEmailListRequestE fetchEmailListRequest187,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader188)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of e-mail address records from a profile, given the name identifier.
                * @param fetchEmailListRequest187
            
                * @param oGHeader188
            
          */
        public void startfetchEmailList(

            com.cloudkey.pms.micros.ows.name.FetchEmailListRequestE fetchEmailListRequest187,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader188,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Creates a new profile and its name identifier, given at least the name record. Native name record, birth date, gender, address record, phone record, passport record, login name, and login password are also allowed. Specifying the login information also creates a web user.
                    * @param registerNameRequest190
                
                    * @param oGHeader191
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.RegisterNameResponseE registerName(

                        com.cloudkey.pms.micros.ows.name.RegisterNameRequestE registerNameRequest190,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader191)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Creates a new profile and its name identifier, given at least the name record. Native name record, birth date, gender, address record, phone record, passport record, login name, and login password are also allowed. Specifying the login information also creates a web user.
                * @param registerNameRequest190
            
                * @param oGHeader191
            
          */
        public void startregisterName(

            com.cloudkey.pms.micros.ows.name.RegisterNameRequestE registerNameRequest190,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader191,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of user-defined field values from a profile, given the name identifier.
                    * @param fetchNameUDFsRequest193
                
                    * @param oGHeader194
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchNameUDFsResponseE fetchNameUDFs(

                        com.cloudkey.pms.micros.ows.name.FetchNameUDFsRequestE fetchNameUDFsRequest193,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader194)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of user-defined field values from a profile, given the name identifier.
                * @param fetchNameUDFsRequest193
            
                * @param oGHeader194
            
          */
        public void startfetchNameUDFs(

            com.cloudkey.pms.micros.ows.name.FetchNameUDFsRequestE fetchNameUDFsRequest193,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader194,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the list of privacy option settings for a profile, given the name identifier.
                    * @param fetchPrivacyOptionRequest196
                
                    * @param oGHeader197
                
         */

         
                     public com.cloudkey.pms.micros.ows.name.FetchPrivacyOptionResponseE fetchPrivacyOption(

                        com.cloudkey.pms.micros.ows.name.FetchPrivacyOptionRequestE fetchPrivacyOptionRequest196,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader197)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the list of privacy option settings for a profile, given the name identifier.
                * @param fetchPrivacyOptionRequest196
            
                * @param oGHeader197
            
          */
        public void startfetchPrivacyOption(

            com.cloudkey.pms.micros.ows.name.FetchPrivacyOptionRequestE fetchPrivacyOptionRequest196,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader197,
                

            final com.cloudkey.pms.micros.services.NameServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    