
/**
 * Guarantee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  Guarantee bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Guarantee
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Guarantee
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for GuaranteesAccepted
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuaranteesAccepted localGuaranteesAccepted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuaranteesAcceptedTracker = false ;

                           public boolean isGuaranteesAcceptedSpecified(){
                               return localGuaranteesAcceptedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuaranteesAccepted
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuaranteesAccepted getGuaranteesAccepted(){
                               return localGuaranteesAccepted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteesAccepted
                               */
                               public void setGuaranteesAccepted(com.cloudkey.pms.micros.og.hotelcommon.GuaranteesAccepted param){
                            localGuaranteesAcceptedTracker = param != null;
                                   
                                            this.localGuaranteesAccepted=param;
                                    

                               }
                            

                        /**
                        * field for Deadline
                        */

                        
                                    protected java.util.Calendar localDeadline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeadlineTracker = false ;

                           public boolean isDeadlineSpecified(){
                               return localDeadlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDeadline(){
                               return localDeadline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Deadline
                               */
                               public void setDeadline(java.util.Calendar param){
                            localDeadlineTracker = param != null;
                                   
                                            this.localDeadline=param;
                                    

                               }
                            

                        /**
                        * field for GuaranteeDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localGuaranteeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuaranteeDescriptionTracker = false ;

                           public boolean isGuaranteeDescriptionSpecified(){
                               return localGuaranteeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getGuaranteeDescription(){
                               return localGuaranteeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteeDescription
                               */
                               public void setGuaranteeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localGuaranteeDescriptionTracker = param != null;
                                   
                                            this.localGuaranteeDescription=param;
                                    

                               }
                            

                        /**
                        * field for GuaranteeType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localGuaranteeType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGuaranteeType(){
                               return localGuaranteeType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteeType
                               */
                               public void setGuaranteeType(java.lang.String param){
                            
                                            this.localGuaranteeType=param;
                                    

                               }
                            

                        /**
                        * field for MandatoryDeposit
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMandatoryDeposit ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMandatoryDeposit(){
                               return localMandatoryDeposit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MandatoryDeposit
                               */
                               public void setMandatoryDeposit(boolean param){
                            
                                            this.localMandatoryDeposit=param;
                                    

                               }
                            

                        /**
                        * field for CancellationRequired
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCancellationRequired ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCancellationRequired(){
                               return localCancellationRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancellationRequired
                               */
                               public void setCancellationRequired(boolean param){
                            
                                            this.localCancellationRequired=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardRequired
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCreditCardRequired ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCreditCardRequired(){
                               return localCreditCardRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardRequired
                               */
                               public void setCreditCardRequired(boolean param){
                            
                                            this.localCreditCardRequired=param;
                                    

                               }
                            

                        /**
                        * field for PaymentType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPaymentType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPaymentType(){
                               return localPaymentType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentType
                               */
                               public void setPaymentType(java.lang.String param){
                            
                                            this.localPaymentType=param;
                                    

                               }
                            

                        /**
                        * field for RequirementCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRequirementCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequirementCode(){
                               return localRequirementCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequirementCode
                               */
                               public void setRequirementCode(java.lang.String param){
                            
                                            this.localRequirementCode=param;
                                    

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
                           namespacePrefix+":Guarantee",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Guarantee",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localGuaranteeType != null){
                                        
                                                writeAttribute("",
                                                         "guaranteeType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuaranteeType), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "mandatoryDeposit",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "cancellationRequired",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancellationRequired), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "creditCardRequired",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditCardRequired), xmlWriter);

                                            
                                      }
                                    
                                            if (localPaymentType != null){
                                        
                                                writeAttribute("",
                                                         "paymentType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPaymentType), xmlWriter);

                                            
                                      }
                                    
                                            if (localRequirementCode != null){
                                        
                                                writeAttribute("",
                                                         "requirementCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequirementCode), xmlWriter);

                                            
                                      }
                                     if (localGuaranteesAcceptedTracker){
                                            if (localGuaranteesAccepted==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuaranteesAccepted cannot be null!!");
                                            }
                                           localGuaranteesAccepted.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteesAccepted"),
                                               xmlWriter);
                                        } if (localDeadlineTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Deadline", xmlWriter);
                             

                                          if (localDeadline==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Deadline cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeadline));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGuaranteeDescriptionTracker){
                                            if (localGuaranteeDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuaranteeDescription cannot be null!!");
                                            }
                                           localGuaranteeDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDescription"),
                                               xmlWriter);
                                        }
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

                 if (localGuaranteesAcceptedTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuaranteesAccepted"));
                            
                            
                                    if (localGuaranteesAccepted==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuaranteesAccepted cannot be null!!");
                                    }
                                    elementList.add(localGuaranteesAccepted);
                                } if (localDeadlineTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Deadline"));
                                 
                                        if (localDeadline != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeadline));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Deadline cannot be null!!");
                                        }
                                    } if (localGuaranteeDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuaranteeDescription"));
                            
                            
                                    if (localGuaranteeDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuaranteeDescription cannot be null!!");
                                    }
                                    elementList.add(localGuaranteeDescription);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","guaranteeType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuaranteeType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","mandatoryDeposit"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cancellationRequired"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancellationRequired));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","creditCardRequired"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditCardRequired));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","paymentType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPaymentType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","requirementCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequirementCode));
                                

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
        public static Guarantee parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Guarantee object =
                new Guarantee();

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
                    
                            if (!"Guarantee".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Guarantee)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "guaranteeType"
                    java.lang.String tempAttribGuaranteeType =
                        
                                reader.getAttributeValue(null,"guaranteeType");
                            
                   if (tempAttribGuaranteeType!=null){
                         java.lang.String content = tempAttribGuaranteeType;
                        
                                                 object.setGuaranteeType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGuaranteeType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("guaranteeType");
                    
                    // handle attribute "mandatoryDeposit"
                    java.lang.String tempAttribMandatoryDeposit =
                        
                                reader.getAttributeValue(null,"mandatoryDeposit");
                            
                   if (tempAttribMandatoryDeposit!=null){
                         java.lang.String content = tempAttribMandatoryDeposit;
                        
                                                 object.setMandatoryDeposit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMandatoryDeposit));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("mandatoryDeposit");
                    
                    // handle attribute "cancellationRequired"
                    java.lang.String tempAttribCancellationRequired =
                        
                                reader.getAttributeValue(null,"cancellationRequired");
                            
                   if (tempAttribCancellationRequired!=null){
                         java.lang.String content = tempAttribCancellationRequired;
                        
                                                 object.setCancellationRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCancellationRequired));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cancellationRequired");
                    
                    // handle attribute "creditCardRequired"
                    java.lang.String tempAttribCreditCardRequired =
                        
                                reader.getAttributeValue(null,"creditCardRequired");
                            
                   if (tempAttribCreditCardRequired!=null){
                         java.lang.String content = tempAttribCreditCardRequired;
                        
                                                 object.setCreditCardRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCreditCardRequired));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("creditCardRequired");
                    
                    // handle attribute "paymentType"
                    java.lang.String tempAttribPaymentType =
                        
                                reader.getAttributeValue(null,"paymentType");
                            
                   if (tempAttribPaymentType!=null){
                         java.lang.String content = tempAttribPaymentType;
                        
                                                 object.setPaymentType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPaymentType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("paymentType");
                    
                    // handle attribute "requirementCode"
                    java.lang.String tempAttribRequirementCode =
                        
                                reader.getAttributeValue(null,"requirementCode");
                            
                   if (tempAttribRequirementCode!=null){
                         java.lang.String content = tempAttribRequirementCode;
                        
                                                 object.setRequirementCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRequirementCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("requirementCode");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteesAccepted").equals(reader.getName())){
                                
                                                object.setGuaranteesAccepted(com.cloudkey.pms.micros.og.hotelcommon.GuaranteesAccepted.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Deadline").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Deadline" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeadline(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDescription").equals(reader.getName())){
                                
                                                object.setGuaranteeDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
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
           
    