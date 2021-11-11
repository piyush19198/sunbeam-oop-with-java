package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;

import com.app.Class.*;

public class Test2 {
	public static void main(String[] args) {
		List<Student> studentsList = populateList();

		System.out.println("\n2.Display all student details(list) sorted as per GPA: ");
		studentsList.stream().sorted((g1, g2) -> ((Double) g1.getGpa()).compareTo((Double) g2.getGpa()))
				.forEach(g -> System.out.println(g + " "));
		System.out.println(studentsList);
	}
}
