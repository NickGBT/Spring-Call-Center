package com.netbuilder.entities;

public class Customer {
	
	private String customerName;
	private int customerId;

	public Customer(String customerName, int customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
