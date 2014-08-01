
/**
 * Claim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.common;
            

            /**
            *  Claim bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Claim
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Claim
                Namespace URI = http://webservices.micros.com/og/4.3/Common/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for ClaimId
                        */

                        
                                    protected double localClaimId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimIdTracker = false ;

                           public boolean isClaimIdSpecified(){
                               return localClaimIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClaimId(){
                               return localClaimId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimId
                               */
                               public void setClaimId(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClaimIdTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClaimId=param;
                                    

                               }
                            

                        /**
                        * field for ClaimDate
                        */

                        
                                    protected java.util.Date localClaimDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimDateTracker = false ;

                           public boolean isClaimDateSpecified(){
                               return localClaimDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getClaimDate(){
                               return localClaimDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimDate
                               */
                               public void setClaimDate(java.util.Date param){
                            localClaimDateTracker = param != null;
                                   
                                            this.localClaimDate=param;
                                    

                               }
                            

                        /**
                        * field for ClaimType
                        */

                        
                                    protected java.lang.String localClaimType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimTypeTracker = false ;

                           public boolean isClaimTypeSpecified(){
                               return localClaimTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClaimType(){
                               return localClaimType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimType
                               */
                               public void setClaimType(java.lang.String param){
                            localClaimTypeTracker = param != null;
                                   
                                            this.localClaimType=param;
                                    

                               }
                            

                        /**
                        * field for RecordType
                        */

                        
                                    protected java.lang.String localRecordType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordTypeTracker = false ;

                           public boolean isRecordTypeSpecified(){
                               return localRecordTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRecordType(){
                               return localRecordType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecordType
                               */
                               public void setRecordType(java.lang.String param){
                            localRecordTypeTracker = param != null;
                                   
                                            this.localRecordType=param;
                                    

                               }
                            

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
                        * field for ClaimStatus
                        */

                        
                                    protected java.lang.String localClaimStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimStatusTracker = false ;

                           public boolean isClaimStatusSpecified(){
                               return localClaimStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClaimStatus(){
                               return localClaimStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimStatus
                               */
                               public void setClaimStatus(java.lang.String param){
                            localClaimStatusTracker = param != null;
                                   
                                            this.localClaimStatus=param;
                                    

                               }
                            

                        /**
                        * field for FinalStatus
                        */

                        
                                    protected java.lang.String localFinalStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFinalStatusTracker = false ;

                           public boolean isFinalStatusSpecified(){
                               return localFinalStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFinalStatus(){
                               return localFinalStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FinalStatus
                               */
                               public void setFinalStatus(java.lang.String param){
                            localFinalStatusTracker = param != null;
                                   
                                            this.localFinalStatus=param;
                                    

                               }
                            

                        /**
                        * field for ClaimInformation
                        */

                        
                                    protected java.lang.String localClaimInformation ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClaimInformation(){
                               return localClaimInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimInformation
                               */
                               public void setClaimInformation(java.lang.String param){
                            
                                            this.localClaimInformation=param;
                                    

                               }
                            

                        /**
                        * field for CloseDate
                        */

                        
                                    protected java.util.Date localCloseDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCloseDateTracker = false ;

                           public boolean isCloseDateSpecified(){
                               return localCloseDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getCloseDate(){
                               return localCloseDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CloseDate
                               */
                               public void setCloseDate(java.util.Date param){
                            localCloseDateTracker = param != null;
                                   
                                            this.localCloseDate=param;
                                    

                               }
                            

                        /**
                        * field for ClaimSource
                        */

                        
                                    protected java.lang.String localClaimSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimSourceTracker = false ;

                           public boolean isClaimSourceSpecified(){
                               return localClaimSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClaimSource(){
                               return localClaimSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimSource
                               */
                               public void setClaimSource(java.lang.String param){
                            localClaimSourceTracker = param != null;
                                   
                                            this.localClaimSource=param;
                                    

                               }
                            

                        /**
                        * field for CallerName
                        */

                        
                                    protected java.lang.String localCallerName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCallerNameTracker = false ;

                           public boolean isCallerNameSpecified(){
                               return localCallerNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCallerName(){
                               return localCallerName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CallerName
                               */
                               public void setCallerName(java.lang.String param){
                            localCallerNameTracker = param != null;
                                   
                                            this.localCallerName=param;
                                    

                               }
                            

                        /**
                        * field for Owner
                        */

                        
                                    protected java.lang.String localOwner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOwnerTracker = false ;

                           public boolean isOwnerSpecified(){
                               return localOwnerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOwner(){
                               return localOwner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Owner
                               */
                               public void setOwner(java.lang.String param){
                            localOwnerTracker = param != null;
                                   
                                            this.localOwner=param;
                                    

                               }
                            

                        /**
                        * field for NameID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localNameID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameIDTracker = false ;

                           public boolean isNameIDSpecified(){
                               return localNameIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getNameID(){
                               return localNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameID
                               */
                               public void setNameID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localNameIDTracker = param != null;
                                   
                                            this.localNameID=param;
                                    

                               }
                            

                        /**
                        * field for MembershipID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localMembershipID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipIDTracker = false ;

                           public boolean isMembershipIDSpecified(){
                               return localMembershipIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getMembershipID(){
                               return localMembershipID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipID
                               */
                               public void setMembershipID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localMembershipIDTracker = param != null;
                                   
                                            this.localMembershipID=param;
                                    

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
                        * field for MembershipCardNumber
                        */

                        
                                    protected java.lang.String localMembershipCardNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipCardNumberTracker = false ;

                           public boolean isMembershipCardNumberSpecified(){
                               return localMembershipCardNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMembershipCardNumber(){
                               return localMembershipCardNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipCardNumber
                               */
                               public void setMembershipCardNumber(java.lang.String param){
                            localMembershipCardNumberTracker = param != null;
                                   
                                            this.localMembershipCardNumber=param;
                                    

                               }
                            

                        /**
                        * field for PmsReferenceNumber
                        */

                        
                                    protected java.lang.String localPmsReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPmsReferenceNumberTracker = false ;

                           public boolean isPmsReferenceNumberSpecified(){
                               return localPmsReferenceNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPmsReferenceNumber(){
                               return localPmsReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PmsReferenceNumber
                               */
                               public void setPmsReferenceNumber(java.lang.String param){
                            localPmsReferenceNumberTracker = param != null;
                                   
                                            this.localPmsReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for OrsReferenceNumber
                        */

                        
                                    protected java.lang.String localOrsReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrsReferenceNumberTracker = false ;

                           public boolean isOrsReferenceNumberSpecified(){
                               return localOrsReferenceNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOrsReferenceNumber(){
                               return localOrsReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrsReferenceNumber
                               */
                               public void setOrsReferenceNumber(java.lang.String param){
                            localOrsReferenceNumberTracker = param != null;
                                   
                                            this.localOrsReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for ClaimComments
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ClaimCommentsList localClaimComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimCommentsTracker = false ;

                           public boolean isClaimCommentsSpecified(){
                               return localClaimCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ClaimCommentsList
                           */
                           public  com.cloudkey.pms.micros.og.common.ClaimCommentsList getClaimComments(){
                               return localClaimComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimComments
                               */
                               public void setClaimComments(com.cloudkey.pms.micros.og.common.ClaimCommentsList param){
                            localClaimCommentsTracker = param != null;
                                   
                                            this.localClaimComments=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected java.util.Date localStartDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartDateTracker = false ;

                           public boolean isStartDateSpecified(){
                               return localStartDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Date param){
                            localStartDateTracker = param != null;
                                   
                                            this.localStartDate=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Common/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Claim",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Claim",
                           xmlWriter);
                   }

               
                   }
                if (localClaimIdTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimId", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClaimId)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ClaimId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimDate", xmlWriter);
                             

                                          if (localClaimDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ClaimDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimType", xmlWriter);
                             

                                          if (localClaimType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ClaimType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClaimType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecordTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "RecordType", xmlWriter);
                             

                                          if (localRecordType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RecordType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRecordType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResortTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "Resort", xmlWriter);
                             

                                          if (localResort==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResort);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimStatusTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimStatus", xmlWriter);
                             

                                          if (localClaimStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ClaimStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClaimStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFinalStatusTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "FinalStatus", xmlWriter);
                             

                                          if (localFinalStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FinalStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFinalStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimInformation", xmlWriter);
                             

                                          if (localClaimInformation==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ClaimInformation cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClaimInformation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCloseDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "CloseDate", xmlWriter);
                             

                                          if (localCloseDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CloseDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCloseDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimSourceTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "ClaimSource", xmlWriter);
                             

                                          if (localClaimSource==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ClaimSource cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClaimSource);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCallerNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "CallerName", xmlWriter);
                             

                                          if (localCallerName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CallerName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCallerName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOwnerTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "Owner", xmlWriter);
                             

                                          if (localOwner==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOwner);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameIDTracker){
                                            if (localNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                            }
                                           localNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","NameID"),
                                               xmlWriter);
                                        } if (localMembershipIDTracker){
                                            if (localMembershipID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MembershipID cannot be null!!");
                                            }
                                           localMembershipID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","MembershipID"),
                                               xmlWriter);
                                        } if (localMembershipTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "MembershipType", xmlWriter);
                             

                                          if (localMembershipType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipCardNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "MembershipCardNumber", xmlWriter);
                             

                                          if (localMembershipCardNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MembershipCardNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMembershipCardNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPmsReferenceNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "PmsReferenceNumber", xmlWriter);
                             

                                          if (localPmsReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PmsReferenceNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPmsReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOrsReferenceNumberTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "OrsReferenceNumber", xmlWriter);
                             

                                          if (localOrsReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("OrsReferenceNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOrsReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClaimCommentsTracker){
                                            if (localClaimComments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ClaimComments cannot be null!!");
                                            }
                                           localClaimComments.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimComments"),
                                               xmlWriter);
                                        } if (localStartDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "StartDate", xmlWriter);
                             

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Common/";
                                    writeStartElement(null, namespace, "EndDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Common/")){
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

                 if (localClaimIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimId));
                            } if (localClaimDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimDate"));
                                 
                                        if (localClaimDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ClaimDate cannot be null!!");
                                        }
                                    } if (localClaimTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimType"));
                                 
                                        if (localClaimType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ClaimType cannot be null!!");
                                        }
                                    } if (localRecordTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "RecordType"));
                                 
                                        if (localRecordType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RecordType cannot be null!!");
                                        }
                                    } if (localResortTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "Resort"));
                                 
                                        if (localResort != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResort));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                        }
                                    } if (localClaimStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimStatus"));
                                 
                                        if (localClaimStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ClaimStatus cannot be null!!");
                                        }
                                    } if (localFinalStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "FinalStatus"));
                                 
                                        if (localFinalStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinalStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FinalStatus cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimInformation"));
                                 
                                        if (localClaimInformation != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimInformation));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ClaimInformation cannot be null!!");
                                        }
                                     if (localCloseDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "CloseDate"));
                                 
                                        if (localCloseDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCloseDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CloseDate cannot be null!!");
                                        }
                                    } if (localClaimSourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimSource"));
                                 
                                        if (localClaimSource != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClaimSource));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ClaimSource cannot be null!!");
                                        }
                                    } if (localCallerNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "CallerName"));
                                 
                                        if (localCallerName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCallerName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CallerName cannot be null!!");
                                        }
                                    } if (localOwnerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "Owner"));
                                 
                                        if (localOwner != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");
                                        }
                                    } if (localNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "NameID"));
                            
                            
                                    if (localNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameID cannot be null!!");
                                    }
                                    elementList.add(localNameID);
                                } if (localMembershipIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "MembershipID"));
                            
                            
                                    if (localMembershipID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MembershipID cannot be null!!");
                                    }
                                    elementList.add(localMembershipID);
                                } if (localMembershipTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "MembershipType"));
                                 
                                        if (localMembershipType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipType cannot be null!!");
                                        }
                                    } if (localMembershipCardNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "MembershipCardNumber"));
                                 
                                        if (localMembershipCardNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipCardNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MembershipCardNumber cannot be null!!");
                                        }
                                    } if (localPmsReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "PmsReferenceNumber"));
                                 
                                        if (localPmsReferenceNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPmsReferenceNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PmsReferenceNumber cannot be null!!");
                                        }
                                    } if (localOrsReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "OrsReferenceNumber"));
                                 
                                        if (localOrsReferenceNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrsReferenceNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("OrsReferenceNumber cannot be null!!");
                                        }
                                    } if (localClaimCommentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "ClaimComments"));
                            
                            
                                    if (localClaimComments==null){
                                         throw new org.apache.axis2.databinding.ADBException("ClaimComments cannot be null!!");
                                    }
                                    elementList.add(localClaimComments);
                                } if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "StartDate"));
                                 
                                        if (localStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                        }
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/",
                                                                      "EndDate"));
                                 
                                        if (localEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
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
        public static Claim parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Claim object =
                new Claim();

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
                    
                            if (!"Claim".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Claim)com.cloudkey.pms.micros.ows.name.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClaimId(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","RecordType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RecordType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecordType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","Resort").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimStatus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimStatus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","FinalStatus").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FinalStatus" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFinalStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimInformation").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimInformation" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimInformation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","CloseDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CloseDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCloseDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimSource").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ClaimSource" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClaimSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","CallerName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CallerName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCallerName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","Owner").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Owner" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOwner(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","NameID").equals(reader.getName())){
                                
                                                object.setNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","MembershipID").equals(reader.getName())){
                                
                                                object.setMembershipID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","MembershipType").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","MembershipCardNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"MembershipCardNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMembershipCardNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","PmsReferenceNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"PmsReferenceNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPmsReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","OrsReferenceNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"OrsReferenceNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOrsReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","ClaimComments").equals(reader.getName())){
                                
                                                object.setClaimComments(com.cloudkey.pms.micros.og.common.ClaimCommentsList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","StartDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StartDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Common/","EndDate").equals(reader.getName())){
                                
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
           
    