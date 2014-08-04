
/**
 * ExtendedHotelInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  ExtendedHotelInfo bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtendedHotelInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ExtendedHotelInfo
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for HotelInformation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo localHotelInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelInformationTracker = false ;

                           public boolean isHotelInformationSpecified(){
                               return localHotelInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo getHotelInformation(){
                               return localHotelInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelInformation
                               */
                               public void setHotelInformation(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo param){
                            localHotelInformationTracker = param != null;
                                   
                                            this.localHotelInformation=param;
                                    

                               }
                            

                        /**
                        * field for PaymentMethods
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1 localPaymentMethods ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentMethodsTracker = false ;

                           public boolean isPaymentMethodsSpecified(){
                               return localPaymentMethodsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1 getPaymentMethods(){
                               return localPaymentMethods;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentMethods
                               */
                               public void setPaymentMethods(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1 param){
                            localPaymentMethodsTracker = param != null;
                                   
                                            this.localPaymentMethods=param;
                                    

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
                        * field for Position
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GeoCode localPosition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPositionTracker = false ;

                           public boolean isPositionSpecified(){
                               return localPositionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GeoCode
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GeoCode getPosition(){
                               return localPosition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Position
                               */
                               public void setPosition(com.cloudkey.pms.micros.og.hotelcommon.GeoCode param){
                            localPositionTracker = param != null;
                                   
                                            this.localPosition=param;
                                    

                               }
                            

                        /**
                        * field for FacilityInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType localFacilityInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFacilityInfoTracker = false ;

                           public boolean isFacilityInfoSpecified(){
                               return localFacilityInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType getFacilityInfo(){
                               return localFacilityInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FacilityInfo
                               */
                               public void setFacilityInfo(com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType param){
                            localFacilityInfoTracker = param != null;
                                   
                                            this.localFacilityInfo=param;
                                    

                               }
                            

                        /**
                        * field for AlternateProperties
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference localAlternateProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlternatePropertiesTracker = false ;

                           public boolean isAlternatePropertiesSpecified(){
                               return localAlternatePropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference getAlternateProperties(){
                               return localAlternateProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlternateProperties
                               */
                               public void setAlternateProperties(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference param){
                            localAlternatePropertiesTracker = param != null;
                                   
                                            this.localAlternateProperties=param;
                                    

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
                           namespacePrefix+":ExtendedHotelInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ExtendedHotelInfo",
                           xmlWriter);
                   }

               
                   }
                if (localHotelInformationTracker){
                                            if (localHotelInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                            }
                                           localHotelInformation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelInformation"),
                                               xmlWriter);
                                        } if (localPaymentMethodsTracker){
                                            if (localPaymentMethods==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PaymentMethods cannot be null!!");
                                            }
                                           localPaymentMethods.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PaymentMethods"),
                                               xmlWriter);
                                        } if (localAmenityInfoTracker){
                                            if (localAmenityInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                            }
                                           localAmenityInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AmenityInfo"),
                                               xmlWriter);
                                        } if (localPositionTracker){
                                            if (localPosition==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Position cannot be null!!");
                                            }
                                           localPosition.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Position"),
                                               xmlWriter);
                                        } if (localFacilityInfoTracker){
                                            if (localFacilityInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FacilityInfo cannot be null!!");
                                            }
                                           localFacilityInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FacilityInfo"),
                                               xmlWriter);
                                        } if (localAlternatePropertiesTracker){
                                            if (localAlternateProperties==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AlternateProperties cannot be null!!");
                                            }
                                           localAlternateProperties.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AlternateProperties"),
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

                 if (localHotelInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "HotelInformation"));
                            
                            
                                    if (localHotelInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelInformation);
                                } if (localPaymentMethodsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "PaymentMethods"));
                            
                            
                                    if (localPaymentMethods==null){
                                         throw new org.apache.axis2.databinding.ADBException("PaymentMethods cannot be null!!");
                                    }
                                    elementList.add(localPaymentMethods);
                                } if (localAmenityInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AmenityInfo"));
                            
                            
                                    if (localAmenityInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                    }
                                    elementList.add(localAmenityInfo);
                                } if (localPositionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Position"));
                            
                            
                                    if (localPosition==null){
                                         throw new org.apache.axis2.databinding.ADBException("Position cannot be null!!");
                                    }
                                    elementList.add(localPosition);
                                } if (localFacilityInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "FacilityInfo"));
                            
                            
                                    if (localFacilityInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("FacilityInfo cannot be null!!");
                                    }
                                    elementList.add(localFacilityInfo);
                                } if (localAlternatePropertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AlternateProperties"));
                            
                            
                                    if (localAlternateProperties==null){
                                         throw new org.apache.axis2.databinding.ADBException("AlternateProperties cannot be null!!");
                                    }
                                    elementList.add(localAlternateProperties);
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
        public static ExtendedHotelInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ExtendedHotelInfo object =
                new ExtendedHotelInfo();

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
                    
                            if (!"ExtendedHotelInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ExtendedHotelInfo)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelInformation").equals(reader.getName())){
                                
                                                object.setHotelInformation(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PaymentMethods").equals(reader.getName())){
                                
                                                object.setPaymentMethods(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPaymentType1.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Position").equals(reader.getName())){
                                
                                                object.setPosition(com.cloudkey.pms.micros.og.hotelcommon.GeoCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FacilityInfo").equals(reader.getName())){
                                
                                                object.setFacilityInfo(com.cloudkey.pms.micros.og.hotelcommon.FacilityInfoType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AlternateProperties").equals(reader.getName())){
                                
                                                object.setAlternateProperties(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelReference.Factory.parse(reader));
                                              
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
           
    