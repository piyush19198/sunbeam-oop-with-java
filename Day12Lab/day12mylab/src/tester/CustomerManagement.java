package tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.app.core.Customer;
import static utils.ValidationRules.validateCustomerInputs;
import static utils.ValidationRules.validateLogin;
import static utils.ValidationRules.validateLoginPassword;
import static utils.ValidationRules.validateLoginEmail;


public class CustomerManagement {
	
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)) {
			
			ArrayList<Customer> customers = new ArrayList<>();
			
			boolean exit=false;
			
			while(!exit) {
				
				System.out.println("\nCustomer Management Options:\n"
						+ "1. Register New Customer\n"
						+ "2. Customer Login\n"
						+ "3. Change Password\n"
						+ "4. Unsubscribe Customer\n"
						+ "5. Display All Customer Names Who Have Taken A Specific Plan\n"
						+ "6. Display All Customer Details Born After Specific Date\n"
						+ "7. Display All Customer Details With Specified Adhar Card Location\n");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Customer Details in following order:\n  "
								+ "name,  email,  password,  regAmount, dob(day-mn-yr), plan ");
						customers.add(validateCustomerInputs(customers, sc.next(), sc.next(), sc.next(), 
								sc.nextDouble(), sc.next(), sc.next()));
						System.out.println("Customer Registration Sucessful");
						break;
					case 2:
						System.out.println("Enter Email and Password to login:");
						Customer c = validateLogin(validateLoginEmail(sc.next()), validateLoginPassword(sc.next()), customers);
						System.out.println("!!!LOGIN SUCCESSFUL!!!");
						break;
					case 10:
						exit=true;
						break;
					default:
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
			
		}
		
	}
	
}
