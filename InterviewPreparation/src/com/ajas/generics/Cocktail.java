package com.ajas.generics;

public class Cocktail<W,J> {
	
	W water;
	J juice;
	
	public Cocktail(){
		
	}

	public Cocktail(W water, J juice) {
		// TODO Auto-generated constructor stub
		this.water = water;
		this.juice = juice;
	}
	
	public void mix() {
		System.out.println("Mixed with "+this.water +" and "+this.juice);
	}

	
}
