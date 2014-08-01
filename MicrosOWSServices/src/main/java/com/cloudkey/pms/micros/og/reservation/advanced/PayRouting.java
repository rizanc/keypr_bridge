
/**
 * PayRouting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  PayRouting bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PayRouting
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PayRouting
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for RoutingType
                        */

                        
                                    protected java.lang.String localRoutingType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoutingTypeTracker = false ;

                           public boolean isRoutingTypeSpecified(){
                               return localRoutingTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoutingType(){
                               return localRoutingType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingType
                               */
                               public void setRoutingType(java.lang.String param){
                            localRoutingTypeTracker = param != null;
                                   
                                            this.localRoutingType=param;
                                    

                               }
                            

                        /**
                        * field for RoutingInstructionsId
                        */

                        
                                    protected java.lang.String localRoutingInstructionsId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoutingInstructionsIdTracker = false ;

                           public boolean isRoutingInstructionsIdSpecified(){
                               return localRoutingInstructionsIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoutingInstructionsId(){
                               return localRoutingInstructionsId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingInstructionsId
                               */
                               public void setRoutingInstructionsId(java.lang.String param){
                            localRoutingInstructionsIdTracker = param != null;
                                   
                                            this.localRoutingInstructionsId=param;
                                    

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
                        * field for ResvNameID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localResvNameID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResvNameIDTracker = false ;

                           public boolean isResvNameIDSpecified(){
                               return localResvNameIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getResvNameID(){
                               return localResvNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResvNameID
                               */
                               public void setResvNameID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localResvNameIDTracker = param != null;
                                   
                                            this.localResvNameID=param;
                                    

                               }
                            

                        /**
                        * field for RoutingCodes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.advanced.RoutingInstructionCodes localRoutingCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoutingCodesTracker = false ;

                           public boolean isRoutingCodesSpecified(){
                               return localRoutingCodesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.advanced.RoutingInstructionCodes
                           */
                           public  com.cloudkey.pms.micros.og.reservation.advanced.RoutingInstructionCodes getRoutingCodes(){
                               return localRoutingCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingCodes
                               */
                               public void setRoutingCodes(com.cloudkey.pms.micros.og.reservation.advanced.RoutingInstructionCodes param){
                            localRoutingCodesTracker = param != null;
                                   
                                            this.localRoutingCodes=param;
                                    

                               }
                            

                        /**
                        * field for BillToNameID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localBillToNameID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillToNameIDTracker = false ;

                           public boolean isBillToNameIDSpecified(){
                               return localBillToNameIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getBillToNameID(){
                               return localBillToNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillToNameID
                               */
                               public void setBillToNameID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localBillToNameIDTracker = param != null;
                                   
                                            this.localBillToNameID=param;
                                    

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
                        * field for ToResvNameID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localToResvNameID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToResvNameIDTracker = false ;

                           public boolean isToResvNameIDSpecified(){
                               return localToResvNameIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getToResvNameID(){
                               return localToResvNameID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ToResvNameID
                               */
                               public void setToResvNameID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localToResvNameIDTracker = param != null;
                                   
                                            this.localToResvNameID=param;
                                    

                               }
                            

                        /**
                        * field for BillingInstructionCode
                        */

                        
                                    protected double localBillingInstructionCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingInstructionCodeTracker = false ;

                           public boolean isBillingInstructionCodeSpecified(){
                               return localBillingInstructionCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getBillingInstructionCode(){
                               return localBillingInstructionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillingInstructionCode
                               */
                               public void setBillingInstructionCode(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localBillingInstructionCodeTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localBillingInstructionCode=param;
                                    

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
                        * field for AddTransaction
                        */

                        
                                    protected boolean localAddTransaction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddTransactionTracker = false ;

                           public boolean isAddTransactionSpecified(){
                               return localAddTransactionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAddTransaction(){
                               return localAddTransaction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddTransaction
                               */
                               public void setAddTransaction(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localAddTransactionTracker =
                                       true;
                                   
                                            this.localAddTransaction=param;
                                    

                               }
                            

                        /**
                        * field for AddressID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localAddressID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressIDTracker = false ;

                           public boolean isAddressIDSpecified(){
                               return localAddressIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getAddressID(){
                               return localAddressID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressID
                               */
                               public void setAddressID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localAddressIDTracker = param != null;
                                   
                                            this.localAddressID=param;
                                    

                               }
                            

                        /**
                        * field for AuthorizerID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localAuthorizerID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthorizerIDTracker = false ;

                           public boolean isAuthorizerIDSpecified(){
                               return localAuthorizerIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getAuthorizerID(){
                               return localAuthorizerID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthorizerID
                               */
                               public void setAuthorizerID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localAuthorizerIDTracker = param != null;
                                   
                                            this.localAuthorizerID=param;
                                    

                               }
                            

                        /**
                        * field for RequestedBy
                        */

                        
                                    protected java.lang.String localRequestedBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestedByTracker = false ;

                           public boolean isRequestedBySpecified(){
                               return localRequestedByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRequestedBy(){
                               return localRequestedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestedBy
                               */
                               public void setRequestedBy(java.lang.String param){
                            localRequestedByTracker = param != null;
                                   
                                            this.localRequestedBy=param;
                                    

                               }
                            

                        /**
                        * field for AccountCode
                        */

                        
                                    protected java.lang.String localAccountCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountCodeTracker = false ;

                           public boolean isAccountCodeSpecified(){
                               return localAccountCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccountCode(){
                               return localAccountCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountCode
                               */
                               public void setAccountCode(java.lang.String param){
                            localAccountCodeTracker = param != null;
                                   
                                            this.localAccountCode=param;
                                    

                               }
                            

                        /**
                        * field for CreditLimit
                        */

                        
                                    protected double localCreditLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditLimitTracker = false ;

                           public boolean isCreditLimitSpecified(){
                               return localCreditLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCreditLimit(){
                               return localCreditLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditLimit
                               */
                               public void setCreditLimit(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCreditLimitTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCreditLimit=param;
                                    

                               }
                            

                        /**
                        * field for LimitUsed
                        */

                        
                                    protected double localLimitUsed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLimitUsedTracker = false ;

                           public boolean isLimitUsedSpecified(){
                               return localLimitUsedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getLimitUsed(){
                               return localLimitUsed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LimitUsed
                               */
                               public void setLimitUsed(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localLimitUsedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localLimitUsed=param;
                                    

                               }
                            

                        /**
                        * field for Comments
                        */

                        
                                    protected java.lang.String localComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentsTracker = false ;

                           public boolean isCommentsSpecified(){
                               return localCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComments(){
                               return localComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comments
                               */
                               public void setComments(java.lang.String param){
                            localCommentsTracker = param != null;
                                   
                                            this.localComments=param;
                                    

                               }
                            

                        /**
                        * field for Declined
                        */

                        
                                    protected boolean localDeclined ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeclinedTracker = false ;

                           public boolean isDeclinedSpecified(){
                               return localDeclinedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDeclined(){
                               return localDeclined;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Declined
                               */
                               public void setDeclined(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeclinedTracker =
                                       true;
                                   
                                            this.localDeclined=param;
                                    

                               }
                            

                        /**
                        * field for DeclinedBy
                        */

                        
                                    protected java.lang.String localDeclinedBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeclinedByTracker = false ;

                           public boolean isDeclinedBySpecified(){
                               return localDeclinedByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDeclinedBy(){
                               return localDeclinedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeclinedBy
                               */
                               public void setDeclinedBy(java.lang.String param){
                            localDeclinedByTracker = param != null;
                                   
                                            this.localDeclinedBy=param;
                                    

                               }
                            

                        /**
                        * field for CompVoucherNo
                        */

                        
                                    protected java.lang.String localCompVoucherNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompVoucherNoTracker = false ;

                           public boolean isCompVoucherNoSpecified(){
                               return localCompVoucherNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCompVoucherNo(){
                               return localCompVoucherNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompVoucherNo
                               */
                               public void setCompVoucherNo(java.lang.String param){
                            localCompVoucherNoTracker = param != null;
                                   
                                            this.localCompVoucherNo=param;
                                    

                               }
                            

                        /**
                        * field for CompCovers
                        */

                        
                                    protected double localCompCovers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompCoversTracker = false ;

                           public boolean isCompCoversSpecified(){
                               return localCompCoversTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCompCovers(){
                               return localCompCovers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompCovers
                               */
                               public void setCompCovers(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localCompCoversTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localCompCovers=param;
                                    

                               }
                            

                        /**
                        * field for CompTypeCode
                        */

                        
                                    protected java.lang.String localCompTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompTypeCodeTracker = false ;

                           public boolean isCompTypeCodeSpecified(){
                               return localCompTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCompTypeCode(){
                               return localCompTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompTypeCode
                               */
                               public void setCompTypeCode(java.lang.String param){
                            localCompTypeCodeTracker = param != null;
                                   
                                            this.localCompTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for RoutingPercent
                        */

                        
                                    protected int localRoutingPercent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoutingPercentTracker = false ;

                           public boolean isRoutingPercentSpecified(){
                               return localRoutingPercentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRoutingPercent(){
                               return localRoutingPercent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingPercent
                               */
                               public void setRoutingPercent(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localRoutingPercentTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localRoutingPercent=param;
                                    

                               }
                            

                        /**
                        * field for RoutingLimitType
                        */

                        
                                    protected java.lang.String localRoutingLimitType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoutingLimitTypeTracker = false ;

                           public boolean isRoutingLimitTypeSpecified(){
                               return localRoutingLimitTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoutingLimitType(){
                               return localRoutingLimitType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingLimitType
                               */
                               public void setRoutingLimitType(java.lang.String param){
                            localRoutingLimitTypeTracker = param != null;
                                   
                                            this.localRoutingLimitType=param;
                                    

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
                        * field for Day1
                        */

                        
                                    protected boolean localDay1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay1Tracker = false ;

                           public boolean isDay1Specified(){
                               return localDay1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay1(){
                               return localDay1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day1
                               */
                               public void setDay1(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay1Tracker =
                                       true;
                                   
                                            this.localDay1=param;
                                    

                               }
                            

                        /**
                        * field for Day2
                        */

                        
                                    protected boolean localDay2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay2Tracker = false ;

                           public boolean isDay2Specified(){
                               return localDay2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay2(){
                               return localDay2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day2
                               */
                               public void setDay2(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay2Tracker =
                                       true;
                                   
                                            this.localDay2=param;
                                    

                               }
                            

                        /**
                        * field for Day3
                        */

                        
                                    protected boolean localDay3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay3Tracker = false ;

                           public boolean isDay3Specified(){
                               return localDay3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay3(){
                               return localDay3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day3
                               */
                               public void setDay3(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay3Tracker =
                                       true;
                                   
                                            this.localDay3=param;
                                    

                               }
                            

                        /**
                        * field for Day4
                        */

                        
                                    protected boolean localDay4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay4Tracker = false ;

                           public boolean isDay4Specified(){
                               return localDay4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay4(){
                               return localDay4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day4
                               */
                               public void setDay4(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay4Tracker =
                                       true;
                                   
                                            this.localDay4=param;
                                    

                               }
                            

                        /**
                        * field for Day5
                        */

                        
                                    protected boolean localDay5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay5Tracker = false ;

                           public boolean isDay5Specified(){
                               return localDay5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay5(){
                               return localDay5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day5
                               */
                               public void setDay5(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay5Tracker =
                                       true;
                                   
                                            this.localDay5=param;
                                    

                               }
                            

                        /**
                        * field for Day6
                        */

                        
                                    protected boolean localDay6 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay6Tracker = false ;

                           public boolean isDay6Specified(){
                               return localDay6Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay6(){
                               return localDay6;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day6
                               */
                               public void setDay6(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay6Tracker =
                                       true;
                                   
                                            this.localDay6=param;
                                    

                               }
                            

                        /**
                        * field for Day7
                        */

                        
                                    protected boolean localDay7 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDay7Tracker = false ;

                           public boolean isDay7Specified(){
                               return localDay7Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDay7(){
                               return localDay7;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Day7
                               */
                               public void setDay7(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDay7Tracker =
                                       true;
                                   
                                            this.localDay7=param;
                                    

                               }
                            

                        /**
                        * field for DayString
                        */

                        
                                    protected java.lang.String localDayString ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDayStringTracker = false ;

                           public boolean isDayStringSpecified(){
                               return localDayStringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDayString(){
                               return localDayString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DayString
                               */
                               public void setDayString(java.lang.String param){
                            localDayStringTracker = param != null;
                                   
                                            this.localDayString=param;
                                    

                               }
                            

                        /**
                        * field for Daily
                        */

                        
                                    protected boolean localDaily ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDailyTracker = false ;

                           public boolean isDailySpecified(){
                               return localDailyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDaily(){
                               return localDaily;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Daily
                               */
                               public void setDaily(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDailyTracker =
                                       true;
                                   
                                            this.localDaily=param;
                                    

                               }
                            

                        /**
                        * field for RoutingInstruction
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoutingInstruction ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoutingInstruction(){
                               return localRoutingInstruction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoutingInstruction
                               */
                               public void setRoutingInstruction(java.lang.String param){
                            
                                            this.localRoutingInstruction=param;
                                    

                               }
                            

                        /**
                        * field for Owner
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localOwner ;
                                

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
                            
                                            this.localOwner=param;
                                    

                               }
                            

                        /**
                        * field for Window
                        * This was an Attribute!
                        */

                        
                                    protected int localWindow ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getWindow(){
                               return localWindow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Window
                               */
                               public void setWindow(int param){
                            
                                            this.localWindow=param;
                                    

                               }
                            

                        /**
                        * field for Room
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoom(){
                               return localRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Room
                               */
                               public void setRoom(java.lang.String param){
                            
                                            this.localRoom=param;
                                    

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
                           namespacePrefix+":PayRouting",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PayRouting",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoutingInstruction != null){
                                        
                                                writeAttribute("",
                                                         "RoutingInstruction",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingInstruction), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localRoutingInstruction is null");
                                      }
                                    
                                            if (localOwner != null){
                                        
                                                writeAttribute("",
                                                         "Owner",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localOwner is null");
                                      }
                                    
                                                   if (localWindow!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "Window",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWindow), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localWindow is null");
                                      }
                                    
                                            if (localRoom != null){
                                        
                                                writeAttribute("",
                                                         "Room",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoom), xmlWriter);

                                            
                                      }
                                     if (localRoutingTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RoutingType", xmlWriter);
                             

                                          if (localRoutingType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoutingType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoutingType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoutingInstructionsIdTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RoutingInstructionsId", xmlWriter);
                             

                                          if (localRoutingInstructionsId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoutingInstructionsId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoutingInstructionsId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResortTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Resort", xmlWriter);
                             

                                          if (localResort==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResort);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResvNameIDTracker){
                                            if (localResvNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResvNameID cannot be null!!");
                                            }
                                           localResvNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ResvNameID"),
                                               xmlWriter);
                                        } if (localRoutingCodesTracker){
                                            if (localRoutingCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoutingCodes cannot be null!!");
                                            }
                                           localRoutingCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingCodes"),
                                               xmlWriter);
                                        } if (localBillToNameIDTracker){
                                            if (localBillToNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BillToNameID cannot be null!!");
                                            }
                                           localBillToNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","BillToNameID"),
                                               xmlWriter);
                                        } if (localBeginDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "BeginDate", xmlWriter);
                             

                                          if (localBeginDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BeginDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToResvNameIDTracker){
                                            if (localToResvNameID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ToResvNameID cannot be null!!");
                                            }
                                           localToResvNameID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ToResvNameID"),
                                               xmlWriter);
                                        } if (localBillingInstructionCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "BillingInstructionCode", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localBillingInstructionCode)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("BillingInstructionCode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingInstructionCode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "EndDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAddTransactionTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "AddTransaction", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AddTransaction cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddTransaction));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAddressIDTracker){
                                            if (localAddressID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AddressID cannot be null!!");
                                            }
                                           localAddressID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AddressID"),
                                               xmlWriter);
                                        } if (localAuthorizerIDTracker){
                                            if (localAuthorizerID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AuthorizerID cannot be null!!");
                                            }
                                           localAuthorizerID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AuthorizerID"),
                                               xmlWriter);
                                        } if (localRequestedByTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RequestedBy", xmlWriter);
                             

                                          if (localRequestedBy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RequestedBy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRequestedBy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAccountCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "AccountCode", xmlWriter);
                             

                                          if (localAccountCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AccountCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccountCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreditLimitTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "CreditLimit", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCreditLimit)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CreditLimit cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLimitUsedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "LimitUsed", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localLimitUsed)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("LimitUsed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimitUsed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCommentsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Comments", xmlWriter);
                             

                                          if (localComments==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComments);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeclinedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Declined", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Declined cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclined));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeclinedByTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "DeclinedBy", xmlWriter);
                             

                                          if (localDeclinedBy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DeclinedBy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDeclinedBy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompVoucherNoTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "CompVoucherNo", xmlWriter);
                             

                                          if (localCompVoucherNo==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CompVoucherNo cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCompVoucherNo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompCoversTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "CompCovers", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localCompCovers)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CompCovers cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompCovers));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompTypeCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "CompTypeCode", xmlWriter);
                             

                                          if (localCompTypeCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CompTypeCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCompTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoutingPercentTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RoutingPercent", xmlWriter);
                             
                                               if (localRoutingPercent==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("RoutingPercent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingPercent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRoutingLimitTypeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RoutingLimitType", xmlWriter);
                             

                                          if (localRoutingLimitType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RoutingLimitType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRoutingLimitType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMembershipIDTracker){
                                            if (localMembershipID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MembershipID cannot be null!!");
                                            }
                                           localMembershipID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","MembershipID"),
                                               xmlWriter);
                                        } if (localDay1Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day1", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day1 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay1));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay2Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day2", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day2 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay2));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay3Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day3", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day3 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay3));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay4Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day4", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day4 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay4));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay5Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day5", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day5 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay5));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay6Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day6", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day6 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay6));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDay7Tracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Day7", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Day7 cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay7));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDayStringTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "DayString", xmlWriter);
                             

                                          if (localDayString==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DayString cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDayString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDailyTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Daily", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Daily cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDaily));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/ResvAdvanced/")){
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

                 if (localRoutingTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoutingType"));
                                 
                                        if (localRoutingType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoutingType cannot be null!!");
                                        }
                                    } if (localRoutingInstructionsIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoutingInstructionsId"));
                                 
                                        if (localRoutingInstructionsId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingInstructionsId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoutingInstructionsId cannot be null!!");
                                        }
                                    } if (localResortTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Resort"));
                                 
                                        if (localResort != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResort));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Resort cannot be null!!");
                                        }
                                    } if (localResvNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ResvNameID"));
                            
                            
                                    if (localResvNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResvNameID cannot be null!!");
                                    }
                                    elementList.add(localResvNameID);
                                } if (localRoutingCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoutingCodes"));
                            
                            
                                    if (localRoutingCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoutingCodes cannot be null!!");
                                    }
                                    elementList.add(localRoutingCodes);
                                } if (localBillToNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "BillToNameID"));
                            
                            
                                    if (localBillToNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("BillToNameID cannot be null!!");
                                    }
                                    elementList.add(localBillToNameID);
                                } if (localBeginDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "BeginDate"));
                                 
                                        if (localBeginDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BeginDate cannot be null!!");
                                        }
                                    } if (localToResvNameIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ToResvNameID"));
                            
                            
                                    if (localToResvNameID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ToResvNameID cannot be null!!");
                                    }
                                    elementList.add(localToResvNameID);
                                } if (localBillingInstructionCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "BillingInstructionCode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingInstructionCode));
                            } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "EndDate"));
                                 
                                        if (localEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                        }
                                    } if (localAddTransactionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "AddTransaction"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddTransaction));
                            } if (localAddressIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "AddressID"));
                            
                            
                                    if (localAddressID==null){
                                         throw new org.apache.axis2.databinding.ADBException("AddressID cannot be null!!");
                                    }
                                    elementList.add(localAddressID);
                                } if (localAuthorizerIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "AuthorizerID"));
                            
                            
                                    if (localAuthorizerID==null){
                                         throw new org.apache.axis2.databinding.ADBException("AuthorizerID cannot be null!!");
                                    }
                                    elementList.add(localAuthorizerID);
                                } if (localRequestedByTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RequestedBy"));
                                 
                                        if (localRequestedBy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestedBy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RequestedBy cannot be null!!");
                                        }
                                    } if (localAccountCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "AccountCode"));
                                 
                                        if (localAccountCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccountCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AccountCode cannot be null!!");
                                        }
                                    } if (localCreditLimitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CreditLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditLimit));
                            } if (localLimitUsedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "LimitUsed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLimitUsed));
                            } if (localCommentsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Comments"));
                                 
                                        if (localComments != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComments));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Comments cannot be null!!");
                                        }
                                    } if (localDeclinedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Declined"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclined));
                            } if (localDeclinedByTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "DeclinedBy"));
                                 
                                        if (localDeclinedBy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeclinedBy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DeclinedBy cannot be null!!");
                                        }
                                    } if (localCompVoucherNoTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CompVoucherNo"));
                                 
                                        if (localCompVoucherNo != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompVoucherNo));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CompVoucherNo cannot be null!!");
                                        }
                                    } if (localCompCoversTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CompCovers"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompCovers));
                            } if (localCompTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "CompTypeCode"));
                                 
                                        if (localCompTypeCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompTypeCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CompTypeCode cannot be null!!");
                                        }
                                    } if (localRoutingPercentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoutingPercent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingPercent));
                            } if (localRoutingLimitTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RoutingLimitType"));
                                 
                                        if (localRoutingLimitType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingLimitType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RoutingLimitType cannot be null!!");
                                        }
                                    } if (localMembershipIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "MembershipID"));
                            
                            
                                    if (localMembershipID==null){
                                         throw new org.apache.axis2.databinding.ADBException("MembershipID cannot be null!!");
                                    }
                                    elementList.add(localMembershipID);
                                } if (localDay1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day1"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay1));
                            } if (localDay2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day2"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay2));
                            } if (localDay3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day3"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay3));
                            } if (localDay4Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day4"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay4));
                            } if (localDay5Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day5"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay5));
                            } if (localDay6Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day6"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay6));
                            } if (localDay7Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Day7"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDay7));
                            } if (localDayStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "DayString"));
                                 
                                        if (localDayString != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDayString));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DayString cannot be null!!");
                                        }
                                    } if (localDailyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Daily"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDaily));
                            }
                            attribList.add(
                            new javax.xml.namespace.QName("","RoutingInstruction"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoutingInstruction));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Owner"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwner));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Window"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWindow));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Room"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoom));
                                

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
        public static PayRouting parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PayRouting object =
                new PayRouting();

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
                    
                            if (!"PayRouting".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PayRouting)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "RoutingInstruction"
                    java.lang.String tempAttribRoutingInstruction =
                        
                                reader.getAttributeValue(null,"RoutingInstruction");
                            
                   if (tempAttribRoutingInstruction!=null){
                         java.lang.String content = tempAttribRoutingInstruction;
                        
                                                 object.setRoutingInstruction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoutingInstruction));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute RoutingInstruction is missing");
                           
                    }
                    handledAttributes.add("RoutingInstruction");
                    
                    // handle attribute "Owner"
                    java.lang.String tempAttribOwner =
                        
                                reader.getAttributeValue(null,"Owner");
                            
                   if (tempAttribOwner!=null){
                         java.lang.String content = tempAttribOwner;
                        
                                                 object.setOwner(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOwner));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Owner is missing");
                           
                    }
                    handledAttributes.add("Owner");
                    
                    // handle attribute "Window"
                    java.lang.String tempAttribWindow =
                        
                                reader.getAttributeValue(null,"Window");
                            
                   if (tempAttribWindow!=null){
                         java.lang.String content = tempAttribWindow;
                        
                                                 object.setWindow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribWindow));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Window is missing");
                           
                    }
                    handledAttributes.add("Window");
                    
                    // handle attribute "Room"
                    java.lang.String tempAttribRoom =
                        
                                reader.getAttributeValue(null,"Room");
                            
                   if (tempAttribRoom!=null){
                         java.lang.String content = tempAttribRoom;
                        
                                                 object.setRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Room");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoutingType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoutingType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingInstructionsId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoutingInstructionsId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoutingInstructionsId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Resort").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ResvNameID").equals(reader.getName())){
                                
                                                object.setResvNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingCodes").equals(reader.getName())){
                                
                                                object.setRoutingCodes(com.cloudkey.pms.micros.og.reservation.advanced.RoutingInstructionCodes.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","BillToNameID").equals(reader.getName())){
                                
                                                object.setBillToNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","BeginDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ToResvNameID").equals(reader.getName())){
                                
                                                object.setToResvNameID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","BillingInstructionCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BillingInstructionCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBillingInstructionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBillingInstructionCode(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","EndDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AddTransaction").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AddTransaction" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAddTransaction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AddressID").equals(reader.getName())){
                                
                                                object.setAddressID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AuthorizerID").equals(reader.getName())){
                                
                                                object.setAuthorizerID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RequestedBy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RequestedBy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestedBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","AccountCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AccountCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccountCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CreditLimit").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CreditLimit" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreditLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCreditLimit(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","LimitUsed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LimitUsed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLimitUsed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLimitUsed(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Comments").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Comments" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComments(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Declined").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Declined" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeclined(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","DeclinedBy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DeclinedBy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeclinedBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CompVoucherNo").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CompVoucherNo" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompVoucherNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CompCovers").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CompCovers" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompCovers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCompCovers(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","CompTypeCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CompTypeCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingPercent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoutingPercent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoutingPercent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRoutingPercent(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RoutingLimitType").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RoutingLimitType" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRoutingLimitType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","MembershipID").equals(reader.getName())){
                                
                                                object.setMembershipID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day1").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day1" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day2").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day2" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day3").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day3" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day4").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day4" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay4(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day5").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day5" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay5(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day6").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day6" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay6(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Day7").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Day7" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDay7(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","DayString").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DayString" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDayString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Daily").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Daily" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDaily(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
    