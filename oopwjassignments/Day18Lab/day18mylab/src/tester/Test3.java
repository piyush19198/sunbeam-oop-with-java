package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.Class.*;

public class Test3 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentsList = populateList();

			System.out.println("\n3.Display sum of GPA of students for specified subject: ");
			Subject subjectInput = Subject.valueOf(sc.next().toUpperCase());
			studentsList.stream().filter(g -> g.getSubject() == subjectInput).mapToDouble(Student::getGpa).sum();
		}
	}
}
