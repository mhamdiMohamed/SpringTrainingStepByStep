package com.med;

public class Person {
	private String name;
	private String lastName;
	private String gender;
	private Address address;
	
	public Person() {
	}
	
	public Person(Address address) {
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", address=" + address + "]";
	}
}
