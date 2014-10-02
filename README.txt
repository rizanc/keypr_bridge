Keypr Bridge Environment Setup
============================================

A. Software Tools requirement
	* gradle 2.0+
	* jdk 1.7
	* jre 7.0
	* Maven 3+
	* IntelliJ or Eclipse, with lombok and scala plugins.

B. Steps to run the implementation:
	Pull https://github.com/Keypr/keypr_bridge.git using git.

	* CloudKeyHTBase: Home to the PMSInterface and request / response messages used to define it.

	* CloudKeyHTIds: Home to the enums used in the Base (pms-agnostic) messages.

	* CloudKeyHTJsonSchemaGenerator: Contains an application which automatically generates json schemas for java classes.

	* CloudKeyHTWebServices: A DropWizard application with REST services called by the KEYPR cloud. It is backed by
	    a PMS adapter implementing PMSInterface, Currently MicrosPMSAdapter's OperaOWSPMS.

	* CloudKeyJaxbSupport: Home to classes which enable the usage of Joda-Time date and time classes in generated JAXB
	    xml-bound pojos.

    * KeyprDropwizardSwagger: A wrapper module for dropwizard-swagger, which configures it to be compatible with Scala 2.11.

    * KeyprGuice: A wrapper module for Guice, which includes shared utility methods for working with Guice.

    * KeyprJacksonSupport: A module which provides a Guice-injectable ObjectMapper, preset with project-wide configuration.

    * KeyprScala: A module which provides in-house utilities for working with scala.

	* MicrosDataHarvester: Service which listens for updates to reservations from OXI,
	    and pushes new data to the upload endpoints.

	* MicrosIds: Contains all constants and enum mappings involved in the conversion from OWS/OXI to PMS-agnostic messages.

	* MicrosOWSCxfClient: Home to a Cxf (SOAP library) client for OWS. The java client services are auto-generated from the OWS wsdls.

	* MicrosOWSSupport: Provides a module for easy Guice-based injection of the OWSCxfClient SOAP interfaces. Includes tools for working with OWS data.

	* MicrosOXIJaxb: Home to the JAXB Java pojos auto-generated from the OXI xsds.

	* MicrosPMSAdapter: Backend for CloudKeyHTWebServices which obtains data from a Micros OPERA OWS server.

Project Distribution Instructions
============================================

The project contains two java applications to run:
	* CloudKeyHTWebServices
	* MicrosDataHarvester

Project Deployment Instructions
============================================

Project will be deployed and run as follows: 

A. Run "gradlew clean distTar (or distZip)"

B. Copy the .tar files in the build/distributions directories of the above projects.

C. Unextract them.

D. Start the applications using the scripts provided in each distribution's bin folder.
   The CloudKeyHTWebServices application takes the arguments "server configuration.yml" where configuration.yml
   is a real configuration file. See CloudKeyHTWebServices/configuration.yml for an example.
