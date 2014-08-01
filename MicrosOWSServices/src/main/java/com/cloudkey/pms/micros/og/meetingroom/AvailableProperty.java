
/**
 * AvailableProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  AvailableProperty bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AvailableProperty
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AvailableProperty
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

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
                        * field for PropertyStatus
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.PropertyStatusCode localPropertyStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPropertyStatusTracker = false ;

                           public boolean isPropertyStatusSpecified(){
                               return localPropertyStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.PropertyStatusCode
                           */
                           public  com.cloudkey.pms.micros.og.availability.PropertyStatusCode getPropertyStatus(){
                               return localPropertyStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PropertyStatus
                               */
                               public void setPropertyStatus(com.cloudkey.pms.micros.og.availability.PropertyStatusCode param){
                            localPropertyStatusTracker = param != null;
                                   
                                            this.localPropertyStatus=param;
                                    

                               }
                            

                        /**
                        * field for FunctionSpace
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[] localFunctionSpace ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFunctionSpaceTracker = false ;

                           public boolean isFunctionSpaceSpecified(){
                               return localFunctionSpaceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[] getFunctionSpace(){
                               return localFunctionSpace;
                           }

                           
                        


                               
                              /**
                               * validate the array for FunctionSpace
                               */
                              protected void validateFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FunctionSpace
                              */
                              public void setFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[] param){
                              
                                   validateFunctionSpace(param);

                               localFunctionSpaceTracker = param != null;
                                      
                                      this.localFunctionSpace=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0
                             */
                             public void addFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0 param){
                                   if (localFunctionSpace == null){
                                   localFunctionSpace = new com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[]{};
                                   }

                            
                                 //update the setting tracker
                                localFunctionSpaceTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFunctionSpace);
                               list.add(param);
                               this.localFunctionSpace =
                             (com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[list.size()]);

                             }
                             

                        /**
                        * field for HotelContact
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelContact localHotelContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelContactTracker = false ;

                           public boolean isHotelContactSpecified(){
                               return localHotelContactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelContact
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelContact getHotelContact(){
                               return localHotelContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelContact
                               */
                               public void setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact param){
                            localHotelContactTracker = param != null;
                                   
                                            this.localHotelContact=param;
                                    

                               }
                            

                        /**
                        * field for HotelExtendedInformation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo localHotelExtendedInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelExtendedInformationTracker = false ;

                           public boolean isHotelExtendedInformationSpecified(){
                               return localHotelExtendedInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo getHotelExtendedInformation(){
                               return localHotelExtendedInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelExtendedInformation
                               */
                               public void setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo param){
                            localHotelExtendedInformationTracker = param != null;
                                   
                                            this.localHotelExtendedInformation=param;
                                    

                               }
                            

                        /**
                        * field for MarketingText
                        */

                        
                                    protected java.lang.String localMarketingText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketingTextTracker = false ;

                           public boolean isMarketingTextSpecified(){
                               return localMarketingTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMarketingText(){
                               return localMarketingText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingText
                               */
                               public void setMarketingText(java.lang.String param){
                            localMarketingTextTracker = param != null;
                                   
                                            this.localMarketingText=param;
                                    

                               }
                            

                        /**
                        * field for PropertyType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPropertyType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPropertyType(){
                               return localPropertyType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PropertyType
                               */
                               public void setPropertyType(java.lang.String param){
                            
                                            this.localPropertyType=param;
                                    

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
                           namespacePrefix+":AvailableProperty",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AvailableProperty",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPropertyType != null){
                                        
                                                writeAttribute("",
                                                         "propertyType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPropertyType), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference"),
                                               xmlWriter);
                                         if (localPropertyStatusTracker){
                                            if (localPropertyStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PropertyStatus cannot be null!!");
                                            }
                                           localPropertyStatus.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PropertyStatus"),
                                               xmlWriter);
                                        } if (localFunctionSpaceTracker){
                                       if (localFunctionSpace!=null){
                                            for (int i = 0;i < localFunctionSpace.length;i++){
                                                if (localFunctionSpace[i] != null){
                                                 localFunctionSpace[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("FunctionSpace cannot be null!!");
                                        
                                    }
                                 } if (localHotelContactTracker){
                                            if (localHotelContact==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                            }
                                           localHotelContact.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelContact"),
                                               xmlWriter);
                                        } if (localHotelExtendedInformationTracker){
                                            if (localHotelExtendedInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                            }
                                           localHotelExtendedInformation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelExtendedInformation"),
                                               xmlWriter);
                                        } if (localMarketingTextTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/MeetingRoom/";
                                    writeStartElement(null, namespace, "MarketingText", xmlWriter);
                             

                                          if (localMarketingText==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MarketingText cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMarketingText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                 if (localPropertyStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "PropertyStatus"));
                            
                            
                                    if (localPropertyStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("PropertyStatus cannot be null!!");
                                    }
                                    elementList.add(localPropertyStatus);
                                } if (localFunctionSpaceTracker){
                             if (localFunctionSpace!=null) {
                                 for (int i = 0;i < localFunctionSpace.length;i++){

                                    if (localFunctionSpace[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "FunctionSpace"));
                                         elementList.add(localFunctionSpace[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("FunctionSpace cannot be null!!");
                                    
                             }

                        } if (localHotelContactTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelContact"));
                            
                            
                                    if (localHotelContact==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                    }
                                    elementList.add(localHotelContact);
                                } if (localHotelExtendedInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelExtendedInformation"));
                            
                            
                                    if (localHotelExtendedInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelExtendedInformation);
                                } if (localMarketingTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "MarketingText"));
                                 
                                        if (localMarketingText != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingText));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MarketingText cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","propertyType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPropertyType));
                                

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
        public static AvailableProperty parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AvailableProperty object =
                new AvailableProperty();

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
                    
                            if (!"AvailableProperty".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AvailableProperty)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "propertyType"
                    java.lang.String tempAttribPropertyType =
                        
                                reader.getAttributeValue(null,"propertyType");
                            
                   if (tempAttribPropertyType!=null){
                         java.lang.String content = tempAttribPropertyType;
                        
                                                 object.setPropertyType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPropertyType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("propertyType");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PropertyStatus").equals(reader.getName())){
                                
                                                object.setPropertyStatus(com.cloudkey.pms.micros.og.availability.PropertyStatusCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace").equals(reader.getName())){
                                                                    list3.add(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFunctionSpace((com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.FunctionSpace_type0.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelContact").equals(reader.getName())){
                                
                                                object.setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelExtendedInformation").equals(reader.getName())){
                                
                                                object.setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MarketingText").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MarketingText" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMarketingText(
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
           
    