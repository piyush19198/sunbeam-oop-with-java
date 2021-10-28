package vehicle;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vehicle{

	private String chasisNo;
	private String color;
	private Category category;
	private double price;
	private Date manufactureDate;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
 	}
	
	public Vehicle(String chasisNo, String color, Category category, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.category = category;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	//add overloaded ctor to init just the chasiNo
	public Vehicle(String chasisNo){
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color :" + color + ", price=" + price + " manufactured on "
				+ sdf.format(manufactureDate)+" category :"+category;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals method");
		if (o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
	}
	
}
