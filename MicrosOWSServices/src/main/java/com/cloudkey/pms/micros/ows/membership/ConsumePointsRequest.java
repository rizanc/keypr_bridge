
/**
 * ConsumePointsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.membership;
            

            /**
            *  ConsumePointsRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ConsumePointsRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/ows/5.1/Membership.wsdl",
                "ConsumePointsRequest",
                "ns6");

            

                        /**
                        * field for Result
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ResultStatus localResult ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ResultStatus
                           */
                           public  com.cloudkey.pms.micros.og.common.ResultStatus getResult(){
                               return localResult;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Result
                               */
                               public void setResult(com.cloudkey.pms.micros.og.common.ResultStatus param){
                            
                                            this.localResult=param;
                                    

                               }
                            

                        /**
                        * field for MembershipId
                        */

                        
                                    protected java.lang.String localMembershipId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipId(){
                               return localMembershipId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipId
                               */
                               public void setMembershipId(java.lang.String param){
                            
                                            this.localMembershipId=param;
                                    

                               }
                            

                        /**
                        * field for AwardType
                        */

                        
                                    protected java.lang.String localAwardType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAwardType(){
                               return localAwardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardType
                               */
                               public void setAwardType(java.lang.String param){
                            
                                            this.localAwardType=param;
                                    

                               }
                            

                        /**
                        * field for PointsRequired
                        */

                        
                                    protected double localPointsRequired ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getPointsRequired(){
                               return localPointsRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsRequired
                               */
                               public void setPointsRequired(double param){
                            
                                            this.localPointsRequired=param;
                                    

                               }
                            

                        /**
                        * field for ResortId
                        */

                        
                                    protected java.lang.String localResortId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResortId(){
                               return localResortId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResortId
                               */
                               public void setResortId(java.lang.String param){
                            
                                            this.localResortId=param;
                                    

                               }
                            

                        /**
                        * field for PmsResvNo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localPmsResvNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getPmsResvNo(){
                               return localPmsResvNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PmsResvNo
                               */
                               public void setPmsResvNo(com.cloudkey.pms.micros.og.common.UniqueID param){
                            
                                            this.localPmsResvNo=param;
                                    

                               }
                            

                        /**
                        * field for CrsResvNo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localCrsResvNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getCrsResvNo(){
                               return localCrsResvNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CrsResvNo
                               */
                               public void setCrsResvNo(com.cloudkey.pms.micros.og.common.UniqueID param){
                            
                                            this.localCrsResvNo=param;
                                    

                               }
                            

                        /**
                        * field for AwardSource
                        */

                        
                                    protected java.lang.String localAwardSource ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAwardSource(){
                               return localAwardSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardSource
                               */
                               public void setAwardSource(java.lang.String param){
                            
                                            this.localAwardSource=param;
                                    

                               }
                            

                        /**
                        * field for RateCode
                        */

                        
                                    protected java.lang.String localRateCode ;
                                

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
                            
                                            this.localRateCode=param;
                                    

                               }
                            

                        /**
                        * field for StayRecordId
                        */

                        
                                    protected double localStayRecordId ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getStayRecordId(){
                               return localStayRecordId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayRecordId
                               */
                               public void setStayRecordId(double param){
                            
                                            this.localStayRecordId=param;
                                    

                               }
                            

                        /**
                        * field for StayDates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localStayDates ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getStayDates(){
                               return localStayDates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayDates
                               */
                               public void setStayDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            
                                            this.localStayDates=param;
                                    

                               }
                            

                        /**
                        * field for RoomLabel
                        */

                        
                                    protected java.lang.String localRoomLabel ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomLabel(){
                               return localRoomLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomLabel
                               */
                               public void setRoomLabel(java.lang.String param){
                            
                                            this.localRoomLabel=param;
                                    

                               }
                            

                        /**
                        * field for FromRoomLabel
                        */

                        
                                    protected java.lang.String localFromRoomLabel ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFromRoomLabel(){
                               return localFromRoomLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromRoomLabel
                               */
                               public void setFromRoomLabel(java.lang.String param){
                            
                                            this.localFromRoomLabel=param;
                                    

                               }
                            

                        /**
                        * field for ToRoomLabel
                        */

                        
                                    protected java.lang.String localToRoomLabel ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRoomLabel(){
                               return localToRoomLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRoomLabel
                               */
                               public void setToRoomLabel(java.lang.String param){
                            
                                            this.localToRoomLabel=param;
                                    

                               }
                            

                        /**
                        * field for Product
                        */

                        
                                    protected java.lang.String localProduct ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProduct(){
                               return localProduct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Product
                               */
                               public void setProduct(java.lang.String param){
                            
                                            this.localProduct=param;
                                    

                               }
                            

                        /**
                        * field for IssueKey
                        */

                        
                                    protected java.lang.String localIssueKey ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssueKey(){
                               return localIssueKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueKey
                               */
                               public void setIssueKey(java.lang.String param){
                            
                                            this.localIssueKey=param;
                                    

                               }
                            

                        /**
                        * field for IssueKeyRaw
                        */

                        
                                    protected javax.activation.DataHandler localIssueKeyRaw ;
                                

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getIssueKeyRaw(){
                               return localIssueKeyRaw;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssueKeyRaw
                               */
                               public void setIssueKeyRaw(javax.activation.DataHandler param){
                            
                                            this.localIssueKeyRaw=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Membership.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ConsumePointsRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ConsumePointsRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localResult==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                            }
                                           localResult.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","Result"),
                                               xmlWriter);
                                        
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "MembershipId", xmlWriter);
                             

                                          if (localMembershipId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "AwardType", xmlWriter);
                             

                                          if (localAwardType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "PointsRequired", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localPointsRequired)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PointsRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "ResortId", xmlWriter);
                             

                                          if (localResortId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ResortId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResortId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localPmsResvNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PmsResvNo cannot be null!!");
                                            }
                                           localPmsResvNo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","PmsResvNo"),
                                               xmlWriter);
                                        
                                            if (localCrsResvNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CrsResvNo cannot be null!!");
                                            }
                                           localCrsResvNo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","CrsResvNo"),
                                               xmlWriter);
                                        
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "AwardSource", xmlWriter);
                             

                                          if (localAwardSource==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardSource cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardSource);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "RateCode", xmlWriter);
                             

                                          if (localRateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "StayRecordId", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localStayRecordId)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("StayRecordId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStayRecordId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localStayDates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayDates cannot be null!!");
                                            }
                                           localStayDates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","StayDates"),
                                               xmlWriter);
                                        
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "RoomLabel", xmlWriter);
                             

                                          if (localRoomLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomLabel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "FromRoomLabel", xmlWriter);
                             

                                          if (localFromRoomLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FromRoomLabel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFromRoomLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "ToRoomLabel", xmlWriter);
                             

                                          if (localToRoomLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRoomLabel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRoomLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "Product", xmlWriter);
                             

                                          if (localProduct==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Product cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProduct);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "IssueKey", xmlWriter);
                             

                                          if (localIssueKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssueKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssueKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://webservices.micros.com/ows/5.1/Membership.wsdl";
                                    writeStartElement(null, namespace, "IssueKeyRaw", xmlWriter);
                             
                                        
                                    if (localIssueKeyRaw!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localIssueKeyRaw, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for IssueKeyRaw", ex);
                                       }
                                    } else {
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Membership.wsdl")){
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "Result"));
                            
                            
                                    if (localResult==null){
                                         throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");
                                    }
                                    elementList.add(localResult);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "MembershipId"));
                                 
                                        if (localMembershipId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipId cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "AwardType"));
                                 
                                        if (localAwardType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardType cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "PointsRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "ResortId"));
                                 
                                        if (localResortId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResortId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ResortId cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "PmsResvNo"));
                            
                            
                                    if (localPmsResvNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("PmsResvNo cannot be null!!");
                                    }
                                    elementList.add(localPmsResvNo);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "CrsResvNo"));
                            
                            
                                    if (localCrsResvNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("CrsResvNo cannot be null!!");
                                    }
                                    elementList.add(localCrsResvNo);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "AwardSource"));
                                 
                                        if (localAwardSource != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardSource));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardSource cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "RateCode"));
                                 
                                        if (localRateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "StayRecordId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStayRecordId));
                            
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "StayDates"));
                            
                            
                                    if (localStayDates==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayDates cannot be null!!");
                                    }
                                    elementList.add(localStayDates);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "RoomLabel"));
                                 
                                        if (localRoomLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomLabel cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "FromRoomLabel"));
                                 
                                        if (localFromRoomLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromRoomLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FromRoomLabel cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "ToRoomLabel"));
                                 
                                        if (localToRoomLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRoomLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRoomLabel cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "Product"));
                                 
                                        if (localProduct != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProduct));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Product cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                                                      "IssueKey"));
                                 
                                        if (localIssueKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssueKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssueKey cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl",
                                        "IssueKeyRaw"));
                                
                            elementList.add(localIssueKeyRaw);
                        

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
        public static ConsumePointsRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ConsumePointsRequest object =
                new ConsumePointsRequest();

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
                    
                            if (!"ConsumePointsRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ConsumePointsRequest)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","Result").equals(reader.getName())){
                                
                                                object.setResult(com.cloudkey.pms.micros.og.common.ResultStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","MembershipId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","AwardType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","PointsRequired").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PointsRequired" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPointsRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","ResortId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ResortId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResortId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","PmsResvNo").equals(reader.getName())){
                                
                                                object.setPmsResvNo(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","CrsResvNo").equals(reader.getName())){
                                
                                                object.setCrsResvNo(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","AwardSource").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardSource" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","RateCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","StayRecordId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StayRecordId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStayRecordId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","StayDates").equals(reader.getName())){
                                
                                                object.setStayDates(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","RoomLabel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomLabel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","FromRoomLabel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FromRoomLabel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFromRoomLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","ToRoomLabel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRoomLabel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRoomLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","Product").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Product" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProduct(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","IssueKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IssueKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssueKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Membership.wsdl","IssueKeyRaw").equals(reader.getName())){
                                
                                            object.setIssueKeyRaw(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
    