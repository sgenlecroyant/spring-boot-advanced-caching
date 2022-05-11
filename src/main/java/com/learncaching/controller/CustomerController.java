package com.learncaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learncaching.entity.Customer;
import com.learncaching.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping(value = "/customers")
	private Customer saveCustomer(@RequestBody Customer customer) {
		return this.customerService.saveCustomer(customer);
	}

	@GetMapping(value = "/customers/{id}")
	private Customer getCustomerById(@PathVariable Long id) {
		return this.customerService.getCustomerById(id).get();
	}
}
