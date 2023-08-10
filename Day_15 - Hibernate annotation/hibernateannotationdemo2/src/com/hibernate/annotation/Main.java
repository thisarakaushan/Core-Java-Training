package com.highradius.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Session session = null;

        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            session = factory.openSession(); 
            Transaction transaction = session.beginTransaction();

            // Create Company with Client association
            Company company = new Company(1, "Company 1");
            session.save(company);
            
            company = (Company) session.get(Company.class, 1);
            System.out.println(company);
            
            // Create Client
            Client client = new Client(1, "Client 1");
            client.setCompany(company);
            session.save(client);

            // Client's company reference
//            client.setCompany(company);
//            session.update(client);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}