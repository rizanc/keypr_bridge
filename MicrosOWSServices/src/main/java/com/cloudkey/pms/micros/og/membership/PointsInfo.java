
/**
 * PointsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  PointsInfo bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PointsInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PointsInfo
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for AwardPointsInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.AwardPointsInfo localAwardPointsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardPointsInfoTracker = false ;

                           public boolean isAwardPointsInfoSpecified(){
                               return localAwardPointsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.AwardPointsInfo
                           */
                           public  com.cloudkey.pms.micros.og.membership.AwardPointsInfo getAwardPointsInfo(){
                               return localAwardPointsInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardPointsInfo
                               */
                               public void setAwardPointsInfo(com.cloudkey.pms.micros.og.membership.AwardPointsInfo param){
                            localAwardPointsInfoTracker = param != null;
                                   
                                            this.localAwardPointsInfo=param;
                                    

                               }
                            

                        /**
                        * field for TierPointsInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.TierPointsInfo localTierPointsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTierPointsInfoTracker = false ;

                           public boolean isTierPointsInfoSpecified(){
                               return localTierPointsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.TierPointsInfo
                           */
                           public  com.cloudkey.pms.micros.og.membership.TierPointsInfo getTierPointsInfo(){
                               return localTierPointsInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TierPointsInfo
                               */
                               public void setTierPointsInfo(com.cloudkey.pms.micros.og.membership.TierPointsInfo param){
                            localTierPointsInfoTracker = param != null;
                                   
                                            this.localTierPointsInfo=param;
                                    

                               }
                            

                        /**
                        * field for StayPointsInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.StayPointsInfo localStayPointsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStayPointsInfoTracker = false ;

                           public boolean isStayPointsInfoSpecified(){
                               return localStayPointsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.StayPointsInfo
                           */
                           public  com.cloudkey.pms.micros.og.membership.StayPointsInfo getStayPointsInfo(){
                               return localStayPointsInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayPointsInfo
                               */
                               public void setStayPointsInfo(com.cloudkey.pms.micros.og.membership.StayPointsInfo param){
                            localStayPointsInfoTracker = param != null;
                                   
                                            this.localStayPointsInfo=param;
                                    

                               }
                            

                        /**
                        * field for TransactionPointsInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.TransactionPointsInfo localTransactionPointsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionPointsInfoTracker = false ;

                           public boolean isTransactionPointsInfoSpecified(){
                               return localTransactionPointsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.TransactionPointsInfo
                           */
                           public  com.cloudkey.pms.micros.og.membership.TransactionPointsInfo getTransactionPointsInfo(){
                               return localTransactionPointsInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionPointsInfo
                               */
                               public void setTransactionPointsInfo(com.cloudkey.pms.micros.og.membership.TransactionPointsInfo param){
                            localTransactionPointsInfoTracker = param != null;
                                   
                                            this.localTransactionPointsInfo=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Membership/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":PointsInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PointsInfo",
                           xmlWriter);
                   }

               
                   }
                if (localAwardPointsInfoTracker){
                                            if (localAwardPointsInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AwardPointsInfo cannot be null!!");
                                            }
                                           localAwardPointsInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardPointsInfo"),
                                               xmlWriter);
                                        } if (localTierPointsInfoTracker){
                                            if (localTierPointsInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TierPointsInfo cannot be null!!");
                                            }
                                           localTierPointsInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TierPointsInfo"),
                                               xmlWriter);
                                        } if (localStayPointsInfoTracker){
                                            if (localStayPointsInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayPointsInfo cannot be null!!");
                                            }
                                           localStayPointsInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","StayPointsInfo"),
                                               xmlWriter);
                                        } if (localTransactionPointsInfoTracker){
                                            if (localTransactionPointsInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TransactionPointsInfo cannot be null!!");
                                            }
                                           localTransactionPointsInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TransactionPointsInfo"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
                return "ns5";
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

                 if (localAwardPointsInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardPointsInfo"));
                            
                            
                                    if (localAwardPointsInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AwardPointsInfo cannot be null!!");
                                    }
                                    elementList.add(localAwardPointsInfo);
                                } if (localTierPointsInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "TierPointsInfo"));
                            
                            
                                    if (localTierPointsInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("TierPointsInfo cannot be null!!");
                                    }
                                    elementList.add(localTierPointsInfo);
                                } if (localStayPointsInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "StayPointsInfo"));
                            
                            
                                    if (localStayPointsInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayPointsInfo cannot be null!!");
                                    }
                                    elementList.add(localStayPointsInfo);
                                } if (localTransactionPointsInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "TransactionPointsInfo"));
                            
                            
                                    if (localTransactionPointsInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("TransactionPointsInfo cannot be null!!");
                                    }
                                    elementList.add(localTransactionPointsInfo);
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
        public static PointsInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PointsInfo object =
                new PointsInfo();

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
                    
                            if (!"PointsInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PointsInfo)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardPointsInfo").equals(reader.getName())){
                                
                                                object.setAwardPointsInfo(com.cloudkey.pms.micros.og.membership.AwardPointsInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TierPointsInfo").equals(reader.getName())){
                                
                                                object.setTierPointsInfo(com.cloudkey.pms.micros.og.membership.TierPointsInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","StayPointsInfo").equals(reader.getName())){
                                
                                                object.setStayPointsInfo(com.cloudkey.pms.micros.og.membership.StayPointsInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TransactionPointsInfo").equals(reader.getName())){
                                
                                                object.setTransactionPointsInfo(com.cloudkey.pms.micros.og.membership.TransactionPointsInfo.Factory.parse(reader));
                                              
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
           
    