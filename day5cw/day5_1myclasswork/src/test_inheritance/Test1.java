package test_inheritance;
import inheritance.*;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student("a1", "b1", 2020,"PGDAC", 12345, 80);
		System.out.println(s1);
		Faculty f1 = new Faculty("a2", "b2", 20, "Java React DBT");
		System.out.println(f1);
	}
}
