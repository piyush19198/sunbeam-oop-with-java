package com.app.core;

import static java.lang.Thread.*;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	// update balance :orig balance :  5000 , 500
	public  void updateBalance(double amt) throws Exception {
		System.out.println("Updating bal : " + currentThread().getName()); //cust # 1 : update
		balance = balance + amt;//deposit : balance : 5500
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(23);//simulating practical dly(running --> blocked) : forcing ctx switching
		balance = balance - amt;//bal =5000
		System.out.println("Updations over by " + currentThread().getName());
	}

	// chk balance
	public    double checkBalance() throws Exception {
		System.out.println("Checking balance : by "+ currentThread().getName());
		Thread.sleep(37);
		return balance;

	}

}
