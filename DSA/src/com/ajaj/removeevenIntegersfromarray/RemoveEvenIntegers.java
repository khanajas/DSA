package com.ajaj.removeevenIntegersfromarray;

import java.util.Objects;

public class RemoveEvenIntegers {
	
	String name;
	Integer age;
	
	public static void main(String[] args) {
		int[] elements = {1,2,3,4,5,6,7,8,12};
		removeEvenInteges(elements);
		
		
	}
	
	public static void removeEvenInteges(int[] elements) {
		
		int oddSize = 0;
		
		for(int i=0; i<elements.length; i++) {
			if(elements[i] % 2 != 0) {
				oddSize++;
			}
		}
		
		int[] oddElements = new int[oddSize];
		int index = 0;
		
		for(int i=0; i<elements.length; i++) {
			if(elements[i] % 2 != 0) {
				oddElements[index]=elements[i];
				index++;
			}
		}
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RemoveEvenIntegers other = (RemoveEvenIntegers) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}
	
	

}
