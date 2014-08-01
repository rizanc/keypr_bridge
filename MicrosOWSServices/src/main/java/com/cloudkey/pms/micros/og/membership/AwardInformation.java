
/**
 * AwardInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  AwardInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AwardInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AwardInformation
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for Resort
                        */

                        
                                    protected java.lang.String localResort ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResortTracker = false ;

                           public boolean isResortSpecified(){
                               return localResortTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResort(){
                               return localResort;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Resort
                               */
                               public void setResort(java.lang.String param){
                            localResortTracker = param != null;
                                   
                                            this.localResort=param;
                                    

                               }
                            

                        /**
                        * field for AwardCode
                        */

                        
                                    protected java.lang.String localAwardCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardCodeTracker = false ;

                           public boolean isAwardCodeSpecified(){
                               return localAwardCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAwardCode(){
                               return localAwardCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardCode
                               */
                               public void setAwardCode(java.lang.String param){
                            localAwardCodeTracker = param != null;
                                   
                                            this.localAwardCode=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for BeginDate
                        */

                        
                                    protected java.util.Date localBeginDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBeginDateTracker = false ;

                           public boolean isBeginDateSpecified(){
                               return localBeginDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getBeginDate(){
                               return localBeginDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BeginDate
                               */
                               public void setBeginDate(java.util.Date param){
                            localBeginDateTracker = param != null;
                                   
                                            this.localBeginDate=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected java.util.Date localEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndDateTracker = false ;

                           public boolean isEndDateSpecified(){
                               return localEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(java.util.Date param){
                            localEndDateTracker = param != null;
                                   
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for Product
                        */

                        
                                    protected java.lang.String localProduct ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductTracker = false ;

                           public boolean isProductSpecified(){
                               return localProductTracker;
                           }

                           

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
                            localProductTracker = param != null;
                                   
                                            this.localProduct=param;
                                    

                               }
                            

                        /**
                        * field for ProductDescription
                        */

                        
                                    protected java.lang.String localProductDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductDescriptionTracker = false ;

                           public boolean isProductDescriptionSpecified(){
                               return localProductDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProductDescription(){
                               return localProductDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProductDescription
                               */
                               public void setProductDescription(java.lang.String param){
                            localProductDescriptionTracker = param != null;
                                   
                                            this.localProductDescription=param;
                                    

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
                        * field for RoomDescription
                        */

                        
                                    protected java.lang.String localRoomDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomDescriptionTracker = false ;

                           public boolean isRoomDescriptionSpecified(){
                               return localRoomDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomDescription(){
                               return localRoomDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomDescription
                               */
                               public void setRoomDescription(java.lang.String param){
                            localRoomDescriptionTracker = param != null;
                                   
                                            this.localRoomDescription=param;
                                    

                               }
                            

                        /**
                        * field for ToRoomType
                        */

                        
                                    protected java.lang.String localToRoomType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToRoomTypeTracker = false ;

                           public boolean isToRoomTypeSpecified(){
                               return localToRoomTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRoomType(){
                               return localToRoomType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRoomType
                               */
                               public void setToRoomType(java.lang.String param){
                            localToRoomTypeTracker = param != null;
                                   
                                            this.localToRoomType=param;
                                    

                               }
                            

                        /**
                        * field for ToRoomTypeDescription
                        */

                        
                                    protected java.lang.String localToRoomTypeDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToRoomTypeDescriptionTracker = false ;

                           public boolean isToRoomTypeDescriptionSpecified(){
                               return localToRoomTypeDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getToRoomTypeDescription(){
                               return localToRoomTypeDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToRoomTypeDescription
                               */
                               public void setToRoomTypeDescription(java.lang.String param){
                            localToRoomTypeDescriptionTracker = param != null;
                                   
                                            this.localToRoomTypeDescription=param;
                                    

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
                        * field for RateDescription
                        */

                        
                                    protected java.lang.String localRateDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateDescriptionTracker = false ;

                           public boolean isRateDescriptionSpecified(){
                               return localRateDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRateDescription(){
                               return localRateDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateDescription
                               */
                               public void setRateDescription(java.lang.String param){
                            localRateDescriptionTracker = param != null;
                                   
                                            this.localRateDescription=param;
                                    

                               }
                            

                        /**
                        * field for PointsRequired
                        */

                        
                                    protected double localPointsRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsRequiredTracker = false ;

                           public boolean isPointsRequiredSpecified(){
                               return localPointsRequiredTracker;
                           }

                           

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
                            
                                       // setting primitive attribute tracker to true
                                       localPointsRequiredTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localPointsRequired=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyDays
                        */

                        
                                    protected double localCancelPenaltyDays ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyDaysTracker = false ;

                           public boolean isCancelPenaltyDaysSpecified(){
                               return localCancelPenaltyDaysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCancelPenaltyDays(){
                               return localCancelPenaltyDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyDays
                               */
                               public void setCancelPenaltyDays(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCancelPenaltyDaysTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCancelPenaltyDays=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyCharge
                        */

                        
                                    protected double localCancelPenaltyCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyChargeTracker = false ;

                           public boolean isCancelPenaltyChargeSpecified(){
                               return localCancelPenaltyChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCancelPenaltyCharge(){
                               return localCancelPenaltyCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyCharge
                               */
                               public void setCancelPenaltyCharge(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCancelPenaltyChargeTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCancelPenaltyCharge=param;
                                    

                               }
                            

                        /**
                        * field for CancelPenaltyPoints
                        */

                        
                                    protected double localCancelPenaltyPoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCancelPenaltyPointsTracker = false ;

                           public boolean isCancelPenaltyPointsSpecified(){
                               return localCancelPenaltyPointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCancelPenaltyPoints(){
                               return localCancelPenaltyPoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CancelPenaltyPoints
                               */
                               public void setCancelPenaltyPoints(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCancelPenaltyPointsTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCancelPenaltyPoints=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Membership/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AwardInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AwardInformation",
                           xmlWriter);
                   }

               
                   }
                if (localResortTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "Resort", xmlWriter);
                             

                                          if (localResort==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResort);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAwardCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "AwardCode", xmlWriter);
                             

                                          if (localAwardCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "Description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBeginDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "BeginDate", xmlWriter);
                             

                                          if (localBeginDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BeginDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "EndDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "Product", xmlWriter);
                             

                                          if (localProduct==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Product cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProduct);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ProductDescription", xmlWriter);
                             

                                          if (localProductDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ProductDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProductDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "RoomType", xmlWriter);
                             

                                          if (localRoomType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoomDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "RoomDescription", xmlWriter);
                             

                                          if (localRoomDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoomDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToRoomTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ToRoomType", xmlWriter);
                             

                                          if (localToRoomType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRoomType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRoomType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToRoomTypeDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "ToRoomTypeDescription", xmlWriter);
                             

                                          if (localToRoomTypeDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ToRoomTypeDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localToRoomTypeDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "RateCode", xmlWriter);
                             

                                          if (localRateCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRateDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "RateDescription", xmlWriter);
                             

                                          if (localRateDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RateDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRateDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPointsRequiredTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "PointsRequired", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localPointsRequired)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PointsRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancelPenaltyDaysTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CancelPenaltyDays", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCancelPenaltyDays)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CancelPenaltyDays cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyDays));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancelPenaltyChargeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CancelPenaltyCharge", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCancelPenaltyCharge)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CancelPenaltyCharge cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyCharge));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCancelPenaltyPointsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "CancelPenaltyPoints", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCancelPenaltyPoints)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CancelPenaltyPoints cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyPoints));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
                return "ns5";
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

                 if (localResortTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Resort"));
                                 
                                        if (localResort != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResort));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                        }
                                    } if (localAwardCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardCode"));
                                 
                                        if (localAwardCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardCode cannot be null!!");
                                        }
                                    } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        }
                                    } if (localBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "BeginDate"));
                                 
                                        if (localBeginDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BeginDate cannot be null!!");
                                        }
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "EndDate"));
                                 
                                        if (localEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                        }
                                    } if (localProductTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Product"));
                                 
                                        if (localProduct != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProduct));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Product cannot be null!!");
                                        }
                                    } if (localProductDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ProductDescription"));
                                 
                                        if (localProductDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ProductDescription cannot be null!!");
                                        }
                                    } if (localRoomTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "RoomType"));
                                 
                                        if (localRoomType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomType cannot be null!!");
                                        }
                                    } if (localRoomDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "RoomDescription"));
                                 
                                        if (localRoomDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoomDescription cannot be null!!");
                                        }
                                    } if (localToRoomTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ToRoomType"));
                                 
                                        if (localToRoomType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRoomType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRoomType cannot be null!!");
                                        }
                                    } if (localToRoomTypeDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ToRoomTypeDescription"));
                                 
                                        if (localToRoomTypeDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localToRoomTypeDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ToRoomTypeDescription cannot be null!!");
                                        }
                                    } if (localRateCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "RateCode"));
                                 
                                        if (localRateCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateCode cannot be null!!");
                                        }
                                    } if (localRateDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "RateDescription"));
                                 
                                        if (localRateDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RateDescription cannot be null!!");
                                        }
                                    } if (localPointsRequiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PointsRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsRequired));
                            } if (localCancelPenaltyDaysTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyDays"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyDays));
                            } if (localCancelPenaltyChargeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyCharge"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyCharge));
                            } if (localCancelPenaltyPointsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CancelPenaltyPoints"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancelPenaltyPoints));
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
        public static AwardInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AwardInformation object =
                new AwardInformation();

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
                    
                            if (!"AwardInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AwardInformation)com.cloudkey.pms.micros.ows.information.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Resort").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Resort" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResort(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Description").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Description" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","BeginDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BeginDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBeginDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","EndDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"EndDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Product").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Product" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProduct(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ProductDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ProductDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProductDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","RoomType").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","RoomDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoomDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoomDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ToRoomType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRoomType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRoomType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ToRoomTypeDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ToRoomTypeDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setToRoomTypeDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","RateCode").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","RateDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RateDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRateDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PointsRequired").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PointsRequired" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPointsRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPointsRequired(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyDays").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CancelPenaltyDays" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCancelPenaltyDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCancelPenaltyDays(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyCharge").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CancelPenaltyCharge" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCancelPenaltyCharge(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCancelPenaltyCharge(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CancelPenaltyPoints").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CancelPenaltyPoints" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCancelPenaltyPoints(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCancelPenaltyPoints(java.lang.Double.NaN);
                                           
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
           
    