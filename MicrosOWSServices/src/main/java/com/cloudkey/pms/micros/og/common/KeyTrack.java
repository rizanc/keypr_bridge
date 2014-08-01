
/**
 * KeyTrack.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.common;
            

            /**
            *  KeyTrack bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class KeyTrack
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = KeyTrack
                Namespace URI = http://webservices.micros.com/og/4.3/Common/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Key1Track
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKey1Track ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKey1Track(){
                               return localKey1Track;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Key1Track
                               */
                               public void setKey1Track(java.lang.String param){
                            
                                            this.localKey1Track=param;
                                    

                               }
                            

                        /**
                        * field for Key2Track
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKey2Track ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKey2Track(){
                               return localKey2Track;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Key2Track
                               */
                               public void setKey2Track(java.lang.String param){
                            
                                            this.localKey2Track=param;
                                    

                               }
                            

                        /**
                        * field for Key3Track
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKey3Track ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKey3Track(){
                               return localKey3Track;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Key3Track
                               */
                               public void setKey3Track(java.lang.String param){
                            
                                            this.localKey3Track=param;
                                    

                               }
                            

                        /**
                        * field for Key4Track
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKey4Track ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKey4Track(){
                               return localKey4Track;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Key4Track
                               */
                               public void setKey4Track(java.lang.String param){
                            
                                            this.localKey4Track=param;
                                    

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
                           namespacePrefix+":KeyTrack",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "KeyTrack",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localKey1Track != null){
                                        
                                                writeAttribute("",
                                                         "Key1Track",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey1Track), xmlWriter);

                                            
                                      }
                                    
                                            if (localKey2Track != null){
                                        
                                                writeAttribute("",
                                                         "Key2Track",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey2Track), xmlWriter);

                                            
                                      }
                                    
                                            if (localKey3Track != null){
                                        
                                                writeAttribute("",
                                                         "Key3Track",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey3Track), xmlWriter);

                                            
                                      }
                                    
                                            if (localKey4Track != null){
                                        
                                                writeAttribute("",
                                                         "Key4Track",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey4Track), xmlWriter);

                                            
                                      }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Common/")){
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","Key1Track"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey1Track));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Key2Track"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey2Track));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Key3Track"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey3Track));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Key4Track"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKey4Track));
                                

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
        public static KeyTrack parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            KeyTrack object =
                new KeyTrack();

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
                    
                            if (!"KeyTrack".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (KeyTrack)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Key1Track"
                    java.lang.String tempAttribKey1Track =
                        
                                reader.getAttributeValue(null,"Key1Track");
                            
                   if (tempAttribKey1Track!=null){
                         java.lang.String content = tempAttribKey1Track;
                        
                                                 object.setKey1Track(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKey1Track));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Key1Track");
                    
                    // handle attribute "Key2Track"
                    java.lang.String tempAttribKey2Track =
                        
                                reader.getAttributeValue(null,"Key2Track");
                            
                   if (tempAttribKey2Track!=null){
                         java.lang.String content = tempAttribKey2Track;
                        
                                                 object.setKey2Track(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKey2Track));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Key2Track");
                    
                    // handle attribute "Key3Track"
                    java.lang.String tempAttribKey3Track =
                        
                                reader.getAttributeValue(null,"Key3Track");
                            
                   if (tempAttribKey3Track!=null){
                         java.lang.String content = tempAttribKey3Track;
                        
                                                 object.setKey3Track(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKey3Track));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Key3Track");
                    
                    // handle attribute "Key4Track"
                    java.lang.String tempAttribKey4Track =
                        
                                reader.getAttributeValue(null,"Key4Track");
                            
                   if (tempAttribKey4Track!=null){
                         java.lang.String content = tempAttribKey4Track;
                        
                                                 object.setKey4Track(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKey4Track));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Key4Track");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    