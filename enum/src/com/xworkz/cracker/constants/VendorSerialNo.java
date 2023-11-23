package com.xworkz.cracker.constants;

public enum VendorSerialNo {
	AMAZON(23),FLIPKART(65),AJIO(89);
	
	private Integer serialNo;
	
	private VendorSerialNo(Integer serialNo) {
		this.serialNo=serialNo;
	}
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}


}
