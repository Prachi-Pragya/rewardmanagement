package com.rewardmanagementsystem.service;

import java.util.Optional;


import com.rewardmanagementsystem.model.Customers;

public interface CustomerService {
	Optional<Customers> getCustomersList(long mobileNo);

	Customers getList(Customers customer);



}
