package com.hightadius.customer.management.uilayer;

import com.highradius.customer.management.businesslogiclayer.CustomerBLL;
import com.hightadius.customer.management.entities.Customer;

import java.util.List;
import java.util.Scanner;

public class CUSLaunchApp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=====================================");
            System.out.println("Customer Database Management System");
            System.out.println("=====================================");
            System.out.println("1. Add Customer");
            System.out.println("2. Display Top 3 Customers");
            System.out.println("3. Display All Customers");
            System.out.println("4. Quit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(obj.nextLine());
            
            Customer customer = new Customer(choice, null, null);

            switch (choice) {
                case 1:
                    // Read the customer details from the user
                    
                    System.out.println("Enter Customer Id: ");
                    customer.setcId(Integer.parseInt(obj.nextLine()));
                    System.out.println("Enter Customer name: ");
                    customer.setcName(obj.nextLine());
                    System.out.println("Enter Customer Email: ");
                    customer.setEmail(obj.nextLine());

                    String message = CustomerBLL.addCustomer(customer);
                    System.out.println(message);
                    break;

                case 2:
                    List<Customer> topThreeCustomers = CustomerBLL.getTopThreeCustomers();

                    if (!topThreeCustomers.isEmpty()) {
                        for (Customer c : topThreeCustomers) {
                            System.out.println(c.toString());
                        }
                    } else {
                        System.out.println("No customers found.");
                    }
                    break;

                case 3:
                    List<Customer> allCustomers = CustomerBLL.getAllCustomers();

                    if (!allCustomers.isEmpty()) {
                        for (Customer c : allCustomers) {
                            System.out.println(c.toString());
                        }
                    } else {
                        System.out.println("No customers found.");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 4);

        obj.close();
    }
}
