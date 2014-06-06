Keypr Bridge Environment Setup
============================================

A. Software Tools requirement
	* Eclipse Kepler IDE
	* jdk 1.7 
	* jre 7.0
	* Tomcat 7
	* MySQL 5.5
B. Steps to run the implementation:
	Pull the following folders from git hub:

     * CloudKeyHT: it holds ant build file build.xml to create jars of required application component and place it as per their defined dependencies in the project. It makes war files of each web application of the project and places them in webapps folder of tomcat.

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
        webservices endpoint and return response as SUCCESS’/’FAIL’. As of now, we are using chrome application postman to push reservation data to the upload service.
	
C. Database Setup:
   Pull the database folder from git hub.

For DataBase Set Up:
----------------------------------------------------------------
database\keypr_bridge_db.sql: this script has a new db ‘keypr_bridge_db’ with room_details,room_details_upload, room_inventory, room_inventory_upload,reservation_upload, reservation_room_rates_upload, reservation_room_allocation_upload tables which are currently used by dataharvesting and upload service respectively.

1. Run the script database\keypr_bridge_06062014.sql on Mysql Query 
   Browser.
2. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in \CloudKeyHTBase\res\ 	  	  baseconfiguration.properties	
	
Project Deployment Instructions
============================================

Project will be deployed and run as follows: 

A. Update the database credentials in the       baseconfiguration.properties file, which is at res folder of project "CloudKeyHTBase".

B. Update the Environment variable property TOMCAT_HOME to have the reference to the home folder of Apache Tomcat. This environment variable is used by the web applications ant build file to place the war file in the webapps folder of Tomcat. If this environment variable is not set, then we will not be able to put war files in required folder.

C. Browse to build.xml file of project CloudKeyHT. Right Click on build.xml file , either select run as Ant Build options from the pop up menu or Select External Tools configurations. It display a new window. From tabbed pane choose target as "run-all-services" as to execute and then click on run button. 

D. Check message on console, It should display "BUILD SUCCESSFUL" for successful completion of build process.

E. Check for the war files in the webapps folder of tomcat. It should contains following war files: 
CloudKeyHTWebServices.war
CloudKeyPrWebServiceClient.war
MicrosSimulatorPMS_OWS.war

F. Start the Tomcat Service and hit the following urls to confirm that war have been deployed at your tomcat.

http://localhost:8080/MicrosSimulatorPMS_OWS/
http://localhost:8080/CloudKeyHTWebServices/
http://localhost:8080/CloudKeyPrWebServiceClient/

G. Run DataHarvesterService Class under package    com.micros.harvester.service as a java application from the MicrosDataHarvester Project. (Right click on the DataHarvesterService Class -> Run as -> Java Application)

As soon as the Data Harvesting service is up Data will be uploaded in the database (keypr_bridge_db) in following tables room_details, room_details_upload, room_inventory and room_inventory_upload.

NOTE: Please ensure that the database (keypr_bridge_db) is already in placed.

H. Populate reservation data in the reservation upload queue tables. Open Chrome Browser add postman addons to it. Once done,
double click on postman to use the application. In the url paste http://localhost:9090/servlets/ORSInterface as of now, we suppose that osi server will be pushing the data at this url. 
On deployment , this port number and url can be changed by properties of configuration.properties file of res folder of MicrosDataHarvester project in section 

## OXI Listener Configuration
micros.pms.oxi.listener.url = /servlets/ORSInterface
micros.pms.oxi.listener.port = 9090

Make post request to the listener, after putting the reservtion datain the request section by using send button. The listener should send success response to the postman. Now Check the reservation_upload, reservation_room_rates_upload and reservation_room_allocation_upload for the data sent by the reservation.

============================================
Note: Make sure to start MicrosSimulatorPMS_OWS as mentioned above in Step G Before starting DataHarvester.
============================================

I. To run the Upload Service
   Run the UploadServiceInitiater Class under package 
   com.cloudkey.upload.service as a java application from the  
   CloudKetHTUploadService Project. (Right click on the  
   UploadServiceInitiater Class -> Run as -> Java Application 

============================================
Note: Make sure Step I should follow G
============================================

J. Check the updated database, it will removed all the data from 
the upload tables room_details_upload, room_inventory_upload,reservation_upload,reservation_room_rates_upload and reservtion_room_allocation_upload.

K. Make Web Service call by hitting url:
    http://localhost:8080/CloudKeyPrWebServiceClient/ and check for the response, which is expected from micros pms ends.

Build.xml – This is an integrated build file having targets to references other build files used in the keypr bridge application. The file basically performs many operations, which can be enumerated as:
Ø	Creates jar file of project CloudKeyBase and injects the jar file in its dependents projects as CloudKeyHTWebService, CloudKeyPrWebServices, UploadServiceRest, CloudKeyHTUploadService, MicrosPMSAdapter,MicrosSimulatorPMS_OWS and MicrosDataHarvester.
Ø	Creates jar of MicrosPMSAdapter and pushes the jar file in its dependents projects as CloudKeyHTWebServices and MicrosDataHarvester.
Ø	Creates war of MicrosSimulatorPMS_OWS  as  “MicrosSimulatorPMS_OWS. War” project and places its war file in the webapps folder of tomcat.
Ø	Creates war of CloudKeyPrWebServiceClient as “CloudKeyPrWebServiceClient.war” and place its war file in webapps folder of tomcat.
Ø	Create war of CloudKeyHTWebServices as “CloudKeyHTWebServices. War” and place its war files in the webapps folder of tomcat.
This build file is dependent on following build files:
a)	Base-build.xml of CloudKeyHTBase project.
b)	Upload-service-build.xml of CloudKeyHTUploadService project.
c)	Keypr-webservice-build.xml of CloudKeyHTWebServices.
d)	Keypr-client.build.xml of CloudKeyPrWebServiceClient.
e)	DHS-build.xml of MicrsoDataHarvester.
f)	Micros-adapter-build.xml of MicrosPMSAdapter.
g)	Ows-simulator-build.xml of MicrosSimulatorPMS_OWS.


======================================================
Note : To run ANT build file on Ubuntu machine
======================================================

L. ANT build file will be run on command line of Ubuntu Machine as follows.

a) Set  followings environment variableS

    1.TOMCAT_HOME
    2.ANT_HOME 
    3.JAVA_HOME 
  
  Environment variable to their home folder as 

    TOMCAT_HOME= <path>

    Command:-
    root@Cloudkey-HT:~# export TOMCAT_HOME=<path>

    ANT_HOME = <"path">

    COMMAND:-
    root@Cloudkey-HT:~# export ANT_HOME = <path>
   
    JAVA_HOME=<path>

    Command:-
    root@Cloudkey-HT:~# export JAVA_HOME=<path>

b) To ensure all environment variables have been set, run command ant -version. It should display the vesion of the ANT API.

c) update build.properties file of project Cloudkey-HT as follows.

     cloudKey.base.path = <path>/CloudKeyHTBase
     cloudkey.pms.adapter.path = <path> /MicrosPMSAdapter
     cloudKey.keypr.client.path = <path>/CloudKeyPrWebServiceClient
     cloudkey.keypr.webservice.path = <path>/CloudKeyHTWebServices
     pms.simulator.ows.path = <path>/MicrosSimulatorPMS_OWS
     pms.simulator.oxi.path = <path>/MicrosSimulator_OXI
     cloudKey.upload.service.path = <path>/CloudKeyHTUploadService
     cloudkey.data.harvest.path=<path>/MicrosDataHarvester


d) Run ant buid file on command line as follows.

   COMMAND:-
     ant -buildfile build.xml
    









