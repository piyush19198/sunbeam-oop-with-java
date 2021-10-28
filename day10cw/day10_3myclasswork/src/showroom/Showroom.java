package showroom;

import static utils.ValidationRules.checkForDuplicate;
import static utils.ValidationRules.parseAndValidateManufactureDate;
import java.util.Scanner;
import custom_exception.VehicleHandlingException;
import vehicle.Vehicle;
import static utils.ValidationRules.parseAndValidateCategory;
public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int counter = 0;
			System.out.println("Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			boolean flag = false;
			while (flag) {
				System.out.println("\nChoose : " + "1.Add Vehicle" + "2.Display All Vehicles" + "3.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if(counter < vehicles.length) {
						System.out.println("Enter details for vehicle" + "in following order : Chasis Number, color, "
								+ "category, price, manufacture date(year-month-day)");
						Vehicle v = new Vehicle(checkForDuplicate(sc.next(), vehicles), sc.next(), parseAndValidateCategory(sc.next()), sc.nextDouble(), parseAndValidateManufactureDate(sc.next()));
						vehicles[counter++]=v;
						}else {
							throw new VehicleHandlingException("Showroom Full!!!");
						}
						break;
						
					case 2:
						for(Vehicle v : vehicles) {
							if(v!=null) System.out.println(v);
						}
						break;
					case 3:
						flag = false;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}sc.nextLine();//incase date input is not the last in the invoking of constructor
			}

		}
	}

}
