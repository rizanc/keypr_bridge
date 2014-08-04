
/**
 * CheckInRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  CheckInRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CheckInRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CheckInRequest
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for ReservationRequest
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase localReservationRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationRequestTracker = false ;

                           public boolean isReservationRequestSpecified(){
                               return localReservationRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase getReservationRequest(){
                               return localReservationRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationRequest
                               */
                               public void setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase param){
                            localReservationRequestTracker = param != null;
                                   
                                            this.localReservationRequest=param;
                                    

                               }
                            

                        /**
                        * field for Printer
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.Printer localPrinter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrinterTracker = false ;

                           public boolean isPrinterSpecified(){
                               return localPrinterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.Printer
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.Printer getPrinter(){
                               return localPrinter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Printer
                               */
                               public void setPrinter(com.cloudkey.pms.micros.og.reservation.advanced.Printer param){
                            localPrinterTracker = param != null;
                                   
                                            this.localPrinter=param;
                                    

                               }
                            

                        /**
                        * field for CreditCardInfo
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo localCreditCardInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardInfoTracker = false ;

                           public boolean isCreditCardInfoSpecified(){
                               return localCreditCardInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo getCreditCardInfo(){
                               return localCreditCardInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditCardInfo
                               */
                               public void setCreditCardInfo(com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo param){
                            localCreditCardInfoTracker = param != null;
                                   
                                            this.localCreditCardInfo=param;
                                    

                               }
                            

                        /**
                        * field for Transactions
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.Transaction[] localTransactions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionsTracker = false ;

                           public boolean isTransactionsSpecified(){
                               return localTransactionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.Transaction[]
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.Transaction[] getTransactions(){
                               return localTransactions;
                           }

                           
                        


                               
                              /**
                               * validate the array for Transactions
                               */
                              protected void validateTransactions(com.cloudkey.pms.micros.og.reservation.advanced.Transaction[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Transactions
                              */
                              public void setTransactions(com.cloudkey.pms.micros.og.reservation.advanced.Transaction[] param){
                              
                                   validateTransactions(param);

                               localTransactionsTracker = param != null;
                                      
                                      this.localTransactions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.reservation.advanced.Transaction
                             */
                             public void addTransactions(com.cloudkey.pms.micros.og.reservation.advanced.Transaction param){
                                   if (localTransactions == null){
                                   localTransactions = new com.cloudkey.pms.micros.og.reservation.advanced.Transaction[]{};
                                   }

                            
                                 //update the setting tracker
                                localTransactionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTransactions);
                               list.add(param);
                               this.localTransactions =
                             (com.cloudkey.pms.micros.og.reservation.advanced.Transaction[])list.toArray(
                            new com.cloudkey.pms.micros.og.reservation.advanced.Transaction[list.size()]);

                             }
                             

                        /**
                        * field for SignedDocument
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.FileData localSignedDocument ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSignedDocumentTracker = false ;

                           public boolean isSignedDocumentSpecified(){
                               return localSignedDocumentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.FileData
                           */
                           public  com.cloudkey.pms.micros.og.common.FileData getSignedDocument(){
                               return localSignedDocument;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SignedDocument
                               */
                               public void setSignedDocument(com.cloudkey.pms.micros.og.common.FileData param){
                            localSignedDocumentTracker = param != null;
                                   
                                            this.localSignedDocument=param;
                                    

                               }
                            

                        /**
                        * field for MembershipsList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.ArrayOfNameMembership localMembershipsList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipsListTracker = false ;

                           public boolean isMembershipsListSpecified(){
                               return localMembershipsListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.ArrayOfNameMembership
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.ArrayOfNameMembership getMembershipsList(){
                               return localMembershipsList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipsList
                               */
                               public void setMembershipsList(com.cloudkey.pms.micros.og.reservation.advanced.ArrayOfNameMembership param){
                            localMembershipsListTracker = param != null;
                                   
                                            this.localMembershipsList=param;
                                    

                               }
                            

                        /**
                        * field for Keys
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.UnsignedShort localKeys ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.UnsignedShort
                           */
                           public  org.apache.axis2.databinding.types.UnsignedShort getKeys(){
                               return localKeys;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Keys
                               */
                               public void setKeys(org.apache.axis2.databinding.types.UnsignedShort param){
                            
                                            this.localKeys=param;
                                    

                               }
                            

                        /**
                        * field for KeyEncoder
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKeyEncoder ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyEncoder(){
                               return localKeyEncoder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyEncoder
                               */
                               public void setKeyEncoder(java.lang.String param){
                            
                                            this.localKeyEncoder=param;
                                    

                               }
                            

                        /**
                        * field for GetKeyTrack
                        * This was an Attribute!
                        */

                        
                                    protected boolean localGetKeyTrack ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getGetKeyTrack(){
                               return localGetKeyTrack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetKeyTrack
                               */
                               public void setGetKeyTrack(boolean param){
                            
                                            this.localGetKeyTrack=param;
                                    

                               }
                            

                        /**
                        * field for PrintRegistration
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPrintRegistration ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPrintRegistration(){
                               return localPrintRegistration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrintRegistration
                               */
                               public void setPrintRegistration(boolean param){
                            
                                            this.localPrintRegistration=param;
                                    

                               }
                            

                        /**
                        * field for ApprovalCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localApprovalCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getApprovalCode(){
                               return localApprovalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApprovalCode
                               */
                               public void setApprovalCode(java.lang.String param){
                            
                                            this.localApprovalCode=param;
                                    

                               }
                            

                        /**
                        * field for KeyExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Calendar localKeyExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getKeyExpirationDate(){
                               return localKeyExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyExpirationDate
                               */
                               public void setKeyExpirationDate(java.util.Calendar param){
                            
                                            this.localKeyExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for MobilePhoneAudioKey
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMobilePhoneAudioKey ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMobilePhoneAudioKey(){
                               return localMobilePhoneAudioKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobilePhoneAudioKey
                               */
                               public void setMobilePhoneAudioKey(boolean param){
                            
                                            this.localMobilePhoneAudioKey=param;
                                    

                               }
                            

                        /**
                        * field for MobilePhoneNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMobilePhoneNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMobilePhoneNumber(){
                               return localMobilePhoneNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobilePhoneNumber
                               */
                               public void setMobilePhoneNumber(java.lang.String param){
                            
                                            this.localMobilePhoneNumber=param;
                                    

                               }
                            

                        /**
                        * field for MobileKeyReferenceId
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localMobileKeyReferenceId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMobileKeyReferenceId(){
                               return localMobileKeyReferenceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobileKeyReferenceId
                               */
                               public void setMobileKeyReferenceId(java.lang.String param){
                            
                                            this.localMobileKeyReferenceId=param;
                                    

                               }
                            

                        /**
                        * field for KioskCall
                        * This was an Attribute!
                        */

                        
                                    protected boolean localKioskCall ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getKioskCall(){
                               return localKioskCall;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KioskCall
                               */
                               public void setKioskCall(boolean param){
                            
                                            this.localKioskCall=param;
                                    

                               }
                            

                        /**
                        * field for EmailFolio
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEmailFolio ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEmailFolio(){
                               return localEmailFolio;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailFolio
                               */
                               public void setEmailFolio(boolean param){
                            
                                            this.localEmailFolio=param;
                                    

                               }
                            

                        /**
                        * field for EmailStaff
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEmailStaff ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEmailStaff(){
                               return localEmailStaff;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailStaff
                               */
                               public void setEmailStaff(boolean param){
                            
                                            this.localEmailStaff=param;
                                    

                               }
                            

                        /**
                        * field for NoPost
                        * This was an Attribute!
                        */

                        
                                    protected boolean localNoPost ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNoPost(){
                               return localNoPost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoPost
                               */
                               public void setNoPost(boolean param){
                            
                                            this.localNoPost=param;
                                    

                               }
                            

                        /**
                        * field for DoNotMoveRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDoNotMoveRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoNotMoveRoom(){
                               return localDoNotMoveRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoNotMoveRoom
                               */
                               public void setDoNotMoveRoom(boolean param){
                            
                                            this.localDoNotMoveRoom=param;
                                    

                               }
                            

                        /**
                        * field for DCCCheck
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDCCCheck ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDCCCheck(){
                               return localDCCCheck;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DCCCheck
                               */
                               public void setDCCCheck(boolean param){
                            
                                            this.localDCCCheck=param;
                                    

                               }
                            

                        /**
                        * field for UDID
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localUDID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUDID(){
                               return localUDID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UDID
                               */
                               public void setUDID(java.lang.String param){
                            
                                            this.localUDID=param;
                                    

                               }
                            

                        /**
                        * field for KeyString
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localKeyString ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyString(){
                               return localKeyString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyString
                               */
                               public void setKeyString(java.lang.String param){
                            
                                            this.localKeyString=param;
                                    

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
                           namespacePrefix+":CheckInRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CheckInRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localKeys != null){
                                        
                                                writeAttribute("",
                                                         "Keys",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeys), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyEncoder != null){
                                        
                                                writeAttribute("",
                                                         "KeyEncoder",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyEncoder), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "GetKeyTrack",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetKeyTrack), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "PrintRegistration",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRegistration), xmlWriter);

                                            
                                      }
                                    
                                            if (localApprovalCode != null){
                                        
                                                writeAttribute("",
                                                         "ApprovalCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApprovalCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "KeyExpirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "MobilePhoneAudioKey",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneAudioKey), xmlWriter);

                                            
                                      }
                                    
                                            if (localMobilePhoneNumber != null){
                                        
                                                writeAttribute("",
                                                         "MobilePhoneNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localMobileKeyReferenceId != null){
                                        
                                                writeAttribute("",
                                                         "MobileKeyReferenceId",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobileKeyReferenceId), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "KioskCall",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKioskCall), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "EmailFolio",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFolio), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "EmailStaff",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailStaff), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "NoPost",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DoNotMoveRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DCCCheck",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDCCCheck), xmlWriter);

                                            
                                      }
                                    
                                            if (localUDID != null){
                                        
                                                writeAttribute("",
                                                         "UDID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUDID), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyString != null){
                                        
                                                writeAttribute("",
                                                         "KeyString",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyString), xmlWriter);

                                            
                                      }
                                     if (localReservationRequestTracker){
                                            if (localReservationRequest==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                            }
                                           localReservationRequest.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest"),
                                               xmlWriter);
                                        } if (localPrinterTracker){
                                            if (localPrinter==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Printer cannot be null!!");
                                            }
                                           localPrinter.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Printer"),
                                               xmlWriter);
                                        } if (localCreditCardInfoTracker){
                                            if (localCreditCardInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreditCardInfo cannot be null!!");
                                            }
                                           localCreditCardInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardInfo"),
                                               xmlWriter);
                                        } if (localTransactionsTracker){
                                       if (localTransactions!=null){
                                            for (int i = 0;i < localTransactions.length;i++){
                                                if (localTransactions[i] != null){
                                                 localTransactions[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Transactions"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Transactions cannot be null!!");
                                        
                                    }
                                 } if (localSignedDocumentTracker){
                                            if (localSignedDocument==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SignedDocument cannot be null!!");
                                            }
                                           localSignedDocument.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SignedDocument"),
                                               xmlWriter);
                                        } if (localMembershipsListTracker){
                                            if (localMembershipsList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MembershipsList cannot be null!!");
                                            }
                                           localMembershipsList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","MembershipsList"),
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

                 if (localReservationRequestTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReservationRequest"));
                            
                            
                                    if (localReservationRequest==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationRequest cannot be null!!");
                                    }
                                    elementList.add(localReservationRequest);
                                } if (localPrinterTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Printer"));
                            
                            
                                    if (localPrinter==null){
                                         throw new org.apache.axis2.databinding.ADBException("Printer cannot be null!!");
                                    }
                                    elementList.add(localPrinter);
                                } if (localCreditCardInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CreditCardInfo"));
                            
                            
                                    if (localCreditCardInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreditCardInfo cannot be null!!");
                                    }
                                    elementList.add(localCreditCardInfo);
                                } if (localTransactionsTracker){
                             if (localTransactions!=null) {
                                 for (int i = 0;i < localTransactions.length;i++){

                                    if (localTransactions[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                          "Transactions"));
                                         elementList.add(localTransactions[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Transactions cannot be null!!");
                                    
                             }

                        } if (localSignedDocumentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SignedDocument"));
                            
                            
                                    if (localSignedDocument==null){
                                         throw new org.apache.axis2.databinding.ADBException("SignedDocument cannot be null!!");
                                    }
                                    elementList.add(localSignedDocument);
                                } if (localMembershipsListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "MembershipsList"));
                            
                            
                                    if (localMembershipsList==null){
                                         throw new org.apache.axis2.databinding.ADBException("MembershipsList cannot be null!!");
                                    }
                                    elementList.add(localMembershipsList);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Keys"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeys));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyEncoder"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyEncoder));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","GetKeyTrack"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetKeyTrack));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","PrintRegistration"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRegistration));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ApprovalCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApprovalCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyExpirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MobilePhoneAudioKey"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneAudioKey));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MobilePhoneNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobilePhoneNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MobileKeyReferenceId"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMobileKeyReferenceId));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KioskCall"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKioskCall));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","EmailFolio"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFolio));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","EmailStaff"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailStaff));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","NoPost"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DoNotMoveRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DCCCheck"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDCCCheck));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","UDID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUDID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","KeyString"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyString));
                                

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
        public static CheckInRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CheckInRequest object =
                new CheckInRequest();

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
                    
                            if (!"CheckInRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CheckInRequest)com.cloudkey.pms.micros.og.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Keys"
                    java.lang.String tempAttribKeys =
                        
                                reader.getAttributeValue(null,"Keys");
                            
                   if (tempAttribKeys!=null){
                         java.lang.String content = tempAttribKeys;
                        
                                                 object.setKeys(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedShort(tempAttribKeys));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Keys");
                    
                    // handle attribute "KeyEncoder"
                    java.lang.String tempAttribKeyEncoder =
                        
                                reader.getAttributeValue(null,"KeyEncoder");
                            
                   if (tempAttribKeyEncoder!=null){
                         java.lang.String content = tempAttribKeyEncoder;
                        
                                                 object.setKeyEncoder(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKeyEncoder));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyEncoder");
                    
                    // handle attribute "GetKeyTrack"
                    java.lang.String tempAttribGetKeyTrack =
                        
                                reader.getAttributeValue(null,"GetKeyTrack");
                            
                   if (tempAttribGetKeyTrack!=null){
                         java.lang.String content = tempAttribGetKeyTrack;
                        
                                                 object.setGetKeyTrack(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribGetKeyTrack));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("GetKeyTrack");
                    
                    // handle attribute "PrintRegistration"
                    java.lang.String tempAttribPrintRegistration =
                        
                                reader.getAttributeValue(null,"PrintRegistration");
                            
                   if (tempAttribPrintRegistration!=null){
                         java.lang.String content = tempAttribPrintRegistration;
                        
                                                 object.setPrintRegistration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPrintRegistration));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("PrintRegistration");
                    
                    // handle attribute "ApprovalCode"
                    java.lang.String tempAttribApprovalCode =
                        
                                reader.getAttributeValue(null,"ApprovalCode");
                            
                   if (tempAttribApprovalCode!=null){
                         java.lang.String content = tempAttribApprovalCode;
                        
                                                 object.setApprovalCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribApprovalCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ApprovalCode");
                    
                    // handle attribute "KeyExpirationDate"
                    java.lang.String tempAttribKeyExpirationDate =
                        
                                reader.getAttributeValue(null,"KeyExpirationDate");
                            
                   if (tempAttribKeyExpirationDate!=null){
                         java.lang.String content = tempAttribKeyExpirationDate;
                        
                                                 object.setKeyExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribKeyExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyExpirationDate");
                    
                    // handle attribute "MobilePhoneAudioKey"
                    java.lang.String tempAttribMobilePhoneAudioKey =
                        
                                reader.getAttributeValue(null,"MobilePhoneAudioKey");
                            
                   if (tempAttribMobilePhoneAudioKey!=null){
                         java.lang.String content = tempAttribMobilePhoneAudioKey;
                        
                                                 object.setMobilePhoneAudioKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMobilePhoneAudioKey));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MobilePhoneAudioKey");
                    
                    // handle attribute "MobilePhoneNumber"
                    java.lang.String tempAttribMobilePhoneNumber =
                        
                                reader.getAttributeValue(null,"MobilePhoneNumber");
                            
                   if (tempAttribMobilePhoneNumber!=null){
                         java.lang.String content = tempAttribMobilePhoneNumber;
                        
                                                 object.setMobilePhoneNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMobilePhoneNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MobilePhoneNumber");
                    
                    // handle attribute "MobileKeyReferenceId"
                    java.lang.String tempAttribMobileKeyReferenceId =
                        
                                reader.getAttributeValue(null,"MobileKeyReferenceId");
                            
                   if (tempAttribMobileKeyReferenceId!=null){
                         java.lang.String content = tempAttribMobileKeyReferenceId;
                        
                                                 object.setMobileKeyReferenceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMobileKeyReferenceId));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MobileKeyReferenceId");
                    
                    // handle attribute "KioskCall"
                    java.lang.String tempAttribKioskCall =
                        
                                reader.getAttributeValue(null,"KioskCall");
                            
                   if (tempAttribKioskCall!=null){
                         java.lang.String content = tempAttribKioskCall;
                        
                                                 object.setKioskCall(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribKioskCall));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KioskCall");
                    
                    // handle attribute "EmailFolio"
                    java.lang.String tempAttribEmailFolio =
                        
                                reader.getAttributeValue(null,"EmailFolio");
                            
                   if (tempAttribEmailFolio!=null){
                         java.lang.String content = tempAttribEmailFolio;
                        
                                                 object.setEmailFolio(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEmailFolio));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EmailFolio");
                    
                    // handle attribute "EmailStaff"
                    java.lang.String tempAttribEmailStaff =
                        
                                reader.getAttributeValue(null,"EmailStaff");
                            
                   if (tempAttribEmailStaff!=null){
                         java.lang.String content = tempAttribEmailStaff;
                        
                                                 object.setEmailStaff(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEmailStaff));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EmailStaff");
                    
                    // handle attribute "NoPost"
                    java.lang.String tempAttribNoPost =
                        
                                reader.getAttributeValue(null,"NoPost");
                            
                   if (tempAttribNoPost!=null){
                         java.lang.String content = tempAttribNoPost;
                        
                                                 object.setNoPost(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribNoPost));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("NoPost");
                    
                    // handle attribute "DoNotMoveRoom"
                    java.lang.String tempAttribDoNotMoveRoom =
                        
                                reader.getAttributeValue(null,"DoNotMoveRoom");
                            
                   if (tempAttribDoNotMoveRoom!=null){
                         java.lang.String content = tempAttribDoNotMoveRoom;
                        
                                                 object.setDoNotMoveRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDoNotMoveRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DoNotMoveRoom");
                    
                    // handle attribute "DCCCheck"
                    java.lang.String tempAttribDCCCheck =
                        
                                reader.getAttributeValue(null,"DCCCheck");
                            
                   if (tempAttribDCCCheck!=null){
                         java.lang.String content = tempAttribDCCCheck;
                        
                                                 object.setDCCCheck(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDCCCheck));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DCCCheck");
                    
                    // handle attribute "UDID"
                    java.lang.String tempAttribUDID =
                        
                                reader.getAttributeValue(null,"UDID");
                            
                   if (tempAttribUDID!=null){
                         java.lang.String content = tempAttribUDID;
                        
                                                 object.setUDID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUDID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("UDID");
                    
                    // handle attribute "KeyString"
                    java.lang.String tempAttribKeyString =
                        
                                reader.getAttributeValue(null,"KeyString");
                            
                   if (tempAttribKeyString!=null){
                         java.lang.String content = tempAttribKeyString;
                        
                                                 object.setKeyString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribKeyString));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("KeyString");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReservationRequest").equals(reader.getName())){
                                
                                                object.setReservationRequest(com.cloudkey.pms.micros.og.reservation.advanced.ReservationRequestBase.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Printer").equals(reader.getName())){
                                
                                                object.setPrinter(com.cloudkey.pms.micros.og.reservation.advanced.Printer.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditCardInfo").equals(reader.getName())){
                                
                                                object.setCreditCardInfo(com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Transactions").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(com.cloudkey.pms.micros.og.reservation.advanced.Transaction.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
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
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Transactions").equals(reader.getName())){
                                                                    list4.add(com.cloudkey.pms.micros.og.reservation.advanced.Transaction.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTransactions((com.cloudkey.pms.micros.og.reservation.advanced.Transaction[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.advanced.Transaction.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SignedDocument").equals(reader.getName())){
                                
                                                object.setSignedDocument(com.cloudkey.pms.micros.og.common.FileData.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","MembershipsList").equals(reader.getName())){
                                
                                                object.setMembershipsList(com.cloudkey.pms.micros.og.reservation.advanced.ArrayOfNameMembership.Factory.parse(reader));
                                              
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
           
    