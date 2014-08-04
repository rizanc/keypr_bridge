
/**
 * GuestCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  GuestCount bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GuestCount
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GuestCount
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for AgeQualifyingCode
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode localAgeQualifyingCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode getAgeQualifyingCode(){
                               return localAgeQualifyingCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgeQualifyingCode
                               */
                               public void setAgeQualifyingCode(com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode param){
                            
                                            this.localAgeQualifyingCode=param;
                                    

                               }
                            

                        /**
                        * field for OtherAgeQualifyingCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOtherAgeQualifyingCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOtherAgeQualifyingCode(){
                               return localOtherAgeQualifyingCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherAgeQualifyingCode
                               */
                               public void setOtherAgeQualifyingCode(java.lang.String param){
                            
                                            this.localOtherAgeQualifyingCode=param;
                                    

                               }
                            

                        /**
                        * field for Age
                        * This was an Attribute!
                        */

                        
                                    protected int localAge ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAge(){
                               return localAge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Age
                               */
                               public void setAge(int param){
                            
                                            this.localAge=param;
                                    

                               }
                            

                        /**
                        * field for Count
                        * This was an Attribute!
                        */

                        
                                    protected int localCount ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCount(){
                               return localCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Count
                               */
                               public void setCount(int param){
                            
                                            this.localCount=param;
                                    

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
                           namespacePrefix+":GuestCount",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GuestCount",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localAgeQualifyingCode != null){
                                        writeAttribute("",
                                           "ageQualifyingCode",
                                           localAgeQualifyingCode.toString(), xmlWriter);
                                    }
                                    
                                            if (localOtherAgeQualifyingCode != null){
                                        
                                                writeAttribute("",
                                                         "otherAgeQualifyingCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherAgeQualifyingCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (localAge!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "age",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge), xmlWriter);

                                            
                                      }
                                    
                                                   if (localCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "count",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount), xmlWriter);

                                            
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","ageQualifyingCode"));
                            
                                      attribList.add(localAgeQualifyingCode.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherAgeQualifyingCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherAgeQualifyingCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","age"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAge));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","count"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
                                

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
        public static GuestCount parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GuestCount object =
                new GuestCount();

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
                    
                            if (!"GuestCount".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GuestCount)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ageQualifyingCode"
                    java.lang.String tempAttribAgeQualifyingCode =
                        
                                reader.getAttributeValue(null,"ageQualifyingCode");
                            
                   if (tempAttribAgeQualifyingCode!=null){
                         java.lang.String content = tempAttribAgeQualifyingCode;
                        
                                                  object.setAgeQualifyingCode(
                                                        com.cloudkey.pms.micros.og.hotelcommon.AgeQualifyingCode.Factory.fromString(reader,tempAttribAgeQualifyingCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ageQualifyingCode");
                    
                    // handle attribute "otherAgeQualifyingCode"
                    java.lang.String tempAttribOtherAgeQualifyingCode =
                        
                                reader.getAttributeValue(null,"otherAgeQualifyingCode");
                            
                   if (tempAttribOtherAgeQualifyingCode!=null){
                         java.lang.String content = tempAttribOtherAgeQualifyingCode;
                        
                                                 object.setOtherAgeQualifyingCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOtherAgeQualifyingCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("otherAgeQualifyingCode");
                    
                    // handle attribute "age"
                    java.lang.String tempAttribAge =
                        
                                reader.getAttributeValue(null,"age");
                            
                   if (tempAttribAge!=null){
                         java.lang.String content = tempAttribAge;
                        
                                                 object.setAge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribAge));
                                            
                    } else {
                       
                                           object.setAge(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("age");
                    
                    // handle attribute "count"
                    java.lang.String tempAttribCount =
                        
                                reader.getAttributeValue(null,"count");
                            
                   if (tempAttribCount!=null){
                         java.lang.String content = tempAttribCount;
                        
                                                 object.setCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribCount));
                                            
                    } else {
                       
                                           object.setCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("count");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    