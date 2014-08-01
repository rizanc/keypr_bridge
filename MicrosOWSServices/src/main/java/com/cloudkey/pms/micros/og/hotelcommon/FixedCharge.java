
/**
 * FixedCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  FixedCharge bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FixedCharge
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FixedCharge
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for Description
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
                        * field for Amount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAmount ;
                                

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
                            
                                            this.localAmount=param;
                                    

                               }
                            

                        /**
                        * field for TaxesAndFees
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTaxesAndFees ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTaxesAndFees(){
                               return localTaxesAndFees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxesAndFees
                               */
                               public void setTaxesAndFees(com.cloudkey.pms.micros.og.common.Amount param){
                            
                                            this.localTaxesAndFees=param;
                                    

                               }
                            

                        /**
                        * field for Id
                        * This was an Attribute!
                        */

                        
                                    protected double localId ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(double param){
                            
                                            this.localId=param;
                                    

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
                        * field for Quantity
                        * This was an Attribute!
                        */

                        
                                    protected double localQuantity ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getQuantity(){
                               return localQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Quantity
                               */
                               public void setQuantity(double param){
                            
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for Frequency
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Frequency localFrequency ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Frequency
                           */
                           public  com.cloudkey.pms.micros.og.common.Frequency getFrequency(){
                               return localFrequency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Frequency
                               */
                               public void setFrequency(com.cloudkey.pms.micros.og.common.Frequency param){
                            
                                            this.localFrequency=param;
                                    

                               }
                            

                        /**
                        * field for BeginDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localBeginDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getBeginDate(){
                               return localBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BeginDate
                               */
                               public void setBeginDate(java.util.Date param){
                            
                                            this.localBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(java.util.Date param){
                            
                                            this.localEndDate=param;
                                    

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
                           namespacePrefix+":FixedCharge",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FixedCharge",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (!java.lang.Double.isNaN(localId)) {
                                               
                                                writeAttribute("",
                                                         "id",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionCode != null){
                                        
                                                writeAttribute("",
                                                         "transactionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localQuantity)) {
                                               
                                                writeAttribute("",
                                                         "quantity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localFrequency != null){
                                        writeAttribute("",
                                           "frequency",
                                           localFrequency.toString(), xmlWriter);
                                    }
                                    
                                            if (localBeginDate != null){
                                        
                                                writeAttribute("",
                                                         "beginDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localEndDate != null){
                                        
                                                writeAttribute("",
                                                         "endDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate), xmlWriter);

                                            
                                      }
                                    
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                            }
                                           localAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Amount"),
                                               xmlWriter);
                                        
                                            if (localTaxesAndFees==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                            }
                                           localTaxesAndFees.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxesAndFees"),
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
                                                                      "Description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Amount"));
                            
                            
                                    if (localAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                    }
                                    elementList.add(localAmount);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxesAndFees"));
                            
                            
                                    if (localTaxesAndFees==null){
                                         throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                    }
                                    elementList.add(localTaxesAndFees);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","id"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","transactionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quantity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","frequency"));
                            
                                      attribList.add(localFrequency.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","beginDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","endDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                

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
        public static FixedCharge parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FixedCharge object =
                new FixedCharge();

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
                    
                            if (!"FixedCharge".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FixedCharge)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "id"
                    java.lang.String tempAttribId =
                        
                                reader.getAttributeValue(null,"id");
                            
                   if (tempAttribId!=null){
                         java.lang.String content = tempAttribId;
                        
                                                 object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribId));
                                            
                    } else {
                       
                                           object.setId(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("id");
                    
                    // handle attribute "transactionCode"
                    java.lang.String tempAttribTransactionCode =
                        
                                reader.getAttributeValue(null,"transactionCode");
                            
                   if (tempAttribTransactionCode!=null){
                         java.lang.String content = tempAttribTransactionCode;
                        
                                                 object.setTransactionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("transactionCode");
                    
                    // handle attribute "quantity"
                    java.lang.String tempAttribQuantity =
                        
                                reader.getAttributeValue(null,"quantity");
                            
                   if (tempAttribQuantity!=null){
                         java.lang.String content = tempAttribQuantity;
                        
                                                 object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribQuantity));
                                            
                    } else {
                       
                                           object.setQuantity(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("quantity");
                    
                    // handle attribute "frequency"
                    java.lang.String tempAttribFrequency =
                        
                                reader.getAttributeValue(null,"frequency");
                            
                   if (tempAttribFrequency!=null){
                         java.lang.String content = tempAttribFrequency;
                        
                                                  object.setFrequency(
                                                        com.cloudkey.pms.micros.og.common.Frequency.Factory.fromString(reader,tempAttribFrequency));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("frequency");
                    
                    // handle attribute "beginDate"
                    java.lang.String tempAttribBeginDate =
                        
                                reader.getAttributeValue(null,"beginDate");
                            
                   if (tempAttribBeginDate!=null){
                         java.lang.String content = tempAttribBeginDate;
                        
                                                 object.setBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribBeginDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("beginDate");
                    
                    // handle attribute "endDate"
                    java.lang.String tempAttribEndDate =
                        
                                reader.getAttributeValue(null,"endDate");
                            
                   if (tempAttribEndDate!=null){
                         java.lang.String content = tempAttribEndDate;
                        
                                                 object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEndDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("endDate");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Description" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Amount").equals(reader.getName())){
                                
                                                object.setAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxesAndFees").equals(reader.getName())){
                                
                                                object.setTaxesAndFees(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    