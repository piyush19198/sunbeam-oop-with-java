package com.app.crickter;

public class Crickter {
	
	//private data members to achieve tight encapsulation
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	
	//parameterized constructor created to initialize data members of instance
	public Crickter(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}
	
	//constructor of primary key added
	public Crickter(String email_id) {
		super();
		this.email_id = email_id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	//overrided toString method to display instance contents
	@Override
	public String toString() {
		return "Crickter [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone + ", rating="
				+ rating + "]";
	}
	//equals method overrided to perform equality check in arraylist
	@Override
	public boolean equals(Object o) {
		System.out.println("---PERFORMING EQUALITY CHECK---");
		if(o instanceof Crickter)
			return this.email_id.equals(((Crickter)o).email_id);
		return false;
	}
	
}
