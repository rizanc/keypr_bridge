
/**
 * BookId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  BookId bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BookId
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BookId
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for EventIDs
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.EventIdData[] localEventIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventIDsTracker = false ;

                           public boolean isEventIDsSpecified(){
                               return localEventIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.EventIdData[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.EventIdData[] getEventIDs(){
                               return localEventIDs;
                           }

                           
                        


                               
                              /**
                               * validate the array for EventIDs
                               */
                              protected void validateEventIDs(com.cloudkey.pms.micros.og.meetingroom.EventIdData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EventIDs
                              */
                              public void setEventIDs(com.cloudkey.pms.micros.og.meetingroom.EventIdData[] param){
                              
                                   validateEventIDs(param);

                               localEventIDsTracker = param != null;
                                      
                                      this.localEventIDs=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.EventIdData
                             */
                             public void addEventIDs(com.cloudkey.pms.micros.og.meetingroom.EventIdData param){
                                   if (localEventIDs == null){
                                   localEventIDs = new com.cloudkey.pms.micros.og.meetingroom.EventIdData[]{};
                                   }

                            
                                 //update the setting tracker
                                localEventIDsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEventIDs);
                               list.add(param);
                               this.localEventIDs =
                             (com.cloudkey.pms.micros.og.meetingroom.EventIdData[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.EventIdData[list.size()]);

                             }
                             

                        /**
                        * field for PackageIDs
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.meetingroom.PackageIdData[] localPackageIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageIDsTracker = false ;

                           public boolean isPackageIDsSpecified(){
                               return localPackageIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.meetingroom.PackageIdData[]
                           */
                           public  com.cloudkey.pms.micros.og.meetingroom.PackageIdData[] getPackageIDs(){
                               return localPackageIDs;
                           }

                           
                        


                               
                              /**
                               * validate the array for PackageIDs
                               */
                              protected void validatePackageIDs(com.cloudkey.pms.micros.og.meetingroom.PackageIdData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PackageIDs
                              */
                              public void setPackageIDs(com.cloudkey.pms.micros.og.meetingroom.PackageIdData[] param){
                              
                                   validatePackageIDs(param);

                               localPackageIDsTracker = param != null;
                                      
                                      this.localPackageIDs=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.meetingroom.PackageIdData
                             */
                             public void addPackageIDs(com.cloudkey.pms.micros.og.meetingroom.PackageIdData param){
                                   if (localPackageIDs == null){
                                   localPackageIDs = new com.cloudkey.pms.micros.og.meetingroom.PackageIdData[]{};
                                   }

                            
                                 //update the setting tracker
                                localPackageIDsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPackageIDs);
                               list.add(param);
                               this.localPackageIDs =
                             (com.cloudkey.pms.micros.og.meetingroom.PackageIdData[])list.toArray(
                            new com.cloudkey.pms.micros.og.meetingroom.PackageIdData[list.size()]);

                             }
                             

                        /**
                        * field for BlockID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localBlockID ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getBlockID(){
                               return localBlockID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockID
                               */
                               public void setBlockID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            
                                            this.localBlockID=param;
                                    

                               }
                            

                        /**
                        * field for BlockCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localBlockCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockCode(){
                               return localBlockCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockCode
                               */
                               public void setBlockCode(java.lang.String param){
                            
                                            this.localBlockCode=param;
                                    

                               }
                            

                        /**
                        * field for GroupNameID
                        * This was an Attribute!
                        */

                        
                                    protected long localGroupNameID ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getGroupNameID(){
                               return localGroupNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupNameID
                               */
                               public void setGroupNameID(long param){
                            
                                            this.localGroupNameID=param;
                                    

                               }
                            

                        /**
                        * field for ContactNameID
                        * This was an Attribute!
                        */

                        
                                    protected long localContactNameID ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getContactNameID(){
                               return localContactNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactNameID
                               */
                               public void setContactNameID(long param){
                            
                                            this.localContactNameID=param;
                                    

                               }
                            

                        /**
                        * field for CompanyNameID
                        * This was an Attribute!
                        */

                        
                                    protected long localCompanyNameID ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getCompanyNameID(){
                               return localCompanyNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompanyNameID
                               */
                               public void setCompanyNameID(long param){
                            
                                            this.localCompanyNameID=param;
                                    

                               }
                            

                        /**
                        * field for TravelAgentNameID
                        * This was an Attribute!
                        */

                        
                                    protected long localTravelAgentNameID ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTravelAgentNameID(){
                               return localTravelAgentNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TravelAgentNameID
                               */
                               public void setTravelAgentNameID(long param){
                            
                                            this.localTravelAgentNameID=param;
                                    

                               }
                            

                        /**
                        * field for ReturnDelegates
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReturnDelegates ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReturnDelegates(){
                               return localReturnDelegates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnDelegates
                               */
                               public void setReturnDelegates(boolean param){
                            
                                            this.localReturnDelegates=param;
                                    

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
                           namespacePrefix+":BookId",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BookId",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localBlockCode != null){
                                        
                                                writeAttribute("",
                                                         "blockCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (localGroupNameID!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "groupNameID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroupNameID), xmlWriter);

                                            
                                      }
                                    
                                                   if (localContactNameID!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "contactNameID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContactNameID), xmlWriter);

                                            
                                      }
                                    
                                                   if (localCompanyNameID!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "companyNameID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompanyNameID), xmlWriter);

                                            
                                      }
                                    
                                                   if (localTravelAgentNameID!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "travelAgentNameID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTravelAgentNameID), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "returnDelegates",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnDelegates), xmlWriter);

                                            
                                      }
                                     if (localEventIDsTracker){
                                       if (localEventIDs!=null){
                                            for (int i = 0;i < localEventIDs.length;i++){
                                                if (localEventIDs[i] != null){
                                                 localEventIDs[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventIDs"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("EventIDs cannot be null!!");
                                        
                                    }
                                 } if (localPackageIDsTracker){
                                       if (localPackageIDs!=null){
                                            for (int i = 0;i < localPackageIDs.length;i++){
                                                if (localPackageIDs[i] != null){
                                                 localPackageIDs[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PackageIDs"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PackageIDs cannot be null!!");
                                        
                                    }
                                 }
                                            if (localBlockID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BlockID cannot be null!!");
                                            }
                                           localBlockID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BlockID"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/MeetingRoom/")){
                return "ns7";
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

                 if (localEventIDsTracker){
                             if (localEventIDs!=null) {
                                 for (int i = 0;i < localEventIDs.length;i++){

                                    if (localEventIDs[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "EventIDs"));
                                         elementList.add(localEventIDs[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("EventIDs cannot be null!!");
                                    
                             }

                        } if (localPackageIDsTracker){
                             if (localPackageIDs!=null) {
                                 for (int i = 0;i < localPackageIDs.length;i++){

                                    if (localPackageIDs[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "PackageIDs"));
                                         elementList.add(localPackageIDs[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PackageIDs cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "BlockID"));
                            
                            
                                    if (localBlockID==null){
                                         throw new org.apache.axis2.databinding.ADBException("BlockID cannot be null!!");
                                    }
                                    elementList.add(localBlockID);
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","blockCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","groupNameID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroupNameID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","contactNameID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContactNameID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","companyNameID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompanyNameID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","travelAgentNameID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTravelAgentNameID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","returnDelegates"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnDelegates));
                                

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
        public static BookId parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BookId object =
                new BookId();

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
                    
                            if (!"BookId".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BookId)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "blockCode"
                    java.lang.String tempAttribBlockCode =
                        
                                reader.getAttributeValue(null,"blockCode");
                            
                   if (tempAttribBlockCode!=null){
                         java.lang.String content = tempAttribBlockCode;
                        
                                                 object.setBlockCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBlockCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("blockCode");
                    
                    // handle attribute "groupNameID"
                    java.lang.String tempAttribGroupNameID =
                        
                                reader.getAttributeValue(null,"groupNameID");
                            
                   if (tempAttribGroupNameID!=null){
                         java.lang.String content = tempAttribGroupNameID;
                        
                                                 object.setGroupNameID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribGroupNameID));
                                            
                    } else {
                       
                                           object.setGroupNameID(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("groupNameID");
                    
                    // handle attribute "contactNameID"
                    java.lang.String tempAttribContactNameID =
                        
                                reader.getAttributeValue(null,"contactNameID");
                            
                   if (tempAttribContactNameID!=null){
                         java.lang.String content = tempAttribContactNameID;
                        
                                                 object.setContactNameID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribContactNameID));
                                            
                    } else {
                       
                                           object.setContactNameID(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("contactNameID");
                    
                    // handle attribute "companyNameID"
                    java.lang.String tempAttribCompanyNameID =
                        
                                reader.getAttributeValue(null,"companyNameID");
                            
                   if (tempAttribCompanyNameID!=null){
                         java.lang.String content = tempAttribCompanyNameID;
                        
                                                 object.setCompanyNameID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribCompanyNameID));
                                            
                    } else {
                       
                                           object.setCompanyNameID(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("companyNameID");
                    
                    // handle attribute "travelAgentNameID"
                    java.lang.String tempAttribTravelAgentNameID =
                        
                                reader.getAttributeValue(null,"travelAgentNameID");
                            
                   if (tempAttribTravelAgentNameID!=null){
                         java.lang.String content = tempAttribTravelAgentNameID;
                        
                                                 object.setTravelAgentNameID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(tempAttribTravelAgentNameID));
                                            
                    } else {
                       
                                           object.setTravelAgentNameID(java.lang.Long.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("travelAgentNameID");
                    
                    // handle attribute "returnDelegates"
                    java.lang.String tempAttribReturnDelegates =
                        
                                reader.getAttributeValue(null,"returnDelegates");
                            
                   if (tempAttribReturnDelegates!=null){
                         java.lang.String content = tempAttribReturnDelegates;
                        
                                                 object.setReturnDelegates(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReturnDelegates));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("returnDelegates");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventIDs").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.meetingroom.EventIdData.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","EventIDs").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.meetingroom.EventIdData.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEventIDs((com.cloudkey.pms.micros.og.meetingroom.EventIdData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.EventIdData.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PackageIDs").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.cloudkey.pms.micros.og.meetingroom.PackageIdData.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PackageIDs").equals(reader.getName())){
                                                                    list2.add(com.cloudkey.pms.micros.og.meetingroom.PackageIdData.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPackageIDs((com.cloudkey.pms.micros.og.meetingroom.PackageIdData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.meetingroom.PackageIdData.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BlockID").equals(reader.getName())){
                                
                                                object.setBlockID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    