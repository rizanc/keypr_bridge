
/**
 * FetchAvailablePackagesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.availability;
            

            /**
            *  FetchAvailablePackagesRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FetchAvailablePackagesRequest
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://webservices.micros.com/ows/5.1/Availability.wsdl",
                "FetchAvailablePackagesRequest",
                "ns7");

            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.HotelReference
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.HotelReference getHotelReference(){
                               return localHotelReference;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HotelReference
                               */
                               public void setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference param){
                            
                                            this.localHotelReference=param;
                                    

                               }
                            

                        /**
                        * field for ConfirmationNumber
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localConfirmationNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfirmationNumberTracker = false ;

                           public boolean isConfirmationNumberSpecified(){
                               return localConfirmationNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getConfirmationNumber(){
                               return localConfirmationNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfirmationNumber
                               */
                               public void setConfirmationNumber(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localConfirmationNumberTracker = param != null;
                                   
                                            this.localConfirmationNumber=param;
                                    

                               }
                            

                        /**
                        * field for ResvNameId
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localResvNameId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResvNameIdTracker = false ;

                           public boolean isResvNameIdSpecified(){
                               return localResvNameIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getResvNameId(){
                               return localResvNameId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResvNameId
                               */
                               public void setResvNameId(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localResvNameIdTracker = param != null;
                                   
                                            this.localResvNameId=param;
                                    

                               }
                            

                        /**
                        * field for LegNumber
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localLegNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLegNumberTracker = false ;

                           public boolean isLegNumberSpecified(){
                               return localLegNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getLegNumber(){
                               return localLegNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LegNumber
                               */
                               public void setLegNumber(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localLegNumberTracker = param != null;
                                   
                                            this.localLegNumber=param;
                                    

                               }
                            

                        /**
                        * field for StayDateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localStayDateRange ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getStayDateRange(){
                               return localStayDateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayDateRange
                               */
                               public void setStayDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            
                                            this.localStayDateRange=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfRooms
                        */

                        
                                    protected int localNumberOfRooms ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfRoomsTracker = false ;

                           public boolean isNumberOfRoomsSpecified(){
                               return localNumberOfRoomsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfRooms(){
                               return localNumberOfRooms;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfRooms
                               */
                               public void setNumberOfRooms(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfRoomsTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfRooms=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfAdults
                        */

                        
                                    protected int localNumberOfAdults ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfAdultsTracker = false ;

                           public boolean isNumberOfAdultsSpecified(){
                               return localNumberOfAdultsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfAdults(){
                               return localNumberOfAdults;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfAdults
                               */
                               public void setNumberOfAdults(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfAdultsTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfAdults=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfChildren
                        */

                        
                                    protected int localNumberOfChildren ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfChildrenTracker = false ;

                           public boolean isNumberOfChildrenSpecified(){
                               return localNumberOfChildrenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfChildren(){
                               return localNumberOfChildren;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfChildren
                               */
                               public void setNumberOfChildren(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfChildrenTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfChildren=param;
                                    

                               }
                            

                        /**
                        * field for ChildAges
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.ChildAgeList localChildAges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildAgesTracker = false ;

                           public boolean isChildAgesSpecified(){
                               return localChildAgesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.ChildAgeList
                           */
                           public  com.cloudkey.pms.micros.og.availability.ChildAgeList getChildAges(){
                               return localChildAges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildAges
                               */
                               public void setChildAges(com.cloudkey.pms.micros.og.availability.ChildAgeList param){
                            localChildAgesTracker = param != null;
                                   
                                            this.localChildAges=param;
                                    

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
                        * field for GuaranteeCode
                        */

                        
                                    protected java.lang.String localGuaranteeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuaranteeCodeTracker = false ;

                           public boolean isGuaranteeCodeSpecified(){
                               return localGuaranteeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGuaranteeCode(){
                               return localGuaranteeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuaranteeCode
                               */
                               public void setGuaranteeCode(java.lang.String param){
                            localGuaranteeCodeTracker = param != null;
                                   
                                            this.localGuaranteeCode=param;
                                    

                               }
                            

                        /**
                        * field for ReturnAmountInPropertyCurrency
                        */

                        
                                    protected java.lang.String localReturnAmountInPropertyCurrency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnAmountInPropertyCurrencyTracker = false ;

                           public boolean isReturnAmountInPropertyCurrencySpecified(){
                               return localReturnAmountInPropertyCurrencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReturnAmountInPropertyCurrency(){
                               return localReturnAmountInPropertyCurrency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnAmountInPropertyCurrency
                               */
                               public void setReturnAmountInPropertyCurrency(java.lang.String param){
                            localReturnAmountInPropertyCurrencyTracker = param != null;
                                   
                                            this.localReturnAmountInPropertyCurrency=param;
                                    

                               }
                            

                        /**
                        * field for ReturnPackagesIncludedInRate
                        */

                        
                                    protected java.lang.String localReturnPackagesIncludedInRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReturnPackagesIncludedInRateTracker = false ;

                           public boolean isReturnPackagesIncludedInRateSpecified(){
                               return localReturnPackagesIncludedInRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReturnPackagesIncludedInRate(){
                               return localReturnPackagesIncludedInRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnPackagesIncludedInRate
                               */
                               public void setReturnPackagesIncludedInRate(java.lang.String param){
                            localReturnPackagesIncludedInRateTracker = param != null;
                                   
                                            this.localReturnPackagesIncludedInRate=param;
                                    

                               }
                            

                        /**
                        * field for PackageCodes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.availability.PackageCodesList localPackageCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageCodesTracker = false ;

                           public boolean isPackageCodesSpecified(){
                               return localPackageCodesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.availability.PackageCodesList
                           */
                           public  com.cloudkey.pms.micros.og.availability.PackageCodesList getPackageCodes(){
                               return localPackageCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageCodes
                               */
                               public void setPackageCodes(com.cloudkey.pms.micros.og.availability.PackageCodesList param){
                            localPackageCodesTracker = param != null;
                                   
                                            this.localPackageCodes=param;
                                    

                               }
                            

                        /**
                        * field for IncludeRestrictedPackage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludeRestrictedPackage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeRestrictedPackage(){
                               return localIncludeRestrictedPackage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeRestrictedPackage
                               */
                               public void setIncludeRestrictedPackage(boolean param){
                            
                                            this.localIncludeRestrictedPackage=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Availability.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FetchAvailablePackagesRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FetchAvailablePackagesRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "includeRestrictedPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeRestrictedPackage), xmlWriter);

                                            
                                      }
                                    
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReference"),
                                               xmlWriter);
                                         if (localConfirmationNumberTracker){
                                            if (localConfirmationNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                            }
                                           localConfirmationNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ConfirmationNumber"),
                                               xmlWriter);
                                        } if (localResvNameIdTracker){
                                            if (localResvNameId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResvNameId cannot be null!!");
                                            }
                                           localResvNameId.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ResvNameId"),
                                               xmlWriter);
                                        } if (localLegNumberTracker){
                                            if (localLegNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LegNumber cannot be null!!");
                                            }
                                           localLegNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","LegNumber"),
                                               xmlWriter);
                                        }
                                            if (localStayDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                            }
                                           localStayDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","StayDateRange"),
                                               xmlWriter);
                                         if (localNumberOfRoomsTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfRooms", xmlWriter);
                             
                                               if (localNumberOfRooms==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfRooms cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumberOfAdultsTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfAdults", xmlWriter);
                             
                                               if (localNumberOfAdults==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfAdults cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAdults));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumberOfChildrenTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "NumberOfChildren", xmlWriter);
                             
                                               if (localNumberOfChildren==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfChildren cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfChildren));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChildAgesTracker){
                                            if (localChildAges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ChildAges cannot be null!!");
                                            }
                                           localChildAges.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ChildAges"),
                                               xmlWriter);
                                        } if (localRateCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "RateCode", xmlWriter);
                             

                                          if (localRateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGuaranteeCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "GuaranteeCode", xmlWriter);
                             

                                          if (localGuaranteeCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("GuaranteeCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGuaranteeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnAmountInPropertyCurrencyTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "ReturnAmountInPropertyCurrency", xmlWriter);
                             

                                          if (localReturnAmountInPropertyCurrency==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReturnAmountInPropertyCurrency cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnAmountInPropertyCurrency);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReturnPackagesIncludedInRateTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Availability.wsdl";
                                    writeStartElement(null, namespace, "ReturnPackagesIncludedInRate", xmlWriter);
                             

                                          if (localReturnPackagesIncludedInRate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReturnPackagesIncludedInRate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnPackagesIncludedInRate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPackageCodesTracker){
                                            if (localPackageCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PackageCodes cannot be null!!");
                                            }
                                           localPackageCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","PackageCodes"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Availability.wsdl")){
                return "ns7";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                 if (localConfirmationNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "ConfirmationNumber"));
                            
                            
                                    if (localConfirmationNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                    }
                                    elementList.add(localConfirmationNumber);
                                } if (localResvNameIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "ResvNameId"));
                            
                            
                                    if (localResvNameId==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResvNameId cannot be null!!");
                                    }
                                    elementList.add(localResvNameId);
                                } if (localLegNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "LegNumber"));
                            
                            
                                    if (localLegNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("LegNumber cannot be null!!");
                                    }
                                    elementList.add(localLegNumber);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "StayDateRange"));
                            
                            
                                    if (localStayDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("StayDateRange cannot be null!!");
                                    }
                                    elementList.add(localStayDateRange);
                                 if (localNumberOfRoomsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfRooms"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfRooms));
                            } if (localNumberOfAdultsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfAdults"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfAdults));
                            } if (localNumberOfChildrenTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "NumberOfChildren"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfChildren));
                            } if (localChildAgesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "ChildAges"));
                            
                            
                                    if (localChildAges==null){
                                         throw new org.apache.axis2.databinding.ADBException("ChildAges cannot be null!!");
                                    }
                                    elementList.add(localChildAges);
                                } if (localRateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "RateCode"));
                                 
                                        if (localRateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                        }
                                    } if (localGuaranteeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "GuaranteeCode"));
                                 
                                        if (localGuaranteeCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGuaranteeCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("GuaranteeCode cannot be null!!");
                                        }
                                    } if (localReturnAmountInPropertyCurrencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "ReturnAmountInPropertyCurrency"));
                                 
                                        if (localReturnAmountInPropertyCurrency != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnAmountInPropertyCurrency));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReturnAmountInPropertyCurrency cannot be null!!");
                                        }
                                    } if (localReturnPackagesIncludedInRateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "ReturnPackagesIncludedInRate"));
                                 
                                        if (localReturnPackagesIncludedInRate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnPackagesIncludedInRate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReturnPackagesIncludedInRate cannot be null!!");
                                        }
                                    } if (localPackageCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl",
                                                                      "PackageCodes"));
                            
                            
                                    if (localPackageCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("PackageCodes cannot be null!!");
                                    }
                                    elementList.add(localPackageCodes);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","includeRestrictedPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeRestrictedPackage));
                                

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
        public static FetchAvailablePackagesRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FetchAvailablePackagesRequest object =
                new FetchAvailablePackagesRequest();

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
                    
                            if (!"FetchAvailablePackagesRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FetchAvailablePackagesRequest)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "includeRestrictedPackage"
                    java.lang.String tempAttribIncludeRestrictedPackage =
                        
                                reader.getAttributeValue(null,"includeRestrictedPackage");
                            
                   if (tempAttribIncludeRestrictedPackage!=null){
                         java.lang.String content = tempAttribIncludeRestrictedPackage;
                        
                                                 object.setIncludeRestrictedPackage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludeRestrictedPackage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("includeRestrictedPackage");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ConfirmationNumber").equals(reader.getName())){
                                
                                                object.setConfirmationNumber(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ResvNameId").equals(reader.getName())){
                                
                                                object.setResvNameId(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","LegNumber").equals(reader.getName())){
                                
                                                object.setLegNumber(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","StayDateRange").equals(reader.getName())){
                                
                                                object.setStayDateRange(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfRooms").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfRooms" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfRooms(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfRooms(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfAdults").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfAdults" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfAdults(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfAdults(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","NumberOfChildren").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfChildren" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfChildren(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfChildren(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ChildAges").equals(reader.getName())){
                                
                                                object.setChildAges(com.cloudkey.pms.micros.og.availability.ChildAgeList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","RateCode").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","GuaranteeCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"GuaranteeCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGuaranteeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ReturnAmountInPropertyCurrency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnAmountInPropertyCurrency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnAmountInPropertyCurrency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","ReturnPackagesIncludedInRate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReturnPackagesIncludedInRate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnPackagesIncludedInRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Availability.wsdl","PackageCodes").equals(reader.getName())){
                                
                                                object.setPackageCodes(com.cloudkey.pms.micros.og.availability.PackageCodesList.Factory.parse(reader));
                                              
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
           
    