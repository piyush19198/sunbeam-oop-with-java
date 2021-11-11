package test_inheritance;

import inheritance.*;

public class Test2 {

	public static void main(String[] args) {
		Person p=new Person("a1", "b1");
		Student s1 = new Student("a1", "b1", 2020, "PG-DAC", 123456, 80);
		
		System.out.println(p);
		p=new Faculty("a2", "b2", 20, "Java React DBT");
	}

}