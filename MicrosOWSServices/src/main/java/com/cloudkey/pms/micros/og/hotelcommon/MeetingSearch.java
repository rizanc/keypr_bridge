
/**
 * MeetingSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  MeetingSearch bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingSearch
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MeetingSearch
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for FunctionSpaceArea
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Area localFunctionSpaceArea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFunctionSpaceAreaTracker = false ;

                           public boolean isFunctionSpaceAreaSpecified(){
                               return localFunctionSpaceAreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Area
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Area getFunctionSpaceArea(){
                               return localFunctionSpaceArea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FunctionSpaceArea
                               */
                               public void setFunctionSpaceArea(com.cloudkey.pms.micros.og.hotelcommon.Area param){
                            localFunctionSpaceAreaTracker = param != null;
                                   
                                            this.localFunctionSpaceArea=param;
                                    

                               }
                            

                        /**
                        * field for MeetingFeature
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMeetingFeature ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMeetingFeature(){
                               return localMeetingFeature;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingFeature
                               */
                               public void setMeetingFeature(java.lang.String param){
                            
                                            this.localMeetingFeature=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfAttendees
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfAttendees ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfAttendees(){
                               return localNumberOfAttendees;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfAttendees
                               */
                               public void setNumberOfAttendees(int param){
                            
                                            this.localNumberOfAttendees=param;
                                    

                               }
                            

                        /**
                        * field for SetupStyle
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSetupStyle ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSetupStyle(){
                               return localSetupStyle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SetupStyle
                               */
                               public void setSetupStyle(java.lang.String param){
                            
                                            this.localSetupStyle=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfSleepingRooms
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfSleepingRooms ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfSleepingRooms(){
                               return localNumberOfSleepingRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfSleepingRooms
                               */
                               public void setNumberOfSleepingRooms(int param){
                            
                                            this.localNumberOfSleepingRooms=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfFunctionSpace
                        * This was an Attribute!
                        */

                        
                                    protected int localNumberOfFunctionSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfFunctionSpace(){
                               return localNumberOfFunctionSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfFunctionSpace
                               */
                               public void setNumberOfFunctionSpace(int param){
                            
                                            this.localNumberOfFunctionSpace=param;
                                    

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
                           namespacePrefix+":MeetingSearch",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingSearch",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localMeetingFeature != null){
                                        
                                                writeAttribute("",
                                                         "meetingFeature",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingFeature), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMeetingFeature is null");
                                      }
                                    
                                                   if (localNumberOfAttendees!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfAttendees",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localNumberOfAttendees is null");
                                      }
                                    
                                            if (localSetupStyle != null){
                                        
                                                writeAttribute("",
                                                         "setupStyle",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetupStyle), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfSleepingRooms!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfSleepingRooms",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfSleepingRooms), xmlWriter);

                                            
                                      }
                                    
                                                   if (localNumberOfFunctionSpace!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfFunctionSpace",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfFunctionSpace), xmlWriter);

                                            
                                      }
                                     if (localFunctionSpaceAreaTracker){
                                            if (localFunctionSpaceArea==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FunctionSpaceArea cannot be null!!");
                                            }
                                           localFunctionSpaceArea.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FunctionSpaceArea"),
                                               xmlWriter);
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

                 if (localFunctionSpaceAreaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "FunctionSpaceArea"));
                            
                            
                                    if (localFunctionSpaceArea==null){
                                         throw new org.apache.axis2.databinding.ADBException("FunctionSpaceArea cannot be null!!");
                                    }
                                    elementList.add(localFunctionSpaceArea);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","meetingFeature"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMeetingFeature));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfAttendees"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","setupStyle"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSetupStyle));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfSleepingRooms"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfSleepingRooms));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfFunctionSpace"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfFunctionSpace));
                                

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
        public static MeetingSearch parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingSearch object =
                new MeetingSearch();

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
                    
                            if (!"MeetingSearch".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingSearch)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "meetingFeature"
                    java.lang.String tempAttribMeetingFeature =
                        
                                reader.getAttributeValue(null,"meetingFeature");
                            
                   if (tempAttribMeetingFeature!=null){
                         java.lang.String content = tempAttribMeetingFeature;
                        
                                                 object.setMeetingFeature(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMeetingFeature));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute meetingFeature is missing");
                           
                    }
                    handledAttributes.add("meetingFeature");
                    
                    // handle attribute "numberOfAttendees"
                    java.lang.String tempAttribNumberOfAttendees =
                        
                                reader.getAttributeValue(null,"numberOfAttendees");
                            
                   if (tempAttribNumberOfAttendees!=null){
                         java.lang.String content = tempAttribNumberOfAttendees;
                        
                                                 object.setNumberOfAttendees(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfAttendees));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute numberOfAttendees is missing");
                           
                    }
                    handledAttributes.add("numberOfAttendees");
                    
                    // handle attribute "setupStyle"
                    java.lang.String tempAttribSetupStyle =
                        
                                reader.getAttributeValue(null,"setupStyle");
                            
                   if (tempAttribSetupStyle!=null){
                         java.lang.String content = tempAttribSetupStyle;
                        
                                                 object.setSetupStyle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSetupStyle));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("setupStyle");
                    
                    // handle attribute "numberOfSleepingRooms"
                    java.lang.String tempAttribNumberOfSleepingRooms =
                        
                                reader.getAttributeValue(null,"numberOfSleepingRooms");
                            
                   if (tempAttribNumberOfSleepingRooms!=null){
                         java.lang.String content = tempAttribNumberOfSleepingRooms;
                        
                                                 object.setNumberOfSleepingRooms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfSleepingRooms));
                                            
                    } else {
                       
                                           object.setNumberOfSleepingRooms(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfSleepingRooms");
                    
                    // handle attribute "numberOfFunctionSpace"
                    java.lang.String tempAttribNumberOfFunctionSpace =
                        
                                reader.getAttributeValue(null,"numberOfFunctionSpace");
                            
                   if (tempAttribNumberOfFunctionSpace!=null){
                         java.lang.String content = tempAttribNumberOfFunctionSpace;
                        
                                                 object.setNumberOfFunctionSpace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribNumberOfFunctionSpace));
                                            
                    } else {
                       
                                           object.setNumberOfFunctionSpace(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("numberOfFunctionSpace");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","FunctionSpaceArea").equals(reader.getName())){
                                
                                                object.setFunctionSpaceArea(com.cloudkey.pms.micros.og.hotelcommon.Area.Factory.parse(reader));
                                              
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
           
    