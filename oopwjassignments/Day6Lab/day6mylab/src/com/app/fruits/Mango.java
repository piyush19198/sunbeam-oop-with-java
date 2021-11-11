package com.app.fruits;

public class Mango extends Fruit{

	public Mango(String fname, String fcolor, double fweight) {
		super(fname, fcolor, fweight);
	}
	
	public String taste() {
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println("Creating Pulp!");
	}
}
