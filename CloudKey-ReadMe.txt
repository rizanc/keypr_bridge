Keypr Bridge Environment Setup
---------------------------------------------------------------------------------------------------
1. Software Tools requirement
	* Eclipse Kepler IDE
	* jdk 1.7 
	* jre 7.0
	* Tomcat 7
	* MySQL 5.5
2. Steps to run the implementation:
a. Pull the following folders from git hub:
	* CloudKeyHTBase : it holds all the common classes
	* CloudKeyHTWebServices : Services that are called by keypr system
	* CloudKeyPrWebServiceClient: Client that is working like keypr system i.e. sending request and making webservice call
	* CloudKeyTestAdapter: Parser that acts as an interface between bridge and PMS.
	* CloudKeyHTUploadService: Service that has implementation to fetch the data from upload queue and push it to keypr webservice
	* MicrosDataHarvester: Harvesting service that will pull the data from OWS,compare the data in place and push it on upload queue.
	* MicrosPMSAdapter: Parser that converts the request into Request/Response xml for/from OWS.
	* MicrosSimulatorPMS_OWS: it act as OWS simulator that generates the responses corresponding to the request made from keypr.
	* UploadServiceRest: it behaves as proxy for keypr upload webservices endpoint and return response as ‘SUCCESS’/’FAIL’
	* database :

database\keypr.sql : contains database setup and includes dummy data insert statements and stored procedures that are called by adapter to fetch the data.
For Test Adapter
b. Run the script database\keypr_bridge_db.sql on Mysql Query Browser.
c. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in \CloudKeyTestAdapter\res\ 	adapterConfiguration.properties 
	* Create the adapter.jar of Project CloudKeyTestAdapter
	* Replace the adapter.jar in Project CloudKeyHTWebServices.

For DHS and Upload Service
database\keypr_bridge_db.sql: this script has a new db with room_details,room_details_upload, room_inventory, room_inventory_upload which are currently used by dataharvesting and upload service respectively.

b. Run the script database\keypr_bridge_db.sql on Mysql Query Browser.
c. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in \CloudKeyHTBase\res\ 	baseconfiguration.properties
	* Create the base.jar of Project CloudKeyHTBase 
	* Replace the base.jar in Project CloudKeyHTWebServices, MicrosSimulatorPMS_OWS, CloudKeyHTUploadService, MicrosDataHarvester, MicrosPMSAdapter, MicrosPMSAdapter, CloudKeyHTUploadService 








