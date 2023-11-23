package com.xworkz.cracker.constants;

public enum ExceptionCode {
	
	RUNTIME("1/0","ARITHMETIC EXCEPTION"),COMPILE_TIME("CLASS GROCERY","CLASSNOTFOUND EXCEPTION");
	
	private String code;
	private String msg;
	
	private ExceptionCode(String code,String msg) {
		this.code=code;
		this.msg=msg;
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
	
	
			

}
