
/**
 * MinMaxRateExtended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.availability;
            

            /**
            *  MinMaxRateExtended bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MinMaxRateExtended
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MinMaxRateExtended
                Namespace URI = http://webservices.micros.com/og/4.3/Availability/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for Amount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getAmount(){
                               return localAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amount
                               */
                               public void setAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            
                                            this.localAmount=param;
                                    

                               }
                            

                        /**
                        * field for RateCode
                        */

                        
                                    protected java.lang.String localRateCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCodeTracker = false ;

                           public boolean isRateCodeSpecified(){
                               return localRateCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCode(){
                               return localRateCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCode
                               */
                               public void setRateCode(java.lang.String param){
                            localRateCodeTracker = param != null;
                                   
                                            this.localRateCode=param;
                                    

                               }
                            

                        /**
                        * field for RateCodeDescription
                        */

                        
                                    protected java.lang.String localRateCodeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCodeDescriptionTracker = false ;

                           public boolean isRateCodeDescriptionSpecified(){
                               return localRateCodeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCodeDescription(){
                               return localRateCodeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCodeDescription
                               */
                               public void setRateCodeDescription(java.lang.String param){
                            localRateCodeDescriptionTracker = param != null;
                                   
                                            this.localRateCodeDescription=param;
                                    

                               }
                            

                        /**
                        * field for RateCodeShortDescription
                        */

                        
                                    protected java.lang.String localRateCodeShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCodeShortDescriptionTracker = false ;

                           public boolean isRateCodeShortDescriptionSpecified(){
                               return localRateCodeShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCodeShortDescription(){
                               return localRateCodeShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCodeShortDescription
                               */
                               public void setRateCodeShortDescription(java.lang.String param){
                            localRateCodeShortDescriptionTracker = param != null;
                                   
                                            this.localRateCodeShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for RateCodeName
                        */

                        
                                    protected java.lang.String localRateCodeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateCodeNameTracker = false ;

                           public boolean isRateCodeNameSpecified(){
                               return localRateCodeNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateCodeName(){
                               return localRateCodeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateCodeName
                               */
                               public void setRateCodeName(java.lang.String param){
                            localRateCodeNameTracker = param != null;
                                   
                                            this.localRateCodeName=param;
                                    

                               }
                            

                        /**
                        * field for RoomType
                        */

                        
                                    protected java.lang.String localRoomType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeTracker = false ;

                           public boolean isRoomTypeSpecified(){
                               return localRoomTypeTracker;
                           }

                           

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
                            localRoomTypeTracker = param != null;
                                   
                                            this.localRoomType=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeDescription
                        */

                        
                                    protected java.lang.String localRoomTypeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeDescriptionTracker = false ;

                           public boolean isRoomTypeDescriptionSpecified(){
                               return localRoomTypeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeDescription(){
                               return localRoomTypeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeDescription
                               */
                               public void setRoomTypeDescription(java.lang.String param){
                            localRoomTypeDescriptionTracker = param != null;
                                   
                                            this.localRoomTypeDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeShortDescription
                        */

                        
                                    protected java.lang.String localRoomTypeShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeShortDescriptionTracker = false ;

                           public boolean isRoomTypeShortDescriptionSpecified(){
                               return localRoomTypeShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeShortDescription(){
                               return localRoomTypeShortDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeShortDescription
                               */
                               public void setRoomTypeShortDescription(java.lang.String param){
                            localRoomTypeShortDescriptionTracker = param != null;
                                   
                                            this.localRoomTypeShortDescription=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeName
                        */

                        
                                    protected java.lang.String localRoomTypeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypeNameTracker = false ;

                           public boolean isRoomTypeNameSpecified(){
                               return localRoomTypeNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeName(){
                               return localRoomTypeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeName
                               */
                               public void setRoomTypeName(java.lang.String param){
                            localRoomTypeNameTracker = param != null;
                                   
                                            this.localRoomTypeName=param;
                                    

                               }
                            

                        /**
                        * field for CancellationPolicy
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localCancellationPolicy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancellationPolicyTracker = false ;

                           public boolean isCancellationPolicySpecified(){
                               return localCancellationPolicyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getCancellationPolicy(){
                               return localCancellationPolicy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancellationPolicy
                               */
                               public void setCancellationPolicy(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localCancellationPolicyTracker = param != null;
                                   
                                            this.localCancellationPolicy=param;
                                    

                               }
                            

                        /**
                        * field for IsRateChange
                        */

                        
                                    protected boolean localIsRateChange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsRateChangeTracker = false ;

                           public boolean isIsRateChangeSpecified(){
                               return localIsRateChangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsRateChange(){
                               return localIsRateChange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsRateChange
                               */
                               public void setIsRateChange(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localIsRateChangeTracker =
                                       true;
                                   
                                            this.localIsRateChange=param;
                                    

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
                        * field for ExpectedCharges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList localExpectedCharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpectedChargesTracker = false ;

                           public boolean isExpectedChargesSpecified(){
                               return localExpectedChargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList getExpectedCharges(){
                               return localExpectedCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpectedCharges
                               */
                               public void setExpectedCharges(com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList param){
                            localExpectedChargesTracker = param != null;
                                   
                                            this.localExpectedCharges=param;
                                    

                               }
                            

                        /**
                        * field for MinMaxRateType
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.MinMaxRateIndicator localMinMaxRateType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.MinMaxRateIndicator
                           */
                           public  com.cloudkey.pms.micros.og.availability.MinMaxRateIndicator getMinMaxRateType(){
                               return localMinMaxRateType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinMaxRateType
                               */
                               public void setMinMaxRateType(com.cloudkey.pms.micros.og.availability.MinMaxRateIndicator param){
                            
                                            this.localMinMaxRateType=param;
                                    

                               }
                            

                        /**
                        * field for CommissionCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCommissionCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCommissionCode(){
                               return localCommissionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommissionCode
                               */
                               public void setCommissionCode(java.lang.String param){
                            
                                            this.localCommissionCode=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Availability/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MinMaxRateExtended",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MinMaxRateExtended",
                           xmlWriter);
                   }

               
                   }
               
                                    
                                    if (localMinMaxRateType != null){
                                        writeAttribute("",
                                           "MinMaxRateType",
                                           localMinMaxRateType.toString(), xmlWriter);
                                    }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localMinMaxRateType is null");
                                      }
                                    
                                            if (localCommissionCode != null){
                                        
                                                writeAttribute("",
                                                         "CommissionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                            }
                                           localAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","Amount"),
                                               xmlWriter);
                                         if (localRateCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RateCode", xmlWriter);
                             

                                          if (localRateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCodeDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RateCodeDescription", xmlWriter);
                             

                                          if (localRateCodeDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCodeDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCodeDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCodeShortDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RateCodeShortDescription", xmlWriter);
                             

                                          if (localRateCodeShortDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCodeShortDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCodeShortDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCodeNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RateCodeName", xmlWriter);
                             

                                          if (localRateCodeName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCodeName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCodeName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RoomType", xmlWriter);
                             

                                          if (localRoomType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RoomTypeDescription", xmlWriter);
                             

                                          if (localRoomTypeDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomTypeDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomTypeDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeShortDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RoomTypeShortDescription", xmlWriter);
                             

                                          if (localRoomTypeShortDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomTypeShortDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomTypeShortDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "RoomTypeName", xmlWriter);
                             

                                          if (localRoomTypeName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomTypeName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomTypeName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancellationPolicyTracker){
                                            if (localCancellationPolicy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancellationPolicy cannot be null!!");
                                            }
                                           localCancellationPolicy.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","CancellationPolicy"),
                                               xmlWriter);
                                        } if (localIsRateChangeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Availability/";
                                    writeStartElement(null, namespace, "IsRateChange", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IsRateChange cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsRateChange));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalAmountTracker){
                                            if (localTotalAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TotalAmount cannot be null!!");
                                            }
                                           localTotalAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","TotalAmount"),
                                               xmlWriter);
                                        } if (localExpectedChargesTracker){
                                            if (localExpectedCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExpectedCharges cannot be null!!");
                                            }
                                           localExpectedCharges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ExpectedCharges"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Availability/")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "Amount"));
                            
                            
                                    if (localAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                    }
                                    elementList.add(localAmount);
                                 if (localRateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RateCode"));
                                 
                                        if (localRateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                        }
                                    } if (localRateCodeDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RateCodeDescription"));
                                 
                                        if (localRateCodeDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCodeDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCodeDescription cannot be null!!");
                                        }
                                    } if (localRateCodeShortDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RateCodeShortDescription"));
                                 
                                        if (localRateCodeShortDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCodeShortDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCodeShortDescription cannot be null!!");
                                        }
                                    } if (localRateCodeNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RateCodeName"));
                                 
                                        if (localRateCodeName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCodeName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCodeName cannot be null!!");
                                        }
                                    } if (localRoomTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomType"));
                                 
                                        if (localRoomType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                        }
                                    } if (localRoomTypeDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomTypeDescription"));
                                 
                                        if (localRoomTypeDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomTypeDescription cannot be null!!");
                                        }
                                    } if (localRoomTypeShortDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomTypeShortDescription"));
                                 
                                        if (localRoomTypeShortDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeShortDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomTypeShortDescription cannot be null!!");
                                        }
                                    } if (localRoomTypeNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "RoomTypeName"));
                                 
                                        if (localRoomTypeName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomTypeName cannot be null!!");
                                        }
                                    } if (localCancellationPolicyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "CancellationPolicy"));
                            
                            
                                    if (localCancellationPolicy==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancellationPolicy cannot be null!!");
                                    }
                                    elementList.add(localCancellationPolicy);
                                } if (localIsRateChangeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "IsRateChange"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsRateChange));
                            } if (localTotalAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "TotalAmount"));
                            
                            
                                    if (localTotalAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TotalAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalAmount);
                                } if (localExpectedChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/",
                                                                      "ExpectedCharges"));
                            
                            
                                    if (localExpectedCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExpectedCharges cannot be null!!");
                                    }
                                    elementList.add(localExpectedCharges);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","MinMaxRateType"));
                            
                                      attribList.add(localMinMaxRateType.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","CommissionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode));
                                

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
        public static MinMaxRateExtended parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MinMaxRateExtended object =
                new MinMaxRateExtended();

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
                    
                            if (!"MinMaxRateExtended".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MinMaxRateExtended)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "MinMaxRateType"
                    java.lang.String tempAttribMinMaxRateType =
                        
                                reader.getAttributeValue(null,"MinMaxRateType");
                            
                   if (tempAttribMinMaxRateType!=null){
                         java.lang.String content = tempAttribMinMaxRateType;
                        
                                                  object.setMinMaxRateType(
                                                        com.cloudkey.pms.micros.og.availability.MinMaxRateIndicator.Factory.fromString(reader,tempAttribMinMaxRateType));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute MinMaxRateType is missing");
                           
                    }
                    handledAttributes.add("MinMaxRateType");
                    
                    // handle attribute "CommissionCode"
                    java.lang.String tempAttribCommissionCode =
                        
                                reader.getAttributeValue(null,"CommissionCode");
                            
                   if (tempAttribCommissionCode!=null){
                         java.lang.String content = tempAttribCommissionCode;
                        
                                                 object.setCommissionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCommissionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("CommissionCode");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","Amount").equals(reader.getName())){
                                
                                                object.setAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateCodeDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCodeDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCodeDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateCodeShortDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCodeShortDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCodeShortDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RateCodeName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCodeName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCodeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomTypeDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomTypeDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomTypeDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomTypeShortDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomTypeShortDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomTypeShortDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","RoomTypeName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomTypeName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomTypeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","CancellationPolicy").equals(reader.getName())){
                                
                                                object.setCancellationPolicy(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","IsRateChange").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IsRateChange" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsRateChange(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","TotalAmount").equals(reader.getName())){
                                
                                                object.setTotalAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Availability/","ExpectedCharges").equals(reader.getName())){
                                
                                                object.setExpectedCharges(com.cloudkey.pms.micros.og.hotelcommon.DailyChargeList.Factory.parse(reader));
                                              
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
           
    