package com.ajas.topics;

import java.util.Arrays;

public class Test {
	

	public static void main(String[] args) {
	
	Employee[] emp = new Employee[4];
	emp[0] = new Employee(3,"Ajas");
	emp[1] = new Employee(1,"khan");
	emp[2] = new Employee(2,"azeem");
	emp[3] = new Employee(4,"Ajas");
	

	Arrays.sort(emp);
	for (Employee employee : emp) {
		System.out.println(employee.getId()+" "+employee.getName());
	}
	
	
	}

}
