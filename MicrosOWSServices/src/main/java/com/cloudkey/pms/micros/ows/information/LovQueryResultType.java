
/**
 * LovQueryResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.information;
            

            /**
            *  LovQueryResultType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LovQueryResultType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LovQueryResultType
                Namespace URI = http://webservices.micros.com/ows/5.1/Information.wsdl
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for LovValue
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.ows.information.LovValueType[] localLovValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLovValueTracker = false ;

                           public boolean isLovValueSpecified(){
                               return localLovValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.ows.information.LovValueType[]
                           */
                           public  com.cloudkey.pms.micros.ows.information.LovValueType[] getLovValue(){
                               return localLovValue;
                           }

                           
                        


                               
                              /**
                               * validate the array for LovValue
                               */
                              protected void validateLovValue(com.cloudkey.pms.micros.ows.information.LovValueType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LovValue
                              */
                              public void setLovValue(com.cloudkey.pms.micros.ows.information.LovValueType[] param){
                              
                                   validateLovValue(param);

                               localLovValueTracker = param != null;
                                      
                                      this.localLovValue=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.ows.information.LovValueType
                             */
                             public void addLovValue(com.cloudkey.pms.micros.ows.information.LovValueType param){
                                   if (localLovValue == null){
                                   localLovValue = new com.cloudkey.pms.micros.ows.information.LovValueType[]{};
                                   }

                            
                                 //update the setting tracker
                                localLovValueTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLovValue);
                               list.add(param);
                               this.localLovValue =
                             (com.cloudkey.pms.micros.ows.information.LovValueType[])list.toArray(
                            new com.cloudkey.pms.micros.ows.information.LovValueType[list.size()]);

                             }
                             

                        /**
                        * field for QualifierType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQualifierType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualifierType(){
                               return localQualifierType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifierType
                               */
                               public void setQualifierType(java.lang.String param){
                            
                                            this.localQualifierType=param;
                                    

                               }
                            

                        /**
                        * field for QualifierValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQualifierValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualifierValue(){
                               return localQualifierValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifierValue
                               */
                               public void setQualifierValue(java.lang.String param){
                            
                                            this.localQualifierValue=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryQualifierType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSecondaryQualifierType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryQualifierType(){
                               return localSecondaryQualifierType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryQualifierType
                               */
                               public void setSecondaryQualifierType(java.lang.String param){
                            
                                            this.localSecondaryQualifierType=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryQualifierValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSecondaryQualifierValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryQualifierValue(){
                               return localSecondaryQualifierValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryQualifierValue
                               */
                               public void setSecondaryQualifierValue(java.lang.String param){
                            
                                            this.localSecondaryQualifierValue=param;
                                    

                               }
                            

                        /**
                        * field for TertiaryQualifierType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTertiaryQualifierType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTertiaryQualifierType(){
                               return localTertiaryQualifierType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TertiaryQualifierType
                               */
                               public void setTertiaryQualifierType(java.lang.String param){
                            
                                            this.localTertiaryQualifierType=param;
                                    

                               }
                            

                        /**
                        * field for TertiaryQualifierValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTertiaryQualifierValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTertiaryQualifierValue(){
                               return localTertiaryQualifierValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TertiaryQualifierValue
                               */
                               public void setTertiaryQualifierValue(java.lang.String param){
                            
                                            this.localTertiaryQualifierValue=param;
                                    

                               }
                            

                        /**
                        * field for QuaternaryQualifierType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQuaternaryQualifierType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuaternaryQualifierType(){
                               return localQuaternaryQualifierType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuaternaryQualifierType
                               */
                               public void setQuaternaryQualifierType(java.lang.String param){
                            
                                            this.localQuaternaryQualifierType=param;
                                    

                               }
                            

                        /**
                        * field for QuaternaryQualifierValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQuaternaryQualifierValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuaternaryQualifierValue(){
                               return localQuaternaryQualifierValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuaternaryQualifierValue
                               */
                               public void setQuaternaryQualifierValue(java.lang.String param){
                            
                                            this.localQuaternaryQualifierValue=param;
                                    

                               }
                            

                        /**
                        * field for QuinaryQualifierType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQuinaryQualifierType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuinaryQualifierType(){
                               return localQuinaryQualifierType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuinaryQualifierType
                               */
                               public void setQuinaryQualifierType(java.lang.String param){
                            
                                            this.localQuinaryQualifierType=param;
                                    

                               }
                            

                        /**
                        * field for QuinaryQualifierValue
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localQuinaryQualifierValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuinaryQualifierValue(){
                               return localQuinaryQualifierValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuinaryQualifierValue
                               */
                               public void setQuinaryQualifierValue(java.lang.String param){
                            
                                            this.localQuinaryQualifierValue=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Information.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LovQueryResultType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LovQueryResultType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localQualifierType != null){
                                        
                                                writeAttribute("",
                                                         "qualifierType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifierType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQualifierValue != null){
                                        
                                                writeAttribute("",
                                                         "qualifierValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifierValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localSecondaryQualifierType != null){
                                        
                                                writeAttribute("",
                                                         "secondaryQualifierType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryQualifierType), xmlWriter);

                                            
                                      }
                                    
                                            if (localSecondaryQualifierValue != null){
                                        
                                                writeAttribute("",
                                                         "secondaryQualifierValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryQualifierValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localTertiaryQualifierType != null){
                                        
                                                writeAttribute("",
                                                         "tertiaryQualifierType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTertiaryQualifierType), xmlWriter);

                                            
                                      }
                                    
                                            if (localTertiaryQualifierValue != null){
                                        
                                                writeAttribute("",
                                                         "tertiaryQualifierValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTertiaryQualifierValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localQuaternaryQualifierType != null){
                                        
                                                writeAttribute("",
                                                         "quaternaryQualifierType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuaternaryQualifierType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQuaternaryQualifierValue != null){
                                        
                                                writeAttribute("",
                                                         "quaternaryQualifierValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuaternaryQualifierValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localQuinaryQualifierType != null){
                                        
                                                writeAttribute("",
                                                         "quinaryQualifierType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuinaryQualifierType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQuinaryQualifierValue != null){
                                        
                                                writeAttribute("",
                                                         "quinaryQualifierValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuinaryQualifierValue), xmlWriter);

                                            
                                      }
                                     if (localLovValueTracker){
                                       if (localLovValue!=null){
                                            for (int i = 0;i < localLovValue.length;i++){
                                                if (localLovValue[i] != null){
                                                 localLovValue[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Information.wsdl","LovValue"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("LovValue cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Information.wsdl")){
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

                 if (localLovValueTracker){
                             if (localLovValue!=null) {
                                 for (int i = 0;i < localLovValue.length;i++){

                                    if (localLovValue[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Information.wsdl",
                                                                          "LovValue"));
                                         elementList.add(localLovValue[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("LovValue cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifierType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifierType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifierValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifierValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","secondaryQualifierType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryQualifierType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","secondaryQualifierValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryQualifierValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tertiaryQualifierType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTertiaryQualifierType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tertiaryQualifierValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTertiaryQualifierValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quaternaryQualifierType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuaternaryQualifierType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quaternaryQualifierValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuaternaryQualifierValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quinaryQualifierType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuinaryQualifierType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quinaryQualifierValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuinaryQualifierValue));
                                

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
        public static LovQueryResultType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LovQueryResultType object =
                new LovQueryResultType();

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
                    
                            if (!"LovQueryResultType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LovQueryResultType)com.cloudkey.pms.micros.ows.information.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "qualifierType"
                    java.lang.String tempAttribQualifierType =
                        
                                reader.getAttributeValue(null,"qualifierType");
                            
                   if (tempAttribQualifierType!=null){
                         java.lang.String content = tempAttribQualifierType;
                        
                                                 object.setQualifierType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifierType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifierType");
                    
                    // handle attribute "qualifierValue"
                    java.lang.String tempAttribQualifierValue =
                        
                                reader.getAttributeValue(null,"qualifierValue");
                            
                   if (tempAttribQualifierValue!=null){
                         java.lang.String content = tempAttribQualifierValue;
                        
                                                 object.setQualifierValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifierValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifierValue");
                    
                    // handle attribute "secondaryQualifierType"
                    java.lang.String tempAttribSecondaryQualifierType =
                        
                                reader.getAttributeValue(null,"secondaryQualifierType");
                            
                   if (tempAttribSecondaryQualifierType!=null){
                         java.lang.String content = tempAttribSecondaryQualifierType;
                        
                                                 object.setSecondaryQualifierType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSecondaryQualifierType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("secondaryQualifierType");
                    
                    // handle attribute "secondaryQualifierValue"
                    java.lang.String tempAttribSecondaryQualifierValue =
                        
                                reader.getAttributeValue(null,"secondaryQualifierValue");
                            
                   if (tempAttribSecondaryQualifierValue!=null){
                         java.lang.String content = tempAttribSecondaryQualifierValue;
                        
                                                 object.setSecondaryQualifierValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSecondaryQualifierValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("secondaryQualifierValue");
                    
                    // handle attribute "tertiaryQualifierType"
                    java.lang.String tempAttribTertiaryQualifierType =
                        
                                reader.getAttributeValue(null,"tertiaryQualifierType");
                            
                   if (tempAttribTertiaryQualifierType!=null){
                         java.lang.String content = tempAttribTertiaryQualifierType;
                        
                                                 object.setTertiaryQualifierType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTertiaryQualifierType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("tertiaryQualifierType");
                    
                    // handle attribute "tertiaryQualifierValue"
                    java.lang.String tempAttribTertiaryQualifierValue =
                        
                                reader.getAttributeValue(null,"tertiaryQualifierValue");
                            
                   if (tempAttribTertiaryQualifierValue!=null){
                         java.lang.String content = tempAttribTertiaryQualifierValue;
                        
                                                 object.setTertiaryQualifierValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTertiaryQualifierValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("tertiaryQualifierValue");
                    
                    // handle attribute "quaternaryQualifierType"
                    java.lang.String tempAttribQuaternaryQualifierType =
                        
                                reader.getAttributeValue(null,"quaternaryQualifierType");
                            
                   if (tempAttribQuaternaryQualifierType!=null){
                         java.lang.String content = tempAttribQuaternaryQualifierType;
                        
                                                 object.setQuaternaryQualifierType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQuaternaryQualifierType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("quaternaryQualifierType");
                    
                    // handle attribute "quaternaryQualifierValue"
                    java.lang.String tempAttribQuaternaryQualifierValue =
                        
                                reader.getAttributeValue(null,"quaternaryQualifierValue");
                            
                   if (tempAttribQuaternaryQualifierValue!=null){
                         java.lang.String content = tempAttribQuaternaryQualifierValue;
                        
                                                 object.setQuaternaryQualifierValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQuaternaryQualifierValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("quaternaryQualifierValue");
                    
                    // handle attribute "quinaryQualifierType"
                    java.lang.String tempAttribQuinaryQualifierType =
                        
                                reader.getAttributeValue(null,"quinaryQualifierType");
                            
                   if (tempAttribQuinaryQualifierType!=null){
                         java.lang.String content = tempAttribQuinaryQualifierType;
                        
                                                 object.setQuinaryQualifierType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQuinaryQualifierType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("quinaryQualifierType");
                    
                    // handle attribute "quinaryQualifierValue"
                    java.lang.String tempAttribQuinaryQualifierValue =
                        
                                reader.getAttributeValue(null,"quinaryQualifierValue");
                            
                   if (tempAttribQuinaryQualifierValue!=null){
                         java.lang.String content = tempAttribQuinaryQualifierValue;
                        
                                                 object.setQuinaryQualifierValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQuinaryQualifierValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("quinaryQualifierValue");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Information.wsdl","LovValue").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.ows.information.LovValueType.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Information.wsdl","LovValue").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.ows.information.LovValueType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLovValue((com.cloudkey.pms.micros.ows.information.LovValueType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.ows.information.LovValueType.class,
                                                                list1));
                                                            
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
           
    