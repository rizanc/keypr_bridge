
/**
 * BillItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  BillItem bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BillItem
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BillItem
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for Account
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountTracker = false ;

                           public boolean isAccountSpecified(){
                               return localAccountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getAccount(){
                               return localAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Account
                               */
                               public void setAccount(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localAccountTracker = param != null;
                                   
                                            this.localAccount=param;
                                    

                               }
                            

                        /**
                        * field for Amount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmountTracker = false ;

                           public boolean isAmountSpecified(){
                               return localAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getAmount(){
                               return localAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amount
                               */
                               public void setAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localAmountTracker = param != null;
                                   
                                            this.localAmount=param;
                                    

                               }
                            

                        /**
                        * field for VatCode
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localVatCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVatCodeTracker = false ;

                           public boolean isVatCodeSpecified(){
                               return localVatCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getVatCode(){
                               return localVatCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VatCode
                               */
                               public void setVatCode(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localVatCodeTracker = param != null;
                                   
                                            this.localVatCode=param;
                                    

                               }
                            

                        /**
                        * field for RevenueGroup
                        */

                        
                                    protected java.lang.String localRevenueGroup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRevenueGroupTracker = false ;

                           public boolean isRevenueGroupSpecified(){
                               return localRevenueGroupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRevenueGroup(){
                               return localRevenueGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RevenueGroup
                               */
                               public void setRevenueGroup(java.lang.String param){
                            localRevenueGroupTracker = param != null;
                                   
                                            this.localRevenueGroup=param;
                                    

                               }
                            

                        /**
                        * field for Date
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDate(){
                               return localDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Date
                               */
                               public void setDate(java.util.Date param){
                            
                                            this.localDate=param;
                                    

                               }
                            

                        /**
                        * field for Time
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getTime(){
                               return localTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Time
                               */
                               public void setTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localTime=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for TransactionCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionCode(){
                               return localTransactionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionCode
                               */
                               public void setTransactionCode(java.lang.String param){
                            
                                            this.localTransactionCode=param;
                                    

                               }
                            

                        /**
                        * field for TransactionNo
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionNo(){
                               return localTransactionNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionNo
                               */
                               public void setTransactionNo(java.lang.String param){
                            
                                            this.localTransactionNo=param;
                                    

                               }
                            

                        /**
                        * field for Supplement
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSupplement ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSupplement(){
                               return localSupplement;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Supplement
                               */
                               public void setSupplement(java.lang.String param){
                            
                                            this.localSupplement=param;
                                    

                               }
                            

                        /**
                        * field for Reference
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReference(){
                               return localReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reference
                               */
                               public void setReference(java.lang.String param){
                            
                                            this.localReference=param;
                                    

                               }
                            

                        /**
                        * field for OriginalRoom
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOriginalRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOriginalRoom(){
                               return localOriginalRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginalRoom
                               */
                               public void setOriginalRoom(java.lang.String param){
                            
                                            this.localOriginalRoom=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Reservation/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BillItem",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BillItem",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDate != null){
                                        
                                                writeAttribute("",
                                                         "Date",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localDate is null");
                                      }
                                    
                                            if (localTime != null){
                                        
                                                writeAttribute("",
                                                         "Time",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localDescription != null){
                                        
                                                writeAttribute("",
                                                         "Description",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionCode != null){
                                        
                                                writeAttribute("",
                                                         "TransactionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionNo != null){
                                        
                                                writeAttribute("",
                                                         "TransactionNo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionNo), xmlWriter);

                                            
                                      }
                                    
                                            if (localSupplement != null){
                                        
                                                writeAttribute("",
                                                         "Supplement",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupplement), xmlWriter);

                                            
                                      }
                                    
                                            if (localReference != null){
                                        
                                                writeAttribute("",
                                                         "Reference",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReference), xmlWriter);

                                            
                                      }
                                    
                                            if (localOriginalRoom != null){
                                        
                                                writeAttribute("",
                                                         "OriginalRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalRoom), xmlWriter);

                                            
                                      }
                                     if (localAccountTracker){
                                            if (localAccount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Account cannot be null!!");
                                            }
                                           localAccount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Account"),
                                               xmlWriter);
                                        } if (localAmountTracker){
                                            if (localAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                            }
                                           localAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Amount"),
                                               xmlWriter);
                                        } if (localVatCodeTracker){
                                            if (localVatCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("VatCode cannot be null!!");
                                            }
                                           localVatCode.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","VatCode"),
                                               xmlWriter);
                                        } if (localRevenueGroupTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "RevenueGroup", xmlWriter);
                             

                                          if (localRevenueGroup==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RevenueGroup cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRevenueGroup);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Reservation/")){
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

                 if (localAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Account"));
                            
                            
                                    if (localAccount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Account cannot be null!!");
                                    }
                                    elementList.add(localAccount);
                                } if (localAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Amount"));
                            
                            
                                    if (localAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                    }
                                    elementList.add(localAmount);
                                } if (localVatCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "VatCode"));
                            
                            
                                    if (localVatCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("VatCode cannot be null!!");
                                    }
                                    elementList.add(localVatCode);
                                } if (localRevenueGroupTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "RevenueGroup"));
                                 
                                        if (localRevenueGroup != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevenueGroup));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RevenueGroup cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","Date"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Time"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Description"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TransactionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TransactionNo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionNo));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Supplement"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupplement));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Reference"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReference));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OriginalRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalRoom));
                                

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
        public static BillItem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BillItem object =
                new BillItem();

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
                    
                            if (!"BillItem".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BillItem)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Date"
                    java.lang.String tempAttribDate =
                        
                                reader.getAttributeValue(null,"Date");
                            
                   if (tempAttribDate!=null){
                         java.lang.String content = tempAttribDate;
                        
                                                 object.setDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribDate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Date is missing");
                           
                    }
                    handledAttributes.add("Date");
                    
                    // handle attribute "Time"
                    java.lang.String tempAttribTime =
                        
                                reader.getAttributeValue(null,"Time");
                            
                   if (tempAttribTime!=null){
                         java.lang.String content = tempAttribTime;
                        
                                                 object.setTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Time");
                    
                    // handle attribute "Description"
                    java.lang.String tempAttribDescription =
                        
                                reader.getAttributeValue(null,"Description");
                            
                   if (tempAttribDescription!=null){
                         java.lang.String content = tempAttribDescription;
                        
                                                 object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Description");
                    
                    // handle attribute "TransactionCode"
                    java.lang.String tempAttribTransactionCode =
                        
                                reader.getAttributeValue(null,"TransactionCode");
                            
                   if (tempAttribTransactionCode!=null){
                         java.lang.String content = tempAttribTransactionCode;
                        
                                                 object.setTransactionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TransactionCode");
                    
                    // handle attribute "TransactionNo"
                    java.lang.String tempAttribTransactionNo =
                        
                                reader.getAttributeValue(null,"TransactionNo");
                            
                   if (tempAttribTransactionNo!=null){
                         java.lang.String content = tempAttribTransactionNo;
                        
                                                 object.setTransactionNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionNo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TransactionNo");
                    
                    // handle attribute "Supplement"
                    java.lang.String tempAttribSupplement =
                        
                                reader.getAttributeValue(null,"Supplement");
                            
                   if (tempAttribSupplement!=null){
                         java.lang.String content = tempAttribSupplement;
                        
                                                 object.setSupplement(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSupplement));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Supplement");
                    
                    // handle attribute "Reference"
                    java.lang.String tempAttribReference =
                        
                                reader.getAttributeValue(null,"Reference");
                            
                   if (tempAttribReference!=null){
                         java.lang.String content = tempAttribReference;
                        
                                                 object.setReference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReference));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Reference");
                    
                    // handle attribute "OriginalRoom"
                    java.lang.String tempAttribOriginalRoom =
                        
                                reader.getAttributeValue(null,"OriginalRoom");
                            
                   if (tempAttribOriginalRoom!=null){
                         java.lang.String content = tempAttribOriginalRoom;
                        
                                                 object.setOriginalRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOriginalRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OriginalRoom");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Account").equals(reader.getName())){
                                
                                                object.setAccount(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Amount").equals(reader.getName())){
                                
                                                object.setAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","VatCode").equals(reader.getName())){
                                
                                                object.setVatCode(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RevenueGroup").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RevenueGroup" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRevenueGroup(
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
           
    