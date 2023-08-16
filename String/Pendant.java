package com.xwork.String;

public class Pendant {
	private String material;
	private String design;
	private String shape;
	private String attachement;
	private String gemstones;
	private String symbolism;
	private String chaintype;
	private String occasion;
	private String setting;
	private String color;
	private String bail;
	private String culturalInfluence;

	public Pendant(String material, String design, String shape, String attachement, String gemstones, String symbolism,
			String chaintype, String occasion, String setting, String color, String bail, String culturalInfluence) {
		super();
		this.material = material;
		this.design = design;
		this.shape = shape;
		this.attachement = attachement;
		this.gemstones = gemstones;
		this.symbolism = symbolism;
		this.chaintype = chaintype;
		this.occasion = occasion;
		this.setting = setting;
		this.color = color;
		this.bail = bail;
		this.culturalInfluence = culturalInfluence;
	}

	@Override
	public String toString() {
		return "Material:" + this.material + "Design:" + this.design + "Shape:" + this.shape + "attachement:"
				+ this.attachement + "Gemstones:" + this.gemstones + "Symbolism:" + this.symbolism + "chaintype:"
				+ this.chaintype + "Occasion:" + this.occasion + "Setting:" + this.setting + "Colour:" + this.color
				+ "Bail:" + this.bail + "Cultural Influence:" + this.culturalInfluence;
	}

}
