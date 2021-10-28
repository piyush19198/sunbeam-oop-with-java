package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class Showroom {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {
			// init phase of the app
			// create suitable array to hold vehicle details(ref)
			System.out.println("Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];// 1 array object
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicle 2.Display all vehicles 3.Purchase a Vehicle 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// add the vehicle : upon validations
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : chasisNo,  color,  price,  "
									+ "manufactureDate(yr-mon-day),  category");
							Vehicle v = new Vehicle(checkForDuplicate(sc.next(), vehicles),
									parseAndValidateColor(sc.next()), sc.nextDouble(),
									parseAndValidateManufactureDate(sc.next()), parseAndValidateCategory(sc.next()));
							// => success
							vehicles[counter++] = v;
							System.out.println("Vehicle added to the showroom");
						} else
							throw new VehicleHandlingException("Showroom Full!!!!!");
						break;

					case 2: // display
						System.out.println("Vehicles in the showroom");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;
					case 3:
						System.out.println("Enter chasis no , to purchase a vehicle");
						// invoke the method
						Vehicle vehicle = findByChasisNo(sc.next(), vehicles);
						// chk if it's already sold ?
						if (vehicle.getAddress() != null)
							throw new VehicleHandlingException("Vehicle already sold!!!!");
						// =>not yet sold : available
						System.out.println("Enter delivery address : city, state, country, zipCode");
						vehicle.assignDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next());
						System.out.println("vehicle ready for delivery....");

						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println(e.getMessage());
				}
				// to clear off pending tokens from the buffer of a scanner : till new line
				sc.nextLine();
			} // end of while
		} // end of try-with-res : sc.close();

	}

}
