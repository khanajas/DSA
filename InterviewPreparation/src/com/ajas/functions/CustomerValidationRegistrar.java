package com.ajas.functions;

import java.util.function.Function;

import com.ajas.functions.Main.Customer;

import com.ajas.functions.CustomerValidationRegistrar.*;
import static com.ajas.functions.CustomerValidationRegistrar.ValidationResult.*;



public interface CustomerValidationRegistrar extends Function<Customer,ValidationResult>{
	
	static CustomerValidationRegistrar isEmailValid() {
	
		return customer -> customer.getEmail().contains("@") ? SUCCESS : INVALID_EMAIL;
	}
	
	static CustomerValidationRegistrar isValidPhoneNumber() {
		
		return customer -> customer.getPhoneNumber().startsWith("9")? SUCCESS : INVALID_PHONENUMBER;
	}
	
	static CustomerValidationRegistrar isAdult() {
		
		return customer -> customer.getAge() >= 18 ? SUCCESS : NOT_ADULT;
	}
	
	default CustomerValidationRegistrar and( CustomerValidationRegistrar function)  {
		
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ? function.apply(customer) : result;
		};
		
	}
	
	
	enum ValidationResult{
		SUCCESS,
		INVALID_EMAIL,
		INVALID_PHONENUMBER,
		NOT_ADULT
		
	}

}
