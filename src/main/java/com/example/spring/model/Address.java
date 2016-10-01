package com.example.spring.model;

public class Address {

	private String line1;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {
	}
	
	public Address(String line1, String city, String state, String zipCode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}	
}