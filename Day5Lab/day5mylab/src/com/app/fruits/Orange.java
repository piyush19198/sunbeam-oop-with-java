package com.app.fruits;

public class Orange extends Fruit{

	public Orange(String fname, String fcolor, double fweight) {
		super(fname, fcolor, fweight);
	}
	
	public String taste() {
		return "Sour";
	}
}
