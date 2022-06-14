package com.code365.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.code365.customer.model.CustomerRegistrationRequest;
import com.code365.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
//	@Autowired
//	private CustomerService customerService;
	
//	@PostMapping(value = "/register")
//	public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
//		log.info("new customer registration {}", customerRegistrationRequest);
//		customerService.registerCustomer(customerRegistrationRequest);
//	}
	
	@GetMapping(value = "/test")
	public String get() {
		return "testing";
	}
	
	@GetMapping(value = "/test1")
	public String get1() {
		return "testing1";
	}
}

//@Slf4j
//@RestController
//@RequestMapping("api/v1/customers")
//public record CustomerController() {
//	
//	@PostMapping
//	public void registerCustomer(@RequestBody CustomerRequest customerRequest) {
//		log.info("new customer registration {}", customerRequest);
//	}
//}
