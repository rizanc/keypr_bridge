
/**
 * RegionalAvailableProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.availability;
            

            /**
            *  RegionalAvailableProperty bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RegionalAvailableProperty
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RegionalAvailableProperty
                Namespace URI = http://webservices.micros.com/og/4.3/Availability/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReference getHotelReference(){
                               return localHotelReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReference
                               */
                               public void setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference param){
                            
                                            this.localHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for PropertyStatus
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.PropertyStatusCode localPropertyStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.PropertyStatusCode
                           */
                           public  com.cloudkey.pms.micros.og.availability.PropertyStatusCode getPropertyStatus(){
                               return localPropertyStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PropertyStatus
                               */
                               public void setPropertyStatus(com.cloudkey.pms.micros.og.availability.PropertyStatusCode param){
                            
                                            this.localPropertyStatus=param;
                                    

                               }
                            

                        /**
                        * field for MinMaxRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.MinMaxRate_type0 localMinMaxRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinMaxRateTracker = false ;

                           public boolean isMinMaxRateSpecified(){
                               return localMinMaxRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.MinMaxRate_type0
                           */
                           public  com.cloudkey.pms.micros.og.availability.MinMaxRate_type0 getMinMaxRate(){
                               return localMinMaxRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinMaxRate
                               */
                               public void setMinMaxRate(com.cloudkey.pms.micros.og.availability.MinMaxRate_type0 param){
                            localMinMaxRateTracker = param != null;
                                   
                                            this.localMinMaxRate=param;
                                    

                               }
                            

                        /**
                        * field for IsNegotiatedRateAvailable
                        */

                        
                                    protected boolean localIsNegotiatedRateAvailable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsNegotiatedRateAvailableTracker = false ;

                           public boolean isIsNegotiatedRateAvailableSpecified(){
                               return localIsNegotiatedRateAvailableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsNegotiatedRateAvailable(){
                               return localIsNegotiatedRateAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsNegotiatedRateAvailable
                               */
                               public void setIsNegotiatedRateAvailable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localIsNegotiatedRateAvailableTracker =
                                       true;
                                   
                                            this.localIsNegotiatedRateAvailable=param;
                                    

                               }
                            

                        /**
                        * field for NumberToSell
                        */

                        
                                    protected int localNumberToSell ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberToSellTracker = false ;

                           public boolean isNumberToSellSpecified(){
                               return localNumberToSellTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberToSell(){
                               return localNumberToSell;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberToSell
                               */
                               public void setNumberToSell(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberToSellTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberToSell=param;
                                    

                               }
                            

                        /**
                        * field for HotelContact
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelContact localHotelContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelContactTracker = false ;

                           public boolean isHotelContactSpecified(){
                               return localHotelContactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelContact
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelContact getHotelContact(){
                               return localHotelContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelContact
                               */
                               public void setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact param){
                            localHotelContactTracker = param != null;
                                   
                                            this.localHotelContact=param;
                                    

                               }
                            

                        /**
                        * field for HotelExtendedInformation
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo localHotelExtendedInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelExtendedInformationTracker = false ;

                           public boolean isHotelExtendedInformationSpecified(){
                               return localHotelExtendedInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo getHotelExtendedInformation(){
                               return localHotelExtendedInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelExtendedInformation
                               */
                               public void setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo param){
                            localHotelExtendedInformationTracker = param != null;
                                   
                                            this.localHotelExtendedInformation=param;
                                    

                               }
                            

                        /**
                        * field for MinimumRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.MinMaxRateExtended localMinimumRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinimumRateTracker = false ;

                           public boolean isMinimumRateSpecified(){
                               return localMinimumRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.MinMaxRateExtended
                           */
                           public  com.cloudkey.pms.micros.og.availability.MinMaxRateExtended getMinimumRate(){
                               return localMinimumRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinimumRate
                               */
                               public void setMinimumRate(com.cloudkey.pms.micros.og.availability.MinMaxRateExtended param){
                            localMinimumRateTracker = param != null;
                                   
                                            this.localMinimumRate=param;
                                    

                               }
                            

                        /**
                        * field for MaximumRate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.MinMaxRateExtended localMaximumRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaximumRateTracker = false ;

                           public boolean isMaximumRateSpecified(){
                               return localMaximumRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.MinMaxRateExtended
                           */
                           public  com.cloudkey.pms.micros.og.availability.MinMaxRateExtended getMaximumRate(){
                               return localMaximumRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumRate
                               */
                               public void setMaximumRate(com.cloudkey.pms.micros.og.availability.MinMaxRateExtended param){
                            localMaximumRateTracker = param != null;
                                   
                                            this.localMaximumRate=param;
                                    

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
                           namespacePrefix+":RegionalAvailableProperty",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RegionalAvailableProperty",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelReference"),
                                               xmlWriter);
                                        
                                            if (localPropertyStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PropertyStatus cannot be null!!");
                                            }
                                           localPropertyStatus.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","PropertyStatus"),
                                               xmlWriter);
                                         if (localMinMaxRateTracker){
                                            if (localMinMaxRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MinMaxRate cannot be null!!");
                                            }
                                           localMinMaxRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MinMaxRate"),
                                               xmlWriter);
                                        } if (localIsNegotiatedRateAvailableTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "isNegotiatedRateAvailable", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("isNegotiatedRateAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsNegotiatedRateAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumberToSellTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "NumberToSell", xmlWriter);
                             
                                               if (localNumberToSell==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberToSell cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberToSell));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHotelContactTracker){
                                            if (localHotelContact==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                            }
                                           localHotelContact.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelContact"),
                                               xmlWriter);
                                        } if (localHotelExtendedInformationTracker){
                                            if (localHotelExtendedInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                            }
                                           localHotelExtendedInformation.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelExtendedInformation"),
                                               xmlWriter);
                                        } if (localMinimumRateTracker){
                                            if (localMinimumRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MinimumRate cannot be null!!");
                                            }
                                           localMinimumRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MinimumRate"),
                                               xmlWriter);
                                        } if (localMaximumRateTracker){
                                            if (localMaximumRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MaximumRate cannot be null!!");
                                            }
                                           localMaximumRate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MaximumRate"),
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "PropertyStatus"));
                            
                            
                                    if (localPropertyStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("PropertyStatus cannot be null!!");
                                    }
                                    elementList.add(localPropertyStatus);
                                 if (localMinMaxRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "MinMaxRate"));
                            
                            
                                    if (localMinMaxRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("MinMaxRate cannot be null!!");
                                    }
                                    elementList.add(localMinMaxRate);
                                } if (localIsNegotiatedRateAvailableTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "isNegotiatedRateAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsNegotiatedRateAvailable));
                            } if (localNumberToSellTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "NumberToSell"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberToSell));
                            } if (localHotelContactTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "HotelContact"));
                            
                            
                                    if (localHotelContact==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelContact cannot be null!!");
                                    }
                                    elementList.add(localHotelContact);
                                } if (localHotelExtendedInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "HotelExtendedInformation"));
                            
                            
                                    if (localHotelExtendedInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelExtendedInformation cannot be null!!");
                                    }
                                    elementList.add(localHotelExtendedInformation);
                                } if (localMinimumRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "MinimumRate"));
                            
                            
                                    if (localMinimumRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("MinimumRate cannot be null!!");
                                    }
                                    elementList.add(localMinimumRate);
                                } if (localMaximumRateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "MaximumRate"));
                            
                            
                                    if (localMaximumRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("MaximumRate cannot be null!!");
                                    }
                                    elementList.add(localMaximumRate);
                                }

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
        public static RegionalAvailableProperty parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RegionalAvailableProperty object =
                new RegionalAvailableProperty();

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
                    
                            if (!"RegionalAvailableProperty".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegionalAvailableProperty)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","PropertyStatus").equals(reader.getName())){
                                
                                                object.setPropertyStatus(com.cloudkey.pms.micros.og.availability.PropertyStatusCode.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MinMaxRate").equals(reader.getName())){
                                
                                                object.setMinMaxRate(com.cloudkey.pms.micros.og.availability.MinMaxRate_type0.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","isNegotiatedRateAvailable").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"isNegotiatedRateAvailable" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsNegotiatedRateAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","NumberToSell").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberToSell" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberToSell(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberToSell(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelContact").equals(reader.getName())){
                                
                                                object.setHotelContact(com.cloudkey.pms.micros.og.hotelcommon.HotelContact.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","HotelExtendedInformation").equals(reader.getName())){
                                
                                                object.setHotelExtendedInformation(com.cloudkey.pms.micros.og.hotelcommon.ExtendedHotelInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MinimumRate").equals(reader.getName())){
                                
                                                object.setMinimumRate(com.cloudkey.pms.micros.og.availability.MinMaxRateExtended.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","MaximumRate").equals(reader.getName())){
                                
                                                object.setMaximumRate(com.cloudkey.pms.micros.og.availability.MinMaxRateExtended.Factory.parse(reader));
                                              
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
           
    