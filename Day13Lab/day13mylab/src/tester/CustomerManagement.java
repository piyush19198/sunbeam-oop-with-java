package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import com.app.core.Customer;
import com.app.core.CustomerPlan;

import static utils.ValidationRules.*;



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
						+ "7. Display All Customer Details With Specified Adhar Card Location\n"
						+ "10. EXIT");
				
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
						Customer custLogin = validateLogin(validateLoginEmail(sc.next()), validateLoginPassword(sc.next()), customers);
						System.out.println("!!!LOGIN SUCCESSFUL!!!");
						break;
					case 3:
						System.out.println("Enter Email and Password to login:");
						Customer custChangePassword = validateLogin(validateLoginEmail(sc.next()), validateLoginPassword(sc.next()), customers);
						System.out.println("Customer Verification Successful\nEnter new password: ");
						custChangePassword.setPassword(validateLoginPassword(sc.next()));
					case 4:
						System.out.println("You are about to unsubscribe\n"
								+ "Enter Email and Password to confirm this action: ");
						Customer custUnsub = validateLogin(validateLoginEmail(sc.next()), validateLoginPassword(sc.next()), customers);
						System.out.println("Customer Verification Successful");
						customers.remove(custUnsub);
						System.out.println("Customer Successfully Unsubscribed");
					case 5: 
						System.out.println("Select plan from below to show its customers: \n"
								+ "SILVER\t GOLD\t DIAMOND\t PLATINUM");
						CustomerPlan plan = validatePlan(sc.next());
						for (Customer customerByPlan : customers) {
							if(customerByPlan.getPlan().equals(plan))
								System.out.println(customerByPlan.getName());
						}
						break;
					case 6:
						System.out.println("Enter Date to show customers born after it: ");
						Date bornAfter = parseValidateDoB(sc.next());
						System.out.println("Customers born after Date "+bornAfter+" are: \n");
						for(Customer customerByDate : customers) {
							if(customerByDate.getDob().after(bornAfter));
								System.out.println(customerByDate);
						}
							break;
					case 7:
						System.out.println("Enter Location to show customers from there: ");
						for(Customer customerByLocation : customers) {
							if(customerByLocation.getCard().equals(sc.next()))
								System.out.println(customerByLocation);
						}
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
