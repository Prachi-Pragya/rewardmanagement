package com.rewardmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rewardmanagementsystem.model.Customers;

@Repository
public interface CustomerDao extends JpaRepository<Customers, Long> {

}
