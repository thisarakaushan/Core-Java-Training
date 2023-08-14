package com.highradius.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Demo2 {
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
            criteria.add(Restrictions.between("customerId", 20, 27));
            
            customers  = criteria.list();
            
            System.out.println(customers.size());
            
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
