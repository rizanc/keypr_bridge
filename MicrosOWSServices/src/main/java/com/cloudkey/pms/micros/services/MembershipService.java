

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
          * 
                    * @param issueECertificateRequest30
                
                    * @param oGHeader31
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.IssueECertificateResponse issueECertificate(

                        com.cloudkey.pms.micros.ows.membership.IssueECertificateRequest issueECertificateRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param issueECertificateRequest30
            
                * @param oGHeader31
            
          */
        public void startissueECertificate(

            com.cloudkey.pms.micros.ows.membership.IssueECertificateRequest issueECertificateRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchBenefitsRequest33
                
                    * @param oGHeader34
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.FetchBenefitsResponse fetchBenefits(

                        com.cloudkey.pms.micros.og.membership.FetchBenefitsRequest fetchBenefitsRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchBenefitsRequest33
            
                * @param oGHeader34
            
          */
        public void startfetchBenefits(

            com.cloudkey.pms.micros.og.membership.FetchBenefitsRequest fetchBenefitsRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchMembershipTransactionsRequest36
                
                    * @param oGHeader37
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsResponse fetchMembershipTransactions(

                        com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsRequest fetchMembershipTransactionsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchMembershipTransactionsRequest36
            
                * @param oGHeader37
            
          */
        public void startfetchMembershipTransactions(

            com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsRequest fetchMembershipTransactionsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchMemberPointsRequest39
                
                    * @param oGHeader40
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchMemberPointsResponse fetchMemberPoints(

                        com.cloudkey.pms.micros.ows.membership.FetchMemberPointsRequest fetchMemberPointsRequest39,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchMemberPointsRequest39
            
                * @param oGHeader40
            
          */
        public void startfetchMemberPoints(

            com.cloudkey.pms.micros.ows.membership.FetchMemberPointsRequest fetchMemberPointsRequest39,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader40,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchPointsExchangeRequest42
                
                    * @param oGHeader43
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeResponse fetchPointsExchange(

                        com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeRequest fetchPointsExchangeRequest42,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader43)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchPointsExchangeRequest42
            
                * @param oGHeader43
            
          */
        public void startfetchPointsExchange(

            com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeRequest fetchPointsExchangeRequest42,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader43,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addBenefitRequest45
                
                    * @param oGHeader46
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.AddBenefitResponse addBenefit(

                        com.cloudkey.pms.micros.og.membership.AddBenefitRequest addBenefitRequest45,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader46)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addBenefitRequest45
            
                * @param oGHeader46
            
          */
        public void startaddBenefit(

            com.cloudkey.pms.micros.og.membership.AddBenefitRequest addBenefitRequest45,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader46,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param consumePointsRequest48
                
                    * @param oGHeader49
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumePointsResponse consumePoints(

                        com.cloudkey.pms.micros.ows.membership.ConsumePointsRequest consumePointsRequest48,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader49)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param consumePointsRequest48
            
                * @param oGHeader49
            
          */
        public void startconsumePoints(

            com.cloudkey.pms.micros.ows.membership.ConsumePointsRequest consumePointsRequest48,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader49,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchTransactionAwardsRequest51
                
                    * @param oGHeader52
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsResponse fetchTransactionAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsRequest fetchTransactionAwardsRequest51,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader52)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchTransactionAwardsRequest51
            
                * @param oGHeader52
            
          */
        public void startfetchTransactionAwards(

            com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsRequest fetchTransactionAwardsRequest51,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader52,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchRateAwardsRequest54
                
                    * @param oGHeader55
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchRateAwardsResponse fetchRateAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchRateAwardsRequest fetchRateAwardsRequest54,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader55)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchRateAwardsRequest54
            
                * @param oGHeader55
            
          */
        public void startfetchRateAwards(

            com.cloudkey.pms.micros.ows.membership.FetchRateAwardsRequest fetchRateAwardsRequest54,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader55,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param deletePromoSubscriptionRequest57
                
                    * @param oGHeader58
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionResponse deletePromoSubscription(

                        com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionRequest deletePromoSubscriptionRequest57,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader58)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param deletePromoSubscriptionRequest57
            
                * @param oGHeader58
            
          */
        public void startdeletePromoSubscription(

            com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionRequest deletePromoSubscriptionRequest57,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader58,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param reIssueMemberCardRequest60
                
                    * @param oGHeader61
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardResponse reIssueMemberCard(

                        com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardRequest reIssueMemberCardRequest60,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader61)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param reIssueMemberCardRequest60
            
                * @param oGHeader61
            
          */
        public void startreIssueMemberCard(

            com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardRequest reIssueMemberCardRequest60,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader61,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param cancelConsumedPointsRequest63
                
                    * @param oGHeader64
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsResponse cancelConsumedPoints(

                        com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsRequest cancelConsumedPointsRequest63,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader64)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelConsumedPointsRequest63
            
                * @param oGHeader64
            
          */
        public void startcancelConsumedPoints(

            com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsRequest cancelConsumedPointsRequest63,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader64,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchEnrollmentCodeRequest66
                
                    * @param oGHeader67
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeResponse fetchEnrollmentCode(

                        com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeRequest fetchEnrollmentCodeRequest66,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader67)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchEnrollmentCodeRequest66
            
                * @param oGHeader67
            
          */
        public void startfetchEnrollmentCode(

            com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeRequest fetchEnrollmentCodeRequest66,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader67,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAvailableECertificatesRequest69
                
                    * @param oGHeader70
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesResponse fetchAvailableECertificates(

                        com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesRequest fetchAvailableECertificatesRequest69,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader70)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAvailableECertificatesRequest69
            
                * @param oGHeader70
            
          */
        public void startfetchAvailableECertificates(

            com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesRequest fetchAvailableECertificatesRequest69,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader70,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param favoriteGuestRequest72
                
                    * @param oGHeader73
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FavoriteGuestResponse favoriteGuest(

                        com.cloudkey.pms.micros.ows.membership.FavoriteGuestRequest favoriteGuestRequest72,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader73)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param favoriteGuestRequest72
            
                * @param oGHeader73
            
          */
        public void startfavoriteGuest(

            com.cloudkey.pms.micros.ows.membership.FavoriteGuestRequest favoriteGuestRequest72,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader73,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchProductAwardsRequest75
                
                    * @param oGHeader76
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchProductAwardsResponse fetchProductAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchProductAwardsRequest fetchProductAwardsRequest75,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader76)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchProductAwardsRequest75
            
                * @param oGHeader76
            
          */
        public void startfetchProductAwards(

            com.cloudkey.pms.micros.ows.membership.FetchProductAwardsRequest fetchProductAwardsRequest75,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader76,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param consumePointsOthersRequest78
                
                    * @param oGHeader79
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersResponse consumePointsOthers(

                        com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersRequest consumePointsOthersRequest78,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader79)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param consumePointsOthersRequest78
            
                * @param oGHeader79
            
          */
        public void startconsumePointsOthers(

            com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersRequest consumePointsOthersRequest78,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader79,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param transferPointsRequest81
                
                    * @param oGHeader82
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.TransferPointsResponse transferPoints(

                        com.cloudkey.pms.micros.ows.membership.TransferPointsRequest transferPointsRequest81,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader82)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param transferPointsRequest81
            
                * @param oGHeader82
            
          */
        public void starttransferPoints(

            com.cloudkey.pms.micros.ows.membership.TransferPointsRequest transferPointsRequest81,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader82,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param cancelECertificateRequest84
                
                    * @param oGHeader85
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.CancelECertificateResponse cancelECertificate(

                        com.cloudkey.pms.micros.ows.membership.CancelECertificateRequest cancelECertificateRequest84,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader85)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param cancelECertificateRequest84
            
                * @param oGHeader85
            
          */
        public void startcancelECertificate(

            com.cloudkey.pms.micros.ows.membership.CancelECertificateRequest cancelECertificateRequest84,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader85,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchStatementRequest87
                
                    * @param oGHeader88
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchStatementResponse fetchStatement(

                        com.cloudkey.pms.micros.ows.membership.FetchStatementRequest fetchStatementRequest87,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader88)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchStatementRequest87
            
                * @param oGHeader88
            
          */
        public void startfetchStatement(

            com.cloudkey.pms.micros.ows.membership.FetchStatementRequest fetchStatementRequest87,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader88,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param consumeECertificateRequest90
                
                    * @param oGHeader91
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.ConsumeECertificateResponse consumeECertificate(

                        com.cloudkey.pms.micros.ows.membership.ConsumeECertificateRequest consumeECertificateRequest90,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader91)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param consumeECertificateRequest90
            
                * @param oGHeader91
            
          */
        public void startconsumeECertificate(

            com.cloudkey.pms.micros.ows.membership.ConsumeECertificateRequest consumeECertificateRequest90,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader91,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchPromoSubscriptionsRequest93
                
                    * @param oGHeader94
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsResponse fetchPromoSubscriptions(

                        com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsRequest fetchPromoSubscriptionsRequest93,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader94)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchPromoSubscriptionsRequest93
            
                * @param oGHeader94
            
          */
        public void startfetchPromoSubscriptions(

            com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsRequest fetchPromoSubscriptionsRequest93,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader94,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchMembershipsRequest96
                
                    * @param oGHeader97
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchMembershipsResponse fetchMemberships(

                        com.cloudkey.pms.micros.ows.membership.FetchMembershipsRequest fetchMembershipsRequest96,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader97)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchMembershipsRequest96
            
                * @param oGHeader97
            
          */
        public void startfetchMemberships(

            com.cloudkey.pms.micros.ows.membership.FetchMembershipsRequest fetchMembershipsRequest96,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader97,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param addPromoSubscriptionRequest99
                
                    * @param oGHeader100
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionResponse addPromoSubscription(

                        com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionRequest addPromoSubscriptionRequest99,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader100)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param addPromoSubscriptionRequest99
            
                * @param oGHeader100
            
          */
        public void startaddPromoSubscription(

            com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionRequest addPromoSubscriptionRequest99,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader100,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchMemberTierWizardRequest102
                
                    * @param oGHeader103
                
         */

         
                     public com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardResponse fetchMemberTierWizard(

                        com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardRequest fetchMemberTierWizardRequest102,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader103)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchMemberTierWizardRequest102
            
                * @param oGHeader103
            
          */
        public void startfetchMemberTierWizard(

            com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardRequest fetchMemberTierWizardRequest102,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader103,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param issueTransactionAwardRequest105
                
                    * @param oGHeader106
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardResponse issueTransactionAward(

                        com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardRequest issueTransactionAwardRequest105,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader106)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param issueTransactionAwardRequest105
            
                * @param oGHeader106
            
          */
        public void startissueTransactionAward(

            com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardRequest issueTransactionAwardRequest105,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader106,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchNextCardNumberRequest108
                
                    * @param oGHeader109
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberResponse fetchNextCardNumber(

                        com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberRequest fetchNextCardNumberRequest108,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader109)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchNextCardNumberRequest108
            
                * @param oGHeader109
            
          */
        public void startfetchNextCardNumber(

            com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberRequest fetchNextCardNumberRequest108,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader109,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchUpgradeAwardsRequest111
                
                    * @param oGHeader112
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsResponse fetchUpgradeAwards(

                        com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsRequest fetchUpgradeAwardsRequest111,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader112)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchUpgradeAwardsRequest111
            
                * @param oGHeader112
            
          */
        public void startfetchUpgradeAwards(

            com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsRequest fetchUpgradeAwardsRequest111,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader112,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param updateEnrollmentCodeRequest114
                
                    * @param oGHeader115
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeResponse updateEnrollmentCode(

                        com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeRequest updateEnrollmentCodeRequest114,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader115)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param updateEnrollmentCodeRequest114
            
                * @param oGHeader115
            
          */
        public void startupdateEnrollmentCode(

            com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeRequest updateEnrollmentCodeRequest114,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader115,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchECertificatesRequest117
                
                    * @param oGHeader118
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchECertificatesResponse fetchECertificates(

                        com.cloudkey.pms.micros.ows.membership.FetchECertificatesRequest fetchECertificatesRequest117,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader118)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchECertificatesRequest117
            
                * @param oGHeader118
            
          */
        public void startfetchECertificates(

            com.cloudkey.pms.micros.ows.membership.FetchECertificatesRequest fetchECertificatesRequest117,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader118,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchStatementRefsRequest120
                
                    * @param oGHeader121
                
         */

         
                     public com.cloudkey.pms.micros.ows.membership.FetchStatementRefsResponse fetchStatementRefs(

                        com.cloudkey.pms.micros.ows.membership.FetchStatementRefsRequest fetchStatementRefsRequest120,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader121)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchStatementRefsRequest120
            
                * @param oGHeader121
            
          */
        public void startfetchStatementRefs(

            com.cloudkey.pms.micros.ows.membership.FetchStatementRefsRequest fetchStatementRefsRequest120,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader121,
                

            final com.cloudkey.pms.micros.services.MembershipServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    