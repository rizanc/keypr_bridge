
/**
 * RestaurantsTypeRestaurant.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.hotelcommon;
            

            /**
            *  RestaurantsTypeRestaurant bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RestaurantsTypeRestaurant
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RestaurantsTypeRestaurant
                Namespace URI = http://webservices.micros.com/og/4.3/HotelCommon/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for RestaurantDescription
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Paragraph[] localRestaurantDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRestaurantDescriptionTracker = false ;

                           public boolean isRestaurantDescriptionSpecified(){
                               return localRestaurantDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Paragraph[]
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Paragraph[] getRestaurantDescription(){
                               return localRestaurantDescription;
                           }

                           
                        


                               
                              /**
                               * validate the array for RestaurantDescription
                               */
                              protected void validateRestaurantDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RestaurantDescription
                              */
                              public void setRestaurantDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph[] param){
                              
                                   validateRestaurantDescription(param);

                               localRestaurantDescriptionTracker = param != null;
                                      
                                      this.localRestaurantDescription=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.hotelcommon.Paragraph
                             */
                             public void addRestaurantDescription(com.cloudkey.pms.micros.og.hotelcommon.Paragraph param){
                                   if (localRestaurantDescription == null){
                                   localRestaurantDescription = new com.cloudkey.pms.micros.og.hotelcommon.Paragraph[]{};
                                   }

                            
                                 //update the setting tracker
                                localRestaurantDescriptionTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRestaurantDescription);
                               list.add(param);
                               this.localRestaurantDescription =
                             (com.cloudkey.pms.micros.og.hotelcommon.Paragraph[])list.toArray(
                            new com.cloudkey.pms.micros.og.hotelcommon.Paragraph[list.size()]);

                             }
                             

                        /**
                        * field for RelativePosition
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.Vector localRelativePosition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelativePositionTracker = false ;

                           public boolean isRelativePositionSpecified(){
                               return localRelativePositionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.Vector
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.Vector getRelativePosition(){
                               return localRelativePosition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RelativePosition
                               */
                               public void setRelativePosition(com.cloudkey.pms.micros.og.hotelcommon.Vector param){
                            localRelativePositionTracker = param != null;
                                   
                                            this.localRelativePosition=param;
                                    

                               }
                            

                        /**
                        * field for Cuisines
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine localCuisines ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCuisinesTracker = false ;

                           public boolean isCuisinesSpecified(){
                               return localCuisinesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine getCuisines(){
                               return localCuisines;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cuisines
                               */
                               public void setCuisines(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine param){
                            localCuisinesTracker = param != null;
                                   
                                            this.localCuisines=param;
                                    

                               }
                            

                        /**
                        * field for RestaurantContacts
                        */

                        
                                    protected com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress localRestaurantContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRestaurantContactsTracker = false ;

                           public boolean isRestaurantContactsSpecified(){
                               return localRestaurantContactsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress
                           */
                           public  com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress getRestaurantContacts(){
                               return localRestaurantContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RestaurantContacts
                               */
                               public void setRestaurantContacts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress param){
                            localRestaurantContactsTracker = param != null;
                                   
                                            this.localRestaurantContacts=param;
                                    

                               }
                            

                        /**
                        * field for RestaurantName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localRestaurantName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRestaurantName(){
                               return localRestaurantName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RestaurantName
                               */
                               public void setRestaurantName(java.lang.String param){
                            
                                            this.localRestaurantName=param;
                                    

                               }
                            

                        /**
                        * field for MaxSeatingCapacity
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localMaxSeatingCapacity ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getMaxSeatingCapacity(){
                               return localMaxSeatingCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxSeatingCapacity
                               */
                               public void setMaxSeatingCapacity(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localMaxSeatingCapacity=param;
                                    

                               }
                            

                        /**
                        * field for MaxSingleParty
                        * This was an Attribute!
                        */

                        
                                    protected org.apache.axis2.databinding.types.NonNegativeInteger localMaxSingleParty ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.apache.axis2.databinding.types.NonNegativeInteger
                           */
                           public  org.apache.axis2.databinding.types.NonNegativeInteger getMaxSingleParty(){
                               return localMaxSingleParty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxSingleParty
                               */
                               public void setMaxSingleParty(org.apache.axis2.databinding.types.NonNegativeInteger param){
                            
                                            this.localMaxSingleParty=param;
                                    

                               }
                            

                        /**
                        * field for OfferBreakfast
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOfferBreakfast ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOfferBreakfast(){
                               return localOfferBreakfast;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferBreakfast
                               */
                               public void setOfferBreakfast(boolean param){
                            
                                            this.localOfferBreakfast=param;
                                    

                               }
                            

                        /**
                        * field for OfferLunch
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOfferLunch ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOfferLunch(){
                               return localOfferLunch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferLunch
                               */
                               public void setOfferLunch(boolean param){
                            
                                            this.localOfferLunch=param;
                                    

                               }
                            

                        /**
                        * field for OfferDinner
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOfferDinner ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOfferDinner(){
                               return localOfferDinner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferDinner
                               */
                               public void setOfferDinner(boolean param){
                            
                                            this.localOfferDinner=param;
                                    

                               }
                            

                        /**
                        * field for OfferBrunch
                        * This was an Attribute!
                        */

                        
                                    protected boolean localOfferBrunch ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOfferBrunch(){
                               return localOfferBrunch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferBrunch
                               */
                               public void setOfferBrunch(boolean param){
                            
                                            this.localOfferBrunch=param;
                                    

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
                           namespacePrefix+":RestaurantsTypeRestaurant",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RestaurantsTypeRestaurant",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRestaurantName != null){
                                        
                                                writeAttribute("",
                                                         "RestaurantName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestaurantName), xmlWriter);

                                            
                                      }
                                    
                                            if (localMaxSeatingCapacity != null){
                                        
                                                writeAttribute("",
                                                         "MaxSeatingCapacity",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSeatingCapacity), xmlWriter);

                                            
                                      }
                                    
                                            if (localMaxSingleParty != null){
                                        
                                                writeAttribute("",
                                                         "MaxSingleParty",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSingleParty), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OfferBreakfast",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferBreakfast), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OfferLunch",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferLunch), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OfferDinner",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferDinner), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OfferBrunch",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferBrunch), xmlWriter);

                                            
                                      }
                                     if (localRestaurantDescriptionTracker){
                                       if (localRestaurantDescription!=null){
                                            for (int i = 0;i < localRestaurantDescription.length;i++){
                                                if (localRestaurantDescription[i] != null){
                                                 localRestaurantDescription[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RestaurantDescription"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("RestaurantDescription cannot be null!!");
                                        
                                    }
                                 } if (localRelativePositionTracker){
                                            if (localRelativePosition==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RelativePosition cannot be null!!");
                                            }
                                           localRelativePosition.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RelativePosition"),
                                               xmlWriter);
                                        } if (localCuisinesTracker){
                                            if (localCuisines==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Cuisines cannot be null!!");
                                            }
                                           localCuisines.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Cuisines"),
                                               xmlWriter);
                                        } if (localRestaurantContactsTracker){
                                            if (localRestaurantContacts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RestaurantContacts cannot be null!!");
                                            }
                                           localRestaurantContacts.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RestaurantContacts"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/HotelCommon/")){
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

                 if (localRestaurantDescriptionTracker){
                             if (localRestaurantDescription!=null) {
                                 for (int i = 0;i < localRestaurantDescription.length;i++){

                                    if (localRestaurantDescription[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                          "RestaurantDescription"));
                                         elementList.add(localRestaurantDescription[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("RestaurantDescription cannot be null!!");
                                    
                             }

                        } if (localRelativePositionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RelativePosition"));
                            
                            
                                    if (localRelativePosition==null){
                                         throw new org.apache.axis2.databinding.ADBException("RelativePosition cannot be null!!");
                                    }
                                    elementList.add(localRelativePosition);
                                } if (localCuisinesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "Cuisines"));
                            
                            
                                    if (localCuisines==null){
                                         throw new org.apache.axis2.databinding.ADBException("Cuisines cannot be null!!");
                                    }
                                    elementList.add(localCuisines);
                                } if (localRestaurantContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/",
                                                                      "RestaurantContacts"));
                            
                            
                                    if (localRestaurantContacts==null){
                                         throw new org.apache.axis2.databinding.ADBException("RestaurantContacts cannot be null!!");
                                    }
                                    elementList.add(localRestaurantContacts);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","RestaurantName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRestaurantName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MaxSeatingCapacity"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSeatingCapacity));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MaxSingleParty"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSingleParty));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OfferBreakfast"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferBreakfast));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OfferLunch"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferLunch));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OfferDinner"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferDinner));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OfferBrunch"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOfferBrunch));
                                

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
        public static RestaurantsTypeRestaurant parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RestaurantsTypeRestaurant object =
                new RestaurantsTypeRestaurant();

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
                    
                            if (!"RestaurantsTypeRestaurant".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RestaurantsTypeRestaurant)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "RestaurantName"
                    java.lang.String tempAttribRestaurantName =
                        
                                reader.getAttributeValue(null,"RestaurantName");
                            
                   if (tempAttribRestaurantName!=null){
                         java.lang.String content = tempAttribRestaurantName;
                        
                                                 object.setRestaurantName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribRestaurantName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("RestaurantName");
                    
                    // handle attribute "MaxSeatingCapacity"
                    java.lang.String tempAttribMaxSeatingCapacity =
                        
                                reader.getAttributeValue(null,"MaxSeatingCapacity");
                            
                   if (tempAttribMaxSeatingCapacity!=null){
                         java.lang.String content = tempAttribMaxSeatingCapacity;
                        
                                                 object.setMaxSeatingCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribMaxSeatingCapacity));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MaxSeatingCapacity");
                    
                    // handle attribute "MaxSingleParty"
                    java.lang.String tempAttribMaxSingleParty =
                        
                                reader.getAttributeValue(null,"MaxSingleParty");
                            
                   if (tempAttribMaxSingleParty!=null){
                         java.lang.String content = tempAttribMaxSingleParty;
                        
                                                 object.setMaxSingleParty(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(tempAttribMaxSingleParty));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MaxSingleParty");
                    
                    // handle attribute "OfferBreakfast"
                    java.lang.String tempAttribOfferBreakfast =
                        
                                reader.getAttributeValue(null,"OfferBreakfast");
                            
                   if (tempAttribOfferBreakfast!=null){
                         java.lang.String content = tempAttribOfferBreakfast;
                        
                                                 object.setOfferBreakfast(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOfferBreakfast));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OfferBreakfast");
                    
                    // handle attribute "OfferLunch"
                    java.lang.String tempAttribOfferLunch =
                        
                                reader.getAttributeValue(null,"OfferLunch");
                            
                   if (tempAttribOfferLunch!=null){
                         java.lang.String content = tempAttribOfferLunch;
                        
                                                 object.setOfferLunch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOfferLunch));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OfferLunch");
                    
                    // handle attribute "OfferDinner"
                    java.lang.String tempAttribOfferDinner =
                        
                                reader.getAttributeValue(null,"OfferDinner");
                            
                   if (tempAttribOfferDinner!=null){
                         java.lang.String content = tempAttribOfferDinner;
                        
                                                 object.setOfferDinner(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOfferDinner));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OfferDinner");
                    
                    // handle attribute "OfferBrunch"
                    java.lang.String tempAttribOfferBrunch =
                        
                                reader.getAttributeValue(null,"OfferBrunch");
                            
                   if (tempAttribOfferBrunch!=null){
                         java.lang.String content = tempAttribOfferBrunch;
                        
                                                 object.setOfferBrunch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOfferBrunch));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OfferBrunch");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RestaurantDescription").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RestaurantDescription").equals(reader.getName())){
                                                                    list1.add(com.cloudkey.pms.micros.og.hotelcommon.Paragraph.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRestaurantDescription((com.cloudkey.pms.micros.og.hotelcommon.Paragraph[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.Paragraph.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RelativePosition").equals(reader.getName())){
                                
                                                object.setRelativePosition(com.cloudkey.pms.micros.og.hotelcommon.Vector.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","Cuisines").equals(reader.getName())){
                                
                                                object.setCuisines(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfRestaurantsTypeRestaurantCuisine.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/HotelCommon/","RestaurantContacts").equals(reader.getName())){
                                
                                                object.setRestaurantContacts(com.cloudkey.pms.micros.og.hotelcommon.ArrayOfAddress.Factory.parse(reader));
                                              
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
           
    