package com.xworkz.cracker.constants;

public enum MovieTicketGst {
	BALCONY("23GB3"),GANDHI_CLASS("34BAN");
	
	private String gst;
	private MovieTicketGst(String gst) {
		this.gst=gst;
	}
	
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}

}
