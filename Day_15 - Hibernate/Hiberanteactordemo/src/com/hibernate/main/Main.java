package com.highradius.hiberante.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.hiberante.pojo.Actor;

public class Main {
	
	public static void main(String[] args) {	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction  = session.beginTransaction();
		
		// Do things for database connection before commit...
		Actor actor = new Actor();
		actor.setFirstName("Thisara");
		actor.setLastName("Kaushan");
		session.save(actor);
		
		System.out.println("DONE");
		transaction.commit();
		System.out.println("DONE");
		session.close();
		System.out.println("DONE");
	}

}
