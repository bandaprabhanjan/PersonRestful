package com.restservices.practice.Bean;

public class PersonBeanV2 {

	private Name name;

	public PersonBeanV2() {
		super();
	}

	public PersonBeanV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	};

}
