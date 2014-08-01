
/**
 * Transaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  Transaction bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Transaction
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Transaction
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for CreditCardApproved
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment localCreditCardApproved ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment getCreditCardApproved(){
                               return localCreditCardApproved;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardApproved
                               */
                               public void setCreditCardApproved(com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment param){
                            
                                            this.localCreditCardApproved=param;
                                    

                               }
                            

                        /**
                        * field for Date
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDate(){
                               return localDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Date
                               */
                               public void setDate(java.lang.String param){
                            
                                            this.localDate=param;
                                    

                               }
                            

                        /**
                        * field for Time
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTime(){
                               return localTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Time
                               */
                               public void setTime(java.lang.String param){
                            
                                            this.localTime=param;
                                    

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
                        * field for FolioViewNo
                        * This was an Attribute!
                        */

                        
                                    protected int localFolioViewNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFolioViewNo(){
                               return localFolioViewNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FolioViewNo
                               */
                               public void setFolioViewNo(int param){
                            
                                            this.localFolioViewNo=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/ResvAdvanced/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Transaction",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Transaction",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDate != null){
                                        
                                                writeAttribute("",
                                                         "Date",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localTime != null){
                                        
                                                writeAttribute("",
                                                         "Time",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionType != null){
                                        
                                                writeAttribute("",
                                                         "TransactionType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionType), xmlWriter);

                                            
                                      }
                                    
                                                   if (localFolioViewNo!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "FolioViewNo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo), xmlWriter);

                                            
                                      }
                                    
                                            if (localCreditCardApproved==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCardApproved cannot be null!!");
                                            }
                                           localCreditCardApproved.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardApproved"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/ResvAdvanced/")){
                return "ns6";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CreditCardApproved"));
                            
                            
                                    if (localCreditCardApproved==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCardApproved cannot be null!!");
                                    }
                                    elementList.add(localCreditCardApproved);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Date"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Time"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TransactionType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FolioViewNo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo));
                                

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
        public static Transaction parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Transaction object =
                new Transaction();

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
                    
                            if (!"Transaction".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Transaction)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
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
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Date");
                    
                    // handle attribute "Time"
                    java.lang.String tempAttribTime =
                        
                                reader.getAttributeValue(null,"Time");
                            
                   if (tempAttribTime!=null){
                         java.lang.String content = tempAttribTime;
                        
                                                 object.setTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Time");
                    
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
                    
                    // handle attribute "FolioViewNo"
                    java.lang.String tempAttribFolioViewNo =
                        
                                reader.getAttributeValue(null,"FolioViewNo");
                            
                   if (tempAttribFolioViewNo!=null){
                         java.lang.String content = tempAttribFolioViewNo;
                        
                                                 object.setFolioViewNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribFolioViewNo));
                                            
                    } else {
                       
                                           object.setFolioViewNo(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("FolioViewNo");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardApproved").equals(reader.getName())){
                                
                                                object.setCreditCardApproved(com.cloudkey.pms.micros.og.hotelcommon.CreditCardPayment.Factory.parse(reader));
                                              
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
           
    