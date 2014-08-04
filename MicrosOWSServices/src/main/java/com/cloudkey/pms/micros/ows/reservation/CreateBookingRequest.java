
/**
 * CreateBookingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.reservation;
            

            /**
            *  CreateBookingRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CreateBookingRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CreateBookingRequest
                Namespace URI = http://webservices.micros.com/ows/5.1/Reservation.wsdl
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for HotelReservation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.HotelReservation localHotelReservation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelReservationTracker = false ;

                           public boolean isHotelReservationSpecified(){
                               return localHotelReservationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.HotelReservation
                           */
                           public  com.cloudkey.pms.micros.og.reservation.HotelReservation getHotelReservation(){
                               return localHotelReservation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReservation
                               */
                               public void setHotelReservation(com.cloudkey.pms.micros.og.reservation.HotelReservation param){
                            localHotelReservationTracker = param != null;
                                   
                                            this.localHotelReservation=param;
                                    

                               }
                            

                        /**
                        * field for ExternalSystemNumber
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ExternalReference localExternalSystemNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalSystemNumberTracker = false ;

                           public boolean isExternalSystemNumberSpecified(){
                               return localExternalSystemNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ExternalReference
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ExternalReference getExternalSystemNumber(){
                               return localExternalSystemNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalSystemNumber
                               */
                               public void setExternalSystemNumber(com.cloudkey.pms.micros.og.reservation.ExternalReference param){
                            localExternalSystemNumberTracker = param != null;
                                   
                                            this.localExternalSystemNumber=param;
                                    

                               }
                            

                        /**
                        * field for CanHandleVaultedCreditCard
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCanHandleVaultedCreditCard ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanHandleVaultedCreditCard(){
                               return localCanHandleVaultedCreditCard;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanHandleVaultedCreditCard
                               */
                               public void setCanHandleVaultedCreditCard(boolean param){
                            
                                            this.localCanHandleVaultedCreditCard=param;
                                    

                               }
                            

                        /**
                        * field for OverrideInventoryCheck
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOverrideInventoryCheck ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOverrideInventoryCheck(){
                               return localOverrideInventoryCheck;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OverrideInventoryCheck
                               */
                               public void setOverrideInventoryCheck(boolean param){
                            
                                            this.localOverrideInventoryCheck=param;
                                    

                               }
                            

                        /**
                        * field for OverrideRestrictionCheck
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOverrideRestrictionCheck ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOverrideRestrictionCheck(){
                               return localOverrideRestrictionCheck;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OverrideRestrictionCheck
                               */
                               public void setOverrideRestrictionCheck(boolean param){
                            
                                            this.localOverrideRestrictionCheck=param;
                                    

                               }
                            

                        /**
                        * field for AllowDOWPackage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAllowDOWPackage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowDOWPackage(){
                               return localAllowDOWPackage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowDOWPackage
                               */
                               public void setAllowDOWPackage(boolean param){
                            
                                            this.localAllowDOWPackage=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Reservation.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CreateBookingRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CreateBookingRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "canHandleVaultedCreditCard",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "overrideInventoryCheck",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideInventoryCheck), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "overrideRestrictionCheck",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideRestrictionCheck), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "allowDOWPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowDOWPackage), xmlWriter);

                                            
                                      }
                                     if (localHotelReservationTracker){
                                            if (localHotelReservation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReservation cannot be null!!");
                                            }
                                           localHotelReservation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","HotelReservation"),
                                               xmlWriter);
                                        } if (localExternalSystemNumberTracker){
                                            if (localExternalSystemNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExternalSystemNumber cannot be null!!");
                                            }
                                           localExternalSystemNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","ExternalSystemNumber"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Reservation.wsdl")){
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

                 if (localHotelReservationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "HotelReservation"));
                            
                            
                                    if (localHotelReservation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReservation cannot be null!!");
                                    }
                                    elementList.add(localHotelReservation);
                                } if (localExternalSystemNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "ExternalSystemNumber"));
                            
                            
                                    if (localExternalSystemNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExternalSystemNumber cannot be null!!");
                                    }
                                    elementList.add(localExternalSystemNumber);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","canHandleVaultedCreditCard"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","overrideInventoryCheck"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideInventoryCheck));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","overrideRestrictionCheck"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideRestrictionCheck));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","allowDOWPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowDOWPackage));
                                

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
        public static CreateBookingRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreateBookingRequest object =
                new CreateBookingRequest();

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
                    
                            if (!"CreateBookingRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreateBookingRequest)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "canHandleVaultedCreditCard"
                    java.lang.String tempAttribCanHandleVaultedCreditCard =
                        
                                reader.getAttributeValue(null,"canHandleVaultedCreditCard");
                            
                   if (tempAttribCanHandleVaultedCreditCard!=null){
                         java.lang.String content = tempAttribCanHandleVaultedCreditCard;
                        
                                                 object.setCanHandleVaultedCreditCard(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCanHandleVaultedCreditCard));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("canHandleVaultedCreditCard");
                    
                    // handle attribute "overrideInventoryCheck"
                    java.lang.String tempAttribOverrideInventoryCheck =
                        
                                reader.getAttributeValue(null,"overrideInventoryCheck");
                            
                   if (tempAttribOverrideInventoryCheck!=null){
                         java.lang.String content = tempAttribOverrideInventoryCheck;
                        
                                                 object.setOverrideInventoryCheck(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOverrideInventoryCheck));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("overrideInventoryCheck");
                    
                    // handle attribute "overrideRestrictionCheck"
                    java.lang.String tempAttribOverrideRestrictionCheck =
                        
                                reader.getAttributeValue(null,"overrideRestrictionCheck");
                            
                   if (tempAttribOverrideRestrictionCheck!=null){
                         java.lang.String content = tempAttribOverrideRestrictionCheck;
                        
                                                 object.setOverrideRestrictionCheck(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOverrideRestrictionCheck));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("overrideRestrictionCheck");
                    
                    // handle attribute "allowDOWPackage"
                    java.lang.String tempAttribAllowDOWPackage =
                        
                                reader.getAttributeValue(null,"allowDOWPackage");
                            
                   if (tempAttribAllowDOWPackage!=null){
                         java.lang.String content = tempAttribAllowDOWPackage;
                        
                                                 object.setAllowDOWPackage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAllowDOWPackage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("allowDOWPackage");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","HotelReservation").equals(reader.getName())){
                                
                                                object.setHotelReservation(com.cloudkey.pms.micros.og.reservation.HotelReservation.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","ExternalSystemNumber").equals(reader.getName())){
                                
                                                object.setExternalSystemNumber(com.cloudkey.pms.micros.og.reservation.ExternalReference.Factory.parse(reader));
                                              
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
           
    