package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String fname, String fcolor, double fweight) {
		super(fname, fcolor, fweight);
	}
	
	public String taste() {
		return "Sweet n Sour";
	}
}
