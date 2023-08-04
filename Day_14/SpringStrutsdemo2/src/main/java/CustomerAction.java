package com.highradius.actions;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.beans.Customer;
import com.highradius.manager.CustomerManager;

public class CustomerAction {

	public CustomerManager customerManager;
	public List<Customer> customers;

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public String getCustomer() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		customerManager = (CustomerManager) context.getBean("customerManagerImpl");
		String msg = "error";
		customers = customerManager.getCustomers();
		if (customers != null) {
			msg = "success";
		}
		return msg;
	}
}

