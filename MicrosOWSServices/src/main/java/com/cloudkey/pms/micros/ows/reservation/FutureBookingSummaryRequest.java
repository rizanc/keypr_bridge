
/**
 * FutureBookingSummaryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.reservation;
            

            /**
            *  FutureBookingSummaryRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FutureBookingSummaryRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FutureBookingSummaryRequest
                Namespace URI = http://webservices.micros.com/ows/5.1/Reservation.wsdl
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for QueryDateRange
                        */

                        
                                    protected com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange localQueryDateRange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryDateRangeTracker = false ;

                           public boolean isQueryDateRangeSpecified(){
                               return localQueryDateRangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange
                           */
                           public  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange getQueryDateRange(){
                               return localQueryDateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryDateRange
                               */
                               public void setQueryDateRange(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange param){
                            localQueryDateRangeTracker = param != null;
                                   
                                            this.localQueryDateRange=param;
                                    

                               }
                            

                        /**
                        * field for LastName
                        */

                        
                                    protected java.lang.String localLastName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameTracker = false ;

                           public boolean isLastNameSpecified(){
                               return localLastNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastName(){
                               return localLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastName
                               */
                               public void setLastName(java.lang.String param){
                            localLastNameTracker = param != null;
                                   
                                            this.localLastName=param;
                                    

                               }
                            

                        /**
                        * field for FirstName
                        */

                        
                                    protected java.lang.String localFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameTracker = false ;

                           public boolean isFirstNameSpecified(){
                               return localFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFirstName(){
                               return localFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstName
                               */
                               public void setFirstName(java.lang.String param){
                            localFirstNameTracker = param != null;
                                   
                                            this.localFirstName=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalFilters
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.FetchBookingFilters localAdditionalFilters ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdditionalFiltersTracker = false ;

                           public boolean isAdditionalFiltersSpecified(){
                               return localAdditionalFiltersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.FetchBookingFilters
                           */
                           public  com.cloudkey.pms.micros.og.reservation.FetchBookingFilters getAdditionalFilters(){
                               return localAdditionalFilters;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalFilters
                               */
                               public void setAdditionalFilters(com.cloudkey.pms.micros.og.reservation.FetchBookingFilters param){
                            localAdditionalFiltersTracker = param != null;
                                   
                                            this.localAdditionalFilters=param;
                                    

                               }
                            

                        /**
                        * field for EncryptedCreditCardSwipe
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.EncryptedSwipe localEncryptedCreditCardSwipe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEncryptedCreditCardSwipeTracker = false ;

                           public boolean isEncryptedCreditCardSwipeSpecified(){
                               return localEncryptedCreditCardSwipeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.EncryptedSwipe
                           */
                           public  com.cloudkey.pms.micros.og.common.EncryptedSwipe getEncryptedCreditCardSwipe(){
                               return localEncryptedCreditCardSwipe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EncryptedCreditCardSwipe
                               */
                               public void setEncryptedCreditCardSwipe(com.cloudkey.pms.micros.og.common.EncryptedSwipe param){
                            localEncryptedCreditCardSwipeTracker = param != null;
                                   
                                            this.localEncryptedCreditCardSwipe=param;
                                    

                               }
                            

                        /**
                        * field for FutureBookingSummaryRequestChoice_type0
                        */

                        
                                    protected com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type0 localFutureBookingSummaryRequestChoice_type0 ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type0
                           */
                           public  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type0 getFutureBookingSummaryRequestChoice_type0(){
                               return localFutureBookingSummaryRequestChoice_type0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FutureBookingSummaryRequestChoice_type0
                               */
                               public void setFutureBookingSummaryRequestChoice_type0(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type0 param){
                            
                                            this.localFutureBookingSummaryRequestChoice_type0=param;
                                    

                               }
                            

                        /**
                        * field for FutureBookingSummaryRequestChoice_type1
                        */

                        
                                    protected com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type1 localFutureBookingSummaryRequestChoice_type1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type1
                           */
                           public  com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type1 getFutureBookingSummaryRequestChoice_type1(){
                               return localFutureBookingSummaryRequestChoice_type1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FutureBookingSummaryRequestChoice_type1
                               */
                               public void setFutureBookingSummaryRequestChoice_type1(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type1 param){
                            
                                            this.localFutureBookingSummaryRequestChoice_type1=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfReservationsToBeFetched
                        */

                        
                                    protected int localNumberOfReservationsToBeFetched ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfReservationsToBeFetchedTracker = false ;

                           public boolean isNumberOfReservationsToBeFetchedSpecified(){
                               return localNumberOfReservationsToBeFetchedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfReservationsToBeFetched(){
                               return localNumberOfReservationsToBeFetched;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfReservationsToBeFetched
                               */
                               public void setNumberOfReservationsToBeFetched(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfReservationsToBeFetchedTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfReservationsToBeFetched=param;
                                    

                               }
                            

                        /**
                        * field for CanHandleVaultedCreditCard
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCanHandleVaultedCreditCard ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCanHandleVaultedCreditCard(){
                               return localCanHandleVaultedCreditCard;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CanHandleVaultedCreditCard
                               */
                               public void setCanHandleVaultedCreditCard(boolean param){
                            
                                            this.localCanHandleVaultedCreditCard=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Reservation.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":FutureBookingSummaryRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FutureBookingSummaryRequest",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "canHandleVaultedCreditCard",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard), xmlWriter);

                                            
                                      }
                                     if (localQueryDateRangeTracker){
                                            if (localQueryDateRange==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryDateRange cannot be null!!");
                                            }
                                           localQueryDateRange.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","QueryDateRange"),
                                               xmlWriter);
                                        } if (localLastNameTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Reservation.wsdl";
                                    writeStartElement(null, namespace, "LastName", xmlWriter);
                             

                                          if (localLastName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirstNameTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Reservation.wsdl";
                                    writeStartElement(null, namespace, "FirstName", xmlWriter);
                             

                                          if (localFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdditionalFiltersTracker){
                                            if (localAdditionalFilters==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalFilters cannot be null!!");
                                            }
                                           localAdditionalFilters.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","AdditionalFilters"),
                                               xmlWriter);
                                        } if (localEncryptedCreditCardSwipeTracker){
                                            if (localEncryptedCreditCardSwipe==null){
                                                 throw new org.apache.axis2.databinding.ADBException("EncryptedCreditCardSwipe cannot be null!!");
                                            }
                                           localEncryptedCreditCardSwipe.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","EncryptedCreditCardSwipe"),
                                               xmlWriter);
                                        }
                                            if (localFutureBookingSummaryRequestChoice_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FutureBookingSummaryRequestChoice_type0 cannot be null!!");
                                            }
                                           localFutureBookingSummaryRequestChoice_type0.serialize(null,xmlWriter);
                                        
                                            if (localFutureBookingSummaryRequestChoice_type1==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FutureBookingSummaryRequestChoice_type1 cannot be null!!");
                                            }
                                           localFutureBookingSummaryRequestChoice_type1.serialize(null,xmlWriter);
                                         if (localNumberOfReservationsToBeFetchedTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Reservation.wsdl";
                                    writeStartElement(null, namespace, "numberOfReservationsToBeFetched", xmlWriter);
                             
                                               if (localNumberOfReservationsToBeFetched==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberOfReservationsToBeFetched cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfReservationsToBeFetched));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Reservation.wsdl")){
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

                 if (localQueryDateRangeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "QueryDateRange"));
                            
                            
                                    if (localQueryDateRange==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryDateRange cannot be null!!");
                                    }
                                    elementList.add(localQueryDateRange);
                                } if (localLastNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "LastName"));
                                 
                                        if (localLastName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                        }
                                    } if (localFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "FirstName"));
                                 
                                        if (localFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                        }
                                    } if (localAdditionalFiltersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "AdditionalFilters"));
                            
                            
                                    if (localAdditionalFilters==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalFilters cannot be null!!");
                                    }
                                    elementList.add(localAdditionalFilters);
                                } if (localEncryptedCreditCardSwipeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "EncryptedCreditCardSwipe"));
                            
                            
                                    if (localEncryptedCreditCardSwipe==null){
                                         throw new org.apache.axis2.databinding.ADBException("EncryptedCreditCardSwipe cannot be null!!");
                                    }
                                    elementList.add(localEncryptedCreditCardSwipe);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "FutureBookingSummaryRequestChoice_type0"));
                            
                            
                                    if (localFutureBookingSummaryRequestChoice_type0==null){
                                         throw new org.apache.axis2.databinding.ADBException("FutureBookingSummaryRequestChoice_type0 cannot be null!!");
                                    }
                                    elementList.add(localFutureBookingSummaryRequestChoice_type0);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "FutureBookingSummaryRequestChoice_type1"));
                            
                            
                                    if (localFutureBookingSummaryRequestChoice_type1==null){
                                         throw new org.apache.axis2.databinding.ADBException("FutureBookingSummaryRequestChoice_type1 cannot be null!!");
                                    }
                                    elementList.add(localFutureBookingSummaryRequestChoice_type1);
                                 if (localNumberOfReservationsToBeFetchedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl",
                                                                      "numberOfReservationsToBeFetched"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfReservationsToBeFetched));
                            }
                            attribList.add(
                            new javax.xml.namespace.QName("","canHandleVaultedCreditCard"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCanHandleVaultedCreditCard));
                                

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
        public static FutureBookingSummaryRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FutureBookingSummaryRequest object =
                new FutureBookingSummaryRequest();

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
                    
                            if (!"FutureBookingSummaryRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FutureBookingSummaryRequest)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "canHandleVaultedCreditCard"
                    java.lang.String tempAttribCanHandleVaultedCreditCard =
                        
                                reader.getAttributeValue(null,"canHandleVaultedCreditCard");
                            
                   if (tempAttribCanHandleVaultedCreditCard!=null){
                         java.lang.String content = tempAttribCanHandleVaultedCreditCard;
                        
                                                 object.setCanHandleVaultedCreditCard(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCanHandleVaultedCreditCard));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("canHandleVaultedCreditCard");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","QueryDateRange").equals(reader.getName())){
                                
                                                object.setQueryDateRange(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestQueryDateRange.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","LastName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LastName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","FirstName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"FirstName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","AdditionalFilters").equals(reader.getName())){
                                
                                                object.setAdditionalFilters(com.cloudkey.pms.micros.og.reservation.FetchBookingFilters.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","EncryptedCreditCardSwipe").equals(reader.getName())){
                                
                                                object.setEncryptedCreditCardSwipe(com.cloudkey.pms.micros.og.common.EncryptedSwipe.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setFutureBookingSummaryRequestChoice_type0(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() ){
                                
                                                object.setFutureBookingSummaryRequestChoice_type1(com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequestChoice_type1.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Reservation.wsdl","numberOfReservationsToBeFetched").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberOfReservationsToBeFetched" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfReservationsToBeFetched(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfReservationsToBeFetched(java.lang.Integer.MIN_VALUE);
                                           
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
           
    