
/**
 * RevenueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  RevenueType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RevenueType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RevenueType
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for BaseRate
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Charge[] localBaseRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBaseRateTracker = false ;

                           public boolean isBaseRateSpecified(){
                               return localBaseRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Charge[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Charge[] getBaseRate(){
                               return localBaseRate;
                           }

                           
                        


                               
                              /**
                               * validate the array for BaseRate
                               */
                              protected void validateBaseRate(com.cloudkey.pms.micros.og.hotelcommon.Charge[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BaseRate
                              */
                              public void setBaseRate(com.cloudkey.pms.micros.og.hotelcommon.Charge[] param){
                              
                                   validateBaseRate(param);

                               localBaseRateTracker = param != null;
                                      
                                      this.localBaseRate=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.Charge
                             */
                             public void addBaseRate(com.cloudkey.pms.micros.og.hotelcommon.Charge param){
                                   if (localBaseRate == null){
                                   localBaseRate = new com.cloudkey.pms.micros.og.hotelcommon.Charge[]{};
                                   }

                            
                                 //update the setting tracker
                                localBaseRateTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBaseRate);
                               list.add(param);
                               this.localBaseRate =
                             (com.cloudkey.pms.micros.og.hotelcommon.Charge[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.Charge[list.size()]);

                             }
                             

                        /**
                        * field for TaxesAndFees
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Charge[] localTaxesAndFees ;
                                
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
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Charge[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Charge[] getTaxesAndFees(){
                               return localTaxesAndFees;
                           }

                           
                        


                               
                              /**
                               * validate the array for TaxesAndFees
                               */
                              protected void validateTaxesAndFees(com.cloudkey.pms.micros.og.hotelcommon.Charge[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TaxesAndFees
                              */
                              public void setTaxesAndFees(com.cloudkey.pms.micros.og.hotelcommon.Charge[] param){
                              
                                   validateTaxesAndFees(param);

                               localTaxesAndFeesTracker = param != null;
                                      
                                      this.localTaxesAndFees=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.Charge
                             */
                             public void addTaxesAndFees(com.cloudkey.pms.micros.og.hotelcommon.Charge param){
                                   if (localTaxesAndFees == null){
                                   localTaxesAndFees = new com.cloudkey.pms.micros.og.hotelcommon.Charge[]{};
                                   }

                            
                                 //update the setting tracker
                                localTaxesAndFeesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTaxesAndFees);
                               list.add(param);
                               this.localTaxesAndFees =
                             (com.cloudkey.pms.micros.og.hotelcommon.Charge[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.Charge[list.size()]);

                             }
                             

                        /**
                        * field for TaxInclusive
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTaxInclusive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTaxInclusive(){
                               return localTaxInclusive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxInclusive
                               */
                               public void setTaxInclusive(boolean param){
                            
                                            this.localTaxInclusive=param;
                                    

                               }
                            

                        /**
                        * field for RevenueCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRevenueCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRevenueCode(){
                               return localRevenueCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RevenueCode
                               */
                               public void setRevenueCode(java.lang.String param){
                            
                                            this.localRevenueCode=param;
                                    

                               }
                            

                        /**
                        * field for RevenueName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRevenueName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRevenueName(){
                               return localRevenueName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RevenueName
                               */
                               public void setRevenueName(java.lang.String param){
                            
                                            this.localRevenueName=param;
                                    

                               }
                            

                        /**
                        * field for ContributeToMinimumRevenuew
                        * This was an Attribute!
                        */

                        
                                    protected boolean localContributeToMinimumRevenuew ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getContributeToMinimumRevenuew(){
                               return localContributeToMinimumRevenuew;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContributeToMinimumRevenuew
                               */
                               public void setContributeToMinimumRevenuew(boolean param){
                            
                                            this.localContributeToMinimumRevenuew=param;
                                    

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
                           namespacePrefix+":RevenueType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RevenueType",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "taxInclusive",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localTaxInclusive is null");
                                      }
                                    
                                            if (localRevenueCode != null){
                                        
                                                writeAttribute("",
                                                         "revenueCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevenueCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localRevenueName != null){
                                        
                                                writeAttribute("",
                                                         "revenueName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevenueName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "contributeToMinimumRevenuew",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContributeToMinimumRevenuew), xmlWriter);

                                            
                                      }
                                     if (localBaseRateTracker){
                                       if (localBaseRate!=null){
                                            for (int i = 0;i < localBaseRate.length;i++){
                                                if (localBaseRate[i] != null){
                                                 localBaseRate[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BaseRate"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("BaseRate cannot be null!!");
                                        
                                    }
                                 } if (localTaxesAndFeesTracker){
                                       if (localTaxesAndFees!=null){
                                            for (int i = 0;i < localTaxesAndFees.length;i++){
                                                if (localTaxesAndFees[i] != null){
                                                 localTaxesAndFees[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","TaxesAndFees"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
                return "ns3";
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

                 if (localBaseRateTracker){
                             if (localBaseRate!=null) {
                                 for (int i = 0;i < localBaseRate.length;i++){

                                    if (localBaseRate[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "BaseRate"));
                                         elementList.add(localBaseRate[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("BaseRate cannot be null!!");
                                    
                             }

                        } if (localTaxesAndFeesTracker){
                             if (localTaxesAndFees!=null) {
                                 for (int i = 0;i < localTaxesAndFees.length;i++){

                                    if (localTaxesAndFees[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "TaxesAndFees"));
                                         elementList.add(localTaxesAndFees[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("TaxesAndFees cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","taxInclusive"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","revenueCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevenueCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","revenueName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevenueName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","contributeToMinimumRevenuew"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContributeToMinimumRevenuew));
                                

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
        public static RevenueType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RevenueType object =
                new RevenueType();

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
                    
                            if (!"RevenueType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RevenueType)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "taxInclusive"
                    java.lang.String tempAttribTaxInclusive =
                        
                                reader.getAttributeValue(null,"taxInclusive");
                            
                   if (tempAttribTaxInclusive!=null){
                         java.lang.String content = tempAttribTaxInclusive;
                        
                                                 object.setTaxInclusive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxInclusive));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute taxInclusive is missing");
                           
                    }
                    handledAttributes.add("taxInclusive");
                    
                    // handle attribute "revenueCode"
                    java.lang.String tempAttribRevenueCode =
                        
                                reader.getAttributeValue(null,"revenueCode");
                            
                   if (tempAttribRevenueCode!=null){
                         java.lang.String content = tempAttribRevenueCode;
                        
                                                 object.setRevenueCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRevenueCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("revenueCode");
                    
                    // handle attribute "revenueName"
                    java.lang.String tempAttribRevenueName =
                        
                                reader.getAttributeValue(null,"revenueName");
                            
                   if (tempAttribRevenueName!=null){
                         java.lang.String content = tempAttribRevenueName;
                        
                                                 object.setRevenueName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRevenueName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("revenueName");
                    
                    // handle attribute "contributeToMinimumRevenuew"
                    java.lang.String tempAttribContributeToMinimumRevenuew =
                        
                                reader.getAttributeValue(null,"contributeToMinimumRevenuew");
                            
                   if (tempAttribContributeToMinimumRevenuew!=null){
                         java.lang.String content = tempAttribContributeToMinimumRevenuew;
                        
                                                 object.setContributeToMinimumRevenuew(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribContributeToMinimumRevenuew));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("contributeToMinimumRevenuew");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BaseRate").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Charge.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BaseRate").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Charge.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBaseRate((com.cloudkey.pms.micros.og.hotelcommon.Charge[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.Charge.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","TaxesAndFees").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.cloudkey.pms.micros.og.hotelcommon.Charge.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","TaxesAndFees").equals(reader.getName())){
                                                                    list2.add(com.cloudkey.pms.micros.og.hotelcommon.Charge.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTaxesAndFees((com.cloudkey.pms.micros.og.hotelcommon.Charge[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.Charge.class,
                                                                list2));
                                                            
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
           
    