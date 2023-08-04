package com.highradius.managerImpl;

import java.util.List;

import com.highradius.Dao.CustomerDao;
import com.highradius.beans.Customer;
import com.highradius.manager.CustomerManager;

public class CustomerManagerImpl implements CustomerManager {

	CustomerDao customerDao;
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	
}
