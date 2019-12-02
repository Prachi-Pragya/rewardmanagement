package com.rewardmanagementsystem.service;

import java.util.Optional;

import com.rewardmanagementsystem.bean.CustomerDetails;
import com.rewardmanagementsystem.model.Customers;

public interface CustomerService {
	Optional<Customers> getCustomersList(long mobileNo);

	Customers getList(Customers customer);
	
	Optional<Customers> getCustomer(long mobileNo);
	
	public Customers updateCustomerDetails(Customers customer);
	
	public Customers createCustomerDetails(Customers customers);

}
