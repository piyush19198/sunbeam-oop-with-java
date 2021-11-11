package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.vehicles.Vehicle;
import static utils.ValidationRules.*;

import custom_exceptions.VehicleHandlingException;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Showroom capacity");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add Vehicle \n2.Display all vehicles \n10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println("Enter vehicle details : \nchasisNo,  color,  price,  "
									+ "manufactureDate(yr-mon-day),  category");
							Vehicle v = new Vehicle(checkForDuplicate(sc.next(), vehicles), parseAndValidateColors(sc.next()), sc.nextDouble(),
									parseAndValidateManufactureDate(sc.next()), parseAndValidateCategory(sc.next()));
							vehicles[counter++] = v;
						} else
							throw new VehicleHandlingException("Showroom Full!!!!!");
						break;

					case 2:
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		}

	}

}
