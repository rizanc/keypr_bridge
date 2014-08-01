
/**
 * MembershipServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /**
     *  MembershipServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MembershipServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MembershipServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MembershipServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for issueECertificate method
            * override this method for handling normal response from issueECertificate operation
            */
           public void receiveResultissueECertificate(
                    com.cloudkey.pms.micros.ows.membership.IssueECertificateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from issueECertificate operation
           */
            public void receiveErrorissueECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchBenefits method
            * override this method for handling normal response from fetchBenefits operation
            */
           public void receiveResultfetchBenefits(
                    com.cloudkey.pms.micros.og.membership.FetchBenefitsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBenefits operation
           */
            public void receiveErrorfetchBenefits(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMembershipTransactions method
            * override this method for handling normal response from fetchMembershipTransactions operation
            */
           public void receiveResultfetchMembershipTransactions(
                    com.cloudkey.pms.micros.ows.membership.FetchMembershipTransactionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMembershipTransactions operation
           */
            public void receiveErrorfetchMembershipTransactions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMemberPoints method
            * override this method for handling normal response from fetchMemberPoints operation
            */
           public void receiveResultfetchMemberPoints(
                    com.cloudkey.pms.micros.ows.membership.FetchMemberPointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMemberPoints operation
           */
            public void receiveErrorfetchMemberPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPointsExchange method
            * override this method for handling normal response from fetchPointsExchange operation
            */
           public void receiveResultfetchPointsExchange(
                    com.cloudkey.pms.micros.ows.membership.FetchPointsExchangeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPointsExchange operation
           */
            public void receiveErrorfetchPointsExchange(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addBenefit method
            * override this method for handling normal response from addBenefit operation
            */
           public void receiveResultaddBenefit(
                    com.cloudkey.pms.micros.og.membership.AddBenefitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addBenefit operation
           */
            public void receiveErroraddBenefit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumePoints method
            * override this method for handling normal response from consumePoints operation
            */
           public void receiveResultconsumePoints(
                    com.cloudkey.pms.micros.ows.membership.ConsumePointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumePoints operation
           */
            public void receiveErrorconsumePoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchTransactionAwards method
            * override this method for handling normal response from fetchTransactionAwards operation
            */
           public void receiveResultfetchTransactionAwards(
                    com.cloudkey.pms.micros.ows.membership.FetchTransactionAwardsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchTransactionAwards operation
           */
            public void receiveErrorfetchTransactionAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchRateAwards method
            * override this method for handling normal response from fetchRateAwards operation
            */
           public void receiveResultfetchRateAwards(
                    com.cloudkey.pms.micros.ows.membership.FetchRateAwardsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchRateAwards operation
           */
            public void receiveErrorfetchRateAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePromoSubscription method
            * override this method for handling normal response from deletePromoSubscription operation
            */
           public void receiveResultdeletePromoSubscription(
                    com.cloudkey.pms.micros.ows.membership.DeletePromoSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePromoSubscription operation
           */
            public void receiveErrordeletePromoSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reIssueMemberCard method
            * override this method for handling normal response from reIssueMemberCard operation
            */
           public void receiveResultreIssueMemberCard(
                    com.cloudkey.pms.micros.ows.membership.ReIssueMemberCardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reIssueMemberCard operation
           */
            public void receiveErrorreIssueMemberCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelConsumedPoints method
            * override this method for handling normal response from cancelConsumedPoints operation
            */
           public void receiveResultcancelConsumedPoints(
                    com.cloudkey.pms.micros.ows.membership.CancelConsumedPointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelConsumedPoints operation
           */
            public void receiveErrorcancelConsumedPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchEnrollmentCode method
            * override this method for handling normal response from fetchEnrollmentCode operation
            */
           public void receiveResultfetchEnrollmentCode(
                    com.cloudkey.pms.micros.ows.membership.FetchEnrollmentCodeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchEnrollmentCode operation
           */
            public void receiveErrorfetchEnrollmentCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAvailableECertificates method
            * override this method for handling normal response from fetchAvailableECertificates operation
            */
           public void receiveResultfetchAvailableECertificates(
                    com.cloudkey.pms.micros.ows.membership.FetchAvailableECertificatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAvailableECertificates operation
           */
            public void receiveErrorfetchAvailableECertificates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for favoriteGuest method
            * override this method for handling normal response from favoriteGuest operation
            */
           public void receiveResultfavoriteGuest(
                    com.cloudkey.pms.micros.ows.membership.FavoriteGuestResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from favoriteGuest operation
           */
            public void receiveErrorfavoriteGuest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchProductAwards method
            * override this method for handling normal response from fetchProductAwards operation
            */
           public void receiveResultfetchProductAwards(
                    com.cloudkey.pms.micros.ows.membership.FetchProductAwardsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchProductAwards operation
           */
            public void receiveErrorfetchProductAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumePointsOthers method
            * override this method for handling normal response from consumePointsOthers operation
            */
           public void receiveResultconsumePointsOthers(
                    com.cloudkey.pms.micros.ows.membership.ConsumePointsOthersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumePointsOthers operation
           */
            public void receiveErrorconsumePointsOthers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for transferPoints method
            * override this method for handling normal response from transferPoints operation
            */
           public void receiveResulttransferPoints(
                    com.cloudkey.pms.micros.ows.membership.TransferPointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from transferPoints operation
           */
            public void receiveErrortransferPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelECertificate method
            * override this method for handling normal response from cancelECertificate operation
            */
           public void receiveResultcancelECertificate(
                    com.cloudkey.pms.micros.ows.membership.CancelECertificateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelECertificate operation
           */
            public void receiveErrorcancelECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchStatement method
            * override this method for handling normal response from fetchStatement operation
            */
           public void receiveResultfetchStatement(
                    com.cloudkey.pms.micros.ows.membership.FetchStatementResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchStatement operation
           */
            public void receiveErrorfetchStatement(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumeECertificate method
            * override this method for handling normal response from consumeECertificate operation
            */
           public void receiveResultconsumeECertificate(
                    com.cloudkey.pms.micros.ows.membership.ConsumeECertificateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumeECertificate operation
           */
            public void receiveErrorconsumeECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPromoSubscriptions method
            * override this method for handling normal response from fetchPromoSubscriptions operation
            */
           public void receiveResultfetchPromoSubscriptions(
                    com.cloudkey.pms.micros.ows.membership.FetchPromoSubscriptionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPromoSubscriptions operation
           */
            public void receiveErrorfetchPromoSubscriptions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMemberships method
            * override this method for handling normal response from fetchMemberships operation
            */
           public void receiveResultfetchMemberships(
                    com.cloudkey.pms.micros.ows.membership.FetchMembershipsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMemberships operation
           */
            public void receiveErrorfetchMemberships(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addPromoSubscription method
            * override this method for handling normal response from addPromoSubscription operation
            */
           public void receiveResultaddPromoSubscription(
                    com.cloudkey.pms.micros.ows.membership.AddPromoSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addPromoSubscription operation
           */
            public void receiveErroraddPromoSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMemberTierWizard method
            * override this method for handling normal response from fetchMemberTierWizard operation
            */
           public void receiveResultfetchMemberTierWizard(
                    com.cloudkey.pms.micros.og.membership.FetchMemberTierWizardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMemberTierWizard operation
           */
            public void receiveErrorfetchMemberTierWizard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for issueTransactionAward method
            * override this method for handling normal response from issueTransactionAward operation
            */
           public void receiveResultissueTransactionAward(
                    com.cloudkey.pms.micros.ows.membership.IssueTransactionAwardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from issueTransactionAward operation
           */
            public void receiveErrorissueTransactionAward(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchNextCardNumber method
            * override this method for handling normal response from fetchNextCardNumber operation
            */
           public void receiveResultfetchNextCardNumber(
                    com.cloudkey.pms.micros.ows.membership.FetchNextCardNumberResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchNextCardNumber operation
           */
            public void receiveErrorfetchNextCardNumber(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchUpgradeAwards method
            * override this method for handling normal response from fetchUpgradeAwards operation
            */
           public void receiveResultfetchUpgradeAwards(
                    com.cloudkey.pms.micros.ows.membership.FetchUpgradeAwardsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchUpgradeAwards operation
           */
            public void receiveErrorfetchUpgradeAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEnrollmentCode method
            * override this method for handling normal response from updateEnrollmentCode operation
            */
           public void receiveResultupdateEnrollmentCode(
                    com.cloudkey.pms.micros.ows.membership.UpdateEnrollmentCodeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEnrollmentCode operation
           */
            public void receiveErrorupdateEnrollmentCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchECertificates method
            * override this method for handling normal response from fetchECertificates operation
            */
           public void receiveResultfetchECertificates(
                    com.cloudkey.pms.micros.ows.membership.FetchECertificatesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchECertificates operation
           */
            public void receiveErrorfetchECertificates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchStatementRefs method
            * override this method for handling normal response from fetchStatementRefs operation
            */
           public void receiveResultfetchStatementRefs(
                    com.cloudkey.pms.micros.ows.membership.FetchStatementRefsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchStatementRefs operation
           */
            public void receiveErrorfetchStatementRefs(java.lang.Exception e) {
            }
                


    }
    