
/**
 * SetupStyle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  SetupStyle bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SetupStyle
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SetupStyle
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for SetupStyleCode
                        */

                        
                                    protected java.lang.String localSetupStyleCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSetupStyleCodeTracker = false ;

                           public boolean isSetupStyleCodeSpecified(){
                               return localSetupStyleCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSetupStyleCode(){
                               return localSetupStyleCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetupStyleCode
                               */
                               public void setSetupStyleCode(java.lang.String param){
                            localSetupStyleCodeTracker = param != null;
                                   
                                            this.localSetupStyleCode=param;
                                    

                               }
                            

                        /**
                        * field for SetupStyleDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localSetupStyleDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSetupStyleDescriptionTracker = false ;

                           public boolean isSetupStyleDescriptionSpecified(){
                               return localSetupStyleDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getSetupStyleDescription(){
                               return localSetupStyleDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetupStyleDescription
                               */
                               public void setSetupStyleDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localSetupStyleDescriptionTracker = param != null;
                                   
                                            this.localSetupStyleDescription=param;
                                    

                               }
                            

                        /**
                        * field for InternalBookedID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.InternalID localInternalBookedID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInternalBookedIDTracker = false ;

                           public boolean isInternalBookedIDSpecified(){
                               return localInternalBookedIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.InternalID
                           */
                           public  com.cloudkey.pms.micros.og.common.InternalID getInternalBookedID(){
                               return localInternalBookedID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InternalBookedID
                               */
                               public void setInternalBookedID(com.cloudkey.pms.micros.og.common.InternalID param){
                            localInternalBookedIDTracker = param != null;
                                   
                                            this.localInternalBookedID=param;
                                    

                               }
                            

                        /**
                        * field for MinimumOccupancy
                        * This was an Attribute!
                        */

                        
                                    protected int localMinimumOccupancy ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMinimumOccupancy(){
                               return localMinimumOccupancy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinimumOccupancy
                               */
                               public void setMinimumOccupancy(int param){
                            
                                            this.localMinimumOccupancy=param;
                                    

                               }
                            

                        /**
                        * field for MaximumOccupancy
                        * This was an Attribute!
                        */

                        
                                    protected int localMaximumOccupancy ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaximumOccupancy(){
                               return localMaximumOccupancy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumOccupancy
                               */
                               public void setMaximumOccupancy(int param){
                            
                                            this.localMaximumOccupancy=param;
                                    

                               }
                            

                        /**
                        * field for SetUpMinutes
                        * This was an Attribute!
                        */

                        
                                    protected int localSetUpMinutes ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSetUpMinutes(){
                               return localSetUpMinutes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetUpMinutes
                               */
                               public void setSetUpMinutes(int param){
                            
                                            this.localSetUpMinutes=param;
                                    

                               }
                            

                        /**
                        * field for SetDownMinutes
                        * This was an Attribute!
                        */

                        
                                    protected int localSetDownMinutes ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSetDownMinutes(){
                               return localSetDownMinutes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetDownMinutes
                               */
                               public void setSetDownMinutes(int param){
                            
                                            this.localSetDownMinutes=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/MeetingRoom/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SetupStyle",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SetupStyle",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localMinimumOccupancy!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "minimumOccupancy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumOccupancy), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMaximumOccupancy!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "maximumOccupancy",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumOccupancy), xmlWriter);

                                            
                                      }
                                    
                                                   if (localSetUpMinutes!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "setUpMinutes",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetUpMinutes), xmlWriter);

                                            
                                      }
                                    
                                                   if (localSetDownMinutes!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "setDownMinutes",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetDownMinutes), xmlWriter);

                                            
                                      }
                                     if (localSetupStyleCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/MeetingRoom/";
                                    writeStartElement(null, namespace, "SetupStyleCode", xmlWriter);
                             

                                          if (localSetupStyleCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SetupStyleCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSetupStyleCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSetupStyleDescriptionTracker){
                                            if (localSetupStyleDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SetupStyleDescription cannot be null!!");
                                            }
                                           localSetupStyleDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyleDescription"),
                                               xmlWriter);
                                        } if (localInternalBookedIDTracker){
                                            if (localInternalBookedID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InternalBookedID cannot be null!!");
                                            }
                                           localInternalBookedID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","InternalBookedID"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
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

                 if (localSetupStyleCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "SetupStyleCode"));
                                 
                                        if (localSetupStyleCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetupStyleCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SetupStyleCode cannot be null!!");
                                        }
                                    } if (localSetupStyleDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "SetupStyleDescription"));
                            
                            
                                    if (localSetupStyleDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("SetupStyleDescription cannot be null!!");
                                    }
                                    elementList.add(localSetupStyleDescription);
                                } if (localInternalBookedIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "InternalBookedID"));
                            
                            
                                    if (localInternalBookedID==null){
                                         throw new org.apache.axis2.databinding.ADBException("InternalBookedID cannot be null!!");
                                    }
                                    elementList.add(localInternalBookedID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","minimumOccupancy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumOccupancy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","maximumOccupancy"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumOccupancy));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","setUpMinutes"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetUpMinutes));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","setDownMinutes"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetDownMinutes));
                                

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
        public static SetupStyle parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SetupStyle object =
                new SetupStyle();

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
                    
                            if (!"SetupStyle".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SetupStyle)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "minimumOccupancy"
                    java.lang.String tempAttribMinimumOccupancy =
                        
                                reader.getAttributeValue(null,"minimumOccupancy");
                            
                   if (tempAttribMinimumOccupancy!=null){
                         java.lang.String content = tempAttribMinimumOccupancy;
                        
                                                 object.setMinimumOccupancy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMinimumOccupancy));
                                            
                    } else {
                       
                                           object.setMinimumOccupancy(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("minimumOccupancy");
                    
                    // handle attribute "maximumOccupancy"
                    java.lang.String tempAttribMaximumOccupancy =
                        
                                reader.getAttributeValue(null,"maximumOccupancy");
                            
                   if (tempAttribMaximumOccupancy!=null){
                         java.lang.String content = tempAttribMaximumOccupancy;
                        
                                                 object.setMaximumOccupancy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMaximumOccupancy));
                                            
                    } else {
                       
                                           object.setMaximumOccupancy(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("maximumOccupancy");
                    
                    // handle attribute "setUpMinutes"
                    java.lang.String tempAttribSetUpMinutes =
                        
                                reader.getAttributeValue(null,"setUpMinutes");
                            
                   if (tempAttribSetUpMinutes!=null){
                         java.lang.String content = tempAttribSetUpMinutes;
                        
                                                 object.setSetUpMinutes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribSetUpMinutes));
                                            
                    } else {
                       
                                           object.setSetUpMinutes(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("setUpMinutes");
                    
                    // handle attribute "setDownMinutes"
                    java.lang.String tempAttribSetDownMinutes =
                        
                                reader.getAttributeValue(null,"setDownMinutes");
                            
                   if (tempAttribSetDownMinutes!=null){
                         java.lang.String content = tempAttribSetDownMinutes;
                        
                                                 object.setSetDownMinutes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribSetDownMinutes));
                                            
                    } else {
                       
                                           object.setSetDownMinutes(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("setDownMinutes");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyleCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SetupStyleCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSetupStyleCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","SetupStyleDescription").equals(reader.getName())){
                                
                                                object.setSetupStyleDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","InternalBookedID").equals(reader.getName())){
                                
                                                object.setInternalBookedID(com.cloudkey.pms.micros.og.common.InternalID.Factory.parse(reader));
                                              
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
           
    