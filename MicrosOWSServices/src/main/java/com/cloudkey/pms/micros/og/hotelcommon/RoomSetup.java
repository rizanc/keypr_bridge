
/**
 * RoomSetup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RoomSetup bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomSetup
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomSetup
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for RoomDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomDescriptionTracker = false ;

                           public boolean isRoomDescriptionSpecified(){
                               return localRoomDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomDescription(){
                               return localRoomDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomDescription
                               */
                               public void setRoomDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomDescriptionTracker = param != null;
                                   
                                            this.localRoomDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomShortDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localRoomShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomShortDescriptionTracker = false ;

                           public boolean isRoomShortDescriptionSpecified(){
                               return localRoomShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getRoomShortDescription(){
                               return localRoomShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomShortDescription
                               */
                               public void setRoomShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localRoomShortDescriptionTracker = param != null;
                                   
                                            this.localRoomShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomType(){
                               return localRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomType
                               */
                               public void setRoomType(java.lang.String param){
                            
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for RoomNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomNumber(){
                               return localRoomNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomNumber
                               */
                               public void setRoomNumber(java.lang.String param){
                            
                                            this.localRoomNumber=param;
                                    

                               }
                            

                        /**
                        * field for SuiteType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSuiteType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSuiteType(){
                               return localSuiteType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SuiteType
                               */
                               public void setSuiteType(java.lang.String param){
                            
                                            this.localSuiteType=param;
                                    

                               }
                            

                        /**
                        * field for PhoneNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPhoneNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhoneNumber(){
                               return localPhoneNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhoneNumber
                               */
                               public void setPhoneNumber(java.lang.String param){
                            
                                            this.localPhoneNumber=param;
                                    

                               }
                            

                        /**
                        * field for MaximumOccupancy
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.UnsignedInt localMaximumOccupancy ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.UnsignedInt
                           */
                           public  org.apache.axis2.databinding.types.UnsignedInt getMaximumOccupancy(){
                               return localMaximumOccupancy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumOccupancy
                               */
                               public void setMaximumOccupancy(org.apache.axis2.databinding.types.UnsignedInt param){
                            
                                            this.localMaximumOccupancy=param;
                                    

                               }
                            

                        /**
                        * field for HouseKeepingSectionCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHouseKeepingSectionCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHouseKeepingSectionCode(){
                               return localHouseKeepingSectionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseKeepingSectionCode
                               */
                               public void setHouseKeepingSectionCode(java.lang.String param){
                            
                                            this.localHouseKeepingSectionCode=param;
                                    

                               }
                            

                        /**
                        * field for RateCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRateCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCode(){
                               return localRateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCode
                               */
                               public void setRateCode(java.lang.String param){
                            
                                            this.localRateCode=param;
                                    

                               }
                            

                        /**
                        * field for RackRate
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigDecimal localRackRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigDecimal
                           */
                           public  java.math.BigDecimal getRackRate(){
                               return localRackRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RackRate
                               */
                               public void setRackRate(java.math.BigDecimal param){
                            
                                            this.localRackRate=param;
                                    

                               }
                            

                        /**
                        * field for SmokingPreference
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSmokingPreference ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSmokingPreference(){
                               return localSmokingPreference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmokingPreference
                               */
                               public void setSmokingPreference(java.lang.String param){
                            
                                            this.localSmokingPreference=param;
                                    

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
                           namespacePrefix+":RoomSetup",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomSetup",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomType != null){
                                        
                                                writeAttribute("",
                                                         "RoomType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomNumber != null){
                                        
                                                writeAttribute("",
                                                         "RoomNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localSuiteType != null){
                                        
                                                writeAttribute("",
                                                         "SuiteType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuiteType), xmlWriter);

                                            
                                      }
                                    
                                            if (localPhoneNumber != null){
                                        
                                                writeAttribute("",
                                                         "PhoneNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localMaximumOccupancy != null){
                                        
                                                writeAttribute("",
                                                         "MaximumOccupancy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumOccupancy), xmlWriter);

                                            
                                      }
                                    
                                            if (localHouseKeepingSectionCode != null){
                                        
                                                writeAttribute("",
                                                         "HouseKeepingSectionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingSectionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRateCode != null){
                                        
                                                writeAttribute("",
                                                         "RateCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRackRate != null){
                                        
                                                writeAttribute("",
                                                         "RackRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRackRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localSmokingPreference != null){
                                        
                                                writeAttribute("",
                                                         "SmokingPreference",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference), xmlWriter);

                                            
                                      }
                                     if (localRoomDescriptionTracker){
                                            if (localRoomDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                            }
                                           localRoomDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomDescription"),
                                               xmlWriter);
                                        } if (localRoomShortDescriptionTracker){
                                            if (localRoomShortDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomShortDescription cannot be null!!");
                                            }
                                           localRoomShortDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomShortDescription"),
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

                 if (localRoomDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomDescription"));
                            
                            
                                    if (localRoomDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomDescription);
                                } if (localRoomShortDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomShortDescription"));
                            
                            
                                    if (localRoomShortDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomShortDescription cannot be null!!");
                                    }
                                    elementList.add(localRoomShortDescription);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SuiteType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuiteType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PhoneNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhoneNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MaximumOccupancy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumOccupancy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HouseKeepingSectionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingSectionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RateCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RackRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRackRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SmokingPreference"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmokingPreference));
                                

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
        public static RoomSetup parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomSetup object =
                new RoomSetup();

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
                    
                            if (!"RoomSetup".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomSetup)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "RoomType"
                    java.lang.String tempAttribRoomType =
                        
                                reader.getAttributeValue(null,"RoomType");
                            
                   if (tempAttribRoomType!=null){
                         java.lang.String content = tempAttribRoomType;
                        
                                                 object.setRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomType");
                    
                    // handle attribute "RoomNumber"
                    java.lang.String tempAttribRoomNumber =
                        
                                reader.getAttributeValue(null,"RoomNumber");
                            
                   if (tempAttribRoomNumber!=null){
                         java.lang.String content = tempAttribRoomNumber;
                        
                                                 object.setRoomNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomNumber");
                    
                    // handle attribute "SuiteType"
                    java.lang.String tempAttribSuiteType =
                        
                                reader.getAttributeValue(null,"SuiteType");
                            
                   if (tempAttribSuiteType!=null){
                         java.lang.String content = tempAttribSuiteType;
                        
                                                 object.setSuiteType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSuiteType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SuiteType");
                    
                    // handle attribute "PhoneNumber"
                    java.lang.String tempAttribPhoneNumber =
                        
                                reader.getAttributeValue(null,"PhoneNumber");
                            
                   if (tempAttribPhoneNumber!=null){
                         java.lang.String content = tempAttribPhoneNumber;
                        
                                                 object.setPhoneNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPhoneNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PhoneNumber");
                    
                    // handle attribute "MaximumOccupancy"
                    java.lang.String tempAttribMaximumOccupancy =
                        
                                reader.getAttributeValue(null,"MaximumOccupancy");
                            
                   if (tempAttribMaximumOccupancy!=null){
                         java.lang.String content = tempAttribMaximumOccupancy;
                        
                                                 object.setMaximumOccupancy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(tempAttribMaximumOccupancy));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MaximumOccupancy");
                    
                    // handle attribute "HouseKeepingSectionCode"
                    java.lang.String tempAttribHouseKeepingSectionCode =
                        
                                reader.getAttributeValue(null,"HouseKeepingSectionCode");
                            
                   if (tempAttribHouseKeepingSectionCode!=null){
                         java.lang.String content = tempAttribHouseKeepingSectionCode;
                        
                                                 object.setHouseKeepingSectionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHouseKeepingSectionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HouseKeepingSectionCode");
                    
                    // handle attribute "RateCode"
                    java.lang.String tempAttribRateCode =
                        
                                reader.getAttributeValue(null,"RateCode");
                            
                   if (tempAttribRateCode!=null){
                         java.lang.String content = tempAttribRateCode;
                        
                                                 object.setRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RateCode");
                    
                    // handle attribute "RackRate"
                    java.lang.String tempAttribRackRate =
                        
                                reader.getAttributeValue(null,"RackRate");
                            
                   if (tempAttribRackRate!=null){
                         java.lang.String content = tempAttribRackRate;
                        
                                                 object.setRackRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(tempAttribRackRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RackRate");
                    
                    // handle attribute "SmokingPreference"
                    java.lang.String tempAttribSmokingPreference =
                        
                                reader.getAttributeValue(null,"SmokingPreference");
                            
                   if (tempAttribSmokingPreference!=null){
                         java.lang.String content = tempAttribSmokingPreference;
                        
                                                 object.setSmokingPreference(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSmokingPreference));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SmokingPreference");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomDescription").equals(reader.getName())){
                                
                                                object.setRoomDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomShortDescription").equals(reader.getName())){
                                
                                                object.setRoomShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
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
           
    