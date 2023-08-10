package com.highradius.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

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

            // Load the image from the local file system
            File imageFile = new File("C:\\Users\\thisara.kaushan\\Documents\\Core Java\\Day_16\\Moon.jpg"); // Update with your image path
            FileInputStream fileInputStream = new FileInputStream(imageFile);
            BufferedImage bufferedImage = ImageIO.read(fileInputStream);

            // Convert BufferedImage to byte[]
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
            byte[] imageBytes = byteArrayOutputStream.toByteArray();

            // Create an ImageEntity and set the image data
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setImageData(imageBytes);

            // Create addresses
            Address address1 = new Address();
            address1.setStreet("Address 1 Street");

            Address address2 = new Address();
            address2.setStreet("Address 2 Street");

            // Create a person and associate addresses
            Person person = new Person();
            person.setFirstName("John");
            
            Set<Address> addresses = new HashSet<>();
            addresses.add(address1);
            addresses.add(address2);
            person.setAddresses(addresses);
            
            // Save the entities
            session.save(imageEntity);
            session.save(person);
            
            // Perform CRUD operations
            Person retrievedPerson = (Person) session.get(Person.class, person.getPersonId());
            System.out.println("Retrieved Person: " + retrievedPerson);
            
            // Update person's firstName
            retrievedPerson.setFirstName("Updated Name");
            session.update(retrievedPerson);
            
            // Delete the person
            //session.delete(retrievedPerson);
            
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
