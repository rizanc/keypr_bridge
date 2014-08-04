
/**
 * RegisterNameRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.cloudkey.pms.micros.ows.name;
            

            /**
            *  RegisterNameRequest bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RegisterNameRequest
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RegisterNameRequest
                Namespace URI = http://webservices.micros.com/ows/5.1/Name.wsdl
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for PersonName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.PersonName localPersonName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonNameTracker = false ;

                           public boolean isPersonNameSpecified(){
                               return localPersonNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.PersonName
                           */
                           public  com.cloudkey.pms.micros.og.common.PersonName getPersonName(){
                               return localPersonName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonName
                               */
                               public void setPersonName(com.cloudkey.pms.micros.og.common.PersonName param){
                            localPersonNameTracker = param != null;
                                   
                                            this.localPersonName=param;
                                    

                               }
                            

                        /**
                        * field for NativeName
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NativeName localNativeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNativeNameTracker = false ;

                           public boolean isNativeNameSpecified(){
                               return localNativeNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NativeName
                           */
                           public  com.cloudkey.pms.micros.og.name.NativeName getNativeName(){
                               return localNativeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NativeName
                               */
                               public void setNativeName(com.cloudkey.pms.micros.og.name.NativeName param){
                            localNativeNameTracker = param != null;
                                   
                                            this.localNativeName=param;
                                    

                               }
                            

                        /**
                        * field for Birthdate
                        */

                        
                                    protected java.util.Date localBirthdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBirthdateTracker = false ;

                           public boolean isBirthdateSpecified(){
                               return localBirthdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getBirthdate(){
                               return localBirthdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Birthdate
                               */
                               public void setBirthdate(java.util.Date param){
                            localBirthdateTracker = param != null;
                                   
                                            this.localBirthdate=param;
                                    

                               }
                            

                        /**
                        * field for Gender
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Gender localGender ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGenderTracker = false ;

                           public boolean isGenderSpecified(){
                               return localGenderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Gender
                           */
                           public  com.cloudkey.pms.micros.og.common.Gender getGender(){
                               return localGender;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Gender
                               */
                               public void setGender(com.cloudkey.pms.micros.og.common.Gender param){
                            localGenderTracker = param != null;
                                   
                                            this.localGender=param;
                                    

                               }
                            

                        /**
                        * field for Address
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Address localAddress ;
                                
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
                           * @return com.cloudkey.pms.micros.og.common.Address
                           */
                           public  com.cloudkey.pms.micros.og.common.Address getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.cloudkey.pms.micros.og.common.Address param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for Phone
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.Phone[] localPhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhoneTracker = false ;

                           public boolean isPhoneSpecified(){
                               return localPhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.Phone[]
                           */
                           public  com.cloudkey.pms.micros.og.common.Phone[] getPhone(){
                               return localPhone;
                           }

                           
                        


                               
                              /**
                               * validate the array for Phone
                               */
                              protected void validatePhone(com.cloudkey.pms.micros.og.common.Phone[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Phone
                              */
                              public void setPhone(com.cloudkey.pms.micros.og.common.Phone[] param){
                              
                                   validatePhone(param);

                               localPhoneTracker = param != null;
                                      
                                      this.localPhone=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.common.Phone
                             */
                             public void addPhone(com.cloudkey.pms.micros.og.common.Phone param){
                                   if (localPhone == null){
                                   localPhone = new com.cloudkey.pms.micros.og.common.Phone[]{};
                                   }

                            
                                 //update the setting tracker
                                localPhoneTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPhone);
                               list.add(param);
                               this.localPhone =
                             (com.cloudkey.pms.micros.og.common.Phone[])list.toArray(
                            new com.cloudkey.pms.micros.og.common.Phone[list.size()]);

                             }
                             

                        /**
                        * field for Passport
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.GovernmentID localPassport ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassportTracker = false ;

                           public boolean isPassportSpecified(){
                               return localPassportTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.GovernmentID
                           */
                           public  com.cloudkey.pms.micros.og.common.GovernmentID getPassport(){
                               return localPassport;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Passport
                               */
                               public void setPassport(com.cloudkey.pms.micros.og.common.GovernmentID param){
                            localPassportTracker = param != null;
                                   
                                            this.localPassport=param;
                                    

                               }
                            

                        /**
                        * field for Nationality
                        */

                        
                                    protected java.lang.String localNationality ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNationalityTracker = false ;

                           public boolean isNationalitySpecified(){
                               return localNationalityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNationality(){
                               return localNationality;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nationality
                               */
                               public void setNationality(java.lang.String param){
                            localNationalityTracker = param != null;
                                   
                                            this.localNationality=param;
                                    

                               }
                            

                        /**
                        * field for VipCode
                        */

                        
                                    protected java.lang.String localVipCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVipCodeTracker = false ;

                           public boolean isVipCodeSpecified(){
                               return localVipCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVipCode(){
                               return localVipCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VipCode
                               */
                               public void setVipCode(java.lang.String param){
                            localVipCodeTracker = param != null;
                                   
                                            this.localVipCode=param;
                                    

                               }
                            

                        /**
                        * field for Id
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.GovernmentID localId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdTracker = false ;

                           public boolean isIdSpecified(){
                               return localIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.GovernmentID
                           */
                           public  com.cloudkey.pms.micros.og.common.GovernmentID getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(com.cloudkey.pms.micros.og.common.GovernmentID param){
                            localIdTracker = param != null;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for KeyWord
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.KeyWord localKeyWord ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyWordTracker = false ;

                           public boolean isKeyWordSpecified(){
                               return localKeyWordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.KeyWord
                           */
                           public  com.cloudkey.pms.micros.og.name.KeyWord getKeyWord(){
                               return localKeyWord;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyWord
                               */
                               public void setKeyWord(com.cloudkey.pms.micros.og.name.KeyWord param){
                            localKeyWordTracker = param != null;
                                   
                                            this.localKeyWord=param;
                                    

                               }
                            

                        /**
                        * field for Company
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.Company localCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompanyTracker = false ;

                           public boolean isCompanySpecified(){
                               return localCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.Company
                           */
                           public  com.cloudkey.pms.micros.og.name.Company getCompany(){
                               return localCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Company
                               */
                               public void setCompany(com.cloudkey.pms.micros.og.name.Company param){
                            localCompanyTracker = param != null;
                                   
                                            this.localCompany=param;
                                    

                               }
                            

                        /**
                        * field for Position
                        */

                        
                                    protected java.lang.String localPosition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPositionTracker = false ;

                           public boolean isPositionSpecified(){
                               return localPositionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPosition(){
                               return localPosition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Position
                               */
                               public void setPosition(java.lang.String param){
                            localPositionTracker = param != null;
                                   
                                            this.localPosition=param;
                                    

                               }
                            

                        /**
                        * field for Department
                        */

                        
                                    protected java.lang.String localDepartment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDepartmentTracker = false ;

                           public boolean isDepartmentSpecified(){
                               return localDepartmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDepartment(){
                               return localDepartment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Department
                               */
                               public void setDepartment(java.lang.String param){
                            localDepartmentTracker = param != null;
                                   
                                            this.localDepartment=param;
                                    

                               }
                            

                        /**
                        * field for Privacy
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType localPrivacy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrivacyTracker = false ;

                           public boolean isPrivacySpecified(){
                               return localPrivacyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType
                           */
                           public  com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType getPrivacy(){
                               return localPrivacy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Privacy
                               */
                               public void setPrivacy(com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType param){
                            localPrivacyTracker = param != null;
                                   
                                            this.localPrivacy=param;
                                    

                               }
                            

                        /**
                        * field for ActionCode
                        */

                        
                                    protected java.lang.String localActionCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActionCodeTracker = false ;

                           public boolean isActionCodeSpecified(){
                               return localActionCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getActionCode(){
                               return localActionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActionCode
                               */
                               public void setActionCode(java.lang.String param){
                            localActionCodeTracker = param != null;
                                   
                                            this.localActionCode=param;
                                    

                               }
                            

                        /**
                        * field for Email
                        * This was an Array!
                        */

                        
                                    protected com.cloudkey.pms.micros.og.name.NameEmail[] localEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;

                           public boolean isEmailSpecified(){
                               return localEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.name.NameEmail[]
                           */
                           public  com.cloudkey.pms.micros.og.name.NameEmail[] getEmail(){
                               return localEmail;
                           }

                           
                        


                               
                              /**
                               * validate the array for Email
                               */
                              protected void validateEmail(com.cloudkey.pms.micros.og.name.NameEmail[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Email
                              */
                              public void setEmail(com.cloudkey.pms.micros.og.name.NameEmail[] param){
                              
                                   validateEmail(param);

                               localEmailTracker = param != null;
                                      
                                      this.localEmail=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.cloudkey.pms.micros.og.name.NameEmail
                             */
                             public void addEmail(com.cloudkey.pms.micros.og.name.NameEmail param){
                                   if (localEmail == null){
                                   localEmail = new com.cloudkey.pms.micros.og.name.NameEmail[]{};
                                   }

                            
                                 //update the setting tracker
                                localEmailTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEmail);
                               list.add(param);
                               this.localEmail =
                             (com.cloudkey.pms.micros.og.name.NameEmail[])list.toArray(
                            new com.cloudkey.pms.micros.og.name.NameEmail[list.size()]);

                             }
                             

                        /**
                        * field for NameType
                        */

                        
                                    protected com.cloudkey.pms.micros.og.common.ProfileType localNameType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTypeTracker = false ;

                           public boolean isNameTypeSpecified(){
                               return localNameTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.cloudkey.pms.micros.og.common.ProfileType
                           */
                           public  com.cloudkey.pms.micros.og.common.ProfileType getNameType(){
                               return localNameType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameType
                               */
                               public void setNameType(com.cloudkey.pms.micros.og.common.ProfileType param){
                            localNameTypeTracker = param != null;
                                   
                                            this.localNameType=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                                    protected java.lang.String localLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;

                           public boolean isLanguageSpecified(){
                               return localLanguageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(java.lang.String param){
                            localLanguageTracker = param != null;
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for LoginName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localLoginName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLoginName(){
                               return localLoginName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LoginName
                               */
                               public void setLoginName(java.lang.String param){
                            
                                            this.localLoginName=param;
                                    

                               }
                            

                        /**
                        * field for Password
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localPassword ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            
                                            this.localPassword=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.micros.com/ows/5.1/Name.wsdl");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RegisterNameRequest",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RegisterNameRequest",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localLoginName != null){
                                        
                                                writeAttribute("",
                                                         "loginName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginName), xmlWriter);

                                            
                                      }
                                    
                                            if (localPassword != null){
                                        
                                                writeAttribute("",
                                                         "password",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword), xmlWriter);

                                            
                                      }
                                     if (localPersonNameTracker){
                                            if (localPersonName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                            }
                                           localPersonName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","PersonName"),
                                               xmlWriter);
                                        } if (localNativeNameTracker){
                                            if (localNativeName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                            }
                                           localNativeName.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NativeName"),
                                               xmlWriter);
                                        } if (localBirthdateTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Birthdate", xmlWriter);
                             

                                          if (localBirthdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Birthdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGenderTracker){
                                            if (localGender==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Gender cannot be null!!");
                                            }
                                           localGender.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Gender"),
                                               xmlWriter);
                                        } if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Address"),
                                               xmlWriter);
                                        } if (localPhoneTracker){
                                       if (localPhone!=null){
                                            for (int i = 0;i < localPhone.length;i++){
                                                if (localPhone[i] != null){
                                                 localPhone[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Phone"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Phone cannot be null!!");
                                        
                                    }
                                 } if (localPassportTracker){
                                            if (localPassport==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Passport cannot be null!!");
                                            }
                                           localPassport.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Passport"),
                                               xmlWriter);
                                        } if (localNationalityTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "nationality", xmlWriter);
                             

                                          if (localNationality==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("nationality cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNationality);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVipCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "vipCode", xmlWriter);
                             

                                          if (localVipCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("vipCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localVipCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdTracker){
                                            if (localId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");
                                            }
                                           localId.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Id"),
                                               xmlWriter);
                                        } if (localKeyWordTracker){
                                            if (localKeyWord==null){
                                                 throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                            }
                                           localKeyWord.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","KeyWord"),
                                               xmlWriter);
                                        } if (localCompanyTracker){
                                            if (localCompany==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Company cannot be null!!");
                                            }
                                           localCompany.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Company"),
                                               xmlWriter);
                                        } if (localPositionTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Position", xmlWriter);
                             

                                          if (localPosition==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Position cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPosition);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDepartmentTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Department", xmlWriter);
                             

                                          if (localDepartment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Department cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDepartment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrivacyTracker){
                                            if (localPrivacy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Privacy cannot be null!!");
                                            }
                                           localPrivacy.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Privacy"),
                                               xmlWriter);
                                        } if (localActionCodeTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "ActionCode", xmlWriter);
                             

                                          if (localActionCode==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ActionCode cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localActionCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailTracker){
                                       if (localEmail!=null){
                                            for (int i = 0;i < localEmail.length;i++){
                                                if (localEmail[i] != null){
                                                 localEmail[i].serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Email"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
                                        
                                    }
                                 } if (localNameTypeTracker){
                                            if (localNameType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NameType cannot be null!!");
                                            }
                                           localNameType.serialize(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NameType"),
                                               xmlWriter);
                                        } if (localLanguageTracker){
                                    namespace = "http://webservices.micros.com/ows/5.1/Name.wsdl";
                                    writeStartElement(null, namespace, "Language", xmlWriter);
                             

                                          if (localLanguage==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLanguage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://webservices.micros.com/ows/5.1/Name.wsdl")){
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

                 if (localPersonNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "PersonName"));
                            
                            
                                    if (localPersonName==null){
                                         throw new org.apache.axis2.databinding.ADBException("PersonName cannot be null!!");
                                    }
                                    elementList.add(localPersonName);
                                } if (localNativeNameTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "NativeName"));
                            
                            
                                    if (localNativeName==null){
                                         throw new org.apache.axis2.databinding.ADBException("NativeName cannot be null!!");
                                    }
                                    elementList.add(localNativeName);
                                } if (localBirthdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Birthdate"));
                                 
                                        if (localBirthdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Birthdate cannot be null!!");
                                        }
                                    } if (localGenderTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Gender"));
                            
                            
                                    if (localGender==null){
                                         throw new org.apache.axis2.databinding.ADBException("Gender cannot be null!!");
                                    }
                                    elementList.add(localGender);
                                } if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("Address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                } if (localPhoneTracker){
                             if (localPhone!=null) {
                                 for (int i = 0;i < localPhone.length;i++){

                                    if (localPhone[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                          "Phone"));
                                         elementList.add(localPhone[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Phone cannot be null!!");
                                    
                             }

                        } if (localPassportTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Passport"));
                            
                            
                                    if (localPassport==null){
                                         throw new org.apache.axis2.databinding.ADBException("Passport cannot be null!!");
                                    }
                                    elementList.add(localPassport);
                                } if (localNationalityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "nationality"));
                                 
                                        if (localNationality != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNationality));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("nationality cannot be null!!");
                                        }
                                    } if (localVipCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "vipCode"));
                                 
                                        if (localVipCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVipCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("vipCode cannot be null!!");
                                        }
                                    } if (localIdTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Id"));
                            
                            
                                    if (localId==null){
                                         throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");
                                    }
                                    elementList.add(localId);
                                } if (localKeyWordTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "KeyWord"));
                            
                            
                                    if (localKeyWord==null){
                                         throw new org.apache.axis2.databinding.ADBException("KeyWord cannot be null!!");
                                    }
                                    elementList.add(localKeyWord);
                                } if (localCompanyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Company"));
                            
                            
                                    if (localCompany==null){
                                         throw new org.apache.axis2.databinding.ADBException("Company cannot be null!!");
                                    }
                                    elementList.add(localCompany);
                                } if (localPositionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Position"));
                                 
                                        if (localPosition != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosition));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Position cannot be null!!");
                                        }
                                    } if (localDepartmentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Department"));
                                 
                                        if (localDepartment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDepartment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Department cannot be null!!");
                                        }
                                    } if (localPrivacyTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Privacy"));
                            
                            
                                    if (localPrivacy==null){
                                         throw new org.apache.axis2.databinding.ADBException("Privacy cannot be null!!");
                                    }
                                    elementList.add(localPrivacy);
                                } if (localActionCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "ActionCode"));
                                 
                                        if (localActionCode != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActionCode));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ActionCode cannot be null!!");
                                        }
                                    } if (localEmailTracker){
                             if (localEmail!=null) {
                                 for (int i = 0;i < localEmail.length;i++){

                                    if (localEmail[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                          "Email"));
                                         elementList.add(localEmail[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
                                    
                             }

                        } if (localNameTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "NameType"));
                            
                            
                                    if (localNameType==null){
                                         throw new org.apache.axis2.databinding.ADBException("NameType cannot be null!!");
                                    }
                                    elementList.add(localNameType);
                                } if (localLanguageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl",
                                                                      "Language"));
                                 
                                        if (localLanguage != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLanguage));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                        }
                                    }
                            attribList.add(
                            new javax.xml.namespace.QName("","loginName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","password"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
                                

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
        public static RegisterNameRequest parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RegisterNameRequest object =
                new RegisterNameRequest();

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
                    
                            if (!"RegisterNameRequest".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RegisterNameRequest)com.cloudkey.pms.micros.ows.name.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "loginName"
                    java.lang.String tempAttribLoginName =
                        
                                reader.getAttributeValue(null,"loginName");
                            
                   if (tempAttribLoginName!=null){
                         java.lang.String content = tempAttribLoginName;
                        
                                                 object.setLoginName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribLoginName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("loginName");
                    
                    // handle attribute "password"
                    java.lang.String tempAttribPassword =
                        
                                reader.getAttributeValue(null,"password");
                            
                   if (tempAttribPassword!=null){
                         java.lang.String content = tempAttribPassword;
                        
                                                 object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribPassword));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("password");
                    
                    
                    reader.next();
                
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list17 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","PersonName").equals(reader.getName())){
                                
                                                object.setPersonName(com.cloudkey.pms.micros.og.common.PersonName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NativeName").equals(reader.getName())){
                                
                                                object.setNativeName(com.cloudkey.pms.micros.og.name.NativeName.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Birthdate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Birthdate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBirthdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Gender").equals(reader.getName())){
                                
                                                object.setGender(com.cloudkey.pms.micros.og.common.Gender.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Address").equals(reader.getName())){
                                
                                                object.setAddress(com.cloudkey.pms.micros.og.common.Address.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Phone").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list6.add(com.cloudkey.pms.micros.og.common.Phone.Factory.parse(reader));
                                                                
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
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Phone").equals(reader.getName())){
                                                                    list6.add(com.cloudkey.pms.micros.og.common.Phone.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPhone((com.cloudkey.pms.micros.og.common.Phone[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.common.Phone.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Passport").equals(reader.getName())){
                                
                                                object.setPassport(com.cloudkey.pms.micros.og.common.GovernmentID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","nationality").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nationality" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNationality(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","vipCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"vipCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVipCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Id").equals(reader.getName())){
                                
                                                object.setId(com.cloudkey.pms.micros.og.common.GovernmentID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","KeyWord").equals(reader.getName())){
                                
                                                object.setKeyWord(com.cloudkey.pms.micros.og.name.KeyWord.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Company").equals(reader.getName())){
                                
                                                object.setCompany(com.cloudkey.pms.micros.og.name.Company.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Position").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Position" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPosition(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Department").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Department" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDepartment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Privacy").equals(reader.getName())){
                                
                                                object.setPrivacy(com.cloudkey.pms.micros.og.name.ArrayOfPrivacyOptionType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","ActionCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ActionCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActionCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Email").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list17.add(com.cloudkey.pms.micros.og.name.NameEmail.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone17 = false;
                                                        while(!loopDone17){
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
                                                                loopDone17 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Email").equals(reader.getName())){
                                                                    list17.add(com.cloudkey.pms.micros.og.name.NameEmail.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone17 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEmail((com.cloudkey.pms.micros.og.name.NameEmail[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.cloudkey.pms.micros.og.name.NameEmail.class,
                                                                list17));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","NameType").equals(reader.getName())){
                                
                                                object.setNameType(com.cloudkey.pms.micros.og.common.ProfileType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.micros.com/ows/5.1/Name.wsdl","Language").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Language" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLanguage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
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
           
    