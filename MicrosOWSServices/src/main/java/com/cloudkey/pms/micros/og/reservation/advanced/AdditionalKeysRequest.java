
/**
 * AdditionalKeysRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  AdditionalKeysRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AdditionalKeysRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/og/4.3/ResvAdvanced/",
                "AdditionalKeysRequest",
                "ns6");

            

                        /**
                        * field for ReservationRequest
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase localReservationRequest ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase getReservationRequest(){
                               return localReservationRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationRequest
                               */
                               public void setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase param){
                            
                                            this.localReservationRequest=param;
                                    

                               }
                            

                        /**
                        * field for StationID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStationID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStationID(){
                               return localStationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StationID
                               */
                               public void setStationID(java.lang.String param){
                            
                                            this.localStationID=param;
                                    

                               }
                            

                        /**
                        * field for UserID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUserID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserID(){
                               return localUserID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserID
                               */
                               public void setUserID(java.lang.String param){
                            
                                            this.localUserID=param;
                                    

                               }
                            

                        /**
                        * field for Keys
                        * This was an Attribute!
                        */

                        
                                    protected int localKeys ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getKeys(){
                               return localKeys;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Keys
                               */
                               public void setKeys(int param){
                            
                                            this.localKeys=param;
                                    

                               }
                            

                        /**
                        * field for KeyEncoder
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKeyEncoder ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyEncoder(){
                               return localKeyEncoder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyEncoder
                               */
                               public void setKeyEncoder(java.lang.String param){
                            
                                            this.localKeyEncoder=param;
                                    

                               }
                            

                        /**
                        * field for GetKeyTrack
                        * This was an Attribute!
                        */

                        
                                    protected boolean localGetKeyTrack ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getGetKeyTrack(){
                               return localGetKeyTrack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetKeyTrack
                               */
                               public void setGetKeyTrack(boolean param){
                            
                                            this.localGetKeyTrack=param;
                                    

                               }
                            

                        /**
                        * field for KeyExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localKeyExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getKeyExpirationDate(){
                               return localKeyExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyExpirationDate
                               */
                               public void setKeyExpirationDate(java.util.Calendar param){
                            
                                            this.localKeyExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for CreateNewKey
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCreateNewKey ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCreateNewKey(){
                               return localCreateNewKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateNewKey
                               */
                               public void setCreateNewKey(boolean param){
                            
                                            this.localCreateNewKey=param;
                                    

                               }
                            

                        /**
                        * field for MobilePhoneAudioKey
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMobilePhoneAudioKey ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMobilePhoneAudioKey(){
                               return localMobilePhoneAudioKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobilePhoneAudioKey
                               */
                               public void setMobilePhoneAudioKey(boolean param){
                            
                                            this.localMobilePhoneAudioKey=param;
                                    

                               }
                            

                        /**
                        * field for UDID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUDID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUDID(){
                               return localUDID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UDID
                               */
                               public void setUDID(java.lang.String param){
                            
                                            this.localUDID=param;
                                    

                               }
                            

                        /**
                        * field for KeyString
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKeyString ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyString(){
                               return localKeyString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyString
                               */
                               public void setKeyString(java.lang.String param){
                            
                                            this.localKeyString=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/ResvAdvanced/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AdditionalKeysRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AdditionalKeysRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localStationID != null){
                                        
                                                writeAttribute("",
                                                         "StationID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStationID), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localStationID is null");
                                      }
                                    
                                            if (localUserID != null){
                                        
                                                writeAttribute("",
                                                         "UserID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserID), xmlWriter);

                                            
                                      }
                                    
                                                   if (localKeys!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "Keys",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeys), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localKeys is null");
                                      }
                                    
                                            if (localKeyEncoder != null){
                                        
                                                writeAttribute("",
                                                         "KeyEncoder",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyEncoder), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "GetKeyTrack",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetKeyTrack), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "KeyExpirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "CreateNewKey",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateNewKey), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "MobilePhoneAudioKey",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneAudioKey), xmlWriter);

                                            
                                      }
                                    
                                            if (localUDID != null){
                                        
                                                writeAttribute("",
                                                         "UDID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUDID), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyString != null){
                                        
                                                writeAttribute("",
                                                         "KeyString",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyString), xmlWriter);

                                            
                                      }
                                    
                                            if (localReservationRequest==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                            }
                                           localReservationRequest.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/ResvAdvanced/")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReservationRequest"));
                            
                            
                                    if (localReservationRequest==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                    }
                                    elementList.add(localReservationRequest);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","StationID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStationID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","UserID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Keys"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeys));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyEncoder"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyEncoder));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","GetKeyTrack"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetKeyTrack));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyExpirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CreateNewKey"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreateNewKey));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MobilePhoneAudioKey"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneAudioKey));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","UDID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUDID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyString"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyString));
                                

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
        public static AdditionalKeysRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AdditionalKeysRequest object =
                new AdditionalKeysRequest();

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
                    
                            if (!"AdditionalKeysRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AdditionalKeysRequest)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "StationID"
                    java.lang.String tempAttribStationID =
                        
                                reader.getAttributeValue(null,"StationID");
                            
                   if (tempAttribStationID!=null){
                         java.lang.String content = tempAttribStationID;
                        
                                                 object.setStationID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStationID));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute StationID is missing");
                           
                    }
                    handledAttributes.add("StationID");
                    
                    // handle attribute "UserID"
                    java.lang.String tempAttribUserID =
                        
                                reader.getAttributeValue(null,"UserID");
                            
                   if (tempAttribUserID!=null){
                         java.lang.String content = tempAttribUserID;
                        
                                                 object.setUserID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUserID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("UserID");
                    
                    // handle attribute "Keys"
                    java.lang.String tempAttribKeys =
                        
                                reader.getAttributeValue(null,"Keys");
                            
                   if (tempAttribKeys!=null){
                         java.lang.String content = tempAttribKeys;
                        
                                                 object.setKeys(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribKeys));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Keys is missing");
                           
                    }
                    handledAttributes.add("Keys");
                    
                    // handle attribute "KeyEncoder"
                    java.lang.String tempAttribKeyEncoder =
                        
                                reader.getAttributeValue(null,"KeyEncoder");
                            
                   if (tempAttribKeyEncoder!=null){
                         java.lang.String content = tempAttribKeyEncoder;
                        
                                                 object.setKeyEncoder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKeyEncoder));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyEncoder");
                    
                    // handle attribute "GetKeyTrack"
                    java.lang.String tempAttribGetKeyTrack =
                        
                                reader.getAttributeValue(null,"GetKeyTrack");
                            
                   if (tempAttribGetKeyTrack!=null){
                         java.lang.String content = tempAttribGetKeyTrack;
                        
                                                 object.setGetKeyTrack(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribGetKeyTrack));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("GetKeyTrack");
                    
                    // handle attribute "KeyExpirationDate"
                    java.lang.String tempAttribKeyExpirationDate =
                        
                                reader.getAttributeValue(null,"KeyExpirationDate");
                            
                   if (tempAttribKeyExpirationDate!=null){
                         java.lang.String content = tempAttribKeyExpirationDate;
                        
                                                 object.setKeyExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribKeyExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyExpirationDate");
                    
                    // handle attribute "CreateNewKey"
                    java.lang.String tempAttribCreateNewKey =
                        
                                reader.getAttributeValue(null,"CreateNewKey");
                            
                   if (tempAttribCreateNewKey!=null){
                         java.lang.String content = tempAttribCreateNewKey;
                        
                                                 object.setCreateNewKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCreateNewKey));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CreateNewKey");
                    
                    // handle attribute "MobilePhoneAudioKey"
                    java.lang.String tempAttribMobilePhoneAudioKey =
                        
                                reader.getAttributeValue(null,"MobilePhoneAudioKey");
                            
                   if (tempAttribMobilePhoneAudioKey!=null){
                         java.lang.String content = tempAttribMobilePhoneAudioKey;
                        
                                                 object.setMobilePhoneAudioKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMobilePhoneAudioKey));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MobilePhoneAudioKey");
                    
                    // handle attribute "UDID"
                    java.lang.String tempAttribUDID =
                        
                                reader.getAttributeValue(null,"UDID");
                            
                   if (tempAttribUDID!=null){
                         java.lang.String content = tempAttribUDID;
                        
                                                 object.setUDID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUDID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("UDID");
                    
                    // handle attribute "KeyString"
                    java.lang.String tempAttribKeyString =
                        
                                reader.getAttributeValue(null,"KeyString");
                            
                   if (tempAttribKeyString!=null){
                         java.lang.String content = tempAttribKeyString;
                        
                                                 object.setKeyString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKeyString));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyString");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest").equals(reader.getName())){
                                
                                                object.setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    