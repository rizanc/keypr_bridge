
/**
 * CancelTerm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  CancelTerm bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CancelTerm
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CancelTerm
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for CancelReason
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localCancelReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelReasonTracker = false ;

                           public boolean isCancelReasonSpecified(){
                               return localCancelReasonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getCancelReason(){
                               return localCancelReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelReason
                               */
                               public void setCancelReason(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localCancelReasonTracker = param != null;
                                   
                                            this.localCancelReason=param;
                                    

                               }
                            

                        /**
                        * field for CancelType
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.CancelTermType localCancelType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.CancelTermType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.CancelTermType getCancelType(){
                               return localCancelType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelType
                               */
                               public void setCancelType(com.cloudkey.pms.micros.og.hotelcommon.CancelTermType param){
                            
                                            this.localCancelType=param;
                                    

                               }
                            

                        /**
                        * field for OtherCancelType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherCancelType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherCancelType(){
                               return localOtherCancelType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherCancelType
                               */
                               public void setOtherCancelType(java.lang.String param){
                            
                                            this.localOtherCancelType=param;
                                    

                               }
                            

                        /**
                        * field for CancelReasonCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCancelReasonCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCancelReasonCode(){
                               return localCancelReasonCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelReasonCode
                               */
                               public void setCancelReasonCode(java.lang.String param){
                            
                                            this.localCancelReasonCode=param;
                                    

                               }
                            

                        /**
                        * field for CancelNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCancelNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCancelNumber(){
                               return localCancelNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelNumber
                               */
                               public void setCancelNumber(java.lang.String param){
                            
                                            this.localCancelNumber=param;
                                    

                               }
                            

                        /**
                        * field for CancelDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localCancelDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getCancelDate(){
                               return localCancelDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelDate
                               */
                               public void setCancelDate(java.util.Date param){
                            
                                            this.localCancelDate=param;
                                    

                               }
                            

                        /**
                        * field for CancelBy
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCancelBy ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCancelBy(){
                               return localCancelBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelBy
                               */
                               public void setCancelBy(java.lang.String param){
                            
                                            this.localCancelBy=param;
                                    

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
                           namespacePrefix+":CancelTerm",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CancelTerm",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localCancelType != null){
                                        writeAttribute("",
                                           "cancelType",
                                           localCancelType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localCancelType is null");
                                      }
                                    
                                            if (localOtherCancelType != null){
                                        
                                                writeAttribute("",
                                                         "otherCancelType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherCancelType), xmlWriter);

                                            
                                      }
                                    
                                            if (localCancelReasonCode != null){
                                        
                                                writeAttribute("",
                                                         "cancelReasonCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelReasonCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localCancelNumber != null){
                                        
                                                writeAttribute("",
                                                         "cancelNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localCancelDate != null){
                                        
                                                writeAttribute("",
                                                         "cancelDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localCancelBy != null){
                                        
                                                writeAttribute("",
                                                         "cancelBy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelBy), xmlWriter);

                                            
                                      }
                                     if (localCancelReasonTracker){
                                            if (localCancelReason==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancelReason cannot be null!!");
                                            }
                                           localCancelReason.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelReason"),
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

                 if (localCancelReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CancelReason"));
                            
                            
                                    if (localCancelReason==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancelReason cannot be null!!");
                                    }
                                    elementList.add(localCancelReason);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","cancelType"));
                            
                                      attribList.add(localCancelType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherCancelType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherCancelType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cancelReasonCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelReasonCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cancelNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cancelDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","cancelBy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelBy));
                                

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
        public static CancelTerm parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CancelTerm object =
                new CancelTerm();

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
                    
                            if (!"CancelTerm".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CancelTerm)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "cancelType"
                    java.lang.String tempAttribCancelType =
                        
                                reader.getAttributeValue(null,"cancelType");
                            
                   if (tempAttribCancelType!=null){
                         java.lang.String content = tempAttribCancelType;
                        
                                                  object.setCancelType(
                                                        com.cloudkey.pms.micros.og.hotelcommon.CancelTermType.Factory.fromString(reader,tempAttribCancelType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute cancelType is missing");
                           
                    }
                    handledAttributes.add("cancelType");
                    
                    // handle attribute "otherCancelType"
                    java.lang.String tempAttribOtherCancelType =
                        
                                reader.getAttributeValue(null,"otherCancelType");
                            
                   if (tempAttribOtherCancelType!=null){
                         java.lang.String content = tempAttribOtherCancelType;
                        
                                                 object.setOtherCancelType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherCancelType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherCancelType");
                    
                    // handle attribute "cancelReasonCode"
                    java.lang.String tempAttribCancelReasonCode =
                        
                                reader.getAttributeValue(null,"cancelReasonCode");
                            
                   if (tempAttribCancelReasonCode!=null){
                         java.lang.String content = tempAttribCancelReasonCode;
                        
                                                 object.setCancelReasonCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCancelReasonCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cancelReasonCode");
                    
                    // handle attribute "cancelNumber"
                    java.lang.String tempAttribCancelNumber =
                        
                                reader.getAttributeValue(null,"cancelNumber");
                            
                   if (tempAttribCancelNumber!=null){
                         java.lang.String content = tempAttribCancelNumber;
                        
                                                 object.setCancelNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCancelNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cancelNumber");
                    
                    // handle attribute "cancelDate"
                    java.lang.String tempAttribCancelDate =
                        
                                reader.getAttributeValue(null,"cancelDate");
                            
                   if (tempAttribCancelDate!=null){
                         java.lang.String content = tempAttribCancelDate;
                        
                                                 object.setCancelDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribCancelDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cancelDate");
                    
                    // handle attribute "cancelBy"
                    java.lang.String tempAttribCancelBy =
                        
                                reader.getAttributeValue(null,"cancelBy");
                            
                   if (tempAttribCancelBy!=null){
                         java.lang.String content = tempAttribCancelBy;
                        
                                                 object.setCancelBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCancelBy));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cancelBy");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancelReason").equals(reader.getName())){
                                
                                                object.setCancelReason(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
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
           
    