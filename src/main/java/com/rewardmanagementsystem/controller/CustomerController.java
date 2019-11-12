package com.rewardmanagementsystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewardmanagementsystem.model.Customers;
import com.rewardmanagementsystem.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("/hello")
	public  String customerDetails() {
	
	return "hello world";
	}
	
	
	@GetMapping("/{mobileNo}")
	public Optional<Customers> getList(@PathVariable(value="mobileNo") long mobileNo)
	{
		/*return customerService.getCustomersList(customerId).isPresent() ?
				customerService.getCustomersList(customerId).get()
				: null;*/
		return customerService.getCustomersList(mobileNo);
	}
}