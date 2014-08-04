
/**
 * Preference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  Preference bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Preference
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Preference
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for PreferenceDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText localPreferenceDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreferenceDescriptionTracker = false ;

                           public boolean isPreferenceDescriptionSpecified(){
                               return localPreferenceDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText getPreferenceDescription(){
                               return localPreferenceDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreferenceDescription
                               */
                               public void setPreferenceDescription(com.cloudkey.pms.micros.og.common.DescriptiveText param){
                            localPreferenceDescriptionTracker = param != null;
                                   
                                            this.localPreferenceDescription=param;
                                    

                               }
                            

                        /**
                        * field for ResortCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localResortCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResortCode(){
                               return localResortCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResortCode
                               */
                               public void setResortCode(java.lang.String param){
                            
                                            this.localResortCode=param;
                                    

                               }
                            

                        /**
                        * field for PreferenceType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPreferenceType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreferenceType(){
                               return localPreferenceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreferenceType
                               */
                               public void setPreferenceType(java.lang.String param){
                            
                                            this.localPreferenceType=param;
                                    

                               }
                            

                        /**
                        * field for OtherPreferenceType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherPreferenceType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherPreferenceType(){
                               return localOtherPreferenceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherPreferenceType
                               */
                               public void setOtherPreferenceType(java.lang.String param){
                            
                                            this.localOtherPreferenceType=param;
                                    

                               }
                            

                        /**
                        * field for PreferenceValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPreferenceValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPreferenceValue(){
                               return localPreferenceValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreferenceValue
                               */
                               public void setPreferenceValue(java.lang.String param){
                            
                                            this.localPreferenceValue=param;
                                    

                               }
                            

                        /**
                        * field for InsertUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInsertUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInsertUser(){
                               return localInsertUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertUser
                               */
                               public void setInsertUser(java.lang.String param){
                            
                                            this.localInsertUser=param;
                                    

                               }
                            

                        /**
                        * field for InsertDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localInsertDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInsertDate(){
                               return localInsertDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertDate
                               */
                               public void setInsertDate(java.util.Calendar param){
                            
                                            this.localInsertDate=param;
                                    

                               }
                            

                        /**
                        * field for UpdateUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUpdateUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdateUser(){
                               return localUpdateUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateUser
                               */
                               public void setUpdateUser(java.lang.String param){
                            
                                            this.localUpdateUser=param;
                                    

                               }
                            

                        /**
                        * field for UpdateDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localUpdateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getUpdateDate(){
                               return localUpdateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateDate
                               */
                               public void setUpdateDate(java.util.Calendar param){
                            
                                            this.localUpdateDate=param;
                                    

                               }
                            

                        /**
                        * field for InactiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localInactiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getInactiveDate(){
                               return localInactiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDate
                               */
                               public void setInactiveDate(java.util.Date param){
                            
                                            this.localInactiveDate=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Name/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Preference",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Preference",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localResortCode != null){
                                        
                                                writeAttribute("",
                                                         "resortCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResortCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localPreferenceType != null){
                                        
                                                writeAttribute("",
                                                         "preferenceType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreferenceType), xmlWriter);

                                            
                                      }
                                    
                                            if (localOtherPreferenceType != null){
                                        
                                                writeAttribute("",
                                                         "otherPreferenceType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherPreferenceType), xmlWriter);

                                            
                                      }
                                    
                                            if (localPreferenceValue != null){
                                        
                                                writeAttribute("",
                                                         "preferenceValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreferenceValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertUser != null){
                                        
                                                writeAttribute("",
                                                         "insertUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertDate != null){
                                        
                                                writeAttribute("",
                                                         "insertDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateUser != null){
                                        
                                                writeAttribute("",
                                                         "updateUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateDate != null){
                                        
                                                writeAttribute("",
                                                         "updateDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localInactiveDate != null){
                                        
                                                writeAttribute("",
                                                         "inactiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate), xmlWriter);

                                            
                                      }
                                     if (localPreferenceDescriptionTracker){
                                            if (localPreferenceDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PreferenceDescription cannot be null!!");
                                            }
                                           localPreferenceDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","PreferenceDescription"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Name/")){
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

                 if (localPreferenceDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "PreferenceDescription"));
                            
                            
                                    if (localPreferenceDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("PreferenceDescription cannot be null!!");
                                    }
                                    elementList.add(localPreferenceDescription);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","resortCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResortCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","preferenceType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreferenceType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherPreferenceType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherPreferenceType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","preferenceValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreferenceValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","inactiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate));
                                

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
        public static Preference parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Preference object =
                new Preference();

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
                    
                            if (!"Preference".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Preference)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "resortCode"
                    java.lang.String tempAttribResortCode =
                        
                                reader.getAttributeValue(null,"resortCode");
                            
                   if (tempAttribResortCode!=null){
                         java.lang.String content = tempAttribResortCode;
                        
                                                 object.setResortCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribResortCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("resortCode");
                    
                    // handle attribute "preferenceType"
                    java.lang.String tempAttribPreferenceType =
                        
                                reader.getAttributeValue(null,"preferenceType");
                            
                   if (tempAttribPreferenceType!=null){
                         java.lang.String content = tempAttribPreferenceType;
                        
                                                 object.setPreferenceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPreferenceType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("preferenceType");
                    
                    // handle attribute "otherPreferenceType"
                    java.lang.String tempAttribOtherPreferenceType =
                        
                                reader.getAttributeValue(null,"otherPreferenceType");
                            
                   if (tempAttribOtherPreferenceType!=null){
                         java.lang.String content = tempAttribOtherPreferenceType;
                        
                                                 object.setOtherPreferenceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherPreferenceType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherPreferenceType");
                    
                    // handle attribute "preferenceValue"
                    java.lang.String tempAttribPreferenceValue =
                        
                                reader.getAttributeValue(null,"preferenceValue");
                            
                   if (tempAttribPreferenceValue!=null){
                         java.lang.String content = tempAttribPreferenceValue;
                        
                                                 object.setPreferenceValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPreferenceValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("preferenceValue");
                    
                    // handle attribute "insertUser"
                    java.lang.String tempAttribInsertUser =
                        
                                reader.getAttributeValue(null,"insertUser");
                            
                   if (tempAttribInsertUser!=null){
                         java.lang.String content = tempAttribInsertUser;
                        
                                                 object.setInsertUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInsertUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertUser");
                    
                    // handle attribute "insertDate"
                    java.lang.String tempAttribInsertDate =
                        
                                reader.getAttributeValue(null,"insertDate");
                            
                   if (tempAttribInsertDate!=null){
                         java.lang.String content = tempAttribInsertDate;
                        
                                                 object.setInsertDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribInsertDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertDate");
                    
                    // handle attribute "updateUser"
                    java.lang.String tempAttribUpdateUser =
                        
                                reader.getAttributeValue(null,"updateUser");
                            
                   if (tempAttribUpdateUser!=null){
                         java.lang.String content = tempAttribUpdateUser;
                        
                                                 object.setUpdateUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUpdateUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateUser");
                    
                    // handle attribute "updateDate"
                    java.lang.String tempAttribUpdateDate =
                        
                                reader.getAttributeValue(null,"updateDate");
                            
                   if (tempAttribUpdateDate!=null){
                         java.lang.String content = tempAttribUpdateDate;
                        
                                                 object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribUpdateDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateDate");
                    
                    // handle attribute "inactiveDate"
                    java.lang.String tempAttribInactiveDate =
                        
                                reader.getAttributeValue(null,"inactiveDate");
                            
                   if (tempAttribInactiveDate!=null){
                         java.lang.String content = tempAttribInactiveDate;
                        
                                                 object.setInactiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribInactiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("inactiveDate");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","PreferenceDescription").equals(reader.getName())){
                                
                                                object.setPreferenceDescription(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                              
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
           
    