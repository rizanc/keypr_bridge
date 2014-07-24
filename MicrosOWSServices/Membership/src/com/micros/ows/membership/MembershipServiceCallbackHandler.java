
/**
 * MembershipServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.micros.ows.membership;

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
            * auto generated Axis2 call back method for fetchStatement method
            * override this method for handling normal response from fetchStatement operation
            */
           public void receiveResultfetchStatement(
                    com.micros.ows.membership.MembershipServiceStub.FetchStatementResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchStatement operation
           */
            public void receiveErrorfetchStatement(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deletePromoSubscription method
            * override this method for handling normal response from deletePromoSubscription operation
            */
           public void receiveResultdeletePromoSubscription(
                    com.micros.ows.membership.MembershipServiceStub.DeletePromoSubscriptionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deletePromoSubscription operation
           */
            public void receiveErrordeletePromoSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for issueECertificate method
            * override this method for handling normal response from issueECertificate operation
            */
           public void receiveResultissueECertificate(
                    com.micros.ows.membership.MembershipServiceStub.IssueECertificateResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from issueECertificate operation
           */
            public void receiveErrorissueECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEnrollmentCode method
            * override this method for handling normal response from updateEnrollmentCode operation
            */
           public void receiveResultupdateEnrollmentCode(
                    com.micros.ows.membership.MembershipServiceStub.UpdateEnrollmentCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEnrollmentCode operation
           */
            public void receiveErrorupdateEnrollmentCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchRateAwards method
            * override this method for handling normal response from fetchRateAwards operation
            */
           public void receiveResultfetchRateAwards(
                    com.micros.ows.membership.MembershipServiceStub.FetchRateAwardsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchRateAwards operation
           */
            public void receiveErrorfetchRateAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAvailableECertificates method
            * override this method for handling normal response from fetchAvailableECertificates operation
            */
           public void receiveResultfetchAvailableECertificates(
                    com.micros.ows.membership.MembershipServiceStub.FetchAvailableECertificatesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAvailableECertificates operation
           */
            public void receiveErrorfetchAvailableECertificates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reIssueMemberCard method
            * override this method for handling normal response from reIssueMemberCard operation
            */
           public void receiveResultreIssueMemberCard(
                    com.micros.ows.membership.MembershipServiceStub.ReIssueMemberCardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reIssueMemberCard operation
           */
            public void receiveErrorreIssueMemberCard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumePoints method
            * override this method for handling normal response from consumePoints operation
            */
           public void receiveResultconsumePoints(
                    com.micros.ows.membership.MembershipServiceStub.ConsumePointsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumePoints operation
           */
            public void receiveErrorconsumePoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchProductAwards method
            * override this method for handling normal response from fetchProductAwards operation
            */
           public void receiveResultfetchProductAwards(
                    com.micros.ows.membership.MembershipServiceStub.FetchProductAwardsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchProductAwards operation
           */
            public void receiveErrorfetchProductAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelECertificate method
            * override this method for handling normal response from cancelECertificate operation
            */
           public void receiveResultcancelECertificate(
                    com.micros.ows.membership.MembershipServiceStub.CancelECertificateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelECertificate operation
           */
            public void receiveErrorcancelECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPointsExchange method
            * override this method for handling normal response from fetchPointsExchange operation
            */
           public void receiveResultfetchPointsExchange(
                    com.micros.ows.membership.MembershipServiceStub.FetchPointsExchangeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPointsExchange operation
           */
            public void receiveErrorfetchPointsExchange(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMemberPoints method
            * override this method for handling normal response from fetchMemberPoints operation
            */
           public void receiveResultfetchMemberPoints(
                    com.micros.ows.membership.MembershipServiceStub.FetchMemberPointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMemberPoints operation
           */
            public void receiveErrorfetchMemberPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchECertificates method
            * override this method for handling normal response from fetchECertificates operation
            */
           public void receiveResultfetchECertificates(
                    com.micros.ows.membership.MembershipServiceStub.FetchECertificatesResponseE result
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
                    com.micros.ows.membership.MembershipServiceStub.FetchStatementRefsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchStatementRefs operation
           */
            public void receiveErrorfetchStatementRefs(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchEnrollmentCode method
            * override this method for handling normal response from fetchEnrollmentCode operation
            */
           public void receiveResultfetchEnrollmentCode(
                    com.micros.ows.membership.MembershipServiceStub.FetchEnrollmentCodeResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchEnrollmentCode operation
           */
            public void receiveErrorfetchEnrollmentCode(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchUpgradeAwards method
            * override this method for handling normal response from fetchUpgradeAwards operation
            */
           public void receiveResultfetchUpgradeAwards(
                    com.micros.ows.membership.MembershipServiceStub.FetchUpgradeAwardsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchUpgradeAwards operation
           */
            public void receiveErrorfetchUpgradeAwards(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for favoriteGuest method
            * override this method for handling normal response from favoriteGuest operation
            */
           public void receiveResultfavoriteGuest(
                    com.micros.ows.membership.MembershipServiceStub.FavoriteGuestResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from favoriteGuest operation
           */
            public void receiveErrorfavoriteGuest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchPromoSubscriptions method
            * override this method for handling normal response from fetchPromoSubscriptions operation
            */
           public void receiveResultfetchPromoSubscriptions(
                    com.micros.ows.membership.MembershipServiceStub.FetchPromoSubscriptionsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchPromoSubscriptions operation
           */
            public void receiveErrorfetchPromoSubscriptions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for transferPoints method
            * override this method for handling normal response from transferPoints operation
            */
           public void receiveResulttransferPoints(
                    com.micros.ows.membership.MembershipServiceStub.TransferPointsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from transferPoints operation
           */
            public void receiveErrortransferPoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumeECertificate method
            * override this method for handling normal response from consumeECertificate operation
            */
           public void receiveResultconsumeECertificate(
                    com.micros.ows.membership.MembershipServiceStub.ConsumeECertificateResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumeECertificate operation
           */
            public void receiveErrorconsumeECertificate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addBenefit method
            * override this method for handling normal response from addBenefit operation
            */
           public void receiveResultaddBenefit(
                    com.micros.ows.membership.MembershipServiceStub.AddBenefitResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addBenefit operation
           */
            public void receiveErroraddBenefit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchBenefits method
            * override this method for handling normal response from fetchBenefits operation
            */
           public void receiveResultfetchBenefits(
                    com.micros.ows.membership.MembershipServiceStub.FetchBenefitsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchBenefits operation
           */
            public void receiveErrorfetchBenefits(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for consumePointsOthers method
            * override this method for handling normal response from consumePointsOthers operation
            */
           public void receiveResultconsumePointsOthers(
                    com.micros.ows.membership.MembershipServiceStub.ConsumePointsOthersResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from consumePointsOthers operation
           */
            public void receiveErrorconsumePointsOthers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchMembershipTransactions method
            * override this method for handling normal response from fetchMembershipTransactions operation
            */
           public void receiveResultfetchMembershipTransactions(
                    com.micros.ows.membership.MembershipServiceStub.FetchMembershipTransactionsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMembershipTransactions operation
           */
            public void receiveErrorfetchMembershipTransactions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchNextCardNumber method
            * override this method for handling normal response from fetchNextCardNumber operation
            */
           public void receiveResultfetchNextCardNumber(
                    com.micros.ows.membership.MembershipServiceStub.FetchNextCardNumberResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchNextCardNumber operation
           */
            public void receiveErrorfetchNextCardNumber(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addPromoSubscription method
            * override this method for handling normal response from addPromoSubscription operation
            */
           public void receiveResultaddPromoSubscription(
                    com.micros.ows.membership.MembershipServiceStub.AddPromoSubscriptionResponseE result
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
                    com.micros.ows.membership.MembershipServiceStub.FetchMemberTierWizardResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchMemberTierWizard operation
           */
            public void receiveErrorfetchMemberTierWizard(java.lang.Exception e) {
            }
                


    }
    