
/**
 * FetchNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.name;
            

            /**
            *  FetchNameResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FetchNameResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FetchNameResponse
                Namespace URI = http://webservices.micros.com/ows/5.1/Name.wsdl
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Result
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ResultStatus localResult ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResultTracker = false ;

                           public boolean isResultSpecified(){
                               return localResultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ResultStatus
                           */
                           public  com.cloudkey.pms.micros.og.common.ResultStatus getResult(){
                               return localResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Result
                               */
                               public void setResult(com.cloudkey.pms.micros.og.common.ResultStatus param){
                            localResultTracker = param != null;
                                   
                                            this.localResult=param;
                                    

                               }
                            

                        /**
                        * field for PersonName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.PersonName localPersonName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonNameTracker = false ;

                           public boolean isPersonNameSpecified(){
                               return localPersonNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.PersonName
                           */
                           public  com.cloudkey.pms.micros.og.common.PersonName getPersonName(){
                               return localPersonName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonName
                               */
                               public void setPersonName(com.cloudkey.pms.micros.og.common.PersonName param){
                            localPersonNameTracker = param != null;
                                   
                                            this.localPersonName=param;
                                    

                               }
                            

                        /**
                        * field for NativeName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NativeName localNativeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNativeNameTracker = false ;

                           public boolean isNativeNameSpecified(){
                               return localNativeNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NativeName
                           */
                           public  com.cloudkey.pms.micros.og.name.NativeName getNativeName(){
                               return localNativeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NativeName
                               */
                               public void setNativeName(com.cloudkey.pms.micros.og.name.NativeName param){
                            localNativeNameTracker = param != null;
                                   
                                            this.localNativeName=param;
                                    

                               }
                            

                        /**
                        * field for Birthdate
                        */

                        
                                    protected java.util.Calendar localBirthdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBirthdateTracker = false ;

                           public boolean isBirthdateSpecified(){
                               return localBirthdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getBirthdate(){
                               return localBirthdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Birthdate
                               */
                               public void setBirthdate(java.util.Calendar param){
                            localBirthdateTracker = param != null;
                                   
                                            this.localBirthdate=param;
                                    

                               }
                            

                        /**
                        * field for Gender
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Gender localGender ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGenderTracker = false ;

                           public boolean isGenderSpecified(){
                               return localGenderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Gender
                           */
                           public  com.cloudkey.pms.micros.og.common.Gender getGender(){
                               return localGender;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gender
                               */
                               public void setGender(com.cloudkey.pms.micros.og.common.Gender param){
                            localGenderTracker = param != null;
                                   
                                            this.localGender=param;
                                    

                               }
                            

                        /**
                        * field for KeyWord
                        */

                        
                                    protected com.cloudkey.pms.micros.ows.name.ArrayOfKeyWord localKeyWord ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyWordTracker = false ;

                           public boolean isKeyWordSpecified(){
                               return localKeyWordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.ows.name.ArrayOfKeyWord
                           */
                           public  com.cloudkey.pms.micros.ows.name.ArrayOfKeyWord getKeyWord(){
                               return localKeyWord;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyWord
                               */
                               public void setKeyWord(com.cloudkey.pms.micros.ows.name.ArrayOfKeyWord param){
                            localKeyWordTracker = param != null;
                                   
                                            this.localKeyWord=param;
                                    

                               }
                            

                        /**
                        * field for Company
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.Company localCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompanyTracker = false ;

                           public boolean isCompanySpecified(){
                               return localCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.Company
                           */
                           public  com.cloudkey.pms.micros.og.name.Company getCompany(){
                               return localCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Company
                               */
                               public void setCompany(com.cloudkey.pms.micros.og.name.Company param){
                            localCompanyTracker = param != null;
                                   
                                            this.localCompany=param;
                                    

                               }
                            

                        /**
                        * field for Nationality
                        */

                        
                                    protected java.lang.String localNationality ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNationalityTracker = false ;

                           public boolean isNationalitySpecified(){
                               return localNationalityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNationality(){
                               return localNationality;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nationality
                               */
                               public void setNationality(java.lang.String param){
                            localNationalityTracker = param != null;
                                   
                                            this.localNationality=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                                    protected java.lang.String localLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;

                           public boolean isLanguageSpecified(){
                               return localLanguageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(java.lang.String param){
                            localLanguageTracker = param != null;
                                   
                                            this.localLanguage=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Name.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FetchNameResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FetchNameResponse",
                           xmlWriter);
                   }

               
                   }
                if (localResultTracker){
                                            if (localResult==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                            }
                                           localResult.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Result"),
                                               xmlWriter);
                                        } if (localPersonNameTracker){
                                            if (localPersonName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                            }
                                           localPersonName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","PersonName"),
                                               xmlWriter);
                                        } if (localNativeNameTracker){
                                            if (localNativeName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                            }
                                           localNativeName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NativeName"),
                                               xmlWriter);
                                        } if (localBirthdateTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Birthdate", xmlWriter);
                             

                                          if (localBirthdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Birthdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGenderTracker){
                                            if (localGender==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gender cannot be null!!");
                                            }
                                           localGender.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Gender"),
                                               xmlWriter);
                                        } if (localKeyWordTracker){
                                            if (localKeyWord==null){
                                                 throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                            }
                                           localKeyWord.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","KeyWord"),
                                               xmlWriter);
                                        } if (localCompanyTracker){
                                            if (localCompany==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Company cannot be null!!");
                                            }
                                           localCompany.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Company"),
                                               xmlWriter);
                                        } if (localNationalityTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Nationality", xmlWriter);
                             

                                          if (localNationality==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Nationality cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNationality);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLanguageTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Language", xmlWriter);
                             

                                          if (localLanguage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLanguage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Name.wsdl")){
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

                 if (localResultTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Result"));
                            
                            
                                    if (localResult==null){
                                         throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                    }
                                    elementList.add(localResult);
                                } if (localPersonNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "PersonName"));
                            
                            
                                    if (localPersonName==null){
                                         throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                    }
                                    elementList.add(localPersonName);
                                } if (localNativeNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "NativeName"));
                            
                            
                                    if (localNativeName==null){
                                         throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                    }
                                    elementList.add(localNativeName);
                                } if (localBirthdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Birthdate"));
                                 
                                        if (localBirthdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Birthdate cannot be null!!");
                                        }
                                    } if (localGenderTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Gender"));
                            
                            
                                    if (localGender==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gender cannot be null!!");
                                    }
                                    elementList.add(localGender);
                                } if (localKeyWordTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "KeyWord"));
                            
                            
                                    if (localKeyWord==null){
                                         throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                    }
                                    elementList.add(localKeyWord);
                                } if (localCompanyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Company"));
                            
                            
                                    if (localCompany==null){
                                         throw new org.apache.axis2.databinding.ADBException("Company cannot be null!!");
                                    }
                                    elementList.add(localCompany);
                                } if (localNationalityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Nationality"));
                                 
                                        if (localNationality != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationality));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Nationality cannot be null!!");
                                        }
                                    } if (localLanguageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Language"));
                                 
                                        if (localLanguage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                        }
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
        public static FetchNameResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FetchNameResponse object =
                new FetchNameResponse();

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
                    
                            if (!"FetchNameResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FetchNameResponse)com.cloudkey.pms.micros.ows.name.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Result").equals(reader.getName())){
                                
                                                object.setResult(com.cloudkey.pms.micros.og.common.ResultStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","PersonName").equals(reader.getName())){
                                
                                                object.setPersonName(com.cloudkey.pms.micros.og.common.PersonName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NativeName").equals(reader.getName())){
                                
                                                object.setNativeName(com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Birthdate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Birthdate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBirthdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Gender").equals(reader.getName())){
                                
                                                object.setGender(com.cloudkey.pms.micros.og.common.Gender.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","KeyWord").equals(reader.getName())){
                                
                                                object.setKeyWord(com.cloudkey.pms.micros.ows.name.ArrayOfKeyWord.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Company").equals(reader.getName())){
                                
                                                object.setCompany(com.cloudkey.pms.micros.og.name.Company.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Nationality").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Nationality" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNationality(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Language").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Language" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLanguage(
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
           
    