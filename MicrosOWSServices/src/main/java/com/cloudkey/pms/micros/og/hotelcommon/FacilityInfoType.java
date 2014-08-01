
/**
 * FacilityInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  FacilityInfoType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FacilityInfoType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FacilityInfoType
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for GuestRooms
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuestRooms_type0 localGuestRooms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuestRoomsTracker = false ;

                           public boolean isGuestRoomsSpecified(){
                               return localGuestRoomsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuestRooms_type0
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuestRooms_type0 getGuestRooms(){
                               return localGuestRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestRooms
                               */
                               public void setGuestRooms(com.cloudkey.pms.micros.og.hotelcommon.GuestRooms_type0 param){
                            localGuestRoomsTracker = param != null;
                                   
                                            this.localGuestRooms=param;
                                    

                               }
                            

                        /**
                        * field for Restaurants
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RestaurantsType localRestaurants ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRestaurantsTracker = false ;

                           public boolean isRestaurantsSpecified(){
                               return localRestaurantsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RestaurantsType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RestaurantsType getRestaurants(){
                               return localRestaurants;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Restaurants
                               */
                               public void setRestaurants(com.cloudkey.pms.micros.og.hotelcommon.RestaurantsType param){
                            localRestaurantsTracker = param != null;
                                   
                                            this.localRestaurants=param;
                                    

                               }
                            

                        /**
                        * field for MeetingRooms
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType localMeetingRooms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMeetingRoomsTracker = false ;

                           public boolean isMeetingRoomsSpecified(){
                               return localMeetingRoomsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType getMeetingRooms(){
                               return localMeetingRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingRooms
                               */
                               public void setMeetingRooms(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType param){
                            localMeetingRoomsTracker = param != null;
                                   
                                            this.localMeetingRooms=param;
                                    

                               }
                            

                        /**
                        * field for Attractions
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AttractionsType localAttractions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttractionsTracker = false ;

                           public boolean isAttractionsSpecified(){
                               return localAttractionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AttractionsType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AttractionsType getAttractions(){
                               return localAttractions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Attractions
                               */
                               public void setAttractions(com.cloudkey.pms.micros.og.hotelcommon.AttractionsType param){
                            localAttractionsTracker = param != null;
                                   
                                            this.localAttractions=param;
                                    

                               }
                            

                        /**
                        * field for DateOpened
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localDateOpened ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDateOpened(){
                               return localDateOpened;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateOpened
                               */
                               public void setDateOpened(java.util.Date param){
                            
                                            this.localDateOpened=param;
                                    

                               }
                            

                        /**
                        * field for DateRennovated
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localDateRennovated ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDateRennovated(){
                               return localDateRennovated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateRennovated
                               */
                               public void setDateRennovated(java.util.Date param){
                            
                                            this.localDateRennovated=param;
                                    

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
                           namespacePrefix+":FacilityInfoType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FacilityInfoType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDateOpened != null){
                                        
                                                writeAttribute("",
                                                         "dateOpened",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateOpened), xmlWriter);

                                            
                                      }
                                    
                                            if (localDateRennovated != null){
                                        
                                                writeAttribute("",
                                                         "dateRennovated",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateRennovated), xmlWriter);

                                            
                                      }
                                     if (localGuestRoomsTracker){
                                            if (localGuestRooms==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestRooms cannot be null!!");
                                            }
                                           localGuestRooms.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuestRooms"),
                                               xmlWriter);
                                        } if (localRestaurantsTracker){
                                            if (localRestaurants==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Restaurants cannot be null!!");
                                            }
                                           localRestaurants.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Restaurants"),
                                               xmlWriter);
                                        } if (localMeetingRoomsTracker){
                                            if (localMeetingRooms==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MeetingRooms cannot be null!!");
                                            }
                                           localMeetingRooms.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MeetingRooms"),
                                               xmlWriter);
                                        } if (localAttractionsTracker){
                                            if (localAttractions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Attractions cannot be null!!");
                                            }
                                           localAttractions.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Attractions"),
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

                 if (localGuestRoomsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuestRooms"));
                            
                            
                                    if (localGuestRooms==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestRooms cannot be null!!");
                                    }
                                    elementList.add(localGuestRooms);
                                } if (localRestaurantsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Restaurants"));
                            
                            
                                    if (localRestaurants==null){
                                         throw new org.apache.axis2.databinding.ADBException("Restaurants cannot be null!!");
                                    }
                                    elementList.add(localRestaurants);
                                } if (localMeetingRoomsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "MeetingRooms"));
                            
                            
                                    if (localMeetingRooms==null){
                                         throw new org.apache.axis2.databinding.ADBException("MeetingRooms cannot be null!!");
                                    }
                                    elementList.add(localMeetingRooms);
                                } if (localAttractionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Attractions"));
                            
                            
                                    if (localAttractions==null){
                                         throw new org.apache.axis2.databinding.ADBException("Attractions cannot be null!!");
                                    }
                                    elementList.add(localAttractions);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","dateOpened"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateOpened));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","dateRennovated"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateRennovated));
                                

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
        public static FacilityInfoType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FacilityInfoType object =
                new FacilityInfoType();

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
                    
                            if (!"FacilityInfoType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FacilityInfoType)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "dateOpened"
                    java.lang.String tempAttribDateOpened =
                        
                                reader.getAttributeValue(null,"dateOpened");
                            
                   if (tempAttribDateOpened!=null){
                         java.lang.String content = tempAttribDateOpened;
                        
                                                 object.setDateOpened(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribDateOpened));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("dateOpened");
                    
                    // handle attribute "dateRennovated"
                    java.lang.String tempAttribDateRennovated =
                        
                                reader.getAttributeValue(null,"dateRennovated");
                            
                   if (tempAttribDateRennovated!=null){
                         java.lang.String content = tempAttribDateRennovated;
                        
                                                 object.setDateRennovated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribDateRennovated));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("dateRennovated");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuestRooms").equals(reader.getName())){
                                
                                                object.setGuestRooms(com.cloudkey.pms.micros.og.hotelcommon.GuestRooms_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Restaurants").equals(reader.getName())){
                                
                                                object.setRestaurants(com.cloudkey.pms.micros.og.hotelcommon.RestaurantsType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MeetingRooms").equals(reader.getName())){
                                
                                                object.setMeetingRooms(com.cloudkey.pms.micros.og.hotelcommon.MeetingRoomsType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Attractions").equals(reader.getName())){
                                
                                                object.setAttractions(com.cloudkey.pms.micros.og.hotelcommon.AttractionsType.Factory.parse(reader));
                                              
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
           
    