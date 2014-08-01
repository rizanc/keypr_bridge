
/**
 * RatePlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RatePlan bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RatePlan
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RatePlan
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for RatePlanDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRatePlanDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanDescriptionTracker = false ;

                           public boolean isRatePlanDescriptionSpecified(){
                               return localRatePlanDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRatePlanDescription(){
                               return localRatePlanDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanDescription
                               */
                               public void setRatePlanDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRatePlanDescriptionTracker = param != null;
                                   
                                            this.localRatePlanDescription=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanShortDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRatePlanShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanShortDescriptionTracker = false ;

                           public boolean isRatePlanShortDescriptionSpecified(){
                               return localRatePlanShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRatePlanShortDescription(){
                               return localRatePlanShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanShortDescription
                               */
                               public void setRatePlanShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRatePlanShortDescriptionTracker = param != null;
                                   
                                            this.localRatePlanShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for Commission
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Commission localCommission ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommissionTracker = false ;

                           public boolean isCommissionSpecified(){
                               return localCommissionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Commission
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Commission getCommission(){
                               return localCommission;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Commission
                               */
                               public void setCommission(com.cloudkey.pms.micros.og.hotelcommon.Commission param){
                            localCommissionTracker = param != null;
                                   
                                            this.localCommission=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalDetails
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailList localAdditionalDetails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalDetailsTracker = false ;

                           public boolean isAdditionalDetailsSpecified(){
                               return localAdditionalDetailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailList getAdditionalDetails(){
                               return localAdditionalDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalDetails
                               */
                               public void setAdditionalDetails(com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailList param){
                            localAdditionalDetailsTracker = param != null;
                                   
                                            this.localAdditionalDetails=param;
                                    

                               }
                            

                        /**
                        * field for CancellationDateTime
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime localCancellationDateTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancellationDateTimeTracker = false ;

                           public boolean isCancellationDateTimeSpecified(){
                               return localCancellationDateTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime getCancellationDateTime(){
                               return localCancellationDateTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancellationDateTime
                               */
                               public void setCancellationDateTime(com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime param){
                            localCancellationDateTimeTracker = param != null;
                                   
                                            this.localCancellationDateTime=param;
                                    

                               }
                            

                        /**
                        * field for DepositRequired
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement localDepositRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDepositRequiredTracker = false ;

                           public boolean isDepositRequiredSpecified(){
                               return localDepositRequiredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement getDepositRequired(){
                               return localDepositRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepositRequired
                               */
                               public void setDepositRequired(com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement param){
                            localDepositRequiredTracker = param != null;
                                   
                                            this.localDepositRequired=param;
                                    

                               }
                            

                        /**
                        * field for GdsFlags
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GdsFlags localGdsFlags ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGdsFlagsTracker = false ;

                           public boolean isGdsFlagsSpecified(){
                               return localGdsFlagsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GdsFlags
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GdsFlags getGdsFlags(){
                               return localGdsFlags;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GdsFlags
                               */
                               public void setGdsFlags(com.cloudkey.pms.micros.og.hotelcommon.GdsFlags param){
                            localGdsFlagsTracker = param != null;
                                   
                                            this.localGdsFlags=param;
                                    

                               }
                            

                        /**
                        * field for GuaranteeDetails
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuaranteeDetailList localGuaranteeDetails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuaranteeDetailsTracker = false ;

                           public boolean isGuaranteeDetailsSpecified(){
                               return localGuaranteeDetailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuaranteeDetailList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuaranteeDetailList getGuaranteeDetails(){
                               return localGuaranteeDetails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteeDetails
                               */
                               public void setGuaranteeDetails(com.cloudkey.pms.micros.og.hotelcommon.GuaranteeDetailList param){
                            localGuaranteeDetailsTracker = param != null;
                                   
                                            this.localGuaranteeDetails=param;
                                    

                               }
                            

                        /**
                        * field for MealPlanCodes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo localMealPlanCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMealPlanCodesTracker = false ;

                           public boolean isMealPlanCodesSpecified(){
                               return localMealPlanCodesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo getMealPlanCodes(){
                               return localMealPlanCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MealPlanCodes
                               */
                               public void setMealPlanCodes(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo param){
                            localMealPlanCodesTracker = param != null;
                                   
                                            this.localMealPlanCodes=param;
                                    

                               }
                            

                        /**
                        * field for Packages
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.PackageElementList localPackages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackagesTracker = false ;

                           public boolean isPackagesSpecified(){
                               return localPackagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.PackageElementList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.PackageElementList getPackages(){
                               return localPackages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Packages
                               */
                               public void setPackages(com.cloudkey.pms.micros.og.hotelcommon.PackageElementList param){
                            localPackagesTracker = param != null;
                                   
                                            this.localPackages=param;
                                    

                               }
                            

                        /**
                        * field for Discount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Discount localDiscount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDiscountTracker = false ;

                           public boolean isDiscountSpecified(){
                               return localDiscountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Discount
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Discount getDiscount(){
                               return localDiscount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Discount
                               */
                               public void setDiscount(com.cloudkey.pms.micros.og.hotelcommon.Discount param){
                            localDiscountTracker = param != null;
                                   
                                            this.localDiscount=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanCategory
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanCategory ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlanCategory(){
                               return localRatePlanCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanCategory
                               */
                               public void setRatePlanCategory(java.lang.String param){
                            
                                            this.localRatePlanCategory=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlanCode(){
                               return localRatePlanCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanCode
                               */
                               public void setRatePlanCode(java.lang.String param){
                            
                                            this.localRatePlanCode=param;
                                    

                               }
                            

                        /**
                        * field for PromotionCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPromotionCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPromotionCode(){
                               return localPromotionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PromotionCode
                               */
                               public void setPromotionCode(java.lang.String param){
                            
                                            this.localPromotionCode=param;
                                    

                               }
                            

                        /**
                        * field for QualifyingIdType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQualifyingIdType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualifyingIdType(){
                               return localQualifyingIdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifyingIdType
                               */
                               public void setQualifyingIdType(java.lang.String param){
                            
                                            this.localQualifyingIdType=param;
                                    

                               }
                            

                        /**
                        * field for QualifyingIdValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQualifyingIdValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualifyingIdValue(){
                               return localQualifyingIdValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifyingIdValue
                               */
                               public void setQualifyingIdValue(java.lang.String param){
                            
                                            this.localQualifyingIdValue=param;
                                    

                               }
                            

                        /**
                        * field for EffectiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEffectiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEffectiveDate(){
                               return localEffectiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveDate
                               */
                               public void setEffectiveDate(java.util.Date param){
                            
                                            this.localEffectiveDate=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpirationDate(){
                               return localExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpirationDate
                               */
                               public void setExpirationDate(java.util.Date param){
                            
                                            this.localExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for Hold
                        * This was an Attribute!
                        */

                        
                                    protected boolean localHold ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHold(){
                               return localHold;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Hold
                               */
                               public void setHold(boolean param){
                            
                                            this.localHold=param;
                                    

                               }
                            

                        /**
                        * field for CommissionYn
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCommissionYn ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCommissionYn(){
                               return localCommissionYn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommissionYn
                               */
                               public void setCommissionYn(boolean param){
                            
                                            this.localCommissionYn=param;
                                    

                               }
                            

                        /**
                        * field for MandatoryDeposit
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMandatoryDeposit ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMandatoryDeposit(){
                               return localMandatoryDeposit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MandatoryDeposit
                               */
                               public void setMandatoryDeposit(boolean param){
                            
                                            this.localMandatoryDeposit=param;
                                    

                               }
                            

                        /**
                        * field for SuppressRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSuppressRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSuppressRate(){
                               return localSuppressRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SuppressRate
                               */
                               public void setSuppressRate(boolean param){
                            
                                            this.localSuppressRate=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlanName(){
                               return localRatePlanName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanName
                               */
                               public void setRatePlanName(java.lang.String param){
                            
                                            this.localRatePlanName=param;
                                    

                               }
                            

                        /**
                        * field for AwardType
                        * This was an Attribute!
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
                        * field for RedemRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRedemRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRedemRate(){
                               return localRedemRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedemRate
                               */
                               public void setRedemRate(boolean param){
                            
                                            this.localRedemRate=param;
                                    

                               }
                            

                        /**
                        * field for CommissionCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCommissionCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCommissionCode(){
                               return localCommissionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommissionCode
                               */
                               public void setCommissionCode(java.lang.String param){
                            
                                            this.localCommissionCode=param;
                                    

                               }
                            

                        /**
                        * field for AsbRateCycle
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAsbRateCycle ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAsbRateCycle(){
                               return localAsbRateCycle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AsbRateCycle
                               */
                               public void setAsbRateCycle(java.lang.String param){
                            
                                            this.localAsbRateCycle=param;
                                    

                               }
                            

                        /**
                        * field for HasPackage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localHasPackage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasPackage(){
                               return localHasPackage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasPackage
                               */
                               public void setHasPackage(boolean param){
                            
                                            this.localHasPackage=param;
                                    

                               }
                            

                        /**
                        * field for TaxInclusive
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTaxInclusive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTaxInclusive(){
                               return localTaxInclusive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxInclusive
                               */
                               public void setTaxInclusive(boolean param){
                            
                                            this.localTaxInclusive=param;
                                    

                               }
                            

                        /**
                        * field for BlockName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localBlockName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockName(){
                               return localBlockName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockName
                               */
                               public void setBlockName(java.lang.String param){
                            
                                            this.localBlockName=param;
                                    

                               }
                            

                        /**
                        * field for RankRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRankRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRankRate(){
                               return localRankRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RankRate
                               */
                               public void setRankRate(boolean param){
                            
                                            this.localRankRate=param;
                                    

                               }
                            

                        /**
                        * field for RateTypeIndicator
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRateTypeIndicator ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateTypeIndicator(){
                               return localRateTypeIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateTypeIndicator
                               */
                               public void setRateTypeIndicator(java.lang.String param){
                            
                                            this.localRateTypeIndicator=param;
                                    

                               }
                            

                        /**
                        * field for PostingRhythm
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPostingRhythm ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostingRhythm(){
                               return localPostingRhythm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostingRhythm
                               */
                               public void setPostingRhythm(java.lang.String param){
                            
                                            this.localPostingRhythm=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/HotelCommon/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RatePlan",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RatePlan",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRatePlanCategory != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCategory",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCategory), xmlWriter);

                                            
                                      }
                                    
                                            if (localRatePlanCode != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localRatePlanCode is null");
                                      }
                                    
                                            if (localPromotionCode != null){
                                        
                                                writeAttribute("",
                                                         "promotionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localQualifyingIdType != null){
                                        
                                                writeAttribute("",
                                                         "qualifyingIdType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQualifyingIdValue != null){
                                        
                                                writeAttribute("",
                                                         "qualifyingIdValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localEffectiveDate != null){
                                        
                                                writeAttribute("",
                                                         "effectiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "expirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "hold",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHold), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "commissionYn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionYn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "mandatoryDeposit",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "suppressRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localRatePlanName != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanName), xmlWriter);

                                            
                                      }
                                    
                                            if (localAwardType != null){
                                        
                                                writeAttribute("",
                                                         "awardType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "redemRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localCommissionCode != null){
                                        
                                                writeAttribute("",
                                                         "commissionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localAsbRateCycle != null){
                                        
                                                writeAttribute("",
                                                         "asbRateCycle",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsbRateCycle), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "hasPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "taxInclusive",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive), xmlWriter);

                                            
                                      }
                                    
                                            if (localBlockName != null){
                                        
                                                writeAttribute("",
                                                         "blockName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "rankRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRankRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localRateTypeIndicator != null){
                                        
                                                writeAttribute("",
                                                         "rateTypeIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateTypeIndicator), xmlWriter);

                                            
                                      }
                                    
                                            if (localPostingRhythm != null){
                                        
                                                writeAttribute("",
                                                         "postingRhythm",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm), xmlWriter);

                                            
                                      }
                                     if (localRatePlanDescriptionTracker){
                                            if (localRatePlanDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlanDescription cannot be null!!");
                                            }
                                           localRatePlanDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanDescription"),
                                               xmlWriter);
                                        } if (localRatePlanShortDescriptionTracker){
                                            if (localRatePlanShortDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlanShortDescription cannot be null!!");
                                            }
                                           localRatePlanShortDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanShortDescription"),
                                               xmlWriter);
                                        } if (localCommissionTracker){
                                            if (localCommission==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                            }
                                           localCommission.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Commission"),
                                               xmlWriter);
                                        } if (localAdditionalDetailsTracker){
                                            if (localAdditionalDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalDetails cannot be null!!");
                                            }
                                           localAdditionalDetails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalDetails"),
                                               xmlWriter);
                                        } if (localCancellationDateTimeTracker){
                                            if (localCancellationDateTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancellationDateTime cannot be null!!");
                                            }
                                           localCancellationDateTime.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancellationDateTime"),
                                               xmlWriter);
                                        } if (localDepositRequiredTracker){
                                            if (localDepositRequired==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DepositRequired cannot be null!!");
                                            }
                                           localDepositRequired.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DepositRequired"),
                                               xmlWriter);
                                        } if (localGdsFlagsTracker){
                                            if (localGdsFlags==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GdsFlags cannot be null!!");
                                            }
                                           localGdsFlags.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsFlags"),
                                               xmlWriter);
                                        } if (localGuaranteeDetailsTracker){
                                            if (localGuaranteeDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuaranteeDetails cannot be null!!");
                                            }
                                           localGuaranteeDetails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDetails"),
                                               xmlWriter);
                                        } if (localMealPlanCodesTracker){
                                            if (localMealPlanCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MealPlanCodes cannot be null!!");
                                            }
                                           localMealPlanCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MealPlanCodes"),
                                               xmlWriter);
                                        } if (localPackagesTracker){
                                            if (localPackages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                            }
                                           localPackages.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages"),
                                               xmlWriter);
                                        } if (localDiscountTracker){
                                            if (localDiscount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Discount cannot be null!!");
                                            }
                                           localDiscount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Discount"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
                return "ns4";
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

                 if (localRatePlanDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RatePlanDescription"));
                            
                            
                                    if (localRatePlanDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlanDescription cannot be null!!");
                                    }
                                    elementList.add(localRatePlanDescription);
                                } if (localRatePlanShortDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RatePlanShortDescription"));
                            
                            
                                    if (localRatePlanShortDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlanShortDescription cannot be null!!");
                                    }
                                    elementList.add(localRatePlanShortDescription);
                                } if (localCommissionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Commission"));
                            
                            
                                    if (localCommission==null){
                                         throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                    }
                                    elementList.add(localCommission);
                                } if (localAdditionalDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AdditionalDetails"));
                            
                            
                                    if (localAdditionalDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalDetails cannot be null!!");
                                    }
                                    elementList.add(localAdditionalDetails);
                                } if (localCancellationDateTimeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CancellationDateTime"));
                            
                            
                                    if (localCancellationDateTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancellationDateTime cannot be null!!");
                                    }
                                    elementList.add(localCancellationDateTime);
                                } if (localDepositRequiredTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "DepositRequired"));
                            
                            
                                    if (localDepositRequired==null){
                                         throw new org.apache.axis2.databinding.ADBException("DepositRequired cannot be null!!");
                                    }
                                    elementList.add(localDepositRequired);
                                } if (localGdsFlagsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GdsFlags"));
                            
                            
                                    if (localGdsFlags==null){
                                         throw new org.apache.axis2.databinding.ADBException("GdsFlags cannot be null!!");
                                    }
                                    elementList.add(localGdsFlags);
                                } if (localGuaranteeDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuaranteeDetails"));
                            
                            
                                    if (localGuaranteeDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuaranteeDetails cannot be null!!");
                                    }
                                    elementList.add(localGuaranteeDetails);
                                } if (localMealPlanCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "MealPlanCodes"));
                            
                            
                                    if (localMealPlanCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("MealPlanCodes cannot be null!!");
                                    }
                                    elementList.add(localMealPlanCodes);
                                } if (localPackagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Packages"));
                            
                            
                                    if (localPackages==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                    }
                                    elementList.add(localPackages);
                                } if (localDiscountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Discount"));
                            
                            
                                    if (localDiscount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Discount cannot be null!!");
                                    }
                                    elementList.add(localDiscount);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCategory"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCategory));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","promotionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifyingIdType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifyingIdValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","effectiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","expirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","hold"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHold));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commissionYn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionYn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","mandatoryDeposit"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","suppressRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","awardType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","redemRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commissionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","asbRateCycle"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsbRateCycle));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","hasPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","taxInclusive"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","blockName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rankRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRankRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateTypeIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateTypeIndicator));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","postingRhythm"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm));
                                

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
        public static RatePlan parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RatePlan object =
                new RatePlan();

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
                    
                            if (!"RatePlan".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RatePlan)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ratePlanCategory"
                    java.lang.String tempAttribRatePlanCategory =
                        
                                reader.getAttributeValue(null,"ratePlanCategory");
                            
                   if (tempAttribRatePlanCategory!=null){
                         java.lang.String content = tempAttribRatePlanCategory;
                        
                                                 object.setRatePlanCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanCategory));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanCategory");
                    
                    // handle attribute "ratePlanCode"
                    java.lang.String tempAttribRatePlanCode =
                        
                                reader.getAttributeValue(null,"ratePlanCode");
                            
                   if (tempAttribRatePlanCode!=null){
                         java.lang.String content = tempAttribRatePlanCode;
                        
                                                 object.setRatePlanCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ratePlanCode is missing");
                           
                    }
                    handledAttributes.add("ratePlanCode");
                    
                    // handle attribute "promotionCode"
                    java.lang.String tempAttribPromotionCode =
                        
                                reader.getAttributeValue(null,"promotionCode");
                            
                   if (tempAttribPromotionCode!=null){
                         java.lang.String content = tempAttribPromotionCode;
                        
                                                 object.setPromotionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPromotionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("promotionCode");
                    
                    // handle attribute "qualifyingIdType"
                    java.lang.String tempAttribQualifyingIdType =
                        
                                reader.getAttributeValue(null,"qualifyingIdType");
                            
                   if (tempAttribQualifyingIdType!=null){
                         java.lang.String content = tempAttribQualifyingIdType;
                        
                                                 object.setQualifyingIdType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifyingIdType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifyingIdType");
                    
                    // handle attribute "qualifyingIdValue"
                    java.lang.String tempAttribQualifyingIdValue =
                        
                                reader.getAttributeValue(null,"qualifyingIdValue");
                            
                   if (tempAttribQualifyingIdValue!=null){
                         java.lang.String content = tempAttribQualifyingIdValue;
                        
                                                 object.setQualifyingIdValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifyingIdValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifyingIdValue");
                    
                    // handle attribute "effectiveDate"
                    java.lang.String tempAttribEffectiveDate =
                        
                                reader.getAttributeValue(null,"effectiveDate");
                            
                   if (tempAttribEffectiveDate!=null){
                         java.lang.String content = tempAttribEffectiveDate;
                        
                                                 object.setEffectiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEffectiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("effectiveDate");
                    
                    // handle attribute "expirationDate"
                    java.lang.String tempAttribExpirationDate =
                        
                                reader.getAttributeValue(null,"expirationDate");
                            
                   if (tempAttribExpirationDate!=null){
                         java.lang.String content = tempAttribExpirationDate;
                        
                                                 object.setExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("expirationDate");
                    
                    // handle attribute "hold"
                    java.lang.String tempAttribHold =
                        
                                reader.getAttributeValue(null,"hold");
                            
                   if (tempAttribHold!=null){
                         java.lang.String content = tempAttribHold;
                        
                                                 object.setHold(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribHold));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("hold");
                    
                    // handle attribute "commissionYn"
                    java.lang.String tempAttribCommissionYn =
                        
                                reader.getAttributeValue(null,"commissionYn");
                            
                   if (tempAttribCommissionYn!=null){
                         java.lang.String content = tempAttribCommissionYn;
                        
                                                 object.setCommissionYn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCommissionYn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commissionYn");
                    
                    // handle attribute "mandatoryDeposit"
                    java.lang.String tempAttribMandatoryDeposit =
                        
                                reader.getAttributeValue(null,"mandatoryDeposit");
                            
                   if (tempAttribMandatoryDeposit!=null){
                         java.lang.String content = tempAttribMandatoryDeposit;
                        
                                                 object.setMandatoryDeposit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMandatoryDeposit));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("mandatoryDeposit");
                    
                    // handle attribute "suppressRate"
                    java.lang.String tempAttribSuppressRate =
                        
                                reader.getAttributeValue(null,"suppressRate");
                            
                   if (tempAttribSuppressRate!=null){
                         java.lang.String content = tempAttribSuppressRate;
                        
                                                 object.setSuppressRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSuppressRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("suppressRate");
                    
                    // handle attribute "ratePlanName"
                    java.lang.String tempAttribRatePlanName =
                        
                                reader.getAttributeValue(null,"ratePlanName");
                            
                   if (tempAttribRatePlanName!=null){
                         java.lang.String content = tempAttribRatePlanName;
                        
                                                 object.setRatePlanName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanName");
                    
                    // handle attribute "awardType"
                    java.lang.String tempAttribAwardType =
                        
                                reader.getAttributeValue(null,"awardType");
                            
                   if (tempAttribAwardType!=null){
                         java.lang.String content = tempAttribAwardType;
                        
                                                 object.setAwardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAwardType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("awardType");
                    
                    // handle attribute "redemRate"
                    java.lang.String tempAttribRedemRate =
                        
                                reader.getAttributeValue(null,"redemRate");
                            
                   if (tempAttribRedemRate!=null){
                         java.lang.String content = tempAttribRedemRate;
                        
                                                 object.setRedemRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRedemRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("redemRate");
                    
                    // handle attribute "commissionCode"
                    java.lang.String tempAttribCommissionCode =
                        
                                reader.getAttributeValue(null,"commissionCode");
                            
                   if (tempAttribCommissionCode!=null){
                         java.lang.String content = tempAttribCommissionCode;
                        
                                                 object.setCommissionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCommissionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commissionCode");
                    
                    // handle attribute "asbRateCycle"
                    java.lang.String tempAttribAsbRateCycle =
                        
                                reader.getAttributeValue(null,"asbRateCycle");
                            
                   if (tempAttribAsbRateCycle!=null){
                         java.lang.String content = tempAttribAsbRateCycle;
                        
                                                 object.setAsbRateCycle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAsbRateCycle));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("asbRateCycle");
                    
                    // handle attribute "hasPackage"
                    java.lang.String tempAttribHasPackage =
                        
                                reader.getAttributeValue(null,"hasPackage");
                            
                   if (tempAttribHasPackage!=null){
                         java.lang.String content = tempAttribHasPackage;
                        
                                                 object.setHasPackage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribHasPackage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("hasPackage");
                    
                    // handle attribute "taxInclusive"
                    java.lang.String tempAttribTaxInclusive =
                        
                                reader.getAttributeValue(null,"taxInclusive");
                            
                   if (tempAttribTaxInclusive!=null){
                         java.lang.String content = tempAttribTaxInclusive;
                        
                                                 object.setTaxInclusive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxInclusive));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("taxInclusive");
                    
                    // handle attribute "blockName"
                    java.lang.String tempAttribBlockName =
                        
                                reader.getAttributeValue(null,"blockName");
                            
                   if (tempAttribBlockName!=null){
                         java.lang.String content = tempAttribBlockName;
                        
                                                 object.setBlockName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBlockName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("blockName");
                    
                    // handle attribute "rankRate"
                    java.lang.String tempAttribRankRate =
                        
                                reader.getAttributeValue(null,"rankRate");
                            
                   if (tempAttribRankRate!=null){
                         java.lang.String content = tempAttribRankRate;
                        
                                                 object.setRankRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRankRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rankRate");
                    
                    // handle attribute "rateTypeIndicator"
                    java.lang.String tempAttribRateTypeIndicator =
                        
                                reader.getAttributeValue(null,"rateTypeIndicator");
                            
                   if (tempAttribRateTypeIndicator!=null){
                         java.lang.String content = tempAttribRateTypeIndicator;
                        
                                                 object.setRateTypeIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateTypeIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateTypeIndicator");
                    
                    // handle attribute "postingRhythm"
                    java.lang.String tempAttribPostingRhythm =
                        
                                reader.getAttributeValue(null,"postingRhythm");
                            
                   if (tempAttribPostingRhythm!=null){
                         java.lang.String content = tempAttribPostingRhythm;
                        
                                                 object.setPostingRhythm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPostingRhythm));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("postingRhythm");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanDescription").equals(reader.getName())){
                                
                                                object.setRatePlanDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanShortDescription").equals(reader.getName())){
                                
                                                object.setRatePlanShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Commission").equals(reader.getName())){
                                
                                                object.setCommission(com.cloudkey.pms.micros.og.hotelcommon.Commission.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalDetails").equals(reader.getName())){
                                
                                                object.setAdditionalDetails(com.cloudkey.pms.micros.og.hotelcommon.AdditionalDetailList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancellationDateTime").equals(reader.getName())){
                                
                                                object.setCancellationDateTime(com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DepositRequired").equals(reader.getName())){
                                
                                                object.setDepositRequired(com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsFlags").equals(reader.getName())){
                                
                                                object.setGdsFlags(com.cloudkey.pms.micros.og.hotelcommon.GdsFlags.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDetails").equals(reader.getName())){
                                
                                                object.setGuaranteeDetails(com.cloudkey.pms.micros.og.hotelcommon.GuaranteeDetailList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MealPlanCodes").equals(reader.getName())){
                                
                                                object.setMealPlanCodes(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages").equals(reader.getName())){
                                
                                                object.setPackages(com.cloudkey.pms.micros.og.hotelcommon.PackageElementList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Discount").equals(reader.getName())){
                                
                                                object.setDiscount(com.cloudkey.pms.micros.og.hotelcommon.Discount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
    