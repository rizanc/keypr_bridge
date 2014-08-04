
/**
 * RoomStay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RoomStay bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomStay
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomStay
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for RatePlans
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan localRatePlans ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlansTracker = false ;

                           public boolean isRatePlansSpecified(){
                               return localRatePlansTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan getRatePlans(){
                               return localRatePlans;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlans
                               */
                               public void setRatePlans(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan param){
                            localRatePlansTracker = param != null;
                                   
                                            this.localRatePlans=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType localRoomTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypesTracker = false ;

                           public boolean isRoomTypesSpecified(){
                               return localRoomTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType getRoomTypes(){
                               return localRoomTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypes
                               */
                               public void setRoomTypes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType param){
                            localRoomTypesTracker = param != null;
                                   
                                            this.localRoomTypes=param;
                                    

                               }
                            

                        /**
                        * field for RoomRates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate localRoomRates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomRatesTracker = false ;

                           public boolean isRoomRatesSpecified(){
                               return localRoomRatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate getRoomRates(){
                               return localRoomRates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomRates
                               */
                               public void setRoomRates(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate param){
                            localRoomRatesTracker = param != null;
                                   
                                            this.localRoomRates=param;
                                    

                               }
                            

                        /**
                        * field for GuestCounts
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuestCountList localGuestCounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuestCountsTracker = false ;

                           public boolean isGuestCountsSpecified(){
                               return localGuestCountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuestCountList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuestCountList getGuestCounts(){
                               return localGuestCounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestCounts
                               */
                               public void setGuestCounts(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList param){
                            localGuestCountsTracker = param != null;
                                   
                                            this.localGuestCounts=param;
                                    

                               }
                            

                        /**
                        * field for TimeSpan
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localTimeSpan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeSpanTracker = false ;

                           public boolean isTimeSpanSpecified(){
                               return localTimeSpanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getTimeSpan(){
                               return localTimeSpan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeSpan
                               */
                               public void setTimeSpan(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localTimeSpanTracker = param != null;
                                   
                                            this.localTimeSpan=param;
                                    

                               }
                            

                        /**
                        * field for Guarantee
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Guarantee localGuarantee ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuaranteeTracker = false ;

                           public boolean isGuaranteeSpecified(){
                               return localGuaranteeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Guarantee
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Guarantee getGuarantee(){
                               return localGuarantee;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Guarantee
                               */
                               public void setGuarantee(com.cloudkey.pms.micros.og.hotelcommon.Guarantee param){
                            localGuaranteeTracker = param != null;
                                   
                                            this.localGuarantee=param;
                                    

                               }
                            

                        /**
                        * field for Payment
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Payment localPayment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentTracker = false ;

                           public boolean isPaymentSpecified(){
                               return localPaymentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Payment
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Payment getPayment(){
                               return localPayment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payment
                               */
                               public void setPayment(com.cloudkey.pms.micros.og.hotelcommon.Payment param){
                            localPaymentTracker = param != null;
                                   
                                            this.localPayment=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardDeposit
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment localCreditCardDeposit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardDepositTracker = false ;

                           public boolean isCreditCardDepositSpecified(){
                               return localCreditCardDepositTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment getCreditCardDeposit(){
                               return localCreditCardDeposit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardDeposit
                               */
                               public void setCreditCardDeposit(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment param){
                            localCreditCardDepositTracker = param != null;
                                   
                                            this.localCreditCardDeposit=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenalties
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty localCancelPenalties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltiesTracker = false ;

                           public boolean isCancelPenaltiesSpecified(){
                               return localCancelPenaltiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty getCancelPenalties(){
                               return localCancelPenalties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenalties
                               */
                               public void setCancelPenalties(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty param){
                            localCancelPenaltiesTracker = param != null;
                                   
                                            this.localCancelPenalties=param;
                                    

                               }
                            

                        /**
                        * field for CancelTerm
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.CancelTerm localCancelTerm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelTermTracker = false ;

                           public boolean isCancelTermSpecified(){
                               return localCancelTermTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.CancelTerm
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.CancelTerm getCancelTerm(){
                               return localCancelTerm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelTerm
                               */
                               public void setCancelTerm(com.cloudkey.pms.micros.og.hotelcommon.CancelTerm param){
                            localCancelTermTracker = param != null;
                                   
                                            this.localCancelTerm=param;
                                    

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
                        * field for HotelContact
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelContact localHotelContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelContactTracker = false ;

                           public boolean isHotelContactSpecified(){
                               return localHotelContactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelContact
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelContact getHotelContact(){
                               return localHotelContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelContact
                               */
                               public void setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact param){
                            localHotelContactTracker = param != null;
                                   
                                            this.localHotelContact=param;
                                    

                               }
                            

                        /**
                        * field for Total
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalTracker = false ;

                           public boolean isTotalSpecified(){
                               return localTotalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotal(){
                               return localTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Total
                               */
                               public void setTotal(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalTracker = param != null;
                                   
                                            this.localTotal=param;
                                    

                               }
                            

                        /**
                        * field for CurrentBalance
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localCurrentBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentBalanceTracker = false ;

                           public boolean isCurrentBalanceSpecified(){
                               return localCurrentBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getCurrentBalance(){
                               return localCurrentBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentBalance
                               */
                               public void setCurrentBalance(com.cloudkey.pms.micros.og.common.Amount param){
                            localCurrentBalanceTracker = param != null;
                                   
                                            this.localCurrentBalance=param;
                                    

                               }
                            

                        /**
                        * field for ResGuestRPHs
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH localResGuestRPHs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResGuestRPHsTracker = false ;

                           public boolean isResGuestRPHsSpecified(){
                               return localResGuestRPHsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH getResGuestRPHs(){
                               return localResGuestRPHs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResGuestRPHs
                               */
                               public void setResGuestRPHs(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH param){
                            localResGuestRPHsTracker = param != null;
                                   
                                            this.localResGuestRPHs=param;
                                    

                               }
                            

                        /**
                        * field for Comments
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment localComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentsTracker = false ;

                           public boolean isCommentsSpecified(){
                               return localCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment getComments(){
                               return localComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comments
                               */
                               public void setComments(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment param){
                            localCommentsTracker = param != null;
                                   
                                            this.localComments=param;
                                    

                               }
                            

                        /**
                        * field for SpecialRequests
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest localSpecialRequests ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialRequestsTracker = false ;

                           public boolean isSpecialRequestsSpecified(){
                               return localSpecialRequestsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest getSpecialRequests(){
                               return localSpecialRequests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialRequests
                               */
                               public void setSpecialRequests(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest param){
                            localSpecialRequestsTracker = param != null;
                                   
                                            this.localSpecialRequests=param;
                                    

                               }
                            

                        /**
                        * field for Packages
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement localPackages ;
                                
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
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement getPackages(){
                               return localPackages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Packages
                               */
                               public void setPackages(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement param){
                            localPackagesTracker = param != null;
                                   
                                            this.localPackages=param;
                                    

                               }
                            

                        /**
                        * field for HotelExtendedInformation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo localHotelExtendedInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelExtendedInformationTracker = false ;

                           public boolean isHotelExtendedInformationSpecified(){
                               return localHotelExtendedInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo getHotelExtendedInformation(){
                               return localHotelExtendedInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelExtendedInformation
                               */
                               public void setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo param){
                            localHotelExtendedInformationTracker = param != null;
                                   
                                            this.localHotelExtendedInformation=param;
                                    

                               }
                            

                        /**
                        * field for DailyChargePoints
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints localDailyChargePoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDailyChargePointsTracker = false ;

                           public boolean isDailyChargePointsSpecified(){
                               return localDailyChargePointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints getDailyChargePoints(){
                               return localDailyChargePoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DailyChargePoints
                               */
                               public void setDailyChargePoints(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints param){
                            localDailyChargePointsTracker = param != null;
                                   
                                            this.localDailyChargePoints=param;
                                    

                               }
                            

                        /**
                        * field for MemberAwardInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo localMemberAwardInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMemberAwardInfoTracker = false ;

                           public boolean isMemberAwardInfoSpecified(){
                               return localMemberAwardInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo getMemberAwardInfo(){
                               return localMemberAwardInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MemberAwardInfo
                               */
                               public void setMemberAwardInfo(com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo param){
                            localMemberAwardInfoTracker = param != null;
                                   
                                            this.localMemberAwardInfo=param;
                                    

                               }
                            

                        /**
                        * field for ExpectedCharges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList localExpectedCharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpectedChargesTracker = false ;

                           public boolean isExpectedChargesSpecified(){
                               return localExpectedChargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList getExpectedCharges(){
                               return localExpectedCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpectedCharges
                               */
                               public void setExpectedCharges(com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList param){
                            localExpectedChargesTracker = param != null;
                                   
                                            this.localExpectedCharges=param;
                                    

                               }
                            

                        /**
                        * field for GdsTotalPricing
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing localGdsTotalPricing ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGdsTotalPricingTracker = false ;

                           public boolean isGdsTotalPricingSpecified(){
                               return localGdsTotalPricingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing getGdsTotalPricing(){
                               return localGdsTotalPricing;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GdsTotalPricing
                               */
                               public void setGdsTotalPricing(com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing param){
                            localGdsTotalPricingTracker = param != null;
                                   
                                            this.localGdsTotalPricing=param;
                                    

                               }
                            

                        /**
                        * field for Traces
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace localTraces ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTracesTracker = false ;

                           public boolean isTracesSpecified(){
                               return localTracesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace getTraces(){
                               return localTraces;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Traces
                               */
                               public void setTraces(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace param){
                            localTracesTracker = param != null;
                                   
                                            this.localTraces=param;
                                    

                               }
                            

                        /**
                        * field for IsAlternate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsAlternate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsAlternate(){
                               return localIsAlternate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsAlternate
                               */
                               public void setIsAlternate(boolean param){
                            
                                            this.localIsAlternate=param;
                                    

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
                           namespacePrefix+":RoomStay",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomStay",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "isAlternate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsAlternate), xmlWriter);

                                            
                                      }
                                     if (localRatePlansTracker){
                                            if (localRatePlans==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlans cannot be null!!");
                                            }
                                           localRatePlans.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlans"),
                                               xmlWriter);
                                        } if (localRoomTypesTracker){
                                            if (localRoomTypes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomTypes cannot be null!!");
                                            }
                                           localRoomTypes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypes"),
                                               xmlWriter);
                                        } if (localRoomRatesTracker){
                                            if (localRoomRates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomRates cannot be null!!");
                                            }
                                           localRoomRates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomRates"),
                                               xmlWriter);
                                        } if (localGuestCountsTracker){
                                            if (localGuestCounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                            }
                                           localGuestCounts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuestCounts"),
                                               xmlWriter);
                                        } if (localTimeSpanTracker){
                                            if (localTimeSpan==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TimeSpan cannot be null!!");
                                            }
                                           localTimeSpan.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TimeSpan"),
                                               xmlWriter);
                                        } if (localGuaranteeTracker){
                                            if (localGuarantee==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Guarantee cannot be null!!");
                                            }
                                           localGuarantee.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Guarantee"),
                                               xmlWriter);
                                        } if (localPaymentTracker){
                                            if (localPayment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Payment cannot be null!!");
                                            }
                                           localPayment.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Payment"),
                                               xmlWriter);
                                        } if (localCreditCardDepositTracker){
                                            if (localCreditCardDeposit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCardDeposit cannot be null!!");
                                            }
                                           localCreditCardDeposit.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CreditCardDeposit"),
                                               xmlWriter);
                                        } if (localCancelPenaltiesTracker){
                                            if (localCancelPenalties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancelPenalties cannot be null!!");
                                            }
                                           localCancelPenalties.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelPenalties"),
                                               xmlWriter);
                                        } if (localCancelTermTracker){
                                            if (localCancelTerm==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancelTerm cannot be null!!");
                                            }
                                           localCancelTerm.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelTerm"),
                                               xmlWriter);
                                        } if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelReference"),
                                               xmlWriter);
                                        } if (localHotelContactTracker){
                                            if (localHotelContact==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                            }
                                           localHotelContact.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelContact"),
                                               xmlWriter);
                                        } if (localTotalTracker){
                                            if (localTotal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");
                                            }
                                           localTotal.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Total"),
                                               xmlWriter);
                                        } if (localCurrentBalanceTracker){
                                            if (localCurrentBalance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CurrentBalance cannot be null!!");
                                            }
                                           localCurrentBalance.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CurrentBalance"),
                                               xmlWriter);
                                        } if (localResGuestRPHsTracker){
                                            if (localResGuestRPHs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResGuestRPHs cannot be null!!");
                                            }
                                           localResGuestRPHs.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ResGuestRPHs"),
                                               xmlWriter);
                                        } if (localCommentsTracker){
                                            if (localComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                            }
                                           localComments.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Comments"),
                                               xmlWriter);
                                        } if (localSpecialRequestsTracker){
                                            if (localSpecialRequests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SpecialRequests cannot be null!!");
                                            }
                                           localSpecialRequests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","SpecialRequests"),
                                               xmlWriter);
                                        } if (localPackagesTracker){
                                            if (localPackages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                            }
                                           localPackages.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages"),
                                               xmlWriter);
                                        } if (localHotelExtendedInformationTracker){
                                            if (localHotelExtendedInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                            }
                                           localHotelExtendedInformation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelExtendedInformation"),
                                               xmlWriter);
                                        } if (localDailyChargePointsTracker){
                                            if (localDailyChargePoints==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DailyChargePoints cannot be null!!");
                                            }
                                           localDailyChargePoints.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DailyChargePoints"),
                                               xmlWriter);
                                        } if (localMemberAwardInfoTracker){
                                            if (localMemberAwardInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MemberAwardInfo cannot be null!!");
                                            }
                                           localMemberAwardInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MemberAwardInfo"),
                                               xmlWriter);
                                        } if (localExpectedChargesTracker){
                                            if (localExpectedCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExpectedCharges cannot be null!!");
                                            }
                                           localExpectedCharges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ExpectedCharges"),
                                               xmlWriter);
                                        } if (localGdsTotalPricingTracker){
                                            if (localGdsTotalPricing==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GdsTotalPricing cannot be null!!");
                                            }
                                           localGdsTotalPricing.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsTotalPricing"),
                                               xmlWriter);
                                        } if (localTracesTracker){
                                            if (localTraces==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Traces cannot be null!!");
                                            }
                                           localTraces.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Traces"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
                return "ns2";
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

                 if (localRatePlansTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RatePlans"));
                            
                            
                                    if (localRatePlans==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlans cannot be null!!");
                                    }
                                    elementList.add(localRatePlans);
                                } if (localRoomTypesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomTypes"));
                            
                            
                                    if (localRoomTypes==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomTypes cannot be null!!");
                                    }
                                    elementList.add(localRoomTypes);
                                } if (localRoomRatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomRates"));
                            
                            
                                    if (localRoomRates==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomRates cannot be null!!");
                                    }
                                    elementList.add(localRoomRates);
                                } if (localGuestCountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuestCounts"));
                            
                            
                                    if (localGuestCounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                    }
                                    elementList.add(localGuestCounts);
                                } if (localTimeSpanTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TimeSpan"));
                            
                            
                                    if (localTimeSpan==null){
                                         throw new org.apache.axis2.databinding.ADBException("TimeSpan cannot be null!!");
                                    }
                                    elementList.add(localTimeSpan);
                                } if (localGuaranteeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Guarantee"));
                            
                            
                                    if (localGuarantee==null){
                                         throw new org.apache.axis2.databinding.ADBException("Guarantee cannot be null!!");
                                    }
                                    elementList.add(localGuarantee);
                                } if (localPaymentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Payment"));
                            
                            
                                    if (localPayment==null){
                                         throw new org.apache.axis2.databinding.ADBException("Payment cannot be null!!");
                                    }
                                    elementList.add(localPayment);
                                } if (localCreditCardDepositTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CreditCardDeposit"));
                            
                            
                                    if (localCreditCardDeposit==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCardDeposit cannot be null!!");
                                    }
                                    elementList.add(localCreditCardDeposit);
                                } if (localCancelPenaltiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CancelPenalties"));
                            
                            
                                    if (localCancelPenalties==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancelPenalties cannot be null!!");
                                    }
                                    elementList.add(localCancelPenalties);
                                } if (localCancelTermTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CancelTerm"));
                            
                            
                                    if (localCancelTerm==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancelTerm cannot be null!!");
                                    }
                                    elementList.add(localCancelTerm);
                                } if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                } if (localHotelContactTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "HotelContact"));
                            
                            
                                    if (localHotelContact==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                    }
                                    elementList.add(localHotelContact);
                                } if (localTotalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Total"));
                            
                            
                                    if (localTotal==null){
                                         throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");
                                    }
                                    elementList.add(localTotal);
                                } if (localCurrentBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CurrentBalance"));
                            
                            
                                    if (localCurrentBalance==null){
                                         throw new org.apache.axis2.databinding.ADBException("CurrentBalance cannot be null!!");
                                    }
                                    elementList.add(localCurrentBalance);
                                } if (localResGuestRPHsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ResGuestRPHs"));
                            
                            
                                    if (localResGuestRPHs==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResGuestRPHs cannot be null!!");
                                    }
                                    elementList.add(localResGuestRPHs);
                                } if (localCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Comments"));
                            
                            
                                    if (localComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                    }
                                    elementList.add(localComments);
                                } if (localSpecialRequestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "SpecialRequests"));
                            
                            
                                    if (localSpecialRequests==null){
                                         throw new org.apache.axis2.databinding.ADBException("SpecialRequests cannot be null!!");
                                    }
                                    elementList.add(localSpecialRequests);
                                } if (localPackagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Packages"));
                            
                            
                                    if (localPackages==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                    }
                                    elementList.add(localPackages);
                                } if (localHotelExtendedInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "HotelExtendedInformation"));
                            
                            
                                    if (localHotelExtendedInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelExtendedInformation);
                                } if (localDailyChargePointsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "DailyChargePoints"));
                            
                            
                                    if (localDailyChargePoints==null){
                                         throw new org.apache.axis2.databinding.ADBException("DailyChargePoints cannot be null!!");
                                    }
                                    elementList.add(localDailyChargePoints);
                                } if (localMemberAwardInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "MemberAwardInfo"));
                            
                            
                                    if (localMemberAwardInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("MemberAwardInfo cannot be null!!");
                                    }
                                    elementList.add(localMemberAwardInfo);
                                } if (localExpectedChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ExpectedCharges"));
                            
                            
                                    if (localExpectedCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExpectedCharges cannot be null!!");
                                    }
                                    elementList.add(localExpectedCharges);
                                } if (localGdsTotalPricingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GdsTotalPricing"));
                            
                            
                                    if (localGdsTotalPricing==null){
                                         throw new org.apache.axis2.databinding.ADBException("GdsTotalPricing cannot be null!!");
                                    }
                                    elementList.add(localGdsTotalPricing);
                                } if (localTracesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Traces"));
                            
                            
                                    if (localTraces==null){
                                         throw new org.apache.axis2.databinding.ADBException("Traces cannot be null!!");
                                    }
                                    elementList.add(localTraces);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","isAlternate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsAlternate));
                                

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
        public static RoomStay parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomStay object =
                new RoomStay();

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
                    
                            if (!"RoomStay".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomStay)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "isAlternate"
                    java.lang.String tempAttribIsAlternate =
                        
                                reader.getAttributeValue(null,"isAlternate");
                            
                   if (tempAttribIsAlternate!=null){
                         java.lang.String content = tempAttribIsAlternate;
                        
                                                 object.setIsAlternate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsAlternate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("isAlternate");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlans").equals(reader.getName())){
                                
                                                object.setRatePlans(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRatePlan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypes").equals(reader.getName())){
                                
                                                object.setRoomTypes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomRates").equals(reader.getName())){
                                
                                                object.setRoomRates(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuestCounts").equals(reader.getName())){
                                
                                                object.setGuestCounts(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TimeSpan").equals(reader.getName())){
                                
                                                object.setTimeSpan(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Guarantee").equals(reader.getName())){
                                
                                                object.setGuarantee(com.cloudkey.pms.micros.og.hotelcommon.Guarantee.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Payment").equals(reader.getName())){
                                
                                                object.setPayment(com.cloudkey.pms.micros.og.hotelcommon.Payment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CreditCardDeposit").equals(reader.getName())){
                                
                                                object.setCreditCardDeposit(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCreditCardPayment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelPenalties").equals(reader.getName())){
                                
                                                object.setCancelPenalties(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfCancelPenalty.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelTerm").equals(reader.getName())){
                                
                                                object.setCancelTerm(com.cloudkey.pms.micros.og.hotelcommon.CancelTerm.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelContact").equals(reader.getName())){
                                
                                                object.setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Total").equals(reader.getName())){
                                
                                                object.setTotal(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CurrentBalance").equals(reader.getName())){
                                
                                                object.setCurrentBalance(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ResGuestRPHs").equals(reader.getName())){
                                
                                                object.setResGuestRPHs(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfResGuestRPH.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Comments").equals(reader.getName())){
                                
                                                object.setComments(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationComment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","SpecialRequests").equals(reader.getName())){
                                
                                                object.setSpecialRequests(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfSpecialRequest.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages").equals(reader.getName())){
                                
                                                object.setPackages(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelExtendedInformation").equals(reader.getName())){
                                
                                                object.setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DailyChargePoints").equals(reader.getName())){
                                
                                                object.setDailyChargePoints(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfTimeSpanPoints.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MemberAwardInfo").equals(reader.getName())){
                                
                                                object.setMemberAwardInfo(com.cloudkey.pms.micros.og.hotelcommon.MemberAwardInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ExpectedCharges").equals(reader.getName())){
                                
                                                object.setExpectedCharges(com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsTotalPricing").equals(reader.getName())){
                                
                                                object.setGdsTotalPricing(com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Traces").equals(reader.getName())){
                                
                                                object.setTraces(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfReservationTrace.Factory.parse(reader));
                                              
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
           
    