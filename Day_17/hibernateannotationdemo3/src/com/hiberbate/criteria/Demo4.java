package com.highradius.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class Demo4 {
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) {
        Session session = null;

        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            session = factory.openSession();

            @SuppressWarnings("unused")
			List<Customer> customers = null;
            Criteria criteria = session.createCriteria(Customer.class);
            
            criteria.setProjection(Projections.max("customerId"));
            int maxCustomerId = (int) criteria.list().get(0);
            System.out.println(maxCustomerId);
            
            criteria.setProjection(Projections.min("customerId"));
            int minCustomerId = (int) criteria.list().get(0);
            System.out.println(minCustomerId);
            
            criteria.setProjection(Projections.sum("customerId"));
            Long sumOfCustomerId = (Long) criteria.list().get(0);
            System.out.println(sumOfCustomerId);
            
            criteria.setProjection(Projections.avg("customerId"));
            Double avgCustomerId = (Double) criteria.list().get(0);
            System.out.println(avgCustomerId);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
