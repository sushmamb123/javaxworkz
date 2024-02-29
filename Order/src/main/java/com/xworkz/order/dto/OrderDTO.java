package com.xworkz.order.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class OrderDTO {
	@NotNull(message = "Customer is not a null")
	@Size(min = 3, max = 20, message = "Name is min 3 and max 20")
	private String customer;
	@Email
	@NotNull(message = "Email is not a null")
	@Size(min = 3, max = 20, message = "Name is min 3 and max 20")
	private String email;
	@NotNull(message = "Flavour is not a null")
	@Size(min = 3, max = 20, message = "Name is min 3 and max 20")
	private String flavour;
	@NotNull
	@Min(value = 2, message = "weight is min 2")
	@Max(value = 3, message = "weight is max 3")
	private Integer weight;
	@NotNull
	@Min(value = 100, message = "price is min 100")
	@Max(value = 250, message = "price is max 250")
	private Double price;
	private boolean takeAway;
	

	

}
