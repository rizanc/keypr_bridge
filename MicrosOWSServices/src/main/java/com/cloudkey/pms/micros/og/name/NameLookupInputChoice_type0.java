
/**
 * NameLookupInputChoice_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  NameLookupInputChoice_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NameLookupInputChoice_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = NameLookupInputChoice_type0
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns3
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localNameTracker = false;
                
                   localMembershipTracker = false;
                
                   localCreditCardTracker = false;
                
                   localNameLookupTracker = false;
                
                   localEmailAddressTracker = false;
                
            }
        

                        /**
                        * field for Name
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupCriteriaName localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameLookupCriteriaName
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupCriteriaName getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(com.cloudkey.pms.micros.og.name.NameLookupCriteriaName param){
                            
                                clearAllSettingTrackers();
                            localNameTracker = param != null;
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Membership
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership localMembership ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipTracker = false ;

                           public boolean isMembershipSpecified(){
                               return localMembershipTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership getMembership(){
                               return localMembership;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Membership
                               */
                               public void setMembership(com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership param){
                            
                                clearAllSettingTrackers();
                            localMembershipTracker = param != null;
                                   
                                            this.localMembership=param;
                                    

                               }
                            

                        /**
                        * field for CreditCard
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupCriteriaCreditCard localCreditCard ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardTracker = false ;

                           public boolean isCreditCardSpecified(){
                               return localCreditCardTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameLookupCriteriaCreditCard
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupCriteriaCreditCard getCreditCard(){
                               return localCreditCard;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCard
                               */
                               public void setCreditCard(com.cloudkey.pms.micros.og.name.NameLookupCriteriaCreditCard param){
                            
                                clearAllSettingTrackers();
                            localCreditCardTracker = param != null;
                                   
                                            this.localCreditCard=param;
                                    

                               }
                            

                        /**
                        * field for NameLookup
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupAll localNameLookup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameLookupTracker = false ;

                           public boolean isNameLookupSpecified(){
                               return localNameLookupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameLookupAll
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupAll getNameLookup(){
                               return localNameLookup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameLookup
                               */
                               public void setNameLookup(com.cloudkey.pms.micros.og.name.NameLookupAll param){
                            
                                clearAllSettingTrackers();
                            localNameLookupTracker = param != null;
                                   
                                            this.localNameLookup=param;
                                    

                               }
                            

                        /**
                        * field for EmailAddress
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameLookupCriteriaEmailAddress localEmailAddress ;
                                
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
                           * @return com.cloudkey.pms.micros.og.name.NameLookupCriteriaEmailAddress
                           */
                           public  com.cloudkey.pms.micros.og.name.NameLookupCriteriaEmailAddress getEmailAddress(){
                               return localEmailAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailAddress
                               */
                               public void setEmailAddress(com.cloudkey.pms.micros.og.name.NameLookupCriteriaEmailAddress param){
                            
                                clearAllSettingTrackers();
                            localEmailAddressTracker = param != null;
                                   
                                            this.localEmailAddress=param;
                                    

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Name/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":NameLookupInputChoice_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "NameLookupInputChoice_type0",
                           xmlWriter);
                   }

               
                   }
                if (localNameTracker){
                                            if (localName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                            }
                                           localName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Name"),
                                               xmlWriter);
                                        } if (localMembershipTracker){
                                            if (localMembership==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Membership cannot be null!!");
                                            }
                                           localMembership.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Membership"),
                                               xmlWriter);
                                        } if (localCreditCardTracker){
                                            if (localCreditCard==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCard cannot be null!!");
                                            }
                                           localCreditCard.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","CreditCard"),
                                               xmlWriter);
                                        } if (localNameLookupTracker){
                                            if (localNameLookup==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameLookup cannot be null!!");
                                            }
                                           localNameLookup.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NameLookup"),
                                               xmlWriter);
                                        } if (localEmailAddressTracker){
                                            if (localEmailAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EmailAddress cannot be null!!");
                                            }
                                           localEmailAddress.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","EmailAddress"),
                                               xmlWriter);
                                        }

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

                 if (localNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Name"));
                            
                            
                                    if (localName==null){
                                         throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                    }
                                    elementList.add(localName);
                                } if (localMembershipTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "Membership"));
                            
                            
                                    if (localMembership==null){
                                         throw new org.apache.axis2.databinding.ADBException("Membership cannot be null!!");
                                    }
                                    elementList.add(localMembership);
                                } if (localCreditCardTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "CreditCard"));
                            
                            
                                    if (localCreditCard==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCard cannot be null!!");
                                    }
                                    elementList.add(localCreditCard);
                                } if (localNameLookupTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "NameLookup"));
                            
                            
                                    if (localNameLookup==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameLookup cannot be null!!");
                                    }
                                    elementList.add(localNameLookup);
                                } if (localEmailAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/",
                                                                      "EmailAddress"));
                            
                            
                                    if (localEmailAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("EmailAddress cannot be null!!");
                                    }
                                    elementList.add(localEmailAddress);
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
        public static NameLookupInputChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NameLookupInputChoice_type0 object =
                new NameLookupInputChoice_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Name").equals(reader.getName())){
                                
                                                object.setName(com.cloudkey.pms.micros.og.name.NameLookupCriteriaName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","Membership").equals(reader.getName())){
                                
                                                object.setMembership(com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","CreditCard").equals(reader.getName())){
                                
                                                object.setCreditCard(com.cloudkey.pms.micros.og.name.NameLookupCriteriaCreditCard.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NameLookup").equals(reader.getName())){
                                
                                                object.setNameLookup(com.cloudkey.pms.micros.og.name.NameLookupAll.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","EmailAddress").equals(reader.getName())){
                                
                                                object.setEmailAddress(com.cloudkey.pms.micros.og.name.NameLookupCriteriaEmailAddress.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    