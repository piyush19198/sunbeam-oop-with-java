package tester;

import static utils.CollectionUtils.populateSampleData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

public class TestIterators {

	public static void main(String[] args) {
		try {
			// get populated list of vehicles
			ArrayList<Vehicle> vehicles = populateSampleData();
			//display all vehicles using Iterator
//			Iterator<Vehicle> vehicleItr=vehicles.iterator();
//			while(vehicleItr.hasNext())
//				System.out.println(vehicleItr.next());
			for (Vehicle v : vehicles)
				System.out.println(v);
			System.out.println("Deleting costly vehicles");
			//delete vehicles whose price > 100000
//			for(Vehicle v : vehicles)//implicit Iterator 
//				if(v.getPrice() > 100000)
//					vehicles.remove(v);//r u structurally modifying the list ? YESSS
//			 //In case of modifying the list by not using Iterator's methods :
//			//will definitely produce : ConcurrentModificationExc.
//		
            //what's the solution ? for loop +remove(index) OR Using Iterator's remove method
			Iterator<Vehicle> itr=vehicles.iterator();
			while(itr.hasNext())
			{
				if(itr.next().getPrice()>400000)
					itr.remove();
					
			}
			System.out.println("List after removal "+vehicles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
