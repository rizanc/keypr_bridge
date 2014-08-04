

/**
 * AvailabilityService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /*
     *  AvailabilityService java interface
     */

    public interface AvailabilityService {
          

        /**
          * Auto generated method signature
          * Retrieve a list of available hotels by geographical region, CRO, chain code or country.
                    * @param regionalAvailabilityExtRequest9
                
                    * @param oGHeader10
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtResponseE regionalAvailabilityExt(

                        com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtRequestE regionalAvailabilityExtRequest9,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of available hotels by geographical region, CRO, chain code or country.
                * @param regionalAvailabilityExtRequest9
            
                * @param oGHeader10
            
          */
        public void startregionalAvailabilityExt(

            com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtRequestE regionalAvailabilityExtRequest9,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader10,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a list of available add-on packages.
                    * @param fetchAvailablePackagesRequest12
                
                    * @param oGHeader13
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesResponseE fetchAvailablePackages(

                        com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesRequestE fetchAvailablePackagesRequest12,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader13)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of available add-on packages.
                * @param fetchAvailablePackagesRequest12
            
                * @param oGHeader13
            
          */
        public void startfetchAvailablePackages(

            com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesRequestE fetchAvailablePackagesRequest12,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader13,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a list of available hotels by geographical region, CRO, chain code or country.
                    * @param regionalAvailabilityRequest15
                
                    * @param oGHeader16
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityResponseE regionalAvailability(

                        com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityRequestE regionalAvailabilityRequest15,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of available hotels by geographical region, CRO, chain code or country.
                * @param regionalAvailabilityRequest15
            
                * @param oGHeader16
            
          */
        public void startregionalAvailability(

            com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityRequestE regionalAvailabilityRequest15,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader16,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve availability of inventory item or item group for requested date.
                    * @param fetchAvailableItemsRequest18
                
                    * @param oGHeader19
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsResponseE fetchAvailableItems(

                        com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsRequestE fetchAvailableItemsRequest18,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader19)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve availability of inventory item or item group for requested date.
                * @param fetchAvailableItemsRequest18
            
                * @param oGHeader19
            
          */
        public void startfetchAvailableItems(

            com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsRequestE fetchAvailableItemsRequest18,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader19,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Get lastest updated time stamp of resort cache refreshed.
                    * @param getCacheStatusRequest21
                
                    * @param oGHeader22
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.GetCacheStatusResponse getCacheStatus(

                        com.cloudkey.pms.micros.ows.availability.GetCacheStatusRequest getCacheStatusRequest21,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Get lastest updated time stamp of resort cache refreshed.
                * @param getCacheStatusRequest21
            
                * @param oGHeader22
            
          */
        public void startgetCacheStatus(

            com.cloudkey.pms.micros.ows.availability.GetCacheStatusRequest getCacheStatusRequest21,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader22,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a rate, taxes and package breakdown for stay for requested staye date, rate code, room type, property.
                    * @param fetchExpectedChargesRequest24
                
                    * @param oGHeader25
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesResponse fetchExpectedCharges(

                        com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesRequest fetchExpectedChargesRequest24,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader25)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a rate, taxes and package breakdown for stay for requested staye date, rate code, room type, property.
                * @param fetchExpectedChargesRequest24
            
                * @param oGHeader25
            
          */
        public void startfetchExpectedCharges(

            com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesRequest fetchExpectedChargesRequest24,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader25,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve availability and amount for requested data for daily.
                    * @param fetchCalendarRequest27
                
                    * @param oGHeader28
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE fetchCalendar(

                        com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE fetchCalendarRequest27,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve availability and amount for requested data for daily.
                * @param fetchCalendarRequest27
            
                * @param oGHeader28
            
          */
        public void startfetchCalendar(

            com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE fetchCalendarRequest27,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader28,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a list of availability for rooms and rates. General Availability (When summary only is set to true) and Detail Availability (When summary only is set to false).
                    * @param availabilityRequest30
                
                    * @param oGHeader31
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.AvailabilityResponseE availability(

                        com.cloudkey.pms.micros.ows.availability.AvailabilityRequestE availabilityRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of availability for rooms and rates. General Availability (When summary only is set to true) and Detail Availability (When summary only is set to false).
                * @param availabilityRequest30
            
                * @param oGHeader31
            
          */
        public void startavailability(

            com.cloudkey.pms.micros.ows.availability.AvailabilityRequestE availabilityRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * This is used for GDS channels to retrieves minimum and maximum rates available for requested hotels for requested rateplans.
                    * @param gdsAreaAvailabilityRequest33
                
                    * @param oGHeader34
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityResponseE gdsAreaAvailability(

                        com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityRequestE gdsAreaAvailabilityRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * This is used for GDS channels to retrieves minimum and maximum rates available for requested hotels for requested rateplans.
                * @param gdsAreaAvailabilityRequest33
            
                * @param oGHeader34
            
          */
        public void startgdsAreaAvailability(

            com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityRequestE gdsAreaAvailabilityRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Retrieve a list of inventory items or groups.
                    * @param fetchItemGroupsRequest36
                
                    * @param oGHeader37
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchItemGroupsResponseE fetchItemGroups(

                        com.cloudkey.pms.micros.ows.availability.FetchItemGroupsRequestE fetchItemGroupsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Retrieve a list of inventory items or groups.
                * @param fetchItemGroupsRequest36
            
                * @param oGHeader37
            
          */
        public void startfetchItemGroups(

            com.cloudkey.pms.micros.ows.availability.FetchItemGroupsRequestE fetchItemGroupsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    