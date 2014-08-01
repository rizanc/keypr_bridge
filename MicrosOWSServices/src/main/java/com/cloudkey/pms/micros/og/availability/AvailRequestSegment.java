
/**
 * AvailRequestSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.availability;
            

            /**
            *  AvailRequestSegment bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AvailRequestSegment
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AvailRequestSegment
                Namespace URI = http://webservices.micros.com/og/4.3/Availability/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for StayDateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localStayDateRange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStayDateRangeTracker = false ;

                           public boolean isStayDateRangeSpecified(){
                               return localStayDateRangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getStayDateRange(){
                               return localStayDateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayDateRange
                               */
                               public void setStayDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localStayDateRangeTracker = param != null;
                                   
                                            this.localStayDateRange=param;
                                    

                               }
                            

                        /**
                        * field for RateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate localRateRange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateRangeTracker = false ;

                           public boolean isRateRangeSpecified(){
                               return localRateRangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate getRateRange(){
                               return localRateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateRange
                               */
                               public void setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate param){
                            localRateRangeTracker = param != null;
                                   
                                            this.localRateRange=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanCandidates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.RatePlanCandidateList localRatePlanCandidates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanCandidatesTracker = false ;

                           public boolean isRatePlanCandidatesSpecified(){
                               return localRatePlanCandidatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.RatePlanCandidateList
                           */
                           public  com.cloudkey.pms.micros.og.availability.RatePlanCandidateList getRatePlanCandidates(){
                               return localRatePlanCandidates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanCandidates
                               */
                               public void setRatePlanCandidates(com.cloudkey.pms.micros.og.availability.RatePlanCandidateList param){
                            localRatePlanCandidatesTracker = param != null;
                                   
                                            this.localRatePlanCandidates=param;
                                    

                               }
                            

                        /**
                        * field for RoomStayCandidates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.RoomStayCandidateList localRoomStayCandidates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomStayCandidatesTracker = false ;

                           public boolean isRoomStayCandidatesSpecified(){
                               return localRoomStayCandidatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.RoomStayCandidateList
                           */
                           public  com.cloudkey.pms.micros.og.availability.RoomStayCandidateList getRoomStayCandidates(){
                               return localRoomStayCandidates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStayCandidates
                               */
                               public void setRoomStayCandidates(com.cloudkey.pms.micros.og.availability.RoomStayCandidateList param){
                            localRoomStayCandidatesTracker = param != null;
                                   
                                            this.localRoomStayCandidates=param;
                                    

                               }
                            

                        /**
                        * field for HotelSearchCriteria
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.HotelSearchCriteria localHotelSearchCriteria ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelSearchCriteriaTracker = false ;

                           public boolean isHotelSearchCriteriaSpecified(){
                               return localHotelSearchCriteriaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.HotelSearchCriteria
                           */
                           public  com.cloudkey.pms.micros.og.availability.HotelSearchCriteria getHotelSearchCriteria(){
                               return localHotelSearchCriteria;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelSearchCriteria
                               */
                               public void setHotelSearchCriteria(com.cloudkey.pms.micros.og.availability.HotelSearchCriteria param){
                            localHotelSearchCriteriaTracker = param != null;
                                   
                                            this.localHotelSearchCriteria=param;
                                    

                               }
                            

                        /**
                        * field for ChildAges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.ChildAgeList localChildAges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildAgesTracker = false ;

                           public boolean isChildAgesSpecified(){
                               return localChildAgesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.ChildAgeList
                           */
                           public  com.cloudkey.pms.micros.og.availability.ChildAgeList getChildAges(){
                               return localChildAges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildAges
                               */
                               public void setChildAges(com.cloudkey.pms.micros.og.availability.ChildAgeList param){
                            localChildAgesTracker = param != null;
                                   
                                            this.localChildAges=param;
                                    

                               }
                            

                        /**
                        * field for GdsTotalPrice
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.GdsTotalPriceList localGdsTotalPrice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGdsTotalPriceTracker = false ;

                           public boolean isGdsTotalPriceSpecified(){
                               return localGdsTotalPriceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.GdsTotalPriceList
                           */
                           public  com.cloudkey.pms.micros.og.availability.GdsTotalPriceList getGdsTotalPrice(){
                               return localGdsTotalPrice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GdsTotalPrice
                               */
                               public void setGdsTotalPrice(com.cloudkey.pms.micros.og.availability.GdsTotalPriceList param){
                            localGdsTotalPriceTracker = param != null;
                                   
                                            this.localGdsTotalPrice=param;
                                    

                               }
                            

                        /**
                        * field for AlternateDates
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.AlternateDateList[] localAlternateDates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlternateDatesTracker = false ;

                           public boolean isAlternateDatesSpecified(){
                               return localAlternateDatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.AlternateDateList[]
                           */
                           public  com.cloudkey.pms.micros.og.availability.AlternateDateList[] getAlternateDates(){
                               return localAlternateDates;
                           }

                           
                        


                               
                              /**
                               * validate the array for AlternateDates
                               */
                              protected void validateAlternateDates(com.cloudkey.pms.micros.og.availability.AlternateDateList[] param){
                             
                              if ((param != null) && (param.length > 5)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param AlternateDates
                              */
                              public void setAlternateDates(com.cloudkey.pms.micros.og.availability.AlternateDateList[] param){
                              
                                   validateAlternateDates(param);

                               localAlternateDatesTracker = param != null;
                                      
                                      this.localAlternateDates=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.availability.AlternateDateList
                             */
                             public void addAlternateDates(com.cloudkey.pms.micros.og.availability.AlternateDateList param){
                                   if (localAlternateDates == null){
                                   localAlternateDates = new com.cloudkey.pms.micros.og.availability.AlternateDateList[]{};
                                   }

                            
                                 //update the setting tracker
                                localAlternateDatesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAlternateDates);
                               list.add(param);
                               this.localAlternateDates =
                             (com.cloudkey.pms.micros.og.availability.AlternateDateList[])list.toArray(
                            new com.cloudkey.pms.micros.og.availability.AlternateDateList[list.size()]);

                             }
                             

                        /**
                        * field for PointsDateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localPointsDateRange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsDateRangeTracker = false ;

                           public boolean isPointsDateRangeSpecified(){
                               return localPointsDateRangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getPointsDateRange(){
                               return localPointsDateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsDateRange
                               */
                               public void setPointsDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localPointsDateRangeTracker = param != null;
                                   
                                            this.localPointsDateRange=param;
                                    

                               }
                            

                        /**
                        * field for ECertificate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.ECertificate localECertificate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localECertificateTracker = false ;

                           public boolean isECertificateSpecified(){
                               return localECertificateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.ECertificate
                           */
                           public  com.cloudkey.pms.micros.og.membership.ECertificate getECertificate(){
                               return localECertificate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ECertificate
                               */
                               public void setECertificate(com.cloudkey.pms.micros.og.membership.ECertificate param){
                            localECertificateTracker = param != null;
                                   
                                            this.localECertificate=param;
                                    

                               }
                            

                        /**
                        * field for ASBRateCycle
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ASBRateCycle localASBRateCycle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localASBRateCycleTracker = false ;

                           public boolean isASBRateCycleSpecified(){
                               return localASBRateCycleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ASBRateCycle
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ASBRateCycle getASBRateCycle(){
                               return localASBRateCycle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ASBRateCycle
                               */
                               public void setASBRateCycle(com.cloudkey.pms.micros.og.hotelcommon.ASBRateCycle param){
                            localASBRateCycleTracker = param != null;
                                   
                                            this.localASBRateCycle=param;
                                    

                               }
                            

                        /**
                        * field for NameID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localNameID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameIDTracker = false ;

                           public boolean isNameIDSpecified(){
                               return localNameIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getNameID(){
                               return localNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameID
                               */
                               public void setNameID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localNameIDTracker = param != null;
                                   
                                            this.localNameID=param;
                                    

                               }
                            

                        /**
                        * field for AvailReqType
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AvailRequestType localAvailReqType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AvailRequestType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AvailRequestType getAvailReqType(){
                               return localAvailReqType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailReqType
                               */
                               public void setAvailReqType(com.cloudkey.pms.micros.og.hotelcommon.AvailRequestType param){
                            
                                            this.localAvailReqType=param;
                                    

                               }
                            

                        /**
                        * field for MoreDataEchoToken
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMoreDataEchoToken ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMoreDataEchoToken(){
                               return localMoreDataEchoToken;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MoreDataEchoToken
                               */
                               public void setMoreDataEchoToken(java.lang.String param){
                            
                                            this.localMoreDataEchoToken=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfRooms
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfRooms ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfRooms(){
                               return localNumberOfRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfRooms
                               */
                               public void setNumberOfRooms(int param){
                            
                                            this.localNumberOfRooms=param;
                                    

                               }
                            

                        /**
                        * field for RoomOccupancy
                        * This was an Attribute!
                        */

                        
                                    protected int localRoomOccupancy ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRoomOccupancy(){
                               return localRoomOccupancy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomOccupancy
                               */
                               public void setRoomOccupancy(int param){
                            
                                            this.localRoomOccupancy=param;
                                    

                               }
                            

                        /**
                        * field for TotalNumberOfGuests
                        * This was an Attribute!
                        */

                        
                                    protected int localTotalNumberOfGuests ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalNumberOfGuests(){
                               return localTotalNumberOfGuests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalNumberOfGuests
                               */
                               public void setTotalNumberOfGuests(int param){
                            
                                            this.localTotalNumberOfGuests=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfAdults
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfAdults ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfAdults(){
                               return localNumberOfAdults;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfAdults
                               */
                               public void setNumberOfAdults(int param){
                            
                                            this.localNumberOfAdults=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfChildren
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfChildren ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfChildren(){
                               return localNumberOfChildren;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfChildren
                               */
                               public void setNumberOfChildren(int param){
                            
                                            this.localNumberOfChildren=param;
                                    

                               }
                            

                        /**
                        * field for ChildBucket1
                        * This was an Attribute!
                        */

                        
                                    protected int localChildBucket1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChildBucket1(){
                               return localChildBucket1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildBucket1
                               */
                               public void setChildBucket1(int param){
                            
                                            this.localChildBucket1=param;
                                    

                               }
                            

                        /**
                        * field for ChildBucket2
                        * This was an Attribute!
                        */

                        
                                    protected int localChildBucket2 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChildBucket2(){
                               return localChildBucket2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildBucket2
                               */
                               public void setChildBucket2(int param){
                            
                                            this.localChildBucket2=param;
                                    

                               }
                            

                        /**
                        * field for ChildBucket3
                        * This was an Attribute!
                        */

                        
                                    protected int localChildBucket3 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChildBucket3(){
                               return localChildBucket3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildBucket3
                               */
                               public void setChildBucket3(int param){
                            
                                            this.localChildBucket3=param;
                                    

                               }
                            

                        /**
                        * field for MembershipId
                        * This was an Attribute!
                        */

                        
                                    protected long localMembershipId ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMembershipId(){
                               return localMembershipId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipId
                               */
                               public void setMembershipId(long param){
                            
                                            this.localMembershipId=param;
                                    

                               }
                            

                        /**
                        * field for MembershipType
                        * This was an Attribute!
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
                        * field for MembershipLevel
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMembershipLevel ;
                                

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
                            
                                            this.localMembershipLevel=param;
                                    

                               }
                            

                        /**
                        * field for PointsBelow
                        * This was an Attribute!
                        */

                        
                                    protected long localPointsBelow ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getPointsBelow(){
                               return localPointsBelow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsBelow
                               */
                               public void setPointsBelow(long param){
                            
                                            this.localPointsBelow=param;
                                    

                               }
                            

                        /**
                        * field for PointsAbove
                        * This was an Attribute!
                        */

                        
                                    protected long localPointsAbove ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getPointsAbove(){
                               return localPointsAbove;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsAbove
                               */
                               public void setPointsAbove(long param){
                            
                                            this.localPointsAbove=param;
                                    

                               }
                            

                        /**
                        * field for CheckCateringPkgRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCheckCateringPkgRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCheckCateringPkgRate(){
                               return localCheckCateringPkgRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckCateringPkgRate
                               */
                               public void setCheckCateringPkgRate(boolean param){
                            
                                            this.localCheckCateringPkgRate=param;
                                    

                               }
                            

                        /**
                        * field for DisplaySet
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localDisplaySet ;
                                

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
                            
                                            this.localDisplaySet=param;
                                    

                               }
                            

                        /**
                        * field for ReturnPseudoRooom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnPseudoRooom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnPseudoRooom(){
                               return localReturnPseudoRooom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnPseudoRooom
                               */
                               public void setReturnPseudoRooom(boolean param){
                            
                                            this.localReturnPseudoRooom=param;
                                    

                               }
                            

                        /**
                        * field for ReturnOnlyReqRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnOnlyReqRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnOnlyReqRate(){
                               return localReturnOnlyReqRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnOnlyReqRate
                               */
                               public void setReturnOnlyReqRate(boolean param){
                            
                                            this.localReturnOnlyReqRate=param;
                                    

                               }
                            

                        /**
                        * field for MembershipNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMembershipNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipNumber(){
                               return localMembershipNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipNumber
                               */
                               public void setMembershipNumber(java.lang.String param){
                            
                                            this.localMembershipNumber=param;
                                    

                               }
                            

                        /**
                        * field for ReturnAmenities
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnAmenities ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnAmenities(){
                               return localReturnAmenities;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnAmenities
                               */
                               public void setReturnAmenities(boolean param){
                            
                                            this.localReturnAmenities=param;
                                    

                               }
                            

                        /**
                        * field for ReturnFeatures
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnFeatures ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnFeatures(){
                               return localReturnFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnFeatures
                               */
                               public void setReturnFeatures(boolean param){
                            
                                            this.localReturnFeatures=param;
                                    

                               }
                            

                        /**
                        * field for YieldMarketCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localYieldMarketCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getYieldMarketCode(){
                               return localYieldMarketCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param YieldMarketCode
                               */
                               public void setYieldMarketCode(java.lang.String param){
                            
                                            this.localYieldMarketCode=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Availability/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AvailRequestSegment",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AvailRequestSegment",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localAvailReqType != null){
                                        writeAttribute("",
                                           "availReqType",
                                           localAvailReqType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAvailReqType is null");
                                      }
                                    
                                            if (localMoreDataEchoToken != null){
                                        
                                                writeAttribute("",
                                                         "moreDataEchoToken",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMoreDataEchoToken), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfRooms!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfRooms",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms), xmlWriter);

                                            
                                      }
                                    
                                                   if (localRoomOccupancy!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "roomOccupancy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomOccupancy), xmlWriter);

                                            
                                      }
                                    
                                                   if (localTotalNumberOfGuests!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "totalNumberOfGuests",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalNumberOfGuests), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfAdults!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfAdults",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAdults), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfChildren!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfChildren",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfChildren), xmlWriter);

                                            
                                      }
                                    
                                                   if (localChildBucket1!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "childBucket1",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket1), xmlWriter);

                                            
                                      }
                                    
                                                   if (localChildBucket2!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "childBucket2",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket2), xmlWriter);

                                            
                                      }
                                    
                                                   if (localChildBucket3!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "childBucket3",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket3), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMembershipId!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "membershipId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipId), xmlWriter);

                                            
                                      }
                                    
                                            if (localMembershipType != null){
                                        
                                                writeAttribute("",
                                                         "membershipType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType), xmlWriter);

                                            
                                      }
                                    
                                            if (localMembershipLevel != null){
                                        
                                                writeAttribute("",
                                                         "membershipLevel",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipLevel), xmlWriter);

                                            
                                      }
                                    
                                                   if (localPointsBelow!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "pointsBelow",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsBelow), xmlWriter);

                                            
                                      }
                                    
                                                   if (localPointsAbove!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "pointsAbove",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsAbove), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "checkCateringPkgRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckCateringPkgRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localDisplaySet != null){
                                        
                                                writeAttribute("",
                                                         "displaySet",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplaySet), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "returnPseudoRooom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnPseudoRooom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "returnOnlyReqRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnOnlyReqRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localMembershipNumber != null){
                                        
                                                writeAttribute("",
                                                         "membershipNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "returnAmenities",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnAmenities), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "returnFeatures",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnFeatures), xmlWriter);

                                            
                                      }
                                    
                                            if (localYieldMarketCode != null){
                                        
                                                writeAttribute("",
                                                         "yieldMarketCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYieldMarketCode), xmlWriter);

                                            
                                      }
                                     if (localStayDateRangeTracker){
                                            if (localStayDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                            }
                                           localStayDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","StayDateRange"),
                                               xmlWriter);
                                        } if (localRateRangeTracker){
                                            if (localRateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                            }
                                           localRateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateRange"),
                                               xmlWriter);
                                        } if (localRatePlanCandidatesTracker){
                                            if (localRatePlanCandidates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlanCandidates cannot be null!!");
                                            }
                                           localRatePlanCandidates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RatePlanCandidates"),
                                               xmlWriter);
                                        } if (localRoomStayCandidatesTracker){
                                            if (localRoomStayCandidates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomStayCandidates cannot be null!!");
                                            }
                                           localRoomStayCandidates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomStayCandidates"),
                                               xmlWriter);
                                        } if (localHotelSearchCriteriaTracker){
                                            if (localHotelSearchCriteria==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelSearchCriteria cannot be null!!");
                                            }
                                           localHotelSearchCriteria.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelSearchCriteria"),
                                               xmlWriter);
                                        } if (localChildAgesTracker){
                                            if (localChildAges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ChildAges cannot be null!!");
                                            }
                                           localChildAges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ChildAges"),
                                               xmlWriter);
                                        } if (localGdsTotalPriceTracker){
                                            if (localGdsTotalPrice==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GdsTotalPrice cannot be null!!");
                                            }
                                           localGdsTotalPrice.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","GdsTotalPrice"),
                                               xmlWriter);
                                        } if (localAlternateDatesTracker){
                                       if (localAlternateDates!=null){
                                            for (int i = 0;i < localAlternateDates.length;i++){
                                                if (localAlternateDates[i] != null){
                                                 localAlternateDates[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","AlternateDates"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("AlternateDates cannot be null!!");
                                        
                                    }
                                 } if (localPointsDateRangeTracker){
                                            if (localPointsDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PointsDateRange cannot be null!!");
                                            }
                                           localPointsDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","PointsDateRange"),
                                               xmlWriter);
                                        } if (localECertificateTracker){
                                            if (localECertificate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                            }
                                           localECertificate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ECertificate"),
                                               xmlWriter);
                                        } if (localASBRateCycleTracker){
                                            if (localASBRateCycle==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ASBRateCycle cannot be null!!");
                                            }
                                           localASBRateCycle.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ASBRateCycle"),
                                               xmlWriter);
                                        } if (localNameIDTracker){
                                            if (localNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                            }
                                           localNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","NameID"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Availability/")){
                return "ns6";
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

                 if (localStayDateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "StayDateRange"));
                            
                            
                                    if (localStayDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                    }
                                    elementList.add(localStayDateRange);
                                } if (localRateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RateRange"));
                            
                            
                                    if (localRateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                    }
                                    elementList.add(localRateRange);
                                } if (localRatePlanCandidatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RatePlanCandidates"));
                            
                            
                                    if (localRatePlanCandidates==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlanCandidates cannot be null!!");
                                    }
                                    elementList.add(localRatePlanCandidates);
                                } if (localRoomStayCandidatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomStayCandidates"));
                            
                            
                                    if (localRoomStayCandidates==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomStayCandidates cannot be null!!");
                                    }
                                    elementList.add(localRoomStayCandidates);
                                } if (localHotelSearchCriteriaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "HotelSearchCriteria"));
                            
                            
                                    if (localHotelSearchCriteria==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelSearchCriteria cannot be null!!");
                                    }
                                    elementList.add(localHotelSearchCriteria);
                                } if (localChildAgesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "ChildAges"));
                            
                            
                                    if (localChildAges==null){
                                         throw new org.apache.axis2.databinding.ADBException("ChildAges cannot be null!!");
                                    }
                                    elementList.add(localChildAges);
                                } if (localGdsTotalPriceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "GdsTotalPrice"));
                            
                            
                                    if (localGdsTotalPrice==null){
                                         throw new org.apache.axis2.databinding.ADBException("GdsTotalPrice cannot be null!!");
                                    }
                                    elementList.add(localGdsTotalPrice);
                                } if (localAlternateDatesTracker){
                             if (localAlternateDates!=null) {
                                 for (int i = 0;i < localAlternateDates.length;i++){

                                    if (localAlternateDates[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                          "AlternateDates"));
                                         elementList.add(localAlternateDates[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("AlternateDates cannot be null!!");
                                    
                             }

                        } if (localPointsDateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "PointsDateRange"));
                            
                            
                                    if (localPointsDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("PointsDateRange cannot be null!!");
                                    }
                                    elementList.add(localPointsDateRange);
                                } if (localECertificateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "ECertificate"));
                            
                            
                                    if (localECertificate==null){
                                         throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                    }
                                    elementList.add(localECertificate);
                                } if (localASBRateCycleTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "ASBRateCycle"));
                            
                            
                                    if (localASBRateCycle==null){
                                         throw new org.apache.axis2.databinding.ADBException("ASBRateCycle cannot be null!!");
                                    }
                                    elementList.add(localASBRateCycle);
                                } if (localNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "NameID"));
                            
                            
                                    if (localNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                    }
                                    elementList.add(localNameID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","availReqType"));
                            
                                      attribList.add(localAvailReqType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","moreDataEchoToken"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMoreDataEchoToken));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfRooms"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomOccupancy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomOccupancy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","totalNumberOfGuests"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalNumberOfGuests));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfAdults"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAdults));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfChildren"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfChildren));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","childBucket1"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket1));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","childBucket2"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket2));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","childBucket3"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildBucket3));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","membershipId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","membershipType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","membershipLevel"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipLevel));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pointsBelow"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsBelow));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pointsAbove"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsAbove));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","checkCateringPkgRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckCateringPkgRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","displaySet"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplaySet));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","returnPseudoRooom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnPseudoRooom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","returnOnlyReqRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnOnlyReqRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","membershipNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","returnAmenities"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnAmenities));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","returnFeatures"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnFeatures));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","yieldMarketCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYieldMarketCode));
                                

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
        public static AvailRequestSegment parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AvailRequestSegment object =
                new AvailRequestSegment();

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
                    
                            if (!"AvailRequestSegment".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AvailRequestSegment)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "availReqType"
                    java.lang.String tempAttribAvailReqType =
                        
                                reader.getAttributeValue(null,"availReqType");
                            
                   if (tempAttribAvailReqType!=null){
                         java.lang.String content = tempAttribAvailReqType;
                        
                                                  object.setAvailReqType(
                                                        com.cloudkey.pms.micros.og.hotelcommon.AvailRequestType.Factory.fromString(reader,tempAttribAvailReqType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute availReqType is missing");
                           
                    }
                    handledAttributes.add("availReqType");
                    
                    // handle attribute "moreDataEchoToken"
                    java.lang.String tempAttribMoreDataEchoToken =
                        
                                reader.getAttributeValue(null,"moreDataEchoToken");
                            
                   if (tempAttribMoreDataEchoToken!=null){
                         java.lang.String content = tempAttribMoreDataEchoToken;
                        
                                                 object.setMoreDataEchoToken(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMoreDataEchoToken));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("moreDataEchoToken");
                    
                    // handle attribute "numberOfRooms"
                    java.lang.String tempAttribNumberOfRooms =
                        
                                reader.getAttributeValue(null,"numberOfRooms");
                            
                   if (tempAttribNumberOfRooms!=null){
                         java.lang.String content = tempAttribNumberOfRooms;
                        
                                                 object.setNumberOfRooms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfRooms));
                                            
                    } else {
                       
                                           object.setNumberOfRooms(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfRooms");
                    
                    // handle attribute "roomOccupancy"
                    java.lang.String tempAttribRoomOccupancy =
                        
                                reader.getAttributeValue(null,"roomOccupancy");
                            
                   if (tempAttribRoomOccupancy!=null){
                         java.lang.String content = tempAttribRoomOccupancy;
                        
                                                 object.setRoomOccupancy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribRoomOccupancy));
                                            
                    } else {
                       
                                           object.setRoomOccupancy(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("roomOccupancy");
                    
                    // handle attribute "totalNumberOfGuests"
                    java.lang.String tempAttribTotalNumberOfGuests =
                        
                                reader.getAttributeValue(null,"totalNumberOfGuests");
                            
                   if (tempAttribTotalNumberOfGuests!=null){
                         java.lang.String content = tempAttribTotalNumberOfGuests;
                        
                                                 object.setTotalNumberOfGuests(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribTotalNumberOfGuests));
                                            
                    } else {
                       
                                           object.setTotalNumberOfGuests(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("totalNumberOfGuests");
                    
                    // handle attribute "numberOfAdults"
                    java.lang.String tempAttribNumberOfAdults =
                        
                                reader.getAttributeValue(null,"numberOfAdults");
                            
                   if (tempAttribNumberOfAdults!=null){
                         java.lang.String content = tempAttribNumberOfAdults;
                        
                                                 object.setNumberOfAdults(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfAdults));
                                            
                    } else {
                       
                                           object.setNumberOfAdults(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfAdults");
                    
                    // handle attribute "numberOfChildren"
                    java.lang.String tempAttribNumberOfChildren =
                        
                                reader.getAttributeValue(null,"numberOfChildren");
                            
                   if (tempAttribNumberOfChildren!=null){
                         java.lang.String content = tempAttribNumberOfChildren;
                        
                                                 object.setNumberOfChildren(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfChildren));
                                            
                    } else {
                       
                                           object.setNumberOfChildren(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfChildren");
                    
                    // handle attribute "childBucket1"
                    java.lang.String tempAttribChildBucket1 =
                        
                                reader.getAttributeValue(null,"childBucket1");
                            
                   if (tempAttribChildBucket1!=null){
                         java.lang.String content = tempAttribChildBucket1;
                        
                                                 object.setChildBucket1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribChildBucket1));
                                            
                    } else {
                       
                                           object.setChildBucket1(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("childBucket1");
                    
                    // handle attribute "childBucket2"
                    java.lang.String tempAttribChildBucket2 =
                        
                                reader.getAttributeValue(null,"childBucket2");
                            
                   if (tempAttribChildBucket2!=null){
                         java.lang.String content = tempAttribChildBucket2;
                        
                                                 object.setChildBucket2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribChildBucket2));
                                            
                    } else {
                       
                                           object.setChildBucket2(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("childBucket2");
                    
                    // handle attribute "childBucket3"
                    java.lang.String tempAttribChildBucket3 =
                        
                                reader.getAttributeValue(null,"childBucket3");
                            
                   if (tempAttribChildBucket3!=null){
                         java.lang.String content = tempAttribChildBucket3;
                        
                                                 object.setChildBucket3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribChildBucket3));
                                            
                    } else {
                       
                                           object.setChildBucket3(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("childBucket3");
                    
                    // handle attribute "membershipId"
                    java.lang.String tempAttribMembershipId =
                        
                                reader.getAttributeValue(null,"membershipId");
                            
                   if (tempAttribMembershipId!=null){
                         java.lang.String content = tempAttribMembershipId;
                        
                                                 object.setMembershipId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribMembershipId));
                                            
                    } else {
                       
                                           object.setMembershipId(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("membershipId");
                    
                    // handle attribute "membershipType"
                    java.lang.String tempAttribMembershipType =
                        
                                reader.getAttributeValue(null,"membershipType");
                            
                   if (tempAttribMembershipType!=null){
                         java.lang.String content = tempAttribMembershipType;
                        
                                                 object.setMembershipType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMembershipType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("membershipType");
                    
                    // handle attribute "membershipLevel"
                    java.lang.String tempAttribMembershipLevel =
                        
                                reader.getAttributeValue(null,"membershipLevel");
                            
                   if (tempAttribMembershipLevel!=null){
                         java.lang.String content = tempAttribMembershipLevel;
                        
                                                 object.setMembershipLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMembershipLevel));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("membershipLevel");
                    
                    // handle attribute "pointsBelow"
                    java.lang.String tempAttribPointsBelow =
                        
                                reader.getAttributeValue(null,"pointsBelow");
                            
                   if (tempAttribPointsBelow!=null){
                         java.lang.String content = tempAttribPointsBelow;
                        
                                                 object.setPointsBelow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribPointsBelow));
                                            
                    } else {
                       
                                           object.setPointsBelow(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("pointsBelow");
                    
                    // handle attribute "pointsAbove"
                    java.lang.String tempAttribPointsAbove =
                        
                                reader.getAttributeValue(null,"pointsAbove");
                            
                   if (tempAttribPointsAbove!=null){
                         java.lang.String content = tempAttribPointsAbove;
                        
                                                 object.setPointsAbove(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribPointsAbove));
                                            
                    } else {
                       
                                           object.setPointsAbove(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("pointsAbove");
                    
                    // handle attribute "checkCateringPkgRate"
                    java.lang.String tempAttribCheckCateringPkgRate =
                        
                                reader.getAttributeValue(null,"checkCateringPkgRate");
                            
                   if (tempAttribCheckCateringPkgRate!=null){
                         java.lang.String content = tempAttribCheckCateringPkgRate;
                        
                                                 object.setCheckCateringPkgRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCheckCateringPkgRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("checkCateringPkgRate");
                    
                    // handle attribute "displaySet"
                    java.lang.String tempAttribDisplaySet =
                        
                                reader.getAttributeValue(null,"displaySet");
                            
                   if (tempAttribDisplaySet!=null){
                         java.lang.String content = tempAttribDisplaySet;
                        
                                                 object.setDisplaySet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribDisplaySet));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("displaySet");
                    
                    // handle attribute "returnPseudoRooom"
                    java.lang.String tempAttribReturnPseudoRooom =
                        
                                reader.getAttributeValue(null,"returnPseudoRooom");
                            
                   if (tempAttribReturnPseudoRooom!=null){
                         java.lang.String content = tempAttribReturnPseudoRooom;
                        
                                                 object.setReturnPseudoRooom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnPseudoRooom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("returnPseudoRooom");
                    
                    // handle attribute "returnOnlyReqRate"
                    java.lang.String tempAttribReturnOnlyReqRate =
                        
                                reader.getAttributeValue(null,"returnOnlyReqRate");
                            
                   if (tempAttribReturnOnlyReqRate!=null){
                         java.lang.String content = tempAttribReturnOnlyReqRate;
                        
                                                 object.setReturnOnlyReqRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnOnlyReqRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("returnOnlyReqRate");
                    
                    // handle attribute "membershipNumber"
                    java.lang.String tempAttribMembershipNumber =
                        
                                reader.getAttributeValue(null,"membershipNumber");
                            
                   if (tempAttribMembershipNumber!=null){
                         java.lang.String content = tempAttribMembershipNumber;
                        
                                                 object.setMembershipNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMembershipNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("membershipNumber");
                    
                    // handle attribute "returnAmenities"
                    java.lang.String tempAttribReturnAmenities =
                        
                                reader.getAttributeValue(null,"returnAmenities");
                            
                   if (tempAttribReturnAmenities!=null){
                         java.lang.String content = tempAttribReturnAmenities;
                        
                                                 object.setReturnAmenities(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnAmenities));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("returnAmenities");
                    
                    // handle attribute "returnFeatures"
                    java.lang.String tempAttribReturnFeatures =
                        
                                reader.getAttributeValue(null,"returnFeatures");
                            
                   if (tempAttribReturnFeatures!=null){
                         java.lang.String content = tempAttribReturnFeatures;
                        
                                                 object.setReturnFeatures(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnFeatures));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("returnFeatures");
                    
                    // handle attribute "yieldMarketCode"
                    java.lang.String tempAttribYieldMarketCode =
                        
                                reader.getAttributeValue(null,"yieldMarketCode");
                            
                   if (tempAttribYieldMarketCode!=null){
                         java.lang.String content = tempAttribYieldMarketCode;
                        
                                                 object.setYieldMarketCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribYieldMarketCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("yieldMarketCode");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","StayDateRange").equals(reader.getName())){
                                
                                                object.setStayDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateRange").equals(reader.getName())){
                                
                                                object.setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RatePlanCandidates").equals(reader.getName())){
                                
                                                object.setRatePlanCandidates(com.cloudkey.pms.micros.og.availability.RatePlanCandidateList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomStayCandidates").equals(reader.getName())){
                                
                                                object.setRoomStayCandidates(com.cloudkey.pms.micros.og.availability.RoomStayCandidateList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelSearchCriteria").equals(reader.getName())){
                                
                                                object.setHotelSearchCriteria(com.cloudkey.pms.micros.og.availability.HotelSearchCriteria.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ChildAges").equals(reader.getName())){
                                
                                                object.setChildAges(com.cloudkey.pms.micros.og.availability.ChildAgeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","GdsTotalPrice").equals(reader.getName())){
                                
                                                object.setGdsTotalPrice(com.cloudkey.pms.micros.og.availability.GdsTotalPriceList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","AlternateDates").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list8.add(com.cloudkey.pms.micros.og.availability.AlternateDateList.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","AlternateDates").equals(reader.getName())){
                                                                    list8.add(com.cloudkey.pms.micros.og.availability.AlternateDateList.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAlternateDates((com.cloudkey.pms.micros.og.availability.AlternateDateList[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.availability.AlternateDateList.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","PointsDateRange").equals(reader.getName())){
                                
                                                object.setPointsDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ECertificate").equals(reader.getName())){
                                
                                                object.setECertificate(com.cloudkey.pms.micros.og.membership.ECertificate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ASBRateCycle").equals(reader.getName())){
                                
                                                object.setASBRateCycle(com.cloudkey.pms.micros.og.hotelcommon.ASBRateCycle.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","NameID").equals(reader.getName())){
                                
                                                object.setNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
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
           
    