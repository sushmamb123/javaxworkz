package com.xwork.String;

public class Karchief {
	private String madeUpOf;
	private String synonyms;
	private double price;
	private String color;
	private String inventorName;
	private String language;
	private String features;

	public Karchief(String madeUpOf, String synonyms, double price, String color, String inventorName, String language,
			String features) {
		super();
		this.madeUpOf = madeUpOf;
		this.synonyms = synonyms;
		this.price = price;
		this.color = color;
		this.inventorName = inventorName;
		this.language = language;
		this.features = features;
	}

	@Override
	public String toString() {
		return "MadeUpOf:" + this.madeUpOf + "Synonyms:" + this.synonyms + "Price:" + this.price + "Color:" + this.color
				+ "Inventor name:" + this.inventorName + "Language:" + this.language + "Features:" + this.features;
	}

}
