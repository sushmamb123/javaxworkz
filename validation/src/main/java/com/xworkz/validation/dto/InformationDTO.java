package com.xworkz.validation.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class InformationDTO {
	@NotNull(message = "Name is not a null")
	@Size(min = 3, max = 20, message = "Name is min 3 and max 20")
	private String name;
	@Email
	@NotNull(message = "Email is not a null")
	@Size(min = 3, max = 20, message = "Email is min 3 and max 20")

	private String email;
	@NotNull(message = "MobileNo is not a null")
	@Max(value = 10, message = "MobileNo is max 10")
	@Min(value=3,message = "mmobile number is min 3")

	private Long mobileNo;
	@NotNull(message = "source is not a null")
	@Size(min = 3, max = 20, message = "Source is min 3 and max 20")
	private String source;
	@NotNull(message = "Destination is not a null")
	@Size(min = 3, max = 20, message = "Destination is min 3 and max 20")
	private String destination;
	@NotNull
	@Min(value = 3, message = "ticket is min 3")
	@Max(value = 10, message = "ticket is max 10")
	private Integer totalTickets;

}
