package com.app.Ebank;

public class Account {																					//To achieve tight encapsulation, All data members are private.
								
	private long accNumber;
	private String name;
	private String email;
	private String phone;
	private double balance;
	
	public Account(long accNumber, String name, String email, String phone, double balance) {			//Parameterised constructor to initialize private instance variables
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public Account(long accountNo) {																	//Primary Key Constructor
		this.accNumber = accountNo;
	}
	
	public Account(String em) {																			//Composite Key Constructor
		this.email = em;
	}

	public long getAccNumber() {																		//Getter and Setters generated via source
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {																				//To display element/elements of arraylist by overriding toString method
		return "Account [accNumber=" + accNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object o) {																		//To check if primary key repeats itself
		if (o instanceof Account)
			return this.accNumber == ((Account) o).accNumber;
		return false;
	}

}
