package com.rewardmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rewardpoints")
public class Customers {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mobileNo")
	private long mobileNo;

	@Column(name = "customerName")
	private String customerName;

	@Column(name = "rewardsPoints")
	int rewardPoints;

	
	public Customers() {
		super();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
