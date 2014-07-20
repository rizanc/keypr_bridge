package com.cloudkey.pms.request;

/**
 *This class is used to send the request parameters for Guest Memebership.
 * 
 * @author
 */
public class GuestMembershipsRequest {
	
	private String nameId;

	public String getNameId() { 
		
		return nameId;
	}

	public void setNameId(String nameId) {
		
		this.nameId = nameId;
	}

	@Override
	public String toString() {
		
		return "GuestMembershipsRequest [nameId=" + nameId + "]";
	}
	
}
