package com.highradius.hibernate.main;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.highradius.hibernate.pojo.Applicant;
import com.highradius.hibernate.pojo.Passport;

public class Main {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// Create Applicant Model data
		Applicant applicant = new Applicant();
		applicant.setName("John");
		applicant.setAge(28);
		applicant.setCity("Newyork");

		// Create Passport Model data
		Passport passport = new Passport();
		passport.setPassportNumber("ABCDE1111Z");
		passport.setIssuedDate(new Date());
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.add(Calendar.YEAR, 10);
		passport.setExpiryDate(date.getTime());

		applicant.setPassport(passport);
		passport.setApplicant(applicant);
		session.persist(applicant);

		// Commit the transaction and close the session
		transaction.commit();
		session.close();
	}
}
