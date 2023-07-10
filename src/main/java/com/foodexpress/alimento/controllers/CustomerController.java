package com.foodexpress.alimento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.repositories.CustomerRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	@RequestMapping( "{id}")
	public Customer get(@PathVariable Integer id) {
		return customerRepository.getOne(id);
	}
	
	@PostMapping
	public Customer create(@RequestBody final Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
    	customerRepository.deleteById(id);
    }	
}
