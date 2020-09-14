package com.restservices.practice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.restservices.practice.Bean.Name;
import com.restservices.practice.Bean.PersonBeanV1;
import com.restservices.practice.Bean.PersonBeanV2;
import com.restservices.practice.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@GetMapping("/person/v1")
	public PersonBeanV1 retrievePersonV1() {
		return new PersonBeanV1("Prabhanjan Banda");
	}
	@GetMapping("/person/v2")
	public PersonBeanV2 retrievePersonV2()
	{
		return new PersonBeanV2(new Name("Prabhanjan","from Version2"));
	}
	@PostMapping("/persons")
	public void createPerson(@RequestBody @Valid PersonBeanV1 beanVersion)
	{
	 personService.save(beanVersion);
	}

}
