package application;

import java.util.ArrayList;
import java.util.Scanner;

import utils.AccountUtils;
import utils.ValidateAccount.*;

import com.app.Ebank.Account;

public class Ebank {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			ArrayList<Account> accounts = new ArrayList<>();
			AccountUtils accUtils = new AccountUtils();
			
			boolean exit = false;
			
			while(!exit) {
				
				System.out.println("\nSelect Operation to Perform");
				System.out.println("\n1. Add Account \n2. Display an Account \n3. Display All Accounts \n4. Remove an Account by email \n5. Withdraw"
						+ "\n6. Deposit \n7. Transfer \n8. Search account using NAME \n9. Search account using EMAIL \n10. Search Account using PHONE"
						+ "\n11. EXIT");
				
				try {
					switch(sc.nextInt()) {
						case 1:																						//1. Add Account Functionality
							System.out.println("Enter Account Details in following order\n"
									+ "AccountNumber, Name(WithoutSpaces), Email, Phone, Balance");
							accUtils.addAccount(accounts, sc.nextLong(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
							System.out.println("Account has been created successfully.");
							break;
						
						case 2:																						//2. Display an Account
							System.out.println("Enter Account Number to show information");
							accUtils.displayParticularDetails(sc.nextLong(), accounts);
							break;
						
						case 3:																						//3. Display All Accounts
							System.out.println("All Account Details are: ");
							accUtils.displayAccount(accounts);
							break;
						
						case 4:																						//4. Remove an Account by email
							System.out.println("Enter Email to check Account: ");
							accUtils.displayAccountByEmail(sc.next(), accounts);
							System.out.println("Enter Account number to Remove account: ");
							accUtils.removeAccount(sc.nextLong(), accounts);
							System.out.println("!!!ACCOUNT REMOVED SUCCESSFULLY!!!");
							break;
							
						case 5:																						//5. Withdraw
							System.out.println("Enter Account Number and Amount from which you want to Withdraw Amount: ");
							accUtils.withdrawAmount(sc.nextLong(), sc.nextDouble(), accounts);
							break;
							
						case 6:																						//6. Deposit
							System.out.println("Enter Account number and Amount to which you are want to Credit Amount: ");
							accUtils.depositAmount(sc.nextLong(), sc.nextDouble(), accounts);
							break;
							
						case 7:																						//7. Transfer
							System.out.println("Enter Sender's and Receiver's Account Number and Amount to transfer in sequence: ");
							accUtils.amountTransfer(sc.nextLong(), sc.nextLong(), sc.nextDouble(), accounts);
							break;
						
						case 8:																						//8. Search account using NAME
							System.out.println("Enter Name of Account owner to get details: ");
							accUtils.searchByName(sc.next(), accounts);
							break;
							
						case 9:																						//9. Search account using EMAIL
							System.out.println("Enter Email of Account owner to get details: ");
							accUtils.displayAccountByEmail(sc.next(), accounts);
							break;
							
						case 10:																					//10. Search Account using PHONE
							System.out.println("Enter Phone number to Search From EBank: ");
							accUtils.searchByPhone(sc.next(), accounts);
							break;
						case 11:																					//11. EXIT
							exit = true;
							System.out.println("!!!Thank you for using Ebank Application!!!");
							break;
						default:																					//To notify user to select only from available cases
							System.out.println("!!!SELECT VALID OPERATION - (1-11)!!!");
							break;
					}
				} catch(Exception e) {																				//To catch inner try block's exception which will print custom exception
					System.out.println("---ERROR OCCURED : "+e.getMessage()+"---");
					e.printStackTrace();
				}
				sc.nextLine();																						//To clear out String Buffer after faulty iteration
			}
			
		}
		
	}
	
}
