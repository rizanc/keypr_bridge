
/**
 * RoomStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RoomStatus bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomStatus
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomStatus
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Features
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature localFeatures ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFeaturesTracker = false ;

                           public boolean isFeaturesSpecified(){
                               return localFeaturesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature getFeatures(){
                               return localFeatures;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Features
                               */
                               public void setFeatures(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature param){
                            localFeaturesTracker = param != null;
                                   
                                            this.localFeatures=param;
                                    

                               }
                            

                        /**
                        * field for NextReservationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localNextReservationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getNextReservationDate(){
                               return localNextReservationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextReservationDate
                               */
                               public void setNextReservationDate(java.util.Date param){
                            
                                            this.localNextReservationDate=param;
                                    

                               }
                            

                        /**
                        * field for RoomStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomStatus(){
                               return localRoomStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStatus
                               */
                               public void setRoomStatus(java.lang.String param){
                            
                                            this.localRoomStatus=param;
                                    

                               }
                            

                        /**
                        * field for RoomStatusToDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localRoomStatusToDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getRoomStatusToDate(){
                               return localRoomStatusToDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStatusToDate
                               */
                               public void setRoomStatusToDate(java.util.Date param){
                            
                                            this.localRoomStatusToDate=param;
                                    

                               }
                            

                        /**
                        * field for FrontOfficeStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFrontOfficeStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFrontOfficeStatus(){
                               return localFrontOfficeStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FrontOfficeStatus
                               */
                               public void setFrontOfficeStatus(java.lang.String param){
                            
                                            this.localFrontOfficeStatus=param;
                                    

                               }
                            

                        /**
                        * field for RoomStatusFromDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localRoomStatusFromDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getRoomStatusFromDate(){
                               return localRoomStatusFromDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomStatusFromDate
                               */
                               public void setRoomStatusFromDate(java.util.Date param){
                            
                                            this.localRoomStatusFromDate=param;
                                    

                               }
                            

                        /**
                        * field for OccupancyCondition
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOccupancyCondition ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOccupancyCondition(){
                               return localOccupancyCondition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OccupancyCondition
                               */
                               public void setOccupancyCondition(java.lang.String param){
                            
                                            this.localOccupancyCondition=param;
                                    

                               }
                            

                        /**
                        * field for HouseKeepingStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHouseKeepingStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHouseKeepingStatus(){
                               return localHouseKeepingStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseKeepingStatus
                               */
                               public void setHouseKeepingStatus(java.lang.String param){
                            
                                            this.localHouseKeepingStatus=param;
                                    

                               }
                            

                        /**
                        * field for HouseKeepingInspectionFlag
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localHouseKeepingInspectionFlag ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHouseKeepingInspectionFlag(){
                               return localHouseKeepingInspectionFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseKeepingInspectionFlag
                               */
                               public void setHouseKeepingInspectionFlag(java.lang.String param){
                            
                                            this.localHouseKeepingInspectionFlag=param;
                                    

                               }
                            

                        /**
                        * field for TurnDownYn
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTurnDownYn ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTurnDownYn(){
                               return localTurnDownYn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TurnDownYn
                               */
                               public void setTurnDownYn(java.lang.String param){
                            
                                            this.localTurnDownYn=param;
                                    

                               }
                            

                        /**
                        * field for ServiceStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localServiceStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceStatus(){
                               return localServiceStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceStatus
                               */
                               public void setServiceStatus(java.lang.String param){
                            
                                            this.localServiceStatus=param;
                                    

                               }
                            

                        /**
                        * field for RoomNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomNumber(){
                               return localRoomNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomNumber
                               */
                               public void setRoomNumber(java.lang.String param){
                            
                                            this.localRoomNumber=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomType(){
                               return localRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomType
                               */
                               public void setRoomType(java.lang.String param){
                            
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for Floor
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFloor ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFloor(){
                               return localFloor;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Floor
                               */
                               public void setFloor(java.lang.String param){
                            
                                            this.localFloor=param;
                                    

                               }
                            

                        /**
                        * field for ReservationStatus
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReservationStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReservationStatus(){
                               return localReservationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationStatus
                               */
                               public void setReservationStatus(java.lang.String param){
                            
                                            this.localReservationStatus=param;
                                    

                               }
                            

                        /**
                        * field for RoomClass
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomClass ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomClass(){
                               return localRoomClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomClass
                               */
                               public void setRoomClass(java.lang.String param){
                            
                                            this.localRoomClass=param;
                                    

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
                           namespacePrefix+":RoomStatus",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomStatus",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localNextReservationDate != null){
                                        
                                                writeAttribute("",
                                                         "NextReservationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextReservationDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomStatus != null){
                                        
                                                writeAttribute("",
                                                         "RoomStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomStatusToDate != null){
                                        
                                                writeAttribute("",
                                                         "RoomStatusToDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatusToDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localFrontOfficeStatus != null){
                                        
                                                writeAttribute("",
                                                         "FrontOfficeStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFrontOfficeStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomStatusFromDate != null){
                                        
                                                writeAttribute("",
                                                         "RoomStatusFromDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatusFromDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localOccupancyCondition != null){
                                        
                                                writeAttribute("",
                                                         "OccupancyCondition",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancyCondition), xmlWriter);

                                            
                                      }
                                    
                                            if (localHouseKeepingStatus != null){
                                        
                                                writeAttribute("",
                                                         "HouseKeepingStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localHouseKeepingInspectionFlag != null){
                                        
                                                writeAttribute("",
                                                         "HouseKeepingInspectionFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingInspectionFlag), xmlWriter);

                                            
                                      }
                                    
                                            if (localTurnDownYn != null){
                                        
                                                writeAttribute("",
                                                         "TurnDownYn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTurnDownYn), xmlWriter);

                                            
                                      }
                                    
                                            if (localServiceStatus != null){
                                        
                                                writeAttribute("",
                                                         "ServiceStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomNumber != null){
                                        
                                                writeAttribute("",
                                                         "RoomNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomType != null){
                                        
                                                writeAttribute("",
                                                         "RoomType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType), xmlWriter);

                                            
                                      }
                                    
                                            if (localFloor != null){
                                        
                                                writeAttribute("",
                                                         "Floor",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloor), xmlWriter);

                                            
                                      }
                                    
                                            if (localReservationStatus != null){
                                        
                                                writeAttribute("",
                                                         "ReservationStatus",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReservationStatus), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomClass != null){
                                        
                                                writeAttribute("",
                                                         "RoomClass",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass), xmlWriter);

                                            
                                      }
                                     if (localFeaturesTracker){
                                            if (localFeatures==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                            }
                                           localFeatures.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Features"),
                                               xmlWriter);
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

                 if (localFeaturesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Features"));
                            
                            
                                    if (localFeatures==null){
                                         throw new org.apache.axis2.databinding.ADBException("Features cannot be null!!");
                                    }
                                    elementList.add(localFeatures);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","NextReservationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextReservationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomStatusToDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatusToDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FrontOfficeStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFrontOfficeStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomStatusFromDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomStatusFromDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OccupancyCondition"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOccupancyCondition));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HouseKeepingStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","HouseKeepingInspectionFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHouseKeepingInspectionFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","TurnDownYn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTurnDownYn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ServiceStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Floor"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFloor));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReservationStatus"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReservationStatus));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomClass"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass));
                                

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
        public static RoomStatus parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomStatus object =
                new RoomStatus();

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
                    
                            if (!"RoomStatus".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomStatus)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "NextReservationDate"
                    java.lang.String tempAttribNextReservationDate =
                        
                                reader.getAttributeValue(null,"NextReservationDate");
                            
                   if (tempAttribNextReservationDate!=null){
                         java.lang.String content = tempAttribNextReservationDate;
                        
                                                 object.setNextReservationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribNextReservationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NextReservationDate");
                    
                    // handle attribute "RoomStatus"
                    java.lang.String tempAttribRoomStatus =
                        
                                reader.getAttributeValue(null,"RoomStatus");
                            
                   if (tempAttribRoomStatus!=null){
                         java.lang.String content = tempAttribRoomStatus;
                        
                                                 object.setRoomStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomStatus");
                    
                    // handle attribute "RoomStatusToDate"
                    java.lang.String tempAttribRoomStatusToDate =
                        
                                reader.getAttributeValue(null,"RoomStatusToDate");
                            
                   if (tempAttribRoomStatusToDate!=null){
                         java.lang.String content = tempAttribRoomStatusToDate;
                        
                                                 object.setRoomStatusToDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribRoomStatusToDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomStatusToDate");
                    
                    // handle attribute "FrontOfficeStatus"
                    java.lang.String tempAttribFrontOfficeStatus =
                        
                                reader.getAttributeValue(null,"FrontOfficeStatus");
                            
                   if (tempAttribFrontOfficeStatus!=null){
                         java.lang.String content = tempAttribFrontOfficeStatus;
                        
                                                 object.setFrontOfficeStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFrontOfficeStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("FrontOfficeStatus");
                    
                    // handle attribute "RoomStatusFromDate"
                    java.lang.String tempAttribRoomStatusFromDate =
                        
                                reader.getAttributeValue(null,"RoomStatusFromDate");
                            
                   if (tempAttribRoomStatusFromDate!=null){
                         java.lang.String content = tempAttribRoomStatusFromDate;
                        
                                                 object.setRoomStatusFromDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribRoomStatusFromDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomStatusFromDate");
                    
                    // handle attribute "OccupancyCondition"
                    java.lang.String tempAttribOccupancyCondition =
                        
                                reader.getAttributeValue(null,"OccupancyCondition");
                            
                   if (tempAttribOccupancyCondition!=null){
                         java.lang.String content = tempAttribOccupancyCondition;
                        
                                                 object.setOccupancyCondition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOccupancyCondition));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OccupancyCondition");
                    
                    // handle attribute "HouseKeepingStatus"
                    java.lang.String tempAttribHouseKeepingStatus =
                        
                                reader.getAttributeValue(null,"HouseKeepingStatus");
                            
                   if (tempAttribHouseKeepingStatus!=null){
                         java.lang.String content = tempAttribHouseKeepingStatus;
                        
                                                 object.setHouseKeepingStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHouseKeepingStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HouseKeepingStatus");
                    
                    // handle attribute "HouseKeepingInspectionFlag"
                    java.lang.String tempAttribHouseKeepingInspectionFlag =
                        
                                reader.getAttributeValue(null,"HouseKeepingInspectionFlag");
                            
                   if (tempAttribHouseKeepingInspectionFlag!=null){
                         java.lang.String content = tempAttribHouseKeepingInspectionFlag;
                        
                                                 object.setHouseKeepingInspectionFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribHouseKeepingInspectionFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("HouseKeepingInspectionFlag");
                    
                    // handle attribute "TurnDownYn"
                    java.lang.String tempAttribTurnDownYn =
                        
                                reader.getAttributeValue(null,"TurnDownYn");
                            
                   if (tempAttribTurnDownYn!=null){
                         java.lang.String content = tempAttribTurnDownYn;
                        
                                                 object.setTurnDownYn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTurnDownYn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("TurnDownYn");
                    
                    // handle attribute "ServiceStatus"
                    java.lang.String tempAttribServiceStatus =
                        
                                reader.getAttributeValue(null,"ServiceStatus");
                            
                   if (tempAttribServiceStatus!=null){
                         java.lang.String content = tempAttribServiceStatus;
                        
                                                 object.setServiceStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribServiceStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ServiceStatus");
                    
                    // handle attribute "RoomNumber"
                    java.lang.String tempAttribRoomNumber =
                        
                                reader.getAttributeValue(null,"RoomNumber");
                            
                   if (tempAttribRoomNumber!=null){
                         java.lang.String content = tempAttribRoomNumber;
                        
                                                 object.setRoomNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomNumber");
                    
                    // handle attribute "RoomType"
                    java.lang.String tempAttribRoomType =
                        
                                reader.getAttributeValue(null,"RoomType");
                            
                   if (tempAttribRoomType!=null){
                         java.lang.String content = tempAttribRoomType;
                        
                                                 object.setRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomType");
                    
                    // handle attribute "Floor"
                    java.lang.String tempAttribFloor =
                        
                                reader.getAttributeValue(null,"Floor");
                            
                   if (tempAttribFloor!=null){
                         java.lang.String content = tempAttribFloor;
                        
                                                 object.setFloor(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFloor));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Floor");
                    
                    // handle attribute "ReservationStatus"
                    java.lang.String tempAttribReservationStatus =
                        
                                reader.getAttributeValue(null,"ReservationStatus");
                            
                   if (tempAttribReservationStatus!=null){
                         java.lang.String content = tempAttribReservationStatus;
                        
                                                 object.setReservationStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReservationStatus");
                    
                    // handle attribute "RoomClass"
                    java.lang.String tempAttribRoomClass =
                        
                                reader.getAttributeValue(null,"RoomClass");
                            
                   if (tempAttribRoomClass!=null){
                         java.lang.String content = tempAttribRoomClass;
                        
                                                 object.setRoomClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomClass));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomClass");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Features").equals(reader.getName())){
                                
                                                object.setFeatures(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomFeature.Factory.parse(reader));
                                              
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
           
    