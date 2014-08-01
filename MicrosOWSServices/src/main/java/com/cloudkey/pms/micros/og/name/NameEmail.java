
/**
 * NameEmail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.name;
            

            /**
            *  NameEmail bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NameEmail
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = NameEmail
                Namespace URI = http://webservices.micros.com/og/4.3/Name/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for String
                        */

                        
                                    protected java.lang.String localString ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getString(){
                               return localString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param String
                               */
                               public void setString(java.lang.String param){
                            
                                            this.localString=param;
                                    

                               }
                            

                            public java.lang.String toString(){
                                
                                        return localString.toString();
                                    
                            }
                        

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
                        * field for EmailType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEmailType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmailType(){
                               return localEmailType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailType
                               */
                               public void setEmailType(java.lang.String param){
                            
                                            this.localEmailType=param;
                                    

                               }
                            

                        /**
                        * field for EmailFormat
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localEmailFormat ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmailFormat(){
                               return localEmailFormat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailFormat
                               */
                               public void setEmailFormat(java.lang.String param){
                            
                                            this.localEmailFormat=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Name/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":NameEmail",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "NameEmail",
                           xmlWriter);
                   }

               
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
                                    
                                            if (localEmailType != null){
                                        
                                                writeAttribute("",
                                                         "emailType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailType), xmlWriter);

                                            
                                      }
                                    
                                            if (localEmailFormat != null){
                                        
                                                writeAttribute("",
                                                         "emailFormat",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFormat), xmlWriter);

                                            
                                      }
                                    

                                          if (localString==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("string cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localString);
                                            
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

                
                                     
                                     elementList.add(org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT);
                                 
                                        if (localString != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localString));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("string cannot be null!!");
                                        }
                                    
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
                            new javax.xml.namespace.QName("","emailType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","emailFormat"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFormat));
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static NameEmail fromString(java.lang.String value,
                                                    java.lang.String namespaceURI){
                    NameEmail returnValue = new  NameEmail();
                    
                            returnValue.setString(
                                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                        

                    return returnValue;
                }

                public static NameEmail fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return NameEmail.Factory.fromString(content,namespaceUri);
                    } else {
                       return NameEmail.Factory.fromString(content,"");
                    }
                }

            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static NameEmail parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NameEmail object =
                new NameEmail();

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
                    
                            if (!"NameEmail".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NameEmail)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
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
                    
                    // handle attribute "emailType"
                    java.lang.String tempAttribEmailType =
                        
                                reader.getAttributeValue(null,"emailType");
                            
                   if (tempAttribEmailType!=null){
                         java.lang.String content = tempAttribEmailType;
                        
                                                 object.setEmailType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEmailType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("emailType");
                    
                    // handle attribute "emailFormat"
                    java.lang.String tempAttribEmailFormat =
                        
                                reader.getAttributeValue(null,"emailFormat");
                            
                   if (tempAttribEmailFormat!=null){
                         java.lang.String content = tempAttribEmailFormat;
                        
                                                 object.setEmailFormat(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribEmailFormat));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("emailFormat");
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    if (reader.isStartElement()  || reader.hasText()){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"string" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
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
           
    