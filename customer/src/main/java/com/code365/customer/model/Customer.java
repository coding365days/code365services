package com.code365.customer.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Entity
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class Customer {
//	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
}
