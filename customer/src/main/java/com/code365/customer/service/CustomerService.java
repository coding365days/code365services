package com.code365.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code365.customer.model.Customer;
//import com.code365.customer.model.CustomerRegistrationRequest;
import com.code365.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
//	public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
//		Customer customer = Customer.builder()
//				.id(System.currentTimeMillis())
//				.firstName(customerRegistrationRequest.getFirstName())
//				.lastName(customerRegistrationRequest.getLastName())
//				.email(customerRegistrationRequest.getEmail()).build();
//		customerRepository.save(customer);
//	}
}
