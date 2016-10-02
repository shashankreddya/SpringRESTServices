package com.example.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="addressId", nullable=false, unique=true, length=11)
	private int addressId;
	
	@Column(name="line1", length=40, nullable=true)
	private String line1;
	
	@Column(name="city", length=20, nullable=true)
	private String city;
	
	@Column(name="state", length=20, nullable=true)
	private String state;
	
	@Column(name="zipcode", length=6, nullable=true)
	private String zipCode;
	
	public Address() {
	}
	
	public Address(int addressId, String line1, String city, String state, String zipCode) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
		return "Address [id=" + addressId + ", line1=" + line1 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}

}