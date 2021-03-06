package utils;

import java.util.ArrayList;

import com.app.Ebank.Account;
import custom_exceptions.*;
import static utils.ValidateAccount.*;

public class AccountUtils implements Operations{																						//To achieve 100% abstraction, All methods in Operations interface are overridden here
	
	@Override
	public void addAccount(ArrayList<Account> accounts, long accNumber, String name, String email, String phone,
			double balance) throws InvalidAccountException, InsufficientBalanceException {												//To add element in arraylist

		Account a = validateAllDetails(accounts, accNumber, name, email, phone, balance);
		accounts.add(a);
	}
	
	@Override
	public void displayAccount(ArrayList<Account> accounts) {																			//To display all elements in arraylist 
		for (Account a : accounts) {
			System.out.println(a);
		}
	}

	@Override
	public void displayParticularDetails(long AccountNO, ArrayList<Account> accounts) throws AccountNotFoundException {					//To display Particular account's details via primary key
		Account a = displayParticularAccount(AccountNO, accounts);
		System.out.println(a);
	}
	
	@Override
	public void displayAccountByEmail(String Email, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException {																	//To display particular account via email id input from user
		int ptr = 0;
		for (Account a : accounts) {
			if (a.getEmail().equals(validateEmail(Email))) {
				ptr++;
				System.out.println(a);
			}
		}
		if (ptr == 0) {
			throw new AccountNotFoundException("!!!NO ACCOUNT WITH THIS EMAIL ID IS REGISTERED!!!");
		}
	}
	
	@Override
	public void removeAccount(long AccountNO, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException {																	//To remove an element from arraylist
		Account a = removeParticularAccount(AccountNO, accounts);
		accounts.remove(a);
	}
	
	@Override
	public void withdrawAmount(long accountNo, double amount, ArrayList<Account> accounts)
			throws AccountNotFoundException, InsufficientBalanceException {																//To deduct amount from one element of arraylist via setter

		Account a = displayParticularAccount(accountNo, accounts);
		if (a.getBalance() > amount) {
			a.setBalance(a.getBalance() - amount);
			
			if (a.getBalance() < 100) {
				a.setBalance(a.getBalance() + amount);
				throw new InsufficientBalanceException("!!!CAN NOT WITHDRAW. MINIMUM BALANCE REACHED!!!");
			}
			
			System.out.println("!!!AMOUNT WITHDRAWN SUCCESSFULLY!!!");
			System.out.println("Updated Balance= " + a.getBalance());
			
		} else
			throw new InsufficientBalanceException("CAN NOT WITHDRAW DUE TO INSUFFICIENT FUNDS");
	}
	
	@Override
	public void depositAmount(long accountNo, double amount, ArrayList<Account> account)
			throws AccountNotFoundException, InsufficientBalanceException {																//To add amount into existing into one element of arraylist via setter

		Account a = displayParticularAccount(accountNo, account);
		a.setBalance(a.getBalance() + amount);
		System.out.println("Successfully Amount Credited...!");
		System.out.println("Updated Balance= " + a.getBalance());
	}
	
	@Override
	public void amountTransfer(long account1, long account2, double amount, ArrayList<Account> account)
			throws AccountNotFoundException, InsufficientBalanceException, InvalidAccountException {									//To transfer paricular amount from one account to another as per user's input in arraylist
		Account a = displayParticularAccount(account1, account);
		Account a1 = displayParticularAccount(account2, account);

		if (!a1.equals(a)) {
			a.setBalance(a.getBalance() - amount);
			if (a.getBalance() < 100) {
				a.setBalance(a.getBalance() + amount);
				throw new InsufficientBalanceException("!!!CAN NOT TRANSFER DUE TO INSUFFICIENT FUNDS!!!");
			}
			a1.setBalance(a1.getBalance() + amount);
			System.out.println("!!!AMOUNT SUCCESSFULLY TRANSFERED!!!");
			System.out.println(a.getName() + "Remaining Balance= " + a.getBalance());
			System.out.println(a1.getName() + "Updated Balance= " + a1.getBalance());
		} else
			throw new InvalidAccountException("!!!CAN NOT TRANSFER IN SAME ACCOUNT!!!");
	}
	
	@Override
	public void searchByName(String name, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException {																	//To display particular account details using Name input from user
		int ptr = 0;
		for (Account acc : accounts) {
			if (acc.getName().equals(checkAccountName(name))) {
				ptr++;
				System.out.println(acc);
			}
		}
		if (ptr == 0) {
			throw new AccountNotFoundException("!!!NO ACCOUNT WITH THIS NAME!!!");
		}
	}
	
	@Override
	public void searchByPhone(String phone, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException {																	//To display particular account details using Phone input from user
		int ptrp = 0;
		for (Account a : accounts) {
			if (a.getPhone().equals(validatePhone(phone))) {
				ptrp++;
				System.out.println(a);
			}
		}
		if (ptrp == 0) {
			throw new AccountNotFoundException("!!!NO ACCOUNT FOUND WITH THIS PHONE NUMBER!!!");
		}
	}
	
}
