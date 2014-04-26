Keypr Bridge Environment Setup
=================================================================

A. Software Tools requirement
	* Eclipse Kepler IDE
	* jdk 1.7 
	* jre 7.0
	* Tomcat 7
	* MySQL 5.5
B. Steps to run the implementation:
	Pull the following folders from git hub:
	* CloudKeyHTBase: it holds all the common classes

	* CloudKeyHTWebServices: Services that are called by keypr 	  system

	* CloudKeyPrWebServiceClient: Client that is working like     
        keypr system i.e. sending request and making webservice 	  call

	* CloudKeyTestAdapter: Parser that acts as an interface 	 	  between bridge and PMS.

	* CloudKeyHTUploadService: Service that has implementation to 
       fetch the data from upload queue and push it to keypr   
       webservice

	* MicrosDataHarvester: Harvesting service that will pull the 
        data from OWS,compare the data in place and push it on
        upload tables.

	* MicrosPMSAdapter: Parser that converts the request into 
        Request/Response xml for/from OWS.

	* MicrosSimulatorPMS_OWS: it act as OWS simulator that 
        generates the responses corresponding to the request made  
        from keypr.

	* UploadServiceRest: it behaves as proxy for keypr upload    
        webservices endpoint and return response as SUCCESS’/’FAIL’
	
C. Database Setup:
   Pull the database folder from git hub.

For Test Adapter
--------------------------------------------------------------------
database\keypr.sql: contains database setup and includes dummy data insert statements and stored procedures that are called by adapter to fetch the data.

1. Run the script database\keypr_bridge_db.sql on Mysql Query           
   Browser.
2. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in 
        \CloudKeyTestAdapter\res\ 	adapterConfiguration.properties 

	* Create the adapter.jar of Project CloudKeyTestAdapter

	* Replace the adapter.jar in Project CloudKeyHTWebServices, 
        CloudKeyPrWebServiceClient.


For DHS and Upload Service
----------------------------------------------------------------
database\keypr_bridge_db.sql: this script has a new db ‘keypr_bridge_db’ with room_details,room_details_upload, room_inventory, room_inventory_upload tables which are currently used by dataharvesting and upload service respectively.

1. Run the script database\keypr_bridge_db.sql on Mysql Query 
   Browser.
2. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in \CloudKeyHTBase\res\ 	  	  baseconfiguration.properties

	* Create the base.jar of Project CloudKeyHTBase 

	* Replace the base.jar in Project CloudKeyHTWebServices,    
        MicrosSimulatorPMS_OWS, CloudKeyHTUploadService,
        MicrosDataHarvester, MicrosPMSAdapter, MicrosPMSAdapter, 
        CloudKeyHTUploadService 

* Create the microsadapter.jar of Project MicrosPMSAdapter 

	* Replace the microsadapter.jar in Project CloudKeyHTWebServices, 
        MicrosDataHarvester, CloudKeyPrWebServiceClient.

	



Project Deployment Instructions
=====================================================================


Project will be deployed and run as follows: 

A. For testing the Request Response Webservice flow with OWS
1. Run MicrosSimulatorPMS_OWS as a web project (Right click on the       
   project -> Run as -> Server)
   Running this will open up the communication channel between PMS 
   (OWS) and the Bridge

2. Run CloudKeyPrWebServiceClient as a web project (Right click on 
   The project -> Run as -> Server)
   This will display a UI with all type of webservice Request      
   posted by Keypr System

B. To run the Data Harvesting Service
1. Run DataHarvesterService Class under package    com.micros.harvester.service as a java application from the MicrosDataHarvester Project. (Right click on the DataHarvesterService Class -> Run as -> Java Application)

As soon as the Data Harvesting service is up Data will be uploaded in the database (keypr_bridge_db) in following tables room_details, room_details_upload, room_inventory and room_inventory_upload.

=====================================================================
Note: Make sure to start MicrosSimulatorPMS_OWS as mentioned above in Step A.1. Before starting DataHarvester.
=====================================================================

C. To run the Upload Service
1. Run UploadServiceRest as a web project (Right click on the 
   project -> Run as -> Server)
   It is the proxy for Keypr Upload webservice End points

2. Run the UploadServiceInitiater Class under package 
   com.cloudkey.upload.service as a java application from the  
   CloudKetHTUploadService Project. (Right click on the  
   UploadServiceInitiater Class -> Run as -> Java Application 
=====================================================================
Note: Make sure Step C.2 should follow C.1.
=====================================================================
3. Check the updated database, it will removed all the data from 
the upload tables room_details_upload, room_inventory_upload.









