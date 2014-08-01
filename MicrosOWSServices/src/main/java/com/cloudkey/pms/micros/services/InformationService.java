

/**
 * InformationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  InformationService java interface
     */

    public interface InformationService {
          

        /**
          * Auto generated method signature
          * 
                    * @param currencyConverterRequest7
                
                    * @param oGHeader8
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.CurrencyConverterResponse currencyConverter(

                        com.cloudkey.pms.micros.ows.information.CurrencyConverterRequest currencyConverterRequest7,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param currencyConverterRequest7
            
                * @param oGHeader8
            
          */
        public void startcurrencyConverter(

            com.cloudkey.pms.micros.ows.information.CurrencyConverterRequest currencyConverterRequest7,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader8,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param chainInformationRequest10
                
                    * @param oGHeader11
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.ChainInformationResponse queryChainInformation(

                        com.cloudkey.pms.micros.ows.information.ChainInformationRequest chainInformationRequest10,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader11)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param chainInformationRequest10
            
                * @param oGHeader11
            
          */
        public void startqueryChainInformation(

            com.cloudkey.pms.micros.ows.information.ChainInformationRequest chainInformationRequest10,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader11,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param packageItemsRequest13
                
                    * @param oGHeader14
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.PackageItemsResponse queryPackageItems(

                        com.cloudkey.pms.micros.ows.information.PackageItemsRequest packageItemsRequest13,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param packageItemsRequest13
            
                * @param oGHeader14
            
          */
        public void startqueryPackageItems(

            com.cloudkey.pms.micros.ows.information.PackageItemsRequest packageItemsRequest13,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader14,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param rateRequest16
                
                    * @param oGHeader17
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.RateResponse queryRate(

                        com.cloudkey.pms.micros.ows.information.RateRequest rateRequest16,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader17)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param rateRequest16
            
                * @param oGHeader17
            
          */
        public void startqueryRate(

            com.cloudkey.pms.micros.ows.information.RateRequest rateRequest16,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader17,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param lovRequest19
                
                    * @param oGHeader20
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.LovResponse queryLov(

                        com.cloudkey.pms.micros.ows.information.LovRequest lovRequest19,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param lovRequest19
            
                * @param oGHeader20
            
          */
        public void startqueryLov(

            com.cloudkey.pms.micros.ows.information.LovRequest lovRequest19,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader20,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param awardsSchedulesRequest22
                
                    * @param oGHeader23
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.AwardsSchedulesResponse queryAwardsSchedules(

                        com.cloudkey.pms.micros.ows.information.AwardsSchedulesRequest awardsSchedulesRequest22,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader23)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param awardsSchedulesRequest22
            
                * @param oGHeader23
            
          */
        public void startqueryAwardsSchedules(

            com.cloudkey.pms.micros.ows.information.AwardsSchedulesRequest awardsSchedulesRequest22,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader23,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param screenItemsRequest25
                
                    * @param oGHeader26
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.ScreenItemsResponse getScreenItems(

                        com.cloudkey.pms.micros.ows.information.ScreenItemsRequest screenItemsRequest25,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param screenItemsRequest25
            
                * @param oGHeader26
            
          */
        public void startgetScreenItems(

            com.cloudkey.pms.micros.ows.information.ScreenItemsRequest screenItemsRequest25,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader26,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param hotelInformationRequest28
                
                    * @param oGHeader29
                
         */

         
                     public com.cloudkey.pms.micros.ows.information.HotelInformationResponse queryHotelInformation(

                        com.cloudkey.pms.micros.ows.information.HotelInformationRequest hotelInformationRequest28,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader29)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param hotelInformationRequest28
            
                * @param oGHeader29
            
          */
        public void startqueryHotelInformation(

            com.cloudkey.pms.micros.ows.information.HotelInformationRequest hotelInformationRequest28,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader29,
                

            final com.cloudkey.pms.micros.services.InformationServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    