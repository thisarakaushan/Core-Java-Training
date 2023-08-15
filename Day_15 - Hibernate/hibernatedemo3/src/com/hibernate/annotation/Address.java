package com.highradius.hibernate.annotation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    
    @Column(name = "street")
    private String street;
    
    @ManyToMany(mappedBy = "addresses")
    private Set<Person> persons = new HashSet<>();
    
    // Constructors, getters, setters, toString

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + "]";
	}

	public Address(int addressId, String street) {
		super();
		this.addressId = addressId;
		this.street = street;
	}

	public Address() {
		
	}
	
	
}