package com.highradius.hibernate.criteria;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Session session = null;

        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            session = factory.openSession();
            session.beginTransaction();

            List<Customer> customers = Arrays.asList(new Customer("First Customer 1"),
            		new Customer("Second Customer 2"), new Customer("Third Customer 3"),
            		new Customer("Kamal"), new Customer("Nimal"));
            
            for(Customer customer: customers) {
            	session.save(customer);
            } 
            
            System.out.println(customers);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
