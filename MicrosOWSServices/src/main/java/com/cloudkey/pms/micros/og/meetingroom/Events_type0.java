
/**
 * Events_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  Events_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Events_type0 extends com.cloudkey.pms.micros.og.meetingroom.Event
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Events_type0
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for EventType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEventType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEventType(){
                               return localEventType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventType
                               */
                               public void setEventType(java.lang.String param){
                            
                                            this.localEventType=param;
                                    

                               }
                            

                        /**
                        * field for EventName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEventName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEventName(){
                               return localEventName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventName
                               */
                               public void setEventName(java.lang.String param){
                            
                                            this.localEventName=param;
                                    

                               }
                            

                        /**
                        * field for MasterEvent
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMasterEvent ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMasterEvent(){
                               return localMasterEvent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MasterEvent
                               */
                               public void setMasterEvent(boolean param){
                            
                                            this.localMasterEvent=param;
                                    

                               }
                            

                        /**
                        * field for MasterEventID
                        * This was an Attribute!
                        */

                        
                                    protected int localMasterEventID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMasterEventID(){
                               return localMasterEventID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MasterEventID
                               */
                               public void setMasterEventID(int param){
                            
                                            this.localMasterEventID=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/MeetingRoom/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Events_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Events_type0",
                           xmlWriter);
                   }

               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "registrationRequired",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistrationRequired), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "openForRegistration",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpenForRegistration), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfAttendees!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfAttendees",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfRegisteredAttendees!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfRegisteredAttendees",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRegisteredAttendees), xmlWriter);

                                            
                                      }
                                    
                                            if (localEventType != null){
                                        
                                                writeAttribute("",
                                                         "eventType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventType), xmlWriter);

                                            
                                      }
                                    
                                            if (localEventName != null){
                                        
                                                writeAttribute("",
                                                         "eventName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "masterEvent",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMasterEvent), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMasterEventID!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "masterEventID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMasterEventID), xmlWriter);

                                            
                                      }
                                     if (localMiscellaneousItemsTracker){
                                       if (localMiscellaneousItems!=null){
                                            for (int i = 0;i < localMiscellaneousItems.length;i++){
                                                if (localMiscellaneousItems[i] != null){
                                                 localMiscellaneousItems[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MiscellaneousItems"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("MiscellaneousItems cannot be null!!");
                                        
                                    }
                                 } if (localMenusTracker){
                                       if (localMenus!=null){
                                            for (int i = 0;i < localMenus.length;i++){
                                                if (localMenus[i] != null){
                                                 localMenus[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Menus"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Menus cannot be null!!");
                                        
                                    }
                                 }
                                            if (localFunctionSpace==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FunctionSpace cannot be null!!");
                                            }
                                           localFunctionSpace.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace"),
                                               xmlWriter);
                                         if (localEventIDTracker){
                                            if (localEventID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EventID cannot be null!!");
                                            }
                                           localEventID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventID"),
                                               xmlWriter);
                                        } if (localEventDateTracker){
                                            if (localEventDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EventDate cannot be null!!");
                                            }
                                           localEventDate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventDate"),
                                               xmlWriter);
                                        } if (localDelegatesTracker){
                                       if (localDelegates!=null){
                                            for (int i = 0;i < localDelegates.length;i++){
                                                if (localDelegates[i] != null){
                                                 localDelegates[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Delegates"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Delegates cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
                return "ns7";
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Events_type0"));
                 if (localMiscellaneousItemsTracker){
                             if (localMiscellaneousItems!=null) {
                                 for (int i = 0;i < localMiscellaneousItems.length;i++){

                                    if (localMiscellaneousItems[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "MiscellaneousItems"));
                                         elementList.add(localMiscellaneousItems[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("MiscellaneousItems cannot be null!!");
                                    
                             }

                        } if (localMenusTracker){
                             if (localMenus!=null) {
                                 for (int i = 0;i < localMenus.length;i++){

                                    if (localMenus[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "Menus"));
                                         elementList.add(localMenus[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Menus cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "FunctionSpace"));
                            
                            
                                    if (localFunctionSpace==null){
                                         throw new org.apache.axis2.databinding.ADBException("FunctionSpace cannot be null!!");
                                    }
                                    elementList.add(localFunctionSpace);
                                 if (localEventIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "EventID"));
                            
                            
                                    if (localEventID==null){
                                         throw new org.apache.axis2.databinding.ADBException("EventID cannot be null!!");
                                    }
                                    elementList.add(localEventID);
                                } if (localEventDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "EventDate"));
                            
                            
                                    if (localEventDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("EventDate cannot be null!!");
                                    }
                                    elementList.add(localEventDate);
                                } if (localDelegatesTracker){
                             if (localDelegates!=null) {
                                 for (int i = 0;i < localDelegates.length;i++){

                                    if (localDelegates[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "Delegates"));
                                         elementList.add(localDelegates[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Delegates cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","registrationRequired"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistrationRequired));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","openForRegistration"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpenForRegistration));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfAttendees"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfRegisteredAttendees"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRegisteredAttendees));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","eventType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","eventName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","masterEvent"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMasterEvent));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","masterEventID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMasterEventID));
                                

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
        public static Events_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Events_type0 object =
                new Events_type0();

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
                    
                            if (!"Events_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Events_type0)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "registrationRequired"
                    java.lang.String tempAttribRegistrationRequired =
                        
                                reader.getAttributeValue(null,"registrationRequired");
                            
                   if (tempAttribRegistrationRequired!=null){
                         java.lang.String content = tempAttribRegistrationRequired;
                        
                                                 object.setRegistrationRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRegistrationRequired));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("registrationRequired");
                    
                    // handle attribute "openForRegistration"
                    java.lang.String tempAttribOpenForRegistration =
                        
                                reader.getAttributeValue(null,"openForRegistration");
                            
                   if (tempAttribOpenForRegistration!=null){
                         java.lang.String content = tempAttribOpenForRegistration;
                        
                                                 object.setOpenForRegistration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOpenForRegistration));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("openForRegistration");
                    
                    // handle attribute "numberOfAttendees"
                    java.lang.String tempAttribNumberOfAttendees =
                        
                                reader.getAttributeValue(null,"numberOfAttendees");
                            
                   if (tempAttribNumberOfAttendees!=null){
                         java.lang.String content = tempAttribNumberOfAttendees;
                        
                                                 object.setNumberOfAttendees(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfAttendees));
                                            
                    } else {
                       
                                           object.setNumberOfAttendees(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfAttendees");
                    
                    // handle attribute "numberOfRegisteredAttendees"
                    java.lang.String tempAttribNumberOfRegisteredAttendees =
                        
                                reader.getAttributeValue(null,"numberOfRegisteredAttendees");
                            
                   if (tempAttribNumberOfRegisteredAttendees!=null){
                         java.lang.String content = tempAttribNumberOfRegisteredAttendees;
                        
                                                 object.setNumberOfRegisteredAttendees(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfRegisteredAttendees));
                                            
                    } else {
                       
                                           object.setNumberOfRegisteredAttendees(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfRegisteredAttendees");
                    
                    // handle attribute "eventType"
                    java.lang.String tempAttribEventType =
                        
                                reader.getAttributeValue(null,"eventType");
                            
                   if (tempAttribEventType!=null){
                         java.lang.String content = tempAttribEventType;
                        
                                                 object.setEventType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEventType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("eventType");
                    
                    // handle attribute "eventName"
                    java.lang.String tempAttribEventName =
                        
                                reader.getAttributeValue(null,"eventName");
                            
                   if (tempAttribEventName!=null){
                         java.lang.String content = tempAttribEventName;
                        
                                                 object.setEventName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEventName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("eventName");
                    
                    // handle attribute "masterEvent"
                    java.lang.String tempAttribMasterEvent =
                        
                                reader.getAttributeValue(null,"masterEvent");
                            
                   if (tempAttribMasterEvent!=null){
                         java.lang.String content = tempAttribMasterEvent;
                        
                                                 object.setMasterEvent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMasterEvent));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("masterEvent");
                    
                    // handle attribute "masterEventID"
                    java.lang.String tempAttribMasterEventID =
                        
                                reader.getAttributeValue(null,"masterEventID");
                            
                   if (tempAttribMasterEventID!=null){
                         java.lang.String content = tempAttribMasterEventID;
                        
                                                 object.setMasterEventID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMasterEventID));
                                            
                    } else {
                       
                                           object.setMasterEventID(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("masterEventID");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MiscellaneousItems").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MiscellaneousItems").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMiscellaneousItems((com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Menus").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.cloudkey.pms.micros.og.meetingroom.Menu.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Menus").equals(reader.getName())){
                                                                    list2.add(com.cloudkey.pms.micros.og.meetingroom.Menu.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMenus((com.cloudkey.pms.micros.og.meetingroom.Menu[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.Menu.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace").equals(reader.getName())){
                                
                                                object.setFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventID").equals(reader.getName())){
                                
                                                object.setEventID(com.cloudkey.pms.micros.og.common.InternalID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventDate").equals(reader.getName())){
                                
                                                object.setEventDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Delegates").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.cloudkey.pms.micros.og.meetingroom.Delegate.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Delegates").equals(reader.getName())){
                                                                    list6.add(com.cloudkey.pms.micros.og.meetingroom.Delegate.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDelegates((com.cloudkey.pms.micros.og.meetingroom.Delegate[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.Delegate.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    