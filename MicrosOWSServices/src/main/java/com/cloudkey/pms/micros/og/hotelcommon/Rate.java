
/**
 * Rate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  Rate bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Rate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Rate
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Base
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localBase ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBaseTracker = false ;

                           public boolean isBaseSpecified(){
                               return localBaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getBase(){
                               return localBase;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Base
                               */
                               public void setBase(com.cloudkey.pms.micros.og.common.Amount param){
                            localBaseTracker = param != null;
                                   
                                            this.localBase=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalGuestAmounts
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount localAdditionalGuestAmounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalGuestAmountsTracker = false ;

                           public boolean isAdditionalGuestAmountsSpecified(){
                               return localAdditionalGuestAmountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount getAdditionalGuestAmounts(){
                               return localAdditionalGuestAmounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalGuestAmounts
                               */
                               public void setAdditionalGuestAmounts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount param){
                            localAdditionalGuestAmountsTracker = param != null;
                                   
                                            this.localAdditionalGuestAmounts=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalBedAmounts
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount localAdditionalBedAmounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalBedAmountsTracker = false ;

                           public boolean isAdditionalBedAmountsSpecified(){
                               return localAdditionalBedAmountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount getAdditionalBedAmounts(){
                               return localAdditionalBedAmounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalBedAmounts
                               */
                               public void setAdditionalBedAmounts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount param){
                            localAdditionalBedAmountsTracker = param != null;
                                   
                                            this.localAdditionalBedAmounts=param;
                                    

                               }
                            

                        /**
                        * field for GdsTotalPricingTaxes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax localGdsTotalPricingTaxes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGdsTotalPricingTaxesTracker = false ;

                           public boolean isGdsTotalPricingTaxesSpecified(){
                               return localGdsTotalPricingTaxesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax getGdsTotalPricingTaxes(){
                               return localGdsTotalPricingTaxes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GdsTotalPricingTaxes
                               */
                               public void setGdsTotalPricingTaxes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax param){
                            localGdsTotalPricingTaxesTracker = param != null;
                                   
                                            this.localGdsTotalPricingTaxes=param;
                                    

                               }
                            

                        /**
                        * field for Points
                        */

                        
                                    protected double localPoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsTracker = false ;

                           public boolean isPointsSpecified(){
                               return localPointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getPoints(){
                               return localPoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Points
                               */
                               public void setPoints(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localPointsTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localPoints=param;
                                    

                               }
                            

                        /**
                        * field for EffectiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEffectiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEffectiveDate(){
                               return localEffectiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveDate
                               */
                               public void setEffectiveDate(java.util.Date param){
                            
                                            this.localEffectiveDate=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpirationDate(){
                               return localExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpirationDate
                               */
                               public void setExpirationDate(java.util.Date param){
                            
                                            this.localExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for RateOccurrence
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType localRateOccurrence ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType getRateOccurrence(){
                               return localRateOccurrence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateOccurrence
                               */
                               public void setRateOccurrence(com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType param){
                            
                                            this.localRateOccurrence=param;
                                    

                               }
                            

                        /**
                        * field for OtherRateOccurrence
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherRateOccurrence ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherRateOccurrence(){
                               return localOtherRateOccurrence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherRateOccurrence
                               */
                               public void setOtherRateOccurrence(java.lang.String param){
                            
                                            this.localOtherRateOccurrence=param;
                                    

                               }
                            

                        /**
                        * field for RateChangeIndicator
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRateChangeIndicator ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRateChangeIndicator(){
                               return localRateChangeIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateChangeIndicator
                               */
                               public void setRateChangeIndicator(boolean param){
                            
                                            this.localRateChangeIndicator=param;
                                    

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
                           namespacePrefix+":Rate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Rate",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localEffectiveDate != null){
                                        
                                                writeAttribute("",
                                                         "effectiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "expirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localRateOccurrence != null){
                                        writeAttribute("",
                                           "rateOccurrence",
                                           localRateOccurrence.toString(), xmlWriter);
                                    }
                                    
                                            if (localOtherRateOccurrence != null){
                                        
                                                writeAttribute("",
                                                         "otherRateOccurrence",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherRateOccurrence), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "rateChangeIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateChangeIndicator), xmlWriter);

                                            
                                      }
                                     if (localBaseTracker){
                                            if (localBase==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Base cannot be null!!");
                                            }
                                           localBase.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Base"),
                                               xmlWriter);
                                        } if (localAdditionalGuestAmountsTracker){
                                            if (localAdditionalGuestAmounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalGuestAmounts cannot be null!!");
                                            }
                                           localAdditionalGuestAmounts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalGuestAmounts"),
                                               xmlWriter);
                                        } if (localAdditionalBedAmountsTracker){
                                            if (localAdditionalBedAmounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalBedAmounts cannot be null!!");
                                            }
                                           localAdditionalBedAmounts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalBedAmounts"),
                                               xmlWriter);
                                        } if (localGdsTotalPricingTaxesTracker){
                                            if (localGdsTotalPricingTaxes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GdsTotalPricingTaxes cannot be null!!");
                                            }
                                           localGdsTotalPricingTaxes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsTotalPricingTaxes"),
                                               xmlWriter);
                                        } if (localPointsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Points", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localPoints)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Points cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoints));
                                               }
                                    
                                   xmlWriter.writeEndElement();
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

                 if (localBaseTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Base"));
                            
                            
                                    if (localBase==null){
                                         throw new org.apache.axis2.databinding.ADBException("Base cannot be null!!");
                                    }
                                    elementList.add(localBase);
                                } if (localAdditionalGuestAmountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AdditionalGuestAmounts"));
                            
                            
                                    if (localAdditionalGuestAmounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalGuestAmounts cannot be null!!");
                                    }
                                    elementList.add(localAdditionalGuestAmounts);
                                } if (localAdditionalBedAmountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AdditionalBedAmounts"));
                            
                            
                                    if (localAdditionalBedAmounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalBedAmounts cannot be null!!");
                                    }
                                    elementList.add(localAdditionalBedAmounts);
                                } if (localGdsTotalPricingTaxesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GdsTotalPricingTaxes"));
                            
                            
                                    if (localGdsTotalPricingTaxes==null){
                                         throw new org.apache.axis2.databinding.ADBException("GdsTotalPricingTaxes cannot be null!!");
                                    }
                                    elementList.add(localGdsTotalPricingTaxes);
                                } if (localPointsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Points"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPoints));
                            }
                            attribList.add(
                            new javax.xml.namespace.QName("","effectiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","expirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateOccurrence"));
                            
                                      attribList.add(localRateOccurrence.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherRateOccurrence"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherRateOccurrence));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateChangeIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateChangeIndicator));
                                

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
        public static Rate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Rate object =
                new Rate();

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
                    
                            if (!"Rate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Rate)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "effectiveDate"
                    java.lang.String tempAttribEffectiveDate =
                        
                                reader.getAttributeValue(null,"effectiveDate");
                            
                   if (tempAttribEffectiveDate!=null){
                         java.lang.String content = tempAttribEffectiveDate;
                        
                                                 object.setEffectiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEffectiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("effectiveDate");
                    
                    // handle attribute "expirationDate"
                    java.lang.String tempAttribExpirationDate =
                        
                                reader.getAttributeValue(null,"expirationDate");
                            
                   if (tempAttribExpirationDate!=null){
                         java.lang.String content = tempAttribExpirationDate;
                        
                                                 object.setExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("expirationDate");
                    
                    // handle attribute "rateOccurrence"
                    java.lang.String tempAttribRateOccurrence =
                        
                                reader.getAttributeValue(null,"rateOccurrence");
                            
                   if (tempAttribRateOccurrence!=null){
                         java.lang.String content = tempAttribRateOccurrence;
                        
                                                  object.setRateOccurrence(
                                                        com.cloudkey.pms.micros.og.hotelcommon.RateOccurrenceType.Factory.fromString(reader,tempAttribRateOccurrence));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateOccurrence");
                    
                    // handle attribute "otherRateOccurrence"
                    java.lang.String tempAttribOtherRateOccurrence =
                        
                                reader.getAttributeValue(null,"otherRateOccurrence");
                            
                   if (tempAttribOtherRateOccurrence!=null){
                         java.lang.String content = tempAttribOtherRateOccurrence;
                        
                                                 object.setOtherRateOccurrence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherRateOccurrence));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherRateOccurrence");
                    
                    // handle attribute "rateChangeIndicator"
                    java.lang.String tempAttribRateChangeIndicator =
                        
                                reader.getAttributeValue(null,"rateChangeIndicator");
                            
                   if (tempAttribRateChangeIndicator!=null){
                         java.lang.String content = tempAttribRateChangeIndicator;
                        
                                                 object.setRateChangeIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRateChangeIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateChangeIndicator");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Base").equals(reader.getName())){
                                
                                                object.setBase(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalGuestAmounts").equals(reader.getName())){
                                
                                                object.setAdditionalGuestAmounts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalGuestAmount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalBedAmounts").equals(reader.getName())){
                                
                                                object.setAdditionalBedAmounts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalBedAmount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsTotalPricingTaxes").equals(reader.getName())){
                                
                                                object.setGdsTotalPricingTaxes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGdsTotalPricingTax.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Points").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Points" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPoints(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPoints(java.lang.Double.NaN);
                                           
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
           
    