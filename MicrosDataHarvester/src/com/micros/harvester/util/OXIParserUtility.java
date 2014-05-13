package com.micros.harvester.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.commons.RoomType;
import com.micros.harvester.constant.IMicrosHarvester;
import com.micros.harvester.logger.DataHarvesterLogger;
import com.micros.pms.constant.IMicrosConstants;

/**
 * This class contains the parser logic for reservation using xpath.
 * 
 * @author niveditat
 *
 */
public class OXIParserUtility {

	/**
	 * * This method accept xpath expression and reference of xml document. It returns the list 
	 * of nodes satisfying the criteria of xpath expression.
	 * 
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

		DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Enter populateReservation method. ");

		ReservationRoomAllocation objRoomAllocation = null ;
		Reservation objReservation = null;
		List<ReservationRoomAllocation> obRoomAllocationsList = null;
		List<RoomRate> obRoomRatesList = null;
		RoomRate objRoomRate = null;
		RoomType objRoomType = null;

		DocumentBuilderFactory dbFactory = null;
		DocumentBuilder docBuilder = null;

		StringBuffer objStringBuffer = null;

		String reservationAction = "";
		String confirmationNumber = "";
		String roomNumber = "";
		String creditCardNumber = "";
		String reservationSource = "";
		String loyaltyNumber = "";

		String checkInDate = "";
		String stayLength = "";	
		String firstName = "";
		String lastName = "";
		String fullName = "";
		String expression = "";

		String hotelCode = "";
		String companyName = "";
		String address = "";
		String phoneNumber = "";
		String loyaltyProgram = "";
		String pmsId = "";
		String email = "";
		int totalGuest = 0;

		String planCode = "";
		String reservationStatusType = "";
//		String amount = "";
//		String timeUnitType = "";
		boolean isFirst= true;

		try {

			dbFactory = DocumentBuilderFactory.newInstance();
			docBuilder = dbFactory.newDocumentBuilder();
			objReservation = new Reservation();
			objRoomAllocation = new ReservationRoomAllocation();
			obRoomRatesList = objRoomAllocation.getRoomRateList();
			obRoomAllocationsList = new ArrayList<ReservationRoomAllocation>(); 
			objRoomType = new RoomType();
			objStringBuffer = new StringBuffer();

			if (reservationFile.exists()) {

				Document document = docBuilder.parse( reservationFile ); 

				// Retrieving reservation type whether it is check in, check out or new.
				expression = "/Reservation[@mfReservationAction]";

				NodeList nodeList = retrieveNodeList(expression, document );
				for (int i = 0; i < nodeList.getLength(); i++) {

					Node currentItem = nodeList.item(i);
					reservationAction = currentItem.getAttributes().getNamedItem("mfReservationAction").getNodeValue();

				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " ReservationType :: " + reservationAction);

				/*if( reservationAction.equalsIgnoreCase( "ADD" )) {*/
				if( reservationAction.equalsIgnoreCase( IMicrosHarvester.RESERVATION_TYPE_NEW )) {

					//generate confirmation number
				}
			/*	else if( reservationAction.equalsIgnoreCase( "CHECKOUT") || reservationAction.equalsIgnoreCase( "CHECKIN" )) {*/
				else if( reservationAction.equalsIgnoreCase( IMicrosHarvester.RESERVATION_TYPE_CHECK_IN) || reservationAction.equalsIgnoreCase( IMicrosHarvester.RESERVATION_TYPE_CHECK_OUT )) {

					expression = "/Reservation/confirmationID";
					nodeList = retrieveNodeList( expression,document);

					for (int i = 0; i < nodeList.getLength(); i++) {

						confirmationNumber = nodeList.item(i).getFirstChild().getNodeValue();
					}

					DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Confirmation Number :: " + confirmationNumber );
				}

				// Retrieving room rates
				expression = "/Reservation/RoomStays/RoomStay/RatePlans/RatePlan";
				NodeList ratePlanList = retrieveNodeList(expression, document);

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Number of Rate Plans :: " + ratePlanList.getLength() );

