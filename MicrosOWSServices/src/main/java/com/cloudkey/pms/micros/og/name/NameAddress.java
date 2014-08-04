
/**
 * NameAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  NameAddress bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NameAddress extends com.cloudkey.pms.micros.og.common.Address
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = NameAddress
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns4
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
                           namespacePrefix+":NameAddress",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "NameAddress",
                           xmlWriter);
                   }

               
                                            if (localAddressType != null){
                                        
                                                writeAttribute("",
                                                         "addressType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressType), xmlWriter);

                                            
                                      }
                                    
                                            if (localOtherAddressType != null){
                                        
                                                writeAttribute("",
                                                         "otherAddressType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherAddressType), xmlWriter);

                                            
                                      }
                                    
                                            if (localLanguageCode != null){
                                        
                                                writeAttribute("",
                                                         "languageCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguageCode), xmlWriter);

                                            
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
                                     if (localAddressLineTracker){
                             if (localAddressLine!=null) {
                                   namespace = "http://webservices.micros.com/og/4.3/Common/";
                                   for (int i = 0;i < localAddressLine.length;i++){
                                        
                                            if (localAddressLine[i] != null){
                                        
                                                writeStartElement(null, namespace, "AddressLine", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressLine[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("AddressLine cannot be null!!");
                                    
                             }

                        } if (localCityNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "cityName", xmlWriter);
                             

                                          if (localCityName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cityName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCityName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateProvTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "stateProv", xmlWriter);
                             

                                          if (localStateProv==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("stateProv cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStateProv);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCountryCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "countryCode", xmlWriter);
                             

                                          if (localCountryCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("countryCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCountryCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPostalCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "postalCode", xmlWriter);
                             

                                          if (localPostalCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("postalCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPostalCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBarCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "barCode", xmlWriter);
                             

                                          if (localBarCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("barCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBarCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCityExtensionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "cityExtension", xmlWriter);
                             

                                          if (localCityExtension==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("cityExtension cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCityExtension);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Name/")){
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Name/","NameAddress"));
                 if (localAddressLineTracker){
                            if (localAddressLine!=null){
                                  for (int i = 0;i < localAddressLine.length;i++){
                                      
                                         if (localAddressLine[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                              "AddressLine"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressLine[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("AddressLine cannot be null!!");
                                
                            }

                        } if (localCityNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "cityName"));
                                 
                                        if (localCityName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCityName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("cityName cannot be null!!");
                                        }
                                    } if (localStateProvTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "stateProv"));
                                 
                                        if (localStateProv != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateProv));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("stateProv cannot be null!!");
                                        }
                                    } if (localCountryCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "countryCode"));
                                 
                                        if (localCountryCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountryCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("countryCode cannot be null!!");
                                        }
                                    } if (localPostalCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "postalCode"));
                                 
                                        if (localPostalCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostalCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("postalCode cannot be null!!");
                                        }
                                    } if (localBarCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "barCode"));
                                 
                                        if (localBarCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBarCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("barCode cannot be null!!");
                                        }
                                    } if (localCityExtensionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "cityExtension"));
                                 
                                        if (localCityExtension != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCityExtension));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("cityExtension cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","addressType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddressType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherAddressType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherAddressType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","languageCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguageCode));
                                
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
        public static NameAddress parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NameAddress object =
                new NameAddress();

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
                    
                            if (!"NameAddress".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NameAddress)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "addressType"
                    java.lang.String tempAttribAddressType =
                        
                                reader.getAttributeValue(null,"addressType");
                            
                   if (tempAttribAddressType!=null){
                         java.lang.String content = tempAttribAddressType;
                        
                                                 object.setAddressType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAddressType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("addressType");
                    
                    // handle attribute "otherAddressType"
                    java.lang.String tempAttribOtherAddressType =
                        
                                reader.getAttributeValue(null,"otherAddressType");
                            
                   if (tempAttribOtherAddressType!=null){
                         java.lang.String content = tempAttribOtherAddressType;
                        
                                                 object.setOtherAddressType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherAddressType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherAddressType");
                    
                    // handle attribute "languageCode"
                    java.lang.String tempAttribLanguageCode =
                        
                                reader.getAttributeValue(null,"languageCode");
                            
                   if (tempAttribLanguageCode!=null){
                         java.lang.String content = tempAttribLanguageCode;
                        
                                                 object.setLanguageCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLanguageCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("languageCode");
                    
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
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","AddressLine").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","AddressLine").equals(reader.getName())){
                                                         list1.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setAddressLine((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","cityName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cityName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCityName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","stateProv").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"stateProv" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStateProv(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","countryCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"countryCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCountryCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","postalCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"postalCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPostalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","barCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"barCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBarCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","cityExtension").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"cityExtension" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCityExtension(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
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
           
    