
/**
 * GdsAreaAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.availability;
            

            /**
            *  GdsAreaAvailabilityRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GdsAreaAvailabilityRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/ows/5.1/Availability.wsdl",
                "GdsAreaAvailabilityRequest",
                "ns7");

            

                        /**
                        * field for HotelReferences
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReferenceList localHotelReferences ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReferenceList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReferenceList getHotelReferences(){
                               return localHotelReferences;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReferences
                               */
                               public void setHotelReferences(com.cloudkey.pms.micros.og.hotelcommon.HotelReferenceList param){
                            
                                            this.localHotelReferences=param;
                                    

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
                        * field for NumberOfRooms
                        */

                        
                                    protected int localNumberOfRooms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfRoomsTracker = false ;

                           public boolean isNumberOfRoomsSpecified(){
                               return localNumberOfRoomsTracker;
                           }

                           

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
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfRoomsTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfRooms=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfGuests
                        */

                        
                                    protected int localNumberOfGuests ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfGuests(){
                               return localNumberOfGuests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfGuests
                               */
                               public void setNumberOfGuests(int param){
                            
                                            this.localNumberOfGuests=param;
                                    

                               }
                            

                        /**
                        * field for MinMaxRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate localMinMaxRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinMaxRateTracker = false ;

                           public boolean isMinMaxRateSpecified(){
                               return localMinMaxRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate getMinMaxRate(){
                               return localMinMaxRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinMaxRate
                               */
                               public void setMinMaxRate(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate param){
                            localMinMaxRateTracker = param != null;
                                   
                                            this.localMinMaxRate=param;
                                    

                               }
                            

                        /**
                        * field for MatchingQualifier
                        */

                        
                                    protected java.lang.String localMatchingQualifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMatchingQualifierTracker = false ;

                           public boolean isMatchingQualifierSpecified(){
                               return localMatchingQualifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMatchingQualifier(){
                               return localMatchingQualifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchingQualifier
                               */
                               public void setMatchingQualifier(java.lang.String param){
                            localMatchingQualifierTracker = param != null;
                                   
                                            this.localMatchingQualifier=param;
                                    

                               }
                            

                        /**
                        * field for RateCalculationMethod
                        */

                        
                                    protected java.lang.String localRateCalculationMethod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCalculationMethodTracker = false ;

                           public boolean isRateCalculationMethodSpecified(){
                               return localRateCalculationMethodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCalculationMethod(){
                               return localRateCalculationMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCalculationMethod
                               */
                               public void setRateCalculationMethod(java.lang.String param){
                            localRateCalculationMethodTracker = param != null;
                                   
                                            this.localRateCalculationMethod=param;
                                    

                               }
                            

                        /**
                        * field for RateCodes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.RateCodeInformationList localRateCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCodesTracker = false ;

                           public boolean isRateCodesSpecified(){
                               return localRateCodesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.RateCodeInformationList
                           */
                           public  com.cloudkey.pms.micros.og.availability.RateCodeInformationList getRateCodes(){
                               return localRateCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCodes
                               */
                               public void setRateCodes(com.cloudkey.pms.micros.og.availability.RateCodeInformationList param){
                            localRateCodesTracker = param != null;
                                   
                                            this.localRateCodes=param;
                                    

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
                           namespacePrefix+":GdsAreaAvailabilityRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GdsAreaAvailabilityRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localHotelReferences==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReferences cannot be null!!");
                                            }
                                           localHotelReferences.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReferences"),
                                               xmlWriter);
                                        
                                            if (localStayDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                            }
                                           localStayDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","StayDateRange"),
                                               xmlWriter);
                                         if (localNumberOfRoomsTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfRooms", xmlWriter);
                             
                                               if (localNumberOfRooms==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfRooms cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfGuests", xmlWriter);
                             
                                               if (localNumberOfGuests==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfGuests cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfGuests));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localMinMaxRateTracker){
                                            if (localMinMaxRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MinMaxRate cannot be null!!");
                                            }
                                           localMinMaxRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","MinMaxRate"),
                                               xmlWriter);
                                        } if (localMatchingQualifierTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "MatchingQualifier", xmlWriter);
                             

                                          if (localMatchingQualifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MatchingQualifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMatchingQualifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCalculationMethodTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "RateCalculationMethod", xmlWriter);
                             

                                          if (localRateCalculationMethod==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCalculationMethod cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCalculationMethod);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCodesTracker){
                                            if (localRateCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RateCodes cannot be null!!");
                                            }
                                           localRateCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RateCodes"),
                                               xmlWriter);
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
                                                                      "HotelReferences"));
                            
                            
                                    if (localHotelReferences==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReferences cannot be null!!");
                                    }
                                    elementList.add(localHotelReferences);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "StayDateRange"));
                            
                            
                                    if (localStayDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                    }
                                    elementList.add(localStayDateRange);
                                 if (localNumberOfRoomsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfRooms"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms));
                            }
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfGuests"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfGuests));
                             if (localMinMaxRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "MinMaxRate"));
                            
                            
                                    if (localMinMaxRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("MinMaxRate cannot be null!!");
                                    }
                                    elementList.add(localMinMaxRate);
                                } if (localMatchingQualifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "MatchingQualifier"));
                                 
                                        if (localMatchingQualifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchingQualifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MatchingQualifier cannot be null!!");
                                        }
                                    } if (localRateCalculationMethodTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RateCalculationMethod"));
                                 
                                        if (localRateCalculationMethod != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCalculationMethod));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCalculationMethod cannot be null!!");
                                        }
                                    } if (localRateCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RateCodes"));
                            
                            
                                    if (localRateCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("RateCodes cannot be null!!");
                                    }
                                    elementList.add(localRateCodes);
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
        public static GdsAreaAvailabilityRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GdsAreaAvailabilityRequest object =
                new GdsAreaAvailabilityRequest();

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
                    
                            if (!"GdsAreaAvailabilityRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GdsAreaAvailabilityRequest)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReferences").equals(reader.getName())){
                                
                                                object.setHotelReferences(com.cloudkey.pms.micros.og.hotelcommon.HotelReferenceList.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfRooms").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfRooms" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfRooms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfRooms(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfGuests").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfGuests" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfGuests(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","MinMaxRate").equals(reader.getName())){
                                
                                                object.setMinMaxRate(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","MatchingQualifier").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MatchingQualifier" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMatchingQualifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RateCalculationMethod").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCalculationMethod" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCalculationMethod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RateCodes").equals(reader.getName())){
                                
                                                object.setRateCodes(com.cloudkey.pms.micros.og.availability.RateCodeInformationList.Factory.parse(reader));
                                              
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
           
    