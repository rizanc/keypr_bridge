
/**
 * SleepingRoom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  SleepingRoom bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SleepingRoom
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SleepingRoom
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for RoomDates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localRoomDates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomDatesTracker = false ;

                           public boolean isRoomDatesSpecified(){
                               return localRoomDatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getRoomDates(){
                               return localRoomDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomDates
                               */
                               public void setRoomDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localRoomDatesTracker = param != null;
                                   
                                            this.localRoomDates=param;
                                    

                               }
                            

                        /**
                        * field for RoomRevenue
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localRoomRevenue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomRevenueTracker = false ;

                           public boolean isRoomRevenueSpecified(){
                               return localRoomRevenueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getRoomRevenue(){
                               return localRoomRevenue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomRevenue
                               */
                               public void setRoomRevenue(com.cloudkey.pms.micros.og.common.Amount param){
                            localRoomRevenueTracker = param != null;
                                   
                                            this.localRoomRevenue=param;
                                    

                               }
                            

                        /**
                        * field for RoomRevenueTax
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localRoomRevenueTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomRevenueTaxTracker = false ;

                           public boolean isRoomRevenueTaxSpecified(){
                               return localRoomRevenueTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getRoomRevenueTax(){
                               return localRoomRevenueTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomRevenueTax
                               */
                               public void setRoomRevenueTax(com.cloudkey.pms.micros.og.common.Amount param){
                            localRoomRevenueTaxTracker = param != null;
                                   
                                            this.localRoomRevenueTax=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomType(){
                               return localRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomType
                               */
                               public void setRoomType(java.lang.String param){
                            
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        * This was an Attribute!
                        */

                        
                                    protected int localQuantity ;
                                

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
                            
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for ActionType
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.SleepingRoomActionType localActionType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.SleepingRoomActionType
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.SleepingRoomActionType getActionType(){
                               return localActionType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActionType
                               */
                               public void setActionType(com.cloudkey.pms.micros.og.meetingroom.SleepingRoomActionType param){
                            
                                            this.localActionType=param;
                                    

                               }
                            

                        /**
                        * field for Occupancy1
                        * This was an Attribute!
                        */

                        
                                    protected int localOccupancy1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOccupancy1(){
                               return localOccupancy1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Occupancy1
                               */
                               public void setOccupancy1(int param){
                            
                                            this.localOccupancy1=param;
                                    

                               }
                            

                        /**
                        * field for Occupancy2
                        * This was an Attribute!
                        */

                        
                                    protected int localOccupancy2 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOccupancy2(){
                               return localOccupancy2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Occupancy2
                               */
                               public void setOccupancy2(int param){
                            
                                            this.localOccupancy2=param;
                                    

                               }
                            

                        /**
                        * field for Occupancy3
                        * This was an Attribute!
                        */

                        
                                    protected int localOccupancy3 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOccupancy3(){
                               return localOccupancy3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Occupancy3
                               */
                               public void setOccupancy3(int param){
                            
                                            this.localOccupancy3=param;
                                    

                               }
                            

                        /**
                        * field for Occupancy4
                        * This was an Attribute!
                        */

                        
                                    protected int localOccupancy4 ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getOccupancy4(){
                               return localOccupancy4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Occupancy4
                               */
                               public void setOccupancy4(int param){
                            
                                            this.localOccupancy4=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/MeetingRoom/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SleepingRoom",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SleepingRoom",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomType != null){
                                        
                                                writeAttribute("",
                                                         "roomType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType), xmlWriter);

                                            
                                      }
                                    
                                                   if (localQuantity!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "quantity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localActionType != null){
                                        writeAttribute("",
                                           "actionType",
                                           localActionType.toString(), xmlWriter);
                                    }
                                    
                                                   if (localOccupancy1!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "occupancy1",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy1), xmlWriter);

                                            
                                      }
                                    
                                                   if (localOccupancy2!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "occupancy2",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy2), xmlWriter);

                                            
                                      }
                                    
                                                   if (localOccupancy3!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "occupancy3",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy3), xmlWriter);

                                            
                                      }
                                    
                                                   if (localOccupancy4!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "occupancy4",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy4), xmlWriter);

                                            
                                      }
                                     if (localRoomDatesTracker){
                                            if (localRoomDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomDates cannot be null!!");
                                            }
                                           localRoomDates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomDates"),
                                               xmlWriter);
                                        } if (localRoomRevenueTracker){
                                            if (localRoomRevenue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomRevenue cannot be null!!");
                                            }
                                           localRoomRevenue.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomRevenue"),
                                               xmlWriter);
                                        } if (localRoomRevenueTaxTracker){
                                            if (localRoomRevenueTax==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomRevenueTax cannot be null!!");
                                            }
                                           localRoomRevenueTax.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomRevenueTax"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
                return "ns3";
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

                 if (localRoomDatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RoomDates"));
                            
                            
                                    if (localRoomDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomDates cannot be null!!");
                                    }
                                    elementList.add(localRoomDates);
                                } if (localRoomRevenueTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RoomRevenue"));
                            
                            
                                    if (localRoomRevenue==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomRevenue cannot be null!!");
                                    }
                                    elementList.add(localRoomRevenue);
                                } if (localRoomRevenueTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RoomRevenueTax"));
                            
                            
                                    if (localRoomRevenueTax==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomRevenueTax cannot be null!!");
                                    }
                                    elementList.add(localRoomRevenueTax);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","roomType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quantity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","actionType"));
                            
                                      attribList.add(localActionType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","occupancy1"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy1));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","occupancy2"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy2));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","occupancy3"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy3));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","occupancy4"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancy4));
                                

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
        public static SleepingRoom parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SleepingRoom object =
                new SleepingRoom();

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
                    
                            if (!"SleepingRoom".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SleepingRoom)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "roomType"
                    java.lang.String tempAttribRoomType =
                        
                                reader.getAttributeValue(null,"roomType");
                            
                   if (tempAttribRoomType!=null){
                         java.lang.String content = tempAttribRoomType;
                        
                                                 object.setRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomType");
                    
                    // handle attribute "quantity"
                    java.lang.String tempAttribQuantity =
                        
                                reader.getAttributeValue(null,"quantity");
                            
                   if (tempAttribQuantity!=null){
                         java.lang.String content = tempAttribQuantity;
                        
                                                 object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribQuantity));
                                            
                    } else {
                       
                                           object.setQuantity(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("quantity");
                    
                    // handle attribute "actionType"
                    java.lang.String tempAttribActionType =
                        
                                reader.getAttributeValue(null,"actionType");
                            
                   if (tempAttribActionType!=null){
                         java.lang.String content = tempAttribActionType;
                        
                                                  object.setActionType(
                                                        com.cloudkey.pms.micros.og.meetingroom.SleepingRoomActionType.Factory.fromString(reader,tempAttribActionType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("actionType");
                    
                    // handle attribute "occupancy1"
                    java.lang.String tempAttribOccupancy1 =
                        
                                reader.getAttributeValue(null,"occupancy1");
                            
                   if (tempAttribOccupancy1!=null){
                         java.lang.String content = tempAttribOccupancy1;
                        
                                                 object.setOccupancy1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribOccupancy1));
                                            
                    } else {
                       
                                           object.setOccupancy1(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("occupancy1");
                    
                    // handle attribute "occupancy2"
                    java.lang.String tempAttribOccupancy2 =
                        
                                reader.getAttributeValue(null,"occupancy2");
                            
                   if (tempAttribOccupancy2!=null){
                         java.lang.String content = tempAttribOccupancy2;
                        
                                                 object.setOccupancy2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribOccupancy2));
                                            
                    } else {
                       
                                           object.setOccupancy2(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("occupancy2");
                    
                    // handle attribute "occupancy3"
                    java.lang.String tempAttribOccupancy3 =
                        
                                reader.getAttributeValue(null,"occupancy3");
                            
                   if (tempAttribOccupancy3!=null){
                         java.lang.String content = tempAttribOccupancy3;
                        
                                                 object.setOccupancy3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribOccupancy3));
                                            
                    } else {
                       
                                           object.setOccupancy3(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("occupancy3");
                    
                    // handle attribute "occupancy4"
                    java.lang.String tempAttribOccupancy4 =
                        
                                reader.getAttributeValue(null,"occupancy4");
                            
                   if (tempAttribOccupancy4!=null){
                         java.lang.String content = tempAttribOccupancy4;
                        
                                                 object.setOccupancy4(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribOccupancy4));
                                            
                    } else {
                       
                                           object.setOccupancy4(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("occupancy4");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomDates").equals(reader.getName())){
                                
                                                object.setRoomDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomRevenue").equals(reader.getName())){
                                
                                                object.setRoomRevenue(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomRevenueTax").equals(reader.getName())){
                                
                                                object.setRoomRevenueTax(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    