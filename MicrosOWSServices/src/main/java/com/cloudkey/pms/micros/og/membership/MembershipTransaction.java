
/**
 * MembershipTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  MembershipTransaction bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MembershipTransaction
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MembershipTransaction
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Points
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.Points localPoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsTracker = false ;

                           public boolean isPointsSpecified(){
                               return localPointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.Points
                           */
                           public  com.cloudkey.pms.micros.og.membership.Points getPoints(){
                               return localPoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Points
                               */
                               public void setPoints(com.cloudkey.pms.micros.og.membership.Points param){
                            localPointsTracker = param != null;
                                   
                                            this.localPoints=param;
                                    

                               }
                            

                        /**
                        * field for Tsc
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.Tsc localTsc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTscTracker = false ;

                           public boolean isTscSpecified(){
                               return localTscTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.Tsc
                           */
                           public  com.cloudkey.pms.micros.og.membership.Tsc getTsc(){
                               return localTsc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Tsc
                               */
                               public void setTsc(com.cloudkey.pms.micros.og.membership.Tsc param){
                            localTscTracker = param != null;
                                   
                                            this.localTsc=param;
                                    

                               }
                            

                        /**
                        * field for AwardLabel
                        */

                        
                                    protected java.lang.String localAwardLabel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardLabelTracker = false ;

                           public boolean isAwardLabelSpecified(){
                               return localAwardLabelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAwardLabel(){
                               return localAwardLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardLabel
                               */
                               public void setAwardLabel(java.lang.String param){
                            localAwardLabelTracker = param != null;
                                   
                                            this.localAwardLabel=param;
                                    

                               }
                            

                        /**
                        * field for TransferDescription
                        */

                        
                                    protected java.lang.String localTransferDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransferDescriptionTracker = false ;

                           public boolean isTransferDescriptionSpecified(){
                               return localTransferDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransferDescription(){
                               return localTransferDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransferDescription
                               */
                               public void setTransferDescription(java.lang.String param){
                            localTransferDescriptionTracker = param != null;
                                   
                                            this.localTransferDescription=param;
                                    

                               }
                            

                        /**
                        * field for UserNotes
                        */

                        
                                    protected java.lang.String localUserNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNotesTracker = false ;

                           public boolean isUserNotesSpecified(){
                               return localUserNotesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserNotes(){
                               return localUserNotes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserNotes
                               */
                               public void setUserNotes(java.lang.String param){
                            localUserNotesTracker = param != null;
                                   
                                            this.localUserNotes=param;
                                    

                               }
                            

                        /**
                        * field for PointsBreakups
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.ArrayOfPointsBreakup localPointsBreakups ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPointsBreakupsTracker = false ;

                           public boolean isPointsBreakupsSpecified(){
                               return localPointsBreakupsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.ArrayOfPointsBreakup
                           */
                           public  com.cloudkey.pms.micros.og.membership.ArrayOfPointsBreakup getPointsBreakups(){
                               return localPointsBreakups;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsBreakups
                               */
                               public void setPointsBreakups(com.cloudkey.pms.micros.og.membership.ArrayOfPointsBreakup param){
                            localPointsBreakupsTracker = param != null;
                                   
                                            this.localPointsBreakups=param;
                                    

                               }
                            

                        /**
                        * field for ProfileList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.ArrayOfFavoriteGuest localProfileList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileListTracker = false ;

                           public boolean isProfileListSpecified(){
                               return localProfileListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.ArrayOfFavoriteGuest
                           */
                           public  com.cloudkey.pms.micros.og.membership.ArrayOfFavoriteGuest getProfileList(){
                               return localProfileList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileList
                               */
                               public void setProfileList(com.cloudkey.pms.micros.og.membership.ArrayOfFavoriteGuest param){
                            localProfileListTracker = param != null;
                                   
                                            this.localProfileList=param;
                                    

                               }
                            

                        /**
                        * field for PostingDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localPostingDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPostingDate(){
                               return localPostingDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostingDate
                               */
                               public void setPostingDate(java.util.Date param){
                            
                                            this.localPostingDate=param;
                                    

                               }
                            

                        /**
                        * field for TransactionTypeCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionTypeCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionTypeCode(){
                               return localTransactionTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionTypeCode
                               */
                               public void setTransactionTypeCode(java.lang.String param){
                            
                                            this.localTransactionTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for Source
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localSource ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(java.lang.String param){
                            
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for ReferenceNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localReferenceNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReferenceNumber(){
                               return localReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReferenceNumber
                               */
                               public void setReferenceNumber(java.lang.String param){
                            
                                            this.localReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localStartDate ;
                                

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
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEndDate ;
                                

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
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for PointsCalculated
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPointsCalculated ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPointsCalculated(){
                               return localPointsCalculated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsCalculated
                               */
                               public void setPointsCalculated(boolean param){
                            
                                            this.localPointsCalculated=param;
                                    

                               }
                            

                        /**
                        * field for StatementId
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localStatementId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatementId(){
                               return localStatementId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatementId
                               */
                               public void setStatementId(java.lang.String param){
                            
                                            this.localStatementId=param;
                                    

                               }
                            

                        /**
                        * field for TransactionId
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localTransactionId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionId(){
                               return localTransactionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionId
                               */
                               public void setTransactionId(java.lang.String param){
                            
                                            this.localTransactionId=param;
                                    

                               }
                            

                        /**
                        * field for CrsReferenceNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCrsReferenceNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCrsReferenceNumber(){
                               return localCrsReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CrsReferenceNumber
                               */
                               public void setCrsReferenceNumber(java.lang.String param){
                            
                                            this.localCrsReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for Adjustment
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustment ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustment(){
                               return localAdjustment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Adjustment
                               */
                               public void setAdjustment(boolean param){
                            
                                            this.localAdjustment=param;
                                    

                               }
                            

                        /**
                        * field for Resort
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localResort ;
                                

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
                            
                                            this.localResort=param;
                                    

                               }
                            

                        /**
                        * field for PosCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPosCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPosCode(){
                               return localPosCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PosCode
                               */
                               public void setPosCode(java.lang.String param){
                            
                                            this.localPosCode=param;
                                    

                               }
                            

                        /**
                        * field for StayRecord
                        * This was an Attribute!
                        */

                        
                                    protected boolean localStayRecord ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getStayRecord(){
                               return localStayRecord;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StayRecord
                               */
                               public void setStayRecord(boolean param){
                            
                                            this.localStayRecord=param;
                                    

                               }
                            

                        /**
                        * field for TransactionDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localTransactionDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getTransactionDate(){
                               return localTransactionDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionDate
                               */
                               public void setTransactionDate(java.util.Date param){
                            
                                            this.localTransactionDate=param;
                                    

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
                           namespacePrefix+":MembershipTransaction",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MembershipTransaction",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPostingDate != null){
                                        
                                                writeAttribute("",
                                                         "postingDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionTypeCode != null){
                                        
                                                writeAttribute("",
                                                         "transactionTypeCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTypeCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localSource != null){
                                        
                                                writeAttribute("",
                                                         "source",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource), xmlWriter);

                                            
                                      }
                                    
                                            if (localReferenceNumber != null){
                                        
                                                writeAttribute("",
                                                         "referenceNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferenceNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localStartDate != null){
                                        
                                                writeAttribute("",
                                                         "startDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localEndDate != null){
                                        
                                                writeAttribute("",
                                                         "endDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "pointsCalculated",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsCalculated), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatementId != null){
                                        
                                                writeAttribute("",
                                                         "statementId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementId), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionId != null){
                                        
                                                writeAttribute("",
                                                         "transactionId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionId), xmlWriter);

                                            
                                      }
                                    
                                            if (localCrsReferenceNumber != null){
                                        
                                                writeAttribute("",
                                                         "crsReferenceNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCrsReferenceNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "adjustment",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustment), xmlWriter);

                                            
                                      }
                                    
                                            if (localResort != null){
                                        
                                                writeAttribute("",
                                                         "resort",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResort), xmlWriter);

                                            
                                      }
                                    
                                            if (localPosCode != null){
                                        
                                                writeAttribute("",
                                                         "posCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "stayRecord",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStayRecord), xmlWriter);

                                            
                                      }
                                    
                                            if (localTransactionDate != null){
                                        
                                                writeAttribute("",
                                                         "transactionDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate), xmlWriter);

                                            
                                      }
                                     if (localPointsTracker){
                                            if (localPoints==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Points cannot be null!!");
                                            }
                                           localPoints.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Points"),
                                               xmlWriter);
                                        } if (localTscTracker){
                                            if (localTsc==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Tsc cannot be null!!");
                                            }
                                           localTsc.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Tsc"),
                                               xmlWriter);
                                        } if (localAwardLabelTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "AwardLabel", xmlWriter);
                             

                                          if (localAwardLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AwardLabel cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAwardLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransferDescriptionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "TransferDescription", xmlWriter);
                             

                                          if (localTransferDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TransferDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransferDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserNotesTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Membership/";
                                    writeStartElement(null, namespace, "UserNotes", xmlWriter);
                             

                                          if (localUserNotes==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UserNotes cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserNotes);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPointsBreakupsTracker){
                                            if (localPointsBreakups==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PointsBreakups cannot be null!!");
                                            }
                                           localPointsBreakups.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PointsBreakups"),
                                               xmlWriter);
                                        } if (localProfileListTracker){
                                            if (localProfileList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ProfileList cannot be null!!");
                                            }
                                           localProfileList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ProfileList"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
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

                 if (localPointsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Points"));
                            
                            
                                    if (localPoints==null){
                                         throw new org.apache.axis2.databinding.ADBException("Points cannot be null!!");
                                    }
                                    elementList.add(localPoints);
                                } if (localTscTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "Tsc"));
                            
                            
                                    if (localTsc==null){
                                         throw new org.apache.axis2.databinding.ADBException("Tsc cannot be null!!");
                                    }
                                    elementList.add(localTsc);
                                } if (localAwardLabelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardLabel"));
                                 
                                        if (localAwardLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AwardLabel cannot be null!!");
                                        }
                                    } if (localTransferDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "TransferDescription"));
                                 
                                        if (localTransferDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransferDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TransferDescription cannot be null!!");
                                        }
                                    } if (localUserNotesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "UserNotes"));
                                 
                                        if (localUserNotes != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserNotes));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UserNotes cannot be null!!");
                                        }
                                    } if (localPointsBreakupsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "PointsBreakups"));
                            
                            
                                    if (localPointsBreakups==null){
                                         throw new org.apache.axis2.databinding.ADBException("PointsBreakups cannot be null!!");
                                    }
                                    elementList.add(localPointsBreakups);
                                } if (localProfileListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "ProfileList"));
                            
                            
                                    if (localProfileList==null){
                                         throw new org.apache.axis2.databinding.ADBException("ProfileList cannot be null!!");
                                    }
                                    elementList.add(localProfileList);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","postingDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","transactionTypeCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTypeCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","source"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","referenceNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferenceNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","startDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","endDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pointsCalculated"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsCalculated));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","statementId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","transactionId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","crsReferenceNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCrsReferenceNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","adjustment"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustment));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","resort"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResort));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","posCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","stayRecord"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStayRecord));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","transactionDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDate));
                                

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
        public static MembershipTransaction parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MembershipTransaction object =
                new MembershipTransaction();

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
                    
                            if (!"MembershipTransaction".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MembershipTransaction)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "postingDate"
                    java.lang.String tempAttribPostingDate =
                        
                                reader.getAttributeValue(null,"postingDate");
                            
                   if (tempAttribPostingDate!=null){
                         java.lang.String content = tempAttribPostingDate;
                        
                                                 object.setPostingDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribPostingDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("postingDate");
                    
                    // handle attribute "transactionTypeCode"
                    java.lang.String tempAttribTransactionTypeCode =
                        
                                reader.getAttributeValue(null,"transactionTypeCode");
                            
                   if (tempAttribTransactionTypeCode!=null){
                         java.lang.String content = tempAttribTransactionTypeCode;
                        
                                                 object.setTransactionTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionTypeCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("transactionTypeCode");
                    
                    // handle attribute "source"
                    java.lang.String tempAttribSource =
                        
                                reader.getAttributeValue(null,"source");
                            
                   if (tempAttribSource!=null){
                         java.lang.String content = tempAttribSource;
                        
                                                 object.setSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSource));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("source");
                    
                    // handle attribute "referenceNumber"
                    java.lang.String tempAttribReferenceNumber =
                        
                                reader.getAttributeValue(null,"referenceNumber");
                            
                   if (tempAttribReferenceNumber!=null){
                         java.lang.String content = tempAttribReferenceNumber;
                        
                                                 object.setReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReferenceNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("referenceNumber");
                    
                    // handle attribute "startDate"
                    java.lang.String tempAttribStartDate =
                        
                                reader.getAttributeValue(null,"startDate");
                            
                   if (tempAttribStartDate!=null){
                         java.lang.String content = tempAttribStartDate;
                        
                                                 object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribStartDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("startDate");
                    
                    // handle attribute "endDate"
                    java.lang.String tempAttribEndDate =
                        
                                reader.getAttributeValue(null,"endDate");
                            
                   if (tempAttribEndDate!=null){
                         java.lang.String content = tempAttribEndDate;
                        
                                                 object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEndDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("endDate");
                    
                    // handle attribute "pointsCalculated"
                    java.lang.String tempAttribPointsCalculated =
                        
                                reader.getAttributeValue(null,"pointsCalculated");
                            
                   if (tempAttribPointsCalculated!=null){
                         java.lang.String content = tempAttribPointsCalculated;
                        
                                                 object.setPointsCalculated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPointsCalculated));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("pointsCalculated");
                    
                    // handle attribute "statementId"
                    java.lang.String tempAttribStatementId =
                        
                                reader.getAttributeValue(null,"statementId");
                            
                   if (tempAttribStatementId!=null){
                         java.lang.String content = tempAttribStatementId;
                        
                                                 object.setStatementId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribStatementId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("statementId");
                    
                    // handle attribute "transactionId"
                    java.lang.String tempAttribTransactionId =
                        
                                reader.getAttributeValue(null,"transactionId");
                            
                   if (tempAttribTransactionId!=null){
                         java.lang.String content = tempAttribTransactionId;
                        
                                                 object.setTransactionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribTransactionId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("transactionId");
                    
                    // handle attribute "crsReferenceNumber"
                    java.lang.String tempAttribCrsReferenceNumber =
                        
                                reader.getAttributeValue(null,"crsReferenceNumber");
                            
                   if (tempAttribCrsReferenceNumber!=null){
                         java.lang.String content = tempAttribCrsReferenceNumber;
                        
                                                 object.setCrsReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCrsReferenceNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("crsReferenceNumber");
                    
                    // handle attribute "adjustment"
                    java.lang.String tempAttribAdjustment =
                        
                                reader.getAttributeValue(null,"adjustment");
                            
                   if (tempAttribAdjustment!=null){
                         java.lang.String content = tempAttribAdjustment;
                        
                                                 object.setAdjustment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustment));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("adjustment");
                    
                    // handle attribute "resort"
                    java.lang.String tempAttribResort =
                        
                                reader.getAttributeValue(null,"resort");
                            
                   if (tempAttribResort!=null){
                         java.lang.String content = tempAttribResort;
                        
                                                 object.setResort(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribResort));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("resort");
                    
                    // handle attribute "posCode"
                    java.lang.String tempAttribPosCode =
                        
                                reader.getAttributeValue(null,"posCode");
                            
                   if (tempAttribPosCode!=null){
                         java.lang.String content = tempAttribPosCode;
                        
                                                 object.setPosCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPosCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("posCode");
                    
                    // handle attribute "stayRecord"
                    java.lang.String tempAttribStayRecord =
                        
                                reader.getAttributeValue(null,"stayRecord");
                            
                   if (tempAttribStayRecord!=null){
                         java.lang.String content = tempAttribStayRecord;
                        
                                                 object.setStayRecord(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribStayRecord));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("stayRecord");
                    
                    // handle attribute "transactionDate"
                    java.lang.String tempAttribTransactionDate =
                        
                                reader.getAttributeValue(null,"transactionDate");
                            
                   if (tempAttribTransactionDate!=null){
                         java.lang.String content = tempAttribTransactionDate;
                        
                                                 object.setTransactionDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribTransactionDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("transactionDate");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Points").equals(reader.getName())){
                                
                                                object.setPoints(com.cloudkey.pms.micros.og.membership.Points.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Tsc").equals(reader.getName())){
                                
                                                object.setTsc(com.cloudkey.pms.micros.og.membership.Tsc.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardLabel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AwardLabel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAwardLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","TransferDescription").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TransferDescription" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransferDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","UserNotes").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UserNotes" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserNotes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","PointsBreakups").equals(reader.getName())){
                                
                                                object.setPointsBreakups(com.cloudkey.pms.micros.og.membership.ArrayOfPointsBreakup.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","ProfileList").equals(reader.getName())){
                                
                                                object.setProfileList(com.cloudkey.pms.micros.og.membership.ArrayOfFavoriteGuest.Factory.parse(reader));
                                              
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
           
    