
/**
 * InventoryItemElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  InventoryItemElement bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class InventoryItemElement
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = InventoryItemElement
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for ItemCode
                        */

                        
                                    protected java.lang.String localItemCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getItemCode(){
                               return localItemCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemCode
                               */
                               public void setItemCode(java.lang.String param){
                            
                                            this.localItemCode=param;
                                    

                               }
                            

                        /**
                        * field for ItemName
                        */

                        
                                    protected java.lang.String localItemName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getItemName(){
                               return localItemName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemName
                               */
                               public void setItemName(java.lang.String param){
                            
                                            this.localItemName=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText[] localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText[]
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText[] getDescription(){
                               return localDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for Description
                               */
                              protected void validateDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Description
                              */
                              public void setDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                              
                                   validateDescription(param);

                               
                                      this.localDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.DescriptiveText
                             */
                             public void addDescription(com.cloudkey.pms.micros.og.common.DescriptiveText param){
                                   if (localDescription == null){
                                   localDescription = new com.cloudkey.pms.micros.og.common.DescriptiveText[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDescription);
                               list.add(param);
                               this.localDescription =
                             (com.cloudkey.pms.micros.og.common.DescriptiveText[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.DescriptiveText[list.size()]);

                             }
                             

                        /**
                        * field for SellControl
                        */

                        
                                    protected java.lang.String localSellControl ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSellControl(){
                               return localSellControl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SellControl
                               */
                               public void setSellControl(java.lang.String param){
                            
                                            this.localSellControl=param;
                                    

                               }
                            

                        /**
                        * field for SellSeparate
                        */

                        
                                    protected java.lang.String localSellSeparate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSellSeparate(){
                               return localSellSeparate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SellSeparate
                               */
                               public void setSellSeparate(java.lang.String param){
                            
                                            this.localSellSeparate=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        */

                        
                                    protected int localQuantity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuantityTracker = false ;

                           public boolean isQuantitySpecified(){
                               return localQuantityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getQuantity(){
                               return localQuantity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Quantity
                               */
                               public void setQuantity(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localQuantityTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for Available
                        */

                        
                                    protected int localAvailable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvailableTracker = false ;

                           public boolean isAvailableSpecified(){
                               return localAvailableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAvailable(){
                               return localAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Available
                               */
                               public void setAvailable(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localAvailableTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localAvailable=param;
                                    

                               }
                            

                        /**
                        * field for ItemGroup
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement localItemGroup ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement getItemGroup(){
                               return localItemGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemGroup
                               */
                               public void setItemGroup(com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement param){
                            
                                            this.localItemGroup=param;
                                    

                               }
                            

                        /**
                        * field for ItemDuration
                        */

                        
                                    protected int localItemDuration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemDurationTracker = false ;

                           public boolean isItemDurationSpecified(){
                               return localItemDurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getItemDuration(){
                               return localItemDuration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemDuration
                               */
                               public void setItemDuration(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localItemDurationTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localItemDuration=param;
                                    

                               }
                            

                        /**
                        * field for ItemBeginDate
                        */

                        
                                    protected java.util.Date localItemBeginDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemBeginDateTracker = false ;

                           public boolean isItemBeginDateSpecified(){
                               return localItemBeginDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getItemBeginDate(){
                               return localItemBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemBeginDate
                               */
                               public void setItemBeginDate(java.util.Date param){
                            localItemBeginDateTracker = param != null;
                                   
                                            this.localItemBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for ItemEndDate
                        */

                        
                                    protected java.util.Date localItemEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localItemEndDateTracker = false ;

                           public boolean isItemEndDateSpecified(){
                               return localItemEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getItemEndDate(){
                               return localItemEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemEndDate
                               */
                               public void setItemEndDate(java.util.Date param){
                            localItemEndDateTracker = param != null;
                                   
                                            this.localItemEndDate=param;
                                    

                               }
                            

                        /**
                        * field for IsPackage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsPackage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsPackage(){
                               return localIsPackage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsPackage
                               */
                               public void setIsPackage(boolean param){
                            
                                            this.localIsPackage=param;
                                    

                               }
                            

                        /**
                        * field for IsChild
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsChild ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsChild(){
                               return localIsChild;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsChild
                               */
                               public void setIsChild(boolean param){
                            
                                            this.localIsChild=param;
                                    

                               }
                            

                        /**
                        * field for ItemDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localItemDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getItemDate(){
                               return localItemDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ItemDate
                               */
                               public void setItemDate(java.util.Date param){
                            
                                            this.localItemDate=param;
                                    

                               }
                            

                        /**
                        * field for IsOutSideStayDate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsOutSideStayDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsOutSideStayDate(){
                               return localIsOutSideStayDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsOutSideStayDate
                               */
                               public void setIsOutSideStayDate(boolean param){
                            
                                            this.localIsOutSideStayDate=param;
                                    

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
                           namespacePrefix+":InventoryItemElement",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "InventoryItemElement",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "isPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsPackage), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "isChild",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsChild), xmlWriter);

                                            
                                      }
                                    
                                            if (localItemDate != null){
                                        
                                                writeAttribute("",
                                                         "ItemDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "isOutSideStayDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsOutSideStayDate), xmlWriter);

                                            
                                      }
                                    
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemCode", xmlWriter);
                             

                                          if (localItemCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localItemCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemName", xmlWriter);
                             

                                          if (localItemName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localItemName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                       if (localDescription!=null){
                                            for (int i = 0;i < localDescription.length;i++){
                                                if (localDescription[i] != null){
                                                 localDescription[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        
                                    }
                                 
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "SellControl", xmlWriter);
                             

                                          if (localSellControl==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SellControl cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSellControl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "SellSeparate", xmlWriter);
                             

                                          if (localSellSeparate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SellSeparate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSellSeparate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localQuantityTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Quantity", xmlWriter);
                             
                                               if (localQuantity==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Quantity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAvailableTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "Available", xmlWriter);
                             
                                               if (localAvailable==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Available cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localItemGroup==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ItemGroup cannot be null!!");
                                            }
                                           localItemGroup.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemGroup"),
                                               xmlWriter);
                                         if (localItemDurationTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemDuration", xmlWriter);
                             
                                               if (localItemDuration==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ItemDuration cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemDuration));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localItemBeginDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemBeginDate", xmlWriter);
                             

                                          if (localItemBeginDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemBeginDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemBeginDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localItemEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "ItemEndDate", xmlWriter);
                             

                                          if (localItemEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ItemEndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
                return "ns4";
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemCode"));
                                 
                                        if (localItemCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemCode cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemName"));
                                 
                                        if (localItemName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemName cannot be null!!");
                                        }
                                    
                             if (localDescription!=null) {
                                 for (int i = 0;i < localDescription.length;i++){

                                    if (localDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "Description"));
                                         elementList.add(localDescription[i]);
                                    } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Description cannot be null !!");
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    
                             }

                        
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "SellControl"));
                                 
                                        if (localSellControl != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellControl));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SellControl cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "SellSeparate"));
                                 
                                        if (localSellSeparate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellSeparate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SellSeparate cannot be null!!");
                                        }
                                     if (localQuantityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Quantity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                            } if (localAvailableTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Available"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvailable));
                            }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemGroup"));
                            
                            
                                    if (localItemGroup==null){
                                         throw new org.apache.axis2.databinding.ADBException("ItemGroup cannot be null!!");
                                    }
                                    elementList.add(localItemGroup);
                                 if (localItemDurationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemDuration"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemDuration));
                            } if (localItemBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemBeginDate"));
                                 
                                        if (localItemBeginDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemBeginDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemBeginDate cannot be null!!");
                                        }
                                    } if (localItemEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "ItemEndDate"));
                                 
                                        if (localItemEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ItemEndDate cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","isPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsPackage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","isChild"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsChild));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ItemDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localItemDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","isOutSideStayDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsOutSideStayDate));
                                

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
        public static InventoryItemElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            InventoryItemElement object =
                new InventoryItemElement();

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
                    
                            if (!"InventoryItemElement".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InventoryItemElement)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "isPackage"
                    java.lang.String tempAttribIsPackage =
                        
                                reader.getAttributeValue(null,"isPackage");
                            
                   if (tempAttribIsPackage!=null){
                         java.lang.String content = tempAttribIsPackage;
                        
                                                 object.setIsPackage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsPackage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("isPackage");
                    
                    // handle attribute "isChild"
                    java.lang.String tempAttribIsChild =
                        
                                reader.getAttributeValue(null,"isChild");
                            
                   if (tempAttribIsChild!=null){
                         java.lang.String content = tempAttribIsChild;
                        
                                                 object.setIsChild(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsChild));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("isChild");
                    
                    // handle attribute "ItemDate"
                    java.lang.String tempAttribItemDate =
                        
                                reader.getAttributeValue(null,"ItemDate");
                            
                   if (tempAttribItemDate!=null){
                         java.lang.String content = tempAttribItemDate;
                        
                                                 object.setItemDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribItemDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ItemDate");
                    
                    // handle attribute "isOutSideStayDate"
                    java.lang.String tempAttribIsOutSideStayDate =
                        
                                reader.getAttributeValue(null,"isOutSideStayDate");
                            
                   if (tempAttribIsOutSideStayDate!=null){
                         java.lang.String content = tempAttribIsOutSideStayDate;
                        
                                                 object.setIsOutSideStayDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsOutSideStayDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("isOutSideStayDate");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                                                    list3.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDescription((com.cloudkey.pms.micros.og.common.DescriptiveText[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.DescriptiveText.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","SellControl").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SellControl" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSellControl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","SellSeparate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SellSeparate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSellSeparate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Quantity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Quantity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setQuantity(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Available").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Available" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAvailable(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemGroup").equals(reader.getName())){
                                
                                                object.setItemGroup(com.cloudkey.pms.micros.og.hotelcommon.ItemGroupElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemDuration").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemDuration" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemDuration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setItemDuration(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemBeginDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemBeginDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ItemEndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ItemEndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setItemEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
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
           
    