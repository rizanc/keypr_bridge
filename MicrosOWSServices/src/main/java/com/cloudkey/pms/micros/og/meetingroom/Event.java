
/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  Event bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Event
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Event
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for MiscellaneousItems
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[] localMiscellaneousItems ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiscellaneousItemsTracker = false ;

                           public boolean isMiscellaneousItemsSpecified(){
                               return localMiscellaneousItemsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[] getMiscellaneousItems(){
                               return localMiscellaneousItems;
                           }

                           
                        


                               
                              /**
                               * validate the array for MiscellaneousItems
                               */
                              protected void validateMiscellaneousItems(com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MiscellaneousItems
                              */
                              public void setMiscellaneousItems(com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[] param){
                              
                                   validateMiscellaneousItems(param);

                               localMiscellaneousItemsTracker = param != null;
                                      
                                      this.localMiscellaneousItems=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem
                             */
                             public void addMiscellaneousItems(com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem param){
                                   if (localMiscellaneousItems == null){
                                   localMiscellaneousItems = new com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[]{};
                                   }

                            
                                 //update the setting tracker
                                localMiscellaneousItemsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMiscellaneousItems);
                               list.add(param);
                               this.localMiscellaneousItems =
                             (com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.MiscellaneousItem[list.size()]);

                             }
                             

                        /**
                        * field for Menus
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.Menu[] localMenus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMenusTracker = false ;

                           public boolean isMenusSpecified(){
                               return localMenusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.Menu[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.Menu[] getMenus(){
                               return localMenus;
                           }

                           
                        


                               
                              /**
                               * validate the array for Menus
                               */
                              protected void validateMenus(com.cloudkey.pms.micros.og.meetingroom.Menu[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Menus
                              */
                              public void setMenus(com.cloudkey.pms.micros.og.meetingroom.Menu[] param){
                              
                                   validateMenus(param);

                               localMenusTracker = param != null;
                                      
                                      this.localMenus=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.Menu
                             */
                             public void addMenus(com.cloudkey.pms.micros.og.meetingroom.Menu param){
                                   if (localMenus == null){
                                   localMenus = new com.cloudkey.pms.micros.og.meetingroom.Menu[]{};
                                   }

                            
                                 //update the setting tracker
                                localMenusTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMenus);
                               list.add(param);
                               this.localMenus =
                             (com.cloudkey.pms.micros.og.meetingroom.Menu[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.Menu[list.size()]);

                             }
                             

                        /**
                        * field for FunctionSpace
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.FunctionSpace localFunctionSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.FunctionSpace
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.FunctionSpace getFunctionSpace(){
                               return localFunctionSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FunctionSpace
                               */
                               public void setFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace param){
                            
                                            this.localFunctionSpace=param;
                                    

                               }
                            

                        /**
                        * field for EventID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.InternalID localEventID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventIDTracker = false ;

                           public boolean isEventIDSpecified(){
                               return localEventIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.InternalID
                           */
                           public  com.cloudkey.pms.micros.og.common.InternalID getEventID(){
                               return localEventID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventID
                               */
                               public void setEventID(com.cloudkey.pms.micros.og.common.InternalID param){
                            localEventIDTracker = param != null;
                                   
                                            this.localEventID=param;
                                    

                               }
                            

                        /**
                        * field for EventDate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localEventDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventDateTracker = false ;

                           public boolean isEventDateSpecified(){
                               return localEventDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getEventDate(){
                               return localEventDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventDate
                               */
                               public void setEventDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localEventDateTracker = param != null;
                                   
                                            this.localEventDate=param;
                                    

                               }
                            

                        /**
                        * field for Delegates
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.Delegate[] localDelegates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDelegatesTracker = false ;

                           public boolean isDelegatesSpecified(){
                               return localDelegatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.Delegate[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.Delegate[] getDelegates(){
                               return localDelegates;
                           }

                           
                        


                               
                              /**
                               * validate the array for Delegates
                               */
                              protected void validateDelegates(com.cloudkey.pms.micros.og.meetingroom.Delegate[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Delegates
                              */
                              public void setDelegates(com.cloudkey.pms.micros.og.meetingroom.Delegate[] param){
                              
                                   validateDelegates(param);

                               localDelegatesTracker = param != null;
                                      
                                      this.localDelegates=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.Delegate
                             */
                             public void addDelegates(com.cloudkey.pms.micros.og.meetingroom.Delegate param){
                                   if (localDelegates == null){
                                   localDelegates = new com.cloudkey.pms.micros.og.meetingroom.Delegate[]{};
                                   }

                            
                                 //update the setting tracker
                                localDelegatesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDelegates);
                               list.add(param);
                               this.localDelegates =
                             (com.cloudkey.pms.micros.og.meetingroom.Delegate[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.Delegate[list.size()]);

                             }
                             

                        /**
                        * field for RegistrationRequired
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRegistrationRequired ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRegistrationRequired(){
                               return localRegistrationRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RegistrationRequired
                               */
                               public void setRegistrationRequired(boolean param){
                            
                                            this.localRegistrationRequired=param;
                                    

                               }
                            

                        /**
                        * field for OpenForRegistration
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOpenForRegistration ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOpenForRegistration(){
                               return localOpenForRegistration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpenForRegistration
                               */
                               public void setOpenForRegistration(boolean param){
                            
                                            this.localOpenForRegistration=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfAttendees
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfAttendees ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfAttendees(){
                               return localNumberOfAttendees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfAttendees
                               */
                               public void setNumberOfAttendees(int param){
                            
                                            this.localNumberOfAttendees=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfRegisteredAttendees
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfRegisteredAttendees ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfRegisteredAttendees(){
                               return localNumberOfRegisteredAttendees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfRegisteredAttendees
                               */
                               public void setNumberOfRegisteredAttendees(int param){
                            
                                            this.localNumberOfRegisteredAttendees=param;
                                    

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
                           namespacePrefix+":Event",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Event",
                           xmlWriter);
                   }

               
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
        public static Event parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Event object =
                new Event();

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
                    
                            if (!"Event".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Event)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
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
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
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
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
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
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace").equals(reader.getName())){
                                
                                                object.setFunctionSpace(com.cloudkey.pms.micros.og.meetingroom.FunctionSpace.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventID").equals(reader.getName())){
                                
                                                object.setEventID(com.cloudkey.pms.micros.og.common.InternalID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventDate").equals(reader.getName())){
                                
                                                object.setEventDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
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
           
    