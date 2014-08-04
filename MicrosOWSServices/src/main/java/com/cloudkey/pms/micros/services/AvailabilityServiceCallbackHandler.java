
/**
 * AvailabilityServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.cloudkey.pms.micros.services;

    /**
     *  AvailabilityServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AvailabilityServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AvailabilityServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AvailabilityServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for regionalAvailabilityExt method
            * override this method for handling normal response from regionalAvailabilityExt operation
            */
           public void receiveResultregionalAvailabilityExt(
                    com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityExtResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from regionalAvailabilityExt operation
           */
            public void receiveErrorregionalAvailabilityExt(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAvailablePackages method
            * override this method for handling normal response from fetchAvailablePackages operation
            */
           public void receiveResultfetchAvailablePackages(
                    com.cloudkey.pms.micros.ows.availability.FetchAvailablePackagesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAvailablePackages operation
           */
            public void receiveErrorfetchAvailablePackages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for regionalAvailability method
            * override this method for handling normal response from regionalAvailability operation
            */
           public void receiveResultregionalAvailability(
                    com.cloudkey.pms.micros.ows.availability.RegionalAvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from regionalAvailability operation
           */
            public void receiveErrorregionalAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchAvailableItems method
            * override this method for handling normal response from fetchAvailableItems operation
            */
           public void receiveResultfetchAvailableItems(
                    com.cloudkey.pms.micros.ows.availability.FetchAvailableItemsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchAvailableItems operation
           */
            public void receiveErrorfetchAvailableItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCacheStatus method
            * override this method for handling normal response from getCacheStatus operation
            */
           public void receiveResultgetCacheStatus(
                    com.cloudkey.pms.micros.ows.availability.GetCacheStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCacheStatus operation
           */
            public void receiveErrorgetCacheStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchExpectedCharges method
            * override this method for handling normal response from fetchExpectedCharges operation
            */
           public void receiveResultfetchExpectedCharges(
                    com.cloudkey.pms.micros.ows.availability.FetchExpectedChargesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchExpectedCharges operation
           */
            public void receiveErrorfetchExpectedCharges(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchCalendar method
            * override this method for handling normal response from fetchCalendar operation
            */
           public void receiveResultfetchCalendar(
                    com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchCalendar operation
           */
            public void receiveErrorfetchCalendar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for availability method
            * override this method for handling normal response from availability operation
            */
           public void receiveResultavailability(
                    com.cloudkey.pms.micros.ows.availability.AvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from availability operation
           */
            public void receiveErroravailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for gdsAreaAvailability method
            * override this method for handling normal response from gdsAreaAvailability operation
            */
           public void receiveResultgdsAreaAvailability(
                    com.cloudkey.pms.micros.ows.availability.GdsAreaAvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from gdsAreaAvailability operation
           */
            public void receiveErrorgdsAreaAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchItemGroups method
            * override this method for handling normal response from fetchItemGroups operation
            */
           public void receiveResultfetchItemGroups(
                    com.cloudkey.pms.micros.ows.availability.FetchItemGroupsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchItemGroups operation
           */
            public void receiveErrorfetchItemGroups(java.lang.Exception e) {
            }
                


    }
    