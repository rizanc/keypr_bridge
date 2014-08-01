
/**
 * FetchBookingFilters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  FetchBookingFilters bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FetchBookingFilters
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FetchBookingFilters
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for CreationDate
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.TimeSpan localCreationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreationDateTracker = false ;

                           public boolean isCreationDateSpecified(){
                               return localCreationDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.TimeSpan
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.TimeSpan getCreationDate(){
                               return localCreationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreationDate
                               */
                               public void setCreationDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan param){
                            localCreationDateTracker = param != null;
                                   
                                            this.localCreationDate=param;
                                    

                               }
                            

                        /**
                        * field for ContractId
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localContractId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContractIdTracker = false ;

                           public boolean isContractIdSpecified(){
                               return localContractIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getContractId(){
                               return localContractId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContractId
                               */
                               public void setContractId(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localContractIdTracker = param != null;
                                   
                                            this.localContractId=param;
                                    

                               }
                            

                        /**
                        * field for Membership
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Membership localMembership ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembershipTracker = false ;

                           public boolean isMembershipSpecified(){
                               return localMembershipTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Membership
                           */
                           public  com.cloudkey.pms.micros.og.common.Membership getMembership(){
                               return localMembership;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Membership
                               */
                               public void setMembership(com.cloudkey.pms.micros.og.common.Membership param){
                            localMembershipTracker = param != null;
                                   
                                            this.localMembership=param;
                                    

                               }
                            

                        /**
                        * field for HotelReference
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.HotelReference localHotelReference ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHotelReferenceTracker = false ;

                           public boolean isHotelReferenceSpecified(){
                               return localHotelReferenceTracker;
                           }

                           

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
                            localHotelReferenceTracker = param != null;
                                   
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
                        * field for KeyTrack
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.KeyTrack localKeyTrack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyTrackTracker = false ;

                           public boolean isKeyTrackSpecified(){
                               return localKeyTrackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.KeyTrack
                           */
                           public  com.cloudkey.pms.micros.og.common.KeyTrack getKeyTrack(){
                               return localKeyTrack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyTrack
                               */
                               public void setKeyTrack(com.cloudkey.pms.micros.og.common.KeyTrack param){
                            localKeyTrackTracker = param != null;
                                   
                                            this.localKeyTrack=param;
                                    

                               }
                            

                        /**
                        * field for ExternalSystemNumber
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ExternalReference localExternalSystemNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalSystemNumberTracker = false ;

                           public boolean isExternalSystemNumberSpecified(){
                               return localExternalSystemNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ExternalReference
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ExternalReference getExternalSystemNumber(){
                               return localExternalSystemNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalSystemNumber
                               */
                               public void setExternalSystemNumber(com.cloudkey.pms.micros.og.reservation.ExternalReference param){
                            localExternalSystemNumberTracker = param != null;
                                   
                                            this.localExternalSystemNumber=param;
                                    

                               }
                            

                        /**
                        * field for BlockCode
                        */

                        
                                    protected java.lang.String localBlockCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlockCodeTracker = false ;

                           public boolean isBlockCodeSpecified(){
                               return localBlockCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBlockCode(){
                               return localBlockCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockCode
                               */
                               public void setBlockCode(java.lang.String param){
                            localBlockCodeTracker = param != null;
                                   
                                            this.localBlockCode=param;
                                    

                               }
                            

                        /**
                        * field for CompanyName
                        */

                        
                                    protected java.lang.String localCompanyName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompanyNameTracker = false ;

                           public boolean isCompanyNameSpecified(){
                               return localCompanyNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCompanyName(){
                               return localCompanyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompanyName
                               */
                               public void setCompanyName(java.lang.String param){
                            localCompanyNameTracker = param != null;
                                   
                                            this.localCompanyName=param;
                                    

                               }
                            

                        /**
                        * field for IataCorpSourceContactExternalID
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localIataCorpSourceContactExternalID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIataCorpSourceContactExternalIDTracker = false ;

                           public boolean isIataCorpSourceContactExternalIDSpecified(){
                               return localIataCorpSourceContactExternalIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getIataCorpSourceContactExternalID(){
                               return localIataCorpSourceContactExternalID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IataCorpSourceContactExternalID
                               */
                               public void setIataCorpSourceContactExternalID(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localIataCorpSourceContactExternalIDTracker = param != null;
                                   
                                            this.localIataCorpSourceContactExternalID=param;
                                    

                               }
                            

                        /**
                        * field for RecordLocator
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localRecordLocator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRecordLocatorTracker = false ;

                           public boolean isRecordLocatorSpecified(){
                               return localRecordLocatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getRecordLocator(){
                               return localRecordLocator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecordLocator
                               */
                               public void setRecordLocator(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localRecordLocatorTracker = param != null;
                                   
                                            this.localRecordLocator=param;
                                    

                               }
                            

                        /**
                        * field for GetList
                        * This was an Attribute!
                        */

                        
                                    protected boolean localGetList ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getGetList(){
                               return localGetList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetList
                               */
                               public void setGetList(boolean param){
                            
                                            this.localGetList=param;
                                    

                               }
                            

                        /**
                        * field for RoomNumber
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomNumber(){
                               return localRoomNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomNumber
                               */
                               public void setRoomNumber(java.lang.String param){
                            
                                            this.localRoomNumber=param;
                                    

                               }
                            

                        /**
                        * field for RoomClass
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomClass ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomClass(){
                               return localRoomClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomClass
                               */
                               public void setRoomClass(java.lang.String param){
                            
                                            this.localRoomClass=param;
                                    

                               }
                            

                        /**
                        * field for ReservationStatus
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ReservationStatusType localReservationStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ReservationStatusType
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ReservationStatusType getReservationStatus(){
                               return localReservationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationStatus
                               */
                               public void setReservationStatus(com.cloudkey.pms.micros.og.reservation.ReservationStatusType param){
                            
                                            this.localReservationStatus=param;
                                    

                               }
                            

                        /**
                        * field for ReservationDisposition
                        * This was an Attribute!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.ReservationDispositionType localReservationDisposition ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.ReservationDispositionType
                           */
                           public  com.cloudkey.pms.micros.og.reservation.ReservationDispositionType getReservationDisposition(){
                               return localReservationDisposition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationDisposition
                               */
                               public void setReservationDisposition(com.cloudkey.pms.micros.og.reservation.ReservationDispositionType param){
                            
                                            this.localReservationDisposition=param;
                                    

                               }
                            

                        /**
                        * field for IncludePseudoRoom
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIncludePseudoRoom ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludePseudoRoom(){
                               return localIncludePseudoRoom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludePseudoRoom
                               */
                               public void setIncludePseudoRoom(boolean param){
                            
                                            this.localIncludePseudoRoom=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Reservation/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FetchBookingFilters",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FetchBookingFilters",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "GetList",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetList), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomNumber != null){
                                        
                                                writeAttribute("",
                                                         "RoomNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber), xmlWriter);

                                            
                                      }
                                    
                                            if (localRoomClass != null){
                                        
                                                writeAttribute("",
                                                         "RoomClass",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localReservationStatus != null){
                                        writeAttribute("",
                                           "ReservationStatus",
                                           localReservationStatus.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localReservationDisposition != null){
                                        writeAttribute("",
                                           "ReservationDisposition",
                                           localReservationDisposition.toString(), xmlWriter);
                                    }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IncludePseudoRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePseudoRoom), xmlWriter);

                                            
                                      }
                                     if (localCreationDateTracker){
                                            if (localCreationDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreationDate cannot be null!!");
                                            }
                                           localCreationDate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CreationDate"),
                                               xmlWriter);
                                        } if (localContractIdTracker){
                                            if (localContractId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ContractId cannot be null!!");
                                            }
                                           localContractId.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ContractId"),
                                               xmlWriter);
                                        } if (localMembershipTracker){
                                            if (localMembership==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Membership cannot be null!!");
                                            }
                                           localMembership.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Membership"),
                                               xmlWriter);
                                        } if (localHotelReferenceTracker){
                                            if (localHotelReference==null){
                                                 throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                            }
                                           localHotelReference.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","HotelReference"),
                                               xmlWriter);
                                        } if (localConfirmationNumberTracker){
                                            if (localConfirmationNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                            }
                                           localConfirmationNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ConfirmationNumber"),
                                               xmlWriter);
                                        } if (localResvNameIdTracker){
                                            if (localResvNameId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResvNameId cannot be null!!");
                                            }
                                           localResvNameId.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResvNameId"),
                                               xmlWriter);
                                        } if (localKeyTrackTracker){
                                            if (localKeyTrack==null){
                                                 throw new org.apache.axis2.databinding.ADBException("KeyTrack cannot be null!!");
                                            }
                                           localKeyTrack.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","KeyTrack"),
                                               xmlWriter);
                                        } if (localExternalSystemNumberTracker){
                                            if (localExternalSystemNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExternalSystemNumber cannot be null!!");
                                            }
                                           localExternalSystemNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ExternalSystemNumber"),
                                               xmlWriter);
                                        } if (localBlockCodeTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "BlockCode", xmlWriter);
                             

                                          if (localBlockCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BlockCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBlockCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCompanyNameTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/Reservation/";
                                    writeStartElement(null, namespace, "CompanyName", xmlWriter);
                             

                                          if (localCompanyName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CompanyName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCompanyName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIataCorpSourceContactExternalIDTracker){
                                            if (localIataCorpSourceContactExternalID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IataCorpSourceContactExternalID cannot be null!!");
                                            }
                                           localIataCorpSourceContactExternalID.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","IataCorpSourceContactExternalID"),
                                               xmlWriter);
                                        } if (localRecordLocatorTracker){
                                            if (localRecordLocator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RecordLocator cannot be null!!");
                                            }
                                           localRecordLocator.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RecordLocator"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Reservation/")){
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

                 if (localCreationDateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "CreationDate"));
                            
                            
                                    if (localCreationDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreationDate cannot be null!!");
                                    }
                                    elementList.add(localCreationDate);
                                } if (localContractIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ContractId"));
                            
                            
                                    if (localContractId==null){
                                         throw new org.apache.axis2.databinding.ADBException("ContractId cannot be null!!");
                                    }
                                    elementList.add(localContractId);
                                } if (localMembershipTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Membership"));
                            
                            
                                    if (localMembership==null){
                                         throw new org.apache.axis2.databinding.ADBException("Membership cannot be null!!");
                                    }
                                    elementList.add(localMembership);
                                } if (localHotelReferenceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "HotelReference"));
                            
                            
                                    if (localHotelReference==null){
                                         throw new org.apache.axis2.databinding.ADBException("HotelReference cannot be null!!");
                                    }
                                    elementList.add(localHotelReference);
                                } if (localConfirmationNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ConfirmationNumber"));
                            
                            
                                    if (localConfirmationNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("ConfirmationNumber cannot be null!!");
                                    }
                                    elementList.add(localConfirmationNumber);
                                } if (localResvNameIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ResvNameId"));
                            
                            
                                    if (localResvNameId==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResvNameId cannot be null!!");
                                    }
                                    elementList.add(localResvNameId);
                                } if (localKeyTrackTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "KeyTrack"));
                            
                            
                                    if (localKeyTrack==null){
                                         throw new org.apache.axis2.databinding.ADBException("KeyTrack cannot be null!!");
                                    }
                                    elementList.add(localKeyTrack);
                                } if (localExternalSystemNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ExternalSystemNumber"));
                            
                            
                                    if (localExternalSystemNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExternalSystemNumber cannot be null!!");
                                    }
                                    elementList.add(localExternalSystemNumber);
                                } if (localBlockCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "BlockCode"));
                                 
                                        if (localBlockCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BlockCode cannot be null!!");
                                        }
                                    } if (localCompanyNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "CompanyName"));
                                 
                                        if (localCompanyName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompanyName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CompanyName cannot be null!!");
                                        }
                                    } if (localIataCorpSourceContactExternalIDTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "IataCorpSourceContactExternalID"));
                            
                            
                                    if (localIataCorpSourceContactExternalID==null){
                                         throw new org.apache.axis2.databinding.ADBException("IataCorpSourceContactExternalID cannot be null!!");
                                    }
                                    elementList.add(localIataCorpSourceContactExternalID);
                                } if (localRecordLocatorTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "RecordLocator"));
                            
                            
                                    if (localRecordLocator==null){
                                         throw new org.apache.axis2.databinding.ADBException("RecordLocator cannot be null!!");
                                    }
                                    elementList.add(localRecordLocator);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","GetList"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetList));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","RoomClass"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomClass));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReservationStatus"));
                            
                                      attribList.add(localReservationStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReservationDisposition"));
                            
                                      attribList.add(localReservationDisposition.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IncludePseudoRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludePseudoRoom));
                                

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
        public static FetchBookingFilters parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FetchBookingFilters object =
                new FetchBookingFilters();

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
                    
                            if (!"FetchBookingFilters".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FetchBookingFilters)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "GetList"
                    java.lang.String tempAttribGetList =
                        
                                reader.getAttributeValue(null,"GetList");
                            
                   if (tempAttribGetList!=null){
                         java.lang.String content = tempAttribGetList;
                        
                                                 object.setGetList(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribGetList));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("GetList");
                    
                    // handle attribute "RoomNumber"
                    java.lang.String tempAttribRoomNumber =
                        
                                reader.getAttributeValue(null,"RoomNumber");
                            
                   if (tempAttribRoomNumber!=null){
                         java.lang.String content = tempAttribRoomNumber;
                        
                                                 object.setRoomNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomNumber");
                    
                    // handle attribute "RoomClass"
                    java.lang.String tempAttribRoomClass =
                        
                                reader.getAttributeValue(null,"RoomClass");
                            
                   if (tempAttribRoomClass!=null){
                         java.lang.String content = tempAttribRoomClass;
                        
                                                 object.setRoomClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomClass));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RoomClass");
                    
                    // handle attribute "ReservationStatus"
                    java.lang.String tempAttribReservationStatus =
                        
                                reader.getAttributeValue(null,"ReservationStatus");
                            
                   if (tempAttribReservationStatus!=null){
                         java.lang.String content = tempAttribReservationStatus;
                        
                                                  object.setReservationStatus(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.fromString(reader,tempAttribReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReservationStatus");
                    
                    // handle attribute "ReservationDisposition"
                    java.lang.String tempAttribReservationDisposition =
                        
                                reader.getAttributeValue(null,"ReservationDisposition");
                            
                   if (tempAttribReservationDisposition!=null){
                         java.lang.String content = tempAttribReservationDisposition;
                        
                                                  object.setReservationDisposition(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationDispositionType.Factory.fromString(reader,tempAttribReservationDisposition));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReservationDisposition");
                    
                    // handle attribute "IncludePseudoRoom"
                    java.lang.String tempAttribIncludePseudoRoom =
                        
                                reader.getAttributeValue(null,"IncludePseudoRoom");
                            
                   if (tempAttribIncludePseudoRoom!=null){
                         java.lang.String content = tempAttribIncludePseudoRoom;
                        
                                                 object.setIncludePseudoRoom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIncludePseudoRoom));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IncludePseudoRoom");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CreationDate").equals(reader.getName())){
                                
                                                object.setCreationDate(com.cloudkey.pms.micros.og.hotelcommon.TimeSpan.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ContractId").equals(reader.getName())){
                                
                                                object.setContractId(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Membership").equals(reader.getName())){
                                
                                                object.setMembership(com.cloudkey.pms.micros.og.common.Membership.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","HotelReference").equals(reader.getName())){
                                
                                                object.setHotelReference(com.cloudkey.pms.micros.og.hotelcommon.HotelReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ConfirmationNumber").equals(reader.getName())){
                                
                                                object.setConfirmationNumber(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResvNameId").equals(reader.getName())){
                                
                                                object.setResvNameId(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","KeyTrack").equals(reader.getName())){
                                
                                                object.setKeyTrack(com.cloudkey.pms.micros.og.common.KeyTrack.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ExternalSystemNumber").equals(reader.getName())){
                                
                                                object.setExternalSystemNumber(com.cloudkey.pms.micros.og.reservation.ExternalReference.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BlockCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BlockCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBlockCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CompanyName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CompanyName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompanyName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","IataCorpSourceContactExternalID").equals(reader.getName())){
                                
                                                object.setIataCorpSourceContactExternalID(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RecordLocator").equals(reader.getName())){
                                
                                                object.setRecordLocator(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
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
           
    