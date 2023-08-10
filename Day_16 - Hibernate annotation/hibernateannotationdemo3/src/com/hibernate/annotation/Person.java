package com.highradius.hibernate.annotation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;
    
    @Column(name = "first_name")
    private String firstName;

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "person_address",
        joinColumns = { @JoinColumn(name = "person_id") },
        inverseJoinColumns = { @JoinColumn(name = "address_id") }
    )
    private Set<Address> addresses = new HashSet<>();
    
    // Constructors, getters, setters, toString
	   public int getPersonId() {
			return personId;
		}

		public void setPersonId(int personId) {
			this.personId = personId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public Set<Address> getAddresses() {
			return addresses;
		}

		public void setAddresses(Set<Address> addresses) {
			this.addresses = addresses;
		}

		@Override
		public String toString() {
			return "Person [personId=" + personId + ", firstName=" + firstName + "]";
		}

		public Person(int personId, String firstName) {
			super();
			this.personId = personId;
			this.firstName = firstName;
		}

		public Person() {
		}
	
} 
