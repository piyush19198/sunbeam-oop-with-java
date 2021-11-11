package com.app.stack;

public class GrowableStack implements Stack{
	
	private int top;
	Employee[] emps_init=new Employee[STACK_SIZE];
	Employee[] emps_incr=new Employee[STACK_SIZE*2];
	

	@Override
	public void push(int id, String name, double salary) {
		if(emps_init[emps_init.length-1]==null) {
			if(top<emps_init.length) {
				emps_init[top++]=new Employee(id,name,salary);
			}
		}else {
			for (int i = 0; i < emps_init.length; i++) {
				emps_incr[i] = emps_init[i];
			}
			if (top < emps_incr.length) {
				emps_incr[top++] = new Employee(id, name,salary);
			}
		}
	}

	@Override
	public void pop() {
		if(emps_incr[0]==null) {
			if (top > 0) {
				System.out.println(emps_init[top-1]);
				emps_init[--top]=null;
			} else
				System.out.println("STACK ALREADY EMPTY");
		}
		else {
			System.out.println("Top pointing at: "+top);
			if (top > 0) {
				System.out.println(emps_incr[top-1]);
				emps_incr[--top]=null;
			} else
				System.out.println("STACK ALREADY EMPTY");
		}
	}

}
