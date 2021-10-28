package tester;

import java.util.Date;

import com.app.vehicles.Category;
import com.app.vehicles.Color;
import com.app.vehicles.Vehicle;

public class Test2 {

	public static void main(String[] args) {
		// create inner class instance
		Vehicle.DeliveryAddress deliveryAdr = new Vehicle("abc-12345", Color.BLACK, 34567, new Date(),
				Category.DIESEL).new DeliveryAddress("Pune", "MH", "India", "34543654");
		System.out.println(deliveryAdr.getCity());

	}

}
