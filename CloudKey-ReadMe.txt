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
	* database : contains database setup and includes dummy data insert statements and stored procedures that are called by adapter to fetch the data.
b. Run the script database\keypr_db.sql on Mysql Query Browser.
c. if the data base credentials are not as follow :	
	username:root
	password:Chetu@123

	* Update the database credentials in \CloudKeyTestAdapter\res\ 	adapterConfiguration.properties 
	* Create the adapter.jar of Project CloudKeyTestAdapter
	* Replace the adapter.jar in Project CloudKeyHTWebServices.



