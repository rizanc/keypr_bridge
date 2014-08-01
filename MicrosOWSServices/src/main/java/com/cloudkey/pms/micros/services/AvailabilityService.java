

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
          * 
                    * @param fetchCalendarRequest9
                
                    * @param oGHeader10
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse fetchCalendar(

                        com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest fetchCalendarRequest9,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchCalendarRequest9
            
                * @param oGHeader10
            
          */
        public void startfetchCalendar(

            com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest fetchCalendarRequest9,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader10,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchItemGroupsRequest12
                
                    * @param oGHeader13
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchItemGroupsResponse fetchItemGroups(

                        com.cloudkey.pms.micros.ows.availability.FetchItemGroupsRequest fetchItemGroupsRequest12,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader13)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchItemGroupsRequest12
            
                * @param oGHeader13
            
          */
        public void startfetchItemGroups(

            com.cloudkey.pms.micros.ows.availability.FetchItemGroupsRequest fetchItemGroupsRequest12,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader13,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchExpectedChargesRequest15
                
                    * @param oGHeader16
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesResponse fetchExpectedCharges(

                        com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesRequest fetchExpectedChargesRequest15,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchExpectedChargesRequest15
            
                * @param oGHeader16
            
          */
        public void startfetchExpectedCharges(

            com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesRequest fetchExpectedChargesRequest15,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader16,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAvailablePackagesRequest18
                
                    * @param oGHeader19
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesResponse fetchAvailablePackages(

                        com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesRequest fetchAvailablePackagesRequest18,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader19)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAvailablePackagesRequest18
            
                * @param oGHeader19
            
          */
        public void startfetchAvailablePackages(

            com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesRequest fetchAvailablePackagesRequest18,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader19,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param gdsAreaAvailabilityRequest21
                
                    * @param oGHeader22
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityResponse gdsAreaAvailability(

                        com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityRequest gdsAreaAvailabilityRequest21,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param gdsAreaAvailabilityRequest21
            
                * @param oGHeader22
            
          */
        public void startgdsAreaAvailability(

            com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityRequest gdsAreaAvailabilityRequest21,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader22,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param regionalAvailabilityRequest24
                
                    * @param oGHeader25
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityResponse regionalAvailability(

                        com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityRequest regionalAvailabilityRequest24,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader25)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param regionalAvailabilityRequest24
            
                * @param oGHeader25
            
          */
        public void startregionalAvailability(

            com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityRequest regionalAvailabilityRequest24,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader25,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param regionalAvailabilityExtRequest27
                
                    * @param oGHeader28
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtResponse regionalAvailabilityExt(

                        com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtRequest regionalAvailabilityExtRequest27,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param regionalAvailabilityExtRequest27
            
                * @param oGHeader28
            
          */
        public void startregionalAvailabilityExt(

            com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtRequest regionalAvailabilityExtRequest27,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader28,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param availabilityRequest30
                
                    * @param oGHeader31
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.AvailabilityResponse availability(

                        com.cloudkey.pms.micros.ows.availability.AvailabilityRequest availabilityRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param availabilityRequest30
            
                * @param oGHeader31
            
          */
        public void startavailability(

            com.cloudkey.pms.micros.ows.availability.AvailabilityRequest availabilityRequest30,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader31,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getCacheStatusRequest33
                
                    * @param oGHeader34
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.GetCacheStatusResponse getCacheStatus(

                        com.cloudkey.pms.micros.ows.availability.GetCacheStatusRequest getCacheStatusRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getCacheStatusRequest33
            
                * @param oGHeader34
            
          */
        public void startgetCacheStatus(

            com.cloudkey.pms.micros.ows.availability.GetCacheStatusRequest getCacheStatusRequest33,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader34,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param fetchAvailableItemsRequest36
                
                    * @param oGHeader37
                
         */

         
                     public com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsResponse fetchAvailableItems(

                        com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsRequest fetchAvailableItemsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param fetchAvailableItemsRequest36
            
                * @param oGHeader37
            
          */
        public void startfetchAvailableItems(

            com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsRequest fetchAvailableItemsRequest36,com.cloudkey.pms.micros.og.core.OGHeaderE oGHeader37,
                

            final com.cloudkey.pms.micros.services.AvailabilityServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    