				for( int k = 0; k < ratePlanList.getLength(); k++ ) {
					  
					expression = expression + "/ratePlanCode" ;
					NodeList planCodeList = retrieveNodeList(expression, document);

					for (int i = 0; i < planCodeList.getLength(); i++) {

						planCode = planCodeList.item(i).getFirstChild().getNodeValue();
						
						DataHarvesterLogger.logInfo( DataUtility.class, " populateReservation ", " Rate Plan Code:: " + planCode );

						expression = "/Reservation/RoomStays/RoomStay/RatePlans/RatePlan[ratePlanCode='"+planCode+"']/Rates ";

						String expr = expression + "/Rate";

						NodeList rateList = retrieveNodeList(expr, document);

						DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Number of Rate " + rateList.getLength() + " for plan code " + planCode );

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

								for(int arrayIndex=0;arrayIndex<rateNode.getLength();arrayIndex++)
								{
									 objRoomRate = new RoomRate();
									 objRoomRate.setPlanCode( planCode );
									 
									String value = rateNode.item(arrayIndex).getFirstChild().getNodeValue();
									objRoomRate.setBaseAmount(Double.parseDouble(value));
									System.out.println("Amount is " + value);

									String start =startTime.item(arrayIndex).getFirstChild().getNodeValue();
									objRoomRate.setEffectiveDate(start);
									System.out.println("StartTime " + start);

									int time =Integer.parseInt(timeUnits.item(arrayIndex).getFirstChild().getNodeValue());
                                     System.out.println("TimeUnits " + time);
                                     
                                     objRoomRate.setExpirationDate(DataUtility.getEndDate(start, time ,"DAY"));
                                     
                                     obRoomRatesList.add( objRoomRate );
                                     
									 isFirst=false;
								}
							}

						}isFirst=true;


					}
					
					
				}

				// Retrieving credit card number 
				expression = "/Reservation/ResCreditCards/ResCreditCard/profile/CreditCard/creditCardNumber";
				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					creditCardNumber = nodeList.item(i).getFirstChild().getNodeValue();
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Credit card number :: " + creditCardNumber );

				// Retrieving reservationStatusType whether it is reserved, check in or canceled...
				expression = "Reservation/RoomStays/RoomStay[@reservationStatusType]";

				 nodeList = retrieveNodeList(expression, document );
				for (int i = 0; i < nodeList.getLength(); i++) {

					Node currentItem = nodeList.item(i);
					reservationStatusType = currentItem.getAttributes().getNamedItem("reservationStatusType").getNodeValue();
                     objRoomAllocation.setReservationStatusType(reservationStatusType);
				}
				
				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Room Stay Status Type " + reservationStatusType);
				
				// Retrieving room number
				expression = "Reservation/RoomStays/RoomStay/roomID";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					roomNumber = nodeList.item(i).getFirstChild().getNodeValue();
					objRoomAllocation.setRoomNo(Integer.parseInt(roomNumber));
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Room Number " + roomNumber);

				// Retrieving Reservation Source 
				expression = "/Reservation/reservationOriginatorCode";

				nodeList = retrieveNodeList( expression,document);

				for (int i = 0; i < nodeList.getLength(); i++) {

					reservationSource = nodeList.item(i).getFirstChild().getNodeValue();
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Reservation Source " + reservationSource);


				// Retrieving loyalty number
				expression = ("/Reservation/SelectedMemberships/SelectedMembership/accountID");

				nodeList = retrieveNodeList( expression,document);

				for (int index = 0; index < nodeList.getLength(); index++) {

					loyaltyNumber = nodeList.item(index).getFirstChild().getNodeValue();
				}
				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Loyalty Number " + loyaltyNumber);


				// Retrieving Comments of the Reservation
				expression = "/Reservation/ResComments/ResComment/comment";

				nodeList = retrieveNodeList( expression,document);

				for (int index = 0;index < nodeList.getLength();index++) {

					objStringBuffer.append(nodeList.item(index).getFirstChild().getNodeValue()).append(" ; ");
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Message Retrieved is " + objStringBuffer);
				objReservation.setNotes(objStringBuffer.toString());
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieving CheckIn, CheckOut and StayLength of the Guest        	
				expression = "/Reservation/StayDateRange/startTime";
				nodeList = retrieveNodeList( expression,document);

				for (int index = 0; index < nodeList.getLength(); index++) {

					checkInDate = (nodeList.item(index).getFirstChild().getNodeValue());
				}

				expression = "/Reservation/StayDateRange/numberOfTimeUnits";

				nodeList = retrieveNodeList( expression,document);

				for (int index = 0; index < nodeList.getLength(); index++) {

					stayLength = (nodeList.item(index).getFirstChild().getNodeValue());
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " Check In Date  " + checkInDate);
				DataHarvesterLogger.logInfo( OXIParserUtility.class, " populateReservation ", " StayLength " + stayLength);
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieving notes of the reservation 
				expression = "/Reservation/SpecialRequests/SpecialRequest/requestCode";
				String reqCode = "";

				nodeList = retrieveNodeList( expression,document);

				for (int index = 0;index < nodeList.getLength(); index++) {

					reqCode = (nodeList.item(index).getFirstChild().getNodeValue());

					expression = "/Reservation/SpecialRequests/SpecialRequest[requestCode='"+reqCode+"']/requestComments";

					NodeList nodeList1 = retrieveNodeList( expression,document);
					for ( int len = 0; len < nodeList1.getLength(); len++) {

						String requestComment = "";
						String note = "";
						requestComment = (nodeList1.item(len).getFirstChild().getNodeValue());
						note = reqCode + "-" + requestComment;
						objStringBuffer.append(note).append(" ; ");
					}

				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Notes :: " + objStringBuffer);
				objReservation.setMessage( objStringBuffer.toString() );
				objStringBuffer.delete(0, objStringBuffer.length());

				// Retrieve room code
				expression = "/Reservation/RoomStays/RoomStay/roomInventoryCode";
				String roomCode = "";

				NodeList nodeList1 = retrieveNodeList( expression,document);
				for ( int index = 0; index < nodeList1.getLength(); index++) {

					roomCode = (nodeList1.item(index).getFirstChild().getNodeValue());
					objRoomType.setCode( roomCode );
					objRoomAllocation.setRoomType( objRoomType );
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Room code :: " + roomCode);

				//For Hotel Code.
				expression = "/Reservation/HotelReference/hotelCode";
				System.out.println(expression);
				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Hotel Code " );

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing hotel code.
					
					hotelCode = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Hotel Code : "+ hotelCode);
					
				}

				// End Hotel Code.

				//For  Reservation ID.

				expression = "/Reservation/reservationID";
				System.out.println(expression);
				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating ReservationID " );

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing reservation id.

					pmsId = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " ReswervationID : "+ pmsId);
					//					objReservation.setId( pmsId );

				}

				// End ReservationID.

				//Loyalty Program.

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Loyalty Program. " );

				expression = "/Reservation/SelectedMemberships/SelectedMembership/programCode";
				System.out.println(expression);

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing loyalty program.

					loyaltyProgram = nodeList.item(index).getFirstChild().getNodeValue();	
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Loyalty Program : "+ loyaltyProgram );
					//					objReservation.setLoyaltyProgram( loyaltyProgram );
				}	

				//End Loyalty Program.


				// For Guest Count .

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Guest Count " );	
				expression = "/Reservation/GuestCounts/GuestCount/mfCount";   
				System.out.println(expression);

				nodeList = retrieveNodeList(expression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing guest count.

					System.out.println("Guest :"+nodeList.item(index).getFirstChild().getNodeValue() );

					int guestCount = Integer.parseInt( nodeList.item(index).getFirstChild().getNodeValue() );
					totalGuest = totalGuest + guestCount;		

				}
				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Guest Count : "+ totalGuest );
				objReservation.setNumberOfGuests( totalGuest );

				// End Guest Count.

				// For Profile.

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Profile. " );
				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Full Name. " );
				expression = "/Reservation/ResProfiles/ResProfile/Profile"; 
				String fNameExpression = expression.concat("/IndividualName/nameFirst");

				// For first name.

				nodeList = retrieveNodeList(fNameExpression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing first name.

					firstName = nodeList.item(index).getFirstChild().getNodeValue();	
					objReservation.setFirstName( firstName );
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " First Name: "+ firstName);

				// End First Name.

				// For last Name.

				String	lNameExpression = expression.concat("/IndividualName/nameSur");	
				System.out.println( lNameExpression );
				nodeList = retrieveNodeList( lNameExpression , document );   
				for(int index = 0; index < nodeList.getLength(); index++){ // Traversing last name.

					lastName = nodeList.item(index).getFirstChild().getNodeValue();		
					objReservation.setLastName( lastName );
				}

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Last Name: "+ lastName);

				//End Last Name.

				// To set full name.
				if(firstName != null && firstName.length() > 0 && lastName != null && lastName.length() > 0){

					fullName = firstName.concat(lastName);
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Full Name: "+ fullName);

				}
				else if(firstName != null && firstName.length() > 0){

					fullName = firstName;
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Full Name: "+ fullName);
				}
				else if(lastName != null && lastName.length() > 0){

					fullName = lastName;
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Full Name: "+ fullName);
				}
				else {

					fullName = "";
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Full Name: "+ fullName);
				}

				//               objReservation.setFullName(fullName);

				// To Traverse the address.

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Address. " );

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

							objStringBuffer.append( nodeList.item(index).getFirstChild().getNodeValue() +";" );		
						} // End  Postal Address.

					}

					String cityExpression = expression.concat("/PostalAddresses/PostalAddress[@addressType='"+nodeType+"']/city");
					System.out.println(cityExpression);
					nodeList = retrieveNodeList( cityExpression , document );

					for (int index = 0; index < nodeList.getLength(); index++) { // Traverse City.

						objStringBuffer.append( nodeList.item(index).getFirstChild().getNodeValue() +";" );	

						String postalExpression = expression.concat("/PostalAddresses/PostalAddress[@addressType='"+nodeType+"']/postalCode");
						NodeList  postalCNodeList = retrieveNodeList( postalExpression , document );

						for (int i = 0; i < postalCNodeList.getLength(); i++) { // Traverse Postal Code

							objStringBuffer.append( postalCNodeList.item(i).getFirstChild().getNodeValue() +";" );	

						}// End Postal Code.


					}// End city.

					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Address "+ objStringBuffer.toString() );

					address =  objStringBuffer.toString() ;
					objStringBuffer.delete(0, objStringBuffer.length());
					// End Address.

					// End Profile.

				} // End Address.

				// End Address.

				// For phone number.

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Phone Number " );

				String phoneExpression = expression.concat("/PhoneNumbers/PhoneNumber/phoneNumber"); 

				nodeList = retrieveNodeList(phoneExpression ,document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing phone number.

					phoneNumber = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Phone Number : "+ phoneNumber);
					//			        objReservation.setPhoneNumber( phoneNumber );
				}		

				//End phone number.

				// For Company Name.

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Iterating Company Name " );

				String companyExpression = expression.concat("/mfNationalName/companyName");				

				System.out.println(companyExpression);

				nodeList = retrieveNodeList(companyExpression , document );
				for (int index = 0; index < nodeList.getLength(); index++) { // Traversing loyalty program.

					companyName = nodeList.item(index).getFirstChild().getNodeValue();
					DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Compnay Name: "+ companyName );
				}	
				//End Company Name
				
				// To retrieve email address of guest
				
				String emailExpr = "/Reservation/ResProfiles/Profile";
				NodeList profileNodeList = retrieveNodeList(emailExpr, document);
				
				for( int len = 0; len< profileNodeList.getLength() ; len++ ){
					
					String electronicAddrExpr = "/Reservation/ResProfiles/Profile['"+len+"']/ElectronicAddresses/ElectronicAddress";
					NodeList electronicAddressList = retrieveNodeList(electronicAddrExpr, document);
					
					for( int addlen = 0; addlen < electronicAddressList.getLength(); addlen++ ){
						
						String emailExp = "/Reservation/ResProfiles/Profile['"+len+"']/ElectronicAddresses/ElectronicAddress['"+addlen+"']/eAddress/description/version6/email";
						NodeList emailList = retrieveNodeList(emailExp, document);
						
						for(int leng = 0; leng < emailList.getLength(); leng++ ){
							
						 email = emailList.item(leng).getFirstChild().getNodeValue();
						 DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Email is :: "+ email );
						 
						}
					}
					
				}

				// Populate reservation instance with oxi reservation data.
				  objReservation.setAffilateId(IMicrosHarvester.OXI_AFFILATE_ID);
				  objReservation.setReservationAction(reservationAction);
				objReservation.setConfirmationNumber( confirmationNumber );                                             
				objReservation.setCreditCardNumber( creditCardNumber );
				objReservation.setReservationSource( reservationSource );
				objReservation.setLoyaltyNumber( loyaltyNumber );
				objReservation.setCheckinDate( checkInDate );
				objReservation.setCheckoutDate(DataUtility.getEndDate(checkInDate,Integer.parseInt(stayLength) , "DAY"));
				objReservation.setStayLength(Integer.parseInt(stayLength));
				objReservation.setPmsId( pmsId );
				objReservation.setLoyaltyProgram( loyaltyProgram );
				objReservation.setNumberOfGuests( totalGuest );
				objReservation.setFullName( fullName );
				objReservation.setAddress( address );System.out.println("Address Set is " + objReservation.getAddress());
				objReservation.setPhoneNumber( phoneNumber );
				objReservation.setCompany( companyName );
				objRoomAllocation.setRoomRateList(obRoomRatesList);					
				obRoomAllocationsList.add(objRoomAllocation);
				objReservation.setReservationRoomAllocationList(obRoomAllocationsList);
				objReservation.setEmail(email);

			}
			else {

				DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " File Not Availabel. ");
			}

		}
		catch ( Exception exc ){

			DataHarvesterLogger.logError( OXIParserUtility.class," populateReservation ", exc);
		}

		DataHarvesterLogger.logInfo( OXIParserUtility.class," populateReservation ", " Exit populateReservation method. ");
		
		return objReservation;

	}


}
