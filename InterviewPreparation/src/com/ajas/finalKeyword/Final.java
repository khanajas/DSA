package com.ajas.finalKeyword;

public class Final {
	
	private final String name;
	
	Final(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		final String age;
		age ="23";
		
		//age = "kdj"; error cannot reinitialize
		Final f1 = new Final("Ajas");
		Final f2;
		
		
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
//		this.name = name; error cannot reinitialize
	}
	

	

}
