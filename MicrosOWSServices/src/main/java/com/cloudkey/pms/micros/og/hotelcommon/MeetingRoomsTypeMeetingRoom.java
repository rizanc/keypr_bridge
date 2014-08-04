
/**
 * MeetingRoomsTypeMeetingRoom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  MeetingRoomsTypeMeetingRoom bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingRoomsTypeMeetingRoom
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MeetingRoomsTypeMeetingRoom
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Codes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode localCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodesTracker = false ;

                           public boolean isCodesSpecified(){
                               return localCodesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode getCodes(){
                               return localCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codes
                               */
                               public void setCodes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode param){
                            localCodesTracker = param != null;
                                   
                                            this.localCodes=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for Irregular
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIrregular ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIrregular(){
                               return localIrregular;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Irregular
                               */
                               public void setIrregular(boolean param){
                            
                                            this.localIrregular=param;
                                    

                               }
                            

                        /**
                        * field for PropertySystemName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPropertySystemName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPropertySystemName(){
                               return localPropertySystemName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PropertySystemName
                               */
                               public void setPropertySystemName(java.lang.String param){
                            
                                            this.localPropertySystemName=param;
                                    

                               }
                            

                        /**
                        * field for RoomName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomName(){
                               return localRoomName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomName
                               */
                               public void setRoomName(java.lang.String param){
                            
                                            this.localRoomName=param;
                                    

                               }
                            

                        /**
                        * field for Sort
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localSort ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getSort(){
                               return localSort;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sort
                               */
                               public void setSort(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localSort=param;
                                    

                               }
                            

                        /**
                        * field for MeetingRoomCapacity
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localMeetingRoomCapacity ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getMeetingRoomCapacity(){
                               return localMeetingRoomCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingRoomCapacity
                               */
                               public void setMeetingRoomCapacity(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localMeetingRoomCapacity=param;
                                    

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
                           namespacePrefix+":MeetingRoomsTypeMeetingRoom",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingRoomsTypeMeetingRoom",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Irregular",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIrregular), xmlWriter);

                                            
                                      }
                                    
                                            if (localPropertySystemName != null){
                                        
                                                writeAttribute("",
                                                         "PropertySystemName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPropertySystemName), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomName != null){
                                        
                                                writeAttribute("",
                                                         "RoomName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomName), xmlWriter);

                                            
                                      }
                                    
                                            if (localSort != null){
                                        
                                                writeAttribute("",
                                                         "Sort",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSort), xmlWriter);

                                            
                                      }
                                    
                                            if (localMeetingRoomCapacity != null){
                                        
                                                writeAttribute("",
                                                         "MeetingRoomCapacity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingRoomCapacity), xmlWriter);

                                            
                                      }
                                     if (localCodesTracker){
                                            if (localCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Codes cannot be null!!");
                                            }
                                           localCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Codes"),
                                               xmlWriter);
                                        } if (localDescriptionTracker){
                                            if (localDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                            }
                                           localDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description"),
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

                 if (localCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Codes"));
                            
                            
                                    if (localCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("Codes cannot be null!!");
                                    }
                                    elementList.add(localCodes);
                                } if (localDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Description"));
                            
                            
                                    if (localDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    }
                                    elementList.add(localDescription);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Irregular"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIrregular));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PropertySystemName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPropertySystemName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Sort"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSort));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MeetingRoomCapacity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingRoomCapacity));
                                

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
        public static MeetingRoomsTypeMeetingRoom parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingRoomsTypeMeetingRoom object =
                new MeetingRoomsTypeMeetingRoom();

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
                    
                            if (!"MeetingRoomsTypeMeetingRoom".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingRoomsTypeMeetingRoom)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Irregular"
                    java.lang.String tempAttribIrregular =
                        
                                reader.getAttributeValue(null,"Irregular");
                            
                   if (tempAttribIrregular!=null){
                         java.lang.String content = tempAttribIrregular;
                        
                                                 object.setIrregular(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIrregular));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Irregular");
                    
                    // handle attribute "PropertySystemName"
                    java.lang.String tempAttribPropertySystemName =
                        
                                reader.getAttributeValue(null,"PropertySystemName");
                            
                   if (tempAttribPropertySystemName!=null){
                         java.lang.String content = tempAttribPropertySystemName;
                        
                                                 object.setPropertySystemName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPropertySystemName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PropertySystemName");
                    
                    // handle attribute "RoomName"
                    java.lang.String tempAttribRoomName =
                        
                                reader.getAttributeValue(null,"RoomName");
                            
                   if (tempAttribRoomName!=null){
                         java.lang.String content = tempAttribRoomName;
                        
                                                 object.setRoomName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomName");
                    
                    // handle attribute "Sort"
                    java.lang.String tempAttribSort =
                        
                                reader.getAttributeValue(null,"Sort");
                            
                   if (tempAttribSort!=null){
                         java.lang.String content = tempAttribSort;
                        
                                                 object.setSort(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribSort));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Sort");
                    
                    // handle attribute "MeetingRoomCapacity"
                    java.lang.String tempAttribMeetingRoomCapacity =
                        
                                reader.getAttributeValue(null,"MeetingRoomCapacity");
                            
                   if (tempAttribMeetingRoomCapacity!=null){
                         java.lang.String content = tempAttribMeetingRoomCapacity;
                        
                                                 object.setMeetingRoomCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribMeetingRoomCapacity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MeetingRoomCapacity");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Codes").equals(reader.getName())){
                                
                                                object.setCodes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfMeetingRoomsTypeMeetingRoomCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                
                                                object.setDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
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
           
    