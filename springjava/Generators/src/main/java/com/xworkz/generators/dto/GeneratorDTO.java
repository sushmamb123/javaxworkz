package com.xworkz.generators.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class GeneratorDTO {
	@NotNull(message = "Generator name should not be null")
	@Size(max = 10,min = 3,message = "Name Should be max 10 and min 3")
	private String name;
	@NotNull(message = "Cost should be null")
	@Max(value = 10000,message = "Generator cost should be max 10000")
	@Min(value = 1000,message = "Generator cost should be min 1000")
	private Double cost;
	@NotNull(message = "Capacity should be null")
	@Max(value = 100,message = "Generator Capacity should be max 100")
	@Min(value = 10,message = "Generator Capacity should be min 10")
	private Float capacity;
	@NotNull(message = "Generator Fuel should not be null")
	@Size(max = 10,min = 3,message = "Fuel Should be max 10 and min 3")
	private String fuel;
	private boolean useage;

}
