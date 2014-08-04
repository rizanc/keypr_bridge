
/**
 * HotelContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  HotelContact bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class HotelContact
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = HotelContact
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Addresses
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress localAddresses ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressesTracker = false ;

                           public boolean isAddressesSpecified(){
                               return localAddressesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress getAddresses(){
                               return localAddresses;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Addresses
                               */
                               public void setAddresses(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress param){
                            localAddressesTracker = param != null;
                                   
                                            this.localAddresses=param;
                                    

                               }
                            

                        /**
                        * field for ContactEmails
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail localContactEmails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactEmailsTracker = false ;

                           public boolean isContactEmailsSpecified(){
                               return localContactEmailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail getContactEmails(){
                               return localContactEmails;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactEmails
                               */
                               public void setContactEmails(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail param){
                            localContactEmailsTracker = param != null;
                                   
                                            this.localContactEmails=param;
                                    

                               }
                            

                        /**
                        * field for ContactPhones
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone localContactPhones ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactPhonesTracker = false ;

                           public boolean isContactPhonesSpecified(){
                               return localContactPhonesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone getContactPhones(){
                               return localContactPhones;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactPhones
                               */
                               public void setContactPhones(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone param){
                            localContactPhonesTracker = param != null;
                                   
                                            this.localContactPhones=param;
                                    

                               }
                            

                        /**
                        * field for HotelInformation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo localHotelInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelInformationTracker = false ;

                           public boolean isHotelInformationSpecified(){
                               return localHotelInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo getHotelInformation(){
                               return localHotelInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelInformation
                               */
                               public void setHotelInformation(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo param){
                            localHotelInformationTracker = param != null;
                                   
                                            this.localHotelInformation=param;
                                    

                               }
                            

                        /**
                        * field for URIs
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI localURIs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localURIsTracker = false ;

                           public boolean isURIsSpecified(){
                               return localURIsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI getURIs(){
                               return localURIs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param URIs
                               */
                               public void setURIs(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI param){
                            localURIsTracker = param != null;
                                   
                                            this.localURIs=param;
                                    

                               }
                            

                        /**
                        * field for Vector
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Vector localVector ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVectorTracker = false ;

                           public boolean isVectorSpecified(){
                               return localVectorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Vector
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Vector getVector(){
                               return localVector;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Vector
                               */
                               public void setVector(com.cloudkey.pms.micros.og.hotelcommon.Vector param){
                            localVectorTracker = param != null;
                                   
                                            this.localVector=param;
                                    

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
                           namespacePrefix+":HotelContact",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "HotelContact",
                           xmlWriter);
                   }

               
                   }
                if (localAddressesTracker){
                                            if (localAddresses==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Addresses cannot be null!!");
                                            }
                                           localAddresses.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Addresses"),
                                               xmlWriter);
                                        } if (localContactEmailsTracker){
                                            if (localContactEmails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContactEmails cannot be null!!");
                                            }
                                           localContactEmails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ContactEmails"),
                                               xmlWriter);
                                        } if (localContactPhonesTracker){
                                            if (localContactPhones==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContactPhones cannot be null!!");
                                            }
                                           localContactPhones.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ContactPhones"),
                                               xmlWriter);
                                        } if (localHotelInformationTracker){
                                            if (localHotelInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                            }
                                           localHotelInformation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelInformation"),
                                               xmlWriter);
                                        } if (localURIsTracker){
                                            if (localURIs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("URIs cannot be null!!");
                                            }
                                           localURIs.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","URIs"),
                                               xmlWriter);
                                        } if (localVectorTracker){
                                            if (localVector==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Vector cannot be null!!");
                                            }
                                           localVector.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Vector"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
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

                 if (localAddressesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Addresses"));
                            
                            
                                    if (localAddresses==null){
                                         throw new org.apache.axis2.databinding.ADBException("Addresses cannot be null!!");
                                    }
                                    elementList.add(localAddresses);
                                } if (localContactEmailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ContactEmails"));
                            
                            
                                    if (localContactEmails==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContactEmails cannot be null!!");
                                    }
                                    elementList.add(localContactEmails);
                                } if (localContactPhonesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ContactPhones"));
                            
                            
                                    if (localContactPhones==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContactPhones cannot be null!!");
                                    }
                                    elementList.add(localContactPhones);
                                } if (localHotelInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "HotelInformation"));
                            
                            
                                    if (localHotelInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelInformation);
                                } if (localURIsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "URIs"));
                            
                            
                                    if (localURIs==null){
                                         throw new org.apache.axis2.databinding.ADBException("URIs cannot be null!!");
                                    }
                                    elementList.add(localURIs);
                                } if (localVectorTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Vector"));
                            
                            
                                    if (localVector==null){
                                         throw new org.apache.axis2.databinding.ADBException("Vector cannot be null!!");
                                    }
                                    elementList.add(localVector);
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
        public static HotelContact parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HotelContact object =
                new HotelContact();

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
                    
                            if (!"HotelContact".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HotelContact)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Addresses").equals(reader.getName())){
                                
                                                object.setAddresses(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ContactEmails").equals(reader.getName())){
                                
                                                object.setContactEmails(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfEmail.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ContactPhones").equals(reader.getName())){
                                
                                                object.setContactPhones(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPhone.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","HotelInformation").equals(reader.getName())){
                                
                                                object.setHotelInformation(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfHotelInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","URIs").equals(reader.getName())){
                                
                                                object.setURIs(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAnyURI.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Vector").equals(reader.getName())){
                                
                                                object.setVector(com.cloudkey.pms.micros.og.hotelcommon.Vector.Factory.parse(reader));
                                              
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
           
    