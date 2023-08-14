package com.highradius.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class Demo5 {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
        Session session = null;

        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            session = factory.openSession();

            List<Customer> customers = null;
            Criteria criteria = session.createCriteria(Customer.class);
            
            customers = criteria.addOrder(Order.asc("firstName")).list();
            
            for(Customer customer: customers) {
            	session.save(customer);
            }
            
            System.out.println(customers);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
