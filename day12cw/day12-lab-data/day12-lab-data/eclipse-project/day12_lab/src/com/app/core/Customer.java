package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Customer : name(string),email(string),password(string),registrationAmount(double),
 * dob(Date),plan(enum : SILVER ,GOLD,DIAMOND,PLATUNUM)
Unique id : customer email
Create a composition between Customer & AdharCard
Adhar Card details : card number, location.
Only after  successful customer registration , adhar card details can be linked to the customer.
 */
public class Customer {
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	// Customer HAS-A Plan
	private CustomerPlan plan;
	// Customer HAS-A AdharCard
	private AdharCard card;
	// static
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	// constr
	public Customer(String name, String email, String password, double regAmount, Date dob, CustomerPlan plan) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	// override equals : to replace ref equality (inherited from Object class) by PK
	// based equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in customer equals");
		if (o instanceof Customer)
			return this.email.equals(((Customer) o).email);
		return false;
	}

	// override toString to replace adr returning version by actual state details

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", regAmount=" + regAmount + ", dob=" + sdf.format(dob)
				+ ", plan=" + plan + ", card=" + card + "]";
	}
	//add an instance method to link adhar card to the customer
	public void linkAdharCard(String cardNumber, String location)
	{
		this.card=new AdharCard(cardNumber, location);
	}
	

	// inner class
	public class AdharCard {
		private String cardNumber;
		private String location;
		public AdharCard(String cardNumber, String location) {
			super();
			this.cardNumber = cardNumber;
			this.location = location;
		}
		@Override
		public String toString() {
			return "AdharCard [cardNumber=" + cardNumber + ", location=" + location + "]";
		}
		
	}

}
