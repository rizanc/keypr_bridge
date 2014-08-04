
/**
 * RatePlanRoomTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RatePlanRoomTypes bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RatePlanRoomTypes extends com.cloudkey.pms.micros.og.hotelcommon.RatePlan
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RatePlanRoomTypes
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for RoomTypes
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType localRoomTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRoomTypesTracker = false ;

                           public boolean isRoomTypesSpecified(){
                               return localRoomTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType getRoomTypes(){
                               return localRoomTypes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypes
                               */
                               public void setRoomTypes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType param){
                            localRoomTypesTracker = param != null;
                                   
                                            this.localRoomTypes=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/HotelCommon/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RatePlanRoomTypes",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RatePlanRoomTypes",
                           xmlWriter);
                   }

               
                                            if (localRatePlanCategory != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCategory",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCategory), xmlWriter);

                                            
                                      }
                                    
                                            if (localRatePlanCode != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localPromotionCode != null){
                                        
                                                writeAttribute("",
                                                         "promotionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localQualifyingIdType != null){
                                        
                                                writeAttribute("",
                                                         "qualifyingIdType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdType), xmlWriter);

                                            
                                      }
                                    
                                            if (localQualifyingIdValue != null){
                                        
                                                writeAttribute("",
                                                         "qualifyingIdValue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdValue), xmlWriter);

                                            
                                      }
                                    
                                            if (localEffectiveDate != null){
                                        
                                                writeAttribute("",
                                                         "effectiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "expirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "hold",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHold), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "commissionYn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionYn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "mandatoryDeposit",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "suppressRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localRatePlanName != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanName), xmlWriter);

                                            
                                      }
                                    
                                            if (localAwardType != null){
                                        
                                                writeAttribute("",
                                                         "awardType",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "redemRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localCommissionCode != null){
                                        
                                                writeAttribute("",
                                                         "commissionCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localAsbRateCycle != null){
                                        
                                                writeAttribute("",
                                                         "asbRateCycle",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsbRateCycle), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "hasPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "taxInclusive",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive), xmlWriter);

                                            
                                      }
                                    
                                            if (localBlockName != null){
                                        
                                                writeAttribute("",
                                                         "blockName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "rankRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRankRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localRateTypeIndicator != null){
                                        
                                                writeAttribute("",
                                                         "rateTypeIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateTypeIndicator), xmlWriter);

                                            
                                      }
                                    
                                            if (localPostingRhythm != null){
                                        
                                                writeAttribute("",
                                                         "postingRhythm",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm), xmlWriter);

                                            
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
                                     if (localRatePlanDescriptionTracker){
                                            if (localRatePlanDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlanDescription cannot be null!!");
                                            }
                                           localRatePlanDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanDescription"),
                                               xmlWriter);
                                        } if (localRatePlanShortDescriptionTracker){
                                            if (localRatePlanShortDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RatePlanShortDescription cannot be null!!");
                                            }
                                           localRatePlanShortDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanShortDescription"),
                                               xmlWriter);
                                        } if (localCommissionTracker){
                                            if (localCommission==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                            }
                                           localCommission.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Commission"),
                                               xmlWriter);
                                        } if (localAdditionalDetailsTracker){
                                            if (localAdditionalDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdditionalDetails cannot be null!!");
                                            }
                                           localAdditionalDetails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalDetails"),
                                               xmlWriter);
                                        } if (localCancellationDateTimeTracker){
                                            if (localCancellationDateTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CancellationDateTime cannot be null!!");
                                            }
                                           localCancellationDateTime.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancellationDateTime"),
                                               xmlWriter);
                                        } if (localDepositRequiredTracker){
                                            if (localDepositRequired==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DepositRequired cannot be null!!");
                                            }
                                           localDepositRequired.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DepositRequired"),
                                               xmlWriter);
                                        } if (localGdsFlagsTracker){
                                            if (localGdsFlags==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GdsFlags cannot be null!!");
                                            }
                                           localGdsFlags.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsFlags"),
                                               xmlWriter);
                                        } if (localGuaranteeDetailsTracker){
                                            if (localGuaranteeDetails==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GuaranteeDetails cannot be null!!");
                                            }
                                           localGuaranteeDetails.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDetails"),
                                               xmlWriter);
                                        } if (localMealPlanCodesTracker){
                                            if (localMealPlanCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MealPlanCodes cannot be null!!");
                                            }
                                           localMealPlanCodes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MealPlanCodes"),
                                               xmlWriter);
                                        } if (localPackagesTracker){
                                            if (localPackages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                            }
                                           localPackages.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages"),
                                               xmlWriter);
                                        } if (localDiscountTracker){
                                            if (localDiscount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Discount cannot be null!!");
                                            }
                                           localDiscount.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Discount"),
                                               xmlWriter);
                                        } if (localRoomTypesTracker){
                                            if (localRoomTypes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomTypes cannot be null!!");
                                            }
                                           localRoomTypes.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypes"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
                return "ns1";
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanRoomTypes"));
                 if (localRatePlanDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RatePlanDescription"));
                            
                            
                                    if (localRatePlanDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlanDescription cannot be null!!");
                                    }
                                    elementList.add(localRatePlanDescription);
                                } if (localRatePlanShortDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RatePlanShortDescription"));
                            
                            
                                    if (localRatePlanShortDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("RatePlanShortDescription cannot be null!!");
                                    }
                                    elementList.add(localRatePlanShortDescription);
                                } if (localCommissionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Commission"));
                            
                            
                                    if (localCommission==null){
                                         throw new org.apache.axis2.databinding.ADBException("Commission cannot be null!!");
                                    }
                                    elementList.add(localCommission);
                                } if (localAdditionalDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "AdditionalDetails"));
                            
                            
                                    if (localAdditionalDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdditionalDetails cannot be null!!");
                                    }
                                    elementList.add(localAdditionalDetails);
                                } if (localCancellationDateTimeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "CancellationDateTime"));
                            
                            
                                    if (localCancellationDateTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("CancellationDateTime cannot be null!!");
                                    }
                                    elementList.add(localCancellationDateTime);
                                } if (localDepositRequiredTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "DepositRequired"));
                            
                            
                                    if (localDepositRequired==null){
                                         throw new org.apache.axis2.databinding.ADBException("DepositRequired cannot be null!!");
                                    }
                                    elementList.add(localDepositRequired);
                                } if (localGdsFlagsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GdsFlags"));
                            
                            
                                    if (localGdsFlags==null){
                                         throw new org.apache.axis2.databinding.ADBException("GdsFlags cannot be null!!");
                                    }
                                    elementList.add(localGdsFlags);
                                } if (localGuaranteeDetailsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GuaranteeDetails"));
                            
                            
                                    if (localGuaranteeDetails==null){
                                         throw new org.apache.axis2.databinding.ADBException("GuaranteeDetails cannot be null!!");
                                    }
                                    elementList.add(localGuaranteeDetails);
                                } if (localMealPlanCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "MealPlanCodes"));
                            
                            
                                    if (localMealPlanCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("MealPlanCodes cannot be null!!");
                                    }
                                    elementList.add(localMealPlanCodes);
                                } if (localPackagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Packages"));
                            
                            
                                    if (localPackages==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                    }
                                    elementList.add(localPackages);
                                } if (localDiscountTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Discount"));
                            
                            
                                    if (localDiscount==null){
                                         throw new org.apache.axis2.databinding.ADBException("Discount cannot be null!!");
                                    }
                                    elementList.add(localDiscount);
                                } if (localRoomTypesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RoomTypes"));
                            
                            
                                    if (localRoomTypes==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomTypes cannot be null!!");
                                    }
                                    elementList.add(localRoomTypes);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCategory"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCategory));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","promotionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPromotionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifyingIdType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","qualifyingIdValue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifyingIdValue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","effectiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","expirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","hold"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHold));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commissionYn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionYn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","mandatoryDeposit"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMandatoryDeposit));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","suppressRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","awardType"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardType));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","redemRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commissionCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommissionCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","asbRateCycle"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsbRateCycle));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","hasPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","taxInclusive"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxInclusive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","blockName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rankRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRankRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","rateTypeIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRateTypeIndicator));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","postingRhythm"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPostingRhythm));
                                
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
        public static RatePlanRoomTypes parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RatePlanRoomTypes object =
                new RatePlanRoomTypes();

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
                    
                            if (!"RatePlanRoomTypes".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RatePlanRoomTypes)com.cloudkey.pms.micros.ows.availability.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ratePlanCategory"
                    java.lang.String tempAttribRatePlanCategory =
                        
                                reader.getAttributeValue(null,"ratePlanCategory");
                            
                   if (tempAttribRatePlanCategory!=null){
                         java.lang.String content = tempAttribRatePlanCategory;
                        
                                                 object.setRatePlanCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanCategory));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanCategory");
                    
                    // handle attribute "ratePlanCode"
                    java.lang.String tempAttribRatePlanCode =
                        
                                reader.getAttributeValue(null,"ratePlanCode");
                            
                   if (tempAttribRatePlanCode!=null){
                         java.lang.String content = tempAttribRatePlanCode;
                        
                                                 object.setRatePlanCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanCode");
                    
                    // handle attribute "promotionCode"
                    java.lang.String tempAttribPromotionCode =
                        
                                reader.getAttributeValue(null,"promotionCode");
                            
                   if (tempAttribPromotionCode!=null){
                         java.lang.String content = tempAttribPromotionCode;
                        
                                                 object.setPromotionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPromotionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("promotionCode");
                    
                    // handle attribute "qualifyingIdType"
                    java.lang.String tempAttribQualifyingIdType =
                        
                                reader.getAttributeValue(null,"qualifyingIdType");
                            
                   if (tempAttribQualifyingIdType!=null){
                         java.lang.String content = tempAttribQualifyingIdType;
                        
                                                 object.setQualifyingIdType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifyingIdType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifyingIdType");
                    
                    // handle attribute "qualifyingIdValue"
                    java.lang.String tempAttribQualifyingIdValue =
                        
                                reader.getAttributeValue(null,"qualifyingIdValue");
                            
                   if (tempAttribQualifyingIdValue!=null){
                         java.lang.String content = tempAttribQualifyingIdValue;
                        
                                                 object.setQualifyingIdValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribQualifyingIdValue));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("qualifyingIdValue");
                    
                    // handle attribute "effectiveDate"
                    java.lang.String tempAttribEffectiveDate =
                        
                                reader.getAttributeValue(null,"effectiveDate");
                            
                   if (tempAttribEffectiveDate!=null){
                         java.lang.String content = tempAttribEffectiveDate;
                        
                                                 object.setEffectiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEffectiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("effectiveDate");
                    
                    // handle attribute "expirationDate"
                    java.lang.String tempAttribExpirationDate =
                        
                                reader.getAttributeValue(null,"expirationDate");
                            
                   if (tempAttribExpirationDate!=null){
                         java.lang.String content = tempAttribExpirationDate;
                        
                                                 object.setExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("expirationDate");
                    
                    // handle attribute "hold"
                    java.lang.String tempAttribHold =
                        
                                reader.getAttributeValue(null,"hold");
                            
                   if (tempAttribHold!=null){
                         java.lang.String content = tempAttribHold;
                        
                                                 object.setHold(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribHold));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("hold");
                    
                    // handle attribute "commissionYn"
                    java.lang.String tempAttribCommissionYn =
                        
                                reader.getAttributeValue(null,"commissionYn");
                            
                   if (tempAttribCommissionYn!=null){
                         java.lang.String content = tempAttribCommissionYn;
                        
                                                 object.setCommissionYn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCommissionYn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commissionYn");
                    
                    // handle attribute "mandatoryDeposit"
                    java.lang.String tempAttribMandatoryDeposit =
                        
                                reader.getAttributeValue(null,"mandatoryDeposit");
                            
                   if (tempAttribMandatoryDeposit!=null){
                         java.lang.String content = tempAttribMandatoryDeposit;
                        
                                                 object.setMandatoryDeposit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMandatoryDeposit));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("mandatoryDeposit");
                    
                    // handle attribute "suppressRate"
                    java.lang.String tempAttribSuppressRate =
                        
                                reader.getAttributeValue(null,"suppressRate");
                            
                   if (tempAttribSuppressRate!=null){
                         java.lang.String content = tempAttribSuppressRate;
                        
                                                 object.setSuppressRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSuppressRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("suppressRate");
                    
                    // handle attribute "ratePlanName"
                    java.lang.String tempAttribRatePlanName =
                        
                                reader.getAttributeValue(null,"ratePlanName");
                            
                   if (tempAttribRatePlanName!=null){
                         java.lang.String content = tempAttribRatePlanName;
                        
                                                 object.setRatePlanName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRatePlanName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ratePlanName");
                    
                    // handle attribute "awardType"
                    java.lang.String tempAttribAwardType =
                        
                                reader.getAttributeValue(null,"awardType");
                            
                   if (tempAttribAwardType!=null){
                         java.lang.String content = tempAttribAwardType;
                        
                                                 object.setAwardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAwardType));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("awardType");
                    
                    // handle attribute "redemRate"
                    java.lang.String tempAttribRedemRate =
                        
                                reader.getAttributeValue(null,"redemRate");
                            
                   if (tempAttribRedemRate!=null){
                         java.lang.String content = tempAttribRedemRate;
                        
                                                 object.setRedemRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRedemRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("redemRate");
                    
                    // handle attribute "commissionCode"
                    java.lang.String tempAttribCommissionCode =
                        
                                reader.getAttributeValue(null,"commissionCode");
                            
                   if (tempAttribCommissionCode!=null){
                         java.lang.String content = tempAttribCommissionCode;
                        
                                                 object.setCommissionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCommissionCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commissionCode");
                    
                    // handle attribute "asbRateCycle"
                    java.lang.String tempAttribAsbRateCycle =
                        
                                reader.getAttributeValue(null,"asbRateCycle");
                            
                   if (tempAttribAsbRateCycle!=null){
                         java.lang.String content = tempAttribAsbRateCycle;
                        
                                                 object.setAsbRateCycle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAsbRateCycle));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("asbRateCycle");
                    
                    // handle attribute "hasPackage"
                    java.lang.String tempAttribHasPackage =
                        
                                reader.getAttributeValue(null,"hasPackage");
                            
                   if (tempAttribHasPackage!=null){
                         java.lang.String content = tempAttribHasPackage;
                        
                                                 object.setHasPackage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribHasPackage));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("hasPackage");
                    
                    // handle attribute "taxInclusive"
                    java.lang.String tempAttribTaxInclusive =
                        
                                reader.getAttributeValue(null,"taxInclusive");
                            
                   if (tempAttribTaxInclusive!=null){
                         java.lang.String content = tempAttribTaxInclusive;
                        
                                                 object.setTaxInclusive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTaxInclusive));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("taxInclusive");
                    
                    // handle attribute "blockName"
                    java.lang.String tempAttribBlockName =
                        
                                reader.getAttributeValue(null,"blockName");
                            
                   if (tempAttribBlockName!=null){
                         java.lang.String content = tempAttribBlockName;
                        
                                                 object.setBlockName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribBlockName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("blockName");
                    
                    // handle attribute "rankRate"
                    java.lang.String tempAttribRankRate =
                        
                                reader.getAttributeValue(null,"rankRate");
                            
                   if (tempAttribRankRate!=null){
                         java.lang.String content = tempAttribRankRate;
                        
                                                 object.setRankRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRankRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rankRate");
                    
                    // handle attribute "rateTypeIndicator"
                    java.lang.String tempAttribRateTypeIndicator =
                        
                                reader.getAttributeValue(null,"rateTypeIndicator");
                            
                   if (tempAttribRateTypeIndicator!=null){
                         java.lang.String content = tempAttribRateTypeIndicator;
                        
                                                 object.setRateTypeIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRateTypeIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("rateTypeIndicator");
                    
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
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanDescription").equals(reader.getName())){
                                
                                                object.setRatePlanDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RatePlanShortDescription").equals(reader.getName())){
                                
                                                object.setRatePlanShortDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Commission").equals(reader.getName())){
                                
                                                object.setCommission(com.cloudkey.pms.micros.og.hotelcommon.Commission.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","AdditionalDetails").equals(reader.getName())){
                                
                                                object.setAdditionalDetails(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAdditionalDetail.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","CancellationDateTime").equals(reader.getName())){
                                
                                                object.setCancellationDateTime(com.cloudkey.pms.micros.og.hotelcommon.CancelDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","DepositRequired").equals(reader.getName())){
                                
                                                object.setDepositRequired(com.cloudkey.pms.micros.og.hotelcommon.DepositRequirement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GdsFlags").equals(reader.getName())){
                                
                                                object.setGdsFlags(com.cloudkey.pms.micros.og.hotelcommon.GdsFlags.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GuaranteeDetails").equals(reader.getName())){
                                
                                                object.setGuaranteeDetails(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfGuarantee.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","MealPlanCodes").equals(reader.getName())){
                                
                                                object.setMealPlanCodes(com.cloudkey.pms.micros.og.hotelcommon.AmenityInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages").equals(reader.getName())){
                                
                                                object.setPackages(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfPackageElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Discount").equals(reader.getName())){
                                
                                                object.setDiscount(com.cloudkey.pms.micros.og.hotelcommon.Discount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RoomTypes").equals(reader.getName())){
                                
                                                object.setRoomTypes(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRoomType.Factory.parse(reader));
                                              
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
           
    