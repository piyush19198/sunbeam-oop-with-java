package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;

import com.app.Class.Student;
import com.app.Class.Subject;

public class Test4 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentsList = populateList();

			System.out.println("\n3.Display average of GPA of students for specified subject: ");
			Subject subjectInput = Subject.valueOf(sc.next().toUpperCase());
			studentsList.stream().filter(g -> g.getSubject() == subjectInput).mapToDouble(Student::getGpa).average()/*.orElse(0.0)*/;
		}
	}
}
