package com.highradius.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.highradius.hibernate.pojo.Address;
import com.highradius.hibernate.pojo.Applicant2;

public class Main4 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");

			SessionFactory factory = configuration.buildSessionFactory();
			session = factory.openSession();
			Applicant2 applicant2 = (Applicant2) session.get(Applicant2.class, 1);
			System.out.println(applicant2);
			for (Address address : applicant2.getAddresses()) {
				System.out.println(address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
