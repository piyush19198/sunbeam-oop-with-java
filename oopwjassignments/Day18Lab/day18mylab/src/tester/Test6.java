package tester;

import static utils.CollectionUtils.populateList;

import java.util.List;
import java.util.Scanner;
import com.app.Class.*;

public class Test6 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Student> studentsList = populateList();

			System.out.println("\n3.Print name of failures for the specified subject chosen  from user: ");
			Subject subjectInput = Subject.valueOf(sc.next().toUpperCase());
			
			studentsList.stream()
					.filter(g -> g.getSubject() == subjectInput)
					.filter(s -> s.getGpa() < 5.0)
					.forEach(s -> System.out.println(s.getNameString()));
			}
	}
}
