
/**
 * Posting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  Posting bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Posting
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Posting
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for ReservationRequestBase
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase localReservationRequestBase ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationRequestBaseTracker = false ;

                           public boolean isReservationRequestBaseSpecified(){
                               return localReservationRequestBaseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase getReservationRequestBase(){
                               return localReservationRequestBase;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationRequestBase
                               */
                               public void setReservationRequestBase(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase param){
                            localReservationRequestBaseTracker = param != null;
                                   
                                            this.localReservationRequestBase=param;
                                    

                               }
                            

                        /**
                        * field for PostDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localPostDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPostDate(){
                               return localPostDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostDate
                               */
                               public void setPostDate(java.util.Date param){
                            
                                            this.localPostDate=param;
                                    

                               }
                            

                        /**
                        * field for PostTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localPostTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getPostTime(){
                               return localPostTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostTime
                               */
                               public void setPostTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localPostTime=param;
                                    

                               }
                            

                        /**
                        * field for ShortInfo
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localShortInfo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getShortInfo(){
                               return localShortInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShortInfo
                               */
                               public void setShortInfo(java.lang.String param){
                            
                                            this.localShortInfo=param;
                                    

                               }
                            

                        /**
                        * field for LongInfo
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLongInfo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLongInfo(){
                               return localLongInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LongInfo
                               */
                               public void setLongInfo(java.lang.String param){
                            
                                            this.localLongInfo=param;
                                    

                               }
                            

                        /**
                        * field for Charge
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigDecimal localCharge ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigDecimal
                           */
                           public  java.math.BigDecimal getCharge(){
                               return localCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Charge
                               */
                               public void setCharge(java.math.BigDecimal param){
                            
                                            this.localCharge=param;
                                    

                               }
                            

                        /**
                        * field for StationID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStationID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStationID(){
                               return localStationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StationID
                               */
                               public void setStationID(java.lang.String param){
                            
                                            this.localStationID=param;
                                    

                               }
                            

                        /**
                        * field for UserID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUserID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserID(){
                               return localUserID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserID
                               */
                               public void setUserID(java.lang.String param){
                            
                                            this.localUserID=param;
                                    

                               }
                            

                        /**
                        * field for FolioViewNo
                        * This was an Attribute!
                        */

                        
                                    protected int localFolioViewNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFolioViewNo(){
                               return localFolioViewNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FolioViewNo
                               */
                               public void setFolioViewNo(int param){
                            
                                            this.localFolioViewNo=param;
                                    

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
                           namespacePrefix+":Posting",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Posting",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPostDate != null){
                                        
                                                writeAttribute("",
                                                         "PostDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localPostTime != null){
                                        
                                                writeAttribute("",
                                                         "PostTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localShortInfo != null){
                                        
                                                writeAttribute("",
                                                         "ShortInfo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortInfo), xmlWriter);

                                            
                                      }
                                    
                                            if (localLongInfo != null){
                                        
                                                writeAttribute("",
                                                         "LongInfo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongInfo), xmlWriter);

                                            
                                      }
                                    
                                            if (localCharge != null){
                                        
                                                writeAttribute("",
                                                         "Charge",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCharge), xmlWriter);

                                            
                                      }
                                    
                                            if (localStationID != null){
                                        
                                                writeAttribute("",
                                                         "StationID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStationID), xmlWriter);

                                            
                                      }
                                    
                                            if (localUserID != null){
                                        
                                                writeAttribute("",
                                                         "UserID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserID), xmlWriter);

                                            
                                      }
                                    
                                                   if (localFolioViewNo!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "FolioViewNo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo), xmlWriter);

                                            
                                      }
                                     if (localReservationRequestBaseTracker){
                                            if (localReservationRequestBase==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationRequestBase cannot be null!!");
                                            }
                                           localReservationRequestBase.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequestBase"),
                                               xmlWriter);
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

                 if (localReservationRequestBaseTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReservationRequestBase"));
                            
                            
                                    if (localReservationRequestBase==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationRequestBase cannot be null!!");
                                    }
                                    elementList.add(localReservationRequestBase);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","PostDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PostTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ShortInfo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShortInfo));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","LongInfo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongInfo));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Charge"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCharge));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","StationID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStationID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","UserID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FolioViewNo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo));
                                

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
        public static Posting parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Posting object =
                new Posting();

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
                    
                            if (!"Posting".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Posting)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "PostDate"
                    java.lang.String tempAttribPostDate =
                        
                                reader.getAttributeValue(null,"PostDate");
                            
                   if (tempAttribPostDate!=null){
                         java.lang.String content = tempAttribPostDate;
                        
                                                 object.setPostDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribPostDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PostDate");
                    
                    // handle attribute "PostTime"
                    java.lang.String tempAttribPostTime =
                        
                                reader.getAttributeValue(null,"PostTime");
                            
                   if (tempAttribPostTime!=null){
                         java.lang.String content = tempAttribPostTime;
                        
                                                 object.setPostTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribPostTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PostTime");
                    
                    // handle attribute "ShortInfo"
                    java.lang.String tempAttribShortInfo =
                        
                                reader.getAttributeValue(null,"ShortInfo");
                            
                   if (tempAttribShortInfo!=null){
                         java.lang.String content = tempAttribShortInfo;
                        
                                                 object.setShortInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribShortInfo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ShortInfo");
                    
                    // handle attribute "LongInfo"
                    java.lang.String tempAttribLongInfo =
                        
                                reader.getAttributeValue(null,"LongInfo");
                            
                   if (tempAttribLongInfo!=null){
                         java.lang.String content = tempAttribLongInfo;
                        
                                                 object.setLongInfo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLongInfo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("LongInfo");
                    
                    // handle attribute "Charge"
                    java.lang.String tempAttribCharge =
                        
                                reader.getAttributeValue(null,"Charge");
                            
                   if (tempAttribCharge!=null){
                         java.lang.String content = tempAttribCharge;
                        
                                                 object.setCharge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(tempAttribCharge));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Charge");
                    
                    // handle attribute "StationID"
                    java.lang.String tempAttribStationID =
                        
                                reader.getAttributeValue(null,"StationID");
                            
                   if (tempAttribStationID!=null){
                         java.lang.String content = tempAttribStationID;
                        
                                                 object.setStationID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStationID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("StationID");
                    
                    // handle attribute "UserID"
                    java.lang.String tempAttribUserID =
                        
                                reader.getAttributeValue(null,"UserID");
                            
                   if (tempAttribUserID!=null){
                         java.lang.String content = tempAttribUserID;
                        
                                                 object.setUserID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUserID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("UserID");
                    
                    // handle attribute "FolioViewNo"
                    java.lang.String tempAttribFolioViewNo =
                        
                                reader.getAttributeValue(null,"FolioViewNo");
                            
                   if (tempAttribFolioViewNo!=null){
                         java.lang.String content = tempAttribFolioViewNo;
                        
                                                 object.setFolioViewNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribFolioViewNo));
                                            
                    } else {
                       
                                           object.setFolioViewNo(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("FolioViewNo");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequestBase").equals(reader.getName())){
                                
                                                object.setReservationRequestBase(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase.Factory.parse(reader));
                                              
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
           
    