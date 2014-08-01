
/**
 * NameCreditCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  NameCreditCard bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NameCreditCard extends com.cloudkey.pms.micros.og.common.CreditCard
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = NameCreditCard
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for OperaId
                        * This was an Attribute!
                        */

                        
                                    protected long localOperaId ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getOperaId(){
                               return localOperaId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OperaId
                               */
                               public void setOperaId(long param){
                            
                                            this.localOperaId=param;
                                    

                               }
                            

                        /**
                        * field for ExternalId
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localExternalId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExternalId(){
                               return localExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalId
                               */
                               public void setExternalId(java.lang.String param){
                            
                                            this.localExternalId=param;
                                    

                               }
                            

                        /**
                        * field for Primary
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPrimary ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPrimary(){
                               return localPrimary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primary
                               */
                               public void setPrimary(boolean param){
                            
                                            this.localPrimary=param;
                                    

                               }
                            

                        /**
                        * field for DisplaySequence
                        * This was an Attribute!
                        */

                        
                                    protected int localDisplaySequence ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDisplaySequence(){
                               return localDisplaySequence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplaySequence
                               */
                               public void setDisplaySequence(int param){
                            
                                            this.localDisplaySequence=param;
                                    

                               }
                            

                        /**
                        * field for InsertUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localInsertUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInsertUser(){
                               return localInsertUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertUser
                               */
                               public void setInsertUser(java.lang.String param){
                            
                                            this.localInsertUser=param;
                                    

                               }
                            

                        /**
                        * field for InsertDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localInsertDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInsertDate(){
                               return localInsertDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertDate
                               */
                               public void setInsertDate(java.util.Calendar param){
                            
                                            this.localInsertDate=param;
                                    

                               }
                            

                        /**
                        * field for UpdateUser
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUpdateUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUpdateUser(){
                               return localUpdateUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateUser
                               */
                               public void setUpdateUser(java.lang.String param){
                            
                                            this.localUpdateUser=param;
                                    

                               }
                            

                        /**
                        * field for UpdateDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localUpdateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getUpdateDate(){
                               return localUpdateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateDate
                               */
                               public void setUpdateDate(java.util.Calendar param){
                            
                                            this.localUpdateDate=param;
                                    

                               }
                            

                        /**
                        * field for InactiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localInactiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getInactiveDate(){
                               return localInactiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDate
                               */
                               public void setInactiveDate(java.util.Date param){
                            
                                            this.localInactiveDate=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Name/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":NameCreditCard",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "NameCreditCard",
                           xmlWriter);
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
                                    
                                                   if (localOperaId!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "operaId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOperaId), xmlWriter);

                                            
                                      }
                                    
                                            if (localExternalId != null){
                                        
                                                writeAttribute("",
                                                         "externalId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalId), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "primary",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary), xmlWriter);

                                            
                                      }
                                    
                                                   if (localDisplaySequence!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "displaySequence",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplaySequence), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertUser != null){
                                        
                                                writeAttribute("",
                                                         "insertUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertDate != null){
                                        
                                                writeAttribute("",
                                                         "insertDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateUser != null){
                                        
                                                writeAttribute("",
                                                         "updateUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateDate != null){
                                        
                                                writeAttribute("",
                                                         "updateDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localInactiveDate != null){
                                        
                                                writeAttribute("",
                                                         "inactiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate), xmlWriter);

                                            
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
            if(namespace.equals("http://webservices.micros.com/og/4.3/Name/")){
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NameCreditCard"));
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
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","operaId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOperaId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","externalId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","primary"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","displaySequence"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplaySequence));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","inactiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate));
                                

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
        public static NameCreditCard parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NameCreditCard object =
                new NameCreditCard();

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
                    
                            if (!"NameCreditCard".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NameCreditCard)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
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
                    
                    // handle attribute "operaId"
                    java.lang.String tempAttribOperaId =
                        
                                reader.getAttributeValue(null,"operaId");
                            
                   if (tempAttribOperaId!=null){
                         java.lang.String content = tempAttribOperaId;
                        
                                                 object.setOperaId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribOperaId));
                                            
                    } else {
                       
                                           object.setOperaId(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("operaId");
                    
                    // handle attribute "externalId"
                    java.lang.String tempAttribExternalId =
                        
                                reader.getAttributeValue(null,"externalId");
                            
                   if (tempAttribExternalId!=null){
                         java.lang.String content = tempAttribExternalId;
                        
                                                 object.setExternalId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribExternalId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("externalId");
                    
                    // handle attribute "primary"
                    java.lang.String tempAttribPrimary =
                        
                                reader.getAttributeValue(null,"primary");
                            
                   if (tempAttribPrimary!=null){
                         java.lang.String content = tempAttribPrimary;
                        
                                                 object.setPrimary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPrimary));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("primary");
                    
                    // handle attribute "displaySequence"
                    java.lang.String tempAttribDisplaySequence =
                        
                                reader.getAttributeValue(null,"displaySequence");
                            
                   if (tempAttribDisplaySequence!=null){
                         java.lang.String content = tempAttribDisplaySequence;
                        
                                                 object.setDisplaySequence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribDisplaySequence));
                                            
                    } else {
                       
                                           object.setDisplaySequence(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("displaySequence");
                    
                    // handle attribute "insertUser"
                    java.lang.String tempAttribInsertUser =
                        
                                reader.getAttributeValue(null,"insertUser");
                            
                   if (tempAttribInsertUser!=null){
                         java.lang.String content = tempAttribInsertUser;
                        
                                                 object.setInsertUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInsertUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertUser");
                    
                    // handle attribute "insertDate"
                    java.lang.String tempAttribInsertDate =
                        
                                reader.getAttributeValue(null,"insertDate");
                            
                   if (tempAttribInsertDate!=null){
                         java.lang.String content = tempAttribInsertDate;
                        
                                                 object.setInsertDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribInsertDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertDate");
                    
                    // handle attribute "updateUser"
                    java.lang.String tempAttribUpdateUser =
                        
                                reader.getAttributeValue(null,"updateUser");
                            
                   if (tempAttribUpdateUser!=null){
                         java.lang.String content = tempAttribUpdateUser;
                        
                                                 object.setUpdateUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUpdateUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateUser");
                    
                    // handle attribute "updateDate"
                    java.lang.String tempAttribUpdateDate =
                        
                                reader.getAttributeValue(null,"updateDate");
                            
                   if (tempAttribUpdateDate!=null){
                         java.lang.String content = tempAttribUpdateDate;
                        
                                                 object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribUpdateDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateDate");
                    
                    // handle attribute "inactiveDate"
                    java.lang.String tempAttribInactiveDate =
                        
                                reader.getAttributeValue(null,"inactiveDate");
                            
                   if (tempAttribInactiveDate!=null){
                         java.lang.String content = tempAttribInactiveDate;
                        
                                                 object.setInactiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribInactiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("inactiveDate");
                    
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
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
                                
                                        else
                                    
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
                                
                                        else
                                    
                                    if (reader.isStartElement() ){
                                
                                                object.setCreditCardChoice_type0(com.cloudkey.pms.micros.og.common.CreditCardChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
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
                                
                                        else
                                    
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
                                
                                        else
                                    
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
                                
                                        else
                                    
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
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","EncryptedSwipe").equals(reader.getName())){
                                
                                                object.setEncryptedSwipe(com.cloudkey.pms.micros.og.common.EncryptedSwipe.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    