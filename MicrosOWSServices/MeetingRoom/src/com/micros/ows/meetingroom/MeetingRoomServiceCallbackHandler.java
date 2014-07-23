
/**
 * MeetingRoomServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.micros.ows.meetingroom;

    /**
     *  MeetingRoomServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MeetingRoomServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MeetingRoomServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MeetingRoomServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for meetingFetchBlockDelegates method
            * override this method for handling normal response from meetingFetchBlockDelegates operation
            */
           public void receiveResultmeetingFetchBlockDelegates(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchBlockDelegatesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchBlockDelegates operation
           */
            public void receiveErrormeetingFetchBlockDelegates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingPackageAvailability method
            * override this method for handling normal response from meetingPackageAvailability operation
            */
           public void receiveResultmeetingPackageAvailability(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingPackageAvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingPackageAvailability operation
           */
            public void receiveErrormeetingPackageAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchContract method
            * override this method for handling normal response from meetingFetchContract operation
            */
           public void receiveResultmeetingFetchContract(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchContractResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchContract operation
           */
            public void receiveErrormeetingFetchContract(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingRoomFetchMyBlocks method
            * override this method for handling normal response from meetingRoomFetchMyBlocks operation
            */
           public void receiveResultmeetingRoomFetchMyBlocks(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingRoomFetchMyBlocksResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingRoomFetchMyBlocks operation
           */
            public void receiveErrormeetingRoomFetchMyBlocks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingAvailability method
            * override this method for handling normal response from meetingAvailability operation
            */
           public void receiveResultmeetingAvailability(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingAvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingAvailability operation
           */
            public void receiveErrormeetingAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingModifyEvent method
            * override this method for handling normal response from meetingModifyEvent operation
            */
           public void receiveResultmeetingModifyEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingModifyEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingModifyEvent operation
           */
            public void receiveErrormeetingModifyEvent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingRegisterEventAttendees method
            * override this method for handling normal response from meetingRegisterEventAttendees operation
            */
           public void receiveResultmeetingRegisterEventAttendees(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingRegisterEventAttendeesResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingRegisterEventAttendees operation
           */
            public void receiveErrormeetingRegisterEventAttendees(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchPackageEvent method
            * override this method for handling normal response from meetingFetchPackageEvent operation
            */
           public void receiveResultmeetingFetchPackageEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchPackageEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchPackageEvent operation
           */
            public void receiveErrormeetingFetchPackageEvent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingModifyPackageEvent method
            * override this method for handling normal response from meetingModifyPackageEvent operation
            */
           public void receiveResultmeetingModifyPackageEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingModifyPackageEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingModifyPackageEvent operation
           */
            public void receiveErrormeetingModifyPackageEvent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchMiscellaneousItem method
            * override this method for handling normal response from meetingFetchMiscellaneousItem operation
            */
           public void receiveResultmeetingFetchMiscellaneousItem(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchMiscellaneousItemResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchMiscellaneousItem operation
           */
            public void receiveErrormeetingFetchMiscellaneousItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createBlock method
            * override this method for handling normal response from createBlock operation
            */
           public void receiveResultcreateBlock(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.CreateBlockResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createBlock operation
           */
            public void receiveErrorcreateBlock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchMyRegisteredEvents method
            * override this method for handling normal response from meetingFetchMyRegisteredEvents operation
            */
           public void receiveResultmeetingFetchMyRegisteredEvents(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchMyRegisteredEventsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchMyRegisteredEvents operation
           */
            public void receiveErrormeetingFetchMyRegisteredEvents(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchMenuItem method
            * override this method for handling normal response from meetingFetchMenuItem operation
            */
           public void receiveResultmeetingFetchMenuItem(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchMenuItemResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchMenuItem operation
           */
            public void receiveErrormeetingFetchMenuItem(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingRoomCreateRelationship method
            * override this method for handling normal response from meetingRoomCreateRelationship operation
            */
           public void receiveResultmeetingRoomCreateRelationship(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingRoomCreateRelationshipResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingRoomCreateRelationship operation
           */
            public void receiveErrormeetingRoomCreateRelationship(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchMenu method
            * override this method for handling normal response from meetingFetchMenu operation
            */
           public void receiveResultmeetingFetchMenu(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchMenuResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchMenu operation
           */
            public void receiveErrormeetingFetchMenu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingCreatePackageEvent method
            * override this method for handling normal response from meetingCreatePackageEvent operation
            */
           public void receiveResultmeetingCreatePackageEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingCreatePackageEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingCreatePackageEvent operation
           */
            public void receiveErrormeetingCreatePackageEvent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingRoomFetchBlock method
            * override this method for handling normal response from meetingRoomFetchBlock operation
            */
           public void receiveResultmeetingRoomFetchBlock(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingRoomFetchBlockResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingRoomFetchBlock operation
           */
            public void receiveErrormeetingRoomFetchBlock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingRoomCopyBlock method
            * override this method for handling normal response from meetingRoomCopyBlock operation
            */
           public void receiveResultmeetingRoomCopyBlock(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingRoomCopyBlockResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingRoomCopyBlock operation
           */
            public void receiveErrormeetingRoomCopyBlock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingMultiPropertyAvailability method
            * override this method for handling normal response from meetingMultiPropertyAvailability operation
            */
           public void receiveResultmeetingMultiPropertyAvailability(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingMultiPropertyAvailabilityResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingMultiPropertyAvailability operation
           */
            public void receiveErrormeetingMultiPropertyAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modifyBlock method
            * override this method for handling normal response from modifyBlock operation
            */
           public void receiveResultmodifyBlock(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.ModifyBlockResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modifyBlock operation
           */
            public void receiveErrormodifyBlock(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingFetchEvent method
            * override this method for handling normal response from meetingFetchEvent operation
            */
           public void receiveResultmeetingFetchEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingFetchEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingFetchEvent operation
           */
            public void receiveErrormeetingFetchEvent(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for meetingCreateEvent method
            * override this method for handling normal response from meetingCreateEvent operation
            */
           public void receiveResultmeetingCreateEvent(
                    com.micros.ows.meetingroom.MeetingRoomServiceStub.MeetingCreateEventResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from meetingCreateEvent operation
           */
            public void receiveErrormeetingCreateEvent(java.lang.Exception e) {
            }
                


    }
    