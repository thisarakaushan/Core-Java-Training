package com.highradius.Dao;

import com.highradius.pojo.Customer;

public interface CustomerDao {

	int add(Customer customer);

	boolean findCustomerById(int customerId);

}
