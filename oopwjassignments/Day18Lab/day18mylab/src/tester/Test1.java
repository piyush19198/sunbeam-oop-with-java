package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;

import com.app.Class.*;

public class Test1 {
	public static void main(String[] args) {
		List<Student> studentsList = populateList();

		System.out.println("\n1.Display all student details from a list: ");
		studentsList.forEach(s -> System.out.println(s));
	}
}
