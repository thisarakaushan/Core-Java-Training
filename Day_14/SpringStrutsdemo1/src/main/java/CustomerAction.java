package com.highradius.actions;

import com.highradius.manager.CustomerManager;
import com.highradius.managerImpl.CustomerManagerImpl;
import com.highradius.pojo.Customer;

public class CustomerAction {
	
	/*
	 * add method to customer
	 * read method to read customer Data using Id
	 * update method to update customer Data using Id
	 * delete method to delete customer Data using Id
	 * readAll method to retrieve all customer data
	 */
	
	public Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String add() {
		
		String s = "ALREADY_PRESENT";
		System.out.println(customer);
		CustomerManager customerManager = new CustomerManagerImpl();
		int result  = customerManager.add(customer);
		if(result > 0) {
			
			s = "added";
		}
		return s;
		
	}
}
