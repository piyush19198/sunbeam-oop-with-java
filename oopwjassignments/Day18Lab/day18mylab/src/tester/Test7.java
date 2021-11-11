package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;
import com.app.Class.*;

public class Test7 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentsList = populateList();

			System.out.println("\n3.Print how many distinctions for a specific subject: ");
			Subject subjectInput = Subject.valueOf(sc.next().toUpperCase());
			
			System.out.println(studentsList.stream()
					.filter(g -> g.getSubject() == subjectInput)
					.filter(s -> s.getGpa() > 7.5)
					.count()
					);
			}
	}
}
