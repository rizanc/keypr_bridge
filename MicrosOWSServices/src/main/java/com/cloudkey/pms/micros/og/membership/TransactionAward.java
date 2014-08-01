
/**
 * TransactionAward.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  TransactionAward bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TransactionAward
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TransactionAward
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for MembershipType
                        */

                        
                                    protected java.lang.String localMembershipType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipType(){
                               return localMembershipType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipType
                               */
                               public void setMembershipType(java.lang.String param){
                            
                                            this.localMembershipType=param;
                                    

                               }
                            

                        /**
                        * field for AwardType
                        */

                        
                                    protected java.lang.String localAwardType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAwardType(){
                               return localAwardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardType
                               */
                               public void setAwardType(java.lang.String param){
                            
                                            this.localAwardType=param;
                                    

                               }
                            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelReferenceTracker = false ;

                           public boolean isHotelReferenceSpecified(){
                               return localHotelReferenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReference getHotelReference(){
                               return localHotelReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReference
                               */
                               public void setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference param){
                            localHotelReferenceTracker = param != null;
                                   
                                            this.localHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for DisplaySet
                        */

                        
                                    protected java.lang.String localDisplaySet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplaySetTracker = false ;

                           public boolean isDisplaySetSpecified(){
                               return localDisplaySetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDisplaySet(){
                               return localDisplaySet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplaySet
                               */
                               public void setDisplaySet(java.lang.String param){
                            localDisplaySetTracker = param != null;
                                   
                                            this.localDisplaySet=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyCharge
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localCancelPenaltyCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyChargeTracker = false ;

                           public boolean isCancelPenaltyChargeSpecified(){
                               return localCancelPenaltyChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getCancelPenaltyCharge(){
                               return localCancelPenaltyCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyCharge
                               */
                               public void setCancelPenaltyCharge(com.cloudkey.pms.micros.og.common.Amount param){
                            localCancelPenaltyChargeTracker = param != null;
                                   
                                            this.localCancelPenaltyCharge=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyDays
                        */

                        
                                    protected int localCancelPenaltyDays ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyDaysTracker = false ;

                           public boolean isCancelPenaltyDaysSpecified(){
                               return localCancelPenaltyDaysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCancelPenaltyDays(){
                               return localCancelPenaltyDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyDays
                               */
                               public void setCancelPenaltyDays(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCancelPenaltyDaysTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCancelPenaltyDays=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyType
                        */

                        
                                    protected java.lang.String localCancelPenaltyType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyTypeTracker = false ;

                           public boolean isCancelPenaltyTypeSpecified(){
                               return localCancelPenaltyTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCancelPenaltyType(){
                               return localCancelPenaltyType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyType
                               */
                               public void setCancelPenaltyType(java.lang.String param){
                            localCancelPenaltyTypeTracker = param != null;
                                   
                                            this.localCancelPenaltyType=param;
                                    

                               }
                            

                        /**
                        * field for IgnoreFinancialTransaction
                        */

                        
                                    protected boolean localIgnoreFinancialTransaction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIgnoreFinancialTransactionTracker = false ;

                           public boolean isIgnoreFinancialTransactionSpecified(){
                               return localIgnoreFinancialTransactionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIgnoreFinancialTransaction(){
                               return localIgnoreFinancialTransaction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IgnoreFinancialTransaction
                               */
                               public void setIgnoreFinancialTransaction(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localIgnoreFinancialTransactionTracker =
                                       true;
                                   
                                            this.localIgnoreFinancialTransaction=param;
                                    

                               }
                            

                        /**
                        * field for IssueKey
                        */

                        
                                    protected java.lang.String localIssueKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssueKeyTracker = false ;

                           public boolean isIssueKeySpecified(){
                               return localIssueKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssueKey(){
                               return localIssueKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueKey
                               */
                               public void setIssueKey(java.lang.String param){
                            localIssueKeyTracker = param != null;
                                   
                                            this.localIssueKey=param;
                                    

                               }
                            

                        /**
                        * field for IssueKeyRaw
                        */

                        
                                    protected javax.activation.DataHandler localIssueKeyRaw ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssueKeyRawTracker = false ;

                           public boolean isIssueKeyRawSpecified(){
                               return localIssueKeyRawTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getIssueKeyRaw(){
                               return localIssueKeyRaw;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueKeyRaw
                               */
                               public void setIssueKeyRaw(javax.activation.DataHandler param){
                            localIssueKeyRawTracker = param != null;
                                   
                                            this.localIssueKeyRaw=param;
                                    

                               }
                            

                        /**
                        * field for LongDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText localLongDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongDescriptionTracker = false ;

                           public boolean isLongDescriptionSpecified(){
                               return localLongDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText getLongDescription(){
                               return localLongDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LongDescription
                               */
                               public void setLongDescription(com.cloudkey.pms.micros.og.common.DescriptiveText param){
                            localLongDescriptionTracker = param != null;
                                   
                                            this.localLongDescription=param;
                                    

                               }
                            

                        /**
                        * field for ShortDescription
                        */

                        
                                    protected java.lang.String localShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShortDescriptionTracker = false ;

                           public boolean isShortDescriptionSpecified(){
                               return localShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getShortDescription(){
                               return localShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShortDescription
                               */
                               public void setShortDescription(java.lang.String param){
                            localShortDescriptionTracker = param != null;
                                   
                                            this.localShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for MaxPercentAllowed
                        */

                        
                                    protected double localMaxPercentAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxPercentAllowedTracker = false ;

                           public boolean isMaxPercentAllowedSpecified(){
                               return localMaxPercentAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getMaxPercentAllowed(){
                               return localMaxPercentAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxPercentAllowed
                               */
                               public void setMaxPercentAllowed(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxPercentAllowedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localMaxPercentAllowed=param;
                                    

                               }
                            

                        /**
                        * field for MembershipLevel
                        */

                        
                                    protected java.lang.String localMembershipLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipLevelTracker = false ;

                           public boolean isMembershipLevelSpecified(){
                               return localMembershipLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipLevel(){
                               return localMembershipLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipLevel
                               */
                               public void setMembershipLevel(java.lang.String param){
                            localMembershipLevelTracker = param != null;
                                   
                                            this.localMembershipLevel=param;
                                    

                               }
                            

                        /**
                        * field for CentralCurrencyCode
                        */

                        
                                    protected java.lang.String localCentralCurrencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCentralCurrencyCodeTracker = false ;

                           public boolean isCentralCurrencyCodeSpecified(){
                               return localCentralCurrencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCentralCurrencyCode(){
                               return localCentralCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CentralCurrencyCode
                               */
                               public void setCentralCurrencyCode(java.lang.String param){
                            localCentralCurrencyCodeTracker = param != null;
                                   
                                            this.localCentralCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for OriginalPointsRequired
                        */

                        
                                    protected double localOriginalPointsRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriginalPointsRequiredTracker = false ;

                           public boolean isOriginalPointsRequiredSpecified(){
                               return localOriginalPointsRequiredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getOriginalPointsRequired(){
                               return localOriginalPointsRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginalPointsRequired
                               */
                               public void setOriginalPointsRequired(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localOriginalPointsRequiredTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localOriginalPointsRequired=param;
                                    

                               }
                            

                        /**
                        * field for PointsRequired
                        */

                        
                                    protected double localPointsRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsRequiredTracker = false ;

                           public boolean isPointsRequiredSpecified(){
                               return localPointsRequiredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getPointsRequired(){
                               return localPointsRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsRequired
                               */
                               public void setPointsRequired(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localPointsRequiredTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localPointsRequired=param;
                                    

                               }
                            

                        /**
                        * field for HotelCurrencyCode
                        */

                        
                                    protected java.lang.String localHotelCurrencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelCurrencyCodeTracker = false ;

                           public boolean isHotelCurrencyCodeSpecified(){
                               return localHotelCurrencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHotelCurrencyCode(){
                               return localHotelCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelCurrencyCode
                               */
                               public void setHotelCurrencyCode(java.lang.String param){
                            localHotelCurrencyCodeTracker = param != null;
                                   
                                            this.localHotelCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for TransactionCode
                        */

                        
                                    protected java.lang.String localTransactionCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionCodeTracker = false ;

                           public boolean isTransactionCodeSpecified(){
                               return localTransactionCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionCode(){
                               return localTransactionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionCode
                               */
                               public void setTransactionCode(java.lang.String param){
                            localTransactionCodeTracker = param != null;
                                   
                                            this.localTransactionCode=param;
                                    

                               }
                            

                        /**
                        * field for SellBeginDate
                        */

                        
                                    protected java.util.Date localSellBeginDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSellBeginDateTracker = false ;

                           public boolean isSellBeginDateSpecified(){
                               return localSellBeginDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getSellBeginDate(){
                               return localSellBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SellBeginDate
                               */
                               public void setSellBeginDate(java.util.Date param){
                            localSellBeginDateTracker = param != null;
                                   
                                            this.localSellBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for SellEndDate
                        */

                        
                                    protected java.util.Date localSellEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSellEndDateTracker = false ;

                           public boolean isSellEndDateSpecified(){
                               return localSellEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getSellEndDate(){
                               return localSellEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SellEndDate
                               */
                               public void setSellEndDate(java.util.Date param){
                            localSellEndDateTracker = param != null;
                                   
                                            this.localSellEndDate=param;
                                    

                               }
                            

                        /**
                        * field for ExchangeRateType
                        */

                        
                                    protected java.lang.String localExchangeRateType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExchangeRateTypeTracker = false ;

                           public boolean isExchangeRateTypeSpecified(){
                               return localExchangeRateTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExchangeRateType(){
                               return localExchangeRateType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExchangeRateType
                               */
                               public void setExchangeRateType(java.lang.String param){
                            localExchangeRateTypeTracker = param != null;
                                   
                                            this.localExchangeRateType=param;
                                    

                               }
                            

                        /**
                        * field for ComputedPointsRequired
                        */

                        
                                    protected double localComputedPointsRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localComputedPointsRequiredTracker = false ;

                           public boolean isComputedPointsRequiredSpecified(){
                               return localComputedPointsRequiredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getComputedPointsRequired(){
                               return localComputedPointsRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ComputedPointsRequired
                               */
                               public void setComputedPointsRequired(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localComputedPointsRequiredTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localComputedPointsRequired=param;
                                    

                               }
                            

                        /**
                        * field for HotelTotalBillAmount
                        */

                        
                                    protected double localHotelTotalBillAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelTotalBillAmountTracker = false ;

                           public boolean isHotelTotalBillAmountSpecified(){
                               return localHotelTotalBillAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getHotelTotalBillAmount(){
                               return localHotelTotalBillAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelTotalBillAmount
                               */
                               public void setHotelTotalBillAmount(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localHotelTotalBillAmountTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localHotelTotalBillAmount=param;
                                    

                               }
                            

                        /**
                        * field for HotelTotalBillAmountAllowed
                        */

                        
                                    protected double localHotelTotalBillAmountAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelTotalBillAmountAllowedTracker = false ;

                           public boolean isHotelTotalBillAmountAllowedSpecified(){
                               return localHotelTotalBillAmountAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getHotelTotalBillAmountAllowed(){
                               return localHotelTotalBillAmountAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelTotalBillAmountAllowed
                               */
                               public void setHotelTotalBillAmountAllowed(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localHotelTotalBillAmountAllowedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localHotelTotalBillAmountAllowed=param;
                                    

                               }
                            

                        /**
                        * field for CentralBillAmount
                        */

                        
                                    protected double localCentralBillAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCentralBillAmountTracker = false ;

                           public boolean isCentralBillAmountSpecified(){
                               return localCentralBillAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCentralBillAmount(){
                               return localCentralBillAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CentralBillAmount
                               */
                               public void setCentralBillAmount(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCentralBillAmountTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCentralBillAmount=param;
                                    

                               }
                            

                        /**
                        * field for CentralBillAmountAllowed
                        */

                        
                                    protected double localCentralBillAmountAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCentralBillAmountAllowedTracker = false ;

                           public boolean isCentralBillAmountAllowedSpecified(){
                               return localCentralBillAmountAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCentralBillAmountAllowed(){
                               return localCentralBillAmountAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CentralBillAmountAllowed
                               */
                               public void setCentralBillAmountAllowed(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCentralBillAmountAllowedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCentralBillAmountAllowed=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Membership/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TransactionAward",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TransactionAward",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "MembershipType", xmlWriter);
                             

                                          if (localMembershipType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "AwardType", xmlWriter);
                             

                                          if (localAwardType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelReference"),
                                               xmlWriter);
                                        } if (localDisplaySetTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "DisplaySet", xmlWriter);
                             

                                          if (localDisplaySet==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DisplaySet cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDisplaySet);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancelPenaltyChargeTracker){
                                            if (localCancelPenaltyCharge==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancelPenaltyCharge cannot be null!!");
                                            }
                                           localCancelPenaltyCharge.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyCharge"),
                                               xmlWriter);
                                        } if (localCancelPenaltyDaysTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CancelPenaltyDays", xmlWriter);
                             
                                               if (localCancelPenaltyDays==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CancelPenaltyDays cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyDays));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancelPenaltyTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CancelPenaltyType", xmlWriter);
                             

                                          if (localCancelPenaltyType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CancelPenaltyType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCancelPenaltyType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIgnoreFinancialTransactionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "IgnoreFinancialTransaction", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IgnoreFinancialTransaction cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIgnoreFinancialTransaction));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssueKeyTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "IssueKey", xmlWriter);
                             

                                          if (localIssueKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssueKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssueKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssueKeyRawTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "IssueKeyRaw", xmlWriter);
                             
                                        
                                    if (localIssueKeyRaw!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localIssueKeyRaw, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for IssueKeyRaw", ex);
                                       }
                                    } else {
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localLongDescriptionTracker){
                                            if (localLongDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                            }
                                           localLongDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","LongDescription"),
                                               xmlWriter);
                                        } if (localShortDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ShortDescription", xmlWriter);
                             

                                          if (localShortDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ShortDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localShortDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxPercentAllowedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "MaxPercentAllowed", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localMaxPercentAllowed)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxPercentAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxPercentAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipLevelTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "MembershipLevel", xmlWriter);
                             

                                          if (localMembershipLevel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipLevel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipLevel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCentralCurrencyCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CentralCurrencyCode", xmlWriter);
                             

                                          if (localCentralCurrencyCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CentralCurrencyCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCentralCurrencyCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOriginalPointsRequiredTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "OriginalPointsRequired", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localOriginalPointsRequired)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("OriginalPointsRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalPointsRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPointsRequiredTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "PointsRequired", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localPointsRequired)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PointsRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHotelCurrencyCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "HotelCurrencyCode", xmlWriter);
                             

                                          if (localHotelCurrencyCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("HotelCurrencyCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHotelCurrencyCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "TransactionCode", xmlWriter);
                             

                                          if (localTransactionCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TransactionCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSellBeginDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "SellBeginDate", xmlWriter);
                             

                                          if (localSellBeginDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SellBeginDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellBeginDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSellEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "SellEndDate", xmlWriter);
                             

                                          if (localSellEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SellEndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExchangeRateTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ExchangeRateType", xmlWriter);
                             

                                          if (localExchangeRateType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ExchangeRateType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExchangeRateType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localComputedPointsRequiredTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ComputedPointsRequired", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localComputedPointsRequired)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ComputedPointsRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComputedPointsRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHotelTotalBillAmountTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "HotelTotalBillAmount", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localHotelTotalBillAmount)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("HotelTotalBillAmount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelTotalBillAmount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHotelTotalBillAmountAllowedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "HotelTotalBillAmountAllowed", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localHotelTotalBillAmountAllowed)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("HotelTotalBillAmountAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelTotalBillAmountAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCentralBillAmountTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CentralBillAmount", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCentralBillAmount)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CentralBillAmount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralBillAmount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCentralBillAmountAllowedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CentralBillAmountAllowed", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCentralBillAmountAllowed)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CentralBillAmountAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralBillAmountAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "MembershipType"));
                                 
                                        if (localMembershipType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardType"));
                                 
                                        if (localAwardType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                        }
                                     if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                } if (localDisplaySetTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "DisplaySet"));
                                 
                                        if (localDisplaySet != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplaySet));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DisplaySet cannot be null!!");
                                        }
                                    } if (localCancelPenaltyChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyCharge"));
                            
                            
                                    if (localCancelPenaltyCharge==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancelPenaltyCharge cannot be null!!");
                                    }
                                    elementList.add(localCancelPenaltyCharge);
                                } if (localCancelPenaltyDaysTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyDays"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyDays));
                            } if (localCancelPenaltyTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyType"));
                                 
                                        if (localCancelPenaltyType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CancelPenaltyType cannot be null!!");
                                        }
                                    } if (localIgnoreFinancialTransactionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "IgnoreFinancialTransaction"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIgnoreFinancialTransaction));
                            } if (localIssueKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "IssueKey"));
                                 
                                        if (localIssueKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssueKey cannot be null!!");
                                        }
                                    } if (localIssueKeyRawTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                        "IssueKeyRaw"));
                                
                            elementList.add(localIssueKeyRaw);
                        } if (localLongDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "LongDescription"));
                            
                            
                                    if (localLongDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                    }
                                    elementList.add(localLongDescription);
                                } if (localShortDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ShortDescription"));
                                 
                                        if (localShortDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ShortDescription cannot be null!!");
                                        }
                                    } if (localMaxPercentAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "MaxPercentAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxPercentAllowed));
                            } if (localMembershipLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "MembershipLevel"));
                                 
                                        if (localMembershipLevel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipLevel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipLevel cannot be null!!");
                                        }
                                    } if (localCentralCurrencyCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CentralCurrencyCode"));
                                 
                                        if (localCentralCurrencyCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralCurrencyCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CentralCurrencyCode cannot be null!!");
                                        }
                                    } if (localOriginalPointsRequiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "OriginalPointsRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalPointsRequired));
                            } if (localPointsRequiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PointsRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                            } if (localHotelCurrencyCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "HotelCurrencyCode"));
                                 
                                        if (localHotelCurrencyCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelCurrencyCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("HotelCurrencyCode cannot be null!!");
                                        }
                                    } if (localTransactionCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "TransactionCode"));
                                 
                                        if (localTransactionCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TransactionCode cannot be null!!");
                                        }
                                    } if (localSellBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "SellBeginDate"));
                                 
                                        if (localSellBeginDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellBeginDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SellBeginDate cannot be null!!");
                                        }
                                    } if (localSellEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "SellEndDate"));
                                 
                                        if (localSellEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SellEndDate cannot be null!!");
                                        }
                                    } if (localExchangeRateTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ExchangeRateType"));
                                 
                                        if (localExchangeRateType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExchangeRateType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ExchangeRateType cannot be null!!");
                                        }
                                    } if (localComputedPointsRequiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ComputedPointsRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComputedPointsRequired));
                            } if (localHotelTotalBillAmountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "HotelTotalBillAmount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelTotalBillAmount));
                            } if (localHotelTotalBillAmountAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "HotelTotalBillAmountAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHotelTotalBillAmountAllowed));
                            } if (localCentralBillAmountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CentralBillAmount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralBillAmount));
                            } if (localCentralBillAmountAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CentralBillAmountAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralBillAmountAllowed));
                            }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TransactionAward parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TransactionAward object =
                new TransactionAward();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"TransactionAward".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TransactionAward)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","DisplaySet").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DisplaySet" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDisplaySet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyCharge").equals(reader.getName())){
                                
                                                object.setCancelPenaltyCharge(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyDays").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CancelPenaltyDays" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCancelPenaltyDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCancelPenaltyDays(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CancelPenaltyType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCancelPenaltyType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","IgnoreFinancialTransaction").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IgnoreFinancialTransaction" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIgnoreFinancialTransaction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","IssueKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IssueKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssueKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","IssueKeyRaw").equals(reader.getName())){
                                
                                            object.setIssueKeyRaw(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","LongDescription").equals(reader.getName())){
                                
                                                object.setLongDescription(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ShortDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ShortDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setShortDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MaxPercentAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MaxPercentAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxPercentAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxPercentAllowed(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipLevel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipLevel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CentralCurrencyCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CentralCurrencyCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCentralCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","OriginalPointsRequired").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"OriginalPointsRequired" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriginalPointsRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setOriginalPointsRequired(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PointsRequired").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PointsRequired" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPointsRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPointsRequired(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelCurrencyCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HotelCurrencyCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHotelCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TransactionCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TransactionCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","SellBeginDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SellBeginDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSellBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","SellEndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SellEndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSellEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ExchangeRateType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ExchangeRateType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExchangeRateType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ComputedPointsRequired").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ComputedPointsRequired" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComputedPointsRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setComputedPointsRequired(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelTotalBillAmount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HotelTotalBillAmount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHotelTotalBillAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setHotelTotalBillAmount(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelTotalBillAmountAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HotelTotalBillAmountAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHotelTotalBillAmountAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setHotelTotalBillAmountAllowed(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CentralBillAmount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CentralBillAmount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCentralBillAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCentralBillAmount(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CentralBillAmountAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CentralBillAmountAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCentralBillAmountAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCentralBillAmountAllowed(java.lang.Double.NaN);
                                           
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    