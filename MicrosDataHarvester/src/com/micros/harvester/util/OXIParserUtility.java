package com.micros.harvester.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.cloudkey.commons.Reservation;
import com.micros.harvester.logger.DataHarvesterLogger;

/**
 * This class contains the parser logic for reservation using xpath.
 * 
 * @author niveditat
 *
 */
public class OXIParserUtility {

/**
 * @param expression
 * @param document
 * @return
 * @throws XPathExpressionException
 */
	private NodeList retrieveNodeList(String expression , Document document) throws XPathExpressionException{

		XPath xPath =  XPathFactory.newInstance().newXPath();		
		NodeList nodeList = (NodeList) xPath.compile(expression).evaluate( document, XPathConstants.NODESET);	
		return nodeList;
	}



	/**
	 * This method accepts a reservation xml file, sent from the oxi. It parses the xml file and
	 * populate the instance of reservation. It returns an instance of reservation.
	 * 
	 * @param reservationFile
	 * @return
	 */
	public Reservation populateReservation ( File reservationFile) {

		DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Enter populateReservation method. ");

		Reservation objReservation = null;
		DocumentBuilderFactory dbFactory = null;
		DocumentBuilder docBuilder = null;

		StringBuffer objStringBuffer = null;
			
		String reservationType = "";
		String confirmationNumber = "";
		String roomNumber = null;
		String creditCardNumber = null;
		String reservationSource = null;
		String loyaltyNumber = null;
		
		String checkInDate = null;
		String stayLength = null;	
		String firstName = null;
		String lastName = null;
		String fullName = null;
		String expression = null;
		
		String hotelCode = "";
		String companyName = "";
		String address = "";
		String phoneNumber = "";
		String loyaltyProgram = "";
		String pmsId = "";
		int totalGuest = 0;
		
		String planCode = null;
		String amount = null;
		String timeUnitType = null;
		boolean isFirst= true;
		
		try {

			dbFactory = DocumentBuilderFactory.newInstance();
			docBuilder = dbFactory.newDocumentBuilder();
			objReservation = new Reservation();
			objStringBuffer = new StringBuffer();
			
			if (reservationFile.exists()) {

				Document document = docBuilder.parse( reservationFile ); 
						
				// Retrieving reservation type whether it is check in, check out or new.
				 expression = "/Reservation[@mfReservationAction]";
		
				NodeList nodeList = retrieveNodeList(expression, document );
				for (int i = 0; i < nodeList.getLength(); i++) {

					Node currentItem = nodeList.item(i);
					reservationType = currentItem.getAttributes().getNamedItem("mfReservationAction").getNodeValue();

				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " ReservationType :: " + reservationType);

				if( reservationType.equalsIgnoreCase( "ADD" )) {

					//generate confirmation number
				}
				else if( reservationType.equalsIgnoreCase( "CHECKOUT") || reservationType.equalsIgnoreCase( "CHECKIN" )) {

					expression = "/Reservation/confirmationID";
					nodeList = retrieveNodeList( expression,document);

					for (int i = 0; i < nodeList.getLength(); i++) {

						confirmationNumber = nodeList.item(i).getFirstChild().getNodeValue();
					}

					DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Confirmation Number :: " + confirmationNumber );
				}

				/*=======================================================================================*/
				// Retrieving room rates
				expression = "/Reservation/RoomStays/RoomStay/RatePlans/RatePlan";
				NodeList ratePlanList = retrieveNodeList(expression, document);

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Number of Rate Plans :: " + ratePlanList.getLength() );

				for( int k = 0; k < ratePlanList.getLength(); k++ ) {

					expression = expression + "/ratePlanCode" ;
					NodeList planCodeList = retrieveNodeList(expression, document);

					for (int i = 0; i < planCodeList.getLength(); i++) {

						planCode = planCodeList.item(i).getFirstChild().getNodeValue();

						DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Rate Plan Code:: " + planCode );

						expression = "/Reservation/RoomStays/RoomStay/RatePlans/RatePlan[ratePlanCode='"+planCode+"']/Rates ";

						String expr = expression + "/Rate";

						NodeList rateList = retrieveNodeList(expr, document);

						DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Number of Rate " + rateList.getLength() + " for plan code " + planCode );

						System.out.println("RateList Length is " + rateList.getLength());

						for(int len=0;len<rateList.getLength();len++)
						{
							String exprEx = expression+"/Rate['"+len+"']/Amount/valueNum";
							NodeList rateNode = retrieveNodeList(exprEx, document);

							
							String exprTime = expression+"/Rate['"+len+"']/TimeSpan/startTime";
							NodeList startTime = retrieveNodeList(exprTime, document);
							
							String  exprTimeUnits = expression+"/Rate['"+len+"']/TimeSpan/numberOfTimeUnits";
							NodeList timeUnits = retrieveNodeList(exprTimeUnits, document);
							
							
							if(isFirst){

								for(int t=0;t<rateNode.getLength();t++)
								{
									String value = rateNode.item(t).getFirstChild().getNodeValue();
									System.out.println("Amount is " + value);
									
									String start =startTime.item(t).getFirstChild().getNodeValue();
									System.out.println("StartTime " + start);
									
									String time =timeUnits.item(t).getFirstChild().getNodeValue();
									System.out.println("TimeUnits " + time);
									
									isFirst=false;
								}
							}

						}isFirst=true;


					}

				}

				/*=========================================================================================*/

				// Retrieving credit card number 
				expression = "/Reservation/ResCreditCards/ResCreditCard/profile/CreditCard/creditCardNumber";
				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					creditCardNumber = nodeList.item(i).getFirstChild().getNodeValue();
				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Credit card number :: " + creditCardNumber );
				
				// Retrieving room number
				expression = "Reservation/RoomStays/RoomStay/roomID";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					roomNumber = nodeList.item(i).getFirstChild().getNodeValue();
				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Room Number " + roomNumber);
				
				// Retrieving Reservation Source 
				expression = "/Reservation/reservationOriginatorCode";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					reservationSource = nodeList.item(i).getFirstChild().getNodeValue();
				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Reservation Source " + reservationSource);

			
				/*// Retrieving loyalty number
				expression = ("/Reservation/SelectedMemberships/SelectedMembership/accountID");

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					loyaltyNumber = nodeList.item(i).getFirstChild().getNodeValue();
				}
				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Loyalty Number " + loyaltyNumber);*/


				// Retrieving Comments of the Reservation
				expression = "/Reservation/ResComments/ResComment/comment";
   
				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					objStringBuffer.append(nodeList.item(i).getFirstChild().getNodeValue()).append(" ; ");
				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Message Retrieved is " + objStringBuffer);
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieving CheckIn, CheckOut and StayLength of the Guest        	
				expression = "/Reservation/StayDateRange/startTime";
				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					checkInDate = (nodeList.item(i).getFirstChild().getNodeValue());
				}

				expression = "/Reservation/StayDateRange/numberOfTimeUnits";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					stayLength = (nodeList.item(i).getFirstChild().getNodeValue());
				}

				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Check In Date  " + checkInDate);
				DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " StayLength " + stayLength);
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieving notes of the reservation 
				expression = "/Reservation/SpecialRequests/SpecialRequest/requestCode";
				String reqCode = "";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					reqCode = (nodeList.item(i).getFirstChild().getNodeValue());

