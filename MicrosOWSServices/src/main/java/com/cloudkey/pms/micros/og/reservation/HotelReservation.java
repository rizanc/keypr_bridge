
/**
 * HotelReservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  HotelReservation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class HotelReservation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = HotelReservation
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for UniqueIDList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfUniqueID localUniqueIDList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIDListTracker = false ;

                           public boolean isUniqueIDListSpecified(){
                               return localUniqueIDListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfUniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfUniqueID getUniqueIDList(){
                               return localUniqueIDList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueIDList
                               */
                               public void setUniqueIDList(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID param){
                            localUniqueIDListTracker = param != null;
                                   
                                            this.localUniqueIDList=param;
                                    

                               }
                            

                        /**
                        * field for RoomStays
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay localRoomStays ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomStaysTracker = false ;

                           public boolean isRoomStaysSpecified(){
                               return localRoomStaysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay getRoomStays(){
                               return localRoomStays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStays
                               */
                               public void setRoomStays(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay param){
                            localRoomStaysTracker = param != null;
                                   
                                            this.localRoomStays=param;
                                    

                               }
                            

                        /**
                        * field for ResGuests
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest localResGuests ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResGuestsTracker = false ;

                           public boolean isResGuestsSpecified(){
                               return localResGuestsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest getResGuests(){
                               return localResGuests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResGuests
                               */
                               public void setResGuests(com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest param){
                            localResGuestsTracker = param != null;
                                   
                                            this.localResGuests=param;
                                    

                               }
                            

                        /**
                        * field for WrittenConfInst
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.WrittenConfInst localWrittenConfInst ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWrittenConfInstTracker = false ;

                           public boolean isWrittenConfInstSpecified(){
                               return localWrittenConfInstTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.WrittenConfInst
                           */
                           public  com.cloudkey.pms.micros.og.reservation.WrittenConfInst getWrittenConfInst(){
                               return localWrittenConfInst;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WrittenConfInst
                               */
                               public void setWrittenConfInst(com.cloudkey.pms.micros.og.reservation.WrittenConfInst param){
                            localWrittenConfInstTracker = param != null;
                                   
                                            this.localWrittenConfInst=param;
                                    

                               }
                            

                        /**
                        * field for ReservationHistory
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.History localReservationHistory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationHistoryTracker = false ;

                           public boolean isReservationHistorySpecified(){
                               return localReservationHistoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.History
                           */
                           public  com.cloudkey.pms.micros.og.common.History getReservationHistory(){
                               return localReservationHistory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationHistory
                               */
                               public void setReservationHistory(com.cloudkey.pms.micros.og.common.History param){
                            localReservationHistoryTracker = param != null;
                                   
                                            this.localReservationHistory=param;
                                    

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
                        * field for Invoice
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.BillHeader localInvoice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInvoiceTracker = false ;

                           public boolean isInvoiceSpecified(){
                               return localInvoiceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.BillHeader
                           */
                           public  com.cloudkey.pms.micros.og.reservation.BillHeader getInvoice(){
                               return localInvoice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Invoice
                               */
                               public void setInvoice(com.cloudkey.pms.micros.og.reservation.BillHeader param){
                            localInvoiceTracker = param != null;
                                   
                                            this.localInvoice=param;
                                    

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
                        * field for Alerts
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.Alert[] localAlerts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlertsTracker = false ;

                           public boolean isAlertsSpecified(){
                               return localAlertsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.Alert[]
                           */
                           public  com.cloudkey.pms.micros.og.reservation.Alert[] getAlerts(){
                               return localAlerts;
                           }

                           
                        


                               
                              /**
                               * validate the array for Alerts
                               */
                              protected void validateAlerts(com.cloudkey.pms.micros.og.reservation.Alert[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Alerts
                              */
                              public void setAlerts(com.cloudkey.pms.micros.og.reservation.Alert[] param){
                              
                                   validateAlerts(param);

                               localAlertsTracker = param != null;
                                      
                                      this.localAlerts=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.reservation.Alert
                             */
                             public void addAlerts(com.cloudkey.pms.micros.og.reservation.Alert param){
                                   if (localAlerts == null){
                                   localAlerts = new com.cloudkey.pms.micros.og.reservation.Alert[]{};
                                   }

                            
                                 //update the setting tracker
                                localAlertsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAlerts);
                               list.add(param);
                               this.localAlerts =
                             (com.cloudkey.pms.micros.og.reservation.Alert[])list.toArray(
                            new com.cloudkey.pms.micros.og.reservation.Alert[list.size()]);

                             }
                             

                        /**
                        * field for PayRoutings
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[] localPayRoutings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayRoutingsTracker = false ;

                           public boolean isPayRoutingsSpecified(){
                               return localPayRoutingsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[] getPayRoutings(){
                               return localPayRoutings;
                           }

                           
                        


                               
                              /**
                               * validate the array for PayRoutings
                               */
                              protected void validatePayRoutings(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PayRoutings
                              */
                              public void setPayRoutings(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[] param){
                              
                                   validatePayRoutings(param);

                               localPayRoutingsTracker = param != null;
                                      
                                      this.localPayRoutings=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting
                             */
                             public void addPayRoutings(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting param){
                                   if (localPayRoutings == null){
                                   localPayRoutings = new com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[]{};
                                   }

                            
                                 //update the setting tracker
                                localPayRoutingsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPayRoutings);
                               list.add(param);
                               this.localPayRoutings =
                             (com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[list.size()]);

                             }
                             

                        /**
                        * field for PayMethods
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[] localPayMethods ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayMethodsTracker = false ;

                           public boolean isPayMethodsSpecified(){
                               return localPayMethodsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[] getPayMethods(){
                               return localPayMethods;
                           }

                           
                        


                               
                              /**
                               * validate the array for PayMethods
                               */
                              protected void validatePayMethods(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PayMethods
                              */
                              public void setPayMethods(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[] param){
                              
                                   validatePayMethods(param);

                               localPayMethodsTracker = param != null;
                                      
                                      this.localPayMethods=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod
                             */
                             public void addPayMethods(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod param){
                                   if (localPayMethods == null){
                                   localPayMethods = new com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[]{};
                                   }

                            
                                 //update the setting tracker
                                localPayMethodsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPayMethods);
                               list.add(param);
                               this.localPayMethods =
                             (com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[list.size()]);

                             }
                             

                        /**
                        * field for AccompanyGuests
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest localAccompanyGuests ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccompanyGuestsTracker = false ;

                           public boolean isAccompanyGuestsSpecified(){
                               return localAccompanyGuestsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest getAccompanyGuests(){
                               return localAccompanyGuests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccompanyGuests
                               */
                               public void setAccompanyGuests(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest param){
                            localAccompanyGuestsTracker = param != null;
                                   
                                            this.localAccompanyGuests=param;
                                    

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
                        * field for ShareReservations
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation localShareReservations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShareReservationsTracker = false ;

                           public boolean isShareReservationsSpecified(){
                               return localShareReservationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation getShareReservations(){
                               return localShareReservations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShareReservations
                               */
                               public void setShareReservations(com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation param){
                            localShareReservationsTracker = param != null;
                                   
                                            this.localShareReservations=param;
                                    

                               }
                            

                        /**
                        * field for Miscellaneous
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.MoreFields localMiscellaneous ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiscellaneousTracker = false ;

                           public boolean isMiscellaneousSpecified(){
                               return localMiscellaneousTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.MoreFields
                           */
                           public  com.cloudkey.pms.micros.og.reservation.MoreFields getMiscellaneous(){
                               return localMiscellaneous;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Miscellaneous
                               */
                               public void setMiscellaneous(com.cloudkey.pms.micros.og.reservation.MoreFields param){
                            localMiscellaneousTracker = param != null;
                                   
                                            this.localMiscellaneous=param;
                                    

                               }
                            

                        /**
                        * field for ReservationVouchers
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher localReservationVouchers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationVouchersTracker = false ;

                           public boolean isReservationVouchersSpecified(){
                               return localReservationVouchersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher getReservationVouchers(){
                               return localReservationVouchers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationVouchers
                               */
                               public void setReservationVouchers(com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher param){
                            localReservationVouchersTracker = param != null;
                                   
                                            this.localReservationVouchers=param;
                                    

                               }
                            

                        /**
                        * field for ReservationAction
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ReservationActionType localReservationAction ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ReservationActionType
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ReservationActionType getReservationAction(){
                               return localReservationAction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationAction
                               */
                               public void setReservationAction(com.cloudkey.pms.micros.og.reservation.ReservationActionType param){
                            
                                            this.localReservationAction=param;
                                    

                               }
                            

                        /**
                        * field for ReservationStatus
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ReservationStatusType localReservationStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ReservationStatusType
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ReservationStatusType getReservationStatus(){
                               return localReservationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationStatus
                               */
                               public void setReservationStatus(com.cloudkey.pms.micros.og.reservation.ReservationStatusType param){
                            
                                            this.localReservationStatus=param;
                                    

                               }
                            

                        /**
                        * field for MarketSegment
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMarketSegment ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMarketSegment(){
                               return localMarketSegment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketSegment
                               */
                               public void setMarketSegment(java.lang.String param){
                            
                                            this.localMarketSegment=param;
                                    

                               }
                            

                        /**
                        * field for SourceCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSourceCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSourceCode(){
                               return localSourceCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceCode
                               */
                               public void setSourceCode(java.lang.String param){
                            
                                            this.localSourceCode=param;
                                    

                               }
                            

                        /**
                        * field for OriginCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOriginCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOriginCode(){
                               return localOriginCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginCode
                               */
                               public void setOriginCode(java.lang.String param){
                            
                                            this.localOriginCode=param;
                                    

                               }
                            

                        /**
                        * field for Authorizer
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAuthorizer ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAuthorizer(){
                               return localAuthorizer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Authorizer
                               */
                               public void setAuthorizer(java.lang.String param){
                            
                                            this.localAuthorizer=param;
                                    

                               }
                            

                        /**
                        * field for CompRoutingFlag
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCompRoutingFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCompRoutingFlag(){
                               return localCompRoutingFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompRoutingFlag
                               */
                               public void setCompRoutingFlag(java.lang.String param){
                            
                                            this.localCompRoutingFlag=param;
                                    

                               }
                            

                        /**
                        * field for CompRoutingAuthorizer
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCompRoutingAuthorizer ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCompRoutingAuthorizer(){
                               return localCompRoutingAuthorizer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompRoutingAuthorizer
                               */
                               public void setCompRoutingAuthorizer(java.lang.String param){
                            
                                            this.localCompRoutingAuthorizer=param;
                                    

                               }
                            

                        /**
                        * field for OnBehalfFlag
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOnBehalfFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOnBehalfFlag(){
                               return localOnBehalfFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnBehalfFlag
                               */
                               public void setOnBehalfFlag(boolean param){
                            
                                            this.localOnBehalfFlag=param;
                                    

                               }
                            

                        /**
                        * field for RedemReservationFlag
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRedemReservationFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRedemReservationFlag(){
                               return localRedemReservationFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedemReservationFlag
                               */
                               public void setRedemReservationFlag(boolean param){
                            
                                            this.localRedemReservationFlag=param;
                                    

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
                        * field for WalkIn
                        * This was an Attribute!
                        */

                        
                                    protected boolean localWalkIn ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getWalkIn(){
                               return localWalkIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WalkIn
                               */
                               public void setWalkIn(boolean param){
                            
                                            this.localWalkIn=param;
                                    

                               }
                            

                        /**
                        * field for NoPost
                        * This was an Attribute!
                        */

                        
                                    protected boolean localNoPost ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNoPost(){
                               return localNoPost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoPost
                               */
                               public void setNoPost(boolean param){
                            
                                            this.localNoPost=param;
                                    

                               }
                            

                        /**
                        * field for RemoteCo
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRemoteCo ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRemoteCo(){
                               return localRemoteCo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RemoteCo
                               */
                               public void setRemoteCo(boolean param){
                            
                                            this.localRemoteCo=param;
                                    

                               }
                            

                        /**
                        * field for Group
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localGroup ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGroup(){
                               return localGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Group
                               */
                               public void setGroup(java.lang.String param){
                            
                                            this.localGroup=param;
                                    

                               }
                            

                        /**
                        * field for AttachPreferenceProfile
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAttachPreferenceProfile ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAttachPreferenceProfile(){
                               return localAttachPreferenceProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AttachPreferenceProfile
                               */
                               public void setAttachPreferenceProfile(boolean param){
                            
                                            this.localAttachPreferenceProfile=param;
                                    

                               }
                            

                        /**
                        * field for AllowPreRegisteration
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAllowPreRegisteration ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowPreRegisteration(){
                               return localAllowPreRegisteration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowPreRegisteration
                               */
                               public void setAllowPreRegisteration(boolean param){
                            
                                            this.localAllowPreRegisteration=param;
                                    

                               }
                            

                        /**
                        * field for PreRegisterFlag
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPreRegisterFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPreRegisterFlag(){
                               return localPreRegisterFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreRegisterFlag
                               */
                               public void setPreRegisterFlag(boolean param){
                            
                                            this.localPreRegisterFlag=param;
                                    

                               }
                            

                        /**
                        * field for KeyExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localKeyExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getKeyExpirationDate(){
                               return localKeyExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyExpirationDate
                               */
                               public void setKeyExpirationDate(java.util.Calendar param){
                            
                                            this.localKeyExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for TotalCreditCardSurcharges
                        * This was an Attribute!
                        */

                        
                                    protected double localTotalCreditCardSurcharges ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTotalCreditCardSurcharges(){
                               return localTotalCreditCardSurcharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalCreditCardSurcharges
                               */
                               public void setTotalCreditCardSurcharges(double param){
                            
                                            this.localTotalCreditCardSurcharges=param;
                                    

                               }
                            

                        /**
                        * field for DoNotMoveRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDoNotMoveRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoNotMoveRoom(){
                               return localDoNotMoveRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoNotMoveRoom
                               */
                               public void setDoNotMoveRoom(boolean param){
                            
                                            this.localDoNotMoveRoom=param;
                                    

                               }
                            

                        /**
                        * field for OptIn
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOptIn ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOptIn(){
                               return localOptIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OptIn
                               */
                               public void setOptIn(boolean param){
                            
                                            this.localOptIn=param;
                                    

                               }
                            

                        /**
                        * field for OptInComplete
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOptInComplete ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOptInComplete(){
                               return localOptInComplete;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OptInComplete
                               */
                               public void setOptInComplete(boolean param){
                            
                                            this.localOptInComplete=param;
                                    

                               }
                            

                        /**
                        * field for CommentsExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCommentsExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCommentsExists(){
                               return localCommentsExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommentsExists
                               */
                               public void setCommentsExists(boolean param){
                            
                                            this.localCommentsExists=param;
                                    

                               }
                            

                        /**
                        * field for CommentsCount
                        * This was an Attribute!
                        */

                        
                                    protected int localCommentsCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCommentsCount(){
                               return localCommentsCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommentsCount
                               */
                               public void setCommentsCount(int param){
                            
                                            this.localCommentsCount=param;
                                    

                               }
                            

                        /**
                        * field for TracesExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTracesExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTracesExists(){
                               return localTracesExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TracesExists
                               */
                               public void setTracesExists(boolean param){
                            
                                            this.localTracesExists=param;
                                    

                               }
                            

                        /**
                        * field for TracesCount
                        * This was an Attribute!
                        */

                        
                                    protected int localTracesCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTracesCount(){
                               return localTracesCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TracesCount
                               */
                               public void setTracesCount(int param){
                            
                                            this.localTracesCount=param;
                                    

                               }
                            

                        /**
                        * field for SpecialsExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSpecialsExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSpecialsExists(){
                               return localSpecialsExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialsExists
                               */
                               public void setSpecialsExists(boolean param){
                            
                                            this.localSpecialsExists=param;
                                    

                               }
                            

                        /**
                        * field for SpecialsCount
                        * This was an Attribute!
                        */

                        
                                    protected int localSpecialsCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSpecialsCount(){
                               return localSpecialsCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialsCount
                               */
                               public void setSpecialsCount(int param){
                            
                                            this.localSpecialsCount=param;
                                    

                               }
                            

                        /**
                        * field for RoomPreferenceExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRoomPreferenceExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRoomPreferenceExists(){
                               return localRoomPreferenceExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomPreferenceExists
                               */
                               public void setRoomPreferenceExists(boolean param){
                            
                                            this.localRoomPreferenceExists=param;
                                    

                               }
                            

                        /**
                        * field for RoomPreferencesCount
                        * This was an Attribute!
                        */

                        
                                    protected int localRoomPreferencesCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRoomPreferencesCount(){
                               return localRoomPreferencesCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomPreferencesCount
                               */
                               public void setRoomPreferencesCount(int param){
                            
                                            this.localRoomPreferencesCount=param;
                                    

                               }
                            

                        /**
                        * field for ShareExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localShareExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getShareExists(){
                               return localShareExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShareExists
                               */
                               public void setShareExists(boolean param){
                            
                                            this.localShareExists=param;
                                    

                               }
                            

                        /**
                        * field for QueueExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localQueueExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getQueueExists(){
                               return localQueueExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueueExists
                               */
                               public void setQueueExists(boolean param){
                            
                                            this.localQueueExists=param;
                                    

                               }
                            

                        /**
                        * field for QueueNumber
                        * This was an Attribute!
                        */

                        
                                    protected int localQueueNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getQueueNumber(){
                               return localQueueNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueueNumber
                               */
                               public void setQueueNumber(int param){
                            
                                            this.localQueueNumber=param;
                                    

                               }
                            

                        /**
                        * field for AlertExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAlertExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAlertExists(){
                               return localAlertExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlertExists
                               */
                               public void setAlertExists(boolean param){
                            
                                            this.localAlertExists=param;
                                    

                               }
                            

                        /**
                        * field for AlertsCount
                        * This was an Attribute!
                        */

                        
                                    protected int localAlertsCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAlertsCount(){
                               return localAlertsCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlertsCount
                               */
                               public void setAlertsCount(int param){
                            
                                            this.localAlertsCount=param;
                                    

                               }
                            

                        /**
                        * field for MessageExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMessageExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMessageExists(){
                               return localMessageExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageExists
                               */
                               public void setMessageExists(boolean param){
                            
                                            this.localMessageExists=param;
                                    

                               }
                            

                        /**
                        * field for MessagesCount
                        * This was an Attribute!
                        */

                        
                                    protected int localMessagesCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMessagesCount(){
                               return localMessagesCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessagesCount
                               */
                               public void setMessagesCount(int param){
                            
                                            this.localMessagesCount=param;
                                    

                               }
                            

                        /**
                        * field for CheckOutTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localCheckOutTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getCheckOutTime(){
                               return localCheckOutTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckOutTime
                               */
                               public void setCheckOutTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localCheckOutTime=param;
                                    

                               }
                            

                        /**
                        * field for ComputedReservationStatus
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ReservationStatusType localComputedReservationStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ReservationStatusType
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ReservationStatusType getComputedReservationStatus(){
                               return localComputedReservationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ComputedReservationStatus
                               */
                               public void setComputedReservationStatus(com.cloudkey.pms.micros.og.reservation.ReservationStatusType param){
                            
                                            this.localComputedReservationStatus=param;
                                    

                               }
                            

                        /**
                        * field for FinancialTransactionExists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localFinancialTransactionExists ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getFinancialTransactionExists(){
                               return localFinancialTransactionExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FinancialTransactionExists
                               */
                               public void setFinancialTransactionExists(boolean param){
                            
                                            this.localFinancialTransactionExists=param;
                                    

                               }
                            

                        /**
                        * field for PrintRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPrintRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPrintRate(){
                               return localPrintRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrintRate
                               */
                               public void setPrintRate(boolean param){
                            
                                            this.localPrintRate=param;
                                    

                               }
                            

                        /**
                        * field for ReferralYN
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReferralYN ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReferralYN(){
                               return localReferralYN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReferralYN
                               */
                               public void setReferralYN(java.lang.String param){
                            
                                            this.localReferralYN=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Reservation/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":HotelReservation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "HotelReservation",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localReservationAction != null){
                                        writeAttribute("",
                                           "reservationAction",
                                           localReservationAction.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localReservationStatus != null){
                                        writeAttribute("",
                                           "reservationStatus",
                                           localReservationStatus.toString(), xmlWriter);
                                    }
                                    
                                            if (localMarketSegment != null){
                                        
                                                writeAttribute("",
                                                         "marketSegment",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketSegment), xmlWriter);

                                            
                                      }
                                    
                                            if (localSourceCode != null){
                                        
                                                writeAttribute("",
                                                         "sourceCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localOriginCode != null){
                                        
                                                writeAttribute("",
                                                         "originCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localAuthorizer != null){
                                        
                                                writeAttribute("",
                                                         "authorizer",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorizer), xmlWriter);

                                            
                                      }
                                    
                                            if (localCompRoutingFlag != null){
                                        
                                                writeAttribute("",
                                                         "compRoutingFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingFlag), xmlWriter);

                                            
                                      }
                                    
                                            if (localCompRoutingAuthorizer != null){
                                        
                                                writeAttribute("",
                                                         "compRoutingAuthorizer",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingAuthorizer), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "onBehalfFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnBehalfFlag), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "redemReservationFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemReservationFlag), xmlWriter);

                                            
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
                                                         "walkIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWalkIn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "noPost",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "remoteCo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteCo), xmlWriter);

                                            
                                      }
                                    
                                            if (localGroup != null){
                                        
                                                writeAttribute("",
                                                         "group",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "attachPreferenceProfile",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachPreferenceProfile), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "allowPreRegisteration",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowPreRegisteration), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "preRegisterFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreRegisterFlag), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "keyExpirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localTotalCreditCardSurcharges)) {
                                               
                                                writeAttribute("",
                                                         "totalCreditCardSurcharges",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCreditCardSurcharges), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DoNotMoveRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OptIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptIn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OptInComplete",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptInComplete), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "commentsExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localCommentsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "commentsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "tracesExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localTracesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "tracesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "specialsExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localSpecialsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "specialsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "roomPreferenceExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferenceExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localRoomPreferencesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "roomPreferencesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferencesCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "shareExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShareExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "queueExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localQueueNumber!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "queueNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "alertExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localAlertsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "alertsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "messageExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMessagesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "messagesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessagesCount), xmlWriter);

                                            
                                      }
                                    
                                            if (localCheckOutTime != null){
                                        
                                                writeAttribute("",
                                                         "checkOutTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOutTime), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localComputedReservationStatus != null){
                                        writeAttribute("",
                                           "computedReservationStatus",
                                           localComputedReservationStatus.toString(), xmlWriter);
                                    }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "financialTransactionExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancialTransactionExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "printRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localReferralYN != null){
                                        
                                                writeAttribute("",
                                                         "referralYN",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferralYN), xmlWriter);

                                            
                                      }
                                     if (localUniqueIDListTracker){
                                            if (localUniqueIDList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                            }
                                           localUniqueIDList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList"),
                                               xmlWriter);
                                        } if (localRoomStaysTracker){
                                            if (localRoomStays==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomStays cannot be null!!");
                                            }
                                           localRoomStays.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RoomStays"),
                                               xmlWriter);
                                        } if (localResGuestsTracker){
                                            if (localResGuests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResGuests cannot be null!!");
                                            }
                                           localResGuests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResGuests"),
                                               xmlWriter);
                                        } if (localWrittenConfInstTracker){
                                            if (localWrittenConfInst==null){
                                                 throw new org.apache.axis2.databinding.ADBException("WrittenConfInst cannot be null!!");
                                            }
                                           localWrittenConfInst.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","WrittenConfInst"),
                                               xmlWriter);
                                        } if (localReservationHistoryTracker){
                                            if (localReservationHistory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationHistory cannot be null!!");
                                            }
                                           localReservationHistory.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationHistory"),
                                               xmlWriter);
                                        } if (localUserDefinedValuesTracker){
                                            if (localUserDefinedValues==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                            }
                                           localUserDefinedValues.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UserDefinedValues"),
                                               xmlWriter);
                                        } if (localInvoiceTracker){
                                            if (localInvoice==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Invoice cannot be null!!");
                                            }
                                           localInvoice.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Invoice"),
                                               xmlWriter);
                                        } if (localPreferencesTracker){
                                            if (localPreferences==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                            }
                                           localPreferences.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Preferences"),
                                               xmlWriter);
                                        } if (localAlertsTracker){
                                       if (localAlerts!=null){
                                            for (int i = 0;i < localAlerts.length;i++){
                                                if (localAlerts[i] != null){
                                                 localAlerts[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Alerts cannot be null!!");
                                        
                                    }
                                 } if (localPayRoutingsTracker){
                                       if (localPayRoutings!=null){
                                            for (int i = 0;i < localPayRoutings.length;i++){
                                                if (localPayRoutings[i] != null){
                                                 localPayRoutings[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PayRoutings cannot be null!!");
                                        
                                    }
                                 } if (localPayMethodsTracker){
                                       if (localPayMethods!=null){
                                            for (int i = 0;i < localPayMethods.length;i++){
                                                if (localPayMethods[i] != null){
                                                 localPayMethods[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PayMethods cannot be null!!");
                                        
                                    }
                                 } if (localAccompanyGuestsTracker){
                                            if (localAccompanyGuests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccompanyGuests cannot be null!!");
                                            }
                                           localAccompanyGuests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","AccompanyGuests"),
                                               xmlWriter);
                                        } if (localECertificateTracker){
                                            if (localECertificate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                            }
                                           localECertificate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ECertificate"),
                                               xmlWriter);
                                        } if (localShareReservationsTracker){
                                            if (localShareReservations==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ShareReservations cannot be null!!");
                                            }
                                           localShareReservations.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ShareReservations"),
                                               xmlWriter);
                                        } if (localMiscellaneousTracker){
                                            if (localMiscellaneous==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Miscellaneous cannot be null!!");
                                            }
                                           localMiscellaneous.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Miscellaneous"),
                                               xmlWriter);
                                        } if (localReservationVouchersTracker){
                                            if (localReservationVouchers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationVouchers cannot be null!!");
                                            }
                                           localReservationVouchers.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationVouchers"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Reservation/")){
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

                 if (localUniqueIDListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UniqueIDList"));
                            
                            
                                    if (localUniqueIDList==null){
                                         throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                    }
                                    elementList.add(localUniqueIDList);
                                } if (localRoomStaysTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "RoomStays"));
                            
                            
                                    if (localRoomStays==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomStays cannot be null!!");
                                    }
                                    elementList.add(localRoomStays);
                                } if (localResGuestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ResGuests"));
                            
                            
                                    if (localResGuests==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResGuests cannot be null!!");
                                    }
                                    elementList.add(localResGuests);
                                } if (localWrittenConfInstTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "WrittenConfInst"));
                            
                            
                                    if (localWrittenConfInst==null){
                                         throw new org.apache.axis2.databinding.ADBException("WrittenConfInst cannot be null!!");
                                    }
                                    elementList.add(localWrittenConfInst);
                                } if (localReservationHistoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ReservationHistory"));
                            
                            
                                    if (localReservationHistory==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationHistory cannot be null!!");
                                    }
                                    elementList.add(localReservationHistory);
                                } if (localUserDefinedValuesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UserDefinedValues"));
                            
                            
                                    if (localUserDefinedValues==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                    }
                                    elementList.add(localUserDefinedValues);
                                } if (localInvoiceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Invoice"));
                            
                            
                                    if (localInvoice==null){
                                         throw new org.apache.axis2.databinding.ADBException("Invoice cannot be null!!");
                                    }
                                    elementList.add(localInvoice);
                                } if (localPreferencesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Preferences"));
                            
                            
                                    if (localPreferences==null){
                                         throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                    }
                                    elementList.add(localPreferences);
                                } if (localAlertsTracker){
                             if (localAlerts!=null) {
                                 for (int i = 0;i < localAlerts.length;i++){

                                    if (localAlerts[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "Alerts"));
                                         elementList.add(localAlerts[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Alerts cannot be null!!");
                                    
                             }

                        } if (localPayRoutingsTracker){
                             if (localPayRoutings!=null) {
                                 for (int i = 0;i < localPayRoutings.length;i++){

                                    if (localPayRoutings[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "PayRoutings"));
                                         elementList.add(localPayRoutings[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PayRoutings cannot be null!!");
                                    
                             }

                        } if (localPayMethodsTracker){
                             if (localPayMethods!=null) {
                                 for (int i = 0;i < localPayMethods.length;i++){

                                    if (localPayMethods[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "PayMethods"));
                                         elementList.add(localPayMethods[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PayMethods cannot be null!!");
                                    
                             }

                        } if (localAccompanyGuestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "AccompanyGuests"));
                            
                            
                                    if (localAccompanyGuests==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccompanyGuests cannot be null!!");
                                    }
                                    elementList.add(localAccompanyGuests);
                                } if (localECertificateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ECertificate"));
                            
                            
                                    if (localECertificate==null){
                                         throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                    }
                                    elementList.add(localECertificate);
                                } if (localShareReservationsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ShareReservations"));
                            
                            
                                    if (localShareReservations==null){
                                         throw new org.apache.axis2.databinding.ADBException("ShareReservations cannot be null!!");
                                    }
                                    elementList.add(localShareReservations);
                                } if (localMiscellaneousTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Miscellaneous"));
                            
                            
                                    if (localMiscellaneous==null){
                                         throw new org.apache.axis2.databinding.ADBException("Miscellaneous cannot be null!!");
                                    }
                                    elementList.add(localMiscellaneous);
                                } if (localReservationVouchersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ReservationVouchers"));
                            
                            
                                    if (localReservationVouchers==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationVouchers cannot be null!!");
                                    }
                                    elementList.add(localReservationVouchers);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","reservationAction"));
                            
                                      attribList.add(localReservationAction.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","reservationStatus"));
                            
                                      attribList.add(localReservationStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","marketSegment"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketSegment));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","sourceCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","originCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","authorizer"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorizer));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","compRoutingFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","compRoutingAuthorizer"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingAuthorizer));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","onBehalfFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnBehalfFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","redemReservationFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemReservationFlag));
                                
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
                            new javax.xml.namespace.QName("","walkIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWalkIn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","noPost"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","remoteCo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteCo));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","group"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","attachPreferenceProfile"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachPreferenceProfile));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","allowPreRegisteration"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowPreRegisteration));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","preRegisterFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreRegisterFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","keyExpirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","totalCreditCardSurcharges"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCreditCardSurcharges));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DoNotMoveRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OptIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptIn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OptInComplete"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptInComplete));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commentsExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commentsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tracesExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tracesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","specialsExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","specialsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomPreferenceExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferenceExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomPreferencesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferencesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","shareExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShareExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","queueExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","queueNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alertExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alertsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","messageExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","messagesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessagesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","checkOutTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOutTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","computedReservationStatus"));
                            
                                      attribList.add(localComputedReservationStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","financialTransactionExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancialTransactionExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","printRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","referralYN"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferralYN));
                                

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
        public static HotelReservation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HotelReservation object =
                new HotelReservation();

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
                    
                            if (!"HotelReservation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HotelReservation)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "reservationAction"
                    java.lang.String tempAttribReservationAction =
                        
                                reader.getAttributeValue(null,"reservationAction");
                            
                   if (tempAttribReservationAction!=null){
                         java.lang.String content = tempAttribReservationAction;
                        
                                                  object.setReservationAction(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationActionType.Factory.fromString(reader,tempAttribReservationAction));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("reservationAction");
                    
                    // handle attribute "reservationStatus"
                    java.lang.String tempAttribReservationStatus =
                        
                                reader.getAttributeValue(null,"reservationStatus");
                            
                   if (tempAttribReservationStatus!=null){
                         java.lang.String content = tempAttribReservationStatus;
                        
                                                  object.setReservationStatus(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.fromString(reader,tempAttribReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("reservationStatus");
                    
                    // handle attribute "marketSegment"
                    java.lang.String tempAttribMarketSegment =
                        
                                reader.getAttributeValue(null,"marketSegment");
                            
                   if (tempAttribMarketSegment!=null){
                         java.lang.String content = tempAttribMarketSegment;
                        
                                                 object.setMarketSegment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMarketSegment));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("marketSegment");
                    
                    // handle attribute "sourceCode"
                    java.lang.String tempAttribSourceCode =
                        
                                reader.getAttributeValue(null,"sourceCode");
                            
                   if (tempAttribSourceCode!=null){
                         java.lang.String content = tempAttribSourceCode;
                        
                                                 object.setSourceCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSourceCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("sourceCode");
                    
                    // handle attribute "originCode"
                    java.lang.String tempAttribOriginCode =
                        
                                reader.getAttributeValue(null,"originCode");
                            
                   if (tempAttribOriginCode!=null){
                         java.lang.String content = tempAttribOriginCode;
                        
                                                 object.setOriginCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOriginCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("originCode");
                    
                    // handle attribute "authorizer"
                    java.lang.String tempAttribAuthorizer =
                        
                                reader.getAttributeValue(null,"authorizer");
                            
                   if (tempAttribAuthorizer!=null){
                         java.lang.String content = tempAttribAuthorizer;
                        
                                                 object.setAuthorizer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAuthorizer));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("authorizer");
                    
                    // handle attribute "compRoutingFlag"
                    java.lang.String tempAttribCompRoutingFlag =
                        
                                reader.getAttributeValue(null,"compRoutingFlag");
                            
                   if (tempAttribCompRoutingFlag!=null){
                         java.lang.String content = tempAttribCompRoutingFlag;
                        
                                                 object.setCompRoutingFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCompRoutingFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("compRoutingFlag");
                    
                    // handle attribute "compRoutingAuthorizer"
                    java.lang.String tempAttribCompRoutingAuthorizer =
                        
                                reader.getAttributeValue(null,"compRoutingAuthorizer");
                            
                   if (tempAttribCompRoutingAuthorizer!=null){
                         java.lang.String content = tempAttribCompRoutingAuthorizer;
                        
                                                 object.setCompRoutingAuthorizer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCompRoutingAuthorizer));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("compRoutingAuthorizer");
                    
                    // handle attribute "onBehalfFlag"
                    java.lang.String tempAttribOnBehalfFlag =
                        
                                reader.getAttributeValue(null,"onBehalfFlag");
                            
                   if (tempAttribOnBehalfFlag!=null){
                         java.lang.String content = tempAttribOnBehalfFlag;
                        
                                                 object.setOnBehalfFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOnBehalfFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("onBehalfFlag");
                    
                    // handle attribute "redemReservationFlag"
                    java.lang.String tempAttribRedemReservationFlag =
                        
                                reader.getAttributeValue(null,"redemReservationFlag");
                            
                   if (tempAttribRedemReservationFlag!=null){
                         java.lang.String content = tempAttribRedemReservationFlag;
                        
                                                 object.setRedemReservationFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRedemReservationFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("redemReservationFlag");
                    
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
                    
                    // handle attribute "walkIn"
                    java.lang.String tempAttribWalkIn =
                        
                                reader.getAttributeValue(null,"walkIn");
                            
                   if (tempAttribWalkIn!=null){
                         java.lang.String content = tempAttribWalkIn;
                        
                                                 object.setWalkIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribWalkIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("walkIn");
                    
                    // handle attribute "noPost"
                    java.lang.String tempAttribNoPost =
                        
                                reader.getAttributeValue(null,"noPost");
                            
                   if (tempAttribNoPost!=null){
                         java.lang.String content = tempAttribNoPost;
                        
                                                 object.setNoPost(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribNoPost));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("noPost");
                    
                    // handle attribute "remoteCo"
                    java.lang.String tempAttribRemoteCo =
                        
                                reader.getAttributeValue(null,"remoteCo");
                            
                   if (tempAttribRemoteCo!=null){
                         java.lang.String content = tempAttribRemoteCo;
                        
                                                 object.setRemoteCo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRemoteCo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("remoteCo");
                    
                    // handle attribute "group"
                    java.lang.String tempAttribGroup =
                        
                                reader.getAttributeValue(null,"group");
                            
                   if (tempAttribGroup!=null){
                         java.lang.String content = tempAttribGroup;
                        
                                                 object.setGroup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGroup));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("group");
                    
                    // handle attribute "attachPreferenceProfile"
                    java.lang.String tempAttribAttachPreferenceProfile =
                        
                                reader.getAttributeValue(null,"attachPreferenceProfile");
                            
                   if (tempAttribAttachPreferenceProfile!=null){
                         java.lang.String content = tempAttribAttachPreferenceProfile;
                        
                                                 object.setAttachPreferenceProfile(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAttachPreferenceProfile));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("attachPreferenceProfile");
                    
                    // handle attribute "allowPreRegisteration"
                    java.lang.String tempAttribAllowPreRegisteration =
                        
                                reader.getAttributeValue(null,"allowPreRegisteration");
                            
                   if (tempAttribAllowPreRegisteration!=null){
                         java.lang.String content = tempAttribAllowPreRegisteration;
                        
                                                 object.setAllowPreRegisteration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAllowPreRegisteration));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("allowPreRegisteration");
                    
                    // handle attribute "preRegisterFlag"
                    java.lang.String tempAttribPreRegisterFlag =
                        
                                reader.getAttributeValue(null,"preRegisterFlag");
                            
                   if (tempAttribPreRegisterFlag!=null){
                         java.lang.String content = tempAttribPreRegisterFlag;
                        
                                                 object.setPreRegisterFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPreRegisterFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("preRegisterFlag");
                    
                    // handle attribute "keyExpirationDate"
                    java.lang.String tempAttribKeyExpirationDate =
                        
                                reader.getAttributeValue(null,"keyExpirationDate");
                            
                   if (tempAttribKeyExpirationDate!=null){
                         java.lang.String content = tempAttribKeyExpirationDate;
                        
                                                 object.setKeyExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribKeyExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("keyExpirationDate");
                    
                    // handle attribute "totalCreditCardSurcharges"
                    java.lang.String tempAttribTotalCreditCardSurcharges =
                        
                                reader.getAttributeValue(null,"totalCreditCardSurcharges");
                            
                   if (tempAttribTotalCreditCardSurcharges!=null){
                         java.lang.String content = tempAttribTotalCreditCardSurcharges;
                        
                                                 object.setTotalCreditCardSurcharges(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribTotalCreditCardSurcharges));
                                            
                    } else {
                       
                                           object.setTotalCreditCardSurcharges(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("totalCreditCardSurcharges");
                    
                    // handle attribute "DoNotMoveRoom"
                    java.lang.String tempAttribDoNotMoveRoom =
                        
                                reader.getAttributeValue(null,"DoNotMoveRoom");
                            
                   if (tempAttribDoNotMoveRoom!=null){
                         java.lang.String content = tempAttribDoNotMoveRoom;
                        
                                                 object.setDoNotMoveRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDoNotMoveRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DoNotMoveRoom");
                    
                    // handle attribute "OptIn"
                    java.lang.String tempAttribOptIn =
                        
                                reader.getAttributeValue(null,"OptIn");
                            
                   if (tempAttribOptIn!=null){
                         java.lang.String content = tempAttribOptIn;
                        
                                                 object.setOptIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOptIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OptIn");
                    
                    // handle attribute "OptInComplete"
                    java.lang.String tempAttribOptInComplete =
                        
                                reader.getAttributeValue(null,"OptInComplete");
                            
                   if (tempAttribOptInComplete!=null){
                         java.lang.String content = tempAttribOptInComplete;
                        
                                                 object.setOptInComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOptInComplete));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OptInComplete");
                    
                    // handle attribute "commentsExists"
                    java.lang.String tempAttribCommentsExists =
                        
                                reader.getAttributeValue(null,"commentsExists");
                            
                   if (tempAttribCommentsExists!=null){
                         java.lang.String content = tempAttribCommentsExists;
                        
                                                 object.setCommentsExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCommentsExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commentsExists");
                    
                    // handle attribute "commentsCount"
                    java.lang.String tempAttribCommentsCount =
                        
                                reader.getAttributeValue(null,"commentsCount");
                            
                   if (tempAttribCommentsCount!=null){
                         java.lang.String content = tempAttribCommentsCount;
                        
                                                 object.setCommentsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribCommentsCount));
                                            
                    } else {
                       
                                           object.setCommentsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("commentsCount");
                    
                    // handle attribute "tracesExists"
                    java.lang.String tempAttribTracesExists =
                        
                                reader.getAttributeValue(null,"tracesExists");
                            
                   if (tempAttribTracesExists!=null){
                         java.lang.String content = tempAttribTracesExists;
                        
                                                 object.setTracesExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTracesExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("tracesExists");
                    
                    // handle attribute "tracesCount"
                    java.lang.String tempAttribTracesCount =
                        
                                reader.getAttributeValue(null,"tracesCount");
                            
                   if (tempAttribTracesCount!=null){
                         java.lang.String content = tempAttribTracesCount;
                        
                                                 object.setTracesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribTracesCount));
                                            
                    } else {
                       
                                           object.setTracesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("tracesCount");
                    
                    // handle attribute "specialsExists"
                    java.lang.String tempAttribSpecialsExists =
                        
                                reader.getAttributeValue(null,"specialsExists");
                            
                   if (tempAttribSpecialsExists!=null){
                         java.lang.String content = tempAttribSpecialsExists;
                        
                                                 object.setSpecialsExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSpecialsExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("specialsExists");
                    
                    // handle attribute "specialsCount"
                    java.lang.String tempAttribSpecialsCount =
                        
                                reader.getAttributeValue(null,"specialsCount");
                            
                   if (tempAttribSpecialsCount!=null){
                         java.lang.String content = tempAttribSpecialsCount;
                        
                                                 object.setSpecialsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribSpecialsCount));
                                            
                    } else {
                       
                                           object.setSpecialsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("specialsCount");
                    
                    // handle attribute "roomPreferenceExists"
                    java.lang.String tempAttribRoomPreferenceExists =
                        
                                reader.getAttributeValue(null,"roomPreferenceExists");
                            
                   if (tempAttribRoomPreferenceExists!=null){
                         java.lang.String content = tempAttribRoomPreferenceExists;
                        
                                                 object.setRoomPreferenceExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRoomPreferenceExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomPreferenceExists");
                    
                    // handle attribute "roomPreferencesCount"
                    java.lang.String tempAttribRoomPreferencesCount =
                        
                                reader.getAttributeValue(null,"roomPreferencesCount");
                            
                   if (tempAttribRoomPreferencesCount!=null){
                         java.lang.String content = tempAttribRoomPreferencesCount;
                        
                                                 object.setRoomPreferencesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribRoomPreferencesCount));
                                            
                    } else {
                       
                                           object.setRoomPreferencesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("roomPreferencesCount");
                    
                    // handle attribute "shareExists"
                    java.lang.String tempAttribShareExists =
                        
                                reader.getAttributeValue(null,"shareExists");
                            
                   if (tempAttribShareExists!=null){
                         java.lang.String content = tempAttribShareExists;
                        
                                                 object.setShareExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribShareExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("shareExists");
                    
                    // handle attribute "queueExists"
                    java.lang.String tempAttribQueueExists =
                        
                                reader.getAttributeValue(null,"queueExists");
                            
                   if (tempAttribQueueExists!=null){
                         java.lang.String content = tempAttribQueueExists;
                        
                                                 object.setQueueExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribQueueExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("queueExists");
                    
                    // handle attribute "queueNumber"
                    java.lang.String tempAttribQueueNumber =
                        
                                reader.getAttributeValue(null,"queueNumber");
                            
                   if (tempAttribQueueNumber!=null){
                         java.lang.String content = tempAttribQueueNumber;
                        
                                                 object.setQueueNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribQueueNumber));
                                            
                    } else {
                       
                                           object.setQueueNumber(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("queueNumber");
                    
                    // handle attribute "alertExists"
                    java.lang.String tempAttribAlertExists =
                        
                                reader.getAttributeValue(null,"alertExists");
                            
                   if (tempAttribAlertExists!=null){
                         java.lang.String content = tempAttribAlertExists;
                        
                                                 object.setAlertExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAlertExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("alertExists");
                    
                    // handle attribute "alertsCount"
                    java.lang.String tempAttribAlertsCount =
                        
                                reader.getAttributeValue(null,"alertsCount");
                            
                   if (tempAttribAlertsCount!=null){
                         java.lang.String content = tempAttribAlertsCount;
                        
                                                 object.setAlertsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribAlertsCount));
                                            
                    } else {
                       
                                           object.setAlertsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("alertsCount");
                    
                    // handle attribute "messageExists"
                    java.lang.String tempAttribMessageExists =
                        
                                reader.getAttributeValue(null,"messageExists");
                            
                   if (tempAttribMessageExists!=null){
                         java.lang.String content = tempAttribMessageExists;
                        
                                                 object.setMessageExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMessageExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("messageExists");
                    
                    // handle attribute "messagesCount"
                    java.lang.String tempAttribMessagesCount =
                        
                                reader.getAttributeValue(null,"messagesCount");
                            
                   if (tempAttribMessagesCount!=null){
                         java.lang.String content = tempAttribMessagesCount;
                        
                                                 object.setMessagesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMessagesCount));
                                            
                    } else {
                       
                                           object.setMessagesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("messagesCount");
                    
                    // handle attribute "checkOutTime"
                    java.lang.String tempAttribCheckOutTime =
                        
                                reader.getAttributeValue(null,"checkOutTime");
                            
                   if (tempAttribCheckOutTime!=null){
                         java.lang.String content = tempAttribCheckOutTime;
                        
                                                 object.setCheckOutTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribCheckOutTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("checkOutTime");
                    
                    // handle attribute "computedReservationStatus"
                    java.lang.String tempAttribComputedReservationStatus =
                        
                                reader.getAttributeValue(null,"computedReservationStatus");
                            
                   if (tempAttribComputedReservationStatus!=null){
                         java.lang.String content = tempAttribComputedReservationStatus;
                        
                                                  object.setComputedReservationStatus(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.fromString(reader,tempAttribComputedReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("computedReservationStatus");
                    
                    // handle attribute "financialTransactionExists"
                    java.lang.String tempAttribFinancialTransactionExists =
                        
                                reader.getAttributeValue(null,"financialTransactionExists");
                            
                   if (tempAttribFinancialTransactionExists!=null){
                         java.lang.String content = tempAttribFinancialTransactionExists;
                        
                                                 object.setFinancialTransactionExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFinancialTransactionExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("financialTransactionExists");
                    
                    // handle attribute "printRate"
                    java.lang.String tempAttribPrintRate =
                        
                                reader.getAttributeValue(null,"printRate");
                            
                   if (tempAttribPrintRate!=null){
                         java.lang.String content = tempAttribPrintRate;
                        
                                                 object.setPrintRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPrintRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("printRate");
                    
                    // handle attribute "referralYN"
                    java.lang.String tempAttribReferralYN =
                        
                                reader.getAttributeValue(null,"referralYN");
                            
                   if (tempAttribReferralYN!=null){
                         java.lang.String content = tempAttribReferralYN;
                        
                                                 object.setReferralYN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReferralYN));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("referralYN");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList").equals(reader.getName())){
                                
                                                object.setUniqueIDList(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RoomStays").equals(reader.getName())){
                                
                                                object.setRoomStays(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomStay.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResGuests").equals(reader.getName())){
                                
                                                object.setResGuests(com.cloudkey.pms.micros.og.reservation.ArrayOfResGuest.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","WrittenConfInst").equals(reader.getName())){
                                
                                                object.setWrittenConfInst(com.cloudkey.pms.micros.og.reservation.WrittenConfInst.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationHistory").equals(reader.getName())){
                                
                                                object.setReservationHistory(com.cloudkey.pms.micros.og.common.History.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UserDefinedValues").equals(reader.getName())){
                                
                                                object.setUserDefinedValues(com.cloudkey.pms.micros.og.common.ArrayOfUserDefinedValue.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Invoice").equals(reader.getName())){
                                
                                                object.setInvoice(com.cloudkey.pms.micros.og.reservation.BillHeader.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Preferences").equals(reader.getName())){
                                
                                                object.setPreferences(com.cloudkey.pms.micros.og.name.ArrayOfPreference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.cloudkey.pms.micros.og.reservation.Alert.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
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
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts").equals(reader.getName())){
                                                                    list9.add(com.cloudkey.pms.micros.og.reservation.Alert.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAlerts((com.cloudkey.pms.micros.og.reservation.Alert[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.Alert.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
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
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings").equals(reader.getName())){
                                                                    list10.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayRoutings((com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
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
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods").equals(reader.getName())){
                                                                    list11.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayMethods((com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","AccompanyGuests").equals(reader.getName())){
                                
                                                object.setAccompanyGuests(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAccompanyGuest.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ECertificate").equals(reader.getName())){
                                
                                                object.setECertificate(com.cloudkey.pms.micros.og.membership.ECertificate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ShareReservations").equals(reader.getName())){
                                
                                                object.setShareReservations(com.cloudkey.pms.micros.og.reservation.ArrayOfShareReservation.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Miscellaneous").equals(reader.getName())){
                                
                                                object.setMiscellaneous(com.cloudkey.pms.micros.og.reservation.MoreFields.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationVouchers").equals(reader.getName())){
                                
                                                object.setReservationVouchers(com.cloudkey.pms.micros.og.reservation.ArrayOfReservationVoucher.Factory.parse(reader));
                                              
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
           
    