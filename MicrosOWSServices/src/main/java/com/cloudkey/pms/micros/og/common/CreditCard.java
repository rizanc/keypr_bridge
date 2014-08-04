
/**
 * CreditCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.common;
            

            /**
            *  CreditCard bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CreditCard
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CreditCard
                Namespace URI = http://webservices.micros.com/og/4.3/Common/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CardCode
                        */

                        
                                    protected java.lang.String localCardCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardCodeTracker = false ;

                           public boolean isCardCodeSpecified(){
                               return localCardCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardCode(){
                               return localCardCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardCode
                               */
                               public void setCardCode(java.lang.String param){
                            localCardCodeTracker = param != null;
                                   
                                            this.localCardCode=param;
                                    

                               }
                            

                        /**
                        * field for CardHolderName
                        */

                        
                                    protected java.lang.String localCardHolderName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardHolderNameTracker = false ;

                           public boolean isCardHolderNameSpecified(){
                               return localCardHolderNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardHolderName(){
                               return localCardHolderName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardHolderName
                               */
                               public void setCardHolderName(java.lang.String param){
                            localCardHolderNameTracker = param != null;
                                   
                                            this.localCardHolderName=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardChoice_type0
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.CreditCardChoice_type0 localCreditCardChoice_type0 ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.CreditCardChoice_type0
                           */
                           public  com.cloudkey.pms.micros.og.common.CreditCardChoice_type0 getCreditCardChoice_type0(){
                               return localCreditCardChoice_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardChoice_type0
                               */
                               public void setCreditCardChoice_type0(com.cloudkey.pms.micros.og.common.CreditCardChoice_type0 param){
                            
                                            this.localCreditCardChoice_type0=param;
                                    

                               }
                            

                        /**
                        * field for SeriesCode
                        */

                        
                                    protected java.lang.String localSeriesCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeriesCodeTracker = false ;

                           public boolean isSeriesCodeSpecified(){
                               return localSeriesCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSeriesCode(){
                               return localSeriesCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeriesCode
                               */
                               public void setSeriesCode(java.lang.String param){
                            localSeriesCodeTracker = param != null;
                                   
                                            this.localSeriesCode=param;
                                    

                               }
                            

                        /**
                        * field for Track2
                        */

                        
                                    protected java.lang.String localTrack2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrack2Tracker = false ;

                           public boolean isTrack2Specified(){
                               return localTrack2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTrack2(){
                               return localTrack2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Track2
                               */
                               public void setTrack2(java.lang.String param){
                            localTrack2Tracker = param != null;
                                   
                                            this.localTrack2=param;
                                    

                               }
                            

                        /**
                        * field for EffectiveDate
                        */

                        
                                    protected java.util.Date localEffectiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEffectiveDateTracker = false ;

                           public boolean isEffectiveDateSpecified(){
                               return localEffectiveDateTracker;
                           }

                           

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
                            localEffectiveDateTracker = param != null;
                                   
                                            this.localEffectiveDate=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
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
                        * field for EncryptedSwipe
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.EncryptedSwipe localEncryptedSwipe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEncryptedSwipeTracker = false ;

                           public boolean isEncryptedSwipeSpecified(){
                               return localEncryptedSwipeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.EncryptedSwipe
                           */
                           public  com.cloudkey.pms.micros.og.common.EncryptedSwipe getEncryptedSwipe(){
                               return localEncryptedSwipe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EncryptedSwipe
                               */
                               public void setEncryptedSwipe(com.cloudkey.pms.micros.og.common.EncryptedSwipe param){
                            localEncryptedSwipeTracker = param != null;
                                   
                                            this.localEncryptedSwipe=param;
                                    

                               }
                            

                        /**
                        * field for CardType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCardType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardType(){
                               return localCardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardType
                               */
                               public void setCardType(java.lang.String param){
                            
                                            this.localCardType=param;
                                    

                               }
                            

                        /**
                        * field for OtherCardType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherCardType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherCardType(){
                               return localOtherCardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherCardType
                               */
                               public void setOtherCardType(java.lang.String param){
                            
                                            this.localOtherCardType=param;
                                    

                               }
                            

                        /**
                        * field for ChipAndPin
                        * This was an Attribute!
                        */

                        
                                    protected boolean localChipAndPin ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getChipAndPin(){
                               return localChipAndPin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChipAndPin
                               */
                               public void setChipAndPin(boolean param){
                            
                                            this.localChipAndPin=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Common/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CreditCard",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CreditCard",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localCardType != null){
                                        
                                                writeAttribute("",
                                                         "cardType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardType), xmlWriter);

                                            
                                      }
                                    
                                            if (localOtherCardType != null){
                                        
                                                writeAttribute("",
                                                         "otherCardType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherCardType), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "chipAndPin",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChipAndPin), xmlWriter);

                                            
                                      }
                                     if (localCardCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "cardCode", xmlWriter);
                             

                                          if (localCardCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cardCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardHolderNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "cardHolderName", xmlWriter);
                             

                                          if (localCardHolderName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cardHolderName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardHolderName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localCreditCardChoice_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCardChoice_type0 cannot be null!!");
                                            }
                                           localCreditCardChoice_type0.serialize(null,xmlWriter);
                                         if (localSeriesCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "seriesCode", xmlWriter);
                             

                                          if (localSeriesCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("seriesCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSeriesCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTrack2Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "Track2", xmlWriter);
                             

                                          if (localTrack2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Track2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTrack2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEffectiveDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "effectiveDate", xmlWriter);
                             

                                          if (localEffectiveDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("effectiveDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "expirationDate", xmlWriter);
                             

                                          if (localExpirationDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("expirationDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localEncryptedSwipeTracker){
                                            if (localEncryptedSwipe==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EncryptedSwipe cannot be null!!");
                                            }
                                           localEncryptedSwipe.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","EncryptedSwipe"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Common/")){
                return "ns1";
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

                 if (localCardCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "cardCode"));
                                 
                                        if (localCardCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("cardCode cannot be null!!");
                                        }
                                    } if (localCardHolderNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "cardHolderName"));
                                 
                                        if (localCardHolderName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardHolderName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("cardHolderName cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "CreditCardChoice_type0"));
                            
                            
                                    if (localCreditCardChoice_type0==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCardChoice_type0 cannot be null!!");
                                    }
                                    elementList.add(localCreditCardChoice_type0);
                                 if (localSeriesCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "seriesCode"));
                                 
                                        if (localSeriesCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeriesCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("seriesCode cannot be null!!");
                                        }
                                    } if (localTrack2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "Track2"));
                                 
                                        if (localTrack2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrack2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Track2 cannot be null!!");
                                        }
                                    } if (localEffectiveDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "effectiveDate"));
                                 
                                        if (localEffectiveDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("effectiveDate cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "expirationDate"));
                                 
                                        if (localExpirationDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("expirationDate cannot be null!!");
                                        }
                                     if (localEncryptedSwipeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "EncryptedSwipe"));
                            
                            
                                    if (localEncryptedSwipe==null){
                                         throw new org.apache.axis2.databinding.ADBException("EncryptedSwipe cannot be null!!");
                                    }
                                    elementList.add(localEncryptedSwipe);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","cardType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherCardType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherCardType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","chipAndPin"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChipAndPin));
                                

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
        public static CreditCard parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CreditCard object =
                new CreditCard();

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
                    
                            if (!"CreditCard".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CreditCard)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "cardType"
                    java.lang.String tempAttribCardType =
                        
                                reader.getAttributeValue(null,"cardType");
                            
                   if (tempAttribCardType!=null){
                         java.lang.String content = tempAttribCardType;
                        
                                                 object.setCardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCardType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("cardType");
                    
                    // handle attribute "otherCardType"
                    java.lang.String tempAttribOtherCardType =
                        
                                reader.getAttributeValue(null,"otherCardType");
                            
                   if (tempAttribOtherCardType!=null){
                         java.lang.String content = tempAttribOtherCardType;
                        
                                                 object.setOtherCardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherCardType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherCardType");
                    
                    // handle attribute "chipAndPin"
                    java.lang.String tempAttribChipAndPin =
                        
                                reader.getAttributeValue(null,"chipAndPin");
                            
                   if (tempAttribChipAndPin!=null){
                         java.lang.String content = tempAttribChipAndPin;
                        
                                                 object.setChipAndPin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribChipAndPin));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("chipAndPin");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","cardCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cardCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","cardHolderName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cardHolderName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardHolderName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setCreditCardChoice_type0(com.cloudkey.pms.micros.og.common.CreditCardChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","seriesCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"seriesCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSeriesCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","Track2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Track2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTrack2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","effectiveDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"effectiveDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEffectiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","expirationDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"expirationDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","EncryptedSwipe").equals(reader.getName())){
                                
                                                object.setEncryptedSwipe(com.cloudkey.pms.micros.og.common.EncryptedSwipe.Factory.parse(reader));
                                              
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
           
    