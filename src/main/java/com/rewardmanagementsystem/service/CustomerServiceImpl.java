package com.rewardmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewardmanagementsystem.dao.CustomerDao;
import com.rewardmanagementsystem.model.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {

@Autowired
CustomerDao customerDao;

@Override
public Optional<Customers> getCustomersList(long mobileNo) {
	
	return customerDao.findById(mobileNo);
}

@Override
public Customers getList(Customers customer) {
	// TODO Auto-generated method stub
	return customerDao.save(customer);
}





	
	

}
