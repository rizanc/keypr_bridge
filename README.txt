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

	* CloudKeyHTWebServices: Services to be called by the KEYPR cloud.

	* CloudKeyPrWebServiceClient: An example CloudKeyHTWebServices client with a web front-end.

	* CloudKeyTestAdapter: An example PMS adapter. PMS adapters act as an interface between the bridge and a PMS system,
	    such as micros.

	* CloudKeyHTUploadService: Java application which pushes the data from the upload queue to the KEYPR cloud.

	* MicrosDataHarvester: Service which periodically pulls data from OWS, and pushes new data to the upload tables.

	* MicrosPMSAdapter: Parser which converts generic PMS requests/responses into/from OWS-specific xml.

	* MicrosSimulatorPMS_OWS: An OWS simulator that generates the responses corresponding to the request made from keypr.

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

	* Update the database credentials in every place they are found, which includes:
	  * CloudKeyHTBase/src/main/resources/log4j.xml
      * CloudKeyHTUploadService/src/main/resources/log4j.xml
      * CloudKeyHTWebServices/src/main/resources/log4j.xml
      * CloudKeyPrWebServiceClient/src/main/resources/log4j.xml
      * CloudKeyTestAdapter/src/main/resources/adapterConfiguration.properties
      * MicrosDataHarvester/src/main/resources/log4j.xml
      * MicrosOWSClient/src/main/resources/log4j.xml
      * MicrosPMSAdapter/src/main/resources/log4j.xml
      * MicrosSimulator_OXI/src/main/resources/log4j.xml
      * MicrosSimulatorPMS_OWS/src/main/resources/log4j.xml

	
Project Deployment Instructions
============================================

Project will be deployed and run as follows: 

A. Update the database credentials in the above files.

B. Run "gradle clean install"

C. Gather the built WARs. They are:
CloudKeyHTWebServices/build/libs/CloudKeyHTWebServices-${version}-SNAPSHOT.war
CloudKeyPrWebServiceClient/build/libs/CloudKeyPrWebServiceClient-${version}-SNAPSHOT.war
MicrosSimulatorPMS_OWS/build/libs/MicrosSimulatorPMS_OWS-${version}-SNAPSHOT.war

D. Deploy them to the Tomcat environment with the following Application Contexts:
CloudKeyHTWebServices
CloudKeyPrWebServiceClient
MicrosSimulatorPMS_OWS

E. Start the Tomcat Service and hit the following urls to confirm that war have been deployed at your tomcat.
/MicrosSimulatorPMS_OWS/
/CloudKeyHTWebServices/
/CloudKeyPrWebServiceClient/

F. Build a distribution of MicrosDataHarvester, by running "gradle distTar" or "gradle distZip".
   It is created in MicrosDataHarvester/build/distributions.

G. Install MicrosDataHarvester in the server environment. To run the application call bin/MicrosDataHarvester.

As soon as the Data Harvesting service is up Data will be uploaded in the database (keypr_bridge_db) in following tables room_details, room_details_upload, room_inventory and room_inventory_upload.

NOTE: Please ensure that the database (keypr_bridge_db) is already in placed.

H. Populate reservation data in the reservation upload queue tables. Open Chrome Browser add postman addons to it. Once done,
double click on postman to use the application. In the url paste http://localhost:9090/servlets/ORSInterface as of now, we suppose that osi server will be pushing the data at this url. 
On deployment, this port number and url can be changed in properties of MicrosDataHarvester/src/main/resources/configuration.properties file.

## OXI Listener Configuration
micros.pms.oxi.listener.url = /servlets/ORSInterface
micros.pms.oxi.listener.port = 9090

Make post request to the listener, after putting the reservation details in the request section by using send button. The listener should send success response to the postman. Now Check the reservation_upload, reservation_room_rates_upload and reservation_room_allocation_upload for the data sent by the reservation.

============================================
Note: Make sure to start MicrosSimulatorPMS_OWS as mentioned above in Step G Before starting DataHarvester.
============================================

I. To run the Upload Service for development purpose, call "gradle run" in the CloudKeyHTUploadService directory.
   To run it in production, create a distribution (distZip or distTar) and install that on the target environment.

============================================
Note: Make sure Step I should follow G
============================================

J. Check the updated database, it will removed all the data from 
the upload tables room_details_upload, room_inventory_upload,reservation_upload,reservation_room_rates_upload and reservtion_room_allocation_upload.

K. Make Web Service call by hitting url:
    /CloudKeyPrWebServiceClient/ and check for the response, which is expected from micros pms ends.
