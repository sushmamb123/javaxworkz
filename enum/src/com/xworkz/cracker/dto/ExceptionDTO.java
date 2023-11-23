package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.ExceptionCode;

public class ExceptionDTO {
	private ExceptionCode exceptionCode;
	private String code;
	private String msg;
	public ExceptionDTO(ExceptionCode exceptionCode, String code, String msg) {
		super();
		this.exceptionCode = exceptionCode;
		this.code = code;
		this.msg = msg;
	}
	public ExceptionCode getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(ExceptionCode exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ExceptionDTO [exceptionCode=" + exceptionCode + ", code=" + code + ", msg=" + msg + "]";
	}
	
	

}
