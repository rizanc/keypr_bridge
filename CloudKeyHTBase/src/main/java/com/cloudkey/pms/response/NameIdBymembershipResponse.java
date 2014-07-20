package com.cloudkey.pms.response;

/*
 * This class hold information of name id.
 */
public class NameIdBymembershipResponse {
	
	private String nameId;
	private String status;
	private String result;
	
	public String getNameId() {
		
		return nameId;
	}
	public void setNameId(String nameId) {
		
		this.nameId = nameId;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		
		this.status = status;
	}
	public String getResult() {
		
		return result;
	}
	public void setResult(String result) {
		
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "NameIdBymembershipResponse [nameId=" + nameId + ", status="
				+ status + ", result=" + result + "]";
	}
	
}
