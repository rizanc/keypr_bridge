
/**
 * RoomType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RoomType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomType
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for RoomTypeDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomTypeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeDescriptionTracker = false ;

                           public boolean isRoomTypeDescriptionSpecified(){
                               return localRoomTypeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomTypeDescription(){
                               return localRoomTypeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeDescription
                               */
                               public void setRoomTypeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomTypeDescriptionTracker = param != null;
                                   
                                            this.localRoomTypeDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeShortDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomTypeShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeShortDescriptionTracker = false ;

                           public boolean isRoomTypeShortDescriptionSpecified(){
                               return localRoomTypeShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomTypeShortDescription(){
                               return localRoomTypeShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeShortDescription
                               */
                               public void setRoomTypeShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomTypeShortDescriptionTracker = param != null;
                                   
                                            this.localRoomTypeShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomNumber
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRoomNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomNumberTracker = false ;

                           public boolean isRoomNumberSpecified(){
                               return localRoomNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRoomNumber(){
                               return localRoomNumber;
                           }

                           
                        


                               
                              /**
                               * validate the array for RoomNumber
                               */
                              protected void validateRoomNumber(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RoomNumber
                              */
                              public void setRoomNumber(java.lang.String[] param){
                              
                                   validateRoomNumber(param);

                               localRoomNumberTracker = param != null;
                                      
                                      this.localRoomNumber=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRoomNumber(java.lang.String param){
                                   if (localRoomNumber == null){
                                   localRoomNumber = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRoomNumberTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRoomNumber);
                               list.add(param);
                               this.localRoomNumber =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for RoomToChargeDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomToChargeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomToChargeDescriptionTracker = false ;

                           public boolean isRoomToChargeDescriptionSpecified(){
                               return localRoomToChargeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomToChargeDescription(){
                               return localRoomToChargeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomToChargeDescription
                               */
                               public void setRoomToChargeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomToChargeDescriptionTracker = param != null;
                                   
                                            this.localRoomToChargeDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomToChargeShortDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomToChargeShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomToChargeShortDescriptionTracker = false ;

                           public boolean isRoomToChargeShortDescriptionSpecified(){
                               return localRoomToChargeShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomToChargeShortDescription(){
                               return localRoomToChargeShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomToChargeShortDescription
                               */
                               public void setRoomToChargeShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomToChargeShortDescriptionTracker = param != null;
                                   
                                            this.localRoomToChargeShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for AmenityInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo localAmenityInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmenityInfoTracker = false ;

                           public boolean isAmenityInfoSpecified(){
                               return localAmenityInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo getAmenityInfo(){
                               return localAmenityInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmenityInfo
                               */
                               public void setAmenityInfo(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo param){
                            localAmenityInfoTracker = param != null;
                                   
                                            this.localAmenityInfo=param;
                                    

                               }
                            

                        /**
                        * field for RoomFeatures
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList localRoomFeatures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomFeaturesTracker = false ;

                           public boolean isRoomFeaturesSpecified(){
                               return localRoomFeaturesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList getRoomFeatures(){
                               return localRoomFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomFeatures
                               */
                               public void setRoomFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList param){
                            localRoomFeaturesTracker = param != null;
                                   
                                            this.localRoomFeatures=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomTypeCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeCode(){
                               return localRoomTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeCode
                               */
                               public void setRoomTypeCode(java.lang.String param){
                            
                                            this.localRoomTypeCode=param;
                                    

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
                        * field for Feature
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFeature ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFeature(){
                               return localFeature;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Feature
                               */
                               public void setFeature(java.lang.String param){
                            
                                            this.localFeature=param;
                                    

                               }
                            

                        /**
                        * field for UpgradeFromCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUpgradeFromCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpgradeFromCode(){
                               return localUpgradeFromCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpgradeFromCode
                               */
                               public void setUpgradeFromCode(java.lang.String param){
                            
                                            this.localUpgradeFromCode=param;
                                    

                               }
                            

                        /**
                        * field for InvBlockCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInvBlockCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInvBlockCode(){
                               return localInvBlockCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InvBlockCode
                               */
                               public void setInvBlockCode(java.lang.String param){
                            
                                            this.localInvBlockCode=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfUnits
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfUnits ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfUnits(){
                               return localNumberOfUnits;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfUnits
                               */
                               public void setNumberOfUnits(int param){
                            
                                            this.localNumberOfUnits=param;
                                    

                               }
                            

                        /**
                        * field for IsRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsRoom(){
                               return localIsRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsRoom
                               */
                               public void setIsRoom(boolean param){
                            
                                            this.localIsRoom=param;
                                    

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
                        * field for RoomTypeName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomTypeName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeName(){
                               return localRoomTypeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeName
                               */
                               public void setRoomTypeName(java.lang.String param){
                            
                                            this.localRoomTypeName=param;
                                    

                               }
                            

                        /**
                        * field for RoomToChargeCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomToChargeCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomToChargeCode(){
                               return localRoomToChargeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomToChargeCode
                               */
                               public void setRoomToChargeCode(java.lang.String param){
                            
                                            this.localRoomToChargeCode=param;
                                    

                               }
                            

                        /**
                        * field for RoomToChargeName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomToChargeName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomToChargeName(){
                               return localRoomToChargeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomToChargeName
                               */
                               public void setRoomToChargeName(java.lang.String param){
                            
                                            this.localRoomToChargeName=param;
                                    

                               }
                            

                        /**
                        * field for RoomStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomStatus(){
                               return localRoomStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStatus
                               */
                               public void setRoomStatus(java.lang.String param){
                            
                                            this.localRoomStatus=param;
                                    

                               }
                            

                        /**
                        * field for PseudoRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPseudoRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPseudoRoom(){
                               return localPseudoRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PseudoRoom
                               */
                               public void setPseudoRoom(boolean param){
                            
                                            this.localPseudoRoom=param;
                                    

                               }
                            

                        /**
                        * field for RoomServiceStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomServiceStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomServiceStatus(){
                               return localRoomServiceStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomServiceStatus
                               */
                               public void setRoomServiceStatus(java.lang.String param){
                            
                                            this.localRoomServiceStatus=param;
                                    

                               }
                            

                        /**
                        * field for MinimumRoomsAvailable
                        * This was an Attribute!
                        */

                        
                                    protected int localMinimumRoomsAvailable ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMinimumRoomsAvailable(){
                               return localMinimumRoomsAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinimumRoomsAvailable
                               */
                               public void setMinimumRoomsAvailable(int param){
                            
                                            this.localMinimumRoomsAvailable=param;
                                    

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
                           namespacePrefix+":RoomType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomTypeCode != null){
                                        
                                                writeAttribute("",
                                                         "roomTypeCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localRoomTypeCode is null");
                                      }
                                    
                                            if (localRoomClass != null){
                                        
                                                writeAttribute("",
                                                         "roomClass",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass), xmlWriter);

                                            
                                      }
                                    
                                            if (localFeature != null){
                                        
                                                writeAttribute("",
                                                         "feature",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeature), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpgradeFromCode != null){
                                        
                                                writeAttribute("",
                                                         "upgradeFromCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpgradeFromCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localInvBlockCode != null){
                                        
                                                writeAttribute("",
                                                         "invBlockCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvBlockCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfUnits!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfUnits",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfUnits), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "isRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsRoom), xmlWriter);

                                            
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
                                    
                                            if (localRoomTypeName != null){
                                        
                                                writeAttribute("",
                                                         "roomTypeName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeName), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomToChargeCode != null){
                                        
                                                writeAttribute("",
                                                         "roomToChargeCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomToChargeCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomToChargeName != null){
                                        
                                                writeAttribute("",
                                                         "roomToChargeName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomToChargeName), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomStatus != null){
                                        
                                                writeAttribute("",
                                                         "roomStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatus), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "pseudoRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPseudoRoom), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomServiceStatus != null){
                                        
                                                writeAttribute("",
                                                         "roomServiceStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomServiceStatus), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMinimumRoomsAvailable!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "minimumRoomsAvailable",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumRoomsAvailable), xmlWriter);

                                            
                                      }
                                     if (localRoomTypeDescriptionTracker){
                                            if (localRoomTypeDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomTypeDescription cannot be null!!");
                                            }
                                           localRoomTypeDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypeDescription"),
                                               xmlWriter);
                                        } if (localRoomTypeShortDescriptionTracker){
                                            if (localRoomTypeShortDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomTypeShortDescription cannot be null!!");
                                            }
                                           localRoomTypeShortDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypeShortDescription"),
                                               xmlWriter);
                                        } if (localRoomNumberTracker){
                             if (localRoomNumber!=null) {
                                   namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                   for (int i = 0;i < localRoomNumber.length;i++){
                                        
                                            if (localRoomNumber[i] != null){
                                        
                                                writeStartElement(null, namespace, "RoomNumber", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("RoomNumber cannot be null!!");
                                    
                             }

                        } if (localRoomToChargeDescriptionTracker){
                                            if (localRoomToChargeDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomToChargeDescription cannot be null!!");
                                            }
                                           localRoomToChargeDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomToChargeDescription"),
                                               xmlWriter);
                                        } if (localRoomToChargeShortDescriptionTracker){
                                            if (localRoomToChargeShortDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomToChargeShortDescription cannot be null!!");
                                            }
                                           localRoomToChargeShortDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomToChargeShortDescription"),
                                               xmlWriter);
                                        } if (localAmenityInfoTracker){
                                            if (localAmenityInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                            }
                                           localAmenityInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AmenityInfo"),
                                               xmlWriter);
                                        } if (localRoomFeaturesTracker){
                                            if (localRoomFeatures==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomFeatures cannot be null!!");
                                            }
                                           localRoomFeatures.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomFeatures"),
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

                 if (localRoomTypeDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomTypeDescription"));
                            
                            
                                    if (localRoomTypeDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomTypeDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomTypeDescription);
                                } if (localRoomTypeShortDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomTypeShortDescription"));
                            
                            
                                    if (localRoomTypeShortDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomTypeShortDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomTypeShortDescription);
                                } if (localRoomNumberTracker){
                            if (localRoomNumber!=null){
                                  for (int i = 0;i < localRoomNumber.length;i++){
                                      
                                         if (localRoomNumber[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                              "RoomNumber"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("RoomNumber cannot be null!!");
                                
                            }

                        } if (localRoomToChargeDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomToChargeDescription"));
                            
                            
                                    if (localRoomToChargeDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomToChargeDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomToChargeDescription);
                                } if (localRoomToChargeShortDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomToChargeShortDescription"));
                            
                            
                                    if (localRoomToChargeShortDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomToChargeShortDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomToChargeShortDescription);
                                } if (localAmenityInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AmenityInfo"));
                            
                            
                                    if (localAmenityInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                    }
                                    elementList.add(localAmenityInfo);
                                } if (localRoomFeaturesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomFeatures"));
                            
                            
                                    if (localRoomFeatures==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomFeatures cannot be null!!");
                                    }
                                    elementList.add(localRoomFeatures);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","roomTypeCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomClass"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","feature"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFeature));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","upgradeFromCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpgradeFromCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","invBlockCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvBlockCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfUnits"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfUnits));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","isRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","effectiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","expirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomTypeName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomToChargeCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomToChargeCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomToChargeName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomToChargeName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pseudoRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPseudoRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomServiceStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomServiceStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","minimumRoomsAvailable"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumRoomsAvailable));
                                

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
        public static RoomType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomType object =
                new RoomType();

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
                    
                            if (!"RoomType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomType)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "roomTypeCode"
                    java.lang.String tempAttribRoomTypeCode =
                        
                                reader.getAttributeValue(null,"roomTypeCode");
                            
                   if (tempAttribRoomTypeCode!=null){
                         java.lang.String content = tempAttribRoomTypeCode;
                        
                                                 object.setRoomTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomTypeCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute roomTypeCode is missing");
                           
                    }
                    handledAttributes.add("roomTypeCode");
                    
                    // handle attribute "roomClass"
                    java.lang.String tempAttribRoomClass =
                        
                                reader.getAttributeValue(null,"roomClass");
                            
                   if (tempAttribRoomClass!=null){
                         java.lang.String content = tempAttribRoomClass;
                        
                                                 object.setRoomClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomClass));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomClass");
                    
                    // handle attribute "feature"
                    java.lang.String tempAttribFeature =
                        
                                reader.getAttributeValue(null,"feature");
                            
                   if (tempAttribFeature!=null){
                         java.lang.String content = tempAttribFeature;
                        
                                                 object.setFeature(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFeature));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("feature");
                    
                    // handle attribute "upgradeFromCode"
                    java.lang.String tempAttribUpgradeFromCode =
                        
                                reader.getAttributeValue(null,"upgradeFromCode");
                            
                   if (tempAttribUpgradeFromCode!=null){
                         java.lang.String content = tempAttribUpgradeFromCode;
                        
                                                 object.setUpgradeFromCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUpgradeFromCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("upgradeFromCode");
                    
                    // handle attribute "invBlockCode"
                    java.lang.String tempAttribInvBlockCode =
                        
                                reader.getAttributeValue(null,"invBlockCode");
                            
                   if (tempAttribInvBlockCode!=null){
                         java.lang.String content = tempAttribInvBlockCode;
                        
                                                 object.setInvBlockCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInvBlockCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("invBlockCode");
                    
                    // handle attribute "numberOfUnits"
                    java.lang.String tempAttribNumberOfUnits =
                        
                                reader.getAttributeValue(null,"numberOfUnits");
                            
                   if (tempAttribNumberOfUnits!=null){
                         java.lang.String content = tempAttribNumberOfUnits;
                        
                                                 object.setNumberOfUnits(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfUnits));
                                            
                    } else {
                       
                                           object.setNumberOfUnits(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfUnits");
                    
                    // handle attribute "isRoom"
                    java.lang.String tempAttribIsRoom =
                        
                                reader.getAttributeValue(null,"isRoom");
                            
                   if (tempAttribIsRoom!=null){
                         java.lang.String content = tempAttribIsRoom;
                        
                                                 object.setIsRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("isRoom");
                    
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
                    
                    // handle attribute "roomTypeName"
                    java.lang.String tempAttribRoomTypeName =
                        
                                reader.getAttributeValue(null,"roomTypeName");
                            
                   if (tempAttribRoomTypeName!=null){
                         java.lang.String content = tempAttribRoomTypeName;
                        
                                                 object.setRoomTypeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomTypeName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomTypeName");
                    
                    // handle attribute "roomToChargeCode"
                    java.lang.String tempAttribRoomToChargeCode =
                        
                                reader.getAttributeValue(null,"roomToChargeCode");
                            
                   if (tempAttribRoomToChargeCode!=null){
                         java.lang.String content = tempAttribRoomToChargeCode;
                        
                                                 object.setRoomToChargeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomToChargeCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomToChargeCode");
                    
                    // handle attribute "roomToChargeName"
                    java.lang.String tempAttribRoomToChargeName =
                        
                                reader.getAttributeValue(null,"roomToChargeName");
                            
                   if (tempAttribRoomToChargeName!=null){
                         java.lang.String content = tempAttribRoomToChargeName;
                        
                                                 object.setRoomToChargeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomToChargeName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomToChargeName");
                    
                    // handle attribute "roomStatus"
                    java.lang.String tempAttribRoomStatus =
                        
                                reader.getAttributeValue(null,"roomStatus");
                            
                   if (tempAttribRoomStatus!=null){
                         java.lang.String content = tempAttribRoomStatus;
                        
                                                 object.setRoomStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomStatus");
                    
                    // handle attribute "pseudoRoom"
                    java.lang.String tempAttribPseudoRoom =
                        
                                reader.getAttributeValue(null,"pseudoRoom");
                            
                   if (tempAttribPseudoRoom!=null){
                         java.lang.String content = tempAttribPseudoRoom;
                        
                                                 object.setPseudoRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPseudoRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("pseudoRoom");
                    
                    // handle attribute "roomServiceStatus"
                    java.lang.String tempAttribRoomServiceStatus =
                        
                                reader.getAttributeValue(null,"roomServiceStatus");
                            
                   if (tempAttribRoomServiceStatus!=null){
                         java.lang.String content = tempAttribRoomServiceStatus;
                        
                                                 object.setRoomServiceStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomServiceStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomServiceStatus");
                    
                    // handle attribute "minimumRoomsAvailable"
                    java.lang.String tempAttribMinimumRoomsAvailable =
                        
                                reader.getAttributeValue(null,"minimumRoomsAvailable");
                            
                   if (tempAttribMinimumRoomsAvailable!=null){
                         java.lang.String content = tempAttribMinimumRoomsAvailable;
                        
                                                 object.setMinimumRoomsAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMinimumRoomsAvailable));
                                            
                    } else {
                       
                                           object.setMinimumRoomsAvailable(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("minimumRoomsAvailable");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypeDescription").equals(reader.getName())){
                                
                                                object.setRoomTypeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypeShortDescription").equals(reader.getName())){
                                
                                                object.setRoomTypeShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomNumber").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomNumber").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setRoomNumber((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomToChargeDescription").equals(reader.getName())){
                                
                                                object.setRoomToChargeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomToChargeShortDescription").equals(reader.getName())){
                                
                                                object.setRoomToChargeShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AmenityInfo").equals(reader.getName())){
                                
                                                object.setAmenityInfo(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomFeatures").equals(reader.getName())){
                                
                                                object.setRoomFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList.Factory.parse(reader));
                                              
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
           
    