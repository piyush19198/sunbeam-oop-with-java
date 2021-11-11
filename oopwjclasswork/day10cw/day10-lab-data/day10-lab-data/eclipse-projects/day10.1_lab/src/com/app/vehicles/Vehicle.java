package com.app.vehicles;

/*
 * Solve Vehicle equality assignment
Problem :
Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
Supply tight encapsulation
state(data members)  : chasisNo : int , color : String , price : double
chasisNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
Get  complete state : toString
Hint : override equals method inherited from Object class : to replace ref equality by content equality(based upon unique ID : PK)
 */
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
		if (o instanceof Vehicle) {
			Vehicle v=(Vehicle) o;
			return this.chasisNo == v.chasisNo && this.color.equals(v.color);
		}
		return false;//=> incompatible types !!!!!
	}

}
