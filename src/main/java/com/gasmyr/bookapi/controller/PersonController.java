package com.gasmyr.bookapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasmyr.bookapi.model.Person;
import com.gasmyr.bookapi.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;

	@GetMapping
	public Person getPerson() {
		return personService.getPerson();
	}

}
