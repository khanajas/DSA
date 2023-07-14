package com.ajas.functions;

import java.util.function.Predicate;

public class PredicateTest {
	
	private final static Predicate<Customer> customerAccount =
			customer -> customer.Name.startsWith("A");
	
	public static void main(String[] args) {
		
		boolean test = customerAccount.test(new Customer("Khan",35,true));
		System.out.println("Customer Name start with A ? "+(test ? "Yes" : "No"));
	}
	
	static class Customer{
		
		private String Name;
		private	Integer Age;
		private Boolean hasAccount;
		public Customer(String name, Integer age, Boolean hasAccount) {
			super();
			this.Name = name;
			this.Age = age;
			this.hasAccount = hasAccount;
		}
		
		
	}

}
