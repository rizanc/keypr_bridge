
/**
 * CheckOutRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  CheckOutRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CheckOutRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/og/4.3/ResvAdvanced/",
                "CheckOutRequest",
                "ns6");

            

                        /**
                        * field for ReservationRequest
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase localReservationRequest ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase getReservationRequest(){
                               return localReservationRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationRequest
                               */
                               public void setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase param){
                            
                                            this.localReservationRequest=param;
                                    

                               }
                            

                        /**
                        * field for Printer
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.Printer localPrinter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrinterTracker = false ;

                           public boolean isPrinterSpecified(){
                               return localPrinterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.Printer
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.Printer getPrinter(){
                               return localPrinter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Printer
                               */
                               public void setPrinter(com.cloudkey.pms.micros.og.reservation.advanced.Printer param){
                            localPrinterTracker = param != null;
                                   
                                            this.localPrinter=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo localCreditCardInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardInfoTracker = false ;

                           public boolean isCreditCardInfoSpecified(){
                               return localCreditCardInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo getCreditCardInfo(){
                               return localCreditCardInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardInfo
                               */
                               public void setCreditCardInfo(com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo param){
                            localCreditCardInfoTracker = param != null;
                                   
                                            this.localCreditCardInfo=param;
                                    

                               }
                            

                        /**
                        * field for SignedDocuments
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.FileData[] localSignedDocuments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSignedDocumentsTracker = false ;

                           public boolean isSignedDocumentsSpecified(){
                               return localSignedDocumentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.FileData[]
                           */
                           public  com.cloudkey.pms.micros.og.common.FileData[] getSignedDocuments(){
                               return localSignedDocuments;
                           }

                           
                        


                               
                              /**
                               * validate the array for SignedDocuments
                               */
                              protected void validateSignedDocuments(com.cloudkey.pms.micros.og.common.FileData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SignedDocuments
                              */
                              public void setSignedDocuments(com.cloudkey.pms.micros.og.common.FileData[] param){
                              
                                   validateSignedDocuments(param);

                               localSignedDocumentsTracker = param != null;
                                      
                                      this.localSignedDocuments=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.FileData
                             */
                             public void addSignedDocuments(com.cloudkey.pms.micros.og.common.FileData param){
                                   if (localSignedDocuments == null){
                                   localSignedDocuments = new com.cloudkey.pms.micros.og.common.FileData[]{};
                                   }

                            
                                 //update the setting tracker
                                localSignedDocumentsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSignedDocuments);
                               list.add(param);
                               this.localSignedDocuments =
                             (com.cloudkey.pms.micros.og.common.FileData[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.FileData[list.size()]);

                             }
                             

                        /**
                        * field for EmailFolio
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEmailFolio ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEmailFolio(){
                               return localEmailFolio;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailFolio
                               */
                               public void setEmailFolio(boolean param){
                            
                                            this.localEmailFolio=param;
                                    

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
                        * field for OverrideEmailPrivacy
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOverrideEmailPrivacy ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOverrideEmailPrivacy(){
                               return localOverrideEmailPrivacy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OverrideEmailPrivacy
                               */
                               public void setOverrideEmailPrivacy(boolean param){
                            
                                            this.localOverrideEmailPrivacy=param;
                                    

                               }
                            

                        /**
                        * field for NoPost
                        * This was an Attribute!
                        */

                        
                                    protected boolean localNoPost ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNoPost(){
                               return localNoPost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoPost
                               */
                               public void setNoPost(boolean param){
                            
                                            this.localNoPost=param;
                                    

                               }
                            

                        /**
                        * field for DoNotMoveRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDoNotMoveRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoNotMoveRoom(){
                               return localDoNotMoveRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoNotMoveRoom
                               */
                               public void setDoNotMoveRoom(boolean param){
                            
                                            this.localDoNotMoveRoom=param;
                                    

                               }
                            

                        /**
                        * field for DCCCheck
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDCCCheck ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDCCCheck(){
                               return localDCCCheck;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DCCCheck
                               */
                               public void setDCCCheck(boolean param){
                            
                                            this.localDCCCheck=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
                           namespacePrefix+":CheckOutRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CheckOutRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "EmailFolio",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFolio), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "canHandleVaultedCreditCard",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "overrideEmailPrivacy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideEmailPrivacy), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "NoPost",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DoNotMoveRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DCCCheck",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDCCCheck), xmlWriter);

                                            
                                      }
                                    
                                            if (localReservationRequest==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                            }
                                           localReservationRequest.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest"),
                                               xmlWriter);
                                         if (localPrinterTracker){
                                            if (localPrinter==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Printer cannot be null!!");
                                            }
                                           localPrinter.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Printer"),
                                               xmlWriter);
                                        } if (localCreditCardInfoTracker){
                                            if (localCreditCardInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCardInfo cannot be null!!");
                                            }
                                           localCreditCardInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardInfo"),
                                               xmlWriter);
                                        } if (localSignedDocumentsTracker){
                                       if (localSignedDocuments!=null){
                                            for (int i = 0;i < localSignedDocuments.length;i++){
                                                if (localSignedDocuments[i] != null){
                                                 localSignedDocuments[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SignedDocuments"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("SignedDocuments cannot be null!!");
                                        
                                    }
                                 }
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
                                                                      "ReservationRequest"));
                            
                            
                                    if (localReservationRequest==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                    }
                                    elementList.add(localReservationRequest);
                                 if (localPrinterTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Printer"));
                            
                            
                                    if (localPrinter==null){
                                         throw new org.apache.axis2.databinding.ADBException("Printer cannot be null!!");
                                    }
                                    elementList.add(localPrinter);
                                } if (localCreditCardInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CreditCardInfo"));
                            
                            
                                    if (localCreditCardInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCardInfo cannot be null!!");
                                    }
                                    elementList.add(localCreditCardInfo);
                                } if (localSignedDocumentsTracker){
                             if (localSignedDocuments!=null) {
                                 for (int i = 0;i < localSignedDocuments.length;i++){

                                    if (localSignedDocuments[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                          "SignedDocuments"));
                                         elementList.add(localSignedDocuments[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("SignedDocuments cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","EmailFolio"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFolio));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","canHandleVaultedCreditCard"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","overrideEmailPrivacy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverrideEmailPrivacy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NoPost"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DoNotMoveRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DCCCheck"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDCCCheck));
                                

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
        public static CheckOutRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CheckOutRequest object =
                new CheckOutRequest();

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
                    
                            if (!"CheckOutRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CheckOutRequest)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "EmailFolio"
                    java.lang.String tempAttribEmailFolio =
                        
                                reader.getAttributeValue(null,"EmailFolio");
                            
                   if (tempAttribEmailFolio!=null){
                         java.lang.String content = tempAttribEmailFolio;
                        
                                                 object.setEmailFolio(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEmailFolio));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EmailFolio");
                    
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
                    
                    // handle attribute "overrideEmailPrivacy"
                    java.lang.String tempAttribOverrideEmailPrivacy =
                        
                                reader.getAttributeValue(null,"overrideEmailPrivacy");
                            
                   if (tempAttribOverrideEmailPrivacy!=null){
                         java.lang.String content = tempAttribOverrideEmailPrivacy;
                        
                                                 object.setOverrideEmailPrivacy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOverrideEmailPrivacy));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("overrideEmailPrivacy");
                    
                    // handle attribute "NoPost"
                    java.lang.String tempAttribNoPost =
                        
                                reader.getAttributeValue(null,"NoPost");
                            
                   if (tempAttribNoPost!=null){
                         java.lang.String content = tempAttribNoPost;
                        
                                                 object.setNoPost(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribNoPost));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NoPost");
                    
                    // handle attribute "DoNotMoveRoom"
                    java.lang.String tempAttribDoNotMoveRoom =
                        
                                reader.getAttributeValue(null,"DoNotMoveRoom");
                            
                   if (tempAttribDoNotMoveRoom!=null){
                         java.lang.String content = tempAttribDoNotMoveRoom;
                        
                                                 object.setDoNotMoveRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDoNotMoveRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DoNotMoveRoom");
                    
                    // handle attribute "DCCCheck"
                    java.lang.String tempAttribDCCCheck =
                        
                                reader.getAttributeValue(null,"DCCCheck");
                            
                   if (tempAttribDCCCheck!=null){
                         java.lang.String content = tempAttribDCCCheck;
                        
                                                 object.setDCCCheck(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDCCCheck));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DCCCheck");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest").equals(reader.getName())){
                                
                                                object.setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Printer").equals(reader.getName())){
                                
                                                object.setPrinter(com.cloudkey.pms.micros.og.reservation.advanced.Printer.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardInfo").equals(reader.getName())){
                                
                                                object.setCreditCardInfo(com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SignedDocuments").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.cloudkey.pms.micros.og.common.FileData.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SignedDocuments").equals(reader.getName())){
                                                                    list4.add(com.cloudkey.pms.micros.og.common.FileData.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSignedDocuments((com.cloudkey.pms.micros.og.common.FileData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.FileData.class,
                                                                list4));
                                                            
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
           
    