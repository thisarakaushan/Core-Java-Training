/*
 
STORE IN FILE

Task-3 : Create a layered architecture project (with menu driven) for Customer Management System

Customer class should have:
cId, cName, email

Business Requirement for menu:

Add Customer
Display top 3 customers from file
Display all customers
Quit

Validations:
Cid cannot be negative
Customer name should have min of 3 characters

*/


package com.hightadius.customer.management.entities;

/**
 * This method creates private variables and setter and getter methods.
 * @author TK
 *
 */
public class Customer {
    private int cId;
    private String cName;
    private String email;

    // Constructor (optional)
    public Customer(int cId, String cName, String email) {
        this.cId = cId;
        this.cName = cName;
        this.email = email;
    }

    // Getters and setters
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id = " + cId + ", Name = " + cName + ", Email = " + email;
    }
}
