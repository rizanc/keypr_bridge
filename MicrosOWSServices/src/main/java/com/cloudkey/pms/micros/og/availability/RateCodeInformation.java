
/**
 * RateCodeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.availability;
            

            /**
            *  RateCodeInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RateCodeInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RateCodeInformation
                Namespace URI = http://webservices.micros.com/og/4.3/Availability/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for RatePlanCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanCode ;
                                

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
                            
                                            this.localRatePlanCode=param;
                                    

                               }
                            

                        /**
                        * field for CorporateCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCorporateCode ;
                                

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
                            
                                            this.localCorporateCode=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanIndicator
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanIndicator ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlanIndicator(){
                               return localRatePlanIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanIndicator
                               */
                               public void setRatePlanIndicator(java.lang.String param){
                            
                                            this.localRatePlanIndicator=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanStatusCode
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.StatusCodeIndicator localRatePlanStatusCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.StatusCodeIndicator
                           */
                           public  com.cloudkey.pms.micros.og.availability.StatusCodeIndicator getRatePlanStatusCode(){
                               return localRatePlanStatusCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanStatusCode
                               */
                               public void setRatePlanStatusCode(com.cloudkey.pms.micros.og.availability.StatusCodeIndicator param){
                            
                                            this.localRatePlanStatusCode=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Availability/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RateCodeInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RateCodeInformation",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRatePlanCode != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localCorporateCode != null){
                                        
                                                writeAttribute("",
                                                         "corporateCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorporateCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRatePlanIndicator != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanIndicator), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localRatePlanStatusCode != null){
                                        writeAttribute("",
                                           "ratePlanStatusCode",
                                           localRatePlanStatusCode.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localRatePlanStatusCode is null");
                                      }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Availability/")){
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","corporateCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorporateCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanIndicator));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanStatusCode"));
                            
                                      attribList.add(localRatePlanStatusCode.toString());
                                

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
        public static RateCodeInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RateCodeInformation object =
                new RateCodeInformation();

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
                    
                            if (!"RateCodeInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RateCodeInformation)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ratePlanCode"
                    java.lang.String tempAttribRatePlanCode =
                        
                                reader.getAttributeValue(null,"ratePlanCode");
                            
                   if (tempAttribRatePlanCode!=null){
                         java.lang.String content = tempAttribRatePlanCode;
                        
                                                 object.setRatePlanCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanCode");
                    
                    // handle attribute "corporateCode"
                    java.lang.String tempAttribCorporateCode =
                        
                                reader.getAttributeValue(null,"corporateCode");
                            
                   if (tempAttribCorporateCode!=null){
                         java.lang.String content = tempAttribCorporateCode;
                        
                                                 object.setCorporateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCorporateCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("corporateCode");
                    
                    // handle attribute "ratePlanIndicator"
                    java.lang.String tempAttribRatePlanIndicator =
                        
                                reader.getAttributeValue(null,"ratePlanIndicator");
                            
                   if (tempAttribRatePlanIndicator!=null){
                         java.lang.String content = tempAttribRatePlanIndicator;
                        
                                                 object.setRatePlanIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanIndicator");
                    
                    // handle attribute "ratePlanStatusCode"
                    java.lang.String tempAttribRatePlanStatusCode =
                        
                                reader.getAttributeValue(null,"ratePlanStatusCode");
                            
                   if (tempAttribRatePlanStatusCode!=null){
                         java.lang.String content = tempAttribRatePlanStatusCode;
                        
                                                  object.setRatePlanStatusCode(
                                                        com.cloudkey.pms.micros.og.availability.StatusCodeIndicator.Factory.fromString(reader,tempAttribRatePlanStatusCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ratePlanStatusCode is missing");
                           
                    }
                    handledAttributes.add("ratePlanStatusCode");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    