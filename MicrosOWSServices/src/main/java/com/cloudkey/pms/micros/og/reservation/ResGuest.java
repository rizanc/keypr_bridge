
/**
 * ResGuest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  ResGuest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ResGuest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ResGuest
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for Profiles
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ProfileList localProfiles ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfilesTracker = false ;

                           public boolean isProfilesSpecified(){
                               return localProfilesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ProfileList
                           */
                           public  com.cloudkey.pms.micros.og.name.ProfileList getProfiles(){
                               return localProfiles;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Profiles
                               */
                               public void setProfiles(com.cloudkey.pms.micros.og.name.ProfileList param){
                            localProfilesTracker = param != null;
                                   
                                            this.localProfiles=param;
                                    

                               }
                            

                        /**
                        * field for SpecialRequests
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.SpecialRequestList localSpecialRequests ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialRequestsTracker = false ;

                           public boolean isSpecialRequestsSpecified(){
                               return localSpecialRequestsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.SpecialRequestList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.SpecialRequestList getSpecialRequests(){
                               return localSpecialRequests;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialRequests
                               */
                               public void setSpecialRequests(com.cloudkey.pms.micros.og.hotelcommon.SpecialRequestList param){
                            localSpecialRequestsTracker = param != null;
                                   
                                            this.localSpecialRequests=param;
                                    

                               }
                            

                        /**
                        * field for Comments
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ReservationCommentList localComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentsTracker = false ;

                           public boolean isCommentsSpecified(){
                               return localCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ReservationCommentList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ReservationCommentList getComments(){
                               return localComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comments
                               */
                               public void setComments(com.cloudkey.pms.micros.og.hotelcommon.ReservationCommentList param){
                            localCommentsTracker = param != null;
                                   
                                            this.localComments=param;
                                    

                               }
                            

                        /**
                        * field for ArrivalTransport
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TransportInfo localArrivalTransport ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArrivalTransportTracker = false ;

                           public boolean isArrivalTransportSpecified(){
                               return localArrivalTransportTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TransportInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TransportInfo getArrivalTransport(){
                               return localArrivalTransport;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArrivalTransport
                               */
                               public void setArrivalTransport(com.cloudkey.pms.micros.og.hotelcommon.TransportInfo param){
                            localArrivalTransportTracker = param != null;
                                   
                                            this.localArrivalTransport=param;
                                    

                               }
                            

                        /**
                        * field for DepartureTransport
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TransportInfo localDepartureTransport ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDepartureTransportTracker = false ;

                           public boolean isDepartureTransportSpecified(){
                               return localDepartureTransportTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TransportInfo
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TransportInfo getDepartureTransport(){
                               return localDepartureTransport;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepartureTransport
                               */
                               public void setDepartureTransport(com.cloudkey.pms.micros.og.hotelcommon.TransportInfo param){
                            localDepartureTransportTracker = param != null;
                                   
                                            this.localDepartureTransport=param;
                                    

                               }
                            

                        /**
                        * field for GuestCounts
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GuestCountList localGuestCounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuestCountsTracker = false ;

                           public boolean isGuestCountsSpecified(){
                               return localGuestCountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GuestCountList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GuestCountList getGuestCounts(){
                               return localGuestCounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestCounts
                               */
                               public void setGuestCounts(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList param){
                            localGuestCountsTracker = param != null;
                                   
                                            this.localGuestCounts=param;
                                    

                               }
                            

                        /**
                        * field for InHouseTimeSpan
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localInHouseTimeSpan ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInHouseTimeSpanTracker = false ;

                           public boolean isInHouseTimeSpanSpecified(){
                               return localInHouseTimeSpanTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getInHouseTimeSpan(){
                               return localInHouseTimeSpan;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InHouseTimeSpan
                               */
                               public void setInHouseTimeSpan(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localInHouseTimeSpanTracker = param != null;
                                   
                                            this.localInHouseTimeSpan=param;
                                    

                               }
                            

                        /**
                        * field for ResGuestRPH
                        * This was an Attribute!
                        */

                        
                                    protected int localResGuestRPH ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResGuestRPH(){
                               return localResGuestRPH;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResGuestRPH
                               */
                               public void setResGuestRPH(int param){
                            
                                            this.localResGuestRPH=param;
                                    

                               }
                            

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
                        * field for ArrivalTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localArrivalTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getArrivalTime(){
                               return localArrivalTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ArrivalTime
                               */
                               public void setArrivalTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localArrivalTime=param;
                                    

                               }
                            

                        /**
                        * field for DepartureTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localDepartureTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getDepartureTime(){
                               return localDepartureTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepartureTime
                               */
                               public void setDepartureTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localDepartureTime=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Reservation/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ResGuest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ResGuest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localResGuestRPH!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "resGuestRPH",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResGuestRPH), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localResGuestRPH is null");
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
                                    
                                            if (localArrivalTime != null){
                                        
                                                writeAttribute("",
                                                         "arrivalTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArrivalTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localDepartureTime != null){
                                        
                                                writeAttribute("",
                                                         "departureTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartureTime), xmlWriter);

                                            
                                      }
                                     if (localProfilesTracker){
                                            if (localProfiles==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Profiles cannot be null!!");
                                            }
                                           localProfiles.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Profiles"),
                                               xmlWriter);
                                        } if (localSpecialRequestsTracker){
                                            if (localSpecialRequests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SpecialRequests cannot be null!!");
                                            }
                                           localSpecialRequests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SpecialRequests"),
                                               xmlWriter);
                                        } if (localCommentsTracker){
                                            if (localComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                            }
                                           localComments.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Comments"),
                                               xmlWriter);
                                        } if (localArrivalTransportTracker){
                                            if (localArrivalTransport==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ArrivalTransport cannot be null!!");
                                            }
                                           localArrivalTransport.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ArrivalTransport"),
                                               xmlWriter);
                                        } if (localDepartureTransportTracker){
                                            if (localDepartureTransport==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DepartureTransport cannot be null!!");
                                            }
                                           localDepartureTransport.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","DepartureTransport"),
                                               xmlWriter);
                                        } if (localGuestCountsTracker){
                                            if (localGuestCounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                            }
                                           localGuestCounts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","GuestCounts"),
                                               xmlWriter);
                                        } if (localInHouseTimeSpanTracker){
                                            if (localInHouseTimeSpan==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InHouseTimeSpan cannot be null!!");
                                            }
                                           localInHouseTimeSpan.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","InHouseTimeSpan"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Reservation/")){
                return "ns6";
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

                 if (localProfilesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Profiles"));
                            
                            
                                    if (localProfiles==null){
                                         throw new org.apache.axis2.databinding.ADBException("Profiles cannot be null!!");
                                    }
                                    elementList.add(localProfiles);
                                } if (localSpecialRequestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "SpecialRequests"));
                            
                            
                                    if (localSpecialRequests==null){
                                         throw new org.apache.axis2.databinding.ADBException("SpecialRequests cannot be null!!");
                                    }
                                    elementList.add(localSpecialRequests);
                                } if (localCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Comments"));
                            
                            
                                    if (localComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                    }
                                    elementList.add(localComments);
                                } if (localArrivalTransportTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ArrivalTransport"));
                            
                            
                                    if (localArrivalTransport==null){
                                         throw new org.apache.axis2.databinding.ADBException("ArrivalTransport cannot be null!!");
                                    }
                                    elementList.add(localArrivalTransport);
                                } if (localDepartureTransportTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "DepartureTransport"));
                            
                            
                                    if (localDepartureTransport==null){
                                         throw new org.apache.axis2.databinding.ADBException("DepartureTransport cannot be null!!");
                                    }
                                    elementList.add(localDepartureTransport);
                                } if (localGuestCountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "GuestCounts"));
                            
                            
                                    if (localGuestCounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                    }
                                    elementList.add(localGuestCounts);
                                } if (localInHouseTimeSpanTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "InHouseTimeSpan"));
                            
                            
                                    if (localInHouseTimeSpan==null){
                                         throw new org.apache.axis2.databinding.ADBException("InHouseTimeSpan cannot be null!!");
                                    }
                                    elementList.add(localInHouseTimeSpan);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","resGuestRPH"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResGuestRPH));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ageQualifyingCode"));
                            
                                      attribList.add(localAgeQualifyingCode.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","otherAgeQualifyingCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherAgeQualifyingCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","arrivalTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArrivalTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","departureTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartureTime));
                                

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
        public static ResGuest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ResGuest object =
                new ResGuest();

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
                    
                            if (!"ResGuest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResGuest)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "resGuestRPH"
                    java.lang.String tempAttribResGuestRPH =
                        
                                reader.getAttributeValue(null,"resGuestRPH");
                            
                   if (tempAttribResGuestRPH!=null){
                         java.lang.String content = tempAttribResGuestRPH;
                        
                                                 object.setResGuestRPH(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribResGuestRPH));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute resGuestRPH is missing");
                           
                    }
                    handledAttributes.add("resGuestRPH");
                    
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
                    
                    // handle attribute "arrivalTime"
                    java.lang.String tempAttribArrivalTime =
                        
                                reader.getAttributeValue(null,"arrivalTime");
                            
                   if (tempAttribArrivalTime!=null){
                         java.lang.String content = tempAttribArrivalTime;
                        
                                                 object.setArrivalTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribArrivalTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("arrivalTime");
                    
                    // handle attribute "departureTime"
                    java.lang.String tempAttribDepartureTime =
                        
                                reader.getAttributeValue(null,"departureTime");
                            
                   if (tempAttribDepartureTime!=null){
                         java.lang.String content = tempAttribDepartureTime;
                        
                                                 object.setDepartureTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribDepartureTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("departureTime");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Profiles").equals(reader.getName())){
                                
                                                object.setProfiles(com.cloudkey.pms.micros.og.name.ProfileList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","SpecialRequests").equals(reader.getName())){
                                
                                                object.setSpecialRequests(com.cloudkey.pms.micros.og.hotelcommon.SpecialRequestList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Comments").equals(reader.getName())){
                                
                                                object.setComments(com.cloudkey.pms.micros.og.hotelcommon.ReservationCommentList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ArrivalTransport").equals(reader.getName())){
                                
                                                object.setArrivalTransport(com.cloudkey.pms.micros.og.hotelcommon.TransportInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","DepartureTransport").equals(reader.getName())){
                                
                                                object.setDepartureTransport(com.cloudkey.pms.micros.og.hotelcommon.TransportInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","GuestCounts").equals(reader.getName())){
                                
                                                object.setGuestCounts(com.cloudkey.pms.micros.og.hotelcommon.GuestCountList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","InHouseTimeSpan").equals(reader.getName())){
                                
                                                object.setInHouseTimeSpan(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
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
           
    