

/**
 * Information.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  Information java interface
     */

    public interface Information {
          

        /**
          * Auto generated method signature
          * Returns the converted amount, given the original currency code, original amount, converted currency code, and hotel criteria. An exchange type is also allowed.
                    * @param currencyConverterRequest7
                
                    * @param oGHeader8
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.CurrencyConverterResponseE currencyConverter(

                        com.cloudkey.pms.micros.ows.information.CurrencyConverterRequestE currencyConverterRequest7,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the converted amount, given the original currency code, original amount, converted currency code, and hotel criteria. An exchange type is also allowed.
                * @param currencyConverterRequest7
            
                * @param oGHeader8
            
          */
        public void startcurrencyConverter(

            com.cloudkey.pms.micros.ows.information.CurrencyConverterRequestE currencyConverterRequest7,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader8,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves a list of values, given the query type string. A wide variety of resort configuration details are viewable.
                    * @param lovRequest10
                
                    * @param oGHeader11
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.LovResponseE queryLov(

                        com.cloudkey.pms.micros.ows.information.LovRequestE lovRequest10,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader11)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves a list of values, given the query type string. A wide variety of resort configuration details are viewable.
                * @param lovRequest10
            
                * @param oGHeader11
            
          */
        public void startqueryLov(

            com.cloudkey.pms.micros.ows.information.LovRequestE lovRequest10,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader11,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves all the screen items.
                    * @param screenItemsRequest13
                
                    * @param oGHeader14
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.ScreenItemsResponseE getScreenItems(

                        com.cloudkey.pms.micros.ows.information.ScreenItemsRequestE screenItemsRequest13,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves all the screen items.
                * @param screenItemsRequest13
            
                * @param oGHeader14
            
          */
        public void startgetScreenItems(

            com.cloudkey.pms.micros.ows.information.ScreenItemsRequestE screenItemsRequest13,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader14,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns information about the chain, given the chain code. Information returned includes addresses, emails, phone numbers, marketing text, loyalty program details, booking conditions, and frequent flyer program details. This functionality is only available when in MyFidelio mode.
                    * @param chainInformationRequest16
                
                    * @param oGHeader17
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.ChainInformationResponseE queryChainInformation(

                        com.cloudkey.pms.micros.ows.information.ChainInformationRequestE chainInformationRequest16,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader17)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns information about the chain, given the chain code. Information returned includes addresses, emails, phone numbers, marketing text, loyalty program details, booking conditions, and frequent flyer program details. This functionality is only available when in MyFidelio mode.
                * @param chainInformationRequest16
            
                * @param oGHeader17
            
          */
        public void startqueryChainInformation(

            com.cloudkey.pms.micros.ows.information.ChainInformationRequestE chainInformationRequest16,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader17,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns Awards Schedules for Rate,Product and Upgrade awards types.
                    * @param awardsSchedulesRequest19
                
                    * @param oGHeader20
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.AwardsSchedulesResponseE queryAwardsSchedules(

                        com.cloudkey.pms.micros.ows.information.AwardsSchedulesRequestE awardsSchedulesRequest19,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns Awards Schedules for Rate,Product and Upgrade awards types.
                * @param awardsSchedulesRequest19
            
                * @param oGHeader20
            
          */
        public void startqueryAwardsSchedules(

            com.cloudkey.pms.micros.ows.information.AwardsSchedulesRequestE awardsSchedulesRequest19,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader20,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves information about a hotel, given the hotel criteria. Contact and location details as well as information about facilities, amenities, services, and alternative properties are provided.
                    * @param hotelInformationRequest22
                
                    * @param oGHeader23
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.HotelInformationResponseE queryHotelInformation(

                        com.cloudkey.pms.micros.ows.information.HotelInformationRequestE hotelInformationRequest22,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader23)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves information about a hotel, given the hotel criteria. Contact and location details as well as information about facilities, amenities, services, and alternative properties are provided.
                * @param hotelInformationRequest22
            
                * @param oGHeader23
            
          */
        public void startqueryHotelInformation(

            com.cloudkey.pms.micros.ows.information.HotelInformationRequestE hotelInformationRequest22,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader23,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns package groups/packages/item groups/items setup in the resort.
                    * @param packageItemsRequest25
                
                    * @param oGHeader26
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.PackageItemsResponseE queryPackageItems(

                        com.cloudkey.pms.micros.ows.information.PackageItemsRequestE packageItemsRequest25,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns package groups/packages/item groups/items setup in the resort.
                * @param packageItemsRequest25
            
                * @param oGHeader26
            
          */
        public void startqueryPackageItems(

            com.cloudkey.pms.micros.ows.information.PackageItemsRequestE packageItemsRequest25,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader26,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieves rate information, given the hotel and rate codes. A date range is also allowed. The information includes policies, requirements, restrictions, and other descriptive details.
                    * @param rateRequest28
                
                    * @param oGHeader29
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.RateResponseE queryRate(

                        com.cloudkey.pms.micros.ows.information.RateRequestE rateRequest28,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader29)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieves rate information, given the hotel and rate codes. A date range is also allowed. The information includes policies, requirements, restrictions, and other descriptive details.
                * @param rateRequest28
            
                * @param oGHeader29
            
          */
        public void startqueryRate(

            com.cloudkey.pms.micros.ows.information.RateRequestE rateRequest28,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader29,
                

            final com.cloudkey.pms.micros.services.InformationCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    