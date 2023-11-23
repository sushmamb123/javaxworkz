package com.xworkz.cracker.constants;

public enum VendorGST {
	AMAZON("23GS3"),FLIPKART("65ABD3"),AJIO("89ASB3");
	
	private String gstNo;
	private VendorGST( String gstNo) {
		this.gstNo=gstNo;
		
	}
	public String getGstNo() {
		return gstNo;
	}

}
