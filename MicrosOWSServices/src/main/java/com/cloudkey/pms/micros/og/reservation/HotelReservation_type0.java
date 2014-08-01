
/**
 * HotelReservation_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.reservation;
            

            /**
            *  HotelReservation_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class HotelReservation_type0 extends com.cloudkey.pms.micros.og.reservation.HotelReservation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = HotelReservation_type0
                Namespace URI = http://webservices.micros.com/og/4.3/Reservation/
                Namespace Prefix = ns6
                */
            

     
     
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Reservation/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":HotelReservation_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "HotelReservation_type0",
                           xmlWriter);
                   }

               
                                    
                                    if (localReservationAction != null){
                                        writeAttribute("",
                                           "reservationAction",
                                           localReservationAction.toString(), xmlWriter);
                                    }
                                    
                                    
                                    if (localReservationStatus != null){
                                        writeAttribute("",
                                           "reservationStatus",
                                           localReservationStatus.toString(), xmlWriter);
                                    }
                                    
                                            if (localMarketSegment != null){
                                        
                                                writeAttribute("",
                                                         "marketSegment",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketSegment), xmlWriter);

                                            
                                      }
                                    
                                            if (localSourceCode != null){
                                        
                                                writeAttribute("",
                                                         "sourceCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localOriginCode != null){
                                        
                                                writeAttribute("",
                                                         "originCode",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginCode), xmlWriter);

                                            
                                      }
                                    
                                            if (localAuthorizer != null){
                                        
                                                writeAttribute("",
                                                         "authorizer",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorizer), xmlWriter);

                                            
                                      }
                                    
                                            if (localCompRoutingFlag != null){
                                        
                                                writeAttribute("",
                                                         "compRoutingFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingFlag), xmlWriter);

                                            
                                      }
                                    
                                            if (localCompRoutingAuthorizer != null){
                                        
                                                writeAttribute("",
                                                         "compRoutingAuthorizer",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingAuthorizer), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "onBehalfFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnBehalfFlag), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "redemReservationFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemReservationFlag), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertUser != null){
                                        
                                                writeAttribute("",
                                                         "insertUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localInsertDate != null){
                                        
                                                writeAttribute("",
                                                         "insertDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateUser != null){
                                        
                                                writeAttribute("",
                                                         "updateUser",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser), xmlWriter);

                                            
                                      }
                                    
                                            if (localUpdateDate != null){
                                        
                                                writeAttribute("",
                                                         "updateDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localInactiveDate != null){
                                        
                                                writeAttribute("",
                                                         "inactiveDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "walkIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWalkIn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "noPost",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "remoteCo",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteCo), xmlWriter);

                                            
                                      }
                                    
                                            if (localGroup != null){
                                        
                                                writeAttribute("",
                                                         "group",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "attachPreferenceProfile",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachPreferenceProfile), xmlWriter);

                                            
                                      }
                                    
                                            if (localKeyExpirationDate != null){
                                        
                                                writeAttribute("",
                                                         "keyExpirationDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localTotalCreditCardSurcharges)) {
                                               
                                                writeAttribute("",
                                                         "totalCreditCardSurcharges",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCreditCardSurcharges), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DoNotMoveRoom",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OptIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptIn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "OptInComplete",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptInComplete), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "commentsExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localCommentsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "commentsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "tracesExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localTracesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "tracesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "specialsExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localSpecialsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "specialsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "roomPreferenceExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferenceExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localRoomPreferencesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "roomPreferencesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferencesCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "shareExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShareExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "queueExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localQueueNumber!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "queueNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "alertExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localAlertsCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "alertsCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertsCount), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "messageExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMessagesCount!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "messagesCount",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessagesCount), xmlWriter);

                                            
                                      }
                                    
                                            if (localCheckOutTime != null){
                                        
                                                writeAttribute("",
                                                         "checkOutTime",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOutTime), xmlWriter);

                                            
                                      }
                                    
                                    
                                    if (localComputedReservationStatus != null){
                                        writeAttribute("",
                                           "computedReservationStatus",
                                           localComputedReservationStatus.toString(), xmlWriter);
                                    }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "financialTransactionExists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancialTransactionExists), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "printRate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRate), xmlWriter);

                                            
                                      }
                                    
                                            if (localReferralYN != null){
                                        
                                                writeAttribute("",
                                                         "referralYN",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferralYN), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "allowPreRegisteration",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowPreRegisteration), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "preRegisterFlag",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreRegisterFlag), xmlWriter);

                                            
                                      }
                                     if (localUniqueIDListTracker){
                                            if (localUniqueIDList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                            }
                                           localUniqueIDList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList"),
                                               xmlWriter);
                                        } if (localRoomStaysTracker){
                                            if (localRoomStays==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RoomStays cannot be null!!");
                                            }
                                           localRoomStays.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RoomStays"),
                                               xmlWriter);
                                        } if (localResGuestsTracker){
                                            if (localResGuests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResGuests cannot be null!!");
                                            }
                                           localResGuests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResGuests"),
                                               xmlWriter);
                                        } if (localWrittenConfInstTracker){
                                            if (localWrittenConfInst==null){
                                                 throw new org.apache.axis2.databinding.ADBException("WrittenConfInst cannot be null!!");
                                            }
                                           localWrittenConfInst.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","WrittenConfInst"),
                                               xmlWriter);
                                        } if (localReservationHistoryTracker){
                                            if (localReservationHistory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReservationHistory cannot be null!!");
                                            }
                                           localReservationHistory.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationHistory"),
                                               xmlWriter);
                                        } if (localUserDefinedValuesTracker){
                                            if (localUserDefinedValues==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                            }
                                           localUserDefinedValues.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UserDefinedValues"),
                                               xmlWriter);
                                        } if (localInvoiceTracker){
                                            if (localInvoice==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Invoice cannot be null!!");
                                            }
                                           localInvoice.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Invoice"),
                                               xmlWriter);
                                        } if (localPreferencesTracker){
                                            if (localPreferences==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                            }
                                           localPreferences.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Preferences"),
                                               xmlWriter);
                                        } if (localAlertsTracker){
                                       if (localAlerts!=null){
                                            for (int i = 0;i < localAlerts.length;i++){
                                                if (localAlerts[i] != null){
                                                 localAlerts[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Alerts cannot be null!!");
                                        
                                    }
                                 } if (localPayRoutingsTracker){
                                       if (localPayRoutings!=null){
                                            for (int i = 0;i < localPayRoutings.length;i++){
                                                if (localPayRoutings[i] != null){
                                                 localPayRoutings[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PayRoutings cannot be null!!");
                                        
                                    }
                                 } if (localPayMethodsTracker){
                                       if (localPayMethods!=null){
                                            for (int i = 0;i < localPayMethods.length;i++){
                                                if (localPayMethods[i] != null){
                                                 localPayMethods[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("PayMethods cannot be null!!");
                                        
                                    }
                                 } if (localAccompanyGuestsTracker){
                                            if (localAccompanyGuests==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccompanyGuests cannot be null!!");
                                            }
                                           localAccompanyGuests.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","AccompanyGuests"),
                                               xmlWriter);
                                        } if (localECertificateTracker){
                                            if (localECertificate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                            }
                                           localECertificate.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ECertificate"),
                                               xmlWriter);
                                        } if (localShareReservationsTracker){
                                            if (localShareReservations==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ShareReservations cannot be null!!");
                                            }
                                           localShareReservations.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ShareReservations"),
                                               xmlWriter);
                                        } if (localMiscellaneousTracker){
                                            if (localMiscellaneous==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Miscellaneous cannot be null!!");
                                            }
                                           localMiscellaneous.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Miscellaneous"),
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","HotelReservation_type0"));
                 if (localUniqueIDListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UniqueIDList"));
                            
                            
                                    if (localUniqueIDList==null){
                                         throw new org.apache.axis2.databinding.ADBException("UniqueIDList cannot be null!!");
                                    }
                                    elementList.add(localUniqueIDList);
                                } if (localRoomStaysTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "RoomStays"));
                            
                            
                                    if (localRoomStays==null){
                                         throw new org.apache.axis2.databinding.ADBException("RoomStays cannot be null!!");
                                    }
                                    elementList.add(localRoomStays);
                                } if (localResGuestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ResGuests"));
                            
                            
                                    if (localResGuests==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResGuests cannot be null!!");
                                    }
                                    elementList.add(localResGuests);
                                } if (localWrittenConfInstTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "WrittenConfInst"));
                            
                            
                                    if (localWrittenConfInst==null){
                                         throw new org.apache.axis2.databinding.ADBException("WrittenConfInst cannot be null!!");
                                    }
                                    elementList.add(localWrittenConfInst);
                                } if (localReservationHistoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ReservationHistory"));
                            
                            
                                    if (localReservationHistory==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReservationHistory cannot be null!!");
                                    }
                                    elementList.add(localReservationHistory);
                                } if (localUserDefinedValuesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "UserDefinedValues"));
                            
                            
                                    if (localUserDefinedValues==null){
                                         throw new org.apache.axis2.databinding.ADBException("UserDefinedValues cannot be null!!");
                                    }
                                    elementList.add(localUserDefinedValues);
                                } if (localInvoiceTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Invoice"));
                            
                            
                                    if (localInvoice==null){
                                         throw new org.apache.axis2.databinding.ADBException("Invoice cannot be null!!");
                                    }
                                    elementList.add(localInvoice);
                                } if (localPreferencesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Preferences"));
                            
                            
                                    if (localPreferences==null){
                                         throw new org.apache.axis2.databinding.ADBException("Preferences cannot be null!!");
                                    }
                                    elementList.add(localPreferences);
                                } if (localAlertsTracker){
                             if (localAlerts!=null) {
                                 for (int i = 0;i < localAlerts.length;i++){

                                    if (localAlerts[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "Alerts"));
                                         elementList.add(localAlerts[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Alerts cannot be null!!");
                                    
                             }

                        } if (localPayRoutingsTracker){
                             if (localPayRoutings!=null) {
                                 for (int i = 0;i < localPayRoutings.length;i++){

                                    if (localPayRoutings[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "PayRoutings"));
                                         elementList.add(localPayRoutings[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PayRoutings cannot be null!!");
                                    
                             }

                        } if (localPayMethodsTracker){
                             if (localPayMethods!=null) {
                                 for (int i = 0;i < localPayMethods.length;i++){

                                    if (localPayMethods[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                          "PayMethods"));
                                         elementList.add(localPayMethods[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("PayMethods cannot be null!!");
                                    
                             }

                        } if (localAccompanyGuestsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "AccompanyGuests"));
                            
                            
                                    if (localAccompanyGuests==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccompanyGuests cannot be null!!");
                                    }
                                    elementList.add(localAccompanyGuests);
                                } if (localECertificateTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ECertificate"));
                            
                            
                                    if (localECertificate==null){
                                         throw new org.apache.axis2.databinding.ADBException("ECertificate cannot be null!!");
                                    }
                                    elementList.add(localECertificate);
                                } if (localShareReservationsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "ShareReservations"));
                            
                            
                                    if (localShareReservations==null){
                                         throw new org.apache.axis2.databinding.ADBException("ShareReservations cannot be null!!");
                                    }
                                    elementList.add(localShareReservations);
                                } if (localMiscellaneousTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/",
                                                                      "Miscellaneous"));
                            
                            
                                    if (localMiscellaneous==null){
                                         throw new org.apache.axis2.databinding.ADBException("Miscellaneous cannot be null!!");
                                    }
                                    elementList.add(localMiscellaneous);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","reservationAction"));
                            
                                      attribList.add(localReservationAction.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","reservationStatus"));
                            
                                      attribList.add(localReservationStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","marketSegment"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketSegment));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","sourceCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","originCode"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginCode));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","authorizer"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorizer));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","compRoutingFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","compRoutingAuthorizer"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompRoutingAuthorizer));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","onBehalfFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnBehalfFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","redemReservationFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRedemReservationFlag));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","insertDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateUser"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateUser));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","updateDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","inactiveDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","walkIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWalkIn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","noPost"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoPost));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","remoteCo"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteCo));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","group"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","attachPreferenceProfile"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttachPreferenceProfile));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","keyExpirationDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyExpirationDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","totalCreditCardSurcharges"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCreditCardSurcharges));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","DoNotMoveRoom"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoNotMoveRoom));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OptIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptIn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","OptInComplete"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptInComplete));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commentsExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","commentsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommentsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tracesExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","tracesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTracesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","specialsExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","specialsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomPreferenceExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferenceExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","roomPreferencesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoomPreferencesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","shareExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShareExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","queueExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","queueNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alertExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","alertsCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertsCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","messageExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","messagesCount"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessagesCount));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","checkOutTime"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckOutTime));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","computedReservationStatus"));
                            
                                      attribList.add(localComputedReservationStatus.toString());
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","financialTransactionExists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFinancialTransactionExists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","printRate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintRate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","referralYN"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferralYN));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","allowPreRegisteration"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowPreRegisteration));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","preRegisterFlag"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPreRegisterFlag));
                                

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
        public static HotelReservation_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HotelReservation_type0 object =
                new HotelReservation_type0();

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
                    
                            if (!"HotelReservation_type0".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HotelReservation_type0)com.cloudkey.pms.micros.ows.reservation.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "reservationAction"
                    java.lang.String tempAttribReservationAction =
                        
                                reader.getAttributeValue(null,"reservationAction");
                            
                   if (tempAttribReservationAction!=null){
                         java.lang.String content = tempAttribReservationAction;
                        
                                                  object.setReservationAction(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationActionType.Factory.fromString(reader,tempAttribReservationAction));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("reservationAction");
                    
                    // handle attribute "reservationStatus"
                    java.lang.String tempAttribReservationStatus =
                        
                                reader.getAttributeValue(null,"reservationStatus");
                            
                   if (tempAttribReservationStatus!=null){
                         java.lang.String content = tempAttribReservationStatus;
                        
                                                  object.setReservationStatus(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.fromString(reader,tempAttribReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("reservationStatus");
                    
                    // handle attribute "marketSegment"
                    java.lang.String tempAttribMarketSegment =
                        
                                reader.getAttributeValue(null,"marketSegment");
                            
                   if (tempAttribMarketSegment!=null){
                         java.lang.String content = tempAttribMarketSegment;
                        
                                                 object.setMarketSegment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribMarketSegment));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("marketSegment");
                    
                    // handle attribute "sourceCode"
                    java.lang.String tempAttribSourceCode =
                        
                                reader.getAttributeValue(null,"sourceCode");
                            
                   if (tempAttribSourceCode!=null){
                         java.lang.String content = tempAttribSourceCode;
                        
                                                 object.setSourceCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribSourceCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("sourceCode");
                    
                    // handle attribute "originCode"
                    java.lang.String tempAttribOriginCode =
                        
                                reader.getAttributeValue(null,"originCode");
                            
                   if (tempAttribOriginCode!=null){
                         java.lang.String content = tempAttribOriginCode;
                        
                                                 object.setOriginCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribOriginCode));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("originCode");
                    
                    // handle attribute "authorizer"
                    java.lang.String tempAttribAuthorizer =
                        
                                reader.getAttributeValue(null,"authorizer");
                            
                   if (tempAttribAuthorizer!=null){
                         java.lang.String content = tempAttribAuthorizer;
                        
                                                 object.setAuthorizer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribAuthorizer));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("authorizer");
                    
                    // handle attribute "compRoutingFlag"
                    java.lang.String tempAttribCompRoutingFlag =
                        
                                reader.getAttributeValue(null,"compRoutingFlag");
                            
                   if (tempAttribCompRoutingFlag!=null){
                         java.lang.String content = tempAttribCompRoutingFlag;
                        
                                                 object.setCompRoutingFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCompRoutingFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("compRoutingFlag");
                    
                    // handle attribute "compRoutingAuthorizer"
                    java.lang.String tempAttribCompRoutingAuthorizer =
                        
                                reader.getAttributeValue(null,"compRoutingAuthorizer");
                            
                   if (tempAttribCompRoutingAuthorizer!=null){
                         java.lang.String content = tempAttribCompRoutingAuthorizer;
                        
                                                 object.setCompRoutingAuthorizer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribCompRoutingAuthorizer));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("compRoutingAuthorizer");
                    
                    // handle attribute "onBehalfFlag"
                    java.lang.String tempAttribOnBehalfFlag =
                        
                                reader.getAttributeValue(null,"onBehalfFlag");
                            
                   if (tempAttribOnBehalfFlag!=null){
                         java.lang.String content = tempAttribOnBehalfFlag;
                        
                                                 object.setOnBehalfFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOnBehalfFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("onBehalfFlag");
                    
                    // handle attribute "redemReservationFlag"
                    java.lang.String tempAttribRedemReservationFlag =
                        
                                reader.getAttributeValue(null,"redemReservationFlag");
                            
                   if (tempAttribRedemReservationFlag!=null){
                         java.lang.String content = tempAttribRedemReservationFlag;
                        
                                                 object.setRedemReservationFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRedemReservationFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("redemReservationFlag");
                    
                    // handle attribute "insertUser"
                    java.lang.String tempAttribInsertUser =
                        
                                reader.getAttributeValue(null,"insertUser");
                            
                   if (tempAttribInsertUser!=null){
                         java.lang.String content = tempAttribInsertUser;
                        
                                                 object.setInsertUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribInsertUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertUser");
                    
                    // handle attribute "insertDate"
                    java.lang.String tempAttribInsertDate =
                        
                                reader.getAttributeValue(null,"insertDate");
                            
                   if (tempAttribInsertDate!=null){
                         java.lang.String content = tempAttribInsertDate;
                        
                                                 object.setInsertDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribInsertDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("insertDate");
                    
                    // handle attribute "updateUser"
                    java.lang.String tempAttribUpdateUser =
                        
                                reader.getAttributeValue(null,"updateUser");
                            
                   if (tempAttribUpdateUser!=null){
                         java.lang.String content = tempAttribUpdateUser;
                        
                                                 object.setUpdateUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribUpdateUser));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateUser");
                    
                    // handle attribute "updateDate"
                    java.lang.String tempAttribUpdateDate =
                        
                                reader.getAttributeValue(null,"updateDate");
                            
                   if (tempAttribUpdateDate!=null){
                         java.lang.String content = tempAttribUpdateDate;
                        
                                                 object.setUpdateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribUpdateDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("updateDate");
                    
                    // handle attribute "inactiveDate"
                    java.lang.String tempAttribInactiveDate =
                        
                                reader.getAttributeValue(null,"inactiveDate");
                            
                   if (tempAttribInactiveDate!=null){
                         java.lang.String content = tempAttribInactiveDate;
                        
                                                 object.setInactiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribInactiveDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("inactiveDate");
                    
                    // handle attribute "walkIn"
                    java.lang.String tempAttribWalkIn =
                        
                                reader.getAttributeValue(null,"walkIn");
                            
                   if (tempAttribWalkIn!=null){
                         java.lang.String content = tempAttribWalkIn;
                        
                                                 object.setWalkIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribWalkIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("walkIn");
                    
                    // handle attribute "noPost"
                    java.lang.String tempAttribNoPost =
                        
                                reader.getAttributeValue(null,"noPost");
                            
                   if (tempAttribNoPost!=null){
                         java.lang.String content = tempAttribNoPost;
                        
                                                 object.setNoPost(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribNoPost));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("noPost");
                    
                    // handle attribute "remoteCo"
                    java.lang.String tempAttribRemoteCo =
                        
                                reader.getAttributeValue(null,"remoteCo");
                            
                   if (tempAttribRemoteCo!=null){
                         java.lang.String content = tempAttribRemoteCo;
                        
                                                 object.setRemoteCo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRemoteCo));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("remoteCo");
                    
                    // handle attribute "group"
                    java.lang.String tempAttribGroup =
                        
                                reader.getAttributeValue(null,"group");
                            
                   if (tempAttribGroup!=null){
                         java.lang.String content = tempAttribGroup;
                        
                                                 object.setGroup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribGroup));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("group");
                    
                    // handle attribute "attachPreferenceProfile"
                    java.lang.String tempAttribAttachPreferenceProfile =
                        
                                reader.getAttributeValue(null,"attachPreferenceProfile");
                            
                   if (tempAttribAttachPreferenceProfile!=null){
                         java.lang.String content = tempAttribAttachPreferenceProfile;
                        
                                                 object.setAttachPreferenceProfile(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAttachPreferenceProfile));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("attachPreferenceProfile");
                    
                    // handle attribute "keyExpirationDate"
                    java.lang.String tempAttribKeyExpirationDate =
                        
                                reader.getAttributeValue(null,"keyExpirationDate");
                            
                   if (tempAttribKeyExpirationDate!=null){
                         java.lang.String content = tempAttribKeyExpirationDate;
                        
                                                 object.setKeyExpirationDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(tempAttribKeyExpirationDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("keyExpirationDate");
                    
                    // handle attribute "totalCreditCardSurcharges"
                    java.lang.String tempAttribTotalCreditCardSurcharges =
                        
                                reader.getAttributeValue(null,"totalCreditCardSurcharges");
                            
                   if (tempAttribTotalCreditCardSurcharges!=null){
                         java.lang.String content = tempAttribTotalCreditCardSurcharges;
                        
                                                 object.setTotalCreditCardSurcharges(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribTotalCreditCardSurcharges));
                                            
                    } else {
                       
                                           object.setTotalCreditCardSurcharges(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("totalCreditCardSurcharges");
                    
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
                    
                    // handle attribute "OptIn"
                    java.lang.String tempAttribOptIn =
                        
                                reader.getAttributeValue(null,"OptIn");
                            
                   if (tempAttribOptIn!=null){
                         java.lang.String content = tempAttribOptIn;
                        
                                                 object.setOptIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOptIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OptIn");
                    
                    // handle attribute "OptInComplete"
                    java.lang.String tempAttribOptInComplete =
                        
                                reader.getAttributeValue(null,"OptInComplete");
                            
                   if (tempAttribOptInComplete!=null){
                         java.lang.String content = tempAttribOptInComplete;
                        
                                                 object.setOptInComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribOptInComplete));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("OptInComplete");
                    
                    // handle attribute "commentsExists"
                    java.lang.String tempAttribCommentsExists =
                        
                                reader.getAttributeValue(null,"commentsExists");
                            
                   if (tempAttribCommentsExists!=null){
                         java.lang.String content = tempAttribCommentsExists;
                        
                                                 object.setCommentsExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCommentsExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("commentsExists");
                    
                    // handle attribute "commentsCount"
                    java.lang.String tempAttribCommentsCount =
                        
                                reader.getAttributeValue(null,"commentsCount");
                            
                   if (tempAttribCommentsCount!=null){
                         java.lang.String content = tempAttribCommentsCount;
                        
                                                 object.setCommentsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribCommentsCount));
                                            
                    } else {
                       
                                           object.setCommentsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("commentsCount");
                    
                    // handle attribute "tracesExists"
                    java.lang.String tempAttribTracesExists =
                        
                                reader.getAttributeValue(null,"tracesExists");
                            
                   if (tempAttribTracesExists!=null){
                         java.lang.String content = tempAttribTracesExists;
                        
                                                 object.setTracesExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribTracesExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("tracesExists");
                    
                    // handle attribute "tracesCount"
                    java.lang.String tempAttribTracesCount =
                        
                                reader.getAttributeValue(null,"tracesCount");
                            
                   if (tempAttribTracesCount!=null){
                         java.lang.String content = tempAttribTracesCount;
                        
                                                 object.setTracesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribTracesCount));
                                            
                    } else {
                       
                                           object.setTracesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("tracesCount");
                    
                    // handle attribute "specialsExists"
                    java.lang.String tempAttribSpecialsExists =
                        
                                reader.getAttributeValue(null,"specialsExists");
                            
                   if (tempAttribSpecialsExists!=null){
                         java.lang.String content = tempAttribSpecialsExists;
                        
                                                 object.setSpecialsExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSpecialsExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("specialsExists");
                    
                    // handle attribute "specialsCount"
                    java.lang.String tempAttribSpecialsCount =
                        
                                reader.getAttributeValue(null,"specialsCount");
                            
                   if (tempAttribSpecialsCount!=null){
                         java.lang.String content = tempAttribSpecialsCount;
                        
                                                 object.setSpecialsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribSpecialsCount));
                                            
                    } else {
                       
                                           object.setSpecialsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("specialsCount");
                    
                    // handle attribute "roomPreferenceExists"
                    java.lang.String tempAttribRoomPreferenceExists =
                        
                                reader.getAttributeValue(null,"roomPreferenceExists");
                            
                   if (tempAttribRoomPreferenceExists!=null){
                         java.lang.String content = tempAttribRoomPreferenceExists;
                        
                                                 object.setRoomPreferenceExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribRoomPreferenceExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("roomPreferenceExists");
                    
                    // handle attribute "roomPreferencesCount"
                    java.lang.String tempAttribRoomPreferencesCount =
                        
                                reader.getAttributeValue(null,"roomPreferencesCount");
                            
                   if (tempAttribRoomPreferencesCount!=null){
                         java.lang.String content = tempAttribRoomPreferencesCount;
                        
                                                 object.setRoomPreferencesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribRoomPreferencesCount));
                                            
                    } else {
                       
                                           object.setRoomPreferencesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("roomPreferencesCount");
                    
                    // handle attribute "shareExists"
                    java.lang.String tempAttribShareExists =
                        
                                reader.getAttributeValue(null,"shareExists");
                            
                   if (tempAttribShareExists!=null){
                         java.lang.String content = tempAttribShareExists;
                        
                                                 object.setShareExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribShareExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("shareExists");
                    
                    // handle attribute "queueExists"
                    java.lang.String tempAttribQueueExists =
                        
                                reader.getAttributeValue(null,"queueExists");
                            
                   if (tempAttribQueueExists!=null){
                         java.lang.String content = tempAttribQueueExists;
                        
                                                 object.setQueueExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribQueueExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("queueExists");
                    
                    // handle attribute "queueNumber"
                    java.lang.String tempAttribQueueNumber =
                        
                                reader.getAttributeValue(null,"queueNumber");
                            
                   if (tempAttribQueueNumber!=null){
                         java.lang.String content = tempAttribQueueNumber;
                        
                                                 object.setQueueNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribQueueNumber));
                                            
                    } else {
                       
                                           object.setQueueNumber(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("queueNumber");
                    
                    // handle attribute "alertExists"
                    java.lang.String tempAttribAlertExists =
                        
                                reader.getAttributeValue(null,"alertExists");
                            
                   if (tempAttribAlertExists!=null){
                         java.lang.String content = tempAttribAlertExists;
                        
                                                 object.setAlertExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAlertExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("alertExists");
                    
                    // handle attribute "alertsCount"
                    java.lang.String tempAttribAlertsCount =
                        
                                reader.getAttributeValue(null,"alertsCount");
                            
                   if (tempAttribAlertsCount!=null){
                         java.lang.String content = tempAttribAlertsCount;
                        
                                                 object.setAlertsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribAlertsCount));
                                            
                    } else {
                       
                                           object.setAlertsCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("alertsCount");
                    
                    // handle attribute "messageExists"
                    java.lang.String tempAttribMessageExists =
                        
                                reader.getAttributeValue(null,"messageExists");
                            
                   if (tempAttribMessageExists!=null){
                         java.lang.String content = tempAttribMessageExists;
                        
                                                 object.setMessageExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMessageExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("messageExists");
                    
                    // handle attribute "messagesCount"
                    java.lang.String tempAttribMessagesCount =
                        
                                reader.getAttributeValue(null,"messagesCount");
                            
                   if (tempAttribMessagesCount!=null){
                         java.lang.String content = tempAttribMessagesCount;
                        
                                                 object.setMessagesCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMessagesCount));
                                            
                    } else {
                       
                                           object.setMessagesCount(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("messagesCount");
                    
                    // handle attribute "checkOutTime"
                    java.lang.String tempAttribCheckOutTime =
                        
                                reader.getAttributeValue(null,"checkOutTime");
                            
                   if (tempAttribCheckOutTime!=null){
                         java.lang.String content = tempAttribCheckOutTime;
                        
                                                 object.setCheckOutTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToTime(tempAttribCheckOutTime));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("checkOutTime");
                    
                    // handle attribute "computedReservationStatus"
                    java.lang.String tempAttribComputedReservationStatus =
                        
                                reader.getAttributeValue(null,"computedReservationStatus");
                            
                   if (tempAttribComputedReservationStatus!=null){
                         java.lang.String content = tempAttribComputedReservationStatus;
                        
                                                  object.setComputedReservationStatus(
                                                        com.cloudkey.pms.micros.og.reservation.ReservationStatusType.Factory.fromString(reader,tempAttribComputedReservationStatus));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("computedReservationStatus");
                    
                    // handle attribute "financialTransactionExists"
                    java.lang.String tempAttribFinancialTransactionExists =
                        
                                reader.getAttributeValue(null,"financialTransactionExists");
                            
                   if (tempAttribFinancialTransactionExists!=null){
                         java.lang.String content = tempAttribFinancialTransactionExists;
                        
                                                 object.setFinancialTransactionExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFinancialTransactionExists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("financialTransactionExists");
                    
                    // handle attribute "printRate"
                    java.lang.String tempAttribPrintRate =
                        
                                reader.getAttributeValue(null,"printRate");
                            
                   if (tempAttribPrintRate!=null){
                         java.lang.String content = tempAttribPrintRate;
                        
                                                 object.setPrintRate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPrintRate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("printRate");
                    
                    // handle attribute "referralYN"
                    java.lang.String tempAttribReferralYN =
                        
                                reader.getAttributeValue(null,"referralYN");
                            
                   if (tempAttribReferralYN!=null){
                         java.lang.String content = tempAttribReferralYN;
                        
                                                 object.setReferralYN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribReferralYN));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("referralYN");
                    
                    // handle attribute "allowPreRegisteration"
                    java.lang.String tempAttribAllowPreRegisteration =
                        
                                reader.getAttributeValue(null,"allowPreRegisteration");
                            
                   if (tempAttribAllowPreRegisteration!=null){
                         java.lang.String content = tempAttribAllowPreRegisteration;
                        
                                                 object.setAllowPreRegisteration(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAllowPreRegisteration));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("allowPreRegisteration");
                    
                    // handle attribute "preRegisterFlag"
                    java.lang.String tempAttribPreRegisterFlag =
                        
                                reader.getAttributeValue(null,"preRegisterFlag");
                            
                   if (tempAttribPreRegisterFlag!=null){
                         java.lang.String content = tempAttribPreRegisterFlag;
                        
                                                 object.setPreRegisterFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribPreRegisterFlag));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("preRegisterFlag");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UniqueIDList").equals(reader.getName())){
                                
                                                object.setUniqueIDList(com.cloudkey.pms.micros.og.common.UniqueIDList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","RoomStays").equals(reader.getName())){
                                
                                                object.setRoomStays(com.cloudkey.pms.micros.og.hotelcommon.RoomStayList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ResGuests").equals(reader.getName())){
                                
                                                object.setResGuests(com.cloudkey.pms.micros.og.reservation.ResGuestList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","WrittenConfInst").equals(reader.getName())){
                                
                                                object.setWrittenConfInst(com.cloudkey.pms.micros.og.reservation.WrittenConfInst.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ReservationHistory").equals(reader.getName())){
                                
                                                object.setReservationHistory(com.cloudkey.pms.micros.og.common.History.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","UserDefinedValues").equals(reader.getName())){
                                
                                                object.setUserDefinedValues(com.cloudkey.pms.micros.og.common.UserDefinedValueList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Invoice").equals(reader.getName())){
                                
                                                object.setInvoice(com.cloudkey.pms.micros.og.reservation.BillHeader.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Preferences").equals(reader.getName())){
                                
                                                object.setPreferences(com.cloudkey.pms.micros.og.name.PreferenceList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(com.cloudkey.pms.micros.og.reservation.Alert.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Alerts").equals(reader.getName())){
                                                                    list9.add(com.cloudkey.pms.micros.og.reservation.Alert.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAlerts((com.cloudkey.pms.micros.og.reservation.Alert[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.reservation.Alert.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list10.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
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
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayRoutings").equals(reader.getName())){
                                                                    list10.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayRoutings((com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.ResPayRouting.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
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
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","PayMethods").equals(reader.getName())){
                                                                    list11.add(com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPayMethods((com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.hotelcommon.ResPayMethod.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","AccompanyGuests").equals(reader.getName())){
                                
                                                object.setAccompanyGuests(com.cloudkey.pms.micros.og.hotelcommon.AccompanyGuestList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ECertificate").equals(reader.getName())){
                                
                                                object.setECertificate(com.cloudkey.pms.micros.og.membership.ECertificate.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","ShareReservations").equals(reader.getName())){
                                
                                                object.setShareReservations(com.cloudkey.pms.micros.og.reservation.ShareReservationList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Reservation/","Miscellaneous").equals(reader.getName())){
                                
                                                object.setMiscellaneous(com.cloudkey.pms.micros.og.reservation.MoreFields.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    