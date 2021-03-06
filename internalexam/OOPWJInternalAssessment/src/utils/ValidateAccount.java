package utils;

import java.util.ArrayList;

import com.app.Ebank.Account;

import custom_exceptions.*;

public class ValidateAccount {
	
	public static void validateDuplicateAccount(long accountNo, ArrayList<Account> accounts)								//To check if already an account with same account number exists or not
			throws InvalidAccountException {
		Account a = new Account(accountNo);
		if (accounts.contains(a)) {
			throw new InvalidAccountException("!!!DUPLICATE ACCOUNT FOUND!!!");
		
		}
	}
	
	public static String checkAccountName(String name) throws InvalidAccountException {										//To validate Account Holder's name
		if (name.length() > 5)
			return name;
		else
			throw new InvalidAccountException("!!!USER NAME IS TOO SHORT!!!");
	}
	
	public static String validateEmail(String email) throws InvalidAccountException {										//To validate email address input which should contain "@" and ".com" 
		if (email.contains("@") && email.endsWith(".com")) {
			return email;
		} else
			throw new InvalidAccountException("!!!INVALID EMAIL ID!!!");
	}
	
	public static String validatePhone(String phone) throws InvalidAccountException, NumberFormatException {				//To validate phone number input to validate if it has 10 digits and if user has provided only numerics
		if (phone.length() == 10) {
			try {
				Long.parseLong(phone);
			} catch (Exception e) {
				throw new InvalidAccountException("!!!NON NUMERIC VALUE INPUT DETECTED!!!");
			}
			return phone;
		} else
			throw new InvalidAccountException("!!!INVALID PHONE NUMBER!!!");
	}
	
	public static double checkBalanceLimit(double balance) throws InsufficientBalanceException {							//To accept minimum 100 rs from user as minimum balance
		if (balance > 100)
			return balance;
		else
			throw new InsufficientBalanceException("!!!AMOUNT IS LESS THAN MINIMUM BALANCE(100).");
	}
	
	public static Account validateAllDetails(ArrayList<Account> accounts, long accNumber, String name, String email,
			String phone, double balance) throws InvalidAccountException, InsufficientBalanceException {					//To validate all the inputs via single method to reduce redundancy in code
		validateDuplicateAccount(accNumber, accounts);
		String n = checkAccountName(name);
		String e = validateEmail(email);
		String p = validatePhone(phone);
		double bal = checkBalanceLimit(balance);

		return new Account(accNumber, n, e, p, bal);
	}
	
	public static Account displayParticularAccount(long AccountNO, ArrayList<Account> accounts)
			throws AccountNotFoundException {																				//To display particular account
		int index = 0;
		Account acc = new Account(AccountNO);
		index = accounts.indexOf(acc);
		
		if (index == -1) {
			throw new AccountNotFoundException("!!!ACCOUNT NUMBER DOES NOT EXIST!!!");
		} else {
			return accounts.get(index);
		}
	}
	
	public static Account removeParticularAccount(long Account, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException {														//To remove particular account
		Account acc = new Account(Account);
		if (accounts.contains(acc)) {
			int index = accounts.indexOf(acc);
			return accounts.get(index);
		} else
			throw new AccountNotFoundException("!!!ACCOUNT NUMBER NOT FOUND!!!");
	}
	
}
