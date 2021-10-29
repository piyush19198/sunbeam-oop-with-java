package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.CustomerPlan;
import static utils.ValidationRules.validateCustomerInputs;

public class CustomerManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init : create AL<Customer>
			ArrayList<Customer> customers = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Register New Customer 2. Customer Login 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // customer reg.
						System.out.println("Enter customer details : name,  email,  password,  regAmount, "
								+ " dob(day-mn-yr),  plan ");
						customers.add(validateCustomerInputs(customers, sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next()));
						System.out.println("Customer reg success!!!!");

						break;
					case 2:
						//email pwd : user i/ps
						//Hint : indexOf --> -1 => invalid email : throw exc
						//get(index) --> customer ref --> chk pwd --> login success or throw exc.
						
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// clr off pending i/ps from scanner
				sc.nextLine();

			}

		} // end of try with resources

	}

}
