
/**
 * Phone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.common;
            

            /**
            *  Phone bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Phone
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Phone
                Namespace URI = http://webservices.micros.com/og/4.3/Common/
                Namespace Prefix = ns2
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localPhoneNumberTracker = false;
                
                   localPhoneDataTracker = false;
                
            }
        

                        /**
                        * field for PhoneNumber
                        */

                        
                                    protected java.lang.String localPhoneNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneNumberTracker = false ;

                           public boolean isPhoneNumberSpecified(){
                               return localPhoneNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneNumber(){
                               return localPhoneNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneNumber
                               */
                               public void setPhoneNumber(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localPhoneNumberTracker = param != null;
                                   
                                            this.localPhoneNumber=param;
                                    

                               }
                            

                        /**
                        * field for PhoneData
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.PhoneData_type0 localPhoneData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneDataTracker = false ;

                           public boolean isPhoneDataSpecified(){
                               return localPhoneDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.PhoneData_type0
                           */
                           public  com.cloudkey.pms.micros.og.common.PhoneData_type0 getPhoneData(){
                               return localPhoneData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneData
                               */
                               public void setPhoneData(com.cloudkey.pms.micros.og.common.PhoneData_type0 param){
                            
                                clearAllSettingTrackers();
                            localPhoneDataTracker = param != null;
                                   
                                            this.localPhoneData=param;
                                    

                               }
                            

                        /**
                        * field for PhoneType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPhoneType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneTypeTracker = false ;

                           public boolean isPhoneTypeSpecified(){
                               return localPhoneTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneType(){
                               return localPhoneType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneType
                               */
                               public void setPhoneType(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localPhoneTypeTracker = param != null;
                                   
                                            this.localPhoneType=param;
                                    

                               }
                            

                        /**
                        * field for PhoneRole
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPhoneRole ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneRoleTracker = false ;

                           public boolean isPhoneRoleSpecified(){
                               return localPhoneRoleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneRole(){
                               return localPhoneRole;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneRole
                               */
                               public void setPhoneRole(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localPhoneRoleTracker = param != null;
                                   
                                            this.localPhoneRole=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryPhone
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPrimaryPhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryPhoneTracker = false ;

                           public boolean isPrimaryPhoneSpecified(){
                               return localPrimaryPhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPrimaryPhone(){
                               return localPrimaryPhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryPhone
                               */
                               public void setPrimaryPhone(boolean param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localPrimaryPhoneTracker =
                                       true;
                                   
                                            this.localPrimaryPhone=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Common/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Phone",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Phone",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPhoneType != null){
                                        
                                                writeAttribute("",
                                                         "phoneType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneType), xmlWriter);

                                            
                                      }
                                    
                                            if (localPhoneRole != null){
                                        
                                                writeAttribute("",
                                                         "phoneRole",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneRole), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "primaryPhone",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryPhone), xmlWriter);

                                            
                                      }
                                     if (localPhoneNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "PhoneNumber", xmlWriter);
                             

                                          if (localPhoneNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PhoneNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPhoneNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPhoneDataTracker){
                                            if (localPhoneData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PhoneData cannot be null!!");
                                            }
                                           localPhoneData.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","PhoneData"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Common/")){
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

                 if (localPhoneNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "PhoneNumber"));
                                 
                                        if (localPhoneNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PhoneNumber cannot be null!!");
                                        }
                                    } if (localPhoneDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "PhoneData"));
                            
                            
                                    if (localPhoneData==null){
                                         throw new org.apache.axis2.databinding.ADBException("PhoneData cannot be null!!");
                                    }
                                    elementList.add(localPhoneData);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","phoneType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","phoneRole"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneRole));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","primaryPhone"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryPhone));
                                

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
        public static Phone parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Phone object =
                new Phone();

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
                    
                            if (!"Phone".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Phone)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "phoneType"
                    java.lang.String tempAttribPhoneType =
                        
                                reader.getAttributeValue(null,"phoneType");
                            
                   if (tempAttribPhoneType!=null){
                         java.lang.String content = tempAttribPhoneType;
                        
                                                 object.setPhoneType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPhoneType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("phoneType");
                    
                    // handle attribute "phoneRole"
                    java.lang.String tempAttribPhoneRole =
                        
                                reader.getAttributeValue(null,"phoneRole");
                            
                   if (tempAttribPhoneRole!=null){
                         java.lang.String content = tempAttribPhoneRole;
                        
                                                 object.setPhoneRole(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPhoneRole));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("phoneRole");
                    
                    // handle attribute "primaryPhone"
                    java.lang.String tempAttribPrimaryPhone =
                        
                                reader.getAttributeValue(null,"primaryPhone");
                            
                   if (tempAttribPrimaryPhone!=null){
                         java.lang.String content = tempAttribPrimaryPhone;
                        
                                                 object.setPrimaryPhone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPrimaryPhone));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("primaryPhone");
                    
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","PhoneNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PhoneNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhoneNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","PhoneData").equals(reader.getName())){
                                
                                                object.setPhoneData(com.cloudkey.pms.micros.og.common.PhoneData_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    