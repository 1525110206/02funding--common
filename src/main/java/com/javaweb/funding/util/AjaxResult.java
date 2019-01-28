package com.javaweb.funding.util;

import com.javaweb.funding.vo.Data;

public class AjaxResult {
	
	private boolean success;
	
	private String message;
	
	private Page page;
	
	private Object data;	

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
}
