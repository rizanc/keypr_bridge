
/**
 * Statement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  Statement bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Statement extends com.cloudkey.pms.micros.og.membership.MembershipTransactionList
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Statement
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for NoticeText
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfText localNoticeText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoticeTextTracker = false ;

                           public boolean isNoticeTextSpecified(){
                               return localNoticeTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfText
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfText getNoticeText(){
                               return localNoticeText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoticeText
                               */
                               public void setNoticeText(com.cloudkey.pms.micros.og.common.ArrayOfText param){
                            localNoticeTextTracker = param != null;
                                   
                                            this.localNoticeText=param;
                                    

                               }
                            

                        /**
                        * field for AwardPointsToExpires
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire localAwardPointsToExpires ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardPointsToExpiresTracker = false ;

                           public boolean isAwardPointsToExpiresSpecified(){
                               return localAwardPointsToExpiresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire
                           */
                           public  com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire getAwardPointsToExpires(){
                               return localAwardPointsToExpires;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardPointsToExpires
                               */
                               public void setAwardPointsToExpires(com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire param){
                            localAwardPointsToExpiresTracker = param != null;
                                   
                                            this.localAwardPointsToExpires=param;
                                    

                               }
                            

                        /**
                        * field for UDFsList
                        */

                        
                                    protected com.cloudkey.pms.micros.og.membership.ArrayOfUDFs localUDFsList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUDFsListTracker = false ;

                           public boolean isUDFsListSpecified(){
                               return localUDFsListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.membership.ArrayOfUDFs
                           */
                           public  com.cloudkey.pms.micros.og.membership.ArrayOfUDFs getUDFsList(){
                               return localUDFsList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UDFsList
                               */
                               public void setUDFsList(com.cloudkey.pms.micros.og.membership.ArrayOfUDFs param){
                            localUDFsListTracker = param != null;
                                   
                                            this.localUDFsList=param;
                                    

                               }
                            

                        /**
                        * field for StatementDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localStatementDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStatementDate(){
                               return localStatementDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatementDate
                               */
                               public void setStatementDate(java.util.Date param){
                            
                                            this.localStatementDate=param;
                                    

                               }
                            

                        /**
                        * field for StatementID
                        * This was an Attribute!
                        */

                        
                                    protected java.math.BigInteger localStatementID ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.math.BigInteger
                           */
                           public  java.math.BigInteger getStatementID(){
                               return localStatementID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatementID
                               */
                               public void setStatementID(java.math.BigInteger param){
                            
                                            this.localStatementID=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localStartDate ;
                                

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
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        * This was an Attribute!
                        */

                        
                                    protected java.util.Date localEndDate ;
                                

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
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for BeginningBalance
                        * This was an Attribute!
                        */

                        
                                    protected float localBeginningBalance ;
                                

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getBeginningBalance(){
                               return localBeginningBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BeginningBalance
                               */
                               public void setBeginningBalance(float param){
                            
                                            this.localBeginningBalance=param;
                                    

                               }
                            

                        /**
                        * field for EndingBalance
                        * This was an Attribute!
                        */

                        
                                    protected float localEndingBalance ;
                                

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getEndingBalance(){
                               return localEndingBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndingBalance
                               */
                               public void setEndingBalance(float param){
                            
                                            this.localEndingBalance=param;
                                    

                               }
                            

                        /**
                        * field for MembershipYear
                        * This was an Attribute!
                        */

                        
                                    protected int localMembershipYear ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMembershipYear(){
                               return localMembershipYear;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembershipYear
                               */
                               public void setMembershipYear(int param){
                            
                                            this.localMembershipYear=param;
                                    

                               }
                            

                        /**
                        * field for AwardPointsEarned
                        * This was an Attribute!
                        */

                        
                                    protected double localAwardPointsEarned ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAwardPointsEarned(){
                               return localAwardPointsEarned;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardPointsEarned
                               */
                               public void setAwardPointsEarned(double param){
                            
                                            this.localAwardPointsEarned=param;
                                    

                               }
                            

                        /**
                        * field for AwardPointsUsed
                        * This was an Attribute!
                        */

                        
                                    protected double localAwardPointsUsed ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAwardPointsUsed(){
                               return localAwardPointsUsed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardPointsUsed
                               */
                               public void setAwardPointsUsed(double param){
                            
                                            this.localAwardPointsUsed=param;
                                    

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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Membership/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Statement",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Statement",
                           xmlWriter);
                   }

               
                                            if (localStatementDate != null){
                                        
                                                writeAttribute("",
                                                         "statementDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localStatementID != null){
                                        
                                                writeAttribute("",
                                                         "statementID",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementID), xmlWriter);

                                            
                                      }
                                    
                                            if (localStartDate != null){
                                        
                                                writeAttribute("",
                                                         "startDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate), xmlWriter);

                                            
                                      }
                                    
                                            if (localEndDate != null){
                                        
                                                writeAttribute("",
                                                         "endDate",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Float.isNaN(localBeginningBalance)) {
                                               
                                                writeAttribute("",
                                                         "beginningBalance",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginningBalance), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localBeginningBalance is null");
                                      }
                                    
                                                   if (!java.lang.Float.isNaN(localEndingBalance)) {
                                               
                                                writeAttribute("",
                                                         "endingBalance",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndingBalance), xmlWriter);

                                            
                                      }
                                    
                                                   if (localMembershipYear!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "membershipYear",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipYear), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localAwardPointsEarned)) {
                                               
                                                writeAttribute("",
                                                         "awardPointsEarned",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPointsEarned), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localAwardPointsUsed)) {
                                               
                                                writeAttribute("",
                                                         "awardPointsUsed",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPointsUsed), xmlWriter);

                                            
                                      }
                                     if (localCardInfoTracker){
                                            if (localCardInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CardInfo cannot be null!!");
                                            }
                                           localCardInfo.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CardInfo"),
                                               xmlWriter);
                                        } if (localMembershipTransactionTracker){
                                       if (localMembershipTransaction!=null){
                                            for (int i = 0;i < localMembershipTransaction.length;i++){
                                                if (localMembershipTransaction[i] != null){
                                                 localMembershipTransaction[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipTransaction"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("MembershipTransaction cannot be null!!");
                                        
                                    }
                                 } if (localNoticeTextTracker){
                                            if (localNoticeText==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noticeText cannot be null!!");
                                            }
                                           localNoticeText.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","noticeText"),
                                               xmlWriter);
                                        } if (localAwardPointsToExpiresTracker){
                                            if (localAwardPointsToExpires==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AwardPointsToExpires cannot be null!!");
                                            }
                                           localAwardPointsToExpires.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardPointsToExpires"),
                                               xmlWriter);
                                        } if (localUDFsListTracker){
                                            if (localUDFsList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UDFsList cannot be null!!");
                                            }
                                           localUDFsList.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","UDFsList"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/og/4.3/Membership/")){
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","Statement"));
                 if (localCardInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "CardInfo"));
                            
                            
                                    if (localCardInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("CardInfo cannot be null!!");
                                    }
                                    elementList.add(localCardInfo);
                                } if (localMembershipTransactionTracker){
                             if (localMembershipTransaction!=null) {
                                 for (int i = 0;i < localMembershipTransaction.length;i++){

                                    if (localMembershipTransaction[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                          "MembershipTransaction"));
                                         elementList.add(localMembershipTransaction[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("MembershipTransaction cannot be null!!");
                                    
                             }

                        } if (localNoticeTextTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "noticeText"));
                            
                            
                                    if (localNoticeText==null){
                                         throw new org.apache.axis2.databinding.ADBException("noticeText cannot be null!!");
                                    }
                                    elementList.add(localNoticeText);
                                } if (localAwardPointsToExpiresTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "AwardPointsToExpires"));
                            
                            
                                    if (localAwardPointsToExpires==null){
                                         throw new org.apache.axis2.databinding.ADBException("AwardPointsToExpires cannot be null!!");
                                    }
                                    elementList.add(localAwardPointsToExpires);
                                } if (localUDFsListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/",
                                                                      "UDFsList"));
                            
                            
                                    if (localUDFsList==null){
                                         throw new org.apache.axis2.databinding.ADBException("UDFsList cannot be null!!");
                                    }
                                    elementList.add(localUDFsList);
                                }
                            attribList.add(
                            new javax.xml.namespace.QName("","statementDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","statementID"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStatementID));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","startDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","endDate"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","beginningBalance"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBeginningBalance));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","endingBalance"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndingBalance));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","membershipYear"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMembershipYear));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","awardPointsEarned"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPointsEarned));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","awardPointsUsed"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAwardPointsUsed));
                                

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
        public static Statement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Statement object =
                new Statement();

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
                    
                            if (!"Statement".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Statement)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "statementDate"
                    java.lang.String tempAttribStatementDate =
                        
                                reader.getAttributeValue(null,"statementDate");
                            
                   if (tempAttribStatementDate!=null){
                         java.lang.String content = tempAttribStatementDate;
                        
                                                 object.setStatementDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribStatementDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("statementDate");
                    
                    // handle attribute "statementID"
                    java.lang.String tempAttribStatementID =
                        
                                reader.getAttributeValue(null,"statementID");
                            
                   if (tempAttribStatementID!=null){
                         java.lang.String content = tempAttribStatementID;
                        
                                                 object.setStatementID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(tempAttribStatementID));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("statementID");
                    
                    // handle attribute "startDate"
                    java.lang.String tempAttribStartDate =
                        
                                reader.getAttributeValue(null,"startDate");
                            
                   if (tempAttribStartDate!=null){
                         java.lang.String content = tempAttribStartDate;
                        
                                                 object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribStartDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("startDate");
                    
                    // handle attribute "endDate"
                    java.lang.String tempAttribEndDate =
                        
                                reader.getAttributeValue(null,"endDate");
                            
                   if (tempAttribEndDate!=null){
                         java.lang.String content = tempAttribEndDate;
                        
                                                 object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(tempAttribEndDate));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("endDate");
                    
                    // handle attribute "beginningBalance"
                    java.lang.String tempAttribBeginningBalance =
                        
                                reader.getAttributeValue(null,"beginningBalance");
                            
                   if (tempAttribBeginningBalance!=null){
                         java.lang.String content = tempAttribBeginningBalance;
                        
                                                 object.setBeginningBalance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(tempAttribBeginningBalance));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute beginningBalance is missing");
                           
                    }
                    handledAttributes.add("beginningBalance");
                    
                    // handle attribute "endingBalance"
                    java.lang.String tempAttribEndingBalance =
                        
                                reader.getAttributeValue(null,"endingBalance");
                            
                   if (tempAttribEndingBalance!=null){
                         java.lang.String content = tempAttribEndingBalance;
                        
                                                 object.setEndingBalance(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(tempAttribEndingBalance));
                                            
                    } else {
                       
                                           object.setEndingBalance(java.lang.Float.NaN);
                                       
                    }
                    handledAttributes.add("endingBalance");
                    
                    // handle attribute "membershipYear"
                    java.lang.String tempAttribMembershipYear =
                        
                                reader.getAttributeValue(null,"membershipYear");
                            
                   if (tempAttribMembershipYear!=null){
                         java.lang.String content = tempAttribMembershipYear;
                        
                                                 object.setMembershipYear(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribMembershipYear));
                                            
                    } else {
                       
                                           object.setMembershipYear(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("membershipYear");
                    
                    // handle attribute "awardPointsEarned"
                    java.lang.String tempAttribAwardPointsEarned =
                        
                                reader.getAttributeValue(null,"awardPointsEarned");
                            
                   if (tempAttribAwardPointsEarned!=null){
                         java.lang.String content = tempAttribAwardPointsEarned;
                        
                                                 object.setAwardPointsEarned(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribAwardPointsEarned));
                                            
                    } else {
                       
                                           object.setAwardPointsEarned(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("awardPointsEarned");
                    
                    // handle attribute "awardPointsUsed"
                    java.lang.String tempAttribAwardPointsUsed =
                        
                                reader.getAttributeValue(null,"awardPointsUsed");
                            
                   if (tempAttribAwardPointsUsed!=null){
                         java.lang.String content = tempAttribAwardPointsUsed;
                        
                                                 object.setAwardPointsUsed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribAwardPointsUsed));
                                            
                    } else {
                       
                                           object.setAwardPointsUsed(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("awardPointsUsed");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","CardInfo").equals(reader.getName())){
                                
                                                object.setCardInfo(com.cloudkey.pms.micros.og.name.NameMembership.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipTransaction").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(com.cloudkey.pms.micros.og.membership.MembershipTransaction.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","MembershipTransaction").equals(reader.getName())){
                                                                    list2.add(com.cloudkey.pms.micros.og.membership.MembershipTransaction.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMembershipTransaction((com.cloudkey.pms.micros.og.membership.MembershipTransaction[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.membership.MembershipTransaction.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","noticeText").equals(reader.getName())){
                                
                                                object.setNoticeText(com.cloudkey.pms.micros.og.common.ArrayOfText.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","AwardPointsToExpires").equals(reader.getName())){
                                
                                                object.setAwardPointsToExpires(com.cloudkey.pms.micros.og.common.ArrayOfAwardPointsToExpire.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/og/4.3/Membership/","UDFsList").equals(reader.getName())){
                                
                                                object.setUDFsList(com.cloudkey.pms.micros.og.membership.ArrayOfUDFs.Factory.parse(reader));
                                              
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
           
    