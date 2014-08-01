
/**
 * GdsTotalPricing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  GdsTotalPricing bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GdsTotalPricing
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GdsTotalPricing
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for TotalInclusiveRoomRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalInclusiveRoomRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalInclusiveRoomRateTracker = false ;

                           public boolean isTotalInclusiveRoomRateSpecified(){
                               return localTotalInclusiveRoomRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalInclusiveRoomRate(){
                               return localTotalInclusiveRoomRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalInclusiveRoomRate
                               */
                               public void setTotalInclusiveRoomRate(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalInclusiveRoomRateTracker = param != null;
                                   
                                            this.localTotalInclusiveRoomRate=param;
                                    

                               }
                            

                        /**
                        * field for TotalExclusiveRoomRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalExclusiveRoomRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalExclusiveRoomRateTracker = false ;

                           public boolean isTotalExclusiveRoomRateSpecified(){
                               return localTotalExclusiveRoomRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalExclusiveRoomRate(){
                               return localTotalExclusiveRoomRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalExclusiveRoomRate
                               */
                               public void setTotalExclusiveRoomRate(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalExclusiveRoomRateTracker = param != null;
                                   
                                            this.localTotalExclusiveRoomRate=param;
                                    

                               }
                            

                        /**
                        * field for TotalTax
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalTaxTracker = false ;

                           public boolean isTotalTaxSpecified(){
                               return localTotalTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalTax(){
                               return localTotalTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalTax
                               */
                               public void setTotalTax(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalTaxTracker = param != null;
                                   
                                            this.localTotalTax=param;
                                    

                               }
                            

                        /**
                        * field for TotalSurCharge
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalSurCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalSurChargeTracker = false ;

                           public boolean isTotalSurChargeSpecified(){
                               return localTotalSurChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalSurCharge(){
                               return localTotalSurCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalSurCharge
                               */
                               public void setTotalSurCharge(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalSurChargeTracker = param != null;
                                   
                                            this.localTotalSurCharge=param;
                                    

                               }
                            

                        /**
                        * field for TaxQualifier
                        */

                        
                                    protected java.lang.String localTaxQualifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxQualifierTracker = false ;

                           public boolean isTaxQualifierSpecified(){
                               return localTaxQualifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxQualifier(){
                               return localTaxQualifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxQualifier
                               */
                               public void setTaxQualifier(java.lang.String param){
                            localTaxQualifierTracker = param != null;
                                   
                                            this.localTaxQualifier=param;
                                    

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
                           namespacePrefix+":GdsTotalPricing",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GdsTotalPricing",
                           xmlWriter);
                   }

               
                   }
                if (localTotalInclusiveRoomRateTracker){
                                            if (localTotalInclusiveRoomRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalInclusiveRoomRate cannot be null!!");
                                            }
                                           localTotalInclusiveRoomRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalInclusiveRoomRate"),
                                               xmlWriter);
                                        } if (localTotalExclusiveRoomRateTracker){
                                            if (localTotalExclusiveRoomRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalExclusiveRoomRate cannot be null!!");
                                            }
                                           localTotalExclusiveRoomRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalExclusiveRoomRate"),
                                               xmlWriter);
                                        } if (localTotalTaxTracker){
                                            if (localTotalTax==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalTax cannot be null!!");
                                            }
                                           localTotalTax.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalTax"),
                                               xmlWriter);
                                        } if (localTotalSurChargeTracker){
                                            if (localTotalSurCharge==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalSurCharge cannot be null!!");
                                            }
                                           localTotalSurCharge.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalSurCharge"),
                                               xmlWriter);
                                        } if (localTaxQualifierTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxQualifier", xmlWriter);
                             

                                          if (localTaxQualifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxQualifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxQualifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMatchingQualifierTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "MatchingQualifier", xmlWriter);
                             

                                          if (localMatchingQualifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MatchingQualifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMatchingQualifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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

                 if (localTotalInclusiveRoomRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TotalInclusiveRoomRate"));
                            
                            
                                    if (localTotalInclusiveRoomRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalInclusiveRoomRate cannot be null!!");
                                    }
                                    elementList.add(localTotalInclusiveRoomRate);
                                } if (localTotalExclusiveRoomRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TotalExclusiveRoomRate"));
                            
                            
                                    if (localTotalExclusiveRoomRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalExclusiveRoomRate cannot be null!!");
                                    }
                                    elementList.add(localTotalExclusiveRoomRate);
                                } if (localTotalTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TotalTax"));
                            
                            
                                    if (localTotalTax==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalTax cannot be null!!");
                                    }
                                    elementList.add(localTotalTax);
                                } if (localTotalSurChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TotalSurCharge"));
                            
                            
                                    if (localTotalSurCharge==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalSurCharge cannot be null!!");
                                    }
                                    elementList.add(localTotalSurCharge);
                                } if (localTaxQualifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxQualifier"));
                                 
                                        if (localTaxQualifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxQualifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxQualifier cannot be null!!");
                                        }
                                    } if (localMatchingQualifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "MatchingQualifier"));
                                 
                                        if (localMatchingQualifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchingQualifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MatchingQualifier cannot be null!!");
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
        public static GdsTotalPricing parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GdsTotalPricing object =
                new GdsTotalPricing();

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
                    
                            if (!"GdsTotalPricing".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GdsTotalPricing)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalInclusiveRoomRate").equals(reader.getName())){
                                
                                                object.setTotalInclusiveRoomRate(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalExclusiveRoomRate").equals(reader.getName())){
                                
                                                object.setTotalExclusiveRoomRate(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalTax").equals(reader.getName())){
                                
                                                object.setTotalTax(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalSurCharge").equals(reader.getName())){
                                
                                                object.setTotalSurCharge(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxQualifier").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxQualifier" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxQualifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MatchingQualifier").equals(reader.getName())){
                                
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
           
    