package com.xwork.String;

public class Logo {
	private String parts;
	private String aspects;
	private boolean identification;
	private String elements;
	private String types;

	public Logo(String parts, String aspects, boolean identification, String elements, String types) {
		super();
		this.parts = parts;
		this.aspects = aspects;
		this.identification = identification;
		this.elements = elements;
		this.types = types;
	}

	@Override
	public String toString() {
		return "Parts:" + this.parts + "Aspects:" + this.aspects + "Identification:" + this.identification + "Elements:"
				+ this.elements + "Types:" + this.types;
	}

}
