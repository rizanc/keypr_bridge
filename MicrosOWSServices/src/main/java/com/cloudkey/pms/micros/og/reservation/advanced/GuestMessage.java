
/**
 * GuestMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation.advanced;
            

            /**
            *  GuestMessage bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class GuestMessage
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = GuestMessage
                Namespace URI = http://webservices.micros.com/og/4.3/ResvAdvanced/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for UserID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localUserID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserIDTracker = false ;

                           public boolean isUserIDSpecified(){
                               return localUserIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getUserID(){
                               return localUserID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserID
                               */
                               public void setUserID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localUserIDTracker = param != null;
                                   
                                            this.localUserID=param;
                                    

                               }
                            

                        /**
                        * field for Value
                        */

                        
                                    protected java.lang.String localValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValue(){
                               return localValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Value
                               */
                               public void setValue(java.lang.String param){
                            
                                            this.localValue=param;
                                    

                               }
                            

                        /**
                        * field for ReceivedYN
                        */

                        
                                    protected java.lang.String localReceivedYN ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceivedYNTracker = false ;

                           public boolean isReceivedYNSpecified(){
                               return localReceivedYNTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceivedYN(){
                               return localReceivedYN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceivedYN
                               */
                               public void setReceivedYN(java.lang.String param){
                            localReceivedYNTracker = param != null;
                                   
                                            this.localReceivedYN=param;
                                    

                               }
                            

                        /**
                        * field for StatusFlag
                        */

                        
                                    protected java.lang.String localStatusFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusFlagTracker = false ;

                           public boolean isStatusFlagSpecified(){
                               return localStatusFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStatusFlag(){
                               return localStatusFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusFlag
                               */
                               public void setStatusFlag(java.lang.String param){
                            localStatusFlagTracker = param != null;
                                   
                                            this.localStatusFlag=param;
                                    

                               }
                            

                        /**
                        * field for RecipientName
                        */

                        
                                    protected java.lang.String localRecipientName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecipientNameTracker = false ;

                           public boolean isRecipientNameSpecified(){
                               return localRecipientNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRecipientName(){
                               return localRecipientName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecipientName
                               */
                               public void setRecipientName(java.lang.String param){
                            localRecipientNameTracker = param != null;
                                   
                                            this.localRecipientName=param;
                                    

                               }
                            

                        /**
                        * field for ReceivedTime
                        */

                        
                                    protected java.util.Date localReceivedTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceivedTimeTracker = false ;

                           public boolean isReceivedTimeSpecified(){
                               return localReceivedTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getReceivedTime(){
                               return localReceivedTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceivedTime
                               */
                               public void setReceivedTime(java.util.Date param){
                            localReceivedTimeTracker = param != null;
                                   
                                            this.localReceivedTime=param;
                                    

                               }
                            

                        /**
                        * field for Printed
                        */

                        
                                    protected java.lang.String localPrinted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrintedTracker = false ;

                           public boolean isPrintedSpecified(){
                               return localPrintedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrinted(){
                               return localPrinted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Printed
                               */
                               public void setPrinted(java.lang.String param){
                            localPrintedTracker = param != null;
                                   
                                            this.localPrinted=param;
                                    

                               }
                            

                        /**
                        * field for TextMessageSent
                        */

                        
                                    protected java.lang.String localTextMessageSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTextMessageSentTracker = false ;

                           public boolean isTextMessageSentSpecified(){
                               return localTextMessageSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTextMessageSent(){
                               return localTextMessageSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TextMessageSent
                               */
                               public void setTextMessageSent(java.lang.String param){
                            localTextMessageSentTracker = param != null;
                                   
                                            this.localTextMessageSent=param;
                                    

                               }
                            

                        /**
                        * field for ReceivedBy
                        */

                        
                                    protected java.lang.String localReceivedBy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceivedByTracker = false ;

                           public boolean isReceivedBySpecified(){
                               return localReceivedByTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceivedBy(){
                               return localReceivedBy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceivedBy
                               */
                               public void setReceivedBy(java.lang.String param){
                            localReceivedByTracker = param != null;
                                   
                                            this.localReceivedBy=param;
                                    

                               }
                            

                        /**
                        * field for SenderTitle
                        */

                        
                                    protected java.lang.String localSenderTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderTitleTracker = false ;

                           public boolean isSenderTitleSpecified(){
                               return localSenderTitleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderTitle(){
                               return localSenderTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderTitle
                               */
                               public void setSenderTitle(java.lang.String param){
                            localSenderTitleTracker = param != null;
                                   
                                            this.localSenderTitle=param;
                                    

                               }
                            

                        /**
                        * field for SenderName
                        */

                        
                                    protected java.lang.String localSenderName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderNameTracker = false ;

                           public boolean isSenderNameSpecified(){
                               return localSenderNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderName(){
                               return localSenderName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderName
                               */
                               public void setSenderName(java.lang.String param){
                            localSenderNameTracker = param != null;
                                   
                                            this.localSenderName=param;
                                    

                               }
                            

                        /**
                        * field for SenderFirstName
                        */

                        
                                    protected java.lang.String localSenderFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderFirstNameTracker = false ;

                           public boolean isSenderFirstNameSpecified(){
                               return localSenderFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderFirstName(){
                               return localSenderFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderFirstName
                               */
                               public void setSenderFirstName(java.lang.String param){
                            localSenderFirstNameTracker = param != null;
                                   
                                            this.localSenderFirstName=param;
                                    

                               }
                            

                        /**
                        * field for SenderCompany
                        */

                        
                                    protected java.lang.String localSenderCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderCompanyTracker = false ;

                           public boolean isSenderCompanySpecified(){
                               return localSenderCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderCompany(){
                               return localSenderCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderCompany
                               */
                               public void setSenderCompany(java.lang.String param){
                            localSenderCompanyTracker = param != null;
                                   
                                            this.localSenderCompany=param;
                                    

                               }
                            

                        /**
                        * field for SenderContact
                        */

                        
                                    protected java.lang.String localSenderContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSenderContactTracker = false ;

                           public boolean isSenderContactSpecified(){
                               return localSenderContactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSenderContact(){
                               return localSenderContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SenderContact
                               */
                               public void setSenderContact(java.lang.String param){
                            localSenderContactTracker = param != null;
                                   
                                            this.localSenderContact=param;
                                    

                               }
                            

                        /**
                        * field for GuestMessageID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localGuestMessageID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuestMessageIDTracker = false ;

                           public boolean isGuestMessageIDSpecified(){
                               return localGuestMessageIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getGuestMessageID(){
                               return localGuestMessageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuestMessageID
                               */
                               public void setGuestMessageID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localGuestMessageIDTracker = param != null;
                                   
                                            this.localGuestMessageID=param;
                                    

                               }
                            

                        /**
                        * field for Date
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDate(){
                               return localDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Date
                               */
                               public void setDate(java.util.Date param){
                            
                                            this.localDate=param;
                                    

                               }
                            

                        /**
                        * field for Time
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.Time localTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.Time
                           */
                           public  org.apache.axis2.databinding.types.Time getTime(){
                               return localTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Time
                               */
                               public void setTime(org.apache.axis2.databinding.types.Time param){
                            
                                            this.localTime=param;
                                    

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
                           namespacePrefix+":GuestMessage",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "GuestMessage",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDate != null){
                                        
                                                writeAttribute("",
                                                         "Date",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localDate is null");
                                      }
                                    
                                            if (localTime != null){
                                        
                                                writeAttribute("",
                                                         "Time",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime), xmlWriter);

                                            
                                      }
                                     if (localUserIDTracker){
                                            if (localUserID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserID cannot be null!!");
                                            }
                                           localUserID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","UserID"),
                                               xmlWriter);
                                        }
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Value", xmlWriter);
                             

                                          if (localValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Value cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localReceivedYNTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "ReceivedYN", xmlWriter);
                             

                                          if (localReceivedYN==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceivedYN cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceivedYN);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusFlagTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "StatusFlag", xmlWriter);
                             

                                          if (localStatusFlag==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StatusFlag cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStatusFlag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRecipientNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "RecipientName", xmlWriter);
                             

                                          if (localRecipientName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("RecipientName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRecipientName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceivedTimeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "ReceivedTime", xmlWriter);
                             

                                          if (localReceivedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceivedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrintedTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "Printed", xmlWriter);
                             

                                          if (localPrinted==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Printed cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrinted);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTextMessageSentTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "TextMessageSent", xmlWriter);
                             

                                          if (localTextMessageSent==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("TextMessageSent cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTextMessageSent);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceivedByTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "ReceivedBy", xmlWriter);
                             

                                          if (localReceivedBy==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReceivedBy cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceivedBy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderTitleTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "SenderTitle", xmlWriter);
                             

                                          if (localSenderTitle==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderTitle cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "SenderName", xmlWriter);
                             

                                          if (localSenderName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderFirstNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "SenderFirstName", xmlWriter);
                             

                                          if (localSenderFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderFirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderCompanyTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "SenderCompany", xmlWriter);
                             

                                          if (localSenderCompany==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderCompany cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderCompany);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSenderContactTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/";
                                    writeStartElement(null, namespace, "SenderContact", xmlWriter);
                             

                                          if (localSenderContact==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SenderContact cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSenderContact);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGuestMessageIDTracker){
                                            if (localGuestMessageID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuestMessageID cannot be null!!");
                                            }
                                           localGuestMessageID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","GuestMessageID"),
                                               xmlWriter);
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

                 if (localUserIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "UserID"));
                            
                            
                                    if (localUserID==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserID cannot be null!!");
                                    }
                                    elementList.add(localUserID);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Value"));
                                 
                                        if (localValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Value cannot be null!!");
                                        }
                                     if (localReceivedYNTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReceivedYN"));
                                 
                                        if (localReceivedYN != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedYN));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceivedYN cannot be null!!");
                                        }
                                    } if (localStatusFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "StatusFlag"));
                                 
                                        if (localStatusFlag != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatusFlag));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StatusFlag cannot be null!!");
                                        }
                                    } if (localRecipientNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "RecipientName"));
                                 
                                        if (localRecipientName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("RecipientName cannot be null!!");
                                        }
                                    } if (localReceivedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReceivedTime"));
                                 
                                        if (localReceivedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceivedTime cannot be null!!");
                                        }
                                    } if (localPrintedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "Printed"));
                                 
                                        if (localPrinted != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrinted));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Printed cannot be null!!");
                                        }
                                    } if (localTextMessageSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "TextMessageSent"));
                                 
                                        if (localTextMessageSent != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTextMessageSent));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("TextMessageSent cannot be null!!");
                                        }
                                    } if (localReceivedByTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "ReceivedBy"));
                                 
                                        if (localReceivedBy != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceivedBy));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReceivedBy cannot be null!!");
                                        }
                                    } if (localSenderTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SenderTitle"));
                                 
                                        if (localSenderTitle != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderTitle));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderTitle cannot be null!!");
                                        }
                                    } if (localSenderNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SenderName"));
                                 
                                        if (localSenderName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderName cannot be null!!");
                                        }
                                    } if (localSenderFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SenderFirstName"));
                                 
                                        if (localSenderFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderFirstName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderFirstName cannot be null!!");
                                        }
                                    } if (localSenderCompanyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SenderCompany"));
                                 
                                        if (localSenderCompany != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderCompany));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderCompany cannot be null!!");
                                        }
                                    } if (localSenderContactTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "SenderContact"));
                                 
                                        if (localSenderContact != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenderContact));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SenderContact cannot be null!!");
                                        }
                                    } if (localGuestMessageIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/",
                                                                      "GuestMessageID"));
                            
                            
                                    if (localGuestMessageID==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuestMessageID cannot be null!!");
                                    }
                                    elementList.add(localGuestMessageID);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","Date"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Time"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTime));
                                

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
        public static GuestMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            GuestMessage object =
                new GuestMessage();

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
                    
                            if (!"GuestMessage".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (GuestMessage)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "Date"
                    java.lang.String tempAttribDate =
                        
                                reader.getAttributeValue(null,"Date");
                            
                   if (tempAttribDate!=null){
                         java.lang.String content = tempAttribDate;
                        
                                                 object.setDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribDate));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute Date is missing");
                           
                    }
                    handledAttributes.add("Date");
                    
                    // handle attribute "Time"
                    java.lang.String tempAttribTime =
                        
                                reader.getAttributeValue(null,"Time");
                            
                   if (tempAttribTime!=null){
                         java.lang.String content = tempAttribTime;
                        
                                                 object.setTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Time");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","UserID").equals(reader.getName())){
                                
                                                object.setUserID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Value").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Value" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReceivedYN").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReceivedYN" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceivedYN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","StatusFlag").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StatusFlag" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStatusFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","RecipientName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RecipientName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecipientName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReceivedTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReceivedTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceivedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","Printed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Printed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrinted(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","TextMessageSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TextMessageSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTextMessageSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","ReceivedBy").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReceivedBy" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceivedBy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SenderTitle").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SenderTitle" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SenderName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SenderName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SenderFirstName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SenderFirstName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SenderCompany").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SenderCompany" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderCompany(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","SenderContact").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SenderContact" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSenderContact(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/ResvAdvanced/","GuestMessageID").equals(reader.getName())){
                                
                                                object.setGuestMessageID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
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
           
    