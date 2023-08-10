package com.highradius.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.hibernate.pojo.Address;
import com.highradius.hibernate.pojo.Applicant2;

public class Main2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		
		// Get session from Sesson factory
		Session session = sf.openSession();

		// Begin transaction
		Transaction t = session.beginTransaction();
		
		// Create Applicant Model data
		Applicant2 applicant = new Applicant2();
		applicant.setFirstName("John");
		applicant.setLastName("KC");
		applicant.setAge(28);
		applicant.setEducation("Graduation");

		// Create Passport Model data
		Address currentAdd = new Address();
		currentAdd.setStreet("Royal road");
		currentAdd.setCity("Newyork");
		currentAdd.setZipcode("10001");

		// Associate Applicant to current Address
		currentAdd.setApplicant(applicant);

		Address permanentAdd = new Address();
		permanentAdd.setStreet("Manyar Road");
		permanentAdd.setCity("Sydney");
		permanentAdd.setZipcode("2060");

		// Associate Applicant to permanent Address
		permanentAdd.setApplicant(applicant);

		session.persist(applicant);
		session.persist(currentAdd);
		session.persist(permanentAdd);
		t.commit();
		session.close();
	}
}
