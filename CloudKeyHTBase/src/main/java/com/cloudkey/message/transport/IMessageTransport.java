package com.cloudkey.message.transport;




/**
 * This interface contains the method to transport the request and response between parser and property management system.
 * 
 * @author niveditat
 *
 */
public interface IMessageTransport {
	
	/*To transport the request to PMS */	
	public String handlePMSRequest(String pmsRequest);
	
}
