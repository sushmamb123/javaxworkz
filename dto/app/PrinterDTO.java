package com.xwork.dto.app;

import java.io.Serializable;

public class PrinterDTO implements Serializable {
	private int speed;
	private String name;
	private String features;
	private boolean use;

	public PrinterDTO() {
		System.out.println("invoking no-arg const in printerDTO");
	}

	public PrinterDTO(int speed, String name, String features, boolean use) {
		super();
		this.speed = speed;
		this.name = name;
		this.features = features;
		this.use = use;
	}

	@Override
	public String toString() {
		return "PrinterDTO [speed=" + speed + ", name=" + name + ", features=" + features + ", use=" + use + "]";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public boolean isUse() {
		return use;
	}

	public void setUse(boolean use) {
		this.use = use;
	}

}
