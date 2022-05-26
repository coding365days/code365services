package com.code365.customer.model;

//import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;

@Data
//@Entity
@Builder
public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
}
