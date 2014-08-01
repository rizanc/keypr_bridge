
/**
 * CreditCardAuthorizationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  CreditCardAuthorizationDetail bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CreditCardAuthorizationDetail
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CreditCardAuthorizationDetail
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for CreditCard
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.CreditCard localCreditCard ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.CreditCard
                           */
                           public  com.cloudkey.pms.micros.og.common.CreditCard getCreditCard(){
                               return localCreditCard;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCard
                               */
                               public void setCreditCard(com.cloudkey.pms.micros.og.common.CreditCard param){
                            
                                            this.localCreditCard=param;
                                    

                               }
                            

                        /**
                        * field for ApprovalAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localApprovalAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getApprovalAmount(){
                               return localApprovalAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApprovalAmount
                               */
                               public void setApprovalAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            
                                            this.localApprovalAmount=param;
                                    

                               }
                            

                        /**
                        * field for ApprovalCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localApprovalCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getApprovalCode(){
                               return localApprovalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApprovalCode
                               */
                               public void setApprovalCode(java.lang.String param){
                            
                                            this.localApprovalCode=param;
                                    

                               }
                            

                        /**
                        * field for SettlementDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localSettlementDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getSettlementDate(){
                               return localSettlementDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SettlementDate
                               */
                               public void setSettlementDate(java.util.Date param){
                            
                                            this.localSettlementDate=param;
                                    

                               }
                            

                        /**
                        * field for SettlementTime
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSettlementTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSettlementTime(){
                               return localSettlementTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SettlementTime
                               */
                               public void setSettlementTime(java.lang.String param){
                            
                                            this.localSettlementTime=param;
                                    

                               }
                            

                        /**
                        * field for TransactionType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionType(){
                               return localTransactionType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionType
                               */
                               public void setTransactionType(java.lang.String param){
                            
                                            this.localTransactionType=param;
                                    

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
                           namespacePrefix+":CreditCardAuthorizationDetail",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CreditCardAuthorizationDetail",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localApprovalCode != null){
                                        
                                                writeAttribute("",
                                                         "ApprovalCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApprovalCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localApprovalCode is null");
                                      }
                                    
                                            if (localSettlementDate != null){
                                        
                                                writeAttribute("",
                                                         "SettlementDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettlementDate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localSettlementDate is null");
                                      }
                                    
                                            if (localSettlementTime != null){
                                        
                                                writeAttribute("",
                                                         "SettlementTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettlementTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionType != null){
                                        
                                                writeAttribute("",
                                                         "TransactionType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionType), xmlWriter);

                                            
                                      }
                                    
                                            if (localCreditCard==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCard cannot be null!!");
                                            }
                                           localCreditCard.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CreditCard"),
                                               xmlWriter);
                                        
                                            if (localApprovalAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ApprovalAmount cannot be null!!");
                                            }
                                           localApprovalAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ApprovalAmount"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CreditCard"));
                            
                            
                                    if (localCreditCard==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCard cannot be null!!");
                                    }
                                    elementList.add(localCreditCard);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ApprovalAmount"));
                            
                            
                                    if (localApprovalAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("ApprovalAmount cannot be null!!");
                                    }
                                    elementList.add(localApprovalAmount);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ApprovalCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApprovalCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SettlementDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettlementDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SettlementTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSettlementTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TransactionType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionType));
                                

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
        public static CreditCardAuthorizationDetail parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreditCardAuthorizationDetail object =
                new CreditCardAuthorizationDetail();

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
                    
                            if (!"CreditCardAuthorizationDetail".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreditCardAuthorizationDetail)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ApprovalCode"
                    java.lang.String tempAttribApprovalCode =
                        
                                reader.getAttributeValue(null,"ApprovalCode");
                            
                   if (tempAttribApprovalCode!=null){
                         java.lang.String content = tempAttribApprovalCode;
                        
                                                 object.setApprovalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribApprovalCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ApprovalCode is missing");
                           
                    }
                    handledAttributes.add("ApprovalCode");
                    
                    // handle attribute "SettlementDate"
                    java.lang.String tempAttribSettlementDate =
                        
                                reader.getAttributeValue(null,"SettlementDate");
                            
                   if (tempAttribSettlementDate!=null){
                         java.lang.String content = tempAttribSettlementDate;
                        
                                                 object.setSettlementDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribSettlementDate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute SettlementDate is missing");
                           
                    }
                    handledAttributes.add("SettlementDate");
                    
                    // handle attribute "SettlementTime"
                    java.lang.String tempAttribSettlementTime =
                        
                                reader.getAttributeValue(null,"SettlementTime");
                            
                   if (tempAttribSettlementTime!=null){
                         java.lang.String content = tempAttribSettlementTime;
                        
                                                 object.setSettlementTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSettlementTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SettlementTime");
                    
                    // handle attribute "TransactionType"
                    java.lang.String tempAttribTransactionType =
                        
                                reader.getAttributeValue(null,"TransactionType");
                            
                   if (tempAttribTransactionType!=null){
                         java.lang.String content = tempAttribTransactionType;
                        
                                                 object.setTransactionType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TransactionType");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CreditCard").equals(reader.getName())){
                                
                                                object.setCreditCard(com.cloudkey.pms.micros.og.common.CreditCard.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ApprovalAmount").equals(reader.getName())){
                                
                                                object.setApprovalAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    