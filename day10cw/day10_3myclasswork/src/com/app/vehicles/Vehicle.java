package com.app.vehicles;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private String chasisNo;
	private double price;
	private Date manufactureDate;
	private Category category;
	private Colors color;

	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public Vehicle(String chasisNo, Colors color, double price, Date manufactureDate, Category category) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.category = category;
	}
	
	public Vehicle(String chasisNo) {
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + " manufactured on "
				+ sdf.format(manufactureDate) + " category " + category;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
	}

}
