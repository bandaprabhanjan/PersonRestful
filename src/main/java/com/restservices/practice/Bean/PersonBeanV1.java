package com.restservices.practice.Bean;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All Details About Person")
public class PersonBeanV1 {
	@ApiModelProperty(notes = "Name should have atleast 2 charactres")
	@Size(min = 2, message = "Name should be atleast 2 chars")
	private String name;

	public PersonBeanV1() {
		super();
	}

	public PersonBeanV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
