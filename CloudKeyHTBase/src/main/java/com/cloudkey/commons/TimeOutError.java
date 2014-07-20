package com.cloudkey.commons;

/**
 * This class represents the time out error sent by the keypr bridge 
 * when property management system is down.
 * 
 * @author vinayk2
 *
 */
public class TimeOutError {
	
	private String code = "";
	private String message = "";
	
	//Getter and Setter for each data member.
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "TimeOutError [code=" + code + ", message=" + message + "]";
	}

}
