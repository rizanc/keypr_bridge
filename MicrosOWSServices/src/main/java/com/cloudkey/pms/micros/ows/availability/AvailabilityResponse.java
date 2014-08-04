
/**
 * AvailabilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.availability;
            

            /**
            *  AvailabilityResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AvailabilityResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AvailabilityResponse
                Namespace URI = http://webservices.micros.com/ows/5.1/Availability.wsdl
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Result
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus localResult ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultTracker = false ;

                           public boolean isResultSpecified(){
                               return localResultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus getResult(){
                               return localResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Result
                               */
                               public void setResult(com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus param){
                            localResultTracker = param != null;
                                   
                                            this.localResult=param;
                                    

                               }
                            

                        /**
                        * field for AlternateDates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localAlternateDates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlternateDatesTracker = false ;

                           public boolean isAlternateDatesSpecified(){
                               return localAlternateDatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getAlternateDates(){
                               return localAlternateDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlternateDates
                               */
                               public void setAlternateDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localAlternateDatesTracker = param != null;
                                   
                                            this.localAlternateDates=param;
                                    

                               }
                            

                        /**
                        * field for AvailResponseSegments
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.ArrayOfAvailResponseSegment localAvailResponseSegments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvailResponseSegmentsTracker = false ;

                           public boolean isAvailResponseSegmentsSpecified(){
                               return localAvailResponseSegmentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.ArrayOfAvailResponseSegment
                           */
                           public  com.cloudkey.pms.micros.og.availability.ArrayOfAvailResponseSegment getAvailResponseSegments(){
                               return localAvailResponseSegments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailResponseSegments
                               */
                               public void setAvailResponseSegments(com.cloudkey.pms.micros.og.availability.ArrayOfAvailResponseSegment param){
                            localAvailResponseSegmentsTracker = param != null;
                                   
                                            this.localAvailResponseSegments=param;
                                    

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
                        * field for AlternateDatesSpecified
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAlternateDatesSpecified ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAlternateDatesSpecified(){
                               return localAlternateDatesSpecified;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlternateDatesSpecified
                               */
                               public void setAlternateDatesSpecified(boolean param){
                            
                                            this.localAlternateDatesSpecified=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Availability.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AvailabilityResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AvailabilityResponse",
                           xmlWriter);
                   }

               
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
                                                         "alternateDatesSpecified",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlternateDatesSpecified), xmlWriter);

                                            
                                      }
                                     if (localResultTracker){
                                            if (localResult==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                            }
                                           localResult.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","Result"),
                                               xmlWriter);
                                        } if (localAlternateDatesTracker){
                                            if (localAlternateDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AlternateDates cannot be null!!");
                                            }
                                           localAlternateDates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","AlternateDates"),
                                               xmlWriter);
                                        } if (localAvailResponseSegmentsTracker){
                                            if (localAvailResponseSegments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AvailResponseSegments cannot be null!!");
                                            }
                                           localAvailResponseSegments.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","AvailResponseSegments"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Availability.wsdl")){
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

                 if (localResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "Result"));
                            
                            
                                    if (localResult==null){
                                         throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                    }
                                    elementList.add(localResult);
                                } if (localAlternateDatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "AlternateDates"));
                            
                            
                                    if (localAlternateDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("AlternateDates cannot be null!!");
                                    }
                                    elementList.add(localAlternateDates);
                                } if (localAvailResponseSegmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "AvailResponseSegments"));
                            
                            
                                    if (localAvailResponseSegments==null){
                                         throw new org.apache.axis2.databinding.ADBException("AvailResponseSegments cannot be null!!");
                                    }
                                    elementList.add(localAvailResponseSegments);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","summaryOnly"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummaryOnly));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alternateDatesSpecified"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlternateDatesSpecified));
                                

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
        public static AvailabilityResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AvailabilityResponse object =
                new AvailabilityResponse();

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
                    
                            if (!"AvailabilityResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AvailabilityResponse)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
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
                    
                    // handle attribute "alternateDatesSpecified"
                    java.lang.String tempAttribAlternateDatesSpecified =
                        
                                reader.getAttributeValue(null,"alternateDatesSpecified");
                            
                   if (tempAttribAlternateDatesSpecified!=null){
                         java.lang.String content = tempAttribAlternateDatesSpecified;
                        
                                                 object.setAlternateDatesSpecified(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAlternateDatesSpecified));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("alternateDatesSpecified");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","Result").equals(reader.getName())){
                                
                                                object.setResult(com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","AlternateDates").equals(reader.getName())){
                                
                                                object.setAlternateDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","AvailResponseSegments").equals(reader.getName())){
                                
                                                object.setAvailResponseSegments(com.cloudkey.pms.micros.og.availability.ArrayOfAvailResponseSegment.Factory.parse(reader));
                                              
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
           
    