
/**
 * FetchCalendarRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.availability;
            

            /**
            *  FetchCalendarRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FetchCalendarRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/ows/5.1/Availability.wsdl",
                "FetchCalendarRequest",
                "ns7");

            

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
                        * field for StayDateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localStayDateRange ;
                                

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
                            
                                            this.localStayDateRange=param;
                                    

                               }
                            

                        /**
                        * field for GuestCount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuestCountList localGuestCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuestCountTracker = false ;

                           public boolean isGuestCountSpecified(){
                               return localGuestCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuestCountList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuestCountList getGuestCount(){
                               return localGuestCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestCount
                               */
                               public void setGuestCount(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList param){
                            localGuestCountTracker = param != null;
                                   
                                            this.localGuestCount=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanCode
                        */

                        
                                    protected java.lang.String localRatePlanCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanCodeTracker = false ;

                           public boolean isRatePlanCodeSpecified(){
                               return localRatePlanCodeTracker;
                           }

                           

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
                            localRatePlanCodeTracker = param != null;
                                   
                                            this.localRatePlanCode=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeCode
                        */

                        
                                    protected java.lang.String localRoomTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeCodeTracker = false ;

                           public boolean isRoomTypeCodeSpecified(){
                               return localRoomTypeCodeTracker;
                           }

                           

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
                            localRoomTypeCodeTracker = param != null;
                                   
                                            this.localRoomTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for BlockCode
                        */

                        
                                    protected java.lang.String localBlockCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlockCodeTracker = false ;

                           public boolean isBlockCodeSpecified(){
                               return localBlockCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockCode(){
                               return localBlockCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockCode
                               */
                               public void setBlockCode(java.lang.String param){
                            localBlockCodeTracker = param != null;
                                   
                                            this.localBlockCode=param;
                                    

                               }
                            

                        /**
                        * field for CorporateCode
                        */

                        
                                    protected java.lang.String localCorporateCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCorporateCodeTracker = false ;

                           public boolean isCorporateCodeSpecified(){
                               return localCorporateCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCorporateCode(){
                               return localCorporateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CorporateCode
                               */
                               public void setCorporateCode(java.lang.String param){
                            localCorporateCodeTracker = param != null;
                                   
                                            this.localCorporateCode=param;
                                    

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
                        * field for NumberOfNights
                        */

                        
                                    protected int localNumberOfNights ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfNightsTracker = false ;

                           public boolean isNumberOfNightsSpecified(){
                               return localNumberOfNightsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfNights(){
                               return localNumberOfNights;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfNights
                               */
                               public void setNumberOfNights(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfNightsTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfNights=param;
                                    

                               }
                            

                        /**
                        * field for RestrictedMode
                        */

                        
                                    protected boolean localRestrictedMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRestrictedModeTracker = false ;

                           public boolean isRestrictedModeSpecified(){
                               return localRestrictedModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRestrictedMode(){
                               return localRestrictedMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RestrictedMode
                               */
                               public void setRestrictedMode(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localRestrictedModeTracker =
                                       true;
                                   
                                            this.localRestrictedMode=param;
                                    

                               }
                            

                        /**
                        * field for InventoryMode
                        */

                        
                                    protected boolean localInventoryMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInventoryModeTracker = false ;

                           public boolean isInventoryModeSpecified(){
                               return localInventoryModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getInventoryMode(){
                               return localInventoryMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InventoryMode
                               */
                               public void setInventoryMode(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localInventoryModeTracker =
                                       true;
                                   
                                            this.localInventoryMode=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Availability.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FetchCalendarRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FetchCalendarRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReference"),
                                               xmlWriter);
                                        
                                            if (localStayDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                            }
                                           localStayDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","StayDateRange"),
                                               xmlWriter);
                                         if (localGuestCountTracker){
                                            if (localGuestCount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestCount cannot be null!!");
                                            }
                                           localGuestCount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","GuestCount"),
                                               xmlWriter);
                                        } if (localRatePlanCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "RatePlanCode", xmlWriter);
                             

                                          if (localRatePlanCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RatePlanCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRatePlanCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "RoomTypeCode", xmlWriter);
                             

                                          if (localRoomTypeCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomTypeCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBlockCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "BlockCode", xmlWriter);
                             

                                          if (localBlockCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BlockCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBlockCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCorporateCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "CorporateCode", xmlWriter);
                             

                                          if (localCorporateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CorporateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCorporateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPromotionCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "PromotionCode", xmlWriter);
                             

                                          if (localPromotionCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PromotionCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPromotionCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumberOfNightsTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfNights", xmlWriter);
                             
                                               if (localNumberOfNights==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfNights cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfNights));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRestrictedModeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "RestrictedMode", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("RestrictedMode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestrictedMode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInventoryModeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "InventoryMode", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("InventoryMode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInventoryMode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Availability.wsdl")){
                return "ns7";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "StayDateRange"));
                            
                            
                                    if (localStayDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                    }
                                    elementList.add(localStayDateRange);
                                 if (localGuestCountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "GuestCount"));
                            
                            
                                    if (localGuestCount==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestCount cannot be null!!");
                                    }
                                    elementList.add(localGuestCount);
                                } if (localRatePlanCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RatePlanCode"));
                                 
                                        if (localRatePlanCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RatePlanCode cannot be null!!");
                                        }
                                    } if (localRoomTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RoomTypeCode"));
                                 
                                        if (localRoomTypeCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomTypeCode cannot be null!!");
                                        }
                                    } if (localBlockCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "BlockCode"));
                                 
                                        if (localBlockCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BlockCode cannot be null!!");
                                        }
                                    } if (localCorporateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "CorporateCode"));
                                 
                                        if (localCorporateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorporateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CorporateCode cannot be null!!");
                                        }
                                    } if (localPromotionCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "PromotionCode"));
                                 
                                        if (localPromotionCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PromotionCode cannot be null!!");
                                        }
                                    } if (localNumberOfNightsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfNights"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfNights));
                            } if (localRestrictedModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RestrictedMode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestrictedMode));
                            } if (localInventoryModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "InventoryMode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInventoryMode));
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
        public static FetchCalendarRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FetchCalendarRequest object =
                new FetchCalendarRequest();

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
                    
                            if (!"FetchCalendarRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FetchCalendarRequest)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","StayDateRange").equals(reader.getName())){
                                
                                                object.setStayDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","GuestCount").equals(reader.getName())){
                                
                                                object.setGuestCount(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RatePlanCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RatePlanCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRatePlanCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RoomTypeCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomTypeCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","BlockCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BlockCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBlockCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","CorporateCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CorporateCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCorporateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","PromotionCode").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfNights").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfNights" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfNights(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfNights(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RestrictedMode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RestrictedMode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRestrictedMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","InventoryMode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"InventoryMode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInventoryMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
    