
/**
 * Amenity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  Amenity bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Amenity
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Amenity
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for AmenityDescription
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localAmenityDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmenityDescriptionTracker = false ;

                           public boolean isAmenityDescriptionSpecified(){
                               return localAmenityDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getAmenityDescription(){
                               return localAmenityDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for AmenityDescription
                               */
                              protected void validateAmenityDescription(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AmenityDescription
                              */
                              public void setAmenityDescription(java.lang.String[] param){
                              
                                   validateAmenityDescription(param);

                               localAmenityDescriptionTracker = param != null;
                                      
                                      this.localAmenityDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addAmenityDescription(java.lang.String param){
                                   if (localAmenityDescription == null){
                                   localAmenityDescription = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localAmenityDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAmenityDescription);
                               list.add(param);
                               this.localAmenityDescription =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for AmenityCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localAmenityCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmenityCode(){
                               return localAmenityCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmenityCode
                               */
                               public void setAmenityCode(java.lang.String param){
                            
                                            this.localAmenityCode=param;
                                    

                               }
                            

                        /**
                        * field for AmenityType
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AmenityType_type0 localAmenityType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AmenityType_type0
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AmenityType_type0 getAmenityType(){
                               return localAmenityType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmenityType
                               */
                               public void setAmenityType(com.cloudkey.pms.micros.og.hotelcommon.AmenityType_type0 param){
                            
                                            this.localAmenityType=param;
                                    

                               }
                            

                        /**
                        * field for OtherType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherType(){
                               return localOtherType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherType
                               */
                               public void setOtherType(java.lang.String param){
                            
                                            this.localOtherType=param;
                                    

                               }
                            

                        /**
                        * field for AvailabilityFlag
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AvailabilityFlag_type0 localAvailabilityFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AvailabilityFlag_type0
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AvailabilityFlag_type0 getAvailabilityFlag(){
                               return localAvailabilityFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailabilityFlag
                               */
                               public void setAvailabilityFlag(com.cloudkey.pms.micros.og.hotelcommon.AvailabilityFlag_type0 param){
                            
                                            this.localAvailabilityFlag=param;
                                    

                               }
                            

                        /**
                        * field for OtherFlag
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherFlag(){
                               return localOtherFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherFlag
                               */
                               public void setOtherFlag(java.lang.String param){
                            
                                            this.localOtherFlag=param;
                                    

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
                           namespacePrefix+":Amenity",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Amenity",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localAmenityCode != null){
                                        
                                                writeAttribute("",
                                                         "amenityCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmenityCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAmenityCode is null");
                                      }
                                    
                                    
                                    if (localAmenityType != null){
                                        writeAttribute("",
                                           "amenityType",
                                           localAmenityType.toString(), xmlWriter);
                                    }
                                    
                                            if (localOtherType != null){
                                        
                                                writeAttribute("",
                                                         "otherType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherType), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localAvailabilityFlag != null){
                                        writeAttribute("",
                                           "availabilityFlag",
                                           localAvailabilityFlag.toString(), xmlWriter);
                                    }
                                    
                                            if (localOtherFlag != null){
                                        
                                                writeAttribute("",
                                                         "otherFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherFlag), xmlWriter);

                                            
                                      }
                                     if (localAmenityDescriptionTracker){
                             if (localAmenityDescription!=null) {
                                   namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                   for (int i = 0;i < localAmenityDescription.length;i++){
                                        
                                            if (localAmenityDescription[i] != null){
                                        
                                                writeStartElement(null, namespace, "amenityDescription", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmenityDescription[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("amenityDescription cannot be null!!");
                                    
                             }

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

                 if (localAmenityDescriptionTracker){
                            if (localAmenityDescription!=null){
                                  for (int i = 0;i < localAmenityDescription.length;i++){
                                      
                                         if (localAmenityDescription[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                              "amenityDescription"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmenityDescription[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("amenityDescription cannot be null!!");
                                
                            }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","amenityCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmenityCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","amenityType"));
                            
                                      attribList.add(localAmenityType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","availabilityFlag"));
                            
                                      attribList.add(localAvailabilityFlag.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherFlag));
                                

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
        public static Amenity parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Amenity object =
                new Amenity();

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
                    
                            if (!"Amenity".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Amenity)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "amenityCode"
                    java.lang.String tempAttribAmenityCode =
                        
                                reader.getAttributeValue(null,"amenityCode");
                            
                   if (tempAttribAmenityCode!=null){
                         java.lang.String content = tempAttribAmenityCode;
                        
                                                 object.setAmenityCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAmenityCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute amenityCode is missing");
                           
                    }
                    handledAttributes.add("amenityCode");
                    
                    // handle attribute "amenityType"
                    java.lang.String tempAttribAmenityType =
                        
                                reader.getAttributeValue(null,"amenityType");
                            
                   if (tempAttribAmenityType!=null){
                         java.lang.String content = tempAttribAmenityType;
                        
                                                  object.setAmenityType(
                                                        com.cloudkey.pms.micros.og.hotelcommon.AmenityType_type0.Factory.fromString(reader,tempAttribAmenityType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("amenityType");
                    
                    // handle attribute "otherType"
                    java.lang.String tempAttribOtherType =
                        
                                reader.getAttributeValue(null,"otherType");
                            
                   if (tempAttribOtherType!=null){
                         java.lang.String content = tempAttribOtherType;
                        
                                                 object.setOtherType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherType");
                    
                    // handle attribute "availabilityFlag"
                    java.lang.String tempAttribAvailabilityFlag =
                        
                                reader.getAttributeValue(null,"availabilityFlag");
                            
                   if (tempAttribAvailabilityFlag!=null){
                         java.lang.String content = tempAttribAvailabilityFlag;
                        
                                                  object.setAvailabilityFlag(
                                                        com.cloudkey.pms.micros.og.hotelcommon.AvailabilityFlag_type0.Factory.fromString(reader,tempAttribAvailabilityFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("availabilityFlag");
                    
                    // handle attribute "otherFlag"
                    java.lang.String tempAttribOtherFlag =
                        
                                reader.getAttributeValue(null,"otherFlag");
                            
                   if (tempAttribOtherFlag!=null){
                         java.lang.String content = tempAttribOtherFlag;
                        
                                                 object.setOtherFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherFlag");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","amenityDescription").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
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
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","amenityDescription").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setAmenityDescription((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
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
           
    