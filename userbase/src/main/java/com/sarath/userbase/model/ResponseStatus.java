package com.sarath.userbase.model;






public class ResponseStatus {
	
	public ResponseStatus(String timeStamp, int status, String error, String message) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseStatus [timeStamp=" + timeStamp + ", status=" + status + ", error=" + error + ", message="
				+ message + "]";
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public ResponseStatus() {
		super();
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String timeStamp;
	private int status;
	private String error;
	private String message;
	
	
	

	
	
	

}
