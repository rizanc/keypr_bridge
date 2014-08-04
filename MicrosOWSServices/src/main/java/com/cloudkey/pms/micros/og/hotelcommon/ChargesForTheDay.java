
/**
 * ChargesForTheDay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  ChargesForTheDay bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ChargesForTheDay
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ChargesForTheDay
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for RoomRateAndPackages
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ChargeList localRoomRateAndPackages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomRateAndPackagesTracker = false ;

                           public boolean isRoomRateAndPackagesSpecified(){
                               return localRoomRateAndPackagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ChargeList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ChargeList getRoomRateAndPackages(){
                               return localRoomRateAndPackages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomRateAndPackages
                               */
                               public void setRoomRateAndPackages(com.cloudkey.pms.micros.og.hotelcommon.ChargeList param){
                            localRoomRateAndPackagesTracker = param != null;
                                   
                                            this.localRoomRateAndPackages=param;
                                    

                               }
                            

                        /**
                        * field for TaxesAndFees
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ChargeList localTaxesAndFees ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxesAndFeesTracker = false ;

                           public boolean isTaxesAndFeesSpecified(){
                               return localTaxesAndFeesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ChargeList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ChargeList getTaxesAndFees(){
                               return localTaxesAndFees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxesAndFees
                               */
                               public void setTaxesAndFees(com.cloudkey.pms.micros.og.hotelcommon.ChargeList param){
                            localTaxesAndFeesTracker = param != null;
                                   
                                            this.localTaxesAndFees=param;
                                    

                               }
                            

                        /**
                        * field for FixedCharges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList localFixedCharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFixedChargesTracker = false ;

                           public boolean isFixedChargesSpecified(){
                               return localFixedChargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList getFixedCharges(){
                               return localFixedCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FixedCharges
                               */
                               public void setFixedCharges(com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList param){
                            localFixedChargesTracker = param != null;
                                   
                                            this.localFixedCharges=param;
                                    

                               }
                            

                        /**
                        * field for PostingDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localPostingDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPostingDate(){
                               return localPostingDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostingDate
                               */
                               public void setPostingDate(java.util.Date param){
                            
                                            this.localPostingDate=param;
                                    

                               }
                            

                        /**
                        * field for TotalCharges
                        * This was an Attribute!
                        */

                        
                                    protected double localTotalCharges ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTotalCharges(){
                               return localTotalCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalCharges
                               */
                               public void setTotalCharges(double param){
                            
                                            this.localTotalCharges=param;
                                    

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
                           namespacePrefix+":ChargesForTheDay",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ChargesForTheDay",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPostingDate != null){
                                        
                                                writeAttribute("",
                                                         "PostingDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localTotalCharges)) {
                                               
                                                writeAttribute("",
                                                         "TotalCharges",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCharges), xmlWriter);

                                            
                                      }
                                     if (localRoomRateAndPackagesTracker){
                                            if (localRoomRateAndPackages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomRateAndPackages cannot be null!!");
                                            }
                                           localRoomRateAndPackages.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomRateAndPackages"),
                                               xmlWriter);
                                        } if (localTaxesAndFeesTracker){
                                            if (localTaxesAndFees==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                            }
                                           localTaxesAndFees.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxesAndFees"),
                                               xmlWriter);
                                        } if (localFixedChargesTracker){
                                            if (localFixedCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FixedCharges cannot be null!!");
                                            }
                                           localFixedCharges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FixedCharges"),
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

                 if (localRoomRateAndPackagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomRateAndPackages"));
                            
                            
                                    if (localRoomRateAndPackages==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomRateAndPackages cannot be null!!");
                                    }
                                    elementList.add(localRoomRateAndPackages);
                                } if (localTaxesAndFeesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxesAndFees"));
                            
                            
                                    if (localTaxesAndFees==null){
                                         throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                    }
                                    elementList.add(localTaxesAndFees);
                                } if (localFixedChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "FixedCharges"));
                            
                            
                                    if (localFixedCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("FixedCharges cannot be null!!");
                                    }
                                    elementList.add(localFixedCharges);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","PostingDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TotalCharges"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCharges));
                                

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
        public static ChargesForTheDay parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ChargesForTheDay object =
                new ChargesForTheDay();

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
                    
                            if (!"ChargesForTheDay".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ChargesForTheDay)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "PostingDate"
                    java.lang.String tempAttribPostingDate =
                        
                                reader.getAttributeValue(null,"PostingDate");
                            
                   if (tempAttribPostingDate!=null){
                         java.lang.String content = tempAttribPostingDate;
                        
                                                 object.setPostingDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribPostingDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PostingDate");
                    
                    // handle attribute "TotalCharges"
                    java.lang.String tempAttribTotalCharges =
                        
                                reader.getAttributeValue(null,"TotalCharges");
                            
                   if (tempAttribTotalCharges!=null){
                         java.lang.String content = tempAttribTotalCharges;
                        
                                                 object.setTotalCharges(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribTotalCharges));
                                            
                    } else {
                       
                                           object.setTotalCharges(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("TotalCharges");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomRateAndPackages").equals(reader.getName())){
                                
                                                object.setRoomRateAndPackages(com.cloudkey.pms.micros.og.hotelcommon.ChargeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxesAndFees").equals(reader.getName())){
                                
                                                object.setTaxesAndFees(com.cloudkey.pms.micros.og.hotelcommon.ChargeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FixedCharges").equals(reader.getName())){
                                
                                                object.setFixedCharges(com.cloudkey.pms.micros.og.hotelcommon.FixedChargeList.Factory.parse(reader));
                                              
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
           
    