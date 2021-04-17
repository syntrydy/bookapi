package com.gasmyr.bookapi.service;

import org.springframework.stereotype.Service;

import com.gasmyr.bookapi.model.Person;

@Service
public class PersonService {

	public Person getPerson() {
		Person person = new Person();
		person.setFirstName("Thomas Gasmyr");
		person.setLastName("Mougang");
		person.setCity("Yaounde");
		return person;
	}

}
