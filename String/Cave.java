package com.xwork.String;

public class Cave {
	private String properties;
	private String types;
	private String features;
	private String elements;
	private String typesOfRock;
	private String caveLife;
	private String largestCave;
	private float range;
	private float width;
	private float height;

	public Cave(String properties, String types, String features, String elements, String typesOfRock, String caveLife,
			String largestCave, float range, float width, float height) {
		super();
		this.properties = properties;
		this.types = types;
		this.features = features;
		this.elements = elements;
		this.typesOfRock = typesOfRock;
		this.caveLife = caveLife;
		this.largestCave = largestCave;
		this.range = range;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Properties:" + this.properties + "Types:" + this.types + "Features:" + this.features + "Elements:"
				+ this.elements + "Types of Rock:" + this.typesOfRock + "CaveLife:" + this.caveLife + "LargestCave:"
				+ this.largestCave + "Range:" + this.range + "Width:" + this.width + "Height:" + this.height;
	}

}
