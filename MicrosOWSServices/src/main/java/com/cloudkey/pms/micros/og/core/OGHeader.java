
/**
 * OGHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.core;
            

            /**
            *  OGHeader bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OGHeader
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OGHeader
                Namespace URI = http://webservices.micros.com/og/4.3/Core/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Origin
                        */

                        
                                    protected com.cloudkey.pms.micros.og.core.EndPoint localOrigin ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.core.EndPoint
                           */
                           public  com.cloudkey.pms.micros.og.core.EndPoint getOrigin(){
                               return localOrigin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Origin
                               */
                               public void setOrigin(com.cloudkey.pms.micros.og.core.EndPoint param){
                            
                                            this.localOrigin=param;
                                    

                               }
                            

                        /**
                        * field for Destination
                        */

                        
                                    protected com.cloudkey.pms.micros.og.core.EndPoint localDestination ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.core.EndPoint
                           */
                           public  com.cloudkey.pms.micros.og.core.EndPoint getDestination(){
                               return localDestination;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Destination
                               */
                               public void setDestination(com.cloudkey.pms.micros.og.core.EndPoint param){
                            
                                            this.localDestination=param;
                                    

                               }
                            

                        /**
                        * field for Intermediaries
                        */

                        
                                    protected com.cloudkey.pms.micros.og.core.EndPointList localIntermediaries ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntermediariesTracker = false ;

                           public boolean isIntermediariesSpecified(){
                               return localIntermediariesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.core.EndPointList
                           */
                           public  com.cloudkey.pms.micros.og.core.EndPointList getIntermediaries(){
                               return localIntermediaries;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Intermediaries
                               */
                               public void setIntermediaries(com.cloudkey.pms.micros.og.core.EndPointList param){
                            localIntermediariesTracker = param != null;
                                   
                                            this.localIntermediaries=param;
                                    

                               }
                            

                        /**
                        * field for Authentication
                        */

                        
                                    protected com.cloudkey.pms.micros.og.core.Authentication_type0 localAuthentication ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthenticationTracker = false ;

                           public boolean isAuthenticationSpecified(){
                               return localAuthenticationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.core.Authentication_type0
                           */
                           public  com.cloudkey.pms.micros.og.core.Authentication_type0 getAuthentication(){
                               return localAuthentication;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Authentication
                               */
                               public void setAuthentication(com.cloudkey.pms.micros.og.core.Authentication_type0 param){
                            localAuthenticationTracker = param != null;
                                   
                                            this.localAuthentication=param;
                                    

                               }
                            

                        /**
                        * field for TransactionID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionID(){
                               return localTransactionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionID
                               */
                               public void setTransactionID(java.lang.String param){
                            
                                            this.localTransactionID=param;
                                    

                               }
                            

                        /**
                        * field for AuthToken
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAuthToken ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAuthToken(){
                               return localAuthToken;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthToken
                               */
                               public void setAuthToken(java.lang.String param){
                            
                                            this.localAuthToken=param;
                                    

                               }
                            

                        /**
                        * field for TimeStamp
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localTimeStamp ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeStamp(){
                               return localTimeStamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeStamp
                               */
                               public void setTimeStamp(java.util.Calendar param){
                            
                                            this.localTimeStamp=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryLangID
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.core.PrimaryLangID_type0 localPrimaryLangID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.core.PrimaryLangID_type0
                           */
                           public  com.cloudkey.pms.micros.og.core.PrimaryLangID_type0 getPrimaryLangID(){
                               return localPrimaryLangID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryLangID
                               */
                               public void setPrimaryLangID(com.cloudkey.pms.micros.og.core.PrimaryLangID_type0 param){
                            
                                            this.localPrimaryLangID=param;
                                    

                               }
                            

                        /**
                        * field for ChannelValidation
                        * This was an Attribute!
                        */

                        
                                    protected boolean localChannelValidation =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getChannelValidation(){
                               return localChannelValidation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChannelValidation
                               */
                               public void setChannelValidation(boolean param){
                            
                                            this.localChannelValidation=param;
                                    

                               }
                            

                        /**
                        * field for TerminalID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTerminalID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTerminalID(){
                               return localTerminalID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TerminalID
                               */
                               public void setTerminalID(java.lang.String param){
                            
                                            this.localTerminalID=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Core/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OGHeader",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OGHeader",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localTransactionID != null){
                                        
                                                writeAttribute("",
                                                         "transactionID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionID), xmlWriter);

                                            
                                      }
                                    
                                            if (localAuthToken != null){
                                        
                                                writeAttribute("",
                                                         "authToken",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthToken), xmlWriter);

                                            
                                      }
                                    
                                            if (localTimeStamp != null){
                                        
                                                writeAttribute("",
                                                         "timeStamp",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localPrimaryLangID != null){
                                        writeAttribute("",
                                           "primaryLangID",
                                           localPrimaryLangID.toString(), xmlWriter);
                                    }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "channelValidation",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChannelValidation), xmlWriter);

                                            
                                      }
                                    
                                            if (localTerminalID != null){
                                        
                                                writeAttribute("",
                                                         "terminalID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTerminalID), xmlWriter);

                                            
                                      }
                                    
                                            if (localOrigin==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Origin cannot be null!!");
                                            }
                                           localOrigin.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Origin"),
                                               xmlWriter);
                                        
                                            if (localDestination==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Destination cannot be null!!");
                                            }
                                           localDestination.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Destination"),
                                               xmlWriter);
                                         if (localIntermediariesTracker){
                                            if (localIntermediaries==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Intermediaries cannot be null!!");
                                            }
                                           localIntermediaries.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Intermediaries"),
                                               xmlWriter);
                                        } if (localAuthenticationTracker){
                                            if (localAuthentication==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Authentication cannot be null!!");
                                            }
                                           localAuthentication.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Authentication"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Core/")){
                return "ns1";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/",
                                                                      "Origin"));
                            
                            
                                    if (localOrigin==null){
                                         throw new org.apache.axis2.databinding.ADBException("Origin cannot be null!!");
                                    }
                                    elementList.add(localOrigin);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/",
                                                                      "Destination"));
                            
                            
                                    if (localDestination==null){
                                         throw new org.apache.axis2.databinding.ADBException("Destination cannot be null!!");
                                    }
                                    elementList.add(localDestination);
                                 if (localIntermediariesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/",
                                                                      "Intermediaries"));
                            
                            
                                    if (localIntermediaries==null){
                                         throw new org.apache.axis2.databinding.ADBException("Intermediaries cannot be null!!");
                                    }
                                    elementList.add(localIntermediaries);
                                } if (localAuthenticationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/",
                                                                      "Authentication"));
                            
                            
                                    if (localAuthentication==null){
                                         throw new org.apache.axis2.databinding.ADBException("Authentication cannot be null!!");
                                    }
                                    elementList.add(localAuthentication);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","transactionID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","authToken"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthToken));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","timeStamp"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeStamp));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","primaryLangID"));
                            
                                      attribList.add(localPrimaryLangID.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","channelValidation"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChannelValidation));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","terminalID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTerminalID));
                                

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
        public static OGHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OGHeader object =
                new OGHeader();

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
                    
                            if (!"OGHeader".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OGHeader)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "transactionID"
                    java.lang.String tempAttribTransactionID =
                        
                                reader.getAttributeValue(null,"transactionID");
                            
                   if (tempAttribTransactionID!=null){
                         java.lang.String content = tempAttribTransactionID;
                        
                                                 object.setTransactionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("transactionID");
                    
                    // handle attribute "authToken"
                    java.lang.String tempAttribAuthToken =
                        
                                reader.getAttributeValue(null,"authToken");
                            
                   if (tempAttribAuthToken!=null){
                         java.lang.String content = tempAttribAuthToken;
                        
                                                 object.setAuthToken(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAuthToken));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("authToken");
                    
                    // handle attribute "timeStamp"
                    java.lang.String tempAttribTimeStamp =
                        
                                reader.getAttributeValue(null,"timeStamp");
                            
                   if (tempAttribTimeStamp!=null){
                         java.lang.String content = tempAttribTimeStamp;
                        
                                                 object.setTimeStamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribTimeStamp));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("timeStamp");
                    
                    // handle attribute "primaryLangID"
                    java.lang.String tempAttribPrimaryLangID =
                        
                                reader.getAttributeValue(null,"primaryLangID");
                            
                   if (tempAttribPrimaryLangID!=null){
                         java.lang.String content = tempAttribPrimaryLangID;
                        
                                                  object.setPrimaryLangID(
                                                        com.cloudkey.pms.micros.og.core.PrimaryLangID_type0.Factory.fromString(reader,tempAttribPrimaryLangID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("primaryLangID");
                    
                    // handle attribute "channelValidation"
                    java.lang.String tempAttribChannelValidation =
                        
                                reader.getAttributeValue(null,"channelValidation");
                            
                   if (tempAttribChannelValidation!=null){
                         java.lang.String content = tempAttribChannelValidation;
                        
                                                 object.setChannelValidation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribChannelValidation));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("channelValidation");
                    
                    // handle attribute "terminalID"
                    java.lang.String tempAttribTerminalID =
                        
                                reader.getAttributeValue(null,"terminalID");
                            
                   if (tempAttribTerminalID!=null){
                         java.lang.String content = tempAttribTerminalID;
                        
                                                 object.setTerminalID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTerminalID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("terminalID");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Origin").equals(reader.getName())){
                                
                                                object.setOrigin(com.cloudkey.pms.micros.og.core.EndPoint.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Destination").equals(reader.getName())){
                                
                                                object.setDestination(com.cloudkey.pms.micros.og.core.EndPoint.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Intermediaries").equals(reader.getName())){
                                
                                                object.setIntermediaries(com.cloudkey.pms.micros.og.core.EndPointList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Core/","Authentication").equals(reader.getName())){
                                
                                                object.setAuthentication(com.cloudkey.pms.micros.og.core.Authentication_type0.Factory.parse(reader));
                                              
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
           
    