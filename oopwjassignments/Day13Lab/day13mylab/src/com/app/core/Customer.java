package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private CustomerPlan plan;
	private AdharCard card;
	public static SimpleDateFormat sdf;
	
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	//Constructor
	public Customer(String name, String email, String password, double regAmount, Date dob, CustomerPlan plan) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	//Primary Key Constructor
	public Customer(String email) {
		super();
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public CustomerPlan getPlan() {
		return plan;
	}

	public Date getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdharCard getCard() {
		return card;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("--Searching For Duplicate Records--");
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email);
		return false;
	}

	//toString for Printing
	@Override
	public String toString() {
		String adharDetails = card == null? "AdharCard not Linked yet" : card.toString();
		return "Customer [name=" + name + ", email=" + email + ", regAmount="
				+ regAmount + ", dob=" + sdf.format(dob) + ", plan=" + plan + adharDetails + "]";
	}
	
	//Method to Link Adhar Card with Registered Customer
	public AdharCard linkAdharCard(String cardNumber, String location) {
		return card=new AdharCard(cardNumber, location);
	}
	
	//Composition Class
	public class AdharCard{
		private String cardNumber;
		private String location;
		
		//CompositeClass Constructor
		public AdharCard(String cardNumber, String location) {
			super();
			this.cardNumber = cardNumber;
			this.location = location;
		}

		//toString for AdharDetails
		@Override
		public String toString() {
			return "AdharCard [cardNumber=" + cardNumber + ", location=" + location + "]";
		}

		public String getLocation() {
			return location;
		}
		
	}//Composition Class End
	
}
