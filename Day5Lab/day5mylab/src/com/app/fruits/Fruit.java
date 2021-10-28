package com.app.fruits;

public class Fruit {
	private String name;
	private	String color;
	private double weight;
	private boolean isFresh;
	
	Fruit(String fname, String fcolor, double fweight){
		name=fname;
		color=fcolor;
		weight=fweight;
		isFresh=true;
	}
	

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public String taste() {
		return "No specific taste";
	}
	
	
	public boolean setFresh(boolean isFresh) {
		return this.isFresh = isFresh;
	}


	public String toString() {
		return "Fruit is "+name+" has "+color+"color weighing "+weight;
	}
}
