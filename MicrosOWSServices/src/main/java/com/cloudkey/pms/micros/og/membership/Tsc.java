
/**
 * Tsc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.og.membership;
            

            /**
            *  Tsc bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Tsc
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Tsc
                Namespace URI = http://webservices.micros.com/og/4.3/Membership/
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for BaseRevenue
                        * This was an Attribute!
                        */

                        
                                    protected double localBaseRevenue ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getBaseRevenue(){
                               return localBaseRevenue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaseRevenue
                               */
                               public void setBaseRevenue(double param){
                            
                                            this.localBaseRevenue=param;
                                    

                               }
                            

                        /**
                        * field for BonusRevenue
                        * This was an Attribute!
                        */

                        
                                    protected double localBonusRevenue ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getBonusRevenue(){
                               return localBonusRevenue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BonusRevenue
                               */
                               public void setBonusRevenue(double param){
                            
                                            this.localBonusRevenue=param;
                                    

                               }
                            

                        /**
                        * field for BaseNights
                        * This was an Attribute!
                        */

                        
                                    protected int localBaseNights ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBaseNights(){
                               return localBaseNights;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaseNights
                               */
                               public void setBaseNights(int param){
                            
                                            this.localBaseNights=param;
                                    

                               }
                            

                        /**
                        * field for BonusNights
                        * This was an Attribute!
                        */

                        
                                    protected int localBonusNights ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBonusNights(){
                               return localBonusNights;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BonusNights
                               */
                               public void setBonusNights(int param){
                            
                                            this.localBonusNights=param;
                                    

                               }
                            

                        /**
                        * field for BaseStay
                        * This was an Attribute!
                        */

                        
                                    protected int localBaseStay ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBaseStay(){
                               return localBaseStay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BaseStay
                               */
                               public void setBaseStay(int param){
                            
                                            this.localBaseStay=param;
                                    

                               }
                            

                        /**
                        * field for BonusStay
                        * This was an Attribute!
                        */

                        
                                    protected int localBonusStay ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBonusStay(){
                               return localBonusStay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BonusStay
                               */
                               public void setBonusStay(int param){
                            
                                            this.localBonusStay=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/og/4.3/Membership/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Tsc",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Tsc",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (!java.lang.Double.isNaN(localBaseRevenue)) {
                                               
                                                writeAttribute("",
                                                         "baseRevenue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseRevenue), xmlWriter);

                                            
                                      }
                                    
                                                   if (!java.lang.Double.isNaN(localBonusRevenue)) {
                                               
                                                writeAttribute("",
                                                         "bonusRevenue",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusRevenue), xmlWriter);

                                            
                                      }
                                    
                                                   if (localBaseNights!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "baseNights",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseNights), xmlWriter);

                                            
                                      }
                                    
                                                   if (localBonusNights!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "bonusNights",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusNights), xmlWriter);

                                            
                                      }
                                    
                                                   if (localBaseStay!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "baseStay",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseStay), xmlWriter);

                                            
                                      }
                                    
                                                   if (localBonusStay!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeAttribute("",
                                                         "bonusStay",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusStay), xmlWriter);

                                            
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","baseRevenue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseRevenue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","bonusRevenue"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusRevenue));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","baseNights"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseNights));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","bonusNights"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusNights));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","baseStay"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBaseStay));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","bonusStay"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBonusStay));
                                

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
        public static Tsc parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Tsc object =
                new Tsc();

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
                    
                            if (!"Tsc".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Tsc)com.cloudkey.pms.micros.ows.membership.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "baseRevenue"
                    java.lang.String tempAttribBaseRevenue =
                        
                                reader.getAttributeValue(null,"baseRevenue");
                            
                   if (tempAttribBaseRevenue!=null){
                         java.lang.String content = tempAttribBaseRevenue;
                        
                                                 object.setBaseRevenue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribBaseRevenue));
                                            
                    } else {
                       
                                           object.setBaseRevenue(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("baseRevenue");
                    
                    // handle attribute "bonusRevenue"
                    java.lang.String tempAttribBonusRevenue =
                        
                                reader.getAttributeValue(null,"bonusRevenue");
                            
                   if (tempAttribBonusRevenue!=null){
                         java.lang.String content = tempAttribBonusRevenue;
                        
                                                 object.setBonusRevenue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(tempAttribBonusRevenue));
                                            
                    } else {
                       
                                           object.setBonusRevenue(java.lang.Double.NaN);
                                       
                    }
                    handledAttributes.add("bonusRevenue");
                    
                    // handle attribute "baseNights"
                    java.lang.String tempAttribBaseNights =
                        
                                reader.getAttributeValue(null,"baseNights");
                            
                   if (tempAttribBaseNights!=null){
                         java.lang.String content = tempAttribBaseNights;
                        
                                                 object.setBaseNights(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribBaseNights));
                                            
                    } else {
                       
                                           object.setBaseNights(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("baseNights");
                    
                    // handle attribute "bonusNights"
                    java.lang.String tempAttribBonusNights =
                        
                                reader.getAttributeValue(null,"bonusNights");
                            
                   if (tempAttribBonusNights!=null){
                         java.lang.String content = tempAttribBonusNights;
                        
                                                 object.setBonusNights(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribBonusNights));
                                            
                    } else {
                       
                                           object.setBonusNights(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("bonusNights");
                    
                    // handle attribute "baseStay"
                    java.lang.String tempAttribBaseStay =
                        
                                reader.getAttributeValue(null,"baseStay");
                            
                   if (tempAttribBaseStay!=null){
                         java.lang.String content = tempAttribBaseStay;
                        
                                                 object.setBaseStay(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribBaseStay));
                                            
                    } else {
                       
                                           object.setBaseStay(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("baseStay");
                    
                    // handle attribute "bonusStay"
                    java.lang.String tempAttribBonusStay =
                        
                                reader.getAttributeValue(null,"bonusStay");
                            
                   if (tempAttribBonusStay!=null){
                         java.lang.String content = tempAttribBonusStay;
                        
                                                 object.setBonusStay(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(tempAttribBonusStay));
                                            
                    } else {
                       
                                           object.setBonusStay(java.lang.Integer.MIN_VALUE);
                                       
                    }
                    handledAttributes.add("bonusStay");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    