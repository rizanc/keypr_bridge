
/**
 * FunctionSpace_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  FunctionSpace_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FunctionSpace_type0 extends com.cloudkey.pms.micros.og.meetingroom.FunctionSpace
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FunctionSpace_type0
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for AvaliablityString
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAvaliablityString ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAvaliablityString(){
                               return localAvaliablityString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvaliablityString
                               */
                               public void setAvaliablityString(java.lang.String param){
                            
                                            this.localAvaliablityString=param;
                                    

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
                           namespacePrefix+":FunctionSpace_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FunctionSpace_type0",
                           xmlWriter);
                   }

               
                                            if (localLocationType != null){
                                        
                                                writeAttribute("",
                                                         "locationType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationType), xmlWriter);

                                            
                                      }
                                    
                                            if (localLocationDescription != null){
                                        
                                                writeAttribute("",
                                                         "locationDescription",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationDescription), xmlWriter);

                                            
                                      }
                                    
                                            if (localSpaceType != null){
                                        
                                                writeAttribute("",
                                                         "spaceType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceType), xmlWriter);

                                            
                                      }
                                    
                                            if (localSpaceDescription != null){
                                        
                                                writeAttribute("",
                                                         "spaceDescription",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceDescription), xmlWriter);

                                            
                                      }
                                    
                                            if (localFloor != null){
                                        
                                                writeAttribute("",
                                                         "floor",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloor), xmlWriter);

                                            
                                      }
                                    
                                            if (localFloorDescription != null){
                                        
                                                writeAttribute("",
                                                         "floorDescription",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloorDescription), xmlWriter);

                                            
                                      }
                                    
                                            if (localShortDescription != null){
                                        
                                                writeAttribute("",
                                                         "shortDescription",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortDescription), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "handicapFacility",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHandicapFacility), xmlWriter);

                                            
                                      }
                                    
                                            if (localAvaliablityString != null){
                                        
                                                writeAttribute("",
                                                         "avaliablityString",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvaliablityString), xmlWriter);

                                            
                                      }
                                    
                                    namespace = "http://webservices.micros.com/og/4.3/MeetingRoom/";
                                    writeStartElement(null, namespace, "Room", xmlWriter);
                             

                                          if (localRoom==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Room cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoom);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localRoomDescriptionTracker){
                                            if (localRoomDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                            }
                                           localRoomDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomDescription"),
                                               xmlWriter);
                                        } if (localRateRangeTracker){
                                            if (localRateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                            }
                                           localRateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange"),
                                               xmlWriter);
                                        } if (localRateDetailsTracker){
                                       if (localRateDetails!=null){
                                            for (int i = 0;i < localRateDetails.length;i++){
                                                if (localRateDetails[i] != null){
                                                 localRateDetails[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateDetails"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("RateDetails cannot be null!!");
                                        
                                    }
                                 } if (localSetupStylesTracker){
                                       if (localSetupStyles!=null){
                                            for (int i = 0;i < localSetupStyles.length;i++){
                                                if (localSetupStyles[i] != null){
                                                 localSetupStyles[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyles"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("SetupStyles cannot be null!!");
                                        
                                    }
                                 } if (localWebBookableTracker){
                                            if (localWebBookable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("WebBookable cannot be null!!");
                                            }
                                           localWebBookable.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","WebBookable"),
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
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","FunctionSpace_type0"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "Room"));
                                 
                                        if (localRoom != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoom));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Room cannot be null!!");
                                        }
                                     if (localRoomDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RoomDescription"));
                            
                            
                                    if (localRoomDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomDescription);
                                } if (localRateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RateRange"));
                            
                            
                                    if (localRateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                    }
                                    elementList.add(localRateRange);
                                } if (localRateDetailsTracker){
                             if (localRateDetails!=null) {
                                 for (int i = 0;i < localRateDetails.length;i++){

                                    if (localRateDetails[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "RateDetails"));
                                         elementList.add(localRateDetails[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("RateDetails cannot be null!!");
                                    
                             }

                        } if (localSetupStylesTracker){
                             if (localSetupStyles!=null) {
                                 for (int i = 0;i < localSetupStyles.length;i++){

                                    if (localSetupStyles[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "SetupStyles"));
                                         elementList.add(localSetupStyles[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("SetupStyles cannot be null!!");
                                    
                             }

                        } if (localWebBookableTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "WebBookable"));
                            
                            
                                    if (localWebBookable==null){
                                         throw new org.apache.axis2.databinding.ADBException("WebBookable cannot be null!!");
                                    }
                                    elementList.add(localWebBookable);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","locationType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","locationDescription"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocationDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","spaceType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","spaceDescription"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpaceDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","floor"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloor));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","floorDescription"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloorDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","shortDescription"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","handicapFacility"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHandicapFacility));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","avaliablityString"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvaliablityString));
                                

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
        public static FunctionSpace_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FunctionSpace_type0 object =
                new FunctionSpace_type0();

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
                    
                            if (!"FunctionSpace_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FunctionSpace_type0)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "locationType"
                    java.lang.String tempAttribLocationType =
                        
                                reader.getAttributeValue(null,"locationType");
                            
                   if (tempAttribLocationType!=null){
                         java.lang.String content = tempAttribLocationType;
                        
                                                 object.setLocationType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLocationType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("locationType");
                    
                    // handle attribute "locationDescription"
                    java.lang.String tempAttribLocationDescription =
                        
                                reader.getAttributeValue(null,"locationDescription");
                            
                   if (tempAttribLocationDescription!=null){
                         java.lang.String content = tempAttribLocationDescription;
                        
                                                 object.setLocationDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLocationDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("locationDescription");
                    
                    // handle attribute "spaceType"
                    java.lang.String tempAttribSpaceType =
                        
                                reader.getAttributeValue(null,"spaceType");
                            
                   if (tempAttribSpaceType!=null){
                         java.lang.String content = tempAttribSpaceType;
                        
                                                 object.setSpaceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSpaceType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("spaceType");
                    
                    // handle attribute "spaceDescription"
                    java.lang.String tempAttribSpaceDescription =
                        
                                reader.getAttributeValue(null,"spaceDescription");
                            
                   if (tempAttribSpaceDescription!=null){
                         java.lang.String content = tempAttribSpaceDescription;
                        
                                                 object.setSpaceDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSpaceDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("spaceDescription");
                    
                    // handle attribute "floor"
                    java.lang.String tempAttribFloor =
                        
                                reader.getAttributeValue(null,"floor");
                            
                   if (tempAttribFloor!=null){
                         java.lang.String content = tempAttribFloor;
                        
                                                 object.setFloor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFloor));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("floor");
                    
                    // handle attribute "floorDescription"
                    java.lang.String tempAttribFloorDescription =
                        
                                reader.getAttributeValue(null,"floorDescription");
                            
                   if (tempAttribFloorDescription!=null){
                         java.lang.String content = tempAttribFloorDescription;
                        
                                                 object.setFloorDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFloorDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("floorDescription");
                    
                    // handle attribute "shortDescription"
                    java.lang.String tempAttribShortDescription =
                        
                                reader.getAttributeValue(null,"shortDescription");
                            
                   if (tempAttribShortDescription!=null){
                         java.lang.String content = tempAttribShortDescription;
                        
                                                 object.setShortDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribShortDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("shortDescription");
                    
                    // handle attribute "handicapFacility"
                    java.lang.String tempAttribHandicapFacility =
                        
                                reader.getAttributeValue(null,"handicapFacility");
                            
                   if (tempAttribHandicapFacility!=null){
                         java.lang.String content = tempAttribHandicapFacility;
                        
                                                 object.setHandicapFacility(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribHandicapFacility));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("handicapFacility");
                    
                    // handle attribute "avaliablityString"
                    java.lang.String tempAttribAvaliablityString =
                        
                                reader.getAttributeValue(null,"avaliablityString");
                            
                   if (tempAttribAvaliablityString!=null){
                         java.lang.String content = tempAttribAvaliablityString;
                        
                                                 object.setAvaliablityString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAvaliablityString));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("avaliablityString");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","Room").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Room" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RoomDescription").equals(reader.getName())){
                                
                                                object.setRoomDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange").equals(reader.getName())){
                                
                                                object.setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateDetails").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.cloudkey.pms.micros.og.meetingroom.CateringRateCode.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
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
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateDetails").equals(reader.getName())){
                                                                    list4.add(com.cloudkey.pms.micros.og.meetingroom.CateringRateCode.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRateDetails((com.cloudkey.pms.micros.og.meetingroom.CateringRateCode[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.CateringRateCode.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyles").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(com.cloudkey.pms.micros.og.meetingroom.SetupStyle.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyles").equals(reader.getName())){
                                                                    list5.add(com.cloudkey.pms.micros.og.meetingroom.SetupStyle.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSetupStyles((com.cloudkey.pms.micros.og.meetingroom.SetupStyle[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.SetupStyle.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","WebBookable").equals(reader.getName())){
                                
                                                object.setWebBookable(com.cloudkey.pms.micros.og.meetingroom.WebBookableType.Factory.parse(reader));
                                              
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
           
    