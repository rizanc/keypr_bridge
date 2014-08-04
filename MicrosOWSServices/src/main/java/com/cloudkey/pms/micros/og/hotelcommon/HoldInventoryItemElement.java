
/**
 * HoldInventoryItemElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  HoldInventoryItemElement bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class HoldInventoryItemElement
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = HoldInventoryItemElement
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for ItemCode
                        */

                        
                                    protected java.lang.String localItemCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemCodeTracker = false ;

                           public boolean isItemCodeSpecified(){
                               return localItemCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getItemCode(){
                               return localItemCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemCode
                               */
                               public void setItemCode(java.lang.String param){
                            localItemCodeTracker = param != null;
                                   
                                            this.localItemCode=param;
                                    

                               }
                            

                        /**
                        * field for ItemName
                        */

                        
                                    protected java.lang.String localItemName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemNameTracker = false ;

                           public boolean isItemNameSpecified(){
                               return localItemNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getItemName(){
                               return localItemName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemName
                               */
                               public void setItemName(java.lang.String param){
                            localItemNameTracker = param != null;
                                   
                                            this.localItemName=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        */

                        
                                    protected int localQuantity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuantityTracker = false ;

                           public boolean isQuantitySpecified(){
                               return localQuantityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getQuantity(){
                               return localQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Quantity
                               */
                               public void setQuantity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localQuantityTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for ItemHoldID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localItemHoldID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemHoldIDTracker = false ;

                           public boolean isItemHoldIDSpecified(){
                               return localItemHoldIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getItemHoldID(){
                               return localItemHoldID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemHoldID
                               */
                               public void setItemHoldID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localItemHoldIDTracker = param != null;
                                   
                                            this.localItemHoldID=param;
                                    

                               }
                            

                        /**
                        * field for ItemStartDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localItemStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getItemStartDate(){
                               return localItemStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemStartDate
                               */
                               public void setItemStartDate(java.util.Date param){
                            
                                            this.localItemStartDate=param;
                                    

                               }
                            

                        /**
                        * field for ItemEndDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localItemEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getItemEndDate(){
                               return localItemEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemEndDate
                               */
                               public void setItemEndDate(java.util.Date param){
                            
                                            this.localItemEndDate=param;
                                    

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
                           namespacePrefix+":HoldInventoryItemElement",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "HoldInventoryItemElement",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localItemStartDate != null){
                                        
                                                writeAttribute("",
                                                         "ItemStartDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemStartDate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localItemStartDate is null");
                                      }
                                    
                                            if (localItemEndDate != null){
                                        
                                                writeAttribute("",
                                                         "ItemEndDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemEndDate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localItemEndDate is null");
                                      }
                                     if (localItemCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemCode", xmlWriter);
                             

                                          if (localItemCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localItemCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localItemNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemName", xmlWriter);
                             

                                          if (localItemName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localItemName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuantityTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Quantity", xmlWriter);
                             
                                               if (localQuantity==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Quantity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localItemHoldIDTracker){
                                            if (localItemHoldID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ItemHoldID cannot be null!!");
                                            }
                                           localItemHoldID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemHoldID"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
                return "ns2";
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

                 if (localItemCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemCode"));
                                 
                                        if (localItemCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemCode cannot be null!!");
                                        }
                                    } if (localItemNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemName"));
                                 
                                        if (localItemName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemName cannot be null!!");
                                        }
                                    } if (localQuantityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Quantity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                            } if (localItemHoldIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemHoldID"));
                            
                            
                                    if (localItemHoldID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ItemHoldID cannot be null!!");
                                    }
                                    elementList.add(localItemHoldID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ItemStartDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemStartDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ItemEndDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemEndDate));
                                

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
        public static HoldInventoryItemElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HoldInventoryItemElement object =
                new HoldInventoryItemElement();

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
                    
                            if (!"HoldInventoryItemElement".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HoldInventoryItemElement)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ItemStartDate"
                    java.lang.String tempAttribItemStartDate =
                        
                                reader.getAttributeValue(null,"ItemStartDate");
                            
                   if (tempAttribItemStartDate!=null){
                         java.lang.String content = tempAttribItemStartDate;
                        
                                                 object.setItemStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribItemStartDate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ItemStartDate is missing");
                           
                    }
                    handledAttributes.add("ItemStartDate");
                    
                    // handle attribute "ItemEndDate"
                    java.lang.String tempAttribItemEndDate =
                        
                                reader.getAttributeValue(null,"ItemEndDate");
                            
                   if (tempAttribItemEndDate!=null){
                         java.lang.String content = tempAttribItemEndDate;
                        
                                                 object.setItemEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribItemEndDate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ItemEndDate is missing");
                           
                    }
                    handledAttributes.add("ItemEndDate");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Quantity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Quantity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setQuantity(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemHoldID").equals(reader.getName())){
                                
                                                object.setItemHoldID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
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
           
    