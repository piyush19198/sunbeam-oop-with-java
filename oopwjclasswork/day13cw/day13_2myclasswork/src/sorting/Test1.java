package sorting;

import static utils.CollectionUtils.populateSampleData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

public class Test1 {

	public static void main(String[] args) {
		try {
			// get populated list of vehicles
			ArrayList<Vehicle> vehicles = populateSampleData();
			System.out.println("Ordered List");
			for(Vehicle v : vehicles)
				System.out.println(v);
			Collections.sort(vehicles);
			System.out.println("Vehicle List sorted as per : price");
			for(Vehicle v : vehicles)
				System.out.println(v);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
