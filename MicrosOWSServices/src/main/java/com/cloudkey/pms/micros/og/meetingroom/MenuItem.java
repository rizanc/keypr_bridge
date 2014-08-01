
/**
 * MenuItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  MenuItem bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MenuItem
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MenuItem
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for MenuItemID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localMenuItemID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getMenuItemID(){
                               return localMenuItemID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MenuItemID
                               */
                               public void setMenuItemID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            
                                            this.localMenuItemID=param;
                                    

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
                        * field for Name1
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localName1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName1(){
                               return localName1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name1
                               */
                               public void setName1(java.lang.String param){
                            
                                            this.localName1=param;
                                    

                               }
                            

                        /**
                        * field for Name2
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localName2 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName2(){
                               return localName2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name2
                               */
                               public void setName2(java.lang.String param){
                            
                                            this.localName2=param;
                                    

                               }
                            

                        /**
                        * field for Name3
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localName3 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName3(){
                               return localName3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name3
                               */
                               public void setName3(java.lang.String param){
                            
                                            this.localName3=param;
                                    

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
                        * field for PriceIncluded
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPriceIncluded ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPriceIncluded(){
                               return localPriceIncluded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PriceIncluded
                               */
                               public void setPriceIncluded(boolean param){
                            
                                            this.localPriceIncluded=param;
                                    

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
                           namespacePrefix+":MenuItem",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MenuItem",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localName1 != null){
                                        
                                                writeAttribute("",
                                                         "name1",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName1), xmlWriter);

                                            
                                      }
                                    
                                            if (localName2 != null){
                                        
                                                writeAttribute("",
                                                         "name2",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName2), xmlWriter);

                                            
                                      }
                                    
                                            if (localName3 != null){
                                        
                                                writeAttribute("",
                                                         "name3",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName3), xmlWriter);

                                            
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
                                                         "priceIncluded",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriceIncluded), xmlWriter);

                                            
                                      }
                                    
                                            if (localMenuItemID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MenuItemID cannot be null!!");
                                            }
                                           localMenuItemID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItemID"),
                                               xmlWriter);
                                         if (localDescriptionTracker){
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
                                                                      "MenuItemID"));
                            
                            
                                    if (localMenuItemID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MenuItemID cannot be null!!");
                                    }
                                    elementList.add(localMenuItemID);
                                 if (localDescriptionTracker){
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

                        } if (localInternalBookedIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "InternalBookedID"));
                            
                            
                                    if (localInternalBookedID==null){
                                         throw new org.apache.axis2.databinding.ADBException("InternalBookedID cannot be null!!");
                                    }
                                    elementList.add(localInternalBookedID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","name1"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName1));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","name2"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName2));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","name3"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName3));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","restriction"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestriction));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","beverage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeverage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","priceIncluded"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriceIncluded));
                                

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
        public static MenuItem parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MenuItem object =
                new MenuItem();

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
                    
                            if (!"MenuItem".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MenuItem)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "name1"
                    java.lang.String tempAttribName1 =
                        
                                reader.getAttributeValue(null,"name1");
                            
                   if (tempAttribName1!=null){
                         java.lang.String content = tempAttribName1;
                        
                                                 object.setName1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName1));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("name1");
                    
                    // handle attribute "name2"
                    java.lang.String tempAttribName2 =
                        
                                reader.getAttributeValue(null,"name2");
                            
                   if (tempAttribName2!=null){
                         java.lang.String content = tempAttribName2;
                        
                                                 object.setName2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName2));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("name2");
                    
                    // handle attribute "name3"
                    java.lang.String tempAttribName3 =
                        
                                reader.getAttributeValue(null,"name3");
                            
                   if (tempAttribName3!=null){
                         java.lang.String content = tempAttribName3;
                        
                                                 object.setName3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribName3));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("name3");
                    
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
                    
                    // handle attribute "priceIncluded"
                    java.lang.String tempAttribPriceIncluded =
                        
                                reader.getAttributeValue(null,"priceIncluded");
                            
                   if (tempAttribPriceIncluded!=null){
                         java.lang.String content = tempAttribPriceIncluded;
                        
                                                 object.setPriceIncluded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPriceIncluded));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("priceIncluded");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItemID").equals(reader.getName())){
                                
                                                object.setMenuItemID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
                                    list4.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
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
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventType").equals(reader.getName())){
                                                         list4.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEventType((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
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
           
    