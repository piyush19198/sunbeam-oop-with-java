package utils;

import java.util.ArrayList;
import custom_exceptions.*;
import com.app.Ebank.Account;

public interface Operations {																											//Interface is used to achieve 100% abstraction
	
	public void addAccount(ArrayList<Account> accounts,long accNumber,String name,String email,String phone,double balance)
			throws InvalidAccountException, InsufficientBalanceException; 
	
	public void displayAccount(ArrayList<Account> accounts);
	
	public void displayParticularDetails(long AccountNO,ArrayList<Account> accounts) 
			throws AccountNotFoundException;

	public void displayAccountByEmail(String Email, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException;

	public void removeAccount(long AccountNO, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException;

	public void withdrawAmount(long accountNo, double amount, ArrayList<Account> accounts)
			throws AccountNotFoundException, InsufficientBalanceException;

	public void depositAmount(long accountNo, double amount, ArrayList<Account> account)
			throws AccountNotFoundException, InsufficientBalanceException;

	public void amountTransfer(long account1, long account2, double amount, ArrayList<Account> account)
			throws AccountNotFoundException, InsufficientBalanceException, InvalidAccountException;

	public void searchByName(String name, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException;

	public void searchByPhone(String phone, ArrayList<Account> accounts)
			throws InvalidAccountException, AccountNotFoundException;
	
}
