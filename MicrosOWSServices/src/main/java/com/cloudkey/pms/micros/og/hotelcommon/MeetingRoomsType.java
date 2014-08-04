
/**
 * MeetingRoomsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  MeetingRoomsType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingRoomsType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MeetingRoomsType
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for MeetingRoom
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[] localMeetingRoom ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMeetingRoomTracker = false ;

                           public boolean isMeetingRoomSpecified(){
                               return localMeetingRoomTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[] getMeetingRoom(){
                               return localMeetingRoom;
                           }

                           
                        


                               
                              /**
                               * validate the array for MeetingRoom
                               */
                              protected void validateMeetingRoom(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MeetingRoom
                              */
                              public void setMeetingRoom(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[] param){
                              
                                   validateMeetingRoom(param);

                               localMeetingRoomTracker = param != null;
                                      
                                      this.localMeetingRoom=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom
                             */
                             public void addMeetingRoom(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom param){
                                   if (localMeetingRoom == null){
                                   localMeetingRoom = new com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[]{};
                                   }

                            
                                 //update the setting tracker
                                localMeetingRoomTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMeetingRoom);
                               list.add(param);
                               this.localMeetingRoom =
                             (com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[list.size()]);

                             }
                             

                        /**
                        * field for MeetingRoomCount
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localMeetingRoomCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getMeetingRoomCount(){
                               return localMeetingRoomCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingRoomCount
                               */
                               public void setMeetingRoomCount(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localMeetingRoomCount=param;
                                    

                               }
                            

                        /**
                        * field for SmallestRoomSpace
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localSmallestRoomSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getSmallestRoomSpace(){
                               return localSmallestRoomSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmallestRoomSpace
                               */
                               public void setSmallestRoomSpace(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localSmallestRoomSpace=param;
                                    

                               }
                            

                        /**
                        * field for LargestRoomSpace
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localLargestRoomSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getLargestRoomSpace(){
                               return localLargestRoomSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LargestRoomSpace
                               */
                               public void setLargestRoomSpace(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localLargestRoomSpace=param;
                                    

                               }
                            

                        /**
                        * field for TotalRoomSpace
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localTotalRoomSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getTotalRoomSpace(){
                               return localTotalRoomSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalRoomSpace
                               */
                               public void setTotalRoomSpace(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localTotalRoomSpace=param;
                                    

                               }
                            

                        /**
                        * field for LargestSeatingCapacity
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localLargestSeatingCapacity ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getLargestSeatingCapacity(){
                               return localLargestSeatingCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LargestSeatingCapacity
                               */
                               public void setLargestSeatingCapacity(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localLargestSeatingCapacity=param;
                                    

                               }
                            

                        /**
                        * field for SecondLargestSeatingCapacity
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localSecondLargestSeatingCapacity ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getSecondLargestSeatingCapacity(){
                               return localSecondLargestSeatingCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondLargestSeatingCapacity
                               */
                               public void setSecondLargestSeatingCapacity(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localSecondLargestSeatingCapacity=param;
                                    

                               }
                            

                        /**
                        * field for SmallestSeatingCapacity
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localSmallestSeatingCapacity ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getSmallestSeatingCapacity(){
                               return localSmallestSeatingCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmallestSeatingCapacity
                               */
                               public void setSmallestSeatingCapacity(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localSmallestSeatingCapacity=param;
                                    

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
                           namespacePrefix+":MeetingRoomsType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingRoomsType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localMeetingRoomCount != null){
                                        
                                                writeAttribute("",
                                                         "MeetingRoomCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingRoomCount), xmlWriter);

                                            
                                      }
                                    
                                            if (localSmallestRoomSpace != null){
                                        
                                                writeAttribute("",
                                                         "SmallestRoomSpace",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmallestRoomSpace), xmlWriter);

                                            
                                      }
                                    
                                            if (localLargestRoomSpace != null){
                                        
                                                writeAttribute("",
                                                         "LargestRoomSpace",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLargestRoomSpace), xmlWriter);

                                            
                                      }
                                    
                                            if (localTotalRoomSpace != null){
                                        
                                                writeAttribute("",
                                                         "TotalRoomSpace",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalRoomSpace), xmlWriter);

                                            
                                      }
                                    
                                            if (localLargestSeatingCapacity != null){
                                        
                                                writeAttribute("",
                                                         "LargestSeatingCapacity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLargestSeatingCapacity), xmlWriter);

                                            
                                      }
                                    
                                            if (localSecondLargestSeatingCapacity != null){
                                        
                                                writeAttribute("",
                                                         "SecondLargestSeatingCapacity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondLargestSeatingCapacity), xmlWriter);

                                            
                                      }
                                    
                                            if (localSmallestSeatingCapacity != null){
                                        
                                                writeAttribute("",
                                                         "SmallestSeatingCapacity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmallestSeatingCapacity), xmlWriter);

                                            
                                      }
                                     if (localMeetingRoomTracker){
                                       if (localMeetingRoom!=null){
                                            for (int i = 0;i < localMeetingRoom.length;i++){
                                                if (localMeetingRoom[i] != null){
                                                 localMeetingRoom[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MeetingRoom"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("MeetingRoom cannot be null!!");
                                        
                                    }
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

                 if (localMeetingRoomTracker){
                             if (localMeetingRoom!=null) {
                                 for (int i = 0;i < localMeetingRoom.length;i++){

                                    if (localMeetingRoom[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "MeetingRoom"));
                                         elementList.add(localMeetingRoom[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("MeetingRoom cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","MeetingRoomCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingRoomCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SmallestRoomSpace"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmallestRoomSpace));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","LargestRoomSpace"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLargestRoomSpace));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TotalRoomSpace"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalRoomSpace));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","LargestSeatingCapacity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLargestSeatingCapacity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SecondLargestSeatingCapacity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondLargestSeatingCapacity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SmallestSeatingCapacity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmallestSeatingCapacity));
                                

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
        public static MeetingRoomsType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingRoomsType object =
                new MeetingRoomsType();

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
                    
                            if (!"MeetingRoomsType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingRoomsType)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "MeetingRoomCount"
                    java.lang.String tempAttribMeetingRoomCount =
                        
                                reader.getAttributeValue(null,"MeetingRoomCount");
                            
                   if (tempAttribMeetingRoomCount!=null){
                         java.lang.String content = tempAttribMeetingRoomCount;
                        
                                                 object.setMeetingRoomCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribMeetingRoomCount));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MeetingRoomCount");
                    
                    // handle attribute "SmallestRoomSpace"
                    java.lang.String tempAttribSmallestRoomSpace =
                        
                                reader.getAttributeValue(null,"SmallestRoomSpace");
                            
                   if (tempAttribSmallestRoomSpace!=null){
                         java.lang.String content = tempAttribSmallestRoomSpace;
                        
                                                 object.setSmallestRoomSpace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribSmallestRoomSpace));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SmallestRoomSpace");
                    
                    // handle attribute "LargestRoomSpace"
                    java.lang.String tempAttribLargestRoomSpace =
                        
                                reader.getAttributeValue(null,"LargestRoomSpace");
                            
                   if (tempAttribLargestRoomSpace!=null){
                         java.lang.String content = tempAttribLargestRoomSpace;
                        
                                                 object.setLargestRoomSpace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribLargestRoomSpace));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("LargestRoomSpace");
                    
                    // handle attribute "TotalRoomSpace"
                    java.lang.String tempAttribTotalRoomSpace =
                        
                                reader.getAttributeValue(null,"TotalRoomSpace");
                            
                   if (tempAttribTotalRoomSpace!=null){
                         java.lang.String content = tempAttribTotalRoomSpace;
                        
                                                 object.setTotalRoomSpace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribTotalRoomSpace));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TotalRoomSpace");
                    
                    // handle attribute "LargestSeatingCapacity"
                    java.lang.String tempAttribLargestSeatingCapacity =
                        
                                reader.getAttributeValue(null,"LargestSeatingCapacity");
                            
                   if (tempAttribLargestSeatingCapacity!=null){
                         java.lang.String content = tempAttribLargestSeatingCapacity;
                        
                                                 object.setLargestSeatingCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribLargestSeatingCapacity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("LargestSeatingCapacity");
                    
                    // handle attribute "SecondLargestSeatingCapacity"
                    java.lang.String tempAttribSecondLargestSeatingCapacity =
                        
                                reader.getAttributeValue(null,"SecondLargestSeatingCapacity");
                            
                   if (tempAttribSecondLargestSeatingCapacity!=null){
                         java.lang.String content = tempAttribSecondLargestSeatingCapacity;
                        
                                                 object.setSecondLargestSeatingCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribSecondLargestSeatingCapacity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SecondLargestSeatingCapacity");
                    
                    // handle attribute "SmallestSeatingCapacity"
                    java.lang.String tempAttribSmallestSeatingCapacity =
                        
                                reader.getAttributeValue(null,"SmallestSeatingCapacity");
                            
                   if (tempAttribSmallestSeatingCapacity!=null){
                         java.lang.String content = tempAttribSmallestSeatingCapacity;
                        
                                                 object.setSmallestSeatingCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribSmallestSeatingCapacity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SmallestSeatingCapacity");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MeetingRoom").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MeetingRoom").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMeetingRoom((com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsTypeMeetingRoom.class,
                                                                list1));
                                                            
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
           
    