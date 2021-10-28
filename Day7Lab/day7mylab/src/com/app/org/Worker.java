package com.app.org;

public class Worker extends Employee {
	private double hoursWorked,hourlyRate;

	public Worker(String name, int deptId, double basic, double hoursWorked, double hourlyRate) {
		super(name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Worker's Hours Worked: "+hoursWorked+
				" Workers Hourly Rate: "+hourlyRate;
	}
	
	public double computeNetSal() {
		return getBasic()+(hoursWorked*hourlyRate);
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
}
