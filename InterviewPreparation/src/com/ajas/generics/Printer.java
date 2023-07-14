package com.ajas.generics;

public class Printer <T extends Number>{
	T value;
		
	public Printer(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public Printer() {
		
	}
	
	public void print() {
		System.out.println("THis is value of :"+value);
		System.out.println(value.intValue());
	}

}
