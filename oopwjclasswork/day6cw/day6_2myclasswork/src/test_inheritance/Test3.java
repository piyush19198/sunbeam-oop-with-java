package test_inheritance;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

public class Test3 {

	public static void main(String[] args) {
		Person p = new Student("a1", "b1", 2020, "PG-DAC", 123456, 80);		System.out.println(p);
		if(p instanceof Student)
			
		((Student) p).study();
			System.out.println("Invalid Type 1");
								
		if (p instanceof Faculty)
			((Faculty) p).teach();
		else
			System.out.println("Invalid Type 2");

		p = new Faculty("a2", "b2", 20, "Java React DBT");
		System.out.println(p);
		
		if(p instanceof Faculty)
		((Faculty) p).teach();
		else 
			System.out.println("Invalid Type 3");
		
		if (p instanceof Student)
			((Student) p).study();
		else 
			System.out.println("invalid type 4");

	}

}