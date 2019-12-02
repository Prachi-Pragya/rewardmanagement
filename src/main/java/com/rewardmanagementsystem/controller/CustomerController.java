package com.rewardmanagementsystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rewardmanagementsystem.bean.CustomerDetails;
import com.rewardmanagementsystem.dao.CustomerDao;
import com.rewardmanagementsystem.model.Customers;
import com.rewardmanagementsystem.service.CustomerService;
import com.rewardmanagementsystem.service.RewardService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private RewardService rewardService;

	@RequestMapping("/hello")
	public String customerDetails() {

		return "hello world";
	}

	@GetMapping("/{mobileNo}")
	public Optional<Customers> getListById(@PathVariable(value = "mobileNo") long mobileNo) {
		/*
		 * return customerService.getCustomersList(customerId).isPresent() ?
		 * customerService.getCustomersList(customerId).get() : null;
		 */
		return customerService.getCustomersList(mobileNo);
	}

	// @PostMapping("/save")
	@RequestMapping(path = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)

	public Customers saveCustomerDetails(@RequestBody Customers customer) {
		return customerService.getList(customer);
	}

	@PostMapping(path = "/rewards", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customers rewardPoints(@RequestBody CustomerDetails customerDetails) {
		int points = rewardService.calculateRewards(customerDetails.getPurchaseAmount());

		Optional<Customers> customer = customerService.getCustomer(customerDetails.getMobileNo());

		if (customer.isPresent()) {
			Customers cust = customer.get();
			cust.setRewardPoints(points + cust.getRewardPoints());
			return customerService.updateCustomerDetails(cust);
		} else {
			Customers cust = new Customers();
			cust.setMobileNo(customerDetails.getMobileNo());
			cust.setCustomerName(customerDetails.getCustomerName());
			cust.setRewardPoints(points);
			return customerService.createCustomerDetails(cust);
		}
	}
}
