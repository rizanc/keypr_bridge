
/**
 * MeetingFetchContractRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  MeetingFetchContractRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingFetchContractRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MeetingFetchContractRequest
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

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
                        * field for LetterType
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.LetterType localLetterType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.LetterType
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.LetterType getLetterType(){
                               return localLetterType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LetterType
                               */
                               public void setLetterType(com.cloudkey.pms.micros.og.meetingroom.LetterType param){
                            
                                            this.localLetterType=param;
                                    

                               }
                            

                        /**
                        * field for EventID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEventID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEventID(){
                               return localEventID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventID
                               */
                               public void setEventID(java.lang.String param){
                            
                                            this.localEventID=param;
                                    

                               }
                            

                        /**
                        * field for PackageID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPackageID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPackageID(){
                               return localPackageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageID
                               */
                               public void setPackageID(java.lang.String param){
                            
                                            this.localPackageID=param;
                                    

                               }
                            

                        /**
                        * field for BlockID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localBlockID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockID(){
                               return localBlockID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockID
                               */
                               public void setBlockID(java.lang.String param){
                            
                                            this.localBlockID=param;
                                    

                               }
                            

                        /**
                        * field for EmailContract
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEmailContract ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEmailContract(){
                               return localEmailContract;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailContract
                               */
                               public void setEmailContract(boolean param){
                            
                                            this.localEmailContract=param;
                                    

                               }
                            

                        /**
                        * field for EmailAddress
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEmailAddress ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmailAddress(){
                               return localEmailAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailAddress
                               */
                               public void setEmailAddress(java.lang.String param){
                            
                                            this.localEmailAddress=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCurrencyCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(java.lang.String param){
                            
                                            this.localCurrencyCode=param;
                                    

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
                           namespacePrefix+":MeetingFetchContractRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingFetchContractRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localEventID != null){
                                        
                                                writeAttribute("",
                                                         "eventID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventID), xmlWriter);

                                            
                                      }
                                    
                                            if (localPackageID != null){
                                        
                                                writeAttribute("",
                                                         "packageID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageID), xmlWriter);

                                            
                                      }
                                    
                                            if (localBlockID != null){
                                        
                                                writeAttribute("",
                                                         "blockID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockID), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "emailContract",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailContract), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localEmailContract is null");
                                      }
                                    
                                            if (localEmailAddress != null){
                                        
                                                writeAttribute("",
                                                         "emailAddress",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAddress), xmlWriter);

                                            
                                      }
                                    
                                            if (localCurrencyCode != null){
                                        
                                                writeAttribute("",
                                                         "currencyCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode), xmlWriter);

                                            
                                      }
                                     if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference"),
                                               xmlWriter);
                                        }
                                            if (localLetterType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LetterType cannot be null!!");
                                            }
                                           localLetterType.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","LetterType"),
                                               xmlWriter);
                                        
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

                 if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "LetterType"));
                            
                            
                                    if (localLetterType==null){
                                         throw new org.apache.axis2.databinding.ADBException("LetterType cannot be null!!");
                                    }
                                    elementList.add(localLetterType);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","eventID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","packageID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","blockID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","emailContract"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailContract));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","emailAddress"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAddress));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","currencyCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode));
                                

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
        public static MeetingFetchContractRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingFetchContractRequest object =
                new MeetingFetchContractRequest();

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
                    
                            if (!"MeetingFetchContractRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingFetchContractRequest)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "eventID"
                    java.lang.String tempAttribEventID =
                        
                                reader.getAttributeValue(null,"eventID");
                            
                   if (tempAttribEventID!=null){
                         java.lang.String content = tempAttribEventID;
                        
                                                 object.setEventID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEventID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("eventID");
                    
                    // handle attribute "packageID"
                    java.lang.String tempAttribPackageID =
                        
                                reader.getAttributeValue(null,"packageID");
                            
                   if (tempAttribPackageID!=null){
                         java.lang.String content = tempAttribPackageID;
                        
                                                 object.setPackageID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPackageID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("packageID");
                    
                    // handle attribute "blockID"
                    java.lang.String tempAttribBlockID =
                        
                                reader.getAttributeValue(null,"blockID");
                            
                   if (tempAttribBlockID!=null){
                         java.lang.String content = tempAttribBlockID;
                        
                                                 object.setBlockID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBlockID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("blockID");
                    
                    // handle attribute "emailContract"
                    java.lang.String tempAttribEmailContract =
                        
                                reader.getAttributeValue(null,"emailContract");
                            
                   if (tempAttribEmailContract!=null){
                         java.lang.String content = tempAttribEmailContract;
                        
                                                 object.setEmailContract(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEmailContract));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute emailContract is missing");
                           
                    }
                    handledAttributes.add("emailContract");
                    
                    // handle attribute "emailAddress"
                    java.lang.String tempAttribEmailAddress =
                        
                                reader.getAttributeValue(null,"emailAddress");
                            
                   if (tempAttribEmailAddress!=null){
                         java.lang.String content = tempAttribEmailAddress;
                        
                                                 object.setEmailAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEmailAddress));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("emailAddress");
                    
                    // handle attribute "currencyCode"
                    java.lang.String tempAttribCurrencyCode =
                        
                                reader.getAttributeValue(null,"currencyCode");
                            
                   if (tempAttribCurrencyCode!=null){
                         java.lang.String content = tempAttribCurrencyCode;
                        
                                                 object.setCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCurrencyCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("currencyCode");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","LetterType").equals(reader.getName())){
                                
                                                object.setLetterType(com.cloudkey.pms.micros.og.meetingroom.LetterType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    