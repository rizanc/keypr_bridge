
/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  Customer bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Customer
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Customer
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for PersonName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.PersonName localPersonName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonNameTracker = false ;

                           public boolean isPersonNameSpecified(){
                               return localPersonNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.PersonName
                           */
                           public  com.cloudkey.pms.micros.og.common.PersonName getPersonName(){
                               return localPersonName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonName
                               */
                               public void setPersonName(com.cloudkey.pms.micros.og.common.PersonName param){
                            localPersonNameTracker = param != null;
                                   
                                            this.localPersonName=param;
                                    

                               }
                            

                        /**
                        * field for NativeName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NativeName localNativeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNativeNameTracker = false ;

                           public boolean isNativeNameSpecified(){
                               return localNativeNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NativeName
                           */
                           public  com.cloudkey.pms.micros.og.name.NativeName getNativeName(){
                               return localNativeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NativeName
                               */
                               public void setNativeName(com.cloudkey.pms.micros.og.name.NativeName param){
                            localNativeNameTracker = param != null;
                                   
                                            this.localNativeName=param;
                                    

                               }
                            

                        /**
                        * field for BusinessTitle
                        */

                        
                                    protected java.lang.String localBusinessTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBusinessTitleTracker = false ;

                           public boolean isBusinessTitleSpecified(){
                               return localBusinessTitleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBusinessTitle(){
                               return localBusinessTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BusinessTitle
                               */
                               public void setBusinessTitle(java.lang.String param){
                            localBusinessTitleTracker = param != null;
                                   
                                            this.localBusinessTitle=param;
                                    

                               }
                            

                        /**
                        * field for GovernmentIDList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID localGovernmentIDList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGovernmentIDListTracker = false ;

                           public boolean isGovernmentIDListSpecified(){
                               return localGovernmentIDListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID getGovernmentIDList(){
                               return localGovernmentIDList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GovernmentIDList
                               */
                               public void setGovernmentIDList(com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID param){
                            localGovernmentIDListTracker = param != null;
                                   
                                            this.localGovernmentIDList=param;
                                    

                               }
                            

                        /**
                        * field for Gender
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Gender localGender ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Gender
                           */
                           public  com.cloudkey.pms.micros.og.common.Gender getGender(){
                               return localGender;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gender
                               */
                               public void setGender(com.cloudkey.pms.micros.og.common.Gender param){
                            
                                            this.localGender=param;
                                    

                               }
                            

                        /**
                        * field for BirthDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localBirthDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getBirthDate(){
                               return localBirthDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BirthDate
                               */
                               public void setBirthDate(java.util.Date param){
                            
                                            this.localBirthDate=param;
                                    

                               }
                            

                        /**
                        * field for ProfileType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localProfileType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProfileType(){
                               return localProfileType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileType
                               */
                               public void setProfileType(java.lang.String param){
                            
                                            this.localProfileType=param;
                                    

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
                           namespacePrefix+":Customer",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Customer",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localGender != null){
                                        writeAttribute("",
                                           "gender",
                                           localGender.toString(), xmlWriter);
                                    }
                                    
                                            if (localBirthDate != null){
                                        
                                                writeAttribute("",
                                                         "birthDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localProfileType != null){
                                        
                                                writeAttribute("",
                                                         "profileType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfileType), xmlWriter);

                                            
                                      }
                                     if (localPersonNameTracker){
                                            if (localPersonName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                            }
                                           localPersonName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","PersonName"),
                                               xmlWriter);
                                        } if (localNativeNameTracker){
                                            if (localNativeName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                            }
                                           localNativeName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NativeName"),
                                               xmlWriter);
                                        } if (localBusinessTitleTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "BusinessTitle", xmlWriter);
                             

                                          if (localBusinessTitle==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BusinessTitle cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBusinessTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGovernmentIDListTracker){
                                            if (localGovernmentIDList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GovernmentIDList cannot be null!!");
                                            }
                                           localGovernmentIDList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","GovernmentIDList"),
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

                 if (localPersonNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "PersonName"));
                            
                            
                                    if (localPersonName==null){
                                         throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                    }
                                    elementList.add(localPersonName);
                                } if (localNativeNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NativeName"));
                            
                            
                                    if (localNativeName==null){
                                         throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                    }
                                    elementList.add(localNativeName);
                                } if (localBusinessTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "BusinessTitle"));
                                 
                                        if (localBusinessTitle != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBusinessTitle));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BusinessTitle cannot be null!!");
                                        }
                                    } if (localGovernmentIDListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "GovernmentIDList"));
                            
                            
                                    if (localGovernmentIDList==null){
                                         throw new org.apache.axis2.databinding.ADBException("GovernmentIDList cannot be null!!");
                                    }
                                    elementList.add(localGovernmentIDList);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","gender"));
                            
                                      attribList.add(localGender.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","birthDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","profileType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfileType));
                                

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
        public static Customer parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Customer object =
                new Customer();

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
                    
                            if (!"Customer".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Customer)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "gender"
                    java.lang.String tempAttribGender =
                        
                                reader.getAttributeValue(null,"gender");
                            
                   if (tempAttribGender!=null){
                         java.lang.String content = tempAttribGender;
                        
                                                  object.setGender(
                                                        com.cloudkey.pms.micros.og.common.Gender.Factory.fromString(reader,tempAttribGender));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("gender");
                    
                    // handle attribute "birthDate"
                    java.lang.String tempAttribBirthDate =
                        
                                reader.getAttributeValue(null,"birthDate");
                            
                   if (tempAttribBirthDate!=null){
                         java.lang.String content = tempAttribBirthDate;
                        
                                                 object.setBirthDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribBirthDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("birthDate");
                    
                    // handle attribute "profileType"
                    java.lang.String tempAttribProfileType =
                        
                                reader.getAttributeValue(null,"profileType");
                            
                   if (tempAttribProfileType!=null){
                         java.lang.String content = tempAttribProfileType;
                        
                                                 object.setProfileType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribProfileType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("profileType");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","PersonName").equals(reader.getName())){
                                
                                                object.setPersonName(com.cloudkey.pms.micros.og.common.PersonName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NativeName").equals(reader.getName())){
                                
                                                object.setNativeName(com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","BusinessTitle").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BusinessTitle" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBusinessTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","GovernmentIDList").equals(reader.getName())){
                                
                                                object.setGovernmentIDList(com.cloudkey.pms.micros.og.common.ArrayOfGovernmentID.Factory.parse(reader));
                                              
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
           
    