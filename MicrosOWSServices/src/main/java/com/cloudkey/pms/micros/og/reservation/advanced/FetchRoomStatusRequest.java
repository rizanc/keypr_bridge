
/**
 * FetchRoomStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  FetchRoomStatusRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FetchRoomStatusRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/og/4.3/ResvAdvanced/",
                "FetchRoomStatusRequest",
                "ns6");

            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                

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
                            
                                            this.localHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected java.util.Date localStartDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartDateTracker = false ;

                           public boolean isStartDateSpecified(){
                               return localStartDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Date param){
                            localStartDateTracker = param != null;
                                   
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected java.util.Date localEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndDateTracker = false ;

                           public boolean isEndDateSpecified(){
                               return localEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(java.util.Date param){
                            localEndDateTracker = param != null;
                                   
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for Features
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList localFeatures ;
                                
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
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList getFeatures(){
                               return localFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Features
                               */
                               public void setFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList param){
                            localFeaturesTracker = param != null;
                                   
                                            this.localFeatures=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomType(){
                               return localRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomType
                               */
                               public void setRoomType(java.lang.String param){
                            
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for RoomNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomNumber(){
                               return localRoomNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomNumber
                               */
                               public void setRoomNumber(java.lang.String param){
                            
                                            this.localRoomNumber=param;
                                    

                               }
                            

                        /**
                        * field for EndRoomNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEndRoomNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEndRoomNumber(){
                               return localEndRoomNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndRoomNumber
                               */
                               public void setEndRoomNumber(java.lang.String param){
                            
                                            this.localEndRoomNumber=param;
                                    

                               }
                            

                        /**
                        * field for FloorNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFloorNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFloorNumber(){
                               return localFloorNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FloorNumber
                               */
                               public void setFloorNumber(java.lang.String param){
                            
                                            this.localFloorNumber=param;
                                    

                               }
                            

                        /**
                        * field for SmokingPreference
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSmokingPreference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSmokingPreference(){
                               return localSmokingPreference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmokingPreference
                               */
                               public void setSmokingPreference(java.lang.String param){
                            
                                            this.localSmokingPreference=param;
                                    

                               }
                            

                        /**
                        * field for RoomClass
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomClass ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomClass(){
                               return localRoomClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomClass
                               */
                               public void setRoomClass(java.lang.String param){
                            
                                            this.localRoomClass=param;
                                    

                               }
                            

                        /**
                        * field for ReservationStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReservationStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReservationStatus(){
                               return localReservationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationStatus
                               */
                               public void setReservationStatus(java.lang.String param){
                            
                                            this.localReservationStatus=param;
                                    

                               }
                            

                        /**
                        * field for HouseKeepingSection
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHouseKeepingSection ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHouseKeepingSection(){
                               return localHouseKeepingSection;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseKeepingSection
                               */
                               public void setHouseKeepingSection(java.lang.String param){
                            
                                            this.localHouseKeepingSection=param;
                                    

                               }
                            

                        /**
                        * field for IncludeDirtyRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeDirtyRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeDirtyRoom(){
                               return localIncludeDirtyRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeDirtyRoom
                               */
                               public void setIncludeDirtyRoom(boolean param){
                            
                                            this.localIncludeDirtyRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludeCleanRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeCleanRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeCleanRoom(){
                               return localIncludeCleanRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeCleanRoom
                               */
                               public void setIncludeCleanRoom(boolean param){
                            
                                            this.localIncludeCleanRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludeInspectedRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeInspectedRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeInspectedRoom(){
                               return localIncludeInspectedRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeInspectedRoom
                               */
                               public void setIncludeInspectedRoom(boolean param){
                            
                                            this.localIncludeInspectedRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludeOOORoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeOOORoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeOOORoom(){
                               return localIncludeOOORoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeOOORoom
                               */
                               public void setIncludeOOORoom(boolean param){
                            
                                            this.localIncludeOOORoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludeOOSRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeOOSRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeOOSRoom(){
                               return localIncludeOOSRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeOOSRoom
                               */
                               public void setIncludeOOSRoom(boolean param){
                            
                                            this.localIncludeOOSRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludePickUpRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludePickUpRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludePickUpRoom(){
                               return localIncludePickUpRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludePickUpRoom
                               */
                               public void setIncludePickUpRoom(boolean param){
                            
                                            this.localIncludePickUpRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludePseudoRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludePseudoRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludePseudoRoom(){
                               return localIncludePseudoRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludePseudoRoom
                               */
                               public void setIncludePseudoRoom(boolean param){
                            
                                            this.localIncludePseudoRoom=param;
                                    

                               }
                            

                        /**
                        * field for IncludeOccupied
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeOccupied =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeOccupied(){
                               return localIncludeOccupied;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeOccupied
                               */
                               public void setIncludeOccupied(boolean param){
                            
                                            this.localIncludeOccupied=param;
                                    

                               }
                            

                        /**
                        * field for IncludeVacant
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeVacant =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeVacant(){
                               return localIncludeVacant;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeVacant
                               */
                               public void setIncludeVacant(boolean param){
                            
                                            this.localIncludeVacant=param;
                                    

                               }
                            

                        /**
                        * field for IncludeDueOut
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeDueOut =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeDueOut(){
                               return localIncludeDueOut;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeDueOut
                               */
                               public void setIncludeDueOut(boolean param){
                            
                                            this.localIncludeDueOut=param;
                                    

                               }
                            

                        /**
                        * field for IncludeCheckedOut
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeCheckedOut =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeCheckedOut(){
                               return localIncludeCheckedOut;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeCheckedOut
                               */
                               public void setIncludeCheckedOut(boolean param){
                            
                                            this.localIncludeCheckedOut=param;
                                    

                               }
                            

                        /**
                        * field for IncludeRoomCondition
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeRoomCondition =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeRoomCondition(){
                               return localIncludeRoomCondition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeRoomCondition
                               */
                               public void setIncludeRoomCondition(boolean param){
                            
                                            this.localIncludeRoomCondition=param;
                                    

                               }
                            

                        /**
                        * field for IncludeConnectingRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeConnectingRoom =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeConnectingRoom(){
                               return localIncludeConnectingRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeConnectingRoom
                               */
                               public void setIncludeConnectingRoom(boolean param){
                            
                                            this.localIncludeConnectingRoom=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/ResvAdvanced/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FetchRoomStatusRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FetchRoomStatusRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomType != null){
                                        
                                                writeAttribute("",
                                                         "RoomType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomNumber != null){
                                        
                                                writeAttribute("",
                                                         "RoomNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localEndRoomNumber != null){
                                        
                                                writeAttribute("",
                                                         "EndRoomNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndRoomNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localFloorNumber != null){
                                        
                                                writeAttribute("",
                                                         "FloorNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloorNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localSmokingPreference != null){
                                        
                                                writeAttribute("",
                                                         "SmokingPreference",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomClass != null){
                                        
                                                writeAttribute("",
                                                         "RoomClass",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass), xmlWriter);

                                            
                                      }
                                    
                                            if (localReservationStatus != null){
                                        
                                                writeAttribute("",
                                                         "ReservationStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReservationStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localHouseKeepingSection != null){
                                        
                                                writeAttribute("",
                                                         "HouseKeepingSection",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingSection), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeDirtyRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDirtyRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeCleanRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeCleanRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeInspectedRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeInspectedRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeOOORoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOOORoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeOOSRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOOSRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludePickUpRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePickUpRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludePseudoRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePseudoRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeOccupied",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOccupied), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeVacant",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeVacant), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeDueOut",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDueOut), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeCheckedOut",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeCheckedOut), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeRoomCondition",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeRoomCondition), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludeConnectingRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeConnectingRoom), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","HotelReference"),
                                               xmlWriter);
                                         if (localStartDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "StartDate", xmlWriter);
                             

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "EndDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFeaturesTracker){
                                            if (localFeatures==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                            }
                                           localFeatures.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Features"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/ResvAdvanced/")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                 if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "StartDate"));
                                 
                                        if (localStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                        }
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "EndDate"));
                                 
                                        if (localEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                        }
                                    } if (localFeaturesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Features"));
                            
                            
                                    if (localFeatures==null){
                                         throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                    }
                                    elementList.add(localFeatures);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","EndRoomNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndRoomNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FloorNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloorNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SmokingPreference"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomClass"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReservationStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReservationStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HouseKeepingSection"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingSection));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeDirtyRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDirtyRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeCleanRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeCleanRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeInspectedRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeInspectedRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeOOORoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOOORoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeOOSRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOOSRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludePickUpRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePickUpRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludePseudoRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePseudoRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeOccupied"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeOccupied));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeVacant"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeVacant));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeDueOut"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDueOut));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeCheckedOut"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeCheckedOut));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeRoomCondition"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeRoomCondition));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludeConnectingRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeConnectingRoom));
                                

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
        public static FetchRoomStatusRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FetchRoomStatusRequest object =
                new FetchRoomStatusRequest();

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
                    
                            if (!"FetchRoomStatusRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FetchRoomStatusRequest)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "RoomType"
                    java.lang.String tempAttribRoomType =
                        
                                reader.getAttributeValue(null,"RoomType");
                            
                   if (tempAttribRoomType!=null){
                         java.lang.String content = tempAttribRoomType;
                        
                                                 object.setRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomType");
                    
                    // handle attribute "RoomNumber"
                    java.lang.String tempAttribRoomNumber =
                        
                                reader.getAttributeValue(null,"RoomNumber");
                            
                   if (tempAttribRoomNumber!=null){
                         java.lang.String content = tempAttribRoomNumber;
                        
                                                 object.setRoomNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomNumber");
                    
                    // handle attribute "EndRoomNumber"
                    java.lang.String tempAttribEndRoomNumber =
                        
                                reader.getAttributeValue(null,"EndRoomNumber");
                            
                   if (tempAttribEndRoomNumber!=null){
                         java.lang.String content = tempAttribEndRoomNumber;
                        
                                                 object.setEndRoomNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEndRoomNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EndRoomNumber");
                    
                    // handle attribute "FloorNumber"
                    java.lang.String tempAttribFloorNumber =
                        
                                reader.getAttributeValue(null,"FloorNumber");
                            
                   if (tempAttribFloorNumber!=null){
                         java.lang.String content = tempAttribFloorNumber;
                        
                                                 object.setFloorNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFloorNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("FloorNumber");
                    
                    // handle attribute "SmokingPreference"
                    java.lang.String tempAttribSmokingPreference =
                        
                                reader.getAttributeValue(null,"SmokingPreference");
                            
                   if (tempAttribSmokingPreference!=null){
                         java.lang.String content = tempAttribSmokingPreference;
                        
                                                 object.setSmokingPreference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSmokingPreference));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SmokingPreference");
                    
                    // handle attribute "RoomClass"
                    java.lang.String tempAttribRoomClass =
                        
                                reader.getAttributeValue(null,"RoomClass");
                            
                   if (tempAttribRoomClass!=null){
                         java.lang.String content = tempAttribRoomClass;
                        
                                                 object.setRoomClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomClass));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomClass");
                    
                    // handle attribute "ReservationStatus"
                    java.lang.String tempAttribReservationStatus =
                        
                                reader.getAttributeValue(null,"ReservationStatus");
                            
                   if (tempAttribReservationStatus!=null){
                         java.lang.String content = tempAttribReservationStatus;
                        
                                                 object.setReservationStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReservationStatus");
                    
                    // handle attribute "HouseKeepingSection"
                    java.lang.String tempAttribHouseKeepingSection =
                        
                                reader.getAttributeValue(null,"HouseKeepingSection");
                            
                   if (tempAttribHouseKeepingSection!=null){
                         java.lang.String content = tempAttribHouseKeepingSection;
                        
                                                 object.setHouseKeepingSection(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHouseKeepingSection));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HouseKeepingSection");
                    
                    // handle attribute "IncludeDirtyRoom"
                    java.lang.String tempAttribIncludeDirtyRoom =
                        
                                reader.getAttributeValue(null,"IncludeDirtyRoom");
                            
                   if (tempAttribIncludeDirtyRoom!=null){
                         java.lang.String content = tempAttribIncludeDirtyRoom;
                        
                                                 object.setIncludeDirtyRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeDirtyRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeDirtyRoom");
                    
                    // handle attribute "IncludeCleanRoom"
                    java.lang.String tempAttribIncludeCleanRoom =
                        
                                reader.getAttributeValue(null,"IncludeCleanRoom");
                            
                   if (tempAttribIncludeCleanRoom!=null){
                         java.lang.String content = tempAttribIncludeCleanRoom;
                        
                                                 object.setIncludeCleanRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeCleanRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeCleanRoom");
                    
                    // handle attribute "IncludeInspectedRoom"
                    java.lang.String tempAttribIncludeInspectedRoom =
                        
                                reader.getAttributeValue(null,"IncludeInspectedRoom");
                            
                   if (tempAttribIncludeInspectedRoom!=null){
                         java.lang.String content = tempAttribIncludeInspectedRoom;
                        
                                                 object.setIncludeInspectedRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeInspectedRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeInspectedRoom");
                    
                    // handle attribute "IncludeOOORoom"
                    java.lang.String tempAttribIncludeOOORoom =
                        
                                reader.getAttributeValue(null,"IncludeOOORoom");
                            
                   if (tempAttribIncludeOOORoom!=null){
                         java.lang.String content = tempAttribIncludeOOORoom;
                        
                                                 object.setIncludeOOORoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeOOORoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeOOORoom");
                    
                    // handle attribute "IncludeOOSRoom"
                    java.lang.String tempAttribIncludeOOSRoom =
                        
                                reader.getAttributeValue(null,"IncludeOOSRoom");
                            
                   if (tempAttribIncludeOOSRoom!=null){
                         java.lang.String content = tempAttribIncludeOOSRoom;
                        
                                                 object.setIncludeOOSRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeOOSRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeOOSRoom");
                    
                    // handle attribute "IncludePickUpRoom"
                    java.lang.String tempAttribIncludePickUpRoom =
                        
                                reader.getAttributeValue(null,"IncludePickUpRoom");
                            
                   if (tempAttribIncludePickUpRoom!=null){
                         java.lang.String content = tempAttribIncludePickUpRoom;
                        
                                                 object.setIncludePickUpRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludePickUpRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludePickUpRoom");
                    
                    // handle attribute "IncludePseudoRoom"
                    java.lang.String tempAttribIncludePseudoRoom =
                        
                                reader.getAttributeValue(null,"IncludePseudoRoom");
                            
                   if (tempAttribIncludePseudoRoom!=null){
                         java.lang.String content = tempAttribIncludePseudoRoom;
                        
                                                 object.setIncludePseudoRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludePseudoRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludePseudoRoom");
                    
                    // handle attribute "IncludeOccupied"
                    java.lang.String tempAttribIncludeOccupied =
                        
                                reader.getAttributeValue(null,"IncludeOccupied");
                            
                   if (tempAttribIncludeOccupied!=null){
                         java.lang.String content = tempAttribIncludeOccupied;
                        
                                                 object.setIncludeOccupied(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeOccupied));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeOccupied");
                    
                    // handle attribute "IncludeVacant"
                    java.lang.String tempAttribIncludeVacant =
                        
                                reader.getAttributeValue(null,"IncludeVacant");
                            
                   if (tempAttribIncludeVacant!=null){
                         java.lang.String content = tempAttribIncludeVacant;
                        
                                                 object.setIncludeVacant(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeVacant));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeVacant");
                    
                    // handle attribute "IncludeDueOut"
                    java.lang.String tempAttribIncludeDueOut =
                        
                                reader.getAttributeValue(null,"IncludeDueOut");
                            
                   if (tempAttribIncludeDueOut!=null){
                         java.lang.String content = tempAttribIncludeDueOut;
                        
                                                 object.setIncludeDueOut(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeDueOut));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeDueOut");
                    
                    // handle attribute "IncludeCheckedOut"
                    java.lang.String tempAttribIncludeCheckedOut =
                        
                                reader.getAttributeValue(null,"IncludeCheckedOut");
                            
                   if (tempAttribIncludeCheckedOut!=null){
                         java.lang.String content = tempAttribIncludeCheckedOut;
                        
                                                 object.setIncludeCheckedOut(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeCheckedOut));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeCheckedOut");
                    
                    // handle attribute "IncludeRoomCondition"
                    java.lang.String tempAttribIncludeRoomCondition =
                        
                                reader.getAttributeValue(null,"IncludeRoomCondition");
                            
                   if (tempAttribIncludeRoomCondition!=null){
                         java.lang.String content = tempAttribIncludeRoomCondition;
                        
                                                 object.setIncludeRoomCondition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeRoomCondition));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeRoomCondition");
                    
                    // handle attribute "IncludeConnectingRoom"
                    java.lang.String tempAttribIncludeConnectingRoom =
                        
                                reader.getAttributeValue(null,"IncludeConnectingRoom");
                            
                   if (tempAttribIncludeConnectingRoom!=null){
                         java.lang.String content = tempAttribIncludeConnectingRoom;
                        
                                                 object.setIncludeConnectingRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeConnectingRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludeConnectingRoom");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","StartDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StartDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","EndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Features").equals(reader.getName())){
                                
                                                object.setFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList.Factory.parse(reader));
                                              
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
           
    