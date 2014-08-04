

/**
 * MembershipService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  MembershipService java interface
     */

    public interface MembershipService {
          

        /**
          * Auto generated method signature
          * Retrieve a hotel loyalty program statement.
                    * @param fetchStatementRequest29
                
                    * @param oGHeader30
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchStatementResponseE fetchStatement(

                        com.cloudkey.pms.micros.ows.membership.FetchStatementRequestE fetchStatementRequest29,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader30)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a hotel loyalty program statement.
                * @param fetchStatementRequest29
            
                * @param oGHeader30
            
          */
        public void startfetchStatement(

            com.cloudkey.pms.micros.ows.membership.FetchStatementRequestE fetchStatementRequest29,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader30,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Delete a promotional subscription.
                    * @param deletePromoSubscriptionRequest32
                
                    * @param oGHeader33
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionResponseE deletePromoSubscription(

                        com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionRequestE deletePromoSubscriptionRequest32,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader33)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Delete a promotional subscription.
                * @param deletePromoSubscriptionRequest32
            
                * @param oGHeader33
            
          */
        public void startdeletePromoSubscription(

            com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionRequestE deletePromoSubscriptionRequest32,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader33,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Issue ecertificate to a profile.
                    * @param issueECertificateRequest35
                
                    * @param oGHeader36
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.IssueECertificateResponseE issueECertificate(

                        com.cloudkey.pms.micros.ows.membership.IssueECertificateRequestE issueECertificateRequest35,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Issue ecertificate to a profile.
                * @param issueECertificateRequest35
            
                * @param oGHeader36
            
          */
        public void startissueECertificate(

            com.cloudkey.pms.micros.ows.membership.IssueECertificateRequestE issueECertificateRequest35,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader36,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Updates/Inserts the Enrollment Code based on membership id passed in.
                    * @param updateEnrollmentCodeRequest38
                
                    * @param oGHeader39
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeResponseE updateEnrollmentCode(

                        com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeRequestE updateEnrollmentCodeRequest38,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader39)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Updates/Inserts the Enrollment Code based on membership id passed in.
                * @param updateEnrollmentCodeRequest38
            
                * @param oGHeader39
            
          */
        public void startupdateEnrollmentCode(

            com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeRequestE updateEnrollmentCodeRequest38,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader39,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Affiliation information about awards based on a rate.
                    * @param fetchRateAwardsRequest41
                
                    * @param oGHeader42
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchRateAwardsResponseE fetchRateAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchRateAwardsRequestE fetchRateAwardsRequest41,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader42)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Affiliation information about awards based on a rate.
                * @param fetchRateAwardsRequest41
            
                * @param oGHeader42
            
          */
        public void startfetchRateAwards(

            com.cloudkey.pms.micros.ows.membership.FetchRateAwardsRequestE fetchRateAwardsRequest41,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader42,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns all configured E-Certificates for a date range.
                    * @param fetchAvailableECertificatesRequest44
                
                    * @param oGHeader45
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesResponseE fetchAvailableECertificates(

                        com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesRequestE fetchAvailableECertificatesRequest44,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader45)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns all configured E-Certificates for a date range.
                * @param fetchAvailableECertificatesRequest44
            
                * @param oGHeader45
            
          */
        public void startfetchAvailableECertificates(

            com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesRequestE fetchAvailableECertificatesRequest44,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader45,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Member will be scheduled for next fulfillment export for code REISSUE NEW CARD.
                    * @param reIssueMemberCardRequest47
                
                    * @param oGHeader48
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardResponse reIssueMemberCard(

                        com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardRequest reIssueMemberCardRequest47,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader48)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Member will be scheduled for next fulfillment export for code REISSUE NEW CARD.
                * @param reIssueMemberCardRequest47
            
                * @param oGHeader48
            
          */
        public void startreIssueMemberCard(

            com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardRequest reIssueMemberCardRequest47,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader48,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Accumulates customers points for certain rate/product for a loyalty program.
                    * @param consumePointsRequest50
                
                    * @param oGHeader51
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumePointsResponseE consumePoints(

                        com.cloudkey.pms.micros.ows.membership.ConsumePointsRequestE consumePointsRequest50,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader51)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Accumulates customers points for certain rate/product for a loyalty program.
                * @param consumePointsRequest50
            
                * @param oGHeader51
            
          */
        public void startconsumePoints(

            com.cloudkey.pms.micros.ows.membership.ConsumePointsRequestE consumePointsRequest50,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader51,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Cancel Consumed Points.
                    * @param cancelConsumedPointsRequest53
                
                    * @param oGHeader54
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsResponse cancelConsumedPoints(

                        com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsRequest cancelConsumedPointsRequest53,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader54)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Cancel Consumed Points.
                * @param cancelConsumedPointsRequest53
            
                * @param oGHeader54
            
          */
        public void startcancelConsumedPoints(

            com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsRequest cancelConsumedPointsRequest53,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader54,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Affiliation information about awards based on a product.
                    * @param fetchProductAwardsRequest56
                
                    * @param oGHeader57
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchProductAwardsResponseE fetchProductAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchProductAwardsRequestE fetchProductAwardsRequest56,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader57)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Affiliation information about awards based on a product.
                * @param fetchProductAwardsRequest56
            
                * @param oGHeader57
            
          */
        public void startfetchProductAwards(

            com.cloudkey.pms.micros.ows.membership.FetchProductAwardsRequestE fetchProductAwardsRequest56,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader57,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Cancel a ECertificate.
                    * @param cancelECertificateRequest59
                
                    * @param oGHeader60
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.CancelECertificateResponse cancelECertificate(

                        com.cloudkey.pms.micros.ows.membership.CancelECertificateRequest cancelECertificateRequest59,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader60)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Cancel a ECertificate.
                * @param cancelECertificateRequest59
            
                * @param oGHeader60
            
          */
        public void startcancelECertificate(

            com.cloudkey.pms.micros.ows.membership.CancelECertificateRequest cancelECertificateRequest59,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader60,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the membership type points based on the exchange rate setup between the two membership types.
                    * @param fetchPointsExchangeRequest62
                
                    * @param oGHeader63
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeResponseE fetchPointsExchange(

                        com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeRequestE fetchPointsExchangeRequest62,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader63)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the membership type points based on the exchange rate setup between the two membership types.
                * @param fetchPointsExchangeRequest62
            
                * @param oGHeader63
            
          */
        public void startfetchPointsExchange(

            com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeRequestE fetchPointsExchangeRequest62,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader63,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns member points information.
                    * @param fetchMemberPointsRequest65
                
                    * @param oGHeader66
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchMemberPointsResponse fetchMemberPoints(

                        com.cloudkey.pms.micros.ows.membership.FetchMemberPointsRequest fetchMemberPointsRequest65,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader66)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns member points information.
                * @param fetchMemberPointsRequest65
            
                * @param oGHeader66
            
          */
        public void startfetchMemberPoints(

            com.cloudkey.pms.micros.ows.membership.FetchMemberPointsRequest fetchMemberPointsRequest65,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader66,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch all ecertificates issued to a profile.
                    * @param fetchECertificatesRequest68
                
                    * @param oGHeader69
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchECertificatesResponseE fetchECertificates(

                        com.cloudkey.pms.micros.ows.membership.FetchECertificatesRequestE fetchECertificatesRequest68,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader69)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch all ecertificates issued to a profile.
                * @param fetchECertificatesRequest68
            
                * @param oGHeader69
            
          */
        public void startfetchECertificates(

            com.cloudkey.pms.micros.ows.membership.FetchECertificatesRequestE fetchECertificatesRequest68,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader69,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves a list of references associated with a membership card.
                    * @param fetchStatementRefsRequest71
                
                    * @param oGHeader72
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchStatementRefsResponseE fetchStatementRefs(

                        com.cloudkey.pms.micros.ows.membership.FetchStatementRefsRequestE fetchStatementRefsRequest71,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader72)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves a list of references associated with a membership card.
                * @param fetchStatementRefsRequest71
            
                * @param oGHeader72
            
          */
        public void startfetchStatementRefs(

            com.cloudkey.pms.micros.ows.membership.FetchStatementRefsRequestE fetchStatementRefsRequest71,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader72,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Issue or Redeem Transaction Awards points.
                    * @param issueTransactionAwardRequest74
                
                    * @param oGHeader75
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardResponse issueTransactionAward(

                        com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardRequest issueTransactionAwardRequest74,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader75)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Issue or Redeem Transaction Awards points.
                * @param issueTransactionAwardRequest74
            
                * @param oGHeader75
            
          */
        public void startissueTransactionAward(

            com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardRequest issueTransactionAwardRequest74,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader75,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves the Enrollment Code for the membership id passed in.
                    * @param fetchEnrollmentCodeRequest77
                
                    * @param oGHeader78
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeResponseE fetchEnrollmentCode(

                        com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeRequestE fetchEnrollmentCodeRequest77,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader78)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves the Enrollment Code for the membership id passed in.
                * @param fetchEnrollmentCodeRequest77
            
                * @param oGHeader78
            
          */
        public void startfetchEnrollmentCode(

            com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeRequestE fetchEnrollmentCodeRequest77,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader78,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Affiliation information about awards based on an upgrade.
                    * @param fetchUpgradeAwardsRequest80
                
                    * @param oGHeader81
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsResponseE fetchUpgradeAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsRequestE fetchUpgradeAwardsRequest80,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader81)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Affiliation information about awards based on an upgrade.
                * @param fetchUpgradeAwardsRequest80
            
                * @param oGHeader81
            
          */
        public void startfetchUpgradeAwards(

            com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsRequestE fetchUpgradeAwardsRequest80,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader81,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Add/Delete/Fetch favoriteguest to/from a profile.
                    * @param favoriteGuestRequest83
                
                    * @param oGHeader84
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FavoriteGuestResponseE favoriteGuest(

                        com.cloudkey.pms.micros.ows.membership.FavoriteGuestRequestE favoriteGuestRequest83,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader84)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Add/Delete/Fetch favoriteguest to/from a profile.
                * @param favoriteGuestRequest83
            
                * @param oGHeader84
            
          */
        public void startfavoriteGuest(

            com.cloudkey.pms.micros.ows.membership.FavoriteGuestRequestE favoriteGuestRequest83,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader84,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a list of promotional subscriptions.
                    * @param fetchPromoSubscriptionsRequest86
                
                    * @param oGHeader87
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsResponseE fetchPromoSubscriptions(

                        com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsRequestE fetchPromoSubscriptionsRequest86,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader87)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of promotional subscriptions.
                * @param fetchPromoSubscriptionsRequest86
            
                * @param oGHeader87
            
          */
        public void startfetchPromoSubscriptions(

            com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsRequestE fetchPromoSubscriptionsRequest86,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader87,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Transfer points from one membership type to another membership type.
                    * @param transferPointsRequest89
                
                    * @param oGHeader90
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.TransferPointsResponseE transferPoints(

                        com.cloudkey.pms.micros.ows.membership.TransferPointsRequestE transferPointsRequest89,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader90)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Transfer points from one membership type to another membership type.
                * @param transferPointsRequest89
            
                * @param oGHeader90
            
          */
        public void starttransferPoints(

            com.cloudkey.pms.micros.ows.membership.TransferPointsRequestE transferPointsRequest89,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader90,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Consume a issued ecertificate.
                    * @param consumeECertificateRequest92
                
                    * @param oGHeader93
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumeECertificateResponseE consumeECertificate(

                        com.cloudkey.pms.micros.ows.membership.ConsumeECertificateRequestE consumeECertificateRequest92,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader93)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Consume a issued ecertificate.
                * @param consumeECertificateRequest92
            
                * @param oGHeader93
            
          */
        public void startconsumeECertificate(

            com.cloudkey.pms.micros.ows.membership.ConsumeECertificateRequestE consumeECertificateRequest92,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader93,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Applies benefits to the member who will be automatically upgraded to the level associated with the benefit code, given the membership ID.
                    * @param addBenefitRequest95
                
                    * @param oGHeader96
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.AddBenefitResponseE addBenefit(

                        com.cloudkey.pms.micros.og.membership.AddBenefitRequestE addBenefitRequest95,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader96)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Applies benefits to the member who will be automatically upgraded to the level associated with the benefit code, given the membership ID.
                * @param addBenefitRequest95
            
                * @param oGHeader96
            
          */
        public void startaddBenefit(

            com.cloudkey.pms.micros.og.membership.AddBenefitRequestE addBenefitRequest95,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader96,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns all benefit codes that are applied to a member.
                    * @param fetchBenefitsRequest98
                
                    * @param oGHeader99
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.FetchBenefitsResponseE fetchBenefits(

                        com.cloudkey.pms.micros.og.membership.FetchBenefitsRequestE fetchBenefitsRequest98,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader99)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns all benefit codes that are applied to a member.
                * @param fetchBenefitsRequest98
            
                * @param oGHeader99
            
          */
        public void startfetchBenefits(

            com.cloudkey.pms.micros.og.membership.FetchBenefitsRequestE fetchBenefitsRequest98,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader99,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Accumulates customers points for other hotel defined programs.
                    * @param consumePointsOthersRequest101
                
                    * @param oGHeader102
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersResponseE consumePointsOthers(

                        com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersRequestE consumePointsOthersRequest101,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader102)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Accumulates customers points for other hotel defined programs.
                * @param consumePointsOthersRequest101
            
                * @param oGHeader102
            
          */
        public void startconsumePointsOthers(

            com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersRequestE consumePointsOthersRequest101,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader102,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Allows members to submit their unique profile identification number and optional begin and end dates.
                    * @param fetchMembershipTransactionsRequest104
                
                    * @param oGHeader105
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsResponseE fetchMembershipTransactions(

                        com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsRequestE fetchMembershipTransactionsRequest104,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader105)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Allows members to submit their unique profile identification number and optional begin and end dates.
                * @param fetchMembershipTransactionsRequest104
            
                * @param oGHeader105
            
          */
        public void startfetchMembershipTransactions(

            com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsRequestE fetchMembershipTransactionsRequest104,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader105,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve the next credit card number.
                    * @param fetchNextCardNumberRequest107
                
                    * @param oGHeader108
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberResponseE fetchNextCardNumber(

                        com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberRequestE fetchNextCardNumberRequest107,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader108)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve the next credit card number.
                * @param fetchNextCardNumberRequest107
            
                * @param oGHeader108
            
          */
        public void startfetchNextCardNumber(

            com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberRequestE fetchNextCardNumberRequest107,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader108,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Insert a promotional subscription.
                    * @param addPromoSubscriptionRequest110
                
                    * @param oGHeader111
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionResponseE addPromoSubscription(

                        com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionRequestE addPromoSubscriptionRequest110,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader111)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Insert a promotional subscription.
                * @param addPromoSubscriptionRequest110
            
                * @param oGHeader111
            
          */
        public void startaddPromoSubscription(

            com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionRequestE addPromoSubscriptionRequest110,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader111,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns information on the members upgrade requirements or the membership level on downgrade which will be evaluated based on the inputs of a future evaluation date and membership ID.
                    * @param fetchMemberTierWizardRequest113
                
                    * @param oGHeader114
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardResponseE fetchMemberTierWizard(

                        com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardRequestE fetchMemberTierWizardRequest113,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader114)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns information on the members upgrade requirements or the membership level on downgrade which will be evaluated based on the inputs of a future evaluation date and membership ID.
                * @param fetchMemberTierWizardRequest113
            
                * @param oGHeader114
            
          */
        public void startfetchMemberTierWizard(

            com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardRequestE fetchMemberTierWizardRequest113,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader114,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Fetch Transaction AwardCodes.
                    * @param fetchTransactionAwardsRequest116
                
                    * @param oGHeader117
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsResponse fetchTransactionAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsRequest fetchTransactionAwardsRequest116,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader117)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Fetch Transaction AwardCodes.
                * @param fetchTransactionAwardsRequest116
            
                * @param oGHeader117
            
          */
        public void startfetchTransactionAwards(

            com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsRequest fetchTransactionAwardsRequest116,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader117,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    