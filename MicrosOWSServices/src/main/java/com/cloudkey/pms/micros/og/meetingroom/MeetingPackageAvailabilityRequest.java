
/**
 * MeetingPackageAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  MeetingPackageAvailabilityRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MeetingPackageAvailabilityRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/og/4.3/MeetingRoom/",
                "MeetingPackageAvailabilityRequest",
                "ns7");

            

                        /**
                        * field for MeetingDates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localMeetingDates ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getMeetingDates(){
                               return localMeetingDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MeetingDates
                               */
                               public void setMeetingDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            
                                            this.localMeetingDates=param;
                                    

                               }
                            

                        /**
                        * field for RateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate localRateRange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateRangeTracker = false ;

                           public boolean isRateRangeSpecified(){
                               return localRateRangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate getRateRange(){
                               return localRateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateRange
                               */
                               public void setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate param){
                            localRateRangeTracker = param != null;
                                   
                                            this.localRateRange=param;
                                    

                               }
                            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReference getHotelReference(){
                               return localHotelReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReference
                               */
                               public void setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference param){
                            
                                            this.localHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for PackageID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localPackageID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageIDTracker = false ;

                           public boolean isPackageIDSpecified(){
                               return localPackageIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getPackageID(){
                               return localPackageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageID
                               */
                               public void setPackageID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localPackageIDTracker = param != null;
                                   
                                            this.localPackageID=param;
                                    

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
                        * field for SummaryOnly
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSummaryOnly ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSummaryOnly(){
                               return localSummaryOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SummaryOnly
                               */
                               public void setSummaryOnly(boolean param){
                            
                                            this.localSummaryOnly=param;
                                    

                               }
                            

                        /**
                        * field for Template
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTemplate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTemplate(){
                               return localTemplate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Template
                               */
                               public void setTemplate(boolean param){
                            
                                            this.localTemplate=param;
                                    

                               }
                            

                        /**
                        * field for PackageDays
                        * This was an Attribute!
                        */

                        
                                    protected int localPackageDays ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPackageDays(){
                               return localPackageDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageDays
                               */
                               public void setPackageDays(int param){
                            
                                            this.localPackageDays=param;
                                    

                               }
                            

                        /**
                        * field for CheckAllDays
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCheckAllDays ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCheckAllDays(){
                               return localCheckAllDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CheckAllDays
                               */
                               public void setCheckAllDays(boolean param){
                            
                                            this.localCheckAllDays=param;
                                    

                               }
                            

                        /**
                        * field for SameSpace
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSameSpace ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSameSpace(){
                               return localSameSpace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SameSpace
                               */
                               public void setSameSpace(boolean param){
                            
                                            this.localSameSpace=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
                           namespacePrefix+":MeetingPackageAvailabilityRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MeetingPackageAvailabilityRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localNumberOfAttendees!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "numberOfAttendees",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localNumberOfAttendees is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "summaryOnly",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummaryOnly), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localSummaryOnly is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "template",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localTemplate is null");
                                      }
                                    
                                                   if (localPackageDays!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "packageDays",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageDays), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "checkAllDays",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckAllDays), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "sameSpace",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSameSpace), xmlWriter);

                                            
                                      }
                                    
                                            if (localMeetingDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MeetingDates cannot be null!!");
                                            }
                                           localMeetingDates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MeetingDates"),
                                               xmlWriter);
                                         if (localRateRangeTracker){
                                            if (localRateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                            }
                                           localRateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange"),
                                               xmlWriter);
                                        }
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference"),
                                               xmlWriter);
                                         if (localPackageIDTracker){
                                            if (localPackageID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PackageID cannot be null!!");
                                            }
                                           localPackageID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PackageID"),
                                               xmlWriter);
                                        }
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "MeetingDates"));
                            
                            
                                    if (localMeetingDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("MeetingDates cannot be null!!");
                                    }
                                    elementList.add(localMeetingDates);
                                 if (localRateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "RateRange"));
                            
                            
                                    if (localRateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("RateRange cannot be null!!");
                                    }
                                    elementList.add(localRateRange);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                 if (localPackageIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                      "PackageID"));
                            
                            
                                    if (localPackageID==null){
                                         throw new org.apache.axis2.databinding.ADBException("PackageID cannot be null!!");
                                    }
                                    elementList.add(localPackageID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","numberOfAttendees"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAttendees));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","summaryOnly"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummaryOnly));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","template"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTemplate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","packageDays"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageDays));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","checkAllDays"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckAllDays));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","sameSpace"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSameSpace));
                                

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
        public static MeetingPackageAvailabilityRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MeetingPackageAvailabilityRequest object =
                new MeetingPackageAvailabilityRequest();

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
                    
                            if (!"MeetingPackageAvailabilityRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MeetingPackageAvailabilityRequest)com.cloudkey.pms.micros.og.hotelcommon.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
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
                    
                    // handle attribute "summaryOnly"
                    java.lang.String tempAttribSummaryOnly =
                        
                                reader.getAttributeValue(null,"summaryOnly");
                            
                   if (tempAttribSummaryOnly!=null){
                         java.lang.String content = tempAttribSummaryOnly;
                        
                                                 object.setSummaryOnly(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSummaryOnly));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute summaryOnly is missing");
                           
                    }
                    handledAttributes.add("summaryOnly");
                    
                    // handle attribute "template"
                    java.lang.String tempAttribTemplate =
                        
                                reader.getAttributeValue(null,"template");
                            
                   if (tempAttribTemplate!=null){
                         java.lang.String content = tempAttribTemplate;
                        
                                                 object.setTemplate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTemplate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute template is missing");
                           
                    }
                    handledAttributes.add("template");
                    
                    // handle attribute "packageDays"
                    java.lang.String tempAttribPackageDays =
                        
                                reader.getAttributeValue(null,"packageDays");
                            
                   if (tempAttribPackageDays!=null){
                         java.lang.String content = tempAttribPackageDays;
                        
                                                 object.setPackageDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribPackageDays));
                                            
                    } else {
                       
                                           object.setPackageDays(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("packageDays");
                    
                    // handle attribute "checkAllDays"
                    java.lang.String tempAttribCheckAllDays =
                        
                                reader.getAttributeValue(null,"checkAllDays");
                            
                   if (tempAttribCheckAllDays!=null){
                         java.lang.String content = tempAttribCheckAllDays;
                        
                                                 object.setCheckAllDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCheckAllDays));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("checkAllDays");
                    
                    // handle attribute "sameSpace"
                    java.lang.String tempAttribSameSpace =
                        
                                reader.getAttributeValue(null,"sameSpace");
                            
                   if (tempAttribSameSpace!=null){
                         java.lang.String content = tempAttribSameSpace;
                        
                                                 object.setSameSpace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSameSpace));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("sameSpace");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","MeetingDates").equals(reader.getName())){
                                
                                                object.setMeetingDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","RateRange").equals(reader.getName())){
                                
                                                object.setRateRange(com.cloudkey.pms.micros.og.hotelcommon.MinMaxRate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","PackageID").equals(reader.getName())){
                                
                                                object.setPackageID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
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
           
    