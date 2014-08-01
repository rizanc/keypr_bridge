
/**
 * Menu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  Menu bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Menu
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Menu
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for MenuID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localMenuID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getMenuID(){
                               return localMenuID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MenuID
                               */
                               public void setMenuID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            
                                            this.localMenuID=param;
                                    

                               }
                            

                        /**
                        * field for EventMenuID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localEventMenuID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventMenuIDTracker = false ;

                           public boolean isEventMenuIDSpecified(){
                               return localEventMenuIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getEventMenuID(){
                               return localEventMenuID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EventMenuID
                               */
                               public void setEventMenuID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localEventMenuIDTracker = param != null;
                                   
                                            this.localEventMenuID=param;
                                    

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
                        * field for Charges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.CateringRate localCharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargesTracker = false ;

                           public boolean isChargesSpecified(){
                               return localChargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.CateringRate
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.CateringRate getCharges(){
                               return localCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Charges
                               */
                               public void setCharges(com.cloudkey.pms.micros.og.meetingroom.CateringRate param){
                            localChargesTracker = param != null;
                                   
                                            this.localCharges=param;
                                    

                               }
                            

                        /**
                        * field for EventType
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localEventType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventTypeTracker = false ;

                           public boolean isEventTypeSpecified(){
                               return localEventTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getEventType(){
                               return localEventType;
                           }

                           
                        


                               
                              /**
                               * validate the array for EventType
                               */
                              protected void validateEventType(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EventType
                              */
                              public void setEventType(java.lang.String[] param){
                              
                                   validateEventType(param);

                               localEventTypeTracker = param != null;
                                      
                                      this.localEventType=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addEventType(java.lang.String param){
                                   if (localEventType == null){
                                   localEventType = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localEventTypeTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEventType);
                               list.add(param);
                               this.localEventType =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for MenuDate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localMenuDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMenuDateTracker = false ;

                           public boolean isMenuDateSpecified(){
                               return localMenuDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getMenuDate(){
                               return localMenuDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MenuDate
                               */
                               public void setMenuDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localMenuDateTracker = param != null;
                                   
                                            this.localMenuDate=param;
                                    

                               }
                            

                        /**
                        * field for MenuItems
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.MenuItem[] localMenuItems ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMenuItemsTracker = false ;

                           public boolean isMenuItemsSpecified(){
                               return localMenuItemsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.MenuItem[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.MenuItem[] getMenuItems(){
                               return localMenuItems;
                           }

                           
                        


                               
                              /**
                               * validate the array for MenuItems
                               */
                              protected void validateMenuItems(com.cloudkey.pms.micros.og.meetingroom.MenuItem[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MenuItems
                              */
                              public void setMenuItems(com.cloudkey.pms.micros.og.meetingroom.MenuItem[] param){
                              
                                   validateMenuItems(param);

                               localMenuItemsTracker = param != null;
                                      
                                      this.localMenuItems=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.MenuItem
                             */
                             public void addMenuItems(com.cloudkey.pms.micros.og.meetingroom.MenuItem param){
                                   if (localMenuItems == null){
                                   localMenuItems = new com.cloudkey.pms.micros.og.meetingroom.MenuItem[]{};
                                   }

                            
                                 //update the setting tracker
                                localMenuItemsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMenuItems);
                               list.add(param);
                               this.localMenuItems =
                             (com.cloudkey.pms.micros.og.meetingroom.MenuItem[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.MenuItem[list.size()]);

                             }
                             

                        /**
                        * field for InternalBookedID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.InternalID localInternalBookedID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInternalBookedIDTracker = false ;

                           public boolean isInternalBookedIDSpecified(){
                               return localInternalBookedIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.InternalID
                           */
                           public  com.cloudkey.pms.micros.og.common.InternalID getInternalBookedID(){
                               return localInternalBookedID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InternalBookedID
                               */
                               public void setInternalBookedID(com.cloudkey.pms.micros.og.common.InternalID param){
                            localInternalBookedIDTracker = param != null;
                                   
                                            this.localInternalBookedID=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Restriction
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRestriction ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRestriction(){
                               return localRestriction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Restriction
                               */
                               public void setRestriction(java.lang.String param){
                            
                                            this.localRestriction=param;
                                    

                               }
                            

                        /**
                        * field for Beverage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localBeverage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getBeverage(){
                               return localBeverage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Beverage
                               */
                               public void setBeverage(boolean param){
                            
                                            this.localBeverage=param;
                                    

                               }
                            

                        /**
                        * field for Consumption
                        * This was an Attribute!
                        */

                        
                                    protected boolean localConsumption ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getConsumption(){
                               return localConsumption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Consumption
                               */
                               public void setConsumption(boolean param){
                            
                                            this.localConsumption=param;
                                    

                               }
                            

                        /**
                        * field for ServingType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localServingType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServingType(){
                               return localServingType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServingType
                               */
                               public void setServingType(java.lang.String param){
                            
                                            this.localServingType=param;
                                    

                               }
                            

                        /**
                        * field for ClassName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localClassName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClassName(){
                               return localClassName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClassName
                               */
                               public void setClassName(java.lang.String param){
                            
                                            this.localClassName=param;
                                    

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
                           namespacePrefix+":Menu",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Menu",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localName != null){
                                        
                                                writeAttribute("",
                                                         "name",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName), xmlWriter);

                                            
                                      }
                                    
                                            if (localRestriction != null){
                                        
                                                writeAttribute("",
                                                         "restriction",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestriction), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "beverage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeverage), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "consumption",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumption), xmlWriter);

                                            
                                      }
                                    
                                            if (localServingType != null){
                                        
                                                writeAttribute("",
                                                         "servingType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServingType), xmlWriter);

                                            
                                      }
                                    
                                            if (localClassName != null){
                                        
                                                writeAttribute("",
                                                         "className",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName), xmlWriter);

                                            
                                      }
                                    
                                            if (localMenuID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MenuID cannot be null!!");
                                            }
                                           localMenuID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuID"),
                                               xmlWriter);
                                         if (localEventMenuIDTracker){
                                            if (localEventMenuID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EventMenuID cannot be null!!");
                                            }
                                           localEventMenuID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventMenuID"),
                                               xmlWriter);
                                        } if (localDescriptionTracker){
                                            if (localDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                            }
                                           localDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Description"),
                                               xmlWriter);
                                        } if (localChargesTracker){
                                            if (localCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Charges cannot be null!!");
                                            }
                                           localCharges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Charges"),
                                               xmlWriter);
                                        } if (localEventTypeTracker){
                             if (localEventType!=null) {
                                   namespace = "http://webservices.micros.com/og/4.3/MeetingRoom/";
                                   for (int i = 0;i < localEventType.length;i++){
                                        
                                            if (localEventType[i] != null){
                                        
                                                writeStartElement(null, namespace, "EventType", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventType[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("EventType cannot be null!!");
                                    
                             }

                        } if (localMenuDateTracker){
                                            if (localMenuDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MenuDate cannot be null!!");
                                            }
                                           localMenuDate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuDate"),
                                               xmlWriter);
                                        } if (localMenuItemsTracker){
                                       if (localMenuItems!=null){
                                            for (int i = 0;i < localMenuItems.length;i++){
                                                if (localMenuItems[i] != null){
                                                 localMenuItems[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItems"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("MenuItems cannot be null!!");
                                        
                                    }
                                 } if (localInternalBookedIDTracker){
                                            if (localInternalBookedID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InternalBookedID cannot be null!!");
                                            }
                                           localInternalBookedID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","InternalBookedID"),
                                               xmlWriter);
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "MenuID"));
                            
                            
                                    if (localMenuID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MenuID cannot be null!!");
                                    }
                                    elementList.add(localMenuID);
                                 if (localEventMenuIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "EventMenuID"));
                            
                            
                                    if (localEventMenuID==null){
                                         throw new org.apache.axis2.databinding.ADBException("EventMenuID cannot be null!!");
                                    }
                                    elementList.add(localEventMenuID);
                                } if (localDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "Description"));
                            
                            
                                    if (localDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    }
                                    elementList.add(localDescription);
                                } if (localChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "Charges"));
                            
                            
                                    if (localCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("Charges cannot be null!!");
                                    }
                                    elementList.add(localCharges);
                                } if (localEventTypeTracker){
                            if (localEventType!=null){
                                  for (int i = 0;i < localEventType.length;i++){
                                      
                                         if (localEventType[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                              "EventType"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventType[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("EventType cannot be null!!");
                                
                            }

                        } if (localMenuDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "MenuDate"));
                            
                            
                                    if (localMenuDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("MenuDate cannot be null!!");
                                    }
                                    elementList.add(localMenuDate);
                                } if (localMenuItemsTracker){
                             if (localMenuItems!=null) {
                                 for (int i = 0;i < localMenuItems.length;i++){

                                    if (localMenuItems[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "MenuItems"));
                                         elementList.add(localMenuItems[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("MenuItems cannot be null!!");
                                    
                             }

                        } if (localInternalBookedIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "InternalBookedID"));
                            
                            
                                    if (localInternalBookedID==null){
                                         throw new org.apache.axis2.databinding.ADBException("InternalBookedID cannot be null!!");
                                    }
                                    elementList.add(localInternalBookedID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","name"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","restriction"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestriction));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","beverage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeverage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","consumption"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConsumption));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","servingType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServingType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","className"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClassName));
                                

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
        public static Menu parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Menu object =
                new Menu();

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
                    
                            if (!"Menu".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Menu)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "name"
                    java.lang.String tempAttribName =
                        
                                reader.getAttributeValue(null,"name");
                            
                   if (tempAttribName!=null){
                         java.lang.String content = tempAttribName;
                        
                                                 object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("name");
                    
                    // handle attribute "restriction"
                    java.lang.String tempAttribRestriction =
                        
                                reader.getAttributeValue(null,"restriction");
                            
                   if (tempAttribRestriction!=null){
                         java.lang.String content = tempAttribRestriction;
                        
                                                 object.setRestriction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRestriction));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("restriction");
                    
                    // handle attribute "beverage"
                    java.lang.String tempAttribBeverage =
                        
                                reader.getAttributeValue(null,"beverage");
                            
                   if (tempAttribBeverage!=null){
                         java.lang.String content = tempAttribBeverage;
                        
                                                 object.setBeverage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribBeverage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("beverage");
                    
                    // handle attribute "consumption"
                    java.lang.String tempAttribConsumption =
                        
                                reader.getAttributeValue(null,"consumption");
                            
                   if (tempAttribConsumption!=null){
                         java.lang.String content = tempAttribConsumption;
                        
                                                 object.setConsumption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribConsumption));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("consumption");
                    
                    // handle attribute "servingType"
                    java.lang.String tempAttribServingType =
                        
                                reader.getAttributeValue(null,"servingType");
                            
                   if (tempAttribServingType!=null){
                         java.lang.String content = tempAttribServingType;
                        
                                                 object.setServingType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribServingType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("servingType");
                    
                    // handle attribute "className"
                    java.lang.String tempAttribClassName =
                        
                                reader.getAttributeValue(null,"className");
                            
                   if (tempAttribClassName!=null){
                         java.lang.String content = tempAttribClassName;
                        
                                                 object.setClassName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribClassName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("className");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuID").equals(reader.getName())){
                                
                                                object.setMenuID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventMenuID").equals(reader.getName())){
                                
                                                object.setEventMenuID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Description").equals(reader.getName())){
                                
                                                object.setDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Charges").equals(reader.getName())){
                                
                                                object.setCharges(com.cloudkey.pms.micros.og.meetingroom.CateringRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventType").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventType").equals(reader.getName())){
                                                         list5.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEventType((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuDate").equals(reader.getName())){
                                
                                                object.setMenuDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItems").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(com.cloudkey.pms.micros.og.meetingroom.MenuItem.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
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
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItems").equals(reader.getName())){
                                                                    list7.add(com.cloudkey.pms.micros.og.meetingroom.MenuItem.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMenuItems((com.cloudkey.pms.micros.og.meetingroom.MenuItem[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.MenuItem.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","InternalBookedID").equals(reader.getName())){
                                
                                                object.setInternalBookedID(com.cloudkey.pms.micros.og.common.InternalID.Factory.parse(reader));
                                              
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
           
    