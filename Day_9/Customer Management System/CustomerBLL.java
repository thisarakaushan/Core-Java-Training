package com.highradius.customer.management.businesslogiclayer;

import com.hightadius.customer.management.entities.Customer;
import com.hightadius.customer.management.dataaccesslayer.CustomerDLL;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerBLL {

	/**
	 * This method is used to add customers
	 * @param customer
	 * @return
	 */
    public static String addCustomer(Customer customer) {
        // Logic for validation
        StringBuilder message = new StringBuilder();
        if (customer.getcId() < 0)
            message.append("Invalid Customer Id\n");
        if (customer.getcName().length() < 3)
            message.append("Customer name should have a minimum of 3 characters.\n");

        if (message.length() == 0) {
            if (CustomerDLL.saveCustomer(customer))
                return "Customer added successfully.";
            else
                return "Unable to add customer details.";
        } else
            return message.toString();
    }

    /**
     * This method is used to get top three customers
     * @return
     */
    public static List<Customer> getTopThreeCustomers() {
        List<Customer> allCustomers = CustomerDLL.getAllCustomers();

        // Sort customers based on some criteria to get top three customers
        // Here, we'll simply return the first three customers from the list
        return allCustomers.stream().limit(3).collect(Collectors.toList());
    }

    public static List<Customer> getAllCustomers() {
        return CustomerDLL.getAllCustomers();
    }
}
