
/**
 * RoomRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RoomRate bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RoomRate
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RoomRate
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for Rates
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.RateList localRates ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatesTracker = false ;

                           public boolean isRatesSpecified(){
                               return localRatesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.RateList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.RateList getRates(){
                               return localRates;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rates
                               */
                               public void setRates(com.cloudkey.pms.micros.og.hotelcommon.RateList param){
                            localRatesTracker = param != null;
                                   
                                            this.localRates=param;
                                    

                               }
                            

                        /**
                        * field for InvBlockDescription
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph localInvBlockDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInvBlockDescriptionTracker = false ;

                           public boolean isInvBlockDescriptionSpecified(){
                               return localInvBlockDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph getInvBlockDescription(){
                               return localInvBlockDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InvBlockDescription
                               */
                               public void setInvBlockDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                            localInvBlockDescriptionTracker = param != null;
                                   
                                            this.localInvBlockDescription=param;
                                    

                               }
                            

                        /**
                        * field for Total
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Amount localTotal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalTracker = false ;

                           public boolean isTotalSpecified(){
                               return localTotalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Amount
                           */
                           public  com.cloudkey.pms.micros.og.common.Amount getTotal(){
                               return localTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Total
                               */
                               public void setTotal(com.cloudkey.pms.micros.og.common.Amount param){
                            localTotalTracker = param != null;
                                   
                                            this.localTotal=param;
                                    

                               }
                            

                        /**
                        * field for GDSTotalPricing
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing localGDSTotalPricing ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGDSTotalPricingTracker = false ;

                           public boolean isGDSTotalPricingSpecified(){
                               return localGDSTotalPricingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing getGDSTotalPricing(){
                               return localGDSTotalPricing;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GDSTotalPricing
                               */
                               public void setGDSTotalPricing(com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing param){
                            localGDSTotalPricingTracker = param != null;
                                   
                                            this.localGDSTotalPricing=param;
                                    

                               }
                            

                        /**
                        * field for TotalPoints
                        */

                        
                                    protected double localTotalPoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPointsTracker = false ;

                           public boolean isTotalPointsSpecified(){
                               return localTotalPointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTotalPoints(){
                               return localTotalPoints;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPoints
                               */
                               public void setTotalPoints(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalPointsTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localTotalPoints=param;
                                    

                               }
                            

                        /**
                        * field for Packages
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.PackageElementList localPackages ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPackagesTracker = false ;

                           public boolean isPackagesSpecified(){
                               return localPackagesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.PackageElementList
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.PackageElementList getPackages(){
                               return localPackages;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Packages
                               */
                               public void setPackages(com.cloudkey.pms.micros.og.hotelcommon.PackageElementList param){
                            localPackagesTracker = param != null;
                                   
                                            this.localPackages=param;
                                    

                               }
                            

                        /**
                        * field for RoomTypeCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRoomTypeCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRoomTypeCode(){
                               return localRoomTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoomTypeCode
                               */
                               public void setRoomTypeCode(java.lang.String param){
                            
                                            this.localRoomTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for RatePlanCode
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRatePlanCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRatePlanCode(){
                               return localRatePlanCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatePlanCode
                               */
                               public void setRatePlanCode(java.lang.String param){
                            
                                            this.localRatePlanCode=param;
                                    

                               }
                            

                        /**
                        * field for EffectiveDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEffectiveDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEffectiveDate(){
                               return localEffectiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveDate
                               */
                               public void setEffectiveDate(java.util.Date param){
                            
                                            this.localEffectiveDate=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localExpirationDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpirationDate(){
                               return localExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpirationDate
                               */
                               public void setExpirationDate(java.util.Date param){
                            
                                            this.localExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for SuppressRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSuppressRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSuppressRate(){
                               return localSuppressRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SuppressRate
                               */
                               public void setSuppressRate(boolean param){
                            
                                            this.localSuppressRate=param;
                                    

                               }
                            

                        /**
                        * field for RedemRate
                        * This was an Attribute!
                        */

                        
                                    protected boolean localRedemRate ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getRedemRate(){
                               return localRedemRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedemRate
                               */
                               public void setRedemRate(boolean param){
                            
                                            this.localRedemRate=param;
                                    

                               }
                            

                        /**
                        * field for HasPackage
                        * This was an Attribute!
                        */

                        
                                    protected boolean localHasPackage ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasPackage(){
                               return localHasPackage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasPackage
                               */
                               public void setHasPackage(boolean param){
                            
                                            this.localHasPackage=param;
                                    

                               }
                            

                        /**
                        * field for PointsChangeIndicator
                        * This was an Attribute!
                        */

                        
                                    protected boolean localPointsChangeIndicator ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPointsChangeIndicator(){
                               return localPointsChangeIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PointsChangeIndicator
                               */
                               public void setPointsChangeIndicator(boolean param){
                            
                                            this.localPointsChangeIndicator=param;
                                    

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
                           namespacePrefix+":RoomRate",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RoomRate",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRoomTypeCode != null){
                                        
                                                writeAttribute("",
                                                         "roomTypeCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localRoomTypeCode is null");
                                      }
                                    
                                            if (localRatePlanCode != null){
                                        
                                                writeAttribute("",
                                                         "ratePlanCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode), xmlWriter);

                                            
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
                                                         "suppressRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "redemRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "hasPackage",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "pointsChangeIndicator",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsChangeIndicator), xmlWriter);

                                            
                                      }
                                     if (localRatesTracker){
                                            if (localRates==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Rates cannot be null!!");
                                            }
                                           localRates.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Rates"),
                                               xmlWriter);
                                        } if (localInvBlockDescriptionTracker){
                                            if (localInvBlockDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("InvBlockDescription cannot be null!!");
                                            }
                                           localInvBlockDescription.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","InvBlockDescription"),
                                               xmlWriter);
                                        } if (localTotalTracker){
                                            if (localTotal==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");
                                            }
                                           localTotal.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Total"),
                                               xmlWriter);
                                        } if (localGDSTotalPricingTracker){
                                            if (localGDSTotalPricing==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GDSTotalPricing cannot be null!!");
                                            }
                                           localGDSTotalPricing.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GDSTotalPricing"),
                                               xmlWriter);
                                        } if (localTotalPointsTracker){
                                    namespace = "http://webservices.micros.com/og/4.3/HotelCommon/";
                                    writeStartElement(null, namespace, "TotalPoints", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTotalPoints)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalPoints cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPoints));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPackagesTracker){
                                            if (localPackages==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                            }
                                           localPackages.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages"),
                                               xmlWriter);
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

                 if (localRatesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Rates"));
                            
                            
                                    if (localRates==null){
                                         throw new org.apache.axis2.databinding.ADBException("Rates cannot be null!!");
                                    }
                                    elementList.add(localRates);
                                } if (localInvBlockDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "InvBlockDescription"));
                            
                            
                                    if (localInvBlockDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("InvBlockDescription cannot be null!!");
                                    }
                                    elementList.add(localInvBlockDescription);
                                } if (localTotalTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Total"));
                            
                            
                                    if (localTotal==null){
                                         throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");
                                    }
                                    elementList.add(localTotal);
                                } if (localGDSTotalPricingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "GDSTotalPricing"));
                            
                            
                                    if (localGDSTotalPricing==null){
                                         throw new org.apache.axis2.databinding.ADBException("GDSTotalPricing cannot be null!!");
                                    }
                                    elementList.add(localGDSTotalPricing);
                                } if (localTotalPointsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "TotalPoints"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPoints));
                            } if (localPackagesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Packages"));
                            
                            
                                    if (localPackages==null){
                                         throw new org.apache.axis2.databinding.ADBException("Packages cannot be null!!");
                                    }
                                    elementList.add(localPackages);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","roomTypeCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomTypeCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ratePlanCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRatePlanCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","effectiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","expirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","suppressRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuppressRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","redemRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","hasPackage"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasPackage));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","pointsChangeIndicator"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPointsChangeIndicator));
                                

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
        public static RoomRate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RoomRate object =
                new RoomRate();

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
                    
                            if (!"RoomRate".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RoomRate)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "roomTypeCode"
                    java.lang.String tempAttribRoomTypeCode =
                        
                                reader.getAttributeValue(null,"roomTypeCode");
                            
                   if (tempAttribRoomTypeCode!=null){
                         java.lang.String content = tempAttribRoomTypeCode;
                        
                                                 object.setRoomTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRoomTypeCode));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute roomTypeCode is missing");
                           
                    }
                    handledAttributes.add("roomTypeCode");
                    
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
                    
                    // handle attribute "pointsChangeIndicator"
                    java.lang.String tempAttribPointsChangeIndicator =
                        
                                reader.getAttributeValue(null,"pointsChangeIndicator");
                            
                   if (tempAttribPointsChangeIndicator!=null){
                         java.lang.String content = tempAttribPointsChangeIndicator;
                        
                                                 object.setPointsChangeIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPointsChangeIndicator));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("pointsChangeIndicator");
                    
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Rates").equals(reader.getName())){
                                
                                                object.setRates(com.cloudkey.pms.micros.og.hotelcommon.RateList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","InvBlockDescription").equals(reader.getName())){
                                
                                                object.setInvBlockDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Total").equals(reader.getName())){
                                
                                                object.setTotal(com.cloudkey.pms.micros.og.common.Amount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","GDSTotalPricing").equals(reader.getName())){
                                
                                                object.setGDSTotalPricing(com.cloudkey.pms.micros.og.hotelcommon.GdsTotalPricing.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","TotalPoints").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"TotalPoints" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalPoints(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalPoints(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Packages").equals(reader.getName())){
                                
                                                object.setPackages(com.cloudkey.pms.micros.og.hotelcommon.PackageElementList.Factory.parse(reader));
                                              
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
           
    