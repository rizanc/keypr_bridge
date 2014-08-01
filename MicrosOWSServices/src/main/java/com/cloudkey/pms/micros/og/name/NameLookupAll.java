
/**
 * NameLookupAll.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  NameLookupAll bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NameLookupAll
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = NameLookupAll
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for LastName
                        */

                        
                                    protected java.lang.String localLastName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameTracker = false ;

                           public boolean isLastNameSpecified(){
                               return localLastNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastName(){
                               return localLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastName
                               */
                               public void setLastName(java.lang.String param){
                            localLastNameTracker = param != null;
                                   
                                            this.localLastName=param;
                                    

                               }
                            

                        /**
                        * field for FirstName
                        */

                        
                                    protected java.lang.String localFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameTracker = false ;

                           public boolean isFirstNameSpecified(){
                               return localFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFirstName(){
                               return localFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstName
                               */
                               public void setFirstName(java.lang.String param){
                            localFirstNameTracker = param != null;
                                   
                                            this.localFirstName=param;
                                    

                               }
                            

                        /**
                        * field for MembershipType
                        */

                        
                                    protected java.lang.String localMembershipType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipTypeTracker = false ;

                           public boolean isMembershipTypeSpecified(){
                               return localMembershipTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipType(){
                               return localMembershipType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipType
                               */
                               public void setMembershipType(java.lang.String param){
                            localMembershipTypeTracker = param != null;
                                   
                                            this.localMembershipType=param;
                                    

                               }
                            

                        /**
                        * field for MembershipNumber
                        */

                        
                                    protected java.lang.String localMembershipNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipNumberTracker = false ;

                           public boolean isMembershipNumberSpecified(){
                               return localMembershipNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipNumber(){
                               return localMembershipNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipNumber
                               */
                               public void setMembershipNumber(java.lang.String param){
                            localMembershipNumberTracker = param != null;
                                   
                                            this.localMembershipNumber=param;
                                    

                               }
                            

                        /**
                        * field for CardCode
                        */

                        
                                    protected java.lang.String localCardCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardCodeTracker = false ;

                           public boolean isCardCodeSpecified(){
                               return localCardCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardCode(){
                               return localCardCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardCode
                               */
                               public void setCardCode(java.lang.String param){
                            localCardCodeTracker = param != null;
                                   
                                            this.localCardCode=param;
                                    

                               }
                            

                        /**
                        * field for EmailAddress
                        */

                        
                                    protected java.lang.String localEmailAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailAddressTracker = false ;

                           public boolean isEmailAddressSpecified(){
                               return localEmailAddressTracker;
                           }

                           

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
                            localEmailAddressTracker = param != null;
                                   
                                            this.localEmailAddress=param;
                                    

                               }
                            

                        /**
                        * field for ActiveYn
                        */

                        
                                    protected java.lang.String localActiveYn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveYnTracker = false ;

                           public boolean isActiveYnSpecified(){
                               return localActiveYnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getActiveYn(){
                               return localActiveYn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveYn
                               */
                               public void setActiveYn(java.lang.String param){
                            localActiveYnTracker = param != null;
                                   
                                            this.localActiveYn=param;
                                    

                               }
                            

                        /**
                        * field for NameLookupAllChoice_type0
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupAllChoice_type0 localNameLookupAllChoice_type0 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameLookupAllChoice_type0Tracker = false ;

                           public boolean isNameLookupAllChoice_type0Specified(){
                               return localNameLookupAllChoice_type0Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameLookupAllChoice_type0
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupAllChoice_type0 getNameLookupAllChoice_type0(){
                               return localNameLookupAllChoice_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameLookupAllChoice_type0
                               */
                               public void setNameLookupAllChoice_type0(com.cloudkey.pms.micros.og.name.NameLookupAllChoice_type0 param){
                            localNameLookupAllChoice_type0Tracker = param != null;
                                   
                                            this.localNameLookupAllChoice_type0=param;
                                    

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
                        * field for NoOfRows
                        */

                        
                                    protected double localNoOfRows ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoOfRowsTracker = false ;

                           public boolean isNoOfRowsSpecified(){
                               return localNoOfRowsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNoOfRows(){
                               return localNoOfRows;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoOfRows
                               */
                               public void setNoOfRows(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNoOfRowsTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNoOfRows=param;
                                    

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
                           namespacePrefix+":NameLookupAll",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "NameLookupAll",
                           xmlWriter);
                   }

               
                   }
                if (localLastNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "LastName", xmlWriter);
                             

                                          if (localLastName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirstNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "FirstName", xmlWriter);
                             

                                          if (localFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "MembershipType", xmlWriter);
                             

                                          if (localMembershipType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "MembershipNumber", xmlWriter);
                             

                                          if (localMembershipNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "CardCode", xmlWriter);
                             

                                          if (localCardCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailAddressTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "EmailAddress", xmlWriter);
                             

                                          if (localEmailAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EmailAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmailAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localActiveYnTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "ActiveYn", xmlWriter);
                             

                                          if (localActiveYn==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ActiveYn cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localActiveYn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameLookupAllChoice_type0Tracker){
                                            if (localNameLookupAllChoice_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameLookupAllChoice_type0 cannot be null!!");
                                            }
                                           localNameLookupAllChoice_type0.serialize(null,xmlWriter);
                                        } if (localNativeNameTracker){
                                            if (localNativeName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                            }
                                           localNativeName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NativeName"),
                                               xmlWriter);
                                        } if (localNoOfRowsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Name/";
                                    writeStartElement(null, namespace, "NoOfRows", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNoOfRows)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NoOfRows cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoOfRows));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Name/")){
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

                 if (localLastNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "LastName"));
                                 
                                        if (localLastName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                        }
                                    } if (localFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "FirstName"));
                                 
                                        if (localFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                        }
                                    } if (localMembershipTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "MembershipType"));
                                 
                                        if (localMembershipType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                        }
                                    } if (localMembershipNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "MembershipNumber"));
                                 
                                        if (localMembershipNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipNumber cannot be null!!");
                                        }
                                    } if (localCardCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "CardCode"));
                                 
                                        if (localCardCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardCode cannot be null!!");
                                        }
                                    } if (localEmailAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "EmailAddress"));
                                 
                                        if (localEmailAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EmailAddress cannot be null!!");
                                        }
                                    } if (localActiveYnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "ActiveYn"));
                                 
                                        if (localActiveYn != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActiveYn));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ActiveYn cannot be null!!");
                                        }
                                    } if (localNameLookupAllChoice_type0Tracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NameLookupAllChoice_type0"));
                            
                            
                                    if (localNameLookupAllChoice_type0==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameLookupAllChoice_type0 cannot be null!!");
                                    }
                                    elementList.add(localNameLookupAllChoice_type0);
                                } if (localNativeNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NativeName"));
                            
                            
                                    if (localNativeName==null){
                                         throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                    }
                                    elementList.add(localNativeName);
                                } if (localNoOfRowsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NoOfRows"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoOfRows));
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
        public static NameLookupAll parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NameLookupAll object =
                new NameLookupAll();

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
                    
                            if (!"NameLookupAll".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NameLookupAll)com.cloudkey.pms.micros.ows.name.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","LastName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LastName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","FirstName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FirstName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","MembershipType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","MembershipNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","CardCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CardCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","EmailAddress").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EmailAddress" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmailAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","ActiveYn").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ActiveYn" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActiveYn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                        
                                         try{
                                    
                                    if (reader.isStartElement() ){
                                
                                                object.setNameLookupAllChoice_type0(com.cloudkey.pms.micros.og.name.NameLookupAllChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                
                                 } catch (java.lang.Exception e) {}
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NativeName").equals(reader.getName())){
                                
                                                object.setNativeName(com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NoOfRows").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NoOfRows" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNoOfRows(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNoOfRows(java.lang.Double.NaN);
                                           
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
           
    