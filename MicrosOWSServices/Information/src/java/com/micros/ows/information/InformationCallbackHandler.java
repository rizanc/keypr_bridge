
/**
 * InformationCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.micros.ows.information;

    /**
     *  InformationCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class InformationCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public InformationCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public InformationCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for currencyConverter method
            * override this method for handling normal response from currencyConverter operation
            */
           public void receiveResultcurrencyConverter(
                    com.micros.ows.information.InformationStub.CurrencyConverterResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from currencyConverter operation
           */
            public void receiveErrorcurrencyConverter(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryLov method
            * override this method for handling normal response from queryLov operation
            */
           public void receiveResultqueryLov(
                    com.micros.ows.information.InformationStub.LovResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryLov operation
           */
            public void receiveErrorqueryLov(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getScreenItems method
            * override this method for handling normal response from getScreenItems operation
            */
           public void receiveResultgetScreenItems(
                    com.micros.ows.information.InformationStub.ScreenItemsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getScreenItems operation
           */
            public void receiveErrorgetScreenItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryChainInformation method
            * override this method for handling normal response from queryChainInformation operation
            */
           public void receiveResultqueryChainInformation(
                    com.micros.ows.information.InformationStub.ChainInformationResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryChainInformation operation
           */
            public void receiveErrorqueryChainInformation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryAwardsSchedules method
            * override this method for handling normal response from queryAwardsSchedules operation
            */
           public void receiveResultqueryAwardsSchedules(
                    com.micros.ows.information.InformationStub.AwardsSchedulesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryAwardsSchedules operation
           */
            public void receiveErrorqueryAwardsSchedules(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryHotelInformation method
            * override this method for handling normal response from queryHotelInformation operation
            */
           public void receiveResultqueryHotelInformation(
                    com.micros.ows.information.InformationStub.HotelInformationResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryHotelInformation operation
           */
            public void receiveErrorqueryHotelInformation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryPackageItems method
            * override this method for handling normal response from queryPackageItems operation
            */
           public void receiveResultqueryPackageItems(
                    com.micros.ows.information.InformationStub.PackageItemsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryPackageItems operation
           */
            public void receiveErrorqueryPackageItems(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryRate method
            * override this method for handling normal response from queryRate operation
            */
           public void receiveResultqueryRate(
                    com.micros.ows.information.InformationStub.RateResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryRate operation
           */
            public void receiveErrorqueryRate(java.lang.Exception e) {
            }
                


    }
    