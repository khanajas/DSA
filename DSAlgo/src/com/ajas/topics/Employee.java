package com.ajas.topics;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return  o.getName().compareTo(this.getName()) ;
	}

	
	
}
