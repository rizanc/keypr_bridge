
/**
 * EventBlockData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.meetingroom;
            

            /**
            *  EventBlockData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class EventBlockData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = EventBlockData
                Namespace URI = http://webservices.micros.com/og/4.3/MeetingRoom/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for BlockNotes
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Note[] localBlockNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlockNotesTracker = false ;

                           public boolean isBlockNotesSpecified(){
                               return localBlockNotesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Note[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Note[] getBlockNotes(){
                               return localBlockNotes;
                           }

                           
                        


                               
                              /**
                               * validate the array for BlockNotes
                               */
                              protected void validateBlockNotes(com.cloudkey.pms.micros.og.hotelcommon.Note[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BlockNotes
                              */
                              public void setBlockNotes(com.cloudkey.pms.micros.og.hotelcommon.Note[] param){
                              
                                   validateBlockNotes(param);

                               localBlockNotesTracker = param != null;
                                      
                                      this.localBlockNotes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.Note
                             */
                             public void addBlockNotes(com.cloudkey.pms.micros.og.hotelcommon.Note param){
                                   if (localBlockNotes == null){
                                   localBlockNotes = new com.cloudkey.pms.micros.og.hotelcommon.Note[]{};
                                   }

                            
                                 //update the setting tracker
                                localBlockNotesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBlockNotes);
                               list.add(param);
                               this.localBlockNotes =
                             (com.cloudkey.pms.micros.og.hotelcommon.Note[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.Note[list.size()]);

                             }
                             

                        /**
                        * field for BlockName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localBlockName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockName(){
                               return localBlockName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockName
                               */
                               public void setBlockName(java.lang.String param){
                            
                                            this.localBlockName=param;
                                    

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
                           namespacePrefix+":EventBlockData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "EventBlockData",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localBlockName != null){
                                        
                                                writeAttribute("",
                                                         "blockName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName), xmlWriter);

                                            
                                      }
                                    
                                            if (localBlockCode != null){
                                        
                                                writeAttribute("",
                                                         "blockCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode), xmlWriter);

                                            
                                      }
                                     if (localBlockNotesTracker){
                                       if (localBlockNotes!=null){
                                            for (int i = 0;i < localBlockNotes.length;i++){
                                                if (localBlockNotes[i] != null){
                                                 localBlockNotes[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BlockNotes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("BlockNotes cannot be null!!");
                                        
                                    }
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

                 if (localBlockNotesTracker){
                             if (localBlockNotes!=null) {
                                 for (int i = 0;i < localBlockNotes.length;i++){

                                    if (localBlockNotes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/",
                                                                          "BlockNotes"));
                                         elementList.add(localBlockNotes[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("BlockNotes cannot be null!!");
                                    
                             }

                        }
                            attribList.add(
                            new javax.xml.namespace.QName("","blockName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","blockCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode));
                                

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
        public static EventBlockData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            EventBlockData object =
                new EventBlockData();

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
                    
                            if (!"EventBlockData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EventBlockData)com.cloudkey.pms.micros.og.meetingroom.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "blockName"
                    java.lang.String tempAttribBlockName =
                        
                                reader.getAttributeValue(null,"blockName");
                            
                   if (tempAttribBlockName!=null){
                         java.lang.String content = tempAttribBlockName;
                        
                                                 object.setBlockName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBlockName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("blockName");
                    
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
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BlockNotes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Note.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/MeetingRoom/","BlockNotes").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Note.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBlockNotes((com.cloudkey.pms.micros.og.hotelcommon.Note[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.Note.class,
                                                                list1));
                                                            
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
           
    