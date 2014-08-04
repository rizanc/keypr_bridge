
/**
 * ECertificate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  ECertificate bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ECertificate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ECertificate
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for CertificateID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localCertificateID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateIDTracker = false ;

                           public boolean isCertificateIDSpecified(){
                               return localCertificateIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getCertificateID(){
                               return localCertificateID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateID
                               */
                               public void setCertificateID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localCertificateIDTracker = param != null;
                                   
                                            this.localCertificateID=param;
                                    

                               }
                            

                        /**
                        * field for VoucherNumber
                        */

                        
                                    protected java.lang.String localVoucherNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVoucherNumberTracker = false ;

                           public boolean isVoucherNumberSpecified(){
                               return localVoucherNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVoucherNumber(){
                               return localVoucherNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VoucherNumber
                               */
                               public void setVoucherNumber(java.lang.String param){
                            localVoucherNumberTracker = param != null;
                                   
                                            this.localVoucherNumber=param;
                                    

                               }
                            

                        /**
                        * field for CertificateNumber
                        */

                        
                                    protected java.lang.String localCertificateNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateNumberTracker = false ;

                           public boolean isCertificateNumberSpecified(){
                               return localCertificateNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertificateNumber(){
                               return localCertificateNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateNumber
                               */
                               public void setCertificateNumber(java.lang.String param){
                            localCertificateNumberTracker = param != null;
                                   
                                            this.localCertificateNumber=param;
                                    

                               }
                            

                        /**
                        * field for CertificateCode
                        */

                        
                                    protected java.lang.String localCertificateCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateCodeTracker = false ;

                           public boolean isCertificateCodeSpecified(){
                               return localCertificateCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertificateCode(){
                               return localCertificateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateCode
                               */
                               public void setCertificateCode(java.lang.String param){
                            localCertificateCodeTracker = param != null;
                                   
                                            this.localCertificateCode=param;
                                    

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
                        * field for MembershipType
                        */

                        
                                    protected java.lang.String localMembershipType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipTypeTracker = false ;

                           public boolean isMembershipTypeSpecified(){
                               return localMembershipTypeTracker;
                           }

                           

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
                            localMembershipTypeTracker = param != null;
                                   
                                            this.localMembershipType=param;
                                    

                               }
                            

                        /**
                        * field for AwardType
                        */

                        
                                    protected java.lang.String localAwardType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardTypeTracker = false ;

                           public boolean isAwardTypeSpecified(){
                               return localAwardTypeTracker;
                           }

                           

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
                            localAwardTypeTracker = param != null;
                                   
                                            this.localAwardType=param;
                                    

                               }
                            

                        /**
                        * field for PromotionCode
                        */

                        
                                    protected java.lang.String localPromotionCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPromotionCodeTracker = false ;

                           public boolean isPromotionCodeSpecified(){
                               return localPromotionCodeTracker;
                           }

                           

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
                            localPromotionCodeTracker = param != null;
                                   
                                            this.localPromotionCode=param;
                                    

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
                        * field for LongDescription
                        */

                        
                                    protected java.lang.String localLongDescription ;
                                
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
                           * @return java.lang.String
                           */
                           public  java.lang.String getLongDescription(){
                               return localLongDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LongDescription
                               */
                               public void setLongDescription(java.lang.String param){
                            localLongDescriptionTracker = param != null;
                                   
                                            this.localLongDescription=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
                        */

                        
                                    protected java.util.Date localExpirationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpirationDateTracker = false ;

                           public boolean isExpirationDateSpecified(){
                               return localExpirationDateTracker;
                           }

                           

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
                            localExpirationDateTracker = param != null;
                                   
                                            this.localExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for ReservationCertificateYN
                        */

                        
                                    protected java.lang.String localReservationCertificateYN ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationCertificateYNTracker = false ;

                           public boolean isReservationCertificateYNSpecified(){
                               return localReservationCertificateYNTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReservationCertificateYN(){
                               return localReservationCertificateYN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationCertificateYN
                               */
                               public void setReservationCertificateYN(java.lang.String param){
                            localReservationCertificateYNTracker = param != null;
                                   
                                            this.localReservationCertificateYN=param;
                                    

                               }
                            

                        /**
                        * field for CertificateValue
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localCertificateValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateValueTracker = false ;

                           public boolean isCertificateValueSpecified(){
                               return localCertificateValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getCertificateValue(){
                               return localCertificateValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateValue
                               */
                               public void setCertificateValue(com.cloudkey.pms.micros.og.common.Amount param){
                            localCertificateValueTracker = param != null;
                                   
                                            this.localCertificateValue=param;
                                    

                               }
                            

                        /**
                        * field for CertificateCost
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localCertificateCost ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateCostTracker = false ;

                           public boolean isCertificateCostSpecified(){
                               return localCertificateCostTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getCertificateCost(){
                               return localCertificateCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateCost
                               */
                               public void setCertificateCost(com.cloudkey.pms.micros.og.common.Amount param){
                            localCertificateCostTracker = param != null;
                                   
                                            this.localCertificateCost=param;
                                    

                               }
                            

                        /**
                        * field for CertificateLabel
                        */

                        
                                    protected java.lang.String localCertificateLabel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateLabelTracker = false ;

                           public boolean isCertificateLabelSpecified(){
                               return localCertificateLabelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertificateLabel(){
                               return localCertificateLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateLabel
                               */
                               public void setCertificateLabel(java.lang.String param){
                            localCertificateLabelTracker = param != null;
                                   
                                            this.localCertificateLabel=param;
                                    

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
                        * field for ConsumedAt
                        */

                        
                                    protected java.lang.String localConsumedAt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumedAtTracker = false ;

                           public boolean isConsumedAtSpecified(){
                               return localConsumedAtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumedAt(){
                               return localConsumedAt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumedAt
                               */
                               public void setConsumedAt(java.lang.String param){
                            localConsumedAtTracker = param != null;
                                   
                                            this.localConsumedAt=param;
                                    

                               }
                            

                        /**
                        * field for ConsumerLastName
                        */

                        
                                    protected java.lang.String localConsumerLastName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumerLastNameTracker = false ;

                           public boolean isConsumerLastNameSpecified(){
                               return localConsumerLastNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumerLastName(){
                               return localConsumerLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumerLastName
                               */
                               public void setConsumerLastName(java.lang.String param){
                            localConsumerLastNameTracker = param != null;
                                   
                                            this.localConsumerLastName=param;
                                    

                               }
                            

                        /**
                        * field for ConsumerFirstName
                        */

                        
                                    protected java.lang.String localConsumerFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumerFirstNameTracker = false ;

                           public boolean isConsumerFirstNameSpecified(){
                               return localConsumerFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumerFirstName(){
                               return localConsumerFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumerFirstName
                               */
                               public void setConsumerFirstName(java.lang.String param){
                            localConsumerFirstNameTracker = param != null;
                                   
                                            this.localConsumerFirstName=param;
                                    

                               }
                            

                        /**
                        * field for ConsumerMiddleName
                        */

                        
                                    protected java.lang.String localConsumerMiddleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumerMiddleNameTracker = false ;

                           public boolean isConsumerMiddleNameSpecified(){
                               return localConsumerMiddleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumerMiddleName(){
                               return localConsumerMiddleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumerMiddleName
                               */
                               public void setConsumerMiddleName(java.lang.String param){
                            localConsumerMiddleNameTracker = param != null;
                                   
                                            this.localConsumerMiddleName=param;
                                    

                               }
                            

                        /**
                        * field for ConsumerEmail
                        */

                        
                                    protected java.lang.String localConsumerEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumerEmailTracker = false ;

                           public boolean isConsumerEmailSpecified(){
                               return localConsumerEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumerEmail(){
                               return localConsumerEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumerEmail
                               */
                               public void setConsumerEmail(java.lang.String param){
                            localConsumerEmailTracker = param != null;
                                   
                                            this.localConsumerEmail=param;
                                    

                               }
                            

                        /**
                        * field for ConsumptionDate
                        */

                        
                                    protected java.util.Date localConsumptionDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumptionDateTracker = false ;

                           public boolean isConsumptionDateSpecified(){
                               return localConsumptionDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getConsumptionDate(){
                               return localConsumptionDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumptionDate
                               */
                               public void setConsumptionDate(java.util.Date param){
                            localConsumptionDateTracker = param != null;
                                   
                                            this.localConsumptionDate=param;
                                    

                               }
                            

                        /**
                        * field for ConsumedHotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localConsumedHotelReference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumedHotelReferenceTracker = false ;

                           public boolean isConsumedHotelReferenceSpecified(){
                               return localConsumedHotelReferenceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReference getConsumedHotelReference(){
                               return localConsumedHotelReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumedHotelReference
                               */
                               public void setConsumedHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference param){
                            localConsumedHotelReferenceTracker = param != null;
                                   
                                            this.localConsumedHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for ConsumptionRefNo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localConsumptionRefNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumptionRefNoTracker = false ;

                           public boolean isConsumptionRefNoSpecified(){
                               return localConsumptionRefNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getConsumptionRefNo(){
                               return localConsumptionRefNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumptionRefNo
                               */
                               public void setConsumptionRefNo(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localConsumptionRefNoTracker = param != null;
                                   
                                            this.localConsumptionRefNo=param;
                                    

                               }
                            

                        /**
                        * field for ConsumptionRefType
                        */

                        
                                    protected java.lang.String localConsumptionRefType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumptionRefTypeTracker = false ;

                           public boolean isConsumptionRefTypeSpecified(){
                               return localConsumptionRefTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConsumptionRefType(){
                               return localConsumptionRefType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumptionRefType
                               */
                               public void setConsumptionRefType(java.lang.String param){
                            localConsumptionRefTypeTracker = param != null;
                                   
                                            this.localConsumptionRefType=param;
                                    

                               }
                            

                        /**
                        * field for ConsumptionLegNo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localConsumptionLegNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsumptionLegNoTracker = false ;

                           public boolean isConsumptionLegNoSpecified(){
                               return localConsumptionLegNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getConsumptionLegNo(){
                               return localConsumptionLegNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsumptionLegNo
                               */
                               public void setConsumptionLegNo(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localConsumptionLegNoTracker = param != null;
                                   
                                            this.localConsumptionLegNo=param;
                                    

                               }
                            

                        /**
                        * field for UserNotes
                        */

                        
                                    protected java.lang.String localUserNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNotesTracker = false ;

                           public boolean isUserNotesSpecified(){
                               return localUserNotesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserNotes(){
                               return localUserNotes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserNotes
                               */
                               public void setUserNotes(java.lang.String param){
                            localUserNotesTracker = param != null;
                                   
                                            this.localUserNotes=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected java.lang.String localStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusTracker = false ;

                           public boolean isStatusSpecified(){
                               return localStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(java.lang.String param){
                            localStatusTracker = param != null;
                                   
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for PrintStatus
                        */

                        
                                    protected java.lang.String localPrintStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrintStatusTracker = false ;

                           public boolean isPrintStatusSpecified(){
                               return localPrintStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrintStatus(){
                               return localPrintStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrintStatus
                               */
                               public void setPrintStatus(java.lang.String param){
                            localPrintStatusTracker = param != null;
                                   
                                            this.localPrintStatus=param;
                                    

                               }
                            

                        /**
                        * field for MembershipAwardID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localMembershipAwardID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipAwardIDTracker = false ;

                           public boolean isMembershipAwardIDSpecified(){
                               return localMembershipAwardIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getMembershipAwardID(){
                               return localMembershipAwardID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipAwardID
                               */
                               public void setMembershipAwardID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localMembershipAwardIDTracker = param != null;
                                   
                                            this.localMembershipAwardID=param;
                                    

                               }
                            

                        /**
                        * field for IssueType
                        */

                        
                                    protected java.lang.String localIssueType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssueTypeTracker = false ;

                           public boolean isIssueTypeSpecified(){
                               return localIssueTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssueType(){
                               return localIssueType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueType
                               */
                               public void setIssueType(java.lang.String param){
                            localIssueTypeTracker = param != null;
                                   
                                            this.localIssueType=param;
                                    

                               }
                            

                        /**
                        * field for IssueSource
                        */

                        
                                    protected java.lang.String localIssueSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssueSourceTracker = false ;

                           public boolean isIssueSourceSpecified(){
                               return localIssueSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssueSource(){
                               return localIssueSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueSource
                               */
                               public void setIssueSource(java.lang.String param){
                            localIssueSourceTracker = param != null;
                                   
                                            this.localIssueSource=param;
                                    

                               }
                            

                        /**
                        * field for AwardPoints
                        */

                        
                                    protected double localAwardPoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardPointsTracker = false ;

                           public boolean isAwardPointsSpecified(){
                               return localAwardPointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAwardPoints(){
                               return localAwardPoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardPoints
                               */
                               public void setAwardPoints(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localAwardPointsTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localAwardPoints=param;
                                    

                               }
                            

                        /**
                        * field for InActiveDate
                        */

                        
                                    protected java.util.Date localInActiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInActiveDateTracker = false ;

                           public boolean isInActiveDateSpecified(){
                               return localInActiveDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getInActiveDate(){
                               return localInActiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InActiveDate
                               */
                               public void setInActiveDate(java.util.Date param){
                            localInActiveDateTracker = param != null;
                                   
                                            this.localInActiveDate=param;
                                    

                               }
                            

                        /**
                        * field for CertificateBeginDate
                        */

                        
                                    protected java.util.Date localCertificateBeginDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateBeginDateTracker = false ;

                           public boolean isCertificateBeginDateSpecified(){
                               return localCertificateBeginDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getCertificateBeginDate(){
                               return localCertificateBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateBeginDate
                               */
                               public void setCertificateBeginDate(java.util.Date param){
                            localCertificateBeginDateTracker = param != null;
                                   
                                            this.localCertificateBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for CertificateEndDate
                        */

                        
                                    protected java.util.Date localCertificateEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateEndDateTracker = false ;

                           public boolean isCertificateEndDateSpecified(){
                               return localCertificateEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getCertificateEndDate(){
                               return localCertificateEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateEndDate
                               */
                               public void setCertificateEndDate(java.util.Date param){
                            localCertificateEndDateTracker = param != null;
                                   
                                            this.localCertificateEndDate=param;
                                    

                               }
                            

                        /**
                        * field for CertificateExpriyMonths
                        */

                        
                                    protected int localCertificateExpriyMonths ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateExpriyMonthsTracker = false ;

                           public boolean isCertificateExpriyMonthsSpecified(){
                               return localCertificateExpriyMonthsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCertificateExpriyMonths(){
                               return localCertificateExpriyMonths;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateExpriyMonths
                               */
                               public void setCertificateExpriyMonths(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCertificateExpriyMonthsTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCertificateExpriyMonths=param;
                                    

                               }
                            

                        /**
                        * field for WebAllowed
                        */

                        
                                    protected java.lang.String localWebAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebAllowedTracker = false ;

                           public boolean isWebAllowedSpecified(){
                               return localWebAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWebAllowed(){
                               return localWebAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WebAllowed
                               */
                               public void setWebAllowed(java.lang.String param){
                            localWebAllowedTracker = param != null;
                                   
                                            this.localWebAllowed=param;
                                    

                               }
                            

                        /**
                        * field for PMSConsumed
                        */

                        
                                    protected java.lang.String localPMSConsumed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPMSConsumedTracker = false ;

                           public boolean isPMSConsumedSpecified(){
                               return localPMSConsumedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPMSConsumed(){
                               return localPMSConsumed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PMSConsumed
                               */
                               public void setPMSConsumed(java.lang.String param){
                            localPMSConsumedTracker = param != null;
                                   
                                            this.localPMSConsumed=param;
                                    

                               }
                            

                        /**
                        * field for WebConsumed
                        */

                        
                                    protected java.lang.String localWebConsumed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebConsumedTracker = false ;

                           public boolean isWebConsumedSpecified(){
                               return localWebConsumedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWebConsumed(){
                               return localWebConsumed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WebConsumed
                               */
                               public void setWebConsumed(java.lang.String param){
                            localWebConsumedTracker = param != null;
                                   
                                            this.localWebConsumed=param;
                                    

                               }
                            

                        /**
                        * field for Awards
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.Award localAwards ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardsTracker = false ;

                           public boolean isAwardsSpecified(){
                               return localAwardsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.Award
                           */
                           public  com.cloudkey.pms.micros.og.membership.Award getAwards(){
                               return localAwards;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Awards
                               */
                               public void setAwards(com.cloudkey.pms.micros.og.membership.Award param){
                            localAwardsTracker = param != null;
                                   
                                            this.localAwards=param;
                                    

                               }
                            

                        /**
                        * field for Promotions
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.PromotionDetails[] localPromotions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPromotionsTracker = false ;

                           public boolean isPromotionsSpecified(){
                               return localPromotionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.PromotionDetails[]
                           */
                           public  com.cloudkey.pms.micros.og.membership.PromotionDetails[] getPromotions(){
                               return localPromotions;
                           }

                           
                        


                               
                              /**
                               * validate the array for Promotions
                               */
                              protected void validatePromotions(com.cloudkey.pms.micros.og.membership.PromotionDetails[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Promotions
                              */
                              public void setPromotions(com.cloudkey.pms.micros.og.membership.PromotionDetails[] param){
                              
                                   validatePromotions(param);

                               localPromotionsTracker = param != null;
                                      
                                      this.localPromotions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.membership.PromotionDetails
                             */
                             public void addPromotions(com.cloudkey.pms.micros.og.membership.PromotionDetails param){
                                   if (localPromotions == null){
                                   localPromotions = new com.cloudkey.pms.micros.og.membership.PromotionDetails[]{};
                                   }

                            
                                 //update the setting tracker
                                localPromotionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPromotions);
                               list.add(param);
                               this.localPromotions =
                             (com.cloudkey.pms.micros.og.membership.PromotionDetails[])list.toArray(
                            new com.cloudkey.pms.micros.og.membership.PromotionDetails[list.size()]);

                             }
                             

                        /**
                        * field for Scope
                        */

                        
                                    protected java.lang.String localScope ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localScopeTracker = false ;

                           public boolean isScopeSpecified(){
                               return localScopeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getScope(){
                               return localScope;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Scope
                               */
                               public void setScope(java.lang.String param){
                            localScopeTracker = param != null;
                                   
                                            this.localScope=param;
                                    

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
                           namespacePrefix+":ECertificate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ECertificate",
                           xmlWriter);
                   }

               
                   }
                if (localCertificateIDTracker){
                                            if (localCertificateID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CertificateID cannot be null!!");
                                            }
                                           localCertificateID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateID"),
                                               xmlWriter);
                                        } if (localVoucherNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "VoucherNumber", xmlWriter);
                             

                                          if (localVoucherNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("VoucherNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localVoucherNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateNumber", xmlWriter);
                             

                                          if (localCertificateNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertificateNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateCode", xmlWriter);
                             

                                          if (localCertificateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertificateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelReference"),
                                               xmlWriter);
                                        } if (localMembershipTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "MembershipType", xmlWriter);
                             

                                          if (localMembershipType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAwardTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "AwardType", xmlWriter);
                             

                                          if (localAwardType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPromotionCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "PromotionCode", xmlWriter);
                             

                                          if (localPromotionCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PromotionCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPromotionCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                             } if (localLongDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "LongDescription", xmlWriter);
                             

                                          if (localLongDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLongDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExpirationDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ExpirationDate", xmlWriter);
                             

                                          if (localExpirationDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ExpirationDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReservationCertificateYNTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ReservationCertificateYN", xmlWriter);
                             

                                          if (localReservationCertificateYN==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReservationCertificateYN cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReservationCertificateYN);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateValueTracker){
                                            if (localCertificateValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CertificateValue cannot be null!!");
                                            }
                                           localCertificateValue.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateValue"),
                                               xmlWriter);
                                        } if (localCertificateCostTracker){
                                            if (localCertificateCost==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CertificateCost cannot be null!!");
                                            }
                                           localCertificateCost.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateCost"),
                                               xmlWriter);
                                        } if (localCertificateLabelTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateLabel", xmlWriter);
                             

                                          if (localCertificateLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateLabel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertificateLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIDTracker){
                                            if (localNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                            }
                                           localNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","NameID"),
                                               xmlWriter);
                                        } if (localConsumedAtTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumedAt", xmlWriter);
                             

                                          if (localConsumedAt==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumedAt cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumedAt);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumerLastNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumerLastName", xmlWriter);
                             

                                          if (localConsumerLastName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumerLastName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumerLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumerFirstNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumerFirstName", xmlWriter);
                             

                                          if (localConsumerFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumerFirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumerFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumerMiddleNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumerMiddleName", xmlWriter);
                             

                                          if (localConsumerMiddleName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumerMiddleName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumerMiddleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumerEmailTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumerEmail", xmlWriter);
                             

                                          if (localConsumerEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumerEmail cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumerEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumptionDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumptionDate", xmlWriter);
                             

                                          if (localConsumptionDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumptionDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumptionDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumedHotelReferenceTracker){
                                            if (localConsumedHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConsumedHotelReference cannot be null!!");
                                            }
                                           localConsumedHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumedHotelReference"),
                                               xmlWriter);
                                        } if (localConsumptionRefNoTracker){
                                            if (localConsumptionRefNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConsumptionRefNo cannot be null!!");
                                            }
                                           localConsumptionRefNo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionRefNo"),
                                               xmlWriter);
                                        } if (localConsumptionRefTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ConsumptionRefType", xmlWriter);
                             

                                          if (localConsumptionRefType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ConsumptionRefType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConsumptionRefType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConsumptionLegNoTracker){
                                            if (localConsumptionLegNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConsumptionLegNo cannot be null!!");
                                            }
                                           localConsumptionLegNo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionLegNo"),
                                               xmlWriter);
                                        } if (localUserNotesTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "UserNotes", xmlWriter);
                             

                                          if (localUserNotes==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UserNotes cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserNotes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "Status", xmlWriter);
                             

                                          if (localStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrintStatusTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "PrintStatus", xmlWriter);
                             

                                          if (localPrintStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PrintStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrintStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipAwardIDTracker){
                                            if (localMembershipAwardID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MembershipAwardID cannot be null!!");
                                            }
                                           localMembershipAwardID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipAwardID"),
                                               xmlWriter);
                                        } if (localIssueTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "IssueType", xmlWriter);
                             

                                          if (localIssueType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssueType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssueType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssueSourceTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "IssueSource", xmlWriter);
                             

                                          if (localIssueSource==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssueSource cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssueSource);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAwardPointsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "AwardPoints", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localAwardPoints)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AwardPoints cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPoints));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInActiveDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "InActiveDate", xmlWriter);
                             

                                          if (localInActiveDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("InActiveDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInActiveDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateBeginDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateBeginDate", xmlWriter);
                             

                                          if (localCertificateBeginDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateBeginDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateBeginDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateEndDate", xmlWriter);
                             

                                          if (localCertificateEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateEndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateExpriyMonthsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CertificateExpriyMonths", xmlWriter);
                             
                                               if (localCertificateExpriyMonths==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CertificateExpriyMonths cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateExpriyMonths));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWebAllowedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "WebAllowed", xmlWriter);
                             

                                          if (localWebAllowed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WebAllowed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWebAllowed);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPMSConsumedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "PMSConsumed", xmlWriter);
                             

                                          if (localPMSConsumed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PMSConsumed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPMSConsumed);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWebConsumedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "WebConsumed", xmlWriter);
                             

                                          if (localWebConsumed==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WebConsumed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWebConsumed);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAwardsTracker){
                                            if (localAwards==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Awards cannot be null!!");
                                            }
                                           localAwards.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Awards"),
                                               xmlWriter);
                                        } if (localPromotionsTracker){
                                       if (localPromotions!=null){
                                            for (int i = 0;i < localPromotions.length;i++){
                                                if (localPromotions[i] != null){
                                                 localPromotions[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Promotions"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Promotions cannot be null!!");
                                        
                                    }
                                 } if (localScopeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "Scope", xmlWriter);
                             

                                          if (localScope==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Scope cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localScope);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
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

                 if (localCertificateIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateID"));
                            
                            
                                    if (localCertificateID==null){
                                         throw new org.apache.axis2.databinding.ADBException("CertificateID cannot be null!!");
                                    }
                                    elementList.add(localCertificateID);
                                } if (localVoucherNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "VoucherNumber"));
                                 
                                        if (localVoucherNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVoucherNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("VoucherNumber cannot be null!!");
                                        }
                                    } if (localCertificateNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateNumber"));
                                 
                                        if (localCertificateNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateNumber cannot be null!!");
                                        }
                                    } if (localCertificateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateCode"));
                                 
                                        if (localCertificateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateCode cannot be null!!");
                                        }
                                    } if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                } if (localMembershipTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "MembershipType"));
                                 
                                        if (localMembershipType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                        }
                                    } if (localAwardTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardType"));
                                 
                                        if (localAwardType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                        }
                                    } if (localPromotionCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PromotionCode"));
                                 
                                        if (localPromotionCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PromotionCode cannot be null!!");
                                        }
                                    } if (localShortDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ShortDescription"));
                                 
                                        if (localShortDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ShortDescription cannot be null!!");
                                        }
                                    } if (localLongDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "LongDescription"));
                                 
                                        if (localLongDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                        }
                                    } if (localExpirationDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ExpirationDate"));
                                 
                                        if (localExpirationDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ExpirationDate cannot be null!!");
                                        }
                                    } if (localReservationCertificateYNTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ReservationCertificateYN"));
                                 
                                        if (localReservationCertificateYN != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReservationCertificateYN));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReservationCertificateYN cannot be null!!");
                                        }
                                    } if (localCertificateValueTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateValue"));
                            
                            
                                    if (localCertificateValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("CertificateValue cannot be null!!");
                                    }
                                    elementList.add(localCertificateValue);
                                } if (localCertificateCostTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateCost"));
                            
                            
                                    if (localCertificateCost==null){
                                         throw new org.apache.axis2.databinding.ADBException("CertificateCost cannot be null!!");
                                    }
                                    elementList.add(localCertificateCost);
                                } if (localCertificateLabelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateLabel"));
                                 
                                        if (localCertificateLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateLabel cannot be null!!");
                                        }
                                    } if (localNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "NameID"));
                            
                            
                                    if (localNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                    }
                                    elementList.add(localNameID);
                                } if (localConsumedAtTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumedAt"));
                                 
                                        if (localConsumedAt != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumedAt));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumedAt cannot be null!!");
                                        }
                                    } if (localConsumerLastNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumerLastName"));
                                 
                                        if (localConsumerLastName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumerLastName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumerLastName cannot be null!!");
                                        }
                                    } if (localConsumerFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumerFirstName"));
                                 
                                        if (localConsumerFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumerFirstName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumerFirstName cannot be null!!");
                                        }
                                    } if (localConsumerMiddleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumerMiddleName"));
                                 
                                        if (localConsumerMiddleName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumerMiddleName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumerMiddleName cannot be null!!");
                                        }
                                    } if (localConsumerEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumerEmail"));
                                 
                                        if (localConsumerEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumerEmail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumerEmail cannot be null!!");
                                        }
                                    } if (localConsumptionDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumptionDate"));
                                 
                                        if (localConsumptionDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumptionDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumptionDate cannot be null!!");
                                        }
                                    } if (localConsumedHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumedHotelReference"));
                            
                            
                                    if (localConsumedHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConsumedHotelReference cannot be null!!");
                                    }
                                    elementList.add(localConsumedHotelReference);
                                } if (localConsumptionRefNoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumptionRefNo"));
                            
                            
                                    if (localConsumptionRefNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConsumptionRefNo cannot be null!!");
                                    }
                                    elementList.add(localConsumptionRefNo);
                                } if (localConsumptionRefTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumptionRefType"));
                                 
                                        if (localConsumptionRefType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumptionRefType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ConsumptionRefType cannot be null!!");
                                        }
                                    } if (localConsumptionLegNoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ConsumptionLegNo"));
                            
                            
                                    if (localConsumptionLegNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConsumptionLegNo cannot be null!!");
                                    }
                                    elementList.add(localConsumptionLegNo);
                                } if (localUserNotesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "UserNotes"));
                                 
                                        if (localUserNotes != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserNotes));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserNotes cannot be null!!");
                                        }
                                    } if (localStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Status"));
                                 
                                        if (localStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                        }
                                    } if (localPrintStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PrintStatus"));
                                 
                                        if (localPrintStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PrintStatus cannot be null!!");
                                        }
                                    } if (localMembershipAwardIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "MembershipAwardID"));
                            
                            
                                    if (localMembershipAwardID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MembershipAwardID cannot be null!!");
                                    }
                                    elementList.add(localMembershipAwardID);
                                } if (localIssueTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "IssueType"));
                                 
                                        if (localIssueType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssueType cannot be null!!");
                                        }
                                    } if (localIssueSourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "IssueSource"));
                                 
                                        if (localIssueSource != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueSource));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssueSource cannot be null!!");
                                        }
                                    } if (localAwardPointsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardPoints"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPoints));
                            } if (localInActiveDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "InActiveDate"));
                                 
                                        if (localInActiveDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInActiveDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("InActiveDate cannot be null!!");
                                        }
                                    } if (localCertificateBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateBeginDate"));
                                 
                                        if (localCertificateBeginDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateBeginDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateBeginDate cannot be null!!");
                                        }
                                    } if (localCertificateEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateEndDate"));
                                 
                                        if (localCertificateEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateEndDate cannot be null!!");
                                        }
                                    } if (localCertificateExpriyMonthsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CertificateExpriyMonths"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateExpriyMonths));
                            } if (localWebAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "WebAllowed"));
                                 
                                        if (localWebAllowed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWebAllowed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WebAllowed cannot be null!!");
                                        }
                                    } if (localPMSConsumedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PMSConsumed"));
                                 
                                        if (localPMSConsumed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPMSConsumed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PMSConsumed cannot be null!!");
                                        }
                                    } if (localWebConsumedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "WebConsumed"));
                                 
                                        if (localWebConsumed != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWebConsumed));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WebConsumed cannot be null!!");
                                        }
                                    } if (localAwardsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Awards"));
                            
                            
                                    if (localAwards==null){
                                         throw new org.apache.axis2.databinding.ADBException("Awards cannot be null!!");
                                    }
                                    elementList.add(localAwards);
                                } if (localPromotionsTracker){
                             if (localPromotions!=null) {
                                 for (int i = 0;i < localPromotions.length;i++){

                                    if (localPromotions[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                          "Promotions"));
                                         elementList.add(localPromotions[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Promotions cannot be null!!");
                                    
                             }

                        } if (localScopeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Scope"));
                                 
                                        if (localScope != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localScope));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Scope cannot be null!!");
                                        }
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
        public static ECertificate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ECertificate object =
                new ECertificate();

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
                    
                            if (!"ECertificate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ECertificate)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list42 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateID").equals(reader.getName())){
                                
                                                object.setCertificateID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","VoucherNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"VoucherNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVoucherNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
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
                                
                                    else {
                                        
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
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PromotionCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PromotionCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPromotionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","LongDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LongDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLongDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ExpirationDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ExpirationDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ReservationCertificateYN").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReservationCertificateYN" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReservationCertificateYN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateValue").equals(reader.getName())){
                                
                                                object.setCertificateValue(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateCost").equals(reader.getName())){
                                
                                                object.setCertificateCost(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateLabel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateLabel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","NameID").equals(reader.getName())){
                                
                                                object.setNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumedAt").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumedAt" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumedAt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumerLastName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumerLastName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumerLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumerFirstName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumerFirstName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumerFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumerMiddleName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumerMiddleName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumerMiddleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumerEmail").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumerEmail" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumerEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumptionDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumptionDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumedHotelReference").equals(reader.getName())){
                                
                                                object.setConsumedHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionRefNo").equals(reader.getName())){
                                
                                                object.setConsumptionRefNo(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionRefType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ConsumptionRefType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConsumptionRefType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ConsumptionLegNo").equals(reader.getName())){
                                
                                                object.setConsumptionLegNo(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","UserNotes").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserNotes" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserNotes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Status").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Status" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PrintStatus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PrintStatus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrintStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipAwardID").equals(reader.getName())){
                                
                                                object.setMembershipAwardID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","IssueType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IssueType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssueType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","IssueSource").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IssueSource" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssueSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardPoints").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardPoints" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardPoints(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAwardPoints(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","InActiveDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"InActiveDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInActiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateBeginDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateBeginDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateEndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateEndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CertificateExpriyMonths").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CertificateExpriyMonths" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateExpriyMonths(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCertificateExpriyMonths(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","WebAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WebAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWebAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PMSConsumed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PMSConsumed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPMSConsumed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","WebConsumed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"WebConsumed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWebConsumed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Awards").equals(reader.getName())){
                                
                                                object.setAwards(com.cloudkey.pms.micros.og.membership.Award.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Promotions").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list42.add(com.cloudkey.pms.micros.og.membership.PromotionDetails.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone42 = false;
                                                        while(!loopDone42){
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
                                                                loopDone42 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Promotions").equals(reader.getName())){
                                                                    list42.add(com.cloudkey.pms.micros.og.membership.PromotionDetails.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone42 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPromotions((com.cloudkey.pms.micros.og.membership.PromotionDetails[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.membership.PromotionDetails.class,
                                                                list42));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Scope").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Scope" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setScope(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    