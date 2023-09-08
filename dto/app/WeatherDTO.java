package com.xwork.dto.app;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private String components;
	private String types;
	private int temperature;
	private boolean condition;

	public WeatherDTO() {
		System.out.println("invoking no_arg const in WeatherDTO");
	}

	public WeatherDTO(String components, String types, int temperature, boolean condition) {
		super();
		this.components = components;
		this.types = types;
		this.temperature = temperature;
		this.condition = condition;
	}
	

	@Override
	public String toString() {
		return "WeatherDTO [components=" + components + ", types=" + types + ", temperature=" + temperature
				+ ", condition=" + condition + "]";
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

}
