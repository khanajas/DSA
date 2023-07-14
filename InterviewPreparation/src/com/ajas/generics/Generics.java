package com.ajas.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		System.out.println("Helloowww");
		IntegerPrinter intPrinter = new IntegerPrinter(10);
		intPrinter.print();
		
		ArrayList a = new ArrayList<>();
		
		DoublePrinter dPrinter = new DoublePrinter(23.4);
		dPrinter.print();
		
		Printer<Double> print = new Printer<>(10.2);
		print.print();
		Printer<Integer> intPri = new Printer<>(34);
		intPri.print();
		
		Cocktail<String,String> c = new Cocktail<>("Water","Pineapple");
		c.mix();
		
	
	}
	
	public static  <W, J> Cocktail<W,J> mix(W water, J juice) {
	
		return new Cocktail<>(water,juice);
	}

}
