package com.highradius.beans;

public class Customer {
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
	public String firstname;
	public int customer_id;
	
	public Customer(String firstName, int customer_id) {
		super();
		this.firstname = firstName;
		this.customer_id = customer_id;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstname + ", customerId=" + customer_id + "]";
	}
	
}