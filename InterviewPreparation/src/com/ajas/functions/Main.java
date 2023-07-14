package com.ajas.functions;
import static com.ajas.functions.CustomerValidationRegistrar.*;

import com.ajas.functions.CustomerValidationRegistrar.ValidationResult;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(
				"Ajas","9887676",0,"something@mymail.com");
		CustomerValidationService customerValidationService = new CustomerValidationService();
		boolean valid = customerValidationService.isValid(customer);
		System.out.println(valid);
		
		ValidationResult result = isValidPhoneNumber()
		.and(isEmailValid())
		.and(isAdult()).apply(customer);
		
		System.out.println(result);
	}
	
	static class Customer{
		private String name;
		private String phoneNumber ;
		private Integer age;
		private String email;
	
		public Customer(String name, String phoneNumber, Integer age, String email) {
			super();
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.age = age;
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public Integer getAge() {
			return age;
		}

		public String getEmail() {
			return email;
		}
		
		
		
	}
}
