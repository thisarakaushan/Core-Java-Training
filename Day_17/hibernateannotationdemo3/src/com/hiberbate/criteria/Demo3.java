package com.highradius.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Demo3 {
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
            
            Criterion criterion1 = Restrictions.like("firstName", "%even%");
            Criterion criterion2 = Restrictions.like("firstName", "%rah%");
            
            //criteria.add(criterion1);
            
            //criteria.add(Restrictions.or(criterion1, criterion2));
            criteria.add(Restrictions.or(criterion1, criterion2)).list();
            
            customers  = criteria.list();
            
            for(Customer customer: customers) {
            	session.save(customer);
            }
            
            System.out.println(customers.size());
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
