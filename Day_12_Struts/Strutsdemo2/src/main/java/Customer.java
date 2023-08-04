package com.highradius.customer;

public class Customer {
	
	private String firstname;
	private int customer_id;
	
	public Customer(String firstname, int customer_id) {
		
		this.firstname = firstname;
		this.customer_id = customer_id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

}
