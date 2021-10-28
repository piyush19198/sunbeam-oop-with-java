package com.tester;

import java.util.Scanner;

import com.app.stack.FixedStack;
import com.app.stack.GrowableStack;
import com.app.stack.Stack;

public class Tester {
	public static void main(String[] args) {
		Stack s=null;
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		boolean counter=false;
		
		while(!exit) {
			System.out.println("Select operation from below");
			if(!counter) {
				counter=true;
				System.out.println("1. Fixed Stack");
				System.out.println("2. Growable Stack");
			}else {
				System.out.println("3. Push Data");
				System.out.println("4. Pop and Display");
				System.out.println("5. Exit");
			}
			
			switch (sc.nextInt()) {
			case 1:
				s=new FixedStack();
				System.out.println("FixedStack created with size="+Stack.STACK_SIZE);
				break;
			case 2:
				s=new GrowableStack();
				System.out.println("GrowableStack created with BASE SIZE "+Stack.STACK_SIZE);
				break;
			case 3:
				System.out.println("Enter Employee ID, Name and Salary");
				s.push(sc.nextInt(),sc.next(),sc.nextDouble());
				break;
			case 4:
				s.pop();
				break;
			case 5:
				exit=true;
			default:
				break;
			}
		}
		sc.close();
	}
}
