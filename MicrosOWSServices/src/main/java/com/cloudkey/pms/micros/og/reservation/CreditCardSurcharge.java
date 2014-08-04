
/**
 * CreditCardSurcharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  CreditCardSurcharge bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CreditCardSurcharge
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CreditCardSurcharge
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for SurchargeThreshold
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localSurchargeThreshold ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSurchargeThresholdTracker = false ;

                           public boolean isSurchargeThresholdSpecified(){
                               return localSurchargeThresholdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getSurchargeThreshold(){
                               return localSurchargeThreshold;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SurchargeThreshold
                               */
                               public void setSurchargeThreshold(com.cloudkey.pms.micros.og.common.Amount param){
                            localSurchargeThresholdTracker = param != null;
                                   
                                            this.localSurchargeThreshold=param;
                                    

                               }
                            

                        /**
                        * field for SurchargeAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localSurchargeAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSurchargeAmountTracker = false ;

                           public boolean isSurchargeAmountSpecified(){
                               return localSurchargeAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getSurchargeAmount(){
                               return localSurchargeAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SurchargeAmount
                               */
                               public void setSurchargeAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localSurchargeAmountTracker = param != null;
                                   
                                            this.localSurchargeAmount=param;
                                    

                               }
                            

                        /**
                        * field for TaxAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTaxAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxAmountTracker = false ;

                           public boolean isTaxAmountSpecified(){
                               return localTaxAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTaxAmount(){
                               return localTaxAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxAmount
                               */
                               public void setTaxAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localTaxAmountTracker = param != null;
                                   
                                            this.localTaxAmount=param;
                                    

                               }
                            

                        /**
                        * field for TotalBillAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalBillAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalBillAmountTracker = false ;

                           public boolean isTotalBillAmountSpecified(){
                               return localTotalBillAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalBillAmount(){
                               return localTotalBillAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalBillAmount
                               */
                               public void setTotalBillAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalBillAmountTracker = param != null;
                                   
                                            this.localTotalBillAmount=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCreditCardType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCreditCardType(){
                               return localCreditCardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardType
                               */
                               public void setCreditCardType(java.lang.String param){
                            
                                            this.localCreditCardType=param;
                                    

                               }
                            

                        /**
                        * field for SurchargePercentage
                        * This was an Attribute!
                        */

                        
                                    protected float localSurchargePercentage ;
                                

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getSurchargePercentage(){
                               return localSurchargePercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SurchargePercentage
                               */
                               public void setSurchargePercentage(float param){
                            
                                            this.localSurchargePercentage=param;
                                    

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
                           namespacePrefix+":CreditCardSurcharge",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CreditCardSurcharge",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localCreditCardType != null){
                                        
                                                writeAttribute("",
                                                         "CreditCardType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditCardType), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Float.isNaN(localSurchargePercentage)) {
                                               
                                                writeAttribute("",
                                                         "SurchargePercentage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSurchargePercentage), xmlWriter);

                                            
                                      }
                                     if (localSurchargeThresholdTracker){
                                            if (localSurchargeThreshold==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SurchargeThreshold cannot be null!!");
                                            }
                                           localSurchargeThreshold.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SurchargeThreshold"),
                                               xmlWriter);
                                        } if (localSurchargeAmountTracker){
                                            if (localSurchargeAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SurchargeAmount cannot be null!!");
                                            }
                                           localSurchargeAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SurchargeAmount"),
                                               xmlWriter);
                                        } if (localTaxAmountTracker){
                                            if (localTaxAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TaxAmount cannot be null!!");
                                            }
                                           localTaxAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TaxAmount"),
                                               xmlWriter);
                                        } if (localTotalBillAmountTracker){
                                            if (localTotalBillAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalBillAmount cannot be null!!");
                                            }
                                           localTotalBillAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TotalBillAmount"),
                                               xmlWriter);
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

                 if (localSurchargeThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "SurchargeThreshold"));
                            
                            
                                    if (localSurchargeThreshold==null){
                                         throw new org.apache.axis2.databinding.ADBException("SurchargeThreshold cannot be null!!");
                                    }
                                    elementList.add(localSurchargeThreshold);
                                } if (localSurchargeAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "SurchargeAmount"));
                            
                            
                                    if (localSurchargeAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("SurchargeAmount cannot be null!!");
                                    }
                                    elementList.add(localSurchargeAmount);
                                } if (localTaxAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "TaxAmount"));
                            
                            
                                    if (localTaxAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TaxAmount cannot be null!!");
                                    }
                                    elementList.add(localTaxAmount);
                                } if (localTotalBillAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "TotalBillAmount"));
                            
                            
                                    if (localTotalBillAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalBillAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalBillAmount);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","CreditCardType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditCardType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SurchargePercentage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSurchargePercentage));
                                

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
        public static CreditCardSurcharge parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreditCardSurcharge object =
                new CreditCardSurcharge();

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
                    
                            if (!"CreditCardSurcharge".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreditCardSurcharge)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "CreditCardType"
                    java.lang.String tempAttribCreditCardType =
                        
                                reader.getAttributeValue(null,"CreditCardType");
                            
                   if (tempAttribCreditCardType!=null){
                         java.lang.String content = tempAttribCreditCardType;
                        
                                                 object.setCreditCardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCreditCardType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CreditCardType");
                    
                    // handle attribute "SurchargePercentage"
                    java.lang.String tempAttribSurchargePercentage =
                        
                                reader.getAttributeValue(null,"SurchargePercentage");
                            
                   if (tempAttribSurchargePercentage!=null){
                         java.lang.String content = tempAttribSurchargePercentage;
                        
                                                 object.setSurchargePercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(tempAttribSurchargePercentage));
                                            
                    } else {
                       
                                           object.setSurchargePercentage(java.lang.Float.NaN);
                                       
                    }
                    handledAttributes.add("SurchargePercentage");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SurchargeThreshold").equals(reader.getName())){
                                
                                                object.setSurchargeThreshold(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SurchargeAmount").equals(reader.getName())){
                                
                                                object.setSurchargeAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TaxAmount").equals(reader.getName())){
                                
                                                object.setTaxAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TotalBillAmount").equals(reader.getName())){
                                
                                                object.setTotalBillAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    