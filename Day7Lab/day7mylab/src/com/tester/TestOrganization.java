package com.tester;
import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {
	public static void main(String[] args) {
		boolean exit=false;
		int counter=0;;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total employees for organization: ");
		Employee[] emp=new Employee[sc.nextInt()];
		
		while(!exit) {
			System.out.println("Select operation: \n"
					+ "1. Hire Manager\n"
					+ "2. Hire Worker\n"
					+ "3. Display details of all employees\n"
					+ "4. Update Basic Salary\n"
					+ "5. Exit");
			
			switch (sc.nextInt()) {
			case 1:
				if(counter<emp.length) {
					System.out.println("Enter Manager's Name, "
							+ "Department ID, Basic Salary "
							+ "and Performance Bonus: ");
					emp[counter++]=new Manager(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
				}else
					System.out.println("No availability for this position.");
				
				break;
			case 2:
				if(counter<emp.length) {
					System.out.println("Enter Worker's Name, "
							+ "Department ID, Basic Salary "
							+ "Hours Worked and Hourly Rate: ");
					emp[counter++]=new Worker(sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				}else
					System.out.println("No availability for this position.");
				
				break;
			case 3:
				for(Employee e : emp) {
					if(e!=null) {
						if(e instanceof Manager) {
							System.out.println(((Manager)e).toString());
						}else if (e instanceof Worker) {
							System.out.println(((Worker)e).toString());
						}else
							System.out.println("No Employee in Organization.");
					}
				}
				break;
			case 5:
				exit=true;
				break;
			default:
				System.out.println("Choose Valid Operation!");
				break;
			}
		}
		sc.close();
	}
}
