package com.example.spring.model;

public class Person {
	
	private String firstName;
	private String lastName;
	private Address address;
	private String gender;
	private int age;
	
	public Person() {
	}
	public Person(String firstName, String lastName, Address address, String gender, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.age = age;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", gender="
				+ gender + ", age=" + age + "]";
	}
}