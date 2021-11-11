package com.app.Class;

import java.time.LocalDate;

public class Student {
	private String rollNoString;
	private String nameString;
	private LocalDate dob;
	private Subject subject;
	private double gpa;
	
	public Student(String rollNoString, String nameString, LocalDate dob, Subject subject, double gpa) {
		super();
		this.rollNoString = rollNoString;
		this.nameString = nameString;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [rollNoString=" + rollNoString + ", nameString=" + nameString + ", dob=" + dob + ", subject="
				+ subject + ", gpa=" + gpa + "]";
	}

	public String getRollNoString() {
		return rollNoString;
	}

	public void setRollNoString(String rollNoString) {
		this.rollNoString = rollNoString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}
