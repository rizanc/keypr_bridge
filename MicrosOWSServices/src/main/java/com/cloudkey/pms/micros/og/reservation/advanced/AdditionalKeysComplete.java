
/**
 * AdditionalKeysComplete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  AdditionalKeysComplete bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AdditionalKeysComplete
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AdditionalKeysComplete
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for ReservationID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfUniqueID localReservationID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationIDTracker = false ;

                           public boolean isReservationIDSpecified(){
                               return localReservationIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfUniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfUniqueID getReservationID(){
                               return localReservationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationID
                               */
                               public void setReservationID(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID param){
                            localReservationIDTracker = param != null;
                                   
                                            this.localReservationID=param;
                                    

                               }
                            

                        /**
                        * field for KeyTrack
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.KeyTrack[] localKeyTrack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyTrackTracker = false ;

                           public boolean isKeyTrackSpecified(){
                               return localKeyTrackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.KeyTrack[]
                           */
                           public  com.cloudkey.pms.micros.og.common.KeyTrack[] getKeyTrack(){
                               return localKeyTrack;
                           }

                           
                        


                               
                              /**
                               * validate the array for KeyTrack
                               */
                              protected void validateKeyTrack(com.cloudkey.pms.micros.og.common.KeyTrack[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param KeyTrack
                              */
                              public void setKeyTrack(com.cloudkey.pms.micros.og.common.KeyTrack[] param){
                              
                                   validateKeyTrack(param);

                               localKeyTrackTracker = param != null;
                                      
                                      this.localKeyTrack=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.KeyTrack
                             */
                             public void addKeyTrack(com.cloudkey.pms.micros.og.common.KeyTrack param){
                                   if (localKeyTrack == null){
                                   localKeyTrack = new com.cloudkey.pms.micros.og.common.KeyTrack[]{};
                                   }

                            
                                 //update the setting tracker
                                localKeyTrackTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localKeyTrack);
                               list.add(param);
                               this.localKeyTrack =
                             (com.cloudkey.pms.micros.og.common.KeyTrack[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.KeyTrack[list.size()]);

                             }
                             

                        /**
                        * field for GuestMessages
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.UnsignedShort localGuestMessages ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.UnsignedShort
                           */
                           public  org.apache.axis2.databinding.types.UnsignedShort getGuestMessages(){
                               return localGuestMessages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestMessages
                               */
                               public void setGuestMessages(org.apache.axis2.databinding.types.UnsignedShort param){
                            
                                            this.localGuestMessages=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/ResvAdvanced/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AdditionalKeysComplete",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AdditionalKeysComplete",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localGuestMessages != null){
                                        
                                                writeAttribute("",
                                                         "GuestMessages",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuestMessages), xmlWriter);

                                            
                                      }
                                     if (localReservationIDTracker){
                                            if (localReservationID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationID cannot be null!!");
                                            }
                                           localReservationID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationID"),
                                               xmlWriter);
                                        } if (localKeyTrackTracker){
                                       if (localKeyTrack!=null){
                                            for (int i = 0;i < localKeyTrack.length;i++){
                                                if (localKeyTrack[i] != null){
                                                 localKeyTrack[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","KeyTrack"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("KeyTrack cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/ResvAdvanced/")){
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

                 if (localReservationIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReservationID"));
                            
                            
                                    if (localReservationID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationID cannot be null!!");
                                    }
                                    elementList.add(localReservationID);
                                } if (localKeyTrackTracker){
                             if (localKeyTrack!=null) {
                                 for (int i = 0;i < localKeyTrack.length;i++){

                                    if (localKeyTrack[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                          "KeyTrack"));
                                         elementList.add(localKeyTrack[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("KeyTrack cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","GuestMessages"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuestMessages));
                                

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
        public static AdditionalKeysComplete parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AdditionalKeysComplete object =
                new AdditionalKeysComplete();

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
                    
                            if (!"AdditionalKeysComplete".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AdditionalKeysComplete)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "GuestMessages"
                    java.lang.String tempAttribGuestMessages =
                        
                                reader.getAttributeValue(null,"GuestMessages");
                            
                   if (tempAttribGuestMessages!=null){
                         java.lang.String content = tempAttribGuestMessages;
                        
                                                 object.setGuestMessages(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(tempAttribGuestMessages));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("GuestMessages");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationID").equals(reader.getName())){
                                
                                                object.setReservationID(com.cloudkey.pms.micros.og.common.ArrayOfUniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","KeyTrack").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.cloudkey.pms.micros.og.common.KeyTrack.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","KeyTrack").equals(reader.getName())){
                                                                    list2.add(com.cloudkey.pms.micros.og.common.KeyTrack.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setKeyTrack((com.cloudkey.pms.micros.og.common.KeyTrack[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.KeyTrack.class,
                                                                list2));
                                                            
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
           
    