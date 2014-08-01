
/**
 * AvailableRoomRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  AvailableRoomRate bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AvailableRoomRate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AvailableRoomRate
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for RatePlan
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RatePlan localRatePlan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatePlanTracker = false ;

                           public boolean isRatePlanSpecified(){
                               return localRatePlanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RatePlan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RatePlan getRatePlan(){
                               return localRatePlan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlan
                               */
                               public void setRatePlan(com.cloudkey.pms.micros.og.hotelcommon.RatePlan param){
                            localRatePlanTracker = param != null;
                                   
                                            this.localRatePlan=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RoomType localRoomType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeTracker = false ;

                           public boolean isRoomTypeSpecified(){
                               return localRoomTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RoomType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RoomType getRoomType(){
                               return localRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomType
                               */
                               public void setRoomType(com.cloudkey.pms.micros.og.hotelcommon.RoomType param){
                            localRoomTypeTracker = param != null;
                                   
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for FirstDayAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localFirstDayAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstDayAmountTracker = false ;

                           public boolean isFirstDayAmountSpecified(){
                               return localFirstDayAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getFirstDayAmount(){
                               return localFirstDayAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstDayAmount
                               */
                               public void setFirstDayAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localFirstDayAmountTracker = param != null;
                                   
                                            this.localFirstDayAmount=param;
                                    

                               }
                            

                        /**
                        * field for TotalStayAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalStayAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalStayAmountTracker = false ;

                           public boolean isTotalStayAmountSpecified(){
                               return localTotalStayAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalStayAmount(){
                               return localTotalStayAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalStayAmount
                               */
                               public void setTotalStayAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalStayAmountTracker = param != null;
                                   
                                            this.localTotalStayAmount=param;
                                    

                               }
                            

                        /**
                        * field for AdultRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAdultRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdultRateTracker = false ;

                           public boolean isAdultRateSpecified(){
                               return localAdultRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getAdultRate(){
                               return localAdultRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdultRate
                               */
                               public void setAdultRate(com.cloudkey.pms.micros.og.common.Amount param){
                            localAdultRateTracker = param != null;
                                   
                                            this.localAdultRate=param;
                                    

                               }
                            

                        /**
                        * field for ChildRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localChildRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildRateTracker = false ;

                           public boolean isChildRateSpecified(){
                               return localChildRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getChildRate(){
                               return localChildRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildRate
                               */
                               public void setChildRate(com.cloudkey.pms.micros.og.common.Amount param){
                            localChildRateTracker = param != null;
                                   
                                            this.localChildRate=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(java.lang.String param){
                            
                                            this.localStatus=param;
                                    

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
                           namespacePrefix+":AvailableRoomRate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AvailableRoomRate",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localStatus != null){
                                        
                                                writeAttribute("",
                                                         "Status",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus), xmlWriter);

                                            
                                      }
                                     if (localRatePlanTracker){
                                            if (localRatePlan==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlan cannot be null!!");
                                            }
                                           localRatePlan.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RatePlan"),
                                               xmlWriter);
                                        } if (localRoomTypeTracker){
                                            if (localRoomType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                            }
                                           localRoomType.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoomType"),
                                               xmlWriter);
                                        } if (localFirstDayAmountTracker){
                                            if (localFirstDayAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FirstDayAmount cannot be null!!");
                                            }
                                           localFirstDayAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","FirstDayAmount"),
                                               xmlWriter);
                                        } if (localTotalStayAmountTracker){
                                            if (localTotalStayAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalStayAmount cannot be null!!");
                                            }
                                           localTotalStayAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","TotalStayAmount"),
                                               xmlWriter);
                                        } if (localAdultRateTracker){
                                            if (localAdultRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdultRate cannot be null!!");
                                            }
                                           localAdultRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AdultRate"),
                                               xmlWriter);
                                        } if (localChildRateTracker){
                                            if (localChildRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ChildRate cannot be null!!");
                                            }
                                           localChildRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ChildRate"),
                                               xmlWriter);
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

                 if (localRatePlanTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RatePlan"));
                            
                            
                                    if (localRatePlan==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlan cannot be null!!");
                                    }
                                    elementList.add(localRatePlan);
                                } if (localRoomTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoomType"));
                            
                            
                                    if (localRoomType==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                    }
                                    elementList.add(localRoomType);
                                } if (localFirstDayAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "FirstDayAmount"));
                            
                            
                                    if (localFirstDayAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("FirstDayAmount cannot be null!!");
                                    }
                                    elementList.add(localFirstDayAmount);
                                } if (localTotalStayAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "TotalStayAmount"));
                            
                            
                                    if (localTotalStayAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalStayAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalStayAmount);
                                } if (localAdultRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "AdultRate"));
                            
                            
                                    if (localAdultRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdultRate cannot be null!!");
                                    }
                                    elementList.add(localAdultRate);
                                } if (localChildRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ChildRate"));
                            
                            
                                    if (localChildRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("ChildRate cannot be null!!");
                                    }
                                    elementList.add(localChildRate);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Status"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatus));
                                

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
        public static AvailableRoomRate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AvailableRoomRate object =
                new AvailableRoomRate();

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
                    
                            if (!"AvailableRoomRate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AvailableRoomRate)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Status"
                    java.lang.String tempAttribStatus =
                        
                                reader.getAttributeValue(null,"Status");
                            
                   if (tempAttribStatus!=null){
                         java.lang.String content = tempAttribStatus;
                        
                                                 object.setStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Status");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RatePlan").equals(reader.getName())){
                                
                                                object.setRatePlan(com.cloudkey.pms.micros.og.hotelcommon.RatePlan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoomType").equals(reader.getName())){
                                
                                                object.setRoomType(com.cloudkey.pms.micros.og.hotelcommon.RoomType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","FirstDayAmount").equals(reader.getName())){
                                
                                                object.setFirstDayAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","TotalStayAmount").equals(reader.getName())){
                                
                                                object.setTotalStayAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AdultRate").equals(reader.getName())){
                                
                                                object.setAdultRate(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ChildRate").equals(reader.getName())){
                                
                                                object.setChildRate(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    