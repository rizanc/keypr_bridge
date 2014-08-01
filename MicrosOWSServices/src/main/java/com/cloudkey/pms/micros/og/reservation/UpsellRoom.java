
/**
 * UpsellRoom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  UpsellRoom bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class UpsellRoom
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UpsellRoom
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for RoomCategory
                        */

                        
                                    protected java.lang.String localRoomCategory ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomCategory(){
                               return localRoomCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomCategory
                               */
                               public void setRoomCategory(java.lang.String param){
                            
                                            this.localRoomCategory=param;
                                    

                               }
                            

                        /**
                        * field for FirstAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localFirstAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstAmountTracker = false ;

                           public boolean isFirstAmountSpecified(){
                               return localFirstAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getFirstAmount(){
                               return localFirstAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstAmount
                               */
                               public void setFirstAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localFirstAmountTracker = param != null;
                                   
                                            this.localFirstAmount=param;
                                    

                               }
                            

                        /**
                        * field for TotalAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotalAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalAmountTracker = false ;

                           public boolean isTotalAmountSpecified(){
                               return localTotalAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotalAmount(){
                               return localTotalAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAmount
                               */
                               public void setTotalAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalAmountTracker = param != null;
                                   
                                            this.localTotalAmount=param;
                                    

                               }
                            

                        /**
                        * field for UpsellOfferId
                        */

                        
                                    protected double localUpsellOfferId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpsellOfferIdTracker = false ;

                           public boolean isUpsellOfferIdSpecified(){
                               return localUpsellOfferIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getUpsellOfferId(){
                               return localUpsellOfferId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpsellOfferId
                               */
                               public void setUpsellOfferId(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localUpsellOfferIdTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localUpsellOfferId=param;
                                    

                               }
                            

                        /**
                        * field for ToRateCode
                        */

                        
                                    protected java.lang.String localToRateCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToRateCodeTracker = false ;

                           public boolean isToRateCodeSpecified(){
                               return localToRateCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRateCode(){
                               return localToRateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRateCode
                               */
                               public void setToRateCode(java.lang.String param){
                            localToRateCodeTracker = param != null;
                                   
                                            this.localToRateCode=param;
                                    

                               }
                            

                        /**
                        * field for ToRoomCategory
                        */

                        
                                    protected java.lang.String localToRoomCategory ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRoomCategory(){
                               return localToRoomCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRoomCategory
                               */
                               public void setToRoomCategory(java.lang.String param){
                            
                                            this.localToRoomCategory=param;
                                    

                               }
                            

                        /**
                        * field for ToRoomName
                        */

                        
                                    protected java.lang.String localToRoomName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRoomName(){
                               return localToRoomName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRoomName
                               */
                               public void setToRoomName(java.lang.String param){
                            
                                            this.localToRoomName=param;
                                    

                               }
                            

                        /**
                        * field for ToDescription
                        */

                        
                                    protected java.lang.String localToDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToDescriptionTracker = false ;

                           public boolean isToDescriptionSpecified(){
                               return localToDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToDescription(){
                               return localToDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToDescription
                               */
                               public void setToDescription(java.lang.String param){
                            localToDescriptionTracker = param != null;
                                   
                                            this.localToDescription=param;
                                    

                               }
                            

                        /**
                        * field for ToShortDescription
                        */

                        
                                    protected java.lang.String localToShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToShortDescriptionTracker = false ;

                           public boolean isToShortDescriptionSpecified(){
                               return localToShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToShortDescription(){
                               return localToShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToShortDescription
                               */
                               public void setToShortDescription(java.lang.String param){
                            localToShortDescriptionTracker = param != null;
                                   
                                            this.localToShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for UpsellAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localUpsellAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpsellAmountTracker = false ;

                           public boolean isUpsellAmountSpecified(){
                               return localUpsellAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getUpsellAmount(){
                               return localUpsellAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpsellAmount
                               */
                               public void setUpsellAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localUpsellAmountTracker = param != null;
                                   
                                            this.localUpsellAmount=param;
                                    

                               }
                            

                        /**
                        * field for UpsellTotalAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localUpsellTotalAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpsellTotalAmountTracker = false ;

                           public boolean isUpsellTotalAmountSpecified(){
                               return localUpsellTotalAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getUpsellTotalAmount(){
                               return localUpsellTotalAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpsellTotalAmount
                               */
                               public void setUpsellTotalAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localUpsellTotalAmountTracker = param != null;
                                   
                                            this.localUpsellTotalAmount=param;
                                    

                               }
                            

                        /**
                        * field for UpsellRankingOrder
                        */

                        
                                    protected int localUpsellRankingOrder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpsellRankingOrderTracker = false ;

                           public boolean isUpsellRankingOrderSpecified(){
                               return localUpsellRankingOrderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getUpsellRankingOrder(){
                               return localUpsellRankingOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpsellRankingOrder
                               */
                               public void setUpsellRankingOrder(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localUpsellRankingOrderTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localUpsellRankingOrder=param;
                                    

                               }
                            

                        /**
                        * field for MembershipType
                        */

                        
                                    protected java.lang.String localMembershipType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipTypeTracker = false ;

                           public boolean isMembershipTypeSpecified(){
                               return localMembershipTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipType(){
                               return localMembershipType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipType
                               */
                               public void setMembershipType(java.lang.String param){
                            localMembershipTypeTracker = param != null;
                                   
                                            this.localMembershipType=param;
                                    

                               }
                            

                        /**
                        * field for MembershipLevel
                        */

                        
                                    protected java.lang.String localMembershipLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipLevelTracker = false ;

                           public boolean isMembershipLevelSpecified(){
                               return localMembershipLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipLevel(){
                               return localMembershipLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipLevel
                               */
                               public void setMembershipLevel(java.lang.String param){
                            localMembershipLevelTracker = param != null;
                                   
                                            this.localMembershipLevel=param;
                                    

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
                           namespacePrefix+":UpsellRoom",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "UpsellRoom",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "RoomCategory", xmlWriter);
                             

                                          if (localRoomCategory==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomCategory cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localFirstAmountTracker){
                                            if (localFirstAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FirstAmount cannot be null!!");
                                            }
                                           localFirstAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","FirstAmount"),
                                               xmlWriter);
                                        } if (localTotalAmountTracker){
                                            if (localTotalAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalAmount cannot be null!!");
                                            }
                                           localTotalAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TotalAmount"),
                                               xmlWriter);
                                        } if (localUpsellOfferIdTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "UpsellOfferId", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localUpsellOfferId)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("UpsellOfferId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpsellOfferId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToRateCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "ToRateCode", xmlWriter);
                             

                                          if (localToRateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "ToRoomCategory", xmlWriter);
                             

                                          if (localToRoomCategory==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRoomCategory cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRoomCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "ToRoomName", xmlWriter);
                             

                                          if (localToRoomName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRoomName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRoomName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localToDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "ToDescription", xmlWriter);
                             

                                          if (localToDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToShortDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "ToShortDescription", xmlWriter);
                             

                                          if (localToShortDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToShortDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToShortDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpsellAmountTracker){
                                            if (localUpsellAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpsellAmount cannot be null!!");
                                            }
                                           localUpsellAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellAmount"),
                                               xmlWriter);
                                        } if (localUpsellTotalAmountTracker){
                                            if (localUpsellTotalAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpsellTotalAmount cannot be null!!");
                                            }
                                           localUpsellTotalAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellTotalAmount"),
                                               xmlWriter);
                                        } if (localUpsellRankingOrderTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "UpsellRankingOrder", xmlWriter);
                             
                                               if (localUpsellRankingOrder==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("UpsellRankingOrder cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpsellRankingOrder));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "MembershipType", xmlWriter);
                             

                                          if (localMembershipType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipLevelTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "MembershipLevel", xmlWriter);
                             

                                          if (localMembershipLevel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipLevel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipLevel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "RoomCategory"));
                                 
                                        if (localRoomCategory != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomCategory));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomCategory cannot be null!!");
                                        }
                                     if (localFirstAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "FirstAmount"));
                            
                            
                                    if (localFirstAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("FirstAmount cannot be null!!");
                                    }
                                    elementList.add(localFirstAmount);
                                } if (localTotalAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "TotalAmount"));
                            
                            
                                    if (localTotalAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalAmount);
                                } if (localUpsellOfferIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UpsellOfferId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpsellOfferId));
                            } if (localToRateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ToRateCode"));
                                 
                                        if (localToRateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRateCode cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ToRoomCategory"));
                                 
                                        if (localToRoomCategory != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRoomCategory));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRoomCategory cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ToRoomName"));
                                 
                                        if (localToRoomName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRoomName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRoomName cannot be null!!");
                                        }
                                     if (localToDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ToDescription"));
                                 
                                        if (localToDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToDescription cannot be null!!");
                                        }
                                    } if (localToShortDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ToShortDescription"));
                                 
                                        if (localToShortDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToShortDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToShortDescription cannot be null!!");
                                        }
                                    } if (localUpsellAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UpsellAmount"));
                            
                            
                                    if (localUpsellAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpsellAmount cannot be null!!");
                                    }
                                    elementList.add(localUpsellAmount);
                                } if (localUpsellTotalAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UpsellTotalAmount"));
                            
                            
                                    if (localUpsellTotalAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpsellTotalAmount cannot be null!!");
                                    }
                                    elementList.add(localUpsellTotalAmount);
                                } if (localUpsellRankingOrderTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UpsellRankingOrder"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpsellRankingOrder));
                            } if (localMembershipTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "MembershipType"));
                                 
                                        if (localMembershipType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                        }
                                    } if (localMembershipLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "MembershipLevel"));
                                 
                                        if (localMembershipLevel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipLevel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipLevel cannot be null!!");
                                        }
                                    }

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
        public static UpsellRoom parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UpsellRoom object =
                new UpsellRoom();

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
                    
                            if (!"UpsellRoom".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpsellRoom)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RoomCategory").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomCategory" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","FirstAmount").equals(reader.getName())){
                                
                                                object.setFirstAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","TotalAmount").equals(reader.getName())){
                                
                                                object.setTotalAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellOfferId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UpsellOfferId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpsellOfferId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUpsellOfferId(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ToRateCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRateCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ToRoomCategory").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRoomCategory" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRoomCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ToRoomName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRoomName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRoomName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ToDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ToShortDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToShortDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToShortDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellAmount").equals(reader.getName())){
                                
                                                object.setUpsellAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellTotalAmount").equals(reader.getName())){
                                
                                                object.setUpsellTotalAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UpsellRankingOrder").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UpsellRankingOrder" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpsellRankingOrder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUpsellRankingOrder(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","MembershipType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","MembershipLevel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipLevel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    