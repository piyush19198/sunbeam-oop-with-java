package com.app.org;

public class Manager extends Employee {
	private double perfBonus;
	
	public Manager(String name, int deptId, double basic, double perfBonus) {
		super(name,deptId,basic);
		this.perfBonus=perfBonus;
	}
	
	public double computeNetSal() {
		return getBasic()+perfBonus;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Manager's Performance Bonus: "+perfBonus;
	}
}
