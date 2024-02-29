package com.xworkz.order.bean;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.order.dto.OrderDTO;

@Component
@RequestMapping("/")
public class OrderComponent {
	public OrderComponent() {
		System.out.println("Created a OrderComponent");
	}
	@RequestMapping("/cake")
	public String orderComponenet(@Valid OrderDTO dto,BindingResult errors,Model model) {
		System.out.println(dto);
		System.out.println(errors.hasErrors());
		List<ObjectError> objectErrors=errors.getAllErrors();
		objectErrors.forEach(objectError->System.err.println(objectError.getObjectName()+":message"+objectError.getDefaultMessage()));
		model.addAttribute("errors", objectErrors);
		return "Order.jsp";

}
}

