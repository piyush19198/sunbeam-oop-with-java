package com.app.stack;

public class FixedStack implements Stack{

	private int top=0;
	Employee[] emps = new Employee[STACK_SIZE];
	
	public FixedStack() {
	}

	@Override
	public void push(int id, String name, double salary) {
		if(top<emps.length) {
			emps[top++]=new Employee(id, name, salary);
		}else {
			System.out.println("STACK FULL");
		}
	}

	@Override
	public void pop() {
		if(top>0) {
			System.out.println(emps[top-1]);
			emps[--top]=null;
		}else {
			System.out.println("STACK ALREADY EMPTY");
		}
	}

}
