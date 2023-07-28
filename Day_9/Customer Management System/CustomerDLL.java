package com.hightadius.customer.management.dataaccesslayer;

import com.hightadius.customer.management.entities.Customer;
import com.hightadius.customer.management.utilities.FilesConstants;
import com.hightadius.customer.management.utilities.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CustomerDLL {
	
	/**
	 * This method save customer details to flat file
	 * @param customer
	 * @return
	 */
    public static boolean saveCustomer(Customer customer) {
        try {
            FileWriter fw = new FileWriter(FilesConstants.CUSTOMER_FILE_PATH, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(customer.getcId() + "," + customer.getcName() + "," + customer.getEmail() + "\n");
            bw.close();
            return true;
        } catch (Exception ex) {
            Logger.logErrorMessage(ex.getMessage(), "CustomerDLL", "saveCustomer");
            return false;
        }
    }

    /**
     * This method takes all the customers from flat file
     * @return
     */
    public static List<Customer> getAllCustomers() {
        List<Customer> allCustomers = new ArrayList<>();

        try {
            FileReader fr = new FileReader(FilesConstants.CUSTOMER_FILE_PATH);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int cId = Integer.parseInt(data[0]);
                String cName = data[1];
                String email = data[2];
                Customer customer = new Customer(cId, cName, email);
                allCustomers.add(customer);
            }

            br.close();
        } catch (Exception ex) {
            Logger.logErrorMessage(ex.getMessage(), "CustomerDLL", "getAllCustomers");
        }

        return allCustomers;
    }
}
