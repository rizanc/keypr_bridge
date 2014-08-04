
/**
 * MeetingAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  MeetingAvailabilityRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingAvailabilityRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MeetingAvailabilityRequest
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for MeetingDates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localMeetingDates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMeetingDatesTracker = false ;

                           public boolean isMeetingDatesSpecified(){
                               return localMeetingDatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getMeetingDates(){
                               return localMeetingDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingDates
                               */
                               public void setMeetingDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localMeetingDatesTracker = param != null;
                                   
                                            this.localMeetingDates=param;
                                    

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
                        * field for NumberOfAttendees
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfAttendees ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfAttendees(){
                               return localNumberOfAttendees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfAttendees
                               */
                               public void setNumberOfAttendees(int param){
                            
                                            this.localNumberOfAttendees=param;
                                    

                               }
                            

                        /**
                        * field for RateCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRateCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCode(){
                               return localRateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCode
                               */
                               public void setRateCode(java.lang.String param){
                            
                                            this.localRateCode=param;
                                    

                               }
                            

                        /**
                        * field for Room
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoom(){
                               return localRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Room
                               */
                               public void setRoom(java.lang.String param){
                            
                                            this.localRoom=param;
                                    

                               }
                            

                        /**
                        * field for SummaryOnly
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSummaryOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSummaryOnly(){
                               return localSummaryOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SummaryOnly
                               */
                               public void setSummaryOnly(boolean param){
                            
                                            this.localSummaryOnly=param;
                                    

                               }
                            

                        /**
                        * field for AlternateInventory
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAlternateInventory ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAlternateInventory(){
                               return localAlternateInventory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlternateInventory
                               */
                               public void setAlternateInventory(boolean param){
                            
                                            this.localAlternateInventory=param;
                                    

                               }
                            

                        /**
                        * field for SetupStyleCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSetupStyleCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSetupStyleCode(){
                               return localSetupStyleCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetupStyleCode
                               */
                               public void setSetupStyleCode(java.lang.String param){
                            
                                            this.localSetupStyleCode=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/MeetingRoom/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MeetingAvailabilityRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingAvailabilityRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localNumberOfAttendees!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfAttendees",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localNumberOfAttendees is null");
                                      }
                                    
                                            if (localRateCode != null){
                                        
                                                writeAttribute("",
                                                         "rateCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoom != null){
                                        
                                                writeAttribute("",
                                                         "room",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "summaryOnly",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummaryOnly), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localSummaryOnly is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "alternateInventory",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlternateInventory), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAlternateInventory is null");
                                      }
                                    
                                            if (localSetupStyleCode != null){
                                        
                                                writeAttribute("",
                                                         "setupStyleCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetupStyleCode), xmlWriter);

                                            
                                      }
                                     if (localMeetingDatesTracker){
                                            if (localMeetingDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MeetingDates cannot be null!!");
                                            }
                                           localMeetingDates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MeetingDates"),
                                               xmlWriter);
                                        } if (localRateRangeTracker){
                                            if (localRateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                            }
                                           localRateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange"),
                                               xmlWriter);
                                        } if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
                return "ns3";
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

                 if (localMeetingDatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "MeetingDates"));
                            
                            
                                    if (localMeetingDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("MeetingDates cannot be null!!");
                                    }
                                    elementList.add(localMeetingDates);
                                } if (localRateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RateRange"));
                            
                            
                                    if (localRateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                    }
                                    elementList.add(localRateRange);
                                } if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfAttendees"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","room"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","summaryOnly"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummaryOnly));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alternateInventory"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlternateInventory));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","setupStyleCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetupStyleCode));
                                

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
        public static MeetingAvailabilityRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingAvailabilityRequest object =
                new MeetingAvailabilityRequest();

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
                    
                            if (!"MeetingAvailabilityRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingAvailabilityRequest)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "numberOfAttendees"
                    java.lang.String tempAttribNumberOfAttendees =
                        
                                reader.getAttributeValue(null,"numberOfAttendees");
                            
                   if (tempAttribNumberOfAttendees!=null){
                         java.lang.String content = tempAttribNumberOfAttendees;
                        
                                                 object.setNumberOfAttendees(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfAttendees));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute numberOfAttendees is missing");
                           
                    }
                    handledAttributes.add("numberOfAttendees");
                    
                    // handle attribute "rateCode"
                    java.lang.String tempAttribRateCode =
                        
                                reader.getAttributeValue(null,"rateCode");
                            
                   if (tempAttribRateCode!=null){
                         java.lang.String content = tempAttribRateCode;
                        
                                                 object.setRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateCode");
                    
                    // handle attribute "room"
                    java.lang.String tempAttribRoom =
                        
                                reader.getAttributeValue(null,"room");
                            
                   if (tempAttribRoom!=null){
                         java.lang.String content = tempAttribRoom;
                        
                                                 object.setRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("room");
                    
                    // handle attribute "summaryOnly"
                    java.lang.String tempAttribSummaryOnly =
                        
                                reader.getAttributeValue(null,"summaryOnly");
                            
                   if (tempAttribSummaryOnly!=null){
                         java.lang.String content = tempAttribSummaryOnly;
                        
                                                 object.setSummaryOnly(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSummaryOnly));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute summaryOnly is missing");
                           
                    }
                    handledAttributes.add("summaryOnly");
                    
                    // handle attribute "alternateInventory"
                    java.lang.String tempAttribAlternateInventory =
                        
                                reader.getAttributeValue(null,"alternateInventory");
                            
                   if (tempAttribAlternateInventory!=null){
                         java.lang.String content = tempAttribAlternateInventory;
                        
                                                 object.setAlternateInventory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAlternateInventory));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute alternateInventory is missing");
                           
                    }
                    handledAttributes.add("alternateInventory");
                    
                    // handle attribute "setupStyleCode"
                    java.lang.String tempAttribSetupStyleCode =
                        
                                reader.getAttributeValue(null,"setupStyleCode");
                            
                   if (tempAttribSetupStyleCode!=null){
                         java.lang.String content = tempAttribSetupStyleCode;
                        
                                                 object.setSetupStyleCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSetupStyleCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("setupStyleCode");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MeetingDates").equals(reader.getName())){
                                
                                                object.setMeetingDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange").equals(reader.getName())){
                                
                                                object.setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
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
           
    