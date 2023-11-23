package com.xworkz.cracker.dto;

import com.xworkz.cracker.constants.VendorGST;
import com.xworkz.cracker.constants.VendorSerialNo;

public class VendorDTO {
	private String name;
	private VendorGST gst;
	private VendorSerialNo no;
	public VendorDTO(String name, VendorGST gst, VendorSerialNo no) {
		super();
		this.name = name;
		this.gst = gst;
		this.no = no;
	}
	@Override
	public String toString() {
		return "VendorDTO [name=" + name + ", gst=" + gst + ", no=" + no + "]";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGst(VendorGST gst) {
		this.gst = gst;
	}
	public void setNo(VendorSerialNo no) {
		this.no = no;
	}

}
