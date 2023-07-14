package com.ajas.functions;

import java.util.function.Predicate;

import com.ajas.functions.Main.Customer;

public class CustomerValidationService {
	
	
	
	public Predicate<Customer> isPhoneNumberValid = 
			customer -> customer.getPhoneNumber().startsWith("9");

	public Predicate<Customer> isEmailValid = 
			customer -> customer.getEmail().contains("@");
	

	public Predicate<Customer> isAdult = 
			customer -> customer.getAge() >= 18;
	
	public  boolean isPhoneNumberValid(String phoneNumber) {
				
		return phoneNumber.startsWith("9");
	}
	
	public  boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	
	public  boolean isAdult(Integer age) {
		return age > 18;
	}
	
	public boolean isValid(Customer customer) {
		
		return isPhoneNumberValid.and(isAdult).and(isEmailValid).test(customer);
				
		
		
	}

}