					expression = "/Reservation/SpecialRequests/SpecialRequest[requestCode='"+reqCode+"']/requestComments";

					NodeList nodeList1 = retrieveNodeList( expression,document);
					for ( int j = 0; j < nodeList1.getLength(); j++) {

						String requestComment = "";
						String note = "";
						requestComment = (nodeList1.item(j).getFirstChild().getNodeValue());
						note = reqCode + "-" + requestComment;
						objStringBuffer.append(note).append(" ; ");
					}

				}
				
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Notes :: " + objStringBuffer);
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieve room code
				expression = "/Reservation/RoomStays/RoomStay/roomInventoryCode";
				String roomCode = "";

				NodeList nodeList1 = retrieveNodeList( expression,document);
				for ( int j = 0; j < nodeList1.getLength(); j++) {

					roomCode = (nodeList1.item(j).getFirstChild().getNodeValue());
				}

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Room code :: " + roomCode);

				//For Hotel Code.
				 expression = "/Reservation/HotelReference/hotelCode";
				System.out.println(expression);
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Hotel Code " );

				 nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing hotel code.

					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Hotel Code : "+ nodeList.item(index).getFirstChild().getNodeValue());
				}

				// End Hotel Code.

				//For  Reservation ID.

				expression = "/Reservation/reservationID";
				System.out.println(expression);
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating ReservationID " );

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing reservation id.

				    pmsId = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " ReswervationID : "+ pmsId);
//					objReservation.setId( pmsId );
					
				}

				// End ReservationID.
				
				//Loyalty Program.

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Loyalty Program. " );

				expression = "/Reservation/SelectedMemberships/SelectedMembership/programCode";
				System.out.println(expression);

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing loyalty program.
            
			        loyaltyProgram = nodeList.item(index).getFirstChild().getNodeValue();	
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Loyalty Program : "+ loyaltyProgram );
//					objReservation.setLoyaltyProgram( loyaltyProgram );
				}	

				//End Loyalty Program.


				// For Guest Count .

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Guest Count " );	
				expression = "/Reservation/GuestCounts/GuestCount/mfCount";   
				System.out.println(expression);
			
				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing guest count.

					System.out.println("Guest :"+nodeList.item(index).getFirstChild().getNodeValue() );

					int guestCount = Integer.parseInt( nodeList.item(index).getFirstChild().getNodeValue() );
					totalGuest = totalGuest + guestCount;		

				}
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Guest Count : "+ totalGuest );
				objReservation.setNumberOfGuests( totalGuest );

				// End Guest Count.

				// For Profile.

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Profile. " );
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Full Name. " );
				expression = "/Reservation/ResProfiles/ResProfile/Profile"; 
				String fNameExpression = expression.concat("/IndividualName/nameFirst");
				System.out.println(fNameExpression);

				// For first name.

				nodeList = retrieveNodeList(fNameExpression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing first name.

					firstName = nodeList.item(index).getFirstChild().getNodeValue();	
				}

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " First Name: "+ firstName);

				// End First Name.

				// For last Name.

				String	lNameExpression = expression.concat("/IndividualName/nameSur");	
				System.out.println( lNameExpression );
				nodeList = retrieveNodeList( lNameExpression , document );   
				for(int index = 0; index < nodeList.getLength(); index++){ // Traversing last name.

					lastName = nodeList.item(index).getFirstChild().getNodeValue();		
				}

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Last Name: "+ lastName);

				//End Last Name.

				// To set full name.
				if(firstName != null && firstName.length() > 0 && lastName != null && lastName.length() > 0){

					fullName = firstName.concat(lastName);
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Full Name: "+ fullName);

				}
				else if(firstName != null && firstName.length() > 0){

					fullName = firstName;
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Full Name: "+ fullName);
				}
				else if(lastName != null && lastName.length() > 0){

					fullName = lastName;
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Full Name: "+ fullName);
				}
				else {

					fullName = "";
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Full Name: "+ fullName);
				}
				
