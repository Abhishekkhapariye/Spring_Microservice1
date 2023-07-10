package com.exception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.model.Customer;
import com.exception.repository.CustomerRepository;

@Service
public class CustomerServices {

//	@Autowired
//	PasswordEncoder passwordEncoder;
	@Autowired
	CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {
//		passwordEncoder.encode(customer.getPassword());
		return customerRepository.save(customer);
	}

	public void removeCusById(Integer id) {
		customerRepository.deleteById(id);

	}

	public List<Customer> getAllCustomers() {
		return this.customerRepository.findAll();

	}



}
