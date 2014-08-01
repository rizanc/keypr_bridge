
/**
 * BillHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  BillHeader bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BillHeader
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BillHeader
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns7
                */
            

                        /**
                        * field for Address
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameAddress localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;

                           public boolean isAddressSpecified(){
                               return localAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameAddress
                           */
                           public  com.cloudkey.pms.micros.og.name.NameAddress getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.cloudkey.pms.micros.og.name.NameAddress param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NativeName localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NativeName
                           */
                           public  com.cloudkey.pms.micros.og.name.NativeName getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(com.cloudkey.pms.micros.og.name.NativeName param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for ProfileIDs
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueIDList localProfileIDs ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueIDList
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueIDList getProfileIDs(){
                               return localProfileIDs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileIDs
                               */
                               public void setProfileIDs(com.cloudkey.pms.micros.og.common.UniqueIDList param){
                            
                                            this.localProfileIDs=param;
                                    

                               }
                            

                        /**
                        * field for BillNumber
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.UniqueID localBillNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillNumberTracker = false ;

                           public boolean isBillNumberSpecified(){
                               return localBillNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.UniqueID
                           */
                           public  com.cloudkey.pms.micros.og.common.UniqueID getBillNumber(){
                               return localBillNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillNumber
                               */
                               public void setBillNumber(com.cloudkey.pms.micros.og.common.UniqueID param){
                            localBillNumberTracker = param != null;
                                   
                                            this.localBillNumber=param;
                                    

                               }
                            

                        /**
                        * field for BillItems
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.BillItem[] localBillItems ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillItemsTracker = false ;

                           public boolean isBillItemsSpecified(){
                               return localBillItemsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.BillItem[]
                           */
                           public  com.cloudkey.pms.micros.og.reservation.BillItem[] getBillItems(){
                               return localBillItems;
                           }

                           
                        


                               
                              /**
                               * validate the array for BillItems
                               */
                              protected void validateBillItems(com.cloudkey.pms.micros.og.reservation.BillItem[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BillItems
                              */
                              public void setBillItems(com.cloudkey.pms.micros.og.reservation.BillItem[] param){
                              
                                   validateBillItems(param);

                               localBillItemsTracker = param != null;
                                      
                                      this.localBillItems=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.reservation.BillItem
                             */
                             public void addBillItems(com.cloudkey.pms.micros.og.reservation.BillItem param){
                                   if (localBillItems == null){
                                   localBillItems = new com.cloudkey.pms.micros.og.reservation.BillItem[]{};
                                   }

                            
                                 //update the setting tracker
                                localBillItemsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBillItems);
                               list.add(param);
                               this.localBillItems =
                             (com.cloudkey.pms.micros.og.reservation.BillItem[])list.toArray(
                            new com.cloudkey.pms.micros.og.reservation.BillItem[list.size()]);

                             }
                             

                        /**
                        * field for BillTaxes
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.BillTax[] localBillTaxes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillTaxesTracker = false ;

                           public boolean isBillTaxesSpecified(){
                               return localBillTaxesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.BillTax[]
                           */
                           public  com.cloudkey.pms.micros.og.reservation.BillTax[] getBillTaxes(){
                               return localBillTaxes;
                           }

                           
                        


                               
                              /**
                               * validate the array for BillTaxes
                               */
                              protected void validateBillTaxes(com.cloudkey.pms.micros.og.reservation.BillTax[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BillTaxes
                              */
                              public void setBillTaxes(com.cloudkey.pms.micros.og.reservation.BillTax[] param){
                              
                                   validateBillTaxes(param);

                               localBillTaxesTracker = param != null;
                                      
                                      this.localBillTaxes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.reservation.BillTax
                             */
                             public void addBillTaxes(com.cloudkey.pms.micros.og.reservation.BillTax param){
                                   if (localBillTaxes == null){
                                   localBillTaxes = new com.cloudkey.pms.micros.og.reservation.BillTax[]{};
                                   }

                            
                                 //update the setting tracker
                                localBillTaxesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBillTaxes);
                               list.add(param);
                               this.localBillTaxes =
                             (com.cloudkey.pms.micros.og.reservation.BillTax[])list.toArray(
                            new com.cloudkey.pms.micros.og.reservation.BillTax[list.size()]);

                             }
                             

                        /**
                        * field for CreditCardSurcharges
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[] localCreditCardSurcharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditCardSurchargesTracker = false ;

                           public boolean isCreditCardSurchargesSpecified(){
                               return localCreditCardSurchargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[]
                           */
                           public  com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[] getCreditCardSurcharges(){
                               return localCreditCardSurcharges;
                           }

                           
                        


                               
                              /**
                               * validate the array for CreditCardSurcharges
                               */
                              protected void validateCreditCardSurcharges(com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CreditCardSurcharges
                              */
                              public void setCreditCardSurcharges(com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[] param){
                              
                                   validateCreditCardSurcharges(param);

                               localCreditCardSurchargesTracker = param != null;
                                      
                                      this.localCreditCardSurcharges=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge
                             */
                             public void addCreditCardSurcharges(com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge param){
                                   if (localCreditCardSurcharges == null){
                                   localCreditCardSurcharges = new com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[]{};
                                   }

                            
                                 //update the setting tracker
                                localCreditCardSurchargesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCreditCardSurcharges);
                               list.add(param);
                               this.localCreditCardSurcharges =
                             (com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[])list.toArray(
                            new com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[list.size()]);

                             }
                             

                        /**
                        * field for CurrentBalance
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localCurrentBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentBalanceTracker = false ;

                           public boolean isCurrentBalanceSpecified(){
                               return localCurrentBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getCurrentBalance(){
                               return localCurrentBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentBalance
                               */
                               public void setCurrentBalance(com.cloudkey.pms.micros.og.common.Amount param){
                            localCurrentBalanceTracker = param != null;
                                   
                                            this.localCurrentBalance=param;
                                    

                               }
                            

                        /**
                        * field for FolioViewNo
                        * This was an Attribute!
                        */

                        
                                    protected int localFolioViewNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFolioViewNo(){
                               return localFolioViewNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FolioViewNo
                               */
                               public void setFolioViewNo(int param){
                            
                                            this.localFolioViewNo=param;
                                    

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
                           namespacePrefix+":BillHeader",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BillHeader",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (localFolioViewNo!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "FolioViewNo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo), xmlWriter);

                                            
                                      }
                                     if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Address"),
                                               xmlWriter);
                                        }
                                            if (localName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                            }
                                           localName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Name"),
                                               xmlWriter);
                                        
                                            if (localProfileIDs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ProfileIDs cannot be null!!");
                                            }
                                           localProfileIDs.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ProfileIDs"),
                                               xmlWriter);
                                         if (localBillNumberTracker){
                                            if (localBillNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BillNumber cannot be null!!");
                                            }
                                           localBillNumber.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillNumber"),
                                               xmlWriter);
                                        } if (localBillItemsTracker){
                                       if (localBillItems!=null){
                                            for (int i = 0;i < localBillItems.length;i++){
                                                if (localBillItems[i] != null){
                                                 localBillItems[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillItems"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("BillItems cannot be null!!");
                                        
                                    }
                                 } if (localBillTaxesTracker){
                                       if (localBillTaxes!=null){
                                            for (int i = 0;i < localBillTaxes.length;i++){
                                                if (localBillTaxes[i] != null){
                                                 localBillTaxes[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillTaxes"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("BillTaxes cannot be null!!");
                                        
                                    }
                                 } if (localCreditCardSurchargesTracker){
                                       if (localCreditCardSurcharges!=null){
                                            for (int i = 0;i < localCreditCardSurcharges.length;i++){
                                                if (localCreditCardSurcharges[i] != null){
                                                 localCreditCardSurcharges[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CreditCardSurcharges"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("CreditCardSurcharges cannot be null!!");
                                        
                                    }
                                 } if (localCurrentBalanceTracker){
                                            if (localCurrentBalance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CurrentBalance cannot be null!!");
                                            }
                                           localCurrentBalance.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CurrentBalance"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Reservation/")){
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

                 if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Name"));
                            
                            
                                    if (localName==null){
                                         throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                    }
                                    elementList.add(localName);
                                
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ProfileIDs"));
                            
                            
                                    if (localProfileIDs==null){
                                         throw new org.apache.axis2.databinding.ADBException("ProfileIDs cannot be null!!");
                                    }
                                    elementList.add(localProfileIDs);
                                 if (localBillNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "BillNumber"));
                            
                            
                                    if (localBillNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("BillNumber cannot be null!!");
                                    }
                                    elementList.add(localBillNumber);
                                } if (localBillItemsTracker){
                             if (localBillItems!=null) {
                                 for (int i = 0;i < localBillItems.length;i++){

                                    if (localBillItems[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "BillItems"));
                                         elementList.add(localBillItems[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("BillItems cannot be null!!");
                                    
                             }

                        } if (localBillTaxesTracker){
                             if (localBillTaxes!=null) {
                                 for (int i = 0;i < localBillTaxes.length;i++){

                                    if (localBillTaxes[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "BillTaxes"));
                                         elementList.add(localBillTaxes[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("BillTaxes cannot be null!!");
                                    
                             }

                        } if (localCreditCardSurchargesTracker){
                             if (localCreditCardSurcharges!=null) {
                                 for (int i = 0;i < localCreditCardSurcharges.length;i++){

                                    if (localCreditCardSurcharges[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "CreditCardSurcharges"));
                                         elementList.add(localCreditCardSurcharges[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("CreditCardSurcharges cannot be null!!");
                                    
                             }

                        } if (localCurrentBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "CurrentBalance"));
                            
                            
                                    if (localCurrentBalance==null){
                                         throw new org.apache.axis2.databinding.ADBException("CurrentBalance cannot be null!!");
                                    }
                                    elementList.add(localCurrentBalance);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","FolioViewNo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFolioViewNo));
                                

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
        public static BillHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BillHeader object =
                new BillHeader();

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
                    
                            if (!"BillHeader".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BillHeader)com.cloudkey.pms.micros.ows.reservation.advanced.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "FolioViewNo"
                    java.lang.String tempAttribFolioViewNo =
                        
                                reader.getAttributeValue(null,"FolioViewNo");
                            
                   if (tempAttribFolioViewNo!=null){
                         java.lang.String content = tempAttribFolioViewNo;
                        
                                                 object.setFolioViewNo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribFolioViewNo));
                                            
                    } else {
                       
                                           object.setFolioViewNo(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("FolioViewNo");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Address").equals(reader.getName())){
                                
                                                object.setAddress(com.cloudkey.pms.micros.og.name.NameAddress.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Name").equals(reader.getName())){
                                
                                                object.setName(com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ProfileIDs").equals(reader.getName())){
                                
                                                object.setProfileIDs(com.cloudkey.pms.micros.og.common.UniqueIDList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillNumber").equals(reader.getName())){
                                
                                                object.setBillNumber(com.cloudkey.pms.micros.og.common.UniqueID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillItems").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(com.cloudkey.pms.micros.og.reservation.BillItem.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillItems").equals(reader.getName())){
                                                                    list5.add(com.cloudkey.pms.micros.og.reservation.BillItem.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBillItems((com.cloudkey.pms.micros.og.reservation.BillItem[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.BillItem.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillTaxes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.cloudkey.pms.micros.og.reservation.BillTax.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","BillTaxes").equals(reader.getName())){
                                                                    list6.add(com.cloudkey.pms.micros.og.reservation.BillTax.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBillTaxes((com.cloudkey.pms.micros.og.reservation.BillTax[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.BillTax.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CreditCardSurcharges").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CreditCardSurcharges").equals(reader.getName())){
                                                                    list7.add(com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCreditCardSurcharges((com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.CreditCardSurcharge.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","CurrentBalance").equals(reader.getName())){
                                
                                                object.setCurrentBalance(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
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
           
    