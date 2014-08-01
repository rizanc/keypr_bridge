
/**
 * RoomStayCandidate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.availability;
            

            /**
            *  RoomStayCandidate bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomStayCandidate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomStayCandidate
                Namespace URI = http://webservices.micros.com/og/4.3/Availability/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for AmenityInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo localAmenityInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmenityInfoTracker = false ;

                           public boolean isAmenityInfoSpecified(){
                               return localAmenityInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo getAmenityInfo(){
                               return localAmenityInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmenityInfo
                               */
                               public void setAmenityInfo(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo param){
                            localAmenityInfoTracker = param != null;
                                   
                                            this.localAmenityInfo=param;
                                    

                               }
                            

                        /**
                        * field for RoomFeatures
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList localRoomFeatures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomFeaturesTracker = false ;

                           public boolean isRoomFeaturesSpecified(){
                               return localRoomFeaturesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList getRoomFeatures(){
                               return localRoomFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomFeatures
                               */
                               public void setRoomFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList param){
                            localRoomFeaturesTracker = param != null;
                                   
                                            this.localRoomFeatures=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomTypeCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeCode(){
                               return localRoomTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeCode
                               */
                               public void setRoomTypeCode(java.lang.String param){
                            
                                            this.localRoomTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for InvBlockCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInvBlockCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInvBlockCode(){
                               return localInvBlockCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InvBlockCode
                               */
                               public void setInvBlockCode(java.lang.String param){
                            
                                            this.localInvBlockCode=param;
                                    

                               }
                            

                        /**
                        * field for RoomClass
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomClass ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomClass(){
                               return localRoomClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomClass
                               */
                               public void setRoomClass(java.lang.String param){
                            
                                            this.localRoomClass=param;
                                    

                               }
                            

                        /**
                        * field for PseudoRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPseudoRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPseudoRoom(){
                               return localPseudoRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PseudoRoom
                               */
                               public void setPseudoRoom(boolean param){
                            
                                            this.localPseudoRoom=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Availability/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RoomStayCandidate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomStayCandidate",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomTypeCode != null){
                                        
                                                writeAttribute("",
                                                         "roomTypeCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localInvBlockCode != null){
                                        
                                                writeAttribute("",
                                                         "invBlockCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvBlockCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomClass != null){
                                        
                                                writeAttribute("",
                                                         "roomClass",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "pseudoRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPseudoRoom), xmlWriter);

                                            
                                      }
                                     if (localAmenityInfoTracker){
                                            if (localAmenityInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                            }
                                           localAmenityInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","AmenityInfo"),
                                               xmlWriter);
                                        } if (localRoomFeaturesTracker){
                                            if (localRoomFeatures==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomFeatures cannot be null!!");
                                            }
                                           localRoomFeatures.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomFeatures"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Availability/")){
                return "ns6";
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

                 if (localAmenityInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "AmenityInfo"));
                            
                            
                                    if (localAmenityInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AmenityInfo cannot be null!!");
                                    }
                                    elementList.add(localAmenityInfo);
                                } if (localRoomFeaturesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomFeatures"));
                            
                            
                                    if (localRoomFeatures==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomFeatures cannot be null!!");
                                    }
                                    elementList.add(localRoomFeatures);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","roomTypeCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","invBlockCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvBlockCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomClass"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pseudoRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPseudoRoom));
                                

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
        public static RoomStayCandidate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomStayCandidate object =
                new RoomStayCandidate();

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
                    
                            if (!"RoomStayCandidate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomStayCandidate)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "roomTypeCode"
                    java.lang.String tempAttribRoomTypeCode =
                        
                                reader.getAttributeValue(null,"roomTypeCode");
                            
                   if (tempAttribRoomTypeCode!=null){
                         java.lang.String content = tempAttribRoomTypeCode;
                        
                                                 object.setRoomTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomTypeCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomTypeCode");
                    
                    // handle attribute "invBlockCode"
                    java.lang.String tempAttribInvBlockCode =
                        
                                reader.getAttributeValue(null,"invBlockCode");
                            
                   if (tempAttribInvBlockCode!=null){
                         java.lang.String content = tempAttribInvBlockCode;
                        
                                                 object.setInvBlockCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInvBlockCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("invBlockCode");
                    
                    // handle attribute "roomClass"
                    java.lang.String tempAttribRoomClass =
                        
                                reader.getAttributeValue(null,"roomClass");
                            
                   if (tempAttribRoomClass!=null){
                         java.lang.String content = tempAttribRoomClass;
                        
                                                 object.setRoomClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomClass));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomClass");
                    
                    // handle attribute "pseudoRoom"
                    java.lang.String tempAttribPseudoRoom =
                        
                                reader.getAttributeValue(null,"pseudoRoom");
                            
                   if (tempAttribPseudoRoom!=null){
                         java.lang.String content = tempAttribPseudoRoom;
                        
                                                 object.setPseudoRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPseudoRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("pseudoRoom");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","AmenityInfo").equals(reader.getName())){
                                
                                                object.setAmenityInfo(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomFeatures").equals(reader.getName())){
                                
                                                object.setRoomFeatures(com.cloudkey.pms.micros.og.hotelcommon.RoomFeatureList.Factory.parse(reader));
                                              
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
           
    