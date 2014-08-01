
/**
 * GdsTotalPricingTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  GdsTotalPricingTax bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GdsTotalPricingTax
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GdsTotalPricingTax
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for EffectiveStartDate
                        */

                        
                                    protected java.util.Date localEffectiveStartDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEffectiveStartDateTracker = false ;

                           public boolean isEffectiveStartDateSpecified(){
                               return localEffectiveStartDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEffectiveStartDate(){
                               return localEffectiveStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveStartDate
                               */
                               public void setEffectiveStartDate(java.util.Date param){
                            localEffectiveStartDateTracker = param != null;
                                   
                                            this.localEffectiveStartDate=param;
                                    

                               }
                            

                        /**
                        * field for EffectiveEndDate
                        */

                        
                                    protected java.util.Date localEffectiveEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEffectiveEndDateTracker = false ;

                           public boolean isEffectiveEndDateSpecified(){
                               return localEffectiveEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEffectiveEndDate(){
                               return localEffectiveEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveEndDate
                               */
                               public void setEffectiveEndDate(java.util.Date param){
                            localEffectiveEndDateTracker = param != null;
                                   
                                            this.localEffectiveEndDate=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeOrder
                        */

                        
                                    protected java.lang.String localTaxOrFeeOrder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeOrderTracker = false ;

                           public boolean isTaxOrFeeOrderSpecified(){
                               return localTaxOrFeeOrderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeOrder(){
                               return localTaxOrFeeOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeOrder
                               */
                               public void setTaxOrFeeOrder(java.lang.String param){
                            localTaxOrFeeOrderTracker = param != null;
                                   
                                            this.localTaxOrFeeOrder=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeBasis
                        */

                        
                                    protected java.lang.String localTaxOrFeeBasis ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeBasisTracker = false ;

                           public boolean isTaxOrFeeBasisSpecified(){
                               return localTaxOrFeeBasisTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeBasis(){
                               return localTaxOrFeeBasis;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeBasis
                               */
                               public void setTaxOrFeeBasis(java.lang.String param){
                            localTaxOrFeeBasisTracker = param != null;
                                   
                                            this.localTaxOrFeeBasis=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeAmount
                        */

                        
                                    protected java.lang.String localTaxOrFeeAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeAmountTracker = false ;

                           public boolean isTaxOrFeeAmountSpecified(){
                               return localTaxOrFeeAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeAmount(){
                               return localTaxOrFeeAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeAmount
                               */
                               public void setTaxOrFeeAmount(java.lang.String param){
                            localTaxOrFeeAmountTracker = param != null;
                                   
                                            this.localTaxOrFeeAmount=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeApplication
                        */

                        
                                    protected java.lang.String localTaxOrFeeApplication ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeApplicationTracker = false ;

                           public boolean isTaxOrFeeApplicationSpecified(){
                               return localTaxOrFeeApplicationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeApplication(){
                               return localTaxOrFeeApplication;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeApplication
                               */
                               public void setTaxOrFeeApplication(java.lang.String param){
                            localTaxOrFeeApplicationTracker = param != null;
                                   
                                            this.localTaxOrFeeApplication=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeTypeCode
                        */

                        
                                    protected java.lang.String localTaxOrFeeTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeTypeCodeTracker = false ;

                           public boolean isTaxOrFeeTypeCodeSpecified(){
                               return localTaxOrFeeTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeTypeCode(){
                               return localTaxOrFeeTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeTypeCode
                               */
                               public void setTaxOrFeeTypeCode(java.lang.String param){
                            localTaxOrFeeTypeCodeTracker = param != null;
                                   
                                            this.localTaxOrFeeTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for ChargeType
                        */

                        
                                    protected java.lang.String localChargeType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargeTypeTracker = false ;

                           public boolean isChargeTypeSpecified(){
                               return localChargeTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChargeType(){
                               return localChargeType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChargeType
                               */
                               public void setChargeType(java.lang.String param){
                            localChargeTypeTracker = param != null;
                                   
                                            this.localChargeType=param;
                                    

                               }
                            

                        /**
                        * field for TaxDescription
                        */

                        
                                    protected java.lang.String localTaxDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxDescriptionTracker = false ;

                           public boolean isTaxDescriptionSpecified(){
                               return localTaxDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxDescription(){
                               return localTaxDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxDescription
                               */
                               public void setTaxDescription(java.lang.String param){
                            localTaxDescriptionTracker = param != null;
                                   
                                            this.localTaxDescription=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        */

                        
                                    protected java.lang.String localCurrencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyCodeTracker = false ;

                           public boolean isCurrencyCodeSpecified(){
                               return localCurrencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(java.lang.String param){
                            localCurrencyCodeTracker = param != null;
                                   
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for TaxOrFeeIncluded
                        */

                        
                                    protected java.lang.String localTaxOrFeeIncluded ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxOrFeeIncludedTracker = false ;

                           public boolean isTaxOrFeeIncludedSpecified(){
                               return localTaxOrFeeIncludedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxOrFeeIncluded(){
                               return localTaxOrFeeIncluded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxOrFeeIncluded
                               */
                               public void setTaxOrFeeIncluded(java.lang.String param){
                            localTaxOrFeeIncludedTracker = param != null;
                                   
                                            this.localTaxOrFeeIncluded=param;
                                    

                               }
                            

                        /**
                        * field for Decimals
                        * This was an Attribute!
                        */

                        
                                    protected short localDecimals ;
                                

                           /**
                           * Auto generated getter method
                           * @return short
                           */
                           public  short getDecimals(){
                               return localDecimals;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Decimals
                               */
                               public void setDecimals(short param){
                            
                                            this.localDecimals=param;
                                    

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
                           namespacePrefix+":GdsTotalPricingTax",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GdsTotalPricingTax",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localDecimals!=java.lang.Short.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "decimals",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimals), xmlWriter);

                                            
                                      }
                                     if (localEffectiveStartDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "EffectiveStartDate", xmlWriter);
                             

                                          if (localEffectiveStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EffectiveStartDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEffectiveEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "EffectiveEndDate", xmlWriter);
                             

                                          if (localEffectiveEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EffectiveEndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeOrderTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeOrder", xmlWriter);
                             

                                          if (localTaxOrFeeOrder==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeOrder cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeOrder);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeBasisTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeBasis", xmlWriter);
                             

                                          if (localTaxOrFeeBasis==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeBasis cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeBasis);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeAmountTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeAmount", xmlWriter);
                             

                                          if (localTaxOrFeeAmount==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeAmount cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeAmount);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeApplicationTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeApplication", xmlWriter);
                             

                                          if (localTaxOrFeeApplication==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeApplication cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeApplication);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeTypeCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeTypeCode", xmlWriter);
                             

                                          if (localTaxOrFeeTypeCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeTypeCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChargeTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ChargeType", xmlWriter);
                             

                                          if (localChargeType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ChargeType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChargeType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxDescription", xmlWriter);
                             

                                          if (localTaxDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCurrencyCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "CurrencyCode", xmlWriter);
                             

                                          if (localCurrencyCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CurrencyCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCurrencyCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxOrFeeIncludedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TaxOrFeeIncluded", xmlWriter);
                             

                                          if (localTaxOrFeeIncluded==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TaxOrFeeIncluded cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxOrFeeIncluded);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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

                 if (localEffectiveStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "EffectiveStartDate"));
                                 
                                        if (localEffectiveStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveStartDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EffectiveStartDate cannot be null!!");
                                        }
                                    } if (localEffectiveEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "EffectiveEndDate"));
                                 
                                        if (localEffectiveEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EffectiveEndDate cannot be null!!");
                                        }
                                    } if (localTaxOrFeeOrderTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeOrder"));
                                 
                                        if (localTaxOrFeeOrder != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeOrder));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeOrder cannot be null!!");
                                        }
                                    } if (localTaxOrFeeBasisTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeBasis"));
                                 
                                        if (localTaxOrFeeBasis != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeBasis));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeBasis cannot be null!!");
                                        }
                                    } if (localTaxOrFeeAmountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeAmount"));
                                 
                                        if (localTaxOrFeeAmount != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeAmount));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeAmount cannot be null!!");
                                        }
                                    } if (localTaxOrFeeApplicationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeApplication"));
                                 
                                        if (localTaxOrFeeApplication != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeApplication));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeApplication cannot be null!!");
                                        }
                                    } if (localTaxOrFeeTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeTypeCode"));
                                 
                                        if (localTaxOrFeeTypeCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeTypeCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeTypeCode cannot be null!!");
                                        }
                                    } if (localChargeTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ChargeType"));
                                 
                                        if (localChargeType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChargeType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ChargeType cannot be null!!");
                                        }
                                    } if (localTaxDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxDescription"));
                                 
                                        if (localTaxDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxDescription cannot be null!!");
                                        }
                                    } if (localCurrencyCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CurrencyCode"));
                                 
                                        if (localCurrencyCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrencyCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CurrencyCode cannot be null!!");
                                        }
                                    } if (localTaxOrFeeIncludedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxOrFeeIncluded"));
                                 
                                        if (localTaxOrFeeIncluded != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxOrFeeIncluded));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TaxOrFeeIncluded cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","decimals"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimals));
                                

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
        public static GdsTotalPricingTax parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GdsTotalPricingTax object =
                new GdsTotalPricingTax();

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
                    
                            if (!"GdsTotalPricingTax".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GdsTotalPricingTax)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "decimals"
                    java.lang.String tempAttribDecimals =
                        
                                reader.getAttributeValue(null,"decimals");
                            
                   if (tempAttribDecimals!=null){
                         java.lang.String content = tempAttribDecimals;
                        
                                                 object.setDecimals(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(tempAttribDecimals));
                                            
                    } else {
                       
                                           object.setDecimals(java.lang.Short.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("decimals");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","EffectiveStartDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EffectiveStartDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEffectiveStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","EffectiveEndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EffectiveEndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEffectiveEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeOrder").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeOrder" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeOrder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeBasis").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeBasis" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeBasis(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeAmount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeAmount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeApplication").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeApplication" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeApplication(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeTypeCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeTypeCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ChargeType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ChargeType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChargeType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CurrencyCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CurrencyCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCurrencyCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxOrFeeIncluded").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TaxOrFeeIncluded" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxOrFeeIncluded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    