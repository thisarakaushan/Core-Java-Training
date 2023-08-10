package com.highradius.hibernate.pojo;

import java.util.Set;

public class Applicant2 {
	private int applicantId;
	private String firstName;
	private String lastName;
	private int age;
	private String education;
	private Set<Address> addresses;
	
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Applicant2 [applicantId=" + applicantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", education=" + education + "]";
	}

}