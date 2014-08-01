
/**
 * MenuItems_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  MenuItems_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MenuItems_type0 extends com.cloudkey.pms.micros.og.meetingroom.MenuItem
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MenuItems_type0
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for MenuID
                        * This was an Attribute!
                        */

                        
                                    protected int localMenuID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMenuID(){
                               return localMenuID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MenuID
                               */
                               public void setMenuID(int param){
                            
                                            this.localMenuID=param;
                                    

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
                        * field for BookedMenuID
                        * This was an Attribute!
                        */

                        
                                    protected int localBookedMenuID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBookedMenuID(){
                               return localBookedMenuID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BookedMenuID
                               */
                               public void setBookedMenuID(int param){
                            
                                            this.localBookedMenuID=param;
                                    

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
                           namespacePrefix+":MenuItems_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MenuItems_type0",
                           xmlWriter);
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
                                    
                                                   if (localMenuID!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "menuID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMenuID), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMenuID is null");
                                      }
                                    
                                                   if (localQuantity!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "quantity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localQuantity is null");
                                      }
                                    
                                                   if (localBookedMenuID!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "bookedMenuID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookedMenuID), xmlWriter);

                                            
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItems_type0"));
                
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
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","menuID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMenuID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quantity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","bookedMenuID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookedMenuID));
                                

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
        public static MenuItems_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MenuItems_type0 object =
                new MenuItems_type0();

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
                    
                            if (!"MenuItems_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MenuItems_type0)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "menuID"
                    java.lang.String tempAttribMenuID =
                        
                                reader.getAttributeValue(null,"menuID");
                            
                   if (tempAttribMenuID!=null){
                         java.lang.String content = tempAttribMenuID;
                        
                                                 object.setMenuID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMenuID));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute menuID is missing");
                           
                    }
                    handledAttributes.add("menuID");
                    
                    // handle attribute "quantity"
                    java.lang.String tempAttribQuantity =
                        
                                reader.getAttributeValue(null,"quantity");
                            
                   if (tempAttribQuantity!=null){
                         java.lang.String content = tempAttribQuantity;
                        
                                                 object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribQuantity));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute quantity is missing");
                           
                    }
                    handledAttributes.add("quantity");
                    
                    // handle attribute "bookedMenuID"
                    java.lang.String tempAttribBookedMenuID =
                        
                                reader.getAttributeValue(null,"bookedMenuID");
                            
                   if (tempAttribBookedMenuID!=null){
                         java.lang.String content = tempAttribBookedMenuID;
                        
                                                 object.setBookedMenuID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribBookedMenuID));
                                            
                    } else {
                       
                                           object.setBookedMenuID(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("bookedMenuID");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MenuItemID").equals(reader.getName())){
                                
                                                object.setMenuItemID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Description").equals(reader.getName())){
                                
                                                object.setDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Charges").equals(reader.getName())){
                                
                                                object.setCharges(com.cloudkey.pms.micros.og.meetingroom.CateringRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
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
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","InternalBookedID").equals(reader.getName())){
                                
                                                object.setInternalBookedID(com.cloudkey.pms.micros.og.common.InternalID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
    