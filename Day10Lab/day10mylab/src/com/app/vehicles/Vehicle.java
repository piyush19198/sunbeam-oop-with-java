package com.app.vehicles;

public class Vehicle {
	private int chasisNo;
	private String color;
	private double price;

	public Vehicle(int chasisNo, String color, double price) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicle)
			return (this.chasisNo == ((Vehicle) o).chasisNo) && (this.color.equals(((Vehicle)o).color));
		return false;
	}

}