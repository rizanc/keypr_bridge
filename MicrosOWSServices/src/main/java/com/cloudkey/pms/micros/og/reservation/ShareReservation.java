
/**
 * ShareReservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  ShareReservation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ShareReservation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ShareReservation
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for UniqueIDList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueIDList localUniqueIDList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueIDListTracker = false ;

                           public boolean isUniqueIDListSpecified(){
                               return localUniqueIDListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueIDList
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueIDList getUniqueIDList(){
                               return localUniqueIDList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueIDList
                               */
                               public void setUniqueIDList(com.cloudkey.pms.micros.og.common.UniqueIDList param){
                            localUniqueIDListTracker = param != null;
                                   
                                            this.localUniqueIDList=param;
                                    

                               }
                            

                        /**
                        * field for Profile
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.Profile localProfile ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileTracker = false ;

                           public boolean isProfileSpecified(){
                               return localProfileTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.Profile
                           */
                           public  com.cloudkey.pms.micros.og.name.Profile getProfile(){
                               return localProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Profile
                               */
                               public void setProfile(com.cloudkey.pms.micros.og.name.Profile param){
                            localProfileTracker = param != null;
                                   
                                            this.localProfile=param;
                                    

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
                        * field for ReservationGuarantee
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Guarantee localReservationGuarantee ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationGuaranteeTracker = false ;

                           public boolean isReservationGuaranteeSpecified(){
                               return localReservationGuaranteeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Guarantee
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Guarantee getReservationGuarantee(){
                               return localReservationGuarantee;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationGuarantee
                               */
                               public void setReservationGuarantee(com.cloudkey.pms.micros.og.hotelcommon.Guarantee param){
                            localReservationGuaranteeTracker = param != null;
                                   
                                            this.localReservationGuarantee=param;
                                    

                               }
                            

                        /**
                        * field for Primary
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPrimary ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimary(){
                               return localPrimary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Primary
                               */
                               public void setPrimary(java.lang.String param){
                            
                                            this.localPrimary=param;
                                    

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
                           namespacePrefix+":ShareReservation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ShareReservation",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPrimary != null){
                                        
                                                writeAttribute("",
                                                         "primary",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary), xmlWriter);

                                            
                                      }
                                     if (localUniqueIDListTracker){
                                            if (localUniqueIDList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                            }
                                           localUniqueIDList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList"),
                                               xmlWriter);
                                        } if (localProfileTracker){
                                            if (localProfile==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Profile cannot be null!!");
                                            }
                                           localProfile.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Profile"),
                                               xmlWriter);
                                        } if (localGuestCountsTracker){
                                            if (localGuestCounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                            }
                                           localGuestCounts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","GuestCounts"),
                                               xmlWriter);
                                        } if (localReservationGuaranteeTracker){
                                            if (localReservationGuarantee==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationGuarantee cannot be null!!");
                                            }
                                           localReservationGuarantee.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationGuarantee"),
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

                 if (localUniqueIDListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UniqueIDList"));
                            
                            
                                    if (localUniqueIDList==null){
                                         throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                    }
                                    elementList.add(localUniqueIDList);
                                } if (localProfileTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Profile"));
                            
                            
                                    if (localProfile==null){
                                         throw new org.apache.axis2.databinding.ADBException("Profile cannot be null!!");
                                    }
                                    elementList.add(localProfile);
                                } if (localGuestCountsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "GuestCounts"));
                            
                            
                                    if (localGuestCounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestCounts cannot be null!!");
                                    }
                                    elementList.add(localGuestCounts);
                                } if (localReservationGuaranteeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ReservationGuarantee"));
                            
                            
                                    if (localReservationGuarantee==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationGuarantee cannot be null!!");
                                    }
                                    elementList.add(localReservationGuarantee);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","primary"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimary));
                                

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
        public static ShareReservation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ShareReservation object =
                new ShareReservation();

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
                    
                            if (!"ShareReservation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ShareReservation)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "primary"
                    java.lang.String tempAttribPrimary =
                        
                                reader.getAttributeValue(null,"primary");
                            
                   if (tempAttribPrimary!=null){
                         java.lang.String content = tempAttribPrimary;
                        
                                                 object.setPrimary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPrimary));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("primary");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList").equals(reader.getName())){
                                
                                                object.setUniqueIDList(com.cloudkey.pms.micros.og.common.UniqueIDList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Profile").equals(reader.getName())){
                                
                                                object.setProfile(com.cloudkey.pms.micros.og.name.Profile.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationGuarantee").equals(reader.getName())){
                                
                                                object.setReservationGuarantee(com.cloudkey.pms.micros.og.hotelcommon.Guarantee.Factory.parse(reader));
                                              
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
           
    