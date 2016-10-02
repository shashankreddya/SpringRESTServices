package com.example.spring.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.dao.PersonDAO;
import com.example.spring.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("webApplicationContext.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setFirstName("Pankaj"); person.setLastName("India");
		
		personDAO.save(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.list();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		//close resources
		context.close();	
	}
}