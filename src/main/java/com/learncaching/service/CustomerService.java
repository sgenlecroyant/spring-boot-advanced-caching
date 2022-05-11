package com.learncaching.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learncaching.entity.Customer;
import com.learncaching.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Optional<Customer> getCustomerById(Long id) {
		return this.customerRepository.findById(id);
	}
	
	public Customer saveCustomer(Customer customer) {
		return this.customerRepository.save(customer);
	}

}
