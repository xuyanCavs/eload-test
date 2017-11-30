package com.eload.website.util;


public class JSONResult {

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private boolean success = true ;
	private String msg;
	
	public JSONResult(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public JSONResult(String msg) { 
		super();
		this.msg = msg;
	}

	public JSONResult() {
		super();
	}
													
	
}
