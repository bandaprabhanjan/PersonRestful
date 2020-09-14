package com.restservices.practice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restservices.practice.Bean.SomeBean;

@RestController
public class FilteringController {
	@GetMapping("/filtering")
	public MappingJacksonValue retrieveFilterFields() {
		SomeBean bean = new SomeBean("val1", "val2", "val3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(bean);
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/list-filtering")
	public MappingJacksonValue retrieveListOfFields() {
		List<SomeBean> listbean = new ArrayList<SomeBean>();
		listbean.add(new SomeBean("Value11", "Value22", "Value33"));
		listbean.add(new SomeBean("Value111", "Value222", "Value333"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field3");
		SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(listbean);
		mapping.setFilters(filters);
		return mapping;
	}
}
