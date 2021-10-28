package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;
import static utils.ValidationRules.parseAndValidateManufactureDate;

import custom_exceptions.VehicleHandlingException;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init pahse of the app
			// create suitable array to hold vehicle details(ref)
			System.out.println("Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array object
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// add the vehicle : upon validations
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : chasisNo,  color,  price,  "
									+ "manufactureDate(yr-mon-day),  category");
							Vehicle v = new Vehicle(sc.next(), sc.next(), sc.nextDouble(),
									parseAndValidateManufactureDate(sc.next()), sc.next());
							// => success
							vehicles[counter++] = v;
						} else
							throw new VehicleHandlingException("Showroom Full!!!!!");
						break;

					case 2: //display
						for(Vehicle v : vehicles)
							if(v != null)
								System.out.println(v);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				//to clear off pending tokens from the buffer of a scanner : till new line
				sc.nextLine();
			}
		}

	}

}