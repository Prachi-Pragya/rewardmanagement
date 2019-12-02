package com.rewardmanagementsystem.bean;


public class CustomerDetails {
	private long mobileNo;
	private String customerName;
	private float purchaseAmount;
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(float purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	
	

}
