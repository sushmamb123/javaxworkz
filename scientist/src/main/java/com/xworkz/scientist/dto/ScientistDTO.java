package com.xworkz.scientist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {
	@NotNull(message = "Name is not a null")
	@Size(min = 3, max = 20, message = "Name is min 3 and max 20")
	private String name;
	@NotNull(message = "Field is not a null")
	@Size(min = 3, max = 20, message = "Field is min 3 and max 20")
	private String field;
	@NotNull
	@Min(value = 1, message = "Experience is min 1")
	@Max(value = 10, message = "Experience is max 10")
	private Integer experience;
	@NotNull(message = "Country is not a null")
	@Size(min = 3, max = 20, message = "Country is min 3 and max 20")
	private String country;
	@NotNull(message = "Achievement is not a null")
	@Size(min = 3, max = 20, message = "Achievement is min 3 and max 20")
	private String achievement;

}
