package com.app.org;

public abstract class Employee {
	private static int empid=0;
	private String name;
	private int deptId;
	private double basic;
	private int id;
	
	public Employee(String name, int deptId, double basic) {
		this.id=++empid;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	@Override
	public String toString() {
		return " Employee ID: "+getEmpid()+ 
				" Employee name: "+name+
				" Department ID: "+deptId+
				" Basic Salary: "+basic;
	}
	
	public static int getEmpid() {
		return empid;
	}

	public double getBasic() {
		return basic;
	}
	
	public abstract double computeNetSal();
}
