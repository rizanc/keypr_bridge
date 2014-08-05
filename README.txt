Keypr Bridge Environment Setup
============================================

A. Software Tools requirement
	* gradle 1.11+
	* jdk 1.7
	* jre 7.0
	* Tomcat 7
	* MySQL 5.5

B. Steps to run the implementation:
	Pull https://github.com/Keypr/keypr_bridge.git using git.

	* CloudKeyHTBase: it holds all the common classes.

	* CloudKeyHTWebServices: A DropWizard application with REST services called by the KEYPR cloud. It is backed by
	    a PMS adapter implementing IParserInterface, such as CloudKeyTestAdapter or MicrosPMSAdapter.

	* CloudKeyTestAdapter: An database-backed implementation of IParserInterface.

	* CloudKeyHTUploadService: Java application which pushes the data from the upload queue to the KEYPR cloud.

	* MicrosDataHarvester: Service which periodically pulls data from OWS and/or listens for updates from OXI,
	    and pushes new data to the upload tables.

	* MicrosPMSAdapter: Backend for CloudKeyHTWebServices which obtains data from a MICROS OPERA server via OWS.

	* MicrosSimulatorPMS_OWS: An simulator of the MICROS OPERA OWS web services.

	* UploadServiceRest: "It behaves as proxy for keypr upload
        webservices endpoint and return response as SUCCESS�/�FAIL�. As of now, we are using chrome application postman to push reservation data to the upload service."

        However it currently has just a few endpoints, all of which return a 200 response without causing any side-effects.
        These endpoints do not appear to be in use by any other module.
	
C. Database Setup:

For Database Set Up:
----------------------------------------------------------------
database\keypr_bridge_db.sql: this script has a new db "keypr_bridge_db".

It contains tables used by MicrosDataHarvesting and CloudKeyHTUploadService.
room_details,room_details_upload, room_inventory, room_inventory_upload,reservation_upload, reservation_room_rates_upload, reservation_room_allocation_upload

1. Run the script database\keypr_bridge_06062014.sql in mysql.
2. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in every place they are found

Project Distribution Instructions
============================================

The project contains three java applications to run:
	* CloudKeyHTWebServices
	* CloudKeyHTUploadService
	* MicrosDataHarvester


Project Deployment Instructions
============================================

Project will be deployed and run as follows: 

A. Update the database credentials in the above files,
   and update the hotel configuration in pms-adapter-configuration.properties

B. Run "gradle clean distTar (or distZip)"

C. Copy the .tar files in the build/distributions directories of the above projects.

D. Unextract them.

E. Start the applications using the scripts provided in each distribution's bin folder.
   The CloudKeyHTWebServices application takes the arguments "server configuration.yml" where configuration.yml
   is a real configuration file. See CloudKeyHTUploadService/configuration.yml for an example.

As soon as the Data Harvesting service is up Data will be uploaded in the database (keypr_bridge_db) in following tables room_details, room_details_upload, room_inventory and room_inventory_upload.

NOTE: Please ensure that the database (keypr_bridge_db) is already in placed.

F. Populate reservation data in the reservation upload queue tables. Open Chrome Browser add postman addons to it. Once done,
double click on postman to use the application. In the url paste http://localhost:9090/servlets/ORSInterface as of now, we suppose that osi server will be pushing the data at this url. 
On deployment, this port number and url can be changed in properties of MicrosDataHarvester/src/main/resources/configuration.properties file.

## OXI Listener Configuration
micros.pms.oxi.listener.url = /servlets/ORSInterface
micros.pms.oxi.listener.port = 9090

Make post request to the listener, after putting the reservation details in the request section by using send button. The listener should send success response to the postman. Now Check the reservation_upload, reservation_room_rates_upload and reservation_room_allocation_upload for the data sent by the reservation.
