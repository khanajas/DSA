package com.ajas.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
	
	private final static Consumer<Customer> customer = customer ->
	System.out.println("Hello "+customer.name+" your age is "+customer.age);
	
	private final static BiConsumer< Customer, Boolean> customerAgeOnDemand = (customer,isShow)
			-> System.out.println("Hello "+customer.name+ (isShow ? " your age is "+customer.age :" " ));
	
	public static void main(String[] args) {
		customer.accept(new Customer("Ajas",30));
		customerAgeOnDemand.accept(new Customer("Azeeem",30),true);
		customerAgeOnDemand.accept(new Customer("Azeeem",30),false);
		
	}
	
	static class Customer{
		
		private String name;
		private Integer age;
		public Customer(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		
	}

}
