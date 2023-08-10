package com.highradius.hibernate.pojo;

public class Address {
	private int addressId;
	private String street;
	private String city;
	private String zipcode;
	private Applicant2 applicant;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Applicant2 getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant2 applicant2) {
		this.applicant = applicant2;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode
				+ ", applicant=" + applicant + "]";
	}

}