
/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  Profile bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Profile
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Profile
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for ProfileIDs
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfUniqueID localProfileIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileIDsTracker = false ;

                           public boolean isProfileIDsSpecified(){
                               return localProfileIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfUniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfUniqueID getProfileIDs(){
                               return localProfileIDs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileIDs
                               */
                               public void setProfileIDs(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID param){
                            localProfileIDsTracker = param != null;
                                   
                                            this.localProfileIDs=param;
                                    

                               }
                            

                        /**
                        * field for ProfileChoice_type0
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ProfileChoice_type0 localProfileChoice_type0 ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ProfileChoice_type0
                           */
                           public  com.cloudkey.pms.micros.og.name.ProfileChoice_type0 getProfileChoice_type0(){
                               return localProfileChoice_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileChoice_type0
                               */
                               public void setProfileChoice_type0(com.cloudkey.pms.micros.og.name.ProfileChoice_type0 param){
                            
                                            this.localProfileChoice_type0=param;
                                    

                               }
                            

                        /**
                        * field for CreditCards
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard localCreditCards ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardsTracker = false ;

                           public boolean isCreditCardsSpecified(){
                               return localCreditCardsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard getCreditCards(){
                               return localCreditCards;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCards
                               */
                               public void setCreditCards(com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard param){
                            localCreditCardsTracker = param != null;
                                   
                                            this.localCreditCards=param;
                                    

                               }
                            

                        /**
                        * field for Addresses
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNameAddress localAddresses ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressesTracker = false ;

                           public boolean isAddressesSpecified(){
                               return localAddressesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNameAddress
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNameAddress getAddresses(){
                               return localAddresses;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Addresses
                               */
                               public void setAddresses(com.cloudkey.pms.micros.og.name.ArrayOfNameAddress param){
                            localAddressesTracker = param != null;
                                   
                                            this.localAddresses=param;
                                    

                               }
                            

                        /**
                        * field for Blacklist
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.BlackList localBlacklist ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlacklistTracker = false ;

                           public boolean isBlacklistSpecified(){
                               return localBlacklistTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.BlackList
                           */
                           public  com.cloudkey.pms.micros.og.name.BlackList getBlacklist(){
                               return localBlacklist;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Blacklist
                               */
                               public void setBlacklist(com.cloudkey.pms.micros.og.name.BlackList param){
                            localBlacklistTracker = param != null;
                                   
                                            this.localBlacklist=param;
                                    

                               }
                            

                        /**
                        * field for Phones
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNamePhone localPhones ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhonesTracker = false ;

                           public boolean isPhonesSpecified(){
                               return localPhonesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNamePhone
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNamePhone getPhones(){
                               return localPhones;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Phones
                               */
                               public void setPhones(com.cloudkey.pms.micros.og.name.ArrayOfNamePhone param){
                            localPhonesTracker = param != null;
                                   
                                            this.localPhones=param;
                                    

                               }
                            

                        /**
                        * field for Preferences
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfPreference localPreferences ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreferencesTracker = false ;

                           public boolean isPreferencesSpecified(){
                               return localPreferencesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfPreference
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfPreference getPreferences(){
                               return localPreferences;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Preferences
                               */
                               public void setPreferences(com.cloudkey.pms.micros.og.name.ArrayOfPreference param){
                            localPreferencesTracker = param != null;
                                   
                                            this.localPreferences=param;
                                    

                               }
                            

                        /**
                        * field for EMails
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNameEmail localEMails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEMailsTracker = false ;

                           public boolean isEMailsSpecified(){
                               return localEMailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNameEmail
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNameEmail getEMails(){
                               return localEMails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EMails
                               */
                               public void setEMails(com.cloudkey.pms.micros.og.name.ArrayOfNameEmail param){
                            localEMailsTracker = param != null;
                                   
                                            this.localEMails=param;
                                    

                               }
                            

                        /**
                        * field for Memberships
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNameMembership localMemberships ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipsTracker = false ;

                           public boolean isMembershipsSpecified(){
                               return localMembershipsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNameMembership
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNameMembership getMemberships(){
                               return localMemberships;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Memberships
                               */
                               public void setMemberships(com.cloudkey.pms.micros.og.name.ArrayOfNameMembership param){
                            localMembershipsTracker = param != null;
                                   
                                            this.localMemberships=param;
                                    

                               }
                            

                        /**
                        * field for NegotiatedRates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate localNegotiatedRates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNegotiatedRatesTracker = false ;

                           public boolean isNegotiatedRatesSpecified(){
                               return localNegotiatedRatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate getNegotiatedRates(){
                               return localNegotiatedRates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NegotiatedRates
                               */
                               public void setNegotiatedRates(com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate param){
                            localNegotiatedRatesTracker = param != null;
                                   
                                            this.localNegotiatedRates=param;
                                    

                               }
                            

                        /**
                        * field for Comments
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfComment localComments ;
                                
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
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfComment
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfComment getComments(){
                               return localComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comments
                               */
                               public void setComments(com.cloudkey.pms.micros.og.name.ArrayOfComment param){
                            localCommentsTracker = param != null;
                                   
                                            this.localComments=param;
                                    

                               }
                            

                        /**
                        * field for UserDefinedValues
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue localUserDefinedValues ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserDefinedValuesTracker = false ;

                           public boolean isUserDefinedValuesSpecified(){
                               return localUserDefinedValuesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue getUserDefinedValues(){
                               return localUserDefinedValues;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserDefinedValues
                               */
                               public void setUserDefinedValues(com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue param){
                            localUserDefinedValuesTracker = param != null;
                                   
                                            this.localUserDefinedValues=param;
                                    

                               }
                            

                        /**
                        * field for Privacy
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType localPrivacy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrivacyTracker = false ;

                           public boolean isPrivacySpecified(){
                               return localPrivacyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType getPrivacy(){
                               return localPrivacy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Privacy
                               */
                               public void setPrivacy(com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType param){
                            localPrivacyTracker = param != null;
                                   
                                            this.localPrivacy=param;
                                    

                               }
                            

                        /**
                        * field for UserGroup
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ProfileUserGroup localUserGroup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserGroupTracker = false ;

                           public boolean isUserGroupSpecified(){
                               return localUserGroupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ProfileUserGroup
                           */
                           public  com.cloudkey.pms.micros.og.name.ProfileUserGroup getUserGroup(){
                               return localUserGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserGroup
                               */
                               public void setUserGroup(com.cloudkey.pms.micros.og.name.ProfileUserGroup param){
                            localUserGroupTracker = param != null;
                                   
                                            this.localUserGroup=param;
                                    

                               }
                            

                        /**
                        * field for StayHistory
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.StayHistoryData localStayHistory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStayHistoryTracker = false ;

                           public boolean isStayHistorySpecified(){
                               return localStayHistoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.StayHistoryData
                           */
                           public  com.cloudkey.pms.micros.og.name.StayHistoryData getStayHistory(){
                               return localStayHistory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayHistory
                               */
                               public void setStayHistory(com.cloudkey.pms.micros.og.name.StayHistoryData param){
                            localStayHistoryTracker = param != null;
                                   
                                            this.localStayHistory=param;
                                    

                               }
                            

                        /**
                        * field for Id
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.GovernmentID localId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdTracker = false ;

                           public boolean isIdSpecified(){
                               return localIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.GovernmentID
                           */
                           public  com.cloudkey.pms.micros.og.common.GovernmentID getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(com.cloudkey.pms.micros.og.common.GovernmentID param){
                            localIdTracker = param != null;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for KeyWord
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfKeyWord localKeyWord ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyWordTracker = false ;

                           public boolean isKeyWordSpecified(){
                               return localKeyWordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfKeyWord
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfKeyWord getKeyWord(){
                               return localKeyWord;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyWord
                               */
                               public void setKeyWord(com.cloudkey.pms.micros.og.name.ArrayOfKeyWord param){
                            localKeyWordTracker = param != null;
                                   
                                            this.localKeyWord=param;
                                    

                               }
                            

                        /**
                        * field for Features
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature localFeatures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFeaturesTracker = false ;

                           public boolean isFeaturesSpecified(){
                               return localFeaturesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature getFeatures(){
                               return localFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Features
                               */
                               public void setFeatures(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature param){
                            localFeaturesTracker = param != null;
                                   
                                            this.localFeatures=param;
                                    

                               }
                            

                        /**
                        * field for NameType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNameType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameType(){
                               return localNameType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameType
                               */
                               public void setNameType(java.lang.String param){
                            
                                            this.localNameType=param;
                                    

                               }
                            

                        /**
                        * field for _protected
                        * This was an Attribute!
                        */

                        
                                    protected boolean local_protected ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean get_protected(){
                               return local_protected;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param _protected
                               */
                               public void set_protected(boolean param){
                            
                                            this.local_protected=param;
                                    

                               }
                            

                        /**
                        * field for LanguageCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLanguageCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLanguageCode(){
                               return localLanguageCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LanguageCode
                               */
                               public void setLanguageCode(java.lang.String param){
                            
                                            this.localLanguageCode=param;
                                    

                               }
                            

                        /**
                        * field for Nationality
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localNationality ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNationality(){
                               return localNationality;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nationality
                               */
                               public void setNationality(java.lang.String param){
                            
                                            this.localNationality=param;
                                    

                               }
                            

                        /**
                        * field for VipCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localVipCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVipCode(){
                               return localVipCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VipCode
                               */
                               public void setVipCode(java.lang.String param){
                            
                                            this.localVipCode=param;
                                    

                               }
                            

                        /**
                        * field for TaxExempt
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTaxExempt ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTaxExempt(){
                               return localTaxExempt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxExempt
                               */
                               public void setTaxExempt(boolean param){
                            
                                            this.localTaxExempt=param;
                                    

                               }
                            

                        /**
                        * field for InsertUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInsertUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInsertUser(){
                               return localInsertUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertUser
                               */
                               public void setInsertUser(java.lang.String param){
                            
                                            this.localInsertUser=param;
                                    

                               }
                            

                        /**
                        * field for InsertDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localInsertDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInsertDate(){
                               return localInsertDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertDate
                               */
                               public void setInsertDate(java.util.Calendar param){
                            
                                            this.localInsertDate=param;
                                    

                               }
                            

                        /**
                        * field for UpdateUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUpdateUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdateUser(){
                               return localUpdateUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateUser
                               */
                               public void setUpdateUser(java.lang.String param){
                            
                                            this.localUpdateUser=param;
                                    

                               }
                            

                        /**
                        * field for UpdateDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localUpdateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getUpdateDate(){
                               return localUpdateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateDate
                               */
                               public void setUpdateDate(java.util.Calendar param){
                            
                                            this.localUpdateDate=param;
                                    

                               }
                            

                        /**
                        * field for InactiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localInactiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getInactiveDate(){
                               return localInactiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDate
                               */
                               public void setInactiveDate(java.util.Date param){
                            
                                            this.localInactiveDate=param;
                                    

                               }
                            

                        /**
                        * field for Active
                        * This was an Attribute!
                        */

                        
                                    protected boolean localActive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getActive(){
                               return localActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Active
                               */
                               public void setActive(boolean param){
                            
                                            this.localActive=param;
                                    

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
                        * field for CustomerValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCustomerValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCustomerValue(){
                               return localCustomerValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerValue
                               */
                               public void setCustomerValue(java.lang.String param){
                            
                                            this.localCustomerValue=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Name/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Profile",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Profile",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localNameType != null){
                                        
                                                writeAttribute("",
                                                         "nameType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameType), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "protected",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_protected), xmlWriter);

                                            
                                      }
                                    
                                            if (localLanguageCode != null){
                                        
                                                writeAttribute("",
                                                         "languageCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguageCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localNationality != null){
                                        
                                                writeAttribute("",
                                                         "nationality",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationality), xmlWriter);

                                            
                                      }
                                    
                                            if (localVipCode != null){
                                        
                                                writeAttribute("",
                                                         "vipCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVipCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "taxExempt",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxExempt), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertUser != null){
                                        
                                                writeAttribute("",
                                                         "insertUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertDate != null){
                                        
                                                writeAttribute("",
                                                         "insertDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateUser != null){
                                        
                                                writeAttribute("",
                                                         "updateUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateDate != null){
                                        
                                                writeAttribute("",
                                                         "updateDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localInactiveDate != null){
                                        
                                                writeAttribute("",
                                                         "inactiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "active",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive), xmlWriter);

                                            
                                      }
                                    
                                            if (localYieldMarketCode != null){
                                        
                                                writeAttribute("",
                                                         "yieldMarketCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYieldMarketCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localCustomerValue != null){
                                        
                                                writeAttribute("",
                                                         "customerValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerValue), xmlWriter);

                                            
                                      }
                                     if (localProfileIDsTracker){
                                            if (localProfileIDs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ProfileIDs cannot be null!!");
                                            }
                                           localProfileIDs.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","ProfileIDs"),
                                               xmlWriter);
                                        }
                                            if (localProfileChoice_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ProfileChoice_type0 cannot be null!!");
                                            }
                                           localProfileChoice_type0.serialize(null,xmlWriter);
                                         if (localCreditCardsTracker){
                                            if (localCreditCards==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCards cannot be null!!");
                                            }
                                           localCreditCards.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","CreditCards"),
                                               xmlWriter);
                                        } if (localAddressesTracker){
                                            if (localAddresses==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Addresses cannot be null!!");
                                            }
                                           localAddresses.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Addresses"),
                                               xmlWriter);
                                        } if (localBlacklistTracker){
                                            if (localBlacklist==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Blacklist cannot be null!!");
                                            }
                                           localBlacklist.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Blacklist"),
                                               xmlWriter);
                                        } if (localPhonesTracker){
                                            if (localPhones==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Phones cannot be null!!");
                                            }
                                           localPhones.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Phones"),
                                               xmlWriter);
                                        } if (localPreferencesTracker){
                                            if (localPreferences==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                            }
                                           localPreferences.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Preferences"),
                                               xmlWriter);
                                        } if (localEMailsTracker){
                                            if (localEMails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EMails cannot be null!!");
                                            }
                                           localEMails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","EMails"),
                                               xmlWriter);
                                        } if (localMembershipsTracker){
                                            if (localMemberships==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Memberships cannot be null!!");
                                            }
                                           localMemberships.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Memberships"),
                                               xmlWriter);
                                        } if (localNegotiatedRatesTracker){
                                            if (localNegotiatedRates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NegotiatedRates cannot be null!!");
                                            }
                                           localNegotiatedRates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NegotiatedRates"),
                                               xmlWriter);
                                        } if (localCommentsTracker){
                                            if (localComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                            }
                                           localComments.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Comments"),
                                               xmlWriter);
                                        } if (localUserDefinedValuesTracker){
                                            if (localUserDefinedValues==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                            }
                                           localUserDefinedValues.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","UserDefinedValues"),
                                               xmlWriter);
                                        } if (localPrivacyTracker){
                                            if (localPrivacy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Privacy cannot be null!!");
                                            }
                                           localPrivacy.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Privacy"),
                                               xmlWriter);
                                        } if (localUserGroupTracker){
                                            if (localUserGroup==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserGroup cannot be null!!");
                                            }
                                           localUserGroup.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","UserGroup"),
                                               xmlWriter);
                                        } if (localStayHistoryTracker){
                                            if (localStayHistory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayHistory cannot be null!!");
                                            }
                                           localStayHistory.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","StayHistory"),
                                               xmlWriter);
                                        } if (localIdTracker){
                                            if (localId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");
                                            }
                                           localId.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Id"),
                                               xmlWriter);
                                        } if (localKeyWordTracker){
                                            if (localKeyWord==null){
                                                 throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                            }
                                           localKeyWord.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","KeyWord"),
                                               xmlWriter);
                                        } if (localFeaturesTracker){
                                            if (localFeatures==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                            }
                                           localFeatures.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Features"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Name/")){
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

                 if (localProfileIDsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "ProfileIDs"));
                            
                            
                                    if (localProfileIDs==null){
                                         throw new org.apache.axis2.databinding.ADBException("ProfileIDs cannot be null!!");
                                    }
                                    elementList.add(localProfileIDs);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "ProfileChoice_type0"));
                            
                            
                                    if (localProfileChoice_type0==null){
                                         throw new org.apache.axis2.databinding.ADBException("ProfileChoice_type0 cannot be null!!");
                                    }
                                    elementList.add(localProfileChoice_type0);
                                 if (localCreditCardsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "CreditCards"));
                            
                            
                                    if (localCreditCards==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCards cannot be null!!");
                                    }
                                    elementList.add(localCreditCards);
                                } if (localAddressesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Addresses"));
                            
                            
                                    if (localAddresses==null){
                                         throw new org.apache.axis2.databinding.ADBException("Addresses cannot be null!!");
                                    }
                                    elementList.add(localAddresses);
                                } if (localBlacklistTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Blacklist"));
                            
                            
                                    if (localBlacklist==null){
                                         throw new org.apache.axis2.databinding.ADBException("Blacklist cannot be null!!");
                                    }
                                    elementList.add(localBlacklist);
                                } if (localPhonesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Phones"));
                            
                            
                                    if (localPhones==null){
                                         throw new org.apache.axis2.databinding.ADBException("Phones cannot be null!!");
                                    }
                                    elementList.add(localPhones);
                                } if (localPreferencesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Preferences"));
                            
                            
                                    if (localPreferences==null){
                                         throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                    }
                                    elementList.add(localPreferences);
                                } if (localEMailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "EMails"));
                            
                            
                                    if (localEMails==null){
                                         throw new org.apache.axis2.databinding.ADBException("EMails cannot be null!!");
                                    }
                                    elementList.add(localEMails);
                                } if (localMembershipsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Memberships"));
                            
                            
                                    if (localMemberships==null){
                                         throw new org.apache.axis2.databinding.ADBException("Memberships cannot be null!!");
                                    }
                                    elementList.add(localMemberships);
                                } if (localNegotiatedRatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NegotiatedRates"));
                            
                            
                                    if (localNegotiatedRates==null){
                                         throw new org.apache.axis2.databinding.ADBException("NegotiatedRates cannot be null!!");
                                    }
                                    elementList.add(localNegotiatedRates);
                                } if (localCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Comments"));
                            
                            
                                    if (localComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                    }
                                    elementList.add(localComments);
                                } if (localUserDefinedValuesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "UserDefinedValues"));
                            
                            
                                    if (localUserDefinedValues==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                    }
                                    elementList.add(localUserDefinedValues);
                                } if (localPrivacyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Privacy"));
                            
                            
                                    if (localPrivacy==null){
                                         throw new org.apache.axis2.databinding.ADBException("Privacy cannot be null!!");
                                    }
                                    elementList.add(localPrivacy);
                                } if (localUserGroupTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "UserGroup"));
                            
                            
                                    if (localUserGroup==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserGroup cannot be null!!");
                                    }
                                    elementList.add(localUserGroup);
                                } if (localStayHistoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "StayHistory"));
                            
                            
                                    if (localStayHistory==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayHistory cannot be null!!");
                                    }
                                    elementList.add(localStayHistory);
                                } if (localIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Id"));
                            
                            
                                    if (localId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");
                                    }
                                    elementList.add(localId);
                                } if (localKeyWordTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "KeyWord"));
                            
                            
                                    if (localKeyWord==null){
                                         throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                    }
                                    elementList.add(localKeyWord);
                                } if (localFeaturesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Features"));
                            
                            
                                    if (localFeatures==null){
                                         throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                    }
                                    elementList.add(localFeatures);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","nameType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","protected"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_protected));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","languageCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguageCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","nationality"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationality));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","vipCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVipCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","taxExempt"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxExempt));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","inactiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","active"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","yieldMarketCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYieldMarketCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","customerValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerValue));
                                

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
        public static Profile parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Profile object =
                new Profile();

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
                    
                            if (!"Profile".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Profile)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "nameType"
                    java.lang.String tempAttribNameType =
                        
                                reader.getAttributeValue(null,"nameType");
                            
                   if (tempAttribNameType!=null){
                         java.lang.String content = tempAttribNameType;
                        
                                                 object.setNameType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNameType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("nameType");
                    
                    // handle attribute "protected"
                    java.lang.String tempAttrib_protected =
                        
                                reader.getAttributeValue(null,"protected");
                            
                   if (tempAttrib_protected!=null){
                         java.lang.String content = tempAttrib_protected;
                        
                                                 object.set_protected(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttrib_protected));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("protected");
                    
                    // handle attribute "languageCode"
                    java.lang.String tempAttribLanguageCode =
                        
                                reader.getAttributeValue(null,"languageCode");
                            
                   if (tempAttribLanguageCode!=null){
                         java.lang.String content = tempAttribLanguageCode;
                        
                                                 object.setLanguageCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLanguageCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("languageCode");
                    
                    // handle attribute "nationality"
                    java.lang.String tempAttribNationality =
                        
                                reader.getAttributeValue(null,"nationality");
                            
                   if (tempAttribNationality!=null){
                         java.lang.String content = tempAttribNationality;
                        
                                                 object.setNationality(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribNationality));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("nationality");
                    
                    // handle attribute "vipCode"
                    java.lang.String tempAttribVipCode =
                        
                                reader.getAttributeValue(null,"vipCode");
                            
                   if (tempAttribVipCode!=null){
                         java.lang.String content = tempAttribVipCode;
                        
                                                 object.setVipCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribVipCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("vipCode");
                    
                    // handle attribute "taxExempt"
                    java.lang.String tempAttribTaxExempt =
                        
                                reader.getAttributeValue(null,"taxExempt");
                            
                   if (tempAttribTaxExempt!=null){
                         java.lang.String content = tempAttribTaxExempt;
                        
                                                 object.setTaxExempt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxExempt));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("taxExempt");
                    
                    // handle attribute "insertUser"
                    java.lang.String tempAttribInsertUser =
                        
                                reader.getAttributeValue(null,"insertUser");
                            
                   if (tempAttribInsertUser!=null){
                         java.lang.String content = tempAttribInsertUser;
                        
                                                 object.setInsertUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInsertUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertUser");
                    
                    // handle attribute "insertDate"
                    java.lang.String tempAttribInsertDate =
                        
                                reader.getAttributeValue(null,"insertDate");
                            
                   if (tempAttribInsertDate!=null){
                         java.lang.String content = tempAttribInsertDate;
                        
                                                 object.setInsertDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribInsertDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertDate");
                    
                    // handle attribute "updateUser"
                    java.lang.String tempAttribUpdateUser =
                        
                                reader.getAttributeValue(null,"updateUser");
                            
                   if (tempAttribUpdateUser!=null){
                         java.lang.String content = tempAttribUpdateUser;
                        
                                                 object.setUpdateUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUpdateUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateUser");
                    
                    // handle attribute "updateDate"
                    java.lang.String tempAttribUpdateDate =
                        
                                reader.getAttributeValue(null,"updateDate");
                            
                   if (tempAttribUpdateDate!=null){
                         java.lang.String content = tempAttribUpdateDate;
                        
                                                 object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribUpdateDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateDate");
                    
                    // handle attribute "inactiveDate"
                    java.lang.String tempAttribInactiveDate =
                        
                                reader.getAttributeValue(null,"inactiveDate");
                            
                   if (tempAttribInactiveDate!=null){
                         java.lang.String content = tempAttribInactiveDate;
                        
                                                 object.setInactiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribInactiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("inactiveDate");
                    
                    // handle attribute "active"
                    java.lang.String tempAttribActive =
                        
                                reader.getAttributeValue(null,"active");
                            
                   if (tempAttribActive!=null){
                         java.lang.String content = tempAttribActive;
                        
                                                 object.setActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribActive));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("active");
                    
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
                    
                    // handle attribute "customerValue"
                    java.lang.String tempAttribCustomerValue =
                        
                                reader.getAttributeValue(null,"customerValue");
                            
                   if (tempAttribCustomerValue!=null){
                         java.lang.String content = tempAttribCustomerValue;
                        
                                                 object.setCustomerValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCustomerValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("customerValue");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","ProfileIDs").equals(reader.getName())){
                                
                                                object.setProfileIDs(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setProfileChoice_type0(com.cloudkey.pms.micros.og.name.ProfileChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","CreditCards").equals(reader.getName())){
                                
                                                object.setCreditCards(com.cloudkey.pms.micros.og.name.ArrayOfNameCreditCard.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Addresses").equals(reader.getName())){
                                
                                                object.setAddresses(com.cloudkey.pms.micros.og.name.ArrayOfNameAddress.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Blacklist").equals(reader.getName())){
                                
                                                object.setBlacklist(com.cloudkey.pms.micros.og.name.BlackList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Phones").equals(reader.getName())){
                                
                                                object.setPhones(com.cloudkey.pms.micros.og.name.ArrayOfNamePhone.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Preferences").equals(reader.getName())){
                                
                                                object.setPreferences(com.cloudkey.pms.micros.og.name.ArrayOfPreference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","EMails").equals(reader.getName())){
                                
                                                object.setEMails(com.cloudkey.pms.micros.og.name.ArrayOfNameEmail.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Memberships").equals(reader.getName())){
                                
                                                object.setMemberships(com.cloudkey.pms.micros.og.name.ArrayOfNameMembership.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NegotiatedRates").equals(reader.getName())){
                                
                                                object.setNegotiatedRates(com.cloudkey.pms.micros.og.name.ArrayOfNegotiatedRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Comments").equals(reader.getName())){
                                
                                                object.setComments(com.cloudkey.pms.micros.og.name.ArrayOfComment.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","UserDefinedValues").equals(reader.getName())){
                                
                                                object.setUserDefinedValues(com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Privacy").equals(reader.getName())){
                                
                                                object.setPrivacy(com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","UserGroup").equals(reader.getName())){
                                
                                                object.setUserGroup(com.cloudkey.pms.micros.og.name.ProfileUserGroup.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","StayHistory").equals(reader.getName())){
                                
                                                object.setStayHistory(com.cloudkey.pms.micros.og.name.StayHistoryData.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Id").equals(reader.getName())){
                                
                                                object.setId(com.cloudkey.pms.micros.og.common.GovernmentID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","KeyWord").equals(reader.getName())){
                                
                                                object.setKeyWord(com.cloudkey.pms.micros.og.name.ArrayOfKeyWord.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Features").equals(reader.getName())){
                                
                                                object.setFeatures(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature.Factory.parse(reader));
                                              
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
           
    