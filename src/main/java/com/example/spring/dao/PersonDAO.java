package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}