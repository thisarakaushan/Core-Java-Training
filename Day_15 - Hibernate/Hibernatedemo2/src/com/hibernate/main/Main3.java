package com.highradius.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.highradius.hibernate.pojo.Address;

public class Main3 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");

			SessionFactory factory = configuration.buildSessionFactory();
			session = factory.openSession();
			Address address = (Address) session.get(Address.class, 1);
			System.out.println(address);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
