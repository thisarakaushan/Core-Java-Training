package com.highradius.hiberante.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.hiberante.pojo.Customer;

public class Main {
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		
		/**
		 * Hibernate to insert data to database
		 * Table name: customer
		 */
		
		/*
		 * 1. Hibernate configuration - database connection/ session factory
		 */
		
		/*
		 * ?. Insert data
		 */
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction  = session.beginTransaction();
		
		// Do things for database connection before commit...
		Customer customer = new Customer();
		customer.setId(121);
		customer.setFirstName("Thisara");
		session.save(customer);
		
		// Get data from table
		/*
		 * List<Customer> customers =
		 * session.createQuery("SLECT * FROM customer").list();
		 */
		
		List<Customer> customers1 = session.createQuery("SELECT firstName FROM Customer").list();
		System.out.println(customers1);
		
		List<Customer> customers2 = session.createQuery("SELECT firstName FROM Customer").setMaxResults(2).list();
		System.out.println(customers2);
		
		List<Customer> customers3 = session.createQuery("SELECT firstName FROM Customer").setFirstResult(2).setMaxResults(2).list();
		System.out.println(customers3);
		
		Customer customer1 = (Customer) session.get(Customer.class, 6);
		customer1.setFirstName("Name_Updated");
		session.save(customer1);
		
		/*
		 * Customer customer2 = (Customer) session.get(Customer.class, 8);
		 * customer2.setFirstName("Name_Updated_to_Delete"); session.delete(customer2);
		 */
		
		Customer customer3 = (Customer) session.get(Customer.class, 10);
		session.delete(customer3);
		
		System.out.println("DONE");
		transaction.commit();
		session.close();
	}

}