//               objReservation.setFullName(fullName);

				// To Traverse the address.

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Address. " );

				expression = "/Reservation/ResProfiles/ResProfile/Profile"; 
				String postalAddress = expression.concat("/PostalAddresses/PostalAddress");
				System.out.println(postalAddress);

				NodeList postAddreessNList = retrieveNodeList( postalAddress , document );
				System.out.println("Length"+postAddreessNList.getLength());

				for(int postalAddressNLen = 0 ; postalAddressNLen < postAddreessNList.getLength() ; postalAddressNLen ++){// Traverse Address.

					System.out.println("In loop for address.");

					String nodeType = postAddreessNList.item(postalAddressNLen).getAttributes().getNamedItem("addressType").getNodeValue();
					//objStringBuffer = new StringBuffer();

					for(int count = 1 ; count <= 4 ; count++){ // Traversing address.

						String addressExpression = expression.concat("/PostalAddresses/PostalAddress[@addressType='"+nodeType+"']/address"+count);
						System.out.println(addressExpression);

						nodeList = retrieveNodeList( addressExpression , document );
						for (int index = 0; index < nodeList.getLength(); index++) {// Traverse Postal Address.

							System.out.println("Postal Address " + nodeList.item(index).getFirstChild().getNodeValue());
							objStringBuffer.append( nodeList.item(index).getFirstChild().getNodeValue() +";" );		
						} // End  Postal Address.

					}

					String cityExpression = expression.concat("/PostalAddresses/PostalAddress[@addressType='"+nodeType+"']/city");
					System.out.println(cityExpression);
					nodeList = retrieveNodeList( cityExpression , document );

					for (int index = 0; index < nodeList.getLength(); index++) { // Traverse City.

						System.out.println("City " + nodeList.item(index).getFirstChild().getNodeValue());
						objStringBuffer.append( nodeList.item(index).getFirstChild().getNodeValue() +";" );	

						String postalExpression = expression.concat("/PostalAddresses/PostalAddress[@addressType='"+nodeType+"']/postalCode");
						NodeList  postalCNodeList = retrieveNodeList( postalExpression , document );

						for (int i = 0; i < postalCNodeList.getLength(); i++) { // Traverse Postal Code

							System.out.println("Postal Code " + postalCNodeList.item(i).getFirstChild().getNodeValue());
							objStringBuffer.append( postalCNodeList.item(i).getFirstChild().getNodeValue() +";" );	

						}// End Postal Code.


					}// End city.

					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Address "+ objStringBuffer.toString() );
					
//					objReservation.setAddress( objStringBuffer.toString() );
					objStringBuffer.delete(0, objStringBuffer.length());
					// End Address.

					// End Profile.

				} // End Address.

				// End Address.

				// For phone number.

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Phone Number " );

				String phoneExpression = "/PhoneNumbers/PhoneNumber/phoneNumber"; 
				System.out.println(phoneExpression);

				nodeList = retrieveNodeList(phoneExpression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing phone number.

					 phoneNumber = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Phone Number : "+ phoneNumber);
//			        objReservation.setPhoneNumber( phoneNumber );
				}		

				//End phone number.
				
				// For Company Name.
				
				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Iterating Company Name " );
				
				String companyExpression = expression.concat("/mfNationalName/companyName");				
	
				System.out.println(companyExpression);

				nodeList = retrieveNodeList(companyExpression , document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing loyalty program.

				     companyName = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Compnay Name: "+ companyName );
				}	
				
				//End Company Name.
				
				
			
               
			}
			else{

				DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " File Not Availabel. ");
			}

		}
		catch ( Exception exc ){

			DataHarvesterLogger.logError( DataUtility.class," populateReservation ", exc);
		}

		DataHarvesterLogger.logInfo( DataUtility.class," populateReservation ", " Exit populateReservation method. ");
		return objReservation;

	}
	
	
}
