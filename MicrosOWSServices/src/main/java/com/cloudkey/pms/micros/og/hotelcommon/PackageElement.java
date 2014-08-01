
/**
 * PackageElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  PackageElement bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PackageElement
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PackageElement
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for Amount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmountTracker = false ;

                           public boolean isAmountSpecified(){
                               return localAmountTracker;
                           }

                           

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
                            localAmountTracker = param != null;
                                   
                                            this.localAmount=param;
                                    

                               }
                            

                        /**
                        * field for PackageAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localPackageAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageAmountTracker = false ;

                           public boolean isPackageAmountSpecified(){
                               return localPackageAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getPackageAmount(){
                               return localPackageAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageAmount
                               */
                               public void setPackageAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localPackageAmountTracker = param != null;
                                   
                                            this.localPackageAmount=param;
                                    

                               }
                            

                        /**
                        * field for TaxAmount
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTaxAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxAmountTracker = false ;

                           public boolean isTaxAmountSpecified(){
                               return localTaxAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTaxAmount(){
                               return localTaxAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxAmount
                               */
                               public void setTaxAmount(com.cloudkey.pms.micros.og.common.Amount param){
                            localTaxAmountTracker = param != null;
                                   
                                            this.localTaxAmount=param;
                                    

                               }
                            

                        /**
                        * field for Allowance
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localAllowance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAllowanceTracker = false ;

                           public boolean isAllowanceSpecified(){
                               return localAllowanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getAllowance(){
                               return localAllowance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Allowance
                               */
                               public void setAllowance(com.cloudkey.pms.micros.og.common.Amount param){
                            localAllowanceTracker = param != null;
                                   
                                            this.localAllowance=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText[] localDescription ;
                                
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
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText[]
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText[] getDescription(){
                               return localDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for Description
                               */
                              protected void validateDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Description
                              */
                              public void setDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                              
                                   validateDescription(param);

                               localDescriptionTracker = param != null;
                                      
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

                            
                                 //update the setting tracker
                                localDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDescription);
                               list.add(param);
                               this.localDescription =
                             (com.cloudkey.pms.micros.og.common.DescriptiveText[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.DescriptiveText[list.size()]);

                             }
                             

                        /**
                        * field for ShortDescription
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText[] localShortDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShortDescriptionTracker = false ;

                           public boolean isShortDescriptionSpecified(){
                               return localShortDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText[]
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText[] getShortDescription(){
                               return localShortDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for ShortDescription
                               */
                              protected void validateShortDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ShortDescription
                              */
                              public void setShortDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                              
                                   validateShortDescription(param);

                               localShortDescriptionTracker = param != null;
                                      
                                      this.localShortDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.DescriptiveText
                             */
                             public void addShortDescription(com.cloudkey.pms.micros.og.common.DescriptiveText param){
                                   if (localShortDescription == null){
                                   localShortDescription = new com.cloudkey.pms.micros.og.common.DescriptiveText[]{};
                                   }

                            
                                 //update the setting tracker
                                localShortDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localShortDescription);
                               list.add(param);
                               this.localShortDescription =
                             (com.cloudkey.pms.micros.og.common.DescriptiveText[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.DescriptiveText[list.size()]);

                             }
                             

                        /**
                        * field for LongDescription
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.DescriptiveText[] localLongDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongDescriptionTracker = false ;

                           public boolean isLongDescriptionSpecified(){
                               return localLongDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.DescriptiveText[]
                           */
                           public  com.cloudkey.pms.micros.og.common.DescriptiveText[] getLongDescription(){
                               return localLongDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for LongDescription
                               */
                              protected void validateLongDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LongDescription
                              */
                              public void setLongDescription(com.cloudkey.pms.micros.og.common.DescriptiveText[] param){
                              
                                   validateLongDescription(param);

                               localLongDescriptionTracker = param != null;
                                      
                                      this.localLongDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.DescriptiveText
                             */
                             public void addLongDescription(com.cloudkey.pms.micros.og.common.DescriptiveText param){
                                   if (localLongDescription == null){
                                   localLongDescription = new com.cloudkey.pms.micros.og.common.DescriptiveText[]{};
                                   }

                            
                                 //update the setting tracker
                                localLongDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLongDescription);
                               list.add(param);
                               this.localLongDescription =
                             (com.cloudkey.pms.micros.og.common.DescriptiveText[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.DescriptiveText[list.size()]);

                             }
                             

                        /**
                        * field for PackageDetails
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[] localPackageDetails ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackageDetailsTracker = false ;

                           public boolean isPackageDetailsSpecified(){
                               return localPackageDetailsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[] getPackageDetails(){
                               return localPackageDetails;
                           }

                           
                        


                               
                              /**
                               * validate the array for PackageDetails
                               */
                              protected void validatePackageDetails(com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PackageDetails
                              */
                              public void setPackageDetails(com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[] param){
                              
                                   validatePackageDetails(param);

                               localPackageDetailsTracker = param != null;
                                      
                                      this.localPackageDetails=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges
                             */
                             public void addPackageDetails(com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges param){
                                   if (localPackageDetails == null){
                                   localPackageDetails = new com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[]{};
                                   }

                            
                                 //update the setting tracker
                                localPackageDetailsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPackageDetails);
                               list.add(param);
                               this.localPackageDetails =
                             (com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[list.size()]);

                             }
                             

                        /**
                        * field for PackageCodes
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.PackageMember[] localPackageCodes ;
                                
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
                           * @return com.cloudkey.pms.micros.og.hotelcommon.PackageMember[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.PackageMember[] getPackageCodes(){
                               return localPackageCodes;
                           }

                           
                        


                               
                              /**
                               * validate the array for PackageCodes
                               */
                              protected void validatePackageCodes(com.cloudkey.pms.micros.og.hotelcommon.PackageMember[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PackageCodes
                              */
                              public void setPackageCodes(com.cloudkey.pms.micros.og.hotelcommon.PackageMember[] param){
                              
                                   validatePackageCodes(param);

                               localPackageCodesTracker = param != null;
                                      
                                      this.localPackageCodes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.PackageMember
                             */
                             public void addPackageCodes(com.cloudkey.pms.micros.og.hotelcommon.PackageMember param){
                                   if (localPackageCodes == null){
                                   localPackageCodes = new com.cloudkey.pms.micros.og.hotelcommon.PackageMember[]{};
                                   }

                            
                                 //update the setting tracker
                                localPackageCodesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPackageCodes);
                               list.add(param);
                               this.localPackageCodes =
                             (com.cloudkey.pms.micros.og.hotelcommon.PackageMember[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.PackageMember[list.size()]);

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
                        * field for PackageCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPackageCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPackageCode(){
                               return localPackageCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageCode
                               */
                               public void setPackageCode(java.lang.String param){
                            
                                            this.localPackageCode=param;
                                    

                               }
                            

                        /**
                        * field for CalculationRule
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localCalculationRule ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCalculationRule(){
                               return localCalculationRule;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CalculationRule
                               */
                               public void setCalculationRule(java.lang.String param){
                            
                                            this.localCalculationRule=param;
                                    

                               }
                            

                        /**
                        * field for PostingRhythm
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPostingRhythm ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPostingRhythm(){
                               return localPostingRhythm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostingRhythm
                               */
                               public void setPostingRhythm(java.lang.String param){
                            
                                            this.localPostingRhythm=param;
                                    

                               }
                            

                        /**
                        * field for Quantity
                        * This was an Attribute!
                        */

                        
                                    protected int localQuantity ;
                                

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
                            
                                            this.localQuantity=param;
                                    

                               }
                            

                        /**
                        * field for IncludedInRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludedInRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludedInRate(){
                               return localIncludedInRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludedInRate
                               */
                               public void setIncludedInRate(boolean param){
                            
                                            this.localIncludedInRate=param;
                                    

                               }
                            

                        /**
                        * field for AddRateSeprateLine
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAddRateSeprateLine ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAddRateSeprateLine(){
                               return localAddRateSeprateLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddRateSeprateLine
                               */
                               public void setAddRateSeprateLine(boolean param){
                            
                                            this.localAddRateSeprateLine=param;
                                    

                               }
                            

                        /**
                        * field for AddRateCombinedLine
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAddRateCombinedLine ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAddRateCombinedLine(){
                               return localAddRateCombinedLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddRateCombinedLine
                               */
                               public void setAddRateCombinedLine(boolean param){
                            
                                            this.localAddRateCombinedLine=param;
                                    

                               }
                            

                        /**
                        * field for StartTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localStartTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getStartTime(){
                               return localStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartTime
                               */
                               public void setStartTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localStartTime=param;
                                    

                               }
                            

                        /**
                        * field for EndTime
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localEndTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getEndTime(){
                               return localEndTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndTime
                               */
                               public void setEndTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localEndTime=param;
                                    

                               }
                            

                        /**
                        * field for SellSeparate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSellSeparate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSellSeparate(){
                               return localSellSeparate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SellSeparate
                               */
                               public void setSellSeparate(boolean param){
                            
                                            this.localSellSeparate=param;
                                    

                               }
                            

                        /**
                        * field for TotalDepositAmount
                        * This was an Attribute!
                        */

                        
                                    protected double localTotalDepositAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTotalDepositAmount(){
                               return localTotalDepositAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalDepositAmount
                               */
                               public void setTotalDepositAmount(double param){
                            
                                            this.localTotalDepositAmount=param;
                                    

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
                        * field for TaxIncluded
                        * This was an Attribute!
                        */

                        
                                    protected boolean localTaxIncluded ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTaxIncluded(){
                               return localTaxIncluded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxIncluded
                               */
                               public void setTaxIncluded(boolean param){
                            
                                            this.localTaxIncluded=param;
                                    

                               }
                            

                        /**
                        * field for RepeatPostingRhythm
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRepeatPostingRhythm ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRepeatPostingRhythm(){
                               return localRepeatPostingRhythm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepeatPostingRhythm
                               */
                               public void setRepeatPostingRhythm(boolean param){
                            
                                            this.localRepeatPostingRhythm=param;
                                    

                               }
                            

                        /**
                        * field for DiscountRateAmount
                        * This was an Attribute!
                        */

                        
                                    protected double localDiscountRateAmount ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getDiscountRateAmount(){
                               return localDiscountRateAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DiscountRateAmount
                               */
                               public void setDiscountRateAmount(double param){
                            
                                            this.localDiscountRateAmount=param;
                                    

                               }
                            

                        /**
                        * field for DiscountRatePercent
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDiscountRatePercent ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDiscountRatePercent(){
                               return localDiscountRatePercent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DiscountRatePercent
                               */
                               public void setDiscountRatePercent(boolean param){
                            
                                            this.localDiscountRatePercent=param;
                                    

                               }
                            

                        /**
                        * field for PostingRhythmNights
                        * This was an Attribute!
                        */

                        
                                    protected int localPostingRhythmNights ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPostingRhythmNights(){
                               return localPostingRhythmNights;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostingRhythmNights
                               */
                               public void setPostingRhythmNights(int param){
                            
                                            this.localPostingRhythmNights=param;
                                    

                               }
                            

                        /**
                        * field for PackageType
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPackageType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPackageType(){
                               return localPackageType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageType
                               */
                               public void setPackageType(java.lang.String param){
                            
                                            this.localPackageType=param;
                                    

                               }
                            

                        /**
                        * field for PackageGroupCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPackageGroupCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPackageGroupCode(){
                               return localPackageGroupCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PackageGroupCode
                               */
                               public void setPackageGroupCode(java.lang.String param){
                            
                                            this.localPackageGroupCode=param;
                                    

                               }
                            

                        /**
                        * field for RateChangeIndicator
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRateChangeIndicator ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRateChangeIndicator(){
                               return localRateChangeIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateChangeIndicator
                               */
                               public void setRateChangeIndicator(boolean param){
                            
                                            this.localRateChangeIndicator=param;
                                    

                               }
                            

                        /**
                        * field for MinAdvanceBookingDays
                        * This was an Attribute!
                        */

                        
                                    protected int localMinAdvanceBookingDays ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMinAdvanceBookingDays(){
                               return localMinAdvanceBookingDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinAdvanceBookingDays
                               */
                               public void setMinAdvanceBookingDays(int param){
                            
                                            this.localMinAdvanceBookingDays=param;
                                    

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
                           namespacePrefix+":PackageElement",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PackageElement",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localPackageCode != null){
                                        
                                                writeAttribute("",
                                                         "packageCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localPackageCode is null");
                                      }
                                    
                                            if (localCalculationRule != null){
                                        
                                                writeAttribute("",
                                                         "calculationRule",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalculationRule), xmlWriter);

                                            
                                      }
                                    
                                            if (localPostingRhythm != null){
                                        
                                                writeAttribute("",
                                                         "postingRhythm",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm), xmlWriter);

                                            
                                      }
                                    
                                                   if (localQuantity!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "quantity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "includedInRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludedInRate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "addRateSeprateLine",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddRateSeprateLine), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "addRateCombinedLine",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddRateCombinedLine), xmlWriter);

                                            
                                      }
                                    
                                            if (localStartTime != null){
                                        
                                                writeAttribute("",
                                                         "startTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime), xmlWriter);

                                            
                                      }
                                    
                                            if (localEndTime != null){
                                        
                                                writeAttribute("",
                                                         "endTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "sellSeparate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellSeparate), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localTotalDepositAmount)) {
                                               
                                                writeAttribute("",
                                                         "totalDepositAmount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalDepositAmount), xmlWriter);

                                            
                                      }
                                    
                                            if (localSource != null){
                                        
                                                writeAttribute("",
                                                         "source",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "taxIncluded",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxIncluded), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "repeatPostingRhythm",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatPostingRhythm), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localDiscountRateAmount)) {
                                               
                                                writeAttribute("",
                                                         "discountRateAmount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiscountRateAmount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "discountRatePercent",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiscountRatePercent), xmlWriter);

                                            
                                      }
                                    
                                                   if (localPostingRhythmNights!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "postingRhythmNights",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythmNights), xmlWriter);

                                            
                                      }
                                    
                                            if (localPackageType != null){
                                        
                                                writeAttribute("",
                                                         "packageType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageType), xmlWriter);

                                            
                                      }
                                    
                                            if (localPackageGroupCode != null){
                                        
                                                writeAttribute("",
                                                         "packageGroupCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageGroupCode), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "rateChangeIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateChangeIndicator), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMinAdvanceBookingDays!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "minAdvanceBookingDays",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinAdvanceBookingDays), xmlWriter);

                                            
                                      }
                                     if (localAmountTracker){
                                            if (localAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                            }
                                           localAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Amount"),
                                               xmlWriter);
                                        } if (localPackageAmountTracker){
                                            if (localPackageAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PackageAmount cannot be null!!");
                                            }
                                           localPackageAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageAmount"),
                                               xmlWriter);
                                        } if (localTaxAmountTracker){
                                            if (localTaxAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TaxAmount cannot be null!!");
                                            }
                                           localTaxAmount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxAmount"),
                                               xmlWriter);
                                        } if (localAllowanceTracker){
                                            if (localAllowance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Allowance cannot be null!!");
                                            }
                                           localAllowance.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Allowance"),
                                               xmlWriter);
                                        } if (localDescriptionTracker){
                                       if (localDescription!=null){
                                            for (int i = 0;i < localDescription.length;i++){
                                                if (localDescription[i] != null){
                                                 localDescription[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        
                                    }
                                 } if (localShortDescriptionTracker){
                                       if (localShortDescription!=null){
                                            for (int i = 0;i < localShortDescription.length;i++){
                                                if (localShortDescription[i] != null){
                                                 localShortDescription[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ShortDescription"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("ShortDescription cannot be null!!");
                                        
                                    }
                                 } if (localLongDescriptionTracker){
                                       if (localLongDescription!=null){
                                            for (int i = 0;i < localLongDescription.length;i++){
                                                if (localLongDescription[i] != null){
                                                 localLongDescription[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","LongDescription"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                        
                                    }
                                 } if (localPackageDetailsTracker){
                                       if (localPackageDetails!=null){
                                            for (int i = 0;i < localPackageDetails.length;i++){
                                                if (localPackageDetails[i] != null){
                                                 localPackageDetails[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageDetails"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PackageDetails cannot be null!!");
                                        
                                    }
                                 } if (localPackageCodesTracker){
                                       if (localPackageCodes!=null){
                                            for (int i = 0;i < localPackageCodes.length;i++){
                                                if (localPackageCodes[i] != null){
                                                 localPackageCodes[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageCodes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PackageCodes cannot be null!!");
                                        
                                    }
                                 } if (localStartDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "StartDate", xmlWriter);
                             

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
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

                 if (localAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Amount"));
                            
                            
                                    if (localAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Amount cannot be null!!");
                                    }
                                    elementList.add(localAmount);
                                } if (localPackageAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "PackageAmount"));
                            
                            
                                    if (localPackageAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("PackageAmount cannot be null!!");
                                    }
                                    elementList.add(localPackageAmount);
                                } if (localTaxAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TaxAmount"));
                            
                            
                                    if (localTaxAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("TaxAmount cannot be null!!");
                                    }
                                    elementList.add(localTaxAmount);
                                } if (localAllowanceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Allowance"));
                            
                            
                                    if (localAllowance==null){
                                         throw new org.apache.axis2.databinding.ADBException("Allowance cannot be null!!");
                                    }
                                    elementList.add(localAllowance);
                                } if (localDescriptionTracker){
                             if (localDescription!=null) {
                                 for (int i = 0;i < localDescription.length;i++){

                                    if (localDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "Description"));
                                         elementList.add(localDescription[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    
                             }

                        } if (localShortDescriptionTracker){
                             if (localShortDescription!=null) {
                                 for (int i = 0;i < localShortDescription.length;i++){

                                    if (localShortDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "ShortDescription"));
                                         elementList.add(localShortDescription[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("ShortDescription cannot be null!!");
                                    
                             }

                        } if (localLongDescriptionTracker){
                             if (localLongDescription!=null) {
                                 for (int i = 0;i < localLongDescription.length;i++){

                                    if (localLongDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "LongDescription"));
                                         elementList.add(localLongDescription[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("LongDescription cannot be null!!");
                                    
                             }

                        } if (localPackageDetailsTracker){
                             if (localPackageDetails!=null) {
                                 for (int i = 0;i < localPackageDetails.length;i++){

                                    if (localPackageDetails[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "PackageDetails"));
                                         elementList.add(localPackageDetails[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PackageDetails cannot be null!!");
                                    
                             }

                        } if (localPackageCodesTracker){
                             if (localPackageCodes!=null) {
                                 for (int i = 0;i < localPackageCodes.length;i++){

                                    if (localPackageCodes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "PackageCodes"));
                                         elementList.add(localPackageCodes[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PackageCodes cannot be null!!");
                                    
                             }

                        } if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "StartDate"));
                                 
                                        if (localStartDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");
                                        }
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "EndDate"));
                                 
                                        if (localEndDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","packageCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","calculationRule"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalculationRule));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","postingRhythm"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","quantity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","includedInRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludedInRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","addRateSeprateLine"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddRateSeprateLine));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","addRateCombinedLine"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAddRateCombinedLine));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","startTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","endTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","sellSeparate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSellSeparate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","totalDepositAmount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalDepositAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","source"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","taxIncluded"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxIncluded));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","repeatPostingRhythm"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepeatPostingRhythm));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","discountRateAmount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiscountRateAmount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","discountRatePercent"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDiscountRatePercent));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","postingRhythmNights"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythmNights));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","packageType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","packageGroupCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPackageGroupCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateChangeIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateChangeIndicator));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","minAdvanceBookingDays"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinAdvanceBookingDays));
                                

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
        public static PackageElement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PackageElement object =
                new PackageElement();

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
                    
                            if (!"PackageElement".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PackageElement)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "packageCode"
                    java.lang.String tempAttribPackageCode =
                        
                                reader.getAttributeValue(null,"packageCode");
                            
                   if (tempAttribPackageCode!=null){
                         java.lang.String content = tempAttribPackageCode;
                        
                                                 object.setPackageCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPackageCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute packageCode is missing");
                           
                    }
                    handledAttributes.add("packageCode");
                    
                    // handle attribute "calculationRule"
                    java.lang.String tempAttribCalculationRule =
                        
                                reader.getAttributeValue(null,"calculationRule");
                            
                   if (tempAttribCalculationRule!=null){
                         java.lang.String content = tempAttribCalculationRule;
                        
                                                 object.setCalculationRule(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCalculationRule));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("calculationRule");
                    
                    // handle attribute "postingRhythm"
                    java.lang.String tempAttribPostingRhythm =
                        
                                reader.getAttributeValue(null,"postingRhythm");
                            
                   if (tempAttribPostingRhythm!=null){
                         java.lang.String content = tempAttribPostingRhythm;
                        
                                                 object.setPostingRhythm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPostingRhythm));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("postingRhythm");
                    
                    // handle attribute "quantity"
                    java.lang.String tempAttribQuantity =
                        
                                reader.getAttributeValue(null,"quantity");
                            
                   if (tempAttribQuantity!=null){
                         java.lang.String content = tempAttribQuantity;
                        
                                                 object.setQuantity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribQuantity));
                                            
                    } else {
                       
                                           object.setQuantity(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("quantity");
                    
                    // handle attribute "includedInRate"
                    java.lang.String tempAttribIncludedInRate =
                        
                                reader.getAttributeValue(null,"includedInRate");
                            
                   if (tempAttribIncludedInRate!=null){
                         java.lang.String content = tempAttribIncludedInRate;
                        
                                                 object.setIncludedInRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludedInRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("includedInRate");
                    
                    // handle attribute "addRateSeprateLine"
                    java.lang.String tempAttribAddRateSeprateLine =
                        
                                reader.getAttributeValue(null,"addRateSeprateLine");
                            
                   if (tempAttribAddRateSeprateLine!=null){
                         java.lang.String content = tempAttribAddRateSeprateLine;
                        
                                                 object.setAddRateSeprateLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAddRateSeprateLine));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("addRateSeprateLine");
                    
                    // handle attribute "addRateCombinedLine"
                    java.lang.String tempAttribAddRateCombinedLine =
                        
                                reader.getAttributeValue(null,"addRateCombinedLine");
                            
                   if (tempAttribAddRateCombinedLine!=null){
                         java.lang.String content = tempAttribAddRateCombinedLine;
                        
                                                 object.setAddRateCombinedLine(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAddRateCombinedLine));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("addRateCombinedLine");
                    
                    // handle attribute "startTime"
                    java.lang.String tempAttribStartTime =
                        
                                reader.getAttributeValue(null,"startTime");
                            
                   if (tempAttribStartTime!=null){
                         java.lang.String content = tempAttribStartTime;
                        
                                                 object.setStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribStartTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("startTime");
                    
                    // handle attribute "endTime"
                    java.lang.String tempAttribEndTime =
                        
                                reader.getAttributeValue(null,"endTime");
                            
                   if (tempAttribEndTime!=null){
                         java.lang.String content = tempAttribEndTime;
                        
                                                 object.setEndTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribEndTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("endTime");
                    
                    // handle attribute "sellSeparate"
                    java.lang.String tempAttribSellSeparate =
                        
                                reader.getAttributeValue(null,"sellSeparate");
                            
                   if (tempAttribSellSeparate!=null){
                         java.lang.String content = tempAttribSellSeparate;
                        
                                                 object.setSellSeparate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSellSeparate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("sellSeparate");
                    
                    // handle attribute "totalDepositAmount"
                    java.lang.String tempAttribTotalDepositAmount =
                        
                                reader.getAttributeValue(null,"totalDepositAmount");
                            
                   if (tempAttribTotalDepositAmount!=null){
                         java.lang.String content = tempAttribTotalDepositAmount;
                        
                                                 object.setTotalDepositAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribTotalDepositAmount));
                                            
                    } else {
                       
                                           object.setTotalDepositAmount(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("totalDepositAmount");
                    
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
                    
                    // handle attribute "taxIncluded"
                    java.lang.String tempAttribTaxIncluded =
                        
                                reader.getAttributeValue(null,"taxIncluded");
                            
                   if (tempAttribTaxIncluded!=null){
                         java.lang.String content = tempAttribTaxIncluded;
                        
                                                 object.setTaxIncluded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxIncluded));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("taxIncluded");
                    
                    // handle attribute "repeatPostingRhythm"
                    java.lang.String tempAttribRepeatPostingRhythm =
                        
                                reader.getAttributeValue(null,"repeatPostingRhythm");
                            
                   if (tempAttribRepeatPostingRhythm!=null){
                         java.lang.String content = tempAttribRepeatPostingRhythm;
                        
                                                 object.setRepeatPostingRhythm(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRepeatPostingRhythm));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("repeatPostingRhythm");
                    
                    // handle attribute "discountRateAmount"
                    java.lang.String tempAttribDiscountRateAmount =
                        
                                reader.getAttributeValue(null,"discountRateAmount");
                            
                   if (tempAttribDiscountRateAmount!=null){
                         java.lang.String content = tempAttribDiscountRateAmount;
                        
                                                 object.setDiscountRateAmount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribDiscountRateAmount));
                                            
                    } else {
                       
                                           object.setDiscountRateAmount(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("discountRateAmount");
                    
                    // handle attribute "discountRatePercent"
                    java.lang.String tempAttribDiscountRatePercent =
                        
                                reader.getAttributeValue(null,"discountRatePercent");
                            
                   if (tempAttribDiscountRatePercent!=null){
                         java.lang.String content = tempAttribDiscountRatePercent;
                        
                                                 object.setDiscountRatePercent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDiscountRatePercent));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("discountRatePercent");
                    
                    // handle attribute "postingRhythmNights"
                    java.lang.String tempAttribPostingRhythmNights =
                        
                                reader.getAttributeValue(null,"postingRhythmNights");
                            
                   if (tempAttribPostingRhythmNights!=null){
                         java.lang.String content = tempAttribPostingRhythmNights;
                        
                                                 object.setPostingRhythmNights(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribPostingRhythmNights));
                                            
                    } else {
                       
                                           object.setPostingRhythmNights(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("postingRhythmNights");
                    
                    // handle attribute "packageType"
                    java.lang.String tempAttribPackageType =
                        
                                reader.getAttributeValue(null,"packageType");
                            
                   if (tempAttribPackageType!=null){
                         java.lang.String content = tempAttribPackageType;
                        
                                                 object.setPackageType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPackageType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("packageType");
                    
                    // handle attribute "packageGroupCode"
                    java.lang.String tempAttribPackageGroupCode =
                        
                                reader.getAttributeValue(null,"packageGroupCode");
                            
                   if (tempAttribPackageGroupCode!=null){
                         java.lang.String content = tempAttribPackageGroupCode;
                        
                                                 object.setPackageGroupCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPackageGroupCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("packageGroupCode");
                    
                    // handle attribute "rateChangeIndicator"
                    java.lang.String tempAttribRateChangeIndicator =
                        
                                reader.getAttributeValue(null,"rateChangeIndicator");
                            
                   if (tempAttribRateChangeIndicator!=null){
                         java.lang.String content = tempAttribRateChangeIndicator;
                        
                                                 object.setRateChangeIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRateChangeIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateChangeIndicator");
                    
                    // handle attribute "minAdvanceBookingDays"
                    java.lang.String tempAttribMinAdvanceBookingDays =
                        
                                reader.getAttributeValue(null,"minAdvanceBookingDays");
                            
                   if (tempAttribMinAdvanceBookingDays!=null){
                         java.lang.String content = tempAttribMinAdvanceBookingDays;
                        
                                                 object.setMinAdvanceBookingDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMinAdvanceBookingDays));
                                            
                    } else {
                       
                                           object.setMinAdvanceBookingDays(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("minAdvanceBookingDays");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Amount").equals(reader.getName())){
                                
                                                object.setAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageAmount").equals(reader.getName())){
                                
                                                object.setPackageAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TaxAmount").equals(reader.getName())){
                                
                                                object.setTaxAmount(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Allowance").equals(reader.getName())){
                                
                                                object.setAllowance(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Description").equals(reader.getName())){
                                                                    list5.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDescription((com.cloudkey.pms.micros.og.common.DescriptiveText[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.DescriptiveText.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ShortDescription").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","ShortDescription").equals(reader.getName())){
                                                                    list6.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setShortDescription((com.cloudkey.pms.micros.og.common.DescriptiveText[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.DescriptiveText.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","LongDescription").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
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
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","LongDescription").equals(reader.getName())){
                                                                    list7.add(com.cloudkey.pms.micros.og.common.DescriptiveText.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLongDescription((com.cloudkey.pms.micros.og.common.DescriptiveText[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.DescriptiveText.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageDetails").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list8.add(com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
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
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageDetails").equals(reader.getName())){
                                                                    list8.add(com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPackageDetails((com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.PackageDetailCharges.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageCodes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.cloudkey.pms.micros.og.hotelcommon.PackageMember.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
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
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","PackageCodes").equals(reader.getName())){
                                                                    list9.add(com.cloudkey.pms.micros.og.hotelcommon.PackageMember.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPackageCodes((com.cloudkey.pms.micros.og.hotelcommon.PackageMember[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.PackageMember.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","StartDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","EndDate").equals(reader.getName())){
                                
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
           
    