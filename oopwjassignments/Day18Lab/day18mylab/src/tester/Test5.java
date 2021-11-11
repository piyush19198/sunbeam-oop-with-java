package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;
import com.app.Class.*;

public class Test5 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentsList = populateList();

			System.out.println("\n3.Print name of specified subject  topper: ");
			Subject subjectInput = Subject.valueOf(sc.next().toUpperCase());
			
			System.out.println(studentsList.stream()
					.filter(g -> g.getSubject() == subjectInput)
					.max((g1, g2) -> ((Double) g1.getGpa()).compareTo((Double) g2.getGpa()))
					.get()
					.getNameString()
					);
		}
	}
}
