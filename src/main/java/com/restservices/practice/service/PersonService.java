package com.restservices.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restservices.practice.Bean.PersonBeanV1;
@Service
public class PersonService {
	private static List<PersonBeanV1> person = new ArrayList<PersonBeanV1>();
	public PersonBeanV1 save(PersonBeanV1 personbean) {
		person.add(personbean);
		return personbean;
	}
}
